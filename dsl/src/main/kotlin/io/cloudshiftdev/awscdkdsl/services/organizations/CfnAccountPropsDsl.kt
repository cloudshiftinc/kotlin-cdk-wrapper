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

package io.cloudshiftdev.awscdkdsl.services.organizations

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.organizations.CfnAccountProps

/**
 * Properties for defining a `CfnAccount`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.organizations.*;
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
@CdkDslMarker
public class CfnAccountPropsDsl {
    private val cdkBuilder: CfnAccountProps.Builder = CfnAccountProps.builder()

    private val _parentIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param accountName The account name given to the account when it was created. */
    public fun accountName(accountName: String) {
        cdkBuilder.accountName(accountName)
    }

    /**
     * @param email The email address associated with the AWS account. The
     *   [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for this
     *   parameter is a string of characters that represents a standard internet email address.
     */
    public fun email(email: String) {
        cdkBuilder.email(email)
    }

    /**
     * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
     *   want to create the new account in. If you don't specify this parameter, the `ParentId`
     *   defaults to the root ID.
     *
     * This parameter only accepts a string array with one string value.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a parent
     * ID string requires one of the following:
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     *   digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     *   lowercase letters or digits (the ID of the root that the OU is in). This string is followed
     *   by a second "-" dash and from 8 to 32 additional lowercase letters or digits.
     */
    public fun parentIds(vararg parentIds: String) {
        _parentIds.addAll(listOf(*parentIds))
    }

    /**
     * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
     *   want to create the new account in. If you don't specify this parameter, the `ParentId`
     *   defaults to the root ID.
     *
     * This parameter only accepts a string array with one string value.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a parent
     * ID string requires one of the following:
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     *   digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     *   lowercase letters or digits (the ID of the root that the OU is in). This string is followed
     *   by a second "-" dash and from 8 to 32 additional lowercase letters or digits.
     */
    public fun parentIds(parentIds: Collection<String>) {
        _parentIds.addAll(parentIds)
    }

    /**
     * @param roleName The name of an IAM role that AWS Organizations automatically preconfigures in
     *   the new member account. This role trusts the management account, allowing users in the
     *   management account to assume the role, as permitted by the management account
     *   administrator. The role has administrator permissions in the new member account.
     *
     * If you don't specify this parameter, the role name defaults to
     * `OrganizationAccountAccessRole` .
     *
     * For more information about how to use this role to access the member account, see the
     * following links:
     * * [Creating the OrganizationAccountAccessRole in an invited member
     *   account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role)
     *   in the *AWS Organizations User Guide*
     * * Steps 2 and 3 in
     *   [IAM Tutorial: Delegate access across AWS accounts using IAM roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html)
     *   in the *IAM User Guide*
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter. The pattern can include uppercase letters, lowercase letters,
     * digits with no spaces, and any of the following characters: =,.&#64;-
     */
    public fun roleName(roleName: String) {
        cdkBuilder.roleName(roleName)
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created account. For each tag
     *   in the list, you must specify both a tag key and a value. You can set the value to an empty
     *   string, but you can't set it to `null` . For more information about tagging, see
     *   [Tagging AWS Organizations resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html)
     *   in the AWS Organizations User Guide.
     *
     * If any one of the tags is not valid or if you exceed the maximum allowed number of tags for
     * an account, then the entire request fails and the account is not created.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created account. For each tag
     *   in the list, you must specify both a tag key and a value. You can set the value to an empty
     *   string, but you can't set it to `null` . For more information about tagging, see
     *   [Tagging AWS Organizations resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html)
     *   in the AWS Organizations User Guide.
     *
     * If any one of the tags is not valid or if you exceed the maximum allowed number of tags for
     * an account, then the entire request fails and the account is not created.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAccountProps {
        if (_parentIds.isNotEmpty()) cdkBuilder.parentIds(_parentIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
