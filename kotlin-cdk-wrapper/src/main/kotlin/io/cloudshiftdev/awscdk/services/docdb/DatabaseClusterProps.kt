@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.rds.CaCertificate
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for a new database cluster.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .masterUser(Login.builder()
 * .username("myuser")
 * .build())
 * .instanceType(InstanceType.of(InstanceClass.MEMORY5, InstanceSize.LARGE))
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PUBLIC)
 * .build())
 * .vpc(vpc)
 * .removalPolicy(RemovalPolicy.SNAPSHOT)
 * .build();
 * ```
 */
public interface DatabaseClusterProps {
  /**
   * Backup settings.
   *
   * Default: - Backup retention period for automated backups is 1 day.
   * Backup preferred window is set to a 30-minute window selected at random from an
   * 8-hour block of time for each AWS Region, occurring on a random day of the week.
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/backup-restore.db-cluster-snapshots.html#backup-restore.backup-window)
   */
  public fun backup(): BackupProps? = unwrap(this).getBackup()?.let(BackupProps::wrap)

  /**
   * The identifier of the CA certificate used for the instances.
   *
   * Specifying or updating this property triggers a reboot.
   *
   * Default: - DocumentDB will choose a certificate authority
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
   */
  public fun caCertificate(): CaCertificate? =
      unwrap(this).getCaCertificate()?.let(CaCertificate::wrap)

  /**
   * The number of days log events are kept in CloudWatch Logs.
   *
   * When updating
   * this property, unsetting it doesn't remove the log retention policy. To
   * remove the retention policy, set the value to `Infinity`.
   *
   * Default: - logs never expire
   */
  public fun cloudWatchLogsRetention(): RetentionDays? =
      unwrap(this).getCloudWatchLogsRetention()?.let(RetentionDays::wrap)

  /**
   * The IAM role for the Lambda function associated with the custom resource that sets the
   * retention policy.
   *
   * Default: - a new role is created.
   */
  public fun cloudWatchLogsRetentionRole(): IRole? =
      unwrap(this).getCloudWatchLogsRetentionRole()?.let(IRole::wrap)

  /**
   * Whether to copy tags to the snapshot when a snapshot is created.
   *
   * Default: - false
   */
  public fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

  /**
   * An optional identifier for the cluster.
   *
   * Default: - A name is automatically generated.
   */
  public fun dbClusterName(): String? = unwrap(this).getDbClusterName()

  /**
   * Specifies whether this cluster can be deleted.
   *
   * If deletionProtection is
   * enabled, the cluster cannot be deleted unless it is modified and
   * deletionProtection is disabled. deletionProtection protects clusters from
   * being accidentally deleted.
   *
   * Default: - false
   */
  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  /**
   * A value that indicates whether to enable Performance Insights for the instances in the DB
   * Cluster.
   *
   * Default: - false
   */
  public fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

  /**
   * What version of the database to start.
   *
   * Default: -  the latest major version
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * Whether the audit logs should be exported to CloudWatch.
   *
   * Note that you also have to configure the audit log export in the Cluster's Parameter Group.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html#event-auditing-enabling-auditing)
   */
  public fun exportAuditLogsToCloudWatch(): Boolean? = unwrap(this).getExportAuditLogsToCloudWatch()

  /**
   * Whether the profiler logs should be exported to CloudWatch.
   *
   * Note that you also have to configure the profiler log export in the Cluster's Parameter Group.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html#profiling.enable-profiling)
   */
  public fun exportProfilerLogsToCloudWatch(): Boolean? =
      unwrap(this).getExportProfilerLogsToCloudWatch()

  /**
   * Base identifier for instances.
   *
   * Every replica is named by appending the replica number to this string, 1-based.
   *
   * Default: - `dbClusterName` is used with the word "Instance" appended. If `dbClusterName` is not
   * provided, the
   * identifier is automatically generated.
   */
  public fun instanceIdentifierBase(): String? = unwrap(this).getInstanceIdentifierBase()

  /**
   * The removal policy to apply to the cluster's instances.
   *
   * Cannot be set to `SNAPSHOT`.
   *
   * Default: - `RemovalPolicy.DESTROY` when `removalPolicy` is set to `SNAPSHOT`, `removalPolicy`
   * otherwise.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
   */
  public fun instanceRemovalPolicy(): RemovalPolicy? =
      unwrap(this).getInstanceRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * What type of instance to start for the replicas.
   */
  public fun instanceType(): InstanceType

  /**
   * Number of DocDB compute instances.
   *
   * Default: 1
   */
  public fun instances(): Number? = unwrap(this).getInstances()

  /**
   * The KMS key for storage encryption.
   *
   * Default: - default master key.
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * Username and password for the administrative user.
   */
  public fun masterUser(): Login

  /**
   * The DB parameter group to associate with the instance.
   *
   * Default: no parameter group
   */
  public fun parameterGroup(): IClusterParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IClusterParameterGroup::wrap)

  /**
   * The port the DocumentDB cluster will listen on.
   *
   * Default: DatabaseCluster.DEFAULT_PORT
   */
  public fun port(): Number? = unwrap(this).getPort()

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
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The removal policy to apply when the cluster and its instances are removed or replaced during a
   * stack update, or when the stack is deleted.
   *
   * This
   * removal policy also applies to the implicit security group created for the
   * cluster if one is not supplied as a parameter.
   *
   * When set to `SNAPSHOT`, the removal policy for the instances and the security group
   * will default to `DESTROY` as those resources do not support the policy.
   *
   * Use the `instanceRemovalPolicy` and `securityGroupRemovalPolicy` to change the behavior.
   *
   * Default: - Retain cluster.
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Security group.
   *
   * Default: a new security group is created.
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * The removal policy to apply to the cluster's security group.
   *
   * Cannot be set to `SNAPSHOT`.
   *
   * Default: - `RemovalPolicy.DESTROY` when `removalPolicy` is set to `SNAPSHOT`, `removalPolicy`
   * otherwise.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
   */
  public fun securityGroupRemovalPolicy(): RemovalPolicy? =
      unwrap(this).getSecurityGroupRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Whether to enable storage encryption.
   *
   * Default: true
   */
  public fun storageEncrypted(): Boolean? = unwrap(this).getStorageEncrypted()

  /**
   * The storage type of the DocDB cluster.
   *
   * I/O-optimized storage is supported starting with engine version 5.0.0.
   *
   * Default: StorageType.STANDARD
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/release-notes.html#release-notes.11-21-2023)
   */
  public fun storageType(): StorageType? = unwrap(this).getStorageType()?.let(StorageType::wrap)

  /**
   * What subnets to run the DocumentDB instances in.
   *
   * Must be at least 2 subnets in two different AZs.
   */
  public fun vpc(): IVpc

  /**
   * Where to place the instances within the VPC.
   *
   * Default: private subnets
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [DatabaseClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backup Backup settings.
     */
    public fun backup(backup: BackupProps)

    /**
     * @param backup Backup settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("058a57ed0bc87d0dc99dc6c7ef3958fcae11e18166396fa80e8358d505258030")
    public fun backup(backup: BackupProps.Builder.() -> Unit)

    /**
     * @param caCertificate The identifier of the CA certificate used for the instances.
     * Specifying or updating this property triggers a reboot.
     */
    public fun caCertificate(caCertificate: CaCertificate)

    /**
     * @param cloudWatchLogsRetention The number of days log events are kept in CloudWatch Logs.
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `Infinity`.
     */
    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays)

    /**
     * @param cloudWatchLogsRetentionRole The IAM role for the Lambda function associated with the
     * custom resource that sets the retention policy.
     */
    public fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole)

    /**
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * @param dbClusterName An optional identifier for the cluster.
     */
    public fun dbClusterName(dbClusterName: String)

    /**
     * @param deletionProtection Specifies whether this cluster can be deleted.
     * If deletionProtection is
     * enabled, the cluster cannot be deleted unless it is modified and
     * deletionProtection is disabled. deletionProtection protects clusters from
     * being accidentally deleted.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the instances in the DB Cluster.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * @param engineVersion What version of the database to start.
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param exportAuditLogsToCloudWatch Whether the audit logs should be exported to CloudWatch.
     * Note that you also have to configure the audit log export in the Cluster's Parameter Group.
     */
    public fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean)

    /**
     * @param exportProfilerLogsToCloudWatch Whether the profiler logs should be exported to
     * CloudWatch.
     * Note that you also have to configure the profiler log export in the Cluster's Parameter
     * Group.
     */
    public fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean)

    /**
     * @param instanceIdentifierBase Base identifier for instances.
     * Every replica is named by appending the replica number to this string, 1-based.
     */
    public fun instanceIdentifierBase(instanceIdentifierBase: String)

    /**
     * @param instanceRemovalPolicy The removal policy to apply to the cluster's instances.
     * Cannot be set to `SNAPSHOT`.
     */
    public fun instanceRemovalPolicy(instanceRemovalPolicy: RemovalPolicy)

    /**
     * @param instanceType What type of instance to start for the replicas. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param instances Number of DocDB compute instances.
     */
    public fun instances(instances: Number)

    /**
     * @param kmsKey The KMS key for storage encryption.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param masterUser Username and password for the administrative user. 
     */
    public fun masterUser(masterUser: Login)

    /**
     * @param masterUser Username and password for the administrative user. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2891ec69f3e1d624106e7951889a2b980809f9a425d251ade50a7502a9cdf61")
    public fun masterUser(masterUser: Login.Builder.() -> Unit)

    /**
     * @param parameterGroup The DB parameter group to associate with the instance.
     */
    public fun parameterGroup(parameterGroup: IClusterParameterGroup)

    /**
     * @param port The port the DocumentDB cluster will listen on.
     */
    public fun port(port: Number)

    /**
     * @param preferredMaintenanceWindow A weekly time range in which maintenance should preferably
     * execute.
     * Must be at least 30 minutes long.
     *
     * Example: 'tue:04:17-tue:04:47'
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed or replaced during a stack update, or when the stack is deleted.
     * This
     * removal policy also applies to the implicit security group created for the
     * cluster if one is not supplied as a parameter.
     *
     * When set to `SNAPSHOT`, the removal policy for the instances and the security group
     * will default to `DESTROY` as those resources do not support the policy.
     *
     * Use the `instanceRemovalPolicy` and `securityGroupRemovalPolicy` to change the behavior.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param securityGroup Security group.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param securityGroupRemovalPolicy The removal policy to apply to the cluster's security
     * group.
     * Cannot be set to `SNAPSHOT`.
     */
    public fun securityGroupRemovalPolicy(securityGroupRemovalPolicy: RemovalPolicy)

    /**
     * @param storageEncrypted Whether to enable storage encryption.
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * @param storageType The storage type of the DocDB cluster.
     * I/O-optimized storage is supported starting with engine version 5.0.0.
     */
    public fun storageType(storageType: StorageType)

    /**
     * @param vpc What subnets to run the DocumentDB instances in. 
     * Must be at least 2 subnets in two different AZs.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0401c178c76eb75037a815f98ed065d453ef676ff25836bd8741bb5247281f11")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseClusterProps.Builder =
        software.amazon.awscdk.services.docdb.DatabaseClusterProps.builder()

    /**
     * @param backup Backup settings.
     */
    override fun backup(backup: BackupProps) {
      cdkBuilder.backup(backup.let(BackupProps.Companion::unwrap))
    }

    /**
     * @param backup Backup settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("058a57ed0bc87d0dc99dc6c7ef3958fcae11e18166396fa80e8358d505258030")
    override fun backup(backup: BackupProps.Builder.() -> Unit): Unit = backup(BackupProps(backup))

    /**
     * @param caCertificate The identifier of the CA certificate used for the instances.
     * Specifying or updating this property triggers a reboot.
     */
    override fun caCertificate(caCertificate: CaCertificate) {
      cdkBuilder.caCertificate(caCertificate.let(CaCertificate.Companion::unwrap))
    }

    /**
     * @param cloudWatchLogsRetention The number of days log events are kept in CloudWatch Logs.
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `Infinity`.
     */
    override fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention.let(RetentionDays.Companion::unwrap))
    }

    /**
     * @param cloudWatchLogsRetentionRole The IAM role for the Lambda function associated with the
     * custom resource that sets the retention policy.
     */
    override fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created.
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * @param dbClusterName An optional identifier for the cluster.
     */
    override fun dbClusterName(dbClusterName: String) {
      cdkBuilder.dbClusterName(dbClusterName)
    }

    /**
     * @param deletionProtection Specifies whether this cluster can be deleted.
     * If deletionProtection is
     * enabled, the cluster cannot be deleted unless it is modified and
     * deletionProtection is disabled. deletionProtection protects clusters from
     * being accidentally deleted.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the instances in the DB Cluster.
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * @param engineVersion What version of the database to start.
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param exportAuditLogsToCloudWatch Whether the audit logs should be exported to CloudWatch.
     * Note that you also have to configure the audit log export in the Cluster's Parameter Group.
     */
    override fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean) {
      cdkBuilder.exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch)
    }

    /**
     * @param exportProfilerLogsToCloudWatch Whether the profiler logs should be exported to
     * CloudWatch.
     * Note that you also have to configure the profiler log export in the Cluster's Parameter
     * Group.
     */
    override fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean) {
      cdkBuilder.exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch)
    }

    /**
     * @param instanceIdentifierBase Base identifier for instances.
     * Every replica is named by appending the replica number to this string, 1-based.
     */
    override fun instanceIdentifierBase(instanceIdentifierBase: String) {
      cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    /**
     * @param instanceRemovalPolicy The removal policy to apply to the cluster's instances.
     * Cannot be set to `SNAPSHOT`.
     */
    override fun instanceRemovalPolicy(instanceRemovalPolicy: RemovalPolicy) {
      cdkBuilder.instanceRemovalPolicy(instanceRemovalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param instanceType What type of instance to start for the replicas. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType.Companion::unwrap))
    }

    /**
     * @param instances Number of DocDB compute instances.
     */
    override fun instances(instances: Number) {
      cdkBuilder.instances(instances)
    }

    /**
     * @param kmsKey The KMS key for storage encryption.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param masterUser Username and password for the administrative user. 
     */
    override fun masterUser(masterUser: Login) {
      cdkBuilder.masterUser(masterUser.let(Login.Companion::unwrap))
    }

    /**
     * @param masterUser Username and password for the administrative user. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2891ec69f3e1d624106e7951889a2b980809f9a425d251ade50a7502a9cdf61")
    override fun masterUser(masterUser: Login.Builder.() -> Unit): Unit =
        masterUser(Login(masterUser))

    /**
     * @param parameterGroup The DB parameter group to associate with the instance.
     */
    override fun parameterGroup(parameterGroup: IClusterParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IClusterParameterGroup.Companion::unwrap))
    }

    /**
     * @param port The port the DocumentDB cluster will listen on.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param preferredMaintenanceWindow A weekly time range in which maintenance should preferably
     * execute.
     * Must be at least 30 minutes long.
     *
     * Example: 'tue:04:17-tue:04:47'
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed or replaced during a stack update, or when the stack is deleted.
     * This
     * removal policy also applies to the implicit security group created for the
     * cluster if one is not supplied as a parameter.
     *
     * When set to `SNAPSHOT`, the removal policy for the instances and the security group
     * will default to `DESTROY` as those resources do not support the policy.
     *
     * Use the `instanceRemovalPolicy` and `securityGroupRemovalPolicy` to change the behavior.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param securityGroup Security group.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroupRemovalPolicy The removal policy to apply to the cluster's security
     * group.
     * Cannot be set to `SNAPSHOT`.
     */
    override fun securityGroupRemovalPolicy(securityGroupRemovalPolicy: RemovalPolicy) {
      cdkBuilder.securityGroupRemovalPolicy(securityGroupRemovalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param storageEncrypted Whether to enable storage encryption.
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param storageType The storage type of the DocDB cluster.
     * I/O-optimized storage is supported starting with engine version 5.0.0.
     */
    override fun storageType(storageType: StorageType) {
      cdkBuilder.storageType(storageType.let(StorageType.Companion::unwrap))
    }

    /**
     * @param vpc What subnets to run the DocumentDB instances in. 
     * Must be at least 2 subnets in two different AZs.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0401c178c76eb75037a815f98ed065d453ef676ff25836bd8741bb5247281f11")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.docdb.DatabaseClusterProps,
  ) : CdkObject(cdkObject),
      DatabaseClusterProps {
    /**
     * Backup settings.
     *
     * Default: - Backup retention period for automated backups is 1 day.
     * Backup preferred window is set to a 30-minute window selected at random from an
     * 8-hour block of time for each AWS Region, occurring on a random day of the week.
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/backup-restore.db-cluster-snapshots.html#backup-restore.backup-window)
     */
    override fun backup(): BackupProps? = unwrap(this).getBackup()?.let(BackupProps::wrap)

    /**
     * The identifier of the CA certificate used for the instances.
     *
     * Specifying or updating this property triggers a reboot.
     *
     * Default: - DocumentDB will choose a certificate authority
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     */
    override fun caCertificate(): CaCertificate? =
        unwrap(this).getCaCertificate()?.let(CaCertificate::wrap)

    /**
     * The number of days log events are kept in CloudWatch Logs.
     *
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `Infinity`.
     *
     * Default: - logs never expire
     */
    override fun cloudWatchLogsRetention(): RetentionDays? =
        unwrap(this).getCloudWatchLogsRetention()?.let(RetentionDays::wrap)

    /**
     * The IAM role for the Lambda function associated with the custom resource that sets the
     * retention policy.
     *
     * Default: - a new role is created.
     */
    override fun cloudWatchLogsRetentionRole(): IRole? =
        unwrap(this).getCloudWatchLogsRetentionRole()?.let(IRole::wrap)

    /**
     * Whether to copy tags to the snapshot when a snapshot is created.
     *
     * Default: - false
     */
    override fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

    /**
     * An optional identifier for the cluster.
     *
     * Default: - A name is automatically generated.
     */
    override fun dbClusterName(): String? = unwrap(this).getDbClusterName()

    /**
     * Specifies whether this cluster can be deleted.
     *
     * If deletionProtection is
     * enabled, the cluster cannot be deleted unless it is modified and
     * deletionProtection is disabled. deletionProtection protects clusters from
     * being accidentally deleted.
     *
     * Default: - false
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    /**
     * A value that indicates whether to enable Performance Insights for the instances in the DB
     * Cluster.
     *
     * Default: - false
     */
    override fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    /**
     * What version of the database to start.
     *
     * Default: -  the latest major version
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * Whether the audit logs should be exported to CloudWatch.
     *
     * Note that you also have to configure the audit log export in the Cluster's Parameter Group.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/event-auditing.html#event-auditing-enabling-auditing)
     */
    override fun exportAuditLogsToCloudWatch(): Boolean? =
        unwrap(this).getExportAuditLogsToCloudWatch()

    /**
     * Whether the profiler logs should be exported to CloudWatch.
     *
     * Note that you also have to configure the profiler log export in the Cluster's Parameter
     * Group.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html#profiling.enable-profiling)
     */
    override fun exportProfilerLogsToCloudWatch(): Boolean? =
        unwrap(this).getExportProfilerLogsToCloudWatch()

    /**
     * Base identifier for instances.
     *
     * Every replica is named by appending the replica number to this string, 1-based.
     *
     * Default: - `dbClusterName` is used with the word "Instance" appended. If `dbClusterName` is
     * not provided, the
     * identifier is automatically generated.
     */
    override fun instanceIdentifierBase(): String? = unwrap(this).getInstanceIdentifierBase()

    /**
     * The removal policy to apply to the cluster's instances.
     *
     * Cannot be set to `SNAPSHOT`.
     *
     * Default: - `RemovalPolicy.DESTROY` when `removalPolicy` is set to `SNAPSHOT`, `removalPolicy`
     * otherwise.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     */
    override fun instanceRemovalPolicy(): RemovalPolicy? =
        unwrap(this).getInstanceRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * What type of instance to start for the replicas.
     */
    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    /**
     * Number of DocDB compute instances.
     *
     * Default: 1
     */
    override fun instances(): Number? = unwrap(this).getInstances()

    /**
     * The KMS key for storage encryption.
     *
     * Default: - default master key.
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * Username and password for the administrative user.
     */
    override fun masterUser(): Login = unwrap(this).getMasterUser().let(Login::wrap)

    /**
     * The DB parameter group to associate with the instance.
     *
     * Default: no parameter group
     */
    override fun parameterGroup(): IClusterParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IClusterParameterGroup::wrap)

    /**
     * The port the DocumentDB cluster will listen on.
     *
     * Default: DatabaseCluster.DEFAULT_PORT
     */
    override fun port(): Number? = unwrap(this).getPort()

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
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * The removal policy to apply when the cluster and its instances are removed or replaced during
     * a stack update, or when the stack is deleted.
     *
     * This
     * removal policy also applies to the implicit security group created for the
     * cluster if one is not supplied as a parameter.
     *
     * When set to `SNAPSHOT`, the removal policy for the instances and the security group
     * will default to `DESTROY` as those resources do not support the policy.
     *
     * Use the `instanceRemovalPolicy` and `securityGroupRemovalPolicy` to change the behavior.
     *
     * Default: - Retain cluster.
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Security group.
     *
     * Default: a new security group is created.
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * The removal policy to apply to the cluster's security group.
     *
     * Cannot be set to `SNAPSHOT`.
     *
     * Default: - `RemovalPolicy.DESTROY` when `removalPolicy` is set to `SNAPSHOT`, `removalPolicy`
     * otherwise.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     */
    override fun securityGroupRemovalPolicy(): RemovalPolicy? =
        unwrap(this).getSecurityGroupRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Whether to enable storage encryption.
     *
     * Default: true
     */
    override fun storageEncrypted(): Boolean? = unwrap(this).getStorageEncrypted()

    /**
     * The storage type of the DocDB cluster.
     *
     * I/O-optimized storage is supported starting with engine version 5.0.0.
     *
     * Default: StorageType.STANDARD
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/release-notes.html#release-notes.11-21-2023)
     */
    override fun storageType(): StorageType? = unwrap(this).getStorageType()?.let(StorageType::wrap)

    /**
     * What subnets to run the DocumentDB instances in.
     *
     * Must be at least 2 subnets in two different AZs.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * Where to place the instances within the VPC.
     *
     * Default: private subnets
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseClusterProps):
        DatabaseClusterProps = CdkObjectWrappers.wrap(cdkObject) as? DatabaseClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterProps):
        software.amazon.awscdk.services.docdb.DatabaseClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.DatabaseClusterProps
  }
}
