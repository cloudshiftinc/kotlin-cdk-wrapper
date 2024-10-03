@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct

/**
 *
 */
public abstract class AmazonLinuxImageSsmParameterBase(
  cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBase,
) : CdkObject(cdkObject),
    IMachineImage {
  /**
   * Return the image to use in the given context.
   *
   * @param scope 
   */
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct.Companion::unwrap)).let(MachineImageConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBase,
  ) : AmazonLinuxImageSsmParameterBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBase):
        AmazonLinuxImageSsmParameterBase = CdkObjectWrappers.wrap(cdkObject) as?
        AmazonLinuxImageSsmParameterBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinuxImageSsmParameterBase):
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBase = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBase
  }
}
