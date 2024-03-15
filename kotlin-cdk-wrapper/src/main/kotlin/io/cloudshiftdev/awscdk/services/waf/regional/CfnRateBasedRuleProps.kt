@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRateBasedRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.regional.*;
 * CfnRateBasedRuleProps cfnRateBasedRuleProps = CfnRateBasedRuleProps.builder()
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
public interface CfnRateBasedRuleProps {
  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
   */
  public fun matchPredicates(): Any? = unwrap(this).getMatchPredicates()

  /**
   * A name for the metrics for a `RateBasedRule` .
   *
   * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and
   * minimum length one. It can't contain whitespace or metric names reserved for AWS WAF , including
   * "All" and "Default_Action." You can't change the name of the metric after you create the
   * `RateBasedRule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-metricname)
   */
  public fun metricName(): String

  /**
   * A friendly name or description for a `RateBasedRule` .
   *
   * You can't change the name of a `RateBasedRule` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-name)
   */
  public fun name(): String

  /**
   * The field that AWS WAF uses to determine if requests are likely arriving from single source and
   * thus subject to rate monitoring.
   *
   * The only valid value for `RateKey` is `IP` . `IP` indicates that requests arriving from the
   * same IP address are subject to the `RateLimit` that is specified in the `RateBasedRule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-ratekey)
   */
  public fun rateKey(): String

  /**
   * The maximum number of requests, which have an identical value in the field specified by the
   * `RateKey` , allowed in a five-minute period.
   *
   * If the number of requests exceeds the `RateLimit` and the other predicates specified in the
   * rule are also met, AWS WAF triggers the action that is specified for this rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-ratelimit)
   */
  public fun rateLimit(): Number

  /**
   * A builder for [CfnRateBasedRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` .
     */
    public fun matchPredicates(matchPredicates: IResolvable)

    /**
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` .
     */
    public fun matchPredicates(matchPredicates: List<Any>)

    /**
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` .
     */
    public fun matchPredicates(vararg matchPredicates: Any)

    /**
     * @param metricName A name for the metrics for a `RateBasedRule` . 
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
     * including "All" and "Default_Action." You can't change the name of the metric after you create
     * the `RateBasedRule` .
     */
    public fun metricName(metricName: String)

    /**
     * @param name A friendly name or description for a `RateBasedRule` . 
     * You can't change the name of a `RateBasedRule` after you create it.
     */
    public fun name(name: String)

    /**
     * @param rateKey The field that AWS WAF uses to determine if requests are likely arriving from
     * single source and thus subject to rate monitoring. 
     * The only valid value for `RateKey` is `IP` . `IP` indicates that requests arriving from the
     * same IP address are subject to the `RateLimit` that is specified in the `RateBasedRule` .
     */
    public fun rateKey(rateKey: String)

    /**
     * @param rateLimit The maximum number of requests, which have an identical value in the field
     * specified by the `RateKey` , allowed in a five-minute period. 
     * If the number of requests exceeds the `RateLimit` and the other predicates specified in the
     * rule are also met, AWS WAF triggers the action that is specified for this rule.
     */
    public fun rateLimit(rateLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps.builder()

    /**
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` .
     */
    override fun matchPredicates(matchPredicates: IResolvable) {
      cdkBuilder.matchPredicates(matchPredicates.let(IResolvable::unwrap))
    }

    /**
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` .
     */
    override fun matchPredicates(matchPredicates: List<Any>) {
      cdkBuilder.matchPredicates(matchPredicates)
    }

    /**
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` .
     */
    override fun matchPredicates(vararg matchPredicates: Any): Unit =
        matchPredicates(matchPredicates.toList())

    /**
     * @param metricName A name for the metrics for a `RateBasedRule` . 
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
     * including "All" and "Default_Action." You can't change the name of the metric after you create
     * the `RateBasedRule` .
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param name A friendly name or description for a `RateBasedRule` . 
     * You can't change the name of a `RateBasedRule` after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param rateKey The field that AWS WAF uses to determine if requests are likely arriving from
     * single source and thus subject to rate monitoring. 
     * The only valid value for `RateKey` is `IP` . `IP` indicates that requests arriving from the
     * same IP address are subject to the `RateLimit` that is specified in the `RateBasedRule` .
     */
    override fun rateKey(rateKey: String) {
      cdkBuilder.rateKey(rateKey)
    }

    /**
     * @param rateLimit The maximum number of requests, which have an identical value in the field
     * specified by the `RateKey` , allowed in a five-minute period. 
     * If the number of requests exceeds the `RateLimit` and the other predicates specified in the
     * rule are also met, AWS WAF triggers the action that is specified for this rule.
     */
    override fun rateLimit(rateLimit: Number) {
      cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps,
  ) : CdkObject(cdkObject), CfnRateBasedRuleProps {
    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
     */
    override fun matchPredicates(): Any? = unwrap(this).getMatchPredicates()

    /**
     * A name for the metrics for a `RateBasedRule` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
     * including "All" and "Default_Action." You can't change the name of the metric after you create
     * the `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-metricname)
     */
    override fun metricName(): String = unwrap(this).getMetricName()

    /**
     * A friendly name or description for a `RateBasedRule` .
     *
     * You can't change the name of a `RateBasedRule` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The field that AWS WAF uses to determine if requests are likely arriving from single source
     * and thus subject to rate monitoring.
     *
     * The only valid value for `RateKey` is `IP` . `IP` indicates that requests arriving from the
     * same IP address are subject to the `RateLimit` that is specified in the `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-ratekey)
     */
    override fun rateKey(): String = unwrap(this).getRateKey()

    /**
     * The maximum number of requests, which have an identical value in the field specified by the
     * `RateKey` , allowed in a five-minute period.
     *
     * If the number of requests exceeds the `RateLimit` and the other predicates specified in the
     * rule are also met, AWS WAF triggers the action that is specified for this rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-ratelimit)
     */
    override fun rateLimit(): Number = unwrap(this).getRateLimit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRateBasedRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps):
        CfnRateBasedRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRateBasedRuleProps):
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps
  }
}
