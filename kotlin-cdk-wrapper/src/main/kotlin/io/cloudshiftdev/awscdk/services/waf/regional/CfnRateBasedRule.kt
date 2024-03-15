@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This is *AWS WAF Classic* documentation.
 *
 * For more information, see [AWS WAF
 * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
 * developer guide.
 *
 *
 * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
 * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
 * version, AWS WAF has a single set of endpoints for regional and global use.
 *
 *
 * A `RateBasedRule` is identical to a regular `Rule` , with one addition: a `RateBasedRule` counts
 * the number of requests that arrive from a specified IP address every five minutes. For example,
 * based on recent requests that you've seen from an attacker, you might create a `RateBasedRule` that
 * includes the following conditions:
 *
 * * The requests come from 192.0.2.44.
 * * They contain the value `BadBot` in the `User-Agent` header.
 *
 * In the rule, you also define the rate limit as 15,000.
 *
 * Requests that meet both of these conditions and exceed 15,000 requests every five minutes trigger
 * the rule's action (block or count), which is defined in the web ACL.
 *
 * Note you can only create rate-based rules using an AWS CloudFormation template. To add the
 * rate-based rules created through AWS CloudFormation to a web ACL, use the AWS WAF console, API, or
 * command line interface (CLI). For more information, see
 * [UpdateWebACL](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateWebACL.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.regional.*;
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
public open class CfnRateBasedRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRateBasedRule,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
   */
  public open fun matchPredicates(): Any? = unwrap(this).getMatchPredicates()

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
   */
  public open fun matchPredicates(`value`: IResolvable) {
    unwrap(this).setMatchPredicates(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
   */
  public open fun matchPredicates(`value`: List<Any>) {
    unwrap(this).setMatchPredicates(`value`)
  }

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
   */
  public open fun matchPredicates(vararg `value`: Any): Unit = matchPredicates(`value`.toList())

  /**
   * A name for the metrics for a `RateBasedRule` .
   */
  public open fun metricName(): String = unwrap(this).getMetricName()

  /**
   * A name for the metrics for a `RateBasedRule` .
   */
  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  /**
   * A friendly name or description for a `RateBasedRule` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A friendly name or description for a `RateBasedRule` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The field that AWS WAF uses to determine if requests are likely arriving from single source and
   * thus subject to rate monitoring.
   */
  public open fun rateKey(): String = unwrap(this).getRateKey()

  /**
   * The field that AWS WAF uses to determine if requests are likely arriving from single source and
   * thus subject to rate monitoring.
   */
  public open fun rateKey(`value`: String) {
    unwrap(this).setRateKey(`value`)
  }

  /**
   * The maximum number of requests, which have an identical value in the field specified by the
   * `RateKey` , allowed in a five-minute period.
   */
  public open fun rateLimit(): Number = unwrap(this).getRateLimit()

  /**
   * The maximum number of requests, which have an identical value in the field specified by the
   * `RateKey` , allowed in a five-minute period.
   */
  public open fun rateLimit(`value`: Number) {
    unwrap(this).setRateLimit(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.regional.CfnRateBasedRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` . 
     */
    public fun matchPredicates(matchPredicates: IResolvable)

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` . 
     */
    public fun matchPredicates(matchPredicates: List<Any>)

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` . 
     */
    public fun matchPredicates(vararg matchPredicates: Any)

    /**
     * A name for the metrics for a `RateBasedRule` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
     * including "All" and "Default_Action." You can't change the name of the metric after you create
     * the `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-metricname)
     * @param metricName A name for the metrics for a `RateBasedRule` . 
     */
    public fun metricName(metricName: String)

    /**
     * A friendly name or description for a `RateBasedRule` .
     *
     * You can't change the name of a `RateBasedRule` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-name)
     * @param name A friendly name or description for a `RateBasedRule` . 
     */
    public fun name(name: String)

    /**
     * The field that AWS WAF uses to determine if requests are likely arriving from single source
     * and thus subject to rate monitoring.
     *
     * The only valid value for `RateKey` is `IP` . `IP` indicates that requests arriving from the
     * same IP address are subject to the `RateLimit` that is specified in the `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-ratekey)
     * @param rateKey The field that AWS WAF uses to determine if requests are likely arriving from
     * single source and thus subject to rate monitoring. 
     */
    public fun rateKey(rateKey: String)

    /**
     * The maximum number of requests, which have an identical value in the field specified by the
     * `RateKey` , allowed in a five-minute period.
     *
     * If the number of requests exceeds the `RateLimit` and the other predicates specified in the
     * rule are also met, AWS WAF triggers the action that is specified for this rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-ratelimit)
     * @param rateLimit The maximum number of requests, which have an identical value in the field
     * specified by the `RateKey` , allowed in a five-minute period. 
     */
    public fun rateLimit(rateLimit: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.Builder =
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.Builder.create(scope, id)

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` . 
     */
    override fun matchPredicates(matchPredicates: IResolvable) {
      cdkBuilder.matchPredicates(matchPredicates.let(IResolvable::unwrap))
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` . 
     */
    override fun matchPredicates(matchPredicates: List<Any>) {
      cdkBuilder.matchPredicates(matchPredicates)
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet&gt;` object that you want to include in a `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-matchpredicates)
     * @param matchPredicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet&gt;` object that you want to include in a
     * `RateBasedRule` . 
     */
    override fun matchPredicates(vararg matchPredicates: Any): Unit =
        matchPredicates(matchPredicates.toList())

    /**
     * A name for the metrics for a `RateBasedRule` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
     * including "All" and "Default_Action." You can't change the name of the metric after you create
     * the `RateBasedRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-metricname)
     * @param metricName A name for the metrics for a `RateBasedRule` . 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * A friendly name or description for a `RateBasedRule` .
     *
     * You can't change the name of a `RateBasedRule` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html#cfn-wafregional-ratebasedrule-name)
     * @param name A friendly name or description for a `RateBasedRule` . 
     */
    override fun name(name: String) {
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
     * @param rateKey The field that AWS WAF uses to determine if requests are likely arriving from
     * single source and thus subject to rate monitoring. 
     */
    override fun rateKey(rateKey: String) {
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
     * @param rateLimit The maximum number of requests, which have an identical value in the field
     * specified by the `RateKey` , allowed in a five-minute period. 
     */
    override fun rateLimit(rateLimit: Number) {
      cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRateBasedRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRateBasedRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRateBasedRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRateBasedRule):
        CfnRateBasedRule = CfnRateBasedRule(cdkObject)

    internal fun unwrap(wrapped: CfnRateBasedRule):
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRule = wrapped.cdkObject
  }

  /**
   * Specifies the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` , `XssMatchSet` ,
   * `RegexMatchSet` , `GeoMatchSet` , and `SizeConstraintSet` objects that you want to add to a `Rule`
   * and, for each object, indicates whether you want to negate the settings, for example, requests
   * that do NOT originate from the IP address 192.0.2.44.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.waf.regional.*;
   * PredicateProperty predicateProperty = PredicateProperty.builder()
   * .dataId("dataId")
   * .negated(false)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ratebasedrule-predicate.html)
   */
  public interface PredicateProperty {
    /**
     * A unique identifier for a predicate in a `Rule` , such as `ByteMatchSetId` or `IPSetId` .
     *
     * The ID is returned by the corresponding `Create` or `List` command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ratebasedrule-predicate.html#cfn-wafregional-ratebasedrule-predicate-dataid)
     */
    public fun dataId(): String

    /**
     * Set `Negated` to `False` if you want AWS WAF to allow, block, or count requests based on the
     * settings in the specified `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` , `XssMatchSet` ,
     * `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` .
     *
     * For example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow or block
     * requests based on that IP address.
     *
     * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the negation
     * of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` , `XssMatchSet` ,
     * `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` &gt;. For example, if an `IPSet`
     * includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests based on all
     * IP addresses *except* `192.0.2.44` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ratebasedrule-predicate.html#cfn-wafregional-ratebasedrule-predicate-negated)
     */
    public fun negated(): Any

    /**
     * The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ratebasedrule-predicate.html#cfn-wafregional-ratebasedrule-predicate-type)
     */
    public fun type(): String

    /**
     * A builder for [PredicateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataId A unique identifier for a predicate in a `Rule` , such as `ByteMatchSetId` or
       * `IPSetId` . 
       * The ID is returned by the corresponding `Create` or `List` command.
       */
      public fun dataId(dataId: String)

      /**
       * @param negated Set `Negated` to `False` if you want AWS WAF to allow, block, or count
       * requests based on the settings in the specified `ByteMatchSet` , `IPSet` ,
       * `SqlInjectionMatchSet` , `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or
       * `SizeConstraintSet` . 
       * For example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow or
       * block requests based on that IP address.
       *
       * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
       * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` &gt;. For example, if
       * an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests
       * based on all IP addresses *except* `192.0.2.44` .
       */
      public fun negated(negated: Boolean)

      /**
       * @param negated Set `Negated` to `False` if you want AWS WAF to allow, block, or count
       * requests based on the settings in the specified `ByteMatchSet` , `IPSet` ,
       * `SqlInjectionMatchSet` , `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or
       * `SizeConstraintSet` . 
       * For example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow or
       * block requests based on that IP address.
       *
       * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
       * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` &gt;. For example, if
       * an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests
       * based on all IP addresses *except* `192.0.2.44` .
       */
      public fun negated(negated: IResolvable)

      /**
       * @param type The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` . 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty.builder()

      /**
       * @param dataId A unique identifier for a predicate in a `Rule` , such as `ByteMatchSetId` or
       * `IPSetId` . 
       * The ID is returned by the corresponding `Create` or `List` command.
       */
      override fun dataId(dataId: String) {
        cdkBuilder.dataId(dataId)
      }

      /**
       * @param negated Set `Negated` to `False` if you want AWS WAF to allow, block, or count
       * requests based on the settings in the specified `ByteMatchSet` , `IPSet` ,
       * `SqlInjectionMatchSet` , `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or
       * `SizeConstraintSet` . 
       * For example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow or
       * block requests based on that IP address.
       *
       * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
       * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` &gt;. For example, if
       * an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests
       * based on all IP addresses *except* `192.0.2.44` .
       */
      override fun negated(negated: Boolean) {
        cdkBuilder.negated(negated)
      }

      /**
       * @param negated Set `Negated` to `False` if you want AWS WAF to allow, block, or count
       * requests based on the settings in the specified `ByteMatchSet` , `IPSet` ,
       * `SqlInjectionMatchSet` , `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or
       * `SizeConstraintSet` . 
       * For example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow or
       * block requests based on that IP address.
       *
       * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
       * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` &gt;. For example, if
       * an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests
       * based on all IP addresses *except* `192.0.2.44` .
       */
      override fun negated(negated: IResolvable) {
        cdkBuilder.negated(negated.let(IResolvable::unwrap))
      }

      /**
       * @param type The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` . 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty,
    ) : CdkObject(cdkObject), PredicateProperty {
      /**
       * A unique identifier for a predicate in a `Rule` , such as `ByteMatchSetId` or `IPSetId` .
       *
       * The ID is returned by the corresponding `Create` or `List` command.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ratebasedrule-predicate.html#cfn-wafregional-ratebasedrule-predicate-dataid)
       */
      override fun dataId(): String = unwrap(this).getDataId()

      /**
       * Set `Negated` to `False` if you want AWS WAF to allow, block, or count requests based on
       * the settings in the specified `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` .
       *
       * For example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow or
       * block requests based on that IP address.
       *
       * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
       * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` &gt;. For example, if
       * an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests
       * based on all IP addresses *except* `192.0.2.44` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ratebasedrule-predicate.html#cfn-wafregional-ratebasedrule-predicate-negated)
       */
      override fun negated(): Any = unwrap(this).getNegated()

      /**
       * The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ratebasedrule-predicate.html#cfn-wafregional-ratebasedrule-predicate-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PredicateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty):
          PredicateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredicateProperty):
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.PredicateProperty
    }
  }
}
