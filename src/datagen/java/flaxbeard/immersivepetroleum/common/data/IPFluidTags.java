package flaxbeard.immersivepetroleum.common.data;

import flaxbeard.immersivepetroleum.ImmersivePetroleum;
import flaxbeard.immersivepetroleum.api.IPTags;
import flaxbeard.immersivepetroleum.common.IPContent;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class IPFluidTags extends FluidTagsProvider{
	
	public IPFluidTags(DataGenerator gen, ExistingFileHelper exHelper){
		super(gen, ImmersivePetroleum.MODID, exHelper);
	}
	
	@Override
	protected void registerTags(){
		getOrCreateBuilder(IPTags.Fluids.diesel)
			.add(IPContent.Fluids.diesel);
		
		getOrCreateBuilder(IPTags.Fluids.gasoline)
			.add(IPContent.Fluids.gasoline);
		
		getOrCreateBuilder(IPTags.Fluids.lubricant)
			.add(IPContent.Fluids.lubricant);
		
		getOrCreateBuilder(IPTags.Fluids.napalm)
			.add(IPContent.Fluids.napalm);
		
		getOrCreateBuilder(IPTags.Fluids.crudeOil)
			.add(IPContent.Fluids.crudeOil);
	}
}