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

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupPlan
import software.amazon.awscdk.services.backup.BackupSelection
import software.amazon.awscdk.services.backup.BackupVault
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.amazon.awscdk.services.backup.CfnBackupVault

/**
 * Adds a rule to a plan.
 *
 * @param rule the rule to add.
 */
public inline fun BackupPlan.addRule(block: BackupPlanRuleDsl.() -> Unit = {}) {
    val builder = BackupPlanRuleDsl()
    builder.apply(block)
    return addRule(builder.build())
}

/**
 * Adds a selection to this plan.
 *
 * @param id
 * @param options
 */
public inline fun BackupPlan.addSelection(
    id: String,
    block: BackupSelectionOptionsDsl.() -> Unit = {}
): BackupSelection {
    val builder = BackupSelectionOptionsDsl()
    builder.apply(block)
    return addSelection(id, builder.build())
}

/**
 * Adds a statement to the vault access policy.
 *
 * @param statement
 */
public inline fun BackupVault.addToAccessPolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToAccessPolicy(builder.build())
}

/** Uniquely identifies the backup plan to be associated with the selection of resources. */
public inline fun CfnBackupPlan.setBackupPlan(
    block: CfnBackupPlanBackupPlanResourceTypePropertyDsl.() -> Unit = {}
) {
    val builder = CfnBackupPlanBackupPlanResourceTypePropertyDsl()
    builder.apply(block)
    return setBackupPlan(builder.build())
}

/** Specifies the body of a request to assign a set of resources to a backup plan. */
public inline fun CfnBackupSelection.setBackupSelection(
    block: CfnBackupSelectionBackupSelectionResourceTypePropertyDsl.() -> Unit = {}
) {
    val builder = CfnBackupSelectionBackupSelectionResourceTypePropertyDsl()
    builder.apply(block)
    return setBackupSelection(builder.build())
}

/**
 * Configuration for
 * [AWS Backup Vault Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
 */
public inline fun CfnBackupVault.setLockConfiguration(
    block: CfnBackupVaultLockConfigurationTypePropertyDsl.() -> Unit = {}
) {
    val builder = CfnBackupVaultLockConfigurationTypePropertyDsl()
    builder.apply(block)
    return setLockConfiguration(builder.build())
}

/** The SNS event notifications for the specified backup vault. */
public inline fun CfnBackupVault.setNotifications(
    block: CfnBackupVaultNotificationObjectTypePropertyDsl.() -> Unit = {}
) {
    val builder = CfnBackupVaultNotificationObjectTypePropertyDsl()
    builder.apply(block)
    return setNotifications(builder.build())
}
