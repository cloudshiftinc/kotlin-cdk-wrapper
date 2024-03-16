@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct

/**
 * Interface for classes that can select an appropriate machine image to use.
 */
public interface IMachineImage {
  /**
   * Return the image to use in the given context.
   *
   * @param scope 
   */
  public fun image(scope: Construct): MachineImageConfig

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IMachineImage): IMachineImage =
        CdkObjectWrappers.wrap(cdkObject) as IMachineImage

    internal fun unwrap(wrapped: IMachineImage): software.amazon.awscdk.services.ec2.IMachineImage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IMachineImage
  }
}
