@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

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
 * import io.cloudshiftdev.awscdk.services.waf.*;
 * CfnWebACLProps cfnWebACLProps = CfnWebACLProps.builder()
 * .defaultAction(WafActionProperty.builder()
 * .type("type")
 * .build())
 * .metricName("metricName")
 * .name("name")
 * // the properties below are optional
 * .rules(List.of(ActivatedRuleProperty.builder()
 * .priority(123)
 * .ruleId("ruleId")
 * // the properties below are optional
 * .action(WafActionProperty.builder()
 * .type("type")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html)
 */
public interface CfnWebACLProps {
  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   *
   * The action is specified by the `WafAction` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
   */
  public fun defaultAction(): Any

  /**
   * The name of the metrics for this `WebACL` .
   *
   * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and
   * minimum length one. It can't contain whitespace or metric names reserved for AWS WAF , including
   * "All" and "Default_Action." You can't change `MetricName` after you create the `WebACL` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname)
   */
  public fun metricName(): String

  /**
   * A friendly name or description of the `WebACL` .
   *
   * You can't change the name of a `WebACL` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name)
   */
  public fun name(): String

  /**
   * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule` ,
   * and the ID of the `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
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
    public fun defaultAction(defaultAction: CfnWebACL.WafActionProperty)

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     * The action is specified by the `WafAction` object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16110417c347210d7a02fb826a0f53032171075764564d7d670fd6a25c8e0c12")
    public fun defaultAction(defaultAction: CfnWebACL.WafActionProperty.Builder.() -> Unit)

    /**
     * @param metricName The name of the metrics for this `WebACL` . 
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
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
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnWebACLProps.Builder =
        software.amazon.awscdk.services.waf.CfnWebACLProps.builder()

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     * The action is specified by the `WafAction` object.
     */
    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     * The action is specified by the `WafAction` object.
     */
    override fun defaultAction(defaultAction: CfnWebACL.WafActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(CfnWebACL.WafActionProperty.Companion::unwrap))
    }

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     * The action is specified by the `WafAction` object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16110417c347210d7a02fb826a0f53032171075764564d7d670fd6a25c8e0c12")
    override fun defaultAction(defaultAction: CfnWebACL.WafActionProperty.Builder.() -> Unit): Unit
        = defaultAction(CfnWebACL.WafActionProperty(defaultAction))

    /**
     * @param metricName The name of the metrics for this `WebACL` . 
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
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
      cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` .
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` .
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    public fun build(): software.amazon.awscdk.services.waf.CfnWebACLProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.waf.CfnWebACLProps,
  ) : CdkObject(cdkObject), CfnWebACLProps {
    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
     */
    override fun defaultAction(): Any = unwrap(this).getDefaultAction()

    /**
     * The name of the metrics for this `WebACL` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the
     * `WebACL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname)
     */
    override fun metricName(): String = unwrap(this).getMetricName()

    /**
     * A friendly name or description of the `WebACL` .
     *
     * You can't change the name of a `WebACL` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
     */
    override fun rules(): Any? = unwrap(this).getRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebACLProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnWebACLProps): CfnWebACLProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnWebACLProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLProps): software.amazon.awscdk.services.waf.CfnWebACLProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.waf.CfnWebACLProps
  }
}
