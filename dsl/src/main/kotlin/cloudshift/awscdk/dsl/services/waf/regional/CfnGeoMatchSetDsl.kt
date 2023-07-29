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

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet
import software.constructs.Construct

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
 * Contains one or more countries that AWS WAF will search for.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnGeoMatchSet cfnGeoMatchSet = CfnGeoMatchSet.Builder.create(this, "MyCfnGeoMatchSet")
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
public class CfnGeoMatchSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGeoMatchSet.Builder = CfnGeoMatchSet.Builder.create(scope, id)

    private val _geoMatchConstraints: MutableList<Any> = mutableListOf()

    /**
     * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
     * search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
     *
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     *   country that you want AWS WAF to search for.
     */
    public fun geoMatchConstraints(vararg geoMatchConstraints: Any) {
        _geoMatchConstraints.addAll(listOf(*geoMatchConstraints))
    }

    /**
     * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
     * search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
     *
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     *   country that you want AWS WAF to search for.
     */
    public fun geoMatchConstraints(geoMatchConstraints: Collection<Any>) {
        _geoMatchConstraints.addAll(geoMatchConstraints)
    }

    /**
     * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
     * search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
     *
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     *   country that you want AWS WAF to search for.
     */
    public fun geoMatchConstraints(geoMatchConstraints: IResolvable) {
        cdkBuilder.geoMatchConstraints(geoMatchConstraints)
    }

    /**
     * A friendly name or description of the `GeoMatchSet` .
     *
     * You can't change the name of an `GeoMatchSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-name)
     *
     * @param name A friendly name or description of the `GeoMatchSet` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnGeoMatchSet {
        if (_geoMatchConstraints.isNotEmpty()) cdkBuilder.geoMatchConstraints(_geoMatchConstraints)
        return cdkBuilder.build()
    }
}
