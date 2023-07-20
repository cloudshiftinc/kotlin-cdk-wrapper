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

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import software.amazon.awscdk.services.backup.BackupPlan
import software.amazon.awscdk.services.backup.BackupSelection
import software.amazon.awscdk.services.backup.BackupVault
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.amazon.awscdk.services.backup.CfnBackupVault
import kotlin.String
import kotlin.Unit

public inline fun CfnBackupVault.setLockConfiguration(
    block: CfnBackupVaultLockConfigurationTypePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBackupVaultLockConfigurationTypePropertyDsl()
    builder.apply(block)
    return setLockConfiguration(builder.build())
}

public inline fun CfnBackupVault.setNotifications(
    block: CfnBackupVaultNotificationObjectTypePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBackupVaultNotificationObjectTypePropertyDsl()
    builder.apply(block)
    return setNotifications(builder.build())
}

public inline fun BackupPlan.addRule(block: BackupPlanRuleDsl.() -> Unit = {}) {
    val builder = BackupPlanRuleDsl()
    builder.apply(block)
    return addRule(builder.build())
}

public inline fun BackupPlan.addSelection(
    id: String,
    block: BackupSelectionOptionsDsl.() -> Unit =
        {},
): BackupSelection {
    val builder = BackupSelectionOptionsDsl()
    builder.apply(block)
    return addSelection(id, builder.build())
}

public inline fun BackupVault.addToAccessPolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToAccessPolicy(builder.build())
}

public inline fun CfnBackupPlan.setBackupPlan(
    block: CfnBackupPlanBackupPlanResourceTypePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBackupPlanBackupPlanResourceTypePropertyDsl()
    builder.apply(block)
    return setBackupPlan(builder.build())
}

public inline fun CfnBackupSelection.setBackupSelection(
    block: CfnBackupSelectionBackupSelectionResourceTypePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnBackupSelectionBackupSelectionResourceTypePropertyDsl()
    builder.apply(block)
    return setBackupSelection(builder.build())
}
