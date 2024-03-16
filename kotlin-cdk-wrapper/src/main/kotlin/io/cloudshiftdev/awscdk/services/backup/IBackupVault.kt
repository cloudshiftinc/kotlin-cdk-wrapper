@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * A backup vault.
 */
public interface IBackupVault : IResource {
  /**
   * The ARN of the backup vault.
   */
  public fun backupVaultArn(): String

  /**
   * The name of a logical container where backups are stored.
   */
  public fun backupVaultName(): String

  /**
   * Grant the actions defined in actions to the given grantee on this backup vault.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, actions: String): Grant

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.IBackupVault): IBackupVault
        = CdkObjectWrappers.wrap(cdkObject) as IBackupVault

    internal fun unwrap(wrapped: IBackupVault): software.amazon.awscdk.services.backup.IBackupVault
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.backup.IBackupVault
  }
}
