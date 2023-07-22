@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.backup.BackupResource
import software.amazon.awscdk.services.backup.BackupSelectionOptions
import software.amazon.awscdk.services.iam.IRole

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
 * "default.aurora-postgresql10"))
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
@CdkDslMarker
public class BackupSelectionOptionsDsl {
  private val cdkBuilder: BackupSelectionOptions.Builder = BackupSelectionOptions.builder()

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

  public fun build(): BackupSelectionOptions {
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
