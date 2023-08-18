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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps

/**
 * Properties for defining a `CfnGeoMatchSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnGeoMatchSetProps cfnGeoMatchSetProps = CfnGeoMatchSetProps.builder()
 * .name("name")
 * // the properties below are optional
 * .geoMatchConstraints(List.of(GeoMatchConstraintProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html)
 */
@CdkDslMarker
public class CfnGeoMatchSetPropsDsl {
    private val cdkBuilder: CfnGeoMatchSetProps.Builder = CfnGeoMatchSetProps.builder()

    private val _geoMatchConstraints: MutableList<Any> = mutableListOf()

    /**
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     *   country that you want AWS WAF to search for.
     */
    public fun geoMatchConstraints(vararg geoMatchConstraints: Any) {
        _geoMatchConstraints.addAll(listOf(*geoMatchConstraints))
    }

    /**
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     *   country that you want AWS WAF to search for.
     */
    public fun geoMatchConstraints(geoMatchConstraints: Collection<Any>) {
        _geoMatchConstraints.addAll(geoMatchConstraints)
    }

    /**
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     *   country that you want AWS WAF to search for.
     */
    public fun geoMatchConstraints(geoMatchConstraints: IResolvable) {
        cdkBuilder.geoMatchConstraints(geoMatchConstraints)
    }

    /**
     * @param name A friendly name or description of the `GeoMatchSet` . You can't change the name
     *   of an `GeoMatchSet` after you create it.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnGeoMatchSetProps {
        if (_geoMatchConstraints.isNotEmpty()) cdkBuilder.geoMatchConstraints(_geoMatchConstraints)
        return cdkBuilder.build()
    }
}
