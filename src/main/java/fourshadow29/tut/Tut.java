package fourshadow29.tut;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import fourshadow29.tut.proxy.ClientProxy;
import fourshadow29.tut.proxy.CommonProxy;

@Mod(modid = Tut.MODID, name = Tut.NAME, version = Tut.VERSION)
public class Tut
{
    public static final String MODID = "tut";
    public static final String NAME = "mytut";
    public static final String VERSION = "1.0";


    @SidedProxy(clientSide="fourshadow29.tut.proxy.ClientProxy",serverSide="fourshadow29.tut.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static Tut instance;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }
    
    

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
    	 proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    }
}
