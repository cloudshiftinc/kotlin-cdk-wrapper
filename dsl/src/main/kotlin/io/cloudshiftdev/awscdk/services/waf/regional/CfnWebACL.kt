package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWebACL internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   */
  public open fun defaultAction(): Any = unwrap(this).getDefaultAction()

  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   */
  public open fun defaultAction(`value`: IResolvable) {
    unwrap(this).setDefaultAction(`value`.let(IResolvable::unwrap))
  }

  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   */
  public open fun defaultAction(`value`: ActionProperty) {
    unwrap(this).setDefaultAction(`value`.let(ActionProperty::unwrap))
  }

  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3af383f8c6f7654aa5a7f095018e4bdd76ac0baa8f95fc646dae670971d70085")
  public open fun defaultAction(`value`: ActionProperty.Builder.() -> Unit): Unit =
      defaultAction(ActionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A name for the metrics for this `WebACL` .
   */
  public open fun metricName(): String = unwrap(this).getMetricName()

  /**
   * A name for the metrics for this `WebACL` .
   */
  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  /**
   * A friendly name or description of the `WebACL` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A friendly name or description of the `WebACL` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule` ,
   * and the ID of the `Rule` .
   */
  public open fun rules(): Any? = unwrap(this).getRules()

  /**
   * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule` ,
   * and the ID of the `Rule` .
   */
  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule` ,
   * and the ID of the `Rule` .
   */
  public open fun rules(__idx_ac66f0: List<Any>) {
    unwrap(this).setRules(__idx_ac66f0)
  }

  /**
   * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule` ,
   * and the ID of the `Rule` .
   */
  public open fun rules(vararg __idx_ac66f0: Any): Unit = rules(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.regional.CfnWebACL].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    public fun defaultAction(defaultAction: IResolvable)

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    public fun defaultAction(defaultAction: ActionProperty)

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60275178e198fc9462460ff93c97d208f7e2ec67c457a96b330c95e9656eb93f")
    public fun defaultAction(defaultAction: ActionProperty.Builder.() -> Unit)

    /**
     * A name for the metrics for this `WebACL` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the
     * `WebACL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname)
     * @param metricName A name for the metrics for this `WebACL` . 
     */
    public fun metricName(metricName: String)

    /**
     * A friendly name or description of the `WebACL` .
     *
     * You can't change the name of a `WebACL` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name)
     * @param name A friendly name or description of the `WebACL` . 
     */
    public fun name(name: String)

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` . 
     */
    public fun rules(rules: IResolvable)

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` . 
     */
    public fun rules(rules: List<Any>)

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` . 
     */
    public fun rules(vararg rules: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnWebACL.Builder =
        software.amazon.awscdk.services.waf.regional.CfnWebACL.Builder.create(scope, id)

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    override fun defaultAction(defaultAction: ActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(ActionProperty::unwrap))
    }

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60275178e198fc9462460ff93c97d208f7e2ec67c457a96b330c95e9656eb93f")
    override fun defaultAction(defaultAction: ActionProperty.Builder.() -> Unit): Unit =
        defaultAction(ActionProperty(defaultAction))

    /**
     * A name for the metrics for this `WebACL` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the
     * `WebACL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname)
     * @param metricName A name for the metrics for this `WebACL` . 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * A friendly name or description of the `WebACL` .
     *
     * You can't change the name of a `WebACL` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name)
     * @param name A friendly name or description of the `WebACL` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` . 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` . 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` . 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACL = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.regional.CfnWebACL.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebACL {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebACL(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL): CfnWebACL
        = CfnWebACL(cdkObject)

    internal fun unwrap(wrapped: CfnWebACL): software.amazon.awscdk.services.waf.regional.CfnWebACL
        = wrapped.cdkObject
  }

  public interface RuleProperty {
    /**
     * The action that AWS WAF takes when a web request matches all conditions in the rule, such as
     * allow, block, or count the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html#cfn-wafregional-webacl-rule-action)
     */
    public fun action(): Any

    /**
     * The order in which AWS WAF evaluates the rules in a web ACL.
     *
     * AWS WAF evaluates rules with a lower value before rules with a higher value. The value must
     * be a unique integer. If you have multiple rules in a web ACL, the priority numbers do not need
     * to be consecutive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html#cfn-wafregional-webacl-rule-priority)
     */
    public fun priority(): Number

    /**
     * The ID of an AWS WAF Regional rule to associate with a web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html#cfn-wafregional-webacl-rule-ruleid)
     */
    public fun ruleId(): String

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action that AWS WAF takes when a web request matches all conditions in
       * the rule, such as allow, block, or count the request. 
       */
      public fun action(action: IResolvable)

      /**
       * @param action The action that AWS WAF takes when a web request matches all conditions in
       * the rule, such as allow, block, or count the request. 
       */
      public fun action(action: ActionProperty)

      /**
       * @param action The action that AWS WAF takes when a web request matches all conditions in
       * the rule, such as allow, block, or count the request. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b783c1213464d7662dc5b33ae8544518f0c083311fc75b45412a9e96634f8284")
      public fun action(action: ActionProperty.Builder.() -> Unit)

      /**
       * @param priority The order in which AWS WAF evaluates the rules in a web ACL. 
       * AWS WAF evaluates rules with a lower value before rules with a higher value. The value must
       * be a unique integer. If you have multiple rules in a web ACL, the priority numbers do not need
       * to be consecutive.
       */
      public fun priority(priority: Number)

      /**
       * @param ruleId The ID of an AWS WAF Regional rule to associate with a web ACL. 
       */
      public fun ruleId(ruleId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.builder()

      /**
       * @param action The action that AWS WAF takes when a web request matches all conditions in
       * the rule, such as allow, block, or count the request. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action The action that AWS WAF takes when a web request matches all conditions in
       * the rule, such as allow, block, or count the request. 
       */
      override fun action(action: ActionProperty) {
        cdkBuilder.action(action.let(ActionProperty::unwrap))
      }

      /**
       * @param action The action that AWS WAF takes when a web request matches all conditions in
       * the rule, such as allow, block, or count the request. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b783c1213464d7662dc5b33ae8544518f0c083311fc75b45412a9e96634f8284")
      override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
          action(ActionProperty(action))

      /**
       * @param priority The order in which AWS WAF evaluates the rules in a web ACL. 
       * AWS WAF evaluates rules with a lower value before rules with a higher value. The value must
       * be a unique integer. If you have multiple rules in a web ACL, the priority numbers do not need
       * to be consecutive.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param ruleId The ID of an AWS WAF Regional rule to associate with a web ACL. 
       */
      override fun ruleId(ruleId: String) {
        cdkBuilder.ruleId(ruleId)
      }

      public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      /**
       * The action that AWS WAF takes when a web request matches all conditions in the rule, such
       * as allow, block, or count the request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html#cfn-wafregional-webacl-rule-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * The order in which AWS WAF evaluates the rules in a web ACL.
       *
       * AWS WAF evaluates rules with a lower value before rules with a higher value. The value must
       * be a unique integer. If you have multiple rules in a web ACL, the priority numbers do not need
       * to be consecutive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html#cfn-wafregional-webacl-rule-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * The ID of an AWS WAF Regional rule to associate with a web ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html#cfn-wafregional-webacl-rule-ruleid)
       */
      override fun ruleId(): String = unwrap(this).getRuleId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty
    }
  }

  public interface ActionProperty {
    /**
     * For actions that are associated with a rule, the action that AWS WAF takes when a web request
     * matches all conditions in a rule.
     *
     * For the default action of a web access control list (ACL), the action that AWS WAF takes when
     * a web request doesn't match all conditions in any rule.
     *
     * Valid settings include the following:
     *
     * * `ALLOW` : AWS WAF allows requests
     * * `BLOCK` : AWS WAF blocks requests
     * * `COUNT` : AWS WAF increments a counter of the requests that match all of the conditions in
     * the rule. AWS WAF then continues to inspect the web request based on the remaining rules in the
     * web ACL. You can't specify `COUNT` for the default action for a WebACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-action.html#cfn-wafregional-webacl-action-type)
     */
    public fun type(): String

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type For actions that are associated with a rule, the action that AWS WAF takes when
       * a web request matches all conditions in a rule. 
       * For the default action of a web access control list (ACL), the action that AWS WAF takes
       * when a web request doesn't match all conditions in any rule.
       *
       * Valid settings include the following:
       *
       * * `ALLOW` : AWS WAF allows requests
       * * `BLOCK` : AWS WAF blocks requests
       * * `COUNT` : AWS WAF increments a counter of the requests that match all of the conditions
       * in the rule. AWS WAF then continues to inspect the web request based on the remaining rules in
       * the web ACL. You can't specify `COUNT` for the default action for a WebACL.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.builder()

      /**
       * @param type For actions that are associated with a rule, the action that AWS WAF takes when
       * a web request matches all conditions in a rule. 
       * For the default action of a web access control list (ACL), the action that AWS WAF takes
       * when a web request doesn't match all conditions in any rule.
       *
       * Valid settings include the following:
       *
       * * `ALLOW` : AWS WAF allows requests
       * * `BLOCK` : AWS WAF blocks requests
       * * `COUNT` : AWS WAF increments a counter of the requests that match all of the conditions
       * in the rule. AWS WAF then continues to inspect the web request based on the remaining rules in
       * the web ACL. You can't specify `COUNT` for the default action for a WebACL.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * For actions that are associated with a rule, the action that AWS WAF takes when a web
       * request matches all conditions in a rule.
       *
       * For the default action of a web access control list (ACL), the action that AWS WAF takes
       * when a web request doesn't match all conditions in any rule.
       *
       * Valid settings include the following:
       *
       * * `ALLOW` : AWS WAF allows requests
       * * `BLOCK` : AWS WAF blocks requests
       * * `COUNT` : AWS WAF increments a counter of the requests that match all of the conditions
       * in the rule. AWS WAF then continues to inspect the web request based on the remaining rules in
       * the web ACL. You can't specify `COUNT` for the default action for a WebACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-action.html#cfn-wafregional-webacl-action-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty
    }
  }
}
