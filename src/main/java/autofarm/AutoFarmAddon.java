package autofarm;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.world.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoFarmAddon extends MeteorAddon {
    public static final Logger LOG = LoggerFactory.getLogger("AutoFarm");
    public static final Category CATEGORY = new Category("AutoFarm", () -> Items.WHEAT.getDefaultInstance());

    @Override
    public void onInitialize() {
        LOG.info("Initializing AutoFarm addon");
        Modules.get().add(new AutoFarm());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "autofarm";
    }
}
