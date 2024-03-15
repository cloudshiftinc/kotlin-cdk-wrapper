@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * Controls the countries in which content is distributed.
 *
 * Example:
 *
 * ```
 * // Adding restrictions to a Cloudfront Web Distribution.
 * Bucket sourceBucket;
 * CloudFrontWebDistribution.Builder.create(this, "MyDistribution")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder()
 * .s3BucketSource(sourceBucket)
 * .build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build()))
 * .geoRestriction(GeoRestriction.allowlist("US", "GB"))
 * .build();
 * ```
 */
public open class GeoRestriction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.GeoRestriction,
) : CdkObject(cdkObject) {
  /**
   * Two-letter, uppercase country code for a country that you want to allow/deny.
   *
   * Include one element for each country.
   * See ISO 3166-1-alpha-2 code on the *International Organization for Standardization* website
   */
  public open fun locations(): List<String> = unwrap(this).getLocations()

  /**
   * Specifies the restriction type to impose.
   */
  public open fun restrictionType(): String = unwrap(this).getRestrictionType()

  public companion object {
    public fun allowlist(locations: String): GeoRestriction =
        software.amazon.awscdk.services.cloudfront.GeoRestriction.allowlist(locations).let(GeoRestriction::wrap)

    public fun denylist(locations: String): GeoRestriction =
        software.amazon.awscdk.services.cloudfront.GeoRestriction.denylist(locations).let(GeoRestriction::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.GeoRestriction):
        GeoRestriction = GeoRestriction(cdkObject)

    internal fun unwrap(wrapped: GeoRestriction):
        software.amazon.awscdk.services.cloudfront.GeoRestriction = wrapped.cdkObject
  }
}
