@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRegexPatternSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wafv2.*;
 * CfnRegexPatternSetProps cfnRegexPatternSetProps = CfnRegexPatternSetProps.builder()
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
public interface CfnRegexPatternSetProps {
  /**
   * A description of the set that helps with identification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the set.
   *
   * You cannot change the name after you create the set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The regular expression patterns in the set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-regularexpressionlist)
   */
  public fun regularExpressionList(): List<String>

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-scope)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRegexPatternSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the set that helps with identification.
     */
    public fun description(description: String)

    /**
     * @param name The name of the set.
     * You cannot change the name after you create the set.
     */
    public fun name(name: String)

    /**
     * @param regularExpressionList The regular expression patterns in the set. 
     */
    public fun regularExpressionList(regularExpressionList: List<String>)

    /**
     * @param regularExpressionList The regular expression patterns in the set. 
     */
    public fun regularExpressionList(vararg regularExpressionList: String)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps.builder()

    /**
     * @param description A description of the set that helps with identification.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the set.
     * You cannot change the name after you create the set.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param regularExpressionList The regular expression patterns in the set. 
     */
    override fun regularExpressionList(regularExpressionList: List<String>) {
      cdkBuilder.regularExpressionList(regularExpressionList)
    }

    /**
     * @param regularExpressionList The regular expression patterns in the set. 
     */
    override fun regularExpressionList(vararg regularExpressionList: String): Unit =
        regularExpressionList(regularExpressionList.toList())

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

    public fun build(): software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps,
  ) : CdkObject(cdkObject), CfnRegexPatternSetProps {
    /**
     * A description of the set that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the set.
     *
     * You cannot change the name after you create the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The regular expression patterns in the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-regularexpressionlist)
     */
    override fun regularExpressionList(): List<String> = unwrap(this).getRegularExpressionList()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-scope)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegexPatternSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps):
        CfnRegexPatternSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegexPatternSetProps):
        software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps
  }
}
