@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

@CdkDslMarker
public class CfnPlaybackConfigurationCdnConfigurationPropertyDsl {
  private val cdkBuilder: CfnPlaybackConfiguration.CdnConfigurationProperty.Builder =
      CfnPlaybackConfiguration.CdnConfigurationProperty.builder()

  /**
   * @param adSegmentUrlPrefix A non-default content delivery network (CDN) to serve ad segments.
   * By default, AWS Elemental MediaTailor uses Amazon CloudFront with default cache settings as its
   * CDN for ad segments. To set up an alternate CDN, create a rule in your CDN for the origin
   * ads.mediatailor.<region>.amazonaws.com. Then specify the rule's name in this AdSegmentUrlPrefix.
   * When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the source for ad
   * segments.
   */
  public fun adSegmentUrlPrefix(adSegmentUrlPrefix: String) {
    cdkBuilder.adSegmentUrlPrefix(adSegmentUrlPrefix)
  }

  /**
   * @param contentSegmentUrlPrefix A content delivery network (CDN) to cache content segments, so
   * that content requests don't always have to go to the origin server.
   * First, create a rule in your CDN for the content segment origin server. Then specify the rule's
   * name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports
   * your CDN as the source for content segments.
   */
  public fun contentSegmentUrlPrefix(contentSegmentUrlPrefix: String) {
    cdkBuilder.contentSegmentUrlPrefix(contentSegmentUrlPrefix)
  }

  public fun build(): CfnPlaybackConfiguration.CdnConfigurationProperty = cdkBuilder.build()
}
