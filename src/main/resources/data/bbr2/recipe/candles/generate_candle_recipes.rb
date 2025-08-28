require 'json'

base_recipe = {
  "type" => "minecraft:crafting_shaped",
  "pattern" => [
    "#",
    "B",
    "D"
  ],
  "key" => {
    "#" => { "item" => "minecraft:string" },
    "B" => { "item" => "bbr2:candleberries" },
    "D" => { "tag" => "minecraft:dyes" }
  },
  "result" => {
    "id" => "minecraft:white_candle",
    "count" => 1
  }
}

dye_colors = %w[
  white orange magenta light_blue yellow lime pink gray light_gray
  cyan purple blue brown green red black
]

dye_colors.each do |color|
  recipe = base_recipe.dup
  recipe["result"] = { "id" => "minecraft:#{color}_candle", "count" => 1 }
  recipe["key"]["D"] = { "item" => "minecraft:#{color}_dye" }
  File.write("candle_from_candleberry_#{color}.json", JSON.pretty_generate(recipe))
end