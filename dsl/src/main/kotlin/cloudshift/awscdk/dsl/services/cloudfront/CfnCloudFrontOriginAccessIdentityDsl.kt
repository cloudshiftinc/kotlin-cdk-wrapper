@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
import software.constructs.Construct

/**
 * The request to create a new origin access identity (OAI).
 *
 * An origin access identity is a special CloudFront user that you can associate with Amazon S3
 * origins, so that you can secure all or just some of your Amazon S3 content. For more information,
 * see [Restricting Access to Amazon S3 Content by Using an Origin Access
 * Identity](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnCloudFrontOriginAccessIdentity cfnCloudFrontOriginAccessIdentity =
 * CfnCloudFrontOriginAccessIdentity.Builder.create(this, "MyCfnCloudFrontOriginAccessIdentity")
 * .cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigProperty.builder()
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html)
 */
@CdkDslMarker
public class CfnCloudFrontOriginAccessIdentityDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCloudFrontOriginAccessIdentity.Builder =
      CfnCloudFrontOriginAccessIdentity.Builder.create(scope, id)

  /**
   * The current configuration information for the identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
   * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
   * identity. 
   */
  public
      fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable) {
    cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig)
  }

  /**
   * The current configuration information for the identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
   * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
   * identity. 
   */
  public
      fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty) {
    cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig)
  }

  public fun build(): CfnCloudFrontOriginAccessIdentity = cdkBuilder.build()
}
