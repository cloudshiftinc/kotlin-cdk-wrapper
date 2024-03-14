package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.constructs.Construct

public interface IMachineImage {
  public fun image(arg0: Construct): MachineImageConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IMachineImage,
  ) : IMachineImage {
    public override fun image(arg0: Construct): MachineImageConfig =
        unwrap(this).getImage(arg0.let(Construct::unwrap)).let(MachineImageConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IMachineImage): IMachineImage =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IMachineImage): software.amazon.awscdk.services.ec2.IMachineImage =
        (wrapped as Wrapper).cdkObject
  }
}
