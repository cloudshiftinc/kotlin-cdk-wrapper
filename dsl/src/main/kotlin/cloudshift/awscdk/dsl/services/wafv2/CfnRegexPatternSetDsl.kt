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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSet
import software.constructs.Construct

/**
 * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
 *
 * For information, including how to migrate your AWS WAF resources from the prior release, see the
 * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
 * .
 *
 * Use an `RegexPatternSet` to have AWS WAF inspect a web request component for a specific set of
 * regular expression patterns.
 *
 * You use a regex pattern set by providing its Amazon Resource Name (ARN) to the rule statement
 * `RegexPatternSetReferenceStatement` , when you add a rule to a rule group or web ACL.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * CfnRegexPatternSet cfnRegexPatternSet = CfnRegexPatternSet.Builder.create(this,
 * "MyCfnRegexPatternSet")
 * .regularExpressionList(List.of("regularExpressionList"))
 * .scope("scope")
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html)
 */
@CdkDslMarker
public class CfnRegexPatternSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRegexPatternSet.Builder =
        CfnRegexPatternSet.Builder.create(scope, id)

    private val _regularExpressionList: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the set that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-description)
     *
     * @param description A description of the set that helps with identification.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the set.
     *
     * You cannot change the name after you create the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-name)
     *
     * @param name The name of the set.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The regular expression patterns in the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-regularexpressionlist)
     *
     * @param regularExpressionList The regular expression patterns in the set.
     */
    public fun regularExpressionList(vararg regularExpressionList: String) {
        _regularExpressionList.addAll(listOf(*regularExpressionList))
    }

    /**
     * The regular expression patterns in the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-regularexpressionlist)
     *
     * @param regularExpressionList The regular expression patterns in the set.
     */
    public fun regularExpressionList(regularExpressionList: Collection<String>) {
        _regularExpressionList.addAll(regularExpressionList)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-scope)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-tags)
     *
     * @param tags Key:value pairs associated with an AWS resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRegexPatternSet {
        if (_regularExpressionList.isNotEmpty())
            cdkBuilder.regularExpressionList(_regularExpressionList)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
