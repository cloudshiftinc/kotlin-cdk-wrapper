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

package io.cloudshiftdev.awscdkdsl.services.waf.regional

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet

/**
 * This is *AWS WAF Classic* documentation.
 *
 * For more information, see
 * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
 * in the developer guide.
 *
 * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
 * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
 * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
 *
 * The country from which web requests originate that you want AWS WAF to search for.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * GeoMatchConstraintProperty geoMatchConstraintProperty = GeoMatchConstraintProperty.builder()
 * .type("type")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-geomatchset-geomatchconstraint.html)
 */
@CdkDslMarker
public class CfnGeoMatchSetGeoMatchConstraintPropertyDsl {
    private val cdkBuilder: CfnGeoMatchSet.GeoMatchConstraintProperty.Builder =
        CfnGeoMatchSet.GeoMatchConstraintProperty.builder()

    /**
     * @param type The type of geographical area you want AWS WAF to search for. Currently `Country`
     *   is the only valid value.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param value The country that you want AWS WAF to search for. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnGeoMatchSet.GeoMatchConstraintProperty = cdkBuilder.build()
}
