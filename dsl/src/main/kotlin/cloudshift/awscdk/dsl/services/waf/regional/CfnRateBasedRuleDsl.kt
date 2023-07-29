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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRule
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
 * A `RateBasedRule` is identical to a regular `Rule` , with one addition: a `RateBasedRule` counts
 * the number of requests that arrive from a specified IP address every five minutes. For example,
 * based on recent requests that you've seen from an attacker, you might create a `RateBasedRule`
 * that includes the following conditions:
 * * The requests come from 192.0.2.44.
 * * They contain the value `BadBot` in the `User-Agent` header.
 *
 * In the rule, you also define the rate limit as 15,000.
 *
 * Requests that meet both of these conditions and exceed 15,000 requests every five minutes trigger
 * the rule's action (block or count), which is defined in the web ACL.
 *
 * Note you can only create rate-based rules using an AWS CloudFormation template. To add the
 * rate-based rules created through AWS CloudFormation to a web ACL, use the AWS WAF console, API,
 * or command line interface (CLI). For more information, see
 * [UpdateWebACL](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateWebACL.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnRateBasedRule cfnRateBasedRule = CfnRateBasedRule.Builder.create(this, "MyCfnRateBasedRule")
 * .metricName("metricName")
 * .name("name")
 * .rateKey("rateKey")
 * .rateLimit(123)
 * // the properties below are optional
 * .matchPredicates(List.of(PredicateProperty.builder()
 * .dataId("dataId")
 * .negated(false)
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html)
 */
@CdkDslMarker
public class CfnRateBasedRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRateBasedRule.Builder = CfnRateBasedRule.Builder.create(scope, id)

    private val _matchPredicates: MutableList<Any> = mutableListOf()

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
     *
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in
     *   a `RateBasedRule` .
     */
    public fun matchPredicates(vararg matchPredicates: Any) {
        _matchPredicates.addAll(listOf(*matchPredicates))
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
     *
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in
     *   a `RateBasedRule` .
     */
    public fun matchPredicates(matchPredicates: Collection<Any>) {
        _matchPredicates.addAll(matchPredicates)
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
     *
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in
     *   a `RateBasedRule` .
     */
    public fun matchPredicates(matchPredicates: IResolvable) {
        cdkBuilder.matchPredicates(matchPredicates)
    }

    /**
     * A name for the metrics for a `RateBasedRule` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
     * including "All" and "Default_Action." You can't change the name of the metric after you
     * create the `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-metricname)
     *
     * @param metricName A name for the metrics for a `RateBasedRule` .
     */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * A friendly name or description for a `RateBasedRule` .
     *
     * You can't change the name of a `RateBasedRule` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-name)
     *
     * @param name A friendly name or description for a `RateBasedRule` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The field that AWS WAF uses to determine if requests are likely arriving from single source
     * and thus subject to rate monitoring.
     *
     * The only valid value for `RateKey` is `IP` . `IP` indicates that requests arriving from the
     * same IP address are subject to the `RateLimit` that is specified in the `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-ratekey)
     *
     * @param rateKey The field that AWS WAF uses to determine if requests are likely arriving from
     *   single source and thus subject to rate monitoring.
     */
    public fun rateKey(rateKey: String) {
        cdkBuilder.rateKey(rateKey)
    }

    /**
     * The maximum number of requests, which have an identical value in the field specified by the
     * `RateKey` , allowed in a five-minute period.
     *
     * If the number of requests exceeds the `RateLimit` and the other predicates specified in the
     * rule are also met, AWS WAF triggers the action that is specified for this rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-ratelimit)
     *
     * @param rateLimit The maximum number of requests, which have an identical value in the field
     *   specified by the `RateKey` , allowed in a five-minute period.
     */
    public fun rateLimit(rateLimit: Number) {
        cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): CfnRateBasedRule {
        if (_matchPredicates.isNotEmpty()) cdkBuilder.matchPredicates(_matchPredicates)
        return cdkBuilder.build()
    }
}
