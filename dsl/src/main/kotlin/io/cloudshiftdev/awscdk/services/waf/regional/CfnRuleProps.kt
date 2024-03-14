package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRuleProps {
  /**
   * A name for the metrics for this `Rule` .
   *
   * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and
   * minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including
   * "All" and "Default_Action." You can't change `MetricName` after you create the `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-metricname)
   */
  public fun metricName(): String

  /**
   * The friendly name or description for the `Rule` .
   *
   * You can't change the name of a `Rule` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-name)
   */
  public fun name(): String

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
   */
  public fun predicates(): Any? = unwrap(this).getPredicates()

  /**
   * A builder for [CfnRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param metricName A name for the metrics for this `Rule` . 
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the `Rule`
     * .
     */
    public fun metricName(metricName: String)

    /**
     * @param name The friendly name or description for the `Rule` . 
     * You can't change the name of a `Rule` after you create it.
     */
    public fun name(name: String)

    /**
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * .
     */
    public fun predicates(predicates: IResolvable)

    /**
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * .
     */
    public fun predicates(predicates: List<Any>)

    /**
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * .
     */
    public fun predicates(vararg predicates: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnRuleProps.builder()

    /**
     * @param metricName A name for the metrics for this `Rule` . 
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the `Rule`
     * .
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param name The friendly name or description for the `Rule` . 
     * You can't change the name of a `Rule` after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * .
     */
    override fun predicates(predicates: IResolvable) {
      cdkBuilder.predicates(predicates.let(IResolvable::unwrap))
    }

    /**
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * .
     */
    override fun predicates(predicates: List<Any>) {
      cdkBuilder.predicates(predicates)
    }

    /**
     * @param predicates The `Predicates` object contains one `Predicate` element for each
     * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule`
     * .
     */
    override fun predicates(vararg predicates: Any): Unit = predicates(predicates.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRuleProps,
  ) : CdkObject(cdkObject), CfnRuleProps {
    /**
     * A name for the metrics for this `Rule` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the `Rule`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-metricname)
     */
    override fun metricName(): String = unwrap(this).getMetricName()

    /**
     * The friendly name or description for the `Rule` .
     *
     * You can't change the name of a `Rule` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
     */
    override fun predicates(): Any? = unwrap(this).getPredicates()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRuleProps):
        CfnRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleProps):
        software.amazon.awscdk.services.waf.regional.CfnRuleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.waf.regional.CfnRuleProps
  }
}
