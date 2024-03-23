@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWebACL`.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html)
 */
public interface CfnWebACLProps {
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
   */
  public fun associationConfig(): Any? = unwrap(this).getAssociationConfig()

  /**
   * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
   * `CaptchaConfig` settings.
   *
   * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-captchaconfig)
   */
  public fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

  /**
   * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
   * `ChallengeConfig` settings.
   *
   * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-challengeconfig)
   */
  public fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

  /**
   * A map of custom response keys and content bodies.
   *
   * When you create a rule with a block action, you can send a custom response to the web request.
   * You define these for the web ACL, and then use them in the rules and default actions that you
   * define in the web ACL.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-customresponsebodies)
   */
  public fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-defaultaction)
   */
  public fun defaultAction(): Any

  /**
   * A description of the web ACL that helps with identification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the web ACL.
   *
   * You cannot change the name of a web ACL after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The rule statements used to identify the web requests that you want to manage.
   *
   * Each rule includes one top-level statement that AWS WAF uses to identify matching web requests,
   * and parameters that govern how AWS WAF handles them.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
   */
  public fun rules(): Any? = unwrap(this).getRules()

  /**
   * Specifies whether this is for an Amazon CloudFront distribution or for a regional application.
   *
   * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
   * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an AWS
   * Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the domains that AWS WAF should accept in a web request token.
   *
   * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
   * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't specify
   * a list of token domains, AWS WAF accepts tokens only for the domain of the protected resource.
   * With a token domain list, AWS WAF accepts the resource's host domain plus all domains in the token
   * domain list, including their prefixed subdomains.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tokendomains)
   */
  public fun tokenDomains(): List<String> = unwrap(this).getTokenDomains() ?: emptyList()

  /**
   * Defines and enables Amazon CloudWatch metrics and web request sample collection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-visibilityconfig)
   */
  public fun visibilityConfig(): Any

  /**
   * A builder for [CfnWebACLProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources.
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    public fun associationConfig(associationConfig: IResolvable)

    /**
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources.
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    public fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty)

    /**
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources.
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8cd78ecacaca4f48f827e175e1953db05c9e8605918846e0d9d3a3b204c7513")
    public
        fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty.Builder.() -> Unit)

    /**
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     */
    public fun captchaConfig(captchaConfig: IResolvable)

    /**
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     */
    public fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty)

    /**
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a082b8fdbfb145d3bcbb32fb5c5ca0a41d12ef16b3c3e639930530f7ce809ac3")
    public fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty.Builder.() -> Unit)

    /**
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     */
    public fun challengeConfig(challengeConfig: IResolvable)

    /**
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     */
    public fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty)

    /**
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3fc351ef80e77884eef22e9259381bfc8f51f8c3097b25393523843aeb843b")
    public
        fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty.Builder.() -> Unit)

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
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
     */
    public fun customResponseBodies(customResponseBodies: IResolvable)

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
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
     */
    public fun customResponseBodies(customResponseBodies: Map<String, Any>)

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    public fun defaultAction(defaultAction: IResolvable)

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    public fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty)

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d05b778cb848d1fc55db884e81f51735e0c6705e2757b7b3d150321cf2c5c57")
    public fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty.Builder.() -> Unit)

    /**
     * @param description A description of the web ACL that helps with identification.
     */
    public fun description(description: String)

    /**
     * @param name The name of the web ACL.
     * You cannot change the name of a web ACL after you create it.
     */
    public fun name(name: String)

    /**
     * @param rules The rule statements used to identify the web requests that you want to manage.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(rules: IResolvable)

    /**
     * @param rules The rule statements used to identify the web requests that you want to manage.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(rules: List<Any>)

    /**
     * @param rules The rule statements used to identify the web requests that you want to manage.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(vararg rules: Any)

    /**
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
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
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token.
     * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     * specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected
     * resource. With a token domain list, AWS WAF accepts the resource's host domain plus all domains
     * in the token domain list, including their prefixed subdomains.
     */
    public fun tokenDomains(tokenDomains: List<String>)

    /**
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token.
     * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     * specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected
     * resource. With a token domain list, AWS WAF accepts the resource's host domain plus all domains
     * in the token domain list, including their prefixed subdomains.
     */
    public fun tokenDomains(vararg tokenDomains: String)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    public fun visibilityConfig(visibilityConfig: IResolvable)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    public fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7dab37d83f1ee312ea342610680f60fab45da2e311969c6d30f9880156b2eb8")
    public
        fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACLProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnWebACLProps.builder()

    /**
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources.
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    override fun associationConfig(associationConfig: IResolvable) {
      cdkBuilder.associationConfig(associationConfig.let(IResolvable::unwrap))
    }

    /**
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources.
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    override fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty) {
      cdkBuilder.associationConfig(associationConfig.let(CfnWebACL.AssociationConfigProperty::unwrap))
    }

    /**
     * @param associationConfig Specifies custom configurations for the associations between the web
     * ACL and protected resources.
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see [AWS WAF
     * Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8cd78ecacaca4f48f827e175e1953db05c9e8605918846e0d9d3a3b204c7513")
    override
        fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty.Builder.() -> Unit):
        Unit = associationConfig(CfnWebACL.AssociationConfigProperty(associationConfig))

    /**
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     */
    override fun captchaConfig(captchaConfig: IResolvable) {
      cdkBuilder.captchaConfig(captchaConfig.let(IResolvable::unwrap))
    }

    /**
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     */
    override fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty) {
      cdkBuilder.captchaConfig(captchaConfig.let(CfnWebACL.CaptchaConfigProperty::unwrap))
    }

    /**
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     * don't have their own `CaptchaConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a082b8fdbfb145d3bcbb32fb5c5ca0a41d12ef16b3c3e639930530f7ce809ac3")
    override fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty.Builder.() -> Unit):
        Unit = captchaConfig(CfnWebACL.CaptchaConfigProperty(captchaConfig))

    /**
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     */
    override fun challengeConfig(challengeConfig: IResolvable) {
      cdkBuilder.challengeConfig(challengeConfig.let(IResolvable::unwrap))
    }

    /**
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     */
    override fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty) {
      cdkBuilder.challengeConfig(challengeConfig.let(CfnWebACL.ChallengeConfigProperty::unwrap))
    }

    /**
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     * that don't have their own `ChallengeConfig` settings.
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3fc351ef80e77884eef22e9259381bfc8f51f8c3097b25393523843aeb843b")
    override
        fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty.Builder.() -> Unit):
        Unit = challengeConfig(CfnWebACL.ChallengeConfigProperty(challengeConfig))

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
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
     */
    override fun customResponseBodies(customResponseBodies: IResolvable) {
      cdkBuilder.customResponseBodies(customResponseBodies.let(IResolvable::unwrap))
    }

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
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
     */
    override fun customResponseBodies(customResponseBodies: Map<String, Any>) {
      cdkBuilder.customResponseBodies(customResponseBodies)
    }

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    override fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(CfnWebACL.DefaultActionProperty::unwrap))
    }

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     * match. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d05b778cb848d1fc55db884e81f51735e0c6705e2757b7b3d150321cf2c5c57")
    override fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty.Builder.() -> Unit):
        Unit = defaultAction(CfnWebACL.DefaultActionProperty(defaultAction))

    /**
     * @param description A description of the web ACL that helps with identification.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the web ACL.
     * You cannot change the name of a web ACL after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to manage.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to manage.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to manage.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token.
     * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     * specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected
     * resource. With a token domain list, AWS WAF accepts the resource's host domain plus all domains
     * in the token domain list, including their prefixed subdomains.
     */
    override fun tokenDomains(tokenDomains: List<String>) {
      cdkBuilder.tokenDomains(tokenDomains)
    }

    /**
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token.
     * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     * specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected
     * resource. With a token domain list, AWS WAF accepts the resource's host domain plus all domains
     * in the token domain list, including their prefixed subdomains.
     */
    override fun tokenDomains(vararg tokenDomains: String): Unit =
        tokenDomains(tokenDomains.toList())

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    override fun visibilityConfig(visibilityConfig: IResolvable) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable::unwrap))
    }

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    override fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(CfnWebACL.VisibilityConfigProperty::unwrap))
    }

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7dab37d83f1ee312ea342610680f60fab45da2e311969c6d30f9880156b2eb8")
    override
        fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty.Builder.() -> Unit):
        Unit = visibilityConfig(CfnWebACL.VisibilityConfigProperty(visibilityConfig))

    public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACLProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACLProps,
  ) : CdkObject(cdkObject), CfnWebACLProps {
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
     */
    override fun associationConfig(): Any? = unwrap(this).getAssociationConfig()

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
     * `CaptchaConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-captchaconfig)
     */
    override fun captchaConfig(): Any? = unwrap(this).getCaptchaConfig()

    /**
     * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
     * `ChallengeConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-challengeconfig)
     */
    override fun challengeConfig(): Any? = unwrap(this).getChallengeConfig()

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
     */
    override fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-defaultaction)
     */
    override fun defaultAction(): Any = unwrap(this).getDefaultAction()

    /**
     * A description of the web ACL that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the web ACL.
     *
     * You cannot change the name of a web ACL after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The rule statements used to identify the web requests that you want to manage.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     */
    override fun rules(): Any? = unwrap(this).getRules()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun tokenDomains(): List<String> = unwrap(this).getTokenDomains() ?: emptyList()

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-visibilityconfig)
     */
    override fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebACLProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACLProps):
        CfnWebACLProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWebACLProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLProps):
        software.amazon.awscdk.services.wafv2.CfnWebACLProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.wafv2.CfnWebACLProps
  }
}
