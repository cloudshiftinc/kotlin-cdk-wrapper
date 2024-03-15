@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Properties for a BackupPlanCopyAction.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * BackupVault backupVault;
 * BackupPlanCopyActionProps backupPlanCopyActionProps = BackupPlanCopyActionProps.builder()
 * .destinationBackupVault(backupVault)
 * // the properties below are optional
 * .deleteAfter(Duration.minutes(30))
 * .moveToColdStorageAfter(Duration.minutes(30))
 * .build();
 * ```
 */
public interface BackupPlanCopyActionProps {
  /**
   * Specifies the duration after creation that a copied recovery point is deleted from the
   * destination vault.
   *
   * Must be at least 90 days greater than `moveToColdStorageAfter`, if specified.
   *
   * Default: - recovery point is never deleted
   */
  public fun deleteAfter(): Duration? = unwrap(this).getDeleteAfter()?.let(Duration::wrap)

  /**
   * Destination Vault for recovery points to be copied into.
   */
  public fun destinationBackupVault(): IBackupVault

  /**
   * Specifies the duration after creation that a copied recovery point is moved to cold storage.
   *
   * Default: - recovery point is never moved to cold storage
   */
  public fun moveToColdStorageAfter(): Duration? =
      unwrap(this).getMoveToColdStorageAfter()?.let(Duration::wrap)

  /**
   * A builder for [BackupPlanCopyActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deleteAfter Specifies the duration after creation that a copied recovery point is
     * deleted from the destination vault.
     * Must be at least 90 days greater than `moveToColdStorageAfter`, if specified.
     */
    public fun deleteAfter(deleteAfter: Duration)

    /**
     * @param destinationBackupVault Destination Vault for recovery points to be copied into. 
     */
    public fun destinationBackupVault(destinationBackupVault: IBackupVault)

    /**
     * @param moveToColdStorageAfter Specifies the duration after creation that a copied recovery
     * point is moved to cold storage.
     */
    public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupPlanCopyActionProps.Builder
        = software.amazon.awscdk.services.backup.BackupPlanCopyActionProps.builder()

    /**
     * @param deleteAfter Specifies the duration after creation that a copied recovery point is
     * deleted from the destination vault.
     * Must be at least 90 days greater than `moveToColdStorageAfter`, if specified.
     */
    override fun deleteAfter(deleteAfter: Duration) {
      cdkBuilder.deleteAfter(deleteAfter.let(Duration::unwrap))
    }

    /**
     * @param destinationBackupVault Destination Vault for recovery points to be copied into. 
     */
    override fun destinationBackupVault(destinationBackupVault: IBackupVault) {
      cdkBuilder.destinationBackupVault(destinationBackupVault.let(IBackupVault::unwrap))
    }

    /**
     * @param moveToColdStorageAfter Specifies the duration after creation that a copied recovery
     * point is moved to cold storage.
     */
    override fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
      cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupPlanCopyActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.BackupPlanCopyActionProps,
  ) : CdkObject(cdkObject), BackupPlanCopyActionProps {
    /**
     * Specifies the duration after creation that a copied recovery point is deleted from the
     * destination vault.
     *
     * Must be at least 90 days greater than `moveToColdStorageAfter`, if specified.
     *
     * Default: - recovery point is never deleted
     */
    override fun deleteAfter(): Duration? = unwrap(this).getDeleteAfter()?.let(Duration::wrap)

    /**
     * Destination Vault for recovery points to be copied into.
     */
    override fun destinationBackupVault(): IBackupVault =
        unwrap(this).getDestinationBackupVault().let(IBackupVault::wrap)

    /**
     * Specifies the duration after creation that a copied recovery point is moved to cold storage.
     *
     * Default: - recovery point is never moved to cold storage
     */
    override fun moveToColdStorageAfter(): Duration? =
        unwrap(this).getMoveToColdStorageAfter()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanCopyActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupPlanCopyActionProps):
        BackupPlanCopyActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupPlanCopyActionProps):
        software.amazon.awscdk.services.backup.BackupPlanCopyActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.BackupPlanCopyActionProps
  }
}
