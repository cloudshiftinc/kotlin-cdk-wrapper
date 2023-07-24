@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.organizations

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.organizations.CfnOrganization
import software.constructs.Construct
import kotlin.String

/**
 * Creates an AWS organization.
 *
 * The account whose user is calling the
 * [`CreateOrganization`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_CreateOrganization.html)
 * operation automatically becomes the [management
 * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account)
 * of the new organization.
 *
 * This operation must be called using credentials from the account that is to become the new
 * organization's management account. The principal must also have the [relevant IAM
 * permissions](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_create.html)
 * .
 *
 *
 * * If you delete an organization, you can't recover it. If you created any policies inside of the
 * organization, they're also deleted and you can't recover them.
 * * You can delete an organization only after you remove all member accounts from the organization.
 * If you created some of your member accounts using AWS Organizations , you might be blocked from
 * removing those accounts. You can remove a member account only if it has all the information that's
 * required to operate as a standalone AWS account. For more information about how to provide that
 * information and then remove the account, see [Leaving an organization as a member
 * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_leave-as-member)
 * in the *AWS Organizations User Guide* .
 * * If you closed a member account before you remove it from the organization, it enters a
 * 'suspended' state for a period of time and you can't remove the account from the organization until
 * it is finally closed. This can take up to 90 days and can prevent you from deleting the organization
 * until all member accounts are completely closed.
 *
 * For more information, see [Deleting the organization by removing the management
 * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_delete.html) in
 * the *AWS Organizations User Guide* .
 *
 *
 * Example:
 *
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
@CdkDslMarker
public class CfnOrganizationDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnOrganization.Builder = CfnOrganization.Builder.create(scope, id)

    /**
     * Specifies the feature set supported by the new organization. Each feature set supports
     * different levels of functionality.
     *
     * * `ALL`  In addition to all the features supported by the consolidated billing feature set, the
     * management account gains access to advanced features that give you more control over accounts in
     * your organization. By default or if you set the `FeatureSet` property to `ALL` , the new
     * organization is created with all features enabled and service control policies automatically
     * enabled in the
     * [root](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#root)
     * . For more information, see [All
   * features](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all)
     * in the *AWS Organizations User Guide* .
     * * `CONSOLIDATED_BILLING`  All member accounts have their bills consolidated to and paid by the
     * management account. For more information, see [Consolidated
   * billing](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only)
     * in the *AWS Organizations User Guide.*
     *
     * The consolidated billing feature subset isn't available for organizations in the AWS GovCloud
     * (US) Region.
     *
     * Feature set `ALL` provides the following advanced features:
     *
     * * Apply any [policy
   * type](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html#orgs-policy-types)
     * to any member account in the organization.
     * * Apply [service control policies
   * (SCPs)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scps.html)
     * to member accounts that restrict the services and actions that users (including the root user) and
     * roles in an account can access. Using SCPs you can prevent member accounts from leaving the
     * organization.
     * * Enable [integration with supported AWS
   * services](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html)
     * to let those services provide functionality across all of the accounts in your organization.
     *
     * If you don't specify this property, the default value is `ALL` .
     *
     * Default: - "ALL"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organization.html#cfn-organizations-organization-featureset)
     * @param featureSet Specifies the feature set supported by the new organization. Each feature set
     * supports different levels of functionality.
     */
    public fun featureSet(featureSet: String) {
        cdkBuilder.featureSet(featureSet)
    }

    public fun build(): CfnOrganization = cdkBuilder.build()
}
