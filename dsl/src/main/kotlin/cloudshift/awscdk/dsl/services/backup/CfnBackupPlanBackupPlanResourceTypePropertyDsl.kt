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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBackupPlanBackupPlanResourceTypePropertyDsl {
    private val cdkBuilder: CfnBackupPlan.BackupPlanResourceTypeProperty.Builder =
        CfnBackupPlan.BackupPlanResourceTypeProperty.builder()

    private val _advancedBackupSettings: MutableList<Any> = mutableListOf()

    private val _backupPlanRule: MutableList<Any> = mutableListOf()

    public fun advancedBackupSettings(vararg advancedBackupSettings: Any) {
        _advancedBackupSettings.addAll(listOf(*advancedBackupSettings))
    }

    public fun advancedBackupSettings(advancedBackupSettings: Collection<Any>) {
        _advancedBackupSettings.addAll(advancedBackupSettings)
    }

    public fun advancedBackupSettings(advancedBackupSettings: IResolvable) {
        cdkBuilder.advancedBackupSettings(advancedBackupSettings)
    }

    public fun backupPlanName(backupPlanName: String) {
        cdkBuilder.backupPlanName(backupPlanName)
    }

    public fun backupPlanRule(vararg backupPlanRule: Any) {
        _backupPlanRule.addAll(listOf(*backupPlanRule))
    }

    public fun backupPlanRule(backupPlanRule: Collection<Any>) {
        _backupPlanRule.addAll(backupPlanRule)
    }

    public fun backupPlanRule(backupPlanRule: IResolvable) {
        cdkBuilder.backupPlanRule(backupPlanRule)
    }

    public fun build(): CfnBackupPlan.BackupPlanResourceTypeProperty {
        if (_advancedBackupSettings.isNotEmpty()) {
            cdkBuilder.advancedBackupSettings(_advancedBackupSettings)
        }
        if (_backupPlanRule.isNotEmpty()) cdkBuilder.backupPlanRule(_backupPlanRule)
        return cdkBuilder.build()
    }
}
