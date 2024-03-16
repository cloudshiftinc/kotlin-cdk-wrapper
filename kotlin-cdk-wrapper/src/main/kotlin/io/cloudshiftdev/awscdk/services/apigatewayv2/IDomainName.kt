@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an APIGatewayV2 DomainName.
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html)
 */
public interface IDomainName : IResource {
  /**
   * The custom domain name.
   */
  public fun name(): String

  /**
   * The domain name associated with the regional endpoint for this custom domain name.
   */
  public fun regionalDomainName(): String

  /**
   * The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint.
   */
  public fun regionalHostedZoneId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IDomainName):
        IDomainName = CdkObjectWrappers.wrap(cdkObject) as IDomainName

    internal fun unwrap(wrapped: IDomainName):
        software.amazon.awscdk.services.apigatewayv2.IDomainName = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IDomainName
  }
}
