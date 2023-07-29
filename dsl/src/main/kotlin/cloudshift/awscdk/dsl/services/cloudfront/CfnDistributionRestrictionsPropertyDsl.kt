@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A complex type that identifies ways in which you want to restrict distribution of your content.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * RestrictionsProperty restrictionsProperty = RestrictionsProperty.builder()
 * .geoRestriction(GeoRestrictionProperty.builder()
 * .restrictionType("restrictionType")
 * // the properties below are optional
 * .locations(List.of("locations"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html)
 */
@CdkDslMarker
public class CfnDistributionRestrictionsPropertyDsl {
    private val cdkBuilder: CfnDistribution.RestrictionsProperty.Builder =
        CfnDistribution.RestrictionsProperty.builder()

    /**
     * @param geoRestriction A complex type that controls the countries in which your content is
     *   distributed. CloudFront determines the location of your users using `MaxMind` GeoIP
     *   databases. To disable geo restriction, remove the
     *   [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
     *   property from your stack template.
     */
    public fun geoRestriction(geoRestriction: IResolvable) {
        cdkBuilder.geoRestriction(geoRestriction)
    }

    /**
     * @param geoRestriction A complex type that controls the countries in which your content is
     *   distributed. CloudFront determines the location of your users using `MaxMind` GeoIP
     *   databases. To disable geo restriction, remove the
     *   [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
     *   property from your stack template.
     */
    public fun geoRestriction(geoRestriction: CfnDistribution.GeoRestrictionProperty) {
        cdkBuilder.geoRestriction(geoRestriction)
    }

    public fun build(): CfnDistribution.RestrictionsProperty = cdkBuilder.build()
}
