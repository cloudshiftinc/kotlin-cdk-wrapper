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

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Snapshot policies only]* Specifies a rule for sharing snapshots across AWS accounts .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * ShareRuleProperty shareRuleProperty = ShareRuleProperty.builder()
 * .targetAccounts(List.of("targetAccounts"))
 * .unshareInterval(123)
 * .unshareIntervalUnit("unshareIntervalUnit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-sharerule.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyShareRulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ShareRuleProperty.Builder =
        CfnLifecyclePolicy.ShareRuleProperty.builder()

    private val _targetAccounts: MutableList<String> = mutableListOf()

    /** @param targetAccounts The IDs of the AWS accounts with which to share the snapshots. */
    public fun targetAccounts(vararg targetAccounts: String) {
        _targetAccounts.addAll(listOf(*targetAccounts))
    }

    /** @param targetAccounts The IDs of the AWS accounts with which to share the snapshots. */
    public fun targetAccounts(targetAccounts: Collection<String>) {
        _targetAccounts.addAll(targetAccounts)
    }

    /**
     * @param unshareInterval The period after which snapshots that are shared with other AWS
     *   accounts are automatically unshared.
     */
    public fun unshareInterval(unshareInterval: Number) {
        cdkBuilder.unshareInterval(unshareInterval)
    }

    /** @param unshareIntervalUnit The unit of time for the automatic unsharing interval. */
    public fun unshareIntervalUnit(unshareIntervalUnit: String) {
        cdkBuilder.unshareIntervalUnit(unshareIntervalUnit)
    }

    public fun build(): CfnLifecyclePolicy.ShareRuleProperty {
        if (_targetAccounts.isNotEmpty()) cdkBuilder.targetAccounts(_targetAccounts)
        return cdkBuilder.build()
    }
}
