@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::RDS::DBCluster` resource creates an Amazon Aurora DB cluster or Multi-AZ DB cluster.
 *
 * For more information about creating an Aurora DB cluster, see [Creating an Amazon Aurora DB
 * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.CreateInstance.html) in
 * the *Amazon Aurora User Guide* .
 *
 * For more information about creating a Multi-AZ DB cluster, see [Creating a Multi-AZ DB
 * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/create-multi-az-db-cluster.html) in
 * the *Amazon RDS User Guide* .
 *
 *
 * You can only create this resource in AWS Regions where Amazon Aurora or Multi-AZ DB clusters are
 * supported.
 *
 *
 * *Updating DB clusters*
 *
 * When properties labeled " *Update requires:*
 * [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
 * " are updated, AWS CloudFormation first creates a replacement DB cluster, then changes references
 * from other dependent resources to point to the replacement DB cluster, and finally deletes the old
 * DB cluster.
 *
 *
 * We highly recommend that you take a snapshot of the database before updating the stack. If you
 * don't, you lose the data when AWS CloudFormation replaces your DB cluster. To preserve your data,
 * perform the following procedure:
 *
 * * Deactivate any applications that are using the DB cluster so that there's no activity on the DB
 * instance.
 * * Create a snapshot of the DB cluster. For more information, see [Creating a DB Cluster
 * Snapshot](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CreateSnapshotCluster.html)
 * .
 * * If you want to restore your DB cluster using a DB cluster snapshot, modify the updated template
 * with your DB cluster changes and add the `SnapshotIdentifier` property with the ID of the DB cluster
 * snapshot that you want to use.
 *
 * After you restore a DB cluster with a `SnapshotIdentifier` property, you must specify the same
 * `SnapshotIdentifier` property for any future updates to the DB cluster. When you specify this
 * property for an update, the DB cluster is not restored from the DB cluster snapshot again, and the
 * data in the database is not changed. However, if you don't specify the `SnapshotIdentifier`
 * property, an empty DB cluster is created, and the original DB cluster is deleted. If you specify a
 * property that is different from the previous snapshot restore property, a new DB cluster is restored
 * from the specified `SnapshotIdentifier` property, and the original DB cluster is deleted.
 *
 * * Update the stack.
 *
 *
 * Currently, when you are updating the stack for an Aurora Serverless DB cluster, you can't include
 * changes to any other properties when you specify one of the following properties:
 * `PreferredBackupWindow` , `PreferredMaintenanceWindow` , and `Port` . This limitation doesn't apply
 * to provisioned DB clusters.
 *
 * For more information about updating other properties of this resource, see
 * `[ModifyDBCluster](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_ModifyDBCluster.html)`
 * . For more information about updating stacks, see [AWS CloudFormation Stacks
 * Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
 * .
 *
 * *Deleting DB clusters*
 *
 * The default `DeletionPolicy` for `AWS::RDS::DBCluster` resources is `Snapshot` . For more
 * information about how AWS CloudFormation deletes resources, see [DeletionPolicy
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBCluster cfnDBCluster = CfnDBCluster.Builder.create(this, "MyCfnDBCluster")
 * .allocatedStorage(123)
 * .associatedRoles(List.of(DBClusterRoleProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .featureName("featureName")
 * .build()))
 * .autoMinorVersionUpgrade(false)
 * .availabilityZones(List.of("availabilityZones"))
 * .backtrackWindow(123)
 * .backupRetentionPeriod(123)
 * .copyTagsToSnapshot(false)
 * .databaseName("databaseName")
 * .dbClusterIdentifier("dbClusterIdentifier")
 * .dbClusterInstanceClass("dbClusterInstanceClass")
 * .dbClusterParameterGroupName("dbClusterParameterGroupName")
 * .dbInstanceParameterGroupName("dbInstanceParameterGroupName")
 * .dbSubnetGroupName("dbSubnetGroupName")
 * .dbSystemId("dbSystemId")
 * .deletionProtection(false)
 * .domain("domain")
 * .domainIamRoleName("domainIamRoleName")
 * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
 * .enableGlobalWriteForwarding(false)
 * .enableHttpEndpoint(false)
 * .enableIamDatabaseAuthentication(false)
 * .engine("engine")
 * .engineMode("engineMode")
 * .engineVersion("engineVersion")
 * .globalClusterIdentifier("globalClusterIdentifier")
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .manageMasterUserPassword(false)
 * .masterUsername("masterUsername")
 * .masterUserPassword("masterUserPassword")
 * .masterUserSecret(MasterUserSecretProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .secretArn("secretArn")
 * .build())
 * .monitoringInterval(123)
 * .monitoringRoleArn("monitoringRoleArn")
 * .networkType("networkType")
 * .performanceInsightsEnabled(false)
 * .performanceInsightsKmsKeyId("performanceInsightsKmsKeyId")
 * .performanceInsightsRetentionPeriod(123)
 * .port(123)
 * .preferredBackupWindow("preferredBackupWindow")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .publiclyAccessible(false)
 * .replicationSourceIdentifier("replicationSourceIdentifier")
 * .restoreToTime("restoreToTime")
 * .restoreType("restoreType")
 * .scalingConfiguration(ScalingConfigurationProperty.builder()
 * .autoPause(false)
 * .maxCapacity(123)
 * .minCapacity(123)
 * .secondsBeforeTimeout(123)
 * .secondsUntilAutoPause(123)
 * .timeoutAction("timeoutAction")
 * .build())
 * .serverlessV2ScalingConfiguration(ServerlessV2ScalingConfigurationProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .build())
 * .snapshotIdentifier("snapshotIdentifier")
 * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
 * .sourceRegion("sourceRegion")
 * .storageEncrypted(false)
 * .storageType("storageType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .useLatestRestorableTime(false)
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
 */
public open class CfnDBCluster(
  cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.rds.CfnDBCluster(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBClusterProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnDBCluster(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDBClusterProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDBClusterProps(props)
  )

  /**
   * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB
   * cluster.
   */
  public open fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

  /**
   * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB
   * cluster.
   */
  public open fun allocatedStorage(`value`: Number) {
    unwrap(this).setAllocatedStorage(`value`)
  }

  /**
   * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with
   * the DB cluster.
   */
  public open fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  /**
   * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with
   * the DB cluster.
   */
  public open fun associatedRoles(`value`: IResolvable) {
    unwrap(this).setAssociatedRoles(`value`.let(IResolvable::unwrap))
  }

  /**
   * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with
   * the DB cluster.
   */
  public open fun associatedRoles(`value`: List<Any>) {
    unwrap(this).setAssociatedRoles(`value`)
  }

  /**
   * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with
   * the DB cluster.
   */
  public open fun associatedRoles(vararg `value`: Any): Unit = associatedRoles(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) for the DB cluster.
   */
  public open fun attrDbClusterArn(): String = unwrap(this).getAttrDbClusterArn()

  /**
   * The AWS Region -unique, immutable identifier for the DB cluster.
   *
   * This identifier is found in AWS CloudTrail log entries whenever the KMS key for the DB cluster
   * is accessed.
   */
  public open fun attrDbClusterResourceId(): String = unwrap(this).getAttrDbClusterResourceId()

  /**
   *
   */
  public open fun attrEndpoint(): IResolvable =
      unwrap(this).getAttrEndpoint().let(IResolvable::wrap)

  /**
   * The connection endpoint for the DB cluster.
   *
   * For example: `mystack-mydbcluster-123456789012.us-east-2.rds.amazonaws.com`
   */
  public open fun attrEndpointAddress(): String = unwrap(this).getAttrEndpointAddress()

  /**
   * The port number that will accept connections on this DB cluster.
   *
   * For example: `3306`
   */
  public open fun attrEndpointPort(): String = unwrap(this).getAttrEndpointPort()

  /**
   * The Amazon Resource Name (ARN) of the secret.
   */
  public open fun attrMasterUserSecretSecretArn(): String =
      unwrap(this).getAttrMasterUserSecretSecretArn()

  /**
   *
   */
  public open fun attrReadEndpoint(): IResolvable =
      unwrap(this).getAttrReadEndpoint().let(IResolvable::wrap)

  /**
   * The reader endpoint for the DB cluster.
   *
   * For example: `mystack-mydbcluster-ro-123456789012.us-east-2.rds.amazonaws.com`
   */
  public open fun attrReadEndpointAddress(): String = unwrap(this).getAttrReadEndpointAddress()

  /**
   * The storage throughput for the DB cluster.
   *
   * The throughput is automatically set based on the IOPS that you provision, and is not
   * configurable.
   *
   * This setting is only for non-Aurora Multi-AZ DB clusters.
   */
  public open fun attrStorageThroughput(): Number = unwrap(this).getAttrStorageThroughput()

  /**
   * Specifies whether minor engine upgrades are applied automatically to the DB cluster during the
   * maintenance window.
   */
  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * Specifies whether minor engine upgrades are applied automatically to the DB cluster during the
   * maintenance window.
   */
  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  /**
   * Specifies whether minor engine upgrades are applied automatically to the DB cluster during the
   * maintenance window.
   */
  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
   */
  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  /**
   * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
   */
  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  /**
   * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
   */
  public open fun availabilityZones(vararg `value`: String): Unit =
      availabilityZones(`value`.toList())

  /**
   * The target backtrack window, in seconds.
   *
   * To disable backtracking, set this value to 0.
   */
  public open fun backtrackWindow(): Number? = unwrap(this).getBacktrackWindow()

  /**
   * The target backtrack window, in seconds.
   *
   * To disable backtracking, set this value to 0.
   */
  public open fun backtrackWindow(`value`: Number) {
    unwrap(this).setBacktrackWindow(`value`)
  }

  /**
   * The number of days for which automated backups are retained.
   */
  public open fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  /**
   * The number of days for which automated backups are retained.
   */
  public open fun backupRetentionPeriod(`value`: Number) {
    unwrap(this).setBackupRetentionPeriod(`value`)
  }

  /**
   * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
   * cluster.
   */
  public open fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  /**
   * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
   * cluster.
   */
  public open fun copyTagsToSnapshot(`value`: Boolean) {
    unwrap(this).setCopyTagsToSnapshot(`value`)
  }

  /**
   * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
   * cluster.
   */
  public open fun copyTagsToSnapshot(`value`: IResolvable) {
    unwrap(this).setCopyTagsToSnapshot(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of your database.
   */
  public open fun databaseName(): String? = unwrap(this).getDatabaseName()

  /**
   * The name of your database.
   */
  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  /**
   * The DB cluster identifier.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  /**
   * The DB cluster identifier.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun dbClusterIdentifier(`value`: String) {
    unwrap(this).setDbClusterIdentifier(`value`)
  }

  /**
   * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example
   * `db.m6gd.xlarge` . Not all DB instance classes are available in all AWS Regions , or for all
   * database engines.
   */
  public open fun dbClusterInstanceClass(): String? = unwrap(this).getDbClusterInstanceClass()

  /**
   * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example
   * `db.m6gd.xlarge` . Not all DB instance classes are available in all AWS Regions , or for all
   * database engines.
   */
  public open fun dbClusterInstanceClass(`value`: String) {
    unwrap(this).setDbClusterInstanceClass(`value`)
  }

  /**
   * The name of the DB cluster parameter group to associate with this DB cluster.
   */
  public open fun dbClusterParameterGroupName(): String? =
      unwrap(this).getDbClusterParameterGroupName()

  /**
   * The name of the DB cluster parameter group to associate with this DB cluster.
   */
  public open fun dbClusterParameterGroupName(`value`: String) {
    unwrap(this).setDbClusterParameterGroupName(`value`)
  }

  /**
   * The name of the DB parameter group to apply to all instances of the DB cluster.
   */
  public open fun dbInstanceParameterGroupName(): String? =
      unwrap(this).getDbInstanceParameterGroupName()

  /**
   * The name of the DB parameter group to apply to all instances of the DB cluster.
   */
  public open fun dbInstanceParameterGroupName(`value`: String) {
    unwrap(this).setDbInstanceParameterGroupName(`value`)
  }

  /**
   * A DB subnet group that you want to associate with this DB cluster.
   */
  public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * A DB subnet group that you want to associate with this DB cluster.
   */
  public open fun dbSubnetGroupName(`value`: String) {
    unwrap(this).setDbSubnetGroupName(`value`)
  }

  /**
   * Reserved for future use.
   */
  public open fun dbSystemId(): String? = unwrap(this).getDbSystemId()

  /**
   * Reserved for future use.
   */
  public open fun dbSystemId(`value`: String) {
    unwrap(this).setDbSystemId(`value`)
  }

  /**
   * A value that indicates whether the DB cluster has deletion protection enabled.
   */
  public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * A value that indicates whether the DB cluster has deletion protection enabled.
   */
  public open fun deletionProtection(`value`: Boolean) {
    unwrap(this).setDeletionProtection(`value`)
  }

  /**
   * A value that indicates whether the DB cluster has deletion protection enabled.
   */
  public open fun deletionProtection(`value`: IResolvable) {
    unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
  }

  /**
   * Indicates the directory ID of the Active Directory to create the DB cluster.
   */
  public open fun domain(): String? = unwrap(this).getDomain()

  /**
   * Indicates the directory ID of the Active Directory to create the DB cluster.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  /**
   * Specifies the name of the IAM role to use when making API calls to the Directory Service.
   */
  public open fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

  /**
   * Specifies the name of the IAM role to use when making API calls to the Directory Service.
   */
  public open fun domainIamRoleName(`value`: String) {
    unwrap(this).setDomainIamRoleName(`value`)
  }

  /**
   * The list of log types that need to be enabled for exporting to CloudWatch Logs.
   */
  public open fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  /**
   * The list of log types that need to be enabled for exporting to CloudWatch Logs.
   */
  public open fun enableCloudwatchLogsExports(`value`: List<String>) {
    unwrap(this).setEnableCloudwatchLogsExports(`value`)
  }

  /**
   * The list of log types that need to be enabled for exporting to CloudWatch Logs.
   */
  public open fun enableCloudwatchLogsExports(vararg `value`: String): Unit =
      enableCloudwatchLogsExports(`value`.toList())

  /**
   * Specifies whether to enable this DB cluster to forward write operations to the primary cluster
   * of a global cluster (Aurora global database).
   */
  public open fun enableGlobalWriteForwarding(): Any? =
      unwrap(this).getEnableGlobalWriteForwarding()

  /**
   * Specifies whether to enable this DB cluster to forward write operations to the primary cluster
   * of a global cluster (Aurora global database).
   */
  public open fun enableGlobalWriteForwarding(`value`: Boolean) {
    unwrap(this).setEnableGlobalWriteForwarding(`value`)
  }

  /**
   * Specifies whether to enable this DB cluster to forward write operations to the primary cluster
   * of a global cluster (Aurora global database).
   */
  public open fun enableGlobalWriteForwarding(`value`: IResolvable) {
    unwrap(this).setEnableGlobalWriteForwarding(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether to enable the HTTP endpoint for the DB cluster.
   *
   * By default, the HTTP endpoint isn't enabled.
   */
  public open fun enableHttpEndpoint(): Any? = unwrap(this).getEnableHttpEndpoint()

  /**
   * Specifies whether to enable the HTTP endpoint for the DB cluster.
   *
   * By default, the HTTP endpoint isn't enabled.
   */
  public open fun enableHttpEndpoint(`value`: Boolean) {
    unwrap(this).setEnableHttpEndpoint(`value`)
  }

  /**
   * Specifies whether to enable the HTTP endpoint for the DB cluster.
   *
   * By default, the HTTP endpoint isn't enabled.
   */
  public open fun enableHttpEndpoint(`value`: IResolvable) {
    unwrap(this).setEnableHttpEndpoint(`value`.let(IResolvable::unwrap))
  }

  /**
   * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
   * accounts to database accounts.
   */
  public open fun enableIamDatabaseAuthentication(): Any? =
      unwrap(this).getEnableIamDatabaseAuthentication()

  /**
   * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
   * accounts to database accounts.
   */
  public open fun enableIamDatabaseAuthentication(`value`: Boolean) {
    unwrap(this).setEnableIamDatabaseAuthentication(`value`)
  }

  /**
   * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
   * accounts to database accounts.
   */
  public open fun enableIamDatabaseAuthentication(`value`: IResolvable) {
    unwrap(this).setEnableIamDatabaseAuthentication(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the database engine to be used for this DB cluster.
   */
  public open fun engine(): String? = unwrap(this).getEngine()

  /**
   * The name of the database engine to be used for this DB cluster.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  /**
   * The DB engine mode of the DB cluster, either `provisioned` or `serverless` .
   */
  public open fun engineMode(): String? = unwrap(this).getEngineMode()

  /**
   * The DB engine mode of the DB cluster, either `provisioned` or `serverless` .
   */
  public open fun engineMode(`value`: String) {
    unwrap(this).setEngineMode(`value`)
  }

  /**
   * The version number of the database engine to use.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The version number of the database engine to use.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * If you are configuring an Aurora global database cluster and want your Aurora DB cluster to be
   * a secondary member in the global database cluster, specify the global cluster ID of the global
   * database cluster.
   */
  public open fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

  /**
   * If you are configuring an Aurora global database cluster and want your Aurora DB cluster to be
   * a secondary member in the global database cluster, specify the global cluster ID of the global
   * database cluster.
   */
  public open fun globalClusterIdentifier(`value`: String) {
    unwrap(this).setGlobalClusterIdentifier(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated
   * for each DB instance in the Multi-AZ DB cluster.
   */
  public open fun iops(): Number? = unwrap(this).getIops()

  /**
   * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated
   * for each DB instance in the Multi-AZ DB cluster.
   */
  public open fun iops(`value`: Number) {
    unwrap(this).setIops(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the database
   * instances in the DB cluster, such as
   * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the database
   * instances in the DB cluster, such as
   * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Specifies whether to manage the master user password with AWS Secrets Manager.
   */
  public open fun manageMasterUserPassword(): Any? = unwrap(this).getManageMasterUserPassword()

  /**
   * Specifies whether to manage the master user password with AWS Secrets Manager.
   */
  public open fun manageMasterUserPassword(`value`: Boolean) {
    unwrap(this).setManageMasterUserPassword(`value`)
  }

  /**
   * Specifies whether to manage the master user password with AWS Secrets Manager.
   */
  public open fun manageMasterUserPassword(`value`: IResolvable) {
    unwrap(this).setManageMasterUserPassword(`value`.let(IResolvable::unwrap))
  }

  /**
   * The master password for the DB instance.
   */
  public open fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  /**
   * The master password for the DB instance.
   */
  public open fun masterUserPassword(`value`: String) {
    unwrap(this).setMasterUserPassword(`value`)
  }

  /**
   * The secret managed by RDS in AWS Secrets Manager for the master user password.
   */
  public open fun masterUserSecret(): Any? = unwrap(this).getMasterUserSecret()

  /**
   * The secret managed by RDS in AWS Secrets Manager for the master user password.
   */
  public open fun masterUserSecret(`value`: IResolvable) {
    unwrap(this).setMasterUserSecret(`value`.let(IResolvable::unwrap))
  }

  /**
   * The secret managed by RDS in AWS Secrets Manager for the master user password.
   */
  public open fun masterUserSecret(`value`: MasterUserSecretProperty) {
    unwrap(this).setMasterUserSecret(`value`.let(MasterUserSecretProperty::unwrap))
  }

  /**
   * The secret managed by RDS in AWS Secrets Manager for the master user password.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d73b6deb87473d1504c2b9481f9a6f8dea5646e545a1996e8ef4c8444744e014")
  public open fun masterUserSecret(`value`: MasterUserSecretProperty.Builder.() -> Unit): Unit =
      masterUserSecret(MasterUserSecretProperty(`value`))

  /**
   * The name of the master user for the DB cluster.
   */
  public open fun masterUsername(): String? = unwrap(this).getMasterUsername()

  /**
   * The name of the master user for the DB cluster.
   */
  public open fun masterUsername(`value`: String) {
    unwrap(this).setMasterUsername(`value`)
  }

  /**
   * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the
   * DB cluster.
   */
  public open fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

  /**
   * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the
   * DB cluster.
   */
  public open fun monitoringInterval(`value`: Number) {
    unwrap(this).setMonitoringInterval(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring
   * metrics to Amazon CloudWatch Logs.
   */
  public open fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

  /**
   * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring
   * metrics to Amazon CloudWatch Logs.
   */
  public open fun monitoringRoleArn(`value`: String) {
    unwrap(this).setMonitoringRoleArn(`value`)
  }

  /**
   * The network type of the DB cluster.
   */
  public open fun networkType(): String? = unwrap(this).getNetworkType()

  /**
   * The network type of the DB cluster.
   */
  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
  }

  /**
   * Specifies whether to turn on Performance Insights for the DB cluster.
   */
  public open fun performanceInsightsEnabled(): Any? = unwrap(this).getPerformanceInsightsEnabled()

  /**
   * Specifies whether to turn on Performance Insights for the DB cluster.
   */
  public open fun performanceInsightsEnabled(`value`: Boolean) {
    unwrap(this).setPerformanceInsightsEnabled(`value`)
  }

  /**
   * Specifies whether to turn on Performance Insights for the DB cluster.
   */
  public open fun performanceInsightsEnabled(`value`: IResolvable) {
    unwrap(this).setPerformanceInsightsEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The AWS KMS key identifier for encryption of Performance Insights data.
   */
  public open fun performanceInsightsKmsKeyId(): String? =
      unwrap(this).getPerformanceInsightsKmsKeyId()

  /**
   * The AWS KMS key identifier for encryption of Performance Insights data.
   */
  public open fun performanceInsightsKmsKeyId(`value`: String) {
    unwrap(this).setPerformanceInsightsKmsKeyId(`value`)
  }

  /**
   * The number of days to retain Performance Insights data.
   */
  public open fun performanceInsightsRetentionPeriod(): Number? =
      unwrap(this).getPerformanceInsightsRetentionPeriod()

  /**
   * The number of days to retain Performance Insights data.
   */
  public open fun performanceInsightsRetentionPeriod(`value`: Number) {
    unwrap(this).setPerformanceInsightsRetentionPeriod(`value`)
  }

  /**
   * The port number on which the DB instances in the DB cluster accept connections.
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * The port number on which the DB instances in the DB cluster accept connections.
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * The daily time range during which automated backups are created.
   */
  public open fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The daily time range during which automated backups are created.
   */
  public open fun preferredBackupWindow(`value`: String) {
    unwrap(this).setPreferredBackupWindow(`value`)
  }

  /**
   * The weekly time range during which system maintenance can occur, in Universal Coordinated Time
   * (UTC).
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The weekly time range during which system maintenance can occur, in Universal Coordinated Time
   * (UTC).
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * Specifies whether the DB cluster is publicly accessible.
   */
  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * Specifies whether the DB cluster is publicly accessible.
   */
  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  /**
   * Specifies whether the DB cluster is publicly accessible.
   */
  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is
   * created as a read replica.
   */
  public open fun replicationSourceIdentifier(): String? =
      unwrap(this).getReplicationSourceIdentifier()

  /**
   * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is
   * created as a read replica.
   */
  public open fun replicationSourceIdentifier(`value`: String) {
    unwrap(this).setReplicationSourceIdentifier(`value`)
  }

  /**
   * The date and time to restore the DB cluster to.
   */
  public open fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

  /**
   * The date and time to restore the DB cluster to.
   */
  public open fun restoreToTime(`value`: String) {
    unwrap(this).setRestoreToTime(`value`)
  }

  /**
   * The type of restore to be performed.
   *
   * You can specify one of the following values:.
   */
  public open fun restoreType(): String? = unwrap(this).getRestoreType()

  /**
   * The type of restore to be performed.
   *
   * You can specify one of the following values:.
   */
  public open fun restoreType(`value`: String) {
    unwrap(this).setRestoreType(`value`)
  }

  /**
   * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
   * Serverless DB cluster.
   */
  public open fun scalingConfiguration(): Any? = unwrap(this).getScalingConfiguration()

  /**
   * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
   * Serverless DB cluster.
   */
  public open fun scalingConfiguration(`value`: IResolvable) {
    unwrap(this).setScalingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
   * Serverless DB cluster.
   */
  public open fun scalingConfiguration(`value`: ScalingConfigurationProperty) {
    unwrap(this).setScalingConfiguration(`value`.let(ScalingConfigurationProperty::unwrap))
  }

  /**
   * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
   * Serverless DB cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("86aad0a68f36b9d040df465f8a32a83e067932cd783b680eeb2aac72b4cbcab5")
  public open fun scalingConfiguration(`value`: ScalingConfigurationProperty.Builder.() -> Unit):
      Unit = scalingConfiguration(ScalingConfigurationProperty(`value`))

  /**
   * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of an
   * Aurora Serverless V2 DB cluster.
   */
  public open fun serverlessV2ScalingConfiguration(): Any? =
      unwrap(this).getServerlessV2ScalingConfiguration()

  /**
   * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of an
   * Aurora Serverless V2 DB cluster.
   */
  public open fun serverlessV2ScalingConfiguration(`value`: IResolvable) {
    unwrap(this).setServerlessV2ScalingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of an
   * Aurora Serverless V2 DB cluster.
   */
  public open
      fun serverlessV2ScalingConfiguration(`value`: ServerlessV2ScalingConfigurationProperty) {
    unwrap(this).setServerlessV2ScalingConfiguration(`value`.let(ServerlessV2ScalingConfigurationProperty::unwrap))
  }

  /**
   * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of an
   * Aurora Serverless V2 DB cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("16656dde8dddfb9772783b78be13a984a660ee7b3ee9b1b7709e1f915ad90afd")
  public open
      fun serverlessV2ScalingConfiguration(`value`: ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit):
      Unit = serverlessV2ScalingConfiguration(ServerlessV2ScalingConfigurationProperty(`value`))

  /**
   * The identifier for the DB snapshot or DB cluster snapshot to restore from.
   */
  public open fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  /**
   * The identifier for the DB snapshot or DB cluster snapshot to restore from.
   */
  public open fun snapshotIdentifier(`value`: String) {
    unwrap(this).setSnapshotIdentifier(`value`)
  }

  /**
   * When restoring a DB cluster to a point in time, the identifier of the source DB cluster from
   * which to restore.
   */
  public open fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  /**
   * When restoring a DB cluster to a point in time, the identifier of the source DB cluster from
   * which to restore.
   */
  public open fun sourceDbClusterIdentifier(`value`: String) {
    unwrap(this).setSourceDbClusterIdentifier(`value`)
  }

  /**
   * The AWS Region which contains the source DB cluster when replicating a DB cluster.
   *
   * For example, `us-east-1` .
   */
  public open fun sourceRegion(): String? = unwrap(this).getSourceRegion()

  /**
   * The AWS Region which contains the source DB cluster when replicating a DB cluster.
   *
   * For example, `us-east-1` .
   */
  public open fun sourceRegion(`value`: String) {
    unwrap(this).setSourceRegion(`value`)
  }

  /**
   * Indicates whether the DB cluster is encrypted.
   */
  public open fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  /**
   * Indicates whether the DB cluster is encrypted.
   */
  public open fun storageEncrypted(`value`: Boolean) {
    unwrap(this).setStorageEncrypted(`value`)
  }

  /**
   * Indicates whether the DB cluster is encrypted.
   */
  public open fun storageEncrypted(`value`: IResolvable) {
    unwrap(this).setStorageEncrypted(`value`.let(IResolvable::unwrap))
  }

  /**
   * The storage type to associate with the DB cluster.
   */
  public open fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * The storage type to associate with the DB cluster.
   */
  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An optional array of key-value pairs to apply to this DB cluster.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An optional array of key-value pairs to apply to this DB cluster.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An optional array of key-value pairs to apply to this DB cluster.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A value that indicates whether to restore the DB cluster to the latest restorable backup time.
   */
  public open fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  /**
   * A value that indicates whether to restore the DB cluster to the latest restorable backup time.
   */
  public open fun useLatestRestorableTime(`value`: Boolean) {
    unwrap(this).setUseLatestRestorableTime(`value`)
  }

  /**
   * A value that indicates whether to restore the DB cluster to the latest restorable backup time.
   */
  public open fun useLatestRestorableTime(`value`: IResolvable) {
    unwrap(this).setUseLatestRestorableTime(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of EC2 VPC security groups to associate with this DB cluster.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of EC2 VPC security groups to associate with this DB cluster.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * A list of EC2 VPC security groups to associate with this DB cluster.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB
     * cluster.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-allocatedstorage)
     * @param allocatedStorage The amount of storage in gibibytes (GiB) to allocate to each DB
     * instance in the Multi-AZ DB cluster. 
     */
    public fun allocatedStorage(allocatedStorage: Number)

    /**
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. 
     */
    public fun associatedRoles(associatedRoles: IResolvable)

    /**
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. 
     */
    public fun associatedRoles(associatedRoles: List<Any>)

    /**
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. 
     */
    public fun associatedRoles(vararg associatedRoles: Any)

    /**
     * Specifies whether minor engine upgrades are applied automatically to the DB cluster during
     * the maintenance window.
     *
     * By default, minor engine upgrades are applied automatically.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
     * automatically to the DB cluster during the maintenance window. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * Specifies whether minor engine upgrades are applied automatically to the DB cluster during
     * the maintenance window.
     *
     * By default, minor engine upgrades are applied automatically.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
     * automatically to the DB cluster during the maintenance window. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     *
     * For information on AWS Regions and Availability Zones, see [Choosing the Regions and
     * Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones)
     * @param availabilityZones A list of Availability Zones (AZs) where instances in the DB cluster
     * can be created. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     *
     * For information on AWS Regions and Availability Zones, see [Choosing the Regions and
     * Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones)
     * @param availabilityZones A list of Availability Zones (AZs) where instances in the DB cluster
     * can be created. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     *
     *
     * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     *
     *
     * Default: 0
     *
     * Constraints:
     *
     * * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *
     * Valid for: Aurora MySQL DB clusters only
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backtrackwindow)
     * @param backtrackWindow The target backtrack window, in seconds. To disable backtracking, set
     * this value to 0. 
     */
    public fun backtrackWindow(backtrackWindow: Number)

    /**
     * The number of days for which automated backups are retained.
     *
     * Default: 1
     *
     * Constraints:
     *
     * * Must be a value from 1 to 35
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Default: - 1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backupretentionperiod)
     * @param backupRetentionPeriod The number of days for which automated backups are retained. 
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    /**
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
     * cluster.
     *
     * The default is not to copy them.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot A value that indicates whether to copy all tags from the DB cluster
     * to snapshots of the DB cluster. 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
     * cluster.
     *
     * The default is not to copy them.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot A value that indicates whether to copy all tags from the DB cluster
     * to snapshots of the DB cluster. 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

    /**
     * The name of your database.
     *
     * If you don't provide a name, then Amazon RDS won't create a database in this DB cluster. For
     * naming constraints, see [Naming
     * Constraints](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-databasename)
     * @param databaseName The name of your database. 
     */
    public fun databaseName(databaseName: String)

    /**
     * The DB cluster identifier. This parameter is stored as a lowercase string.
     *
     * Constraints:
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * First character must be a letter.
     * * Can't end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `my-cluster1`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusteridentifier)
     * @param dbClusterIdentifier The DB cluster identifier. This parameter is stored as a lowercase
     * string. 
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example
     * `db.m6gd.xlarge` . Not all DB instance classes are available in all AWS Regions , or for all
     * database engines.
     *
     * For the full list of DB instance classes and availability for your engine, see [DB instance
     * class](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) in
     * the *Amazon RDS User Guide* .
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterinstanceclass)
     * @param dbClusterInstanceClass The compute and memory capacity of each DB instance in the
     * Multi-AZ DB cluster, for example `db.m6gd.xlarge` . Not all DB instance classes are available in
     * all AWS Regions , or for all database engines. 
     */
    public fun dbClusterInstanceClass(dbClusterInstanceClass: String)

    /**
     * The name of the DB cluster parameter group to associate with this DB cluster.
     *
     *
     * If you apply a parameter group to an existing DB cluster, then its DB instances might need to
     * reboot. This can result in an outage while the DB instances are rebooting.
     *
     * If you apply a change to parameter group associated with a stopped DB cluster, then the
     * update stack waits until the DB cluster is started.
     *
     *
     * To list all of the available DB cluster parameter group names, use the following command:
     *
     * `aws rds describe-db-cluster-parameter-groups --query
     * "DBClusterParameterGroups[].DBClusterParameterGroupName" --output text`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Default: - "default.aurora5.6"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterparametergroupname)
     * @param dbClusterParameterGroupName The name of the DB cluster parameter group to associate
     * with this DB cluster. 
     */
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    /**
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     *
     *
     * When you apply a parameter group using the `DBInstanceParameterGroupName` parameter, the DB
     * cluster isn't rebooted automatically. Also, parameter changes are applied immediately rather
     * than during the next maintenance window.
     *
     *
     * Default: The existing name setting
     *
     * Constraints:
     *
     * * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbinstanceparametergroupname)
     * @param dbInstanceParameterGroupName The name of the DB parameter group to apply to all
     * instances of the DB cluster. 
     */
    public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String)

    /**
     * A DB subnet group that you want to associate with this DB cluster.
     *
     * If you are restoring a DB cluster to a point in time with `RestoreType` set to
     * `copy-on-write` , and don't specify a DB subnet group name, then the DB cluster is restored with
     * a default DB subnet group.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname)
     * @param dbSubnetGroupName A DB subnet group that you want to associate with this DB cluster. 
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * Reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsystemid)
     * @param dbSystemId Reserved for future use. 
     */
    public fun dbSystemId(dbSystemId: String)

    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.
     *
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-deletionprotection)
     * @param deletionProtection A value that indicates whether the DB cluster has deletion
     * protection enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.
     *
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-deletionprotection)
     * @param deletionProtection A value that indicates whether the DB cluster has deletion
     * protection enabled. 
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * Indicates the directory ID of the Active Directory to create the DB cluster.
     *
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate
     * users that connect to the DB cluster.
     *
     * For more information, see [Kerberos
     * authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-domain)
     * @param domain Indicates the directory ID of the Active Directory to create the DB cluster. 
     */
    public fun domain(domain: String)

    /**
     * Specifies the name of the IAM role to use when making API calls to the Directory Service.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-domainiamrolename)
     * @param domainIamRoleName Specifies the name of the IAM role to use when making API calls to
     * the Directory Service. 
     */
    public fun domainIamRoleName(domainIamRoleName: String)

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * The values in the list depend on the DB engine being used. For more information, see
     * [Publishing Database Logs to Amazon CloudWatch
     * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
     * in the *Amazon Aurora User Guide* .
     *
     * *Aurora MySQL*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Aurora PostgreSQL*
     *
     * Valid values: `postgresql`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablecloudwatchlogsexports)
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs. 
     */
    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * The values in the list depend on the DB engine being used. For more information, see
     * [Publishing Database Logs to Amazon CloudWatch
     * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
     * in the *Amazon Aurora User Guide* .
     *
     * *Aurora MySQL*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Aurora PostgreSQL*
     *
     * Valid values: `postgresql`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablecloudwatchlogsexports)
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs. 
     */
    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    /**
     * Specifies whether to enable this DB cluster to forward write operations to the primary
     * cluster of a global cluster (Aurora global database).
     *
     * By default, write operations are not allowed on Aurora DB clusters that are secondary
     * clusters in an Aurora global database.
     *
     * You can set this value only on Aurora DB clusters that are members of an Aurora global
     * database. With this parameter enabled, a secondary cluster can forward writes to the current
     * primary cluster, and the resulting changes are replicated back to this cluster. For the primary
     * DB cluster of an Aurora global database, this value is used immediately if the primary is
     * demoted by a global cluster API operation, but it does nothing until then.
     *
     * Valid for Cluster Type: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableglobalwriteforwarding)
     * @param enableGlobalWriteForwarding Specifies whether to enable this DB cluster to forward
     * write operations to the primary cluster of a global cluster (Aurora global database). 
     */
    public fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: Boolean)

    /**
     * Specifies whether to enable this DB cluster to forward write operations to the primary
     * cluster of a global cluster (Aurora global database).
     *
     * By default, write operations are not allowed on Aurora DB clusters that are secondary
     * clusters in an Aurora global database.
     *
     * You can set this value only on Aurora DB clusters that are members of an Aurora global
     * database. With this parameter enabled, a secondary cluster can forward writes to the current
     * primary cluster, and the resulting changes are replicated back to this cluster. For the primary
     * DB cluster of an Aurora global database, this value is used immediately if the primary is
     * demoted by a global cluster API operation, but it does nothing until then.
     *
     * Valid for Cluster Type: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableglobalwriteforwarding)
     * @param enableGlobalWriteForwarding Specifies whether to enable this DB cluster to forward
     * write operations to the primary cluster of a global cluster (Aurora global database). 
     */
    public fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: IResolvable)

    /**
     * Specifies whether to enable the HTTP endpoint for the DB cluster. By default, the HTTP
     * endpoint isn't enabled.
     *
     * When enabled, the HTTP endpoint provides a connectionless web service API (RDS Data API) for
     * running SQL queries on the DB cluster. You can also query your database from inside the RDS
     * console with the RDS query editor.
     *
     * RDS Data API is supported with the following DB clusters:
     *
     * * Aurora PostgreSQL Serverless v2 and provisioned
     * * Aurora PostgreSQL and Aurora MySQL Serverless v1
     *
     * For more information, see [Using RDS Data
     * API](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the *Amazon
     * Aurora User Guide* .
     *
     * Valid for Cluster Type: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablehttpendpoint)
     * @param enableHttpEndpoint Specifies whether to enable the HTTP endpoint for the DB cluster.
     * By default, the HTTP endpoint isn't enabled. 
     */
    public fun enableHttpEndpoint(enableHttpEndpoint: Boolean)

    /**
     * Specifies whether to enable the HTTP endpoint for the DB cluster. By default, the HTTP
     * endpoint isn't enabled.
     *
     * When enabled, the HTTP endpoint provides a connectionless web service API (RDS Data API) for
     * running SQL queries on the DB cluster. You can also query your database from inside the RDS
     * console with the RDS query editor.
     *
     * RDS Data API is supported with the following DB clusters:
     *
     * * Aurora PostgreSQL Serverless v2 and provisioned
     * * Aurora PostgreSQL and Aurora MySQL Serverless v1
     *
     * For more information, see [Using RDS Data
     * API](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the *Amazon
     * Aurora User Guide* .
     *
     * Valid for Cluster Type: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablehttpendpoint)
     * @param enableHttpEndpoint Specifies whether to enable the HTTP endpoint for the DB cluster.
     * By default, the HTTP endpoint isn't enabled. 
     */
    public fun enableHttpEndpoint(enableHttpEndpoint: IResolvable)

    /**
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
     * accounts to database accounts.
     *
     * By default, mapping is disabled.
     *
     * For more information, see [IAM Database
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableiamdatabaseauthentication)
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts. 
     */
    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean)

    /**
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
     * accounts to database accounts.
     *
     * By default, mapping is disabled.
     *
     * For more information, see [IAM Database
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableiamdatabaseauthentication)
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts. 
     */
    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable)

    /**
     * The name of the database engine to be used for this DB cluster.
     *
     * Valid Values:
     *
     * * `aurora-mysql`
     * * `aurora-postgresql`
     * * `mysql`
     * * `postgres`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engine)
     * @param engine The name of the database engine to be used for this DB cluster. 
     */
    public fun engine(engine: String)

    /**
     * The DB engine mode of the DB cluster, either `provisioned` or `serverless` .
     *
     * The `serverless` engine mode only supports Aurora Serverless v1.
     *
     * Limitations and requirements apply to some DB engine modes. For more information, see the
     * following sections in the *Amazon Aurora User Guide* :
     *
     * * [Limitations of Aurora Serverless
     * v1](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations)
     * * [Requirements for Aurora Serverless
     * v2](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html)
     * * [Limitations of parallel
     * query](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations)
     * * [Limitations of Aurora global
     * databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations)
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enginemode)
     * @param engineMode The DB engine mode of the DB cluster, either `provisioned` or `serverless`
     * . 
     */
    public fun engineMode(engineMode: String)

    /**
     * The version number of the database engine to use.
     *
     * To list all of the available engine versions for Aurora MySQL version 2 (5.7-compatible) and
     * version 3 (8.0-compatible), use the following command:
     *
     * `aws rds describe-db-engine-versions --engine aurora-mysql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * You can supply either `5.7` or `8.0` to use the default engine version for Aurora MySQL
     * version 2 or version 3, respectively.
     *
     * To list all of the available engine versions for Aurora PostgreSQL, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --engine aurora-postgresql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     *
     * `aws rds describe-db-engine-versions --engine mysql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * To list all of the available engine versions for RDS for PostgreSQL, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --engine postgres --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * *Aurora MySQL*
     *
     * For information, see [Database engine updates for Amazon Aurora
     * MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) in
     * the *Amazon Aurora User Guide* .
     *
     * *Aurora PostgreSQL*
     *
     * For information, see [Amazon Aurora PostgreSQL releases and engine
     * versions](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html)
     * in the *Amazon Aurora User Guide* .
     *
     * *MySQL*
     *
     * For information, see [Amazon RDS for
     * MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide* .
     *
     * *PostgreSQL*
     *
     * For information, see [Amazon RDS for
     * PostgreSQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts)
     * in the *Amazon RDS User Guide* .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engineversion)
     * @param engineVersion The version number of the database engine to use. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * If you are configuring an Aurora global database cluster and want your Aurora DB cluster to
     * be a secondary member in the global database cluster, specify the global cluster ID of the
     * global database cluster.
     *
     * To define the primary database cluster of the global cluster, use the
     * [AWS::RDS::GlobalCluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html)
     * resource.
     *
     * If you aren't configuring a global database cluster, don't specify this property.
     *
     *
     * To remove the DB cluster from a global database cluster, specify an empty value for the
     * `GlobalClusterIdentifier` property.
     *
     *
     * For information about Aurora global databases, see [Working with Amazon Aurora Global
     * Databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-globalclusteridentifier)
     * @param globalClusterIdentifier If you are configuring an Aurora global database cluster and
     * want your Aurora DB cluster to be a secondary member in the global database cluster, specify the
     * global cluster ID of the global database cluster. 
     */
    public fun globalClusterIdentifier(globalClusterIdentifier: String)

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated
     * for each DB instance in the Multi-AZ DB cluster.
     *
     * For information about valid IOPS values, see [Provisioned IOPS
     * storage](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS) in
     * the *Amazon RDS User Guide* .
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Constraints:
     *
     * * Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-iops)
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for each DB instance in the Multi-AZ DB cluster. 
     */
    public fun iops(iops: Number)

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the database
     * instances in the DB cluster, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
     *
     * If you enable the `StorageEncrypted` property but don't specify this property, the default
     * KMS key is used. If you specify this property, you must set the `StorageEncrypted` property to
     * `true` .
     *
     * If you specify the `SnapshotIdentifier` property, the `StorageEncrypted` property value is
     * inherited from the snapshot, and if the DB cluster is encrypted, the specified `KmsKeyId`
     * property is used.
     *
     * If you create a read replica of an encrypted DB cluster in another AWS Region, make sure to
     * set `KmsKeyId` to a KMS key identifier that is valid in the destination AWS Region. This KMS key
     * is used to encrypt the read replica in that AWS Region.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid)
     * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the
     * database instances in the DB cluster, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` . 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * Specifies whether to manage the master user password with AWS Secrets Manager.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-managemasteruserpassword)
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager. 
     */
    public fun manageMasterUserPassword(manageMasterUserPassword: Boolean)

    /**
     * Specifies whether to manage the master user password with AWS Secrets Manager.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-managemasteruserpassword)
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager. 
     */
    public fun manageMasterUserPassword(manageMasterUserPassword: IResolvable)

    /**
     * The master password for the DB instance.
     *
     *
     * If you specify the `SourceDBClusterIdentifier` , `SnapshotIdentifier` , or
     * `GlobalClusterIdentifier` property, don't specify this property. The value is inherited from the
     * source DB cluster, the snapshot, or the primary DB cluster for the global database cluster,
     * respectively.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masteruserpassword)
     * @param masterUserPassword The master password for the DB instance. 
     */
    public fun masterUserPassword(masterUserPassword: String)

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusersecret)
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password. 
     */
    public fun masterUserSecret(masterUserSecret: IResolvable)

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusersecret)
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password. 
     */
    public fun masterUserSecret(masterUserSecret: MasterUserSecretProperty)

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusersecret)
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c5177ba2ce09dd6957b01d7244f34d884d28421ebac39c4b8c7938b5c0ca985")
    public fun masterUserSecret(masterUserSecret: MasterUserSecretProperty.Builder.() -> Unit)

    /**
     * The name of the master user for the DB cluster.
     *
     *
     * If you specify the `SourceDBClusterIdentifier` , `SnapshotIdentifier` , or
     * `GlobalClusterIdentifier` property, don't specify this property. The value is inherited from the
     * source DB cluster, the snapshot, or the primary DB cluster for the global database cluster,
     * respectively.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusername)
     * @param masterUsername The name of the master user for the DB cluster. 
     */
    public fun masterUsername(masterUsername: String)

    /**
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for
     * the DB cluster.
     *
     * To turn off collecting Enhanced Monitoring metrics, specify `0` .
     *
     * If `MonitoringRoleArn` is specified, also set `MonitoringInterval` to a value other than `0`
     * .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Valid Values: `0 | 1 | 5 | 10 | 15 | 30 | 60`
     *
     * Default: `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-monitoringinterval)
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB cluster. 
     */
    public fun monitoringInterval(monitoringInterval: Number)

    /**
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring
     * metrics to Amazon CloudWatch Logs.
     *
     * An example is `arn:aws:iam:123456789012:role/emaccess` . For information on creating a
     * monitoring role, see [Setting up and enabling Enhanced
     * Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling)
     * in the *Amazon RDS User Guide* .
     *
     * If `MonitoringInterval` is set to a value other than `0` , supply a `MonitoringRoleArn`
     * value.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-monitoringrolearn)
     * @param monitoringRoleArn The Amazon Resource Name (ARN) for the IAM role that permits RDS to
     * send Enhanced Monitoring metrics to Amazon CloudWatch Logs. 
     */
    public fun monitoringRoleArn(monitoringRoleArn: String)

    /**
     * The network type of the DB cluster.
     *
     * Valid values:
     *
     * * `IPV4`
     * * `DUAL`
     *
     * The network type is determined by the `DBSubnetGroup` specified for the DB cluster. A
     * `DBSubnetGroup` can support only the IPv4 protocol or the IPv4 and IPv6 protocols ( `DUAL` ).
     *
     * For more information, see [Working with a DB instance in a
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-networktype)
     * @param networkType The network type of the DB cluster. 
     */
    public fun networkType(networkType: String)

    /**
     * Specifies whether to turn on Performance Insights for the DB cluster.
     *
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightsenabled)
     * @param performanceInsightsEnabled Specifies whether to turn on Performance Insights for the
     * DB cluster. 
     */
    public fun performanceInsightsEnabled(performanceInsightsEnabled: Boolean)

    /**
     * Specifies whether to turn on Performance Insights for the DB cluster.
     *
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightsenabled)
     * @param performanceInsightsEnabled Specifies whether to turn on Performance Insights for the
     * DB cluster. 
     */
    public fun performanceInsightsEnabled(performanceInsightsEnabled: IResolvable)

    /**
     * The AWS KMS key identifier for encryption of Performance Insights data.
     *
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     *
     * If you don't specify a value for `PerformanceInsightsKMSKeyId` , then Amazon RDS uses your
     * default KMS key. There is a default KMS key for your AWS account . Your AWS account has a
     * different default KMS key for each AWS Region .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightskmskeyid)
     * @param performanceInsightsKmsKeyId The AWS KMS key identifier for encryption of Performance
     * Insights data. 
     */
    public fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String)

    /**
     * The number of days to retain Performance Insights data.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Valid Values:
     *
     * * `7`
     * * *month* * 31, where *month* is a number of months from 1-23. Examples: `93` (3 months *
     * 31), `341` (11 months * 31), `589` (19 months * 31)
     * * `731`
     *
     * Default: `7` days
     *
     * If you specify a retention period that isn't valid, such as `94` , Amazon RDS issues an
     * error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightsretentionperiod)
     * @param performanceInsightsRetentionPeriod The number of days to retain Performance Insights
     * data. 
     */
    public fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number)

    /**
     * The port number on which the DB instances in the DB cluster accept connections.
     *
     * Default:
     *
     * * When `EngineMode` is `provisioned` , `3306` (for both Aurora MySQL and Aurora PostgreSQL)
     * * When `EngineMode` is `serverless` :
     * * `3306` when `Engine` is `aurora` or `aurora-mysql`
     * * `5432` when `Engine` is `aurora-postgresql`
     *
     *
     * The `No interruption` on update behavior only applies to DB clusters. If you are updating a
     * DB instance, see
     * [Port](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port)
     * for the AWS::RDS::DBInstance resource.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port)
     * @param port The port number on which the DB instances in the DB cluster accept connections. 
     */
    public fun port(port: Number)

    /**
     * The daily time range during which automated backups are created.
     *
     * For more information, see [Backup
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow)
     * in the *Amazon Aurora User Guide.*
     *
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi` .
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredbackupwindow)
     * @param preferredBackupWindow The daily time range during which automated backups are created.
     * 
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated
     * Time (UTC).
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region, occurring on a random day of the week. To see the time blocks available, see
     * [Adjusting the Preferred DB Cluster Maintenance
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *
     * Constraints: Minimum 30-minute window.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC). 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * Specifies whether the DB cluster is publicly accessible.
     *
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
     * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
     * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is
     * ultimately controlled by the security group it uses. That public access isn't permitted if the
     * security group assigned to the DB cluster doesn't permit it.
     *
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
     * that resolves to a private IP address.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB cluster is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB cluster is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-publiclyaccessible)
     * @param publiclyAccessible Specifies whether the DB cluster is publicly accessible. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * Specifies whether the DB cluster is publicly accessible.
     *
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
     * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
     * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is
     * ultimately controlled by the security group it uses. That public access isn't permitted if the
     * security group assigned to the DB cluster doesn't permit it.
     *
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
     * that resolves to a private IP address.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB cluster is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB cluster is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-publiclyaccessible)
     * @param publiclyAccessible Specifies whether the DB cluster is publicly accessible. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is
     * created as a read replica.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier)
     * @param replicationSourceIdentifier The Amazon Resource Name (ARN) of the source DB instance
     * or DB cluster if this DB cluster is created as a read replica. 
     */
    public fun replicationSourceIdentifier(replicationSourceIdentifier: String)

    /**
     * The date and time to restore the DB cluster to.
     *
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     *
     * Constraints:
     *
     * * Must be before the latest restorable time for the DB instance
     * * Must be specified if `UseLatestRestorableTime` parameter isn't provided
     * * Can't be specified if the `UseLatestRestorableTime` parameter is enabled
     * * Can't be specified if the `RestoreType` parameter is `copy-on-write`
     *
     * This property must be used with `SourceDBClusterIdentifier` property. The resulting cluster
     * will have the identifier that matches the value of the `DBclusterIdentifier` property.
     *
     * Example: `2015-03-07T23:45:00Z`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-restoretotime)
     * @param restoreToTime The date and time to restore the DB cluster to. 
     */
    public fun restoreToTime(restoreToTime: String)

    /**
     * The type of restore to be performed. You can specify one of the following values:.
     *
     * * `full-copy` - The new DB cluster is restored as a full copy of the source DB cluster.
     * * `copy-on-write` - The new DB cluster is restored as a clone of the source DB cluster.
     *
     * If you don't specify a `RestoreType` value, then the new DB cluster is restored as a full
     * copy of the source DB cluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Default: - "full-copy"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-restoretype)
     * @param restoreType The type of restore to be performed. You can specify one of the following
     * values:. 
     */
    public fun restoreType(restoreType: String)

    /**
     * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
     * Serverless DB cluster.
     *
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster. 
     */
    public fun scalingConfiguration(scalingConfiguration: IResolvable)

    /**
     * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
     * Serverless DB cluster.
     *
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster. 
     */
    public fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty)

    /**
     * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
     * Serverless DB cluster.
     *
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fa9676c3039f29f132b6dd8b699ca2cee78d2e1ded81b22cbcd42057c78dafe")
    public
        fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty.Builder.() -> Unit)

    /**
     * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of
     * an Aurora Serverless V2 DB cluster.
     *
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration)
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster. 
     */
    public fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable)

    /**
     * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of
     * an Aurora Serverless V2 DB cluster.
     *
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration)
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster. 
     */
    public
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty)

    /**
     * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of
     * an Aurora Serverless V2 DB cluster.
     *
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration)
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c267a26045ec107b3af7352451263749d4ad8d017efddc544d91f7cc9c89369f")
    public
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit)

    /**
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot. However, you can use only the ARN to specify a DB snapshot.
     *
     * After you restore a DB cluster with a `SnapshotIdentifier` property, you must specify the
     * same `SnapshotIdentifier` property for any future updates to the DB cluster. When you specify
     * this property for an update, the DB cluster is not restored from the snapshot again, and the
     * data in the database is not changed. However, if you don't specify the `SnapshotIdentifier`
     * property, an empty DB cluster is created, and the original DB cluster is deleted. If you specify
     * a property that is different from the previous snapshot restore property, a new DB cluster is
     * restored from the specified `SnapshotIdentifier` property, and the original DB cluster is
     * deleted.
     *
     * If you specify the `SnapshotIdentifier` property to restore a DB cluster (as opposed to
     * specifying it for DB cluster updates), then don't specify the following properties:
     *
     * * `GlobalClusterIdentifier`
     * * `MasterUsername`
     * * `MasterUserPassword`
     * * `ReplicationSourceIdentifier`
     * * `RestoreType`
     * * `SourceDBClusterIdentifier`
     * * `SourceRegion`
     * * `StorageEncrypted` (for an encrypted snapshot)
     * * `UseLatestRestorableTime`
     *
     * Constraints:
     *
     * * Must match the identifier of an existing Snapshot.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-snapshotidentifier)
     * @param snapshotIdentifier The identifier for the DB snapshot or DB cluster snapshot to
     * restore from. 
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

    /**
     * When restoring a DB cluster to a point in time, the identifier of the source DB cluster from
     * which to restore.
     *
     * Constraints:
     *
     * * Must match the identifier of an existing DBCluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-sourcedbclusteridentifier)
     * @param sourceDbClusterIdentifier When restoring a DB cluster to a point in time, the
     * identifier of the source DB cluster from which to restore. 
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    /**
     * The AWS Region which contains the source DB cluster when replicating a DB cluster. For
     * example, `us-east-1` .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-sourceregion)
     * @param sourceRegion The AWS Region which contains the source DB cluster when replicating a DB
     * cluster. For example, `us-east-1` . 
     */
    public fun sourceRegion(sourceRegion: String)

    /**
     * Indicates whether the DB cluster is encrypted.
     *
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The
     * value is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
     * `KmsKeyId` property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted)
     * @param storageEncrypted Indicates whether the DB cluster is encrypted. 
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * Indicates whether the DB cluster is encrypted.
     *
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The
     * value is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
     * `KmsKeyId` property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted)
     * @param storageEncrypted Indicates whether the DB cluster is encrypted. 
     */
    public fun storageEncrypted(storageEncrypted: IResolvable)

    /**
     * The storage type to associate with the DB cluster.
     *
     * For information on storage types for Aurora DB clusters, see [Storage configurations for
     * Amazon Aurora DB
     * clusters](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Overview.StorageReliability.html#aurora-storage-type)
     * . For information on storage types for Multi-AZ DB clusters, see [Settings for creating Multi-AZ
     * DB
     * clusters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/create-multi-az-db-cluster.html#create-multi-az-db-cluster-settings)
     * .
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * When specified for a Multi-AZ DB cluster, a value for the `Iops` parameter is required.
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Valid Values:
     *
     * * Aurora DB clusters - `aurora | aurora-iopt1`
     * * Multi-AZ DB clusters - `io1 | io2 | gp3`
     *
     * Default:
     *
     * * Aurora DB clusters - `aurora`
     * * Multi-AZ DB clusters - `io1`
     *
     *
     * When you create an Aurora DB cluster with the storage type set to `aurora-iopt1` , the
     * storage type is returned in the response. The storage type isn't returned when you set it to
     * `aurora` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storagetype)
     * @param storageType The storage type to associate with the DB cluster. 
     */
    public fun storageType(storageType: String)

    /**
     * An optional array of key-value pairs to apply to this DB cluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
     * @param tags An optional array of key-value pairs to apply to this DB cluster. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional array of key-value pairs to apply to this DB cluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
     * @param tags An optional array of key-value pairs to apply to this DB cluster. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A value that indicates whether to restore the DB cluster to the latest restorable backup
     * time.
     *
     * By default, the DB cluster is not restored to the latest restorable backup time.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-uselatestrestorabletime)
     * @param useLatestRestorableTime A value that indicates whether to restore the DB cluster to
     * the latest restorable backup time. 
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

    /**
     * A value that indicates whether to restore the DB cluster to the latest restorable backup
     * time.
     *
     * By default, the DB cluster is not restored to the latest restorable backup time.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-uselatestrestorabletime)
     * @param useLatestRestorableTime A value that indicates whether to restore the DB cluster to
     * the latest restorable backup time. 
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    /**
     * A list of EC2 VPC security groups to associate with this DB cluster.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB
     * cluster. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * A list of EC2 VPC security groups to associate with this DB cluster.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB
     * cluster. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBCluster.Builder =
        software.amazon.awscdk.services.rds.CfnDBCluster.Builder.create(scope, id)

    /**
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB
     * cluster.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-allocatedstorage)
     * @param allocatedStorage The amount of storage in gibibytes (GiB) to allocate to each DB
     * instance in the Multi-AZ DB cluster. 
     */
    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. 
     */
    override fun associatedRoles(associatedRoles: IResolvable) {
      cdkBuilder.associatedRoles(associatedRoles.let(IResolvable::unwrap))
    }

    /**
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. 
     */
    override fun associatedRoles(associatedRoles: List<Any>) {
      cdkBuilder.associatedRoles(associatedRoles)
    }

    /**
     * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated
     * with the DB cluster.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other Amazon Web Services on your behalf.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-associatedroles)
     * @param associatedRoles Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. 
     */
    override fun associatedRoles(vararg associatedRoles: Any): Unit =
        associatedRoles(associatedRoles.toList())

    /**
     * Specifies whether minor engine upgrades are applied automatically to the DB cluster during
     * the maintenance window.
     *
     * By default, minor engine upgrades are applied automatically.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
     * automatically to the DB cluster during the maintenance window. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * Specifies whether minor engine upgrades are applied automatically to the DB cluster during
     * the maintenance window.
     *
     * By default, minor engine upgrades are applied automatically.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade Specifies whether minor engine upgrades are applied
     * automatically to the DB cluster during the maintenance window. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     *
     * For information on AWS Regions and Availability Zones, see [Choosing the Regions and
     * Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones)
     * @param availabilityZones A list of Availability Zones (AZs) where instances in the DB cluster
     * can be created. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     *
     * For information on AWS Regions and Availability Zones, see [Choosing the Regions and
     * Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones)
     * @param availabilityZones A list of Availability Zones (AZs) where instances in the DB cluster
     * can be created. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     *
     *
     * Currently, Backtrack is only supported for Aurora MySQL DB clusters.
     *
     *
     * Default: 0
     *
     * Constraints:
     *
     * * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *
     * Valid for: Aurora MySQL DB clusters only
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backtrackwindow)
     * @param backtrackWindow The target backtrack window, in seconds. To disable backtracking, set
     * this value to 0. 
     */
    override fun backtrackWindow(backtrackWindow: Number) {
      cdkBuilder.backtrackWindow(backtrackWindow)
    }

    /**
     * The number of days for which automated backups are retained.
     *
     * Default: 1
     *
     * Constraints:
     *
     * * Must be a value from 1 to 35
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Default: - 1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backupretentionperiod)
     * @param backupRetentionPeriod The number of days for which automated backups are retained. 
     */
    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    /**
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
     * cluster.
     *
     * The default is not to copy them.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot A value that indicates whether to copy all tags from the DB cluster
     * to snapshots of the DB cluster. 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB
     * cluster.
     *
     * The default is not to copy them.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-copytagstosnapshot)
     * @param copyTagsToSnapshot A value that indicates whether to copy all tags from the DB cluster
     * to snapshots of the DB cluster. 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    /**
     * The name of your database.
     *
     * If you don't provide a name, then Amazon RDS won't create a database in this DB cluster. For
     * naming constraints, see [Naming
     * Constraints](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-databasename)
     * @param databaseName The name of your database. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * The DB cluster identifier. This parameter is stored as a lowercase string.
     *
     * Constraints:
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * First character must be a letter.
     * * Can't end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `my-cluster1`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusteridentifier)
     * @param dbClusterIdentifier The DB cluster identifier. This parameter is stored as a lowercase
     * string. 
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example
     * `db.m6gd.xlarge` . Not all DB instance classes are available in all AWS Regions , or for all
     * database engines.
     *
     * For the full list of DB instance classes and availability for your engine, see [DB instance
     * class](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) in
     * the *Amazon RDS User Guide* .
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterinstanceclass)
     * @param dbClusterInstanceClass The compute and memory capacity of each DB instance in the
     * Multi-AZ DB cluster, for example `db.m6gd.xlarge` . Not all DB instance classes are available in
     * all AWS Regions , or for all database engines. 
     */
    override fun dbClusterInstanceClass(dbClusterInstanceClass: String) {
      cdkBuilder.dbClusterInstanceClass(dbClusterInstanceClass)
    }

    /**
     * The name of the DB cluster parameter group to associate with this DB cluster.
     *
     *
     * If you apply a parameter group to an existing DB cluster, then its DB instances might need to
     * reboot. This can result in an outage while the DB instances are rebooting.
     *
     * If you apply a change to parameter group associated with a stopped DB cluster, then the
     * update stack waits until the DB cluster is started.
     *
     *
     * To list all of the available DB cluster parameter group names, use the following command:
     *
     * `aws rds describe-db-cluster-parameter-groups --query
     * "DBClusterParameterGroups[].DBClusterParameterGroupName" --output text`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Default: - "default.aurora5.6"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterparametergroupname)
     * @param dbClusterParameterGroupName The name of the DB cluster parameter group to associate
     * with this DB cluster. 
     */
    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    /**
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     *
     *
     * When you apply a parameter group using the `DBInstanceParameterGroupName` parameter, the DB
     * cluster isn't rebooted automatically. Also, parameter changes are applied immediately rather
     * than during the next maintenance window.
     *
     *
     * Default: The existing name setting
     *
     * Constraints:
     *
     * * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbinstanceparametergroupname)
     * @param dbInstanceParameterGroupName The name of the DB parameter group to apply to all
     * instances of the DB cluster. 
     */
    override fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
      cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
    }

    /**
     * A DB subnet group that you want to associate with this DB cluster.
     *
     * If you are restoring a DB cluster to a point in time with `RestoreType` set to
     * `copy-on-write` , and don't specify a DB subnet group name, then the DB cluster is restored with
     * a default DB subnet group.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname)
     * @param dbSubnetGroupName A DB subnet group that you want to associate with this DB cluster. 
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * Reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsystemid)
     * @param dbSystemId Reserved for future use. 
     */
    override fun dbSystemId(dbSystemId: String) {
      cdkBuilder.dbSystemId(dbSystemId)
    }

    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.
     *
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-deletionprotection)
     * @param deletionProtection A value that indicates whether the DB cluster has deletion
     * protection enabled. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.
     *
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-deletionprotection)
     * @param deletionProtection A value that indicates whether the DB cluster has deletion
     * protection enabled. 
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    /**
     * Indicates the directory ID of the Active Directory to create the DB cluster.
     *
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate
     * users that connect to the DB cluster.
     *
     * For more information, see [Kerberos
     * authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-domain)
     * @param domain Indicates the directory ID of the Active Directory to create the DB cluster. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * Specifies the name of the IAM role to use when making API calls to the Directory Service.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-domainiamrolename)
     * @param domainIamRoleName Specifies the name of the IAM role to use when making API calls to
     * the Directory Service. 
     */
    override fun domainIamRoleName(domainIamRoleName: String) {
      cdkBuilder.domainIamRoleName(domainIamRoleName)
    }

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * The values in the list depend on the DB engine being used. For more information, see
     * [Publishing Database Logs to Amazon CloudWatch
     * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
     * in the *Amazon Aurora User Guide* .
     *
     * *Aurora MySQL*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Aurora PostgreSQL*
     *
     * Valid values: `postgresql`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablecloudwatchlogsexports)
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs. 
     */
    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * The values in the list depend on the DB engine being used. For more information, see
     * [Publishing Database Logs to Amazon CloudWatch
     * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
     * in the *Amazon Aurora User Guide* .
     *
     * *Aurora MySQL*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Aurora PostgreSQL*
     *
     * Valid values: `postgresql`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablecloudwatchlogsexports)
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs. 
     */
    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

    /**
     * Specifies whether to enable this DB cluster to forward write operations to the primary
     * cluster of a global cluster (Aurora global database).
     *
     * By default, write operations are not allowed on Aurora DB clusters that are secondary
     * clusters in an Aurora global database.
     *
     * You can set this value only on Aurora DB clusters that are members of an Aurora global
     * database. With this parameter enabled, a secondary cluster can forward writes to the current
     * primary cluster, and the resulting changes are replicated back to this cluster. For the primary
     * DB cluster of an Aurora global database, this value is used immediately if the primary is
     * demoted by a global cluster API operation, but it does nothing until then.
     *
     * Valid for Cluster Type: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableglobalwriteforwarding)
     * @param enableGlobalWriteForwarding Specifies whether to enable this DB cluster to forward
     * write operations to the primary cluster of a global cluster (Aurora global database). 
     */
    override fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: Boolean) {
      cdkBuilder.enableGlobalWriteForwarding(enableGlobalWriteForwarding)
    }

    /**
     * Specifies whether to enable this DB cluster to forward write operations to the primary
     * cluster of a global cluster (Aurora global database).
     *
     * By default, write operations are not allowed on Aurora DB clusters that are secondary
     * clusters in an Aurora global database.
     *
     * You can set this value only on Aurora DB clusters that are members of an Aurora global
     * database. With this parameter enabled, a secondary cluster can forward writes to the current
     * primary cluster, and the resulting changes are replicated back to this cluster. For the primary
     * DB cluster of an Aurora global database, this value is used immediately if the primary is
     * demoted by a global cluster API operation, but it does nothing until then.
     *
     * Valid for Cluster Type: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableglobalwriteforwarding)
     * @param enableGlobalWriteForwarding Specifies whether to enable this DB cluster to forward
     * write operations to the primary cluster of a global cluster (Aurora global database). 
     */
    override fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: IResolvable) {
      cdkBuilder.enableGlobalWriteForwarding(enableGlobalWriteForwarding.let(IResolvable::unwrap))
    }

    /**
     * Specifies whether to enable the HTTP endpoint for the DB cluster. By default, the HTTP
     * endpoint isn't enabled.
     *
     * When enabled, the HTTP endpoint provides a connectionless web service API (RDS Data API) for
     * running SQL queries on the DB cluster. You can also query your database from inside the RDS
     * console with the RDS query editor.
     *
     * RDS Data API is supported with the following DB clusters:
     *
     * * Aurora PostgreSQL Serverless v2 and provisioned
     * * Aurora PostgreSQL and Aurora MySQL Serverless v1
     *
     * For more information, see [Using RDS Data
     * API](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the *Amazon
     * Aurora User Guide* .
     *
     * Valid for Cluster Type: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablehttpendpoint)
     * @param enableHttpEndpoint Specifies whether to enable the HTTP endpoint for the DB cluster.
     * By default, the HTTP endpoint isn't enabled. 
     */
    override fun enableHttpEndpoint(enableHttpEndpoint: Boolean) {
      cdkBuilder.enableHttpEndpoint(enableHttpEndpoint)
    }

    /**
     * Specifies whether to enable the HTTP endpoint for the DB cluster. By default, the HTTP
     * endpoint isn't enabled.
     *
     * When enabled, the HTTP endpoint provides a connectionless web service API (RDS Data API) for
     * running SQL queries on the DB cluster. You can also query your database from inside the RDS
     * console with the RDS query editor.
     *
     * RDS Data API is supported with the following DB clusters:
     *
     * * Aurora PostgreSQL Serverless v2 and provisioned
     * * Aurora PostgreSQL and Aurora MySQL Serverless v1
     *
     * For more information, see [Using RDS Data
     * API](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html) in the *Amazon
     * Aurora User Guide* .
     *
     * Valid for Cluster Type: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enablehttpendpoint)
     * @param enableHttpEndpoint Specifies whether to enable the HTTP endpoint for the DB cluster.
     * By default, the HTTP endpoint isn't enabled. 
     */
    override fun enableHttpEndpoint(enableHttpEndpoint: IResolvable) {
      cdkBuilder.enableHttpEndpoint(enableHttpEndpoint.let(IResolvable::unwrap))
    }

    /**
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
     * accounts to database accounts.
     *
     * By default, mapping is disabled.
     *
     * For more information, see [IAM Database
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableiamdatabaseauthentication)
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts. 
     */
    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
    }

    /**
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
     * accounts to database accounts.
     *
     * By default, mapping is disabled.
     *
     * For more information, see [IAM Database
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enableiamdatabaseauthentication)
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts. 
     */
    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication.let(IResolvable::unwrap))
    }

    /**
     * The name of the database engine to be used for this DB cluster.
     *
     * Valid Values:
     *
     * * `aurora-mysql`
     * * `aurora-postgresql`
     * * `mysql`
     * * `postgres`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engine)
     * @param engine The name of the database engine to be used for this DB cluster. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * The DB engine mode of the DB cluster, either `provisioned` or `serverless` .
     *
     * The `serverless` engine mode only supports Aurora Serverless v1.
     *
     * Limitations and requirements apply to some DB engine modes. For more information, see the
     * following sections in the *Amazon Aurora User Guide* :
     *
     * * [Limitations of Aurora Serverless
     * v1](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations)
     * * [Requirements for Aurora Serverless
     * v2](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html)
     * * [Limitations of parallel
     * query](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations)
     * * [Limitations of Aurora global
     * databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations)
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enginemode)
     * @param engineMode The DB engine mode of the DB cluster, either `provisioned` or `serverless`
     * . 
     */
    override fun engineMode(engineMode: String) {
      cdkBuilder.engineMode(engineMode)
    }

    /**
     * The version number of the database engine to use.
     *
     * To list all of the available engine versions for Aurora MySQL version 2 (5.7-compatible) and
     * version 3 (8.0-compatible), use the following command:
     *
     * `aws rds describe-db-engine-versions --engine aurora-mysql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * You can supply either `5.7` or `8.0` to use the default engine version for Aurora MySQL
     * version 2 or version 3, respectively.
     *
     * To list all of the available engine versions for Aurora PostgreSQL, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --engine aurora-postgresql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     *
     * `aws rds describe-db-engine-versions --engine mysql --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * To list all of the available engine versions for RDS for PostgreSQL, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --engine postgres --query
     * "DBEngineVersions[].EngineVersion"`
     *
     * *Aurora MySQL*
     *
     * For information, see [Database engine updates for Amazon Aurora
     * MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) in
     * the *Amazon Aurora User Guide* .
     *
     * *Aurora PostgreSQL*
     *
     * For information, see [Amazon Aurora PostgreSQL releases and engine
     * versions](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html)
     * in the *Amazon Aurora User Guide* .
     *
     * *MySQL*
     *
     * For information, see [Amazon RDS for
     * MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide* .
     *
     * *PostgreSQL*
     *
     * For information, see [Amazon RDS for
     * PostgreSQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts)
     * in the *Amazon RDS User Guide* .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engineversion)
     * @param engineVersion The version number of the database engine to use. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * If you are configuring an Aurora global database cluster and want your Aurora DB cluster to
     * be a secondary member in the global database cluster, specify the global cluster ID of the
     * global database cluster.
     *
     * To define the primary database cluster of the global cluster, use the
     * [AWS::RDS::GlobalCluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html)
     * resource.
     *
     * If you aren't configuring a global database cluster, don't specify this property.
     *
     *
     * To remove the DB cluster from a global database cluster, specify an empty value for the
     * `GlobalClusterIdentifier` property.
     *
     *
     * For information about Aurora global databases, see [Working with Amazon Aurora Global
     * Databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-globalclusteridentifier)
     * @param globalClusterIdentifier If you are configuring an Aurora global database cluster and
     * want your Aurora DB cluster to be a secondary member in the global database cluster, specify the
     * global cluster ID of the global database cluster. 
     */
    override fun globalClusterIdentifier(globalClusterIdentifier: String) {
      cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
    }

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated
     * for each DB instance in the Multi-AZ DB cluster.
     *
     * For information about valid IOPS values, see [Provisioned IOPS
     * storage](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS) in
     * the *Amazon RDS User Guide* .
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Constraints:
     *
     * * Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-iops)
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for each DB instance in the Multi-AZ DB cluster. 
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the database
     * instances in the DB cluster, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
     *
     * If you enable the `StorageEncrypted` property but don't specify this property, the default
     * KMS key is used. If you specify this property, you must set the `StorageEncrypted` property to
     * `true` .
     *
     * If you specify the `SnapshotIdentifier` property, the `StorageEncrypted` property value is
     * inherited from the snapshot, and if the DB cluster is encrypted, the specified `KmsKeyId`
     * property is used.
     *
     * If you create a read replica of an encrypted DB cluster in another AWS Region, make sure to
     * set `KmsKeyId` to a KMS key identifier that is valid in the destination AWS Region. This KMS key
     * is used to encrypt the read replica in that AWS Region.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid)
     * @param kmsKeyId The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the
     * database instances in the DB cluster, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` . 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies whether to manage the master user password with AWS Secrets Manager.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-managemasteruserpassword)
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager. 
     */
    override fun manageMasterUserPassword(manageMasterUserPassword: Boolean) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword)
    }

    /**
     * Specifies whether to manage the master user password with AWS Secrets Manager.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-managemasteruserpassword)
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager. 
     */
    override fun manageMasterUserPassword(manageMasterUserPassword: IResolvable) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword.let(IResolvable::unwrap))
    }

    /**
     * The master password for the DB instance.
     *
     *
     * If you specify the `SourceDBClusterIdentifier` , `SnapshotIdentifier` , or
     * `GlobalClusterIdentifier` property, don't specify this property. The value is inherited from the
     * source DB cluster, the snapshot, or the primary DB cluster for the global database cluster,
     * respectively.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masteruserpassword)
     * @param masterUserPassword The master password for the DB instance. 
     */
    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusersecret)
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password. 
     */
    override fun masterUserSecret(masterUserSecret: IResolvable) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(IResolvable::unwrap))
    }

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusersecret)
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password. 
     */
    override fun masterUserSecret(masterUserSecret: MasterUserSecretProperty) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(MasterUserSecretProperty::unwrap))
    }

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide* and [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusersecret)
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c5177ba2ce09dd6957b01d7244f34d884d28421ebac39c4b8c7938b5c0ca985")
    override fun masterUserSecret(masterUserSecret: MasterUserSecretProperty.Builder.() -> Unit):
        Unit = masterUserSecret(MasterUserSecretProperty(masterUserSecret))

    /**
     * The name of the master user for the DB cluster.
     *
     *
     * If you specify the `SourceDBClusterIdentifier` , `SnapshotIdentifier` , or
     * `GlobalClusterIdentifier` property, don't specify this property. The value is inherited from the
     * source DB cluster, the snapshot, or the primary DB cluster for the global database cluster,
     * respectively.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusername)
     * @param masterUsername The name of the master user for the DB cluster. 
     */
    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for
     * the DB cluster.
     *
     * To turn off collecting Enhanced Monitoring metrics, specify `0` .
     *
     * If `MonitoringRoleArn` is specified, also set `MonitoringInterval` to a value other than `0`
     * .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Valid Values: `0 | 1 | 5 | 10 | 15 | 30 | 60`
     *
     * Default: `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-monitoringinterval)
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB cluster. 
     */
    override fun monitoringInterval(monitoringInterval: Number) {
      cdkBuilder.monitoringInterval(monitoringInterval)
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring
     * metrics to Amazon CloudWatch Logs.
     *
     * An example is `arn:aws:iam:123456789012:role/emaccess` . For information on creating a
     * monitoring role, see [Setting up and enabling Enhanced
     * Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling)
     * in the *Amazon RDS User Guide* .
     *
     * If `MonitoringInterval` is set to a value other than `0` , supply a `MonitoringRoleArn`
     * value.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-monitoringrolearn)
     * @param monitoringRoleArn The Amazon Resource Name (ARN) for the IAM role that permits RDS to
     * send Enhanced Monitoring metrics to Amazon CloudWatch Logs. 
     */
    override fun monitoringRoleArn(monitoringRoleArn: String) {
      cdkBuilder.monitoringRoleArn(monitoringRoleArn)
    }

    /**
     * The network type of the DB cluster.
     *
     * Valid values:
     *
     * * `IPV4`
     * * `DUAL`
     *
     * The network type is determined by the `DBSubnetGroup` specified for the DB cluster. A
     * `DBSubnetGroup` can support only the IPv4 protocol or the IPv4 and IPv6 protocols ( `DUAL` ).
     *
     * For more information, see [Working with a DB instance in a
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-networktype)
     * @param networkType The network type of the DB cluster. 
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    /**
     * Specifies whether to turn on Performance Insights for the DB cluster.
     *
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightsenabled)
     * @param performanceInsightsEnabled Specifies whether to turn on Performance Insights for the
     * DB cluster. 
     */
    override fun performanceInsightsEnabled(performanceInsightsEnabled: Boolean) {
      cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled)
    }

    /**
     * Specifies whether to turn on Performance Insights for the DB cluster.
     *
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightsenabled)
     * @param performanceInsightsEnabled Specifies whether to turn on Performance Insights for the
     * DB cluster. 
     */
    override fun performanceInsightsEnabled(performanceInsightsEnabled: IResolvable) {
      cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled.let(IResolvable::unwrap))
    }

    /**
     * The AWS KMS key identifier for encryption of Performance Insights data.
     *
     * The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     *
     * If you don't specify a value for `PerformanceInsightsKMSKeyId` , then Amazon RDS uses your
     * default KMS key. There is a default KMS key for your AWS account . Your AWS account has a
     * different default KMS key for each AWS Region .
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightskmskeyid)
     * @param performanceInsightsKmsKeyId The AWS KMS key identifier for encryption of Performance
     * Insights data. 
     */
    override fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
      cdkBuilder.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId)
    }

    /**
     * The number of days to retain Performance Insights data.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Valid Values:
     *
     * * `7`
     * * *month* * 31, where *month* is a number of months from 1-23. Examples: `93` (3 months *
     * 31), `341` (11 months * 31), `589` (19 months * 31)
     * * `731`
     *
     * Default: `7` days
     *
     * If you specify a retention period that isn't valid, such as `94` , Amazon RDS issues an
     * error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-performanceinsightsretentionperiod)
     * @param performanceInsightsRetentionPeriod The number of days to retain Performance Insights
     * data. 
     */
    override fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
      cdkBuilder.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod)
    }

    /**
     * The port number on which the DB instances in the DB cluster accept connections.
     *
     * Default:
     *
     * * When `EngineMode` is `provisioned` , `3306` (for both Aurora MySQL and Aurora PostgreSQL)
     * * When `EngineMode` is `serverless` :
     * * `3306` when `Engine` is `aurora` or `aurora-mysql`
     * * `5432` when `Engine` is `aurora-postgresql`
     *
     *
     * The `No interruption` on update behavior only applies to DB clusters. If you are updating a
     * DB instance, see
     * [Port](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port)
     * for the AWS::RDS::DBInstance resource.
     *
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port)
     * @param port The port number on which the DB instances in the DB cluster accept connections. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * The daily time range during which automated backups are created.
     *
     * For more information, see [Backup
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow)
     * in the *Amazon Aurora User Guide.*
     *
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi` .
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredbackupwindow)
     * @param preferredBackupWindow The daily time range during which automated backups are created.
     * 
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated
     * Time (UTC).
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region, occurring on a random day of the week. To see the time blocks available, see
     * [Adjusting the Preferred DB Cluster Maintenance
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora)
     * in the *Amazon Aurora User Guide.*
     *
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *
     * Constraints: Minimum 30-minute window.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC). 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * Specifies whether the DB cluster is publicly accessible.
     *
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
     * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
     * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is
     * ultimately controlled by the security group it uses. That public access isn't permitted if the
     * security group assigned to the DB cluster doesn't permit it.
     *
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
     * that resolves to a private IP address.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB cluster is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB cluster is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-publiclyaccessible)
     * @param publiclyAccessible Specifies whether the DB cluster is publicly accessible. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * Specifies whether the DB cluster is publicly accessible.
     *
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to
     * the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to
     * the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is
     * ultimately controlled by the security group it uses. That public access isn't permitted if the
     * security group assigned to the DB cluster doesn't permit it.
     *
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name
     * that resolves to a private IP address.
     *
     * Valid for Cluster Type: Multi-AZ DB clusters only
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB cluster is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB cluster is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB
     * cluster is public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-publiclyaccessible)
     * @param publiclyAccessible Specifies whether the DB cluster is publicly accessible. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is
     * created as a read replica.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier)
     * @param replicationSourceIdentifier The Amazon Resource Name (ARN) of the source DB instance
     * or DB cluster if this DB cluster is created as a read replica. 
     */
    override fun replicationSourceIdentifier(replicationSourceIdentifier: String) {
      cdkBuilder.replicationSourceIdentifier(replicationSourceIdentifier)
    }

    /**
     * The date and time to restore the DB cluster to.
     *
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     *
     * Constraints:
     *
     * * Must be before the latest restorable time for the DB instance
     * * Must be specified if `UseLatestRestorableTime` parameter isn't provided
     * * Can't be specified if the `UseLatestRestorableTime` parameter is enabled
     * * Can't be specified if the `RestoreType` parameter is `copy-on-write`
     *
     * This property must be used with `SourceDBClusterIdentifier` property. The resulting cluster
     * will have the identifier that matches the value of the `DBclusterIdentifier` property.
     *
     * Example: `2015-03-07T23:45:00Z`
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-restoretotime)
     * @param restoreToTime The date and time to restore the DB cluster to. 
     */
    override fun restoreToTime(restoreToTime: String) {
      cdkBuilder.restoreToTime(restoreToTime)
    }

    /**
     * The type of restore to be performed. You can specify one of the following values:.
     *
     * * `full-copy` - The new DB cluster is restored as a full copy of the source DB cluster.
     * * `copy-on-write` - The new DB cluster is restored as a clone of the source DB cluster.
     *
     * If you don't specify a `RestoreType` value, then the new DB cluster is restored as a full
     * copy of the source DB cluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Default: - "full-copy"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-restoretype)
     * @param restoreType The type of restore to be performed. You can specify one of the following
     * values:. 
     */
    override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

    /**
     * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
     * Serverless DB cluster.
     *
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster. 
     */
    override fun scalingConfiguration(scalingConfiguration: IResolvable) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
     * Serverless DB cluster.
     *
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster. 
     */
    override fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(ScalingConfigurationProperty::unwrap))
    }

    /**
     * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
     * Serverless DB cluster.
     *
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
     * @param scalingConfiguration The `ScalingConfiguration` property type specifies the scaling
     * configuration of an Aurora Serverless DB cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fa9676c3039f29f132b6dd8b699ca2cee78d2e1ded81b22cbcd42057c78dafe")
    override
        fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty.Builder.() -> Unit):
        Unit = scalingConfiguration(ScalingConfigurationProperty(scalingConfiguration))

    /**
     * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of
     * an Aurora Serverless V2 DB cluster.
     *
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration)
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster. 
     */
    override fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable) {
      cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of
     * an Aurora Serverless V2 DB cluster.
     *
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration)
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster. 
     */
    override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty) {
      cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration.let(ServerlessV2ScalingConfigurationProperty::unwrap))
    }

    /**
     * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of
     * an Aurora Serverless V2 DB cluster.
     *
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration)
     * @param serverlessV2ScalingConfiguration The `ServerlessV2ScalingConfiguration` property type
     * specifies the scaling configuration of an Aurora Serverless V2 DB cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c267a26045ec107b3af7352451263749d4ad8d017efddc544d91f7cc9c89369f")
    override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverlessV2ScalingConfiguration(ServerlessV2ScalingConfigurationProperty(serverlessV2ScalingConfiguration))

    /**
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot. However, you can use only the ARN to specify a DB snapshot.
     *
     * After you restore a DB cluster with a `SnapshotIdentifier` property, you must specify the
     * same `SnapshotIdentifier` property for any future updates to the DB cluster. When you specify
     * this property for an update, the DB cluster is not restored from the snapshot again, and the
     * data in the database is not changed. However, if you don't specify the `SnapshotIdentifier`
     * property, an empty DB cluster is created, and the original DB cluster is deleted. If you specify
     * a property that is different from the previous snapshot restore property, a new DB cluster is
     * restored from the specified `SnapshotIdentifier` property, and the original DB cluster is
     * deleted.
     *
     * If you specify the `SnapshotIdentifier` property to restore a DB cluster (as opposed to
     * specifying it for DB cluster updates), then don't specify the following properties:
     *
     * * `GlobalClusterIdentifier`
     * * `MasterUsername`
     * * `MasterUserPassword`
     * * `ReplicationSourceIdentifier`
     * * `RestoreType`
     * * `SourceDBClusterIdentifier`
     * * `SourceRegion`
     * * `StorageEncrypted` (for an encrypted snapshot)
     * * `UseLatestRestorableTime`
     *
     * Constraints:
     *
     * * Must match the identifier of an existing Snapshot.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-snapshotidentifier)
     * @param snapshotIdentifier The identifier for the DB snapshot or DB cluster snapshot to
     * restore from. 
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /**
     * When restoring a DB cluster to a point in time, the identifier of the source DB cluster from
     * which to restore.
     *
     * Constraints:
     *
     * * Must match the identifier of an existing DBCluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-sourcedbclusteridentifier)
     * @param sourceDbClusterIdentifier When restoring a DB cluster to a point in time, the
     * identifier of the source DB cluster from which to restore. 
     */
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * The AWS Region which contains the source DB cluster when replicating a DB cluster. For
     * example, `us-east-1` .
     *
     * Valid for: Aurora DB clusters only
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-sourceregion)
     * @param sourceRegion The AWS Region which contains the source DB cluster when replicating a DB
     * cluster. For example, `us-east-1` . 
     */
    override fun sourceRegion(sourceRegion: String) {
      cdkBuilder.sourceRegion(sourceRegion)
    }

    /**
     * Indicates whether the DB cluster is encrypted.
     *
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The
     * value is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
     * `KmsKeyId` property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted)
     * @param storageEncrypted Indicates whether the DB cluster is encrypted. 
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * Indicates whether the DB cluster is encrypted.
     *
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBClusterIdentifier` property, don't specify this property. The
     * value is inherited from the source DB cluster, and if the DB cluster is encrypted, the specified
     * `KmsKeyId` property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `SnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB cluster is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB cluster to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted)
     * @param storageEncrypted Indicates whether the DB cluster is encrypted. 
     */
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    /**
     * The storage type to associate with the DB cluster.
     *
     * For information on storage types for Aurora DB clusters, see [Storage configurations for
     * Amazon Aurora DB
     * clusters](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Overview.StorageReliability.html#aurora-storage-type)
     * . For information on storage types for Multi-AZ DB clusters, see [Settings for creating Multi-AZ
     * DB
     * clusters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/create-multi-az-db-cluster.html#create-multi-az-db-cluster-settings)
     * .
     *
     * This setting is required to create a Multi-AZ DB cluster.
     *
     * When specified for a Multi-AZ DB cluster, a value for the `Iops` parameter is required.
     *
     * Valid for Cluster Type: Aurora DB clusters and Multi-AZ DB clusters
     *
     * Valid Values:
     *
     * * Aurora DB clusters - `aurora | aurora-iopt1`
     * * Multi-AZ DB clusters - `io1 | io2 | gp3`
     *
     * Default:
     *
     * * Aurora DB clusters - `aurora`
     * * Multi-AZ DB clusters - `io1`
     *
     *
     * When you create an Aurora DB cluster with the storage type set to `aurora-iopt1` , the
     * storage type is returned in the response. The storage type isn't returned when you set it to
     * `aurora` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storagetype)
     * @param storageType The storage type to associate with the DB cluster. 
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * An optional array of key-value pairs to apply to this DB cluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
     * @param tags An optional array of key-value pairs to apply to this DB cluster. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An optional array of key-value pairs to apply to this DB cluster.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
     * @param tags An optional array of key-value pairs to apply to this DB cluster. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A value that indicates whether to restore the DB cluster to the latest restorable backup
     * time.
     *
     * By default, the DB cluster is not restored to the latest restorable backup time.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-uselatestrestorabletime)
     * @param useLatestRestorableTime A value that indicates whether to restore the DB cluster to
     * the latest restorable backup time. 
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    /**
     * A value that indicates whether to restore the DB cluster to the latest restorable backup
     * time.
     *
     * By default, the DB cluster is not restored to the latest restorable backup time.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-uselatestrestorabletime)
     * @param useLatestRestorableTime A value that indicates whether to restore the DB cluster to
     * the latest restorable backup time. 
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    /**
     * A list of EC2 VPC security groups to associate with this DB cluster.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB
     * cluster. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * A list of EC2 VPC security groups to associate with this DB cluster.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB
     * cluster. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster): CfnDBCluster =
        CfnDBCluster(cdkObject)

    internal fun unwrap(wrapped: CfnDBCluster): software.amazon.awscdk.services.rds.CfnDBCluster =
        wrapped.cdkObject as software.amazon.awscdk.services.rds.CfnDBCluster
  }

  /**
   * Describes an AWS Identity and Access Management (IAM) role that is associated with a DB
   * cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * DBClusterRoleProperty dBClusterRoleProperty = DBClusterRoleProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .featureName("featureName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-dbclusterrole.html)
   */
  public interface DBClusterRoleProperty {
    /**
     * The name of the feature associated with the AWS Identity and Access Management (IAM) role.
     *
     * IAM roles that are associated with a DB cluster grant permission for the DB cluster to access
     * other AWS services on your behalf. For the list of supported feature names, see the
     * `SupportedFeatureNames` description in
     * [DBEngineVersion](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
     * in the *Amazon RDS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-dbclusterrole.html#cfn-rds-dbcluster-dbclusterrole-featurename)
     */
    public fun featureName(): String? = unwrap(this).getFeatureName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-dbclusterrole.html#cfn-rds-dbcluster-dbclusterrole-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [DBClusterRoleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param featureName The name of the feature associated with the AWS Identity and Access
       * Management (IAM) role.
       * IAM roles that are associated with a DB cluster grant permission for the DB cluster to
       * access other AWS services on your behalf. For the list of supported feature names, see the
       * `SupportedFeatureNames` description in
       * [DBEngineVersion](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
       * in the *Amazon RDS API Reference* .
       */
      public fun featureName(featureName: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that is associated with the
       * DB cluster. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty.builder()

      /**
       * @param featureName The name of the feature associated with the AWS Identity and Access
       * Management (IAM) role.
       * IAM roles that are associated with a DB cluster grant permission for the DB cluster to
       * access other AWS services on your behalf. For the list of supported feature names, see the
       * `SupportedFeatureNames` description in
       * [DBEngineVersion](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
       * in the *Amazon RDS API Reference* .
       */
      override fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that is associated with the
       * DB cluster. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty,
    ) : CdkObject(cdkObject), DBClusterRoleProperty {
      /**
       * The name of the feature associated with the AWS Identity and Access Management (IAM) role.
       *
       * IAM roles that are associated with a DB cluster grant permission for the DB cluster to
       * access other AWS services on your behalf. For the list of supported feature names, see the
       * `SupportedFeatureNames` description in
       * [DBEngineVersion](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
       * in the *Amazon RDS API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-dbclusterrole.html#cfn-rds-dbcluster-dbclusterrole-featurename)
       */
      override fun featureName(): String? = unwrap(this).getFeatureName()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-dbclusterrole.html#cfn-rds-dbcluster-dbclusterrole-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DBClusterRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty):
          DBClusterRoleProperty = CdkObjectWrappers.wrap(cdkObject) as? DBClusterRoleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DBClusterRoleProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty
    }
  }

  /**
   * The `Endpoint` return value specifies the connection endpoint for the primary instance of the
   * DB cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * EndpointProperty endpointProperty = EndpointProperty.builder()
   * .address("address")
   * .port("port")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-endpoint.html)
   */
  public interface EndpointProperty {
    /**
     * Specifies the connection endpoint for the primary instance of the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-endpoint.html#cfn-rds-dbcluster-endpoint-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * Specifies the port that the database engine is listening on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-endpoint.html#cfn-rds-dbcluster-endpoint-port)
     */
    public fun port(): String? = unwrap(this).getPort()

    /**
     * A builder for [EndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address Specifies the connection endpoint for the primary instance of the DB
       * cluster.
       */
      public fun address(address: String)

      /**
       * @param port Specifies the port that the database engine is listening on.
       */
      public fun port(port: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty.builder()

      /**
       * @param address Specifies the connection endpoint for the primary instance of the DB
       * cluster.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param port Specifies the port that the database engine is listening on.
       */
      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty,
    ) : CdkObject(cdkObject), EndpointProperty {
      /**
       * Specifies the connection endpoint for the primary instance of the DB cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-endpoint.html#cfn-rds-dbcluster-endpoint-address)
       */
      override fun address(): String? = unwrap(this).getAddress()

      /**
       * Specifies the port that the database engine is listening on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-endpoint.html#cfn-rds-dbcluster-endpoint-port)
       */
      override fun port(): String? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty):
          EndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? EndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty
    }
  }

  /**
   * The `MasterUserSecret` return value specifies the secret managed by RDS in AWS Secrets Manager
   * for the master user password.
   *
   * For more information, see [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
   * *Amazon RDS User Guide* and [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html) in
   * the *Amazon Aurora User Guide.*
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * MasterUserSecretProperty masterUserSecretProperty = MasterUserSecretProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .secretArn("secretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
   */
  public interface MasterUserSecretProperty {
    /**
     * The AWS KMS key identifier that is used to encrypt the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html#cfn-rds-dbcluster-masterusersecret-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The Amazon Resource Name (ARN) of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html#cfn-rds-dbcluster-masterusersecret-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * A builder for [MasterUserSecretProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The AWS KMS key identifier that is used to encrypt the secret.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the secret.
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty.builder()

      /**
       * @param kmsKeyId The AWS KMS key identifier that is used to encrypt the secret.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the secret.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty,
    ) : CdkObject(cdkObject), MasterUserSecretProperty {
      /**
       * The AWS KMS key identifier that is used to encrypt the secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html#cfn-rds-dbcluster-masterusersecret-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The Amazon Resource Name (ARN) of the secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html#cfn-rds-dbcluster-masterusersecret-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MasterUserSecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty):
          MasterUserSecretProperty = CdkObjectWrappers.wrap(cdkObject) as? MasterUserSecretProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MasterUserSecretProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty
    }
  }

  /**
   * The `ReadEndpoint` return value specifies the reader endpoint for the DB cluster.
   *
   * The reader endpoint for a DB cluster load-balances connections across the Aurora Replicas that
   * are available in a DB cluster. As clients request new connections to the reader endpoint, Aurora
   * distributes the connection requests among the Aurora Replicas in the DB cluster. This
   * functionality can help balance your read workload across multiple Aurora Replicas in your DB
   * cluster.
   *
   * If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the
   * primary instance, your connection is dropped. To continue sending your read workload to other
   * Aurora Replicas in the cluster, you can then reconnect to the reader endpoint.
   *
   * For more information about Aurora endpoints, see [Amazon Aurora connection
   * management](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Overview.Endpoints.html)
   * in the *Amazon Aurora User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * ReadEndpointProperty readEndpointProperty = ReadEndpointProperty.builder()
   * .address("address")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-readendpoint.html)
   */
  public interface ReadEndpointProperty {
    /**
     * The host address of the reader endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-readendpoint.html#cfn-rds-dbcluster-readendpoint-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * A builder for [ReadEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The host address of the reader endpoint.
       */
      public fun address(address: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty.builder()

      /**
       * @param address The host address of the reader endpoint.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty,
    ) : CdkObject(cdkObject), ReadEndpointProperty {
      /**
       * The host address of the reader endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-readendpoint.html#cfn-rds-dbcluster-readendpoint-address)
       */
      override fun address(): String? = unwrap(this).getAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReadEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty):
          ReadEndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? ReadEndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReadEndpointProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty
    }
  }

  /**
   * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
   * Serverless DB cluster.
   *
   * For more information, see [Using Amazon Aurora
   * Serverless](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html)
   * in the *Amazon Aurora User Guide* .
   *
   * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
   * `ServerlessV2ScalingConfiguration` property.
   *
   * Valid for: Aurora DB clusters only
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * ScalingConfigurationProperty scalingConfigurationProperty =
   * ScalingConfigurationProperty.builder()
   * .autoPause(false)
   * .maxCapacity(123)
   * .minCapacity(123)
   * .secondsBeforeTimeout(123)
   * .secondsUntilAutoPause(123)
   * .timeoutAction("timeoutAction")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html)
   */
  public interface ScalingConfigurationProperty {
    /**
     * Indicates whether to allow or disallow automatic pause for an Aurora DB cluster in
     * `serverless` DB engine mode.
     *
     * A DB cluster can be paused only when it's idle (it has no connections).
     *
     *
     * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a
     * snapshot. In this case, the DB cluster is restored when there is a request to connect to it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-autopause)
     */
    public fun autoPause(): Any? = unwrap(this).getAutoPause()

    /**
     * The maximum capacity for an Aurora DB cluster in `serverless` DB engine mode.
     *
     * For Aurora MySQL, valid capacity values are `1` , `2` , `4` , `8` , `16` , `32` , `64` ,
     * `128` , and `256` .
     *
     * For Aurora PostgreSQL, valid capacity values are `2` , `4` , `8` , `16` , `32` , `64` , `192`
     * , and `384` .
     *
     * The maximum capacity must be greater than or equal to the minimum capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-maxcapacity)
     */
    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The minimum capacity for an Aurora DB cluster in `serverless` DB engine mode.
     *
     * For Aurora MySQL, valid capacity values are `1` , `2` , `4` , `8` , `16` , `32` , `64` ,
     * `128` , and `256` .
     *
     * For Aurora PostgreSQL, valid capacity values are `2` , `4` , `8` , `16` , `32` , `64` , `192`
     * , and `384` .
     *
     * The minimum capacity must be less than or equal to the maximum capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-mincapacity)
     */
    public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    /**
     * The amount of time, in seconds, that Aurora Serverless v1 tries to find a scaling point to
     * perform seamless scaling before enforcing the timeout action.
     *
     * The default is 300.
     *
     * Specify a value between 60 and 600 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsbeforetimeout)
     */
    public fun secondsBeforeTimeout(): Number? = unwrap(this).getSecondsBeforeTimeout()

    /**
     * The time, in seconds, before an Aurora DB cluster in `serverless` mode is paused.
     *
     * Specify a value between 300 and 86,400 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsuntilautopause)
     */
    public fun secondsUntilAutoPause(): Number? = unwrap(this).getSecondsUntilAutoPause()

    /**
     * The action to take when the timeout is reached, either `ForceApplyCapacityChange` or
     * `RollbackCapacityChange` .
     *
     * `ForceApplyCapacityChange` sets the capacity to the specified value as soon as possible.
     *
     * `RollbackCapacityChange` , the default, ignores the capacity change if a scaling point isn't
     * found in the timeout period.
     *
     *
     * If you specify `ForceApplyCapacityChange` , connections that prevent Aurora Serverless v1
     * from finding a scaling point might be dropped.
     *
     *
     * For more information, see [Autoscaling for Aurora Serverless
     * v1](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling)
     * in the *Amazon Aurora User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-timeoutaction)
     */
    public fun timeoutAction(): String? = unwrap(this).getTimeoutAction()

    /**
     * A builder for [ScalingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoPause Indicates whether to allow or disallow automatic pause for an Aurora DB
       * cluster in `serverless` DB engine mode.
       * A DB cluster can be paused only when it's idle (it has no connections).
       *
       *
       * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with
       * a snapshot. In this case, the DB cluster is restored when there is a request to connect to it.
       */
      public fun autoPause(autoPause: Boolean)

      /**
       * @param autoPause Indicates whether to allow or disallow automatic pause for an Aurora DB
       * cluster in `serverless` DB engine mode.
       * A DB cluster can be paused only when it's idle (it has no connections).
       *
       *
       * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with
       * a snapshot. In this case, the DB cluster is restored when there is a request to connect to it.
       */
      public fun autoPause(autoPause: IResolvable)

      /**
       * @param maxCapacity The maximum capacity for an Aurora DB cluster in `serverless` DB engine
       * mode.
       * For Aurora MySQL, valid capacity values are `1` , `2` , `4` , `8` , `16` , `32` , `64` ,
       * `128` , and `256` .
       *
       * For Aurora PostgreSQL, valid capacity values are `2` , `4` , `8` , `16` , `32` , `64` ,
       * `192` , and `384` .
       *
       * The maximum capacity must be greater than or equal to the minimum capacity.
       */
      public fun maxCapacity(maxCapacity: Number)

      /**
       * @param minCapacity The minimum capacity for an Aurora DB cluster in `serverless` DB engine
       * mode.
       * For Aurora MySQL, valid capacity values are `1` , `2` , `4` , `8` , `16` , `32` , `64` ,
       * `128` , and `256` .
       *
       * For Aurora PostgreSQL, valid capacity values are `2` , `4` , `8` , `16` , `32` , `64` ,
       * `192` , and `384` .
       *
       * The minimum capacity must be less than or equal to the maximum capacity.
       */
      public fun minCapacity(minCapacity: Number)

      /**
       * @param secondsBeforeTimeout The amount of time, in seconds, that Aurora Serverless v1 tries
       * to find a scaling point to perform seamless scaling before enforcing the timeout action.
       * The default is 300.
       *
       * Specify a value between 60 and 600 seconds.
       */
      public fun secondsBeforeTimeout(secondsBeforeTimeout: Number)

      /**
       * @param secondsUntilAutoPause The time, in seconds, before an Aurora DB cluster in
       * `serverless` mode is paused.
       * Specify a value between 300 and 86,400 seconds.
       */
      public fun secondsUntilAutoPause(secondsUntilAutoPause: Number)

      /**
       * @param timeoutAction The action to take when the timeout is reached, either
       * `ForceApplyCapacityChange` or `RollbackCapacityChange` .
       * `ForceApplyCapacityChange` sets the capacity to the specified value as soon as possible.
       *
       * `RollbackCapacityChange` , the default, ignores the capacity change if a scaling point
       * isn't found in the timeout period.
       *
       *
       * If you specify `ForceApplyCapacityChange` , connections that prevent Aurora Serverless v1
       * from finding a scaling point might be dropped.
       *
       *
       * For more information, see [Autoscaling for Aurora Serverless
       * v1](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling)
       * in the *Amazon Aurora User Guide* .
       */
      public fun timeoutAction(timeoutAction: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty.builder()

      /**
       * @param autoPause Indicates whether to allow or disallow automatic pause for an Aurora DB
       * cluster in `serverless` DB engine mode.
       * A DB cluster can be paused only when it's idle (it has no connections).
       *
       *
       * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with
       * a snapshot. In this case, the DB cluster is restored when there is a request to connect to it.
       */
      override fun autoPause(autoPause: Boolean) {
        cdkBuilder.autoPause(autoPause)
      }

      /**
       * @param autoPause Indicates whether to allow or disallow automatic pause for an Aurora DB
       * cluster in `serverless` DB engine mode.
       * A DB cluster can be paused only when it's idle (it has no connections).
       *
       *
       * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with
       * a snapshot. In this case, the DB cluster is restored when there is a request to connect to it.
       */
      override fun autoPause(autoPause: IResolvable) {
        cdkBuilder.autoPause(autoPause.let(IResolvable::unwrap))
      }

      /**
       * @param maxCapacity The maximum capacity for an Aurora DB cluster in `serverless` DB engine
       * mode.
       * For Aurora MySQL, valid capacity values are `1` , `2` , `4` , `8` , `16` , `32` , `64` ,
       * `128` , and `256` .
       *
       * For Aurora PostgreSQL, valid capacity values are `2` , `4` , `8` , `16` , `32` , `64` ,
       * `192` , and `384` .
       *
       * The maximum capacity must be greater than or equal to the minimum capacity.
       */
      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      /**
       * @param minCapacity The minimum capacity for an Aurora DB cluster in `serverless` DB engine
       * mode.
       * For Aurora MySQL, valid capacity values are `1` , `2` , `4` , `8` , `16` , `32` , `64` ,
       * `128` , and `256` .
       *
       * For Aurora PostgreSQL, valid capacity values are `2` , `4` , `8` , `16` , `32` , `64` ,
       * `192` , and `384` .
       *
       * The minimum capacity must be less than or equal to the maximum capacity.
       */
      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      /**
       * @param secondsBeforeTimeout The amount of time, in seconds, that Aurora Serverless v1 tries
       * to find a scaling point to perform seamless scaling before enforcing the timeout action.
       * The default is 300.
       *
       * Specify a value between 60 and 600 seconds.
       */
      override fun secondsBeforeTimeout(secondsBeforeTimeout: Number) {
        cdkBuilder.secondsBeforeTimeout(secondsBeforeTimeout)
      }

      /**
       * @param secondsUntilAutoPause The time, in seconds, before an Aurora DB cluster in
       * `serverless` mode is paused.
       * Specify a value between 300 and 86,400 seconds.
       */
      override fun secondsUntilAutoPause(secondsUntilAutoPause: Number) {
        cdkBuilder.secondsUntilAutoPause(secondsUntilAutoPause)
      }

      /**
       * @param timeoutAction The action to take when the timeout is reached, either
       * `ForceApplyCapacityChange` or `RollbackCapacityChange` .
       * `ForceApplyCapacityChange` sets the capacity to the specified value as soon as possible.
       *
       * `RollbackCapacityChange` , the default, ignores the capacity change if a scaling point
       * isn't found in the timeout period.
       *
       *
       * If you specify `ForceApplyCapacityChange` , connections that prevent Aurora Serverless v1
       * from finding a scaling point might be dropped.
       *
       *
       * For more information, see [Autoscaling for Aurora Serverless
       * v1](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling)
       * in the *Amazon Aurora User Guide* .
       */
      override fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty,
    ) : CdkObject(cdkObject), ScalingConfigurationProperty {
      /**
       * Indicates whether to allow or disallow automatic pause for an Aurora DB cluster in
       * `serverless` DB engine mode.
       *
       * A DB cluster can be paused only when it's idle (it has no connections).
       *
       *
       * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with
       * a snapshot. In this case, the DB cluster is restored when there is a request to connect to it.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-autopause)
       */
      override fun autoPause(): Any? = unwrap(this).getAutoPause()

      /**
       * The maximum capacity for an Aurora DB cluster in `serverless` DB engine mode.
       *
       * For Aurora MySQL, valid capacity values are `1` , `2` , `4` , `8` , `16` , `32` , `64` ,
       * `128` , and `256` .
       *
       * For Aurora PostgreSQL, valid capacity values are `2` , `4` , `8` , `16` , `32` , `64` ,
       * `192` , and `384` .
       *
       * The maximum capacity must be greater than or equal to the minimum capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-maxcapacity)
       */
      override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      /**
       * The minimum capacity for an Aurora DB cluster in `serverless` DB engine mode.
       *
       * For Aurora MySQL, valid capacity values are `1` , `2` , `4` , `8` , `16` , `32` , `64` ,
       * `128` , and `256` .
       *
       * For Aurora PostgreSQL, valid capacity values are `2` , `4` , `8` , `16` , `32` , `64` ,
       * `192` , and `384` .
       *
       * The minimum capacity must be less than or equal to the maximum capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-mincapacity)
       */
      override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

      /**
       * The amount of time, in seconds, that Aurora Serverless v1 tries to find a scaling point to
       * perform seamless scaling before enforcing the timeout action.
       *
       * The default is 300.
       *
       * Specify a value between 60 and 600 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsbeforetimeout)
       */
      override fun secondsBeforeTimeout(): Number? = unwrap(this).getSecondsBeforeTimeout()

      /**
       * The time, in seconds, before an Aurora DB cluster in `serverless` mode is paused.
       *
       * Specify a value between 300 and 86,400 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsuntilautopause)
       */
      override fun secondsUntilAutoPause(): Number? = unwrap(this).getSecondsUntilAutoPause()

      /**
       * The action to take when the timeout is reached, either `ForceApplyCapacityChange` or
       * `RollbackCapacityChange` .
       *
       * `ForceApplyCapacityChange` sets the capacity to the specified value as soon as possible.
       *
       * `RollbackCapacityChange` , the default, ignores the capacity change if a scaling point
       * isn't found in the timeout period.
       *
       *
       * If you specify `ForceApplyCapacityChange` , connections that prevent Aurora Serverless v1
       * from finding a scaling point might be dropped.
       *
       *
       * For more information, see [Autoscaling for Aurora Serverless
       * v1](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling)
       * in the *Amazon Aurora User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-timeoutaction)
       */
      override fun timeoutAction(): String? = unwrap(this).getTimeoutAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty):
          ScalingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScalingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConfigurationProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty
    }
  }

  /**
   * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of an
   * Aurora Serverless V2 DB cluster.
   *
   * For more information, see [Using Amazon Aurora Serverless
   * v2](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.html) in the
   * *Amazon Aurora User Guide* .
   *
   * If you have an Aurora cluster, you must set the `ScalingConfigurationInfo` attribute before you
   * add a DB instance that uses the `db.serverless` DB instance class. For more information, see
   * [Clusters that use Aurora Serverless v2 must have a capacity range
   * specified](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html#aurora-serverless-v2.requirements.capacity-range)
   * in the *Amazon Aurora User Guide* .
   *
   * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
   * `ScalingConfiguration` property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * ServerlessV2ScalingConfigurationProperty serverlessV2ScalingConfigurationProperty =
   * ServerlessV2ScalingConfigurationProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-serverlessv2scalingconfiguration.html)
   */
  public interface ServerlessV2ScalingConfigurationProperty {
    /**
     * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless
     * v2 cluster.
     *
     * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The
     * largest value that you can use is 128.
     *
     * The maximum capacity must be higher than 0.5 ACUs. For more information, see [Choosing the
     * maximum Aurora Serverless v2 capacity setting for a
     * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.max_capacity_considerations)
     * in the *Amazon Aurora User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-serverlessv2scalingconfiguration.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration-maxcapacity)
     */
    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless
     * v2 cluster.
     *
     * You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The
     * smallest value that you can use is 0.5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-serverlessv2scalingconfiguration.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration-mincapacity)
     */
    public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    /**
     * A builder for [ServerlessV2ScalingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxCapacity The maximum number of Aurora capacity units (ACUs) for a DB instance in
       * an Aurora Serverless v2 cluster.
       * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The
       * largest value that you can use is 128.
       *
       * The maximum capacity must be higher than 0.5 ACUs. For more information, see [Choosing the
       * maximum Aurora Serverless v2 capacity setting for a
       * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.max_capacity_considerations)
       * in the *Amazon Aurora User Guide* .
       */
      public fun maxCapacity(maxCapacity: Number)

      /**
       * @param minCapacity The minimum number of Aurora capacity units (ACUs) for a DB instance in
       * an Aurora Serverless v2 cluster.
       * You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The
       * smallest value that you can use is 0.5.
       */
      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty.builder()

      /**
       * @param maxCapacity The maximum number of Aurora capacity units (ACUs) for a DB instance in
       * an Aurora Serverless v2 cluster.
       * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The
       * largest value that you can use is 128.
       *
       * The maximum capacity must be higher than 0.5 ACUs. For more information, see [Choosing the
       * maximum Aurora Serverless v2 capacity setting for a
       * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.max_capacity_considerations)
       * in the *Amazon Aurora User Guide* .
       */
      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      /**
       * @param minCapacity The minimum number of Aurora capacity units (ACUs) for a DB instance in
       * an Aurora Serverless v2 cluster.
       * You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The
       * smallest value that you can use is 0.5.
       */
      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty,
    ) : CdkObject(cdkObject), ServerlessV2ScalingConfigurationProperty {
      /**
       * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora
       * Serverless v2 cluster.
       *
       * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The
       * largest value that you can use is 128.
       *
       * The maximum capacity must be higher than 0.5 ACUs. For more information, see [Choosing the
       * maximum Aurora Serverless v2 capacity setting for a
       * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.max_capacity_considerations)
       * in the *Amazon Aurora User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-serverlessv2scalingconfiguration.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration-maxcapacity)
       */
      override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      /**
       * The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora
       * Serverless v2 cluster.
       *
       * You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The
       * smallest value that you can use is 0.5.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-serverlessv2scalingconfiguration.html#cfn-rds-dbcluster-serverlessv2scalingconfiguration-mincapacity)
       */
      override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerlessV2ScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty):
          ServerlessV2ScalingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerlessV2ScalingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerlessV2ScalingConfigurationProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty
    }
  }
}
