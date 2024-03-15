@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct

public interface IMachineImage {
  public fun image(arg0: Construct): MachineImageConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IMachineImage,
  ) : CdkObject(cdkObject), IMachineImage {
    override fun image(arg0: Construct): MachineImageConfig =
        unwrap(this).getImage(arg0.let(Construct::unwrap)).let(MachineImageConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IMachineImage): IMachineImage =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IMachineImage): software.amazon.awscdk.services.ec2.IMachineImage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IMachineImage
  }
}
