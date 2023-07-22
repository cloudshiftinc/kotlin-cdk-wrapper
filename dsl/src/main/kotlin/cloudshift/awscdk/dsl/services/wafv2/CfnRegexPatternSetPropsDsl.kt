@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps

@CdkDslMarker
public class CfnRegexPatternSetPropsDsl {
  private val cdkBuilder: CfnRegexPatternSetProps.Builder = CfnRegexPatternSetProps.builder()

  private val _regularExpressionList: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description of the set that helps with identification.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the set.
   * You cannot change the name after you create the set.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param regularExpressionList The regular expression patterns in the set. 
   */
  public fun regularExpressionList(vararg regularExpressionList: String) {
    _regularExpressionList.addAll(listOf(*regularExpressionList))
  }

  /**
   * @param regularExpressionList The regular expression patterns in the set. 
   */
  public fun regularExpressionList(regularExpressionList: Collection<String>) {
    _regularExpressionList.addAll(regularExpressionList)
  }

  /**
   * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a regional
   * application. 
   * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
   * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an AWS
   * Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
   *
   *
   * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
   * `us-east-1` .
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param tags Key:value pairs associated with an AWS resource.
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   *
   * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With AWS
   * CloudFormation , you can only add tags to AWS WAF resources during resource creation.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Key:value pairs associated with an AWS resource.
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   *
   * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With AWS
   * CloudFormation , you can only add tags to AWS WAF resources during resource creation.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnRegexPatternSetProps {
    if(_regularExpressionList.isNotEmpty()) cdkBuilder.regularExpressionList(_regularExpressionList)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
