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
import software.amazon.awscdk.services.wafv2.CfnWebACLProps

/**
 * Properties for defining a `CfnWebACL`.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html)
 */
@CdkDslMarker
public class CfnWebACLPropsDsl {
    private val cdkBuilder: CfnWebACLProps.Builder = CfnWebACLProps.builder()

    private val _rules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _tokenDomains: MutableList<String> = mutableListOf()

    /**
     * @param associationConfig Specifies custom configurations for the associations between the web
     *   ACL and protected resources. Use this to customize the maximum size of the request body
     *   that your protected CloudFront distributions forward to AWS WAF for inspection. The default
     *   is 16 KB (16,384 bytes).
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see
     * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    public fun associationConfig(associationConfig: IResolvable) {
        cdkBuilder.associationConfig(associationConfig)
    }

    /**
     * @param associationConfig Specifies custom configurations for the associations between the web
     *   ACL and protected resources. Use this to customize the maximum size of the request body
     *   that your protected CloudFront distributions forward to AWS WAF for inspection. The default
     *   is 16 KB (16,384 bytes).
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see
     * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    public fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty) {
        cdkBuilder.associationConfig(associationConfig)
    }

    /**
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     *   don't have their own `CaptchaConfig` settings. If you don't specify this, AWS WAF uses its
     *   default settings for `CaptchaConfig` .
     */
    public fun captchaConfig(captchaConfig: IResolvable) {
        cdkBuilder.captchaConfig(captchaConfig)
    }

    /**
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that
     *   don't have their own `CaptchaConfig` settings. If you don't specify this, AWS WAF uses its
     *   default settings for `CaptchaConfig` .
     */
    public fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty) {
        cdkBuilder.captchaConfig(captchaConfig)
    }

    /**
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     *   that don't have their own `ChallengeConfig` settings. If you don't specify this, AWS WAF
     *   uses its default settings for `ChallengeConfig` .
     */
    public fun challengeConfig(challengeConfig: IResolvable) {
        cdkBuilder.challengeConfig(challengeConfig)
    }

    /**
     * @param challengeConfig Specifies how AWS WAF should handle challenge evaluations for rules
     *   that don't have their own `ChallengeConfig` settings. If you don't specify this, AWS WAF
     *   uses its default settings for `ChallengeConfig` .
     */
    public fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty) {
        cdkBuilder.challengeConfig(challengeConfig)
    }

    /**
     * @param customResponseBodies A map of custom response keys and content bodies. When you create
     *   a rule with a block action, you can send a custom response to the web request. You define
     *   these for the web ACL, and then use them in the rules and default actions that you define
     *   in the web ACL.
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in
     * the *AWS WAF Developer Guide* .
     */
    public fun customResponseBodies(customResponseBodies: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(customResponseBodies)
        cdkBuilder.customResponseBodies(builder.map)
    }

    /**
     * @param customResponseBodies A map of custom response keys and content bodies. When you create
     *   a rule with a block action, you can send a custom response to the web request. You define
     *   these for the web ACL, and then use them in the rules and default actions that you define
     *   in the web ACL.
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in
     * the *AWS WAF Developer Guide* .
     */
    public fun customResponseBodies(customResponseBodies: Map<String, Any>) {
        cdkBuilder.customResponseBodies(customResponseBodies)
    }

    /**
     * @param customResponseBodies A map of custom response keys and content bodies. When you create
     *   a rule with a block action, you can send a custom response to the web request. You define
     *   these for the web ACL, and then use them in the rules and default actions that you define
     *   in the web ACL.
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in
     * the *AWS WAF Developer Guide* .
     */
    public fun customResponseBodies(customResponseBodies: IResolvable) {
        cdkBuilder.customResponseBodies(customResponseBodies)
    }

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     *   match.
     */
    public fun defaultAction(defaultAction: IResolvable) {
        cdkBuilder.defaultAction(defaultAction)
    }

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     *   match.
     */
    public fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty) {
        cdkBuilder.defaultAction(defaultAction)
    }

    /** @param description A description of the web ACL that helps with identification. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The name of the web ACL. You cannot change the name of a web ACL after you create
     *   it.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to manage.
     *   Each rule includes one top-level statement that AWS WAF uses to identify matching web
     *   requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to manage.
     *   Each rule includes one top-level statement that AWS WAF uses to identify matching web
     *   requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to manage.
     *   Each rule includes one top-level statement that AWS WAF uses to identify matching web
     *   requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    /**
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     *   regional application. A regional application can be an Application Load Balancer (ALB), an
     *   Amazon API Gateway REST API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an
     *   AWS App Runner service, or an AWS Verified Access instance. Valid Values are `CLOUDFRONT`
     *   and `REGIONAL` .
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     *
     * For information about how to define the association of the web ACL with your resource, see
     * `WebACLAssociation` .
     */
    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource. The key:value pair can be
     *   anything you define. Typically, the tag key represents a category (such as "environment")
     *   and the tag value represents a specific value within that category (such as "test,"
     *   "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource. The key:value pair can be
     *   anything you define. Typically, the tag key represents a category (such as "environment")
     *   and the tag value represents a specific value within that category (such as "test,"
     *   "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token.
     *   This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     *   token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     *   specify a list of token domains, AWS WAF accepts tokens only for the domain of the
     *   protected resource. With a token domain list, AWS WAF accepts the resource's host domain
     *   plus all domains in the token domain list, including their prefixed subdomains.
     */
    public fun tokenDomains(vararg tokenDomains: String) {
        _tokenDomains.addAll(listOf(*tokenDomains))
    }

    /**
     * @param tokenDomains Specifies the domains that AWS WAF should accept in a web request token.
     *   This enables the use of tokens across multiple protected websites. When AWS WAF provides a
     *   token, it uses the domain of the AWS resource that the web ACL is protecting. If you don't
     *   specify a list of token domains, AWS WAF accepts tokens only for the domain of the
     *   protected resource. With a token domain list, AWS WAF accepts the resource's host domain
     *   plus all domains in the token domain list, including their prefixed subdomains.
     */
    public fun tokenDomains(tokenDomains: Collection<String>) {
        _tokenDomains.addAll(tokenDomains)
    }

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     *   collection.
     */
    public fun visibilityConfig(visibilityConfig: IResolvable) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     *   collection.
     */
    public fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    public fun build(): CfnWebACLProps {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_tokenDomains.isNotEmpty()) cdkBuilder.tokenDomains(_tokenDomains)
        return cdkBuilder.build()
    }
}
