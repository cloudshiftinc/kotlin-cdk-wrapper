package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRuleGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the rule group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the rule group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The label namespace prefix for this rule group.
   *
   * All labels added by rules in this rule group have this prefix.
   *
   * The syntax for the label namespace prefix for a rule group is the following:
   * `awswaf:&lt;account ID&gt;:rule group:&lt;rule group name&gt;:`
   *
   * When a rule with a label matches a web request, AWS WAF adds the fully qualified label to the
   * request. A fully qualified label is made up of the label namespace from the rule group or web ACL
   * where the rule is defined and the label from the rule, separated by a colon.
   */
  public open fun attrLabelNamespace(): String = unwrap(this).getAttrLabelNamespace()

  /**
   * The labels that one or more rules in this rule group add to matching web requests.
   */
  public open fun availableLabels(): Any? = unwrap(this).getAvailableLabels()

  /**
   * The labels that one or more rules in this rule group add to matching web requests.
   */
  public open fun availableLabels(`value`: IResolvable) {
    unwrap(this).setAvailableLabels(`value`.let(IResolvable::unwrap))
  }

  /**
   * The labels that one or more rules in this rule group add to matching web requests.
   */
  public open fun availableLabels(__idx_ac66f0: List<Any>) {
    unwrap(this).setAvailableLabels(__idx_ac66f0)
  }

  /**
   * The labels that one or more rules in this rule group add to matching web requests.
   */
  public open fun availableLabels(vararg __idx_ac66f0: Any): Unit =
      availableLabels(__idx_ac66f0.toList())

  /**
   * The web ACL capacity units (WCUs) required for this rule group.
   */
  public open fun capacity(): Number = unwrap(this).getCapacity()

  /**
   * The web ACL capacity units (WCUs) required for this rule group.
   */
  public open fun capacity(`value`: Number) {
    unwrap(this).setCapacity(`value`)
  }

  /**
   * The labels that one or more rules in this rule group match against in label match statements.
   */
  public open fun consumedLabels(): Any? = unwrap(this).getConsumedLabels()

  /**
   * The labels that one or more rules in this rule group match against in label match statements.
   */
  public open fun consumedLabels(`value`: IResolvable) {
    unwrap(this).setConsumedLabels(`value`.let(IResolvable::unwrap))
  }

  /**
   * The labels that one or more rules in this rule group match against in label match statements.
   */
  public open fun consumedLabels(__idx_ac66f0: List<Any>) {
    unwrap(this).setConsumedLabels(__idx_ac66f0)
  }

  /**
   * The labels that one or more rules in this rule group match against in label match statements.
   */
  public open fun consumedLabels(vararg __idx_ac66f0: Any): Unit =
      consumedLabels(__idx_ac66f0.toList())

  /**
   * A map of custom response keys and content bodies.
   */
  public open fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

  /**
   * A map of custom response keys and content bodies.
   */
  public open fun customResponseBodies(`value`: IResolvable) {
    unwrap(this).setCustomResponseBodies(`value`.let(IResolvable::unwrap))
  }

  /**
   * A map of custom response keys and content bodies.
   */
  public open fun customResponseBodies(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setCustomResponseBodies(__item_ac66f0)
  }

  /**
   * A description of the rule group that helps with identification.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the rule group that helps with identification.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the rule group.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the rule group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The rule statements used to identify the web requests that you want to allow, block, or count.
   */
  public open fun rules(): Any? = unwrap(this).getRules()

  /**
   * The rule statements used to identify the web requests that you want to allow, block, or count.
   */
  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * The rule statements used to identify the web requests that you want to allow, block, or count.
   */
  public open fun rules(__idx_ac66f0: List<Any>) {
    unwrap(this).setRules(__idx_ac66f0)
  }

  /**
   * The rule statements used to identify the web requests that you want to allow, block, or count.
   */
  public open fun rules(vararg __idx_ac66f0: Any): Unit = rules(__idx_ac66f0.toList())

  /**
   * Specifies whether this is for an Amazon CloudFront distribution or for a regional application.
   */
  public open fun scope(): String = unwrap(this).getScope()

  /**
   * Specifies whether this is for an Amazon CloudFront distribution or for a regional application.
   */
  public open fun scope(`value`: String) {
    unwrap(this).setScope(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key:value pairs associated with an AWS resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key:value pairs associated with an AWS resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key:value pairs associated with an AWS resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Defines and enables Amazon CloudWatch metrics and web request sample collection.
   */
  public open fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()

  /**
   * Defines and enables Amazon CloudWatch metrics and web request sample collection.
   */
  public open fun visibilityConfig(`value`: IResolvable) {
    unwrap(this).setVisibilityConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Defines and enables Amazon CloudWatch metrics and web request sample collection.
   */
  public open fun visibilityConfig(`value`: VisibilityConfigProperty) {
    unwrap(this).setVisibilityConfig(`value`.let(VisibilityConfigProperty::unwrap))
  }

  /**
   * Defines and enables Amazon CloudWatch metrics and web request sample collection.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("221251ee754360a9ebb52acc364138be0a614076a8e9a9fd44db4ddf873762de")
  public open fun visibilityConfig(`value`: VisibilityConfigProperty.Builder.() -> Unit): Unit =
      visibilityConfig(VisibilityConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wafv2.CfnRuleGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests. 
     */
    public fun availableLabels(availableLabels: IResolvable)

    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests. 
     */
    public fun availableLabels(availableLabels: List<Any>)

    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests. 
     */
    public fun availableLabels(vararg availableLabels: Any)

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
     * @param capacity The web ACL capacity units (WCUs) required for this rule group. 
     */
    public fun capacity(capacity: Number)

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements. 
     */
    public fun consumedLabels(consumedLabels: IResolvable)

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements. 
     */
    public fun consumedLabels(consumedLabels: List<Any>)

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements. 
     */
    public fun consumedLabels(vararg consumedLabels: Any)

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
     * @param customResponseBodies A map of custom response keys and content bodies. 
     */
    public fun customResponseBodies(customResponseBodies: IResolvable)

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
     * @param customResponseBodies A map of custom response keys and content bodies. 
     */
    public fun customResponseBodies(customResponseBodies: Map<String, Any>)

    /**
     * A description of the rule group that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-description)
     * @param description A description of the rule group that helps with identification. 
     */
    public fun description(description: String)

    /**
     * The name of the rule group.
     *
     * You cannot change the name of a rule group after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-name)
     * @param name The name of the rule group. 
     */
    public fun name(name: String)

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count. 
     */
    public fun rules(rules: IResolvable)

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count. 
     */
    public fun rules(rules: List<Any>)

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count. 
     */
    public fun rules(vararg rules: Any)

    /**
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional
     * application.
     *
     * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
     * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an
     * AWS Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-scope)
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
     */
    public fun scope(scope: String)

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
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    public fun visibilityConfig(visibilityConfig: IResolvable)

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty)

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("366b1aaea94889b5c9a40c56f60673f0c33bfa5abb730b81db6d98b05dc0236d")
    public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnRuleGroup.Builder =
        software.amazon.awscdk.services.wafv2.CfnRuleGroup.Builder.create(scope, id)

    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests. 
     */
    override fun availableLabels(availableLabels: IResolvable) {
      cdkBuilder.availableLabels(availableLabels.let(IResolvable::unwrap))
    }

    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests. 
     */
    override fun availableLabels(availableLabels: List<Any>) {
      cdkBuilder.availableLabels(availableLabels)
    }

    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests. 
     */
    override fun availableLabels(vararg availableLabels: Any): Unit =
        availableLabels(availableLabels.toList())

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
     * @param capacity The web ACL capacity units (WCUs) required for this rule group. 
     */
    override fun capacity(capacity: Number) {
      cdkBuilder.capacity(capacity)
    }

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements. 
     */
    override fun consumedLabels(consumedLabels: IResolvable) {
      cdkBuilder.consumedLabels(consumedLabels.let(IResolvable::unwrap))
    }

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements. 
     */
    override fun consumedLabels(consumedLabels: List<Any>) {
      cdkBuilder.consumedLabels(consumedLabels)
    }

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements. 
     */
    override fun consumedLabels(vararg consumedLabels: Any): Unit =
        consumedLabels(consumedLabels.toList())

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
     * @param customResponseBodies A map of custom response keys and content bodies. 
     */
    override fun customResponseBodies(customResponseBodies: IResolvable) {
      cdkBuilder.customResponseBodies(customResponseBodies.let(IResolvable::unwrap))
    }

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
     * @param customResponseBodies A map of custom response keys and content bodies. 
     */
    override fun customResponseBodies(customResponseBodies: Map<String, Any>) {
      cdkBuilder.customResponseBodies(customResponseBodies)
    }

    /**
     * A description of the rule group that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-description)
     * @param description A description of the rule group that helps with identification. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the rule group.
     *
     * You cannot change the name of a rule group after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-name)
     * @param name The name of the rule group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count. 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional
     * application.
     *
     * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
     * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an
     * AWS Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-scope)
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

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
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    override fun visibilityConfig(visibilityConfig: IResolvable) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable::unwrap))
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(VisibilityConfigProperty::unwrap))
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("366b1aaea94889b5c9a40c56f60673f0c33bfa5abb730b81db6d98b05dc0236d")
    override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit):
        Unit = visibilityConfig(VisibilityConfigProperty(visibilityConfig))

    public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRuleGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRuleGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup): CfnRuleGroup =
        CfnRuleGroup(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroup): software.amazon.awscdk.services.wafv2.CfnRuleGroup =
        wrapped.cdkObject
  }

  public interface JsonBodyProperty {
    /**
     * What AWS WAF should do if it fails to completely parse the JSON body. The options are the
     * following:.
     *
     * * `EVALUATE_AS_STRING` - Inspect the body as plain text. AWS WAF applies the text
     * transformations and inspection criteria that you defined for the JSON inspection to the body
     * text string.
     * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
     * action to the request.
     * * `NO_MATCH` - Treat the web request as not matching the rule statement.
     *
     * If you don't provide this setting, AWS WAF parses and evaluates the content only up to the
     * first parsing failure that it encounters.
     *
     * AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons
     * such as invalid characters, duplicate keys, truncation, and any content whose root node isn't an
     * object or an array.
     *
     * AWS WAF parses the JSON in the following examples as two valid key, value pairs:
     *
     * * Missing comma: `{"key1":"value1""key2":"value2"}`
     * * Missing colon: `{"key1":"value1","key2""value2"}`
     * * Extra colons: `{"key1"::"value1","key2""value2"}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonbody.html#cfn-wafv2-rulegroup-jsonbody-invalidfallbackbehavior)
     */
    public fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

    /**
     * The patterns to look for in the JSON body.
     *
     * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonbody.html#cfn-wafv2-rulegroup-jsonbody-matchpattern)
     */
    public fun matchPattern(): Any

    /**
     * The parts of the JSON to match against using the `MatchPattern` .
     *
     * If you specify `ALL` , AWS WAF matches against keys and values.
     *
     * `All` does not require a match to be found in the keys and a match to be found in the values.
     * It requires a match to be found in the keys or the values or both. To require a match in the
     * keys and in the values, use a logical `AND` statement to combine two match rules, one that
     * inspects the keys and another that inspects the values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonbody.html#cfn-wafv2-rulegroup-jsonbody-matchscope)
     */
    public fun matchScope(): String

    /**
     * What AWS WAF should do if the body is larger than AWS WAF can inspect.
     *
     * AWS WAF does not support inspecting the entire contents of the web request body if the body
     * exceeds the limit for the resource type. If the body is larger than the limit, the underlying
     * host service only forwards the contents that are below the limit to AWS WAF for inspection.
     *
     * The default limit is 8 KB (8,192 bytes) for regional resources and 16 KB (16,384 bytes) for
     * CloudFront distributions. For CloudFront distributions, you can increase the limit in the web
     * ACL `AssociationConfig` , for additional processing fees.
     *
     * The options for oversize handling are the following:
     *
     * * `CONTINUE` - Inspect the available body contents normally, according to the rule inspection
     * criteria.
     * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
     * action to the request.
     * * `NO_MATCH` - Treat the web request as not matching the rule statement.
     *
     * You can combine the `MATCH` or `NO_MATCH` settings for oversize handling with your rule and
     * web ACL action settings, so that you block any request whose body is over the limit.
     *
     * Default: `CONTINUE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonbody.html#cfn-wafv2-rulegroup-jsonbody-oversizehandling)
     */
    public fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()

    /**
     * A builder for [JsonBodyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invalidFallbackBehavior What AWS WAF should do if it fails to completely parse the
       * JSON body. The options are the following:.
       * * `EVALUATE_AS_STRING` - Inspect the body as plain text. AWS WAF applies the text
       * transformations and inspection criteria that you defined for the JSON inspection to the body
       * text string.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * If you don't provide this setting, AWS WAF parses and evaluates the content only up to the
       * first parsing failure that it encounters.
       *
       * AWS WAF does its best to parse the entire JSON body, but might be forced to stop for
       * reasons such as invalid characters, duplicate keys, truncation, and any content whose root
       * node isn't an object or an array.
       *
       * AWS WAF parses the JSON in the following examples as two valid key, value pairs:
       *
       * * Missing comma: `{"key1":"value1""key2":"value2"}`
       * * Missing colon: `{"key1":"value1","key2""value2"}`
       * * Extra colons: `{"key1"::"value1","key2""value2"}`
       */
      public fun invalidFallbackBehavior(invalidFallbackBehavior: String)

      /**
       * @param matchPattern The patterns to look for in the JSON body. 
       * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
       */
      public fun matchPattern(matchPattern: IResolvable)

      /**
       * @param matchPattern The patterns to look for in the JSON body. 
       * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
       */
      public fun matchPattern(matchPattern: JsonMatchPatternProperty)

      /**
       * @param matchPattern The patterns to look for in the JSON body. 
       * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e590ca33e821e7413e1d874dd0a487ee5942ed0046a60284a111ebad7bac59f")
      public fun matchPattern(matchPattern: JsonMatchPatternProperty.Builder.() -> Unit)

      /**
       * @param matchScope The parts of the JSON to match against using the `MatchPattern` . 
       * If you specify `ALL` , AWS WAF matches against keys and values.
       *
       * `All` does not require a match to be found in the keys and a match to be found in the
       * values. It requires a match to be found in the keys or the values or both. To require a match
       * in the keys and in the values, use a logical `AND` statement to combine two match rules, one
       * that inspects the keys and another that inspects the values.
       */
      public fun matchScope(matchScope: String)

      /**
       * @param oversizeHandling What AWS WAF should do if the body is larger than AWS WAF can
       * inspect.
       * AWS WAF does not support inspecting the entire contents of the web request body if the body
       * exceeds the limit for the resource type. If the body is larger than the limit, the underlying
       * host service only forwards the contents that are below the limit to AWS WAF for inspection.
       *
       * The default limit is 8 KB (8,192 bytes) for regional resources and 16 KB (16,384 bytes) for
       * CloudFront distributions. For CloudFront distributions, you can increase the limit in the web
       * ACL `AssociationConfig` , for additional processing fees.
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available body contents normally, according to the rule
       * inspection criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * You can combine the `MATCH` or `NO_MATCH` settings for oversize handling with your rule and
       * web ACL action settings, so that you block any request whose body is over the limit.
       *
       * Default: `CONTINUE`
       */
      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty.builder()

      /**
       * @param invalidFallbackBehavior What AWS WAF should do if it fails to completely parse the
       * JSON body. The options are the following:.
       * * `EVALUATE_AS_STRING` - Inspect the body as plain text. AWS WAF applies the text
       * transformations and inspection criteria that you defined for the JSON inspection to the body
       * text string.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * If you don't provide this setting, AWS WAF parses and evaluates the content only up to the
       * first parsing failure that it encounters.
       *
       * AWS WAF does its best to parse the entire JSON body, but might be forced to stop for
       * reasons such as invalid characters, duplicate keys, truncation, and any content whose root
       * node isn't an object or an array.
       *
       * AWS WAF parses the JSON in the following examples as two valid key, value pairs:
       *
       * * Missing comma: `{"key1":"value1""key2":"value2"}`
       * * Missing colon: `{"key1":"value1","key2""value2"}`
       * * Extra colons: `{"key1"::"value1","key2""value2"}`
       */
      override fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
        cdkBuilder.invalidFallbackBehavior(invalidFallbackBehavior)
      }

      /**
       * @param matchPattern The patterns to look for in the JSON body. 
       * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
       */
      override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      /**
       * @param matchPattern The patterns to look for in the JSON body. 
       * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
       */
      override fun matchPattern(matchPattern: JsonMatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(JsonMatchPatternProperty::unwrap))
      }

      /**
       * @param matchPattern The patterns to look for in the JSON body. 
       * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e590ca33e821e7413e1d874dd0a487ee5942ed0046a60284a111ebad7bac59f")
      override fun matchPattern(matchPattern: JsonMatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(JsonMatchPatternProperty(matchPattern))

      /**
       * @param matchScope The parts of the JSON to match against using the `MatchPattern` . 
       * If you specify `ALL` , AWS WAF matches against keys and values.
       *
       * `All` does not require a match to be found in the keys and a match to be found in the
       * values. It requires a match to be found in the keys or the values or both. To require a match
       * in the keys and in the values, use a logical `AND` statement to combine two match rules, one
       * that inspects the keys and another that inspects the values.
       */
      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      /**
       * @param oversizeHandling What AWS WAF should do if the body is larger than AWS WAF can
       * inspect.
       * AWS WAF does not support inspecting the entire contents of the web request body if the body
       * exceeds the limit for the resource type. If the body is larger than the limit, the underlying
       * host service only forwards the contents that are below the limit to AWS WAF for inspection.
       *
       * The default limit is 8 KB (8,192 bytes) for regional resources and 16 KB (16,384 bytes) for
       * CloudFront distributions. For CloudFront distributions, you can increase the limit in the web
       * ACL `AssociationConfig` , for additional processing fees.
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available body contents normally, according to the rule
       * inspection criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * You can combine the `MATCH` or `NO_MATCH` settings for oversize handling with your rule and
       * web ACL action settings, so that you block any request whose body is over the limit.
       *
       * Default: `CONTINUE`
       */
      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty,
    ) : JsonBodyProperty {
      /**
       * What AWS WAF should do if it fails to completely parse the JSON body. The options are the
       * following:.
       *
       * * `EVALUATE_AS_STRING` - Inspect the body as plain text. AWS WAF applies the text
       * transformations and inspection criteria that you defined for the JSON inspection to the body
       * text string.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * If you don't provide this setting, AWS WAF parses and evaluates the content only up to the
       * first parsing failure that it encounters.
       *
       * AWS WAF does its best to parse the entire JSON body, but might be forced to stop for
       * reasons such as invalid characters, duplicate keys, truncation, and any content whose root
       * node isn't an object or an array.
       *
       * AWS WAF parses the JSON in the following examples as two valid key, value pairs:
       *
       * * Missing comma: `{"key1":"value1""key2":"value2"}`
       * * Missing colon: `{"key1":"value1","key2""value2"}`
       * * Extra colons: `{"key1"::"value1","key2""value2"}`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonbody.html#cfn-wafv2-rulegroup-jsonbody-invalidfallbackbehavior)
       */
      override fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

      /**
       * The patterns to look for in the JSON body.
       *
       * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonbody.html#cfn-wafv2-rulegroup-jsonbody-matchpattern)
       */
      override fun matchPattern(): Any = unwrap(this).getMatchPattern()

      /**
       * The parts of the JSON to match against using the `MatchPattern` .
       *
       * If you specify `ALL` , AWS WAF matches against keys and values.
       *
       * `All` does not require a match to be found in the keys and a match to be found in the
       * values. It requires a match to be found in the keys or the values or both. To require a match
       * in the keys and in the values, use a logical `AND` statement to combine two match rules, one
       * that inspects the keys and another that inspects the values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonbody.html#cfn-wafv2-rulegroup-jsonbody-matchscope)
       */
      override fun matchScope(): String = unwrap(this).getMatchScope()

      /**
       * What AWS WAF should do if the body is larger than AWS WAF can inspect.
       *
       * AWS WAF does not support inspecting the entire contents of the web request body if the body
       * exceeds the limit for the resource type. If the body is larger than the limit, the underlying
       * host service only forwards the contents that are below the limit to AWS WAF for inspection.
       *
       * The default limit is 8 KB (8,192 bytes) for regional resources and 16 KB (16,384 bytes) for
       * CloudFront distributions. For CloudFront distributions, you can increase the limit in the web
       * ACL `AssociationConfig` , for additional processing fees.
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available body contents normally, according to the rule
       * inspection criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * You can combine the `MATCH` or `NO_MATCH` settings for oversize handling with your rule and
       * web ACL action settings, so that you block any request whose body is over the limit.
       *
       * Default: `CONTINUE`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonbody.html#cfn-wafv2-rulegroup-jsonbody-oversizehandling)
       */
      override fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty):
          JsonBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomResponseProperty {
    /**
     * References the response body that you want AWS WAF to return to the web request client.
     *
     * You can define a custom response for a rule action or a default web ACL action that is set to
     * block. To do this, you first define the response body key and value in the
     * `CustomResponseBodies` setting for the `WebACL` or `RuleGroup` where you want to use it. Then,
     * in the rule action or web ACL default action `BlockAction` setting, you reference the response
     * body using this key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponse.html#cfn-wafv2-rulegroup-customresponse-customresponsebodykey)
     */
    public fun customResponseBodyKey(): String? = unwrap(this).getCustomResponseBodyKey()

    /**
     * The HTTP status code to return to the client.
     *
     * For a list of status codes that you can use in your custom responses, see [Supported status
     * codes for custom
     * response](https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html)
     * in the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponse.html#cfn-wafv2-rulegroup-customresponse-responsecode)
     */
    public fun responseCode(): Number

    /**
     * The HTTP headers to use in the response.
     *
     * You can specify any header name except for `content-type` . Duplicate header names are not
     * allowed.
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponse.html#cfn-wafv2-rulegroup-customresponse-responseheaders)
     */
    public fun responseHeaders(): Any? = unwrap(this).getResponseHeaders()

    /**
     * A builder for [CustomResponseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customResponseBodyKey References the response body that you want AWS WAF to return
       * to the web request client.
       * You can define a custom response for a rule action or a default web ACL action that is set
       * to block. To do this, you first define the response body key and value in the
       * `CustomResponseBodies` setting for the `WebACL` or `RuleGroup` where you want to use it. Then,
       * in the rule action or web ACL default action `BlockAction` setting, you reference the response
       * body using this key.
       */
      public fun customResponseBodyKey(customResponseBodyKey: String)

      /**
       * @param responseCode The HTTP status code to return to the client. 
       * For a list of status codes that you can use in your custom responses, see [Supported status
       * codes for custom
       * response](https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun responseCode(responseCode: Number)

      /**
       * @param responseHeaders The HTTP headers to use in the response.
       * You can specify any header name except for `content-type` . Duplicate header names are not
       * allowed.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      public fun responseHeaders(responseHeaders: IResolvable)

      /**
       * @param responseHeaders The HTTP headers to use in the response.
       * You can specify any header name except for `content-type` . Duplicate header names are not
       * allowed.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      public fun responseHeaders(responseHeaders: List<Any>)

      /**
       * @param responseHeaders The HTTP headers to use in the response.
       * You can specify any header name except for `content-type` . Duplicate header names are not
       * allowed.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      public fun responseHeaders(vararg responseHeaders: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty.builder()

      /**
       * @param customResponseBodyKey References the response body that you want AWS WAF to return
       * to the web request client.
       * You can define a custom response for a rule action or a default web ACL action that is set
       * to block. To do this, you first define the response body key and value in the
       * `CustomResponseBodies` setting for the `WebACL` or `RuleGroup` where you want to use it. Then,
       * in the rule action or web ACL default action `BlockAction` setting, you reference the response
       * body using this key.
       */
      override fun customResponseBodyKey(customResponseBodyKey: String) {
        cdkBuilder.customResponseBodyKey(customResponseBodyKey)
      }

      /**
       * @param responseCode The HTTP status code to return to the client. 
       * For a list of status codes that you can use in your custom responses, see [Supported status
       * codes for custom
       * response](https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun responseCode(responseCode: Number) {
        cdkBuilder.responseCode(responseCode)
      }

      /**
       * @param responseHeaders The HTTP headers to use in the response.
       * You can specify any header name except for `content-type` . Duplicate header names are not
       * allowed.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      override fun responseHeaders(responseHeaders: IResolvable) {
        cdkBuilder.responseHeaders(responseHeaders.let(IResolvable::unwrap))
      }

      /**
       * @param responseHeaders The HTTP headers to use in the response.
       * You can specify any header name except for `content-type` . Duplicate header names are not
       * allowed.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      override fun responseHeaders(responseHeaders: List<Any>) {
        cdkBuilder.responseHeaders(responseHeaders)
      }

      /**
       * @param responseHeaders The HTTP headers to use in the response.
       * You can specify any header name except for `content-type` . Duplicate header names are not
       * allowed.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      override fun responseHeaders(vararg responseHeaders: Any): Unit =
          responseHeaders(responseHeaders.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty,
    ) : CustomResponseProperty {
      /**
       * References the response body that you want AWS WAF to return to the web request client.
       *
       * You can define a custom response for a rule action or a default web ACL action that is set
       * to block. To do this, you first define the response body key and value in the
       * `CustomResponseBodies` setting for the `WebACL` or `RuleGroup` where you want to use it. Then,
       * in the rule action or web ACL default action `BlockAction` setting, you reference the response
       * body using this key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponse.html#cfn-wafv2-rulegroup-customresponse-customresponsebodykey)
       */
      override fun customResponseBodyKey(): String? = unwrap(this).getCustomResponseBodyKey()

      /**
       * The HTTP status code to return to the client.
       *
       * For a list of status codes that you can use in your custom responses, see [Supported status
       * codes for custom
       * response](https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html)
       * in the *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponse.html#cfn-wafv2-rulegroup-customresponse-responsecode)
       */
      override fun responseCode(): Number = unwrap(this).getResponseCode()

      /**
       * The HTTP headers to use in the response.
       *
       * You can specify any header name except for `content-type` . Duplicate header names are not
       * allowed.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponse.html#cfn-wafv2-rulegroup-customresponse-responseheaders)
       */
      override fun responseHeaders(): Any? = unwrap(this).getResponseHeaders()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty):
          CustomResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomResponseProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ImmunityTimePropertyProperty {
    /**
     * The amount of time, in seconds, that a `CAPTCHA` or challenge timestamp is considered valid
     * by AWS WAF .
     *
     * The default setting is 300.
     *
     * For the Challenge action, the minimum setting is 300.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-immunitytimeproperty.html#cfn-wafv2-rulegroup-immunitytimeproperty-immunitytime)
     */
    public fun immunityTime(): Number

    /**
     * A builder for [ImmunityTimePropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param immunityTime The amount of time, in seconds, that a `CAPTCHA` or challenge timestamp
       * is considered valid by AWS WAF . 
       * The default setting is 300.
       *
       * For the Challenge action, the minimum setting is 300.
       */
      public fun immunityTime(immunityTime: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty.builder()

      /**
       * @param immunityTime The amount of time, in seconds, that a `CAPTCHA` or challenge timestamp
       * is considered valid by AWS WAF . 
       * The default setting is 300.
       *
       * For the Challenge action, the minimum setting is 300.
       */
      override fun immunityTime(immunityTime: Number) {
        cdkBuilder.immunityTime(immunityTime)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty,
    ) : ImmunityTimePropertyProperty {
      /**
       * The amount of time, in seconds, that a `CAPTCHA` or challenge timestamp is considered valid
       * by AWS WAF .
       *
       * The default setting is 300.
       *
       * For the Challenge action, the minimum setting is 300.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-immunitytimeproperty.html#cfn-wafv2-rulegroup-immunitytimeproperty-immunitytime)
       */
      override fun immunityTime(): Number = unwrap(this).getImmunityTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImmunityTimePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty):
          ImmunityTimePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImmunityTimePropertyProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ImmunityTimePropertyProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RuleActionProperty {
    /**
     * Instructs AWS WAF to allow the web request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html#cfn-wafv2-rulegroup-ruleaction-allow)
     */
    public fun allow(): Any? = unwrap(this).getAllow()

    /**
     * Instructs AWS WAF to block the web request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html#cfn-wafv2-rulegroup-ruleaction-block)
     */
    public fun block(): Any? = unwrap(this).getBlock()

    /**
     * Specifies that AWS WAF should run a `CAPTCHA` check against the request:.
     *
     * * If the request includes a valid, unexpired `CAPTCHA` token, AWS WAF allows the web request
     * inspection to proceed to the next rule, similar to a `CountAction` .
     * * If the request doesn't include a valid, unexpired `CAPTCHA` token, AWS WAF discontinues the
     * web ACL evaluation of the request and blocks it from going to its intended destination.
     *
     * AWS WAF generates a response that it sends back to the client, which includes the following:
     *
     * * The header `x-amzn-waf-action` with a value of `captcha` .
     * * The HTTP status code `405 Method Not Allowed` .
     * * If the request contains an `Accept` header with a value of `text/html` , the response
     * includes a `CAPTCHA` challenge.
     *
     * You can configure the expiration time in the `CaptchaConfig` `ImmunityTimeProperty` setting
     * at the rule and web ACL level. The rule setting overrides the web ACL setting.
     *
     * This action option is available for rules. It isn't available for web ACL default actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html#cfn-wafv2-rulegroup-ruleaction-captcha)
     */
    public fun captcha(): Any? = unwrap(this).getCaptcha()

    /**
     * Instructs AWS WAF to run a `Challenge` check against the web request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html#cfn-wafv2-rulegroup-ruleaction-challenge)
     */
    public fun challenge(): Any? = unwrap(this).getChallenge()

    /**
     * Instructs AWS WAF to count the web request and then continue evaluating the request using the
     * remaining rules in the web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html#cfn-wafv2-rulegroup-ruleaction-count)
     */
    public fun count(): Any? = unwrap(this).getCount()

    /**
     * A builder for [RuleActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allow Instructs AWS WAF to allow the web request.
       */
      public fun allow(allow: Any)

      /**
       * @param block Instructs AWS WAF to block the web request.
       */
      public fun block(block: Any)

      /**
       * @param captcha Specifies that AWS WAF should run a `CAPTCHA` check against the request:.
       * * If the request includes a valid, unexpired `CAPTCHA` token, AWS WAF allows the web
       * request inspection to proceed to the next rule, similar to a `CountAction` .
       * * If the request doesn't include a valid, unexpired `CAPTCHA` token, AWS WAF discontinues
       * the web ACL evaluation of the request and blocks it from going to its intended destination.
       *
       * AWS WAF generates a response that it sends back to the client, which includes the
       * following:
       *
       * * The header `x-amzn-waf-action` with a value of `captcha` .
       * * The HTTP status code `405 Method Not Allowed` .
       * * If the request contains an `Accept` header with a value of `text/html` , the response
       * includes a `CAPTCHA` challenge.
       *
       * You can configure the expiration time in the `CaptchaConfig` `ImmunityTimeProperty` setting
       * at the rule and web ACL level. The rule setting overrides the web ACL setting.
       *
       * This action option is available for rules. It isn't available for web ACL default actions.
       */
      public fun captcha(captcha: Any)

      /**
       * @param challenge Instructs AWS WAF to run a `Challenge` check against the web request.
       */
      public fun challenge(challenge: Any)

      /**
       * @param count Instructs AWS WAF to count the web request and then continue evaluating the
       * request using the remaining rules in the web ACL.
       */
      public fun count(count: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty.builder()

      /**
       * @param allow Instructs AWS WAF to allow the web request.
       */
      override fun allow(allow: Any) {
        cdkBuilder.allow(allow)
      }

      /**
       * @param block Instructs AWS WAF to block the web request.
       */
      override fun block(block: Any) {
        cdkBuilder.block(block)
      }

      /**
       * @param captcha Specifies that AWS WAF should run a `CAPTCHA` check against the request:.
       * * If the request includes a valid, unexpired `CAPTCHA` token, AWS WAF allows the web
       * request inspection to proceed to the next rule, similar to a `CountAction` .
       * * If the request doesn't include a valid, unexpired `CAPTCHA` token, AWS WAF discontinues
       * the web ACL evaluation of the request and blocks it from going to its intended destination.
       *
       * AWS WAF generates a response that it sends back to the client, which includes the
       * following:
       *
       * * The header `x-amzn-waf-action` with a value of `captcha` .
       * * The HTTP status code `405 Method Not Allowed` .
       * * If the request contains an `Accept` header with a value of `text/html` , the response
       * includes a `CAPTCHA` challenge.
       *
       * You can configure the expiration time in the `CaptchaConfig` `ImmunityTimeProperty` setting
       * at the rule and web ACL level. The rule setting overrides the web ACL setting.
       *
       * This action option is available for rules. It isn't available for web ACL default actions.
       */
      override fun captcha(captcha: Any) {
        cdkBuilder.captcha(captcha)
      }

      /**
       * @param challenge Instructs AWS WAF to run a `Challenge` check against the web request.
       */
      override fun challenge(challenge: Any) {
        cdkBuilder.challenge(challenge)
      }

      /**
       * @param count Instructs AWS WAF to count the web request and then continue evaluating the
       * request using the remaining rules in the web ACL.
       */
      override fun count(count: Any) {
        cdkBuilder.count(count)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty,
    ) : RuleActionProperty {
      /**
       * Instructs AWS WAF to allow the web request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html#cfn-wafv2-rulegroup-ruleaction-allow)
       */
      override fun allow(): Any? = unwrap(this).getAllow()

      /**
       * Instructs AWS WAF to block the web request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html#cfn-wafv2-rulegroup-ruleaction-block)
       */
      override fun block(): Any? = unwrap(this).getBlock()

      /**
       * Specifies that AWS WAF should run a `CAPTCHA` check against the request:.
       *
       * * If the request includes a valid, unexpired `CAPTCHA` token, AWS WAF allows the web
       * request inspection to proceed to the next rule, similar to a `CountAction` .
       * * If the request doesn't include a valid, unexpired `CAPTCHA` token, AWS WAF discontinues
       * the web ACL evaluation of the request and blocks it from going to its intended destination.
       *
       * AWS WAF generates a response that it sends back to the client, which includes the
       * following:
       *
       * * The header `x-amzn-waf-action` with a value of `captcha` .
       * * The HTTP status code `405 Method Not Allowed` .
       * * If the request contains an `Accept` header with a value of `text/html` , the response
       * includes a `CAPTCHA` challenge.
       *
       * You can configure the expiration time in the `CaptchaConfig` `ImmunityTimeProperty` setting
       * at the rule and web ACL level. The rule setting overrides the web ACL setting.
       *
       * This action option is available for rules. It isn't available for web ACL default actions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html#cfn-wafv2-rulegroup-ruleaction-captcha)
       */
      override fun captcha(): Any? = unwrap(this).getCaptcha()

      /**
       * Instructs AWS WAF to run a `Challenge` check against the web request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html#cfn-wafv2-rulegroup-ruleaction-challenge)
       */
      override fun challenge(): Any? = unwrap(this).getChallenge()

      /**
       * Instructs AWS WAF to count the web request and then continue evaluating the request using
       * the remaining rules in the web ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html#cfn-wafv2-rulegroup-ruleaction-count)
       */
      override fun count(): Any? = unwrap(this).getCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty):
          RuleActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleActionProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuleProperty {
    /**
     * The action that AWS WAF should take on a web request when it matches the rule statement.
     *
     * Settings at the web ACL level can override the rule action setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-action)
     */
    public fun action(): Any? = unwrap(this).getAction()

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations.
     *
     * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the
     * web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-captchaconfig)
     */
    public fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

    /**
     * Specifies how AWS WAF should handle `Challenge` evaluations.
     *
     * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the
     * web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-challengeconfig)
     */
    public fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

    /**
     * The name of the rule.
     *
     * If you change the name of a `Rule` after you create it and you want the rule's metric name to
     * reflect the change, update the metric name in the rule's `VisibilityConfig` settings. AWS WAF
     * doesn't automatically update the metric name when you update the rule name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-name)
     */
    public fun name(): String

    /**
     * If you define more than one `Rule` in a `WebACL` , AWS WAF evaluates each request against the
     * `Rules` in order based on the value of `Priority` .
     *
     * AWS WAF processes rules with lower priority first. The priorities don't need to be
     * consecutive, but they must all be different.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-priority)
     */
    public fun priority(): Number

    /**
     * Labels to apply to web requests that match the rule match statement.
     *
     * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is
     * the concatenation of a label namespace and a rule label. The rule's rule group or web ACL
     * defines the label namespace.
     *
     * Rules that run after this rule in the web ACL can match against these labels using a
     * `LabelMatchStatement` .
     *
     * For each label, provide a case-sensitive string containing optional namespaces and a label
     * name, according to the following guidelines:
     *
     * * Separate each component of the label with a colon.
     * * Each namespace or name can have up to 128 characters.
     * * You can specify up to 5 namespaces in a label.
     * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
     * `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
     *
     * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-rulelabels)
     */
    public fun ruleLabels(): Any? = unwrap(this).getRuleLabels()

    /**
     * The AWS WAF processing statement for the rule, for example `ByteMatchStatement` or
     * `SizeConstraintStatement` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-statement)
     */
    public fun statement(): Any

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * If you change the name of a `Rule` after you create it and you want the rule's metric name to
     * reflect the change, update the metric name as well. AWS WAF doesn't automatically update the
     * metric name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-visibilityconfig)
     */
    public fun visibilityConfig(): Any

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action that AWS WAF should take on a web request when it matches the rule
       * statement.
       * Settings at the web ACL level can override the rule action setting.
       */
      public fun action(action: IResolvable)

      /**
       * @param action The action that AWS WAF should take on a web request when it matches the rule
       * statement.
       * Settings at the web ACL level can override the rule action setting.
       */
      public fun action(action: RuleActionProperty)

      /**
       * @param action The action that AWS WAF should take on a web request when it matches the rule
       * statement.
       * Settings at the web ACL level can override the rule action setting.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ab59604d66f34cfbcc06b518a5a65e829356d92292693b3017e1180b0b691e3")
      public fun action(action: RuleActionProperty.Builder.() -> Unit)

      /**
       * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations.
       * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the
       * web ACL.
       */
      public fun captchaConfig(captchaConfig: IResolvable)

      /**
       * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations.
       * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the
       * web ACL.
       */
      public fun captchaConfig(captchaConfig: CaptchaConfigProperty)

      /**
       * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations.
       * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the
       * web ACL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90f6e38e2c3c5b6a7f2d6756b5812401a10b2c32776c5257df07e13164b43707")
      public fun captchaConfig(captchaConfig: CaptchaConfigProperty.Builder.() -> Unit)

      /**
       * @param challengeConfig Specifies how AWS WAF should handle `Challenge` evaluations.
       * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the
       * web ACL.
       */
      public fun challengeConfig(challengeConfig: IResolvable)

      /**
       * @param challengeConfig Specifies how AWS WAF should handle `Challenge` evaluations.
       * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the
       * web ACL.
       */
      public fun challengeConfig(challengeConfig: ChallengeConfigProperty)

      /**
       * @param challengeConfig Specifies how AWS WAF should handle `Challenge` evaluations.
       * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the
       * web ACL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c6f4e93253cc8051bfe46a07df51ba9e7e46aa181e3d7cd2aba87c121221f6e")
      public fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit)

      /**
       * @param name The name of the rule. 
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name in the rule's `VisibilityConfig` settings. AWS
       * WAF doesn't automatically update the metric name when you update the rule name.
       */
      public fun name(name: String)

      /**
       * @param priority If you define more than one `Rule` in a `WebACL` , AWS WAF evaluates each
       * request against the `Rules` in order based on the value of `Priority` . 
       * AWS WAF processes rules with lower priority first. The priorities don't need to be
       * consecutive, but they must all be different.
       */
      public fun priority(priority: Number)

      /**
       * @param ruleLabels Labels to apply to web requests that match the rule match statement.
       * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is
       * the concatenation of a label namespace and a rule label. The rule's rule group or web ACL
       * defines the label namespace.
       *
       * Rules that run after this rule in the web ACL can match against these labels using a
       * `LabelMatchStatement` .
       *
       * For each label, provide a case-sensitive string containing optional namespaces and a label
       * name, according to the following guidelines:
       *
       * * Separate each component of the label with a colon.
       * * Each namespace or name can have up to 128 characters.
       * * You can specify up to 5 namespaces in a label.
       * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
       * `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
       *
       * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
       */
      public fun ruleLabels(ruleLabels: IResolvable)

      /**
       * @param ruleLabels Labels to apply to web requests that match the rule match statement.
       * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is
       * the concatenation of a label namespace and a rule label. The rule's rule group or web ACL
       * defines the label namespace.
       *
       * Rules that run after this rule in the web ACL can match against these labels using a
       * `LabelMatchStatement` .
       *
       * For each label, provide a case-sensitive string containing optional namespaces and a label
       * name, according to the following guidelines:
       *
       * * Separate each component of the label with a colon.
       * * Each namespace or name can have up to 128 characters.
       * * You can specify up to 5 namespaces in a label.
       * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
       * `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
       *
       * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
       */
      public fun ruleLabels(ruleLabels: List<Any>)

      /**
       * @param ruleLabels Labels to apply to web requests that match the rule match statement.
       * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is
       * the concatenation of a label namespace and a rule label. The rule's rule group or web ACL
       * defines the label namespace.
       *
       * Rules that run after this rule in the web ACL can match against these labels using a
       * `LabelMatchStatement` .
       *
       * For each label, provide a case-sensitive string containing optional namespaces and a label
       * name, according to the following guidelines:
       *
       * * Separate each component of the label with a colon.
       * * Each namespace or name can have up to 128 characters.
       * * You can specify up to 5 namespaces in a label.
       * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
       * `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
       *
       * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
       */
      public fun ruleLabels(vararg ruleLabels: Any)

      /**
       * @param statement The AWS WAF processing statement for the rule, for example
       * `ByteMatchStatement` or `SizeConstraintStatement` . 
       */
      public fun statement(statement: IResolvable)

      /**
       * @param statement The AWS WAF processing statement for the rule, for example
       * `ByteMatchStatement` or `SizeConstraintStatement` . 
       */
      public fun statement(statement: StatementProperty)

      /**
       * @param statement The AWS WAF processing statement for the rule, for example
       * `ByteMatchStatement` or `SizeConstraintStatement` . 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("177124055aa0539a2933b6a8f96eb0a9dce6c9fa01a254f7dbd404587f1d47ec")
      public fun statement(statement: StatementProperty.Builder.() -> Unit)

      /**
       * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request
       * sample collection. 
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name as well. AWS WAF doesn't automatically update
       * the metric name.
       */
      public fun visibilityConfig(visibilityConfig: IResolvable)

      /**
       * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request
       * sample collection. 
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name as well. AWS WAF doesn't automatically update
       * the metric name.
       */
      public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty)

      /**
       * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request
       * sample collection. 
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name as well. AWS WAF doesn't automatically update
       * the metric name.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db831e145764c8bfbc00a3984a4b6f1bac975abdf526651e355015faae968afe")
      public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty.builder()

      /**
       * @param action The action that AWS WAF should take on a web request when it matches the rule
       * statement.
       * Settings at the web ACL level can override the rule action setting.
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action The action that AWS WAF should take on a web request when it matches the rule
       * statement.
       * Settings at the web ACL level can override the rule action setting.
       */
      override fun action(action: RuleActionProperty) {
        cdkBuilder.action(action.let(RuleActionProperty::unwrap))
      }

      /**
       * @param action The action that AWS WAF should take on a web request when it matches the rule
       * statement.
       * Settings at the web ACL level can override the rule action setting.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ab59604d66f34cfbcc06b518a5a65e829356d92292693b3017e1180b0b691e3")
      override fun action(action: RuleActionProperty.Builder.() -> Unit): Unit =
          action(RuleActionProperty(action))

      /**
       * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations.
       * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the
       * web ACL.
       */
      override fun captchaConfig(captchaConfig: IResolvable) {
        cdkBuilder.captchaConfig(captchaConfig.let(IResolvable::unwrap))
      }

      /**
       * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations.
       * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the
       * web ACL.
       */
      override fun captchaConfig(captchaConfig: CaptchaConfigProperty) {
        cdkBuilder.captchaConfig(captchaConfig.let(CaptchaConfigProperty::unwrap))
      }

      /**
       * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations.
       * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the
       * web ACL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90f6e38e2c3c5b6a7f2d6756b5812401a10b2c32776c5257df07e13164b43707")
      override fun captchaConfig(captchaConfig: CaptchaConfigProperty.Builder.() -> Unit): Unit =
          captchaConfig(CaptchaConfigProperty(captchaConfig))

      /**
       * @param challengeConfig Specifies how AWS WAF should handle `Challenge` evaluations.
       * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the
       * web ACL.
       */
      override fun challengeConfig(challengeConfig: IResolvable) {
        cdkBuilder.challengeConfig(challengeConfig.let(IResolvable::unwrap))
      }

      /**
       * @param challengeConfig Specifies how AWS WAF should handle `Challenge` evaluations.
       * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the
       * web ACL.
       */
      override fun challengeConfig(challengeConfig: ChallengeConfigProperty) {
        cdkBuilder.challengeConfig(challengeConfig.let(ChallengeConfigProperty::unwrap))
      }

      /**
       * @param challengeConfig Specifies how AWS WAF should handle `Challenge` evaluations.
       * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the
       * web ACL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c6f4e93253cc8051bfe46a07df51ba9e7e46aa181e3d7cd2aba87c121221f6e")
      override fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit):
          Unit = challengeConfig(ChallengeConfigProperty(challengeConfig))

      /**
       * @param name The name of the rule. 
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name in the rule's `VisibilityConfig` settings. AWS
       * WAF doesn't automatically update the metric name when you update the rule name.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param priority If you define more than one `Rule` in a `WebACL` , AWS WAF evaluates each
       * request against the `Rules` in order based on the value of `Priority` . 
       * AWS WAF processes rules with lower priority first. The priorities don't need to be
       * consecutive, but they must all be different.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param ruleLabels Labels to apply to web requests that match the rule match statement.
       * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is
       * the concatenation of a label namespace and a rule label. The rule's rule group or web ACL
       * defines the label namespace.
       *
       * Rules that run after this rule in the web ACL can match against these labels using a
       * `LabelMatchStatement` .
       *
       * For each label, provide a case-sensitive string containing optional namespaces and a label
       * name, according to the following guidelines:
       *
       * * Separate each component of the label with a colon.
       * * Each namespace or name can have up to 128 characters.
       * * You can specify up to 5 namespaces in a label.
       * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
       * `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
       *
       * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
       */
      override fun ruleLabels(ruleLabels: IResolvable) {
        cdkBuilder.ruleLabels(ruleLabels.let(IResolvable::unwrap))
      }

      /**
       * @param ruleLabels Labels to apply to web requests that match the rule match statement.
       * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is
       * the concatenation of a label namespace and a rule label. The rule's rule group or web ACL
       * defines the label namespace.
       *
       * Rules that run after this rule in the web ACL can match against these labels using a
       * `LabelMatchStatement` .
       *
       * For each label, provide a case-sensitive string containing optional namespaces and a label
       * name, according to the following guidelines:
       *
       * * Separate each component of the label with a colon.
       * * Each namespace or name can have up to 128 characters.
       * * You can specify up to 5 namespaces in a label.
       * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
       * `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
       *
       * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
       */
      override fun ruleLabels(ruleLabels: List<Any>) {
        cdkBuilder.ruleLabels(ruleLabels)
      }

      /**
       * @param ruleLabels Labels to apply to web requests that match the rule match statement.
       * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is
       * the concatenation of a label namespace and a rule label. The rule's rule group or web ACL
       * defines the label namespace.
       *
       * Rules that run after this rule in the web ACL can match against these labels using a
       * `LabelMatchStatement` .
       *
       * For each label, provide a case-sensitive string containing optional namespaces and a label
       * name, according to the following guidelines:
       *
       * * Separate each component of the label with a colon.
       * * Each namespace or name can have up to 128 characters.
       * * You can specify up to 5 namespaces in a label.
       * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
       * `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
       *
       * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
       */
      override fun ruleLabels(vararg ruleLabels: Any): Unit = ruleLabels(ruleLabels.toList())

      /**
       * @param statement The AWS WAF processing statement for the rule, for example
       * `ByteMatchStatement` or `SizeConstraintStatement` . 
       */
      override fun statement(statement: IResolvable) {
        cdkBuilder.statement(statement.let(IResolvable::unwrap))
      }

      /**
       * @param statement The AWS WAF processing statement for the rule, for example
       * `ByteMatchStatement` or `SizeConstraintStatement` . 
       */
      override fun statement(statement: StatementProperty) {
        cdkBuilder.statement(statement.let(StatementProperty::unwrap))
      }

      /**
       * @param statement The AWS WAF processing statement for the rule, for example
       * `ByteMatchStatement` or `SizeConstraintStatement` . 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("177124055aa0539a2933b6a8f96eb0a9dce6c9fa01a254f7dbd404587f1d47ec")
      override fun statement(statement: StatementProperty.Builder.() -> Unit): Unit =
          statement(StatementProperty(statement))

      /**
       * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request
       * sample collection. 
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name as well. AWS WAF doesn't automatically update
       * the metric name.
       */
      override fun visibilityConfig(visibilityConfig: IResolvable) {
        cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable::unwrap))
      }

      /**
       * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request
       * sample collection. 
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name as well. AWS WAF doesn't automatically update
       * the metric name.
       */
      override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty) {
        cdkBuilder.visibilityConfig(visibilityConfig.let(VisibilityConfigProperty::unwrap))
      }

      /**
       * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request
       * sample collection. 
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name as well. AWS WAF doesn't automatically update
       * the metric name.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db831e145764c8bfbc00a3984a4b6f1bac975abdf526651e355015faae968afe")
      override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit):
          Unit = visibilityConfig(VisibilityConfigProperty(visibilityConfig))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty,
    ) : RuleProperty {
      /**
       * The action that AWS WAF should take on a web request when it matches the rule statement.
       *
       * Settings at the web ACL level can override the rule action setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-action)
       */
      override fun action(): Any? = unwrap(this).getAction()

      /**
       * Specifies how AWS WAF should handle `CAPTCHA` evaluations.
       *
       * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the
       * web ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-captchaconfig)
       */
      override fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

      /**
       * Specifies how AWS WAF should handle `Challenge` evaluations.
       *
       * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the
       * web ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-challengeconfig)
       */
      override fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

      /**
       * The name of the rule.
       *
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name in the rule's `VisibilityConfig` settings. AWS
       * WAF doesn't automatically update the metric name when you update the rule name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * If you define more than one `Rule` in a `WebACL` , AWS WAF evaluates each request against
       * the `Rules` in order based on the value of `Priority` .
       *
       * AWS WAF processes rules with lower priority first. The priorities don't need to be
       * consecutive, but they must all be different.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * Labels to apply to web requests that match the rule match statement.
       *
       * AWS WAF applies fully qualified labels to matching web requests. A fully qualified label is
       * the concatenation of a label namespace and a rule label. The rule's rule group or web ACL
       * defines the label namespace.
       *
       * Rules that run after this rule in the web ACL can match against these labels using a
       * `LabelMatchStatement` .
       *
       * For each label, provide a case-sensitive string containing optional namespaces and a label
       * name, according to the following guidelines:
       *
       * * Separate each component of the label with a colon.
       * * Each namespace or name can have up to 128 characters.
       * * You can specify up to 5 namespaces in a label.
       * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
       * `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
       *
       * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-rulelabels)
       */
      override fun ruleLabels(): Any? = unwrap(this).getRuleLabels()

      /**
       * The AWS WAF processing statement for the rule, for example `ByteMatchStatement` or
       * `SizeConstraintStatement` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-statement)
       */
      override fun statement(): Any = unwrap(this).getStatement()

      /**
       * Defines and enables Amazon CloudWatch metrics and web request sample collection.
       *
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name as well. AWS WAF doesn't automatically update
       * the metric name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-visibilityconfig)
       */
      override fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GeoMatchStatementProperty {
    /**
     * An array of two-character country codes that you want to match against, for example, `[ "US",
     * "CN" ]` , from the alpha-2 country ISO codes of the ISO 3166 international standard.
     *
     * When you use a geo match statement just for the region and country labels that it adds to
     * requests, you still have to supply a country code for the rule to evaluate. In this case, you
     * configure the rule to only count matching requests, but it will still generate logging and count
     * metrics for any matches. You can reduce the logging and metrics that the rule produces by
     * specifying a country that's unlikely to be a source of traffic to your site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-geomatchstatement.html#cfn-wafv2-rulegroup-geomatchstatement-countrycodes)
     */
    public fun countryCodes(): List<String> = unwrap(this).getCountryCodes() ?: emptyList()

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of
     * using the IP address that's reported by the web request origin.
     *
     * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
     *
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-geomatchstatement.html#cfn-wafv2-rulegroup-geomatchstatement-forwardedipconfig)
     */
    public fun forwardedIpConfig(): Any? = unwrap(this).getForwardedIpConfig()

    /**
     * A builder for [GeoMatchStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param countryCodes An array of two-character country codes that you want to match against,
       * for example, `[ "US", "CN" ]` , from the alpha-2 country ISO codes of the ISO 3166
       * international standard.
       * When you use a geo match statement just for the region and country labels that it adds to
       * requests, you still have to supply a country code for the rule to evaluate. In this case, you
       * configure the rule to only count matching requests, but it will still generate logging and
       * count metrics for any matches. You can reduce the logging and metrics that the rule produces
       * by specifying a country that's unlikely to be a source of traffic to your site.
       */
      public fun countryCodes(countryCodes: List<String>)

      /**
       * @param countryCodes An array of two-character country codes that you want to match against,
       * for example, `[ "US", "CN" ]` , from the alpha-2 country ISO codes of the ISO 3166
       * international standard.
       * When you use a geo match statement just for the region and country labels that it adds to
       * requests, you still have to supply a country code for the rule to evaluate. In this case, you
       * configure the rule to only count matching requests, but it will still generate logging and
       * count metrics for any matches. You can reduce the logging and metrics that the rule produces
       * by specifying a country that's unlikely to be a source of traffic to your site.
       */
      public fun countryCodes(vararg countryCodes: String)

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      public fun forwardedIpConfig(forwardedIpConfig: IResolvable)

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      public fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty)

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a4f29dbbb3946321469421b45c2a51aceb555245d5013a1734684891b20097c")
      public
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty.builder()

      /**
       * @param countryCodes An array of two-character country codes that you want to match against,
       * for example, `[ "US", "CN" ]` , from the alpha-2 country ISO codes of the ISO 3166
       * international standard.
       * When you use a geo match statement just for the region and country labels that it adds to
       * requests, you still have to supply a country code for the rule to evaluate. In this case, you
       * configure the rule to only count matching requests, but it will still generate logging and
       * count metrics for any matches. You can reduce the logging and metrics that the rule produces
       * by specifying a country that's unlikely to be a source of traffic to your site.
       */
      override fun countryCodes(countryCodes: List<String>) {
        cdkBuilder.countryCodes(countryCodes)
      }

      /**
       * @param countryCodes An array of two-character country codes that you want to match against,
       * for example, `[ "US", "CN" ]` , from the alpha-2 country ISO codes of the ISO 3166
       * international standard.
       * When you use a geo match statement just for the region and country labels that it adds to
       * requests, you still have to supply a country code for the rule to evaluate. In this case, you
       * configure the rule to only count matching requests, but it will still generate logging and
       * count metrics for any matches. You can reduce the logging and metrics that the rule produces
       * by specifying a country that's unlikely to be a source of traffic to your site.
       */
      override fun countryCodes(vararg countryCodes: String): Unit =
          countryCodes(countryCodes.toList())

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      override fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(IResolvable::unwrap))
      }

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      override fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(ForwardedIPConfigurationProperty::unwrap))
      }

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a4f29dbbb3946321469421b45c2a51aceb555245d5013a1734684891b20097c")
      override
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit):
          Unit = forwardedIpConfig(ForwardedIPConfigurationProperty(forwardedIpConfig))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty,
    ) : GeoMatchStatementProperty {
      /**
       * An array of two-character country codes that you want to match against, for example, `[
       * "US", "CN" ]` , from the alpha-2 country ISO codes of the ISO 3166 international standard.
       *
       * When you use a geo match statement just for the region and country labels that it adds to
       * requests, you still have to supply a country code for the rule to evaluate. In this case, you
       * configure the rule to only count matching requests, but it will still generate logging and
       * count metrics for any matches. You can reduce the logging and metrics that the rule produces
       * by specifying a country that's unlikely to be a source of traffic to your site.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-geomatchstatement.html#cfn-wafv2-rulegroup-geomatchstatement-countrycodes)
       */
      override fun countryCodes(): List<String> = unwrap(this).getCountryCodes() ?: emptyList()

      /**
       * The configuration for inspecting IP addresses in an HTTP header that you specify, instead
       * of using the IP address that's reported by the web request origin.
       *
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-geomatchstatement.html#cfn-wafv2-rulegroup-geomatchstatement-forwardedipconfig)
       */
      override fun forwardedIpConfig(): Any? = unwrap(this).getForwardedIpConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GeoMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty):
          GeoMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CookieMatchPatternProperty {
    /**
     * Inspect all cookies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookiematchpattern.html#cfn-wafv2-rulegroup-cookiematchpattern-all)
     */
    public fun all(): Any? = unwrap(this).getAll()

    /**
     * Inspect only the cookies whose keys don't match any of the strings specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookiematchpattern.html#cfn-wafv2-rulegroup-cookiematchpattern-excludedcookies)
     */
    public fun excludedCookies(): List<String> = unwrap(this).getExcludedCookies() ?: emptyList()

    /**
     * Inspect only the cookies that have a key that matches one of the strings specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookiematchpattern.html#cfn-wafv2-rulegroup-cookiematchpattern-includedcookies)
     */
    public fun includedCookies(): List<String> = unwrap(this).getIncludedCookies() ?: emptyList()

    /**
     * A builder for [CookieMatchPatternProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param all Inspect all cookies.
       */
      public fun all(all: Any)

      /**
       * @param excludedCookies Inspect only the cookies whose keys don't match any of the strings
       * specified here.
       */
      public fun excludedCookies(excludedCookies: List<String>)

      /**
       * @param excludedCookies Inspect only the cookies whose keys don't match any of the strings
       * specified here.
       */
      public fun excludedCookies(vararg excludedCookies: String)

      /**
       * @param includedCookies Inspect only the cookies that have a key that matches one of the
       * strings specified here.
       */
      public fun includedCookies(includedCookies: List<String>)

      /**
       * @param includedCookies Inspect only the cookies that have a key that matches one of the
       * strings specified here.
       */
      public fun includedCookies(vararg includedCookies: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty.builder()

      /**
       * @param all Inspect all cookies.
       */
      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      /**
       * @param excludedCookies Inspect only the cookies whose keys don't match any of the strings
       * specified here.
       */
      override fun excludedCookies(excludedCookies: List<String>) {
        cdkBuilder.excludedCookies(excludedCookies)
      }

      /**
       * @param excludedCookies Inspect only the cookies whose keys don't match any of the strings
       * specified here.
       */
      override fun excludedCookies(vararg excludedCookies: String): Unit =
          excludedCookies(excludedCookies.toList())

      /**
       * @param includedCookies Inspect only the cookies that have a key that matches one of the
       * strings specified here.
       */
      override fun includedCookies(includedCookies: List<String>) {
        cdkBuilder.includedCookies(includedCookies)
      }

      /**
       * @param includedCookies Inspect only the cookies that have a key that matches one of the
       * strings specified here.
       */
      override fun includedCookies(vararg includedCookies: String): Unit =
          includedCookies(includedCookies.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty,
    ) : CookieMatchPatternProperty {
      /**
       * Inspect all cookies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookiematchpattern.html#cfn-wafv2-rulegroup-cookiematchpattern-all)
       */
      override fun all(): Any? = unwrap(this).getAll()

      /**
       * Inspect only the cookies whose keys don't match any of the strings specified here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookiematchpattern.html#cfn-wafv2-rulegroup-cookiematchpattern-excludedcookies)
       */
      override fun excludedCookies(): List<String> = unwrap(this).getExcludedCookies() ?:
          emptyList()

      /**
       * Inspect only the cookies that have a key that matches one of the strings specified here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookiematchpattern.html#cfn-wafv2-rulegroup-cookiematchpattern-includedcookies)
       */
      override fun includedCookies(): List<String> = unwrap(this).getIncludedCookies() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CookieMatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty):
          CookieMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookieMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookieMatchPatternProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SizeConstraintStatementProperty {
    /**
     * The operator to use to compare the request part to the size setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html#cfn-wafv2-rulegroup-sizeconstraintstatement-comparisonoperator)
     */
    public fun comparisonOperator(): String

    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html#cfn-wafv2-rulegroup-sizeconstraintstatement-fieldtomatch)
     */
    public fun fieldToMatch(): Any

    /**
     * The size, in byte, to compare to the request part, after any transformations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html#cfn-wafv2-rulegroup-sizeconstraintstatement-size)
     */
    public fun size(): Number

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by `FieldToMatch` , starting
     * from the lowest priority setting, before inspecting the content for a match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html#cfn-wafv2-rulegroup-sizeconstraintstatement-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [SizeConstraintStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator The operator to use to compare the request part to the size
       * setting. 
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: IResolvable)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6d1490d529bfb0d803940d5fa42f7fbb88c77728c7e36dd75b0e48a28bd3c86")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      /**
       * @param size The size, in byte, to compare to the request part, after any transformations. 
       */
      public fun size(size: Number)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty.builder()

      /**
       * @param comparisonOperator The operator to use to compare the request part to the size
       * setting. 
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6d1490d529bfb0d803940d5fa42f7fbb88c77728c7e36dd75b0e48a28bd3c86")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      /**
       * @param size The size, in byte, to compare to the request part, after any transformations. 
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty,
    ) : SizeConstraintStatementProperty {
      /**
       * The operator to use to compare the request part to the size setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html#cfn-wafv2-rulegroup-sizeconstraintstatement-comparisonoperator)
       */
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html#cfn-wafv2-rulegroup-sizeconstraintstatement-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      /**
       * The size, in byte, to compare to the request part, after any transformations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html#cfn-wafv2-rulegroup-sizeconstraintstatement-size)
       */
      override fun size(): Number = unwrap(this).getSize()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html#cfn-wafv2-rulegroup-sizeconstraintstatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SizeConstraintStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty):
          SizeConstraintStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SizeConstraintStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldToMatchProperty {
    /**
     * Inspect all query arguments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-allqueryarguments)
     */
    public fun allQueryArguments(): Any? = unwrap(this).getAllQueryArguments()

    /**
     * Inspect the request body as plain text.
     *
     * The request body immediately follows the request headers. This is the part of a request that
     * contains any additional data that you want to send to your web server as the HTTP request body,
     * such as data from a form.
     *
     * A limited amount of the request body is forwarded to AWS WAF for inspection by the underlying
     * host service. For regional resources, the limit is 8 KB (8,192 bytes) and for CloudFront
     * distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you can increase
     * the limit in the web ACL's `AssociationConfig` , for additional processing fees.
     *
     * For information about how to handle oversized request bodies, see the `Body` object
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-body)
     */
    public fun body(): Any? = unwrap(this).getBody()

    /**
     * Inspect the request cookies.
     *
     * You must configure scope and pattern matching filters in the `Cookies` object, to define the
     * set of cookies and the parts of the cookies that AWS WAF inspects.
     *
     * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are
     * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
     * handle any oversize cookie content in the `Cookies` object. AWS WAF applies the pattern matching
     * filters to the cookies that it receives from the underlying host service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-cookies)
     */
    public fun cookies(): Any? = unwrap(this).getCookies()

    /**
     * Inspect the request headers.
     *
     * You must configure scope and pattern matching filters in the `Headers` object, to define the
     * set of headers to and the parts of the headers that AWS WAF inspects.
     *
     * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are
     * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
     * handle any oversize header content in the `Headers` object. AWS WAF applies the pattern matching
     * filters to the headers that it receives from the underlying host service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-headers)
     */
    public fun headers(): Any? = unwrap(this).getHeaders()

    /**
     * Inspect the request body as JSON.
     *
     * The request body immediately follows the request headers. This is the part of a request that
     * contains any additional data that you want to send to your web server as the HTTP request body,
     * such as data from a form.
     *
     * A limited amount of the request body is forwarded to AWS WAF for inspection by the underlying
     * host service. For regional resources, the limit is 8 KB (8,192 bytes) and for CloudFront
     * distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you can increase
     * the limit in the web ACL's `AssociationConfig` , for additional processing fees.
     *
     * For information about how to handle oversized request bodies, see the `JsonBody` object
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-jsonbody)
     */
    public fun jsonBody(): Any? = unwrap(this).getJsonBody()

    /**
     * Inspect the HTTP method.
     *
     * The method indicates the type of operation that the request is asking the origin to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-method)
     */
    public fun method(): Any? = unwrap(this).getMethod()

    /**
     * Inspect the query string.
     *
     * This is the part of a URL that appears after a `?` character, if any.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-querystring)
     */
    public fun queryString(): Any? = unwrap(this).getQueryString()

    /**
     * Inspect a single header.
     *
     * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
     * setting isn't case sensitive.
     *
     * Example JSON: `"SingleHeader": { "Name": "haystack" }`
     *
     * Alternately, you can filter and inspect all headers with the `Headers` `FieldToMatch`
     * setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singleheader)
     */
    public fun singleHeader(): Any? = unwrap(this).getSingleHeader()

    /**
     * Inspect a single query argument.
     *
     * Provide the name of the query argument to inspect, such as *UserName* or *SalesRegion* . The
     * name can be up to 30 characters long and isn't case sensitive.
     *
     * Example JSON: `"SingleQueryArgument": { "Name": "myArgument" }`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singlequeryargument)
     */
    public fun singleQueryArgument(): Any? = unwrap(this).getSingleQueryArgument()

    /**
     * Inspect the request URI path.
     *
     * This is the part of the web request that identifies a resource, for example,
     * `/images/daily-ad.jpg` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-uripath)
     */
    public fun uriPath(): Any? = unwrap(this).getUriPath()

    /**
     * A builder for [FieldToMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allQueryArguments Inspect all query arguments.
       */
      public fun allQueryArguments(allQueryArguments: Any)

      /**
       * @param body Inspect the request body as plain text.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `Body` object
       * configuration.
       */
      public fun body(body: IResolvable)

      /**
       * @param body Inspect the request body as plain text.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `Body` object
       * configuration.
       */
      public fun body(body: BodyProperty)

      /**
       * @param body Inspect the request body as plain text.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `Body` object
       * configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79864400e90dbcd5de51d6f4db3e7ed861fc5cbcb9b6c0fcfc44129431036578")
      public fun body(body: BodyProperty.Builder.() -> Unit)

      /**
       * @param cookies Inspect the request cookies.
       * You must configure scope and pattern matching filters in the `Cookies` object, to define
       * the set of cookies and the parts of the cookies that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize cookie content in the `Cookies` object. AWS WAF applies the pattern
       * matching filters to the cookies that it receives from the underlying host service.
       */
      public fun cookies(cookies: IResolvable)

      /**
       * @param cookies Inspect the request cookies.
       * You must configure scope and pattern matching filters in the `Cookies` object, to define
       * the set of cookies and the parts of the cookies that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize cookie content in the `Cookies` object. AWS WAF applies the pattern
       * matching filters to the cookies that it receives from the underlying host service.
       */
      public fun cookies(cookies: CookiesProperty)

      /**
       * @param cookies Inspect the request cookies.
       * You must configure scope and pattern matching filters in the `Cookies` object, to define
       * the set of cookies and the parts of the cookies that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize cookie content in the `Cookies` object. AWS WAF applies the pattern
       * matching filters to the cookies that it receives from the underlying host service.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ead24464c68e8c25d8b85ad2a797c5308d8909f0ff70571cdcbbcd0e032d2a1")
      public fun cookies(cookies: CookiesProperty.Builder.() -> Unit)

      /**
       * @param headers Inspect the request headers.
       * You must configure scope and pattern matching filters in the `Headers` object, to define
       * the set of headers to and the parts of the headers that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize header content in the `Headers` object. AWS WAF applies the pattern
       * matching filters to the headers that it receives from the underlying host service.
       */
      public fun headers(headers: IResolvable)

      /**
       * @param headers Inspect the request headers.
       * You must configure scope and pattern matching filters in the `Headers` object, to define
       * the set of headers to and the parts of the headers that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize header content in the `Headers` object. AWS WAF applies the pattern
       * matching filters to the headers that it receives from the underlying host service.
       */
      public fun headers(headers: HeadersProperty)

      /**
       * @param headers Inspect the request headers.
       * You must configure scope and pattern matching filters in the `Headers` object, to define
       * the set of headers to and the parts of the headers that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize header content in the `Headers` object. AWS WAF applies the pattern
       * matching filters to the headers that it receives from the underlying host service.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fff74242ecdf7074ecb24424c8d763c2aec2072774004f540d2b2f241e767101")
      public fun headers(headers: HeadersProperty.Builder.() -> Unit)

      /**
       * @param jsonBody Inspect the request body as JSON.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `JsonBody` object
       * configuration.
       */
      public fun jsonBody(jsonBody: IResolvable)

      /**
       * @param jsonBody Inspect the request body as JSON.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `JsonBody` object
       * configuration.
       */
      public fun jsonBody(jsonBody: JsonBodyProperty)

      /**
       * @param jsonBody Inspect the request body as JSON.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `JsonBody` object
       * configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("909fe9a4a46334fd962c7f7a77d29a600004873f56cb7532bda93905171693f4")
      public fun jsonBody(jsonBody: JsonBodyProperty.Builder.() -> Unit)

      /**
       * @param method Inspect the HTTP method.
       * The method indicates the type of operation that the request is asking the origin to
       * perform.
       */
      public fun method(method: Any)

      /**
       * @param queryString Inspect the query string.
       * This is the part of a URL that appears after a `?` character, if any.
       */
      public fun queryString(queryString: Any)

      /**
       * @param singleHeader Inspect a single header.
       * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
       * setting isn't case sensitive.
       *
       * Example JSON: `"SingleHeader": { "Name": "haystack" }`
       *
       * Alternately, you can filter and inspect all headers with the `Headers` `FieldToMatch`
       * setting.
       */
      public fun singleHeader(singleHeader: Any)

      /**
       * @param singleQueryArgument Inspect a single query argument.
       * Provide the name of the query argument to inspect, such as *UserName* or *SalesRegion* .
       * The name can be up to 30 characters long and isn't case sensitive.
       *
       * Example JSON: `"SingleQueryArgument": { "Name": "myArgument" }`
       */
      public fun singleQueryArgument(singleQueryArgument: Any)

      /**
       * @param uriPath Inspect the request URI path.
       * This is the part of the web request that identifies a resource, for example,
       * `/images/daily-ad.jpg` .
       */
      public fun uriPath(uriPath: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty.builder()

      /**
       * @param allQueryArguments Inspect all query arguments.
       */
      override fun allQueryArguments(allQueryArguments: Any) {
        cdkBuilder.allQueryArguments(allQueryArguments)
      }

      /**
       * @param body Inspect the request body as plain text.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `Body` object
       * configuration.
       */
      override fun body(body: IResolvable) {
        cdkBuilder.body(body.let(IResolvable::unwrap))
      }

      /**
       * @param body Inspect the request body as plain text.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `Body` object
       * configuration.
       */
      override fun body(body: BodyProperty) {
        cdkBuilder.body(body.let(BodyProperty::unwrap))
      }

      /**
       * @param body Inspect the request body as plain text.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `Body` object
       * configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79864400e90dbcd5de51d6f4db3e7ed861fc5cbcb9b6c0fcfc44129431036578")
      override fun body(body: BodyProperty.Builder.() -> Unit): Unit = body(BodyProperty(body))

      /**
       * @param cookies Inspect the request cookies.
       * You must configure scope and pattern matching filters in the `Cookies` object, to define
       * the set of cookies and the parts of the cookies that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize cookie content in the `Cookies` object. AWS WAF applies the pattern
       * matching filters to the cookies that it receives from the underlying host service.
       */
      override fun cookies(cookies: IResolvable) {
        cdkBuilder.cookies(cookies.let(IResolvable::unwrap))
      }

      /**
       * @param cookies Inspect the request cookies.
       * You must configure scope and pattern matching filters in the `Cookies` object, to define
       * the set of cookies and the parts of the cookies that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize cookie content in the `Cookies` object. AWS WAF applies the pattern
       * matching filters to the cookies that it receives from the underlying host service.
       */
      override fun cookies(cookies: CookiesProperty) {
        cdkBuilder.cookies(cookies.let(CookiesProperty::unwrap))
      }

      /**
       * @param cookies Inspect the request cookies.
       * You must configure scope and pattern matching filters in the `Cookies` object, to define
       * the set of cookies and the parts of the cookies that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize cookie content in the `Cookies` object. AWS WAF applies the pattern
       * matching filters to the cookies that it receives from the underlying host service.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ead24464c68e8c25d8b85ad2a797c5308d8909f0ff70571cdcbbcd0e032d2a1")
      override fun cookies(cookies: CookiesProperty.Builder.() -> Unit): Unit =
          cookies(CookiesProperty(cookies))

      /**
       * @param headers Inspect the request headers.
       * You must configure scope and pattern matching filters in the `Headers` object, to define
       * the set of headers to and the parts of the headers that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize header content in the `Headers` object. AWS WAF applies the pattern
       * matching filters to the headers that it receives from the underlying host service.
       */
      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      /**
       * @param headers Inspect the request headers.
       * You must configure scope and pattern matching filters in the `Headers` object, to define
       * the set of headers to and the parts of the headers that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize header content in the `Headers` object. AWS WAF applies the pattern
       * matching filters to the headers that it receives from the underlying host service.
       */
      override fun headers(headers: HeadersProperty) {
        cdkBuilder.headers(headers.let(HeadersProperty::unwrap))
      }

      /**
       * @param headers Inspect the request headers.
       * You must configure scope and pattern matching filters in the `Headers` object, to define
       * the set of headers to and the parts of the headers that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize header content in the `Headers` object. AWS WAF applies the pattern
       * matching filters to the headers that it receives from the underlying host service.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fff74242ecdf7074ecb24424c8d763c2aec2072774004f540d2b2f241e767101")
      override fun headers(headers: HeadersProperty.Builder.() -> Unit): Unit =
          headers(HeadersProperty(headers))

      /**
       * @param jsonBody Inspect the request body as JSON.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `JsonBody` object
       * configuration.
       */
      override fun jsonBody(jsonBody: IResolvable) {
        cdkBuilder.jsonBody(jsonBody.let(IResolvable::unwrap))
      }

      /**
       * @param jsonBody Inspect the request body as JSON.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `JsonBody` object
       * configuration.
       */
      override fun jsonBody(jsonBody: JsonBodyProperty) {
        cdkBuilder.jsonBody(jsonBody.let(JsonBodyProperty::unwrap))
      }

      /**
       * @param jsonBody Inspect the request body as JSON.
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `JsonBody` object
       * configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("909fe9a4a46334fd962c7f7a77d29a600004873f56cb7532bda93905171693f4")
      override fun jsonBody(jsonBody: JsonBodyProperty.Builder.() -> Unit): Unit =
          jsonBody(JsonBodyProperty(jsonBody))

      /**
       * @param method Inspect the HTTP method.
       * The method indicates the type of operation that the request is asking the origin to
       * perform.
       */
      override fun method(method: Any) {
        cdkBuilder.method(method)
      }

      /**
       * @param queryString Inspect the query string.
       * This is the part of a URL that appears after a `?` character, if any.
       */
      override fun queryString(queryString: Any) {
        cdkBuilder.queryString(queryString)
      }

      /**
       * @param singleHeader Inspect a single header.
       * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
       * setting isn't case sensitive.
       *
       * Example JSON: `"SingleHeader": { "Name": "haystack" }`
       *
       * Alternately, you can filter and inspect all headers with the `Headers` `FieldToMatch`
       * setting.
       */
      override fun singleHeader(singleHeader: Any) {
        cdkBuilder.singleHeader(singleHeader)
      }

      /**
       * @param singleQueryArgument Inspect a single query argument.
       * Provide the name of the query argument to inspect, such as *UserName* or *SalesRegion* .
       * The name can be up to 30 characters long and isn't case sensitive.
       *
       * Example JSON: `"SingleQueryArgument": { "Name": "myArgument" }`
       */
      override fun singleQueryArgument(singleQueryArgument: Any) {
        cdkBuilder.singleQueryArgument(singleQueryArgument)
      }

      /**
       * @param uriPath Inspect the request URI path.
       * This is the part of the web request that identifies a resource, for example,
       * `/images/daily-ad.jpg` .
       */
      override fun uriPath(uriPath: Any) {
        cdkBuilder.uriPath(uriPath)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty,
    ) : FieldToMatchProperty {
      /**
       * Inspect all query arguments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-allqueryarguments)
       */
      override fun allQueryArguments(): Any? = unwrap(this).getAllQueryArguments()

      /**
       * Inspect the request body as plain text.
       *
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `Body` object
       * configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-body)
       */
      override fun body(): Any? = unwrap(this).getBody()

      /**
       * Inspect the request cookies.
       *
       * You must configure scope and pattern matching filters in the `Cookies` object, to define
       * the set of cookies and the parts of the cookies that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize cookie content in the `Cookies` object. AWS WAF applies the pattern
       * matching filters to the cookies that it receives from the underlying host service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-cookies)
       */
      override fun cookies(): Any? = unwrap(this).getCookies()

      /**
       * Inspect the request headers.
       *
       * You must configure scope and pattern matching filters in the `Headers` object, to define
       * the set of headers to and the parts of the headers that AWS WAF inspects.
       *
       * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are
       * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
       * handle any oversize header content in the `Headers` object. AWS WAF applies the pattern
       * matching filters to the headers that it receives from the underlying host service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-headers)
       */
      override fun headers(): Any? = unwrap(this).getHeaders()

      /**
       * Inspect the request body as JSON.
       *
       * The request body immediately follows the request headers. This is the part of a request
       * that contains any additional data that you want to send to your web server as the HTTP request
       * body, such as data from a form.
       *
       * A limited amount of the request body is forwarded to AWS WAF for inspection by the
       * underlying host service. For regional resources, the limit is 8 KB (8,192 bytes) and for
       * CloudFront distributions, the limit is 16 KB (16,384 bytes). For CloudFront distributions, you
       * can increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
       *
       * For information about how to handle oversized request bodies, see the `JsonBody` object
       * configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-jsonbody)
       */
      override fun jsonBody(): Any? = unwrap(this).getJsonBody()

      /**
       * Inspect the HTTP method.
       *
       * The method indicates the type of operation that the request is asking the origin to
       * perform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-method)
       */
      override fun method(): Any? = unwrap(this).getMethod()

      /**
       * Inspect the query string.
       *
       * This is the part of a URL that appears after a `?` character, if any.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-querystring)
       */
      override fun queryString(): Any? = unwrap(this).getQueryString()

      /**
       * Inspect a single header.
       *
       * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
       * setting isn't case sensitive.
       *
       * Example JSON: `"SingleHeader": { "Name": "haystack" }`
       *
       * Alternately, you can filter and inspect all headers with the `Headers` `FieldToMatch`
       * setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singleheader)
       */
      override fun singleHeader(): Any? = unwrap(this).getSingleHeader()

      /**
       * Inspect a single query argument.
       *
       * Provide the name of the query argument to inspect, such as *UserName* or *SalesRegion* .
       * The name can be up to 30 characters long and isn't case sensitive.
       *
       * Example JSON: `"SingleQueryArgument": { "Name": "myArgument" }`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singlequeryargument)
       */
      override fun singleQueryArgument(): Any? = unwrap(this).getSingleQueryArgument()

      /**
       * Inspect the request URI path.
       *
       * This is the part of the web request that identifies a resource, for example,
       * `/images/daily-ad.jpg` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-uripath)
       */
      override fun uriPath(): Any? = unwrap(this).getUriPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LabelMatchStatementProperty {
    /**
     * The string to match against. The setting you provide for this depends on the match
     * statement's `Scope` setting:.
     *
     * * If the `Scope` indicates `LABEL` , then this specification must include the name and can
     * include any number of preceding namespace specifications and prefix up to providing the fully
     * qualified label name.
     * * If the `Scope` indicates `NAMESPACE` , then this specification can include any number of
     * contiguous namespace strings, and can include the entire label namespace prefix from the rule
     * group or web ACL where the label originates.
     *
     * Labels are case sensitive and components of a label must be separated by colon, for example
     * `NS1:NS2:name` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-labelmatchstatement.html#cfn-wafv2-rulegroup-labelmatchstatement-key)
     */
    public fun key(): String

    /**
     * Specify whether you want to match using the label name or just the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-labelmatchstatement.html#cfn-wafv2-rulegroup-labelmatchstatement-scope)
     */
    public fun scope(): String

    /**
     * A builder for [LabelMatchStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The string to match against. The setting you provide for this depends on the
       * match statement's `Scope` setting:. 
       * * If the `Scope` indicates `LABEL` , then this specification must include the name and can
       * include any number of preceding namespace specifications and prefix up to providing the fully
       * qualified label name.
       * * If the `Scope` indicates `NAMESPACE` , then this specification can include any number of
       * contiguous namespace strings, and can include the entire label namespace prefix from the rule
       * group or web ACL where the label originates.
       *
       * Labels are case sensitive and components of a label must be separated by colon, for example
       * `NS1:NS2:name` .
       */
      public fun key(key: String)

      /**
       * @param scope Specify whether you want to match using the label name or just the namespace. 
       */
      public fun scope(scope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty.builder()

      /**
       * @param key The string to match against. The setting you provide for this depends on the
       * match statement's `Scope` setting:. 
       * * If the `Scope` indicates `LABEL` , then this specification must include the name and can
       * include any number of preceding namespace specifications and prefix up to providing the fully
       * qualified label name.
       * * If the `Scope` indicates `NAMESPACE` , then this specification can include any number of
       * contiguous namespace strings, and can include the entire label namespace prefix from the rule
       * group or web ACL where the label originates.
       *
       * Labels are case sensitive and components of a label must be separated by colon, for example
       * `NS1:NS2:name` .
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param scope Specify whether you want to match using the label name or just the namespace. 
       */
      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty,
    ) : LabelMatchStatementProperty {
      /**
       * The string to match against. The setting you provide for this depends on the match
       * statement's `Scope` setting:.
       *
       * * If the `Scope` indicates `LABEL` , then this specification must include the name and can
       * include any number of preceding namespace specifications and prefix up to providing the fully
       * qualified label name.
       * * If the `Scope` indicates `NAMESPACE` , then this specification can include any number of
       * contiguous namespace strings, and can include the entire label namespace prefix from the rule
       * group or web ACL where the label originates.
       *
       * Labels are case sensitive and components of a label must be separated by colon, for example
       * `NS1:NS2:name` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-labelmatchstatement.html#cfn-wafv2-rulegroup-labelmatchstatement-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * Specify whether you want to match using the label name or just the namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-labelmatchstatement.html#cfn-wafv2-rulegroup-labelmatchstatement-scope)
       */
      override fun scope(): String = unwrap(this).getScope()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty):
          LabelMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NotStatementProperty {
    /**
     * The statement to negate.
     *
     * You can use any statement that can be nested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-notstatement.html#cfn-wafv2-rulegroup-notstatement-statement)
     */
    public fun statement(): Any

    /**
     * A builder for [NotStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param statement The statement to negate. 
       * You can use any statement that can be nested.
       */
      public fun statement(statement: IResolvable)

      /**
       * @param statement The statement to negate. 
       * You can use any statement that can be nested.
       */
      public fun statement(statement: StatementProperty)

      /**
       * @param statement The statement to negate. 
       * You can use any statement that can be nested.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f5c555ee8c440d36600a410097192dd6e85ac534995d25faeebf55d6e22dbc5")
      public fun statement(statement: StatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty.builder()

      /**
       * @param statement The statement to negate. 
       * You can use any statement that can be nested.
       */
      override fun statement(statement: IResolvable) {
        cdkBuilder.statement(statement.let(IResolvable::unwrap))
      }

      /**
       * @param statement The statement to negate. 
       * You can use any statement that can be nested.
       */
      override fun statement(statement: StatementProperty) {
        cdkBuilder.statement(statement.let(StatementProperty::unwrap))
      }

      /**
       * @param statement The statement to negate. 
       * You can use any statement that can be nested.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f5c555ee8c440d36600a410097192dd6e85ac534995d25faeebf55d6e22dbc5")
      override fun statement(statement: StatementProperty.Builder.() -> Unit): Unit =
          statement(StatementProperty(statement))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty,
    ) : NotStatementProperty {
      /**
       * The statement to negate.
       *
       * You can use any statement that can be nested.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-notstatement.html#cfn-wafv2-rulegroup-notstatement-statement)
       */
      override fun statement(): Any = unwrap(this).getStatement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty):
          NotStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VisibilityConfigProperty {
    /**
     * Indicates whether the associated resource sends metrics to Amazon CloudWatch.
     *
     * For the list of available metrics, see [AWS WAF
     * Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics)
     * in the *AWS WAF Developer Guide* .
     *
     * For web ACLs, the metrics are for web requests that have the web ACL default action applied.
     * AWS WAF applies the default action to web requests that pass the inspection of all rules in the
     * web ACL without being either allowed or blocked. For more information,
     * see [The web ACL default
     * action](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-default-action.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-cloudwatchmetricsenabled)
     */
    public fun cloudWatchMetricsEnabled(): Any

    /**
     * A name of the Amazon CloudWatch metric dimension.
     *
     * The name can contain only the characters: A-Z, a-z, 0-9, - (hyphen), and _ (underscore). The
     * name can be from one to 128 characters long. It can't contain whitespace or metric names that
     * are reserved for AWS WAF , for example `All` and `Default_Action` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-metricname)
     */
    public fun metricName(): String

    /**
     * Indicates whether AWS WAF should store a sampling of the web requests that match the rules.
     *
     * You can view the sampled requests through the AWS WAF console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-sampledrequestsenabled)
     */
    public fun sampledRequestsEnabled(): Any

    /**
     * A builder for [VisibilityConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchMetricsEnabled Indicates whether the associated resource sends metrics to
       * Amazon CloudWatch. 
       * For the list of available metrics, see [AWS WAF
       * Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics)
       * in the *AWS WAF Developer Guide* .
       *
       * For web ACLs, the metrics are for web requests that have the web ACL default action
       * applied. AWS WAF applies the default action to web requests that pass the inspection of all
       * rules in the web ACL without being either allowed or blocked. For more information,
       * see [The web ACL default
       * action](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-default-action.html) in
       * the *AWS WAF Developer Guide* .
       */
      public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean)

      /**
       * @param cloudWatchMetricsEnabled Indicates whether the associated resource sends metrics to
       * Amazon CloudWatch. 
       * For the list of available metrics, see [AWS WAF
       * Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics)
       * in the *AWS WAF Developer Guide* .
       *
       * For web ACLs, the metrics are for web requests that have the web ACL default action
       * applied. AWS WAF applies the default action to web requests that pass the inspection of all
       * rules in the web ACL without being either allowed or blocked. For more information,
       * see [The web ACL default
       * action](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-default-action.html) in
       * the *AWS WAF Developer Guide* .
       */
      public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable)

      /**
       * @param metricName A name of the Amazon CloudWatch metric dimension. 
       * The name can contain only the characters: A-Z, a-z, 0-9, - (hyphen), and _ (underscore).
       * The name can be from one to 128 characters long. It can't contain whitespace or metric names
       * that are reserved for AWS WAF , for example `All` and `Default_Action` .
       */
      public fun metricName(metricName: String)

      /**
       * @param sampledRequestsEnabled Indicates whether AWS WAF should store a sampling of the web
       * requests that match the rules. 
       * You can view the sampled requests through the AWS WAF console.
       */
      public fun sampledRequestsEnabled(sampledRequestsEnabled: Boolean)

      /**
       * @param sampledRequestsEnabled Indicates whether AWS WAF should store a sampling of the web
       * requests that match the rules. 
       * You can view the sampled requests through the AWS WAF console.
       */
      public fun sampledRequestsEnabled(sampledRequestsEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty.builder()

      /**
       * @param cloudWatchMetricsEnabled Indicates whether the associated resource sends metrics to
       * Amazon CloudWatch. 
       * For the list of available metrics, see [AWS WAF
       * Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics)
       * in the *AWS WAF Developer Guide* .
       *
       * For web ACLs, the metrics are for web requests that have the web ACL default action
       * applied. AWS WAF applies the default action to web requests that pass the inspection of all
       * rules in the web ACL without being either allowed or blocked. For more information,
       * see [The web ACL default
       * action](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-default-action.html) in
       * the *AWS WAF Developer Guide* .
       */
      override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
      }

      /**
       * @param cloudWatchMetricsEnabled Indicates whether the associated resource sends metrics to
       * Amazon CloudWatch. 
       * For the list of available metrics, see [AWS WAF
       * Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics)
       * in the *AWS WAF Developer Guide* .
       *
       * For web ACLs, the metrics are for web requests that have the web ACL default action
       * applied. AWS WAF applies the default action to web requests that pass the inspection of all
       * rules in the web ACL without being either allowed or blocked. For more information,
       * see [The web ACL default
       * action](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-default-action.html) in
       * the *AWS WAF Developer Guide* .
       */
      override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param metricName A name of the Amazon CloudWatch metric dimension. 
       * The name can contain only the characters: A-Z, a-z, 0-9, - (hyphen), and _ (underscore).
       * The name can be from one to 128 characters long. It can't contain whitespace or metric names
       * that are reserved for AWS WAF , for example `All` and `Default_Action` .
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param sampledRequestsEnabled Indicates whether AWS WAF should store a sampling of the web
       * requests that match the rules. 
       * You can view the sampled requests through the AWS WAF console.
       */
      override fun sampledRequestsEnabled(sampledRequestsEnabled: Boolean) {
        cdkBuilder.sampledRequestsEnabled(sampledRequestsEnabled)
      }

      /**
       * @param sampledRequestsEnabled Indicates whether AWS WAF should store a sampling of the web
       * requests that match the rules. 
       * You can view the sampled requests through the AWS WAF console.
       */
      override fun sampledRequestsEnabled(sampledRequestsEnabled: IResolvable) {
        cdkBuilder.sampledRequestsEnabled(sampledRequestsEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty,
    ) : VisibilityConfigProperty {
      /**
       * Indicates whether the associated resource sends metrics to Amazon CloudWatch.
       *
       * For the list of available metrics, see [AWS WAF
       * Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics)
       * in the *AWS WAF Developer Guide* .
       *
       * For web ACLs, the metrics are for web requests that have the web ACL default action
       * applied. AWS WAF applies the default action to web requests that pass the inspection of all
       * rules in the web ACL without being either allowed or blocked. For more information,
       * see [The web ACL default
       * action](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-default-action.html) in
       * the *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-cloudwatchmetricsenabled)
       */
      override fun cloudWatchMetricsEnabled(): Any = unwrap(this).getCloudWatchMetricsEnabled()

      /**
       * A name of the Amazon CloudWatch metric dimension.
       *
       * The name can contain only the characters: A-Z, a-z, 0-9, - (hyphen), and _ (underscore).
       * The name can be from one to 128 characters long. It can't contain whitespace or metric names
       * that are reserved for AWS WAF , for example `All` and `Default_Action` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * Indicates whether AWS WAF should store a sampling of the web requests that match the rules.
       *
       * You can view the sampled requests through the AWS WAF console.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html#cfn-wafv2-rulegroup-visibilityconfig-sampledrequestsenabled)
       */
      override fun sampledRequestsEnabled(): Any = unwrap(this).getSampledRequestsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VisibilityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty):
          VisibilityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VisibilityConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.VisibilityConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateLimitLabelNamespaceProperty {
    /**
     * The namespace to use for aggregation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitlabelnamespace.html#cfn-wafv2-rulegroup-ratelimitlabelnamespace-namespace)
     */
    public fun namespace(): String

    /**
     * A builder for [RateLimitLabelNamespaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param namespace The namespace to use for aggregation. 
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty.builder()

      /**
       * @param namespace The namespace to use for aggregation. 
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty,
    ) : RateLimitLabelNamespaceProperty {
      /**
       * The namespace to use for aggregation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitlabelnamespace.html#cfn-wafv2-rulegroup-ratelimitlabelnamespace-namespace)
       */
      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitLabelNamespaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty):
          RateLimitLabelNamespaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitLabelNamespaceProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitLabelNamespaceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatementProperty {
    /**
     * A logical rule statement used to combine other rule statements with AND logic.
     *
     * You provide more than one `Statement` within the `AndStatement` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-andstatement)
     */
    public fun andStatement(): Any? = unwrap(this).getAndStatement()

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests.
     *
     * The byte match statement provides the bytes to search for, the location in requests that you
     * want AWS WAF to search, and other settings. The bytes to search for are typically a string that
     * corresponds with ASCII characters. In the AWS WAF console and the developer guide, this is
     * called a string match statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-bytematchstatement)
     */
    public fun byteMatchStatement(): Any? = unwrap(this).getByteMatchStatement()

    /**
     * A rule statement that labels web requests by country and region and that matches against web
     * requests based on country code.
     *
     * A geo match rule labels every request that it inspects regardless of whether it finds a
     * match.
     *
     * * To manage requests only by country, you can use this statement by itself and specify the
     * countries that you want to match against in the `CountryCodes` array.
     * * Otherwise, configure your geo match rule with Count action so that it only labels requests.
     * Then, add one or more label match rules to run after the geo match rule and configure them to
     * match against the geographic labels and handle the requests as needed.
     *
     * AWS WAF labels requests using the alpha-2 country and region codes from the International
     * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using either
     * the IP address in the web request origin or, if you specify it, the address in the geo match
     * `ForwardedIPConfig` .
     *
     * If you use the web request origin, the label formats are `awswaf:clientip:geo:region:&lt;ISO
     * country code&gt;-&lt;ISO region code&gt;` and `awswaf:clientip:geo:country:&lt;ISO country
     * code&gt;` .
     *
     * If you use a forwarded IP address, the label formats are
     * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
     * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
     *
     * For additional details, see [Geographic match rule
     * statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
     * in the [AWS WAF Developer
     * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-geomatchstatement)
     */
    public fun geoMatchStatement(): Any? = unwrap(this).getGeoMatchStatement()

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address
     * ranges.
     *
     * To use this, create an `IPSet` that specifies the addresses you want to detect, then use the
     * ARN of that set in this statement.
     *
     * Each IP set rule statement references an IP set. You create and maintain the set independent
     * of your rules. This allows you to use the single set in multiple rules. When you update the
     * referenced set, AWS WAF automatically updates all rules that reference it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-ipsetreferencestatement)
     */
    public fun ipSetReferenceStatement(): Any? = unwrap(this).getIpSetReferenceStatement()

    /**
     * A rule statement to match against labels that have been added to the web request by rules
     * that have already run in the web ACL.
     *
     * The label match statement provides the label or namespace string to search for. The label
     * string can represent a part or all of the fully qualified label name that had been added to the
     * web request. Fully qualified labels have a prefix, optional namespaces, and label name. The
     * prefix identifies the rule group or web ACL context of the rule that added the label. If you do
     * not provide the fully qualified name in your label match string, AWS WAF performs the search for
     * labels that were added in the same context as the label match statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-labelmatchstatement)
     */
    public fun labelMatchStatement(): Any? = unwrap(this).getLabelMatchStatement()

    /**
     * A logical rule statement used to negate the results of another rule statement.
     *
     * You provide one `Statement` within the `NotStatement` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-notstatement)
     */
    public fun notStatement(): Any? = unwrap(this).getNotStatement()

    /**
     * A logical rule statement used to combine other rule statements with OR logic.
     *
     * You provide more than one `Statement` within the `OrStatement` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-orstatement)
     */
    public fun orStatement(): Any? = unwrap(this).getOrStatement()

    /**
     * A rate-based rule counts incoming requests and rate limits requests when they are coming at
     * too fast a rate.
     *
     * The rule categorizes requests according to your aggregation criteria, collects them into
     * aggregation instances, and counts and rate limits the requests for each instance.
     *
     *
     * If you change any of these settings in a rule that's currently in use, the change resets the
     * rule's rate limiting counts. This can pause the rule's rate limiting activities for up to a
     * minute.
     *
     *
     * You can specify individual aggregation keys, like IP address or HTTP method. You can also
     * specify aggregation key combinations, like IP address and HTTP method, or HTTP method, query
     * argument, and cookie.
     *
     * Each unique set of values for the aggregation keys that you specify is a separate aggregation
     * instance, with the value from each key contributing to the aggregation instance definition.
     *
     * For example, assume the rule evaluates web requests with the following IP address and HTTP
     * method values:
     *
     * * IP address 10.1.1.1, HTTP method POST
     * * IP address 10.1.1.1, HTTP method GET
     * * IP address 127.0.0.0, HTTP method POST
     * * IP address 10.1.1.1, HTTP method GET
     *
     * The rule would create different aggregation instances according to your aggregation criteria,
     * for example:
     *
     * * If the aggregation criteria is just the IP address, then each individual address is an
     * aggregation instance, and AWS WAF counts requests separately for each. The aggregation instances
     * and request counts for our example would be the following:
     * * IP address 10.1.1.1: count 3
     * * IP address 127.0.0.0: count 1
     * * If the aggregation criteria is HTTP method, then each individual HTTP method is an
     * aggregation instance. The aggregation instances and request counts for our example would be the
     * following:
     * * HTTP method POST: count 2
     * * HTTP method GET: count 2
     * * If the aggregation criteria is IP address and HTTP method, then each IP address and each
     * HTTP method would contribute to the combined aggregation instance. The aggregation instances and
     * request counts for our example would be the following:
     * * IP address 10.1.1.1, HTTP method POST: count 1
     * * IP address 10.1.1.1, HTTP method GET: count 2
     * * IP address 127.0.0.0, HTTP method POST: count 1
     *
     * For any n-tuple of aggregation keys, each unique combination of values for the keys defines a
     * separate aggregation instance, which AWS WAF counts and rate-limits individually.
     *
     * You can optionally nest another statement inside the rate-based statement, to narrow the
     * scope of the rule so that it only counts and rate limits requests that match the nested
     * statement. You can use this nested scope-down statement in conjunction with your aggregation key
     * specifications or you can just count and rate limit all requests that match the scope-down
     * statement, without additional aggregation. When you choose to just manage all requests that
     * match a scope-down statement, the aggregation instance is singular for the rule.
     *
     * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
     * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
     * inside a rule group.
     *
     * For additional information about the options, see [Rate limiting web requests using
     * rate-based
     * rules](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html) in the
     * *AWS WAF Developer Guide* .
     *
     * If you only aggregate on the individual IP address or forwarded IP address, you can retrieve
     * the list of IP addresses that AWS WAF is currently rate limiting for a rule through the API call
     * `GetRateBasedStatementManagedKeys` . This option is not available for other aggregation
     * configurations.
     *
     * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
     * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
     * each of the two rule statements represents a separate instance of the rate-based rule and gets
     * its own tracking and management by AWS WAF . If you define a rate-based rule inside a rule
     * group, and then use that rule group in multiple places, each use creates a separate instance of
     * the rate-based rule that gets its own tracking and management by AWS WAF .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-ratebasedstatement)
     */
    public fun rateBasedStatement(): Any? = unwrap(this).getRateBasedStatement()

    /**
     * A rule statement used to search web request components for a match against a single regular
     * expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-regexmatchstatement)
     */
    public fun regexMatchStatement(): Any? = unwrap(this).getRegexMatchStatement()

    /**
     * A rule statement used to search web request components for matches with regular expressions.
     *
     * To use this, create a `RegexPatternSet` that specifies the expressions that you want to
     * detect, then use the ARN of that set in this statement. A web request matches the pattern set
     * rule statement if the request component matches any of the patterns in the set.
     *
     * Each regex pattern set rule statement references a regex pattern set. You create and maintain
     * the set independent of your rules. This allows you to use the single set in multiple rules. When
     * you update the referenced set, AWS WAF automatically updates all rules that reference it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-regexpatternsetreferencestatement)
     */
    public fun regexPatternSetReferenceStatement(): Any? =
        unwrap(this).getRegexPatternSetReferenceStatement()

    /**
     * A rule statement that compares a number of bytes against the size of a request component,
     * using a comparison operator, such as greater than (&gt;) or less than (&lt;).
     *
     * For example, you can use a size constraint statement to look for query strings that are
     * longer than 100 bytes.
     *
     * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
     * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this limit
     * is 8 KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes). For
     * CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
     * additional fees. If you know that the request body for your web requests should never exceed the
     * inspection limit, you could use a size constraint statement to block requests that have a larger
     * request body size.
     *
     * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI
     * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-sizeconstraintstatement)
     */
    public fun sizeConstraintStatement(): Any? = unwrap(this).getSizeConstraintStatement()

    /**
     * A rule statement that inspects for malicious SQL code.
     *
     * Attackers insert malicious SQL code into web requests to do things like modify your database
     * or extract data from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-sqlimatchstatement)
     */
    public fun sqliMatchStatement(): Any? = unwrap(this).getSqliMatchStatement()

    /**
     * A rule statement that inspects for cross-site scripting (XSS) attacks.
     *
     * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to inject
     * malicious client-site scripts into other legitimate web browsers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-xssmatchstatement)
     */
    public fun xssMatchStatement(): Any? = unwrap(this).getXssMatchStatement()

    /**
     * A builder for [StatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param andStatement A logical rule statement used to combine other rule statements with AND
       * logic.
       * You provide more than one `Statement` within the `AndStatement` .
       */
      public fun andStatement(andStatement: IResolvable)

      /**
       * @param andStatement A logical rule statement used to combine other rule statements with AND
       * logic.
       * You provide more than one `Statement` within the `AndStatement` .
       */
      public fun andStatement(andStatement: AndStatementProperty)

      /**
       * @param andStatement A logical rule statement used to combine other rule statements with AND
       * logic.
       * You provide more than one `Statement` within the `AndStatement` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f84784e4830593c9b471589c902f676367c17294727111d314f1caec89c6e22")
      public fun andStatement(andStatement: AndStatementProperty.Builder.() -> Unit)

      /**
       * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF
       * to apply to web requests.
       * The byte match statement provides the bytes to search for, the location in requests that
       * you want AWS WAF to search, and other settings. The bytes to search for are typically a string
       * that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this
       * is called a string match statement.
       */
      public fun byteMatchStatement(byteMatchStatement: IResolvable)

      /**
       * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF
       * to apply to web requests.
       * The byte match statement provides the bytes to search for, the location in requests that
       * you want AWS WAF to search, and other settings. The bytes to search for are typically a string
       * that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this
       * is called a string match statement.
       */
      public fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty)

      /**
       * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF
       * to apply to web requests.
       * The byte match statement provides the bytes to search for, the location in requests that
       * you want AWS WAF to search, and other settings. The bytes to search for are typically a string
       * that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this
       * is called a string match statement.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb06d910592d98a855bd9168f0a5c142e5f51bec98f9a9aa52a47918efa5dc4b")
      public
          fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty.Builder.() -> Unit)

      /**
       * @param geoMatchStatement A rule statement that labels web requests by country and region
       * and that matches against web requests based on country code.
       * A geo match rule labels every request that it inspects regardless of whether it finds a
       * match.
       *
       * * To manage requests only by country, you can use this statement by itself and specify the
       * countries that you want to match against in the `CountryCodes` array.
       * * Otherwise, configure your geo match rule with Count action so that it only labels
       * requests. Then, add one or more label match rules to run after the geo match rule and
       * configure them to match against the geographic labels and handle the requests as needed.
       *
       * AWS WAF labels requests using the alpha-2 country and region codes from the International
       * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
       * either the IP address in the web request origin or, if you specify it, the address in the geo
       * match `ForwardedIPConfig` .
       *
       * If you use the web request origin, the label formats are
       * `awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:clientip:geo:country:&lt;ISO country code&gt;` .
       *
       * If you use a forwarded IP address, the label formats are
       * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
       *
       * For additional details, see [Geographic match rule
       * statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
       * in the [AWS WAF Developer
       * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      public fun geoMatchStatement(geoMatchStatement: IResolvable)

      /**
       * @param geoMatchStatement A rule statement that labels web requests by country and region
       * and that matches against web requests based on country code.
       * A geo match rule labels every request that it inspects regardless of whether it finds a
       * match.
       *
       * * To manage requests only by country, you can use this statement by itself and specify the
       * countries that you want to match against in the `CountryCodes` array.
       * * Otherwise, configure your geo match rule with Count action so that it only labels
       * requests. Then, add one or more label match rules to run after the geo match rule and
       * configure them to match against the geographic labels and handle the requests as needed.
       *
       * AWS WAF labels requests using the alpha-2 country and region codes from the International
       * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
       * either the IP address in the web request origin or, if you specify it, the address in the geo
       * match `ForwardedIPConfig` .
       *
       * If you use the web request origin, the label formats are
       * `awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:clientip:geo:country:&lt;ISO country code&gt;` .
       *
       * If you use a forwarded IP address, the label formats are
       * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
       *
       * For additional details, see [Geographic match rule
       * statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
       * in the [AWS WAF Developer
       * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      public fun geoMatchStatement(geoMatchStatement: GeoMatchStatementProperty)

      /**
       * @param geoMatchStatement A rule statement that labels web requests by country and region
       * and that matches against web requests based on country code.
       * A geo match rule labels every request that it inspects regardless of whether it finds a
       * match.
       *
       * * To manage requests only by country, you can use this statement by itself and specify the
       * countries that you want to match against in the `CountryCodes` array.
       * * Otherwise, configure your geo match rule with Count action so that it only labels
       * requests. Then, add one or more label match rules to run after the geo match rule and
       * configure them to match against the geographic labels and handle the requests as needed.
       *
       * AWS WAF labels requests using the alpha-2 country and region codes from the International
       * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
       * either the IP address in the web request origin or, if you specify it, the address in the geo
       * match `ForwardedIPConfig` .
       *
       * If you use the web request origin, the label formats are
       * `awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:clientip:geo:country:&lt;ISO country code&gt;` .
       *
       * If you use a forwarded IP address, the label formats are
       * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
       *
       * For additional details, see [Geographic match rule
       * statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
       * in the [AWS WAF Developer
       * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b98767a03cb91f73a06c0f74957732cd56c6757f90cfefb368998d3fe8a7c14")
      public fun geoMatchStatement(geoMatchStatement: GeoMatchStatementProperty.Builder.() -> Unit)

      /**
       * @param ipSetReferenceStatement A rule statement used to detect web requests coming from
       * particular IP addresses or address ranges.
       * To use this, create an `IPSet` that specifies the addresses you want to detect, then use
       * the ARN of that set in this statement.
       *
       * Each IP set rule statement references an IP set. You create and maintain the set
       * independent of your rules. This allows you to use the single set in multiple rules. When you
       * update the referenced set, AWS WAF automatically updates all rules that reference it.
       */
      public fun ipSetReferenceStatement(ipSetReferenceStatement: IResolvable)

      /**
       * @param ipSetReferenceStatement A rule statement used to detect web requests coming from
       * particular IP addresses or address ranges.
       * To use this, create an `IPSet` that specifies the addresses you want to detect, then use
       * the ARN of that set in this statement.
       *
       * Each IP set rule statement references an IP set. You create and maintain the set
       * independent of your rules. This allows you to use the single set in multiple rules. When you
       * update the referenced set, AWS WAF automatically updates all rules that reference it.
       */
      public fun ipSetReferenceStatement(ipSetReferenceStatement: IPSetReferenceStatementProperty)

      /**
       * @param ipSetReferenceStatement A rule statement used to detect web requests coming from
       * particular IP addresses or address ranges.
       * To use this, create an `IPSet` that specifies the addresses you want to detect, then use
       * the ARN of that set in this statement.
       *
       * Each IP set rule statement references an IP set. You create and maintain the set
       * independent of your rules. This allows you to use the single set in multiple rules. When you
       * update the referenced set, AWS WAF automatically updates all rules that reference it.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6deaa9ef49cad09c3238358efcf05a41b39f0b8439b527190c0f8c232135561")
      public
          fun ipSetReferenceStatement(ipSetReferenceStatement: IPSetReferenceStatementProperty.Builder.() -> Unit)

      /**
       * @param labelMatchStatement A rule statement to match against labels that have been added to
       * the web request by rules that have already run in the web ACL.
       * The label match statement provides the label or namespace string to search for. The label
       * string can represent a part or all of the fully qualified label name that had been added to
       * the web request. Fully qualified labels have a prefix, optional namespaces, and label name.
       * The prefix identifies the rule group or web ACL context of the rule that added the label. If
       * you do not provide the fully qualified name in your label match string, AWS WAF performs the
       * search for labels that were added in the same context as the label match statement.
       */
      public fun labelMatchStatement(labelMatchStatement: IResolvable)

      /**
       * @param labelMatchStatement A rule statement to match against labels that have been added to
       * the web request by rules that have already run in the web ACL.
       * The label match statement provides the label or namespace string to search for. The label
       * string can represent a part or all of the fully qualified label name that had been added to
       * the web request. Fully qualified labels have a prefix, optional namespaces, and label name.
       * The prefix identifies the rule group or web ACL context of the rule that added the label. If
       * you do not provide the fully qualified name in your label match string, AWS WAF performs the
       * search for labels that were added in the same context as the label match statement.
       */
      public fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty)

      /**
       * @param labelMatchStatement A rule statement to match against labels that have been added to
       * the web request by rules that have already run in the web ACL.
       * The label match statement provides the label or namespace string to search for. The label
       * string can represent a part or all of the fully qualified label name that had been added to
       * the web request. Fully qualified labels have a prefix, optional namespaces, and label name.
       * The prefix identifies the rule group or web ACL context of the rule that added the label. If
       * you do not provide the fully qualified name in your label match string, AWS WAF performs the
       * search for labels that were added in the same context as the label match statement.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("986e5de76be654a8e15d6058c9ee74294e83fe3810db67688f779f82170788a1")
      public
          fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty.Builder.() -> Unit)

      /**
       * @param notStatement A logical rule statement used to negate the results of another rule
       * statement.
       * You provide one `Statement` within the `NotStatement` .
       */
      public fun notStatement(notStatement: IResolvable)

      /**
       * @param notStatement A logical rule statement used to negate the results of another rule
       * statement.
       * You provide one `Statement` within the `NotStatement` .
       */
      public fun notStatement(notStatement: NotStatementProperty)

      /**
       * @param notStatement A logical rule statement used to negate the results of another rule
       * statement.
       * You provide one `Statement` within the `NotStatement` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4b07d4665ef1370e1b2372257a3c3047436992d110003b67d92cbb890c06aae")
      public fun notStatement(notStatement: NotStatementProperty.Builder.() -> Unit)

      /**
       * @param orStatement A logical rule statement used to combine other rule statements with OR
       * logic.
       * You provide more than one `Statement` within the `OrStatement` .
       */
      public fun orStatement(orStatement: IResolvable)

      /**
       * @param orStatement A logical rule statement used to combine other rule statements with OR
       * logic.
       * You provide more than one `Statement` within the `OrStatement` .
       */
      public fun orStatement(orStatement: OrStatementProperty)

      /**
       * @param orStatement A logical rule statement used to combine other rule statements with OR
       * logic.
       * You provide more than one `Statement` within the `OrStatement` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59a8a2a043bbe0095a069a387fb083cd57f9cde91be9671eeee6256c2b04d4f6")
      public fun orStatement(orStatement: OrStatementProperty.Builder.() -> Unit)

      /**
       * @param rateBasedStatement A rate-based rule counts incoming requests and rate limits
       * requests when they are coming at too fast a rate.
       * The rule categorizes requests according to your aggregation criteria, collects them into
       * aggregation instances, and counts and rate limits the requests for each instance.
       *
       *
       * If you change any of these settings in a rule that's currently in use, the change resets
       * the rule's rate limiting counts. This can pause the rule's rate limiting activities for up to
       * a minute.
       *
       *
       * You can specify individual aggregation keys, like IP address or HTTP method. You can also
       * specify aggregation key combinations, like IP address and HTTP method, or HTTP method, query
       * argument, and cookie.
       *
       * Each unique set of values for the aggregation keys that you specify is a separate
       * aggregation instance, with the value from each key contributing to the aggregation instance
       * definition.
       *
       * For example, assume the rule evaluates web requests with the following IP address and HTTP
       * method values:
       *
       * * IP address 10.1.1.1, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       * * IP address 127.0.0.0, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       *
       * The rule would create different aggregation instances according to your aggregation
       * criteria, for example:
       *
       * * If the aggregation criteria is just the IP address, then each individual address is an
       * aggregation instance, and AWS WAF counts requests separately for each. The aggregation
       * instances and request counts for our example would be the following:
       * * IP address 10.1.1.1: count 3
       * * IP address 127.0.0.0: count 1
       * * If the aggregation criteria is HTTP method, then each individual HTTP method is an
       * aggregation instance. The aggregation instances and request counts for our example would be
       * the following:
       * * HTTP method POST: count 2
       * * HTTP method GET: count 2
       * * If the aggregation criteria is IP address and HTTP method, then each IP address and each
       * HTTP method would contribute to the combined aggregation instance. The aggregation instances
       * and request counts for our example would be the following:
       * * IP address 10.1.1.1, HTTP method POST: count 1
       * * IP address 10.1.1.1, HTTP method GET: count 2
       * * IP address 127.0.0.0, HTTP method POST: count 1
       *
       * For any n-tuple of aggregation keys, each unique combination of values for the keys defines
       * a separate aggregation instance, which AWS WAF counts and rate-limits individually.
       *
       * You can optionally nest another statement inside the rate-based statement, to narrow the
       * scope of the rule so that it only counts and rate limits requests that match the nested
       * statement. You can use this nested scope-down statement in conjunction with your aggregation
       * key specifications or you can just count and rate limit all requests that match the scope-down
       * statement, without additional aggregation. When you choose to just manage all requests that
       * match a scope-down statement, the aggregation instance is singular for the rule.
       *
       * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
       * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
       * inside a rule group.
       *
       * For additional information about the options, see [Rate limiting web requests using
       * rate-based
       * rules](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html) in the
       * *AWS WAF Developer Guide* .
       *
       * If you only aggregate on the individual IP address or forwarded IP address, you can
       * retrieve the list of IP addresses that AWS WAF is currently rate limiting for a rule through
       * the API call `GetRateBasedStatementManagedKeys` . This option is not available for other
       * aggregation configurations.
       *
       * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
       * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
       * each of the two rule statements represents a separate instance of the rate-based rule and gets
       * its own tracking and management by AWS WAF . If you define a rate-based rule inside a rule
       * group, and then use that rule group in multiple places, each use creates a separate instance
       * of the rate-based rule that gets its own tracking and management by AWS WAF .
       */
      public fun rateBasedStatement(rateBasedStatement: IResolvable)

      /**
       * @param rateBasedStatement A rate-based rule counts incoming requests and rate limits
       * requests when they are coming at too fast a rate.
       * The rule categorizes requests according to your aggregation criteria, collects them into
       * aggregation instances, and counts and rate limits the requests for each instance.
       *
       *
       * If you change any of these settings in a rule that's currently in use, the change resets
       * the rule's rate limiting counts. This can pause the rule's rate limiting activities for up to
       * a minute.
       *
       *
       * You can specify individual aggregation keys, like IP address or HTTP method. You can also
       * specify aggregation key combinations, like IP address and HTTP method, or HTTP method, query
       * argument, and cookie.
       *
       * Each unique set of values for the aggregation keys that you specify is a separate
       * aggregation instance, with the value from each key contributing to the aggregation instance
       * definition.
       *
       * For example, assume the rule evaluates web requests with the following IP address and HTTP
       * method values:
       *
       * * IP address 10.1.1.1, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       * * IP address 127.0.0.0, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       *
       * The rule would create different aggregation instances according to your aggregation
       * criteria, for example:
       *
       * * If the aggregation criteria is just the IP address, then each individual address is an
       * aggregation instance, and AWS WAF counts requests separately for each. The aggregation
       * instances and request counts for our example would be the following:
       * * IP address 10.1.1.1: count 3
       * * IP address 127.0.0.0: count 1
       * * If the aggregation criteria is HTTP method, then each individual HTTP method is an
       * aggregation instance. The aggregation instances and request counts for our example would be
       * the following:
       * * HTTP method POST: count 2
       * * HTTP method GET: count 2
       * * If the aggregation criteria is IP address and HTTP method, then each IP address and each
       * HTTP method would contribute to the combined aggregation instance. The aggregation instances
       * and request counts for our example would be the following:
       * * IP address 10.1.1.1, HTTP method POST: count 1
       * * IP address 10.1.1.1, HTTP method GET: count 2
       * * IP address 127.0.0.0, HTTP method POST: count 1
       *
       * For any n-tuple of aggregation keys, each unique combination of values for the keys defines
       * a separate aggregation instance, which AWS WAF counts and rate-limits individually.
       *
       * You can optionally nest another statement inside the rate-based statement, to narrow the
       * scope of the rule so that it only counts and rate limits requests that match the nested
       * statement. You can use this nested scope-down statement in conjunction with your aggregation
       * key specifications or you can just count and rate limit all requests that match the scope-down
       * statement, without additional aggregation. When you choose to just manage all requests that
       * match a scope-down statement, the aggregation instance is singular for the rule.
       *
       * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
       * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
       * inside a rule group.
       *
       * For additional information about the options, see [Rate limiting web requests using
       * rate-based
       * rules](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html) in the
       * *AWS WAF Developer Guide* .
       *
       * If you only aggregate on the individual IP address or forwarded IP address, you can
       * retrieve the list of IP addresses that AWS WAF is currently rate limiting for a rule through
       * the API call `GetRateBasedStatementManagedKeys` . This option is not available for other
       * aggregation configurations.
       *
       * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
       * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
       * each of the two rule statements represents a separate instance of the rate-based rule and gets
       * its own tracking and management by AWS WAF . If you define a rate-based rule inside a rule
       * group, and then use that rule group in multiple places, each use creates a separate instance
       * of the rate-based rule that gets its own tracking and management by AWS WAF .
       */
      public fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty)

      /**
       * @param rateBasedStatement A rate-based rule counts incoming requests and rate limits
       * requests when they are coming at too fast a rate.
       * The rule categorizes requests according to your aggregation criteria, collects them into
       * aggregation instances, and counts and rate limits the requests for each instance.
       *
       *
       * If you change any of these settings in a rule that's currently in use, the change resets
       * the rule's rate limiting counts. This can pause the rule's rate limiting activities for up to
       * a minute.
       *
       *
       * You can specify individual aggregation keys, like IP address or HTTP method. You can also
       * specify aggregation key combinations, like IP address and HTTP method, or HTTP method, query
       * argument, and cookie.
       *
       * Each unique set of values for the aggregation keys that you specify is a separate
       * aggregation instance, with the value from each key contributing to the aggregation instance
       * definition.
       *
       * For example, assume the rule evaluates web requests with the following IP address and HTTP
       * method values:
       *
       * * IP address 10.1.1.1, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       * * IP address 127.0.0.0, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       *
       * The rule would create different aggregation instances according to your aggregation
       * criteria, for example:
       *
       * * If the aggregation criteria is just the IP address, then each individual address is an
       * aggregation instance, and AWS WAF counts requests separately for each. The aggregation
       * instances and request counts for our example would be the following:
       * * IP address 10.1.1.1: count 3
       * * IP address 127.0.0.0: count 1
       * * If the aggregation criteria is HTTP method, then each individual HTTP method is an
       * aggregation instance. The aggregation instances and request counts for our example would be
       * the following:
       * * HTTP method POST: count 2
       * * HTTP method GET: count 2
       * * If the aggregation criteria is IP address and HTTP method, then each IP address and each
       * HTTP method would contribute to the combined aggregation instance. The aggregation instances
       * and request counts for our example would be the following:
       * * IP address 10.1.1.1, HTTP method POST: count 1
       * * IP address 10.1.1.1, HTTP method GET: count 2
       * * IP address 127.0.0.0, HTTP method POST: count 1
       *
       * For any n-tuple of aggregation keys, each unique combination of values for the keys defines
       * a separate aggregation instance, which AWS WAF counts and rate-limits individually.
       *
       * You can optionally nest another statement inside the rate-based statement, to narrow the
       * scope of the rule so that it only counts and rate limits requests that match the nested
       * statement. You can use this nested scope-down statement in conjunction with your aggregation
       * key specifications or you can just count and rate limit all requests that match the scope-down
       * statement, without additional aggregation. When you choose to just manage all requests that
       * match a scope-down statement, the aggregation instance is singular for the rule.
       *
       * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
       * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
       * inside a rule group.
       *
       * For additional information about the options, see [Rate limiting web requests using
       * rate-based
       * rules](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html) in the
       * *AWS WAF Developer Guide* .
       *
       * If you only aggregate on the individual IP address or forwarded IP address, you can
       * retrieve the list of IP addresses that AWS WAF is currently rate limiting for a rule through
       * the API call `GetRateBasedStatementManagedKeys` . This option is not available for other
       * aggregation configurations.
       *
       * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
       * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
       * each of the two rule statements represents a separate instance of the rate-based rule and gets
       * its own tracking and management by AWS WAF . If you define a rate-based rule inside a rule
       * group, and then use that rule group in multiple places, each use creates a separate instance
       * of the rate-based rule that gets its own tracking and management by AWS WAF .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bcfd0d44bbb6308f131b368f5d5098eee6e7d23736279eeb92b50311609b4d9")
      public
          fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty.Builder.() -> Unit)

      /**
       * @param regexMatchStatement A rule statement used to search web request components for a
       * match against a single regular expression.
       */
      public fun regexMatchStatement(regexMatchStatement: IResolvable)

      /**
       * @param regexMatchStatement A rule statement used to search web request components for a
       * match against a single regular expression.
       */
      public fun regexMatchStatement(regexMatchStatement: RegexMatchStatementProperty)

      /**
       * @param regexMatchStatement A rule statement used to search web request components for a
       * match against a single regular expression.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cab718641bfc23238d998ba962f49b68c7c0ad9ac57e0d1f09949e0da4e506f8")
      public
          fun regexMatchStatement(regexMatchStatement: RegexMatchStatementProperty.Builder.() -> Unit)

      /**
       * @param regexPatternSetReferenceStatement A rule statement used to search web request
       * components for matches with regular expressions.
       * To use this, create a `RegexPatternSet` that specifies the expressions that you want to
       * detect, then use the ARN of that set in this statement. A web request matches the pattern set
       * rule statement if the request component matches any of the patterns in the set.
       *
       * Each regex pattern set rule statement references a regex pattern set. You create and
       * maintain the set independent of your rules. This allows you to use the single set in multiple
       * rules. When you update the referenced set, AWS WAF automatically updates all rules that
       * reference it.
       */
      public fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: IResolvable)

      /**
       * @param regexPatternSetReferenceStatement A rule statement used to search web request
       * components for matches with regular expressions.
       * To use this, create a `RegexPatternSet` that specifies the expressions that you want to
       * detect, then use the ARN of that set in this statement. A web request matches the pattern set
       * rule statement if the request component matches any of the patterns in the set.
       *
       * Each regex pattern set rule statement references a regex pattern set. You create and
       * maintain the set independent of your rules. This allows you to use the single set in multiple
       * rules. When you update the referenced set, AWS WAF automatically updates all rules that
       * reference it.
       */
      public
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty)

      /**
       * @param regexPatternSetReferenceStatement A rule statement used to search web request
       * components for matches with regular expressions.
       * To use this, create a `RegexPatternSet` that specifies the expressions that you want to
       * detect, then use the ARN of that set in this statement. A web request matches the pattern set
       * rule statement if the request component matches any of the patterns in the set.
       *
       * Each regex pattern set rule statement references a regex pattern set. You create and
       * maintain the set independent of your rules. This allows you to use the single set in multiple
       * rules. When you update the referenced set, AWS WAF automatically updates all rules that
       * reference it.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aca9516d1d1380f25cad4dd73b064a09e3e99d316436f6dde2017f23c043a372")
      public
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty.Builder.() -> Unit)

      /**
       * @param sizeConstraintStatement A rule statement that compares a number of bytes against the
       * size of a request component, using a comparison operator, such as greater than (&gt;) or less
       * than (&lt;).
       * For example, you can use a size constraint statement to look for query strings that are
       * longer than 100 bytes.
       *
       * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
       * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
       * limit is 8 KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes).
       * For CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
       * additional fees. If you know that the request body for your web requests should never exceed
       * the inspection limit, you could use a size constraint statement to block requests that have a
       * larger request body size.
       *
       * If you choose URI for the value of Part of the request to filter on, the slash (/) in the
       * URI counts as one character. For example, the URI `/logo.jpg` is nine characters long.
       */
      public fun sizeConstraintStatement(sizeConstraintStatement: IResolvable)

      /**
       * @param sizeConstraintStatement A rule statement that compares a number of bytes against the
       * size of a request component, using a comparison operator, such as greater than (&gt;) or less
       * than (&lt;).
       * For example, you can use a size constraint statement to look for query strings that are
       * longer than 100 bytes.
       *
       * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
       * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
       * limit is 8 KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes).
       * For CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
       * additional fees. If you know that the request body for your web requests should never exceed
       * the inspection limit, you could use a size constraint statement to block requests that have a
       * larger request body size.
       *
       * If you choose URI for the value of Part of the request to filter on, the slash (/) in the
       * URI counts as one character. For example, the URI `/logo.jpg` is nine characters long.
       */
      public fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty)

      /**
       * @param sizeConstraintStatement A rule statement that compares a number of bytes against the
       * size of a request component, using a comparison operator, such as greater than (&gt;) or less
       * than (&lt;).
       * For example, you can use a size constraint statement to look for query strings that are
       * longer than 100 bytes.
       *
       * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
       * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
       * limit is 8 KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes).
       * For CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
       * additional fees. If you know that the request body for your web requests should never exceed
       * the inspection limit, you could use a size constraint statement to block requests that have a
       * larger request body size.
       *
       * If you choose URI for the value of Part of the request to filter on, the slash (/) in the
       * URI counts as one character. For example, the URI `/logo.jpg` is nine characters long.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f70e09b6dff74f1e7a668ab987d9edf5a8b525e88baf4dd3a64c5ba80790b394")
      public
          fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty.Builder.() -> Unit)

      /**
       * @param sqliMatchStatement A rule statement that inspects for malicious SQL code.
       * Attackers insert malicious SQL code into web requests to do things like modify your
       * database or extract data from it.
       */
      public fun sqliMatchStatement(sqliMatchStatement: IResolvable)

      /**
       * @param sqliMatchStatement A rule statement that inspects for malicious SQL code.
       * Attackers insert malicious SQL code into web requests to do things like modify your
       * database or extract data from it.
       */
      public fun sqliMatchStatement(sqliMatchStatement: SqliMatchStatementProperty)

      /**
       * @param sqliMatchStatement A rule statement that inspects for malicious SQL code.
       * Attackers insert malicious SQL code into web requests to do things like modify your
       * database or extract data from it.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0fdab764bc61099312cfe517891cb2231ee5552284f8fd95a4f44fdbb7ddf3f5")
      public
          fun sqliMatchStatement(sqliMatchStatement: SqliMatchStatementProperty.Builder.() -> Unit)

      /**
       * @param xssMatchStatement A rule statement that inspects for cross-site scripting (XSS)
       * attacks.
       * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to
       * inject malicious client-site scripts into other legitimate web browsers.
       */
      public fun xssMatchStatement(xssMatchStatement: IResolvable)

      /**
       * @param xssMatchStatement A rule statement that inspects for cross-site scripting (XSS)
       * attacks.
       * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to
       * inject malicious client-site scripts into other legitimate web browsers.
       */
      public fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty)

      /**
       * @param xssMatchStatement A rule statement that inspects for cross-site scripting (XSS)
       * attacks.
       * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to
       * inject malicious client-site scripts into other legitimate web browsers.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2f50b19cc87986feaf8db81faf794d3554022dd9e71876a010beea7ac2d6210")
      public fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty.builder()

      /**
       * @param andStatement A logical rule statement used to combine other rule statements with AND
       * logic.
       * You provide more than one `Statement` within the `AndStatement` .
       */
      override fun andStatement(andStatement: IResolvable) {
        cdkBuilder.andStatement(andStatement.let(IResolvable::unwrap))
      }

      /**
       * @param andStatement A logical rule statement used to combine other rule statements with AND
       * logic.
       * You provide more than one `Statement` within the `AndStatement` .
       */
      override fun andStatement(andStatement: AndStatementProperty) {
        cdkBuilder.andStatement(andStatement.let(AndStatementProperty::unwrap))
      }

      /**
       * @param andStatement A logical rule statement used to combine other rule statements with AND
       * logic.
       * You provide more than one `Statement` within the `AndStatement` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f84784e4830593c9b471589c902f676367c17294727111d314f1caec89c6e22")
      override fun andStatement(andStatement: AndStatementProperty.Builder.() -> Unit): Unit =
          andStatement(AndStatementProperty(andStatement))

      /**
       * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF
       * to apply to web requests.
       * The byte match statement provides the bytes to search for, the location in requests that
       * you want AWS WAF to search, and other settings. The bytes to search for are typically a string
       * that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this
       * is called a string match statement.
       */
      override fun byteMatchStatement(byteMatchStatement: IResolvable) {
        cdkBuilder.byteMatchStatement(byteMatchStatement.let(IResolvable::unwrap))
      }

      /**
       * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF
       * to apply to web requests.
       * The byte match statement provides the bytes to search for, the location in requests that
       * you want AWS WAF to search, and other settings. The bytes to search for are typically a string
       * that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this
       * is called a string match statement.
       */
      override fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty) {
        cdkBuilder.byteMatchStatement(byteMatchStatement.let(ByteMatchStatementProperty::unwrap))
      }

      /**
       * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF
       * to apply to web requests.
       * The byte match statement provides the bytes to search for, the location in requests that
       * you want AWS WAF to search, and other settings. The bytes to search for are typically a string
       * that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this
       * is called a string match statement.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb06d910592d98a855bd9168f0a5c142e5f51bec98f9a9aa52a47918efa5dc4b")
      override
          fun byteMatchStatement(byteMatchStatement: ByteMatchStatementProperty.Builder.() -> Unit):
          Unit = byteMatchStatement(ByteMatchStatementProperty(byteMatchStatement))

      /**
       * @param geoMatchStatement A rule statement that labels web requests by country and region
       * and that matches against web requests based on country code.
       * A geo match rule labels every request that it inspects regardless of whether it finds a
       * match.
       *
       * * To manage requests only by country, you can use this statement by itself and specify the
       * countries that you want to match against in the `CountryCodes` array.
       * * Otherwise, configure your geo match rule with Count action so that it only labels
       * requests. Then, add one or more label match rules to run after the geo match rule and
       * configure them to match against the geographic labels and handle the requests as needed.
       *
       * AWS WAF labels requests using the alpha-2 country and region codes from the International
       * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
       * either the IP address in the web request origin or, if you specify it, the address in the geo
       * match `ForwardedIPConfig` .
       *
       * If you use the web request origin, the label formats are
       * `awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:clientip:geo:country:&lt;ISO country code&gt;` .
       *
       * If you use a forwarded IP address, the label formats are
       * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
       *
       * For additional details, see [Geographic match rule
       * statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
       * in the [AWS WAF Developer
       * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      override fun geoMatchStatement(geoMatchStatement: IResolvable) {
        cdkBuilder.geoMatchStatement(geoMatchStatement.let(IResolvable::unwrap))
      }

      /**
       * @param geoMatchStatement A rule statement that labels web requests by country and region
       * and that matches against web requests based on country code.
       * A geo match rule labels every request that it inspects regardless of whether it finds a
       * match.
       *
       * * To manage requests only by country, you can use this statement by itself and specify the
       * countries that you want to match against in the `CountryCodes` array.
       * * Otherwise, configure your geo match rule with Count action so that it only labels
       * requests. Then, add one or more label match rules to run after the geo match rule and
       * configure them to match against the geographic labels and handle the requests as needed.
       *
       * AWS WAF labels requests using the alpha-2 country and region codes from the International
       * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
       * either the IP address in the web request origin or, if you specify it, the address in the geo
       * match `ForwardedIPConfig` .
       *
       * If you use the web request origin, the label formats are
       * `awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:clientip:geo:country:&lt;ISO country code&gt;` .
       *
       * If you use a forwarded IP address, the label formats are
       * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
       *
       * For additional details, see [Geographic match rule
       * statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
       * in the [AWS WAF Developer
       * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      override fun geoMatchStatement(geoMatchStatement: GeoMatchStatementProperty) {
        cdkBuilder.geoMatchStatement(geoMatchStatement.let(GeoMatchStatementProperty::unwrap))
      }

      /**
       * @param geoMatchStatement A rule statement that labels web requests by country and region
       * and that matches against web requests based on country code.
       * A geo match rule labels every request that it inspects regardless of whether it finds a
       * match.
       *
       * * To manage requests only by country, you can use this statement by itself and specify the
       * countries that you want to match against in the `CountryCodes` array.
       * * Otherwise, configure your geo match rule with Count action so that it only labels
       * requests. Then, add one or more label match rules to run after the geo match rule and
       * configure them to match against the geographic labels and handle the requests as needed.
       *
       * AWS WAF labels requests using the alpha-2 country and region codes from the International
       * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
       * either the IP address in the web request origin or, if you specify it, the address in the geo
       * match `ForwardedIPConfig` .
       *
       * If you use the web request origin, the label formats are
       * `awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:clientip:geo:country:&lt;ISO country code&gt;` .
       *
       * If you use a forwarded IP address, the label formats are
       * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
       *
       * For additional details, see [Geographic match rule
       * statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
       * in the [AWS WAF Developer
       * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b98767a03cb91f73a06c0f74957732cd56c6757f90cfefb368998d3fe8a7c14")
      override
          fun geoMatchStatement(geoMatchStatement: GeoMatchStatementProperty.Builder.() -> Unit):
          Unit = geoMatchStatement(GeoMatchStatementProperty(geoMatchStatement))

      /**
       * @param ipSetReferenceStatement A rule statement used to detect web requests coming from
       * particular IP addresses or address ranges.
       * To use this, create an `IPSet` that specifies the addresses you want to detect, then use
       * the ARN of that set in this statement.
       *
       * Each IP set rule statement references an IP set. You create and maintain the set
       * independent of your rules. This allows you to use the single set in multiple rules. When you
       * update the referenced set, AWS WAF automatically updates all rules that reference it.
       */
      override fun ipSetReferenceStatement(ipSetReferenceStatement: IResolvable) {
        cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement.let(IResolvable::unwrap))
      }

      /**
       * @param ipSetReferenceStatement A rule statement used to detect web requests coming from
       * particular IP addresses or address ranges.
       * To use this, create an `IPSet` that specifies the addresses you want to detect, then use
       * the ARN of that set in this statement.
       *
       * Each IP set rule statement references an IP set. You create and maintain the set
       * independent of your rules. This allows you to use the single set in multiple rules. When you
       * update the referenced set, AWS WAF automatically updates all rules that reference it.
       */
      override
          fun ipSetReferenceStatement(ipSetReferenceStatement: IPSetReferenceStatementProperty) {
        cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement.let(IPSetReferenceStatementProperty::unwrap))
      }

      /**
       * @param ipSetReferenceStatement A rule statement used to detect web requests coming from
       * particular IP addresses or address ranges.
       * To use this, create an `IPSet` that specifies the addresses you want to detect, then use
       * the ARN of that set in this statement.
       *
       * Each IP set rule statement references an IP set. You create and maintain the set
       * independent of your rules. This allows you to use the single set in multiple rules. When you
       * update the referenced set, AWS WAF automatically updates all rules that reference it.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6deaa9ef49cad09c3238358efcf05a41b39f0b8439b527190c0f8c232135561")
      override
          fun ipSetReferenceStatement(ipSetReferenceStatement: IPSetReferenceStatementProperty.Builder.() -> Unit):
          Unit = ipSetReferenceStatement(IPSetReferenceStatementProperty(ipSetReferenceStatement))

      /**
       * @param labelMatchStatement A rule statement to match against labels that have been added to
       * the web request by rules that have already run in the web ACL.
       * The label match statement provides the label or namespace string to search for. The label
       * string can represent a part or all of the fully qualified label name that had been added to
       * the web request. Fully qualified labels have a prefix, optional namespaces, and label name.
       * The prefix identifies the rule group or web ACL context of the rule that added the label. If
       * you do not provide the fully qualified name in your label match string, AWS WAF performs the
       * search for labels that were added in the same context as the label match statement.
       */
      override fun labelMatchStatement(labelMatchStatement: IResolvable) {
        cdkBuilder.labelMatchStatement(labelMatchStatement.let(IResolvable::unwrap))
      }

      /**
       * @param labelMatchStatement A rule statement to match against labels that have been added to
       * the web request by rules that have already run in the web ACL.
       * The label match statement provides the label or namespace string to search for. The label
       * string can represent a part or all of the fully qualified label name that had been added to
       * the web request. Fully qualified labels have a prefix, optional namespaces, and label name.
       * The prefix identifies the rule group or web ACL context of the rule that added the label. If
       * you do not provide the fully qualified name in your label match string, AWS WAF performs the
       * search for labels that were added in the same context as the label match statement.
       */
      override fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty) {
        cdkBuilder.labelMatchStatement(labelMatchStatement.let(LabelMatchStatementProperty::unwrap))
      }

      /**
       * @param labelMatchStatement A rule statement to match against labels that have been added to
       * the web request by rules that have already run in the web ACL.
       * The label match statement provides the label or namespace string to search for. The label
       * string can represent a part or all of the fully qualified label name that had been added to
       * the web request. Fully qualified labels have a prefix, optional namespaces, and label name.
       * The prefix identifies the rule group or web ACL context of the rule that added the label. If
       * you do not provide the fully qualified name in your label match string, AWS WAF performs the
       * search for labels that were added in the same context as the label match statement.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("986e5de76be654a8e15d6058c9ee74294e83fe3810db67688f779f82170788a1")
      override
          fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty.Builder.() -> Unit):
          Unit = labelMatchStatement(LabelMatchStatementProperty(labelMatchStatement))

      /**
       * @param notStatement A logical rule statement used to negate the results of another rule
       * statement.
       * You provide one `Statement` within the `NotStatement` .
       */
      override fun notStatement(notStatement: IResolvable) {
        cdkBuilder.notStatement(notStatement.let(IResolvable::unwrap))
      }

      /**
       * @param notStatement A logical rule statement used to negate the results of another rule
       * statement.
       * You provide one `Statement` within the `NotStatement` .
       */
      override fun notStatement(notStatement: NotStatementProperty) {
        cdkBuilder.notStatement(notStatement.let(NotStatementProperty::unwrap))
      }

      /**
       * @param notStatement A logical rule statement used to negate the results of another rule
       * statement.
       * You provide one `Statement` within the `NotStatement` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4b07d4665ef1370e1b2372257a3c3047436992d110003b67d92cbb890c06aae")
      override fun notStatement(notStatement: NotStatementProperty.Builder.() -> Unit): Unit =
          notStatement(NotStatementProperty(notStatement))

      /**
       * @param orStatement A logical rule statement used to combine other rule statements with OR
       * logic.
       * You provide more than one `Statement` within the `OrStatement` .
       */
      override fun orStatement(orStatement: IResolvable) {
        cdkBuilder.orStatement(orStatement.let(IResolvable::unwrap))
      }

      /**
       * @param orStatement A logical rule statement used to combine other rule statements with OR
       * logic.
       * You provide more than one `Statement` within the `OrStatement` .
       */
      override fun orStatement(orStatement: OrStatementProperty) {
        cdkBuilder.orStatement(orStatement.let(OrStatementProperty::unwrap))
      }

      /**
       * @param orStatement A logical rule statement used to combine other rule statements with OR
       * logic.
       * You provide more than one `Statement` within the `OrStatement` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59a8a2a043bbe0095a069a387fb083cd57f9cde91be9671eeee6256c2b04d4f6")
      override fun orStatement(orStatement: OrStatementProperty.Builder.() -> Unit): Unit =
          orStatement(OrStatementProperty(orStatement))

      /**
       * @param rateBasedStatement A rate-based rule counts incoming requests and rate limits
       * requests when they are coming at too fast a rate.
       * The rule categorizes requests according to your aggregation criteria, collects them into
       * aggregation instances, and counts and rate limits the requests for each instance.
       *
       *
       * If you change any of these settings in a rule that's currently in use, the change resets
       * the rule's rate limiting counts. This can pause the rule's rate limiting activities for up to
       * a minute.
       *
       *
       * You can specify individual aggregation keys, like IP address or HTTP method. You can also
       * specify aggregation key combinations, like IP address and HTTP method, or HTTP method, query
       * argument, and cookie.
       *
       * Each unique set of values for the aggregation keys that you specify is a separate
       * aggregation instance, with the value from each key contributing to the aggregation instance
       * definition.
       *
       * For example, assume the rule evaluates web requests with the following IP address and HTTP
       * method values:
       *
       * * IP address 10.1.1.1, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       * * IP address 127.0.0.0, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       *
       * The rule would create different aggregation instances according to your aggregation
       * criteria, for example:
       *
       * * If the aggregation criteria is just the IP address, then each individual address is an
       * aggregation instance, and AWS WAF counts requests separately for each. The aggregation
       * instances and request counts for our example would be the following:
       * * IP address 10.1.1.1: count 3
       * * IP address 127.0.0.0: count 1
       * * If the aggregation criteria is HTTP method, then each individual HTTP method is an
       * aggregation instance. The aggregation instances and request counts for our example would be
       * the following:
       * * HTTP method POST: count 2
       * * HTTP method GET: count 2
       * * If the aggregation criteria is IP address and HTTP method, then each IP address and each
       * HTTP method would contribute to the combined aggregation instance. The aggregation instances
       * and request counts for our example would be the following:
       * * IP address 10.1.1.1, HTTP method POST: count 1
       * * IP address 10.1.1.1, HTTP method GET: count 2
       * * IP address 127.0.0.0, HTTP method POST: count 1
       *
       * For any n-tuple of aggregation keys, each unique combination of values for the keys defines
       * a separate aggregation instance, which AWS WAF counts and rate-limits individually.
       *
       * You can optionally nest another statement inside the rate-based statement, to narrow the
       * scope of the rule so that it only counts and rate limits requests that match the nested
       * statement. You can use this nested scope-down statement in conjunction with your aggregation
       * key specifications or you can just count and rate limit all requests that match the scope-down
       * statement, without additional aggregation. When you choose to just manage all requests that
       * match a scope-down statement, the aggregation instance is singular for the rule.
       *
       * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
       * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
       * inside a rule group.
       *
       * For additional information about the options, see [Rate limiting web requests using
       * rate-based
       * rules](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html) in the
       * *AWS WAF Developer Guide* .
       *
       * If you only aggregate on the individual IP address or forwarded IP address, you can
       * retrieve the list of IP addresses that AWS WAF is currently rate limiting for a rule through
       * the API call `GetRateBasedStatementManagedKeys` . This option is not available for other
       * aggregation configurations.
       *
       * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
       * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
       * each of the two rule statements represents a separate instance of the rate-based rule and gets
       * its own tracking and management by AWS WAF . If you define a rate-based rule inside a rule
       * group, and then use that rule group in multiple places, each use creates a separate instance
       * of the rate-based rule that gets its own tracking and management by AWS WAF .
       */
      override fun rateBasedStatement(rateBasedStatement: IResolvable) {
        cdkBuilder.rateBasedStatement(rateBasedStatement.let(IResolvable::unwrap))
      }

      /**
       * @param rateBasedStatement A rate-based rule counts incoming requests and rate limits
       * requests when they are coming at too fast a rate.
       * The rule categorizes requests according to your aggregation criteria, collects them into
       * aggregation instances, and counts and rate limits the requests for each instance.
       *
       *
       * If you change any of these settings in a rule that's currently in use, the change resets
       * the rule's rate limiting counts. This can pause the rule's rate limiting activities for up to
       * a minute.
       *
       *
       * You can specify individual aggregation keys, like IP address or HTTP method. You can also
       * specify aggregation key combinations, like IP address and HTTP method, or HTTP method, query
       * argument, and cookie.
       *
       * Each unique set of values for the aggregation keys that you specify is a separate
       * aggregation instance, with the value from each key contributing to the aggregation instance
       * definition.
       *
       * For example, assume the rule evaluates web requests with the following IP address and HTTP
       * method values:
       *
       * * IP address 10.1.1.1, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       * * IP address 127.0.0.0, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       *
       * The rule would create different aggregation instances according to your aggregation
       * criteria, for example:
       *
       * * If the aggregation criteria is just the IP address, then each individual address is an
       * aggregation instance, and AWS WAF counts requests separately for each. The aggregation
       * instances and request counts for our example would be the following:
       * * IP address 10.1.1.1: count 3
       * * IP address 127.0.0.0: count 1
       * * If the aggregation criteria is HTTP method, then each individual HTTP method is an
       * aggregation instance. The aggregation instances and request counts for our example would be
       * the following:
       * * HTTP method POST: count 2
       * * HTTP method GET: count 2
       * * If the aggregation criteria is IP address and HTTP method, then each IP address and each
       * HTTP method would contribute to the combined aggregation instance. The aggregation instances
       * and request counts for our example would be the following:
       * * IP address 10.1.1.1, HTTP method POST: count 1
       * * IP address 10.1.1.1, HTTP method GET: count 2
       * * IP address 127.0.0.0, HTTP method POST: count 1
       *
       * For any n-tuple of aggregation keys, each unique combination of values for the keys defines
       * a separate aggregation instance, which AWS WAF counts and rate-limits individually.
       *
       * You can optionally nest another statement inside the rate-based statement, to narrow the
       * scope of the rule so that it only counts and rate limits requests that match the nested
       * statement. You can use this nested scope-down statement in conjunction with your aggregation
       * key specifications or you can just count and rate limit all requests that match the scope-down
       * statement, without additional aggregation. When you choose to just manage all requests that
       * match a scope-down statement, the aggregation instance is singular for the rule.
       *
       * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
       * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
       * inside a rule group.
       *
       * For additional information about the options, see [Rate limiting web requests using
       * rate-based
       * rules](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html) in the
       * *AWS WAF Developer Guide* .
       *
       * If you only aggregate on the individual IP address or forwarded IP address, you can
       * retrieve the list of IP addresses that AWS WAF is currently rate limiting for a rule through
       * the API call `GetRateBasedStatementManagedKeys` . This option is not available for other
       * aggregation configurations.
       *
       * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
       * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
       * each of the two rule statements represents a separate instance of the rate-based rule and gets
       * its own tracking and management by AWS WAF . If you define a rate-based rule inside a rule
       * group, and then use that rule group in multiple places, each use creates a separate instance
       * of the rate-based rule that gets its own tracking and management by AWS WAF .
       */
      override fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty) {
        cdkBuilder.rateBasedStatement(rateBasedStatement.let(RateBasedStatementProperty::unwrap))
      }

      /**
       * @param rateBasedStatement A rate-based rule counts incoming requests and rate limits
       * requests when they are coming at too fast a rate.
       * The rule categorizes requests according to your aggregation criteria, collects them into
       * aggregation instances, and counts and rate limits the requests for each instance.
       *
       *
       * If you change any of these settings in a rule that's currently in use, the change resets
       * the rule's rate limiting counts. This can pause the rule's rate limiting activities for up to
       * a minute.
       *
       *
       * You can specify individual aggregation keys, like IP address or HTTP method. You can also
       * specify aggregation key combinations, like IP address and HTTP method, or HTTP method, query
       * argument, and cookie.
       *
       * Each unique set of values for the aggregation keys that you specify is a separate
       * aggregation instance, with the value from each key contributing to the aggregation instance
       * definition.
       *
       * For example, assume the rule evaluates web requests with the following IP address and HTTP
       * method values:
       *
       * * IP address 10.1.1.1, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       * * IP address 127.0.0.0, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       *
       * The rule would create different aggregation instances according to your aggregation
       * criteria, for example:
       *
       * * If the aggregation criteria is just the IP address, then each individual address is an
       * aggregation instance, and AWS WAF counts requests separately for each. The aggregation
       * instances and request counts for our example would be the following:
       * * IP address 10.1.1.1: count 3
       * * IP address 127.0.0.0: count 1
       * * If the aggregation criteria is HTTP method, then each individual HTTP method is an
       * aggregation instance. The aggregation instances and request counts for our example would be
       * the following:
       * * HTTP method POST: count 2
       * * HTTP method GET: count 2
       * * If the aggregation criteria is IP address and HTTP method, then each IP address and each
       * HTTP method would contribute to the combined aggregation instance. The aggregation instances
       * and request counts for our example would be the following:
       * * IP address 10.1.1.1, HTTP method POST: count 1
       * * IP address 10.1.1.1, HTTP method GET: count 2
       * * IP address 127.0.0.0, HTTP method POST: count 1
       *
       * For any n-tuple of aggregation keys, each unique combination of values for the keys defines
       * a separate aggregation instance, which AWS WAF counts and rate-limits individually.
       *
       * You can optionally nest another statement inside the rate-based statement, to narrow the
       * scope of the rule so that it only counts and rate limits requests that match the nested
       * statement. You can use this nested scope-down statement in conjunction with your aggregation
       * key specifications or you can just count and rate limit all requests that match the scope-down
       * statement, without additional aggregation. When you choose to just manage all requests that
       * match a scope-down statement, the aggregation instance is singular for the rule.
       *
       * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
       * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
       * inside a rule group.
       *
       * For additional information about the options, see [Rate limiting web requests using
       * rate-based
       * rules](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html) in the
       * *AWS WAF Developer Guide* .
       *
       * If you only aggregate on the individual IP address or forwarded IP address, you can
       * retrieve the list of IP addresses that AWS WAF is currently rate limiting for a rule through
       * the API call `GetRateBasedStatementManagedKeys` . This option is not available for other
       * aggregation configurations.
       *
       * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
       * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
       * each of the two rule statements represents a separate instance of the rate-based rule and gets
       * its own tracking and management by AWS WAF . If you define a rate-based rule inside a rule
       * group, and then use that rule group in multiple places, each use creates a separate instance
       * of the rate-based rule that gets its own tracking and management by AWS WAF .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bcfd0d44bbb6308f131b368f5d5098eee6e7d23736279eeb92b50311609b4d9")
      override
          fun rateBasedStatement(rateBasedStatement: RateBasedStatementProperty.Builder.() -> Unit):
          Unit = rateBasedStatement(RateBasedStatementProperty(rateBasedStatement))

      /**
       * @param regexMatchStatement A rule statement used to search web request components for a
       * match against a single regular expression.
       */
      override fun regexMatchStatement(regexMatchStatement: IResolvable) {
        cdkBuilder.regexMatchStatement(regexMatchStatement.let(IResolvable::unwrap))
      }

      /**
       * @param regexMatchStatement A rule statement used to search web request components for a
       * match against a single regular expression.
       */
      override fun regexMatchStatement(regexMatchStatement: RegexMatchStatementProperty) {
        cdkBuilder.regexMatchStatement(regexMatchStatement.let(RegexMatchStatementProperty::unwrap))
      }

      /**
       * @param regexMatchStatement A rule statement used to search web request components for a
       * match against a single regular expression.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cab718641bfc23238d998ba962f49b68c7c0ad9ac57e0d1f09949e0da4e506f8")
      override
          fun regexMatchStatement(regexMatchStatement: RegexMatchStatementProperty.Builder.() -> Unit):
          Unit = regexMatchStatement(RegexMatchStatementProperty(regexMatchStatement))

      /**
       * @param regexPatternSetReferenceStatement A rule statement used to search web request
       * components for matches with regular expressions.
       * To use this, create a `RegexPatternSet` that specifies the expressions that you want to
       * detect, then use the ARN of that set in this statement. A web request matches the pattern set
       * rule statement if the request component matches any of the patterns in the set.
       *
       * Each regex pattern set rule statement references a regex pattern set. You create and
       * maintain the set independent of your rules. This allows you to use the single set in multiple
       * rules. When you update the referenced set, AWS WAF automatically updates all rules that
       * reference it.
       */
      override
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: IResolvable) {
        cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement.let(IResolvable::unwrap))
      }

      /**
       * @param regexPatternSetReferenceStatement A rule statement used to search web request
       * components for matches with regular expressions.
       * To use this, create a `RegexPatternSet` that specifies the expressions that you want to
       * detect, then use the ARN of that set in this statement. A web request matches the pattern set
       * rule statement if the request component matches any of the patterns in the set.
       *
       * Each regex pattern set rule statement references a regex pattern set. You create and
       * maintain the set independent of your rules. This allows you to use the single set in multiple
       * rules. When you update the referenced set, AWS WAF automatically updates all rules that
       * reference it.
       */
      override
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty) {
        cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement.let(RegexPatternSetReferenceStatementProperty::unwrap))
      }

      /**
       * @param regexPatternSetReferenceStatement A rule statement used to search web request
       * components for matches with regular expressions.
       * To use this, create a `RegexPatternSet` that specifies the expressions that you want to
       * detect, then use the ARN of that set in this statement. A web request matches the pattern set
       * rule statement if the request component matches any of the patterns in the set.
       *
       * Each regex pattern set rule statement references a regex pattern set. You create and
       * maintain the set independent of your rules. This allows you to use the single set in multiple
       * rules. When you update the referenced set, AWS WAF automatically updates all rules that
       * reference it.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aca9516d1d1380f25cad4dd73b064a09e3e99d316436f6dde2017f23c043a372")
      override
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty.Builder.() -> Unit):
          Unit =
          regexPatternSetReferenceStatement(RegexPatternSetReferenceStatementProperty(regexPatternSetReferenceStatement))

      /**
       * @param sizeConstraintStatement A rule statement that compares a number of bytes against the
       * size of a request component, using a comparison operator, such as greater than (&gt;) or less
       * than (&lt;).
       * For example, you can use a size constraint statement to look for query strings that are
       * longer than 100 bytes.
       *
       * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
       * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
       * limit is 8 KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes).
       * For CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
       * additional fees. If you know that the request body for your web requests should never exceed
       * the inspection limit, you could use a size constraint statement to block requests that have a
       * larger request body size.
       *
       * If you choose URI for the value of Part of the request to filter on, the slash (/) in the
       * URI counts as one character. For example, the URI `/logo.jpg` is nine characters long.
       */
      override fun sizeConstraintStatement(sizeConstraintStatement: IResolvable) {
        cdkBuilder.sizeConstraintStatement(sizeConstraintStatement.let(IResolvable::unwrap))
      }

      /**
       * @param sizeConstraintStatement A rule statement that compares a number of bytes against the
       * size of a request component, using a comparison operator, such as greater than (&gt;) or less
       * than (&lt;).
       * For example, you can use a size constraint statement to look for query strings that are
       * longer than 100 bytes.
       *
       * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
       * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
       * limit is 8 KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes).
       * For CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
       * additional fees. If you know that the request body for your web requests should never exceed
       * the inspection limit, you could use a size constraint statement to block requests that have a
       * larger request body size.
       *
       * If you choose URI for the value of Part of the request to filter on, the slash (/) in the
       * URI counts as one character. For example, the URI `/logo.jpg` is nine characters long.
       */
      override
          fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty) {
        cdkBuilder.sizeConstraintStatement(sizeConstraintStatement.let(SizeConstraintStatementProperty::unwrap))
      }

      /**
       * @param sizeConstraintStatement A rule statement that compares a number of bytes against the
       * size of a request component, using a comparison operator, such as greater than (&gt;) or less
       * than (&lt;).
       * For example, you can use a size constraint statement to look for query strings that are
       * longer than 100 bytes.
       *
       * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
       * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
       * limit is 8 KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes).
       * For CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
       * additional fees. If you know that the request body for your web requests should never exceed
       * the inspection limit, you could use a size constraint statement to block requests that have a
       * larger request body size.
       *
       * If you choose URI for the value of Part of the request to filter on, the slash (/) in the
       * URI counts as one character. For example, the URI `/logo.jpg` is nine characters long.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f70e09b6dff74f1e7a668ab987d9edf5a8b525e88baf4dd3a64c5ba80790b394")
      override
          fun sizeConstraintStatement(sizeConstraintStatement: SizeConstraintStatementProperty.Builder.() -> Unit):
          Unit = sizeConstraintStatement(SizeConstraintStatementProperty(sizeConstraintStatement))

      /**
       * @param sqliMatchStatement A rule statement that inspects for malicious SQL code.
       * Attackers insert malicious SQL code into web requests to do things like modify your
       * database or extract data from it.
       */
      override fun sqliMatchStatement(sqliMatchStatement: IResolvable) {
        cdkBuilder.sqliMatchStatement(sqliMatchStatement.let(IResolvable::unwrap))
      }

      /**
       * @param sqliMatchStatement A rule statement that inspects for malicious SQL code.
       * Attackers insert malicious SQL code into web requests to do things like modify your
       * database or extract data from it.
       */
      override fun sqliMatchStatement(sqliMatchStatement: SqliMatchStatementProperty) {
        cdkBuilder.sqliMatchStatement(sqliMatchStatement.let(SqliMatchStatementProperty::unwrap))
      }

      /**
       * @param sqliMatchStatement A rule statement that inspects for malicious SQL code.
       * Attackers insert malicious SQL code into web requests to do things like modify your
       * database or extract data from it.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0fdab764bc61099312cfe517891cb2231ee5552284f8fd95a4f44fdbb7ddf3f5")
      override
          fun sqliMatchStatement(sqliMatchStatement: SqliMatchStatementProperty.Builder.() -> Unit):
          Unit = sqliMatchStatement(SqliMatchStatementProperty(sqliMatchStatement))

      /**
       * @param xssMatchStatement A rule statement that inspects for cross-site scripting (XSS)
       * attacks.
       * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to
       * inject malicious client-site scripts into other legitimate web browsers.
       */
      override fun xssMatchStatement(xssMatchStatement: IResolvable) {
        cdkBuilder.xssMatchStatement(xssMatchStatement.let(IResolvable::unwrap))
      }

      /**
       * @param xssMatchStatement A rule statement that inspects for cross-site scripting (XSS)
       * attacks.
       * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to
       * inject malicious client-site scripts into other legitimate web browsers.
       */
      override fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty) {
        cdkBuilder.xssMatchStatement(xssMatchStatement.let(XssMatchStatementProperty::unwrap))
      }

      /**
       * @param xssMatchStatement A rule statement that inspects for cross-site scripting (XSS)
       * attacks.
       * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to
       * inject malicious client-site scripts into other legitimate web browsers.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2f50b19cc87986feaf8db81faf794d3554022dd9e71876a010beea7ac2d6210")
      override
          fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty.Builder.() -> Unit):
          Unit = xssMatchStatement(XssMatchStatementProperty(xssMatchStatement))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty,
    ) : StatementProperty {
      /**
       * A logical rule statement used to combine other rule statements with AND logic.
       *
       * You provide more than one `Statement` within the `AndStatement` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-andstatement)
       */
      override fun andStatement(): Any? = unwrap(this).getAndStatement()

      /**
       * A rule statement that defines a string match search for AWS WAF to apply to web requests.
       *
       * The byte match statement provides the bytes to search for, the location in requests that
       * you want AWS WAF to search, and other settings. The bytes to search for are typically a string
       * that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this
       * is called a string match statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-bytematchstatement)
       */
      override fun byteMatchStatement(): Any? = unwrap(this).getByteMatchStatement()

      /**
       * A rule statement that labels web requests by country and region and that matches against
       * web requests based on country code.
       *
       * A geo match rule labels every request that it inspects regardless of whether it finds a
       * match.
       *
       * * To manage requests only by country, you can use this statement by itself and specify the
       * countries that you want to match against in the `CountryCodes` array.
       * * Otherwise, configure your geo match rule with Count action so that it only labels
       * requests. Then, add one or more label match rules to run after the geo match rule and
       * configure them to match against the geographic labels and handle the requests as needed.
       *
       * AWS WAF labels requests using the alpha-2 country and region codes from the International
       * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
       * either the IP address in the web request origin or, if you specify it, the address in the geo
       * match `ForwardedIPConfig` .
       *
       * If you use the web request origin, the label formats are
       * `awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:clientip:geo:country:&lt;ISO country code&gt;` .
       *
       * If you use a forwarded IP address, the label formats are
       * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
       * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
       *
       * For additional details, see [Geographic match rule
       * statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
       * in the [AWS WAF Developer
       * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-geomatchstatement)
       */
      override fun geoMatchStatement(): Any? = unwrap(this).getGeoMatchStatement()

      /**
       * A rule statement used to detect web requests coming from particular IP addresses or address
       * ranges.
       *
       * To use this, create an `IPSet` that specifies the addresses you want to detect, then use
       * the ARN of that set in this statement.
       *
       * Each IP set rule statement references an IP set. You create and maintain the set
       * independent of your rules. This allows you to use the single set in multiple rules. When you
       * update the referenced set, AWS WAF automatically updates all rules that reference it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-ipsetreferencestatement)
       */
      override fun ipSetReferenceStatement(): Any? = unwrap(this).getIpSetReferenceStatement()

      /**
       * A rule statement to match against labels that have been added to the web request by rules
       * that have already run in the web ACL.
       *
       * The label match statement provides the label or namespace string to search for. The label
       * string can represent a part or all of the fully qualified label name that had been added to
       * the web request. Fully qualified labels have a prefix, optional namespaces, and label name.
       * The prefix identifies the rule group or web ACL context of the rule that added the label. If
       * you do not provide the fully qualified name in your label match string, AWS WAF performs the
       * search for labels that were added in the same context as the label match statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-labelmatchstatement)
       */
      override fun labelMatchStatement(): Any? = unwrap(this).getLabelMatchStatement()

      /**
       * A logical rule statement used to negate the results of another rule statement.
       *
       * You provide one `Statement` within the `NotStatement` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-notstatement)
       */
      override fun notStatement(): Any? = unwrap(this).getNotStatement()

      /**
       * A logical rule statement used to combine other rule statements with OR logic.
       *
       * You provide more than one `Statement` within the `OrStatement` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-orstatement)
       */
      override fun orStatement(): Any? = unwrap(this).getOrStatement()

      /**
       * A rate-based rule counts incoming requests and rate limits requests when they are coming at
       * too fast a rate.
       *
       * The rule categorizes requests according to your aggregation criteria, collects them into
       * aggregation instances, and counts and rate limits the requests for each instance.
       *
       *
       * If you change any of these settings in a rule that's currently in use, the change resets
       * the rule's rate limiting counts. This can pause the rule's rate limiting activities for up to
       * a minute.
       *
       *
       * You can specify individual aggregation keys, like IP address or HTTP method. You can also
       * specify aggregation key combinations, like IP address and HTTP method, or HTTP method, query
       * argument, and cookie.
       *
       * Each unique set of values for the aggregation keys that you specify is a separate
       * aggregation instance, with the value from each key contributing to the aggregation instance
       * definition.
       *
       * For example, assume the rule evaluates web requests with the following IP address and HTTP
       * method values:
       *
       * * IP address 10.1.1.1, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       * * IP address 127.0.0.0, HTTP method POST
       * * IP address 10.1.1.1, HTTP method GET
       *
       * The rule would create different aggregation instances according to your aggregation
       * criteria, for example:
       *
       * * If the aggregation criteria is just the IP address, then each individual address is an
       * aggregation instance, and AWS WAF counts requests separately for each. The aggregation
       * instances and request counts for our example would be the following:
       * * IP address 10.1.1.1: count 3
       * * IP address 127.0.0.0: count 1
       * * If the aggregation criteria is HTTP method, then each individual HTTP method is an
       * aggregation instance. The aggregation instances and request counts for our example would be
       * the following:
       * * HTTP method POST: count 2
       * * HTTP method GET: count 2
       * * If the aggregation criteria is IP address and HTTP method, then each IP address and each
       * HTTP method would contribute to the combined aggregation instance. The aggregation instances
       * and request counts for our example would be the following:
       * * IP address 10.1.1.1, HTTP method POST: count 1
       * * IP address 10.1.1.1, HTTP method GET: count 2
       * * IP address 127.0.0.0, HTTP method POST: count 1
       *
       * For any n-tuple of aggregation keys, each unique combination of values for the keys defines
       * a separate aggregation instance, which AWS WAF counts and rate-limits individually.
       *
       * You can optionally nest another statement inside the rate-based statement, to narrow the
       * scope of the rule so that it only counts and rate limits requests that match the nested
       * statement. You can use this nested scope-down statement in conjunction with your aggregation
       * key specifications or you can just count and rate limit all requests that match the scope-down
       * statement, without additional aggregation. When you choose to just manage all requests that
       * match a scope-down statement, the aggregation instance is singular for the rule.
       *
       * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
       * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
       * inside a rule group.
       *
       * For additional information about the options, see [Rate limiting web requests using
       * rate-based
       * rules](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html) in the
       * *AWS WAF Developer Guide* .
       *
       * If you only aggregate on the individual IP address or forwarded IP address, you can
       * retrieve the list of IP addresses that AWS WAF is currently rate limiting for a rule through
       * the API call `GetRateBasedStatementManagedKeys` . This option is not available for other
       * aggregation configurations.
       *
       * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
       * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
       * each of the two rule statements represents a separate instance of the rate-based rule and gets
       * its own tracking and management by AWS WAF . If you define a rate-based rule inside a rule
       * group, and then use that rule group in multiple places, each use creates a separate instance
       * of the rate-based rule that gets its own tracking and management by AWS WAF .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-ratebasedstatement)
       */
      override fun rateBasedStatement(): Any? = unwrap(this).getRateBasedStatement()

      /**
       * A rule statement used to search web request components for a match against a single regular
       * expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-regexmatchstatement)
       */
      override fun regexMatchStatement(): Any? = unwrap(this).getRegexMatchStatement()

      /**
       * A rule statement used to search web request components for matches with regular
       * expressions.
       *
       * To use this, create a `RegexPatternSet` that specifies the expressions that you want to
       * detect, then use the ARN of that set in this statement. A web request matches the pattern set
       * rule statement if the request component matches any of the patterns in the set.
       *
       * Each regex pattern set rule statement references a regex pattern set. You create and
       * maintain the set independent of your rules. This allows you to use the single set in multiple
       * rules. When you update the referenced set, AWS WAF automatically updates all rules that
       * reference it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-regexpatternsetreferencestatement)
       */
      override fun regexPatternSetReferenceStatement(): Any? =
          unwrap(this).getRegexPatternSetReferenceStatement()

      /**
       * A rule statement that compares a number of bytes against the size of a request component,
       * using a comparison operator, such as greater than (&gt;) or less than (&lt;).
       *
       * For example, you can use a size constraint statement to look for query strings that are
       * longer than 100 bytes.
       *
       * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
       * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
       * limit is 8 KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes).
       * For CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
       * additional fees. If you know that the request body for your web requests should never exceed
       * the inspection limit, you could use a size constraint statement to block requests that have a
       * larger request body size.
       *
       * If you choose URI for the value of Part of the request to filter on, the slash (/) in the
       * URI counts as one character. For example, the URI `/logo.jpg` is nine characters long.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-sizeconstraintstatement)
       */
      override fun sizeConstraintStatement(): Any? = unwrap(this).getSizeConstraintStatement()

      /**
       * A rule statement that inspects for malicious SQL code.
       *
       * Attackers insert malicious SQL code into web requests to do things like modify your
       * database or extract data from it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-sqlimatchstatement)
       */
      override fun sqliMatchStatement(): Any? = unwrap(this).getSqliMatchStatement()

      /**
       * A rule statement that inspects for cross-site scripting (XSS) attacks.
       *
       * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to
       * inject malicious client-site scripts into other legitimate web browsers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html#cfn-wafv2-rulegroup-statement-xssmatchstatement)
       */
      override fun xssMatchStatement(): Any? = unwrap(this).getXssMatchStatement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty):
          StatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateBasedStatementCustomKeyProperty {
    /**
     * Use the value of a cookie in the request as an aggregate key.
     *
     * Each distinct value in the cookie contributes to the aggregation instance. If you use a
     * single cookie as your custom key, then each value fully defines an aggregation instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-cookie)
     */
    public fun cookie(): Any? = unwrap(this).getCookie()

    /**
     * Use the first IP address in an HTTP header as an aggregate key.
     *
     * Each distinct forwarded IP address contributes to the aggregation instance.
     *
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at
     * least one other key to use. You can aggregate on only the forwarded IP address by specifying
     * `FORWARDED_IP` in your rate-based statement's `AggregateKeyType` .
     *
     * With this option, you must specify the header to use in the rate-based rule's
     * `ForwardedIPConfig` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-forwardedip)
     */
    public fun forwardedIp(): Any? = unwrap(this).getForwardedIp()

    /**
     * Use the value of a header in the request as an aggregate key.
     *
     * Each distinct value in the header contributes to the aggregation instance. If you use a
     * single header as your custom key, then each value fully defines an aggregation instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-header)
     */
    public fun `header`(): Any? = unwrap(this).getHeader()

    /**
     * Use the request's HTTP method as an aggregate key.
     *
     * Each distinct HTTP method contributes to the aggregation instance. If you use just the HTTP
     * method as your custom key, then each method fully defines an aggregation instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-httpmethod)
     */
    public fun httpMethod(): Any? = unwrap(this).getHttpMethod()

    /**
     * Use the request's originating IP address as an aggregate key. Each distinct IP address
     * contributes to the aggregation instance.
     *
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at
     * least one other key to use. You can aggregate on only the IP address by specifying `IP` in your
     * rate-based statement's `AggregateKeyType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-ip)
     */
    public fun ip(): Any? = unwrap(this).getIp()

    /**
     * Use the specified label namespace as an aggregate key.
     *
     * Each distinct fully qualified label name that has the specified label namespace contributes
     * to the aggregation instance. If you use just one label namespace as your custom key, then each
     * label name fully defines an aggregation instance.
     *
     * This uses only labels that have been added to the request by rules that are evaluated before
     * this rate-based rule in the web ACL.
     *
     * For information about label namespaces and names, see [Label syntax and naming
     * requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
     * in the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-labelnamespace)
     */
    public fun labelNamespace(): Any? = unwrap(this).getLabelNamespace()

    /**
     * Use the specified query argument as an aggregate key.
     *
     * Each distinct value for the named query argument contributes to the aggregation instance. If
     * you use a single query argument as your custom key, then each value fully defines an aggregation
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-queryargument)
     */
    public fun queryArgument(): Any? = unwrap(this).getQueryArgument()

    /**
     * Use the request's query string as an aggregate key.
     *
     * Each distinct string contributes to the aggregation instance. If you use just the query
     * string as your custom key, then each string fully defines an aggregation instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-querystring)
     */
    public fun queryString(): Any? = unwrap(this).getQueryString()

    /**
     * Use the request's URI path as an aggregate key.
     *
     * Each distinct URI path contributes to the aggregation instance. If you use just the URI path
     * as your custom key, then each URI path fully defines an aggregation instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-uripath)
     */
    public fun uriPath(): Any? = unwrap(this).getUriPath()

    /**
     * A builder for [RateBasedStatementCustomKeyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cookie Use the value of a cookie in the request as an aggregate key.
       * Each distinct value in the cookie contributes to the aggregation instance. If you use a
       * single cookie as your custom key, then each value fully defines an aggregation instance.
       */
      public fun cookie(cookie: IResolvable)

      /**
       * @param cookie Use the value of a cookie in the request as an aggregate key.
       * Each distinct value in the cookie contributes to the aggregation instance. If you use a
       * single cookie as your custom key, then each value fully defines an aggregation instance.
       */
      public fun cookie(cookie: RateLimitCookieProperty)

      /**
       * @param cookie Use the value of a cookie in the request as an aggregate key.
       * Each distinct value in the cookie contributes to the aggregation instance. If you use a
       * single cookie as your custom key, then each value fully defines an aggregation instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55b22f42f92ee4166d1cbe6d228ecd33bfc2230078ba6aecf45580ab50cb5ff5")
      public fun cookie(cookie: RateLimitCookieProperty.Builder.() -> Unit)

      /**
       * @param forwardedIp Use the first IP address in an HTTP header as an aggregate key.
       * Each distinct forwarded IP address contributes to the aggregation instance.
       *
       * When you specify an IP or forwarded IP in the custom key settings, you must also specify at
       * least one other key to use. You can aggregate on only the forwarded IP address by specifying
       * `FORWARDED_IP` in your rate-based statement's `AggregateKeyType` .
       *
       * With this option, you must specify the header to use in the rate-based rule's
       * `ForwardedIPConfig` property.
       */
      public fun forwardedIp(forwardedIp: Any)

      /**
       * @param header Use the value of a header in the request as an aggregate key.
       * Each distinct value in the header contributes to the aggregation instance. If you use a
       * single header as your custom key, then each value fully defines an aggregation instance.
       */
      public fun `header`(`header`: IResolvable)

      /**
       * @param header Use the value of a header in the request as an aggregate key.
       * Each distinct value in the header contributes to the aggregation instance. If you use a
       * single header as your custom key, then each value fully defines an aggregation instance.
       */
      public fun `header`(`header`: RateLimitHeaderProperty)

      /**
       * @param header Use the value of a header in the request as an aggregate key.
       * Each distinct value in the header contributes to the aggregation instance. If you use a
       * single header as your custom key, then each value fully defines an aggregation instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6562f2228682bc6e2b661e4b54548c2c1d088540942ab6fd64ad3050c8f4cf74")
      public fun `header`(`header`: RateLimitHeaderProperty.Builder.() -> Unit)

      /**
       * @param httpMethod Use the request's HTTP method as an aggregate key.
       * Each distinct HTTP method contributes to the aggregation instance. If you use just the HTTP
       * method as your custom key, then each method fully defines an aggregation instance.
       */
      public fun httpMethod(httpMethod: Any)

      /**
       * @param ip Use the request's originating IP address as an aggregate key. Each distinct IP
       * address contributes to the aggregation instance.
       * When you specify an IP or forwarded IP in the custom key settings, you must also specify at
       * least one other key to use. You can aggregate on only the IP address by specifying `IP` in
       * your rate-based statement's `AggregateKeyType` .
       */
      public fun ip(ip: Any)

      /**
       * @param labelNamespace Use the specified label namespace as an aggregate key.
       * Each distinct fully qualified label name that has the specified label namespace contributes
       * to the aggregation instance. If you use just one label namespace as your custom key, then each
       * label name fully defines an aggregation instance.
       *
       * This uses only labels that have been added to the request by rules that are evaluated
       * before this rate-based rule in the web ACL.
       *
       * For information about label namespaces and names, see [Label syntax and naming
       * requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun labelNamespace(labelNamespace: IResolvable)

      /**
       * @param labelNamespace Use the specified label namespace as an aggregate key.
       * Each distinct fully qualified label name that has the specified label namespace contributes
       * to the aggregation instance. If you use just one label namespace as your custom key, then each
       * label name fully defines an aggregation instance.
       *
       * This uses only labels that have been added to the request by rules that are evaluated
       * before this rate-based rule in the web ACL.
       *
       * For information about label namespaces and names, see [Label syntax and naming
       * requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun labelNamespace(labelNamespace: RateLimitLabelNamespaceProperty)

      /**
       * @param labelNamespace Use the specified label namespace as an aggregate key.
       * Each distinct fully qualified label name that has the specified label namespace contributes
       * to the aggregation instance. If you use just one label namespace as your custom key, then each
       * label name fully defines an aggregation instance.
       *
       * This uses only labels that have been added to the request by rules that are evaluated
       * before this rate-based rule in the web ACL.
       *
       * For information about label namespaces and names, see [Label syntax and naming
       * requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
       * in the *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("462f6556cda43ce02a198ec04c8a27523800fea2a014292d9ef2127f8fd03f0f")
      public fun labelNamespace(labelNamespace: RateLimitLabelNamespaceProperty.Builder.() -> Unit)

      /**
       * @param queryArgument Use the specified query argument as an aggregate key.
       * Each distinct value for the named query argument contributes to the aggregation instance.
       * If you use a single query argument as your custom key, then each value fully defines an
       * aggregation instance.
       */
      public fun queryArgument(queryArgument: IResolvable)

      /**
       * @param queryArgument Use the specified query argument as an aggregate key.
       * Each distinct value for the named query argument contributes to the aggregation instance.
       * If you use a single query argument as your custom key, then each value fully defines an
       * aggregation instance.
       */
      public fun queryArgument(queryArgument: RateLimitQueryArgumentProperty)

      /**
       * @param queryArgument Use the specified query argument as an aggregate key.
       * Each distinct value for the named query argument contributes to the aggregation instance.
       * If you use a single query argument as your custom key, then each value fully defines an
       * aggregation instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a419c7be9e091c68d11d4693299510992345a72ec91adfd3873158c2a34fbea8")
      public fun queryArgument(queryArgument: RateLimitQueryArgumentProperty.Builder.() -> Unit)

      /**
       * @param queryString Use the request's query string as an aggregate key.
       * Each distinct string contributes to the aggregation instance. If you use just the query
       * string as your custom key, then each string fully defines an aggregation instance.
       */
      public fun queryString(queryString: IResolvable)

      /**
       * @param queryString Use the request's query string as an aggregate key.
       * Each distinct string contributes to the aggregation instance. If you use just the query
       * string as your custom key, then each string fully defines an aggregation instance.
       */
      public fun queryString(queryString: RateLimitQueryStringProperty)

      /**
       * @param queryString Use the request's query string as an aggregate key.
       * Each distinct string contributes to the aggregation instance. If you use just the query
       * string as your custom key, then each string fully defines an aggregation instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b69b326274f5afdd3f4e88bfefaed942d4dbb5cb89d76a227030e75e241db0e")
      public fun queryString(queryString: RateLimitQueryStringProperty.Builder.() -> Unit)

      /**
       * @param uriPath Use the request's URI path as an aggregate key.
       * Each distinct URI path contributes to the aggregation instance. If you use just the URI
       * path as your custom key, then each URI path fully defines an aggregation instance.
       */
      public fun uriPath(uriPath: IResolvable)

      /**
       * @param uriPath Use the request's URI path as an aggregate key.
       * Each distinct URI path contributes to the aggregation instance. If you use just the URI
       * path as your custom key, then each URI path fully defines an aggregation instance.
       */
      public fun uriPath(uriPath: RateLimitUriPathProperty)

      /**
       * @param uriPath Use the request's URI path as an aggregate key.
       * Each distinct URI path contributes to the aggregation instance. If you use just the URI
       * path as your custom key, then each URI path fully defines an aggregation instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f5655c6137be95b34ce4ab64e46b98f147382c959051b102e0061024707e3ec")
      public fun uriPath(uriPath: RateLimitUriPathProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty.builder()

      /**
       * @param cookie Use the value of a cookie in the request as an aggregate key.
       * Each distinct value in the cookie contributes to the aggregation instance. If you use a
       * single cookie as your custom key, then each value fully defines an aggregation instance.
       */
      override fun cookie(cookie: IResolvable) {
        cdkBuilder.cookie(cookie.let(IResolvable::unwrap))
      }

      /**
       * @param cookie Use the value of a cookie in the request as an aggregate key.
       * Each distinct value in the cookie contributes to the aggregation instance. If you use a
       * single cookie as your custom key, then each value fully defines an aggregation instance.
       */
      override fun cookie(cookie: RateLimitCookieProperty) {
        cdkBuilder.cookie(cookie.let(RateLimitCookieProperty::unwrap))
      }

      /**
       * @param cookie Use the value of a cookie in the request as an aggregate key.
       * Each distinct value in the cookie contributes to the aggregation instance. If you use a
       * single cookie as your custom key, then each value fully defines an aggregation instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55b22f42f92ee4166d1cbe6d228ecd33bfc2230078ba6aecf45580ab50cb5ff5")
      override fun cookie(cookie: RateLimitCookieProperty.Builder.() -> Unit): Unit =
          cookie(RateLimitCookieProperty(cookie))

      /**
       * @param forwardedIp Use the first IP address in an HTTP header as an aggregate key.
       * Each distinct forwarded IP address contributes to the aggregation instance.
       *
       * When you specify an IP or forwarded IP in the custom key settings, you must also specify at
       * least one other key to use. You can aggregate on only the forwarded IP address by specifying
       * `FORWARDED_IP` in your rate-based statement's `AggregateKeyType` .
       *
       * With this option, you must specify the header to use in the rate-based rule's
       * `ForwardedIPConfig` property.
       */
      override fun forwardedIp(forwardedIp: Any) {
        cdkBuilder.forwardedIp(forwardedIp)
      }

      /**
       * @param header Use the value of a header in the request as an aggregate key.
       * Each distinct value in the header contributes to the aggregation instance. If you use a
       * single header as your custom key, then each value fully defines an aggregation instance.
       */
      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      /**
       * @param header Use the value of a header in the request as an aggregate key.
       * Each distinct value in the header contributes to the aggregation instance. If you use a
       * single header as your custom key, then each value fully defines an aggregation instance.
       */
      override fun `header`(`header`: RateLimitHeaderProperty) {
        cdkBuilder.`header`(`header`.let(RateLimitHeaderProperty::unwrap))
      }

      /**
       * @param header Use the value of a header in the request as an aggregate key.
       * Each distinct value in the header contributes to the aggregation instance. If you use a
       * single header as your custom key, then each value fully defines an aggregation instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6562f2228682bc6e2b661e4b54548c2c1d088540942ab6fd64ad3050c8f4cf74")
      override fun `header`(`header`: RateLimitHeaderProperty.Builder.() -> Unit): Unit =
          `header`(RateLimitHeaderProperty(`header`))

      /**
       * @param httpMethod Use the request's HTTP method as an aggregate key.
       * Each distinct HTTP method contributes to the aggregation instance. If you use just the HTTP
       * method as your custom key, then each method fully defines an aggregation instance.
       */
      override fun httpMethod(httpMethod: Any) {
        cdkBuilder.httpMethod(httpMethod)
      }

      /**
       * @param ip Use the request's originating IP address as an aggregate key. Each distinct IP
       * address contributes to the aggregation instance.
       * When you specify an IP or forwarded IP in the custom key settings, you must also specify at
       * least one other key to use. You can aggregate on only the IP address by specifying `IP` in
       * your rate-based statement's `AggregateKeyType` .
       */
      override fun ip(ip: Any) {
        cdkBuilder.ip(ip)
      }

      /**
       * @param labelNamespace Use the specified label namespace as an aggregate key.
       * Each distinct fully qualified label name that has the specified label namespace contributes
       * to the aggregation instance. If you use just one label namespace as your custom key, then each
       * label name fully defines an aggregation instance.
       *
       * This uses only labels that have been added to the request by rules that are evaluated
       * before this rate-based rule in the web ACL.
       *
       * For information about label namespaces and names, see [Label syntax and naming
       * requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun labelNamespace(labelNamespace: IResolvable) {
        cdkBuilder.labelNamespace(labelNamespace.let(IResolvable::unwrap))
      }

      /**
       * @param labelNamespace Use the specified label namespace as an aggregate key.
       * Each distinct fully qualified label name that has the specified label namespace contributes
       * to the aggregation instance. If you use just one label namespace as your custom key, then each
       * label name fully defines an aggregation instance.
       *
       * This uses only labels that have been added to the request by rules that are evaluated
       * before this rate-based rule in the web ACL.
       *
       * For information about label namespaces and names, see [Label syntax and naming
       * requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun labelNamespace(labelNamespace: RateLimitLabelNamespaceProperty) {
        cdkBuilder.labelNamespace(labelNamespace.let(RateLimitLabelNamespaceProperty::unwrap))
      }

      /**
       * @param labelNamespace Use the specified label namespace as an aggregate key.
       * Each distinct fully qualified label name that has the specified label namespace contributes
       * to the aggregation instance. If you use just one label namespace as your custom key, then each
       * label name fully defines an aggregation instance.
       *
       * This uses only labels that have been added to the request by rules that are evaluated
       * before this rate-based rule in the web ACL.
       *
       * For information about label namespaces and names, see [Label syntax and naming
       * requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
       * in the *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("462f6556cda43ce02a198ec04c8a27523800fea2a014292d9ef2127f8fd03f0f")
      override
          fun labelNamespace(labelNamespace: RateLimitLabelNamespaceProperty.Builder.() -> Unit):
          Unit = labelNamespace(RateLimitLabelNamespaceProperty(labelNamespace))

      /**
       * @param queryArgument Use the specified query argument as an aggregate key.
       * Each distinct value for the named query argument contributes to the aggregation instance.
       * If you use a single query argument as your custom key, then each value fully defines an
       * aggregation instance.
       */
      override fun queryArgument(queryArgument: IResolvable) {
        cdkBuilder.queryArgument(queryArgument.let(IResolvable::unwrap))
      }

      /**
       * @param queryArgument Use the specified query argument as an aggregate key.
       * Each distinct value for the named query argument contributes to the aggregation instance.
       * If you use a single query argument as your custom key, then each value fully defines an
       * aggregation instance.
       */
      override fun queryArgument(queryArgument: RateLimitQueryArgumentProperty) {
        cdkBuilder.queryArgument(queryArgument.let(RateLimitQueryArgumentProperty::unwrap))
      }

      /**
       * @param queryArgument Use the specified query argument as an aggregate key.
       * Each distinct value for the named query argument contributes to the aggregation instance.
       * If you use a single query argument as your custom key, then each value fully defines an
       * aggregation instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a419c7be9e091c68d11d4693299510992345a72ec91adfd3873158c2a34fbea8")
      override fun queryArgument(queryArgument: RateLimitQueryArgumentProperty.Builder.() -> Unit):
          Unit = queryArgument(RateLimitQueryArgumentProperty(queryArgument))

      /**
       * @param queryString Use the request's query string as an aggregate key.
       * Each distinct string contributes to the aggregation instance. If you use just the query
       * string as your custom key, then each string fully defines an aggregation instance.
       */
      override fun queryString(queryString: IResolvable) {
        cdkBuilder.queryString(queryString.let(IResolvable::unwrap))
      }

      /**
       * @param queryString Use the request's query string as an aggregate key.
       * Each distinct string contributes to the aggregation instance. If you use just the query
       * string as your custom key, then each string fully defines an aggregation instance.
       */
      override fun queryString(queryString: RateLimitQueryStringProperty) {
        cdkBuilder.queryString(queryString.let(RateLimitQueryStringProperty::unwrap))
      }

      /**
       * @param queryString Use the request's query string as an aggregate key.
       * Each distinct string contributes to the aggregation instance. If you use just the query
       * string as your custom key, then each string fully defines an aggregation instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b69b326274f5afdd3f4e88bfefaed942d4dbb5cb89d76a227030e75e241db0e")
      override fun queryString(queryString: RateLimitQueryStringProperty.Builder.() -> Unit): Unit =
          queryString(RateLimitQueryStringProperty(queryString))

      /**
       * @param uriPath Use the request's URI path as an aggregate key.
       * Each distinct URI path contributes to the aggregation instance. If you use just the URI
       * path as your custom key, then each URI path fully defines an aggregation instance.
       */
      override fun uriPath(uriPath: IResolvable) {
        cdkBuilder.uriPath(uriPath.let(IResolvable::unwrap))
      }

      /**
       * @param uriPath Use the request's URI path as an aggregate key.
       * Each distinct URI path contributes to the aggregation instance. If you use just the URI
       * path as your custom key, then each URI path fully defines an aggregation instance.
       */
      override fun uriPath(uriPath: RateLimitUriPathProperty) {
        cdkBuilder.uriPath(uriPath.let(RateLimitUriPathProperty::unwrap))
      }

      /**
       * @param uriPath Use the request's URI path as an aggregate key.
       * Each distinct URI path contributes to the aggregation instance. If you use just the URI
       * path as your custom key, then each URI path fully defines an aggregation instance.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f5655c6137be95b34ce4ab64e46b98f147382c959051b102e0061024707e3ec")
      override fun uriPath(uriPath: RateLimitUriPathProperty.Builder.() -> Unit): Unit =
          uriPath(RateLimitUriPathProperty(uriPath))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty,
    ) : RateBasedStatementCustomKeyProperty {
      /**
       * Use the value of a cookie in the request as an aggregate key.
       *
       * Each distinct value in the cookie contributes to the aggregation instance. If you use a
       * single cookie as your custom key, then each value fully defines an aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-cookie)
       */
      override fun cookie(): Any? = unwrap(this).getCookie()

      /**
       * Use the first IP address in an HTTP header as an aggregate key.
       *
       * Each distinct forwarded IP address contributes to the aggregation instance.
       *
       * When you specify an IP or forwarded IP in the custom key settings, you must also specify at
       * least one other key to use. You can aggregate on only the forwarded IP address by specifying
       * `FORWARDED_IP` in your rate-based statement's `AggregateKeyType` .
       *
       * With this option, you must specify the header to use in the rate-based rule's
       * `ForwardedIPConfig` property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-forwardedip)
       */
      override fun forwardedIp(): Any? = unwrap(this).getForwardedIp()

      /**
       * Use the value of a header in the request as an aggregate key.
       *
       * Each distinct value in the header contributes to the aggregation instance. If you use a
       * single header as your custom key, then each value fully defines an aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-header)
       */
      override fun `header`(): Any? = unwrap(this).getHeader()

      /**
       * Use the request's HTTP method as an aggregate key.
       *
       * Each distinct HTTP method contributes to the aggregation instance. If you use just the HTTP
       * method as your custom key, then each method fully defines an aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-httpmethod)
       */
      override fun httpMethod(): Any? = unwrap(this).getHttpMethod()

      /**
       * Use the request's originating IP address as an aggregate key. Each distinct IP address
       * contributes to the aggregation instance.
       *
       * When you specify an IP or forwarded IP in the custom key settings, you must also specify at
       * least one other key to use. You can aggregate on only the IP address by specifying `IP` in
       * your rate-based statement's `AggregateKeyType` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-ip)
       */
      override fun ip(): Any? = unwrap(this).getIp()

      /**
       * Use the specified label namespace as an aggregate key.
       *
       * Each distinct fully qualified label name that has the specified label namespace contributes
       * to the aggregation instance. If you use just one label namespace as your custom key, then each
       * label name fully defines an aggregation instance.
       *
       * This uses only labels that have been added to the request by rules that are evaluated
       * before this rate-based rule in the web ACL.
       *
       * For information about label namespaces and names, see [Label syntax and naming
       * requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
       * in the *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-labelnamespace)
       */
      override fun labelNamespace(): Any? = unwrap(this).getLabelNamespace()

      /**
       * Use the specified query argument as an aggregate key.
       *
       * Each distinct value for the named query argument contributes to the aggregation instance.
       * If you use a single query argument as your custom key, then each value fully defines an
       * aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-queryargument)
       */
      override fun queryArgument(): Any? = unwrap(this).getQueryArgument()

      /**
       * Use the request's query string as an aggregate key.
       *
       * Each distinct string contributes to the aggregation instance. If you use just the query
       * string as your custom key, then each string fully defines an aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-querystring)
       */
      override fun queryString(): Any? = unwrap(this).getQueryString()

      /**
       * Use the request's URI path as an aggregate key.
       *
       * Each distinct URI path contributes to the aggregation instance. If you use just the URI
       * path as your custom key, then each URI path fully defines an aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html#cfn-wafv2-rulegroup-ratebasedstatementcustomkey-uripath)
       */
      override fun uriPath(): Any? = unwrap(this).getUriPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RateBasedStatementCustomKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty):
          RateBasedStatementCustomKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateBasedStatementCustomKeyProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementCustomKeyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IPSetForwardedIPConfigurationProperty {
    /**
     * The match status to assign to the web request if the request doesn't have a valid IP address
     * in the specified position.
     *
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     *
     * You can specify the following fallback behaviors:
     *
     * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
     * action to the request.
     * * `NO_MATCH` - Treat the web request as not matching the rule statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetforwardedipconfiguration.html#cfn-wafv2-rulegroup-ipsetforwardedipconfiguration-fallbackbehavior)
     */
    public fun fallbackBehavior(): String

    /**
     * The name of the HTTP header to use for the IP address.
     *
     * For example, to use the X-Forwarded-For (XFF) header, set this to `X-Forwarded-For` .
     *
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetforwardedipconfiguration.html#cfn-wafv2-rulegroup-ipsetforwardedipconfiguration-headername)
     */
    public fun headerName(): String

    /**
     * The position in the header to search for the IP address.
     *
     * The header can contain IP addresses of the original client and also of proxies. For example,
     * the header value could be `10.1.1.1, 127.0.0.0, 10.10.10.10` where the first IP address
     * identifies the original client and the rest identify proxies that the request went through.
     *
     * The options for this setting are the following:
     *
     * * FIRST - Inspect the first IP address in the list of IP addresses in the header. This is
     * usually the client's original IP.
     * * LAST - Inspect the last IP address in the list of IP addresses in the header.
     * * ANY - Inspect all IP addresses in the header for a match. If the header contains more than
     * 10 IP addresses, AWS WAF inspects the last 10.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetforwardedipconfiguration.html#cfn-wafv2-rulegroup-ipsetforwardedipconfiguration-position)
     */
    public fun position(): String

    /**
     * A builder for [IPSetForwardedIPConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fallbackBehavior The match status to assign to the web request if the request
       * doesn't have a valid IP address in the specified position. 
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * You can specify the following fallback behaviors:
       *
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       */
      public fun fallbackBehavior(fallbackBehavior: String)

      /**
       * @param headerName The name of the HTTP header to use for the IP address. 
       * For example, to use the X-Forwarded-For (XFF) header, set this to `X-Forwarded-For` .
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      public fun headerName(headerName: String)

      /**
       * @param position The position in the header to search for the IP address. 
       * The header can contain IP addresses of the original client and also of proxies. For
       * example, the header value could be `10.1.1.1, 127.0.0.0, 10.10.10.10` where the first IP
       * address identifies the original client and the rest identify proxies that the request went
       * through.
       *
       * The options for this setting are the following:
       *
       * * FIRST - Inspect the first IP address in the list of IP addresses in the header. This is
       * usually the client's original IP.
       * * LAST - Inspect the last IP address in the list of IP addresses in the header.
       * * ANY - Inspect all IP addresses in the header for a match. If the header contains more
       * than 10 IP addresses, AWS WAF inspects the last 10.
       */
      public fun position(position: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty.builder()

      /**
       * @param fallbackBehavior The match status to assign to the web request if the request
       * doesn't have a valid IP address in the specified position. 
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * You can specify the following fallback behaviors:
       *
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       */
      override fun fallbackBehavior(fallbackBehavior: String) {
        cdkBuilder.fallbackBehavior(fallbackBehavior)
      }

      /**
       * @param headerName The name of the HTTP header to use for the IP address. 
       * For example, to use the X-Forwarded-For (XFF) header, set this to `X-Forwarded-For` .
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      /**
       * @param position The position in the header to search for the IP address. 
       * The header can contain IP addresses of the original client and also of proxies. For
       * example, the header value could be `10.1.1.1, 127.0.0.0, 10.10.10.10` where the first IP
       * address identifies the original client and the rest identify proxies that the request went
       * through.
       *
       * The options for this setting are the following:
       *
       * * FIRST - Inspect the first IP address in the list of IP addresses in the header. This is
       * usually the client's original IP.
       * * LAST - Inspect the last IP address in the list of IP addresses in the header.
       * * ANY - Inspect all IP addresses in the header for a match. If the header contains more
       * than 10 IP addresses, AWS WAF inspects the last 10.
       */
      override fun position(position: String) {
        cdkBuilder.position(position)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty,
    ) : IPSetForwardedIPConfigurationProperty {
      /**
       * The match status to assign to the web request if the request doesn't have a valid IP
       * address in the specified position.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * You can specify the following fallback behaviors:
       *
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetforwardedipconfiguration.html#cfn-wafv2-rulegroup-ipsetforwardedipconfiguration-fallbackbehavior)
       */
      override fun fallbackBehavior(): String = unwrap(this).getFallbackBehavior()

      /**
       * The name of the HTTP header to use for the IP address.
       *
       * For example, to use the X-Forwarded-For (XFF) header, set this to `X-Forwarded-For` .
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetforwardedipconfiguration.html#cfn-wafv2-rulegroup-ipsetforwardedipconfiguration-headername)
       */
      override fun headerName(): String = unwrap(this).getHeaderName()

      /**
       * The position in the header to search for the IP address.
       *
       * The header can contain IP addresses of the original client and also of proxies. For
       * example, the header value could be `10.1.1.1, 127.0.0.0, 10.10.10.10` where the first IP
       * address identifies the original client and the rest identify proxies that the request went
       * through.
       *
       * The options for this setting are the following:
       *
       * * FIRST - Inspect the first IP address in the list of IP addresses in the header. This is
       * usually the client's original IP.
       * * LAST - Inspect the last IP address in the list of IP addresses in the header.
       * * ANY - Inspect all IP addresses in the header for a match. If the header contains more
       * than 10 IP addresses, AWS WAF inspects the last 10.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetforwardedipconfiguration.html#cfn-wafv2-rulegroup-ipsetforwardedipconfiguration-position)
       */
      override fun position(): String = unwrap(this).getPosition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IPSetForwardedIPConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty):
          IPSetForwardedIPConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetForwardedIPConfigurationProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetForwardedIPConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IPSetReferenceStatementProperty {
    /**
     * The Amazon Resource Name (ARN) of the `IPSet` that this statement references.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetreferencestatement.html#cfn-wafv2-rulegroup-ipsetreferencestatement-arn)
     */
    public fun arn(): String

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of
     * using the IP address that's reported by the web request origin.
     *
     * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
     *
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetreferencestatement.html#cfn-wafv2-rulegroup-ipsetreferencestatement-ipsetforwardedipconfig)
     */
    public fun ipSetForwardedIpConfig(): Any? = unwrap(this).getIpSetForwardedIpConfig()

    /**
     * A builder for [IPSetReferenceStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the `IPSet` that this statement references. 
       */
      public fun arn(arn: String)

      /**
       * @param ipSetForwardedIpConfig The configuration for inspecting IP addresses in an HTTP
       * header that you specify, instead of using the IP address that's reported by the web request
       * origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      public fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IResolvable)

      /**
       * @param ipSetForwardedIpConfig The configuration for inspecting IP addresses in an HTTP
       * header that you specify, instead of using the IP address that's reported by the web request
       * origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      public
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty)

      /**
       * @param ipSetForwardedIpConfig The configuration for inspecting IP addresses in an HTTP
       * header that you specify, instead of using the IP address that's reported by the web request
       * origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fee0efc830f80625d95a91debb07093187d37f3a8db09be387f35560590f0d96")
      public
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the `IPSet` that this statement references. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param ipSetForwardedIpConfig The configuration for inspecting IP addresses in an HTTP
       * header that you specify, instead of using the IP address that's reported by the web request
       * origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      override fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IResolvable) {
        cdkBuilder.ipSetForwardedIpConfig(ipSetForwardedIpConfig.let(IResolvable::unwrap))
      }

      /**
       * @param ipSetForwardedIpConfig The configuration for inspecting IP addresses in an HTTP
       * header that you specify, instead of using the IP address that's reported by the web request
       * origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      override
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty) {
        cdkBuilder.ipSetForwardedIpConfig(ipSetForwardedIpConfig.let(IPSetForwardedIPConfigurationProperty::unwrap))
      }

      /**
       * @param ipSetForwardedIpConfig The configuration for inspecting IP addresses in an HTTP
       * header that you specify, instead of using the IP address that's reported by the web request
       * origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fee0efc830f80625d95a91debb07093187d37f3a8db09be387f35560590f0d96")
      override
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty.Builder.() -> Unit):
          Unit =
          ipSetForwardedIpConfig(IPSetForwardedIPConfigurationProperty(ipSetForwardedIpConfig))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty,
    ) : IPSetReferenceStatementProperty {
      /**
       * The Amazon Resource Name (ARN) of the `IPSet` that this statement references.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetreferencestatement.html#cfn-wafv2-rulegroup-ipsetreferencestatement-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * The configuration for inspecting IP addresses in an HTTP header that you specify, instead
       * of using the IP address that's reported by the web request origin.
       *
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetreferencestatement.html#cfn-wafv2-rulegroup-ipsetreferencestatement-ipsetforwardedipconfig)
       */
      override fun ipSetForwardedIpConfig(): Any? = unwrap(this).getIpSetForwardedIpConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetReferenceStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty):
          IPSetReferenceStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetReferenceStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OrStatementProperty {
    /**
     * The statements to combine with OR logic.
     *
     * You can use any statements that can be nested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatement.html#cfn-wafv2-rulegroup-orstatement-statements)
     */
    public fun statements(): Any

    /**
     * A builder for [OrStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param statements The statements to combine with OR logic. 
       * You can use any statements that can be nested.
       */
      public fun statements(statements: IResolvable)

      /**
       * @param statements The statements to combine with OR logic. 
       * You can use any statements that can be nested.
       */
      public fun statements(statements: List<Any>)

      /**
       * @param statements The statements to combine with OR logic. 
       * You can use any statements that can be nested.
       */
      public fun statements(vararg statements: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty.builder()

      /**
       * @param statements The statements to combine with OR logic. 
       * You can use any statements that can be nested.
       */
      override fun statements(statements: IResolvable) {
        cdkBuilder.statements(statements.let(IResolvable::unwrap))
      }

      /**
       * @param statements The statements to combine with OR logic. 
       * You can use any statements that can be nested.
       */
      override fun statements(statements: List<Any>) {
        cdkBuilder.statements(statements)
      }

      /**
       * @param statements The statements to combine with OR logic. 
       * You can use any statements that can be nested.
       */
      override fun statements(vararg statements: Any): Unit = statements(statements.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty,
    ) : OrStatementProperty {
      /**
       * The statements to combine with OR logic.
       *
       * You can use any statements that can be nested.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatement.html#cfn-wafv2-rulegroup-orstatement-statements)
       */
      override fun statements(): Any = unwrap(this).getStatements()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OrStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty):
          OrStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ByteMatchStatementProperty {
    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-fieldtomatch)
     */
    public fun fieldToMatch(): Any

    /**
     * The area within the portion of the web request that you want AWS WAF to search for
     * `SearchString` .
     *
     * Valid values include the following:
     *
     * *CONTAINS*
     *
     * The specified part of the web request must include the value of `SearchString` , but the
     * location doesn't matter.
     *
     * *CONTAINS_WORD*
     *
     * The specified part of the web request must include the value of `SearchString` , and
     * `SearchString` must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, `SearchString` must be a word, which means that both of the following are true:
     *
     * * `SearchString` is at the beginning of the specified part of the web request or is preceded
     * by a character other than an alphanumeric character or underscore (_). Examples include the
     * value of a header and `;BadBot` .
     * * `SearchString` is at the end of the specified part of the web request or is followed by a
     * character other than an alphanumeric character or underscore (_), for example, `BadBot;` and
     * `-BadBot;` .
     *
     * *EXACTLY*
     *
     * The value of the specified part of the web request must exactly match the value of
     * `SearchString` .
     *
     * *STARTS_WITH*
     *
     * The value of `SearchString` must appear at the beginning of the specified part of the web
     * request.
     *
     * *ENDS_WITH*
     *
     * The value of `SearchString` must appear at the end of the specified part of the web request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-positionalconstraint)
     */
    public fun positionalConstraint(): String

    /**
     * A string value that you want AWS WAF to search for.
     *
     * AWS WAF searches only in the part of web requests that you designate for inspection in
     * `FieldToMatch` . The maximum length of the value is 200 bytes. For alphabetic characters A-Z and
     * a-z, the value is case sensitive.
     *
     * Don't encode this string. Provide the value that you want AWS WAF to search for. AWS
     * CloudFormation automatically base64 encodes the value for you.
     *
     * For example, suppose the value of `Type` is `HEADER` and the value of `Data` is `User-Agent`
     * . If you want to search the `User-Agent` header for the value `BadBot` , you provide the string
     * `BadBot` in the value of `SearchString` .
     *
     * You must specify either `SearchString` or `SearchStringBase64` in a `ByteMatchStatement` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstring)
     */
    public fun searchString(): String? = unwrap(this).getSearchString()

    /**
     * String to search for in a web request component, base64-encoded.
     *
     * If you don't want to encode the string, specify the unencoded value in `SearchString`
     * instead.
     *
     * You must specify either `SearchString` or `SearchStringBase64` in a `ByteMatchStatement` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstringbase64)
     */
    public fun searchStringBase64(): String? = unwrap(this).getSearchStringBase64()

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by `FieldToMatch` , starting
     * from the lowest priority setting, before inspecting the content for a match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [ByteMatchStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: IResolvable)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdd402302b29c1a81a7d3bbe74b2e07df195a1a2ecc79ad6adf6b9023a48487c")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      /**
       * @param positionalConstraint The area within the portion of the web request that you want
       * AWS WAF to search for `SearchString` . 
       * Valid values include the following:
       *
       * *CONTAINS*
       *
       * The specified part of the web request must include the value of `SearchString` , but the
       * location doesn't matter.
       *
       * *CONTAINS_WORD*
       *
       * The specified part of the web request must include the value of `SearchString` , and
       * `SearchString` must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
       * In addition, `SearchString` must be a word, which means that both of the following are true:
       *
       * * `SearchString` is at the beginning of the specified part of the web request or is
       * preceded by a character other than an alphanumeric character or underscore (_). Examples
       * include the value of a header and `;BadBot` .
       * * `SearchString` is at the end of the specified part of the web request or is followed by a
       * character other than an alphanumeric character or underscore (_), for example, `BadBot;` and
       * `-BadBot;` .
       *
       * *EXACTLY*
       *
       * The value of the specified part of the web request must exactly match the value of
       * `SearchString` .
       *
       * *STARTS_WITH*
       *
       * The value of `SearchString` must appear at the beginning of the specified part of the web
       * request.
       *
       * *ENDS_WITH*
       *
       * The value of `SearchString` must appear at the end of the specified part of the web
       * request.
       */
      public fun positionalConstraint(positionalConstraint: String)

      /**
       * @param searchString A string value that you want AWS WAF to search for.
       * AWS WAF searches only in the part of web requests that you designate for inspection in
       * `FieldToMatch` . The maximum length of the value is 200 bytes. For alphabetic characters A-Z
       * and a-z, the value is case sensitive.
       *
       * Don't encode this string. Provide the value that you want AWS WAF to search for. AWS
       * CloudFormation automatically base64 encodes the value for you.
       *
       * For example, suppose the value of `Type` is `HEADER` and the value of `Data` is
       * `User-Agent` . If you want to search the `User-Agent` header for the value `BadBot` , you
       * provide the string `BadBot` in the value of `SearchString` .
       *
       * You must specify either `SearchString` or `SearchStringBase64` in a `ByteMatchStatement` .
       */
      public fun searchString(searchString: String)

      /**
       * @param searchStringBase64 String to search for in a web request component, base64-encoded.
       * If you don't want to encode the string, specify the unencoded value in `SearchString`
       * instead.
       *
       * You must specify either `SearchString` or `SearchStringBase64` in a `ByteMatchStatement` .
       */
      public fun searchStringBase64(searchStringBase64: String)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty.builder()

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdd402302b29c1a81a7d3bbe74b2e07df195a1a2ecc79ad6adf6b9023a48487c")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      /**
       * @param positionalConstraint The area within the portion of the web request that you want
       * AWS WAF to search for `SearchString` . 
       * Valid values include the following:
       *
       * *CONTAINS*
       *
       * The specified part of the web request must include the value of `SearchString` , but the
       * location doesn't matter.
       *
       * *CONTAINS_WORD*
       *
       * The specified part of the web request must include the value of `SearchString` , and
       * `SearchString` must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
       * In addition, `SearchString` must be a word, which means that both of the following are true:
       *
       * * `SearchString` is at the beginning of the specified part of the web request or is
       * preceded by a character other than an alphanumeric character or underscore (_). Examples
       * include the value of a header and `;BadBot` .
       * * `SearchString` is at the end of the specified part of the web request or is followed by a
       * character other than an alphanumeric character or underscore (_), for example, `BadBot;` and
       * `-BadBot;` .
       *
       * *EXACTLY*
       *
       * The value of the specified part of the web request must exactly match the value of
       * `SearchString` .
       *
       * *STARTS_WITH*
       *
       * The value of `SearchString` must appear at the beginning of the specified part of the web
       * request.
       *
       * *ENDS_WITH*
       *
       * The value of `SearchString` must appear at the end of the specified part of the web
       * request.
       */
      override fun positionalConstraint(positionalConstraint: String) {
        cdkBuilder.positionalConstraint(positionalConstraint)
      }

      /**
       * @param searchString A string value that you want AWS WAF to search for.
       * AWS WAF searches only in the part of web requests that you designate for inspection in
       * `FieldToMatch` . The maximum length of the value is 200 bytes. For alphabetic characters A-Z
       * and a-z, the value is case sensitive.
       *
       * Don't encode this string. Provide the value that you want AWS WAF to search for. AWS
       * CloudFormation automatically base64 encodes the value for you.
       *
       * For example, suppose the value of `Type` is `HEADER` and the value of `Data` is
       * `User-Agent` . If you want to search the `User-Agent` header for the value `BadBot` , you
       * provide the string `BadBot` in the value of `SearchString` .
       *
       * You must specify either `SearchString` or `SearchStringBase64` in a `ByteMatchStatement` .
       */
      override fun searchString(searchString: String) {
        cdkBuilder.searchString(searchString)
      }

      /**
       * @param searchStringBase64 String to search for in a web request component, base64-encoded.
       * If you don't want to encode the string, specify the unencoded value in `SearchString`
       * instead.
       *
       * You must specify either `SearchString` or `SearchStringBase64` in a `ByteMatchStatement` .
       */
      override fun searchStringBase64(searchStringBase64: String) {
        cdkBuilder.searchStringBase64(searchStringBase64)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty,
    ) : ByteMatchStatementProperty {
      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      /**
       * The area within the portion of the web request that you want AWS WAF to search for
       * `SearchString` .
       *
       * Valid values include the following:
       *
       * *CONTAINS*
       *
       * The specified part of the web request must include the value of `SearchString` , but the
       * location doesn't matter.
       *
       * *CONTAINS_WORD*
       *
       * The specified part of the web request must include the value of `SearchString` , and
       * `SearchString` must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
       * In addition, `SearchString` must be a word, which means that both of the following are true:
       *
       * * `SearchString` is at the beginning of the specified part of the web request or is
       * preceded by a character other than an alphanumeric character or underscore (_). Examples
       * include the value of a header and `;BadBot` .
       * * `SearchString` is at the end of the specified part of the web request or is followed by a
       * character other than an alphanumeric character or underscore (_), for example, `BadBot;` and
       * `-BadBot;` .
       *
       * *EXACTLY*
       *
       * The value of the specified part of the web request must exactly match the value of
       * `SearchString` .
       *
       * *STARTS_WITH*
       *
       * The value of `SearchString` must appear at the beginning of the specified part of the web
       * request.
       *
       * *ENDS_WITH*
       *
       * The value of `SearchString` must appear at the end of the specified part of the web
       * request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-positionalconstraint)
       */
      override fun positionalConstraint(): String = unwrap(this).getPositionalConstraint()

      /**
       * A string value that you want AWS WAF to search for.
       *
       * AWS WAF searches only in the part of web requests that you designate for inspection in
       * `FieldToMatch` . The maximum length of the value is 200 bytes. For alphabetic characters A-Z
       * and a-z, the value is case sensitive.
       *
       * Don't encode this string. Provide the value that you want AWS WAF to search for. AWS
       * CloudFormation automatically base64 encodes the value for you.
       *
       * For example, suppose the value of `Type` is `HEADER` and the value of `Data` is
       * `User-Agent` . If you want to search the `User-Agent` header for the value `BadBot` , you
       * provide the string `BadBot` in the value of `SearchString` .
       *
       * You must specify either `SearchString` or `SearchStringBase64` in a `ByteMatchStatement` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstring)
       */
      override fun searchString(): String? = unwrap(this).getSearchString()

      /**
       * String to search for in a web request component, base64-encoded.
       *
       * If you don't want to encode the string, specify the unencoded value in `SearchString`
       * instead.
       *
       * You must specify either `SearchString` or `SearchStringBase64` in a `ByteMatchStatement` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstringbase64)
       */
      override fun searchStringBase64(): String? = unwrap(this).getSearchStringBase64()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ByteMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty):
          ByteMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ByteMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RegexMatchStatementProperty {
    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexmatchstatement.html#cfn-wafv2-rulegroup-regexmatchstatement-fieldtomatch)
     */
    public fun fieldToMatch(): Any

    /**
     * The string representing the regular expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexmatchstatement.html#cfn-wafv2-rulegroup-regexmatchstatement-regexstring)
     */
    public fun regexString(): String

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by `FieldToMatch` , starting
     * from the lowest priority setting, before inspecting the content for a match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexmatchstatement.html#cfn-wafv2-rulegroup-regexmatchstatement-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [RegexMatchStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: IResolvable)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb40ce3911817478c43de73e702f6c1ca56a470dc33f39e4ca663ee4db2f78be")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      /**
       * @param regexString The string representing the regular expression. 
       */
      public fun regexString(regexString: String)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty.builder()

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb40ce3911817478c43de73e702f6c1ca56a470dc33f39e4ca663ee4db2f78be")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      /**
       * @param regexString The string representing the regular expression. 
       */
      override fun regexString(regexString: String) {
        cdkBuilder.regexString(regexString)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty,
    ) : RegexMatchStatementProperty {
      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexmatchstatement.html#cfn-wafv2-rulegroup-regexmatchstatement-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      /**
       * The string representing the regular expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexmatchstatement.html#cfn-wafv2-rulegroup-regexmatchstatement-regexstring)
       */
      override fun regexString(): String = unwrap(this).getRegexString()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexmatchstatement.html#cfn-wafv2-rulegroup-regexmatchstatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RegexMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty):
          RegexMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegexMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexMatchStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ChallengeConfigProperty {
    /**
     * Determines how long a challenge timestamp in the token remains valid after the client
     * successfully responds to a challenge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-challengeconfig.html#cfn-wafv2-rulegroup-challengeconfig-immunitytimeproperty)
     */
    public fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()

    /**
     * A builder for [ChallengeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param immunityTimeProperty Determines how long a challenge timestamp in the token remains
       * valid after the client successfully responds to a challenge.
       */
      public fun immunityTimeProperty(immunityTimeProperty: IResolvable)

      /**
       * @param immunityTimeProperty Determines how long a challenge timestamp in the token remains
       * valid after the client successfully responds to a challenge.
       */
      public fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty)

      /**
       * @param immunityTimeProperty Determines how long a challenge timestamp in the token remains
       * valid after the client successfully responds to a challenge.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25712aa626ae3a601c0c8fb1bdf61d71e0be3743f106c426601d52f166c580ec")
      public
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty.builder()

      /**
       * @param immunityTimeProperty Determines how long a challenge timestamp in the token remains
       * valid after the client successfully responds to a challenge.
       */
      override fun immunityTimeProperty(immunityTimeProperty: IResolvable) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(IResolvable::unwrap))
      }

      /**
       * @param immunityTimeProperty Determines how long a challenge timestamp in the token remains
       * valid after the client successfully responds to a challenge.
       */
      override fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(ImmunityTimePropertyProperty::unwrap))
      }

      /**
       * @param immunityTimeProperty Determines how long a challenge timestamp in the token remains
       * valid after the client successfully responds to a challenge.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25712aa626ae3a601c0c8fb1bdf61d71e0be3743f106c426601d52f166c580ec")
      override
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit):
          Unit = immunityTimeProperty(ImmunityTimePropertyProperty(immunityTimeProperty))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty,
    ) : ChallengeConfigProperty {
      /**
       * Determines how long a challenge timestamp in the token remains valid after the client
       * successfully responds to a challenge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-challengeconfig.html#cfn-wafv2-rulegroup-challengeconfig-immunitytimeproperty)
       */
      override fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ChallengeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty):
          ChallengeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChallengeConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TextTransformationProperty {
    /**
     * Sets the relative processing order for multiple transformations.
     *
     * AWS WAF processes all transformations, from lowest priority to highest, before inspecting the
     * transformed content. The priorities don't need to be consecutive, but they must all be
     * different.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-texttransformation.html#cfn-wafv2-rulegroup-texttransformation-priority)
     */
    public fun priority(): Number

    /**
     * For detailed descriptions of each of the transformation types, see [Text
     * transformations](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html)
     * in the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-texttransformation.html#cfn-wafv2-rulegroup-texttransformation-type)
     */
    public fun type(): String

    /**
     * A builder for [TextTransformationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param priority Sets the relative processing order for multiple transformations. 
       * AWS WAF processes all transformations, from lowest priority to highest, before inspecting
       * the transformed content. The priorities don't need to be consecutive, but they must all be
       * different.
       */
      public fun priority(priority: Number)

      /**
       * @param type For detailed descriptions of each of the transformation types, see [Text
       * transformations](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html)
       * in the *AWS WAF Developer Guide* . 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty.builder()

      /**
       * @param priority Sets the relative processing order for multiple transformations. 
       * AWS WAF processes all transformations, from lowest priority to highest, before inspecting
       * the transformed content. The priorities don't need to be consecutive, but they must all be
       * different.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param type For detailed descriptions of each of the transformation types, see [Text
       * transformations](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html)
       * in the *AWS WAF Developer Guide* . 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty,
    ) : TextTransformationProperty {
      /**
       * Sets the relative processing order for multiple transformations.
       *
       * AWS WAF processes all transformations, from lowest priority to highest, before inspecting
       * the transformed content. The priorities don't need to be consecutive, but they must all be
       * different.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-texttransformation.html#cfn-wafv2-rulegroup-texttransformation-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * For detailed descriptions of each of the transformation types, see [Text
       * transformations](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html)
       * in the *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-texttransformation.html#cfn-wafv2-rulegroup-texttransformation-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TextTransformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty):
          TextTransformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextTransformationProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CaptchaConfigProperty {
    /**
     * Determines how long a `CAPTCHA` timestamp in the token remains valid after the client
     * successfully solves a `CAPTCHA` puzzle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-captchaconfig.html#cfn-wafv2-rulegroup-captchaconfig-immunitytimeproperty)
     */
    public fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()

    /**
     * A builder for [CaptchaConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param immunityTimeProperty Determines how long a `CAPTCHA` timestamp in the token remains
       * valid after the client successfully solves a `CAPTCHA` puzzle.
       */
      public fun immunityTimeProperty(immunityTimeProperty: IResolvable)

      /**
       * @param immunityTimeProperty Determines how long a `CAPTCHA` timestamp in the token remains
       * valid after the client successfully solves a `CAPTCHA` puzzle.
       */
      public fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty)

      /**
       * @param immunityTimeProperty Determines how long a `CAPTCHA` timestamp in the token remains
       * valid after the client successfully solves a `CAPTCHA` puzzle.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a172e854a3c4319f474ed6bdb9a563321b7c9c1a3f6d04c8bb7394d5423b915e")
      public
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty.builder()

      /**
       * @param immunityTimeProperty Determines how long a `CAPTCHA` timestamp in the token remains
       * valid after the client successfully solves a `CAPTCHA` puzzle.
       */
      override fun immunityTimeProperty(immunityTimeProperty: IResolvable) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(IResolvable::unwrap))
      }

      /**
       * @param immunityTimeProperty Determines how long a `CAPTCHA` timestamp in the token remains
       * valid after the client successfully solves a `CAPTCHA` puzzle.
       */
      override fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty.let(ImmunityTimePropertyProperty::unwrap))
      }

      /**
       * @param immunityTimeProperty Determines how long a `CAPTCHA` timestamp in the token remains
       * valid after the client successfully solves a `CAPTCHA` puzzle.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a172e854a3c4319f474ed6bdb9a563321b7c9c1a3f6d04c8bb7394d5423b915e")
      override
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit):
          Unit = immunityTimeProperty(ImmunityTimePropertyProperty(immunityTimeProperty))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty,
    ) : CaptchaConfigProperty {
      /**
       * Determines how long a `CAPTCHA` timestamp in the token remains valid after the client
       * successfully solves a `CAPTCHA` puzzle.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-captchaconfig.html#cfn-wafv2-rulegroup-captchaconfig-immunitytimeproperty)
       */
      override fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptchaConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty):
          CaptchaConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptchaConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CountProperty {
    /**
     * Custom request handling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-count.html#cfn-wafv2-rulegroup-count-customrequesthandling)
     */
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    /**
     * A builder for [CountProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customRequestHandling Custom request handling.
       */
      public fun customRequestHandling(customRequestHandling: IResolvable)

      /**
       * @param customRequestHandling Custom request handling.
       */
      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      /**
       * @param customRequestHandling Custom request handling.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("791b1be31c13a12b3ccd0f9185ac3d0c71a8a444165a47156e8cf5e1b558a401")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty.builder()

      /**
       * @param customRequestHandling Custom request handling.
       */
      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      /**
       * @param customRequestHandling Custom request handling.
       */
      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      /**
       * @param customRequestHandling Custom request handling.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("791b1be31c13a12b3ccd0f9185ac3d0c71a8a444165a47156e8cf5e1b558a401")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty,
    ) : CountProperty {
      /**
       * Custom request handling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-count.html#cfn-wafv2-rulegroup-count-customrequesthandling)
       */
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty):
          CountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CountProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CountProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BodyProperty {
    /**
     * What AWS WAF should do if the body is larger than AWS WAF can inspect.
     *
     * AWS WAF does not support inspecting the entire contents of the web request body if the body
     * exceeds the limit for the resource type. If the body is larger than the limit, the underlying
     * host service only forwards the contents that are below the limit to AWS WAF for inspection.
     *
     * The default limit is 8 KB (8,192 bytes) for regional resources and 16 KB (16,384 bytes) for
     * CloudFront distributions. For CloudFront distributions, you can increase the limit in the web
     * ACL `AssociationConfig` , for additional processing fees.
     *
     * The options for oversize handling are the following:
     *
     * * `CONTINUE` - Inspect the available body contents normally, according to the rule inspection
     * criteria.
     * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
     * action to the request.
     * * `NO_MATCH` - Treat the web request as not matching the rule statement.
     *
     * You can combine the `MATCH` or `NO_MATCH` settings for oversize handling with your rule and
     * web ACL action settings, so that you block any request whose body is over the limit.
     *
     * Default: `CONTINUE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-body.html#cfn-wafv2-rulegroup-body-oversizehandling)
     */
    public fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()

    /**
     * A builder for [BodyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param oversizeHandling What AWS WAF should do if the body is larger than AWS WAF can
       * inspect.
       * AWS WAF does not support inspecting the entire contents of the web request body if the body
       * exceeds the limit for the resource type. If the body is larger than the limit, the underlying
       * host service only forwards the contents that are below the limit to AWS WAF for inspection.
       *
       * The default limit is 8 KB (8,192 bytes) for regional resources and 16 KB (16,384 bytes) for
       * CloudFront distributions. For CloudFront distributions, you can increase the limit in the web
       * ACL `AssociationConfig` , for additional processing fees.
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available body contents normally, according to the rule
       * inspection criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * You can combine the `MATCH` or `NO_MATCH` settings for oversize handling with your rule and
       * web ACL action settings, so that you block any request whose body is over the limit.
       *
       * Default: `CONTINUE`
       */
      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty.builder()

      /**
       * @param oversizeHandling What AWS WAF should do if the body is larger than AWS WAF can
       * inspect.
       * AWS WAF does not support inspecting the entire contents of the web request body if the body
       * exceeds the limit for the resource type. If the body is larger than the limit, the underlying
       * host service only forwards the contents that are below the limit to AWS WAF for inspection.
       *
       * The default limit is 8 KB (8,192 bytes) for regional resources and 16 KB (16,384 bytes) for
       * CloudFront distributions. For CloudFront distributions, you can increase the limit in the web
       * ACL `AssociationConfig` , for additional processing fees.
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available body contents normally, according to the rule
       * inspection criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * You can combine the `MATCH` or `NO_MATCH` settings for oversize handling with your rule and
       * web ACL action settings, so that you block any request whose body is over the limit.
       *
       * Default: `CONTINUE`
       */
      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty,
    ) : BodyProperty {
      /**
       * What AWS WAF should do if the body is larger than AWS WAF can inspect.
       *
       * AWS WAF does not support inspecting the entire contents of the web request body if the body
       * exceeds the limit for the resource type. If the body is larger than the limit, the underlying
       * host service only forwards the contents that are below the limit to AWS WAF for inspection.
       *
       * The default limit is 8 KB (8,192 bytes) for regional resources and 16 KB (16,384 bytes) for
       * CloudFront distributions. For CloudFront distributions, you can increase the limit in the web
       * ACL `AssociationConfig` , for additional processing fees.
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available body contents normally, according to the rule
       * inspection criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * You can combine the `MATCH` or `NO_MATCH` settings for oversize handling with your rule and
       * web ACL action settings, so that you block any request whose body is over the limit.
       *
       * Default: `CONTINUE`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-body.html#cfn-wafv2-rulegroup-body-oversizehandling)
       */
      override fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty):
          BodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BodyProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BodyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomRequestHandlingProperty {
    /**
     * The HTTP headers to insert into the request. Duplicate header names are not allowed.
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customrequesthandling.html#cfn-wafv2-rulegroup-customrequesthandling-insertheaders)
     */
    public fun insertHeaders(): Any

    /**
     * A builder for [CustomRequestHandlingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names
       * are not allowed. 
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      public fun insertHeaders(insertHeaders: IResolvable)

      /**
       * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names
       * are not allowed. 
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      public fun insertHeaders(insertHeaders: List<Any>)

      /**
       * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names
       * are not allowed. 
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      public fun insertHeaders(vararg insertHeaders: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty.builder()

      /**
       * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names
       * are not allowed. 
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      override fun insertHeaders(insertHeaders: IResolvable) {
        cdkBuilder.insertHeaders(insertHeaders.let(IResolvable::unwrap))
      }

      /**
       * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names
       * are not allowed. 
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      override fun insertHeaders(insertHeaders: List<Any>) {
        cdkBuilder.insertHeaders(insertHeaders)
      }

      /**
       * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names
       * are not allowed. 
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      override fun insertHeaders(vararg insertHeaders: Any): Unit =
          insertHeaders(insertHeaders.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty,
    ) : CustomRequestHandlingProperty {
      /**
       * The HTTP headers to insert into the request. Duplicate header names are not allowed.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customrequesthandling.html#cfn-wafv2-rulegroup-customrequesthandling-insertheaders)
       */
      override fun insertHeaders(): Any = unwrap(this).getInsertHeaders()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomRequestHandlingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty):
          CustomRequestHandlingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomRequestHandlingProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomRequestHandlingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RateLimitCookieProperty {
    /**
     * The name of the cookie to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitcookie.html#cfn-wafv2-rulegroup-ratelimitcookie-name)
     */
    public fun name(): String

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * Text transformations are used in rule match statements, to transform the `FieldToMatch`
     * request component before inspecting it, and they're used in rate-based rule statements, to
     * transform request components before using them as custom aggregation keys. If you specify one or
     * more transformations to apply, AWS WAF performs all transformations on the specified content,
     * starting from the lowest priority setting, and then uses the transformed component contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitcookie.html#cfn-wafv2-rulegroup-ratelimitcookie-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [RateLimitCookieProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the cookie to use. 
       */
      public fun name(name: String)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty.builder()

      /**
       * @param name The name of the cookie to use. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty,
    ) : RateLimitCookieProperty {
      /**
       * The name of the cookie to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitcookie.html#cfn-wafv2-rulegroup-ratelimitcookie-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitcookie.html#cfn-wafv2-rulegroup-ratelimitcookie-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitCookieProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty):
          RateLimitCookieProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitCookieProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitCookieProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ForwardedIPConfigurationProperty {
    /**
     * The match status to assign to the web request if the request doesn't have a valid IP address
     * in the specified position.
     *
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     *
     * You can specify the following fallback behaviors:
     *
     * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
     * action to the request.
     * * `NO_MATCH` - Treat the web request as not matching the rule statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-forwardedipconfiguration.html#cfn-wafv2-rulegroup-forwardedipconfiguration-fallbackbehavior)
     */
    public fun fallbackBehavior(): String

    /**
     * The name of the HTTP header to use for the IP address.
     *
     * For example, to use the X-Forwarded-For (XFF) header, set this to `X-Forwarded-For` .
     *
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-forwardedipconfiguration.html#cfn-wafv2-rulegroup-forwardedipconfiguration-headername)
     */
    public fun headerName(): String

    /**
     * A builder for [ForwardedIPConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fallbackBehavior The match status to assign to the web request if the request
       * doesn't have a valid IP address in the specified position. 
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * You can specify the following fallback behaviors:
       *
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       */
      public fun fallbackBehavior(fallbackBehavior: String)

      /**
       * @param headerName The name of the HTTP header to use for the IP address. 
       * For example, to use the X-Forwarded-For (XFF) header, set this to `X-Forwarded-For` .
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      public fun headerName(headerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty.builder()

      /**
       * @param fallbackBehavior The match status to assign to the web request if the request
       * doesn't have a valid IP address in the specified position. 
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * You can specify the following fallback behaviors:
       *
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       */
      override fun fallbackBehavior(fallbackBehavior: String) {
        cdkBuilder.fallbackBehavior(fallbackBehavior)
      }

      /**
       * @param headerName The name of the HTTP header to use for the IP address. 
       * For example, to use the X-Forwarded-For (XFF) header, set this to `X-Forwarded-For` .
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       */
      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty,
    ) : ForwardedIPConfigurationProperty {
      /**
       * The match status to assign to the web request if the request doesn't have a valid IP
       * address in the specified position.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * You can specify the following fallback behaviors:
       *
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-forwardedipconfiguration.html#cfn-wafv2-rulegroup-forwardedipconfiguration-fallbackbehavior)
       */
      override fun fallbackBehavior(): String = unwrap(this).getFallbackBehavior()

      /**
       * The name of the HTTP header to use for the IP address.
       *
       * For example, to use the X-Forwarded-For (XFF) header, set this to `X-Forwarded-For` .
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-forwardedipconfiguration.html#cfn-wafv2-rulegroup-forwardedipconfiguration-headername)
       */
      override fun headerName(): String = unwrap(this).getHeaderName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardedIPConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty):
          ForwardedIPConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardedIPConfigurationProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ChallengeProperty {
    /**
     * Custom request handling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-challenge.html#cfn-wafv2-rulegroup-challenge-customrequesthandling)
     */
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    /**
     * A builder for [ChallengeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customRequestHandling Custom request handling.
       */
      public fun customRequestHandling(customRequestHandling: IResolvable)

      /**
       * @param customRequestHandling Custom request handling.
       */
      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      /**
       * @param customRequestHandling Custom request handling.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5d98b21c1d35798283e3eb768a2465de92a428b3bcc6e60aaa0b69c1f119bc4")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty.builder()

      /**
       * @param customRequestHandling Custom request handling.
       */
      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      /**
       * @param customRequestHandling Custom request handling.
       */
      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      /**
       * @param customRequestHandling Custom request handling.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5d98b21c1d35798283e3eb768a2465de92a428b3bcc6e60aaa0b69c1f119bc4")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty,
    ) : ChallengeProperty {
      /**
       * Custom request handling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-challenge.html#cfn-wafv2-rulegroup-challenge-customrequesthandling)
       */
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ChallengeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty):
          ChallengeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChallengeProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.ChallengeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomHTTPHeaderProperty {
    /**
     * The name of the custom header.
     *
     * For custom request header insertion, when AWS WAF inserts the header into the request, it
     * prefixes this name `x-amzn-waf-` , to avoid confusion with the headers that are already in the
     * request. For example, for the header name `sample` , AWS WAF inserts the header
     * `x-amzn-waf-sample` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customhttpheader.html#cfn-wafv2-rulegroup-customhttpheader-name)
     */
    public fun name(): String

    /**
     * The value of the custom header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customhttpheader.html#cfn-wafv2-rulegroup-customhttpheader-value)
     */
    public fun `value`(): String

    /**
     * A builder for [CustomHTTPHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the custom header. 
       * For custom request header insertion, when AWS WAF inserts the header into the request, it
       * prefixes this name `x-amzn-waf-` , to avoid confusion with the headers that are already in the
       * request. For example, for the header name `sample` , AWS WAF inserts the header
       * `x-amzn-waf-sample` .
       */
      public fun name(name: String)

      /**
       * @param value The value of the custom header. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty.builder()

      /**
       * @param name The name of the custom header. 
       * For custom request header insertion, when AWS WAF inserts the header into the request, it
       * prefixes this name `x-amzn-waf-` , to avoid confusion with the headers that are already in the
       * request. For example, for the header name `sample` , AWS WAF inserts the header
       * `x-amzn-waf-sample` .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the custom header. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty,
    ) : CustomHTTPHeaderProperty {
      /**
       * The name of the custom header.
       *
       * For custom request header insertion, when AWS WAF inserts the header into the request, it
       * prefixes this name `x-amzn-waf-` , to avoid confusion with the headers that are already in the
       * request. For example, for the header name `sample` , AWS WAF inserts the header
       * `x-amzn-waf-sample` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customhttpheader.html#cfn-wafv2-rulegroup-customhttpheader-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value of the custom header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customhttpheader.html#cfn-wafv2-rulegroup-customhttpheader-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomHTTPHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty):
          CustomHTTPHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomHTTPHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomHTTPHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RegexPatternSetReferenceStatementProperty {
    /**
     * The Amazon Resource Name (ARN) of the `RegexPatternSet` that this statement references.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-arn)
     */
    public fun arn(): String

    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-fieldtomatch)
     */
    public fun fieldToMatch(): Any

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by `FieldToMatch` , starting
     * from the lowest priority setting, before inspecting the content for a match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [RegexPatternSetReferenceStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the `RegexPatternSet` that this statement
       * references. 
       */
      public fun arn(arn: String)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: IResolvable)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2377193f1c16e3206d2f39d8eec33c0c3f4e6036badf8868a13762c5b3d6e4e")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the `RegexPatternSet` that this statement
       * references. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2377193f1c16e3206d2f39d8eec33c0c3f4e6036badf8868a13762c5b3d6e4e")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty,
    ) : RegexPatternSetReferenceStatementProperty {
      /**
       * The Amazon Resource Name (ARN) of the `RegexPatternSet` that this statement references.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RegexPatternSetReferenceStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty):
          RegexPatternSetReferenceStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegexPatternSetReferenceStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomResponseBodyProperty {
    /**
     * The payload of the custom response.
     *
     * You can use JSON escape strings in JSON content. To do this, you must specify JSON content in
     * the `ContentType` setting.
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponsebody.html#cfn-wafv2-rulegroup-customresponsebody-content)
     */
    public fun content(): String

    /**
     * The type of content in the payload that you are defining in the `Content` string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponsebody.html#cfn-wafv2-rulegroup-customresponsebody-contenttype)
     */
    public fun contentType(): String

    /**
     * A builder for [CustomResponseBodyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content The payload of the custom response. 
       * You can use JSON escape strings in JSON content. To do this, you must specify JSON content
       * in the `ContentType` setting.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      public fun content(content: String)

      /**
       * @param contentType The type of content in the payload that you are defining in the
       * `Content` string. 
       */
      public fun contentType(contentType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty.builder()

      /**
       * @param content The payload of the custom response. 
       * You can use JSON escape strings in JSON content. To do this, you must specify JSON content
       * in the `ContentType` setting.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       */
      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      /**
       * @param contentType The type of content in the payload that you are defining in the
       * `Content` string. 
       */
      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty,
    ) : CustomResponseBodyProperty {
      /**
       * The payload of the custom response.
       *
       * You can use JSON escape strings in JSON content. To do this, you must specify JSON content
       * in the `ContentType` setting.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponsebody.html#cfn-wafv2-rulegroup-customresponsebody-content)
       */
      override fun content(): String = unwrap(this).getContent()

      /**
       * The type of content in the payload that you are defining in the `Content` string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponsebody.html#cfn-wafv2-rulegroup-customresponsebody-contenttype)
       */
      override fun contentType(): String = unwrap(this).getContentType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomResponseBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty):
          CustomResponseBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomResponseBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface XssMatchStatementProperty {
    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-xssmatchstatement.html#cfn-wafv2-rulegroup-xssmatchstatement-fieldtomatch)
     */
    public fun fieldToMatch(): Any

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by `FieldToMatch` , starting
     * from the lowest priority setting, before inspecting the content for a match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-xssmatchstatement.html#cfn-wafv2-rulegroup-xssmatchstatement-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [XssMatchStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: IResolvable)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b617bbed9fdad39e816833cd6c4c77a1ae17137172debd310ea2595d90777376")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty.builder()

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b617bbed9fdad39e816833cd6c4c77a1ae17137172debd310ea2595d90777376")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty,
    ) : XssMatchStatementProperty {
      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-xssmatchstatement.html#cfn-wafv2-rulegroup-xssmatchstatement-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-xssmatchstatement.html#cfn-wafv2-rulegroup-xssmatchstatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): XssMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty):
          XssMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: XssMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AllowProperty {
    /**
     * Custom request handling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-allow.html#cfn-wafv2-rulegroup-allow-customrequesthandling)
     */
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    /**
     * A builder for [AllowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customRequestHandling Custom request handling.
       */
      public fun customRequestHandling(customRequestHandling: IResolvable)

      /**
       * @param customRequestHandling Custom request handling.
       */
      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      /**
       * @param customRequestHandling Custom request handling.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab4f0859eb9840e581b7111a708ff3e97e8bb3087dc624f47b149e0643ef8b44")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty.builder()

      /**
       * @param customRequestHandling Custom request handling.
       */
      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      /**
       * @param customRequestHandling Custom request handling.
       */
      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      /**
       * @param customRequestHandling Custom request handling.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab4f0859eb9840e581b7111a708ff3e97e8bb3087dc624f47b149e0643ef8b44")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty,
    ) : AllowProperty {
      /**
       * Custom request handling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-allow.html#cfn-wafv2-rulegroup-allow-customrequesthandling)
       */
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AllowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty):
          AllowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AllowProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AllowProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SingleHeaderProperty {
    /**
     * The name of the query header to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-singleheader.html#cfn-wafv2-rulegroup-singleheader-name)
     */
    public fun name(): String

    /**
     * A builder for [SingleHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the query header to inspect. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty.builder()

      /**
       * @param name The name of the query header to inspect. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty,
    ) : SingleHeaderProperty {
      /**
       * The name of the query header to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-singleheader.html#cfn-wafv2-rulegroup-singleheader-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty):
          SingleHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CookiesProperty {
    /**
     * The filter to use to identify the subset of cookies to inspect in a web request.
     *
     * You must specify exactly one setting: either `All` , `IncludedCookies` , or `ExcludedCookies`
     * .
     *
     * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookies.html#cfn-wafv2-rulegroup-cookies-matchpattern)
     */
    public fun matchPattern(): Any

    /**
     * The parts of the cookies to inspect with the rule inspection criteria.
     *
     * If you specify `ALL` , AWS WAF inspects both keys and values.
     *
     * `All` does not require a match to be found in the keys and a match to be found in the values.
     * It requires a match to be found in the keys or the values or both. To require a match in the
     * keys and in the values, use a logical `AND` statement to combine two match rules, one that
     * inspects the keys and another that inspects the values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookies.html#cfn-wafv2-rulegroup-cookies-matchscope)
     */
    public fun matchScope(): String

    /**
     * What AWS WAF should do if the cookies of the request are more numerous or larger than AWS WAF
     * can inspect.
     *
     * AWS WAF does not support inspecting the entire contents of request cookies when they exceed 8
     * KB (8192 bytes) or 200 total cookies. The underlying host service forwards a maximum of 200
     * cookies and at most 8 KB of cookie contents to AWS WAF .
     *
     * The options for oversize handling are the following:
     *
     * * `CONTINUE` - Inspect the available cookies normally, according to the rule inspection
     * criteria.
     * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
     * action to the request.
     * * `NO_MATCH` - Treat the web request as not matching the rule statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookies.html#cfn-wafv2-rulegroup-cookies-oversizehandling)
     */
    public fun oversizeHandling(): String

    /**
     * A builder for [CookiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param matchPattern The filter to use to identify the subset of cookies to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedCookies` , or
       * `ExcludedCookies` .
       *
       * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
       */
      public fun matchPattern(matchPattern: IResolvable)

      /**
       * @param matchPattern The filter to use to identify the subset of cookies to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedCookies` , or
       * `ExcludedCookies` .
       *
       * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
       */
      public fun matchPattern(matchPattern: CookieMatchPatternProperty)

      /**
       * @param matchPattern The filter to use to identify the subset of cookies to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedCookies` , or
       * `ExcludedCookies` .
       *
       * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33c7a4294d46b15314faa20cbc581a5299fe769d51328a38caa4a269c8f46a67")
      public fun matchPattern(matchPattern: CookieMatchPatternProperty.Builder.() -> Unit)

      /**
       * @param matchScope The parts of the cookies to inspect with the rule inspection criteria. 
       * If you specify `ALL` , AWS WAF inspects both keys and values.
       *
       * `All` does not require a match to be found in the keys and a match to be found in the
       * values. It requires a match to be found in the keys or the values or both. To require a match
       * in the keys and in the values, use a logical `AND` statement to combine two match rules, one
       * that inspects the keys and another that inspects the values.
       */
      public fun matchScope(matchScope: String)

      /**
       * @param oversizeHandling What AWS WAF should do if the cookies of the request are more
       * numerous or larger than AWS WAF can inspect. 
       * AWS WAF does not support inspecting the entire contents of request cookies when they exceed
       * 8 KB (8192 bytes) or 200 total cookies. The underlying host service forwards a maximum of 200
       * cookies and at most 8 KB of cookie contents to AWS WAF .
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available cookies normally, according to the rule inspection
       * criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       */
      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty.builder()

      /**
       * @param matchPattern The filter to use to identify the subset of cookies to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedCookies` , or
       * `ExcludedCookies` .
       *
       * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
       */
      override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      /**
       * @param matchPattern The filter to use to identify the subset of cookies to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedCookies` , or
       * `ExcludedCookies` .
       *
       * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
       */
      override fun matchPattern(matchPattern: CookieMatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(CookieMatchPatternProperty::unwrap))
      }

      /**
       * @param matchPattern The filter to use to identify the subset of cookies to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedCookies` , or
       * `ExcludedCookies` .
       *
       * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33c7a4294d46b15314faa20cbc581a5299fe769d51328a38caa4a269c8f46a67")
      override fun matchPattern(matchPattern: CookieMatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(CookieMatchPatternProperty(matchPattern))

      /**
       * @param matchScope The parts of the cookies to inspect with the rule inspection criteria. 
       * If you specify `ALL` , AWS WAF inspects both keys and values.
       *
       * `All` does not require a match to be found in the keys and a match to be found in the
       * values. It requires a match to be found in the keys or the values or both. To require a match
       * in the keys and in the values, use a logical `AND` statement to combine two match rules, one
       * that inspects the keys and another that inspects the values.
       */
      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      /**
       * @param oversizeHandling What AWS WAF should do if the cookies of the request are more
       * numerous or larger than AWS WAF can inspect. 
       * AWS WAF does not support inspecting the entire contents of request cookies when they exceed
       * 8 KB (8192 bytes) or 200 total cookies. The underlying host service forwards a maximum of 200
       * cookies and at most 8 KB of cookie contents to AWS WAF .
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available cookies normally, according to the rule inspection
       * criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       */
      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty,
    ) : CookiesProperty {
      /**
       * The filter to use to identify the subset of cookies to inspect in a web request.
       *
       * You must specify exactly one setting: either `All` , `IncludedCookies` , or
       * `ExcludedCookies` .
       *
       * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookies.html#cfn-wafv2-rulegroup-cookies-matchpattern)
       */
      override fun matchPattern(): Any = unwrap(this).getMatchPattern()

      /**
       * The parts of the cookies to inspect with the rule inspection criteria.
       *
       * If you specify `ALL` , AWS WAF inspects both keys and values.
       *
       * `All` does not require a match to be found in the keys and a match to be found in the
       * values. It requires a match to be found in the keys or the values or both. To require a match
       * in the keys and in the values, use a logical `AND` statement to combine two match rules, one
       * that inspects the keys and another that inspects the values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookies.html#cfn-wafv2-rulegroup-cookies-matchscope)
       */
      override fun matchScope(): String = unwrap(this).getMatchScope()

      /**
       * What AWS WAF should do if the cookies of the request are more numerous or larger than AWS
       * WAF can inspect.
       *
       * AWS WAF does not support inspecting the entire contents of request cookies when they exceed
       * 8 KB (8192 bytes) or 200 total cookies. The underlying host service forwards a maximum of 200
       * cookies and at most 8 KB of cookie contents to AWS WAF .
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available cookies normally, according to the rule inspection
       * criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookies.html#cfn-wafv2-rulegroup-cookies-oversizehandling)
       */
      override fun oversizeHandling(): String = unwrap(this).getOversizeHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CookiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty):
          CookiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookiesProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CookiesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SingleQueryArgumentProperty {
    /**
     * The name of the query argument to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-singlequeryargument.html#cfn-wafv2-rulegroup-singlequeryargument-name)
     */
    public fun name(): String

    /**
     * A builder for [SingleQueryArgumentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the query argument to inspect. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty.builder()

      /**
       * @param name The name of the query argument to inspect. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty,
    ) : SingleQueryArgumentProperty {
      /**
       * The name of the query argument to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-singlequeryargument.html#cfn-wafv2-rulegroup-singlequeryargument-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleQueryArgumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty):
          SingleQueryArgumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleQueryArgumentProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SingleQueryArgumentProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface JsonMatchPatternProperty {
    /**
     * Match all of the elements. See also `MatchScope` in the `JsonBody` `FieldToMatch`
     * specification.
     *
     * You must specify either this setting or the `IncludedPaths` setting, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonmatchpattern.html#cfn-wafv2-rulegroup-jsonmatchpattern-all)
     */
    public fun all(): Any? = unwrap(this).getAll()

    /**
     * Match only the specified include paths. See also `MatchScope` in the `JsonBody`
     * `FieldToMatch` specification.
     *
     * Provide the include paths using JSON Pointer syntax. For example, `"IncludedPaths":
     * ["/dogs/0/name", "/dogs/1/name"]` . For information about this syntax, see the Internet
     * Engineering Task Force (IETF) documentation [JavaScript Object Notation (JSON)
     * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
     *
     * You must specify either this setting or the `All` setting, but not both.
     *
     *
     * Don't use this option to include all paths. Instead, use the `All` setting.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonmatchpattern.html#cfn-wafv2-rulegroup-jsonmatchpattern-includedpaths)
     */
    public fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()

    /**
     * A builder for [JsonMatchPatternProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param all Match all of the elements. See also `MatchScope` in the `JsonBody`
       * `FieldToMatch` specification.
       * You must specify either this setting or the `IncludedPaths` setting, but not both.
       */
      public fun all(all: Any)

      /**
       * @param includedPaths Match only the specified include paths. See also `MatchScope` in the
       * `JsonBody` `FieldToMatch` specification.
       * Provide the include paths using JSON Pointer syntax. For example, `"IncludedPaths":
       * ["/dogs/0/name", "/dogs/1/name"]` . For information about this syntax, see the Internet
       * Engineering Task Force (IETF) documentation [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * You must specify either this setting or the `All` setting, but not both.
       *
       *
       * Don't use this option to include all paths. Instead, use the `All` setting.
       */
      public fun includedPaths(includedPaths: List<String>)

      /**
       * @param includedPaths Match only the specified include paths. See also `MatchScope` in the
       * `JsonBody` `FieldToMatch` specification.
       * Provide the include paths using JSON Pointer syntax. For example, `"IncludedPaths":
       * ["/dogs/0/name", "/dogs/1/name"]` . For information about this syntax, see the Internet
       * Engineering Task Force (IETF) documentation [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * You must specify either this setting or the `All` setting, but not both.
       *
       *
       * Don't use this option to include all paths. Instead, use the `All` setting.
       */
      public fun includedPaths(vararg includedPaths: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty.builder()

      /**
       * @param all Match all of the elements. See also `MatchScope` in the `JsonBody`
       * `FieldToMatch` specification.
       * You must specify either this setting or the `IncludedPaths` setting, but not both.
       */
      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      /**
       * @param includedPaths Match only the specified include paths. See also `MatchScope` in the
       * `JsonBody` `FieldToMatch` specification.
       * Provide the include paths using JSON Pointer syntax. For example, `"IncludedPaths":
       * ["/dogs/0/name", "/dogs/1/name"]` . For information about this syntax, see the Internet
       * Engineering Task Force (IETF) documentation [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * You must specify either this setting or the `All` setting, but not both.
       *
       *
       * Don't use this option to include all paths. Instead, use the `All` setting.
       */
      override fun includedPaths(includedPaths: List<String>) {
        cdkBuilder.includedPaths(includedPaths)
      }

      /**
       * @param includedPaths Match only the specified include paths. See also `MatchScope` in the
       * `JsonBody` `FieldToMatch` specification.
       * Provide the include paths using JSON Pointer syntax. For example, `"IncludedPaths":
       * ["/dogs/0/name", "/dogs/1/name"]` . For information about this syntax, see the Internet
       * Engineering Task Force (IETF) documentation [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * You must specify either this setting or the `All` setting, but not both.
       *
       *
       * Don't use this option to include all paths. Instead, use the `All` setting.
       */
      override fun includedPaths(vararg includedPaths: String): Unit =
          includedPaths(includedPaths.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty,
    ) : JsonMatchPatternProperty {
      /**
       * Match all of the elements. See also `MatchScope` in the `JsonBody` `FieldToMatch`
       * specification.
       *
       * You must specify either this setting or the `IncludedPaths` setting, but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonmatchpattern.html#cfn-wafv2-rulegroup-jsonmatchpattern-all)
       */
      override fun all(): Any? = unwrap(this).getAll()

      /**
       * Match only the specified include paths. See also `MatchScope` in the `JsonBody`
       * `FieldToMatch` specification.
       *
       * Provide the include paths using JSON Pointer syntax. For example, `"IncludedPaths":
       * ["/dogs/0/name", "/dogs/1/name"]` . For information about this syntax, see the Internet
       * Engineering Task Force (IETF) documentation [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * You must specify either this setting or the `All` setting, but not both.
       *
       *
       * Don't use this option to include all paths. Instead, use the `All` setting.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonmatchpattern.html#cfn-wafv2-rulegroup-jsonmatchpattern-includedpaths)
       */
      override fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonMatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty):
          JsonMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateLimitUriPathProperty {
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * Text transformations are used in rule match statements, to transform the `FieldToMatch`
     * request component before inspecting it, and they're used in rate-based rule statements, to
     * transform request components before using them as custom aggregation keys. If you specify one or
     * more transformations to apply, AWS WAF performs all transformations on the specified content,
     * starting from the lowest priority setting, and then uses the transformed component contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimituripath.html#cfn-wafv2-rulegroup-ratelimituripath-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [RateLimitUriPathProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty.builder()

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty,
    ) : RateLimitUriPathProperty {
      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimituripath.html#cfn-wafv2-rulegroup-ratelimituripath-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitUriPathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty):
          RateLimitUriPathProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitUriPathProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitUriPathProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BlockProperty {
    /**
     * Custom response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-block.html#cfn-wafv2-rulegroup-block-customresponse)
     */
    public fun customResponse(): Any? = unwrap(this).getCustomResponse()

    /**
     * A builder for [BlockProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customResponse Custom response.
       */
      public fun customResponse(customResponse: IResolvable)

      /**
       * @param customResponse Custom response.
       */
      public fun customResponse(customResponse: CustomResponseProperty)

      /**
       * @param customResponse Custom response.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a661143ecc23271f0e9bf9540d9034164117bf5f41099f43a8eb0cf4c1b20a3")
      public fun customResponse(customResponse: CustomResponseProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty.builder()

      /**
       * @param customResponse Custom response.
       */
      override fun customResponse(customResponse: IResolvable) {
        cdkBuilder.customResponse(customResponse.let(IResolvable::unwrap))
      }

      /**
       * @param customResponse Custom response.
       */
      override fun customResponse(customResponse: CustomResponseProperty) {
        cdkBuilder.customResponse(customResponse.let(CustomResponseProperty::unwrap))
      }

      /**
       * @param customResponse Custom response.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a661143ecc23271f0e9bf9540d9034164117bf5f41099f43a8eb0cf4c1b20a3")
      override fun customResponse(customResponse: CustomResponseProperty.Builder.() -> Unit): Unit =
          customResponse(CustomResponseProperty(customResponse))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty,
    ) : BlockProperty {
      /**
       * Custom response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-block.html#cfn-wafv2-rulegroup-block-customresponse)
       */
      override fun customResponse(): Any? = unwrap(this).getCustomResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BlockProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty):
          BlockProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.BlockProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateBasedStatementProperty {
    /**
     * Setting that indicates how to aggregate the request counts.
     *
     *
     * Web requests that are missing any of the components specified in the aggregation keys are
     * omitted from the rate-based rule evaluation and handling.
     *
     *
     * * `CONSTANT` - Count and limit the requests that match the rate-based rule's scope-down
     * statement. With this option, the counted requests aren't further aggregated. The scope-down
     * statement is the only specification used. When the count of all requests that satisfy the
     * scope-down statement goes over the limit, AWS WAF applies the rule action to all requests that
     * satisfy the scope-down statement.
     *
     * With this option, you must configure the `ScopeDownStatement` property.
     *
     * * `CUSTOM_KEYS` - Aggregate the request counts using one or more web request components as
     * the aggregate keys.
     *
     * With this option, you must specify the aggregate keys in the `CustomKeys` property.
     *
     * To aggregate on only the IP address or only the forwarded IP address, don't use custom keys.
     * Instead, set the aggregate key type to `IP` or `FORWARDED_IP` .
     *
     * * `FORWARDED_IP` - Aggregate the request counts on the first IP address in an HTTP header.
     *
     * With this option, you must specify the header to use in the `ForwardedIPConfig` property.
     *
     * To aggregate on a combination of the forwarded IP address with other aggregate keys, use
     * `CUSTOM_KEYS` .
     *
     * * `IP` - Aggregate the request counts on the IP address from the web request origin.
     *
     * To aggregate on a combination of the IP address with other aggregate keys, use `CUSTOM_KEYS`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html#cfn-wafv2-rulegroup-ratebasedstatement-aggregatekeytype)
     */
    public fun aggregateKeyType(): String

    /**
     * Specifies the aggregate keys to use in a rate-base rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html#cfn-wafv2-rulegroup-ratebasedstatement-customkeys)
     */
    public fun customKeys(): Any? = unwrap(this).getCustomKeys()

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of
     * using the IP address that's reported by the web request origin.
     *
     * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
     *
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     *
     * This is required if you specify a forwarded IP in the rule's aggregate key settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html#cfn-wafv2-rulegroup-ratebasedstatement-forwardedipconfig)
     */
    public fun forwardedIpConfig(): Any? = unwrap(this).getForwardedIpConfig()

    /**
     * The limit on requests per 5-minute period for a single aggregation instance for the
     * rate-based rule.
     *
     * If the rate-based statement includes a `ScopeDownStatement` , this limit is applied only to
     * the requests that match the statement.
     *
     * Examples:
     *
     * * If you aggregate on just the IP address, this is the limit on requests from any single IP
     * address.
     * * If you aggregate on the HTTP method and the query argument name "city", then this is the
     * limit on requests for any single method, city pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html#cfn-wafv2-rulegroup-ratebasedstatement-limit)
     */
    public fun limit(): Number

    /**
     * An optional nested statement that narrows the scope of the web requests that are evaluated
     * and managed by the rate-based statement.
     *
     * When you use a scope-down statement, the rate-based rule only tracks and rate limits requests
     * that match the scope-down statement. You can use any nestable `Statement` in the scope-down
     * statement, and you can nest statements at any level, the same as you can for a rule statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html#cfn-wafv2-rulegroup-ratebasedstatement-scopedownstatement)
     */
    public fun scopeDownStatement(): Any? = unwrap(this).getScopeDownStatement()

    /**
     * A builder for [RateBasedStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregateKeyType Setting that indicates how to aggregate the request counts. 
       *
       * Web requests that are missing any of the components specified in the aggregation keys are
       * omitted from the rate-based rule evaluation and handling.
       *
       *
       * * `CONSTANT` - Count and limit the requests that match the rate-based rule's scope-down
       * statement. With this option, the counted requests aren't further aggregated. The scope-down
       * statement is the only specification used. When the count of all requests that satisfy the
       * scope-down statement goes over the limit, AWS WAF applies the rule action to all requests that
       * satisfy the scope-down statement.
       *
       * With this option, you must configure the `ScopeDownStatement` property.
       *
       * * `CUSTOM_KEYS` - Aggregate the request counts using one or more web request components as
       * the aggregate keys.
       *
       * With this option, you must specify the aggregate keys in the `CustomKeys` property.
       *
       * To aggregate on only the IP address or only the forwarded IP address, don't use custom
       * keys. Instead, set the aggregate key type to `IP` or `FORWARDED_IP` .
       *
       * * `FORWARDED_IP` - Aggregate the request counts on the first IP address in an HTTP header.
       *
       * With this option, you must specify the header to use in the `ForwardedIPConfig` property.
       *
       * To aggregate on a combination of the forwarded IP address with other aggregate keys, use
       * `CUSTOM_KEYS` .
       *
       * * `IP` - Aggregate the request counts on the IP address from the web request origin.
       *
       * To aggregate on a combination of the IP address with other aggregate keys, use
       * `CUSTOM_KEYS` .
       */
      public fun aggregateKeyType(aggregateKeyType: String)

      /**
       * @param customKeys Specifies the aggregate keys to use in a rate-base rule.
       */
      public fun customKeys(customKeys: IResolvable)

      /**
       * @param customKeys Specifies the aggregate keys to use in a rate-base rule.
       */
      public fun customKeys(customKeys: List<Any>)

      /**
       * @param customKeys Specifies the aggregate keys to use in a rate-base rule.
       */
      public fun customKeys(vararg customKeys: Any)

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * This is required if you specify a forwarded IP in the rule's aggregate key settings.
       */
      public fun forwardedIpConfig(forwardedIpConfig: IResolvable)

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * This is required if you specify a forwarded IP in the rule's aggregate key settings.
       */
      public fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty)

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * This is required if you specify a forwarded IP in the rule's aggregate key settings.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66d6b4b34b8729fab7ced212e36788285f427e1a88ab1a93bd50f8f1c905f5c8")
      public
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit)

      /**
       * @param limit The limit on requests per 5-minute period for a single aggregation instance
       * for the rate-based rule. 
       * If the rate-based statement includes a `ScopeDownStatement` , this limit is applied only to
       * the requests that match the statement.
       *
       * Examples:
       *
       * * If you aggregate on just the IP address, this is the limit on requests from any single IP
       * address.
       * * If you aggregate on the HTTP method and the query argument name "city", then this is the
       * limit on requests for any single method, city pair.
       */
      public fun limit(limit: Number)

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated and managed by the rate-based statement.
       * When you use a scope-down statement, the rate-based rule only tracks and rate limits
       * requests that match the scope-down statement. You can use any nestable `Statement` in the
       * scope-down statement, and you can nest statements at any level, the same as you can for a rule
       * statement.
       */
      public fun scopeDownStatement(scopeDownStatement: IResolvable)

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated and managed by the rate-based statement.
       * When you use a scope-down statement, the rate-based rule only tracks and rate limits
       * requests that match the scope-down statement. You can use any nestable `Statement` in the
       * scope-down statement, and you can nest statements at any level, the same as you can for a rule
       * statement.
       */
      public fun scopeDownStatement(scopeDownStatement: StatementProperty)

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated and managed by the rate-based statement.
       * When you use a scope-down statement, the rate-based rule only tracks and rate limits
       * requests that match the scope-down statement. You can use any nestable `Statement` in the
       * scope-down statement, and you can nest statements at any level, the same as you can for a rule
       * statement.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46c7c628fa6c373879f7fe437cda0831a075f3df8980c268da4be8cea4e8348b")
      public fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty.builder()

      /**
       * @param aggregateKeyType Setting that indicates how to aggregate the request counts. 
       *
       * Web requests that are missing any of the components specified in the aggregation keys are
       * omitted from the rate-based rule evaluation and handling.
       *
       *
       * * `CONSTANT` - Count and limit the requests that match the rate-based rule's scope-down
       * statement. With this option, the counted requests aren't further aggregated. The scope-down
       * statement is the only specification used. When the count of all requests that satisfy the
       * scope-down statement goes over the limit, AWS WAF applies the rule action to all requests that
       * satisfy the scope-down statement.
       *
       * With this option, you must configure the `ScopeDownStatement` property.
       *
       * * `CUSTOM_KEYS` - Aggregate the request counts using one or more web request components as
       * the aggregate keys.
       *
       * With this option, you must specify the aggregate keys in the `CustomKeys` property.
       *
       * To aggregate on only the IP address or only the forwarded IP address, don't use custom
       * keys. Instead, set the aggregate key type to `IP` or `FORWARDED_IP` .
       *
       * * `FORWARDED_IP` - Aggregate the request counts on the first IP address in an HTTP header.
       *
       * With this option, you must specify the header to use in the `ForwardedIPConfig` property.
       *
       * To aggregate on a combination of the forwarded IP address with other aggregate keys, use
       * `CUSTOM_KEYS` .
       *
       * * `IP` - Aggregate the request counts on the IP address from the web request origin.
       *
       * To aggregate on a combination of the IP address with other aggregate keys, use
       * `CUSTOM_KEYS` .
       */
      override fun aggregateKeyType(aggregateKeyType: String) {
        cdkBuilder.aggregateKeyType(aggregateKeyType)
      }

      /**
       * @param customKeys Specifies the aggregate keys to use in a rate-base rule.
       */
      override fun customKeys(customKeys: IResolvable) {
        cdkBuilder.customKeys(customKeys.let(IResolvable::unwrap))
      }

      /**
       * @param customKeys Specifies the aggregate keys to use in a rate-base rule.
       */
      override fun customKeys(customKeys: List<Any>) {
        cdkBuilder.customKeys(customKeys)
      }

      /**
       * @param customKeys Specifies the aggregate keys to use in a rate-base rule.
       */
      override fun customKeys(vararg customKeys: Any): Unit = customKeys(customKeys.toList())

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * This is required if you specify a forwarded IP in the rule's aggregate key settings.
       */
      override fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(IResolvable::unwrap))
      }

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * This is required if you specify a forwarded IP in the rule's aggregate key settings.
       */
      override fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig.let(ForwardedIPConfigurationProperty::unwrap))
      }

      /**
       * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
       * that you specify, instead of using the IP address that's reported by the web request origin.
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * This is required if you specify a forwarded IP in the rule's aggregate key settings.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66d6b4b34b8729fab7ced212e36788285f427e1a88ab1a93bd50f8f1c905f5c8")
      override
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit):
          Unit = forwardedIpConfig(ForwardedIPConfigurationProperty(forwardedIpConfig))

      /**
       * @param limit The limit on requests per 5-minute period for a single aggregation instance
       * for the rate-based rule. 
       * If the rate-based statement includes a `ScopeDownStatement` , this limit is applied only to
       * the requests that match the statement.
       *
       * Examples:
       *
       * * If you aggregate on just the IP address, this is the limit on requests from any single IP
       * address.
       * * If you aggregate on the HTTP method and the query argument name "city", then this is the
       * limit on requests for any single method, city pair.
       */
      override fun limit(limit: Number) {
        cdkBuilder.limit(limit)
      }

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated and managed by the rate-based statement.
       * When you use a scope-down statement, the rate-based rule only tracks and rate limits
       * requests that match the scope-down statement. You can use any nestable `Statement` in the
       * scope-down statement, and you can nest statements at any level, the same as you can for a rule
       * statement.
       */
      override fun scopeDownStatement(scopeDownStatement: IResolvable) {
        cdkBuilder.scopeDownStatement(scopeDownStatement.let(IResolvable::unwrap))
      }

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated and managed by the rate-based statement.
       * When you use a scope-down statement, the rate-based rule only tracks and rate limits
       * requests that match the scope-down statement. You can use any nestable `Statement` in the
       * scope-down statement, and you can nest statements at any level, the same as you can for a rule
       * statement.
       */
      override fun scopeDownStatement(scopeDownStatement: StatementProperty) {
        cdkBuilder.scopeDownStatement(scopeDownStatement.let(StatementProperty::unwrap))
      }

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated and managed by the rate-based statement.
       * When you use a scope-down statement, the rate-based rule only tracks and rate limits
       * requests that match the scope-down statement. You can use any nestable `Statement` in the
       * scope-down statement, and you can nest statements at any level, the same as you can for a rule
       * statement.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46c7c628fa6c373879f7fe437cda0831a075f3df8980c268da4be8cea4e8348b")
      override fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit):
          Unit = scopeDownStatement(StatementProperty(scopeDownStatement))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty,
    ) : RateBasedStatementProperty {
      /**
       * Setting that indicates how to aggregate the request counts.
       *
       *
       * Web requests that are missing any of the components specified in the aggregation keys are
       * omitted from the rate-based rule evaluation and handling.
       *
       *
       * * `CONSTANT` - Count and limit the requests that match the rate-based rule's scope-down
       * statement. With this option, the counted requests aren't further aggregated. The scope-down
       * statement is the only specification used. When the count of all requests that satisfy the
       * scope-down statement goes over the limit, AWS WAF applies the rule action to all requests that
       * satisfy the scope-down statement.
       *
       * With this option, you must configure the `ScopeDownStatement` property.
       *
       * * `CUSTOM_KEYS` - Aggregate the request counts using one or more web request components as
       * the aggregate keys.
       *
       * With this option, you must specify the aggregate keys in the `CustomKeys` property.
       *
       * To aggregate on only the IP address or only the forwarded IP address, don't use custom
       * keys. Instead, set the aggregate key type to `IP` or `FORWARDED_IP` .
       *
       * * `FORWARDED_IP` - Aggregate the request counts on the first IP address in an HTTP header.
       *
       * With this option, you must specify the header to use in the `ForwardedIPConfig` property.
       *
       * To aggregate on a combination of the forwarded IP address with other aggregate keys, use
       * `CUSTOM_KEYS` .
       *
       * * `IP` - Aggregate the request counts on the IP address from the web request origin.
       *
       * To aggregate on a combination of the IP address with other aggregate keys, use
       * `CUSTOM_KEYS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html#cfn-wafv2-rulegroup-ratebasedstatement-aggregatekeytype)
       */
      override fun aggregateKeyType(): String = unwrap(this).getAggregateKeyType()

      /**
       * Specifies the aggregate keys to use in a rate-base rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html#cfn-wafv2-rulegroup-ratebasedstatement-customkeys)
       */
      override fun customKeys(): Any? = unwrap(this).getCustomKeys()

      /**
       * The configuration for inspecting IP addresses in an HTTP header that you specify, instead
       * of using the IP address that's reported by the web request origin.
       *
       * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
       *
       *
       * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
       * web request at all.
       *
       *
       * This is required if you specify a forwarded IP in the rule's aggregate key settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html#cfn-wafv2-rulegroup-ratebasedstatement-forwardedipconfig)
       */
      override fun forwardedIpConfig(): Any? = unwrap(this).getForwardedIpConfig()

      /**
       * The limit on requests per 5-minute period for a single aggregation instance for the
       * rate-based rule.
       *
       * If the rate-based statement includes a `ScopeDownStatement` , this limit is applied only to
       * the requests that match the statement.
       *
       * Examples:
       *
       * * If you aggregate on just the IP address, this is the limit on requests from any single IP
       * address.
       * * If you aggregate on the HTTP method and the query argument name "city", then this is the
       * limit on requests for any single method, city pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html#cfn-wafv2-rulegroup-ratebasedstatement-limit)
       */
      override fun limit(): Number = unwrap(this).getLimit()

      /**
       * An optional nested statement that narrows the scope of the web requests that are evaluated
       * and managed by the rate-based statement.
       *
       * When you use a scope-down statement, the rate-based rule only tracks and rate limits
       * requests that match the scope-down statement. You can use any nestable `Statement` in the
       * scope-down statement, and you can nest statements at any level, the same as you can for a rule
       * statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html#cfn-wafv2-rulegroup-ratebasedstatement-scopedownstatement)
       */
      override fun scopeDownStatement(): Any? = unwrap(this).getScopeDownStatement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateBasedStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty):
          RateBasedStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateBasedStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RateLimitHeaderProperty {
    /**
     * The name of the header to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitheader.html#cfn-wafv2-rulegroup-ratelimitheader-name)
     */
    public fun name(): String

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * Text transformations are used in rule match statements, to transform the `FieldToMatch`
     * request component before inspecting it, and they're used in rate-based rule statements, to
     * transform request components before using them as custom aggregation keys. If you specify one or
     * more transformations to apply, AWS WAF performs all transformations on the specified content,
     * starting from the lowest priority setting, and then uses the transformed component contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitheader.html#cfn-wafv2-rulegroup-ratelimitheader-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [RateLimitHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the header to use. 
       */
      public fun name(name: String)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty.builder()

      /**
       * @param name The name of the header to use. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty,
    ) : RateLimitHeaderProperty {
      /**
       * The name of the header to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitheader.html#cfn-wafv2-rulegroup-ratelimitheader-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitheader.html#cfn-wafv2-rulegroup-ratelimitheader-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty):
          RateLimitHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HeadersProperty {
    /**
     * The filter to use to identify the subset of headers to inspect in a web request.
     *
     * You must specify exactly one setting: either `All` , `IncludedHeaders` , or `ExcludedHeaders`
     * .
     *
     * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headers.html#cfn-wafv2-rulegroup-headers-matchpattern)
     */
    public fun matchPattern(): Any

    /**
     * The parts of the headers to match with the rule inspection criteria.
     *
     * If you specify `ALL` , AWS WAF inspects both keys and values.
     *
     * `All` does not require a match to be found in the keys and a match to be found in the values.
     * It requires a match to be found in the keys or the values or both. To require a match in the
     * keys and in the values, use a logical `AND` statement to combine two match rules, one that
     * inspects the keys and another that inspects the values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headers.html#cfn-wafv2-rulegroup-headers-matchscope)
     */
    public fun matchScope(): String

    /**
     * What AWS WAF should do if the headers of the request are more numerous or larger than AWS WAF
     * can inspect.
     *
     * AWS WAF does not support inspecting the entire contents of request headers when they exceed 8
     * KB (8192 bytes) or 200 total headers. The underlying host service forwards a maximum of 200
     * headers and at most 8 KB of header contents to AWS WAF .
     *
     * The options for oversize handling are the following:
     *
     * * `CONTINUE` - Inspect the available headers normally, according to the rule inspection
     * criteria.
     * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
     * action to the request.
     * * `NO_MATCH` - Treat the web request as not matching the rule statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headers.html#cfn-wafv2-rulegroup-headers-oversizehandling)
     */
    public fun oversizeHandling(): String

    /**
     * A builder for [HeadersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param matchPattern The filter to use to identify the subset of headers to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedHeaders` , or
       * `ExcludedHeaders` .
       *
       * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
       */
      public fun matchPattern(matchPattern: IResolvable)

      /**
       * @param matchPattern The filter to use to identify the subset of headers to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedHeaders` , or
       * `ExcludedHeaders` .
       *
       * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
       */
      public fun matchPattern(matchPattern: HeaderMatchPatternProperty)

      /**
       * @param matchPattern The filter to use to identify the subset of headers to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedHeaders` , or
       * `ExcludedHeaders` .
       *
       * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ca701f0e2a77272bf2f76e6d7688fc4f80233f972755f0c81b1e13bacd25f1d")
      public fun matchPattern(matchPattern: HeaderMatchPatternProperty.Builder.() -> Unit)

      /**
       * @param matchScope The parts of the headers to match with the rule inspection criteria. 
       * If you specify `ALL` , AWS WAF inspects both keys and values.
       *
       * `All` does not require a match to be found in the keys and a match to be found in the
       * values. It requires a match to be found in the keys or the values or both. To require a match
       * in the keys and in the values, use a logical `AND` statement to combine two match rules, one
       * that inspects the keys and another that inspects the values.
       */
      public fun matchScope(matchScope: String)

      /**
       * @param oversizeHandling What AWS WAF should do if the headers of the request are more
       * numerous or larger than AWS WAF can inspect. 
       * AWS WAF does not support inspecting the entire contents of request headers when they exceed
       * 8 KB (8192 bytes) or 200 total headers. The underlying host service forwards a maximum of 200
       * headers and at most 8 KB of header contents to AWS WAF .
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available headers normally, according to the rule inspection
       * criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       */
      public fun oversizeHandling(oversizeHandling: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty.builder()

      /**
       * @param matchPattern The filter to use to identify the subset of headers to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedHeaders` , or
       * `ExcludedHeaders` .
       *
       * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
       */
      override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      /**
       * @param matchPattern The filter to use to identify the subset of headers to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedHeaders` , or
       * `ExcludedHeaders` .
       *
       * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
       */
      override fun matchPattern(matchPattern: HeaderMatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(HeaderMatchPatternProperty::unwrap))
      }

      /**
       * @param matchPattern The filter to use to identify the subset of headers to inspect in a web
       * request. 
       * You must specify exactly one setting: either `All` , `IncludedHeaders` , or
       * `ExcludedHeaders` .
       *
       * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ca701f0e2a77272bf2f76e6d7688fc4f80233f972755f0c81b1e13bacd25f1d")
      override fun matchPattern(matchPattern: HeaderMatchPatternProperty.Builder.() -> Unit): Unit =
          matchPattern(HeaderMatchPatternProperty(matchPattern))

      /**
       * @param matchScope The parts of the headers to match with the rule inspection criteria. 
       * If you specify `ALL` , AWS WAF inspects both keys and values.
       *
       * `All` does not require a match to be found in the keys and a match to be found in the
       * values. It requires a match to be found in the keys or the values or both. To require a match
       * in the keys and in the values, use a logical `AND` statement to combine two match rules, one
       * that inspects the keys and another that inspects the values.
       */
      override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      /**
       * @param oversizeHandling What AWS WAF should do if the headers of the request are more
       * numerous or larger than AWS WAF can inspect. 
       * AWS WAF does not support inspecting the entire contents of request headers when they exceed
       * 8 KB (8192 bytes) or 200 total headers. The underlying host service forwards a maximum of 200
       * headers and at most 8 KB of header contents to AWS WAF .
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available headers normally, according to the rule inspection
       * criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       */
      override fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty,
    ) : HeadersProperty {
      /**
       * The filter to use to identify the subset of headers to inspect in a web request.
       *
       * You must specify exactly one setting: either `All` , `IncludedHeaders` , or
       * `ExcludedHeaders` .
       *
       * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headers.html#cfn-wafv2-rulegroup-headers-matchpattern)
       */
      override fun matchPattern(): Any = unwrap(this).getMatchPattern()

      /**
       * The parts of the headers to match with the rule inspection criteria.
       *
       * If you specify `ALL` , AWS WAF inspects both keys and values.
       *
       * `All` does not require a match to be found in the keys and a match to be found in the
       * values. It requires a match to be found in the keys or the values or both. To require a match
       * in the keys and in the values, use a logical `AND` statement to combine two match rules, one
       * that inspects the keys and another that inspects the values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headers.html#cfn-wafv2-rulegroup-headers-matchscope)
       */
      override fun matchScope(): String = unwrap(this).getMatchScope()

      /**
       * What AWS WAF should do if the headers of the request are more numerous or larger than AWS
       * WAF can inspect.
       *
       * AWS WAF does not support inspecting the entire contents of request headers when they exceed
       * 8 KB (8192 bytes) or 200 total headers. The underlying host service forwards a maximum of 200
       * headers and at most 8 KB of header contents to AWS WAF .
       *
       * The options for oversize handling are the following:
       *
       * * `CONTINUE` - Inspect the available headers normally, according to the rule inspection
       * criteria.
       * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
       * action to the request.
       * * `NO_MATCH` - Treat the web request as not matching the rule statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headers.html#cfn-wafv2-rulegroup-headers-oversizehandling)
       */
      override fun oversizeHandling(): String = unwrap(this).getOversizeHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty):
          HeadersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeadersProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeadersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HeaderMatchPatternProperty {
    /**
     * Inspect all headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headermatchpattern.html#cfn-wafv2-rulegroup-headermatchpattern-all)
     */
    public fun all(): Any? = unwrap(this).getAll()

    /**
     * Inspect only the headers whose keys don't match any of the strings specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headermatchpattern.html#cfn-wafv2-rulegroup-headermatchpattern-excludedheaders)
     */
    public fun excludedHeaders(): List<String> = unwrap(this).getExcludedHeaders() ?: emptyList()

    /**
     * Inspect only the headers that have a key that matches one of the strings specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headermatchpattern.html#cfn-wafv2-rulegroup-headermatchpattern-includedheaders)
     */
    public fun includedHeaders(): List<String> = unwrap(this).getIncludedHeaders() ?: emptyList()

    /**
     * A builder for [HeaderMatchPatternProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param all Inspect all headers.
       */
      public fun all(all: Any)

      /**
       * @param excludedHeaders Inspect only the headers whose keys don't match any of the strings
       * specified here.
       */
      public fun excludedHeaders(excludedHeaders: List<String>)

      /**
       * @param excludedHeaders Inspect only the headers whose keys don't match any of the strings
       * specified here.
       */
      public fun excludedHeaders(vararg excludedHeaders: String)

      /**
       * @param includedHeaders Inspect only the headers that have a key that matches one of the
       * strings specified here.
       */
      public fun includedHeaders(includedHeaders: List<String>)

      /**
       * @param includedHeaders Inspect only the headers that have a key that matches one of the
       * strings specified here.
       */
      public fun includedHeaders(vararg includedHeaders: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty.builder()

      /**
       * @param all Inspect all headers.
       */
      override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      /**
       * @param excludedHeaders Inspect only the headers whose keys don't match any of the strings
       * specified here.
       */
      override fun excludedHeaders(excludedHeaders: List<String>) {
        cdkBuilder.excludedHeaders(excludedHeaders)
      }

      /**
       * @param excludedHeaders Inspect only the headers whose keys don't match any of the strings
       * specified here.
       */
      override fun excludedHeaders(vararg excludedHeaders: String): Unit =
          excludedHeaders(excludedHeaders.toList())

      /**
       * @param includedHeaders Inspect only the headers that have a key that matches one of the
       * strings specified here.
       */
      override fun includedHeaders(includedHeaders: List<String>) {
        cdkBuilder.includedHeaders(includedHeaders)
      }

      /**
       * @param includedHeaders Inspect only the headers that have a key that matches one of the
       * strings specified here.
       */
      override fun includedHeaders(vararg includedHeaders: String): Unit =
          includedHeaders(includedHeaders.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty,
    ) : HeaderMatchPatternProperty {
      /**
       * Inspect all headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headermatchpattern.html#cfn-wafv2-rulegroup-headermatchpattern-all)
       */
      override fun all(): Any? = unwrap(this).getAll()

      /**
       * Inspect only the headers whose keys don't match any of the strings specified here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headermatchpattern.html#cfn-wafv2-rulegroup-headermatchpattern-excludedheaders)
       */
      override fun excludedHeaders(): List<String> = unwrap(this).getExcludedHeaders() ?:
          emptyList()

      /**
       * Inspect only the headers that have a key that matches one of the strings specified here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headermatchpattern.html#cfn-wafv2-rulegroup-headermatchpattern-includedheaders)
       */
      override fun includedHeaders(): List<String> = unwrap(this).getIncludedHeaders() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty):
          HeaderMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.HeaderMatchPatternProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface LabelSummaryProperty {
    /**
     * An individual label specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-labelsummary.html#cfn-wafv2-rulegroup-labelsummary-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [LabelSummaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name An individual label specification.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty.builder()

      /**
       * @param name An individual label specification.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty,
    ) : LabelSummaryProperty {
      /**
       * An individual label specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-labelsummary.html#cfn-wafv2-rulegroup-labelsummary-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty):
          LabelSummaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelSummaryProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LabelProperty {
    /**
     * The label string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-label.html#cfn-wafv2-rulegroup-label-name)
     */
    public fun name(): String

    /**
     * A builder for [LabelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The label string. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty.builder()

      /**
       * @param name The label string. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty,
    ) : LabelProperty {
      /**
       * The label string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-label.html#cfn-wafv2-rulegroup-label-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty):
          LabelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AndStatementProperty {
    /**
     * The statements to combine with AND logic.
     *
     * You can use any statements that can be nested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-andstatement.html#cfn-wafv2-rulegroup-andstatement-statements)
     */
    public fun statements(): Any

    /**
     * A builder for [AndStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param statements The statements to combine with AND logic. 
       * You can use any statements that can be nested.
       */
      public fun statements(statements: IResolvable)

      /**
       * @param statements The statements to combine with AND logic. 
       * You can use any statements that can be nested.
       */
      public fun statements(statements: List<Any>)

      /**
       * @param statements The statements to combine with AND logic. 
       * You can use any statements that can be nested.
       */
      public fun statements(vararg statements: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty.builder()

      /**
       * @param statements The statements to combine with AND logic. 
       * You can use any statements that can be nested.
       */
      override fun statements(statements: IResolvable) {
        cdkBuilder.statements(statements.let(IResolvable::unwrap))
      }

      /**
       * @param statements The statements to combine with AND logic. 
       * You can use any statements that can be nested.
       */
      override fun statements(statements: List<Any>) {
        cdkBuilder.statements(statements)
      }

      /**
       * @param statements The statements to combine with AND logic. 
       * You can use any statements that can be nested.
       */
      override fun statements(vararg statements: Any): Unit = statements(statements.toList())

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty,
    ) : AndStatementProperty {
      /**
       * The statements to combine with AND logic.
       *
       * You can use any statements that can be nested.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-andstatement.html#cfn-wafv2-rulegroup-andstatement-statements)
       */
      override fun statements(): Any = unwrap(this).getStatements()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AndStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty):
          AndStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AndStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RateLimitQueryArgumentProperty {
    /**
     * The name of the query argument to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitqueryargument.html#cfn-wafv2-rulegroup-ratelimitqueryargument-name)
     */
    public fun name(): String

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * Text transformations are used in rule match statements, to transform the `FieldToMatch`
     * request component before inspecting it, and they're used in rate-based rule statements, to
     * transform request components before using them as custom aggregation keys. If you specify one or
     * more transformations to apply, AWS WAF performs all transformations on the specified content,
     * starting from the lowest priority setting, and then uses the transformed component contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitqueryargument.html#cfn-wafv2-rulegroup-ratelimitqueryargument-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [RateLimitQueryArgumentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the query argument to use. 
       */
      public fun name(name: String)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty.builder()

      /**
       * @param name The name of the query argument to use. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty,
    ) : RateLimitQueryArgumentProperty {
      /**
       * The name of the query argument to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitqueryargument.html#cfn-wafv2-rulegroup-ratelimitqueryargument-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitqueryargument.html#cfn-wafv2-rulegroup-ratelimitqueryargument-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitQueryArgumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty):
          RateLimitQueryArgumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitQueryArgumentProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryArgumentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RateLimitQueryStringProperty {
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * Text transformations are used in rule match statements, to transform the `FieldToMatch`
     * request component before inspecting it, and they're used in rate-based rule statements, to
     * transform request components before using them as custom aggregation keys. If you specify one or
     * more transformations to apply, AWS WAF performs all transformations on the specified content,
     * starting from the lowest priority setting, and then uses the transformed component contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitquerystring.html#cfn-wafv2-rulegroup-ratelimitquerystring-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [RateLimitQueryStringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty.builder()

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty,
    ) : RateLimitQueryStringProperty {
      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * Text transformations are used in rule match statements, to transform the `FieldToMatch`
       * request component before inspecting it, and they're used in rate-based rule statements, to
       * transform request components before using them as custom aggregation keys. If you specify one
       * or more transformations to apply, AWS WAF performs all transformations on the specified
       * content, starting from the lowest priority setting, and then uses the transformed component
       * contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratelimitquerystring.html#cfn-wafv2-rulegroup-ratelimitquerystring-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitQueryStringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty):
          RateLimitQueryStringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitQueryStringProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateLimitQueryStringProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SqliMatchStatementProperty {
    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html#cfn-wafv2-rulegroup-sqlimatchstatement-fieldtomatch)
     */
    public fun fieldToMatch(): Any

    /**
     * The sensitivity that you want AWS WAF to use to inspect for SQL injection attacks.
     *
     * `HIGH` detects more attacks, but might generate more false positives, especially if your web
     * requests frequently contain unusual strings. For information about identifying and mitigating
     * false positives, see [Testing and
     * tuning](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html) in the *AWS
     * WAF Developer Guide* .
     *
     * `LOW` is generally a better choice for resources that already have other protections against
     * SQL injection attacks or that have a low tolerance for false positives.
     *
     * Default: `LOW`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html#cfn-wafv2-rulegroup-sqlimatchstatement-sensitivitylevel)
     */
    public fun sensitivityLevel(): String? = unwrap(this).getSensitivityLevel()

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content of the request component identified by `FieldToMatch` , starting
     * from the lowest priority setting, before inspecting the content for a match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html#cfn-wafv2-rulegroup-sqlimatchstatement-texttransformations)
     */
    public fun textTransformations(): Any

    /**
     * A builder for [SqliMatchStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: IResolvable)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5864dba30483c0a63f75efab73f312d58ebc84cc024408d3ae7ad3dadb4f450b")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      /**
       * @param sensitivityLevel The sensitivity that you want AWS WAF to use to inspect for SQL
       * injection attacks.
       * `HIGH` detects more attacks, but might generate more false positives, especially if your
       * web requests frequently contain unusual strings. For information about identifying and
       * mitigating false positives, see [Testing and
       * tuning](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html) in the
       * *AWS WAF Developer Guide* .
       *
       * `LOW` is generally a better choice for resources that already have other protections
       * against SQL injection attacks or that have a low tolerance for false positives.
       *
       * Default: `LOW`
       */
      public fun sensitivityLevel(sensitivityLevel: String)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: IResolvable)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(textTransformations: List<Any>)

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      public fun textTransformations(vararg textTransformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty.builder()

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      /**
       * @param fieldToMatch The part of the web request that you want AWS WAF to inspect. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5864dba30483c0a63f75efab73f312d58ebc84cc024408d3ae7ad3dadb4f450b")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      /**
       * @param sensitivityLevel The sensitivity that you want AWS WAF to use to inspect for SQL
       * injection attacks.
       * `HIGH` detects more attacks, but might generate more false positives, especially if your
       * web requests frequently contain unusual strings. For information about identifying and
       * mitigating false positives, see [Testing and
       * tuning](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html) in the
       * *AWS WAF Developer Guide* .
       *
       * `LOW` is generally a better choice for resources that already have other protections
       * against SQL injection attacks or that have a low tolerance for false positives.
       *
       * Default: `LOW`
       */
      override fun sensitivityLevel(sensitivityLevel: String) {
        cdkBuilder.sensitivityLevel(sensitivityLevel)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations.let(IResolvable::unwrap))
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(textTransformations: List<Any>) {
        cdkBuilder.textTransformations(textTransformations)
      }

      /**
       * @param textTransformations Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass detection. 
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       */
      override fun textTransformations(vararg textTransformations: Any): Unit =
          textTransformations(textTransformations.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty,
    ) : SqliMatchStatementProperty {
      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html#cfn-wafv2-rulegroup-sqlimatchstatement-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      /**
       * The sensitivity that you want AWS WAF to use to inspect for SQL injection attacks.
       *
       * `HIGH` detects more attacks, but might generate more false positives, especially if your
       * web requests frequently contain unusual strings. For information about identifying and
       * mitigating false positives, see [Testing and
       * tuning](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html) in the
       * *AWS WAF Developer Guide* .
       *
       * `LOW` is generally a better choice for resources that already have other protections
       * against SQL injection attacks or that have a low tolerance for false positives.
       *
       * Default: `LOW`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html#cfn-wafv2-rulegroup-sqlimatchstatement-sensitivitylevel)
       */
      override fun sensitivityLevel(): String? = unwrap(this).getSensitivityLevel()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass detection.
       *
       * If you specify one or more transformations in a rule statement, AWS WAF performs all
       * transformations on the content of the request component identified by `FieldToMatch` ,
       * starting from the lowest priority setting, before inspecting the content for a match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html#cfn-wafv2-rulegroup-sqlimatchstatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SqliMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty):
          SqliMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqliMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CaptchaProperty {
    /**
     * Custom request handling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-captcha.html#cfn-wafv2-rulegroup-captcha-customrequesthandling)
     */
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    /**
     * A builder for [CaptchaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customRequestHandling Custom request handling.
       */
      public fun customRequestHandling(customRequestHandling: IResolvable)

      /**
       * @param customRequestHandling Custom request handling.
       */
      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      /**
       * @param customRequestHandling Custom request handling.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde15674439e2c8e007bbc8f6352e40468f1ae87a9a7ac0c04dec65372986592")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty.builder()

      /**
       * @param customRequestHandling Custom request handling.
       */
      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      /**
       * @param customRequestHandling Custom request handling.
       */
      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      /**
       * @param customRequestHandling Custom request handling.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde15674439e2c8e007bbc8f6352e40468f1ae87a9a7ac0c04dec65372986592")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty,
    ) : CaptchaProperty {
      /**
       * Custom request handling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-captcha.html#cfn-wafv2-rulegroup-captcha-customrequesthandling)
       */
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptchaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty):
          CaptchaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptchaProperty):
          software.amazon.awscdk.services.wafv2.CfnRuleGroup.CaptchaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
