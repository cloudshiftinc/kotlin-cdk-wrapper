@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

/**
 * Parameters for enabling CDN authorization on the endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * AuthorizationProperty authorizationProperty = AuthorizationProperty.builder()
 * .cdnIdentifierSecret("cdnIdentifierSecret")
 * .secretsRoleArn("secretsRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-authorization.html)
 */
@CdkDslMarker
public class CfnOriginEndpointAuthorizationPropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.AuthorizationProperty.Builder =
      CfnOriginEndpoint.AuthorizationProperty.builder()

  /**
   * @param cdnIdentifierSecret The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager
   * that your Content Delivery Network (CDN) uses for authorization to access your endpoint. 
   */
  public fun cdnIdentifierSecret(cdnIdentifierSecret: String) {
    cdkBuilder.cdnIdentifierSecret(cdnIdentifierSecret)
  }

  /**
   * @param secretsRoleArn The Amazon Resource Name (ARN) for the IAM role that allows AWS Elemental
   * MediaPackage to communicate with AWS Secrets Manager . 
   */
  public fun secretsRoleArn(secretsRoleArn: String) {
    cdkBuilder.secretsRoleArn(secretsRoleArn)
  }

  public fun build(): CfnOriginEndpoint.AuthorizationProperty = cdkBuilder.build()
}
