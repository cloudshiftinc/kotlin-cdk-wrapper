@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps

@CdkDslMarker
public class CfnCloudFrontOriginAccessIdentityPropsDsl {
  private val cdkBuilder: CfnCloudFrontOriginAccessIdentityProps.Builder =
      CfnCloudFrontOriginAccessIdentityProps.builder()

  public
      fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable) {
    cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig)
  }

  public
      fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty) {
    cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig)
  }

  public fun build(): CfnCloudFrontOriginAccessIdentityProps = cdkBuilder.build()
}
