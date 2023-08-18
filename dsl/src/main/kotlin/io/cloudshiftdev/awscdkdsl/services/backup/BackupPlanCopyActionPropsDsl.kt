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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.backup.BackupPlanCopyActionProps
import software.amazon.awscdk.services.backup.IBackupVault

/**
 * Properties for a BackupPlanCopyAction.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.backup.*;
 * BackupVault backupVault;
 * BackupPlanCopyActionProps backupPlanCopyActionProps = BackupPlanCopyActionProps.builder()
 * .destinationBackupVault(backupVault)
 * // the properties below are optional
 * .deleteAfter(Duration.minutes(30))
 * .moveToColdStorageAfter(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class BackupPlanCopyActionPropsDsl {
    private val cdkBuilder: BackupPlanCopyActionProps.Builder = BackupPlanCopyActionProps.builder()

    /**
     * @param deleteAfter Specifies the duration after creation that a copied recovery point is
     *   deleted from the destination vault. Must be at least 90 days greater than
     *   `moveToColdStorageAfter`, if specified.
     */
    public fun deleteAfter(deleteAfter: Duration) {
        cdkBuilder.deleteAfter(deleteAfter)
    }

    /** @param destinationBackupVault Destination Vault for recovery points to be copied into. */
    public fun destinationBackupVault(destinationBackupVault: IBackupVault) {
        cdkBuilder.destinationBackupVault(destinationBackupVault)
    }

    /**
     * @param moveToColdStorageAfter Specifies the duration after creation that a copied recovery
     *   point is moved to cold storage.
     */
    public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
        cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter)
    }

    public fun build(): BackupPlanCopyActionProps = cdkBuilder.build()
}
