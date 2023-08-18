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
import software.amazon.awscdk.services.waf.regional.CfnRule
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
 * A combination of `ByteMatchSet` , `IPSet` , and/or `SqlInjectionMatchSet` objects that identify
 * the web requests that you want to allow, block, or count. For example, you might create a `Rule`
 * that includes the following predicates:
 * * An `IPSet` that causes AWS WAF to search for web requests that originate from the IP address
 *   `192.0.2.44`
 * * A `ByteMatchSet` that causes AWS WAF to search for web requests for which the value of the
 *   `User-Agent` header is `BadBot` .
 *
 * To match the settings in this `Rule` , a request must originate from `192.0.2.44` AND include a
 * `User-Agent` header for which the value is `BadBot` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnRule cfnRule = CfnRule.Builder.create(this, "MyCfnRule")
 * .metricName("metricName")
 * .name("name")
 * // the properties below are optional
 * .predicates(List.of(PredicateProperty.builder()
 * .dataId("dataId")
 * .negated(false)
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html)
 */
@CdkDslMarker
public class CfnRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRule.Builder = CfnRule.Builder.create(scope, id)

    private val _predicates: MutableList<Any> = mutableListOf()

    /**
     * A name for the metrics for this `Rule` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the
     * `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-metricname)
     *
     * @param metricName A name for the metrics for this `Rule` .
     */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * The friendly name or description for the `Rule` .
     *
     * You can't change the name of a `Rule` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-name)
     *
     * @param name The friendly name or description for the `Rule` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
     *
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a
     *   `Rule` .
     */
    public fun predicates(vararg predicates: Any) {
        _predicates.addAll(listOf(*predicates))
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
     *
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a
     *   `Rule` .
     */
    public fun predicates(predicates: Collection<Any>) {
        _predicates.addAll(predicates)
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
     *
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a
     *   `Rule` .
     */
    public fun predicates(predicates: IResolvable) {
        cdkBuilder.predicates(predicates)
    }

    public fun build(): CfnRule {
        if (_predicates.isNotEmpty()) cdkBuilder.predicates(_predicates)
        return cdkBuilder.build()
    }
}
