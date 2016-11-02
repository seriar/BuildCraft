package buildcraft.transport.pipe.behaviour;

import net.minecraft.nbt.NBTTagCompound;

import buildcraft.api.transport.neptune.IPipe;
import buildcraft.api.transport.neptune.PipeBehaviour;

public class PipeBehaviourStructure extends PipeBehaviour {

    public PipeBehaviourStructure(IPipe pipe, NBTTagCompound nbt) {
        super(pipe, nbt);
    }

    public PipeBehaviourStructure(IPipe pipe) {
        super(pipe);
    }
}
