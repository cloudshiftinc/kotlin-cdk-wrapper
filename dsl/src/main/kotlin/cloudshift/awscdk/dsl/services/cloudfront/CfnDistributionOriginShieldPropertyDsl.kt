@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionOriginShieldPropertyDsl {
  private val cdkBuilder: CfnDistribution.OriginShieldProperty.Builder =
      CfnDistribution.OriginShieldProperty.builder()

  /**
   * @param enabled A flag that specifies whether Origin Shield is enabled.
   * When it's enabled, CloudFront routes all requests through Origin Shield, which can help protect
   * your origin. When it's disabled, CloudFront might send requests directly to your origin from
   * multiple edge locations or regional edge caches.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled A flag that specifies whether Origin Shield is enabled.
   * When it's enabled, CloudFront routes all requests through Origin Shield, which can help protect
   * your origin. When it's disabled, CloudFront might send requests directly to your origin from
   * multiple edge locations or regional edge caches.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param originShieldRegion The AWS Region for Origin Shield.
   * Specify the AWS Region that has the lowest latency to your origin. To specify a region, use the
   * region code, not the region name. For example, specify the US East (Ohio) region as `us-east-2` .
   *
   * When you enable CloudFront Origin Shield, you must specify the AWS Region for Origin Shield.
   * For the list of AWS Regions that you can specify, and for help choosing the best Region for your
   * origin, see [Choosing the AWS Region for Origin
   * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region)
   * in the *Amazon CloudFront Developer Guide* .
   */
  public fun originShieldRegion(originShieldRegion: String) {
    cdkBuilder.originShieldRegion(originShieldRegion)
  }

  public fun build(): CfnDistribution.OriginShieldProperty = cdkBuilder.build()
}
