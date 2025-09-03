# frozen_string_literal: true
require 'json'

# List of berry types
berries = %w[blackberry blueberry candleberry cranberry crimsonberry maloberry mulberry raspberry soulberry strawberry warpedberry wasteberry]

# Output directory (relative to script location)
output_dir = File.expand_path('../', __FILE__)

berries.each do |berry|
  4.times do |stage|
    model = {
      "parent" => "minecraft:block/cross",
      "render_type" => "minecraft:cutout",
      "textures" => {
        "cross" => "bbr2:block/#{berry}_bush_stage#{stage}"
      }
    }
    filename = File.join(output_dir, "#{berry}_bush_stage#{stage}.json")
    File.write(filename, JSON.pretty_generate(model) + "\n")
  end
end

