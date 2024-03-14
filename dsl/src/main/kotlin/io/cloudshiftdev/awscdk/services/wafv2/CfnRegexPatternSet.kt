package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRegexPatternSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.wafv2.CfnRegexPatternSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the regex pattern set.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the regex pattern set.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description of the set that helps with identification.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the set that helps with identification.
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
   * The name of the set.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the set.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The regular expression patterns in the set.
   */
  public open fun regularExpressionList(): List<String> = unwrap(this).getRegularExpressionList()

  /**
   * The regular expression patterns in the set.
   */
  public open fun regularExpressionList(`value`: List<String>) {
    unwrap(this).setRegularExpressionList(`value`)
  }

  /**
   * The regular expression patterns in the set.
   */
  public open fun regularExpressionList(vararg `value`: String): Unit =
      regularExpressionList(`value`.toList())

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wafv2.CfnRegexPatternSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the set that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-description)
     * @param description A description of the set that helps with identification. 
     */
    public fun description(description: String)

    /**
     * The name of the set.
     *
     * You cannot change the name after you create the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-name)
     * @param name The name of the set. 
     */
    public fun name(name: String)

    /**
     * The regular expression patterns in the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-regularexpressionlist)
     * @param regularExpressionList The regular expression patterns in the set. 
     */
    public fun regularExpressionList(regularExpressionList: List<String>)

    /**
     * The regular expression patterns in the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-regularexpressionlist)
     * @param regularExpressionList The regular expression patterns in the set. 
     */
    public fun regularExpressionList(vararg regularExpressionList: String)

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-tags)
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnRegexPatternSet.Builder =
        software.amazon.awscdk.services.wafv2.CfnRegexPatternSet.Builder.create(scope, id)

    /**
     * A description of the set that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-description)
     * @param description A description of the set that helps with identification. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the set.
     *
     * You cannot change the name after you create the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-name)
     * @param name The name of the set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The regular expression patterns in the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-regularexpressionlist)
     * @param regularExpressionList The regular expression patterns in the set. 
     */
    override fun regularExpressionList(regularExpressionList: List<String>) {
      cdkBuilder.regularExpressionList(regularExpressionList)
    }

    /**
     * The regular expression patterns in the set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-regularexpressionlist)
     * @param regularExpressionList The regular expression patterns in the set. 
     */
    override fun regularExpressionList(vararg regularExpressionList: String): Unit =
        regularExpressionList(regularExpressionList.toList())

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html#cfn-wafv2-regexpatternset-tags)
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wafv2.CfnRegexPatternSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRegexPatternSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRegexPatternSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRegexPatternSet):
        CfnRegexPatternSet = CfnRegexPatternSet(cdkObject)

    internal fun unwrap(wrapped: CfnRegexPatternSet):
        software.amazon.awscdk.services.wafv2.CfnRegexPatternSet = wrapped.cdkObject
  }
}
