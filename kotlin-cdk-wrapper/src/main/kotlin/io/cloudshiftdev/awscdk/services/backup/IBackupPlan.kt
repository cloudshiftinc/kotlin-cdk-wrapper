@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A backup plan.
 */
public interface IBackupPlan : IResource {
  /**
   * The identifier of the backup plan.
   */
  public fun backupPlanId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.IBackupPlan): IBackupPlan =
        CdkObjectWrappers.wrap(cdkObject) as IBackupPlan

    internal fun unwrap(wrapped: IBackupPlan): software.amazon.awscdk.services.backup.IBackupPlan =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.backup.IBackupPlan
  }
}
