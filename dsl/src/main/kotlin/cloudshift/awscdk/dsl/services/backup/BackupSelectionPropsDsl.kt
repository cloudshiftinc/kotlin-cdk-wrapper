@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.backup.BackupResource
import software.amazon.awscdk.services.backup.BackupSelectionProps
import software.amazon.awscdk.services.backup.IBackupPlan
import software.amazon.awscdk.services.iam.IRole

/**
 * Properties for a BackupSelection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * import software.amazon.awscdk.services.iam.*;
 * BackupPlan backupPlan;
 * BackupResource backupResource;
 * Role role;
 * BackupSelectionProps backupSelectionProps = BackupSelectionProps.builder()
 * .backupPlan(backupPlan)
 * .resources(List.of(backupResource))
 * // the properties below are optional
 * .allowRestores(false)
 * .backupSelectionName("backupSelectionName")
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class BackupSelectionPropsDsl {
  private val cdkBuilder: BackupSelectionProps.Builder = BackupSelectionProps.builder()

  private val _resources: MutableList<BackupResource> = mutableListOf()

  /**
   * @param allowRestores Whether to automatically give restores permissions to the role that AWS
   * Backup uses.
   * If `true`, the `AWSBackupServiceRolePolicyForRestores` managed
   * policy will be attached to the role.
   */
  public fun allowRestores(allowRestores: Boolean) {
    cdkBuilder.allowRestores(allowRestores)
  }

  /**
   * @param backupPlan The backup plan for this selection. 
   */
  public fun backupPlan(backupPlan: IBackupPlan) {
    cdkBuilder.backupPlan(backupPlan)
  }

  /**
   * @param backupSelectionName The name for this selection.
   */
  public fun backupSelectionName(backupSelectionName: String) {
    cdkBuilder.backupSelectionName(backupSelectionName)
  }

  /**
   * @param resources The resources to backup. 
   * Use the helper static methods defined on `BackupResource`.
   */
  public fun resources(vararg resources: BackupResource) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * @param resources The resources to backup. 
   * Use the helper static methods defined on `BackupResource`.
   */
  public fun resources(resources: Collection<BackupResource>) {
    _resources.addAll(resources)
  }

  /**
   * @param role The role that AWS Backup uses to authenticate when backuping or restoring the
   * resources.
   * The `AWSBackupServiceRolePolicyForBackup` managed policy
   * will be attached to this role.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): BackupSelectionProps {
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
