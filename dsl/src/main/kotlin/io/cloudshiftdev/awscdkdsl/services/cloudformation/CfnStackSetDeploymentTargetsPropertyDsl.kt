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

package io.cloudshiftdev.awscdkdsl.services.cloudformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudformation.CfnStackSet

/**
 * The AWS OrganizationalUnitIds or Accounts for which to create stack instances in the specified
 * Regions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * DeploymentTargetsProperty deploymentTargetsProperty = DeploymentTargetsProperty.builder()
 * .accountFilterType("accountFilterType")
 * .accounts(List.of("accounts"))
 * .organizationalUnitIds(List.of("organizationalUnitIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html)
 */
@CdkDslMarker
public class CfnStackSetDeploymentTargetsPropertyDsl {
    private val cdkBuilder: CfnStackSet.DeploymentTargetsProperty.Builder =
        CfnStackSet.DeploymentTargetsProperty.builder()

    private val _accounts: MutableList<String> = mutableListOf()

    private val _organizationalUnitIds: MutableList<String> = mutableListOf()

    /**
     * @param accountFilterType Limit deployment targets to individual accounts or include
     *   additional accounts with provided OUs. The following is a list of possible values for the
     *   `AccountFilterType` operation.
     * * `INTERSECTION` : StackSets deploys to the accounts specified in `Accounts` parameter.
     * * `DIFFERENCE` : StackSets excludes the accounts specified in `Accounts` parameter. This
     *   enables user to avoid certain accounts within an OU such as suspended accounts.
     * * `UNION` : StackSets includes additional accounts deployment targets.
     *
     * This is the default value if `AccountFilterType` is not provided. This enables user to update
     * an entire OU and individual accounts from a different OU in one request, which used to be two
     * separate requests.
     * * `NONE` : Deploys to all the accounts in specified organizational units (OU).
     */
    public fun accountFilterType(accountFilterType: String) {
        cdkBuilder.accountFilterType(accountFilterType)
    }

    /**
     * @param accounts The names of one or more AWS accounts for which you want to deploy stack set
     *   updates. *Pattern* : `^[0-9]{12}$`
     */
    public fun accounts(vararg accounts: String) {
        _accounts.addAll(listOf(*accounts))
    }

    /**
     * @param accounts The names of one or more AWS accounts for which you want to deploy stack set
     *   updates. *Pattern* : `^[0-9]{12}$`
     */
    public fun accounts(accounts: Collection<String>) {
        _accounts.addAll(accounts)
    }

    /**
     * @param organizationalUnitIds The organization root ID or organizational unit (OU) IDs to
     *   which StackSets deploys. *Pattern* :
     *   `^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$`
     */
    public fun organizationalUnitIds(vararg organizationalUnitIds: String) {
        _organizationalUnitIds.addAll(listOf(*organizationalUnitIds))
    }

    /**
     * @param organizationalUnitIds The organization root ID or organizational unit (OU) IDs to
     *   which StackSets deploys. *Pattern* :
     *   `^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$`
     */
    public fun organizationalUnitIds(organizationalUnitIds: Collection<String>) {
        _organizationalUnitIds.addAll(organizationalUnitIds)
    }

    public fun build(): CfnStackSet.DeploymentTargetsProperty {
        if (_accounts.isNotEmpty()) cdkBuilder.accounts(_accounts)
        if (_organizationalUnitIds.isNotEmpty())
            cdkBuilder.organizationalUnitIds(_organizationalUnitIds)
        return cdkBuilder.build()
    }
}
