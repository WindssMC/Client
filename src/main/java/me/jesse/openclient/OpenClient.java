package me.jesse.openclient;
import org.bukkit.plugin.java.JavaPlugin;
public class OpenClient extends JavaPlugin {
  @Override
  public void onEnable() {
    saveDefaultConfig();
    getLogger().info("OpenClient enabled");
  }
}
