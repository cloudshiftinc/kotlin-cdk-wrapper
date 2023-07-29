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

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.detective.CfnOrganizationAdmin
import software.constructs.Construct

/**
 * The `AWS::Detective::OrganizationAdmin` resource is an Amazon Detective resource type that
 * designates the Detective administrator account for the organization in the current region.
 *
 * If the account does not have Detective enabled, then this resource enables Detective for that
 * account and creates a new behavior graph.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.detective.*;
 * CfnOrganizationAdmin cfnOrganizationAdmin = CfnOrganizationAdmin.Builder.create(this,
 * "MyCfnOrganizationAdmin")
 * .accountId("accountId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
 */
@CdkDslMarker
public class CfnOrganizationAdminDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOrganizationAdmin.Builder =
        CfnOrganizationAdmin.Builder.create(scope, id)

    /**
     * The AWS account identifier of the account to designate as the Detective administrator account
     * for the organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html#cfn-detective-organizationadmin-accountid)
     *
     * @param accountId The AWS account identifier of the account to designate as the Detective
     *   administrator account for the organization.
     */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    public fun build(): CfnOrganizationAdmin = cdkBuilder.build()
}
