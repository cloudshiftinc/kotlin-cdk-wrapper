@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * Represents a custom attribute type.
 */
public interface ICustomAttribute {
  /**
   * Bind this custom attribute type to the values as expected by CloudFormation.
   */
  public fun bind(): CustomAttributeConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.ICustomAttribute,
  ) : CdkObject(cdkObject), ICustomAttribute {
    /**
     * Bind this custom attribute type to the values as expected by CloudFormation.
     */
    override fun bind(): CustomAttributeConfig =
        unwrap(this).bind().let(CustomAttributeConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ICustomAttribute):
        ICustomAttribute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICustomAttribute):
        software.amazon.awscdk.services.cognito.ICustomAttribute = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.ICustomAttribute
  }
}
