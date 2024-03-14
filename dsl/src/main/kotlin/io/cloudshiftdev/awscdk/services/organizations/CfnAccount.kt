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

public open class CfnAccount internal constructor(
  private val cdkObject: software.amazon.awscdk.services.organizations.CfnAccount,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The account name given to the account when it was created.
   */
  public open fun accountName(): String = unwrap(this).getAccountName()

  /**
   * The account name given to the account when it was created.
   */
  public open fun accountName(`value`: String) {
    unwrap(this).setAccountName(`value`)
  }

  /**
   * Returns the unique identifier (ID) of the account.
   *
   * For example: `123456789012` .
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * Returns the Amazon Resource Name (ARN) of the account.
   *
   * For example: `arn:aws:organizations::111111111111:account/o-exampleorgid/555555555555` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the method by which the account joined the organization.
   *
   * For example: `INVITED | CREATED` .
   */
  public open fun attrJoinedMethod(): String = unwrap(this).getAttrJoinedMethod()

  /**
   * Returns the date the account became a part of the organization.
   *
   * For example: `2016-11-24T11:11:48-08:00` .
   */
  public open fun attrJoinedTimestamp(): String = unwrap(this).getAttrJoinedTimestamp()

  /**
   * Returns the status of the account in the organization.
   *
   * For example: `ACTIVE | SUSPENDED | PENDING_CLOSURE` .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The email address associated with the AWS account.
   */
  public open fun email(): String = unwrap(this).getEmail()

  /**
   * The email address associated with the AWS account.
   */
  public open fun email(`value`: String) {
    unwrap(this).setEmail(`value`)
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
   * The unique identifier (ID) of the root or organizational unit (OU) that you want to create the
   * new account in.
   */
  public open fun parentIds(): List<String> = unwrap(this).getParentIds() ?: emptyList()

  /**
   * The unique identifier (ID) of the root or organizational unit (OU) that you want to create the
   * new account in.
   */
  public open fun parentIds(`value`: List<String>) {
    unwrap(this).setParentIds(`value`)
  }

  /**
   * The unique identifier (ID) of the root or organizational unit (OU) that you want to create the
   * new account in.
   */
  public open fun parentIds(vararg `value`: String): Unit = parentIds(`value`.toList())

  /**
   * The name of an IAM role that AWS Organizations automatically preconfigures in the new member
   * account.
   */
  public open fun roleName(): String? = unwrap(this).getRoleName()

  /**
   * The name of an IAM role that AWS Organizations automatically preconfigures in the new member
   * account.
   */
  public open fun roleName(`value`: String) {
    unwrap(this).setRoleName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags that you want to attach to the newly created account.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags that you want to attach to the newly created account.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags that you want to attach to the newly created account.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.organizations.CfnAccount].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The account name given to the account when it was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-accountname)
     * @param accountName The account name given to the account when it was created. 
     */
    public fun accountName(accountName: String)

    /**
     * The email address associated with the AWS account.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for this
     * parameter is a string of characters that represents a standard internet email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-email)
     * @param email The email address associated with the AWS account. 
     */
    public fun email(email: String)

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
     * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
     * want to create the new account in. 
     */
    public fun parentIds(parentIds: List<String>)

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
     * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
     * want to create the new account in. 
     */
    public fun parentIds(vararg parentIds: String)

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
     * @param roleName The name of an IAM role that AWS Organizations automatically preconfigures in
     * the new member account. 
     */
    public fun roleName(roleName: String)

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
     * @param tags A list of tags that you want to attach to the newly created account. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of tags that you want to attach to the newly created account. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.organizations.CfnAccount.Builder =
        software.amazon.awscdk.services.organizations.CfnAccount.Builder.create(scope, id)

    /**
     * The account name given to the account when it was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-accountname)
     * @param accountName The account name given to the account when it was created. 
     */
    override fun accountName(accountName: String) {
      cdkBuilder.accountName(accountName)
    }

    /**
     * The email address associated with the AWS account.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for this
     * parameter is a string of characters that represents a standard internet email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-email)
     * @param email The email address associated with the AWS account. 
     */
    override fun email(email: String) {
      cdkBuilder.email(email)
    }

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
     * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
     * want to create the new account in. 
     */
    override fun parentIds(parentIds: List<String>) {
      cdkBuilder.parentIds(parentIds)
    }

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
     * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
     * want to create the new account in. 
     */
    override fun parentIds(vararg parentIds: String): Unit = parentIds(parentIds.toList())

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
     * @param roleName The name of an IAM role that AWS Organizations automatically preconfigures in
     * the new member account. 
     */
    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

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
     * @param tags A list of tags that you want to attach to the newly created account. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags A list of tags that you want to attach to the newly created account. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.organizations.CfnAccount =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccount {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccount(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnAccount):
        CfnAccount = CfnAccount(cdkObject)

    internal fun unwrap(wrapped: CfnAccount):
        software.amazon.awscdk.services.organizations.CfnAccount = wrapped.cdkObject
  }
}
