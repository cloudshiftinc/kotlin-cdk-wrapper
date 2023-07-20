@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupPlan
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBackupPlanBackupRuleResourceTypePropertyDsl {
    private val cdkBuilder: CfnBackupPlan.BackupRuleResourceTypeProperty.Builder =
        CfnBackupPlan.BackupRuleResourceTypeProperty.builder()

    private val _copyActions: MutableList<Any> = mutableListOf()

    public fun completionWindowMinutes(completionWindowMinutes: Number) {
        cdkBuilder.completionWindowMinutes(completionWindowMinutes)
    }

    public fun copyActions(vararg copyActions: Any) {
        _copyActions.addAll(listOf(*copyActions))
    }

    public fun copyActions(copyActions: Collection<Any>) {
        _copyActions.addAll(copyActions)
    }

    public fun copyActions(copyActions: IResolvable) {
        cdkBuilder.copyActions(copyActions)
    }

    public fun enableContinuousBackup(enableContinuousBackup: Boolean) {
        cdkBuilder.enableContinuousBackup(enableContinuousBackup)
    }

    public fun enableContinuousBackup(enableContinuousBackup: IResolvable) {
        cdkBuilder.enableContinuousBackup(enableContinuousBackup)
    }

    public fun lifecycle(lifecycle: IResolvable) {
        cdkBuilder.lifecycle(lifecycle)
    }

    public fun lifecycle(lifecycle: CfnBackupPlan.LifecycleResourceTypeProperty) {
        cdkBuilder.lifecycle(lifecycle)
    }

    public fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
        cdkBuilder.recoveryPointTags(recoveryPointTags)
    }

    public fun recoveryPointTags(recoveryPointTags: IResolvable) {
        cdkBuilder.recoveryPointTags(recoveryPointTags)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public fun startWindowMinutes(startWindowMinutes: Number) {
        cdkBuilder.startWindowMinutes(startWindowMinutes)
    }

    public fun targetBackupVault(targetBackupVault: String) {
        cdkBuilder.targetBackupVault(targetBackupVault)
    }

    public fun build(): CfnBackupPlan.BackupRuleResourceTypeProperty {
        if (_copyActions.isNotEmpty()) cdkBuilder.copyActions(_copyActions)
        return cdkBuilder.build()
    }
}
