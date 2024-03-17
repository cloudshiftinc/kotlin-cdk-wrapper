@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWebACL`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.regional.*;
 * CfnWebACLProps cfnWebACLProps = CfnWebACLProps.builder()
 * .defaultAction(ActionProperty.builder()
 * .type("type")
 * .build())
 * .metricName("metricName")
 * .name("name")
 * // the properties below are optional
 * .rules(List.of(RuleProperty.builder()
 * .action(ActionProperty.builder()
 * .type("type")
 * .build())
 * .priority(123)
 * .ruleId("ruleId")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html)
 */
public interface CfnWebACLProps {
  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   *
   * The action is specified by the `WafAction` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
   */
  public fun defaultAction(): Any

  /**
   * A name for the metrics for this `WebACL` .
   *
   * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and
   * minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including
   * "All" and "Default_Action." You can't change `MetricName` after you create the `WebACL` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname)
   */
  public fun metricName(): String

  /**
   * A friendly name or description of the `WebACL` .
   *
   * You can't change the name of a `WebACL` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name)
   */
  public fun name(): String

  /**
   * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule` ,
   * and the ID of the `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
   */
  public fun rules(): Any? = unwrap(this).getRules()

  /**
   * A builder for [CfnWebACLProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     * The action is specified by the `WafAction` object.
     */
    public fun defaultAction(defaultAction: IResolvable)

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     * The action is specified by the `WafAction` object.
     */
    public fun defaultAction(defaultAction: CfnWebACL.ActionProperty)

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     * The action is specified by the `WafAction` object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5596f206e565e857e73f2ed5a5565d71abecdd613c0278a9fc53e353a1c89790")
    public fun defaultAction(defaultAction: CfnWebACL.ActionProperty.Builder.() -> Unit)

    /**
     * @param metricName A name for the metrics for this `WebACL` . 
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the
     * `WebACL` .
     */
    public fun metricName(metricName: String)

    /**
     * @param name A friendly name or description of the `WebACL` . 
     * You can't change the name of a `WebACL` after you create it.
     */
    public fun name(name: String)

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` .
     */
    public fun rules(rules: IResolvable)

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` .
     */
    public fun rules(rules: List<Any>)

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` .
     */
    public fun rules(vararg rules: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnWebACLProps.builder()

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     * The action is specified by the `WafAction` object.
     */
    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     * The action is specified by the `WafAction` object.
     */
    override fun defaultAction(defaultAction: CfnWebACL.ActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(CfnWebACL.ActionProperty::unwrap))
    }

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     * The action is specified by the `WafAction` object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5596f206e565e857e73f2ed5a5565d71abecdd613c0278a9fc53e353a1c89790")
    override fun defaultAction(defaultAction: CfnWebACL.ActionProperty.Builder.() -> Unit): Unit =
        defaultAction(CfnWebACL.ActionProperty(defaultAction))

    /**
     * @param metricName A name for the metrics for this `WebACL` . 
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the
     * `WebACL` .
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param name A friendly name or description of the `WebACL` . 
     * You can't change the name of a `WebACL` after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` .
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` .
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` .
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACLProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLProps,
  ) : CdkObject(cdkObject), CfnWebACLProps {
    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
     */
    override fun defaultAction(): Any = unwrap(this).getDefaultAction()

    /**
     * A name for the metrics for this `WebACL` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the
     * `WebACL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname)
     */
    override fun metricName(): String = unwrap(this).getMetricName()

    /**
     * A friendly name or description of the `WebACL` .
     *
     * You can't change the name of a `WebACL` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
     */
    override fun rules(): Any? = unwrap(this).getRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebACLProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLProps):
        CfnWebACLProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWebACLProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLProps):
        software.amazon.awscdk.services.waf.regional.CfnWebACLProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnWebACLProps
  }
}
