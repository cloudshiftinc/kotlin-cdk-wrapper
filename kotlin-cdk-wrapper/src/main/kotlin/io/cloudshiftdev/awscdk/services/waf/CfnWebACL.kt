@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
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
 * Contains the `Rules` that identify the requests that you want to allow, block, or count. In a
 * `WebACL` , you also specify a default action ( `ALLOW` or `BLOCK` ), and the action for each `Rule`
 * that you add to a `WebACL` , for example, block requests from specified IP addresses or block
 * requests from specified referrers. You also associate the `WebACL` with a Amazon CloudFront
 * distribution to identify the requests that you want AWS WAF to filter. If you add more than one
 * `Rule` to a `WebACL` , a request needs to match only one of the specifications to be allowed,
 * blocked, or counted.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.*;
 * CfnWebACL cfnWebACL = CfnWebACL.Builder.create(this, "MyCfnWebACL")
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
public open class CfnWebACL internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.CfnWebACL,
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
  public open fun defaultAction(`value`: WafActionProperty) {
    unwrap(this).setDefaultAction(`value`.let(WafActionProperty::unwrap))
  }

  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db8dbc68e23f66549d01f6d2fd7a0ce5f4d2e8f7e60054a88e1cf2d7080089e6")
  public open fun defaultAction(`value`: WafActionProperty.Builder.() -> Unit): Unit =
      defaultAction(WafActionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the metrics for this `WebACL` .
   */
  public open fun metricName(): String = unwrap(this).getMetricName()

  /**
   * The name of the metrics for this `WebACL` .
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.CfnWebACL].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    public fun defaultAction(defaultAction: IResolvable)

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    public fun defaultAction(defaultAction: WafActionProperty)

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f896ef269b8e39c5f47fdfba351903d562854031eb70b233406eb744fac9736")
    public fun defaultAction(defaultAction: WafActionProperty.Builder.() -> Unit)

    /**
     * The name of the metrics for this `WebACL` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the
     * `WebACL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname)
     * @param metricName The name of the metrics for this `WebACL` . 
     */
    public fun metricName(metricName: String)

    /**
     * A friendly name or description of the `WebACL` .
     *
     * You can't change the name of a `WebACL` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name)
     * @param name A friendly name or description of the `WebACL` . 
     */
    public fun name(name: String)

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` . 
     */
    public fun rules(rules: IResolvable)

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` . 
     */
    public fun rules(rules: List<Any>)

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` . 
     */
    public fun rules(vararg rules: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnWebACL.Builder =
        software.amazon.awscdk.services.waf.CfnWebACL.Builder.create(scope, id)

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    override fun defaultAction(defaultAction: WafActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(WafActionProperty::unwrap))
    }

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * The action is specified by the `WafAction` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f896ef269b8e39c5f47fdfba351903d562854031eb70b233406eb744fac9736")
    override fun defaultAction(defaultAction: WafActionProperty.Builder.() -> Unit): Unit =
        defaultAction(WafActionProperty(defaultAction))

    /**
     * The name of the metrics for this `WebACL` .
     *
     * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     * and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF ,
     * including "All" and "Default_Action." You can't change `MetricName` after you create the
     * `WebACL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname)
     * @param metricName The name of the metrics for this `WebACL` . 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * A friendly name or description of the `WebACL` .
     *
     * You can't change the name of a `WebACL` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name)
     * @param name A friendly name or description of the `WebACL` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule`
     * , and the ID of the `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     * of the `Rule` , and the ID of the `Rule` . 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    public fun build(): software.amazon.awscdk.services.waf.CfnWebACL = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.CfnWebACL.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebACL {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebACL(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnWebACL): CfnWebACL =
        CfnWebACL(cdkObject)

    internal fun unwrap(wrapped: CfnWebACL): software.amazon.awscdk.services.waf.CfnWebACL =
        wrapped.cdkObject
  }

  /**
   * The `ActivatedRule` object in an `UpdateWebACL` request specifies a `Rule` that you want to
   * insert or delete, the priority of the `Rule` in the `WebACL` , and the action that you want AWS
   * WAF to take when a web request matches the `Rule` ( `ALLOW` , `BLOCK` , or `COUNT` ).
   *
   * To specify whether to insert or delete a `Rule` , use the `Action` parameter in the
   * `WebACLUpdate` data type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.waf.*;
   * ActivatedRuleProperty activatedRuleProperty = ActivatedRuleProperty.builder()
   * .priority(123)
   * .ruleId("ruleId")
   * // the properties below are optional
   * .action(WafActionProperty.builder()
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-activatedrule.html)
   */
  public interface ActivatedRuleProperty {
    /**
     * Specifies the action that Amazon CloudFront or AWS WAF takes when a web request matches the
     * conditions in the `Rule` .
     *
     * Valid values for `Action` include the following:
     *
     * * `ALLOW` : CloudFront responds with the requested object.
     * * `BLOCK` : CloudFront responds with an HTTP 403 (Forbidden) status code.
     * * `COUNT` : AWS WAF increments a counter of requests that match the conditions in the rule
     * and then continues to inspect the web request based on the remaining rules in the web ACL.
     *
     * `ActivatedRule|OverrideAction` applies only when updating or adding a `RuleGroup` to a
     * `WebACL` . In this case, you do not use `ActivatedRule|Action` . For all other update requests,
     * `ActivatedRule|Action` is used instead of `ActivatedRule|OverrideAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-activatedrule.html#cfn-waf-webacl-activatedrule-action)
     */
    public fun action(): Any? = unwrap(this).getAction()

    /**
     * Specifies the order in which the `Rules` in a `WebACL` are evaluated.
     *
     * Rules with a lower value for `Priority` are evaluated before `Rules` with a higher value. The
     * value must be a unique integer. If you add multiple `Rules` to a `WebACL` , the values don't
     * need to be consecutive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-activatedrule.html#cfn-waf-webacl-activatedrule-priority)
     */
    public fun priority(): Number

    /**
     * The `RuleId` for a `Rule` .
     *
     * You use `RuleId` to get more information about a `Rule` , update a `Rule` , insert a `Rule`
     * into a `WebACL` or delete a one from a `WebACL` , or delete a `Rule` from AWS WAF .
     *
     * `RuleId` is returned by `CreateRule` and by `ListRules` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-activatedrule.html#cfn-waf-webacl-activatedrule-ruleid)
     */
    public fun ruleId(): String

    /**
     * A builder for [ActivatedRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action Specifies the action that Amazon CloudFront or AWS WAF takes when a web
       * request matches the conditions in the `Rule` .
       * Valid values for `Action` include the following:
       *
       * * `ALLOW` : CloudFront responds with the requested object.
       * * `BLOCK` : CloudFront responds with an HTTP 403 (Forbidden) status code.
       * * `COUNT` : AWS WAF increments a counter of requests that match the conditions in the rule
       * and then continues to inspect the web request based on the remaining rules in the web ACL.
       *
       * `ActivatedRule|OverrideAction` applies only when updating or adding a `RuleGroup` to a
       * `WebACL` . In this case, you do not use `ActivatedRule|Action` . For all other update
       * requests, `ActivatedRule|Action` is used instead of `ActivatedRule|OverrideAction` .
       */
      public fun action(action: IResolvable)

      /**
       * @param action Specifies the action that Amazon CloudFront or AWS WAF takes when a web
       * request matches the conditions in the `Rule` .
       * Valid values for `Action` include the following:
       *
       * * `ALLOW` : CloudFront responds with the requested object.
       * * `BLOCK` : CloudFront responds with an HTTP 403 (Forbidden) status code.
       * * `COUNT` : AWS WAF increments a counter of requests that match the conditions in the rule
       * and then continues to inspect the web request based on the remaining rules in the web ACL.
       *
       * `ActivatedRule|OverrideAction` applies only when updating or adding a `RuleGroup` to a
       * `WebACL` . In this case, you do not use `ActivatedRule|Action` . For all other update
       * requests, `ActivatedRule|Action` is used instead of `ActivatedRule|OverrideAction` .
       */
      public fun action(action: WafActionProperty)

      /**
       * @param action Specifies the action that Amazon CloudFront or AWS WAF takes when a web
       * request matches the conditions in the `Rule` .
       * Valid values for `Action` include the following:
       *
       * * `ALLOW` : CloudFront responds with the requested object.
       * * `BLOCK` : CloudFront responds with an HTTP 403 (Forbidden) status code.
       * * `COUNT` : AWS WAF increments a counter of requests that match the conditions in the rule
       * and then continues to inspect the web request based on the remaining rules in the web ACL.
       *
       * `ActivatedRule|OverrideAction` applies only when updating or adding a `RuleGroup` to a
       * `WebACL` . In this case, you do not use `ActivatedRule|Action` . For all other update
       * requests, `ActivatedRule|Action` is used instead of `ActivatedRule|OverrideAction` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f42e12f782edd9b7e90a0dad395911c5b19e0fce76436c5ad2f12be7320d600")
      public fun action(action: WafActionProperty.Builder.() -> Unit)

      /**
       * @param priority Specifies the order in which the `Rules` in a `WebACL` are evaluated. 
       * Rules with a lower value for `Priority` are evaluated before `Rules` with a higher value.
       * The value must be a unique integer. If you add multiple `Rules` to a `WebACL` , the values
       * don't need to be consecutive.
       */
      public fun priority(priority: Number)

      /**
       * @param ruleId The `RuleId` for a `Rule` . 
       * You use `RuleId` to get more information about a `Rule` , update a `Rule` , insert a `Rule`
       * into a `WebACL` or delete a one from a `WebACL` , or delete a `Rule` from AWS WAF .
       *
       * `RuleId` is returned by `CreateRule` and by `ListRules` .
       */
      public fun ruleId(ruleId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder =
          software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.builder()

      /**
       * @param action Specifies the action that Amazon CloudFront or AWS WAF takes when a web
       * request matches the conditions in the `Rule` .
       * Valid values for `Action` include the following:
       *
       * * `ALLOW` : CloudFront responds with the requested object.
       * * `BLOCK` : CloudFront responds with an HTTP 403 (Forbidden) status code.
       * * `COUNT` : AWS WAF increments a counter of requests that match the conditions in the rule
       * and then continues to inspect the web request based on the remaining rules in the web ACL.
       *
       * `ActivatedRule|OverrideAction` applies only when updating or adding a `RuleGroup` to a
       * `WebACL` . In this case, you do not use `ActivatedRule|Action` . For all other update
       * requests, `ActivatedRule|Action` is used instead of `ActivatedRule|OverrideAction` .
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action Specifies the action that Amazon CloudFront or AWS WAF takes when a web
       * request matches the conditions in the `Rule` .
       * Valid values for `Action` include the following:
       *
       * * `ALLOW` : CloudFront responds with the requested object.
       * * `BLOCK` : CloudFront responds with an HTTP 403 (Forbidden) status code.
       * * `COUNT` : AWS WAF increments a counter of requests that match the conditions in the rule
       * and then continues to inspect the web request based on the remaining rules in the web ACL.
       *
       * `ActivatedRule|OverrideAction` applies only when updating or adding a `RuleGroup` to a
       * `WebACL` . In this case, you do not use `ActivatedRule|Action` . For all other update
       * requests, `ActivatedRule|Action` is used instead of `ActivatedRule|OverrideAction` .
       */
      override fun action(action: WafActionProperty) {
        cdkBuilder.action(action.let(WafActionProperty::unwrap))
      }

      /**
       * @param action Specifies the action that Amazon CloudFront or AWS WAF takes when a web
       * request matches the conditions in the `Rule` .
       * Valid values for `Action` include the following:
       *
       * * `ALLOW` : CloudFront responds with the requested object.
       * * `BLOCK` : CloudFront responds with an HTTP 403 (Forbidden) status code.
       * * `COUNT` : AWS WAF increments a counter of requests that match the conditions in the rule
       * and then continues to inspect the web request based on the remaining rules in the web ACL.
       *
       * `ActivatedRule|OverrideAction` applies only when updating or adding a `RuleGroup` to a
       * `WebACL` . In this case, you do not use `ActivatedRule|Action` . For all other update
       * requests, `ActivatedRule|Action` is used instead of `ActivatedRule|OverrideAction` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f42e12f782edd9b7e90a0dad395911c5b19e0fce76436c5ad2f12be7320d600")
      override fun action(action: WafActionProperty.Builder.() -> Unit): Unit =
          action(WafActionProperty(action))

      /**
       * @param priority Specifies the order in which the `Rules` in a `WebACL` are evaluated. 
       * Rules with a lower value for `Priority` are evaluated before `Rules` with a higher value.
       * The value must be a unique integer. If you add multiple `Rules` to a `WebACL` , the values
       * don't need to be consecutive.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param ruleId The `RuleId` for a `Rule` . 
       * You use `RuleId` to get more information about a `Rule` , update a `Rule` , insert a `Rule`
       * into a `WebACL` or delete a one from a `WebACL` , or delete a `Rule` from AWS WAF .
       *
       * `RuleId` is returned by `CreateRule` and by `ListRules` .
       */
      override fun ruleId(ruleId: String) {
        cdkBuilder.ruleId(ruleId)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty,
    ) : CdkObject(cdkObject), ActivatedRuleProperty {
      /**
       * Specifies the action that Amazon CloudFront or AWS WAF takes when a web request matches the
       * conditions in the `Rule` .
       *
       * Valid values for `Action` include the following:
       *
       * * `ALLOW` : CloudFront responds with the requested object.
       * * `BLOCK` : CloudFront responds with an HTTP 403 (Forbidden) status code.
       * * `COUNT` : AWS WAF increments a counter of requests that match the conditions in the rule
       * and then continues to inspect the web request based on the remaining rules in the web ACL.
       *
       * `ActivatedRule|OverrideAction` applies only when updating or adding a `RuleGroup` to a
       * `WebACL` . In this case, you do not use `ActivatedRule|Action` . For all other update
       * requests, `ActivatedRule|Action` is used instead of `ActivatedRule|OverrideAction` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-activatedrule.html#cfn-waf-webacl-activatedrule-action)
       */
      override fun action(): Any? = unwrap(this).getAction()

      /**
       * Specifies the order in which the `Rules` in a `WebACL` are evaluated.
       *
       * Rules with a lower value for `Priority` are evaluated before `Rules` with a higher value.
       * The value must be a unique integer. If you add multiple `Rules` to a `WebACL` , the values
       * don't need to be consecutive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-activatedrule.html#cfn-waf-webacl-activatedrule-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * The `RuleId` for a `Rule` .
       *
       * You use `RuleId` to get more information about a `Rule` , update a `Rule` , insert a `Rule`
       * into a `WebACL` or delete a one from a `WebACL` , or delete a `Rule` from AWS WAF .
       *
       * `RuleId` is returned by `CreateRule` and by `ListRules` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-activatedrule.html#cfn-waf-webacl-activatedrule-ruleid)
       */
      override fun ruleId(): String = unwrap(this).getRuleId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActivatedRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty):
          ActivatedRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActivatedRuleProperty):
          software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty
    }
  }

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
   * For the action that is associated with a rule in a `WebACL` , specifies the action that you
   * want AWS WAF to perform when a web request matches all of the conditions in a rule. For the
   * default action in a `WebACL` , specifies the action that you want AWS WAF to take when a web
   * request doesn't match all of the conditions in any of the rules in a `WebACL` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.waf.*;
   * WafActionProperty wafActionProperty = WafActionProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-wafaction.html)
   */
  public interface WafActionProperty {
    /**
     * Specifies how you want AWS WAF to respond to requests that match the settings in a `Rule` .
     *
     * Valid settings include the following:
     *
     * * `ALLOW` : AWS WAF allows requests
     * * `BLOCK` : AWS WAF blocks requests
     * * `COUNT` : AWS WAF increments a counter of the requests that match all of the conditions in
     * the rule. AWS WAF then continues to inspect the web request based on the remaining rules in the
     * web ACL. You can't specify `COUNT` for the default action for a `WebACL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-wafaction.html#cfn-waf-webacl-wafaction-type)
     */
    public fun type(): String

    /**
     * A builder for [WafActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type Specifies how you want AWS WAF to respond to requests that match the settings
       * in a `Rule` . 
       * Valid settings include the following:
       *
       * * `ALLOW` : AWS WAF allows requests
       * * `BLOCK` : AWS WAF blocks requests
       * * `COUNT` : AWS WAF increments a counter of the requests that match all of the conditions
       * in the rule. AWS WAF then continues to inspect the web request based on the remaining rules in
       * the web ACL. You can't specify `COUNT` for the default action for a `WebACL` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.Builder =
          software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.builder()

      /**
       * @param type Specifies how you want AWS WAF to respond to requests that match the settings
       * in a `Rule` . 
       * Valid settings include the following:
       *
       * * `ALLOW` : AWS WAF allows requests
       * * `BLOCK` : AWS WAF blocks requests
       * * `COUNT` : AWS WAF increments a counter of the requests that match all of the conditions
       * in the rule. AWS WAF then continues to inspect the web request based on the remaining rules in
       * the web ACL. You can't specify `COUNT` for the default action for a `WebACL` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty,
    ) : CdkObject(cdkObject), WafActionProperty {
      /**
       * Specifies how you want AWS WAF to respond to requests that match the settings in a `Rule` .
       *
       * Valid settings include the following:
       *
       * * `ALLOW` : AWS WAF allows requests
       * * `BLOCK` : AWS WAF blocks requests
       * * `COUNT` : AWS WAF increments a counter of the requests that match all of the conditions
       * in the rule. AWS WAF then continues to inspect the web request based on the remaining rules in
       * the web ACL. You can't specify `COUNT` for the default action for a `WebACL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-wafaction.html#cfn-waf-webacl-wafaction-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WafActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty):
          WafActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WafActionProperty):
          software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty
    }
  }
}
