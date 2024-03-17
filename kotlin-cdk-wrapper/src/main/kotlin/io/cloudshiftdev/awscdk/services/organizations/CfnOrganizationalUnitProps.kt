@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnOrganizationalUnit`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.organizations.*;
 * CfnOrganizationalUnitProps cfnOrganizationalUnitProps = CfnOrganizationalUnitProps.builder()
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
public interface CfnOrganizationalUnitProps {
  /**
   * The friendly name of this OU.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
   * to validate this parameter is a string of any of the characters in the ASCII character range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-name)
   */
  public fun name(): String

  /**
   * The unique identifier (ID) of the parent root or OU that you want to create the new OU in.
   *
   *
   * To update the `ParentId` parameter value, you must first remove all accounts attached to the
   * organizational unit (OU). OUs can't be moved within the organization with accounts still attached.
   *
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a parent
   * ID string requires one of the following:
   *
   * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
   * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
   * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
   * second "-" dash and from 8 to 32 additional lowercase letters or digits.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-parentid)
   */
  public fun parentId(): String

  /**
   * A list of tags that you want to attach to the newly created OU.
   *
   * For each tag in the list, you must specify both a tag key and a value. You can set the value to
   * an empty string, but you can't set it to `null` . For more information about tagging, see [Tagging
   * AWS Organizations
   * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
   * AWS Organizations User Guide.
   *
   *
   * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU, then
   * the entire request fails and the OU is not created.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnOrganizationalUnitProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The friendly name of this OU. 
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     */
    public fun name(name: String)

    /**
     * @param parentId The unique identifier (ID) of the parent root or OU that you want to create
     * the new OU in. 
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
     */
    public fun parentId(parentId: String)

    /**
     * @param tags A list of tags that you want to attach to the newly created OU.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU,
     * then the entire request fails and the OU is not created.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags that you want to attach to the newly created OU.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU,
     * then the entire request fails and the OU is not created.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps.Builder =
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps.builder()

    /**
     * @param name The friendly name of this OU. 
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parentId The unique identifier (ID) of the parent root or OU that you want to create
     * the new OU in. 
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
     */
    override fun parentId(parentId: String) {
      cdkBuilder.parentId(parentId)
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created OU.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU,
     * then the entire request fails and the OU is not created.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created OU.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU,
     * then the entire request fails and the OU is not created.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps,
  ) : CdkObject(cdkObject), CfnOrganizationalUnitProps {
    /**
     * The friendly name of this OU.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html#cfn-organizations-organizationalunit-name)
     */
    override fun name(): String = unwrap(this).getName()

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
     */
    override fun parentId(): String = unwrap(this).getParentId()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOrganizationalUnitProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps):
        CfnOrganizationalUnitProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnOrganizationalUnitProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationalUnitProps):
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps
  }
}
