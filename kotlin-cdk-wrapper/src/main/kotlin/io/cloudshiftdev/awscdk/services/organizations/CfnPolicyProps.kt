@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.organizations.*;
 * Object content;
 * CfnPolicyProps cfnPolicyProps = CfnPolicyProps.builder()
 * .content(content)
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetIds(List.of("targetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html)
 */
public interface CfnPolicyProps {
  /**
   * The policy text content. You can specify the policy content as a JSON object or a JSON string.
   *
   *
   * When you specify the policy content as a JSON string, you can't perform drift detection on the
   * CloudFormation stack. For this reason, we recommend specifying the policy content as a JSON object
   * instead.
   *
   *
   * The text that you supply must adhere to the rules of the policy type you specify in the `Type`
   * parameter. The following AWS Organizations quotas are enforced for the maximum size of a policy
   * document:
   *
   * * Service control policies: 5,120 characters
   * * AI services opt-out policies: 2,500 characters
   * * Backup policies: 10,000 characters
   * * Tag policies: 10,000 characters
   *
   * For more information about Organizations service quotas, see [Quotas for AWS
   * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html)
   * in the *AWS Organizations User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-content)
   */
  public fun content(): Any

  /**
   * Human readable description of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Name of the policy.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
   * to validate this parameter is a string of any of the characters in the ASCII character range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-name)
   */
  public fun name(): String

  /**
   * A list of tags that you want to attach to the newly created policy.
   *
   * For each tag in the list, you must specify both a tag key and a value. You can set the value to
   * an empty string, but you can't set it to `null` . For more information about tagging, see [Tagging
   * AWS Organizations
   * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
   * AWS Organizations User Guide.
   *
   *
   * If any one of the tags is not valid or if you exceed the allowed number of tags for a policy,
   * then the entire request fails and the policy is not created.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * List of unique identifiers (IDs) of the root, OU, or account that you want to attach the policy
   * to.
   *
   * You can get the ID by calling the
   * [ListRoots](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html) ,
   * [ListOrganizationalUnitsForParent](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListOrganizationalUnitsForParent.html)
   * , or
   * [ListAccounts](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListAccounts.html)
   * operations. If you don't specify this parameter, the policy is created but not attached to any
   * organization resource.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a target
   * ID string requires one of the following:
   *
   * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
   * * *Account* - A string that consists of exactly 12 digits.
   * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
   * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
   * second "-" dash and from 8 to 32 additional lowercase letters or digits.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-targetids)
   */
  public fun targetIds(): List<String> = unwrap(this).getTargetIds() ?: emptyList()

  /**
   * The type of policy to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param content The policy text content. You can specify the policy content as a JSON object
     * or a JSON string. 
     *
     * When you specify the policy content as a JSON string, you can't perform drift detection on
     * the CloudFormation stack. For this reason, we recommend specifying the policy content as a JSON
     * object instead.
     *
     *
     * The text that you supply must adhere to the rules of the policy type you specify in the
     * `Type` parameter. The following AWS Organizations quotas are enforced for the maximum size of a
     * policy document:
     *
     * * Service control policies: 5,120 characters
     * * AI services opt-out policies: 2,500 characters
     * * Backup policies: 10,000 characters
     * * Tag policies: 10,000 characters
     *
     * For more information about Organizations service quotas, see [Quotas for AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html)
     * in the *AWS Organizations User Guide* .
     */
    public fun content(content: Any)

    /**
     * @param description Human readable description of the policy.
     */
    public fun description(description: String)

    /**
     * @param name Name of the policy. 
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     */
    public fun name(name: String)

    /**
     * @param tags A list of tags that you want to attach to the newly created policy.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for a policy,
     * then the entire request fails and the policy is not created.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags that you want to attach to the newly created policy.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for a policy,
     * then the entire request fails and the policy is not created.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetIds List of unique identifiers (IDs) of the root, OU, or account that you want
     * to attach the policy to.
     * You can get the ID by calling the
     * [ListRoots](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html) ,
     * [ListOrganizationalUnitsForParent](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListOrganizationalUnitsForParent.html)
     * , or
     * [ListAccounts](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListAccounts.html)
     * operations. If you don't specify this parameter, the policy is created but not attached to any
     * organization resource.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a target
     * ID string requires one of the following:
     *
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     * digits.
     * * *Account* - A string that consists of exactly 12 digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
     * second "-" dash and from 8 to 32 additional lowercase letters or digits.
     */
    public fun targetIds(targetIds: List<String>)

    /**
     * @param targetIds List of unique identifiers (IDs) of the root, OU, or account that you want
     * to attach the policy to.
     * You can get the ID by calling the
     * [ListRoots](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html) ,
     * [ListOrganizationalUnitsForParent](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListOrganizationalUnitsForParent.html)
     * , or
     * [ListAccounts](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListAccounts.html)
     * operations. If you don't specify this parameter, the policy is created but not attached to any
     * organization resource.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a target
     * ID string requires one of the following:
     *
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     * digits.
     * * *Account* - A string that consists of exactly 12 digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
     * second "-" dash and from 8 to 32 additional lowercase letters or digits.
     */
    public fun targetIds(vararg targetIds: String)

    /**
     * @param type The type of policy to create. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.organizations.CfnPolicyProps.Builder =
        software.amazon.awscdk.services.organizations.CfnPolicyProps.builder()

    /**
     * @param content The policy text content. You can specify the policy content as a JSON object
     * or a JSON string. 
     *
     * When you specify the policy content as a JSON string, you can't perform drift detection on
     * the CloudFormation stack. For this reason, we recommend specifying the policy content as a JSON
     * object instead.
     *
     *
     * The text that you supply must adhere to the rules of the policy type you specify in the
     * `Type` parameter. The following AWS Organizations quotas are enforced for the maximum size of a
     * policy document:
     *
     * * Service control policies: 5,120 characters
     * * AI services opt-out policies: 2,500 characters
     * * Backup policies: 10,000 characters
     * * Tag policies: 10,000 characters
     *
     * For more information about Organizations service quotas, see [Quotas for AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html)
     * in the *AWS Organizations User Guide* .
     */
    override fun content(content: Any) {
      cdkBuilder.content(content)
    }

    /**
     * @param description Human readable description of the policy.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name Name of the policy. 
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created policy.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for a policy,
     * then the entire request fails and the policy is not created.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created policy.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for a policy,
     * then the entire request fails and the policy is not created.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetIds List of unique identifiers (IDs) of the root, OU, or account that you want
     * to attach the policy to.
     * You can get the ID by calling the
     * [ListRoots](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html) ,
     * [ListOrganizationalUnitsForParent](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListOrganizationalUnitsForParent.html)
     * , or
     * [ListAccounts](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListAccounts.html)
     * operations. If you don't specify this parameter, the policy is created but not attached to any
     * organization resource.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a target
     * ID string requires one of the following:
     *
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     * digits.
     * * *Account* - A string that consists of exactly 12 digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
     * second "-" dash and from 8 to 32 additional lowercase letters or digits.
     */
    override fun targetIds(targetIds: List<String>) {
      cdkBuilder.targetIds(targetIds)
    }

    /**
     * @param targetIds List of unique identifiers (IDs) of the root, OU, or account that you want
     * to attach the policy to.
     * You can get the ID by calling the
     * [ListRoots](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html) ,
     * [ListOrganizationalUnitsForParent](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListOrganizationalUnitsForParent.html)
     * , or
     * [ListAccounts](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListAccounts.html)
     * operations. If you don't specify this parameter, the policy is created but not attached to any
     * organization resource.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a target
     * ID string requires one of the following:
     *
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     * digits.
     * * *Account* - A string that consists of exactly 12 digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
     * second "-" dash and from 8 to 32 additional lowercase letters or digits.
     */
    override fun targetIds(vararg targetIds: String): Unit = targetIds(targetIds.toList())

    /**
     * @param type The type of policy to create. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.organizations.CfnPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.organizations.CfnPolicyProps,
  ) : CdkObject(cdkObject), CfnPolicyProps {
    /**
     * The policy text content. You can specify the policy content as a JSON object or a JSON
     * string.
     *
     *
     * When you specify the policy content as a JSON string, you can't perform drift detection on
     * the CloudFormation stack. For this reason, we recommend specifying the policy content as a JSON
     * object instead.
     *
     *
     * The text that you supply must adhere to the rules of the policy type you specify in the
     * `Type` parameter. The following AWS Organizations quotas are enforced for the maximum size of a
     * policy document:
     *
     * * Service control policies: 5,120 characters
     * * AI services opt-out policies: 2,500 characters
     * * Backup policies: 10,000 characters
     * * Tag policies: 10,000 characters
     *
     * For more information about Organizations service quotas, see [Quotas for AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html)
     * in the *AWS Organizations User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-content)
     */
    override fun content(): Any = unwrap(this).getContent()

    /**
     * Human readable description of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Name of the policy.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of tags that you want to attach to the newly created policy.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for a policy,
     * then the entire request fails and the policy is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * List of unique identifiers (IDs) of the root, OU, or account that you want to attach the
     * policy to.
     *
     * You can get the ID by calling the
     * [ListRoots](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html) ,
     * [ListOrganizationalUnitsForParent](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListOrganizationalUnitsForParent.html)
     * , or
     * [ListAccounts](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListAccounts.html)
     * operations. If you don't specify this parameter, the policy is created but not attached to any
     * organization resource.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a target
     * ID string requires one of the following:
     *
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     * digits.
     * * *Account* - A string that consists of exactly 12 digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
     * second "-" dash and from 8 to 32 additional lowercase letters or digits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-targetids)
     */
    override fun targetIds(): List<String> = unwrap(this).getTargetIds() ?: emptyList()

    /**
     * The type of policy to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnPolicyProps):
        CfnPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyProps):
        software.amazon.awscdk.services.organizations.CfnPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.organizations.CfnPolicyProps
  }
}
