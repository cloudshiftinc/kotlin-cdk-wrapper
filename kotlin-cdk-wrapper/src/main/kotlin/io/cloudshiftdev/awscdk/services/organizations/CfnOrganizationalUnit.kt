@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

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

/**
 * Creates an organizational unit (OU) within a root or parent OU.
 *
 * An OU is a container for accounts that enables you to organize your accounts to apply policies
 * according to your business requirements. The number of levels deep that you can nest OUs is
 * dependent upon the policy types enabled for that root. For service control policies, the limit is
 * five.
 *
 * For more information about OUs, see [Managing organizational units
 * (OUs)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html) in the *AWS
 * Organizations User Guide* .
 *
 * If the request includes tags, then the requester must have the `organizations:TagResource`
 * permission.
 *
 * This operation can be called only from the organization's management account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.organizations.*;
 * CfnOrganizationalUnit cfnOrganizationalUnit = CfnOrganizationalUnit.Builder.create(this,
 * "MyCfnOrganizationalUnit")
 * .name("name")
 * .parentId("parentId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html)
 */
public open class CfnOrganizationalUnit internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.organizations.CfnOrganizationalUnit,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOrganizationalUnitProps,
  ) :
      this(software.amazon.awscdk.services.organizations.CfnOrganizationalUnit(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnOrganizationalUnitProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOrganizationalUnitProps.Builder.() -> Unit,
  ) : this(scope, id, CfnOrganizationalUnitProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of this OU.
   *
   * For example:
   * `arn:aws:organizations::111111111111:ou/o-exampleorgid/ou-examplerootid111-exampleouid111` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier (ID) associated with this OU.
   *
   * For example: `ou-examplerootid111-exampleouid111` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The friendly name of this OU.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The friendly name of this OU.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The unique identifier (ID) of the parent root or OU that you want to create the new OU in.
   */
  public open fun parentId(): String = unwrap(this).getParentId()

  /**
   * The unique identifier (ID) of the parent root or OU that you want to create the new OU in.
   */
  public open fun parentId(`value`: String) {
    unwrap(this).setParentId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags that you want to attach to the newly created OU.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags that you want to attach to the newly created OU.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags that you want to attach to the newly created OU.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.organizations.CfnOrganizationalUnit].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The friendly name of this OU.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-name)
     * @param name The friendly name of this OU. 
     */
    public fun name(name: String)

    /**
     * The unique identifier (ID) of the parent root or OU that you want to create the new OU in.
     *
     *
     * To update the `ParentId` parameter value, you must first remove all accounts attached to the
     * organizational unit (OU). OUs can't be moved within the organization with accounts still
     * attached.
     *
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a parent
     * ID string requires one of the following:
     *
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     * digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
     * second "-" dash and from 8 to 32 additional lowercase letters or digits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-parentid)
     * @param parentId The unique identifier (ID) of the parent root or OU that you want to create
     * the new OU in. 
     */
    public fun parentId(parentId: String)

    /**
     * A list of tags that you want to attach to the newly created OU.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU,
     * then the entire request fails and the OU is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-tags)
     * @param tags A list of tags that you want to attach to the newly created OU. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags that you want to attach to the newly created OU.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU,
     * then the entire request fails and the OU is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-tags)
     * @param tags A list of tags that you want to attach to the newly created OU. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnit.Builder =
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnit.Builder.create(scope,
        id)

    /**
     * The friendly name of this OU.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-name)
     * @param name The friendly name of this OU. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The unique identifier (ID) of the parent root or OU that you want to create the new OU in.
     *
     *
     * To update the `ParentId` parameter value, you must first remove all accounts attached to the
     * organizational unit (OU). OUs can't be moved within the organization with accounts still
     * attached.
     *
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a parent
     * ID string requires one of the following:
     *
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     * digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
     * second "-" dash and from 8 to 32 additional lowercase letters or digits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-parentid)
     * @param parentId The unique identifier (ID) of the parent root or OU that you want to create
     * the new OU in. 
     */
    override fun parentId(parentId: String) {
      cdkBuilder.parentId(parentId)
    }

    /**
     * A list of tags that you want to attach to the newly created OU.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU,
     * then the entire request fails and the OU is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-tags)
     * @param tags A list of tags that you want to attach to the newly created OU. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags that you want to attach to the newly created OU.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU,
     * then the entire request fails and the OU is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-tags)
     * @param tags A list of tags that you want to attach to the newly created OU. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.organizations.CfnOrganizationalUnit =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnit.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOrganizationalUnit {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOrganizationalUnit(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnOrganizationalUnit):
        CfnOrganizationalUnit = CfnOrganizationalUnit(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationalUnit):
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnit = wrapped.cdkObject
  }
}
