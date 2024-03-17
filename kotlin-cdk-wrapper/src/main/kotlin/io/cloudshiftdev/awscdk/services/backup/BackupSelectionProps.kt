@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a BackupSelection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * BackupPlan backupPlan;
 * BackupResource backupResource;
 * Role role;
 * BackupSelectionProps backupSelectionProps = BackupSelectionProps.builder()
 * .backupPlan(backupPlan)
 * .resources(List.of(backupResource))
 * // the properties below are optional
 * .allowRestores(false)
 * .backupSelectionName("backupSelectionName")
 * .disableDefaultBackupPolicy(false)
 * .role(role)
 * .build();
 * ```
 */
public interface BackupSelectionProps : BackupSelectionOptions {
  /**
   * The backup plan for this selection.
   */
  public fun backupPlan(): IBackupPlan

  /**
   * A builder for [BackupSelectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowRestores Whether to automatically give restores permissions to the role that AWS
     * Backup uses.
     * If `true`, the `AWSBackupServiceRolePolicyForRestores` managed
     * policy will be attached to the role.
     */
    public fun allowRestores(allowRestores: Boolean)

    /**
     * @param backupPlan The backup plan for this selection. 
     */
    public fun backupPlan(backupPlan: IBackupPlan)

    /**
     * @param backupSelectionName The name for this selection.
     */
    public fun backupSelectionName(backupSelectionName: String)

    /**
     * @param disableDefaultBackupPolicy Whether to disable automatically assigning default backup
     * permissions to the role that AWS Backup uses.
     * If `false`, the `AWSBackupServiceRolePolicyForBackup` managed policy will be
     * attached to the role.
     */
    public fun disableDefaultBackupPolicy(disableDefaultBackupPolicy: Boolean)

    /**
     * @param resources The resources to backup. 
     * Use the helper static methods defined on `BackupResource`.
     */
    public fun resources(resources: List<BackupResource>)

    /**
     * @param resources The resources to backup. 
     * Use the helper static methods defined on `BackupResource`.
     */
    public fun resources(vararg resources: BackupResource)

    /**
     * @param role The role that AWS Backup uses to authenticate when backuping or restoring the
     * resources.
     * The `AWSBackupServiceRolePolicyForBackup` managed policy
     * will be attached to this role unless `disableDefaultBackupPolicy`
     * is set to `true`.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupSelectionProps.Builder =
        software.amazon.awscdk.services.backup.BackupSelectionProps.builder()

    /**
     * @param allowRestores Whether to automatically give restores permissions to the role that AWS
     * Backup uses.
     * If `true`, the `AWSBackupServiceRolePolicyForRestores` managed
     * policy will be attached to the role.
     */
    override fun allowRestores(allowRestores: Boolean) {
      cdkBuilder.allowRestores(allowRestores)
    }

    /**
     * @param backupPlan The backup plan for this selection. 
     */
    override fun backupPlan(backupPlan: IBackupPlan) {
      cdkBuilder.backupPlan(backupPlan.let(IBackupPlan::unwrap))
    }

    /**
     * @param backupSelectionName The name for this selection.
     */
    override fun backupSelectionName(backupSelectionName: String) {
      cdkBuilder.backupSelectionName(backupSelectionName)
    }

    /**
     * @param disableDefaultBackupPolicy Whether to disable automatically assigning default backup
     * permissions to the role that AWS Backup uses.
     * If `false`, the `AWSBackupServiceRolePolicyForBackup` managed policy will be
     * attached to the role.
     */
    override fun disableDefaultBackupPolicy(disableDefaultBackupPolicy: Boolean) {
      cdkBuilder.disableDefaultBackupPolicy(disableDefaultBackupPolicy)
    }

    /**
     * @param resources The resources to backup. 
     * Use the helper static methods defined on `BackupResource`.
     */
    override fun resources(resources: List<BackupResource>) {
      cdkBuilder.resources(resources.map(BackupResource::unwrap))
    }

    /**
     * @param resources The resources to backup. 
     * Use the helper static methods defined on `BackupResource`.
     */
    override fun resources(vararg resources: BackupResource): Unit = resources(resources.toList())

    /**
     * @param role The role that AWS Backup uses to authenticate when backuping or restoring the
     * resources.
     * The `AWSBackupServiceRolePolicyForBackup` managed policy
     * will be attached to this role unless `disableDefaultBackupPolicy`
     * is set to `true`.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupSelectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.BackupSelectionProps,
  ) : CdkObject(cdkObject), BackupSelectionProps {
    /**
     * Whether to automatically give restores permissions to the role that AWS Backup uses.
     *
     * If `true`, the `AWSBackupServiceRolePolicyForRestores` managed
     * policy will be attached to the role.
     *
     * Default: false
     */
    override fun allowRestores(): Boolean? = unwrap(this).getAllowRestores()

    /**
     * The backup plan for this selection.
     */
    override fun backupPlan(): IBackupPlan = unwrap(this).getBackupPlan().let(IBackupPlan::wrap)

    /**
     * The name for this selection.
     *
     * Default: - a CDK generated name
     */
    override fun backupSelectionName(): String? = unwrap(this).getBackupSelectionName()

    /**
     * Whether to disable automatically assigning default backup permissions to the role that AWS
     * Backup uses.
     *
     * If `false`, the `AWSBackupServiceRolePolicyForBackup` managed policy will be
     * attached to the role.
     *
     * Default: false
     */
    override fun disableDefaultBackupPolicy(): Boolean? =
        unwrap(this).getDisableDefaultBackupPolicy()

    /**
     * The resources to backup.
     *
     * Use the helper static methods defined on `BackupResource`.
     */
    override fun resources(): List<BackupResource> =
        unwrap(this).getResources().map(BackupResource::wrap)

    /**
     * The role that AWS Backup uses to authenticate when backuping or restoring the resources.
     *
     * The `AWSBackupServiceRolePolicyForBackup` managed policy
     * will be attached to this role unless `disableDefaultBackupPolicy`
     * is set to `true`.
     *
     * Default: - a new role will be created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackupSelectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupSelectionProps):
        BackupSelectionProps = CdkObjectWrappers.wrap(cdkObject) as? BackupSelectionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupSelectionProps):
        software.amazon.awscdk.services.backup.BackupSelectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.BackupSelectionProps
  }
}
