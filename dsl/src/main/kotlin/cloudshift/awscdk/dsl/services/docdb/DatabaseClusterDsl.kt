@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.docdb.BackupProps
import software.amazon.awscdk.services.docdb.DatabaseCluster
import software.amazon.awscdk.services.docdb.IClusterParameterGroup
import software.amazon.awscdk.services.docdb.Login
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.RetentionDays
import software.constructs.Construct

@CdkDslMarker
public class DatabaseClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: DatabaseCluster.Builder = DatabaseCluster.Builder.create(scope, id)

  /**
   * Backup settings.
   *
   * Default: - Backup retention period for automated backups is 1 day.
   * Backup preferred window is set to a 30-minute window selected at random from an
   * 8-hour block of time for each AWS Region, occurring on a random day of the week.
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/backup-restore.db-cluster-snapshots.html#backup-restore.backup-window)
   * @param backup Backup settings. 
   */
  public fun backup(backup: BackupPropsDsl.() -> Unit = {}) {
    val builder = BackupPropsDsl()
    builder.apply(backup)
    cdkBuilder.backup(builder.build())
  }

  /**
   * Backup settings.
   *
   * Default: - Backup retention period for automated backups is 1 day.
   * Backup preferred window is set to a 30-minute window selected at random from an
   * 8-hour block of time for each AWS Region, occurring on a random day of the week.
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/backup-restore.db-cluster-snapshots.html#backup-restore.backup-window)
   * @param backup Backup settings. 
   */
  public fun backup(backup: BackupProps) {
    cdkBuilder.backup(backup)
  }

  /**
   * The number of days log events are kept in CloudWatch Logs.
   *
   * When updating
   * this property, unsetting it doesn't remove the log retention policy. To
   * remove the retention policy, set the value to `Infinity`.
   *
   * Default: - logs never expire
   *
   * @param cloudWatchLogsRetention The number of days log events are kept in CloudWatch Logs. 
   */
  public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
    cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention)
  }

  /**
   * The IAM role for the Lambda function associated with the custom resource that sets the
   * retention policy.
   *
   * Default: - a new role is created.
   *
   * @param cloudWatchLogsRetentionRole The IAM role for the Lambda function associated with the
   * custom resource that sets the retention policy. 
   */
  public fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole) {
    cdkBuilder.cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole)
  }

  /**
   * An optional identifier for the cluster.
   *
   * Default: - A name is automatically generated.
   *
   * @param dbClusterName An optional identifier for the cluster. 
   */
  public fun dbClusterName(dbClusterName: String) {
    cdkBuilder.dbClusterName(dbClusterName)
  }

  /**
   * Specifies whether this cluster can be deleted.
   *
   * If deletionProtection is
   * enabled, the cluster cannot be deleted unless it is modified and
   * deletionProtection is disabled. deletionProtection protects clusters from
   * being accidentally deleted.
   *
   * Default: - false
   *
   * @param deletionProtection Specifies whether this cluster can be deleted. 
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * A value that indicates whether to enable Performance Insights for the instances in the DB
   * Cluster.
   *
   * Default: - false
   *
   * @param enablePerformanceInsights A value that indicates whether to enable Performance Insights
   * for the instances in the DB Cluster. 
   */
  public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
    cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
  }

  /**
   * What version of the database to start.
   *
   * Default: - The default engine version.
   *
   * @param engineVersion What version of the database to start. 
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * Whether the audit logs should be exported to CloudWatch.
   *
   * Note that you also have to configure the audit log export in the Cluster's Parameter Group.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html#event-auditing-enabling-auditing)
   * @param exportAuditLogsToCloudWatch Whether the audit logs should be exported to CloudWatch. 
   */
  public fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean) {
    cdkBuilder.exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch)
  }

  /**
   * Whether the profiler logs should be exported to CloudWatch.
   *
   * Note that you also have to configure the profiler log export in the Cluster's Parameter Group.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html#profiling.enable-profiling)
   * @param exportProfilerLogsToCloudWatch Whether the profiler logs should be exported to
   * CloudWatch. 
   */
  public fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean) {
    cdkBuilder.exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch)
  }

  /**
   * Base identifier for instances.
   *
   * Every replica is named by appending the replica number to this string, 1-based.
   *
   * Default: - `dbClusterName` is used with the word "Instance" appended. If `dbClusterName` is not
   * provided, the
   * identifier is automatically generated.
   *
   * @param instanceIdentifierBase Base identifier for instances. 
   */
  public fun instanceIdentifierBase(instanceIdentifierBase: String) {
    cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
  }

  /**
   * What type of instance to start for the replicas.
   *
   * @param instanceType What type of instance to start for the replicas. 
   */
  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * Number of DocDB compute instances.
   *
   * Default: 1
   *
   * @param instances Number of DocDB compute instances. 
   */
  public fun instances(instances: Number) {
    cdkBuilder.instances(instances)
  }

  /**
   * The KMS key for storage encryption.
   *
   * Default: - default master key.
   *
   * @param kmsKey The KMS key for storage encryption. 
   */
  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  /**
   * Username and password for the administrative user.
   *
   * @param masterUser Username and password for the administrative user. 
   */
  public fun masterUser(masterUser: LoginDsl.() -> Unit = {}) {
    val builder = LoginDsl()
    builder.apply(masterUser)
    cdkBuilder.masterUser(builder.build())
  }

  /**
   * Username and password for the administrative user.
   *
   * @param masterUser Username and password for the administrative user. 
   */
  public fun masterUser(masterUser: Login) {
    cdkBuilder.masterUser(masterUser)
  }

  /**
   * The DB parameter group to associate with the instance.
   *
   * Default: no parameter group
   *
   * @param parameterGroup The DB parameter group to associate with the instance. 
   */
  public fun parameterGroup(parameterGroup: IClusterParameterGroup) {
    cdkBuilder.parameterGroup(parameterGroup)
  }

  /**
   * The port the DocumentDB cluster will listen on.
   *
   * Default: DatabaseCluster.DEFAULT_PORT
   *
   * @param port The port the DocumentDB cluster will listen on. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * A weekly time range in which maintenance should preferably execute.
   *
   * Must be at least 30 minutes long.
   *
   * Example: 'tue:04:17-tue:04:47'
   *
   * Default: - 30-minute window selected at random from an 8-hour block of time for
   * each AWS Region, occurring on a random day of the week.
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-maintain.html#maintenance-window)
   * @param preferredMaintenanceWindow A weekly time range in which maintenance should preferably
   * execute. 
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * The removal policy to apply when the cluster and its instances are removed or replaced during a
   * stack update, or when the stack is deleted.
   *
   * This
   * removal policy also applies to the implicit security group created for the
   * cluster if one is not supplied as a parameter.
   *
   * Default: - Retain cluster.
   *
   * @param removalPolicy The removal policy to apply when the cluster and its instances are removed
   * or replaced during a stack update, or when the stack is deleted. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * Security group.
   *
   * Default: a new security group is created.
   *
   * @param securityGroup Security group. 
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  /**
   * Whether to enable storage encryption.
   *
   * Default: true
   *
   * @param storageEncrypted Whether to enable storage encryption. 
   */
  public fun storageEncrypted(storageEncrypted: Boolean) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  /**
   * What subnets to run the DocumentDB instances in.
   *
   * Must be at least 2 subnets in two different AZs.
   *
   * @param vpc What subnets to run the DocumentDB instances in. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * Where to place the instances within the VPC.
   *
   * Default: private subnets
   *
   * @param vpcSubnets Where to place the instances within the VPC. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * Where to place the instances within the VPC.
   *
   * Default: private subnets
   *
   * @param vpcSubnets Where to place the instances within the VPC. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): DatabaseCluster = cdkBuilder.build()
}
