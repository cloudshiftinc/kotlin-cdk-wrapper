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

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup

/**
 * The set of accounts that will be under the billing group.
 *
 * The set of accounts resemble the linked accounts in a consolidated family.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.billingconductor.*;
 * AccountGroupingProperty accountGroupingProperty = AccountGroupingProperty.builder()
 * .linkedAccountIds(List.of("linkedAccountIds"))
 * // the properties below are optional
 * .autoAssociate(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-accountgrouping.html)
 */
@CdkDslMarker
public class CfnBillingGroupAccountGroupingPropertyDsl {
    private val cdkBuilder: CfnBillingGroup.AccountGroupingProperty.Builder =
        CfnBillingGroup.AccountGroupingProperty.builder()

    private val _linkedAccountIds: MutableList<String> = mutableListOf()

    /** @param autoAssociate the value to be set. */
    public fun autoAssociate(autoAssociate: Boolean) {
        cdkBuilder.autoAssociate(autoAssociate)
    }

    /** @param autoAssociate the value to be set. */
    public fun autoAssociate(autoAssociate: IResolvable) {
        cdkBuilder.autoAssociate(autoAssociate)
    }

    /**
     * @param linkedAccountIds The account IDs that make up the billing group. Account IDs must be a
     *   part of the consolidated billing family, and not associated with another billing group.
     */
    public fun linkedAccountIds(vararg linkedAccountIds: String) {
        _linkedAccountIds.addAll(listOf(*linkedAccountIds))
    }

    /**
     * @param linkedAccountIds The account IDs that make up the billing group. Account IDs must be a
     *   part of the consolidated billing family, and not associated with another billing group.
     */
    public fun linkedAccountIds(linkedAccountIds: Collection<String>) {
        _linkedAccountIds.addAll(linkedAccountIds)
    }

    public fun build(): CfnBillingGroup.AccountGroupingProperty {
        if (_linkedAccountIds.isNotEmpty()) cdkBuilder.linkedAccountIds(_linkedAccountIds)
        return cdkBuilder.build()
    }
}
