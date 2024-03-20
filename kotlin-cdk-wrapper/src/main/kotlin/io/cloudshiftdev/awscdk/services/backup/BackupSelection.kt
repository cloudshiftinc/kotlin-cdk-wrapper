@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A backup selection.
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
 * BackupSelection backupSelection = BackupSelection.Builder.create(this, "MyBackupSelection")
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
public open class BackupSelection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.backup.BackupSelection,
) : Resource(cdkObject), IGrantable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BackupSelectionProps,
  ) :
      this(software.amazon.awscdk.services.backup.BackupSelection(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(BackupSelectionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BackupSelectionProps.Builder.() -> Unit,
  ) : this(scope, id, BackupSelectionProps(props)
  )

  /**
   * The identifier of the backup plan.
   */
  public open fun backupPlanId(): String = unwrap(this).getBackupPlanId()

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * The identifier of the backup selection.
   */
  public open fun selectionId(): String = unwrap(this).getSelectionId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.BackupSelection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to automatically give restores permissions to the role that AWS Backup uses.
     *
     * If `true`, the `AWSBackupServiceRolePolicyForRestores` managed
     * policy will be attached to the role.
     *
     * Default: false
     *
     * @param allowRestores Whether to automatically give restores permissions to the role that AWS
     * Backup uses. 
     */
    public fun allowRestores(allowRestores: Boolean)

    /**
     * The backup plan for this selection.
     *
     * @param backupPlan The backup plan for this selection. 
     */
    public fun backupPlan(backupPlan: IBackupPlan)

    /**
     * The name for this selection.
     *
     * Default: - a CDK generated name
     *
     * @param backupSelectionName The name for this selection. 
     */
    public fun backupSelectionName(backupSelectionName: String)

    /**
     * Whether to disable automatically assigning default backup permissions to the role that AWS
     * Backup uses.
     *
     * If `false`, the `AWSBackupServiceRolePolicyForBackup` managed policy will be
     * attached to the role.
     *
     * Default: false
     *
     * @param disableDefaultBackupPolicy Whether to disable automatically assigning default backup
     * permissions to the role that AWS Backup uses. 
     */
    public fun disableDefaultBackupPolicy(disableDefaultBackupPolicy: Boolean)

    /**
     * The resources to backup.
     *
     * Use the helper static methods defined on `BackupResource`.
     *
     * @param resources The resources to backup. 
     */
    public fun resources(resources: List<BackupResource>)

    /**
     * The resources to backup.
     *
     * Use the helper static methods defined on `BackupResource`.
     *
     * @param resources The resources to backup. 
     */
    public fun resources(vararg resources: BackupResource)

    /**
     * The role that AWS Backup uses to authenticate when backuping or restoring the resources.
     *
     * The `AWSBackupServiceRolePolicyForBackup` managed policy
     * will be attached to this role unless `disableDefaultBackupPolicy`
     * is set to `true`.
     *
     * Default: - a new role will be created
     *
     * @param role The role that AWS Backup uses to authenticate when backuping or restoring the
     * resources. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupSelection.Builder =
        software.amazon.awscdk.services.backup.BackupSelection.Builder.create(scope, id)

    /**
     * Whether to automatically give restores permissions to the role that AWS Backup uses.
     *
     * If `true`, the `AWSBackupServiceRolePolicyForRestores` managed
     * policy will be attached to the role.
     *
     * Default: false
     *
     * @param allowRestores Whether to automatically give restores permissions to the role that AWS
     * Backup uses. 
     */
    override fun allowRestores(allowRestores: Boolean) {
      cdkBuilder.allowRestores(allowRestores)
    }

    /**
     * The backup plan for this selection.
     *
     * @param backupPlan The backup plan for this selection. 
     */
    override fun backupPlan(backupPlan: IBackupPlan) {
      cdkBuilder.backupPlan(backupPlan.let(IBackupPlan::unwrap))
    }

    /**
     * The name for this selection.
     *
     * Default: - a CDK generated name
     *
     * @param backupSelectionName The name for this selection. 
     */
    override fun backupSelectionName(backupSelectionName: String) {
      cdkBuilder.backupSelectionName(backupSelectionName)
    }

    /**
     * Whether to disable automatically assigning default backup permissions to the role that AWS
     * Backup uses.
     *
     * If `false`, the `AWSBackupServiceRolePolicyForBackup` managed policy will be
     * attached to the role.
     *
     * Default: false
     *
     * @param disableDefaultBackupPolicy Whether to disable automatically assigning default backup
     * permissions to the role that AWS Backup uses. 
     */
    override fun disableDefaultBackupPolicy(disableDefaultBackupPolicy: Boolean) {
      cdkBuilder.disableDefaultBackupPolicy(disableDefaultBackupPolicy)
    }

    /**
     * The resources to backup.
     *
     * Use the helper static methods defined on `BackupResource`.
     *
     * @param resources The resources to backup. 
     */
    override fun resources(resources: List<BackupResource>) {
      cdkBuilder.resources(resources.map(BackupResource::unwrap))
    }

    /**
     * The resources to backup.
     *
     * Use the helper static methods defined on `BackupResource`.
     *
     * @param resources The resources to backup. 
     */
    override fun resources(vararg resources: BackupResource): Unit = resources(resources.toList())

    /**
     * The role that AWS Backup uses to authenticate when backuping or restoring the resources.
     *
     * The `AWSBackupServiceRolePolicyForBackup` managed policy
     * will be attached to this role unless `disableDefaultBackupPolicy`
     * is set to `true`.
     *
     * Default: - a new role will be created
     *
     * @param role The role that AWS Backup uses to authenticate when backuping or restoring the
     * resources. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupSelection = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BackupSelection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BackupSelection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupSelection):
        BackupSelection = BackupSelection(cdkObject)

    internal fun unwrap(wrapped: BackupSelection):
        software.amazon.awscdk.services.backup.BackupSelection = wrapped.cdkObject
  }
}
