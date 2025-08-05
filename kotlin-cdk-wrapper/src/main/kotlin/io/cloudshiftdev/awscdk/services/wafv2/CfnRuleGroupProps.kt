@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRuleGroup`.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html)
 */
public interface CfnRuleGroupProps {
  /**
   * The labels that one or more rules in this rule group add to matching web requests.
   *
   * These labels are defined in the `RuleLabels` for a `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
   */
  public fun availableLabels(): Any? = unwrap(this).getAvailableLabels()

  /**
   * The web ACL capacity units (WCUs) required for this rule group.
   *
   * When you create your own rule group, you define this, and you cannot change it after creation.
   * When you add or modify the rules in a rule group, AWS WAF enforces this limit.
   *
   * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your
   * rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to
   * reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than
   * more complex rules that use more processing power. Rule group capacity is fixed at creation, which
   * helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is
   * 1,500.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-capacity)
   */
  public fun capacity(): Number

  /**
   * The labels that one or more rules in this rule group match against in label match statements.
   *
   * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
   * definition of a rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
   */
  public fun consumedLabels(): Any? = unwrap(this).getConsumedLabels()

  /**
   * A map of custom response keys and content bodies.
   *
   * When you create a rule with a block action, you can send a custom response to the web request.
   * You define these for the rule group, and then use them in the rules that you define in the rule
   * group.
   *
   * For information about customizing web requests and responses, see [Customizing web requests and
   * responses in AWS
   * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
   * the *AWS WAF Developer Guide* .
   *
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-customresponsebodies)
   */
  public fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

  /**
   * A description of the rule group that helps with identification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the rule group.
   *
   * You cannot change the name of a rule group after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The rule statements used to identify the web requests that you want to allow, block, or count.
   *
   * Each rule includes one top-level statement that AWS WAF uses to identify matching web requests,
   * and parameters that govern how AWS WAF handles them.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
   */
  public fun rules(): Any? = unwrap(this).getRules()

  /**
   * Specifies whether this is for an Amazon CloudFront distribution or for a regional application.
   *
   * For an AWS Amplify application, use `CLOUDFRONT` . A regional application can be an Application
   * Load Balancer (ALB), an Amazon API Gateway REST API, an AWS AppSync GraphQL API, an Amazon Cognito
   * user pool, an AWS App Runner service, or an AWS Verified Access instance. Valid Values are
   * `CLOUDFRONT` and `REGIONAL` .
   *
   *
   * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
   * `us-east-1` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-scope)
   */
  public fun scope(): String

  /**
   * Key:value pairs associated with an AWS resource.
   *
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   *
   * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With AWS
   * CloudFormation , you can only add tags to AWS WAF resources during resource creation.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Defines and enables Amazon CloudWatch metrics and web request sample collection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
   */
  public fun visibilityConfig(): Any

  /**
   * A builder for [CfnRuleGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    public fun availableLabels(availableLabels: IResolvable)

    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    public fun availableLabels(availableLabels: List<Any>)

    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    public fun availableLabels(vararg availableLabels: Any)

    /**
     * @param capacity The web ACL capacity units (WCUs) required for this rule group. 
     * When you create your own rule group, you define this, and you cannot change it after
     * creation. When you add or modify the rules in a rule group, AWS WAF enforces this limit.
     *
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your
     * rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to
     * reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than
     * more complex rules that use more processing power. Rule group capacity is fixed at creation,
     * which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     */
    public fun capacity(capacity: Number)

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    public fun consumedLabels(consumedLabels: IResolvable)

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    public fun consumedLabels(consumedLabels: List<Any>)

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    public fun consumedLabels(vararg consumedLabels: Any)

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define in
     * the rule group.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     */
    public fun customResponseBodies(customResponseBodies: IResolvable)

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define in
     * the rule group.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     */
    public fun customResponseBodies(customResponseBodies: Map<String, Any>)

    /**
     * @param description A description of the rule group that helps with identification.
     */
    public fun description(description: String)

    /**
     * @param name The name of the rule group.
     * You cannot change the name of a rule group after you create it.
     */
    public fun name(name: String)

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(rules: IResolvable)

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(rules: List<Any>)

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(vararg rules: Any)

    /**
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
     * For an AWS Amplify application, use `CLOUDFRONT` . A regional application can be an
     * Application Load Balancer (ALB), an Amazon API Gateway REST API, an AWS AppSync GraphQL API, an
     * Amazon Cognito user pool, an AWS App Runner service, or an AWS Verified Access instance. Valid
     * Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     */
    public fun scope(scope: String)

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    public fun visibilityConfig(visibilityConfig: IResolvable)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    public fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64221d10455c9f28cf050e8e2ab95a6a1d4fd0cae07f9195a4d7951b4627371a")
    public
        fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnRuleGroupProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnRuleGroupProps.builder()

    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    override fun availableLabels(availableLabels: IResolvable) {
      cdkBuilder.availableLabels(availableLabels.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    override fun availableLabels(availableLabels: List<Any>) {
      cdkBuilder.availableLabels(availableLabels.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    override fun availableLabels(vararg availableLabels: Any): Unit =
        availableLabels(availableLabels.toList())

    /**
     * @param capacity The web ACL capacity units (WCUs) required for this rule group. 
     * When you create your own rule group, you define this, and you cannot change it after
     * creation. When you add or modify the rules in a rule group, AWS WAF enforces this limit.
     *
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your
     * rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to
     * reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than
     * more complex rules that use more processing power. Rule group capacity is fixed at creation,
     * which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     */
    override fun capacity(capacity: Number) {
      cdkBuilder.capacity(capacity)
    }

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    override fun consumedLabels(consumedLabels: IResolvable) {
      cdkBuilder.consumedLabels(consumedLabels.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    override fun consumedLabels(consumedLabels: List<Any>) {
      cdkBuilder.consumedLabels(consumedLabels.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    override fun consumedLabels(vararg consumedLabels: Any): Unit =
        consumedLabels(consumedLabels.toList())

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define in
     * the rule group.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     */
    override fun customResponseBodies(customResponseBodies: IResolvable) {
      cdkBuilder.customResponseBodies(customResponseBodies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define in
     * the rule group.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     */
    override fun customResponseBodies(customResponseBodies: Map<String, Any>) {
      cdkBuilder.customResponseBodies(customResponseBodies.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param description A description of the rule group that helps with identification.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the rule group.
     * You cannot change the name of a rule group after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
     * For an AWS Amplify application, use `CLOUDFRONT` . A regional application can be an
     * Application Load Balancer (ALB), an Amazon API Gateway REST API, an AWS AppSync GraphQL API, an
     * Amazon Cognito user pool, an AWS App Runner service, or an AWS Verified Access instance. Valid
     * Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    override fun visibilityConfig(visibilityConfig: IResolvable) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    override fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(CfnRuleGroup.VisibilityConfigProperty.Companion::unwrap))
    }

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64221d10455c9f28cf050e8e2ab95a6a1d4fd0cae07f9195a4d7951b4627371a")
    override
        fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty.Builder.() -> Unit):
        Unit = visibilityConfig(CfnRuleGroup.VisibilityConfigProperty(visibilityConfig))

    public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroupProps,
  ) : CdkObject(cdkObject),
      CfnRuleGroupProps {
    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     */
    override fun availableLabels(): Any? = unwrap(this).getAvailableLabels()

    /**
     * The web ACL capacity units (WCUs) required for this rule group.
     *
     * When you create your own rule group, you define this, and you cannot change it after
     * creation. When you add or modify the rules in a rule group, AWS WAF enforces this limit.
     *
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your
     * rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to
     * reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than
     * more complex rules that use more processing power. Rule group capacity is fixed at creation,
     * which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-capacity)
     */
    override fun capacity(): Number = unwrap(this).getCapacity()

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     */
    override fun consumedLabels(): Any? = unwrap(this).getConsumedLabels()

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define in
     * the rule group.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-customresponsebodies)
     */
    override fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

    /**
     * A description of the rule group that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the rule group.
     *
     * You cannot change the name of a rule group after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     */
    override fun rules(): Any? = unwrap(this).getRules()

    /**
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional
     * application.
     *
     * For an AWS Amplify application, use `CLOUDFRONT` . A regional application can be an
     * Application Load Balancer (ALB), an Amazon API Gateway REST API, an AWS AppSync GraphQL API, an
     * Amazon Cognito user pool, an AWS App Runner service, or an AWS Verified Access instance. Valid
     * Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-scope)
     */
    override fun scope(): String = unwrap(this).getScope()

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
     */
    override fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroupProps):
        CfnRuleGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRuleGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroupProps):
        software.amazon.awscdk.services.wafv2.CfnRuleGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.wafv2.CfnRuleGroupProps
  }
}
