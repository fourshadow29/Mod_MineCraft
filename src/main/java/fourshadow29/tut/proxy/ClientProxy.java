package fourshadow29.tut.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	  @Override
	    public void preInit(FMLPreInitializationEvent event)
	    {
	        
	    }

	  	@Override
	    public void init(FMLInitializationEvent event)
	    {
	        // some example code
	    }
	    
	  	@Override
	    public void postInit(FMLPostInitializationEvent event) {
	  	}

	  	public void registerItemRenderer(Item item,int meta,String id) {
	  		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(),id));
	  	}
	  	
		public static void registerModel() {
			// TODO Auto-generated method stub
			
		}
}
