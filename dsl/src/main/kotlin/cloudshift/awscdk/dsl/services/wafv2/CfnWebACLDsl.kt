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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
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
 * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
 * .
 *
 * Use an `WebACL` to define a collection of rules to use to inspect and control web requests. Each
 * rule has an action defined (allow, block, or count) for requests that match the statement of the
 * rule. In the web ACL, you specify a default action to take (allow, block) for any request that
 * doesn't match any of the rules. The rules in a web ACL can contain rule statements that you
 * define explicitly and rule statements that reference rule groups and managed rule groups. You can
 * associate a web ACL with one or more AWS resources to protect. The resources can be an Amazon
 * CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer , an AWS
 * AppSync GraphQL API , an Amazon Cognito user pool, an AWS App Runner service, or an AWS Verified
 * Access instance.
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
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     *
     * @param rules The rule statements used to identify the web requests that you want to allow,
     *   block, or count.
     */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     *
     * @param rules The rule statements used to identify the web requests that you want to allow,
     *   block, or count.
     */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html#cfn-wafv2-webacl-rules)
     *
     * @param rules The rule statements used to identify the web requests that you want to allow,
     *   block, or count.
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
