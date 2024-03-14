package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CdkObject
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

public open class CfnWebACL internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Specifies custom configurations for the associations between the web ACL and protected
   * resources.
   */
  public open fun associationConfig(): Any? = unwrap(this).getAssociationConfig()

  /**
   * Specifies custom configurations for the associations between the web ACL and protected
   * resources.
   */
  public open fun associationConfig(`value`: IResolvable) {
    unwrap(this).setAssociationConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies custom configurations for the associations between the web ACL and protected
   * resources.
   */
  public open fun associationConfig(`value`: AssociationConfigProperty) {
    unwrap(this).setAssociationConfig(`value`.let(AssociationConfigProperty::unwrap))
  }

  /**
   * Specifies custom configurations for the associations between the web ACL and protected
   * resources.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8d44cd46ea74eaf93435c00e393c5ee29ecc97c90a28ca61ec1cf369c6af806")
  public open fun associationConfig(`value`: AssociationConfigProperty.Builder.() -> Unit): Unit =
      associationConfig(AssociationConfigProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the web ACL.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The web ACL capacity units (WCUs) currently being used by this web ACL.
   *
   * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your
   * rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to
   * reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than
   * more complex rules that use more processing power. Rule group capacity is fixed at creation, which
   * helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is
   * 1,500.
   */
  public open fun attrCapacity(): Number = unwrap(this).getAttrCapacity()

  /**
   * The ID of the web ACL.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The label namespace prefix for this web ACL.
   *
   * All labels added by rules in this web ACL have this prefix.
   *
   * The syntax for the label namespace prefix for a web ACL is the following: `awswaf:&lt;account
   * ID&gt;:webacl:&lt;web ACL name&gt;:`
   *
   * When a rule with a label matches a web request, AWS WAF adds the fully qualified label to the
   * request. A fully qualified label is made up of the label namespace from the rule group or web ACL
   * where the rule is defined and the label from the rule, separated by a colon.
   */
  public open fun attrLabelNamespace(): String = unwrap(this).getAttrLabelNamespace()

  /**
   * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
   * `CaptchaConfig` settings.
   */
  public open fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

  /**
   * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
   * `CaptchaConfig` settings.
   */
  public open fun captchaConfig(`value`: IResolvable) {
    unwrap(this).setCaptchaConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
   * `CaptchaConfig` settings.
   */
  public open fun captchaConfig(`value`: CaptchaConfigProperty) {
    unwrap(this).setCaptchaConfig(`value`.let(CaptchaConfigProperty::unwrap))
  }

  /**
   * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
   * `CaptchaConfig` settings.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3c7506b9ddc1e15ef1c965b07f29c3a62103b391c09014442a659b79e29de2a1")
  public open fun captchaConfig(`value`: CaptchaConfigProperty.Builder.() -> Unit): Unit =
      captchaConfig(CaptchaConfigProperty(`value`))

  /**
   * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
   * `ChallengeConfig` settings.
   */
  public open fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

  /**
   * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
   * `ChallengeConfig` settings.
   */
  public open fun challengeConfig(`value`: IResolvable) {
    unwrap(this).setChallengeConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
   * `ChallengeConfig` settings.
   */
  public open fun challengeConfig(`value`: ChallengeConfigProperty) {
    unwrap(this).setChallengeConfig(`value`.let(ChallengeConfigProperty::unwrap))
  }

  /**
   * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
   * `ChallengeConfig` settings.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7214ccbc227561f4f409f42112be67d663bb91fa1c181f57768067608f73db5")
  public open fun challengeConfig(`value`: ChallengeConfigProperty.Builder.() -> Unit): Unit =
      challengeConfig(ChallengeConfigProperty(`value`))

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
  public open fun defaultAction(`value`: DefaultActionProperty) {
    unwrap(this).setDefaultAction(`value`.let(DefaultActionProperty::unwrap))
  }

  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("767c85cd028330411774fd7cf444ef3e4433adf329d0f503bb6e80d5cc5ab2a6")
  public open fun defaultAction(`value`: DefaultActionProperty.Builder.() -> Unit): Unit =
      defaultAction(DefaultActionProperty(`value`))

  /**
   * A description of the web ACL that helps with identification.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the web ACL that helps with identification.
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
   * The name of the web ACL.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the web ACL.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The rule statements used to identify the web requests that you want to manage.
   */
  public open fun rules(): Any? = unwrap(this).getRules()

  /**
   * The rule statements used to identify the web requests that you want to manage.
   */
  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * The rule statements used to identify the web requests that you want to manage.
   */
  public open fun rules(__idx_ac66f0: List<Any>) {
    unwrap(this).setRules(__idx_ac66f0)
  }

  /**
   * The rule statements used to identify the web requests that you want to manage.
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
   * Specifies the domains that AWS WAF should accept in a web request token.
   */
  public open fun tokenDomains(): List<String> = unwrap(this).getTokenDomains() ?: emptyList()

  /**
   * Specifies the domains that AWS WAF should accept in a web request token.
   */
  public open fun tokenDomains(`value`: List<String>) {
    unwrap(this).setTokenDomains(`value`)
  }

  /**
   * Specifies the domains that AWS WAF should accept in a web request token.
   */
  public open fun tokenDomains(vararg `value`: String): Unit = tokenDomains(`value`.toList())

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
  @JvmName("3d0b6519c4f6096fdacf368e2babb053cf58650b4c112c0e0e61be115cfc4352")
  public open fun visibilityConfig(`value`: VisibilityConfigProperty.Builder.() -> Unit): Unit =
      visibilityConfig(VisibilityConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wafv2.CfnWebACL].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies custom configurations for the associations between the web ACL and protected
     * resources.
     *
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-associationconfig)
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources. 
     */
    public fun associationConfig(associationConfig: IResolvable)

    /**
     * Specifies custom configurations for the associations between the web ACL and protected
     * resources.
     *
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-associationconfig)
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources. 
     */
    public fun associationConfig(associationConfig: AssociationConfigProperty)

    /**
     * Specifies custom configurations for the associations between the web ACL and protected
     * resources.
     *
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-associationconfig)
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b157c56318139e90e87caf02fdd9c5b39aee4f4a349105f25b1693606e84b94")
    public fun associationConfig(associationConfig: AssociationConfigProperty.Builder.() -> Unit)

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
     * `CaptchaConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-captchaconfig)
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings. 
     */
    public fun captchaConfig(captchaConfig: IResolvable)

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
     * `CaptchaConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-captchaconfig)
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings. 
     */
    public fun captchaConfig(captchaConfig: CaptchaConfigProperty)

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
     * `CaptchaConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-captchaconfig)
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb3f410fb840568904dacda5933cf4f3b89887e4337ad9765bb6da381cd94768")
    public fun captchaConfig(captchaConfig: CaptchaConfigProperty.Builder.() -> Unit)

    /**
     * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
     * `ChallengeConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-challengeconfig)
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings. 
     */
    public fun challengeConfig(challengeConfig: IResolvable)

    /**
     * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
     * `ChallengeConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-challengeconfig)
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings. 
     */
    public fun challengeConfig(challengeConfig: ChallengeConfigProperty)

    /**
     * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
     * `ChallengeConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-challengeconfig)
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86735407a6e03fb461828efe675d9a053bdbecc31fe7b8b160727c1d5e1111e2")
    public fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit)

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the web ACL, and then use them in the rules and default actions
     * that you define in the web ACL.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-customresponsebodies)
     * @param customResponseBodies A map of custom response keys and content bodies. 
     */
    public fun customResponseBodies(customResponseBodies: IResolvable)

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the web ACL, and then use them in the rules and default actions
     * that you define in the web ACL.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-customresponsebodies)
     * @param customResponseBodies A map of custom response keys and content bodies. 
     */
    public fun customResponseBodies(customResponseBodies: Map<String, Any>)

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    public fun defaultAction(defaultAction: IResolvable)

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    public fun defaultAction(defaultAction: DefaultActionProperty)

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac71eeb51f4a9714d1d1a020b68ca80c8d898d57876b3cade63d161306ce39b3")
    public fun defaultAction(defaultAction: DefaultActionProperty.Builder.() -> Unit)

    /**
     * A description of the web ACL that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-description)
     * @param description A description of the web ACL that helps with identification. 
     */
    public fun description(description: String)

    /**
     * The name of the web ACL.
     *
     * You cannot change the name of a web ACL after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-name)
     * @param name The name of the web ACL. 
     */
    public fun name(name: String)

    /**
     * The rule statements used to identify the web requests that you want to manage.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     * @param rules The rule statements used to identify the web requests that you want to manage. 
     */
    public fun rules(rules: IResolvable)

    /**
     * The rule statements used to identify the web requests that you want to manage.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     * @param rules The rule statements used to identify the web requests that you want to manage. 
     */
    public fun rules(rules: List<Any>)

    /**
     * The rule statements used to identify the web requests that you want to manage.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     * @param rules The rule statements used to identify the web requests that you want to manage. 
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
     * For information about how to define the association of the web ACL with your resource, see
     * `WebACLAssociation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-scope)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tags)
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies the domains that AWS WAF should accept in a web request token.
     *
     * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     * specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected
     * resource. With a token domain list, AWS WAF accepts the resource's host domain plus all domains
     * in the token domain list, including their prefixed subdomains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tokendomains)
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token. 
     */
    public fun tokenDomains(tokenDomains: List<String>)

    /**
     * Specifies the domains that AWS WAF should accept in a web request token.
     *
     * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     * specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected
     * resource. With a token domain list, AWS WAF accepts the resource's host domain plus all domains
     * in the token domain list, including their prefixed subdomains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tokendomains)
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token. 
     */
    public fun tokenDomains(vararg tokenDomains: String)

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    public fun visibilityConfig(visibilityConfig: IResolvable)

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty)

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f079dd60acb4618b73f079541e13bcf3cd8d3cf9b337364b36875956de508700")
    public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACL.Builder =
        software.amazon.awscdk.services.wafv2.CfnWebACL.Builder.create(scope, id)

    /**
     * Specifies custom configurations for the associations between the web ACL and protected
     * resources.
     *
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-associationconfig)
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources. 
     */
    override fun associationConfig(associationConfig: IResolvable) {
      cdkBuilder.associationConfig(associationConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies custom configurations for the associations between the web ACL and protected
     * resources.
     *
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-associationconfig)
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources. 
     */
    override fun associationConfig(associationConfig: AssociationConfigProperty) {
      cdkBuilder.associationConfig(associationConfig.let(AssociationConfigProperty::unwrap))
    }

    /**
     * Specifies custom configurations for the associations between the web ACL and protected
     * resources.
     *
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-associationconfig)
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b157c56318139e90e87caf02fdd9c5b39aee4f4a349105f25b1693606e84b94")
    override fun associationConfig(associationConfig: AssociationConfigProperty.Builder.() -> Unit):
        Unit = associationConfig(AssociationConfigProperty(associationConfig))

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
     * `CaptchaConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-captchaconfig)
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings. 
     */
    override fun captchaConfig(captchaConfig: IResolvable) {
      cdkBuilder.captchaConfig(captchaConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
     * `CaptchaConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-captchaconfig)
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings. 
     */
    override fun captchaConfig(captchaConfig: CaptchaConfigProperty) {
      cdkBuilder.captchaConfig(captchaConfig.let(CaptchaConfigProperty::unwrap))
    }

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
     * `CaptchaConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-captchaconfig)
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb3f410fb840568904dacda5933cf4f3b89887e4337ad9765bb6da381cd94768")
    override fun captchaConfig(captchaConfig: CaptchaConfigProperty.Builder.() -> Unit): Unit =
        captchaConfig(CaptchaConfigProperty(captchaConfig))

    /**
     * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
     * `ChallengeConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-challengeconfig)
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings. 
     */
    override fun challengeConfig(challengeConfig: IResolvable) {
      cdkBuilder.challengeConfig(challengeConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
     * `ChallengeConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-challengeconfig)
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings. 
     */
    override fun challengeConfig(challengeConfig: ChallengeConfigProperty) {
      cdkBuilder.challengeConfig(challengeConfig.let(ChallengeConfigProperty::unwrap))
    }

    /**
     * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
     * `ChallengeConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-challengeconfig)
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86735407a6e03fb461828efe675d9a053bdbecc31fe7b8b160727c1d5e1111e2")
    override fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit): Unit
        = challengeConfig(ChallengeConfigProperty(challengeConfig))

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the web ACL, and then use them in the rules and default actions
     * that you define in the web ACL.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-customresponsebodies)
     * @param customResponseBodies A map of custom response keys and content bodies. 
     */
    override fun customResponseBodies(customResponseBodies: IResolvable) {
      cdkBuilder.customResponseBodies(customResponseBodies.let(IResolvable::unwrap))
    }

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the web ACL, and then use them in the rules and default actions
     * that you define in the web ACL.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-customresponsebodies)
     * @param customResponseBodies A map of custom response keys and content bodies. 
     */
    override fun customResponseBodies(customResponseBodies: Map<String, Any>) {
      cdkBuilder.customResponseBodies(customResponseBodies)
    }

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    override fun defaultAction(defaultAction: DefaultActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(DefaultActionProperty::unwrap))
    }

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-defaultaction)
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac71eeb51f4a9714d1d1a020b68ca80c8d898d57876b3cade63d161306ce39b3")
    override fun defaultAction(defaultAction: DefaultActionProperty.Builder.() -> Unit): Unit =
        defaultAction(DefaultActionProperty(defaultAction))

    /**
     * A description of the web ACL that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-description)
     * @param description A description of the web ACL that helps with identification. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the web ACL.
     *
     * You cannot change the name of a web ACL after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-name)
     * @param name The name of the web ACL. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The rule statements used to identify the web requests that you want to manage.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     * @param rules The rule statements used to identify the web requests that you want to manage. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    /**
     * The rule statements used to identify the web requests that you want to manage.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     * @param rules The rule statements used to identify the web requests that you want to manage. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    /**
     * The rule statements used to identify the web requests that you want to manage.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     * @param rules The rule statements used to identify the web requests that you want to manage. 
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
     * For information about how to define the association of the web ACL with your resource, see
     * `WebACLAssociation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-scope)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tags)
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies the domains that AWS WAF should accept in a web request token.
     *
     * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     * specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected
     * resource. With a token domain list, AWS WAF accepts the resource's host domain plus all domains
     * in the token domain list, including their prefixed subdomains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tokendomains)
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token. 
     */
    override fun tokenDomains(tokenDomains: List<String>) {
      cdkBuilder.tokenDomains(tokenDomains)
    }

    /**
     * Specifies the domains that AWS WAF should accept in a web request token.
     *
     * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     * specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected
     * resource. With a token domain list, AWS WAF accepts the resource's host domain plus all domains
     * in the token domain list, including their prefixed subdomains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tokendomains)
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token. 
     */
    override fun tokenDomains(vararg tokenDomains: String): Unit =
        tokenDomains(tokenDomains.toList())

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    override fun visibilityConfig(visibilityConfig: IResolvable) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable::unwrap))
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(VisibilityConfigProperty::unwrap))
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-visibilityconfig)
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f079dd60acb4618b73f079541e13bcf3cd8d3cf9b337364b36875956de508700")
    override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit):
        Unit = visibilityConfig(VisibilityConfigProperty(visibilityConfig))

    public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebACL {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebACL(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL): CfnWebACL =
        CfnWebACL(cdkObject)

    internal fun unwrap(wrapped: CfnWebACL): software.amazon.awscdk.services.wafv2.CfnWebACL =
        wrapped.cdkObject
  }

  public interface XssMatchStatementProperty {
    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html#cfn-wafv2-webacl-xssmatchstatement-fieldtomatch)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html#cfn-wafv2-webacl-xssmatchstatement-texttransformations)
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
      @JvmName("142211cec03faffb2428568e29d8f0ea74606c067f194b070ac08cd61e40b2d1")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty.builder()

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
      @JvmName("142211cec03faffb2428568e29d8f0ea74606c067f194b070ac08cd61e40b2d1")
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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty,
    ) : CdkObject(cdkObject), XssMatchStatementProperty {
      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html#cfn-wafv2-webacl-xssmatchstatement-fieldtomatch)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html#cfn-wafv2-webacl-xssmatchstatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): XssMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty):
          XssMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: XssMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty
    }
  }

  public interface HeaderMatchPatternProperty {
    /**
     * Inspect all headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headermatchpattern.html#cfn-wafv2-webacl-headermatchpattern-all)
     */
    public fun all(): Any? = unwrap(this).getAll()

    /**
     * Inspect only the headers whose keys don't match any of the strings specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headermatchpattern.html#cfn-wafv2-webacl-headermatchpattern-excludedheaders)
     */
    public fun excludedHeaders(): List<String> = unwrap(this).getExcludedHeaders() ?: emptyList()

    /**
     * Inspect only the headers that have a key that matches one of the strings specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headermatchpattern.html#cfn-wafv2-webacl-headermatchpattern-includedheaders)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty,
    ) : CdkObject(cdkObject), HeaderMatchPatternProperty {
      /**
       * Inspect all headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headermatchpattern.html#cfn-wafv2-webacl-headermatchpattern-all)
       */
      override fun all(): Any? = unwrap(this).getAll()

      /**
       * Inspect only the headers whose keys don't match any of the strings specified here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headermatchpattern.html#cfn-wafv2-webacl-headermatchpattern-excludedheaders)
       */
      override fun excludedHeaders(): List<String> = unwrap(this).getExcludedHeaders() ?:
          emptyList()

      /**
       * Inspect only the headers that have a key that matches one of the strings specified here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headermatchpattern.html#cfn-wafv2-webacl-headermatchpattern-includedheaders)
       */
      override fun includedHeaders(): List<String> = unwrap(this).getIncludedHeaders() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty):
          HeaderMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeaderMatchPatternProperty
    }
  }

  public interface AWSManagedRulesACFPRuleSetProperty {
    /**
     * The path of the account creation endpoint for your application.
     *
     * This is the page on your website that accepts the completed registration form for a new user.
     * This page must accept `POST` requests.
     *
     * For example, for the URL `https://example.com/web/newaccount` , you would provide the path
     * `/web/newaccount` . Account creation page paths that start with the path that you provide are
     * considered a match. For example `/web/newaccount` matches the account creation paths
     * `/web/newaccount` , `/web/newaccount/` , `/web/newaccountPage` , and `/web/newaccount/thisPage`
     * , but doesn't match the path `/home/web/newaccount` or `/website/newaccount` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html#cfn-wafv2-webacl-awsmanagedrulesacfpruleset-creationpath)
     */
    public fun creationPath(): String

    /**
     * Allow the use of regular expressions in the registration page path and the account creation
     * path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html#cfn-wafv2-webacl-awsmanagedrulesacfpruleset-enableregexinpath)
     */
    public fun enableRegexInPath(): Any? = unwrap(this).getEnableRegexInPath()

    /**
     * The path of the account registration endpoint for your application.
     *
     * This is the page on your website that presents the registration form to new users.
     *
     *
     * This page must accept `GET` text/html requests.
     *
     *
     * For example, for the URL `https://example.com/web/registration` , you would provide the path
     * `/web/registration` . Registration page paths that start with the path that you provide are
     * considered a match. For example `/web/registration` matches the registration paths
     * `/web/registration` , `/web/registration/` , `/web/registrationPage` , and
     * `/web/registration/thisPage` , but doesn't match the path `/home/web/registration` or
     * `/website/registration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html#cfn-wafv2-webacl-awsmanagedrulesacfpruleset-registrationpagepath)
     */
    public fun registrationPagePath(): String

    /**
     * The criteria for inspecting account creation requests, used by the ACFP rule group to
     * validate and track account creation attempts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html#cfn-wafv2-webacl-awsmanagedrulesacfpruleset-requestinspection)
     */
    public fun requestInspection(): Any

    /**
     * The criteria for inspecting responses to account creation requests, used by the ACFP rule
     * group to track account creation success rates.
     *
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     *
     *
     * The ACFP rule group evaluates the responses that your protected resources send back to client
     * account creation attempts, keeping count of successful and failed attempts from each IP address
     * and client session. Using this information, the rule group labels and mitigates requests from
     * client sessions and IP addresses that have had too many successful account creation attempts in
     * a short amount of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html#cfn-wafv2-webacl-awsmanagedrulesacfpruleset-responseinspection)
     */
    public fun responseInspection(): Any? = unwrap(this).getResponseInspection()

    /**
     * A builder for [AWSManagedRulesACFPRuleSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param creationPath The path of the account creation endpoint for your application. 
       * This is the page on your website that accepts the completed registration form for a new
       * user. This page must accept `POST` requests.
       *
       * For example, for the URL `https://example.com/web/newaccount` , you would provide the path
       * `/web/newaccount` . Account creation page paths that start with the path that you provide are
       * considered a match. For example `/web/newaccount` matches the account creation paths
       * `/web/newaccount` , `/web/newaccount/` , `/web/newaccountPage` , and
       * `/web/newaccount/thisPage` , but doesn't match the path `/home/web/newaccount` or
       * `/website/newaccount` .
       */
      public fun creationPath(creationPath: String)

      /**
       * @param enableRegexInPath Allow the use of regular expressions in the registration page path
       * and the account creation path.
       */
      public fun enableRegexInPath(enableRegexInPath: Boolean)

      /**
       * @param enableRegexInPath Allow the use of regular expressions in the registration page path
       * and the account creation path.
       */
      public fun enableRegexInPath(enableRegexInPath: IResolvable)

      /**
       * @param registrationPagePath The path of the account registration endpoint for your
       * application. 
       * This is the page on your website that presents the registration form to new users.
       *
       *
       * This page must accept `GET` text/html requests.
       *
       *
       * For example, for the URL `https://example.com/web/registration` , you would provide the
       * path `/web/registration` . Registration page paths that start with the path that you provide
       * are considered a match. For example `/web/registration` matches the registration paths
       * `/web/registration` , `/web/registration/` , `/web/registrationPage` , and
       * `/web/registration/thisPage` , but doesn't match the path `/home/web/registration` or
       * `/website/registration` .
       */
      public fun registrationPagePath(registrationPagePath: String)

      /**
       * @param requestInspection The criteria for inspecting account creation requests, used by the
       * ACFP rule group to validate and track account creation attempts. 
       */
      public fun requestInspection(requestInspection: IResolvable)

      /**
       * @param requestInspection The criteria for inspecting account creation requests, used by the
       * ACFP rule group to validate and track account creation attempts. 
       */
      public fun requestInspection(requestInspection: RequestInspectionACFPProperty)

      /**
       * @param requestInspection The criteria for inspecting account creation requests, used by the
       * ACFP rule group to validate and track account creation attempts. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("083c28818bc0f7eca217daa839571147132bab0a9e4709d437ff9dd388fdde67")
      public
          fun requestInspection(requestInspection: RequestInspectionACFPProperty.Builder.() -> Unit)

      /**
       * @param responseInspection The criteria for inspecting responses to account creation
       * requests, used by the ACFP rule group to track account creation success rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ACFP rule group evaluates the responses that your protected resources send back to
       * client account creation attempts, keeping count of successful and failed attempts from each IP
       * address and client session. Using this information, the rule group labels and mitigates
       * requests from client sessions and IP addresses that have had too many successful account
       * creation attempts in a short amount of time.
       */
      public fun responseInspection(responseInspection: IResolvable)

      /**
       * @param responseInspection The criteria for inspecting responses to account creation
       * requests, used by the ACFP rule group to track account creation success rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ACFP rule group evaluates the responses that your protected resources send back to
       * client account creation attempts, keeping count of successful and failed attempts from each IP
       * address and client session. Using this information, the rule group labels and mitigates
       * requests from client sessions and IP addresses that have had too many successful account
       * creation attempts in a short amount of time.
       */
      public fun responseInspection(responseInspection: ResponseInspectionProperty)

      /**
       * @param responseInspection The criteria for inspecting responses to account creation
       * requests, used by the ACFP rule group to track account creation success rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ACFP rule group evaluates the responses that your protected resources send back to
       * client account creation attempts, keeping count of successful and failed attempts from each IP
       * address and client session. Using this information, the rule group labels and mitigates
       * requests from client sessions and IP addresses that have had too many successful account
       * creation attempts in a short amount of time.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("684d092c97d7f91fee60dece1bc6b09d120a4aff7fcd6d7512eb368deb7d0dd1")
      public
          fun responseInspection(responseInspection: ResponseInspectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty.builder()

      /**
       * @param creationPath The path of the account creation endpoint for your application. 
       * This is the page on your website that accepts the completed registration form for a new
       * user. This page must accept `POST` requests.
       *
       * For example, for the URL `https://example.com/web/newaccount` , you would provide the path
       * `/web/newaccount` . Account creation page paths that start with the path that you provide are
       * considered a match. For example `/web/newaccount` matches the account creation paths
       * `/web/newaccount` , `/web/newaccount/` , `/web/newaccountPage` , and
       * `/web/newaccount/thisPage` , but doesn't match the path `/home/web/newaccount` or
       * `/website/newaccount` .
       */
      override fun creationPath(creationPath: String) {
        cdkBuilder.creationPath(creationPath)
      }

      /**
       * @param enableRegexInPath Allow the use of regular expressions in the registration page path
       * and the account creation path.
       */
      override fun enableRegexInPath(enableRegexInPath: Boolean) {
        cdkBuilder.enableRegexInPath(enableRegexInPath)
      }

      /**
       * @param enableRegexInPath Allow the use of regular expressions in the registration page path
       * and the account creation path.
       */
      override fun enableRegexInPath(enableRegexInPath: IResolvable) {
        cdkBuilder.enableRegexInPath(enableRegexInPath.let(IResolvable::unwrap))
      }

      /**
       * @param registrationPagePath The path of the account registration endpoint for your
       * application. 
       * This is the page on your website that presents the registration form to new users.
       *
       *
       * This page must accept `GET` text/html requests.
       *
       *
       * For example, for the URL `https://example.com/web/registration` , you would provide the
       * path `/web/registration` . Registration page paths that start with the path that you provide
       * are considered a match. For example `/web/registration` matches the registration paths
       * `/web/registration` , `/web/registration/` , `/web/registrationPage` , and
       * `/web/registration/thisPage` , but doesn't match the path `/home/web/registration` or
       * `/website/registration` .
       */
      override fun registrationPagePath(registrationPagePath: String) {
        cdkBuilder.registrationPagePath(registrationPagePath)
      }

      /**
       * @param requestInspection The criteria for inspecting account creation requests, used by the
       * ACFP rule group to validate and track account creation attempts. 
       */
      override fun requestInspection(requestInspection: IResolvable) {
        cdkBuilder.requestInspection(requestInspection.let(IResolvable::unwrap))
      }

      /**
       * @param requestInspection The criteria for inspecting account creation requests, used by the
       * ACFP rule group to validate and track account creation attempts. 
       */
      override fun requestInspection(requestInspection: RequestInspectionACFPProperty) {
        cdkBuilder.requestInspection(requestInspection.let(RequestInspectionACFPProperty::unwrap))
      }

      /**
       * @param requestInspection The criteria for inspecting account creation requests, used by the
       * ACFP rule group to validate and track account creation attempts. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("083c28818bc0f7eca217daa839571147132bab0a9e4709d437ff9dd388fdde67")
      override
          fun requestInspection(requestInspection: RequestInspectionACFPProperty.Builder.() -> Unit):
          Unit = requestInspection(RequestInspectionACFPProperty(requestInspection))

      /**
       * @param responseInspection The criteria for inspecting responses to account creation
       * requests, used by the ACFP rule group to track account creation success rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ACFP rule group evaluates the responses that your protected resources send back to
       * client account creation attempts, keeping count of successful and failed attempts from each IP
       * address and client session. Using this information, the rule group labels and mitigates
       * requests from client sessions and IP addresses that have had too many successful account
       * creation attempts in a short amount of time.
       */
      override fun responseInspection(responseInspection: IResolvable) {
        cdkBuilder.responseInspection(responseInspection.let(IResolvable::unwrap))
      }

      /**
       * @param responseInspection The criteria for inspecting responses to account creation
       * requests, used by the ACFP rule group to track account creation success rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ACFP rule group evaluates the responses that your protected resources send back to
       * client account creation attempts, keeping count of successful and failed attempts from each IP
       * address and client session. Using this information, the rule group labels and mitigates
       * requests from client sessions and IP addresses that have had too many successful account
       * creation attempts in a short amount of time.
       */
      override fun responseInspection(responseInspection: ResponseInspectionProperty) {
        cdkBuilder.responseInspection(responseInspection.let(ResponseInspectionProperty::unwrap))
      }

      /**
       * @param responseInspection The criteria for inspecting responses to account creation
       * requests, used by the ACFP rule group to track account creation success rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ACFP rule group evaluates the responses that your protected resources send back to
       * client account creation attempts, keeping count of successful and failed attempts from each IP
       * address and client session. Using this information, the rule group labels and mitigates
       * requests from client sessions and IP addresses that have had too many successful account
       * creation attempts in a short amount of time.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("684d092c97d7f91fee60dece1bc6b09d120a4aff7fcd6d7512eb368deb7d0dd1")
      override
          fun responseInspection(responseInspection: ResponseInspectionProperty.Builder.() -> Unit):
          Unit = responseInspection(ResponseInspectionProperty(responseInspection))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty,
    ) : CdkObject(cdkObject), AWSManagedRulesACFPRuleSetProperty {
      /**
       * The path of the account creation endpoint for your application.
       *
       * This is the page on your website that accepts the completed registration form for a new
       * user. This page must accept `POST` requests.
       *
       * For example, for the URL `https://example.com/web/newaccount` , you would provide the path
       * `/web/newaccount` . Account creation page paths that start with the path that you provide are
       * considered a match. For example `/web/newaccount` matches the account creation paths
       * `/web/newaccount` , `/web/newaccount/` , `/web/newaccountPage` , and
       * `/web/newaccount/thisPage` , but doesn't match the path `/home/web/newaccount` or
       * `/website/newaccount` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html#cfn-wafv2-webacl-awsmanagedrulesacfpruleset-creationpath)
       */
      override fun creationPath(): String = unwrap(this).getCreationPath()

      /**
       * Allow the use of regular expressions in the registration page path and the account creation
       * path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html#cfn-wafv2-webacl-awsmanagedrulesacfpruleset-enableregexinpath)
       */
      override fun enableRegexInPath(): Any? = unwrap(this).getEnableRegexInPath()

      /**
       * The path of the account registration endpoint for your application.
       *
       * This is the page on your website that presents the registration form to new users.
       *
       *
       * This page must accept `GET` text/html requests.
       *
       *
       * For example, for the URL `https://example.com/web/registration` , you would provide the
       * path `/web/registration` . Registration page paths that start with the path that you provide
       * are considered a match. For example `/web/registration` matches the registration paths
       * `/web/registration` , `/web/registration/` , `/web/registrationPage` , and
       * `/web/registration/thisPage` , but doesn't match the path `/home/web/registration` or
       * `/website/registration` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html#cfn-wafv2-webacl-awsmanagedrulesacfpruleset-registrationpagepath)
       */
      override fun registrationPagePath(): String = unwrap(this).getRegistrationPagePath()

      /**
       * The criteria for inspecting account creation requests, used by the ACFP rule group to
       * validate and track account creation attempts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html#cfn-wafv2-webacl-awsmanagedrulesacfpruleset-requestinspection)
       */
      override fun requestInspection(): Any = unwrap(this).getRequestInspection()

      /**
       * The criteria for inspecting responses to account creation requests, used by the ACFP rule
       * group to track account creation success rates.
       *
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ACFP rule group evaluates the responses that your protected resources send back to
       * client account creation attempts, keeping count of successful and failed attempts from each IP
       * address and client session. Using this information, the rule group labels and mitigates
       * requests from client sessions and IP addresses that have had too many successful account
       * creation attempts in a short amount of time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesacfpruleset.html#cfn-wafv2-webacl-awsmanagedrulesacfpruleset-responseinspection)
       */
      override fun responseInspection(): Any? = unwrap(this).getResponseInspection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AWSManagedRulesACFPRuleSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty):
          AWSManagedRulesACFPRuleSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSManagedRulesACFPRuleSetProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesACFPRuleSetProperty
    }
  }

  public interface OrStatementProperty {
    /**
     * The statements to combine with OR logic.
     *
     * You can use any statements that can be nested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatement.html#cfn-wafv2-webacl-orstatement-statements)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty,
    ) : CdkObject(cdkObject), OrStatementProperty {
      /**
       * The statements to combine with OR logic.
       *
       * You can use any statements that can be nested.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatement.html#cfn-wafv2-webacl-orstatement-statements)
       */
      override fun statements(): Any = unwrap(this).getStatements()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OrStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty):
          OrStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty
    }
  }

  public interface RuleProperty {
    /**
     * The action that AWS WAF should take on a web request when it matches the rule's statement.
     *
     * Settings at the web ACL level can override the rule action setting.
     *
     * This is used only for rules whose statements don't reference a rule group. Rule statements
     * that reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
     *
     * You must set either this `Action` setting or the rule's `OverrideAction` , but not both:
     *
     * * If the rule statement doesn't reference a rule group, you must set this rule action setting
     * and you must not set the rule's override action setting.
     * * If the rule statement references a rule group, you must not set this action setting,
     * because the actions are already set on the rules inside the rule group. You must set the rule's
     * override action setting to indicate specifically whether to override the actions that are set on
     * the rules in the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-action)
     */
    public fun action(): Any? = unwrap(this).getAction()

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations.
     *
     * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the
     * web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-captchaconfig)
     */
    public fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

    /**
     * Specifies how AWS WAF should handle `Challenge` evaluations.
     *
     * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the
     * web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-challengeconfig)
     */
    public fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

    /**
     * The name of the rule.
     *
     * If you change the name of a `Rule` after you create it and you want the rule's metric name to
     * reflect the change, update the metric name in the rule's `VisibilityConfig` settings. AWS WAF
     * doesn't automatically update the metric name when you update the rule name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-name)
     */
    public fun name(): String

    /**
     * The override action to apply to the rules in a rule group, instead of the individual rule
     * action settings.
     *
     * This is used only for rules whose statements reference a rule group. Rule statements that
     * reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
     *
     * Set the override action to none to leave the rule group rule actions in effect. Set it to
     * count to only count matches, regardless of the rule action settings.
     *
     * You must set either this `OverrideAction` setting or the `Action` setting, but not both:
     *
     * * If the rule statement references a rule group, you must set this override action setting
     * and you must not set the rule's action setting.
     * * If the rule statement doesn't reference a rule group, you must set the rule action setting
     * and you must not set the rule's override action setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-overrideaction)
     */
    public fun overrideAction(): Any? = unwrap(this).getOverrideAction()

    /**
     * If you define more than one `Rule` in a `WebACL` , AWS WAF evaluates each request against the
     * `Rules` in order based on the value of `Priority` .
     *
     * AWS WAF processes rules with lower priority first. The priorities don't need to be
     * consecutive, but they must all be different.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-priority)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-rulelabels)
     */
    public fun ruleLabels(): Any? = unwrap(this).getRuleLabels()

    /**
     * The AWS WAF processing statement for the rule, for example `ByteMatchStatement` or
     * `SizeConstraintStatement` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-statement)
     */
    public fun statement(): Any

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * If you change the name of a `Rule` after you create it and you want the rule's metric name to
     * reflect the change, update the metric name as well. AWS WAF doesn't automatically update the
     * metric name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-visibilityconfig)
     */
    public fun visibilityConfig(): Any

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action that AWS WAF should take on a web request when it matches the
       * rule's statement.
       * Settings at the web ACL level can override the rule action setting.
       *
       * This is used only for rules whose statements don't reference a rule group. Rule statements
       * that reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement`
       * .
       *
       * You must set either this `Action` setting or the rule's `OverrideAction` , but not both:
       *
       * * If the rule statement doesn't reference a rule group, you must set this rule action
       * setting and you must not set the rule's override action setting.
       * * If the rule statement references a rule group, you must not set this action setting,
       * because the actions are already set on the rules inside the rule group. You must set the
       * rule's override action setting to indicate specifically whether to override the actions that
       * are set on the rules in the rule group.
       */
      public fun action(action: IResolvable)

      /**
       * @param action The action that AWS WAF should take on a web request when it matches the
       * rule's statement.
       * Settings at the web ACL level can override the rule action setting.
       *
       * This is used only for rules whose statements don't reference a rule group. Rule statements
       * that reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement`
       * .
       *
       * You must set either this `Action` setting or the rule's `OverrideAction` , but not both:
       *
       * * If the rule statement doesn't reference a rule group, you must set this rule action
       * setting and you must not set the rule's override action setting.
       * * If the rule statement references a rule group, you must not set this action setting,
       * because the actions are already set on the rules inside the rule group. You must set the
       * rule's override action setting to indicate specifically whether to override the actions that
       * are set on the rules in the rule group.
       */
      public fun action(action: RuleActionProperty)

      /**
       * @param action The action that AWS WAF should take on a web request when it matches the
       * rule's statement.
       * Settings at the web ACL level can override the rule action setting.
       *
       * This is used only for rules whose statements don't reference a rule group. Rule statements
       * that reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement`
       * .
       *
       * You must set either this `Action` setting or the rule's `OverrideAction` , but not both:
       *
       * * If the rule statement doesn't reference a rule group, you must set this rule action
       * setting and you must not set the rule's override action setting.
       * * If the rule statement references a rule group, you must not set this action setting,
       * because the actions are already set on the rules inside the rule group. You must set the
       * rule's override action setting to indicate specifically whether to override the actions that
       * are set on the rules in the rule group.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2025510b5159336ba973bb05d5e75a5f596d6af141c8f7c3297b175343fe0970")
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
      @JvmName("317705cf583deee8d63cca2df60cbba7ec827bf9b5904354fa80426576a7fc36")
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
      @JvmName("e4429baa9a3aac868613fb2c72185b6dcc965c2412db3994b4a374a15c3864a4")
      public fun challengeConfig(challengeConfig: ChallengeConfigProperty.Builder.() -> Unit)

      /**
       * @param name The name of the rule. 
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name in the rule's `VisibilityConfig` settings. AWS
       * WAF doesn't automatically update the metric name when you update the rule name.
       */
      public fun name(name: String)

      /**
       * @param overrideAction The override action to apply to the rules in a rule group, instead of
       * the individual rule action settings.
       * This is used only for rules whose statements reference a rule group. Rule statements that
       * reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
       *
       * Set the override action to none to leave the rule group rule actions in effect. Set it to
       * count to only count matches, regardless of the rule action settings.
       *
       * You must set either this `OverrideAction` setting or the `Action` setting, but not both:
       *
       * * If the rule statement references a rule group, you must set this override action setting
       * and you must not set the rule's action setting.
       * * If the rule statement doesn't reference a rule group, you must set the rule action
       * setting and you must not set the rule's override action setting.
       */
      public fun overrideAction(overrideAction: IResolvable)

      /**
       * @param overrideAction The override action to apply to the rules in a rule group, instead of
       * the individual rule action settings.
       * This is used only for rules whose statements reference a rule group. Rule statements that
       * reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
       *
       * Set the override action to none to leave the rule group rule actions in effect. Set it to
       * count to only count matches, regardless of the rule action settings.
       *
       * You must set either this `OverrideAction` setting or the `Action` setting, but not both:
       *
       * * If the rule statement references a rule group, you must set this override action setting
       * and you must not set the rule's action setting.
       * * If the rule statement doesn't reference a rule group, you must set the rule action
       * setting and you must not set the rule's override action setting.
       */
      public fun overrideAction(overrideAction: OverrideActionProperty)

      /**
       * @param overrideAction The override action to apply to the rules in a rule group, instead of
       * the individual rule action settings.
       * This is used only for rules whose statements reference a rule group. Rule statements that
       * reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
       *
       * Set the override action to none to leave the rule group rule actions in effect. Set it to
       * count to only count matches, regardless of the rule action settings.
       *
       * You must set either this `OverrideAction` setting or the `Action` setting, but not both:
       *
       * * If the rule statement references a rule group, you must set this override action setting
       * and you must not set the rule's action setting.
       * * If the rule statement doesn't reference a rule group, you must set the rule action
       * setting and you must not set the rule's override action setting.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c0a6edb162774d4a08095f9ab3722b12bf9a6998f0c523181264c1aa0f1b135")
      public fun overrideAction(overrideAction: OverrideActionProperty.Builder.() -> Unit)

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
      @JvmName("a8ded8ff113f98d1789d1aa70529aba81db88d78e1a78e856173d5da511e6dfc")
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
      @JvmName("b4ea36d8fd62c0da8c432a7e1cd39e41c8f2fca492172b7a7b0a565f3f23cfcb")
      public fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty.builder()

      /**
       * @param action The action that AWS WAF should take on a web request when it matches the
       * rule's statement.
       * Settings at the web ACL level can override the rule action setting.
       *
       * This is used only for rules whose statements don't reference a rule group. Rule statements
       * that reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement`
       * .
       *
       * You must set either this `Action` setting or the rule's `OverrideAction` , but not both:
       *
       * * If the rule statement doesn't reference a rule group, you must set this rule action
       * setting and you must not set the rule's override action setting.
       * * If the rule statement references a rule group, you must not set this action setting,
       * because the actions are already set on the rules inside the rule group. You must set the
       * rule's override action setting to indicate specifically whether to override the actions that
       * are set on the rules in the rule group.
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action The action that AWS WAF should take on a web request when it matches the
       * rule's statement.
       * Settings at the web ACL level can override the rule action setting.
       *
       * This is used only for rules whose statements don't reference a rule group. Rule statements
       * that reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement`
       * .
       *
       * You must set either this `Action` setting or the rule's `OverrideAction` , but not both:
       *
       * * If the rule statement doesn't reference a rule group, you must set this rule action
       * setting and you must not set the rule's override action setting.
       * * If the rule statement references a rule group, you must not set this action setting,
       * because the actions are already set on the rules inside the rule group. You must set the
       * rule's override action setting to indicate specifically whether to override the actions that
       * are set on the rules in the rule group.
       */
      override fun action(action: RuleActionProperty) {
        cdkBuilder.action(action.let(RuleActionProperty::unwrap))
      }

      /**
       * @param action The action that AWS WAF should take on a web request when it matches the
       * rule's statement.
       * Settings at the web ACL level can override the rule action setting.
       *
       * This is used only for rules whose statements don't reference a rule group. Rule statements
       * that reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement`
       * .
       *
       * You must set either this `Action` setting or the rule's `OverrideAction` , but not both:
       *
       * * If the rule statement doesn't reference a rule group, you must set this rule action
       * setting and you must not set the rule's override action setting.
       * * If the rule statement references a rule group, you must not set this action setting,
       * because the actions are already set on the rules inside the rule group. You must set the
       * rule's override action setting to indicate specifically whether to override the actions that
       * are set on the rules in the rule group.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2025510b5159336ba973bb05d5e75a5f596d6af141c8f7c3297b175343fe0970")
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
      @JvmName("317705cf583deee8d63cca2df60cbba7ec827bf9b5904354fa80426576a7fc36")
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
      @JvmName("e4429baa9a3aac868613fb2c72185b6dcc965c2412db3994b4a374a15c3864a4")
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
       * @param overrideAction The override action to apply to the rules in a rule group, instead of
       * the individual rule action settings.
       * This is used only for rules whose statements reference a rule group. Rule statements that
       * reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
       *
       * Set the override action to none to leave the rule group rule actions in effect. Set it to
       * count to only count matches, regardless of the rule action settings.
       *
       * You must set either this `OverrideAction` setting or the `Action` setting, but not both:
       *
       * * If the rule statement references a rule group, you must set this override action setting
       * and you must not set the rule's action setting.
       * * If the rule statement doesn't reference a rule group, you must set the rule action
       * setting and you must not set the rule's override action setting.
       */
      override fun overrideAction(overrideAction: IResolvable) {
        cdkBuilder.overrideAction(overrideAction.let(IResolvable::unwrap))
      }

      /**
       * @param overrideAction The override action to apply to the rules in a rule group, instead of
       * the individual rule action settings.
       * This is used only for rules whose statements reference a rule group. Rule statements that
       * reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
       *
       * Set the override action to none to leave the rule group rule actions in effect. Set it to
       * count to only count matches, regardless of the rule action settings.
       *
       * You must set either this `OverrideAction` setting or the `Action` setting, but not both:
       *
       * * If the rule statement references a rule group, you must set this override action setting
       * and you must not set the rule's action setting.
       * * If the rule statement doesn't reference a rule group, you must set the rule action
       * setting and you must not set the rule's override action setting.
       */
      override fun overrideAction(overrideAction: OverrideActionProperty) {
        cdkBuilder.overrideAction(overrideAction.let(OverrideActionProperty::unwrap))
      }

      /**
       * @param overrideAction The override action to apply to the rules in a rule group, instead of
       * the individual rule action settings.
       * This is used only for rules whose statements reference a rule group. Rule statements that
       * reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
       *
       * Set the override action to none to leave the rule group rule actions in effect. Set it to
       * count to only count matches, regardless of the rule action settings.
       *
       * You must set either this `OverrideAction` setting or the `Action` setting, but not both:
       *
       * * If the rule statement references a rule group, you must set this override action setting
       * and you must not set the rule's action setting.
       * * If the rule statement doesn't reference a rule group, you must set the rule action
       * setting and you must not set the rule's override action setting.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c0a6edb162774d4a08095f9ab3722b12bf9a6998f0c523181264c1aa0f1b135")
      override fun overrideAction(overrideAction: OverrideActionProperty.Builder.() -> Unit): Unit =
          overrideAction(OverrideActionProperty(overrideAction))

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
      @JvmName("a8ded8ff113f98d1789d1aa70529aba81db88d78e1a78e856173d5da511e6dfc")
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
      @JvmName("b4ea36d8fd62c0da8c432a7e1cd39e41c8f2fca492172b7a7b0a565f3f23cfcb")
      override fun visibilityConfig(visibilityConfig: VisibilityConfigProperty.Builder.() -> Unit):
          Unit = visibilityConfig(VisibilityConfigProperty(visibilityConfig))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      /**
       * The action that AWS WAF should take on a web request when it matches the rule's statement.
       *
       * Settings at the web ACL level can override the rule action setting.
       *
       * This is used only for rules whose statements don't reference a rule group. Rule statements
       * that reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement`
       * .
       *
       * You must set either this `Action` setting or the rule's `OverrideAction` , but not both:
       *
       * * If the rule statement doesn't reference a rule group, you must set this rule action
       * setting and you must not set the rule's override action setting.
       * * If the rule statement references a rule group, you must not set this action setting,
       * because the actions are already set on the rules inside the rule group. You must set the
       * rule's override action setting to indicate specifically whether to override the actions that
       * are set on the rules in the rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-action)
       */
      override fun action(): Any? = unwrap(this).getAction()

      /**
       * Specifies how AWS WAF should handle `CAPTCHA` evaluations.
       *
       * If you don't specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the
       * web ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-captchaconfig)
       */
      override fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

      /**
       * Specifies how AWS WAF should handle `Challenge` evaluations.
       *
       * If you don't specify this, AWS WAF uses the challenge configuration that's defined for the
       * web ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-challengeconfig)
       */
      override fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

      /**
       * The name of the rule.
       *
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name in the rule's `VisibilityConfig` settings. AWS
       * WAF doesn't automatically update the metric name when you update the rule name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The override action to apply to the rules in a rule group, instead of the individual rule
       * action settings.
       *
       * This is used only for rules whose statements reference a rule group. Rule statements that
       * reference a rule group are `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
       *
       * Set the override action to none to leave the rule group rule actions in effect. Set it to
       * count to only count matches, regardless of the rule action settings.
       *
       * You must set either this `OverrideAction` setting or the `Action` setting, but not both:
       *
       * * If the rule statement references a rule group, you must set this override action setting
       * and you must not set the rule's action setting.
       * * If the rule statement doesn't reference a rule group, you must set the rule action
       * setting and you must not set the rule's override action setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-overrideaction)
       */
      override fun overrideAction(): Any? = unwrap(this).getOverrideAction()

      /**
       * If you define more than one `Rule` in a `WebACL` , AWS WAF evaluates each request against
       * the `Rules` in order based on the value of `Priority` .
       *
       * AWS WAF processes rules with lower priority first. The priorities don't need to be
       * consecutive, but they must all be different.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-priority)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-rulelabels)
       */
      override fun ruleLabels(): Any? = unwrap(this).getRuleLabels()

      /**
       * The AWS WAF processing statement for the rule, for example `ByteMatchStatement` or
       * `SizeConstraintStatement` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-statement)
       */
      override fun statement(): Any = unwrap(this).getStatement()

      /**
       * Defines and enables Amazon CloudWatch metrics and web request sample collection.
       *
       * If you change the name of a `Rule` after you create it and you want the rule's metric name
       * to reflect the change, update the metric name as well. AWS WAF doesn't automatically update
       * the metric name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-visibilityconfig)
       */
      override fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnWebACL.RuleProperty
    }
  }

  public interface AllowActionProperty {
    /**
     * Defines custom handling for the web request.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-allowaction.html#cfn-wafv2-webacl-allowaction-customrequesthandling)
     */
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    /**
     * A builder for [AllowActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun customRequestHandling(customRequestHandling: IResolvable)

      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8b557b425d85b0e2ee38b18a55514a327bbac35c7c4ea87a8b039b6686df911")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty.builder()

      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8b557b425d85b0e2ee38b18a55514a327bbac35c7c4ea87a8b039b6686df911")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty,
    ) : CdkObject(cdkObject), AllowActionProperty {
      /**
       * Defines custom handling for the web request.
       *
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-allowaction.html#cfn-wafv2-webacl-allowaction-customrequesthandling)
       */
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AllowActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty):
          AllowActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AllowActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html#cfn-wafv2-webacl-geomatchstatement-countrycodes)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html#cfn-wafv2-webacl-geomatchstatement-forwardedipconfig)
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
      @JvmName("93d3e4b1323aba12103982966fc66f25efef2e972443d841f42f22ce1961eb9f")
      public
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty.builder()

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
      @JvmName("93d3e4b1323aba12103982966fc66f25efef2e972443d841f42f22ce1961eb9f")
      override
          fun forwardedIpConfig(forwardedIpConfig: ForwardedIPConfigurationProperty.Builder.() -> Unit):
          Unit = forwardedIpConfig(ForwardedIPConfigurationProperty(forwardedIpConfig))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty,
    ) : CdkObject(cdkObject), GeoMatchStatementProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html#cfn-wafv2-webacl-geomatchstatement-countrycodes)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html#cfn-wafv2-webacl-geomatchstatement-forwardedipconfig)
       */
      override fun forwardedIpConfig(): Any? = unwrap(this).getForwardedIpConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeoMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty):
          GeoMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookies.html#cfn-wafv2-webacl-cookies-matchpattern)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookies.html#cfn-wafv2-webacl-cookies-matchscope)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookies.html#cfn-wafv2-webacl-cookies-oversizehandling)
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
      @JvmName("2a035db8f2c98951eb8a8b35ea40f2cbb8071d6604c0780e7390cbf6f9d5edf7")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty.builder()

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
      @JvmName("2a035db8f2c98951eb8a8b35ea40f2cbb8071d6604c0780e7390cbf6f9d5edf7")
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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty,
    ) : CdkObject(cdkObject), CookiesProperty {
      /**
       * The filter to use to identify the subset of cookies to inspect in a web request.
       *
       * You must specify exactly one setting: either `All` , `IncludedCookies` , or
       * `ExcludedCookies` .
       *
       * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookies.html#cfn-wafv2-webacl-cookies-matchpattern)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookies.html#cfn-wafv2-webacl-cookies-matchscope)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookies.html#cfn-wafv2-webacl-cookies-oversizehandling)
       */
      override fun oversizeHandling(): String = unwrap(this).getOversizeHandling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CookiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty):
          CookiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookiesProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnWebACL.CookiesProperty
    }
  }

  public interface ManagedRuleGroupStatementProperty {
    /**
     * Rules in the referenced rule group whose actions are set to `Count` .
     *
     *
     * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
     * including `Count` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-excludedrules)
     */
    public fun excludedRules(): Any? = unwrap(this).getExcludedRules()

    /**
     * Additional information that's used by a managed rule group. Many managed rule groups don't
     * require this.
     *
     * The rule groups used for intelligent threat mitigation require additional configuration:
     *
     * * Use the `AWSManagedRulesACFPRuleSet` configuration object to configure the account creation
     * fraud prevention managed rule group. The configuration includes the registration and sign-up
     * pages of your application and the locations in the account creation request payload of data,
     * such as the user email and phone number fields.
     * * Use the `AWSManagedRulesATPRuleSet` configuration object to configure the account takeover
     * prevention managed rule group. The configuration includes the sign-in page of your application
     * and the locations in the login request payload of data such as the username and password.
     * * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the protection
     * level that you want the Bot Control rule group to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-managedrulegroupconfigs)
     */
    public fun managedRuleGroupConfigs(): Any? = unwrap(this).getManagedRuleGroupConfigs()

    /**
     * The name of the managed rule group.
     *
     * You use this, along with the vendor name, to identify the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-name)
     */
    public fun name(): String

    /**
     * Action settings to use in the place of the rule actions that are configured inside the rule
     * group.
     *
     * You specify one override for each rule whose action you want to change.
     *
     * You can use overrides for testing, for example you can override all of rule actions to
     * `Count` and then monitor the resulting count metrics to understand how the rule group would
     * handle your web traffic. You can also permanently override some or all actions, to modify how
     * the rule group manages your web traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-ruleactionoverrides)
     */
    public fun ruleActionOverrides(): Any? = unwrap(this).getRuleActionOverrides()

    /**
     * An optional nested statement that narrows the scope of the web requests that are evaluated by
     * the managed rule group.
     *
     * Requests are only evaluated by the rule group if they match the scope-down statement. You can
     * use any nestable `Statement` in the scope-down statement, and you can nest statements at any
     * level, the same as you can for a rule statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-scopedownstatement)
     */
    public fun scopeDownStatement(): Any? = unwrap(this).getScopeDownStatement()

    /**
     * The name of the managed rule group vendor.
     *
     * You use this, along with the rule group name, to identify a rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-vendorname)
     */
    public fun vendorName(): String

    /**
     * The version of the managed rule group to use.
     *
     * If you specify this, the version setting is fixed until you change it. If you don't specify
     * this, AWS WAF uses the vendor's default version, and then keeps the version at the vendor's
     * default when the vendor updates the managed rule group settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [ManagedRuleGroupStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      public fun excludedRules(excludedRules: IResolvable)

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      public fun excludedRules(excludedRules: List<Any>)

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      public fun excludedRules(vararg excludedRules: Any)

      /**
       * @param managedRuleGroupConfigs Additional information that's used by a managed rule group.
       * Many managed rule groups don't require this.
       * The rule groups used for intelligent threat mitigation require additional configuration:
       *
       * * Use the `AWSManagedRulesACFPRuleSet` configuration object to configure the account
       * creation fraud prevention managed rule group. The configuration includes the registration and
       * sign-up pages of your application and the locations in the account creation request payload of
       * data, such as the user email and phone number fields.
       * * Use the `AWSManagedRulesATPRuleSet` configuration object to configure the account
       * takeover prevention managed rule group. The configuration includes the sign-in page of your
       * application and the locations in the login request payload of data such as the username and
       * password.
       * * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the
       * protection level that you want the Bot Control rule group to use.
       */
      public fun managedRuleGroupConfigs(managedRuleGroupConfigs: IResolvable)

      /**
       * @param managedRuleGroupConfigs Additional information that's used by a managed rule group.
       * Many managed rule groups don't require this.
       * The rule groups used for intelligent threat mitigation require additional configuration:
       *
       * * Use the `AWSManagedRulesACFPRuleSet` configuration object to configure the account
       * creation fraud prevention managed rule group. The configuration includes the registration and
       * sign-up pages of your application and the locations in the account creation request payload of
       * data, such as the user email and phone number fields.
       * * Use the `AWSManagedRulesATPRuleSet` configuration object to configure the account
       * takeover prevention managed rule group. The configuration includes the sign-in page of your
       * application and the locations in the login request payload of data such as the username and
       * password.
       * * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the
       * protection level that you want the Bot Control rule group to use.
       */
      public fun managedRuleGroupConfigs(managedRuleGroupConfigs: List<Any>)

      /**
       * @param managedRuleGroupConfigs Additional information that's used by a managed rule group.
       * Many managed rule groups don't require this.
       * The rule groups used for intelligent threat mitigation require additional configuration:
       *
       * * Use the `AWSManagedRulesACFPRuleSet` configuration object to configure the account
       * creation fraud prevention managed rule group. The configuration includes the registration and
       * sign-up pages of your application and the locations in the account creation request payload of
       * data, such as the user email and phone number fields.
       * * Use the `AWSManagedRulesATPRuleSet` configuration object to configure the account
       * takeover prevention managed rule group. The configuration includes the sign-in page of your
       * application and the locations in the login request payload of data such as the username and
       * password.
       * * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the
       * protection level that you want the Bot Control rule group to use.
       */
      public fun managedRuleGroupConfigs(vararg managedRuleGroupConfigs: Any)

      /**
       * @param name The name of the managed rule group. 
       * You use this, along with the vendor name, to identify the rule group.
       */
      public fun name(name: String)

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      public fun ruleActionOverrides(ruleActionOverrides: IResolvable)

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      public fun ruleActionOverrides(ruleActionOverrides: List<Any>)

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      public fun ruleActionOverrides(vararg ruleActionOverrides: Any)

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated by the managed rule group.
       * Requests are only evaluated by the rule group if they match the scope-down statement. You
       * can use any nestable `Statement` in the scope-down statement, and you can nest statements at
       * any level, the same as you can for a rule statement.
       */
      public fun scopeDownStatement(scopeDownStatement: IResolvable)

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated by the managed rule group.
       * Requests are only evaluated by the rule group if they match the scope-down statement. You
       * can use any nestable `Statement` in the scope-down statement, and you can nest statements at
       * any level, the same as you can for a rule statement.
       */
      public fun scopeDownStatement(scopeDownStatement: StatementProperty)

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated by the managed rule group.
       * Requests are only evaluated by the rule group if they match the scope-down statement. You
       * can use any nestable `Statement` in the scope-down statement, and you can nest statements at
       * any level, the same as you can for a rule statement.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec2ee816e9a26efe5dd6f11781747d71814c2efdbf712cb215d37d769f75318b")
      public fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit)

      /**
       * @param vendorName The name of the managed rule group vendor. 
       * You use this, along with the rule group name, to identify a rule group.
       */
      public fun vendorName(vendorName: String)

      /**
       * @param version The version of the managed rule group to use.
       * If you specify this, the version setting is fixed until you change it. If you don't specify
       * this, AWS WAF uses the vendor's default version, and then keeps the version at the vendor's
       * default when the vendor updates the managed rule group settings.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty.builder()

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      override fun excludedRules(excludedRules: IResolvable) {
        cdkBuilder.excludedRules(excludedRules.let(IResolvable::unwrap))
      }

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      override fun excludedRules(excludedRules: List<Any>) {
        cdkBuilder.excludedRules(excludedRules)
      }

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      override fun excludedRules(vararg excludedRules: Any): Unit =
          excludedRules(excludedRules.toList())

      /**
       * @param managedRuleGroupConfigs Additional information that's used by a managed rule group.
       * Many managed rule groups don't require this.
       * The rule groups used for intelligent threat mitigation require additional configuration:
       *
       * * Use the `AWSManagedRulesACFPRuleSet` configuration object to configure the account
       * creation fraud prevention managed rule group. The configuration includes the registration and
       * sign-up pages of your application and the locations in the account creation request payload of
       * data, such as the user email and phone number fields.
       * * Use the `AWSManagedRulesATPRuleSet` configuration object to configure the account
       * takeover prevention managed rule group. The configuration includes the sign-in page of your
       * application and the locations in the login request payload of data such as the username and
       * password.
       * * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the
       * protection level that you want the Bot Control rule group to use.
       */
      override fun managedRuleGroupConfigs(managedRuleGroupConfigs: IResolvable) {
        cdkBuilder.managedRuleGroupConfigs(managedRuleGroupConfigs.let(IResolvable::unwrap))
      }

      /**
       * @param managedRuleGroupConfigs Additional information that's used by a managed rule group.
       * Many managed rule groups don't require this.
       * The rule groups used for intelligent threat mitigation require additional configuration:
       *
       * * Use the `AWSManagedRulesACFPRuleSet` configuration object to configure the account
       * creation fraud prevention managed rule group. The configuration includes the registration and
       * sign-up pages of your application and the locations in the account creation request payload of
       * data, such as the user email and phone number fields.
       * * Use the `AWSManagedRulesATPRuleSet` configuration object to configure the account
       * takeover prevention managed rule group. The configuration includes the sign-in page of your
       * application and the locations in the login request payload of data such as the username and
       * password.
       * * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the
       * protection level that you want the Bot Control rule group to use.
       */
      override fun managedRuleGroupConfigs(managedRuleGroupConfigs: List<Any>) {
        cdkBuilder.managedRuleGroupConfigs(managedRuleGroupConfigs)
      }

      /**
       * @param managedRuleGroupConfigs Additional information that's used by a managed rule group.
       * Many managed rule groups don't require this.
       * The rule groups used for intelligent threat mitigation require additional configuration:
       *
       * * Use the `AWSManagedRulesACFPRuleSet` configuration object to configure the account
       * creation fraud prevention managed rule group. The configuration includes the registration and
       * sign-up pages of your application and the locations in the account creation request payload of
       * data, such as the user email and phone number fields.
       * * Use the `AWSManagedRulesATPRuleSet` configuration object to configure the account
       * takeover prevention managed rule group. The configuration includes the sign-in page of your
       * application and the locations in the login request payload of data such as the username and
       * password.
       * * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the
       * protection level that you want the Bot Control rule group to use.
       */
      override fun managedRuleGroupConfigs(vararg managedRuleGroupConfigs: Any): Unit =
          managedRuleGroupConfigs(managedRuleGroupConfigs.toList())

      /**
       * @param name The name of the managed rule group. 
       * You use this, along with the vendor name, to identify the rule group.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      override fun ruleActionOverrides(ruleActionOverrides: IResolvable) {
        cdkBuilder.ruleActionOverrides(ruleActionOverrides.let(IResolvable::unwrap))
      }

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      override fun ruleActionOverrides(ruleActionOverrides: List<Any>) {
        cdkBuilder.ruleActionOverrides(ruleActionOverrides)
      }

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      override fun ruleActionOverrides(vararg ruleActionOverrides: Any): Unit =
          ruleActionOverrides(ruleActionOverrides.toList())

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated by the managed rule group.
       * Requests are only evaluated by the rule group if they match the scope-down statement. You
       * can use any nestable `Statement` in the scope-down statement, and you can nest statements at
       * any level, the same as you can for a rule statement.
       */
      override fun scopeDownStatement(scopeDownStatement: IResolvable) {
        cdkBuilder.scopeDownStatement(scopeDownStatement.let(IResolvable::unwrap))
      }

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated by the managed rule group.
       * Requests are only evaluated by the rule group if they match the scope-down statement. You
       * can use any nestable `Statement` in the scope-down statement, and you can nest statements at
       * any level, the same as you can for a rule statement.
       */
      override fun scopeDownStatement(scopeDownStatement: StatementProperty) {
        cdkBuilder.scopeDownStatement(scopeDownStatement.let(StatementProperty::unwrap))
      }

      /**
       * @param scopeDownStatement An optional nested statement that narrows the scope of the web
       * requests that are evaluated by the managed rule group.
       * Requests are only evaluated by the rule group if they match the scope-down statement. You
       * can use any nestable `Statement` in the scope-down statement, and you can nest statements at
       * any level, the same as you can for a rule statement.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec2ee816e9a26efe5dd6f11781747d71814c2efdbf712cb215d37d769f75318b")
      override fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit):
          Unit = scopeDownStatement(StatementProperty(scopeDownStatement))

      /**
       * @param vendorName The name of the managed rule group vendor. 
       * You use this, along with the rule group name, to identify a rule group.
       */
      override fun vendorName(vendorName: String) {
        cdkBuilder.vendorName(vendorName)
      }

      /**
       * @param version The version of the managed rule group to use.
       * If you specify this, the version setting is fixed until you change it. If you don't specify
       * this, AWS WAF uses the vendor's default version, and then keeps the version at the vendor's
       * default when the vendor updates the managed rule group settings.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty,
    ) : CdkObject(cdkObject), ManagedRuleGroupStatementProperty {
      /**
       * Rules in the referenced rule group whose actions are set to `Count` .
       *
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-excludedrules)
       */
      override fun excludedRules(): Any? = unwrap(this).getExcludedRules()

      /**
       * Additional information that's used by a managed rule group. Many managed rule groups don't
       * require this.
       *
       * The rule groups used for intelligent threat mitigation require additional configuration:
       *
       * * Use the `AWSManagedRulesACFPRuleSet` configuration object to configure the account
       * creation fraud prevention managed rule group. The configuration includes the registration and
       * sign-up pages of your application and the locations in the account creation request payload of
       * data, such as the user email and phone number fields.
       * * Use the `AWSManagedRulesATPRuleSet` configuration object to configure the account
       * takeover prevention managed rule group. The configuration includes the sign-in page of your
       * application and the locations in the login request payload of data such as the username and
       * password.
       * * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the
       * protection level that you want the Bot Control rule group to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-managedrulegroupconfigs)
       */
      override fun managedRuleGroupConfigs(): Any? = unwrap(this).getManagedRuleGroupConfigs()

      /**
       * The name of the managed rule group.
       *
       * You use this, along with the vendor name, to identify the rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Action settings to use in the place of the rule actions that are configured inside the rule
       * group.
       *
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-ruleactionoverrides)
       */
      override fun ruleActionOverrides(): Any? = unwrap(this).getRuleActionOverrides()

      /**
       * An optional nested statement that narrows the scope of the web requests that are evaluated
       * by the managed rule group.
       *
       * Requests are only evaluated by the rule group if they match the scope-down statement. You
       * can use any nestable `Statement` in the scope-down statement, and you can nest statements at
       * any level, the same as you can for a rule statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-scopedownstatement)
       */
      override fun scopeDownStatement(): Any? = unwrap(this).getScopeDownStatement()

      /**
       * The name of the managed rule group vendor.
       *
       * You use this, along with the rule group name, to identify a rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-vendorname)
       */
      override fun vendorName(): String = unwrap(this).getVendorName()

      /**
       * The version of the managed rule group to use.
       *
       * If you specify this, the version setting is fixed until you change it. If you don't specify
       * this, AWS WAF uses the vendor's default version, and then keeps the version at the vendor's
       * default when the vendor updates the managed rule group settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html#cfn-wafv2-webacl-managedrulegroupstatement-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ManagedRuleGroupStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty):
          ManagedRuleGroupStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedRuleGroupStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty
    }
  }

  public interface RateLimitCookieProperty {
    /**
     * The name of the cookie to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitcookie.html#cfn-wafv2-webacl-ratelimitcookie-name)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitcookie.html#cfn-wafv2-webacl-ratelimitcookie-texttransformations)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty,
    ) : CdkObject(cdkObject), RateLimitCookieProperty {
      /**
       * The name of the cookie to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitcookie.html#cfn-wafv2-webacl-ratelimitcookie-name)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitcookie.html#cfn-wafv2-webacl-ratelimitcookie-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitCookieProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty):
          RateLimitCookieProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitCookieProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitCookieProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponsebody.html#cfn-wafv2-webacl-customresponsebody-content)
     */
    public fun content(): String

    /**
     * The type of content in the payload that you are defining in the `Content` string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponsebody.html#cfn-wafv2-webacl-customresponsebody-contenttype)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty,
    ) : CdkObject(cdkObject), CustomResponseBodyProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponsebody.html#cfn-wafv2-webacl-customresponsebody-content)
       */
      override fun content(): String = unwrap(this).getContent()

      /**
       * The type of content in the payload that you are defining in the `Content` string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponsebody.html#cfn-wafv2-webacl-customresponsebody-contenttype)
       */
      override fun contentType(): String = unwrap(this).getContentType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomResponseBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty):
          CustomResponseBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomResponseBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty
    }
  }

  public interface ChallengeActionProperty {
    /**
     * Defines custom handling for the web request, used when the challenge inspection determines
     * that the request's token is valid and unexpired.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the [AWS WAF developer
     * guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-challengeaction.html#cfn-wafv2-webacl-challengeaction-customrequesthandling)
     */
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    /**
     * A builder for [ChallengeActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * challenge inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the [AWS WAF developer
       * guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      public fun customRequestHandling(customRequestHandling: IResolvable)

      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * challenge inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the [AWS WAF developer
       * guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * challenge inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the [AWS WAF developer
       * guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1e4af3c7ecc6a77db9bf8b611bda855716d395f81d76c5d78d1f60fc45b7169")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty.builder()

      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * challenge inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the [AWS WAF developer
       * guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * challenge inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the [AWS WAF developer
       * guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * challenge inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the [AWS WAF developer
       * guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1e4af3c7ecc6a77db9bf8b611bda855716d395f81d76c5d78d1f60fc45b7169")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty,
    ) : CdkObject(cdkObject), ChallengeActionProperty {
      /**
       * Defines custom handling for the web request, used when the challenge inspection determines
       * that the request's token is valid and unexpired.
       *
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the [AWS WAF developer
       * guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-challengeaction.html#cfn-wafv2-webacl-challengeaction-customrequesthandling)
       */
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChallengeActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty):
          ChallengeActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChallengeActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeActionProperty
    }
  }

  public interface RateLimitQueryArgumentProperty {
    /**
     * The name of the query argument to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitqueryargument.html#cfn-wafv2-webacl-ratelimitqueryargument-name)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitqueryargument.html#cfn-wafv2-webacl-ratelimitqueryargument-texttransformations)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty.builder()

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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty,
    ) : CdkObject(cdkObject), RateLimitQueryArgumentProperty {
      /**
       * The name of the query argument to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitqueryargument.html#cfn-wafv2-webacl-ratelimitqueryargument-name)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitqueryargument.html#cfn-wafv2-webacl-ratelimitqueryargument-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitQueryArgumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty):
          RateLimitQueryArgumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitQueryArgumentProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryArgumentProperty
    }
  }

  public interface ResponseInspectionHeaderProperty {
    /**
     * Values in the response header with the specified name that indicate a failed login or account
     * creation attempt.
     *
     * To be counted as a failure, the value must be an exact match, including case. Each value must
     * be unique among the success and failure values.
     *
     * JSON examples: `"FailureValues": [ "LoginFailed", "Failed login" ]` and `"FailureValues": [
     * "AccountCreationFailed" ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionheader.html#cfn-wafv2-webacl-responseinspectionheader-failurevalues)
     */
    public fun failureValues(): List<String>

    /**
     * The name of the header to match against. The name must be an exact match, including case.
     *
     * JSON example: `"Name": [ "RequestResult" ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionheader.html#cfn-wafv2-webacl-responseinspectionheader-name)
     */
    public fun name(): String

    /**
     * Values in the response header with the specified name that indicate a successful login or
     * account creation attempt.
     *
     * To be counted as a success, the value must be an exact match, including case. Each value must
     * be unique among the success and failure values.
     *
     * JSON examples: `"SuccessValues": [ "LoginPassed", "Successful login" ]` and `"SuccessValues":
     * [ "AccountCreated", "Successful account creation" ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionheader.html#cfn-wafv2-webacl-responseinspectionheader-successvalues)
     */
    public fun successValues(): List<String>

    /**
     * A builder for [ResponseInspectionHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureValues Values in the response header with the specified name that indicate a
       * failed login or account creation attempt. 
       * To be counted as a failure, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON examples: `"FailureValues": [ "LoginFailed", "Failed login" ]` and `"FailureValues": [
       * "AccountCreationFailed" ]`
       */
      public fun failureValues(failureValues: List<String>)

      /**
       * @param failureValues Values in the response header with the specified name that indicate a
       * failed login or account creation attempt. 
       * To be counted as a failure, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON examples: `"FailureValues": [ "LoginFailed", "Failed login" ]` and `"FailureValues": [
       * "AccountCreationFailed" ]`
       */
      public fun failureValues(vararg failureValues: String)

      /**
       * @param name The name of the header to match against. The name must be an exact match,
       * including case. 
       * JSON example: `"Name": [ "RequestResult" ]`
       */
      public fun name(name: String)

      /**
       * @param successValues Values in the response header with the specified name that indicate a
       * successful login or account creation attempt. 
       * To be counted as a success, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON examples: `"SuccessValues": [ "LoginPassed", "Successful login" ]` and
       * `"SuccessValues": [ "AccountCreated", "Successful account creation" ]`
       */
      public fun successValues(successValues: List<String>)

      /**
       * @param successValues Values in the response header with the specified name that indicate a
       * successful login or account creation attempt. 
       * To be counted as a success, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON examples: `"SuccessValues": [ "LoginPassed", "Successful login" ]` and
       * `"SuccessValues": [ "AccountCreated", "Successful account creation" ]`
       */
      public fun successValues(vararg successValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty.builder()

      /**
       * @param failureValues Values in the response header with the specified name that indicate a
       * failed login or account creation attempt. 
       * To be counted as a failure, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON examples: `"FailureValues": [ "LoginFailed", "Failed login" ]` and `"FailureValues": [
       * "AccountCreationFailed" ]`
       */
      override fun failureValues(failureValues: List<String>) {
        cdkBuilder.failureValues(failureValues)
      }

      /**
       * @param failureValues Values in the response header with the specified name that indicate a
       * failed login or account creation attempt. 
       * To be counted as a failure, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON examples: `"FailureValues": [ "LoginFailed", "Failed login" ]` and `"FailureValues": [
       * "AccountCreationFailed" ]`
       */
      override fun failureValues(vararg failureValues: String): Unit =
          failureValues(failureValues.toList())

      /**
       * @param name The name of the header to match against. The name must be an exact match,
       * including case. 
       * JSON example: `"Name": [ "RequestResult" ]`
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param successValues Values in the response header with the specified name that indicate a
       * successful login or account creation attempt. 
       * To be counted as a success, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON examples: `"SuccessValues": [ "LoginPassed", "Successful login" ]` and
       * `"SuccessValues": [ "AccountCreated", "Successful account creation" ]`
       */
      override fun successValues(successValues: List<String>) {
        cdkBuilder.successValues(successValues)
      }

      /**
       * @param successValues Values in the response header with the specified name that indicate a
       * successful login or account creation attempt. 
       * To be counted as a success, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON examples: `"SuccessValues": [ "LoginPassed", "Successful login" ]` and
       * `"SuccessValues": [ "AccountCreated", "Successful account creation" ]`
       */
      override fun successValues(vararg successValues: String): Unit =
          successValues(successValues.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty,
    ) : CdkObject(cdkObject), ResponseInspectionHeaderProperty {
      /**
       * Values in the response header with the specified name that indicate a failed login or
       * account creation attempt.
       *
       * To be counted as a failure, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON examples: `"FailureValues": [ "LoginFailed", "Failed login" ]` and `"FailureValues": [
       * "AccountCreationFailed" ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionheader.html#cfn-wafv2-webacl-responseinspectionheader-failurevalues)
       */
      override fun failureValues(): List<String> = unwrap(this).getFailureValues()

      /**
       * The name of the header to match against. The name must be an exact match, including case.
       *
       * JSON example: `"Name": [ "RequestResult" ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionheader.html#cfn-wafv2-webacl-responseinspectionheader-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Values in the response header with the specified name that indicate a successful login or
       * account creation attempt.
       *
       * To be counted as a success, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON examples: `"SuccessValues": [ "LoginPassed", "Successful login" ]` and
       * `"SuccessValues": [ "AccountCreated", "Successful account creation" ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionheader.html#cfn-wafv2-webacl-responseinspectionheader-successvalues)
       */
      override fun successValues(): List<String> = unwrap(this).getSuccessValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseInspectionHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty):
          ResponseInspectionHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseInspectionHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionHeaderProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html#cfn-wafv2-webacl-visibilityconfig-cloudwatchmetricsenabled)
     */
    public fun cloudWatchMetricsEnabled(): Any

    /**
     * A name of the Amazon CloudWatch metric dimension.
     *
     * The name can contain only the characters: A-Z, a-z, 0-9, - (hyphen), and _ (underscore). The
     * name can be from one to 128 characters long. It can't contain whitespace or metric names that
     * are reserved for AWS WAF , for example `All` and `Default_Action` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html#cfn-wafv2-webacl-visibilityconfig-metricname)
     */
    public fun metricName(): String

    /**
     * Indicates whether AWS WAF should store a sampling of the web requests that match the rules.
     *
     * You can view the sampled requests through the AWS WAF console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html#cfn-wafv2-webacl-visibilityconfig-sampledrequestsenabled)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty,
    ) : CdkObject(cdkObject), VisibilityConfigProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html#cfn-wafv2-webacl-visibilityconfig-cloudwatchmetricsenabled)
       */
      override fun cloudWatchMetricsEnabled(): Any = unwrap(this).getCloudWatchMetricsEnabled()

      /**
       * A name of the Amazon CloudWatch metric dimension.
       *
       * The name can contain only the characters: A-Z, a-z, 0-9, - (hyphen), and _ (underscore).
       * The name can be from one to 128 characters long. It can't contain whitespace or metric names
       * that are reserved for AWS WAF , for example `All` and `Default_Action` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html#cfn-wafv2-webacl-visibilityconfig-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * Indicates whether AWS WAF should store a sampling of the web requests that match the rules.
       *
       * You can view the sampled requests through the AWS WAF console.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html#cfn-wafv2-webacl-visibilityconfig-sampledrequestsenabled)
       */
      override fun sampledRequestsEnabled(): Any = unwrap(this).getSampledRequestsEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VisibilityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty):
          VisibilityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VisibilityConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty
    }
  }

  public interface OverrideActionProperty {
    /**
     * Override the rule group evaluation result to count only.
     *
     *
     * This option is usually set to none. It does not affect how the rules in the rule group are
     * evaluated. If you want the rules in the rule group to only count matches, do not use this and
     * instead use the rule action override option, with `Count` action, in your rule group reference
     * statement settings.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-count)
     */
    public fun count(): Any? = unwrap(this).getCount()

    /**
     * Don't override the rule group evaluation result.
     *
     * This is the most common setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-none)
     */
    public fun none(): Any? = unwrap(this).getNone()

    /**
     * A builder for [OverrideActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param count Override the rule group evaluation result to count only.
       *
       * This option is usually set to none. It does not affect how the rules in the rule group are
       * evaluated. If you want the rules in the rule group to only count matches, do not use this and
       * instead use the rule action override option, with `Count` action, in your rule group reference
       * statement settings.
       */
      public fun count(count: Any)

      /**
       * @param none Don't override the rule group evaluation result.
       * This is the most common setting.
       */
      public fun none(none: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty.builder()

      /**
       * @param count Override the rule group evaluation result to count only.
       *
       * This option is usually set to none. It does not affect how the rules in the rule group are
       * evaluated. If you want the rules in the rule group to only count matches, do not use this and
       * instead use the rule action override option, with `Count` action, in your rule group reference
       * statement settings.
       */
      override fun count(count: Any) {
        cdkBuilder.count(count)
      }

      /**
       * @param none Don't override the rule group evaluation result.
       * This is the most common setting.
       */
      override fun none(none: Any) {
        cdkBuilder.none(none)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty,
    ) : CdkObject(cdkObject), OverrideActionProperty {
      /**
       * Override the rule group evaluation result to count only.
       *
       *
       * This option is usually set to none. It does not affect how the rules in the rule group are
       * evaluated. If you want the rules in the rule group to only count matches, do not use this and
       * instead use the rule action override option, with `Count` action, in your rule group reference
       * statement settings.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-count)
       */
      override fun count(): Any? = unwrap(this).getCount()

      /**
       * Don't override the rule group evaluation result.
       *
       * This is the most common setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html#cfn-wafv2-webacl-overrideaction-none)
       */
      override fun none(): Any? = unwrap(this).getNone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OverrideActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty):
          OverrideActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverrideActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.OverrideActionProperty
    }
  }

  public interface CaptchaConfigProperty {
    /**
     * Determines how long a `CAPTCHA` timestamp in the token remains valid after the client
     * successfully solves a `CAPTCHA` puzzle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-captchaconfig.html#cfn-wafv2-webacl-captchaconfig-immunitytimeproperty)
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
      @JvmName("191be63e57ff374068e438947c296c4451da9eaa0a42f43f48495d85960bc7c0")
      public
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty.builder()

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
      @JvmName("191be63e57ff374068e438947c296c4451da9eaa0a42f43f48495d85960bc7c0")
      override
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit):
          Unit = immunityTimeProperty(ImmunityTimePropertyProperty(immunityTimeProperty))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty,
    ) : CdkObject(cdkObject), CaptchaConfigProperty {
      /**
       * Determines how long a `CAPTCHA` timestamp in the token remains valid after the client
       * successfully solves a `CAPTCHA` puzzle.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-captchaconfig.html#cfn-wafv2-webacl-captchaconfig-immunitytimeproperty)
       */
      override fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CaptchaConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty):
          CaptchaConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptchaConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaConfigProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimituripath.html#cfn-wafv2-webacl-ratelimituripath-texttransformations)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty,
    ) : CdkObject(cdkObject), RateLimitUriPathProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimituripath.html#cfn-wafv2-webacl-ratelimituripath-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitUriPathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty):
          RateLimitUriPathProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitUriPathProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitUriPathProperty
    }
  }

  public interface BlockActionProperty {
    /**
     * Defines a custom response for the web request.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-blockaction.html#cfn-wafv2-webacl-blockaction-customresponse)
     */
    public fun customResponse(): Any? = unwrap(this).getCustomResponse()

    /**
     * A builder for [BlockActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customResponse Defines a custom response for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun customResponse(customResponse: IResolvable)

      /**
       * @param customResponse Defines a custom response for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun customResponse(customResponse: CustomResponseProperty)

      /**
       * @param customResponse Defines a custom response for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b848ca12d2be847e3936cfab6841a0b1d09844d5fd4f241dcf23ae17db717d10")
      public fun customResponse(customResponse: CustomResponseProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty.builder()

      /**
       * @param customResponse Defines a custom response for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun customResponse(customResponse: IResolvable) {
        cdkBuilder.customResponse(customResponse.let(IResolvable::unwrap))
      }

      /**
       * @param customResponse Defines a custom response for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun customResponse(customResponse: CustomResponseProperty) {
        cdkBuilder.customResponse(customResponse.let(CustomResponseProperty::unwrap))
      }

      /**
       * @param customResponse Defines a custom response for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b848ca12d2be847e3936cfab6841a0b1d09844d5fd4f241dcf23ae17db717d10")
      override fun customResponse(customResponse: CustomResponseProperty.Builder.() -> Unit): Unit =
          customResponse(CustomResponseProperty(customResponse))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty,
    ) : CdkObject(cdkObject), BlockActionProperty {
      /**
       * Defines a custom response for the web request.
       *
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-blockaction.html#cfn-wafv2-webacl-blockaction-customresponse)
       */
      override fun customResponse(): Any? = unwrap(this).getCustomResponse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty):
          BlockActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty
    }
  }

  public interface JsonMatchPatternProperty {
    /**
     * Match all of the elements. See also `MatchScope` in the `JsonBody` `FieldToMatch`
     * specification.
     *
     * You must specify either this setting or the `IncludedPaths` setting, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonmatchpattern.html#cfn-wafv2-webacl-jsonmatchpattern-all)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonmatchpattern.html#cfn-wafv2-webacl-jsonmatchpattern-includedpaths)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty,
    ) : CdkObject(cdkObject), JsonMatchPatternProperty {
      /**
       * Match all of the elements. See also `MatchScope` in the `JsonBody` `FieldToMatch`
       * specification.
       *
       * You must specify either this setting or the `IncludedPaths` setting, but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonmatchpattern.html#cfn-wafv2-webacl-jsonmatchpattern-all)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonmatchpattern.html#cfn-wafv2-webacl-jsonmatchpattern-includedpaths)
       */
      override fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonMatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty):
          JsonMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty
    }
  }

  public interface RequestInspectionACFPProperty {
    /**
     * The names of the fields in the request payload that contain your customer's primary physical
     * address.
     *
     * Order the address fields in the array exactly as they are ordered in the request payload.
     *
     * How you specify the address fields depends on the request inspection payload type.
     *
     * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
     * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     * [JavaScript Object Notation (JSON)
     * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
     *
     * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
     * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the address
     * field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
     * `/form/primaryaddressline3` .
     *
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with input elements named `primaryaddressline1` ,
     * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
     * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-addressfields)
     */
    public fun addressFields(): Any? = unwrap(this).getAddressFields()

    /**
     * The name of the field in the request payload that contains your customer's email.
     *
     * How you specify this depends on the request inspection payload type.
     *
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     * JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript
     * Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     * .
     *
     * For example, for the JSON payload `{ "form": { "email": "THE_EMAIL" } }` , the email field
     * specification is `/form/email` .
     *
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `email1` , the email field
     * specification is `email1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-emailfield)
     */
    public fun emailField(): Any? = unwrap(this).getEmailField()

    /**
     * The name of the field in the request payload that contains your customer's password.
     *
     * How you specify this depends on the request inspection payload type.
     *
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     * JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript
     * Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     * .
     *
     * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the password
     * field specification is `/form/password` .
     *
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `password1` , the password field
     * specification is `password1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-passwordfield)
     */
    public fun passwordField(): Any? = unwrap(this).getPasswordField()

    /**
     * The payload type for your account creation endpoint, either JSON or form encoded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-payloadtype)
     */
    public fun payloadType(): String

    /**
     * The names of the fields in the request payload that contain your customer's primary phone
     * number.
     *
     * Order the phone number fields in the array exactly as they are ordered in the request
     * payload.
     *
     * How you specify the phone number fields depends on the request inspection payload type.
     *
     * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
     * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     * [JavaScript Object Notation (JSON)
     * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
     *
     * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
     * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
     * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
     * `/form/primaryphoneline3` .
     *
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with input elements named `primaryphoneline1` ,
     * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
     * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-phonenumberfields)
     */
    public fun phoneNumberFields(): Any? = unwrap(this).getPhoneNumberFields()

    /**
     * The name of the field in the request payload that contains your customer's username.
     *
     * How you specify this depends on the request inspection payload type.
     *
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     * JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript
     * Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     * .
     *
     * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the username
     * field specification is `/form/username` .
     *
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `username1` , the username field
     * specification is `username1`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-usernamefield)
     */
    public fun usernameField(): Any? = unwrap(this).getUsernameField()

    /**
     * A builder for [RequestInspectionACFPProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addressFields The names of the fields in the request payload that contain your
       * customer's primary physical address.
       * Order the address fields in the array exactly as they are ordered in the request payload.
       *
       * How you specify the address fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
       * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the
       * address field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
       * `/form/primaryaddressline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryaddressline1` ,
       * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
       * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
       */
      public fun addressFields(addressFields: IResolvable)

      /**
       * @param addressFields The names of the fields in the request payload that contain your
       * customer's primary physical address.
       * Order the address fields in the array exactly as they are ordered in the request payload.
       *
       * How you specify the address fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
       * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the
       * address field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
       * `/form/primaryaddressline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryaddressline1` ,
       * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
       * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
       */
      public fun addressFields(addressFields: List<Any>)

      /**
       * @param addressFields The names of the fields in the request payload that contain your
       * customer's primary physical address.
       * Order the address fields in the array exactly as they are ordered in the request payload.
       *
       * How you specify the address fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
       * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the
       * address field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
       * `/form/primaryaddressline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryaddressline1` ,
       * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
       * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
       */
      public fun addressFields(vararg addressFields: Any)

      /**
       * @param emailField The name of the field in the request payload that contains your
       * customer's email.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "email": "THE_EMAIL" } }` , the email field
       * specification is `/form/email` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `email1` , the email field
       * specification is `email1` .
       */
      public fun emailField(emailField: IResolvable)

      /**
       * @param emailField The name of the field in the request payload that contains your
       * customer's email.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "email": "THE_EMAIL" } }` , the email field
       * specification is `/form/email` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `email1` , the email field
       * specification is `email1` .
       */
      public fun emailField(emailField: FieldIdentifierProperty)

      /**
       * @param emailField The name of the field in the request payload that contains your
       * customer's email.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "email": "THE_EMAIL" } }` , the email field
       * specification is `/form/email` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `email1` , the email field
       * specification is `email1` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("847ec279a551f5dd327860e83ee93b4d450910d2873fc1f106180db6b7e4d5ac")
      public fun emailField(emailField: FieldIdentifierProperty.Builder.() -> Unit)

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      public fun passwordField(passwordField: IResolvable)

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      public fun passwordField(passwordField: FieldIdentifierProperty)

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1e441197d39d89c88ac019563917209b75c7bc921ac18b85483362601c8bd4")
      public fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit)

      /**
       * @param payloadType The payload type for your account creation endpoint, either JSON or form
       * encoded. 
       */
      public fun payloadType(payloadType: String)

      /**
       * @param phoneNumberFields The names of the fields in the request payload that contain your
       * customer's primary phone number.
       * Order the phone number fields in the array exactly as they are ordered in the request
       * payload.
       *
       * How you specify the phone number fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
       * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
       * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
       * `/form/primaryphoneline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryphoneline1` ,
       * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
       * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
       */
      public fun phoneNumberFields(phoneNumberFields: IResolvable)

      /**
       * @param phoneNumberFields The names of the fields in the request payload that contain your
       * customer's primary phone number.
       * Order the phone number fields in the array exactly as they are ordered in the request
       * payload.
       *
       * How you specify the phone number fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
       * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
       * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
       * `/form/primaryphoneline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryphoneline1` ,
       * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
       * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
       */
      public fun phoneNumberFields(phoneNumberFields: List<Any>)

      /**
       * @param phoneNumberFields The names of the fields in the request payload that contain your
       * customer's primary phone number.
       * Order the phone number fields in the array exactly as they are ordered in the request
       * payload.
       *
       * How you specify the phone number fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
       * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
       * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
       * `/form/primaryphoneline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryphoneline1` ,
       * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
       * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
       */
      public fun phoneNumberFields(vararg phoneNumberFields: Any)

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      public fun usernameField(usernameField: IResolvable)

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      public fun usernameField(usernameField: FieldIdentifierProperty)

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("600dd6ac4241238388c5ed8934f497e910491d363bd2f7d5b4990137f8df6320")
      public fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty.builder()

      /**
       * @param addressFields The names of the fields in the request payload that contain your
       * customer's primary physical address.
       * Order the address fields in the array exactly as they are ordered in the request payload.
       *
       * How you specify the address fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
       * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the
       * address field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
       * `/form/primaryaddressline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryaddressline1` ,
       * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
       * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
       */
      override fun addressFields(addressFields: IResolvable) {
        cdkBuilder.addressFields(addressFields.let(IResolvable::unwrap))
      }

      /**
       * @param addressFields The names of the fields in the request payload that contain your
       * customer's primary physical address.
       * Order the address fields in the array exactly as they are ordered in the request payload.
       *
       * How you specify the address fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
       * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the
       * address field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
       * `/form/primaryaddressline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryaddressline1` ,
       * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
       * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
       */
      override fun addressFields(addressFields: List<Any>) {
        cdkBuilder.addressFields(addressFields)
      }

      /**
       * @param addressFields The names of the fields in the request payload that contain your
       * customer's primary physical address.
       * Order the address fields in the array exactly as they are ordered in the request payload.
       *
       * How you specify the address fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
       * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the
       * address field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
       * `/form/primaryaddressline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryaddressline1` ,
       * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
       * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
       */
      override fun addressFields(vararg addressFields: Any): Unit =
          addressFields(addressFields.toList())

      /**
       * @param emailField The name of the field in the request payload that contains your
       * customer's email.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "email": "THE_EMAIL" } }` , the email field
       * specification is `/form/email` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `email1` , the email field
       * specification is `email1` .
       */
      override fun emailField(emailField: IResolvable) {
        cdkBuilder.emailField(emailField.let(IResolvable::unwrap))
      }

      /**
       * @param emailField The name of the field in the request payload that contains your
       * customer's email.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "email": "THE_EMAIL" } }` , the email field
       * specification is `/form/email` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `email1` , the email field
       * specification is `email1` .
       */
      override fun emailField(emailField: FieldIdentifierProperty) {
        cdkBuilder.emailField(emailField.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param emailField The name of the field in the request payload that contains your
       * customer's email.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "email": "THE_EMAIL" } }` , the email field
       * specification is `/form/email` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `email1` , the email field
       * specification is `email1` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("847ec279a551f5dd327860e83ee93b4d450910d2873fc1f106180db6b7e4d5ac")
      override fun emailField(emailField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          emailField(FieldIdentifierProperty(emailField))

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      override fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField.let(IResolvable::unwrap))
      }

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      override fun passwordField(passwordField: FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1e441197d39d89c88ac019563917209b75c7bc921ac18b85483362601c8bd4")
      override fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          passwordField(FieldIdentifierProperty(passwordField))

      /**
       * @param payloadType The payload type for your account creation endpoint, either JSON or form
       * encoded. 
       */
      override fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
      }

      /**
       * @param phoneNumberFields The names of the fields in the request payload that contain your
       * customer's primary phone number.
       * Order the phone number fields in the array exactly as they are ordered in the request
       * payload.
       *
       * How you specify the phone number fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
       * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
       * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
       * `/form/primaryphoneline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryphoneline1` ,
       * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
       * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
       */
      override fun phoneNumberFields(phoneNumberFields: IResolvable) {
        cdkBuilder.phoneNumberFields(phoneNumberFields.let(IResolvable::unwrap))
      }

      /**
       * @param phoneNumberFields The names of the fields in the request payload that contain your
       * customer's primary phone number.
       * Order the phone number fields in the array exactly as they are ordered in the request
       * payload.
       *
       * How you specify the phone number fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
       * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
       * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
       * `/form/primaryphoneline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryphoneline1` ,
       * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
       * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
       */
      override fun phoneNumberFields(phoneNumberFields: List<Any>) {
        cdkBuilder.phoneNumberFields(phoneNumberFields)
      }

      /**
       * @param phoneNumberFields The names of the fields in the request payload that contain your
       * customer's primary phone number.
       * Order the phone number fields in the array exactly as they are ordered in the request
       * payload.
       *
       * How you specify the phone number fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
       * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
       * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
       * `/form/primaryphoneline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryphoneline1` ,
       * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
       * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
       */
      override fun phoneNumberFields(vararg phoneNumberFields: Any): Unit =
          phoneNumberFields(phoneNumberFields.toList())

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      override fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField.let(IResolvable::unwrap))
      }

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      override fun usernameField(usernameField: FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username.
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("600dd6ac4241238388c5ed8934f497e910491d363bd2f7d5b4990137f8df6320")
      override fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          usernameField(FieldIdentifierProperty(usernameField))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty,
    ) : CdkObject(cdkObject), RequestInspectionACFPProperty {
      /**
       * The names of the fields in the request payload that contain your customer's primary
       * physical address.
       *
       * Order the address fields in the array exactly as they are ordered in the request payload.
       *
       * How you specify the address fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
       * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the
       * address field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
       * `/form/primaryaddressline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryaddressline1` ,
       * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
       * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-addressfields)
       */
      override fun addressFields(): Any? = unwrap(this).getAddressFields()

      /**
       * The name of the field in the request payload that contains your customer's email.
       *
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "email": "THE_EMAIL" } }` , the email field
       * specification is `/form/email` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `email1` , the email field
       * specification is `email1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-emailfield)
       */
      override fun emailField(): Any? = unwrap(this).getEmailField()

      /**
       * The name of the field in the request payload that contains your customer's password.
       *
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-passwordfield)
       */
      override fun passwordField(): Any? = unwrap(this).getPasswordField()

      /**
       * The payload type for your account creation endpoint, either JSON or form encoded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-payloadtype)
       */
      override fun payloadType(): String = unwrap(this).getPayloadType()

      /**
       * The names of the fields in the request payload that contain your customer's primary phone
       * number.
       *
       * Order the phone number fields in the array exactly as they are ordered in the request
       * payload.
       *
       * How you specify the phone number fields depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
       * about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
       * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
       * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
       * `/form/primaryphoneline3` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with input elements named `primaryphoneline1` ,
       * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
       * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-phonenumberfields)
       */
      override fun phoneNumberFields(): Any? = unwrap(this).getPhoneNumberFields()

      /**
       * The name of the field in the request payload that contains your customer's username.
       *
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html#cfn-wafv2-webacl-requestinspectionacfp-usernamefield)
       */
      override fun usernameField(): Any? = unwrap(this).getUsernameField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RequestInspectionACFPProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty):
          RequestInspectionACFPProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestInspectionACFPProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionACFPProperty
    }
  }

  public interface ResponseInspectionJsonProperty {
    /**
     * Values for the specified identifier in the response JSON that indicate a failed login or
     * account creation attempt.
     *
     * To be counted as a failure, the value must be an exact match, including case. Each value must
     * be unique among the success and failure values.
     *
     * JSON example: `"FailureValues": [ "False", "Failed" ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionjson.html#cfn-wafv2-webacl-responseinspectionjson-failurevalues)
     */
    public fun failureValues(): List<String>

    /**
     * The identifier for the value to match against in the JSON.
     *
     * The identifier must be an exact match, including case.
     *
     * JSON examples: `"Identifier": [ "/login/success" ]` and `"Identifier": [ "/sign-up/success"
     * ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionjson.html#cfn-wafv2-webacl-responseinspectionjson-identifier)
     */
    public fun identifier(): String

    /**
     * Values for the specified identifier in the response JSON that indicate a successful login or
     * account creation attempt.
     *
     * To be counted as a success, the value must be an exact match, including case. Each value must
     * be unique among the success and failure values.
     *
     * JSON example: `"SuccessValues": [ "True", "Succeeded" ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionjson.html#cfn-wafv2-webacl-responseinspectionjson-successvalues)
     */
    public fun successValues(): List<String>

    /**
     * A builder for [ResponseInspectionJsonProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureValues Values for the specified identifier in the response JSON that indicate
       * a failed login or account creation attempt. 
       * To be counted as a failure, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON example: `"FailureValues": [ "False", "Failed" ]`
       */
      public fun failureValues(failureValues: List<String>)

      /**
       * @param failureValues Values for the specified identifier in the response JSON that indicate
       * a failed login or account creation attempt. 
       * To be counted as a failure, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON example: `"FailureValues": [ "False", "Failed" ]`
       */
      public fun failureValues(vararg failureValues: String)

      /**
       * @param identifier The identifier for the value to match against in the JSON. 
       * The identifier must be an exact match, including case.
       *
       * JSON examples: `"Identifier": [ "/login/success" ]` and `"Identifier": [ "/sign-up/success"
       * ]`
       */
      public fun identifier(identifier: String)

      /**
       * @param successValues Values for the specified identifier in the response JSON that indicate
       * a successful login or account creation attempt. 
       * To be counted as a success, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON example: `"SuccessValues": [ "True", "Succeeded" ]`
       */
      public fun successValues(successValues: List<String>)

      /**
       * @param successValues Values for the specified identifier in the response JSON that indicate
       * a successful login or account creation attempt. 
       * To be counted as a success, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON example: `"SuccessValues": [ "True", "Succeeded" ]`
       */
      public fun successValues(vararg successValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty.builder()

      /**
       * @param failureValues Values for the specified identifier in the response JSON that indicate
       * a failed login or account creation attempt. 
       * To be counted as a failure, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON example: `"FailureValues": [ "False", "Failed" ]`
       */
      override fun failureValues(failureValues: List<String>) {
        cdkBuilder.failureValues(failureValues)
      }

      /**
       * @param failureValues Values for the specified identifier in the response JSON that indicate
       * a failed login or account creation attempt. 
       * To be counted as a failure, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON example: `"FailureValues": [ "False", "Failed" ]`
       */
      override fun failureValues(vararg failureValues: String): Unit =
          failureValues(failureValues.toList())

      /**
       * @param identifier The identifier for the value to match against in the JSON. 
       * The identifier must be an exact match, including case.
       *
       * JSON examples: `"Identifier": [ "/login/success" ]` and `"Identifier": [ "/sign-up/success"
       * ]`
       */
      override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      /**
       * @param successValues Values for the specified identifier in the response JSON that indicate
       * a successful login or account creation attempt. 
       * To be counted as a success, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON example: `"SuccessValues": [ "True", "Succeeded" ]`
       */
      override fun successValues(successValues: List<String>) {
        cdkBuilder.successValues(successValues)
      }

      /**
       * @param successValues Values for the specified identifier in the response JSON that indicate
       * a successful login or account creation attempt. 
       * To be counted as a success, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON example: `"SuccessValues": [ "True", "Succeeded" ]`
       */
      override fun successValues(vararg successValues: String): Unit =
          successValues(successValues.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty,
    ) : CdkObject(cdkObject), ResponseInspectionJsonProperty {
      /**
       * Values for the specified identifier in the response JSON that indicate a failed login or
       * account creation attempt.
       *
       * To be counted as a failure, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON example: `"FailureValues": [ "False", "Failed" ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionjson.html#cfn-wafv2-webacl-responseinspectionjson-failurevalues)
       */
      override fun failureValues(): List<String> = unwrap(this).getFailureValues()

      /**
       * The identifier for the value to match against in the JSON.
       *
       * The identifier must be an exact match, including case.
       *
       * JSON examples: `"Identifier": [ "/login/success" ]` and `"Identifier": [ "/sign-up/success"
       * ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionjson.html#cfn-wafv2-webacl-responseinspectionjson-identifier)
       */
      override fun identifier(): String = unwrap(this).getIdentifier()

      /**
       * Values for the specified identifier in the response JSON that indicate a successful login
       * or account creation attempt.
       *
       * To be counted as a success, the value must be an exact match, including case. Each value
       * must be unique among the success and failure values.
       *
       * JSON example: `"SuccessValues": [ "True", "Succeeded" ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionjson.html#cfn-wafv2-webacl-responseinspectionjson-successvalues)
       */
      override fun successValues(): List<String> = unwrap(this).getSuccessValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseInspectionJsonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty):
          ResponseInspectionJsonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseInspectionJsonProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionJsonProperty
    }
  }

  public interface RegexPatternSetReferenceStatementProperty {
    /**
     * The Amazon Resource Name (ARN) of the `RegexPatternSet` that this statement references.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-arn)
     */
    public fun arn(): String

    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-fieldtomatch)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-texttransformations)
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
      @JvmName("6ccbf842cad464739deb3b55691dd736d97a44017ff340a83b43e32b7c5f080a")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty.builder()

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
      @JvmName("6ccbf842cad464739deb3b55691dd736d97a44017ff340a83b43e32b7c5f080a")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty,
    ) : CdkObject(cdkObject), RegexPatternSetReferenceStatementProperty {
      /**
       * The Amazon Resource Name (ARN) of the `RegexPatternSet` that this statement references.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-fieldtomatch)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RegexPatternSetReferenceStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty):
          RegexPatternSetReferenceStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegexPatternSetReferenceStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty
    }
  }

  public interface IPSetReferenceStatementProperty {
    /**
     * The Amazon Resource Name (ARN) of the `IPSet` that this statement references.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetreferencestatement.html#cfn-wafv2-webacl-ipsetreferencestatement-arn)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetreferencestatement.html#cfn-wafv2-webacl-ipsetreferencestatement-ipsetforwardedipconfig)
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
      @JvmName("931389788bf7bae9a61c915426c95877b1cfc1a69329485a4de7f91e081da8d7")
      public
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty.builder()

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
      @JvmName("931389788bf7bae9a61c915426c95877b1cfc1a69329485a4de7f91e081da8d7")
      override
          fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IPSetForwardedIPConfigurationProperty.Builder.() -> Unit):
          Unit =
          ipSetForwardedIpConfig(IPSetForwardedIPConfigurationProperty(ipSetForwardedIpConfig))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty,
    ) : CdkObject(cdkObject), IPSetReferenceStatementProperty {
      /**
       * The Amazon Resource Name (ARN) of the `IPSet` that this statement references.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetreferencestatement.html#cfn-wafv2-webacl-ipsetreferencestatement-arn)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetreferencestatement.html#cfn-wafv2-webacl-ipsetreferencestatement-ipsetforwardedipconfig)
       */
      override fun ipSetForwardedIpConfig(): Any? = unwrap(this).getIpSetForwardedIpConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetReferenceStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty):
          IPSetReferenceStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetReferenceStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty
    }
  }

  public interface ExcludedRuleProperty {
    /**
     * The name of the rule whose action you want to override to `Count` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-excludedrule.html#cfn-wafv2-webacl-excludedrule-name)
     */
    public fun name(): String

    /**
     * A builder for [ExcludedRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the rule whose action you want to override to `Count` . 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty.builder()

      /**
       * @param name The name of the rule whose action you want to override to `Count` . 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty,
    ) : CdkObject(cdkObject), ExcludedRuleProperty {
      /**
       * The name of the rule whose action you want to override to `Count` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-excludedrule.html#cfn-wafv2-webacl-excludedrule-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExcludedRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty):
          ExcludedRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExcludedRuleProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitquerystring.html#cfn-wafv2-webacl-ratelimitquerystring-texttransformations)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty.builder()

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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty,
    ) : CdkObject(cdkObject), RateLimitQueryStringProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitquerystring.html#cfn-wafv2-webacl-ratelimitquerystring-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitQueryStringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty):
          RateLimitQueryStringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitQueryStringProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitQueryStringProperty
    }
  }

  public interface RuleActionProperty {
    /**
     * Instructs AWS WAF to allow the web request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html#cfn-wafv2-webacl-ruleaction-allow)
     */
    public fun allow(): Any? = unwrap(this).getAllow()

    /**
     * Instructs AWS WAF to block the web request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html#cfn-wafv2-webacl-ruleaction-block)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html#cfn-wafv2-webacl-ruleaction-captcha)
     */
    public fun captcha(): Any? = unwrap(this).getCaptcha()

    /**
     * Instructs AWS WAF to run a `Challenge` check against the web request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html#cfn-wafv2-webacl-ruleaction-challenge)
     */
    public fun challenge(): Any? = unwrap(this).getChallenge()

    /**
     * Instructs AWS WAF to count the web request and then continue evaluating the request using the
     * remaining rules in the web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html#cfn-wafv2-webacl-ruleaction-count)
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
      public fun allow(allow: IResolvable)

      /**
       * @param allow Instructs AWS WAF to allow the web request.
       */
      public fun allow(allow: AllowActionProperty)

      /**
       * @param allow Instructs AWS WAF to allow the web request.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("379eaf354c519d5d43e85887069fd4a0ec59dbf7c90c6b050b9938e24da9b188")
      public fun allow(allow: AllowActionProperty.Builder.() -> Unit)

      /**
       * @param block Instructs AWS WAF to block the web request.
       */
      public fun block(block: IResolvable)

      /**
       * @param block Instructs AWS WAF to block the web request.
       */
      public fun block(block: BlockActionProperty)

      /**
       * @param block Instructs AWS WAF to block the web request.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fd4dfb4512cd977baaa1e76623bd5238a060fa2e2cef23c2ed7dabcc52c890a")
      public fun block(block: BlockActionProperty.Builder.() -> Unit)

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
      public fun captcha(captcha: IResolvable)

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
      public fun captcha(captcha: CaptchaActionProperty)

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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83fe3a78725fd5a98c7dd3bf2c232653dd6c729952ae934cefa9acb8cd24ec27")
      public fun captcha(captcha: CaptchaActionProperty.Builder.() -> Unit)

      /**
       * @param challenge Instructs AWS WAF to run a `Challenge` check against the web request.
       */
      public fun challenge(challenge: IResolvable)

      /**
       * @param challenge Instructs AWS WAF to run a `Challenge` check against the web request.
       */
      public fun challenge(challenge: ChallengeActionProperty)

      /**
       * @param challenge Instructs AWS WAF to run a `Challenge` check against the web request.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0fd2364bfd10736d5e7fa45fd833848b1e50a34a4c4b6f9b18d23c2d9db08ef")
      public fun challenge(challenge: ChallengeActionProperty.Builder.() -> Unit)

      /**
       * @param count Instructs AWS WAF to count the web request and then continue evaluating the
       * request using the remaining rules in the web ACL.
       */
      public fun count(count: IResolvable)

      /**
       * @param count Instructs AWS WAF to count the web request and then continue evaluating the
       * request using the remaining rules in the web ACL.
       */
      public fun count(count: CountActionProperty)

      /**
       * @param count Instructs AWS WAF to count the web request and then continue evaluating the
       * request using the remaining rules in the web ACL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bce2a1fd3829d2c64eced2b1506a7052e5ccb6dd194a55b6748aa86007208c5")
      public fun count(count: CountActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty.builder()

      /**
       * @param allow Instructs AWS WAF to allow the web request.
       */
      override fun allow(allow: IResolvable) {
        cdkBuilder.allow(allow.let(IResolvable::unwrap))
      }

      /**
       * @param allow Instructs AWS WAF to allow the web request.
       */
      override fun allow(allow: AllowActionProperty) {
        cdkBuilder.allow(allow.let(AllowActionProperty::unwrap))
      }

      /**
       * @param allow Instructs AWS WAF to allow the web request.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("379eaf354c519d5d43e85887069fd4a0ec59dbf7c90c6b050b9938e24da9b188")
      override fun allow(allow: AllowActionProperty.Builder.() -> Unit): Unit =
          allow(AllowActionProperty(allow))

      /**
       * @param block Instructs AWS WAF to block the web request.
       */
      override fun block(block: IResolvable) {
        cdkBuilder.block(block.let(IResolvable::unwrap))
      }

      /**
       * @param block Instructs AWS WAF to block the web request.
       */
      override fun block(block: BlockActionProperty) {
        cdkBuilder.block(block.let(BlockActionProperty::unwrap))
      }

      /**
       * @param block Instructs AWS WAF to block the web request.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fd4dfb4512cd977baaa1e76623bd5238a060fa2e2cef23c2ed7dabcc52c890a")
      override fun block(block: BlockActionProperty.Builder.() -> Unit): Unit =
          block(BlockActionProperty(block))

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
      override fun captcha(captcha: IResolvable) {
        cdkBuilder.captcha(captcha.let(IResolvable::unwrap))
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
      override fun captcha(captcha: CaptchaActionProperty) {
        cdkBuilder.captcha(captcha.let(CaptchaActionProperty::unwrap))
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83fe3a78725fd5a98c7dd3bf2c232653dd6c729952ae934cefa9acb8cd24ec27")
      override fun captcha(captcha: CaptchaActionProperty.Builder.() -> Unit): Unit =
          captcha(CaptchaActionProperty(captcha))

      /**
       * @param challenge Instructs AWS WAF to run a `Challenge` check against the web request.
       */
      override fun challenge(challenge: IResolvable) {
        cdkBuilder.challenge(challenge.let(IResolvable::unwrap))
      }

      /**
       * @param challenge Instructs AWS WAF to run a `Challenge` check against the web request.
       */
      override fun challenge(challenge: ChallengeActionProperty) {
        cdkBuilder.challenge(challenge.let(ChallengeActionProperty::unwrap))
      }

      /**
       * @param challenge Instructs AWS WAF to run a `Challenge` check against the web request.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0fd2364bfd10736d5e7fa45fd833848b1e50a34a4c4b6f9b18d23c2d9db08ef")
      override fun challenge(challenge: ChallengeActionProperty.Builder.() -> Unit): Unit =
          challenge(ChallengeActionProperty(challenge))

      /**
       * @param count Instructs AWS WAF to count the web request and then continue evaluating the
       * request using the remaining rules in the web ACL.
       */
      override fun count(count: IResolvable) {
        cdkBuilder.count(count.let(IResolvable::unwrap))
      }

      /**
       * @param count Instructs AWS WAF to count the web request and then continue evaluating the
       * request using the remaining rules in the web ACL.
       */
      override fun count(count: CountActionProperty) {
        cdkBuilder.count(count.let(CountActionProperty::unwrap))
      }

      /**
       * @param count Instructs AWS WAF to count the web request and then continue evaluating the
       * request using the remaining rules in the web ACL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bce2a1fd3829d2c64eced2b1506a7052e5ccb6dd194a55b6748aa86007208c5")
      override fun count(count: CountActionProperty.Builder.() -> Unit): Unit =
          count(CountActionProperty(count))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty,
    ) : CdkObject(cdkObject), RuleActionProperty {
      /**
       * Instructs AWS WAF to allow the web request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html#cfn-wafv2-webacl-ruleaction-allow)
       */
      override fun allow(): Any? = unwrap(this).getAllow()

      /**
       * Instructs AWS WAF to block the web request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html#cfn-wafv2-webacl-ruleaction-block)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html#cfn-wafv2-webacl-ruleaction-captcha)
       */
      override fun captcha(): Any? = unwrap(this).getCaptcha()

      /**
       * Instructs AWS WAF to run a `Challenge` check against the web request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html#cfn-wafv2-webacl-ruleaction-challenge)
       */
      override fun challenge(): Any? = unwrap(this).getChallenge()

      /**
       * Instructs AWS WAF to count the web request and then continue evaluating the request using
       * the remaining rules in the web ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html#cfn-wafv2-webacl-ruleaction-count)
       */
      override fun count(): Any? = unwrap(this).getCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty):
          RuleActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionProperty
    }
  }

  public interface ResponseInspectionStatusCodeProperty {
    /**
     * Status codes in the response that indicate a failed login or account creation attempt.
     *
     * To be counted as a failure, the response status code must match one of these. Each code must
     * be unique among the success and failure status codes.
     *
     * JSON example: `"FailureCodes": [ 400, 404 ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionstatuscode.html#cfn-wafv2-webacl-responseinspectionstatuscode-failurecodes)
     */
    public fun failureCodes(): Any

    /**
     * Status codes in the response that indicate a successful login or account creation attempt.
     *
     * To be counted as a success, the response status code must match one of these. Each code must
     * be unique among the success and failure status codes.
     *
     * JSON example: `"SuccessCodes": [ 200, 201 ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionstatuscode.html#cfn-wafv2-webacl-responseinspectionstatuscode-successcodes)
     */
    public fun successCodes(): Any

    /**
     * A builder for [ResponseInspectionStatusCodeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureCodes Status codes in the response that indicate a failed login or account
       * creation attempt. 
       * To be counted as a failure, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"FailureCodes": [ 400, 404 ]`
       */
      public fun failureCodes(failureCodes: IResolvable)

      /**
       * @param failureCodes Status codes in the response that indicate a failed login or account
       * creation attempt. 
       * To be counted as a failure, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"FailureCodes": [ 400, 404 ]`
       */
      public fun failureCodes(failureCodes: List<Number>)

      /**
       * @param failureCodes Status codes in the response that indicate a failed login or account
       * creation attempt. 
       * To be counted as a failure, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"FailureCodes": [ 400, 404 ]`
       */
      public fun failureCodes(vararg failureCodes: Number)

      /**
       * @param successCodes Status codes in the response that indicate a successful login or
       * account creation attempt. 
       * To be counted as a success, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"SuccessCodes": [ 200, 201 ]`
       */
      public fun successCodes(successCodes: IResolvable)

      /**
       * @param successCodes Status codes in the response that indicate a successful login or
       * account creation attempt. 
       * To be counted as a success, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"SuccessCodes": [ 200, 201 ]`
       */
      public fun successCodes(successCodes: List<Number>)

      /**
       * @param successCodes Status codes in the response that indicate a successful login or
       * account creation attempt. 
       * To be counted as a success, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"SuccessCodes": [ 200, 201 ]`
       */
      public fun successCodes(vararg successCodes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty.builder()

      /**
       * @param failureCodes Status codes in the response that indicate a failed login or account
       * creation attempt. 
       * To be counted as a failure, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"FailureCodes": [ 400, 404 ]`
       */
      override fun failureCodes(failureCodes: IResolvable) {
        cdkBuilder.failureCodes(failureCodes.let(IResolvable::unwrap))
      }

      /**
       * @param failureCodes Status codes in the response that indicate a failed login or account
       * creation attempt. 
       * To be counted as a failure, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"FailureCodes": [ 400, 404 ]`
       */
      override fun failureCodes(failureCodes: List<Number>) {
        cdkBuilder.failureCodes(failureCodes)
      }

      /**
       * @param failureCodes Status codes in the response that indicate a failed login or account
       * creation attempt. 
       * To be counted as a failure, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"FailureCodes": [ 400, 404 ]`
       */
      override fun failureCodes(vararg failureCodes: Number): Unit =
          failureCodes(failureCodes.toList())

      /**
       * @param successCodes Status codes in the response that indicate a successful login or
       * account creation attempt. 
       * To be counted as a success, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"SuccessCodes": [ 200, 201 ]`
       */
      override fun successCodes(successCodes: IResolvable) {
        cdkBuilder.successCodes(successCodes.let(IResolvable::unwrap))
      }

      /**
       * @param successCodes Status codes in the response that indicate a successful login or
       * account creation attempt. 
       * To be counted as a success, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"SuccessCodes": [ 200, 201 ]`
       */
      override fun successCodes(successCodes: List<Number>) {
        cdkBuilder.successCodes(successCodes)
      }

      /**
       * @param successCodes Status codes in the response that indicate a successful login or
       * account creation attempt. 
       * To be counted as a success, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"SuccessCodes": [ 200, 201 ]`
       */
      override fun successCodes(vararg successCodes: Number): Unit =
          successCodes(successCodes.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty,
    ) : CdkObject(cdkObject), ResponseInspectionStatusCodeProperty {
      /**
       * Status codes in the response that indicate a failed login or account creation attempt.
       *
       * To be counted as a failure, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"FailureCodes": [ 400, 404 ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionstatuscode.html#cfn-wafv2-webacl-responseinspectionstatuscode-failurecodes)
       */
      override fun failureCodes(): Any = unwrap(this).getFailureCodes()

      /**
       * Status codes in the response that indicate a successful login or account creation attempt.
       *
       * To be counted as a success, the response status code must match one of these. Each code
       * must be unique among the success and failure status codes.
       *
       * JSON example: `"SuccessCodes": [ 200, 201 ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionstatuscode.html#cfn-wafv2-webacl-responseinspectionstatuscode-successcodes)
       */
      override fun successCodes(): Any = unwrap(this).getSuccessCodes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResponseInspectionStatusCodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty):
          ResponseInspectionStatusCodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseInspectionStatusCodeProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionStatusCodeProperty
    }
  }

  public interface AndStatementProperty {
    /**
     * The statements to combine with AND logic.
     *
     * You can use any statements that can be nested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatement.html#cfn-wafv2-webacl-andstatement-statements)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty,
    ) : CdkObject(cdkObject), AndStatementProperty {
      /**
       * The statements to combine with AND logic.
       *
       * You can use any statements that can be nested.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatement.html#cfn-wafv2-webacl-andstatement-statements)
       */
      override fun statements(): Any = unwrap(this).getStatements()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AndStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty):
          AndStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AndStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customhttpheader.html#cfn-wafv2-webacl-customhttpheader-name)
     */
    public fun name(): String

    /**
     * The value of the custom header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customhttpheader.html#cfn-wafv2-webacl-customhttpheader-value)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty,
    ) : CdkObject(cdkObject), CustomHTTPHeaderProperty {
      /**
       * The name of the custom header.
       *
       * For custom request header insertion, when AWS WAF inserts the header into the request, it
       * prefixes this name `x-amzn-waf-` , to avoid confusion with the headers that are already in the
       * request. For example, for the header name `sample` , AWS WAF inserts the header
       * `x-amzn-waf-sample` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customhttpheader.html#cfn-wafv2-webacl-customhttpheader-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value of the custom header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customhttpheader.html#cfn-wafv2-webacl-customhttpheader-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomHTTPHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty):
          CustomHTTPHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomHTTPHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomHTTPHeaderProperty
    }
  }

  public interface RuleActionOverrideProperty {
    /**
     * The override action to use, in place of the configured action of the rule in the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleactionoverride.html#cfn-wafv2-webacl-ruleactionoverride-actiontouse)
     */
    public fun actionToUse(): Any

    /**
     * The name of the rule to override.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleactionoverride.html#cfn-wafv2-webacl-ruleactionoverride-name)
     */
    public fun name(): String

    /**
     * A builder for [RuleActionOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionToUse The override action to use, in place of the configured action of the
       * rule in the rule group. 
       */
      public fun actionToUse(actionToUse: IResolvable)

      /**
       * @param actionToUse The override action to use, in place of the configured action of the
       * rule in the rule group. 
       */
      public fun actionToUse(actionToUse: RuleActionProperty)

      /**
       * @param actionToUse The override action to use, in place of the configured action of the
       * rule in the rule group. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd1e6efbeedbce0fd02e1858517cf21908a417587c10830b02cb2eb79e3742fb")
      public fun actionToUse(actionToUse: RuleActionProperty.Builder.() -> Unit)

      /**
       * @param name The name of the rule to override. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty.builder()

      /**
       * @param actionToUse The override action to use, in place of the configured action of the
       * rule in the rule group. 
       */
      override fun actionToUse(actionToUse: IResolvable) {
        cdkBuilder.actionToUse(actionToUse.let(IResolvable::unwrap))
      }

      /**
       * @param actionToUse The override action to use, in place of the configured action of the
       * rule in the rule group. 
       */
      override fun actionToUse(actionToUse: RuleActionProperty) {
        cdkBuilder.actionToUse(actionToUse.let(RuleActionProperty::unwrap))
      }

      /**
       * @param actionToUse The override action to use, in place of the configured action of the
       * rule in the rule group. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd1e6efbeedbce0fd02e1858517cf21908a417587c10830b02cb2eb79e3742fb")
      override fun actionToUse(actionToUse: RuleActionProperty.Builder.() -> Unit): Unit =
          actionToUse(RuleActionProperty(actionToUse))

      /**
       * @param name The name of the rule to override. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty,
    ) : CdkObject(cdkObject), RuleActionOverrideProperty {
      /**
       * The override action to use, in place of the configured action of the rule in the rule
       * group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleactionoverride.html#cfn-wafv2-webacl-ruleactionoverride-actiontouse)
       */
      override fun actionToUse(): Any = unwrap(this).getActionToUse()

      /**
       * The name of the rule to override.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleactionoverride.html#cfn-wafv2-webacl-ruleactionoverride-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleActionOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty):
          RuleActionOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleActionOverrideProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleActionOverrideProperty
    }
  }

  public interface RateBasedStatementCustomKeyProperty {
    /**
     * Use the value of a cookie in the request as an aggregate key.
     *
     * Each distinct value in the cookie contributes to the aggregation instance. If you use a
     * single cookie as your custom key, then each value fully defines an aggregation instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-cookie)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-forwardedip)
     */
    public fun forwardedIp(): Any? = unwrap(this).getForwardedIp()

    /**
     * Use the value of a header in the request as an aggregate key.
     *
     * Each distinct value in the header contributes to the aggregation instance. If you use a
     * single header as your custom key, then each value fully defines an aggregation instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-header)
     */
    public fun `header`(): Any? = unwrap(this).getHeader()

    /**
     * Use the request's HTTP method as an aggregate key.
     *
     * Each distinct HTTP method contributes to the aggregation instance. If you use just the HTTP
     * method as your custom key, then each method fully defines an aggregation instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-httpmethod)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-ip)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-labelnamespace)
     */
    public fun labelNamespace(): Any? = unwrap(this).getLabelNamespace()

    /**
     * Use the specified query argument as an aggregate key.
     *
     * Each distinct value for the named query argument contributes to the aggregation instance. If
     * you use a single query argument as your custom key, then each value fully defines an aggregation
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-queryargument)
     */
    public fun queryArgument(): Any? = unwrap(this).getQueryArgument()

    /**
     * Use the request's query string as an aggregate key.
     *
     * Each distinct string contributes to the aggregation instance. If you use just the query
     * string as your custom key, then each string fully defines an aggregation instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-querystring)
     */
    public fun queryString(): Any? = unwrap(this).getQueryString()

    /**
     * Use the request's URI path as an aggregate key.
     *
     * Each distinct URI path contributes to the aggregation instance. If you use just the URI path
     * as your custom key, then each URI path fully defines an aggregation instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-uripath)
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
      @JvmName("31567424aac35def39a48e80f4cec5d8fa7fef100adfc17a95c4a734a786b384")
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
      @JvmName("3fd8e10b283ec6c37f20e86789857aa0c1ee87939fc8afaa94a3f55be8674018")
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
      @JvmName("f794f32bb0adb6eadfc6cae6739e0fae78c12ad7580808ad853a04c92c0d2687")
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
      @JvmName("6f63e79b59e9a0f8e15c6059832a410ea3bcbc32a6010f35a17a36437b97e1ac")
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
      @JvmName("deaf79c998efd2aabbf49bb4b74f32123cde27614eaf311feacb7a6f82da32ea")
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
      @JvmName("a900a92a78b39d1912dd2d759c2f182b4d94626ef4c71bf89a2e9b220865c922")
      public fun uriPath(uriPath: RateLimitUriPathProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty.builder()

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
      @JvmName("31567424aac35def39a48e80f4cec5d8fa7fef100adfc17a95c4a734a786b384")
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
      @JvmName("3fd8e10b283ec6c37f20e86789857aa0c1ee87939fc8afaa94a3f55be8674018")
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
      @JvmName("f794f32bb0adb6eadfc6cae6739e0fae78c12ad7580808ad853a04c92c0d2687")
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
      @JvmName("6f63e79b59e9a0f8e15c6059832a410ea3bcbc32a6010f35a17a36437b97e1ac")
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
      @JvmName("deaf79c998efd2aabbf49bb4b74f32123cde27614eaf311feacb7a6f82da32ea")
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
      @JvmName("a900a92a78b39d1912dd2d759c2f182b4d94626ef4c71bf89a2e9b220865c922")
      override fun uriPath(uriPath: RateLimitUriPathProperty.Builder.() -> Unit): Unit =
          uriPath(RateLimitUriPathProperty(uriPath))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty,
    ) : CdkObject(cdkObject), RateBasedStatementCustomKeyProperty {
      /**
       * Use the value of a cookie in the request as an aggregate key.
       *
       * Each distinct value in the cookie contributes to the aggregation instance. If you use a
       * single cookie as your custom key, then each value fully defines an aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-cookie)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-forwardedip)
       */
      override fun forwardedIp(): Any? = unwrap(this).getForwardedIp()

      /**
       * Use the value of a header in the request as an aggregate key.
       *
       * Each distinct value in the header contributes to the aggregation instance. If you use a
       * single header as your custom key, then each value fully defines an aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-header)
       */
      override fun `header`(): Any? = unwrap(this).getHeader()

      /**
       * Use the request's HTTP method as an aggregate key.
       *
       * Each distinct HTTP method contributes to the aggregation instance. If you use just the HTTP
       * method as your custom key, then each method fully defines an aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-httpmethod)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-ip)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-labelnamespace)
       */
      override fun labelNamespace(): Any? = unwrap(this).getLabelNamespace()

      /**
       * Use the specified query argument as an aggregate key.
       *
       * Each distinct value for the named query argument contributes to the aggregation instance.
       * If you use a single query argument as your custom key, then each value fully defines an
       * aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-queryargument)
       */
      override fun queryArgument(): Any? = unwrap(this).getQueryArgument()

      /**
       * Use the request's query string as an aggregate key.
       *
       * Each distinct string contributes to the aggregation instance. If you use just the query
       * string as your custom key, then each string fully defines an aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-querystring)
       */
      override fun queryString(): Any? = unwrap(this).getQueryString()

      /**
       * Use the request's URI path as an aggregate key.
       *
       * Each distinct URI path contributes to the aggregation instance. If you use just the URI
       * path as your custom key, then each URI path fully defines an aggregation instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatementcustomkey.html#cfn-wafv2-webacl-ratebasedstatementcustomkey-uripath)
       */
      override fun uriPath(): Any? = unwrap(this).getUriPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RateBasedStatementCustomKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty):
          RateBasedStatementCustomKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateBasedStatementCustomKeyProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementCustomKeyProperty
    }
  }

  public interface RegexMatchStatementProperty {
    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexmatchstatement.html#cfn-wafv2-webacl-regexmatchstatement-fieldtomatch)
     */
    public fun fieldToMatch(): Any

    /**
     * The string representing the regular expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexmatchstatement.html#cfn-wafv2-webacl-regexmatchstatement-regexstring)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexmatchstatement.html#cfn-wafv2-webacl-regexmatchstatement-texttransformations)
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
      @JvmName("5a4ae235677289bb347d158fccbeb065eddebae67c7b3494cf4f3526d337b738")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty.builder()

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
      @JvmName("5a4ae235677289bb347d158fccbeb065eddebae67c7b3494cf4f3526d337b738")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty,
    ) : CdkObject(cdkObject), RegexMatchStatementProperty {
      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexmatchstatement.html#cfn-wafv2-webacl-regexmatchstatement-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      /**
       * The string representing the regular expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexmatchstatement.html#cfn-wafv2-webacl-regexmatchstatement-regexstring)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexmatchstatement.html#cfn-wafv2-webacl-regexmatchstatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegexMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty):
          RegexMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegexMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RegexMatchStatementProperty
    }
  }

  public interface SingleHeaderProperty {
    /**
     * The name of the query header to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-singleheader.html#cfn-wafv2-webacl-singleheader-name)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty.builder()

      /**
       * @param name The name of the query header to inspect. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty,
    ) : CdkObject(cdkObject), SingleHeaderProperty {
      /**
       * The name of the query header to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-singleheader.html#cfn-wafv2-webacl-singleheader-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SingleHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty):
          SingleHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleHeaderProperty
    }
  }

  public interface CountActionProperty {
    /**
     * Defines custom handling for the web request.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-countaction.html#cfn-wafv2-webacl-countaction-customrequesthandling)
     */
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    /**
     * A builder for [CountActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun customRequestHandling(customRequestHandling: IResolvable)

      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7240ab3a4ed571a5245135df34bc9a0d3646c310c3139343a187947620129b4")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty.builder()

      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      /**
       * @param customRequestHandling Defines custom handling for the web request.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7240ab3a4ed571a5245135df34bc9a0d3646c310c3139343a187947620129b4")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty,
    ) : CdkObject(cdkObject), CountActionProperty {
      /**
       * Defines custom handling for the web request.
       *
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-countaction.html#cfn-wafv2-webacl-countaction-customrequesthandling)
       */
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CountActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty):
          CountActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CountActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.CountActionProperty
    }
  }

  public interface ByteMatchStatementProperty {
    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-fieldtomatch)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-positionalconstraint)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstring)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstringbase64)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-texttransformations)
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
      @JvmName("545d9a3c805382b7cf5e00cc76bec2fbf983d3e97857294aaef0fcdf21998877")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty.builder()

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
      @JvmName("545d9a3c805382b7cf5e00cc76bec2fbf983d3e97857294aaef0fcdf21998877")
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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty,
    ) : CdkObject(cdkObject), ByteMatchStatementProperty {
      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-fieldtomatch)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-positionalconstraint)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstring)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstringbase64)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ByteMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty):
          ByteMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ByteMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty
    }
  }

  public interface RateLimitHeaderProperty {
    /**
     * The name of the header to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitheader.html#cfn-wafv2-webacl-ratelimitheader-name)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitheader.html#cfn-wafv2-webacl-ratelimitheader-texttransformations)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty,
    ) : CdkObject(cdkObject), RateLimitHeaderProperty {
      /**
       * The name of the header to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitheader.html#cfn-wafv2-webacl-ratelimitheader-name)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitheader.html#cfn-wafv2-webacl-ratelimitheader-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty):
          RateLimitHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitHeaderProperty
    }
  }

  public interface CookieMatchPatternProperty {
    /**
     * Inspect all cookies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookiematchpattern.html#cfn-wafv2-webacl-cookiematchpattern-all)
     */
    public fun all(): Any? = unwrap(this).getAll()

    /**
     * Inspect only the cookies whose keys don't match any of the strings specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookiematchpattern.html#cfn-wafv2-webacl-cookiematchpattern-excludedcookies)
     */
    public fun excludedCookies(): List<String> = unwrap(this).getExcludedCookies() ?: emptyList()

    /**
     * Inspect only the cookies that have a key that matches one of the strings specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookiematchpattern.html#cfn-wafv2-webacl-cookiematchpattern-includedcookies)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty,
    ) : CdkObject(cdkObject), CookieMatchPatternProperty {
      /**
       * Inspect all cookies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookiematchpattern.html#cfn-wafv2-webacl-cookiematchpattern-all)
       */
      override fun all(): Any? = unwrap(this).getAll()

      /**
       * Inspect only the cookies whose keys don't match any of the strings specified here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookiematchpattern.html#cfn-wafv2-webacl-cookiematchpattern-excludedcookies)
       */
      override fun excludedCookies(): List<String> = unwrap(this).getExcludedCookies() ?:
          emptyList()

      /**
       * Inspect only the cookies that have a key that matches one of the strings specified here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookiematchpattern.html#cfn-wafv2-webacl-cookiematchpattern-includedcookies)
       */
      override fun includedCookies(): List<String> = unwrap(this).getIncludedCookies() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CookieMatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty):
          CookieMatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookieMatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.CookieMatchPatternProperty
    }
  }

  public interface NotStatementProperty {
    /**
     * The statement to negate.
     *
     * You can use any statement that can be nested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-notstatement.html#cfn-wafv2-webacl-notstatement-statement)
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
      @JvmName("a60c7ba7df5d6bea23a7dd98828007473b2fa502da3ee6562834bdcf7b4375ca")
      public fun statement(statement: StatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty.builder()

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
      @JvmName("a60c7ba7df5d6bea23a7dd98828007473b2fa502da3ee6562834bdcf7b4375ca")
      override fun statement(statement: StatementProperty.Builder.() -> Unit): Unit =
          statement(StatementProperty(statement))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty,
    ) : CdkObject(cdkObject), NotStatementProperty {
      /**
       * The statement to negate.
       *
       * You can use any statement that can be nested.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-notstatement.html#cfn-wafv2-webacl-notstatement-statement)
       */
      override fun statement(): Any = unwrap(this).getStatement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty):
          NotStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty
    }
  }

  public interface DefaultActionProperty {
    /**
     * Specifies that AWS WAF should allow requests by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-defaultaction.html#cfn-wafv2-webacl-defaultaction-allow)
     */
    public fun allow(): Any? = unwrap(this).getAllow()

    /**
     * Specifies that AWS WAF should block requests by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-defaultaction.html#cfn-wafv2-webacl-defaultaction-block)
     */
    public fun block(): Any? = unwrap(this).getBlock()

    /**
     * A builder for [DefaultActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allow Specifies that AWS WAF should allow requests by default.
       */
      public fun allow(allow: IResolvable)

      /**
       * @param allow Specifies that AWS WAF should allow requests by default.
       */
      public fun allow(allow: AllowActionProperty)

      /**
       * @param allow Specifies that AWS WAF should allow requests by default.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8437c49ff7202376ff3611cce47519a9622f0cbae0d14caa1382be023ac1eaf6")
      public fun allow(allow: AllowActionProperty.Builder.() -> Unit)

      /**
       * @param block Specifies that AWS WAF should block requests by default.
       */
      public fun block(block: IResolvable)

      /**
       * @param block Specifies that AWS WAF should block requests by default.
       */
      public fun block(block: BlockActionProperty)

      /**
       * @param block Specifies that AWS WAF should block requests by default.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae93ac37f012f83f2399e87262001399f52316d994a5b48c3821cfea8003da48")
      public fun block(block: BlockActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty.builder()

      /**
       * @param allow Specifies that AWS WAF should allow requests by default.
       */
      override fun allow(allow: IResolvable) {
        cdkBuilder.allow(allow.let(IResolvable::unwrap))
      }

      /**
       * @param allow Specifies that AWS WAF should allow requests by default.
       */
      override fun allow(allow: AllowActionProperty) {
        cdkBuilder.allow(allow.let(AllowActionProperty::unwrap))
      }

      /**
       * @param allow Specifies that AWS WAF should allow requests by default.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8437c49ff7202376ff3611cce47519a9622f0cbae0d14caa1382be023ac1eaf6")
      override fun allow(allow: AllowActionProperty.Builder.() -> Unit): Unit =
          allow(AllowActionProperty(allow))

      /**
       * @param block Specifies that AWS WAF should block requests by default.
       */
      override fun block(block: IResolvable) {
        cdkBuilder.block(block.let(IResolvable::unwrap))
      }

      /**
       * @param block Specifies that AWS WAF should block requests by default.
       */
      override fun block(block: BlockActionProperty) {
        cdkBuilder.block(block.let(BlockActionProperty::unwrap))
      }

      /**
       * @param block Specifies that AWS WAF should block requests by default.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae93ac37f012f83f2399e87262001399f52316d994a5b48c3821cfea8003da48")
      override fun block(block: BlockActionProperty.Builder.() -> Unit): Unit =
          block(BlockActionProperty(block))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty,
    ) : CdkObject(cdkObject), DefaultActionProperty {
      /**
       * Specifies that AWS WAF should allow requests by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-defaultaction.html#cfn-wafv2-webacl-defaultaction-allow)
       */
      override fun allow(): Any? = unwrap(this).getAllow()

      /**
       * Specifies that AWS WAF should block requests by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-defaultaction.html#cfn-wafv2-webacl-defaultaction-block)
       */
      override fun block(): Any? = unwrap(this).getBlock()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty):
          DefaultActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty
    }
  }

  public interface RuleGroupReferenceStatementProperty {
    /**
     * The Amazon Resource Name (ARN) of the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-arn)
     */
    public fun arn(): String

    /**
     * Rules in the referenced rule group whose actions are set to `Count` .
     *
     *
     * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
     * including `Count` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-excludedrules)
     */
    public fun excludedRules(): Any? = unwrap(this).getExcludedRules()

    /**
     * Action settings to use in the place of the rule actions that are configured inside the rule
     * group.
     *
     * You specify one override for each rule whose action you want to change.
     *
     * You can use overrides for testing, for example you can override all of rule actions to
     * `Count` and then monitor the resulting count metrics to understand how the rule group would
     * handle your web traffic. You can also permanently override some or all actions, to modify how
     * the rule group manages your web traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-ruleactionoverrides)
     */
    public fun ruleActionOverrides(): Any? = unwrap(this).getRuleActionOverrides()

    /**
     * A builder for [RuleGroupReferenceStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the entity. 
       */
      public fun arn(arn: String)

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      public fun excludedRules(excludedRules: IResolvable)

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      public fun excludedRules(excludedRules: List<Any>)

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      public fun excludedRules(vararg excludedRules: Any)

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      public fun ruleActionOverrides(ruleActionOverrides: IResolvable)

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      public fun ruleActionOverrides(ruleActionOverrides: List<Any>)

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      public fun ruleActionOverrides(vararg ruleActionOverrides: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the entity. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      override fun excludedRules(excludedRules: IResolvable) {
        cdkBuilder.excludedRules(excludedRules.let(IResolvable::unwrap))
      }

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      override fun excludedRules(excludedRules: List<Any>) {
        cdkBuilder.excludedRules(excludedRules)
      }

      /**
       * @param excludedRules Rules in the referenced rule group whose actions are set to `Count` .
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       */
      override fun excludedRules(vararg excludedRules: Any): Unit =
          excludedRules(excludedRules.toList())

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      override fun ruleActionOverrides(ruleActionOverrides: IResolvable) {
        cdkBuilder.ruleActionOverrides(ruleActionOverrides.let(IResolvable::unwrap))
      }

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      override fun ruleActionOverrides(ruleActionOverrides: List<Any>) {
        cdkBuilder.ruleActionOverrides(ruleActionOverrides)
      }

      /**
       * @param ruleActionOverrides Action settings to use in the place of the rule actions that are
       * configured inside the rule group.
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       */
      override fun ruleActionOverrides(vararg ruleActionOverrides: Any): Unit =
          ruleActionOverrides(ruleActionOverrides.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty,
    ) : CdkObject(cdkObject), RuleGroupReferenceStatementProperty {
      /**
       * The Amazon Resource Name (ARN) of the entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * Rules in the referenced rule group whose actions are set to `Count` .
       *
       *
       * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
       * including `Count` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-excludedrules)
       */
      override fun excludedRules(): Any? = unwrap(this).getExcludedRules()

      /**
       * Action settings to use in the place of the rule actions that are configured inside the rule
       * group.
       *
       * You specify one override for each rule whose action you want to change.
       *
       * You can use overrides for testing, for example you can override all of rule actions to
       * `Count` and then monitor the resulting count metrics to understand how the rule group would
       * handle your web traffic. You can also permanently override some or all actions, to modify how
       * the rule group manages your web traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-ruleactionoverrides)
       */
      override fun ruleActionOverrides(): Any? = unwrap(this).getRuleActionOverrides()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RuleGroupReferenceStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty):
          RuleGroupReferenceStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleGroupReferenceStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty
    }
  }

  public interface ChallengeConfigProperty {
    /**
     * Determines how long a challenge timestamp in the token remains valid after the client
     * successfully responds to a challenge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-challengeconfig.html#cfn-wafv2-webacl-challengeconfig-immunitytimeproperty)
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
      @JvmName("ef16da968f630a5ffeb13845ae944341603beb4ddb7276cd8a2579bd291b4df1")
      public
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty.builder()

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
      @JvmName("ef16da968f630a5ffeb13845ae944341603beb4ddb7276cd8a2579bd291b4df1")
      override
          fun immunityTimeProperty(immunityTimeProperty: ImmunityTimePropertyProperty.Builder.() -> Unit):
          Unit = immunityTimeProperty(ImmunityTimePropertyProperty(immunityTimeProperty))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty,
    ) : CdkObject(cdkObject), ChallengeConfigProperty {
      /**
       * Determines how long a challenge timestamp in the token remains valid after the client
       * successfully responds to a challenge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-challengeconfig.html#cfn-wafv2-webacl-challengeconfig-immunitytimeproperty)
       */
      override fun immunityTimeProperty(): Any? = unwrap(this).getImmunityTimeProperty()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChallengeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty):
          ChallengeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChallengeConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ChallengeConfigProperty
    }
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonbody.html#cfn-wafv2-webacl-jsonbody-invalidfallbackbehavior)
     */
    public fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

    /**
     * The patterns to look for in the JSON body.
     *
     * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonbody.html#cfn-wafv2-webacl-jsonbody-matchpattern)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonbody.html#cfn-wafv2-webacl-jsonbody-matchscope)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonbody.html#cfn-wafv2-webacl-jsonbody-oversizehandling)
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
      @JvmName("a713f0aaebe88325c07b4afed5457d394339ba89e1d542805b3d05ca88fc012a")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty.builder()

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
      @JvmName("a713f0aaebe88325c07b4afed5457d394339ba89e1d542805b3d05ca88fc012a")
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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty,
    ) : CdkObject(cdkObject), JsonBodyProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonbody.html#cfn-wafv2-webacl-jsonbody-invalidfallbackbehavior)
       */
      override fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

      /**
       * The patterns to look for in the JSON body.
       *
       * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonbody.html#cfn-wafv2-webacl-jsonbody-matchpattern)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonbody.html#cfn-wafv2-webacl-jsonbody-matchscope)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonbody.html#cfn-wafv2-webacl-jsonbody-oversizehandling)
       */
      override fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty):
          JsonBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetforwardedipconfiguration.html#cfn-wafv2-webacl-ipsetforwardedipconfiguration-fallbackbehavior)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetforwardedipconfiguration.html#cfn-wafv2-webacl-ipsetforwardedipconfiguration-headername)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetforwardedipconfiguration.html#cfn-wafv2-webacl-ipsetforwardedipconfiguration-position)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty.builder()

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
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty,
    ) : CdkObject(cdkObject), IPSetForwardedIPConfigurationProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetforwardedipconfiguration.html#cfn-wafv2-webacl-ipsetforwardedipconfiguration-fallbackbehavior)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetforwardedipconfiguration.html#cfn-wafv2-webacl-ipsetforwardedipconfiguration-headername)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetforwardedipconfiguration.html#cfn-wafv2-webacl-ipsetforwardedipconfiguration-position)
       */
      override fun position(): String = unwrap(this).getPosition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IPSetForwardedIPConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty):
          IPSetForwardedIPConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetForwardedIPConfigurationProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetForwardedIPConfigurationProperty
    }
  }

  public interface SizeConstraintStatementProperty {
    /**
     * The operator to use to compare the request part to the size setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-comparisonoperator)
     */
    public fun comparisonOperator(): String

    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-fieldtomatch)
     */
    public fun fieldToMatch(): Any

    /**
     * The size, in byte, to compare to the request part, after any transformations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-size)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-texttransformations)
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
      @JvmName("5ce9d5881a7cabbbdb8050a5fe83c561595dc111606a3ae5137e044fb95be716")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty.builder()

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
      @JvmName("5ce9d5881a7cabbbdb8050a5fe83c561595dc111606a3ae5137e044fb95be716")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty,
    ) : CdkObject(cdkObject), SizeConstraintStatementProperty {
      /**
       * The operator to use to compare the request part to the size setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-comparisonoperator)
       */
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      /**
       * The size, in byte, to compare to the request part, after any transformations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-size)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SizeConstraintStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty):
          SizeConstraintStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SizeConstraintStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty
    }
  }

  public interface ManagedRuleGroupConfigProperty {
    /**
     * Additional configuration for using the account creation fraud prevention (ACFP) managed rule
     * group, `AWSManagedRulesACFPRuleSet` .
     *
     * Use this to provide account creation request information to the rule group. For web ACLs that
     * protect CloudFront distributions, use this to also provide the information about how your
     * distribution responds to account creation requests.
     *
     * For information about using the ACFP managed rule group, see [AWS WAF Fraud Control account
     * creation fraud prevention (ACFP) rule
     * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html)
     * and [AWS WAF Fraud Control account creation fraud prevention
     * (ACFP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html) in the *AWS WAF
     * Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-awsmanagedrulesacfpruleset)
     */
    public fun awsManagedRulesAcfpRuleSet(): Any? = unwrap(this).getAwsManagedRulesAcfpRuleSet()

    /**
     * Additional configuration for using the account takeover prevention (ATP) managed rule group,
     * `AWSManagedRulesATPRuleSet` .
     *
     * Use this to provide login request information to the rule group. For web ACLs that protect
     * CloudFront distributions, use this to also provide the information about how your distribution
     * responds to login requests.
     *
     * This configuration replaces the individual configuration fields in `ManagedRuleGroupConfig`
     * and provides additional feature configuration.
     *
     * For information about using the ATP managed rule group, see [AWS WAF Fraud Control account
     * takeover prevention (ATP) rule
     * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html)
     * and [AWS WAF Fraud Control account takeover prevention
     * (ATP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html) in the *AWS WAF
     * Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-awsmanagedrulesatpruleset)
     */
    public fun awsManagedRulesAtpRuleSet(): Any? = unwrap(this).getAwsManagedRulesAtpRuleSet()

    /**
     * Additional configuration for using the Bot Control managed rule group.
     *
     * Use this to specify the inspection level that you want to use. For information about using
     * the Bot Control managed rule group, see [AWS WAF Bot Control rule
     * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
     * and [AWS WAF Bot
     * Control](https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html) in the *AWS
     * WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-awsmanagedrulesbotcontrolruleset)
     */
    public fun awsManagedRulesBotControlRuleSet(): Any? =
        unwrap(this).getAwsManagedRulesBotControlRuleSet()

    /**
     * Instead of this setting, provide your configuration under `AWSManagedRulesATPRuleSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-loginpath)
     */
    public fun loginPath(): String? = unwrap(this).getLoginPath()

    /**
     * Instead of this setting, provide your configuration under the request inspection
     * configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-passwordfield)
     */
    public fun passwordField(): Any? = unwrap(this).getPasswordField()

    /**
     * Instead of this setting, provide your configuration under the request inspection
     * configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-payloadtype)
     */
    public fun payloadType(): String? = unwrap(this).getPayloadType()

    /**
     * Instead of this setting, provide your configuration under the request inspection
     * configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-usernamefield)
     */
    public fun usernameField(): Any? = unwrap(this).getUsernameField()

    /**
     * A builder for [ManagedRuleGroupConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsManagedRulesAcfpRuleSet Additional configuration for using the account creation
       * fraud prevention (ACFP) managed rule group, `AWSManagedRulesACFPRuleSet` .
       * Use this to provide account creation request information to the rule group. For web ACLs
       * that protect CloudFront distributions, use this to also provide the information about how your
       * distribution responds to account creation requests.
       *
       * For information about using the ACFP managed rule group, see [AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html)
       * and [AWS WAF Fraud Control account creation fraud prevention
       * (ACFP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html) in the *AWS WAF
       * Developer Guide* .
       */
      public fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: IResolvable)

      /**
       * @param awsManagedRulesAcfpRuleSet Additional configuration for using the account creation
       * fraud prevention (ACFP) managed rule group, `AWSManagedRulesACFPRuleSet` .
       * Use this to provide account creation request information to the rule group. For web ACLs
       * that protect CloudFront distributions, use this to also provide the information about how your
       * distribution responds to account creation requests.
       *
       * For information about using the ACFP managed rule group, see [AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html)
       * and [AWS WAF Fraud Control account creation fraud prevention
       * (ACFP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html) in the *AWS WAF
       * Developer Guide* .
       */
      public
          fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: AWSManagedRulesACFPRuleSetProperty)

      /**
       * @param awsManagedRulesAcfpRuleSet Additional configuration for using the account creation
       * fraud prevention (ACFP) managed rule group, `AWSManagedRulesACFPRuleSet` .
       * Use this to provide account creation request information to the rule group. For web ACLs
       * that protect CloudFront distributions, use this to also provide the information about how your
       * distribution responds to account creation requests.
       *
       * For information about using the ACFP managed rule group, see [AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html)
       * and [AWS WAF Fraud Control account creation fraud prevention
       * (ACFP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html) in the *AWS WAF
       * Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e365e2687f33e759cd514a180a5b741cba913ac9b26c94a6bdc672725ef94407")
      public
          fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: AWSManagedRulesACFPRuleSetProperty.Builder.() -> Unit)

      /**
       * @param awsManagedRulesAtpRuleSet Additional configuration for using the account takeover
       * prevention (ATP) managed rule group, `AWSManagedRulesATPRuleSet` .
       * Use this to provide login request information to the rule group. For web ACLs that protect
       * CloudFront distributions, use this to also provide the information about how your distribution
       * responds to login requests.
       *
       * This configuration replaces the individual configuration fields in `ManagedRuleGroupConfig`
       * and provides additional feature configuration.
       *
       * For information about using the ATP managed rule group, see [AWS WAF Fraud Control account
       * takeover prevention (ATP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html)
       * and [AWS WAF Fraud Control account takeover prevention
       * (ATP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html) in the *AWS WAF
       * Developer Guide* .
       */
      public fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: IResolvable)

      /**
       * @param awsManagedRulesAtpRuleSet Additional configuration for using the account takeover
       * prevention (ATP) managed rule group, `AWSManagedRulesATPRuleSet` .
       * Use this to provide login request information to the rule group. For web ACLs that protect
       * CloudFront distributions, use this to also provide the information about how your distribution
       * responds to login requests.
       *
       * This configuration replaces the individual configuration fields in `ManagedRuleGroupConfig`
       * and provides additional feature configuration.
       *
       * For information about using the ATP managed rule group, see [AWS WAF Fraud Control account
       * takeover prevention (ATP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html)
       * and [AWS WAF Fraud Control account takeover prevention
       * (ATP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html) in the *AWS WAF
       * Developer Guide* .
       */
      public
          fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: AWSManagedRulesATPRuleSetProperty)

      /**
       * @param awsManagedRulesAtpRuleSet Additional configuration for using the account takeover
       * prevention (ATP) managed rule group, `AWSManagedRulesATPRuleSet` .
       * Use this to provide login request information to the rule group. For web ACLs that protect
       * CloudFront distributions, use this to also provide the information about how your distribution
       * responds to login requests.
       *
       * This configuration replaces the individual configuration fields in `ManagedRuleGroupConfig`
       * and provides additional feature configuration.
       *
       * For information about using the ATP managed rule group, see [AWS WAF Fraud Control account
       * takeover prevention (ATP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html)
       * and [AWS WAF Fraud Control account takeover prevention
       * (ATP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html) in the *AWS WAF
       * Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b668638f8772da0a8feaba966da302391529ec3a4ef1ce1921b00c0d31725948")
      public
          fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: AWSManagedRulesATPRuleSetProperty.Builder.() -> Unit)

      /**
       * @param awsManagedRulesBotControlRuleSet Additional configuration for using the Bot Control
       * managed rule group.
       * Use this to specify the inspection level that you want to use. For information about using
       * the Bot Control managed rule group, see [AWS WAF Bot Control rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
       * and [AWS WAF Bot
       * Control](https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html) in the
       * *AWS WAF Developer Guide* .
       */
      public fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: IResolvable)

      /**
       * @param awsManagedRulesBotControlRuleSet Additional configuration for using the Bot Control
       * managed rule group.
       * Use this to specify the inspection level that you want to use. For information about using
       * the Bot Control managed rule group, see [AWS WAF Bot Control rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
       * and [AWS WAF Bot
       * Control](https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html) in the
       * *AWS WAF Developer Guide* .
       */
      public
          fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: AWSManagedRulesBotControlRuleSetProperty)

      /**
       * @param awsManagedRulesBotControlRuleSet Additional configuration for using the Bot Control
       * managed rule group.
       * Use this to specify the inspection level that you want to use. For information about using
       * the Bot Control managed rule group, see [AWS WAF Bot Control rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
       * and [AWS WAF Bot
       * Control](https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html) in the
       * *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bdc79f5d89a1531a2cae414d0733d78c302aa7457f469af0210af6f5db7c6a3")
      public
          fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: AWSManagedRulesBotControlRuleSetProperty.Builder.() -> Unit)

      /**
       * @param loginPath Instead of this setting, provide your configuration under
       * `AWSManagedRulesATPRuleSet` .
       */
      public fun loginPath(loginPath: String)

      /**
       * @param passwordField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      public fun passwordField(passwordField: IResolvable)

      /**
       * @param passwordField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      public fun passwordField(passwordField: FieldIdentifierProperty)

      /**
       * @param passwordField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c95687bb7e28071b99a66f09ae07ef28e92a08533deba6f9d00a7914d459a7b")
      public fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit)

      /**
       * @param payloadType Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      public fun payloadType(payloadType: String)

      /**
       * @param usernameField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      public fun usernameField(usernameField: IResolvable)

      /**
       * @param usernameField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      public fun usernameField(usernameField: FieldIdentifierProperty)

      /**
       * @param usernameField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("801e82b338beac2750da186934b1105bd0f7561a544c1f2aab0d51612b59a1f0")
      public fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty.builder()

      /**
       * @param awsManagedRulesAcfpRuleSet Additional configuration for using the account creation
       * fraud prevention (ACFP) managed rule group, `AWSManagedRulesACFPRuleSet` .
       * Use this to provide account creation request information to the rule group. For web ACLs
       * that protect CloudFront distributions, use this to also provide the information about how your
       * distribution responds to account creation requests.
       *
       * For information about using the ACFP managed rule group, see [AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html)
       * and [AWS WAF Fraud Control account creation fraud prevention
       * (ACFP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html) in the *AWS WAF
       * Developer Guide* .
       */
      override fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet.let(IResolvable::unwrap))
      }

      /**
       * @param awsManagedRulesAcfpRuleSet Additional configuration for using the account creation
       * fraud prevention (ACFP) managed rule group, `AWSManagedRulesACFPRuleSet` .
       * Use this to provide account creation request information to the rule group. For web ACLs
       * that protect CloudFront distributions, use this to also provide the information about how your
       * distribution responds to account creation requests.
       *
       * For information about using the ACFP managed rule group, see [AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html)
       * and [AWS WAF Fraud Control account creation fraud prevention
       * (ACFP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html) in the *AWS WAF
       * Developer Guide* .
       */
      override
          fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: AWSManagedRulesACFPRuleSetProperty) {
        cdkBuilder.awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet.let(AWSManagedRulesACFPRuleSetProperty::unwrap))
      }

      /**
       * @param awsManagedRulesAcfpRuleSet Additional configuration for using the account creation
       * fraud prevention (ACFP) managed rule group, `AWSManagedRulesACFPRuleSet` .
       * Use this to provide account creation request information to the rule group. For web ACLs
       * that protect CloudFront distributions, use this to also provide the information about how your
       * distribution responds to account creation requests.
       *
       * For information about using the ACFP managed rule group, see [AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html)
       * and [AWS WAF Fraud Control account creation fraud prevention
       * (ACFP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html) in the *AWS WAF
       * Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e365e2687f33e759cd514a180a5b741cba913ac9b26c94a6bdc672725ef94407")
      override
          fun awsManagedRulesAcfpRuleSet(awsManagedRulesAcfpRuleSet: AWSManagedRulesACFPRuleSetProperty.Builder.() -> Unit):
          Unit =
          awsManagedRulesAcfpRuleSet(AWSManagedRulesACFPRuleSetProperty(awsManagedRulesAcfpRuleSet))

      /**
       * @param awsManagedRulesAtpRuleSet Additional configuration for using the account takeover
       * prevention (ATP) managed rule group, `AWSManagedRulesATPRuleSet` .
       * Use this to provide login request information to the rule group. For web ACLs that protect
       * CloudFront distributions, use this to also provide the information about how your distribution
       * responds to login requests.
       *
       * This configuration replaces the individual configuration fields in `ManagedRuleGroupConfig`
       * and provides additional feature configuration.
       *
       * For information about using the ATP managed rule group, see [AWS WAF Fraud Control account
       * takeover prevention (ATP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html)
       * and [AWS WAF Fraud Control account takeover prevention
       * (ATP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html) in the *AWS WAF
       * Developer Guide* .
       */
      override fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet.let(IResolvable::unwrap))
      }

      /**
       * @param awsManagedRulesAtpRuleSet Additional configuration for using the account takeover
       * prevention (ATP) managed rule group, `AWSManagedRulesATPRuleSet` .
       * Use this to provide login request information to the rule group. For web ACLs that protect
       * CloudFront distributions, use this to also provide the information about how your distribution
       * responds to login requests.
       *
       * This configuration replaces the individual configuration fields in `ManagedRuleGroupConfig`
       * and provides additional feature configuration.
       *
       * For information about using the ATP managed rule group, see [AWS WAF Fraud Control account
       * takeover prevention (ATP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html)
       * and [AWS WAF Fraud Control account takeover prevention
       * (ATP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html) in the *AWS WAF
       * Developer Guide* .
       */
      override
          fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: AWSManagedRulesATPRuleSetProperty) {
        cdkBuilder.awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet.let(AWSManagedRulesATPRuleSetProperty::unwrap))
      }

      /**
       * @param awsManagedRulesAtpRuleSet Additional configuration for using the account takeover
       * prevention (ATP) managed rule group, `AWSManagedRulesATPRuleSet` .
       * Use this to provide login request information to the rule group. For web ACLs that protect
       * CloudFront distributions, use this to also provide the information about how your distribution
       * responds to login requests.
       *
       * This configuration replaces the individual configuration fields in `ManagedRuleGroupConfig`
       * and provides additional feature configuration.
       *
       * For information about using the ATP managed rule group, see [AWS WAF Fraud Control account
       * takeover prevention (ATP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html)
       * and [AWS WAF Fraud Control account takeover prevention
       * (ATP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html) in the *AWS WAF
       * Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b668638f8772da0a8feaba966da302391529ec3a4ef1ce1921b00c0d31725948")
      override
          fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: AWSManagedRulesATPRuleSetProperty.Builder.() -> Unit):
          Unit =
          awsManagedRulesAtpRuleSet(AWSManagedRulesATPRuleSetProperty(awsManagedRulesAtpRuleSet))

      /**
       * @param awsManagedRulesBotControlRuleSet Additional configuration for using the Bot Control
       * managed rule group.
       * Use this to specify the inspection level that you want to use. For information about using
       * the Bot Control managed rule group, see [AWS WAF Bot Control rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
       * and [AWS WAF Bot
       * Control](https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html) in the
       * *AWS WAF Developer Guide* .
       */
      override fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet.let(IResolvable::unwrap))
      }

      /**
       * @param awsManagedRulesBotControlRuleSet Additional configuration for using the Bot Control
       * managed rule group.
       * Use this to specify the inspection level that you want to use. For information about using
       * the Bot Control managed rule group, see [AWS WAF Bot Control rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
       * and [AWS WAF Bot
       * Control](https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html) in the
       * *AWS WAF Developer Guide* .
       */
      override
          fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: AWSManagedRulesBotControlRuleSetProperty) {
        cdkBuilder.awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet.let(AWSManagedRulesBotControlRuleSetProperty::unwrap))
      }

      /**
       * @param awsManagedRulesBotControlRuleSet Additional configuration for using the Bot Control
       * managed rule group.
       * Use this to specify the inspection level that you want to use. For information about using
       * the Bot Control managed rule group, see [AWS WAF Bot Control rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
       * and [AWS WAF Bot
       * Control](https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html) in the
       * *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bdc79f5d89a1531a2cae414d0733d78c302aa7457f469af0210af6f5db7c6a3")
      override
          fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: AWSManagedRulesBotControlRuleSetProperty.Builder.() -> Unit):
          Unit =
          awsManagedRulesBotControlRuleSet(AWSManagedRulesBotControlRuleSetProperty(awsManagedRulesBotControlRuleSet))

      /**
       * @param loginPath Instead of this setting, provide your configuration under
       * `AWSManagedRulesATPRuleSet` .
       */
      override fun loginPath(loginPath: String) {
        cdkBuilder.loginPath(loginPath)
      }

      /**
       * @param passwordField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      override fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField.let(IResolvable::unwrap))
      }

      /**
       * @param passwordField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      override fun passwordField(passwordField: FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param passwordField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c95687bb7e28071b99a66f09ae07ef28e92a08533deba6f9d00a7914d459a7b")
      override fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          passwordField(FieldIdentifierProperty(passwordField))

      /**
       * @param payloadType Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      override fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
      }

      /**
       * @param usernameField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      override fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField.let(IResolvable::unwrap))
      }

      /**
       * @param usernameField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      override fun usernameField(usernameField: FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param usernameField Instead of this setting, provide your configuration under the request
       * inspection configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("801e82b338beac2750da186934b1105bd0f7561a544c1f2aab0d51612b59a1f0")
      override fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          usernameField(FieldIdentifierProperty(usernameField))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty,
    ) : CdkObject(cdkObject), ManagedRuleGroupConfigProperty {
      /**
       * Additional configuration for using the account creation fraud prevention (ACFP) managed
       * rule group, `AWSManagedRulesACFPRuleSet` .
       *
       * Use this to provide account creation request information to the rule group. For web ACLs
       * that protect CloudFront distributions, use this to also provide the information about how your
       * distribution responds to account creation requests.
       *
       * For information about using the ACFP managed rule group, see [AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html)
       * and [AWS WAF Fraud Control account creation fraud prevention
       * (ACFP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html) in the *AWS WAF
       * Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-awsmanagedrulesacfpruleset)
       */
      override fun awsManagedRulesAcfpRuleSet(): Any? = unwrap(this).getAwsManagedRulesAcfpRuleSet()

      /**
       * Additional configuration for using the account takeover prevention (ATP) managed rule
       * group, `AWSManagedRulesATPRuleSet` .
       *
       * Use this to provide login request information to the rule group. For web ACLs that protect
       * CloudFront distributions, use this to also provide the information about how your distribution
       * responds to login requests.
       *
       * This configuration replaces the individual configuration fields in `ManagedRuleGroupConfig`
       * and provides additional feature configuration.
       *
       * For information about using the ATP managed rule group, see [AWS WAF Fraud Control account
       * takeover prevention (ATP) rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html)
       * and [AWS WAF Fraud Control account takeover prevention
       * (ATP)](https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html) in the *AWS WAF
       * Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-awsmanagedrulesatpruleset)
       */
      override fun awsManagedRulesAtpRuleSet(): Any? = unwrap(this).getAwsManagedRulesAtpRuleSet()

      /**
       * Additional configuration for using the Bot Control managed rule group.
       *
       * Use this to specify the inspection level that you want to use. For information about using
       * the Bot Control managed rule group, see [AWS WAF Bot Control rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
       * and [AWS WAF Bot
       * Control](https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html) in the
       * *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-awsmanagedrulesbotcontrolruleset)
       */
      override fun awsManagedRulesBotControlRuleSet(): Any? =
          unwrap(this).getAwsManagedRulesBotControlRuleSet()

      /**
       * Instead of this setting, provide your configuration under `AWSManagedRulesATPRuleSet` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-loginpath)
       */
      override fun loginPath(): String? = unwrap(this).getLoginPath()

      /**
       * Instead of this setting, provide your configuration under the request inspection
       * configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-passwordfield)
       */
      override fun passwordField(): Any? = unwrap(this).getPasswordField()

      /**
       * Instead of this setting, provide your configuration under the request inspection
       * configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-payloadtype)
       */
      override fun payloadType(): String? = unwrap(this).getPayloadType()

      /**
       * Instead of this setting, provide your configuration under the request inspection
       * configuration for `AWSManagedRulesATPRuleSet` or `AWSManagedRulesACFPRuleSet` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html#cfn-wafv2-webacl-managedrulegroupconfig-usernamefield)
       */
      override fun usernameField(): Any? = unwrap(this).getUsernameField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedRuleGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty):
          ManagedRuleGroupConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedRuleGroupConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupConfigProperty
    }
  }

  public interface RateLimitLabelNamespaceProperty {
    /**
     * The namespace to use for aggregation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitlabelnamespace.html#cfn-wafv2-webacl-ratelimitlabelnamespace-namespace)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty.builder()

      /**
       * @param namespace The namespace to use for aggregation. 
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty,
    ) : CdkObject(cdkObject), RateLimitLabelNamespaceProperty {
      /**
       * The namespace to use for aggregation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitlabelnamespace.html#cfn-wafv2-webacl-ratelimitlabelnamespace-namespace)
       */
      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitLabelNamespaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty):
          RateLimitLabelNamespaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateLimitLabelNamespaceProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateLimitLabelNamespaceProperty
    }
  }

  public interface FieldToMatchProperty {
    /**
     * Inspect all query arguments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-allqueryarguments)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-body)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-cookies)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-headers)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-jsonbody)
     */
    public fun jsonBody(): Any? = unwrap(this).getJsonBody()

    /**
     * Inspect the HTTP method.
     *
     * The method indicates the type of operation that the request is asking the origin to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-method)
     */
    public fun method(): Any? = unwrap(this).getMethod()

    /**
     * Inspect the query string.
     *
     * This is the part of a URL that appears after a `?` character, if any.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-querystring)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singleheader)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singlequeryargument)
     */
    public fun singleQueryArgument(): Any? = unwrap(this).getSingleQueryArgument()

    /**
     * Inspect the request URI path.
     *
     * This is the part of the web request that identifies a resource, for example,
     * `/images/daily-ad.jpg` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-uripath)
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
      @JvmName("4187d2a7600da4b224b02d48c1802e7cf8f8f9722371bfa267effb0336e47b7e")
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
      @JvmName("27f40245785764ca1cfebe47c390db337b9f3f182a13553395488a9d5389357a")
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
      @JvmName("a201e91ef2b6c5f336390bbdf975a593aa050cbd4acec2da27d5c1e4d138bd7a")
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
      @JvmName("30214c55630de1a0d2acbec07ad360fe490d9636fdd219f46d092f7d92eb2840")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty.builder()

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
      @JvmName("4187d2a7600da4b224b02d48c1802e7cf8f8f9722371bfa267effb0336e47b7e")
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
      @JvmName("27f40245785764ca1cfebe47c390db337b9f3f182a13553395488a9d5389357a")
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
      @JvmName("a201e91ef2b6c5f336390bbdf975a593aa050cbd4acec2da27d5c1e4d138bd7a")
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
      @JvmName("30214c55630de1a0d2acbec07ad360fe490d9636fdd219f46d092f7d92eb2840")
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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty,
    ) : CdkObject(cdkObject), FieldToMatchProperty {
      /**
       * Inspect all query arguments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-allqueryarguments)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-body)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-cookies)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-headers)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-jsonbody)
       */
      override fun jsonBody(): Any? = unwrap(this).getJsonBody()

      /**
       * Inspect the HTTP method.
       *
       * The method indicates the type of operation that the request is asking the origin to
       * perform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-method)
       */
      override fun method(): Any? = unwrap(this).getMethod()

      /**
       * Inspect the query string.
       *
       * This is the part of a URL that appears after a `?` character, if any.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-querystring)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singleheader)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singlequeryargument)
       */
      override fun singleQueryArgument(): Any? = unwrap(this).getSingleQueryArgument()

      /**
       * Inspect the request URI path.
       *
       * This is the part of the web request that identifies a resource, for example,
       * `/images/daily-ad.jpg` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-uripath)
       */
      override fun uriPath(): Any? = unwrap(this).getUriPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldToMatchProperty
    }
  }

  public interface AWSManagedRulesATPRuleSetProperty {
    /**
     * Allow the use of regular expressions in the login page path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesatpruleset.html#cfn-wafv2-webacl-awsmanagedrulesatpruleset-enableregexinpath)
     */
    public fun enableRegexInPath(): Any? = unwrap(this).getEnableRegexInPath()

    /**
     * The path of the login endpoint for your application.
     *
     * For example, for the URL `https://example.com/web/login` , you would provide the path
     * `/web/login` . Login paths that start with the path that you provide are considered a match. For
     * example `/web/login` matches the login paths `/web/login` , `/web/login/` , `/web/loginPage` ,
     * and `/web/login/thisPage` , but doesn't match the login path `/home/web/login` or
     * `/website/login` .
     *
     * The rule group inspects only HTTP `POST` requests to your specified login endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesatpruleset.html#cfn-wafv2-webacl-awsmanagedrulesatpruleset-loginpath)
     */
    public fun loginPath(): String

    /**
     * The criteria for inspecting login requests, used by the ATP rule group to validate
     * credentials usage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesatpruleset.html#cfn-wafv2-webacl-awsmanagedrulesatpruleset-requestinspection)
     */
    public fun requestInspection(): Any? = unwrap(this).getRequestInspection()

    /**
     * The criteria for inspecting responses to login requests, used by the ATP rule group to track
     * login failure rates.
     *
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     *
     *
     * The ATP rule group evaluates the responses that your protected resources send back to client
     * login attempts, keeping count of successful and failed attempts for each IP address and client
     * session. Using this information, the rule group labels and mitigates requests from client
     * sessions and IP addresses that have had too many failed login attempts in a short amount of
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesatpruleset.html#cfn-wafv2-webacl-awsmanagedrulesatpruleset-responseinspection)
     */
    public fun responseInspection(): Any? = unwrap(this).getResponseInspection()

    /**
     * A builder for [AWSManagedRulesATPRuleSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableRegexInPath Allow the use of regular expressions in the login page path.
       */
      public fun enableRegexInPath(enableRegexInPath: Boolean)

      /**
       * @param enableRegexInPath Allow the use of regular expressions in the login page path.
       */
      public fun enableRegexInPath(enableRegexInPath: IResolvable)

      /**
       * @param loginPath The path of the login endpoint for your application. 
       * For example, for the URL `https://example.com/web/login` , you would provide the path
       * `/web/login` . Login paths that start with the path that you provide are considered a match.
       * For example `/web/login` matches the login paths `/web/login` , `/web/login/` ,
       * `/web/loginPage` , and `/web/login/thisPage` , but doesn't match the login path
       * `/home/web/login` or `/website/login` .
       *
       * The rule group inspects only HTTP `POST` requests to your specified login endpoint.
       */
      public fun loginPath(loginPath: String)

      /**
       * @param requestInspection The criteria for inspecting login requests, used by the ATP rule
       * group to validate credentials usage.
       */
      public fun requestInspection(requestInspection: IResolvable)

      /**
       * @param requestInspection The criteria for inspecting login requests, used by the ATP rule
       * group to validate credentials usage.
       */
      public fun requestInspection(requestInspection: RequestInspectionProperty)

      /**
       * @param requestInspection The criteria for inspecting login requests, used by the ATP rule
       * group to validate credentials usage.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7cf64a55e4d81d0ec58c88fdf6cb5695c1aa7531a97398cccd7d50cc2fc5b88")
      public fun requestInspection(requestInspection: RequestInspectionProperty.Builder.() -> Unit)

      /**
       * @param responseInspection The criteria for inspecting responses to login requests, used by
       * the ATP rule group to track login failure rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ATP rule group evaluates the responses that your protected resources send back to
       * client login attempts, keeping count of successful and failed attempts for each IP address and
       * client session. Using this information, the rule group labels and mitigates requests from
       * client sessions and IP addresses that have had too many failed login attempts in a short
       * amount of time.
       */
      public fun responseInspection(responseInspection: IResolvable)

      /**
       * @param responseInspection The criteria for inspecting responses to login requests, used by
       * the ATP rule group to track login failure rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ATP rule group evaluates the responses that your protected resources send back to
       * client login attempts, keeping count of successful and failed attempts for each IP address and
       * client session. Using this information, the rule group labels and mitigates requests from
       * client sessions and IP addresses that have had too many failed login attempts in a short
       * amount of time.
       */
      public fun responseInspection(responseInspection: ResponseInspectionProperty)

      /**
       * @param responseInspection The criteria for inspecting responses to login requests, used by
       * the ATP rule group to track login failure rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ATP rule group evaluates the responses that your protected resources send back to
       * client login attempts, keeping count of successful and failed attempts for each IP address and
       * client session. Using this information, the rule group labels and mitigates requests from
       * client sessions and IP addresses that have had too many failed login attempts in a short
       * amount of time.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9b5d3a870db7b1e4f991c989e5379d4fc97f35046844f444e17affecaa5f1df")
      public
          fun responseInspection(responseInspection: ResponseInspectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty.builder()

      /**
       * @param enableRegexInPath Allow the use of regular expressions in the login page path.
       */
      override fun enableRegexInPath(enableRegexInPath: Boolean) {
        cdkBuilder.enableRegexInPath(enableRegexInPath)
      }

      /**
       * @param enableRegexInPath Allow the use of regular expressions in the login page path.
       */
      override fun enableRegexInPath(enableRegexInPath: IResolvable) {
        cdkBuilder.enableRegexInPath(enableRegexInPath.let(IResolvable::unwrap))
      }

      /**
       * @param loginPath The path of the login endpoint for your application. 
       * For example, for the URL `https://example.com/web/login` , you would provide the path
       * `/web/login` . Login paths that start with the path that you provide are considered a match.
       * For example `/web/login` matches the login paths `/web/login` , `/web/login/` ,
       * `/web/loginPage` , and `/web/login/thisPage` , but doesn't match the login path
       * `/home/web/login` or `/website/login` .
       *
       * The rule group inspects only HTTP `POST` requests to your specified login endpoint.
       */
      override fun loginPath(loginPath: String) {
        cdkBuilder.loginPath(loginPath)
      }

      /**
       * @param requestInspection The criteria for inspecting login requests, used by the ATP rule
       * group to validate credentials usage.
       */
      override fun requestInspection(requestInspection: IResolvable) {
        cdkBuilder.requestInspection(requestInspection.let(IResolvable::unwrap))
      }

      /**
       * @param requestInspection The criteria for inspecting login requests, used by the ATP rule
       * group to validate credentials usage.
       */
      override fun requestInspection(requestInspection: RequestInspectionProperty) {
        cdkBuilder.requestInspection(requestInspection.let(RequestInspectionProperty::unwrap))
      }

      /**
       * @param requestInspection The criteria for inspecting login requests, used by the ATP rule
       * group to validate credentials usage.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7cf64a55e4d81d0ec58c88fdf6cb5695c1aa7531a97398cccd7d50cc2fc5b88")
      override
          fun requestInspection(requestInspection: RequestInspectionProperty.Builder.() -> Unit):
          Unit = requestInspection(RequestInspectionProperty(requestInspection))

      /**
       * @param responseInspection The criteria for inspecting responses to login requests, used by
       * the ATP rule group to track login failure rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ATP rule group evaluates the responses that your protected resources send back to
       * client login attempts, keeping count of successful and failed attempts for each IP address and
       * client session. Using this information, the rule group labels and mitigates requests from
       * client sessions and IP addresses that have had too many failed login attempts in a short
       * amount of time.
       */
      override fun responseInspection(responseInspection: IResolvable) {
        cdkBuilder.responseInspection(responseInspection.let(IResolvable::unwrap))
      }

      /**
       * @param responseInspection The criteria for inspecting responses to login requests, used by
       * the ATP rule group to track login failure rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ATP rule group evaluates the responses that your protected resources send back to
       * client login attempts, keeping count of successful and failed attempts for each IP address and
       * client session. Using this information, the rule group labels and mitigates requests from
       * client sessions and IP addresses that have had too many failed login attempts in a short
       * amount of time.
       */
      override fun responseInspection(responseInspection: ResponseInspectionProperty) {
        cdkBuilder.responseInspection(responseInspection.let(ResponseInspectionProperty::unwrap))
      }

      /**
       * @param responseInspection The criteria for inspecting responses to login requests, used by
       * the ATP rule group to track login failure rates.
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ATP rule group evaluates the responses that your protected resources send back to
       * client login attempts, keeping count of successful and failed attempts for each IP address and
       * client session. Using this information, the rule group labels and mitigates requests from
       * client sessions and IP addresses that have had too many failed login attempts in a short
       * amount of time.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9b5d3a870db7b1e4f991c989e5379d4fc97f35046844f444e17affecaa5f1df")
      override
          fun responseInspection(responseInspection: ResponseInspectionProperty.Builder.() -> Unit):
          Unit = responseInspection(ResponseInspectionProperty(responseInspection))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty,
    ) : CdkObject(cdkObject), AWSManagedRulesATPRuleSetProperty {
      /**
       * Allow the use of regular expressions in the login page path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesatpruleset.html#cfn-wafv2-webacl-awsmanagedrulesatpruleset-enableregexinpath)
       */
      override fun enableRegexInPath(): Any? = unwrap(this).getEnableRegexInPath()

      /**
       * The path of the login endpoint for your application.
       *
       * For example, for the URL `https://example.com/web/login` , you would provide the path
       * `/web/login` . Login paths that start with the path that you provide are considered a match.
       * For example `/web/login` matches the login paths `/web/login` , `/web/login/` ,
       * `/web/loginPage` , and `/web/login/thisPage` , but doesn't match the login path
       * `/home/web/login` or `/website/login` .
       *
       * The rule group inspects only HTTP `POST` requests to your specified login endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesatpruleset.html#cfn-wafv2-webacl-awsmanagedrulesatpruleset-loginpath)
       */
      override fun loginPath(): String = unwrap(this).getLoginPath()

      /**
       * The criteria for inspecting login requests, used by the ATP rule group to validate
       * credentials usage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesatpruleset.html#cfn-wafv2-webacl-awsmanagedrulesatpruleset-requestinspection)
       */
      override fun requestInspection(): Any? = unwrap(this).getRequestInspection()

      /**
       * The criteria for inspecting responses to login requests, used by the ATP rule group to
       * track login failure rates.
       *
       *
       * Response inspection is available only in web ACLs that protect Amazon CloudFront
       * distributions.
       *
       *
       * The ATP rule group evaluates the responses that your protected resources send back to
       * client login attempts, keeping count of successful and failed attempts for each IP address and
       * client session. Using this information, the rule group labels and mitigates requests from
       * client sessions and IP addresses that have had too many failed login attempts in a short
       * amount of time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesatpruleset.html#cfn-wafv2-webacl-awsmanagedrulesatpruleset-responseinspection)
       */
      override fun responseInspection(): Any? = unwrap(this).getResponseInspection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AWSManagedRulesATPRuleSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty):
          AWSManagedRulesATPRuleSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSManagedRulesATPRuleSetProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesATPRuleSetProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-forwardedipconfiguration.html#cfn-wafv2-webacl-forwardedipconfiguration-fallbackbehavior)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-forwardedipconfiguration.html#cfn-wafv2-webacl-forwardedipconfiguration-headername)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty.builder()

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
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty,
    ) : CdkObject(cdkObject), ForwardedIPConfigurationProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-forwardedipconfiguration.html#cfn-wafv2-webacl-forwardedipconfiguration-fallbackbehavior)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-forwardedipconfiguration.html#cfn-wafv2-webacl-forwardedipconfiguration-headername)
       */
      override fun headerName(): String = unwrap(this).getHeaderName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardedIPConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty):
          ForwardedIPConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardedIPConfigurationProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty
    }
  }

  public interface SingleQueryArgumentProperty {
    /**
     * The name of the query argument to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-singlequeryargument.html#cfn-wafv2-webacl-singlequeryargument-name)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty.builder()

      /**
       * @param name The name of the query argument to inspect. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty,
    ) : CdkObject(cdkObject), SingleQueryArgumentProperty {
      /**
       * The name of the query argument to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-singlequeryargument.html#cfn-wafv2-webacl-singlequeryargument-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SingleQueryArgumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty):
          SingleQueryArgumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleQueryArgumentProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.SingleQueryArgumentProperty
    }
  }

  public interface CaptchaActionProperty {
    /**
     * Defines custom handling for the web request, used when the `CAPTCHA` inspection determines
     * that the request's token is valid and unexpired.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-captchaaction.html#cfn-wafv2-webacl-captchaaction-customrequesthandling)
     */
    public fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()

    /**
     * A builder for [CaptchaActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * `CAPTCHA` inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun customRequestHandling(customRequestHandling: IResolvable)

      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * `CAPTCHA` inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty)

      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * `CAPTCHA` inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95e34132cd2efff5159c47c12e75b275f1351c0ca8e99ded02e27cb0e88a1373")
      public
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty.builder()

      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * `CAPTCHA` inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(IResolvable::unwrap))
      }

      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * `CAPTCHA` inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling.let(CustomRequestHandlingProperty::unwrap))
      }

      /**
       * @param customRequestHandling Defines custom handling for the web request, used when the
       * `CAPTCHA` inspection determines that the request's token is valid and unexpired.
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95e34132cd2efff5159c47c12e75b275f1351c0ca8e99ded02e27cb0e88a1373")
      override
          fun customRequestHandling(customRequestHandling: CustomRequestHandlingProperty.Builder.() -> Unit):
          Unit = customRequestHandling(CustomRequestHandlingProperty(customRequestHandling))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty,
    ) : CdkObject(cdkObject), CaptchaActionProperty {
      /**
       * Defines custom handling for the web request, used when the `CAPTCHA` inspection determines
       * that the request's token is valid and unexpired.
       *
       * For information about customizing web requests and responses, see [Customizing web requests
       * and responses in AWS
       * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
       * in the *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-captchaaction.html#cfn-wafv2-webacl-captchaaction-customrequesthandling)
       */
      override fun customRequestHandling(): Any? = unwrap(this).getCustomRequestHandling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CaptchaActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty):
          CaptchaActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptchaActionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.CaptchaActionProperty
    }
  }

  public interface ResponseInspectionBodyContainsProperty {
    /**
     * Strings in the body of the response that indicate a failed login or account creation attempt.
     *
     * To be counted as a failure, the string can be anywhere in the body and must be an exact
     * match, including case. Each string must be unique among the success and failure strings.
     *
     * JSON example: `"FailureStrings": [ "Request failed" ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionbodycontains.html#cfn-wafv2-webacl-responseinspectionbodycontains-failurestrings)
     */
    public fun failureStrings(): List<String>

    /**
     * Strings in the body of the response that indicate a successful login or account creation
     * attempt.
     *
     * To be counted as a success, the string can be anywhere in the body and must be an exact
     * match, including case. Each string must be unique among the success and failure strings.
     *
     * JSON examples: `"SuccessStrings": [ "Login successful" ]` and `"SuccessStrings": [ "Account
     * creation successful", "Welcome to our site!" ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionbodycontains.html#cfn-wafv2-webacl-responseinspectionbodycontains-successstrings)
     */
    public fun successStrings(): List<String>

    /**
     * A builder for [ResponseInspectionBodyContainsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureStrings Strings in the body of the response that indicate a failed login or
       * account creation attempt. 
       * To be counted as a failure, the string can be anywhere in the body and must be an exact
       * match, including case. Each string must be unique among the success and failure strings.
       *
       * JSON example: `"FailureStrings": [ "Request failed" ]`
       */
      public fun failureStrings(failureStrings: List<String>)

      /**
       * @param failureStrings Strings in the body of the response that indicate a failed login or
       * account creation attempt. 
       * To be counted as a failure, the string can be anywhere in the body and must be an exact
       * match, including case. Each string must be unique among the success and failure strings.
       *
       * JSON example: `"FailureStrings": [ "Request failed" ]`
       */
      public fun failureStrings(vararg failureStrings: String)

      /**
       * @param successStrings Strings in the body of the response that indicate a successful login
       * or account creation attempt. 
       * To be counted as a success, the string can be anywhere in the body and must be an exact
       * match, including case. Each string must be unique among the success and failure strings.
       *
       * JSON examples: `"SuccessStrings": [ "Login successful" ]` and `"SuccessStrings": [ "Account
       * creation successful", "Welcome to our site!" ]`
       */
      public fun successStrings(successStrings: List<String>)

      /**
       * @param successStrings Strings in the body of the response that indicate a successful login
       * or account creation attempt. 
       * To be counted as a success, the string can be anywhere in the body and must be an exact
       * match, including case. Each string must be unique among the success and failure strings.
       *
       * JSON examples: `"SuccessStrings": [ "Login successful" ]` and `"SuccessStrings": [ "Account
       * creation successful", "Welcome to our site!" ]`
       */
      public fun successStrings(vararg successStrings: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty.builder()

      /**
       * @param failureStrings Strings in the body of the response that indicate a failed login or
       * account creation attempt. 
       * To be counted as a failure, the string can be anywhere in the body and must be an exact
       * match, including case. Each string must be unique among the success and failure strings.
       *
       * JSON example: `"FailureStrings": [ "Request failed" ]`
       */
      override fun failureStrings(failureStrings: List<String>) {
        cdkBuilder.failureStrings(failureStrings)
      }

      /**
       * @param failureStrings Strings in the body of the response that indicate a failed login or
       * account creation attempt. 
       * To be counted as a failure, the string can be anywhere in the body and must be an exact
       * match, including case. Each string must be unique among the success and failure strings.
       *
       * JSON example: `"FailureStrings": [ "Request failed" ]`
       */
      override fun failureStrings(vararg failureStrings: String): Unit =
          failureStrings(failureStrings.toList())

      /**
       * @param successStrings Strings in the body of the response that indicate a successful login
       * or account creation attempt. 
       * To be counted as a success, the string can be anywhere in the body and must be an exact
       * match, including case. Each string must be unique among the success and failure strings.
       *
       * JSON examples: `"SuccessStrings": [ "Login successful" ]` and `"SuccessStrings": [ "Account
       * creation successful", "Welcome to our site!" ]`
       */
      override fun successStrings(successStrings: List<String>) {
        cdkBuilder.successStrings(successStrings)
      }

      /**
       * @param successStrings Strings in the body of the response that indicate a successful login
       * or account creation attempt. 
       * To be counted as a success, the string can be anywhere in the body and must be an exact
       * match, including case. Each string must be unique among the success and failure strings.
       *
       * JSON examples: `"SuccessStrings": [ "Login successful" ]` and `"SuccessStrings": [ "Account
       * creation successful", "Welcome to our site!" ]`
       */
      override fun successStrings(vararg successStrings: String): Unit =
          successStrings(successStrings.toList())

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty,
    ) : CdkObject(cdkObject), ResponseInspectionBodyContainsProperty {
      /**
       * Strings in the body of the response that indicate a failed login or account creation
       * attempt.
       *
       * To be counted as a failure, the string can be anywhere in the body and must be an exact
       * match, including case. Each string must be unique among the success and failure strings.
       *
       * JSON example: `"FailureStrings": [ "Request failed" ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionbodycontains.html#cfn-wafv2-webacl-responseinspectionbodycontains-failurestrings)
       */
      override fun failureStrings(): List<String> = unwrap(this).getFailureStrings()

      /**
       * Strings in the body of the response that indicate a successful login or account creation
       * attempt.
       *
       * To be counted as a success, the string can be anywhere in the body and must be an exact
       * match, including case. Each string must be unique among the success and failure strings.
       *
       * JSON examples: `"SuccessStrings": [ "Login successful" ]` and `"SuccessStrings": [ "Account
       * creation successful", "Welcome to our site!" ]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionbodycontains.html#cfn-wafv2-webacl-responseinspectionbodycontains-successstrings)
       */
      override fun successStrings(): List<String> = unwrap(this).getSuccessStrings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResponseInspectionBodyContainsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty):
          ResponseInspectionBodyContainsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseInspectionBodyContainsProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionBodyContainsProperty
    }
  }

  public interface RequestBodyAssociatedResourceTypeConfigProperty {
    /**
     * Specifies the maximum size of the web request body component that an associated CloudFront
     * distribution should send to AWS WAF for inspection.
     *
     * This applies to statements in the web ACL that inspect the body or JSON body.
     *
     * Default: `16 KB (16,384 bytes)`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestbodyassociatedresourcetypeconfig.html#cfn-wafv2-webacl-requestbodyassociatedresourcetypeconfig-defaultsizeinspectionlimit)
     */
    public fun defaultSizeInspectionLimit(): String

    /**
     * A builder for [RequestBodyAssociatedResourceTypeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultSizeInspectionLimit Specifies the maximum size of the web request body
       * component that an associated CloudFront distribution should send to AWS WAF for inspection. 
       * This applies to statements in the web ACL that inspect the body or JSON body.
       *
       * Default: `16 KB (16,384 bytes)`
       */
      public fun defaultSizeInspectionLimit(defaultSizeInspectionLimit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty.builder()

      /**
       * @param defaultSizeInspectionLimit Specifies the maximum size of the web request body
       * component that an associated CloudFront distribution should send to AWS WAF for inspection. 
       * This applies to statements in the web ACL that inspect the body or JSON body.
       *
       * Default: `16 KB (16,384 bytes)`
       */
      override fun defaultSizeInspectionLimit(defaultSizeInspectionLimit: String) {
        cdkBuilder.defaultSizeInspectionLimit(defaultSizeInspectionLimit)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty,
    ) : CdkObject(cdkObject), RequestBodyAssociatedResourceTypeConfigProperty {
      /**
       * Specifies the maximum size of the web request body component that an associated CloudFront
       * distribution should send to AWS WAF for inspection.
       *
       * This applies to statements in the web ACL that inspect the body or JSON body.
       *
       * Default: `16 KB (16,384 bytes)`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestbodyassociatedresourcetypeconfig.html#cfn-wafv2-webacl-requestbodyassociatedresourcetypeconfig-defaultsizeinspectionlimit)
       */
      override fun defaultSizeInspectionLimit(): String =
          unwrap(this).getDefaultSizeInspectionLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RequestBodyAssociatedResourceTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty):
          RequestBodyAssociatedResourceTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestBodyAssociatedResourceTypeConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-body.html#cfn-wafv2-webacl-body-oversizehandling)
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
      private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty,
    ) : CdkObject(cdkObject), BodyProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-body.html#cfn-wafv2-webacl-body-oversizehandling)
       */
      override fun oversizeHandling(): String? = unwrap(this).getOversizeHandling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty):
          BodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BodyProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnWebACL.BodyProperty
    }
  }

  public interface LabelProperty {
    /**
     * The label string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-label.html#cfn-wafv2-webacl-label-name)
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
      private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty.Builder
          = software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty.builder()

      /**
       * @param name The label string. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty,
    ) : CdkObject(cdkObject), LabelProperty {
      /**
       * The label string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-label.html#cfn-wafv2-webacl-label-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LabelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty):
          LabelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-texttransformation.html#cfn-wafv2-webacl-texttransformation-priority)
     */
    public fun priority(): Number

    /**
     * For detailed descriptions of each of the transformation types, see [Text
     * transformations](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html)
     * in the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-texttransformation.html#cfn-wafv2-webacl-texttransformation-type)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty,
    ) : CdkObject(cdkObject), TextTransformationProperty {
      /**
       * Sets the relative processing order for multiple transformations.
       *
       * AWS WAF processes all transformations, from lowest priority to highest, before inspecting
       * the transformed content. The priorities don't need to be consecutive, but they must all be
       * different.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-texttransformation.html#cfn-wafv2-webacl-texttransformation-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * For detailed descriptions of each of the transformation types, see [Text
       * transformations](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html)
       * in the *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-texttransformation.html#cfn-wafv2-webacl-texttransformation-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TextTransformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty):
          TextTransformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextTransformationProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty
    }
  }

  public interface RequestInspectionProperty {
    /**
     * The name of the field in the request payload that contains your customer's password.
     *
     * How you specify this depends on the request inspection payload type.
     *
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     * JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript
     * Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     * .
     *
     * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the password
     * field specification is `/form/password` .
     *
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `password1` , the password field
     * specification is `password1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspection.html#cfn-wafv2-webacl-requestinspection-passwordfield)
     */
    public fun passwordField(): Any

    /**
     * The payload type for your login endpoint, either JSON or form encoded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspection.html#cfn-wafv2-webacl-requestinspection-payloadtype)
     */
    public fun payloadType(): String

    /**
     * The name of the field in the request payload that contains your customer's username.
     *
     * How you specify this depends on the request inspection payload type.
     *
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     * JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript
     * Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     * .
     *
     * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the username
     * field specification is `/form/username` .
     *
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `username1` , the username field
     * specification is `username1`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspection.html#cfn-wafv2-webacl-requestinspection-usernamefield)
     */
    public fun usernameField(): Any

    /**
     * A builder for [RequestInspectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      public fun passwordField(passwordField: IResolvable)

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      public fun passwordField(passwordField: FieldIdentifierProperty)

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b9fc9931d8c4fc948f2862088c1cbb056f4bf314c1ac2a175cac23798ed950f")
      public fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit)

      /**
       * @param payloadType The payload type for your login endpoint, either JSON or form encoded. 
       */
      public fun payloadType(payloadType: String)

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      public fun usernameField(usernameField: IResolvable)

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      public fun usernameField(usernameField: FieldIdentifierProperty)

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c46dcf8fbc478ce0055752422c4f9cfa360a5ae4ac3d58260f653385c55e54ec")
      public fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty.builder()

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      override fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField.let(IResolvable::unwrap))
      }

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      override fun passwordField(passwordField: FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param passwordField The name of the field in the request payload that contains your
       * customer's password. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b9fc9931d8c4fc948f2862088c1cbb056f4bf314c1ac2a175cac23798ed950f")
      override fun passwordField(passwordField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          passwordField(FieldIdentifierProperty(passwordField))

      /**
       * @param payloadType The payload type for your login endpoint, either JSON or form encoded. 
       */
      override fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
      }

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      override fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField.let(IResolvable::unwrap))
      }

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      override fun usernameField(usernameField: FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param usernameField The name of the field in the request payload that contains your
       * customer's username. 
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c46dcf8fbc478ce0055752422c4f9cfa360a5ae4ac3d58260f653385c55e54ec")
      override fun usernameField(usernameField: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          usernameField(FieldIdentifierProperty(usernameField))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty,
    ) : CdkObject(cdkObject), RequestInspectionProperty {
      /**
       * The name of the field in the request payload that contains your customer's password.
       *
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the
       * password field specification is `/form/password` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `password1` , the password field
       * specification is `password1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspection.html#cfn-wafv2-webacl-requestinspection-passwordfield)
       */
      override fun passwordField(): Any = unwrap(this).getPasswordField()

      /**
       * The payload type for your login endpoint, either JSON or form encoded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspection.html#cfn-wafv2-webacl-requestinspection-payloadtype)
       */
      override fun payloadType(): String = unwrap(this).getPayloadType()

      /**
       * The name of the field in the request payload that contains your customer's username.
       *
       * How you specify this depends on the request inspection payload type.
       *
       * * For JSON payloads, specify the field name in JSON pointer syntax. For information about
       * the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
       * [JavaScript Object Notation (JSON)
       * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the
       * username field specification is `/form/username` .
       *
       * * For form encoded payload types, use the HTML form names.
       *
       * For example, for an HTML form with the input element named `username1` , the username field
       * specification is `username1`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspection.html#cfn-wafv2-webacl-requestinspection-usernamefield)
       */
      override fun usernameField(): Any = unwrap(this).getUsernameField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RequestInspectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty):
          RequestInspectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestInspectionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RequestInspectionProperty
    }
  }

  public interface SqliMatchStatementProperty {
    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html#cfn-wafv2-webacl-sqlimatchstatement-fieldtomatch)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html#cfn-wafv2-webacl-sqlimatchstatement-sensitivitylevel)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html#cfn-wafv2-webacl-sqlimatchstatement-texttransformations)
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
      @JvmName("a10f4f90638a94ecb1c8c62292f2515272b2a81c9853acdbba59d8cf73d91c90")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty.builder()

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
      @JvmName("a10f4f90638a94ecb1c8c62292f2515272b2a81c9853acdbba59d8cf73d91c90")
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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty,
    ) : CdkObject(cdkObject), SqliMatchStatementProperty {
      /**
       * The part of the web request that you want AWS WAF to inspect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html#cfn-wafv2-webacl-sqlimatchstatement-fieldtomatch)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html#cfn-wafv2-webacl-sqlimatchstatement-sensitivitylevel)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html#cfn-wafv2-webacl-sqlimatchstatement-texttransformations)
       */
      override fun textTransformations(): Any = unwrap(this).getTextTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqliMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty):
          SqliMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqliMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headers.html#cfn-wafv2-webacl-headers-matchpattern)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headers.html#cfn-wafv2-webacl-headers-matchscope)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headers.html#cfn-wafv2-webacl-headers-oversizehandling)
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
      @JvmName("bf2b044cdeed22513d28df661f829325f858f591fd59d7eabfeffb626c200b32")
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty.builder()

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
      @JvmName("bf2b044cdeed22513d28df661f829325f858f591fd59d7eabfeffb626c200b32")
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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty,
    ) : CdkObject(cdkObject), HeadersProperty {
      /**
       * The filter to use to identify the subset of headers to inspect in a web request.
       *
       * You must specify exactly one setting: either `All` , `IncludedHeaders` , or
       * `ExcludedHeaders` .
       *
       * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headers.html#cfn-wafv2-webacl-headers-matchpattern)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headers.html#cfn-wafv2-webacl-headers-matchscope)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headers.html#cfn-wafv2-webacl-headers-oversizehandling)
       */
      override fun oversizeHandling(): String = unwrap(this).getOversizeHandling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty):
          HeadersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeadersProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnWebACL.HeadersProperty
    }
  }

  public interface StatementProperty {
    /**
     * A logical rule statement used to combine other rule statements with AND logic.
     *
     * You provide more than one `Statement` within the `AndStatement` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-andstatement)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-bytematchstatement)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-geomatchstatement)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-ipsetreferencestatement)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-labelmatchstatement)
     */
    public fun labelMatchStatement(): Any? = unwrap(this).getLabelMatchStatement()

    /**
     * A rule statement used to run the rules that are defined in a managed rule group.
     *
     * To use this, provide the vendor name and the name of the rule group in this statement. You
     * can retrieve the required names through the API call `ListAvailableManagedRuleGroups` .
     *
     * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
     * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
     *
     *
     * You are charged additional fees when you use the AWS WAF Bot Control managed rule group
     * `AWSManagedRulesBotControlRuleSet` , the AWS WAF Fraud Control account takeover prevention (ATP)
     * managed rule group `AWSManagedRulesATPRuleSet` , or the AWS WAF Fraud Control account creation
     * fraud prevention (ACFP) managed rule group `AWSManagedRulesACFPRuleSet` . For more information,
     * see [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-managedrulegroupstatement)
     */
    public fun managedRuleGroupStatement(): Any? = unwrap(this).getManagedRuleGroupStatement()

    /**
     * A logical rule statement used to negate the results of another rule statement.
     *
     * You provide one `Statement` within the `NotStatement` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-notstatement)
     */
    public fun notStatement(): Any? = unwrap(this).getNotStatement()

    /**
     * A logical rule statement used to combine other rule statements with OR logic.
     *
     * You provide more than one `Statement` within the `OrStatement` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-orstatement)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-ratebasedstatement)
     */
    public fun rateBasedStatement(): Any? = unwrap(this).getRateBasedStatement()

    /**
     * A rule statement used to search web request components for a match against a single regular
     * expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-regexmatchstatement)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-regexpatternsetreferencestatement)
     */
    public fun regexPatternSetReferenceStatement(): Any? =
        unwrap(this).getRegexPatternSetReferenceStatement()

    /**
     * A rule statement used to run the rules that are defined in a `RuleGroup` .
     *
     * To use this, create a rule group with your rules, then provide the ARN of the rule group in
     * this statement.
     *
     * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a `NotStatement`
     * or `OrStatement` . You cannot use a rule group reference statement inside another rule group.
     * You can only reference a rule group as a top-level statement within a rule that you define in a
     * web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-rulegroupreferencestatement)
     */
    public fun ruleGroupReferenceStatement(): Any? = unwrap(this).getRuleGroupReferenceStatement()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-sizeconstraintstatement)
     */
    public fun sizeConstraintStatement(): Any? = unwrap(this).getSizeConstraintStatement()

    /**
     * A rule statement that inspects for malicious SQL code.
     *
     * Attackers insert malicious SQL code into web requests to do things like modify your database
     * or extract data from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-sqlimatchstatement)
     */
    public fun sqliMatchStatement(): Any? = unwrap(this).getSqliMatchStatement()

    /**
     * A rule statement that inspects for cross-site scripting (XSS) attacks.
     *
     * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to inject
     * malicious client-site scripts into other legitimate web browsers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-xssmatchstatement)
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
      @JvmName("0faf91fb3e60ba2aaa4f4a1d4b756e124092f1de837c505a2571fb537fbb55dd")
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
      @JvmName("52725cb354f7e3372c32f5ea06bfbdd4b5f35f4c3f962de6148afc2ac73af50d")
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
      @JvmName("c27167e826cc53423d71271832dece9341e7d08dbcbc57d7f043237ba6026203")
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
      @JvmName("f7f25f805e1ec5eab5cc489c5de0e4d3a39195c9075d39742ba7fd3c366afaf5")
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
      @JvmName("cf323e95729aaaa3aa6707741d5085879fffa7192efd6e83a20bb68036b4efb1")
      public
          fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty.Builder.() -> Unit)

      /**
       * @param managedRuleGroupStatement A rule statement used to run the rules that are defined in
       * a managed rule group.
       * To use this, provide the vendor name and the name of the rule group in this statement. You
       * can retrieve the required names through the API call `ListAvailableManagedRuleGroups` .
       *
       * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
       * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
       *
       *
       * You are charged additional fees when you use the AWS WAF Bot Control managed rule group
       * `AWSManagedRulesBotControlRuleSet` , the AWS WAF Fraud Control account takeover prevention
       * (ATP) managed rule group `AWSManagedRulesATPRuleSet` , or the AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) managed rule group `AWSManagedRulesACFPRuleSet` . For more
       * information, see [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       */
      public fun managedRuleGroupStatement(managedRuleGroupStatement: IResolvable)

      /**
       * @param managedRuleGroupStatement A rule statement used to run the rules that are defined in
       * a managed rule group.
       * To use this, provide the vendor name and the name of the rule group in this statement. You
       * can retrieve the required names through the API call `ListAvailableManagedRuleGroups` .
       *
       * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
       * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
       *
       *
       * You are charged additional fees when you use the AWS WAF Bot Control managed rule group
       * `AWSManagedRulesBotControlRuleSet` , the AWS WAF Fraud Control account takeover prevention
       * (ATP) managed rule group `AWSManagedRulesATPRuleSet` , or the AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) managed rule group `AWSManagedRulesACFPRuleSet` . For more
       * information, see [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       */
      public
          fun managedRuleGroupStatement(managedRuleGroupStatement: ManagedRuleGroupStatementProperty)

      /**
       * @param managedRuleGroupStatement A rule statement used to run the rules that are defined in
       * a managed rule group.
       * To use this, provide the vendor name and the name of the rule group in this statement. You
       * can retrieve the required names through the API call `ListAvailableManagedRuleGroups` .
       *
       * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
       * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
       *
       *
       * You are charged additional fees when you use the AWS WAF Bot Control managed rule group
       * `AWSManagedRulesBotControlRuleSet` , the AWS WAF Fraud Control account takeover prevention
       * (ATP) managed rule group `AWSManagedRulesATPRuleSet` , or the AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) managed rule group `AWSManagedRulesACFPRuleSet` . For more
       * information, see [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a719c5448f0625ca8aab0db2d4425ca16fee5c369dbfc9fc0e69d3487a914a0")
      public
          fun managedRuleGroupStatement(managedRuleGroupStatement: ManagedRuleGroupStatementProperty.Builder.() -> Unit)

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
      @JvmName("82fa62752d3b1606eb2d90d3c718fdd0f63ad2d4361c2d300c90237c848fdf56")
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
      @JvmName("3105c7b766ce6e25c9a977288c9f1f8f65ba0816b709fbd9980affac6115f543")
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
      @JvmName("e40ad809c41b00cd5cda76a731c9890e14ee74d1af9bfa1a87304785963d93c6")
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
      @JvmName("00f98b13c8a141747b8f01bbaef239900f1ad89f42ab184cf3517c20f6b915cb")
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
      @JvmName("8a20b875a996965b24eee9d5c9cc63be10d7d576ac75c8dfa96b1ddd9899cdb6")
      public
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty.Builder.() -> Unit)

      /**
       * @param ruleGroupReferenceStatement A rule statement used to run the rules that are defined
       * in a `RuleGroup` .
       * To use this, create a rule group with your rules, then provide the ARN of the rule group in
       * this statement.
       *
       * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a
       * `NotStatement` or `OrStatement` . You cannot use a rule group reference statement inside
       * another rule group. You can only reference a rule group as a top-level statement within a rule
       * that you define in a web ACL.
       */
      public fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: IResolvable)

      /**
       * @param ruleGroupReferenceStatement A rule statement used to run the rules that are defined
       * in a `RuleGroup` .
       * To use this, create a rule group with your rules, then provide the ARN of the rule group in
       * this statement.
       *
       * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a
       * `NotStatement` or `OrStatement` . You cannot use a rule group reference statement inside
       * another rule group. You can only reference a rule group as a top-level statement within a rule
       * that you define in a web ACL.
       */
      public
          fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: RuleGroupReferenceStatementProperty)

      /**
       * @param ruleGroupReferenceStatement A rule statement used to run the rules that are defined
       * in a `RuleGroup` .
       * To use this, create a rule group with your rules, then provide the ARN of the rule group in
       * this statement.
       *
       * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a
       * `NotStatement` or `OrStatement` . You cannot use a rule group reference statement inside
       * another rule group. You can only reference a rule group as a top-level statement within a rule
       * that you define in a web ACL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9119e54122bf8090ccc83df44678012d3204684de5b80b11b17af611c7179f08")
      public
          fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: RuleGroupReferenceStatementProperty.Builder.() -> Unit)

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
      @JvmName("7e056dadbd994de72fd91374004889c8524a681d41c1fb4982bc6a82b7615f51")
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
      @JvmName("5871b1ff410cd7657df759ecff15b8f8bb8be9361439eebbfc5f0a5669ac7243")
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
      @JvmName("f589bb416c23c2b2add334435b9775e8dfd3ff5f836689b40cfe4b9cee6ec060")
      public fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty.builder()

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
      @JvmName("0faf91fb3e60ba2aaa4f4a1d4b756e124092f1de837c505a2571fb537fbb55dd")
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
      @JvmName("52725cb354f7e3372c32f5ea06bfbdd4b5f35f4c3f962de6148afc2ac73af50d")
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
      @JvmName("c27167e826cc53423d71271832dece9341e7d08dbcbc57d7f043237ba6026203")
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
      @JvmName("f7f25f805e1ec5eab5cc489c5de0e4d3a39195c9075d39742ba7fd3c366afaf5")
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
      @JvmName("cf323e95729aaaa3aa6707741d5085879fffa7192efd6e83a20bb68036b4efb1")
      override
          fun labelMatchStatement(labelMatchStatement: LabelMatchStatementProperty.Builder.() -> Unit):
          Unit = labelMatchStatement(LabelMatchStatementProperty(labelMatchStatement))

      /**
       * @param managedRuleGroupStatement A rule statement used to run the rules that are defined in
       * a managed rule group.
       * To use this, provide the vendor name and the name of the rule group in this statement. You
       * can retrieve the required names through the API call `ListAvailableManagedRuleGroups` .
       *
       * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
       * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
       *
       *
       * You are charged additional fees when you use the AWS WAF Bot Control managed rule group
       * `AWSManagedRulesBotControlRuleSet` , the AWS WAF Fraud Control account takeover prevention
       * (ATP) managed rule group `AWSManagedRulesATPRuleSet` , or the AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) managed rule group `AWSManagedRulesACFPRuleSet` . For more
       * information, see [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       */
      override fun managedRuleGroupStatement(managedRuleGroupStatement: IResolvable) {
        cdkBuilder.managedRuleGroupStatement(managedRuleGroupStatement.let(IResolvable::unwrap))
      }

      /**
       * @param managedRuleGroupStatement A rule statement used to run the rules that are defined in
       * a managed rule group.
       * To use this, provide the vendor name and the name of the rule group in this statement. You
       * can retrieve the required names through the API call `ListAvailableManagedRuleGroups` .
       *
       * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
       * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
       *
       *
       * You are charged additional fees when you use the AWS WAF Bot Control managed rule group
       * `AWSManagedRulesBotControlRuleSet` , the AWS WAF Fraud Control account takeover prevention
       * (ATP) managed rule group `AWSManagedRulesATPRuleSet` , or the AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) managed rule group `AWSManagedRulesACFPRuleSet` . For more
       * information, see [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       */
      override
          fun managedRuleGroupStatement(managedRuleGroupStatement: ManagedRuleGroupStatementProperty) {
        cdkBuilder.managedRuleGroupStatement(managedRuleGroupStatement.let(ManagedRuleGroupStatementProperty::unwrap))
      }

      /**
       * @param managedRuleGroupStatement A rule statement used to run the rules that are defined in
       * a managed rule group.
       * To use this, provide the vendor name and the name of the rule group in this statement. You
       * can retrieve the required names through the API call `ListAvailableManagedRuleGroups` .
       *
       * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
       * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
       *
       *
       * You are charged additional fees when you use the AWS WAF Bot Control managed rule group
       * `AWSManagedRulesBotControlRuleSet` , the AWS WAF Fraud Control account takeover prevention
       * (ATP) managed rule group `AWSManagedRulesATPRuleSet` , or the AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) managed rule group `AWSManagedRulesACFPRuleSet` . For more
       * information, see [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a719c5448f0625ca8aab0db2d4425ca16fee5c369dbfc9fc0e69d3487a914a0")
      override
          fun managedRuleGroupStatement(managedRuleGroupStatement: ManagedRuleGroupStatementProperty.Builder.() -> Unit):
          Unit =
          managedRuleGroupStatement(ManagedRuleGroupStatementProperty(managedRuleGroupStatement))

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
      @JvmName("82fa62752d3b1606eb2d90d3c718fdd0f63ad2d4361c2d300c90237c848fdf56")
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
      @JvmName("3105c7b766ce6e25c9a977288c9f1f8f65ba0816b709fbd9980affac6115f543")
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
      @JvmName("e40ad809c41b00cd5cda76a731c9890e14ee74d1af9bfa1a87304785963d93c6")
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
      @JvmName("00f98b13c8a141747b8f01bbaef239900f1ad89f42ab184cf3517c20f6b915cb")
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
      @JvmName("8a20b875a996965b24eee9d5c9cc63be10d7d576ac75c8dfa96b1ddd9899cdb6")
      override
          fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: RegexPatternSetReferenceStatementProperty.Builder.() -> Unit):
          Unit =
          regexPatternSetReferenceStatement(RegexPatternSetReferenceStatementProperty(regexPatternSetReferenceStatement))

      /**
       * @param ruleGroupReferenceStatement A rule statement used to run the rules that are defined
       * in a `RuleGroup` .
       * To use this, create a rule group with your rules, then provide the ARN of the rule group in
       * this statement.
       *
       * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a
       * `NotStatement` or `OrStatement` . You cannot use a rule group reference statement inside
       * another rule group. You can only reference a rule group as a top-level statement within a rule
       * that you define in a web ACL.
       */
      override fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: IResolvable) {
        cdkBuilder.ruleGroupReferenceStatement(ruleGroupReferenceStatement.let(IResolvable::unwrap))
      }

      /**
       * @param ruleGroupReferenceStatement A rule statement used to run the rules that are defined
       * in a `RuleGroup` .
       * To use this, create a rule group with your rules, then provide the ARN of the rule group in
       * this statement.
       *
       * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a
       * `NotStatement` or `OrStatement` . You cannot use a rule group reference statement inside
       * another rule group. You can only reference a rule group as a top-level statement within a rule
       * that you define in a web ACL.
       */
      override
          fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: RuleGroupReferenceStatementProperty) {
        cdkBuilder.ruleGroupReferenceStatement(ruleGroupReferenceStatement.let(RuleGroupReferenceStatementProperty::unwrap))
      }

      /**
       * @param ruleGroupReferenceStatement A rule statement used to run the rules that are defined
       * in a `RuleGroup` .
       * To use this, create a rule group with your rules, then provide the ARN of the rule group in
       * this statement.
       *
       * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a
       * `NotStatement` or `OrStatement` . You cannot use a rule group reference statement inside
       * another rule group. You can only reference a rule group as a top-level statement within a rule
       * that you define in a web ACL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9119e54122bf8090ccc83df44678012d3204684de5b80b11b17af611c7179f08")
      override
          fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: RuleGroupReferenceStatementProperty.Builder.() -> Unit):
          Unit =
          ruleGroupReferenceStatement(RuleGroupReferenceStatementProperty(ruleGroupReferenceStatement))

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
      @JvmName("7e056dadbd994de72fd91374004889c8524a681d41c1fb4982bc6a82b7615f51")
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
      @JvmName("5871b1ff410cd7657df759ecff15b8f8bb8be9361439eebbfc5f0a5669ac7243")
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
      @JvmName("f589bb416c23c2b2add334435b9775e8dfd3ff5f836689b40cfe4b9cee6ec060")
      override
          fun xssMatchStatement(xssMatchStatement: XssMatchStatementProperty.Builder.() -> Unit):
          Unit = xssMatchStatement(XssMatchStatementProperty(xssMatchStatement))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty,
    ) : CdkObject(cdkObject), StatementProperty {
      /**
       * A logical rule statement used to combine other rule statements with AND logic.
       *
       * You provide more than one `Statement` within the `AndStatement` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-andstatement)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-bytematchstatement)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-geomatchstatement)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-ipsetreferencestatement)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-labelmatchstatement)
       */
      override fun labelMatchStatement(): Any? = unwrap(this).getLabelMatchStatement()

      /**
       * A rule statement used to run the rules that are defined in a managed rule group.
       *
       * To use this, provide the vendor name and the name of the rule group in this statement. You
       * can retrieve the required names through the API call `ListAvailableManagedRuleGroups` .
       *
       * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
       * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
       *
       *
       * You are charged additional fees when you use the AWS WAF Bot Control managed rule group
       * `AWSManagedRulesBotControlRuleSet` , the AWS WAF Fraud Control account takeover prevention
       * (ATP) managed rule group `AWSManagedRulesATPRuleSet` , or the AWS WAF Fraud Control account
       * creation fraud prevention (ACFP) managed rule group `AWSManagedRulesACFPRuleSet` . For more
       * information, see [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-managedrulegroupstatement)
       */
      override fun managedRuleGroupStatement(): Any? = unwrap(this).getManagedRuleGroupStatement()

      /**
       * A logical rule statement used to negate the results of another rule statement.
       *
       * You provide one `Statement` within the `NotStatement` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-notstatement)
       */
      override fun notStatement(): Any? = unwrap(this).getNotStatement()

      /**
       * A logical rule statement used to combine other rule statements with OR logic.
       *
       * You provide more than one `Statement` within the `OrStatement` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-orstatement)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-ratebasedstatement)
       */
      override fun rateBasedStatement(): Any? = unwrap(this).getRateBasedStatement()

      /**
       * A rule statement used to search web request components for a match against a single regular
       * expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-regexmatchstatement)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-regexpatternsetreferencestatement)
       */
      override fun regexPatternSetReferenceStatement(): Any? =
          unwrap(this).getRegexPatternSetReferenceStatement()

      /**
       * A rule statement used to run the rules that are defined in a `RuleGroup` .
       *
       * To use this, create a rule group with your rules, then provide the ARN of the rule group in
       * this statement.
       *
       * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a
       * `NotStatement` or `OrStatement` . You cannot use a rule group reference statement inside
       * another rule group. You can only reference a rule group as a top-level statement within a rule
       * that you define in a web ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-rulegroupreferencestatement)
       */
      override fun ruleGroupReferenceStatement(): Any? =
          unwrap(this).getRuleGroupReferenceStatement()

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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-sizeconstraintstatement)
       */
      override fun sizeConstraintStatement(): Any? = unwrap(this).getSizeConstraintStatement()

      /**
       * A rule statement that inspects for malicious SQL code.
       *
       * Attackers insert malicious SQL code into web requests to do things like modify your
       * database or extract data from it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-sqlimatchstatement)
       */
      override fun sqliMatchStatement(): Any? = unwrap(this).getSqliMatchStatement()

      /**
       * A rule statement that inspects for cross-site scripting (XSS) attacks.
       *
       * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to
       * inject malicious client-site scripts into other legitimate web browsers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html#cfn-wafv2-webacl-statement-xssmatchstatement)
       */
      override fun xssMatchStatement(): Any? = unwrap(this).getXssMatchStatement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty):
          StatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-immunitytimeproperty.html#cfn-wafv2-webacl-immunitytimeproperty-immunitytime)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty.builder()

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
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty,
    ) : CdkObject(cdkObject), ImmunityTimePropertyProperty {
      /**
       * The amount of time, in seconds, that a `CAPTCHA` or challenge timestamp is considered valid
       * by AWS WAF .
       *
       * The default setting is 300.
       *
       * For the Challenge action, the minimum setting is 300.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-immunitytimeproperty.html#cfn-wafv2-webacl-immunitytimeproperty-immunitytime)
       */
      override fun immunityTime(): Number = unwrap(this).getImmunityTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImmunityTimePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty):
          ImmunityTimePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImmunityTimePropertyProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ImmunityTimePropertyProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-labelmatchstatement.html#cfn-wafv2-webacl-labelmatchstatement-key)
     */
    public fun key(): String

    /**
     * Specify whether you want to match using the label name or just the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-labelmatchstatement.html#cfn-wafv2-webacl-labelmatchstatement-scope)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty.builder()

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
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty,
    ) : CdkObject(cdkObject), LabelMatchStatementProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-labelmatchstatement.html#cfn-wafv2-webacl-labelmatchstatement-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * Specify whether you want to match using the label name or just the namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-labelmatchstatement.html#cfn-wafv2-webacl-labelmatchstatement-scope)
       */
      override fun scope(): String = unwrap(this).getScope()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LabelMatchStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty):
          LabelMatchStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelMatchStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty
    }
  }

  public interface AWSManagedRulesBotControlRuleSetProperty {
    /**
     * Applies only to the targeted inspection level.
     *
     * Determines whether to use machine learning (ML) to analyze your web traffic for bot-related
     * activity. Machine learning is required for the Bot Control rules `TGT_ML_CoordinatedActivityLow`
     * and `TGT_ML_CoordinatedActivityMedium` , which
     * inspect for anomalous behavior that might indicate distributed, coordinated bot activity.
     *
     * For more information about this choice, see the listing for these rules in the table at [Bot
     * Control rules
     * listing](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html#aws-managed-rule-groups-bot-rules)
     * in the *AWS WAF Developer Guide* .
     *
     * Default: `TRUE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesbotcontrolruleset.html#cfn-wafv2-webacl-awsmanagedrulesbotcontrolruleset-enablemachinelearning)
     */
    public fun enableMachineLearning(): Any? = unwrap(this).getEnableMachineLearning()

    /**
     * The inspection level to use for the Bot Control rule group.
     *
     * The common level is the least expensive. The targeted level includes all common level rules
     * and adds rules with more advanced inspection criteria. For details, see [AWS WAF Bot Control
     * rule
     * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
     * in the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesbotcontrolruleset.html#cfn-wafv2-webacl-awsmanagedrulesbotcontrolruleset-inspectionlevel)
     */
    public fun inspectionLevel(): String

    /**
     * A builder for [AWSManagedRulesBotControlRuleSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableMachineLearning Applies only to the targeted inspection level.
       * Determines whether to use machine learning (ML) to analyze your web traffic for bot-related
       * activity. Machine learning is required for the Bot Control rules
       * `TGT_ML_CoordinatedActivityLow` and `TGT_ML_CoordinatedActivityMedium` , which
       * inspect for anomalous behavior that might indicate distributed, coordinated bot activity.
       *
       * For more information about this choice, see the listing for these rules in the table at
       * [Bot Control rules
       * listing](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html#aws-managed-rule-groups-bot-rules)
       * in the *AWS WAF Developer Guide* .
       *
       * Default: `TRUE`
       */
      public fun enableMachineLearning(enableMachineLearning: Boolean)

      /**
       * @param enableMachineLearning Applies only to the targeted inspection level.
       * Determines whether to use machine learning (ML) to analyze your web traffic for bot-related
       * activity. Machine learning is required for the Bot Control rules
       * `TGT_ML_CoordinatedActivityLow` and `TGT_ML_CoordinatedActivityMedium` , which
       * inspect for anomalous behavior that might indicate distributed, coordinated bot activity.
       *
       * For more information about this choice, see the listing for these rules in the table at
       * [Bot Control rules
       * listing](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html#aws-managed-rule-groups-bot-rules)
       * in the *AWS WAF Developer Guide* .
       *
       * Default: `TRUE`
       */
      public fun enableMachineLearning(enableMachineLearning: IResolvable)

      /**
       * @param inspectionLevel The inspection level to use for the Bot Control rule group. 
       * The common level is the least expensive. The targeted level includes all common level rules
       * and adds rules with more advanced inspection criteria. For details, see [AWS WAF Bot Control
       * rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
       * in the *AWS WAF Developer Guide* .
       */
      public fun inspectionLevel(inspectionLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty.builder()

      /**
       * @param enableMachineLearning Applies only to the targeted inspection level.
       * Determines whether to use machine learning (ML) to analyze your web traffic for bot-related
       * activity. Machine learning is required for the Bot Control rules
       * `TGT_ML_CoordinatedActivityLow` and `TGT_ML_CoordinatedActivityMedium` , which
       * inspect for anomalous behavior that might indicate distributed, coordinated bot activity.
       *
       * For more information about this choice, see the listing for these rules in the table at
       * [Bot Control rules
       * listing](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html#aws-managed-rule-groups-bot-rules)
       * in the *AWS WAF Developer Guide* .
       *
       * Default: `TRUE`
       */
      override fun enableMachineLearning(enableMachineLearning: Boolean) {
        cdkBuilder.enableMachineLearning(enableMachineLearning)
      }

      /**
       * @param enableMachineLearning Applies only to the targeted inspection level.
       * Determines whether to use machine learning (ML) to analyze your web traffic for bot-related
       * activity. Machine learning is required for the Bot Control rules
       * `TGT_ML_CoordinatedActivityLow` and `TGT_ML_CoordinatedActivityMedium` , which
       * inspect for anomalous behavior that might indicate distributed, coordinated bot activity.
       *
       * For more information about this choice, see the listing for these rules in the table at
       * [Bot Control rules
       * listing](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html#aws-managed-rule-groups-bot-rules)
       * in the *AWS WAF Developer Guide* .
       *
       * Default: `TRUE`
       */
      override fun enableMachineLearning(enableMachineLearning: IResolvable) {
        cdkBuilder.enableMachineLearning(enableMachineLearning.let(IResolvable::unwrap))
      }

      /**
       * @param inspectionLevel The inspection level to use for the Bot Control rule group. 
       * The common level is the least expensive. The targeted level includes all common level rules
       * and adds rules with more advanced inspection criteria. For details, see [AWS WAF Bot Control
       * rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
       * in the *AWS WAF Developer Guide* .
       */
      override fun inspectionLevel(inspectionLevel: String) {
        cdkBuilder.inspectionLevel(inspectionLevel)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty,
    ) : CdkObject(cdkObject), AWSManagedRulesBotControlRuleSetProperty {
      /**
       * Applies only to the targeted inspection level.
       *
       * Determines whether to use machine learning (ML) to analyze your web traffic for bot-related
       * activity. Machine learning is required for the Bot Control rules
       * `TGT_ML_CoordinatedActivityLow` and `TGT_ML_CoordinatedActivityMedium` , which
       * inspect for anomalous behavior that might indicate distributed, coordinated bot activity.
       *
       * For more information about this choice, see the listing for these rules in the table at
       * [Bot Control rules
       * listing](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html#aws-managed-rule-groups-bot-rules)
       * in the *AWS WAF Developer Guide* .
       *
       * Default: `TRUE`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesbotcontrolruleset.html#cfn-wafv2-webacl-awsmanagedrulesbotcontrolruleset-enablemachinelearning)
       */
      override fun enableMachineLearning(): Any? = unwrap(this).getEnableMachineLearning()

      /**
       * The inspection level to use for the Bot Control rule group.
       *
       * The common level is the least expensive. The targeted level includes all common level rules
       * and adds rules with more advanced inspection criteria. For details, see [AWS WAF Bot Control
       * rule
       * group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
       * in the *AWS WAF Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesbotcontrolruleset.html#cfn-wafv2-webacl-awsmanagedrulesbotcontrolruleset-inspectionlevel)
       */
      override fun inspectionLevel(): String = unwrap(this).getInspectionLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AWSManagedRulesBotControlRuleSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty):
          AWSManagedRulesBotControlRuleSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSManagedRulesBotControlRuleSetProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.AWSManagedRulesBotControlRuleSetProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html#cfn-wafv2-webacl-ratebasedstatement-aggregatekeytype)
     */
    public fun aggregateKeyType(): String

    /**
     * Specifies the aggregate keys to use in a rate-base rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html#cfn-wafv2-webacl-ratebasedstatement-customkeys)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html#cfn-wafv2-webacl-ratebasedstatement-forwardedipconfig)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html#cfn-wafv2-webacl-ratebasedstatement-limit)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html#cfn-wafv2-webacl-ratebasedstatement-scopedownstatement)
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
      @JvmName("413c601ab4cfa0ccad1cfc36ae71188d16d4a2f0ee58cf283b613e7b1ce5849b")
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
      @JvmName("95214fa635e2431173880cad1ff682c6cc031d9911d64db20aa113bb7b1d53f8")
      public fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty.builder()

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
      @JvmName("413c601ab4cfa0ccad1cfc36ae71188d16d4a2f0ee58cf283b613e7b1ce5849b")
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
      @JvmName("95214fa635e2431173880cad1ff682c6cc031d9911d64db20aa113bb7b1d53f8")
      override fun scopeDownStatement(scopeDownStatement: StatementProperty.Builder.() -> Unit):
          Unit = scopeDownStatement(StatementProperty(scopeDownStatement))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty,
    ) : CdkObject(cdkObject), RateBasedStatementProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html#cfn-wafv2-webacl-ratebasedstatement-aggregatekeytype)
       */
      override fun aggregateKeyType(): String = unwrap(this).getAggregateKeyType()

      /**
       * Specifies the aggregate keys to use in a rate-base rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html#cfn-wafv2-webacl-ratebasedstatement-customkeys)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html#cfn-wafv2-webacl-ratebasedstatement-forwardedipconfig)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html#cfn-wafv2-webacl-ratebasedstatement-limit)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html#cfn-wafv2-webacl-ratebasedstatement-scopedownstatement)
       */
      override fun scopeDownStatement(): Any? = unwrap(this).getScopeDownStatement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RateBasedStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty):
          RateBasedStatementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateBasedStatementProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty
    }
  }

  public interface AssociationConfigProperty {
    /**
     * Customizes the maximum size of the request body that your protected CloudFront distributions
     * forward to AWS WAF for inspection.
     *
     * The default size is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-associationconfig.html#cfn-wafv2-webacl-associationconfig-requestbody)
     */
    public fun requestBody(): Any? = unwrap(this).getRequestBody()

    /**
     * A builder for [AssociationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param requestBody Customizes the maximum size of the request body that your protected
       * CloudFront distributions forward to AWS WAF for inspection.
       * The default size is 16 KB (16,384 bytes).
       *
       *
       * You are charged additional fees when your protected resources forward body sizes that are
       * larger than the default. For more information, see [AWS WAF
       * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       */
      public fun requestBody(requestBody: IResolvable)

      /**
       * @param requestBody Customizes the maximum size of the request body that your protected
       * CloudFront distributions forward to AWS WAF for inspection.
       * The default size is 16 KB (16,384 bytes).
       *
       *
       * You are charged additional fees when your protected resources forward body sizes that are
       * larger than the default. For more information, see [AWS WAF
       * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       */
      public fun requestBody(requestBody: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty.builder()

      /**
       * @param requestBody Customizes the maximum size of the request body that your protected
       * CloudFront distributions forward to AWS WAF for inspection.
       * The default size is 16 KB (16,384 bytes).
       *
       *
       * You are charged additional fees when your protected resources forward body sizes that are
       * larger than the default. For more information, see [AWS WAF
       * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       */
      override fun requestBody(requestBody: IResolvable) {
        cdkBuilder.requestBody(requestBody.let(IResolvable::unwrap))
      }

      /**
       * @param requestBody Customizes the maximum size of the request body that your protected
       * CloudFront distributions forward to AWS WAF for inspection.
       * The default size is 16 KB (16,384 bytes).
       *
       *
       * You are charged additional fees when your protected resources forward body sizes that are
       * larger than the default. For more information, see [AWS WAF
       * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       */
      override fun requestBody(requestBody: Map<String, Any>) {
        cdkBuilder.requestBody(requestBody)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty,
    ) : CdkObject(cdkObject), AssociationConfigProperty {
      /**
       * Customizes the maximum size of the request body that your protected CloudFront
       * distributions forward to AWS WAF for inspection.
       *
       * The default size is 16 KB (16,384 bytes).
       *
       *
       * You are charged additional fees when your protected resources forward body sizes that are
       * larger than the default. For more information, see [AWS WAF
       * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-associationconfig.html#cfn-wafv2-webacl-associationconfig-requestbody)
       */
      override fun requestBody(): Any? = unwrap(this).getRequestBody()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssociationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty):
          AssociationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssociationConfigProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.AssociationConfigProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponse.html#cfn-wafv2-webacl-customresponse-customresponsebodykey)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponse.html#cfn-wafv2-webacl-customresponse-responsecode)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponse.html#cfn-wafv2-webacl-customresponse-responseheaders)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty,
    ) : CdkObject(cdkObject), CustomResponseProperty {
      /**
       * References the response body that you want AWS WAF to return to the web request client.
       *
       * You can define a custom response for a rule action or a default web ACL action that is set
       * to block. To do this, you first define the response body key and value in the
       * `CustomResponseBodies` setting for the `WebACL` or `RuleGroup` where you want to use it. Then,
       * in the rule action or web ACL default action `BlockAction` setting, you reference the response
       * body using this key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponse.html#cfn-wafv2-webacl-customresponse-customresponsebodykey)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponse.html#cfn-wafv2-webacl-customresponse-responsecode)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponse.html#cfn-wafv2-webacl-customresponse-responseheaders)
       */
      override fun responseHeaders(): Any? = unwrap(this).getResponseHeaders()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty):
          CustomResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomResponseProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty
    }
  }

  public interface ResponseInspectionProperty {
    /**
     * Configures inspection of the response body for success and failure indicators.
     *
     * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspection.html#cfn-wafv2-webacl-responseinspection-bodycontains)
     */
    public fun bodyContains(): Any? = unwrap(this).getBodyContains()

    /**
     * Configures inspection of the response header for success and failure indicators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspection.html#cfn-wafv2-webacl-responseinspection-header)
     */
    public fun `header`(): Any? = unwrap(this).getHeader()

    /**
     * Configures inspection of the response JSON for success and failure indicators.
     *
     * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspection.html#cfn-wafv2-webacl-responseinspection-json)
     */
    public fun json(): Any? = unwrap(this).getJson()

    /**
     * Configures inspection of the response status code for success and failure indicators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspection.html#cfn-wafv2-webacl-responseinspection-statuscode)
     */
    public fun statusCode(): Any? = unwrap(this).getStatusCode()

    /**
     * A builder for [ResponseInspectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bodyContains Configures inspection of the response body for success and failure
       * indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
       */
      public fun bodyContains(bodyContains: IResolvable)

      /**
       * @param bodyContains Configures inspection of the response body for success and failure
       * indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
       */
      public fun bodyContains(bodyContains: ResponseInspectionBodyContainsProperty)

      /**
       * @param bodyContains Configures inspection of the response body for success and failure
       * indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("579a2402e1179cb3321d4ea74f0d0acf1709b24de91e5ad70dbef817edafd53d")
      public
          fun bodyContains(bodyContains: ResponseInspectionBodyContainsProperty.Builder.() -> Unit)

      /**
       * @param header Configures inspection of the response header for success and failure
       * indicators.
       */
      public fun `header`(`header`: IResolvable)

      /**
       * @param header Configures inspection of the response header for success and failure
       * indicators.
       */
      public fun `header`(`header`: ResponseInspectionHeaderProperty)

      /**
       * @param header Configures inspection of the response header for success and failure
       * indicators.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f6d5e61b21402129c02ef59326ecd89e4b14b1b0f198c7e10cab958fcbf8fd9")
      public fun `header`(`header`: ResponseInspectionHeaderProperty.Builder.() -> Unit)

      /**
       * @param json Configures inspection of the response JSON for success and failure indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
       */
      public fun json(json: IResolvable)

      /**
       * @param json Configures inspection of the response JSON for success and failure indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
       */
      public fun json(json: ResponseInspectionJsonProperty)

      /**
       * @param json Configures inspection of the response JSON for success and failure indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34451c83e85bf74f1f04b00f77762465d5133af1d26a3a260fe2f1d91171cfe4")
      public fun json(json: ResponseInspectionJsonProperty.Builder.() -> Unit)

      /**
       * @param statusCode Configures inspection of the response status code for success and failure
       * indicators.
       */
      public fun statusCode(statusCode: IResolvable)

      /**
       * @param statusCode Configures inspection of the response status code for success and failure
       * indicators.
       */
      public fun statusCode(statusCode: ResponseInspectionStatusCodeProperty)

      /**
       * @param statusCode Configures inspection of the response status code for success and failure
       * indicators.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8cb4f11f76c069ee5771ac3abcd7b620f2e486c50cb6202675d399a44413610")
      public fun statusCode(statusCode: ResponseInspectionStatusCodeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty.builder()

      /**
       * @param bodyContains Configures inspection of the response body for success and failure
       * indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
       */
      override fun bodyContains(bodyContains: IResolvable) {
        cdkBuilder.bodyContains(bodyContains.let(IResolvable::unwrap))
      }

      /**
       * @param bodyContains Configures inspection of the response body for success and failure
       * indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
       */
      override fun bodyContains(bodyContains: ResponseInspectionBodyContainsProperty) {
        cdkBuilder.bodyContains(bodyContains.let(ResponseInspectionBodyContainsProperty::unwrap))
      }

      /**
       * @param bodyContains Configures inspection of the response body for success and failure
       * indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("579a2402e1179cb3321d4ea74f0d0acf1709b24de91e5ad70dbef817edafd53d")
      override
          fun bodyContains(bodyContains: ResponseInspectionBodyContainsProperty.Builder.() -> Unit):
          Unit = bodyContains(ResponseInspectionBodyContainsProperty(bodyContains))

      /**
       * @param header Configures inspection of the response header for success and failure
       * indicators.
       */
      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      /**
       * @param header Configures inspection of the response header for success and failure
       * indicators.
       */
      override fun `header`(`header`: ResponseInspectionHeaderProperty) {
        cdkBuilder.`header`(`header`.let(ResponseInspectionHeaderProperty::unwrap))
      }

      /**
       * @param header Configures inspection of the response header for success and failure
       * indicators.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f6d5e61b21402129c02ef59326ecd89e4b14b1b0f198c7e10cab958fcbf8fd9")
      override fun `header`(`header`: ResponseInspectionHeaderProperty.Builder.() -> Unit): Unit =
          `header`(ResponseInspectionHeaderProperty(`header`))

      /**
       * @param json Configures inspection of the response JSON for success and failure indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
       */
      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      /**
       * @param json Configures inspection of the response JSON for success and failure indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
       */
      override fun json(json: ResponseInspectionJsonProperty) {
        cdkBuilder.json(json.let(ResponseInspectionJsonProperty::unwrap))
      }

      /**
       * @param json Configures inspection of the response JSON for success and failure indicators.
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34451c83e85bf74f1f04b00f77762465d5133af1d26a3a260fe2f1d91171cfe4")
      override fun json(json: ResponseInspectionJsonProperty.Builder.() -> Unit): Unit =
          json(ResponseInspectionJsonProperty(json))

      /**
       * @param statusCode Configures inspection of the response status code for success and failure
       * indicators.
       */
      override fun statusCode(statusCode: IResolvable) {
        cdkBuilder.statusCode(statusCode.let(IResolvable::unwrap))
      }

      /**
       * @param statusCode Configures inspection of the response status code for success and failure
       * indicators.
       */
      override fun statusCode(statusCode: ResponseInspectionStatusCodeProperty) {
        cdkBuilder.statusCode(statusCode.let(ResponseInspectionStatusCodeProperty::unwrap))
      }

      /**
       * @param statusCode Configures inspection of the response status code for success and failure
       * indicators.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8cb4f11f76c069ee5771ac3abcd7b620f2e486c50cb6202675d399a44413610")
      override fun statusCode(statusCode: ResponseInspectionStatusCodeProperty.Builder.() -> Unit):
          Unit = statusCode(ResponseInspectionStatusCodeProperty(statusCode))

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty,
    ) : CdkObject(cdkObject), ResponseInspectionProperty {
      /**
       * Configures inspection of the response body for success and failure indicators.
       *
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspection.html#cfn-wafv2-webacl-responseinspection-bodycontains)
       */
      override fun bodyContains(): Any? = unwrap(this).getBodyContains()

      /**
       * Configures inspection of the response header for success and failure indicators.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspection.html#cfn-wafv2-webacl-responseinspection-header)
       */
      override fun `header`(): Any? = unwrap(this).getHeader()

      /**
       * Configures inspection of the response JSON for success and failure indicators.
       *
       * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspection.html#cfn-wafv2-webacl-responseinspection-json)
       */
      override fun json(): Any? = unwrap(this).getJson()

      /**
       * Configures inspection of the response status code for success and failure indicators.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspection.html#cfn-wafv2-webacl-responseinspection-statuscode)
       */
      override fun statusCode(): Any? = unwrap(this).getStatusCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseInspectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty):
          ResponseInspectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseInspectionProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.ResponseInspectionProperty
    }
  }

  public interface FieldIdentifierProperty {
    /**
     * The name of the field.
     *
     * When the `PayloadType` in the request inspection is `JSON` , this identifier must be in JSON
     * pointer syntax. For example `/form/username` . For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation [JavaScript Object Notation (JSON)
     * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
     *
     * When the `PayloadType` is `FORM_ENCODED` , use the HTML form names. For example, `username` .
     *
     * For more information, see the descriptions for each field type in the request inspection
     * properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldidentifier.html#cfn-wafv2-webacl-fieldidentifier-identifier)
     */
    public fun identifier(): String

    /**
     * A builder for [FieldIdentifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param identifier The name of the field. 
       * When the `PayloadType` in the request inspection is `JSON` , this identifier must be in
       * JSON pointer syntax. For example `/form/username` . For information about the JSON Pointer
       * syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript Object
       * Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * When the `PayloadType` is `FORM_ENCODED` , use the HTML form names. For example, `username`
       * .
       *
       * For more information, see the descriptions for each field type in the request inspection
       * properties.
       */
      public fun identifier(identifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty.builder()

      /**
       * @param identifier The name of the field. 
       * When the `PayloadType` in the request inspection is `JSON` , this identifier must be in
       * JSON pointer syntax. For example `/form/username` . For information about the JSON Pointer
       * syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript Object
       * Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * When the `PayloadType` is `FORM_ENCODED` , use the HTML form names. For example, `username`
       * .
       *
       * For more information, see the descriptions for each field type in the request inspection
       * properties.
       */
      override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty,
    ) : CdkObject(cdkObject), FieldIdentifierProperty {
      /**
       * The name of the field.
       *
       * When the `PayloadType` in the request inspection is `JSON` , this identifier must be in
       * JSON pointer syntax. For example `/form/username` . For information about the JSON Pointer
       * syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript Object
       * Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
       *
       * When the `PayloadType` is `FORM_ENCODED` , use the HTML form names. For example, `username`
       * .
       *
       * For more information, see the descriptions for each field type in the request inspection
       * properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldidentifier.html#cfn-wafv2-webacl-fieldidentifier-identifier)
       */
      override fun identifier(): String = unwrap(this).getIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty):
          FieldIdentifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldIdentifierProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.FieldIdentifierProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customrequesthandling.html#cfn-wafv2-webacl-customrequesthandling-insertheaders)
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
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty.builder()

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
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty,
    ) : CdkObject(cdkObject), CustomRequestHandlingProperty {
      /**
       * The HTTP headers to insert into the request. Duplicate header names are not allowed.
       *
       * For information about the limits on count and size for custom request and response
       * settings, see [AWS WAF
       * quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the *AWS WAF
       * Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customrequesthandling.html#cfn-wafv2-webacl-customrequesthandling-insertheaders)
       */
      override fun insertHeaders(): Any = unwrap(this).getInsertHeaders()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomRequestHandlingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty):
          CustomRequestHandlingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomRequestHandlingProperty):
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty
    }
  }
}