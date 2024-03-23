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
 * Options for a BackupSelection.
 *
 * Example:
 *
 * ```
 * BackupPlan plan;
 * Vpc vpc;
 * ITable myTable = Table.fromTableName(this, "Table", "myTableName");
 * DatabaseInstance myDatabaseInstance = DatabaseInstance.Builder.create(this, "DatabaseInstance")
 * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_26).build()))
 * .vpc(vpc)
 * .build();
 * DatabaseCluster myDatabaseCluster = DatabaseCluster.Builder.create(this, "DatabaseCluster")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_2_08_1).build()))
 * .credentials(Credentials.fromGeneratedSecret("clusteradmin"))
 * .instanceProps(InstanceProps.builder()
 * .vpc(vpc)
 * .build())
 * .build();
 * ServerlessCluster myServerlessCluster = ServerlessCluster.Builder.create(this,
 * "ServerlessCluster")
 * .engine(DatabaseClusterEngine.AURORA_POSTGRESQL)
 * .parameterGroup(ParameterGroup.fromParameterGroupName(this, "ParameterGroup",
 * "default.aurora-postgresql11"))
 * .vpc(vpc)
 * .build();
 * Construct myCoolConstruct = new Construct(this, "MyCoolConstruct");
 * plan.addSelection("Selection", BackupSelectionOptions.builder()
 * .resources(List.of(BackupResource.fromDynamoDbTable(myTable),
 * BackupResource.fromRdsDatabaseInstance(myDatabaseInstance),
 * BackupResource.fromRdsDatabaseCluster(myDatabaseCluster),
 * BackupResource.fromRdsServerlessCluster(myServerlessCluster), BackupResource.fromTag("stage",
 * "prod"), BackupResource.fromConstruct(myCoolConstruct)))
 * .build());
 * ```
 */
public interface BackupSelectionOptions {
  /**
   * Whether to automatically give restores permissions to the role that AWS Backup uses.
   *
   * If `true`, the `AWSBackupServiceRolePolicyForRestores` managed
   * policy will be attached to the role.
   *
   * Default: false
   */
  public fun allowRestores(): Boolean? = unwrap(this).getAllowRestores()

  /**
   * The name for this selection.
   *
   * Default: - a CDK generated name
   */
  public fun backupSelectionName(): String? = unwrap(this).getBackupSelectionName()

  /**
   * Whether to disable automatically assigning default backup permissions to the role that AWS
   * Backup uses.
   *
   * If `false`, the `AWSBackupServiceRolePolicyForBackup` managed policy will be
   * attached to the role.
   *
   * Default: false
   */
  public fun disableDefaultBackupPolicy(): Boolean? = unwrap(this).getDisableDefaultBackupPolicy()

  /**
   * The resources to backup.
   *
   * Use the helper static methods defined on `BackupResource`.
   */
  public fun resources(): List<BackupResource>

  /**
   * The role that AWS Backup uses to authenticate when backuping or restoring the resources.
   *
   * The `AWSBackupServiceRolePolicyForBackup` managed policy
   * will be attached to this role unless `disableDefaultBackupPolicy`
   * is set to `true`.
   *
   * Default: - a new role will be created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [BackupSelectionOptions]
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
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupSelectionOptions.Builder =
        software.amazon.awscdk.services.backup.BackupSelectionOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.backup.BackupSelectionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.backup.BackupSelectionOptions,
  ) : CdkObject(cdkObject), BackupSelectionOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): BackupSelectionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupSelectionOptions):
        BackupSelectionOptions = CdkObjectWrappers.wrap(cdkObject) as? BackupSelectionOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupSelectionOptions):
        software.amazon.awscdk.services.backup.BackupSelectionOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.BackupSelectionOptions
  }
}
