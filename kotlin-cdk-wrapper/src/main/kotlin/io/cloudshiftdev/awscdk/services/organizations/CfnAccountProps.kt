@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAccount`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.organizations.*;
 * CfnAccountProps cfnAccountProps = CfnAccountProps.builder()
 * .accountName("accountName")
 * .email("email")
 * // the properties below are optional
 * .parentIds(List.of("parentIds"))
 * .roleName("roleName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html)
 */
public interface CfnAccountProps {
  /**
   * The account name given to the account when it was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-accountname)
   */
  public fun accountName(): String

  /**
   * The email address associated with the AWS account.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for this
   * parameter is a string of characters that represents a standard internet email address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-email)
   */
  public fun email(): String

  /**
   * The unique identifier (ID) of the root or organizational unit (OU) that you want to create the
   * new account in.
   *
   * If you don't specify this parameter, the `ParentId` defaults to the root ID.
   *
   * This parameter only accepts a string array with one string value.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a parent
   * ID string requires one of the following:
   *
   * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
   * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
   * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
   * second "-" dash and from 8 to 32 additional lowercase letters or digits.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-parentids)
   */
  public fun parentIds(): List<String> = unwrap(this).getParentIds() ?: emptyList()

  /**
   * The name of an IAM role that AWS Organizations automatically preconfigures in the new member
   * account.
   *
   * This role trusts the management account, allowing users in the management account to assume the
   * role, as permitted by the management account administrator. The role has administrator permissions
   * in the new member account.
   *
   * If you don't specify this parameter, the role name defaults to `OrganizationAccountAccessRole`
   * .
   *
   * For more information about how to use this role to access the member account, see the following
   * links:
   *
   * * [Creating the OrganizationAccountAccessRole in an invited member
   * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role)
   * in the *AWS Organizations User Guide*
   * * Steps 2 and 3 in [IAM Tutorial: Delegate access across AWS accounts using IAM
   * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html) in
   * the *IAM User Guide*
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
   * to validate this parameter. The pattern can include uppercase letters, lowercase letters, digits
   * with no spaces, and any of the following characters: =,.&#64;-
   *
   * Default: - "OrganizationAccountAccessRole"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-rolename)
   */
  public fun roleName(): String? = unwrap(this).getRoleName()

  /**
   * A list of tags that you want to attach to the newly created account.
   *
   * For each tag in the list, you must specify both a tag key and a value. You can set the value to
   * an empty string, but you can't set it to `null` . For more information about tagging, see [Tagging
   * AWS Organizations
   * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
   * AWS Organizations User Guide.
   *
   *
   * If any one of the tags is not valid or if you exceed the maximum allowed number of tags for an
   * account, then the entire request fails and the account is not created.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAccountProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountName The account name given to the account when it was created. 
     */
    public fun accountName(accountName: String)

    /**
     * @param email The email address associated with the AWS account. 
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for this
     * parameter is a string of characters that represents a standard internet email address.
     */
    public fun email(email: String)

    /**
     * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
     * want to create the new account in.
     * If you don't specify this parameter, the `ParentId` defaults to the root ID.
     *
     * This parameter only accepts a string array with one string value.
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
    public fun parentIds(parentIds: List<String>)

    /**
     * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
     * want to create the new account in.
     * If you don't specify this parameter, the `ParentId` defaults to the root ID.
     *
     * This parameter only accepts a string array with one string value.
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
    public fun parentIds(vararg parentIds: String)

    /**
     * @param roleName The name of an IAM role that AWS Organizations automatically preconfigures in
     * the new member account.
     * This role trusts the management account, allowing users in the management account to assume
     * the role, as permitted by the management account administrator. The role has administrator
     * permissions in the new member account.
     *
     * If you don't specify this parameter, the role name defaults to
     * `OrganizationAccountAccessRole` .
     *
     * For more information about how to use this role to access the member account, see the
     * following links:
     *
     * * [Creating the OrganizationAccountAccessRole in an invited member
     * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role)
     * in the *AWS Organizations User Guide*
     * * Steps 2 and 3 in [IAM Tutorial: Delegate access across AWS accounts using IAM
     * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html)
     * in the *IAM User Guide*
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter. The pattern can include uppercase letters, lowercase letters, digits
     * with no spaces, and any of the following characters: =,.&#64;-
     */
    public fun roleName(roleName: String)

    /**
     * @param tags A list of tags that you want to attach to the newly created account.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the maximum allowed number of tags for
     * an account, then the entire request fails and the account is not created.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags that you want to attach to the newly created account.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the maximum allowed number of tags for
     * an account, then the entire request fails and the account is not created.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.organizations.CfnAccountProps.Builder =
        software.amazon.awscdk.services.organizations.CfnAccountProps.builder()

    /**
     * @param accountName The account name given to the account when it was created. 
     */
    override fun accountName(accountName: String) {
      cdkBuilder.accountName(accountName)
    }

    /**
     * @param email The email address associated with the AWS account. 
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for this
     * parameter is a string of characters that represents a standard internet email address.
     */
    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    /**
     * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
     * want to create the new account in.
     * If you don't specify this parameter, the `ParentId` defaults to the root ID.
     *
     * This parameter only accepts a string array with one string value.
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
    override fun parentIds(parentIds: List<String>) {
      cdkBuilder.parentIds(parentIds)
    }

    /**
     * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
     * want to create the new account in.
     * If you don't specify this parameter, the `ParentId` defaults to the root ID.
     *
     * This parameter only accepts a string array with one string value.
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
    override fun parentIds(vararg parentIds: String): Unit = parentIds(parentIds.toList())

    /**
     * @param roleName The name of an IAM role that AWS Organizations automatically preconfigures in
     * the new member account.
     * This role trusts the management account, allowing users in the management account to assume
     * the role, as permitted by the management account administrator. The role has administrator
     * permissions in the new member account.
     *
     * If you don't specify this parameter, the role name defaults to
     * `OrganizationAccountAccessRole` .
     *
     * For more information about how to use this role to access the member account, see the
     * following links:
     *
     * * [Creating the OrganizationAccountAccessRole in an invited member
     * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role)
     * in the *AWS Organizations User Guide*
     * * Steps 2 and 3 in [IAM Tutorial: Delegate access across AWS accounts using IAM
     * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html)
     * in the *IAM User Guide*
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter. The pattern can include uppercase letters, lowercase letters, digits
     * with no spaces, and any of the following characters: =,.&#64;-
     */
    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created account.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the maximum allowed number of tags for
     * an account, then the entire request fails and the account is not created.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created account.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the maximum allowed number of tags for
     * an account, then the entire request fails and the account is not created.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.organizations.CfnAccountProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.organizations.CfnAccountProps,
  ) : CdkObject(cdkObject), CfnAccountProps {
    /**
     * The account name given to the account when it was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-accountname)
     */
    override fun accountName(): String = unwrap(this).getAccountName()

    /**
     * The email address associated with the AWS account.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for this
     * parameter is a string of characters that represents a standard internet email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-email)
     */
    override fun email(): String = unwrap(this).getEmail()

    /**
     * The unique identifier (ID) of the root or organizational unit (OU) that you want to create
     * the new account in.
     *
     * If you don't specify this parameter, the `ParentId` defaults to the root ID.
     *
     * This parameter only accepts a string array with one string value.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-parentids)
     */
    override fun parentIds(): List<String> = unwrap(this).getParentIds() ?: emptyList()

    /**
     * The name of an IAM role that AWS Organizations automatically preconfigures in the new member
     * account.
     *
     * This role trusts the management account, allowing users in the management account to assume
     * the role, as permitted by the management account administrator. The role has administrator
     * permissions in the new member account.
     *
     * If you don't specify this parameter, the role name defaults to
     * `OrganizationAccountAccessRole` .
     *
     * For more information about how to use this role to access the member account, see the
     * following links:
     *
     * * [Creating the OrganizationAccountAccessRole in an invited member
     * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role)
     * in the *AWS Organizations User Guide*
     * * Steps 2 and 3 in [IAM Tutorial: Delegate access across AWS accounts using IAM
     * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html)
     * in the *IAM User Guide*
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter. The pattern can include uppercase letters, lowercase letters, digits
     * with no spaces, and any of the following characters: =,.&#64;-
     *
     * Default: - "OrganizationAccountAccessRole"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-rolename)
     */
    override fun roleName(): String? = unwrap(this).getRoleName()

    /**
     * A list of tags that you want to attach to the newly created account.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * AWS Organizations User Guide.
     *
     *
     * If any one of the tags is not valid or if you exceed the maximum allowed number of tags for
     * an account, then the entire request fails and the account is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnAccountProps):
        CfnAccountProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountProps):
        software.amazon.awscdk.services.organizations.CfnAccountProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.organizations.CfnAccountProps
  }
}
