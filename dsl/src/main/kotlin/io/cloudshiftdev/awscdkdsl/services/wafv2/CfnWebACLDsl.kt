@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import software.constructs.Construct

/**
 * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
 *
 * For information, including how to migrate your AWS WAF resources from the prior release, see the
 * [AWS WAF developer guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
 * .
 *
 * Use an `WebACL` to define a collection of rules to use to inspect and control web requests. Each
 * rule in a web ACL has a statement that defines what to look for in web requests and an action
 * that AWS WAF applies to requests that match the statement. In the web ACL, you assign a default
 * action to take (allow, block) for any request that doesn't match any of the rules.
 *
 * The rules in a web ACL can be a combination of explicitly defined rules and rule groups that you
 * reference from the web ACL. The rule groups can be rule groups that you manage or rule groups
 * that are managed by others.
 *
 * You can associate a web ACL with one or more AWS resources to protect. The resources can be an
 * Amazon CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer , an
 * AWS AppSync GraphQL API , an Amazon Cognito user pool, an AWS App Runner service, or an AWS
 * Verified Access instance.
 *
 * For more information, see
 * [Web access control lists (web ACLs)](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl.html)
 * in the *AWS WAF developer guide* .
 *
 * *Web ACLs used in AWS Shield Advanced automatic application layer DDoS mitigation*
 *
 * If you use Shield Advanced automatic application layer DDoS mitigation, the web ACLs that you use
 * with automatic mitigation have a rule group rule whose name starts with
 * `ShieldMitigationRuleGroup` . This rule is used for automatic mitigations and it's managed for
 * you in the web ACL by Shield Advanced and AWS WAF . You'll see the rule listed among the web ACL
 * rules when you view the web ACL through the AWS WAF interfaces.
 *
 * When you manage the web ACL through AWS CloudFormation interfaces, you won't see the Shield
 * Advanced rule. AWS CloudFormation doesn't include this type of rule in the stack drift status
 * between the actual configuration of the web ACL and your web ACL template.
 *
 * Don't add the Shield Advanced rule group rule to your web ACL template. The rule shouldn't be in
 * your template. When you update the web ACL template in a stack, the Shield Advanced rule is
 * maintained for you by AWS WAF in the resulting web ACL.
 *
 * For more information, see
 * [Shield Advanced automatic application layer DDoS mitigation](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-automatic-app-layer-response.html)
 * in the *AWS Shield Advanced developer guide* .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html)
 */
@CdkDslMarker
public class CfnWebACLDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWebACL.Builder = CfnWebACL.Builder.create(scope, id)

    private val _rules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _tokenDomains: MutableList<String> = mutableListOf()

    /**
     * Specifies custom configurations for the associations between the web ACL and protected
     * resources.
     *
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see
     * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-associationconfig)
     *
     * @param associationConfig Specifies custom configurations for the associations between the web
     *   ACL and protected resources.
     */
    public fun associationConfig(associationConfig: IResolvable) {
        cdkBuilder.associationConfig(associationConfig)
    }

    /**
     * Specifies custom configurations for the associations between the web ACL and protected
     * resources.
     *
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see
     * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-associationconfig)
     *
     * @param associationConfig Specifies custom configurations for the associations between the web
     *   ACL and protected resources.
     */
    public fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty) {
        cdkBuilder.associationConfig(associationConfig)
    }

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
     * `CaptchaConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-captchaconfig)
     *
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     *   don't have their own `CaptchaConfig` settings.
     */
    public fun captchaConfig(captchaConfig: IResolvable) {
        cdkBuilder.captchaConfig(captchaConfig)
    }

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
     * `CaptchaConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-captchaconfig)
     *
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     *   don't have their own `CaptchaConfig` settings.
     */
    public fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty) {
        cdkBuilder.captchaConfig(captchaConfig)
    }

    /**
     * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
     * `ChallengeConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-challengeconfig)
     *
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     *   that don't have their own `ChallengeConfig` settings.
     */
    public fun challengeConfig(challengeConfig: IResolvable) {
        cdkBuilder.challengeConfig(challengeConfig)
    }

    /**
     * Specifies how AWS WAF should handle challenge evaluations for rules that don't have their own
     * `ChallengeConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `ChallengeConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-challengeconfig)
     *
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     *   that don't have their own `ChallengeConfig` settings.
     */
    public fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty) {
        cdkBuilder.challengeConfig(challengeConfig)
    }

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the web ACL, and then use them in the rules and default actions
     * that you define in the web ACL.
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-customresponsebodies)
     *
     * @param customResponseBodies A map of custom response keys and content bodies.
     */
    public fun customResponseBodies(customResponseBodies: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(customResponseBodies)
        cdkBuilder.customResponseBodies(builder.map)
    }

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the web ACL, and then use them in the rules and default actions
     * that you define in the web ACL.
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-customresponsebodies)
     *
     * @param customResponseBodies A map of custom response keys and content bodies.
     */
    public fun customResponseBodies(customResponseBodies: Map<String, Any>) {
        cdkBuilder.customResponseBodies(customResponseBodies)
    }

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the web ACL, and then use them in the rules and default actions
     * that you define in the web ACL.
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-customresponsebodies)
     *
     * @param customResponseBodies A map of custom response keys and content bodies.
     */
    public fun customResponseBodies(customResponseBodies: IResolvable) {
        cdkBuilder.customResponseBodies(customResponseBodies)
    }

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-defaultaction)
     *
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     *   match.
     */
    public fun defaultAction(defaultAction: IResolvable) {
        cdkBuilder.defaultAction(defaultAction)
    }

    /**
     * The action to perform if none of the `Rules` contained in the `WebACL` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-defaultaction)
     *
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     *   match.
     */
    public fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty) {
        cdkBuilder.defaultAction(defaultAction)
    }

    /**
     * A description of the web ACL that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-description)
     *
     * @param description A description of the web ACL that helps with identification.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the web ACL.
     *
     * You cannot change the name of a web ACL after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-name)
     *
     * @param name The name of the web ACL.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The rule statements used to identify the web requests that you want to manage.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     *
     * @param rules The rule statements used to identify the web requests that you want to manage.
     */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /**
     * The rule statements used to identify the web requests that you want to manage.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     *
     * @param rules The rule statements used to identify the web requests that you want to manage.
     */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /**
     * The rule statements used to identify the web requests that you want to manage.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     *
     * @param rules The rule statements used to identify the web requests that you want to manage.
     */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    /**
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional
     * application.
     *
     * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
     * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or
     * an AWS Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     *
     * For information about how to define the association of the web ACL with your resource, see
     * `WebACLAssociation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-scope)
     *
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     *   regional application.
     */
    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each AWS
     * resource.
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tags)
     *
     * @param tags Key:value pairs associated with an AWS resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each AWS
     * resource.
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tags)
     *
     * @param tags Key:value pairs associated with an AWS resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Specifies the domains that AWS WAF should accept in a web request token.
     *
     * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     * specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected
     * resource. With a token domain list, AWS WAF accepts the resource's host domain plus all
     * domains in the token domain list, including their prefixed subdomains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tokendomains)
     *
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token.
     */
    public fun tokenDomains(vararg tokenDomains: String) {
        _tokenDomains.addAll(listOf(*tokenDomains))
    }

    /**
     * Specifies the domains that AWS WAF should accept in a web request token.
     *
     * This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     * token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     * specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected
     * resource. With a token domain list, AWS WAF accepts the resource's host domain plus all
     * domains in the token domain list, including their prefixed subdomains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-tokendomains)
     *
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token.
     */
    public fun tokenDomains(tokenDomains: Collection<String>) {
        _tokenDomains.addAll(tokenDomains)
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-visibilityconfig)
     *
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     *   collection.
     */
    public fun visibilityConfig(visibilityConfig: IResolvable) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-visibilityconfig)
     *
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     *   collection.
     */
    public fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    public fun build(): CfnWebACL {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_tokenDomains.isNotEmpty()) cdkBuilder.tokenDomains(_tokenDomains)
        return cdkBuilder.build()
    }
}
