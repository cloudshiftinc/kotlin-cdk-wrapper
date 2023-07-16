@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity

@CdkDslMarker
public class CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl {
  private val cdkBuilder:
      CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder =
      CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.builder()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun build(): CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
      = cdkBuilder.build()
}
