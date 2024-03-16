@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface IRequestValidator : IResource {
  /**
   * ID of the request validator, such as abc123.
   */
  public fun requestValidatorId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IRequestValidator):
        IRequestValidator = CdkObjectWrappers.wrap(cdkObject) as IRequestValidator

    internal fun unwrap(wrapped: IRequestValidator):
        software.amazon.awscdk.services.apigateway.IRequestValidator = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IRequestValidator
  }
}
