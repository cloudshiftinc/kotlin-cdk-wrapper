@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.rds.CaCertificate
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotation
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup as CloudshiftdevAwscdkServicesEc2ISecurityGroup
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.amazon.awscdk.services.ec2.ISecurityGroup as AmazonAwscdkServicesEc2ISecurityGroup
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a clustered database with a given number of instances.
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
public open class DatabaseCluster(
  cdkObject: software.amazon.awscdk.services.docdb.DatabaseCluster,
) : Resource(cdkObject),
    IDatabaseCluster {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DatabaseClusterProps,
  ) :
      this(software.amazon.awscdk.services.docdb.DatabaseCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(DatabaseClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DatabaseClusterProps.Builder.() -> Unit,
  ) : this(scope, id, DatabaseClusterProps(props)
  )

  /**
   * Adds the multi user rotation to this cluster.
   *
   * @param id 
   * @param options 
   */
  public open fun addRotationMultiUser(id: String, options: RotationMultiUserOptions):
      SecretRotation = unwrap(this).addRotationMultiUser(id,
      options.let(RotationMultiUserOptions.Companion::unwrap)).let(SecretRotation::wrap)

  /**
   * Adds the multi user rotation to this cluster.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b8b044ea922f9f1b7e3ef5250128d6276285a347cedba57d10866b433d1856a")
  public open fun addRotationMultiUser(id: String,
      options: RotationMultiUserOptions.Builder.() -> Unit): SecretRotation =
      addRotationMultiUser(id, RotationMultiUserOptions(options))

  /**
   * Adds the single user rotation of the master password to this cluster.
   *
   * @param automaticallyAfter Specifies the number of days after the previous rotation before
   * Secrets Manager triggers the next automatic rotation.
   */
  public open fun addRotationSingleUser(): SecretRotation =
      unwrap(this).addRotationSingleUser().let(SecretRotation::wrap)

  /**
   * Adds the single user rotation of the master password to this cluster.
   *
   * @param automaticallyAfter Specifies the number of days after the previous rotation before
   * Secrets Manager triggers the next automatic rotation.
   */
  public open fun addRotationSingleUser(automaticallyAfter: Duration): SecretRotation =
      unwrap(this).addRotationSingleUser(automaticallyAfter.let(Duration.Companion::unwrap)).let(SecretRotation::wrap)

  /**
   * Adds security groups to this cluster.
   *
   * @param securityGroups The security groups to add. 
   */
  public open fun addSecurityGroups(vararg
      securityGroups: CloudshiftdevAwscdkServicesEc2ISecurityGroup) {
    unwrap(this).addSecurityGroups(*securityGroups.map{CdkObjectWrappers.unwrap(it) as
        AmazonAwscdkServicesEc2ISecurityGroup}.toTypedArray())
  }

  /**
   * Renders the secret attachment target specifications.
   */
  public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
      unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

  /**
   * The endpoint to use for read/write operations.
   */
  public override fun clusterEndpoint(): Endpoint =
      unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

  /**
   * Identifier of the cluster.
   */
  public override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  /**
   * Endpoint to use for load-balanced read-only operations.
   */
  public override fun clusterReadEndpoint(): Endpoint =
      unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

  /**
   * The resource id for the cluster;
   *
   * for example: cluster-ABCD1234EFGH5678IJKL90MNOP. The cluster ID uniquely
   * identifies the cluster and is used in things like IAM authentication policies.
   */
  public open fun clusterResourceIdentifier(): String = unwrap(this).getClusterResourceIdentifier()

  /**
   * The connections object to implement IConnectable.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Endpoints which address each individual replica.
   */
  public override fun instanceEndpoints(): List<Endpoint> =
      unwrap(this).getInstanceEndpoints().map(Endpoint::wrap)

  /**
   * Identifiers of the replicas.
   */
  public override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers()

  /**
   * The secret attached to this cluster.
   */
  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  /**
   * Security group identifier of this database.
   */
  public override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.docdb.DatabaseCluster].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun backup(backup: BackupProps)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c96b7df7819668cd86079d0487b9e2f82c8b347b3683ead131c1b3fe19811fac")
    public fun backup(backup: BackupProps.Builder.() -> Unit)

    /**
     * The identifier of the CA certificate used for the instances.
     *
     * Specifying or updating this property triggers a reboot.
     *
     * Default: - DocumentDB will choose a certificate authority
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     * @param caCertificate The identifier of the CA certificate used for the instances. 
     */
    public fun caCertificate(caCertificate: CaCertificate)

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
    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays)

    /**
     * The IAM role for the Lambda function associated with the custom resource that sets the
     * retention policy.
     *
     * Default: - a new role is created.
     *
     * @param cloudWatchLogsRetentionRole The IAM role for the Lambda function associated with the
     * custom resource that sets the retention policy. 
     */
    public fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole)

    /**
     * Whether to copy tags to the snapshot when a snapshot is created.
     *
     * Default: - false
     *
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created. 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * An optional identifier for the cluster.
     *
     * Default: - A name is automatically generated.
     *
     * @param dbClusterName An optional identifier for the cluster. 
     */
    public fun dbClusterName(dbClusterName: String)

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
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * A value that indicates whether to enable Performance Insights for the instances in the DB
     * Cluster.
     *
     * Default: - false
     *
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the instances in the DB Cluster. 
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * What version of the database to start.
     *
     * Default: -  the latest major version
     *
     * @param engineVersion What version of the database to start. 
     */
    public fun engineVersion(engineVersion: String)

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
    public fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean)

    /**
     * Whether the profiler logs should be exported to CloudWatch.
     *
     * Note that you also have to configure the profiler log export in the Cluster's Parameter
     * Group.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html#profiling.enable-profiling)
     * @param exportProfilerLogsToCloudWatch Whether the profiler logs should be exported to
     * CloudWatch. 
     */
    public fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean)

    /**
     * Base identifier for instances.
     *
     * Every replica is named by appending the replica number to this string, 1-based.
     *
     * Default: - `dbClusterName` is used with the word "Instance" appended. If `dbClusterName` is
     * not provided, the
     * identifier is automatically generated.
     *
     * @param instanceIdentifierBase Base identifier for instances. 
     */
    public fun instanceIdentifierBase(instanceIdentifierBase: String)

    /**
     * The removal policy to apply to the cluster's instances.
     *
     * Cannot be set to `SNAPSHOT`.
     *
     * Default: - `RemovalPolicy.DESTROY` when `removalPolicy` is set to `SNAPSHOT`, `removalPolicy`
     * otherwise.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * @param instanceRemovalPolicy The removal policy to apply to the cluster's instances. 
     */
    public fun instanceRemovalPolicy(instanceRemovalPolicy: RemovalPolicy)

    /**
     * What type of instance to start for the replicas.
     *
     * @param instanceType What type of instance to start for the replicas. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * Number of DocDB compute instances.
     *
     * Default: 1
     *
     * @param instances Number of DocDB compute instances. 
     */
    public fun instances(instances: Number)

    /**
     * The KMS key for storage encryption.
     *
     * Default: - default master key.
     *
     * @param kmsKey The KMS key for storage encryption. 
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * Username and password for the administrative user.
     *
     * @param masterUser Username and password for the administrative user. 
     */
    public fun masterUser(masterUser: Login)

    /**
     * Username and password for the administrative user.
     *
     * @param masterUser Username and password for the administrative user. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38d2499bd6d916c15f6314c69c7931f6bfc68daf7e26bf4c71c60bda60e8605a")
    public fun masterUser(masterUser: Login.Builder.() -> Unit)

    /**
     * The DB parameter group to associate with the instance.
     *
     * Default: no parameter group
     *
     * @param parameterGroup The DB parameter group to associate with the instance. 
     */
    public fun parameterGroup(parameterGroup: IClusterParameterGroup)

    /**
     * The port the DocumentDB cluster will listen on.
     *
     * Default: DatabaseCluster.DEFAULT_PORT
     *
     * @param port The port the DocumentDB cluster will listen on. 
     */
    public fun port(port: Number)

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
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

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
     *
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed or replaced during a stack update, or when the stack is deleted. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * Security group.
     *
     * Default: a new security group is created.
     *
     * @param securityGroup Security group. 
     */
    public fun securityGroup(securityGroup: CloudshiftdevAwscdkServicesEc2ISecurityGroup)

    /**
     * The removal policy to apply to the cluster's security group.
     *
     * Cannot be set to `SNAPSHOT`.
     *
     * Default: - `RemovalPolicy.DESTROY` when `removalPolicy` is set to `SNAPSHOT`, `removalPolicy`
     * otherwise.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * @param securityGroupRemovalPolicy The removal policy to apply to the cluster's security
     * group. 
     */
    public fun securityGroupRemovalPolicy(securityGroupRemovalPolicy: RemovalPolicy)

    /**
     * Whether to enable storage encryption.
     *
     * Default: true
     *
     * @param storageEncrypted Whether to enable storage encryption. 
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * The storage type of the DocDB cluster.
     *
     * I/O-optimized storage is supported starting with engine version 5.0.0.
     *
     * Default: StorageType.STANDARD
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/release-notes.html#release-notes.11-21-2023)
     * @param storageType The storage type of the DocDB cluster. 
     */
    public fun storageType(storageType: StorageType)

    /**
     * What subnets to run the DocumentDB instances in.
     *
     * Must be at least 2 subnets in two different AZs.
     *
     * @param vpc What subnets to run the DocumentDB instances in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Where to place the instances within the VPC.
     *
     * Default: private subnets
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Where to place the instances within the VPC.
     *
     * Default: private subnets
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("091172f9d8b70d03d056ac667cf52b06f2f8d009b9a8a20e165048f3805a713a")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseCluster.Builder =
        software.amazon.awscdk.services.docdb.DatabaseCluster.Builder.create(scope, id)

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
    override fun backup(backup: BackupProps) {
      cdkBuilder.backup(backup.let(BackupProps.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c96b7df7819668cd86079d0487b9e2f82c8b347b3683ead131c1b3fe19811fac")
    override fun backup(backup: BackupProps.Builder.() -> Unit): Unit = backup(BackupProps(backup))

    /**
     * The identifier of the CA certificate used for the instances.
     *
     * Specifying or updating this property triggers a reboot.
     *
     * Default: - DocumentDB will choose a certificate authority
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/ca_cert_rotation.html)
     * @param caCertificate The identifier of the CA certificate used for the instances. 
     */
    override fun caCertificate(caCertificate: CaCertificate) {
      cdkBuilder.caCertificate(caCertificate.let(CaCertificate.Companion::unwrap))
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
    override fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention.let(RetentionDays.Companion::unwrap))
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
    override fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole.let(IRole.Companion::unwrap))
    }

    /**
     * Whether to copy tags to the snapshot when a snapshot is created.
     *
     * Default: - false
     *
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created. 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * An optional identifier for the cluster.
     *
     * Default: - A name is automatically generated.
     *
     * @param dbClusterName An optional identifier for the cluster. 
     */
    override fun dbClusterName(dbClusterName: String) {
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
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * A value that indicates whether to enable Performance Insights for the instances in the DB
     * Cluster.
     *
     * Default: - false
     *
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     * Insights for the instances in the DB Cluster. 
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * What version of the database to start.
     *
     * Default: -  the latest major version
     *
     * @param engineVersion What version of the database to start. 
     */
    override fun engineVersion(engineVersion: String) {
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
    override fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean) {
      cdkBuilder.exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch)
    }

    /**
     * Whether the profiler logs should be exported to CloudWatch.
     *
     * Note that you also have to configure the profiler log export in the Cluster's Parameter
     * Group.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/profiling.html#profiling.enable-profiling)
     * @param exportProfilerLogsToCloudWatch Whether the profiler logs should be exported to
     * CloudWatch. 
     */
    override fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean) {
      cdkBuilder.exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch)
    }

    /**
     * Base identifier for instances.
     *
     * Every replica is named by appending the replica number to this string, 1-based.
     *
     * Default: - `dbClusterName` is used with the word "Instance" appended. If `dbClusterName` is
     * not provided, the
     * identifier is automatically generated.
     *
     * @param instanceIdentifierBase Base identifier for instances. 
     */
    override fun instanceIdentifierBase(instanceIdentifierBase: String) {
      cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    /**
     * The removal policy to apply to the cluster's instances.
     *
     * Cannot be set to `SNAPSHOT`.
     *
     * Default: - `RemovalPolicy.DESTROY` when `removalPolicy` is set to `SNAPSHOT`, `removalPolicy`
     * otherwise.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * @param instanceRemovalPolicy The removal policy to apply to the cluster's instances. 
     */
    override fun instanceRemovalPolicy(instanceRemovalPolicy: RemovalPolicy) {
      cdkBuilder.instanceRemovalPolicy(instanceRemovalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * What type of instance to start for the replicas.
     *
     * @param instanceType What type of instance to start for the replicas. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType.Companion::unwrap))
    }

    /**
     * Number of DocDB compute instances.
     *
     * Default: 1
     *
     * @param instances Number of DocDB compute instances. 
     */
    override fun instances(instances: Number) {
      cdkBuilder.instances(instances)
    }

    /**
     * The KMS key for storage encryption.
     *
     * Default: - default master key.
     *
     * @param kmsKey The KMS key for storage encryption. 
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * Username and password for the administrative user.
     *
     * @param masterUser Username and password for the administrative user. 
     */
    override fun masterUser(masterUser: Login) {
      cdkBuilder.masterUser(masterUser.let(Login.Companion::unwrap))
    }

    /**
     * Username and password for the administrative user.
     *
     * @param masterUser Username and password for the administrative user. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38d2499bd6d916c15f6314c69c7931f6bfc68daf7e26bf4c71c60bda60e8605a")
    override fun masterUser(masterUser: Login.Builder.() -> Unit): Unit =
        masterUser(Login(masterUser))

    /**
     * The DB parameter group to associate with the instance.
     *
     * Default: no parameter group
     *
     * @param parameterGroup The DB parameter group to associate with the instance. 
     */
    override fun parameterGroup(parameterGroup: IClusterParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IClusterParameterGroup.Companion::unwrap))
    }

    /**
     * The port the DocumentDB cluster will listen on.
     *
     * Default: DatabaseCluster.DEFAULT_PORT
     *
     * @param port The port the DocumentDB cluster will listen on. 
     */
    override fun port(port: Number) {
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
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

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
     *
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed or replaced during a stack update, or when the stack is deleted. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * Security group.
     *
     * Default: a new security group is created.
     *
     * @param securityGroup Security group. 
     */
    override fun securityGroup(securityGroup: CloudshiftdevAwscdkServicesEc2ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(CloudshiftdevAwscdkServicesEc2ISecurityGroup.Companion::unwrap))
    }

    /**
     * The removal policy to apply to the cluster's security group.
     *
     * Cannot be set to `SNAPSHOT`.
     *
     * Default: - `RemovalPolicy.DESTROY` when `removalPolicy` is set to `SNAPSHOT`, `removalPolicy`
     * otherwise.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * @param securityGroupRemovalPolicy The removal policy to apply to the cluster's security
     * group. 
     */
    override fun securityGroupRemovalPolicy(securityGroupRemovalPolicy: RemovalPolicy) {
      cdkBuilder.securityGroupRemovalPolicy(securityGroupRemovalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * Whether to enable storage encryption.
     *
     * Default: true
     *
     * @param storageEncrypted Whether to enable storage encryption. 
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * The storage type of the DocDB cluster.
     *
     * I/O-optimized storage is supported starting with engine version 5.0.0.
     *
     * Default: StorageType.STANDARD
     *
     * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/release-notes.html#release-notes.11-21-2023)
     * @param storageType The storage type of the DocDB cluster. 
     */
    override fun storageType(storageType: StorageType) {
      cdkBuilder.storageType(storageType.let(StorageType.Companion::unwrap))
    }

    /**
     * What subnets to run the DocumentDB instances in.
     *
     * Must be at least 2 subnets in two different AZs.
     *
     * @param vpc What subnets to run the DocumentDB instances in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * Where to place the instances within the VPC.
     *
     * Default: private subnets
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * Where to place the instances within the VPC.
     *
     * Default: private subnets
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("091172f9d8b70d03d056ac667cf52b06f2f8d009b9a8a20e165048f3805a713a")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseCluster = cdkBuilder.build()
  }

  public companion object {
    public val DEFAULT_NUM_INSTANCES: Number =
        software.amazon.awscdk.services.docdb.DatabaseCluster.DEFAULT_NUM_INSTANCES

    public val DEFAULT_PORT: Number =
        software.amazon.awscdk.services.docdb.DatabaseCluster.DEFAULT_PORT

    public fun fromDatabaseClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DatabaseClusterAttributes,
    ): IDatabaseCluster =
        software.amazon.awscdk.services.docdb.DatabaseCluster.fromDatabaseClusterAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(DatabaseClusterAttributes.Companion::unwrap)).let(IDatabaseCluster::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e421efc8468697cbb6411872efd05956c0ff05aff40cd5e11355e43937395e19")
    public fun fromDatabaseClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DatabaseClusterAttributes.Builder.() -> Unit,
    ): IDatabaseCluster = fromDatabaseClusterAttributes(scope, id, DatabaseClusterAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DatabaseCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DatabaseCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseCluster):
        DatabaseCluster = DatabaseCluster(cdkObject)

    internal fun unwrap(wrapped: DatabaseCluster):
        software.amazon.awscdk.services.docdb.DatabaseCluster = wrapped.cdkObject as
        software.amazon.awscdk.services.docdb.DatabaseCluster
  }
}
