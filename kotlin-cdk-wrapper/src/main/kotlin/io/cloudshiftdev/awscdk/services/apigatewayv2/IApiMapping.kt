@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an ApiGatewayV2 ApiMapping resource.
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html)
 */
public interface IApiMapping : IResource {
  /**
   * ID of the api mapping.
   */
  public fun apiMappingId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IApiMapping):
        IApiMapping = CdkObjectWrappers.wrap(cdkObject) as IApiMapping

    internal fun unwrap(wrapped: IApiMapping):
        software.amazon.awscdk.services.apigatewayv2.IApiMapping = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IApiMapping
  }
}
