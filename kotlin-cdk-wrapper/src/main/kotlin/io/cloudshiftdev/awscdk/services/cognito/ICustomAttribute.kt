@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Represents a custom attribute type.
 */
public interface ICustomAttribute {
  /**
   * Bind this custom attribute type to the values as expected by CloudFormation.
   */
  public fun bind(): CustomAttributeConfig

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ICustomAttribute):
        ICustomAttribute = CdkObjectWrappers.wrap(cdkObject) as ICustomAttribute

    internal fun unwrap(wrapped: ICustomAttribute):
        software.amazon.awscdk.services.cognito.ICustomAttribute = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.ICustomAttribute
  }
}
