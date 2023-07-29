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

package cloudshift.awscdk.dsl.services.organizations

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.organizations.CfnAccount
import software.amazon.awscdk.services.organizations.CfnAccountProps
import software.amazon.awscdk.services.organizations.CfnOrganization
import software.amazon.awscdk.services.organizations.CfnOrganizationProps
import software.amazon.awscdk.services.organizations.CfnOrganizationalUnit
import software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps
import software.amazon.awscdk.services.organizations.CfnPolicy
import software.amazon.awscdk.services.organizations.CfnPolicyProps
import software.amazon.awscdk.services.organizations.CfnResourcePolicy
import software.amazon.awscdk.services.organizations.CfnResourcePolicyProps
import software.constructs.Construct

public object organizations {
    /**
     * Creates an AWS account that is automatically a member of the organization whose credentials
     * made the request.
     *
     * AWS CloudFormation uses the
     * [`CreateAccount`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_CreateAccount.html)
     * operation to create accounts. This is an asynchronous request that AWS performs in the
     * background. Because `CreateAccount` operates asynchronously, it can return a successful
     * completion message even though account initialization might still be in progress. You might
     * need to wait a few minutes before you can successfully access the account. To check the
     * status of the request, do one of the following:
     * * Use the `Id` value of the `CreateAccountStatus` response element from the `CreateAccount`
     *   operation to provide as a parameter to the
     *   [`DescribeCreateAccountStatus`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_DescribeCreateAccountStatus.html)
     *   operation.
     * * Check the CloudTrail log for the `CreateAccountResult` event. For information on using
     *   CloudTrail with AWS Organizations , see
     *   [Logging and monitoring in AWS Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_security_incident-response.html#orgs_cloudtrail-integration)
     *   in the *AWS Organizations User Guide.*
     *
     * The user who calls the API to create an account must have the `organizations:CreateAccount`
     * permission. If you enabled all features in the organization, AWS Organizations creates the
     * required service-linked role named `AWSServiceRoleForOrganizations` . For more information,
     * see
     * [AWS Organizations and Service-Linked Roles](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs)
     * in the *AWS Organizations User Guide* .
     *
     * If the request includes tags, then the requester must have the `organizations:TagResource`
     * permission.
     *
     * AWS Organizations preconfigures the new member account with a role (named
     * `OrganizationAccountAccessRole` by default) that grants users in the management account
     * administrator permissions in the new member account. Principals in the management account can
     * assume the role. AWS Organizations clones the company name and address information for the
     * new account from the organization's management account.
     *
     * For more information about creating accounts, see
     * [Creating an AWS account in Your Organization](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html)
     * in the *AWS Organizations User Guide.*
     *
     * This operation can be called only from the organization's management account.
     *
     * *Deleting Account resources*
     *
     * The default `DeletionPolicy` for resource `AWS::Organizations::Account` is `Retain` . For
     * more information about how AWS CloudFormation deletes resources, see
     * [DeletionPolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * .
     * * If you include multiple accounts in a single template, you must use the `DependsOn`
     *   attribute on each account resource type so that the accounts are created sequentially. If
     *   you create multiple accounts at the same time, Organizations returns an error and the stack
     *   operation fails.
     * * You can't modify the following list of `Account` resource parameters using AWS
     *   CloudFormation updates.
     * * AccountName
     * * Email
     * * RoleName
     *
     * If you attempt to update the listed parameters, CloudFormation will attempt the update, but
     * you will receive an error message as those updates are not supported from an Organizations
     * management account or a
     * [registered delegated administrator](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html)
     * account. Both the update and the update roll-back will fail, so you must skip the account
     * resource update. To update parameters `AccountName` and `Email` , you must sign in to the AWS
     * Management Console as the AWS account root user. For more information, see
     * [Modifying the account name, email address, or password for the AWS account root user](https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-root-user.html)
     * in the *AWS Account Management Reference Guide* .
     * * When you create an account in an organization using the AWS Organizations console, API, or
     *   AWS CLI commands, we don't automatically collect the information required for the account
     *   to operate as a standalone account. That includes collecting the payment method and signing
     *   the end user license agreement (EULA). If you must remove an account from your organization
     *   later, you can do so only after you provide the missing information. Follow the steps at
     *   [To leave an organization as a member account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info)
     *   in the *AWS Organizations User Guide* .
     * * When you create an account in an organization using AWS CloudFormation , you can't specify
     *   a value for the `CreateAccount` operation parameter `IamUserAccessToBilling` . The default
     *   value for parameter `IamUserAccessToBilling` is `ALLOW` , and IAM users and roles with the
     *   required permissions can access billing information for the new account.
     * * If you get an exception that indicates `DescribeCreateAccountStatus returns IN_PROGRESS
     *   state before time out` . You must check the account creation status using the
     *   [`DescribeCreateAccountStatus`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_DescribeCreateAccountStatus.html)
     *   operation. If the account state returns as `SUCCEEDED` , you can import the account into
     *   AWS CloudFormation management using
     *   [`resource import`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import.html)
     *   .
     * * If you get an exception that indicates you have exceeded your account quota for the
     *   organization, you can request an increase by using the
     *   [Service Quotas console](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html)
     *   .
     * * If you get an exception that indicates the operation failed because your organization is
     *   still initializing, wait one hour and then try again. If the error persists, contact
     *   [AWS Support](https://docs.aws.amazon.com/support/home#/) .
     * * We don't recommend that you use the `CreateAccount` operation to create multiple temporary
     *   accounts. You can close accounts using the
     *   [`CloseAccount`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_CloseAccount.html)
     *   operation or from the AWS Organizations console in the organization's management account.
     *   For information on the requirements and process for closing an account, see
     *   [Closing an AWS account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html)
     *   in the *AWS Organizations User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.organizations.*;
     * CfnAccount cfnAccount = CfnAccount.Builder.create(this, "MyCfnAccount")
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
    public inline fun cfnAccount(
        scope: Construct,
        id: String,
        block: CfnAccountDsl.() -> Unit = {},
    ): CfnAccount {
        val builder = CfnAccountDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnAccountProps(block: CfnAccountPropsDsl.() -> Unit = {}): CfnAccountProps {
        val builder = CfnAccountPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an AWS organization.
     *
     * The account whose user is calling the
     * [`CreateOrganization`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_CreateOrganization.html)
     * operation automatically becomes the
     * [management account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account)
     * of the new organization.
     *
     * This operation must be called using credentials from the account that is to become the new
     * organization's management account. The principal must also have the
     * [relevant IAM permissions](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_create.html)
     * .
     * * If you delete an organization, you can't recover it. If you created any policies inside of
     *   the organization, they're also deleted and you can't recover them.
     * * You can delete an organization only after you remove all member accounts from the
     *   organization. If you created some of your member accounts using AWS Organizations , you
     *   might be blocked from removing those accounts. You can remove a member account only if it
     *   has all the information that's required to operate as a standalone AWS account. For more
     *   information about how to provide that information and then remove the account, see
     *   [Leaving an organization as a member account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_leave-as-member)
     *   in the *AWS Organizations User Guide* .
     * * If you closed a member account before you remove it from the organization, it enters a
     *   'suspended' state for a period of time and you can't remove the account from the
     *   organization until it is finally closed. This can take up to 90 days and can prevent you
     *   from deleting the organization until all member accounts are completely closed.
     *
     * For more information, see
     * [Deleting the organization by removing the management account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_delete.html)
     * in the *AWS Organizations User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.organizations.*;
     * CfnOrganization cfnOrganization = CfnOrganization.Builder.create(this, "MyCfnOrganization")
     * .featureSet("featureSet")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organization.html)
     */
    public inline fun cfnOrganization(
        scope: Construct,
        id: String,
        block: CfnOrganizationDsl.() -> Unit = {},
    ): CfnOrganization {
        val builder = CfnOrganizationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOrganization`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.organizations.*;
     * CfnOrganizationProps cfnOrganizationProps = CfnOrganizationProps.builder()
     * .featureSet("featureSet")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organization.html)
     */
    public inline fun cfnOrganizationProps(
        block: CfnOrganizationPropsDsl.() -> Unit = {}
    ): CfnOrganizationProps {
        val builder = CfnOrganizationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an organizational unit (OU) within a root or parent OU.
     *
     * An OU is a container for accounts that enables you to organize your accounts to apply
     * policies according to your business requirements. The number of levels deep that you can nest
     * OUs is dependent upon the policy types enabled for that root. For service control policies,
     * the limit is five.
     *
     * For more information about OUs, see
     * [Managing Organizational Units](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html)
     * in the *AWS Organizations User Guide.*
     *
     * If the request includes tags, then the requester must have the `organizations:TagResource`
     * permission.
     *
     * This operation can be called only from the organization's management account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.organizations.*;
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
    public inline fun cfnOrganizationalUnit(
        scope: Construct,
        id: String,
        block: CfnOrganizationalUnitDsl.() -> Unit = {},
    ): CfnOrganizationalUnit {
        val builder = CfnOrganizationalUnitDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOrganizationalUnit`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.organizations.*;
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
    public inline fun cfnOrganizationalUnitProps(
        block: CfnOrganizationalUnitPropsDsl.() -> Unit = {}
    ): CfnOrganizationalUnitProps {
        val builder = CfnOrganizationalUnitPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a policy of a specified type that you can attach to a root, an organizational unit
     * (OU), or an individual AWS account .
     *
     * For more information about policies and their use, see
     * [Managing Organization Policies](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html)
     * .
     *
     * If the request includes tags, then the requester must have the `organizations:TagResource`
     * permission.
     *
     * This operation can be called only from the organization's management account.
     *
     * Before you can create a policy of a given type, you must first
     * [enable that policy type](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_enable-disable.html)
     * in your organization.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.organizations.*;
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
    public inline fun cfnPolicy(
        scope: Construct,
        id: String,
        block: CfnPolicyDsl.() -> Unit = {},
    ): CfnPolicy {
        val builder = CfnPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.organizations.*;
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
    public inline fun cfnPolicyProps(block: CfnPolicyPropsDsl.() -> Unit = {}): CfnPolicyProps {
        val builder = CfnPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates a resource-based delegation policy that can be used to delegate policy
     * management for AWS Organizations to specified member accounts to perform policy actions that
     * are by default available only to the management account.
     *
     * For more information about delegated policy management, see
     * [Delegated administrator for AWS Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_delegate_policies.html)
     * in the *AWS Organizations User Guide* .
     *
     * You can only call this operation from the organization's management account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.organizations.*;
     * Object content;
     * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
     * "MyCfnResourcePolicy")
     * .content(content)
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicy(
        scope: Construct,
        id: String,
        block: CfnResourcePolicyDsl.() -> Unit = {},
    ): CfnResourcePolicy {
        val builder = CfnResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourcePolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.organizations.*;
     * Object content;
     * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
     * .content(content)
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicyProps(
        block: CfnResourcePolicyPropsDsl.() -> Unit = {}
    ): CfnResourcePolicyProps {
        val builder = CfnResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
