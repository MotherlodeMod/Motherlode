package motherlode.world.gen.caves;

import net.minecraftforge.event.terraingen.InitMapGenEvent;
import net.minecraftforge.event.terraingen.InitMapGenEvent.EventType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ReplaceVanillaCaveGen {
	@SubscribeEvent
	public static void onMapGen(InitMapGenEvent event) {
		if (event.getType().equals(EventType.CAVE))	{
			event.setNewGen(new CaveGen());
		}
	}
}