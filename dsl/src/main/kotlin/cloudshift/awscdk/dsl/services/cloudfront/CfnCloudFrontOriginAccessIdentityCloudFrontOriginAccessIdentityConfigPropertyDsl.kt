@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity

/**
 * Origin access identity configuration.
 *
 * Send a `GET` request to the `/ *CloudFront API version* /CloudFront/identity ID/config` resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CloudFrontOriginAccessIdentityConfigProperty cloudFrontOriginAccessIdentityConfigProperty =
 * CloudFrontOriginAccessIdentityConfigProperty.builder()
 * .comment("comment")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html)
 */
@CdkDslMarker
public class CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl {
  private val cdkBuilder:
      CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder =
      CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.builder()

  /**
   * @param comment A comment to describe the origin access identity. 
   * The comment cannot be longer than 128 characters.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun build(): CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
      = cdkBuilder.build()
}
