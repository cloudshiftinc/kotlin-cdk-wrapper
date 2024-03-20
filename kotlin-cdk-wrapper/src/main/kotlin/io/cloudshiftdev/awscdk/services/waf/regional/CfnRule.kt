@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
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
 * A combination of `ByteMatchSet` , `IPSet` , and/or `SqlInjectionMatchSet` objects that identify
 * the web requests that you want to allow, block, or count. For example, you might create a `Rule`
 * that includes the following predicates:
 *
 * * An `IPSet` that causes AWS WAF to search for web requests that originate from the IP address
 * `192.0.2.44`
 * * A `ByteMatchSet` that causes AWS WAF to search for web requests for which the value of the
 * `User-Agent` header is `BadBot` .
 *
 * To match the settings in this `Rule` , a request must originate from `192.0.2.44` AND include a
 * `User-Agent` header for which the value is `BadBot` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.regional.*;
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
public open class CfnRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRule,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleProps,
  ) :
      this(software.amazon.awscdk.services.waf.regional.CfnRule(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRuleProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRuleProps(props)
  )

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
   * A name for the metrics for this `Rule` .
   */
  public open fun metricName(): String = unwrap(this).getMetricName()

  /**
   * A name for the metrics for this `Rule` .
   */
  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  /**
   * The friendly name or description for the `Rule` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The friendly name or description for the `Rule` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   */
  public open fun predicates(): Any? = unwrap(this).getPredicates()

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   */
  public open fun predicates(`value`: IResolvable) {
    unwrap(this).setPredicates(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   */
  public open fun predicates(`value`: List<Any>) {
    unwrap(this).setPredicates(`value`)
  }

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   */
  public open fun predicates(vararg `value`: Any): Unit = predicates(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.regional.CfnRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the metrics for this `Rule` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the `Rule`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-metricname)
     * @param metricName A name for the metrics for this `Rule` . 
     */
    public fun metricName(metricName: String)

    /**
     * The friendly name or description for the `Rule` .
     *
     * You can't change the name of a `Rule` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-name)
     * @param name The friendly name or description for the `Rule` . 
     */
    public fun name(name: String)

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * . 
     */
    public fun predicates(predicates: IResolvable)

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * . 
     */
    public fun predicates(predicates: List<Any>)

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * . 
     */
    public fun predicates(vararg predicates: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnRule.Builder =
        software.amazon.awscdk.services.waf.regional.CfnRule.Builder.create(scope, id)

    /**
     * A name for the metrics for this `Rule` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the `Rule`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-metricname)
     * @param metricName A name for the metrics for this `Rule` . 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * The friendly name or description for the `Rule` .
     *
     * You can't change the name of a `Rule` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-name)
     * @param name The friendly name or description for the `Rule` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * . 
     */
    override fun predicates(predicates: IResolvable) {
      cdkBuilder.predicates(predicates.let(IResolvable::unwrap))
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * . 
     */
    override fun predicates(predicates: List<Any>) {
      cdkBuilder.predicates(predicates)
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * . 
     */
    override fun predicates(vararg predicates: Any): Unit = predicates(predicates.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.regional.CfnRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRule): CfnRule =
        CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.waf.regional.CfnRule =
        wrapped.cdkObject
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html)
   */
  public interface PredicateProperty {
    /**
     * A unique identifier for a predicate in a `Rule` , such as `ByteMatchSetId` or `IPSetId` .
     *
     * The ID is returned by the corresponding `Create` or `List` command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-dataid)
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
     * `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For example, if an `IPSet` includes
     * the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests based on all IP
     * addresses *except* `192.0.2.44` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-negated)
     */
    public fun negated(): Any

    /**
     * The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-type)
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
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For example, if an
       * `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests
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
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For example, if an
       * `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests
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
          software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.builder()

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
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For example, if an
       * `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests
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
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For example, if an
       * `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests
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

      public fun build(): software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty,
    ) : CdkObject(cdkObject), PredicateProperty {
      /**
       * A unique identifier for a predicate in a `Rule` , such as `ByteMatchSetId` or `IPSetId` .
       *
       * The ID is returned by the corresponding `Create` or `List` command.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-dataid)
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
       * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For example, if an
       * `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count requests
       * based on all IP addresses *except* `192.0.2.44` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-negated)
       */
      override fun negated(): Any = unwrap(this).getNegated()

      /**
       * The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PredicateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty):
          PredicateProperty = CdkObjectWrappers.wrap(cdkObject) as? PredicateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredicateProperty):
          software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty
    }
  }
}
