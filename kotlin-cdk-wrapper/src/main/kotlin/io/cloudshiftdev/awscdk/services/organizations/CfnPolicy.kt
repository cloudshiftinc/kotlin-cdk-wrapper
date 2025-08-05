@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a policy of a specified type that you can attach to a root, an organizational unit (OU),
 * or an individual AWS account .
 *
 * For more information about policies and their use, see [Managing AWS Organizations
 * policies](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html) .
 *
 * If the request includes tags, then the requester must have the `organizations:TagResource`
 * permission.
 *
 * This operation can be called only from the organization's management account or a member account
 * designated as a delegated administrator.
 *
 *
 * Before you can create a policy of a given type, you must first [enable that policy
 * type](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_enable-disable.html)
 * in your organization.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.organizations.*;
 * Object content;
 * CfnPolicy cfnPolicy = CfnPolicy.Builder.create(this, "MyCfnPolicy")
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
public open class CfnPolicy(
  cdkObject: software.amazon.awscdk.services.organizations.CfnPolicy,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPolicyProps,
  ) :
      this(software.amazon.awscdk.services.organizations.CfnPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPolicyProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) of the policy.
   *
   * For example:
   * `arn:aws:organizations::111111111111:policy/o-exampleorgid/service_control_policy/p-examplepolicyid111`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns a boolean value that indicates whether the specified policy is an AWS managed policy.
   *
   * If true, then you can attach the policy to roots, OUs, or accounts, but you cannot edit it. For
   * example: `true | false` .
   */
  public open fun attrAwsManaged(): IResolvable =
      unwrap(this).getAttrAwsManaged().let(IResolvable::wrap)

  /**
   * Returns the unique identifier (ID) of the policy.
   *
   * For example: `p-examplepolicyid111` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The policy text content.
   *
   * You can specify the policy content as a JSON object or a JSON string.
   */
  public open fun content(): Any = unwrap(this).getContent()

  /**
   * The policy text content.
   *
   * You can specify the policy content as a JSON object or a JSON string.
   */
  public open fun content(`value`: Any) {
    unwrap(this).setContent(`value`)
  }

  /**
   * Human readable description of the policy.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Human readable description of the policy.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Name of the policy.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Name of the policy.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags that you want to attach to the newly created policy.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags that you want to attach to the newly created policy.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags that you want to attach to the newly created policy.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * List of unique identifiers (IDs) of the root, OU, or account that you want to attach the policy
   * to.
   */
  public open fun targetIds(): List<String> = unwrap(this).getTargetIds() ?: emptyList()

  /**
   * List of unique identifiers (IDs) of the root, OU, or account that you want to attach the policy
   * to.
   */
  public open fun targetIds(`value`: List<String>) {
    unwrap(this).setTargetIds(`value`)
  }

  /**
   * List of unique identifiers (IDs) of the root, OU, or account that you want to attach the policy
   * to.
   */
  public open fun targetIds(vararg `value`: String): Unit = targetIds(`value`.toList())

  /**
   * The type of policy to create.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of policy to create.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.organizations.CfnPolicy].
   */
  @CdkDslMarker
  public interface Builder {
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
     * * Resource control policies: 5,120 characters
     * * Declarative policies: 10,000 characters
     * * Backup policies: 10,000 characters
     * * Tag policies: 10,000 characters
     * * Chat applications policies: 10,000 characters
     * * AI services opt-out policies: 2,500 characters
     *
     * For more information about Organizations service quotas, see [Quotas for AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html)
     * in the *AWS Organizations User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-content)
     * @param content The policy text content. You can specify the policy content as a JSON object
     * or a JSON string. 
     */
    public fun content(content: Any)

    /**
     * Human readable description of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-description)
     * @param description Human readable description of the policy. 
     */
    public fun description(description: String)

    /**
     * Name of the policy.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-name)
     * @param name Name of the policy. 
     */
    public fun name(name: String)

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
     * @param tags A list of tags that you want to attach to the newly created policy. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of tags that you want to attach to the newly created policy. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param targetIds List of unique identifiers (IDs) of the root, OU, or account that you want
     * to attach the policy to. 
     */
    public fun targetIds(targetIds: List<String>)

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
     * @param targetIds List of unique identifiers (IDs) of the root, OU, or account that you want
     * to attach the policy to. 
     */
    public fun targetIds(vararg targetIds: String)

    /**
     * The type of policy to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-type)
     * @param type The type of policy to create. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.organizations.CfnPolicy.Builder =
        software.amazon.awscdk.services.organizations.CfnPolicy.Builder.create(scope, id)

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
     * * Resource control policies: 5,120 characters
     * * Declarative policies: 10,000 characters
     * * Backup policies: 10,000 characters
     * * Tag policies: 10,000 characters
     * * Chat applications policies: 10,000 characters
     * * AI services opt-out policies: 2,500 characters
     *
     * For more information about Organizations service quotas, see [Quotas for AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html)
     * in the *AWS Organizations User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-content)
     * @param content The policy text content. You can specify the policy content as a JSON object
     * or a JSON string. 
     */
    override fun content(content: Any) {
      cdkBuilder.content(content)
    }

    /**
     * Human readable description of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-description)
     * @param description Human readable description of the policy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Name of the policy.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-name)
     * @param name Name of the policy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param tags A list of tags that you want to attach to the newly created policy. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

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
     * @param tags A list of tags that you want to attach to the newly created policy. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param targetIds List of unique identifiers (IDs) of the root, OU, or account that you want
     * to attach the policy to. 
     */
    override fun targetIds(targetIds: List<String>) {
      cdkBuilder.targetIds(targetIds)
    }

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
     * @param targetIds List of unique identifiers (IDs) of the root, OU, or account that you want
     * to attach the policy to. 
     */
    override fun targetIds(vararg targetIds: String): Unit = targetIds(targetIds.toList())

    /**
     * The type of policy to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-type)
     * @param type The type of policy to create. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.organizations.CfnPolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.organizations.CfnPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnPolicy): CfnPolicy
        = CfnPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnPolicy): software.amazon.awscdk.services.organizations.CfnPolicy
        = wrapped.cdkObject as software.amazon.awscdk.services.organizations.CfnPolicy
  }
}
