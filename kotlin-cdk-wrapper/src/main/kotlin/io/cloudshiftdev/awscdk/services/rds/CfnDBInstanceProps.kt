@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDBInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBInstanceProps cfnDBInstanceProps = CfnDBInstanceProps.builder()
 * .allocatedStorage("allocatedStorage")
 * .allowMajorVersionUpgrade(false)
 * .associatedRoles(List.of(DBInstanceRoleProperty.builder()
 * .featureName("featureName")
 * .roleArn("roleArn")
 * .build()))
 * .automaticBackupReplicationRegion("automaticBackupReplicationRegion")
 * .autoMinorVersionUpgrade(false)
 * .availabilityZone("availabilityZone")
 * .backupRetentionPeriod(123)
 * .caCertificateIdentifier("caCertificateIdentifier")
 * .certificateDetails(CertificateDetailsProperty.builder()
 * .caIdentifier("caIdentifier")
 * .validTill("validTill")
 * .build())
 * .certificateRotationRestart(false)
 * .characterSetName("characterSetName")
 * .copyTagsToSnapshot(false)
 * .customIamInstanceProfile("customIamInstanceProfile")
 * .dbClusterIdentifier("dbClusterIdentifier")
 * .dbClusterSnapshotIdentifier("dbClusterSnapshotIdentifier")
 * .dbInstanceClass("dbInstanceClass")
 * .dbInstanceIdentifier("dbInstanceIdentifier")
 * .dbName("dbName")
 * .dbParameterGroupName("dbParameterGroupName")
 * .dbSecurityGroups(List.of("dbSecurityGroups"))
 * .dbSnapshotIdentifier("dbSnapshotIdentifier")
 * .dbSubnetGroupName("dbSubnetGroupName")
 * .dedicatedLogVolume(false)
 * .deleteAutomatedBackups(false)
 * .deletionProtection(false)
 * .domain("domain")
 * .domainAuthSecretArn("domainAuthSecretArn")
 * .domainDnsIps(List.of("domainDnsIps"))
 * .domainFqdn("domainFqdn")
 * .domainIamRoleName("domainIamRoleName")
 * .domainOu("domainOu")
 * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
 * .enableIamDatabaseAuthentication(false)
 * .enablePerformanceInsights(false)
 * .endpoint(EndpointProperty.builder()
 * .address("address")
 * .hostedZoneId("hostedZoneId")
 * .port("port")
 * .build())
 * .engine("engine")
 * .engineVersion("engineVersion")
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .licenseModel("licenseModel")
 * .manageMasterUserPassword(false)
 * .masterUsername("masterUsername")
 * .masterUserPassword("masterUserPassword")
 * .masterUserSecret(MasterUserSecretProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .secretArn("secretArn")
 * .build())
 * .maxAllocatedStorage(123)
 * .monitoringInterval(123)
 * .monitoringRoleArn("monitoringRoleArn")
 * .multiAz(false)
 * .ncharCharacterSetName("ncharCharacterSetName")
 * .networkType("networkType")
 * .optionGroupName("optionGroupName")
 * .performanceInsightsKmsKeyId("performanceInsightsKmsKeyId")
 * .performanceInsightsRetentionPeriod(123)
 * .port("port")
 * .preferredBackupWindow("preferredBackupWindow")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .processorFeatures(List.of(ProcessorFeatureProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .promotionTier(123)
 * .publiclyAccessible(false)
 * .replicaMode("replicaMode")
 * .restoreTime("restoreTime")
 * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
 * .sourceDbInstanceAutomatedBackupsArn("sourceDbInstanceAutomatedBackupsArn")
 * .sourceDbInstanceIdentifier("sourceDbInstanceIdentifier")
 * .sourceDbiResourceId("sourceDbiResourceId")
 * .sourceRegion("sourceRegion")
 * .storageEncrypted(false)
 * .storageThroughput(123)
 * .storageType("storageType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tdeCredentialArn("tdeCredentialArn")
 * .tdeCredentialPassword("tdeCredentialPassword")
 * .timezone("timezone")
 * .useDefaultProcessorFeatures(false)
 * .useLatestRestorableTime(false)
 * .vpcSecurityGroups(List.of("vpcSecurityGroups"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html)
 */
public interface CfnDBInstanceProps {
  /**
   * The amount of storage in gibibytes (GiB) to be initially allocated for the database instance.
   *
   *
   * If any value is set in the `Iops` parameter, `AllocatedStorage` must be at least 100 GiB, which
   * corresponds to the minimum Iops value of 1,000. If you increase the `Iops` value (in 1,000 IOPS
   * increments), then you must also increase the `AllocatedStorage` value (in 100-GiB increments).
   *
   *
   * *Amazon Aurora*
   *
   * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your
   * database increases, though you are only charged for the space that you use in an Aurora cluster
   * volume.
   *
   * *Db2*
   *
   * Constraints to the amount of storage for each storage type are the following:
   *
   * * General Purpose (SSD) storage (gp3): Must be an integer from 20 to 64000.
   * * Provisioned IOPS storage (io1): Must be an integer from 100 to 64000.
   *
   * *MySQL*
   *
   * Constraints to the amount of storage for each storage type are the following:
   *
   * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
   * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
   * * Magnetic storage (standard): Must be an integer from 5 to 3072.
   *
   * *MariaDB*
   *
   * Constraints to the amount of storage for each storage type are the following:
   *
   * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
   * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
   * * Magnetic storage (standard): Must be an integer from 5 to 3072.
   *
   * *PostgreSQL*
   *
   * Constraints to the amount of storage for each storage type are the following:
   *
   * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
   * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
   * * Magnetic storage (standard): Must be an integer from 5 to 3072.
   *
   * *Oracle*
   *
   * Constraints to the amount of storage for each storage type are the following:
   *
   * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
   * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
   * * Magnetic storage (standard): Must be an integer from 10 to 3072.
   *
   * *SQL Server*
   *
   * Constraints to the amount of storage for each storage type are the following:
   *
   * * General Purpose (SSD) storage (gp2):
   * * Enterprise and Standard editions: Must be an integer from 20 to 16384.
   * * Web and Express editions: Must be an integer from 20 to 16384.
   * * Provisioned IOPS storage (io1):
   * * Enterprise and Standard editions: Must be an integer from 20 to 16384.
   * * Web and Express editions: Must be an integer from 20 to 16384.
   * * Magnetic storage (standard):
   * * Enterprise and Standard editions: Must be an integer from 20 to 1024.
   * * Web and Express editions: Must be an integer from 20 to 1024.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-allocatedstorage)
   */
  public fun allocatedStorage(): String? = unwrap(this).getAllocatedStorage()

  /**
   * A value that indicates whether major version upgrades are allowed.
   *
   * Changing this parameter doesn't result in an outage and the change is asynchronously applied as
   * soon as possible.
   *
   * Constraints: Major version upgrades must be allowed when specifying a value for the
   * `EngineVersion` parameter that is a different major version than the DB instance's current
   * version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-allowmajorversionupgrade)
   */
  public fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

  /**
   * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
   *
   * *Amazon Aurora*
   *
   * Not applicable. The associated roles are managed by the DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-associatedroles)
   */
  public fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  /**
   * A value that indicates whether minor engine upgrades are applied automatically to the DB
   * instance during the maintenance window.
   *
   * By default, minor engine upgrades are applied automatically.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-autominorversionupgrade)
   */
  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * The destination region for the backup replication of the DB instance.
   *
   * For more info, see [Replicating automated backups to another AWS
   * Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html) in the
   * *Amazon RDS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-automaticbackupreplicationregion)
   */
  public fun automaticBackupReplicationRegion(): String? =
      unwrap(this).getAutomaticBackupReplicationRegion()

  /**
   * The Availability Zone (AZ) where the database will be created.
   *
   * For information on AWS Regions and Availability Zones, see [Regions and Availability
   * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html)
   * .
   *
   * For Amazon Aurora, each Aurora DB cluster hosts copies of its storage in three separate
   * Availability Zones. Specify one of these Availability Zones. Aurora automatically chooses an
   * appropriate Availability Zone if you don't specify one.
   *
   * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
   *
   * Constraints:
   *
   * * The `AvailabilityZone` parameter can't be specified if the DB instance is a Multi-AZ
   * deployment.
   * * The specified Availability Zone must be in the same AWS Region as the current endpoint.
   *
   * Example: `us-east-1d`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The number of days for which automated backups are retained.
   *
   * Setting this parameter to a positive number enables backups. Setting this parameter to 0
   * disables automated backups.
   *
   * *Amazon Aurora*
   *
   * Not applicable. The retention period for automated backups is managed by the DB cluster.
   *
   * Default: 1
   *
   * Constraints:
   *
   * * Must be a value from 0 to 35
   * * Can't be set to 0 if the DB instance is a source to read replicas
   *
   * Default: - 1
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-backupretentionperiod)
   */
  public fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  /**
   * The identifier of the CA certificate for this DB instance.
   *
   * For more information, see [Using SSL/TLS to encrypt a connection to a DB
   * instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html) in the
   * *Amazon RDS User Guide* and [Using SSL/TLS to encrypt a connection to a DB
   * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html) in
   * the *Amazon Aurora User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-cacertificateidentifier)
   */
  public fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  /**
   * The details of the DB instance's server certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-certificatedetails)
   */
  public fun certificateDetails(): Any? = unwrap(this).getCertificateDetails()

  /**
   * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
   *
   * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
   * certificate is not updated until the DB instance is restarted.
   *
   *
   * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
   *
   *
   * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for
   * your DB engine to rotate your SSL/TLS certificate:
   *
   * * For more information about rotating your SSL/TLS certificate for RDS DB engines, see
   * [Rotating Your SSL/TLS
   * Certificate.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html)
   * in the *Amazon RDS User Guide.*
   * * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see
   * [Rotating Your SSL/TLS
   * Certificate](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
   * in the *Amazon Aurora User Guide* .
   *
   * This setting doesn't apply to RDS Custom DB instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-certificaterotationrestart)
   */
  public fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

  /**
   * For supported engines, indicates that the DB instance should be associated with the specified
   * character set.
   *
   * *Amazon Aurora*
   *
   * Not applicable. The character set is managed by the DB cluster. For more information, see
   * [AWS::RDS::DBCluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-charactersetname)
   */
  public fun characterSetName(): String? = unwrap(this).getCharacterSetName()

  /**
   * Specifies whether to copy tags from the DB instance to snapshots of the DB instance.
   *
   * By default, tags are not copied.
   *
   * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is managed
   * by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster
   * setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-copytagstosnapshot)
   */
  public fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  /**
   * The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB
   * instance.
   *
   * This setting is required for RDS Custom.
   *
   * Constraints:
   *
   * * The profile must exist in your account.
   * * The profile must have an IAM role that Amazon EC2 has permissions to assume.
   * * The instance profile name and the associated IAM role name must start with the prefix
   * `AWSRDSCustom` .
   *
   * For the list of permissions required for the IAM role, see [Configure IAM and your
   * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc)
   * in the *Amazon RDS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-customiaminstanceprofile)
   */
  public fun customIamInstanceProfile(): String? = unwrap(this).getCustomIamInstanceProfile()

  /**
   * The identifier of the DB cluster that the instance will belong to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbclusteridentifier)
   */
  public fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  /**
   * The identifier for the Multi-AZ DB cluster snapshot to restore from.
   *
   * For more information on Multi-AZ DB clusters, see [Multi-AZ DB cluster
   * deployments](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html)
   * in the *Amazon RDS User Guide* .
   *
   * Constraints:
   *
   * * Must match the identifier of an existing Multi-AZ DB cluster snapshot.
   * * Can't be specified when `DBSnapshotIdentifier` is specified.
   * * Must be specified when `DBSnapshotIdentifier` isn't specified.
   * * If you are restoring from a shared manual Multi-AZ DB cluster snapshot, the
   * `DBClusterSnapshotIdentifier` must be the ARN of the shared snapshot.
   * * Can't be the identifier of an Aurora DB cluster snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbclustersnapshotidentifier)
   */
  public fun dbClusterSnapshotIdentifier(): String? = unwrap(this).getDbClusterSnapshotIdentifier()

  /**
   * The compute and memory capacity of the DB instance, for example `db.m5.large` . Not all DB
   * instance classes are available in all AWS Regions , or for all database engines. For the full list
   * of DB instance classes, and availability for your engine, see [DB instance
   * classes](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) in
   * the *Amazon RDS User Guide* or [Aurora DB instance
   * classes](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html)
   * in the *Amazon Aurora User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbinstanceclass)
   */
  public fun dbInstanceClass(): String? = unwrap(this).getDbInstanceClass()

  /**
   * A name for the DB instance.
   *
   * If you specify a name, AWS CloudFormation converts it to lowercase. If you don't specify a
   * name, AWS CloudFormation generates a unique physical ID and uses that ID for the DB instance. For
   * more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   * For information about constraints that apply to DB instance identifiers, see [Naming
   * constraints in Amazon
   * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
   * in the *Amazon RDS User Guide* .
   *
   *
   * If you specify a name, you can't perform updates that require replacement of this resource. You
   * can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbinstanceidentifier)
   */
  public fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

  /**
   * The meaning of this parameter differs according to the database engine you use.
   *
   *
   * If you specify the
   * `[DBSnapshotIdentifier](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier)`
   * property, this property only applies to RDS for Oracle.
   *
   *
   * *Amazon Aurora*
   *
   * Not applicable. The database name is managed by the DB cluster.
   *
   * *Db2*
   *
   * The name of the database to create when the DB instance is created. If this parameter isn't
   * specified, no database is created in the DB instance.
   *
   * Constraints:
   *
   * * Must contain 1 to 64 letters or numbers.
   * * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
   * * Can't be a word reserved by the specified database engine.
   *
   * *MySQL*
   *
   * The name of the database to create when the DB instance is created. If this parameter is not
   * specified, no database is created in the DB instance.
   *
   * Constraints:
   *
   * * Must contain 1 to 64 letters or numbers.
   * * Can't be a word reserved by the specified database engine
   *
   * *MariaDB*
   *
   * The name of the database to create when the DB instance is created. If this parameter is not
   * specified, no database is created in the DB instance.
   *
   * Constraints:
   *
   * * Must contain 1 to 64 letters or numbers.
   * * Can't be a word reserved by the specified database engine
   *
   * *PostgreSQL*
   *
   * The name of the database to create when the DB instance is created. If this parameter is not
   * specified, the default `postgres` database is created in the DB instance.
   *
   * Constraints:
   *
   * * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
   * * Must contain 1 to 63 characters.
   * * Can't be a word reserved by the specified database engine
   *
   * *Oracle*
   *
   * The Oracle System ID (SID) of the created DB instance. If you specify `null` , the default
   * value `ORCL` is used. You can't specify the string NULL, or any other reserved word, for `DBName`
   * .
   *
   * Default: `ORCL`
   *
   * Constraints:
   *
   * * Can't be longer than 8 characters
   *
   * *SQL Server*
   *
   * Not applicable. Must be null.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbname)
   */
  public fun dbName(): String? = unwrap(this).getDbName()

  /**
   * The name of an existing DB parameter group or a reference to an
   * [AWS::RDS::DBParameterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html)
   * resource created in the template.
   *
   * To list all of the available DB parameter group names, use the following command:
   *
   * `aws rds describe-db-parameter-groups --query
   * "DBParameterGroups[].DBParameterGroupName" --output text`
   *
   *
   * If any of the data members of the referenced parameter group are changed during an update, the
   * DB instance might need to be restarted, which causes some interruption. If the parameter group
   * contains static parameters, whether they were changed or not, an update triggers a reboot.
   *
   *
   * If you don't specify a value for `DBParameterGroupName` property, the default DB parameter
   * group for the specified engine and engine version is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbparametergroupname)
   */
  public fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

  /**
   * A list of the DB security groups to assign to the DB instance.
   *
   * The list can include both the name of existing DB security groups or references to
   * AWS::RDS::DBSecurityGroup resources created in the template.
   *
   * If you set DBSecurityGroups, you must not set VPCSecurityGroups, and vice versa. Also, note
   * that the DBSecurityGroups property exists only for backwards compatibility with older regions and
   * is no longer recommended for providing security information to an RDS DB instance. Instead, use
   * VPCSecurityGroups.
   *
   *
   * If you specify this property, AWS CloudFormation sends only the following properties (if
   * specified) to Amazon RDS during create operations:
   *
   * * `AllocatedStorage`
   * * `AutoMinorVersionUpgrade`
   * * `AvailabilityZone`
   * * `BackupRetentionPeriod`
   * * `CharacterSetName`
   * * `DBInstanceClass`
   * * `DBName`
   * * `DBParameterGroupName`
   * * `DBSecurityGroups`
   * * `DBSubnetGroupName`
   * * `Engine`
   * * `EngineVersion`
   * * `Iops`
   * * `LicenseModel`
   * * `MasterUsername`
   * * `MasterUserPassword`
   * * `MultiAZ`
   * * `OptionGroupName`
   * * `PreferredBackupWindow`
   * * `PreferredMaintenanceWindow`
   *
   * All other properties are ignored. Specify a virtual private cloud (VPC) security group if you
   * want to submit other properties, such as `StorageType` , `StorageEncrypted` , or `KmsKeyId` . If
   * you're already using the `DBSecurityGroups` property, you can't use these other properties by
   * updating your DB instance to use a VPC security group. You must recreate the DB instance.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbsecuritygroups)
   */
  public fun dbSecurityGroups(): List<String> = unwrap(this).getDbSecurityGroups() ?: emptyList()

  /**
   * The name or Amazon Resource Name (ARN) of the DB snapshot that's used to restore the DB
   * instance.
   *
   * If you're restoring from a shared manual DB snapshot, you must specify the ARN of the snapshot.
   *
   * By specifying this property, you can create a DB instance from the specified DB snapshot. If
   * the `DBSnapshotIdentifier` property is an empty string or the `AWS::RDS::DBInstance` declaration
   * has no `DBSnapshotIdentifier` property, AWS CloudFormation creates a new database. If the property
   * contains a value (other than an empty string), AWS CloudFormation creates a database from the
   * specified snapshot. If a snapshot with the specified name doesn't exist, AWS CloudFormation can't
   * create the database and it rolls back the stack.
   *
   * Some DB instance properties aren't valid when you restore from a snapshot, such as the
   * `MasterUsername` and `MasterUserPassword` properties. For information about the properties that
   * you can specify, see the `RestoreDBInstanceFromDBSnapshot` action in the *Amazon RDS API
   * Reference* .
   *
   * After you restore a DB instance with a `DBSnapshotIdentifier` property, you must specify the
   * same `DBSnapshotIdentifier` property for any future updates to the DB instance. When you specify
   * this property for an update, the DB instance is not restored from the DB snapshot again, and the
   * data in the database is not changed. However, if you don't specify the `DBSnapshotIdentifier`
   * property, an empty DB instance is created, and the original DB instance is deleted. If you specify
   * a property that is different from the previous snapshot restore property, a new DB instance is
   * restored from the specified `DBSnapshotIdentifier` property, and the original DB instance is
   * deleted.
   *
   * If you specify the `DBSnapshotIdentifier` property to restore a DB instance (as opposed to
   * specifying it for DB instance updates), then don't specify the following properties:
   *
   * * `CharacterSetName`
   * * `DBClusterIdentifier`
   * * `DBName`
   * * `DeleteAutomatedBackups`
   * * `EnablePerformanceInsights`
   * * `KmsKeyId`
   * * `MasterUsername`
   * * `MasterUserPassword`
   * * `PerformanceInsightsKMSKeyId`
   * * `PerformanceInsightsRetentionPeriod`
   * * `PromotionTier`
   * * `SourceDBInstanceIdentifier`
   * * `SourceRegion`
   * * `StorageEncrypted` (for an encrypted snapshot)
   * * `Timezone`
   *
   * *Amazon Aurora*
   *
   * Not applicable. Snapshot restore is managed by the DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbsnapshotidentifier)
   */
  public fun dbSnapshotIdentifier(): String? = unwrap(this).getDbSnapshotIdentifier()

  /**
   * A DB subnet group to associate with the DB instance.
   *
   * If you update this value, the new subnet group must be a subnet group in a new VPC.
   *
   * If there's no DB subnet group, then the DB instance isn't a VPC DB instance.
   *
   * For more information about using Amazon RDS in a VPC, see [Using Amazon RDS with Amazon Virtual
   * Private Cloud (VPC)](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html) in the
   * *Amazon RDS User Guide* .
   *
   * *Amazon Aurora*
   *
   * Not applicable. The DB subnet group is managed by the DB cluster. If specified, the setting
   * must match the DB cluster setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbsubnetgroupname)
   */
  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dedicatedlogvolume)
   */
  public fun dedicatedLogVolume(): Any? = unwrap(this).getDedicatedLogVolume()

  /**
   * A value that indicates whether to remove automated backups immediately after the DB instance is
   * deleted.
   *
   * This parameter isn't case-sensitive. The default is to remove automated backups immediately
   * after the DB instance is deleted.
   *
   * *Amazon Aurora*
   *
   * Not applicable. When you delete a DB cluster, all automated backups for that DB cluster are
   * deleted and can't be recovered. Manual DB cluster snapshots of the DB cluster are not deleted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-deleteautomatedbackups)
   */
  public fun deleteAutomatedBackups(): Any? = unwrap(this).getDeleteAutomatedBackups()

  /**
   * A value that indicates whether the DB instance has deletion protection enabled.
   *
   * The database can't be deleted when deletion protection is enabled. By default, deletion
   * protection is disabled. For more information, see [Deleting a DB
   * Instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html) .
   *
   * *Amazon Aurora*
   *
   * Not applicable. You can enable or disable deletion protection for the DB cluster. For more
   * information, see `CreateDBCluster` . DB instances in a DB cluster can be deleted even when
   * deletion protection is enabled for the DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-deletionprotection)
   */
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * The Active Directory directory ID to create the DB instance in.
   *
   * Currently, only Db2, MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be
   * created in an Active Directory Domain.
   *
   * For more information, see [Kerberos
   * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html)
   * in the *Amazon RDS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domain)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
   *
   * Example: `arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainauthsecretarn)
   */
  public fun domainAuthSecretArn(): String? = unwrap(this).getDomainAuthSecretArn()

  /**
   * The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.
   *
   * Constraints:
   *
   * * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP
   * address of the primary domain controller for both entries in the list.
   *
   * Example: `123.124.125.126,234.235.236.237`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domaindnsips)
   */
  public fun domainDnsIps(): List<String> = unwrap(this).getDomainDnsIps() ?: emptyList()

  /**
   * The fully qualified domain name (FQDN) of an Active Directory domain.
   *
   * Constraints:
   *
   * * Can't be longer than 64 characters.
   *
   * Example: `mymanagedADtest.mymanagedAD.mydomain`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainfqdn)
   */
  public fun domainFqdn(): String? = unwrap(this).getDomainFqdn()

  /**
   * The name of the IAM role to use when making API calls to the Directory Service.
   *
   * This setting doesn't apply to the following DB instances:
   *
   * * Amazon Aurora (The domain is managed by the DB cluster.)
   * * RDS Custom
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainiamrolename)
   */
  public fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

  /**
   * The Active Directory organizational unit for your DB instance to join.
   *
   * Constraints:
   *
   * * Must be in the distinguished name format.
   * * Can't be longer than 64 characters.
   *
   * Example: `OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainou)
   */
  public fun domainOu(): String? = unwrap(this).getDomainOu()

  /**
   * The list of log types that need to be enabled for exporting to CloudWatch Logs.
   *
   * The values in the list depend on the DB engine being used. For more information, see
   * [Publishing Database Logs to Amazon CloudWatch
   * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
   * in the *Amazon Relational Database Service User Guide* .
   *
   * *Amazon Aurora*
   *
   * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
   *
   * *Db2*
   *
   * Valid values: `diag.log` , `notify.log`
   *
   * *MariaDB*
   *
   * Valid values: `audit` , `error` , `general` , `slowquery`
   *
   * *Microsoft SQL Server*
   *
   * Valid values: `agent` , `error`
   *
   * *MySQL*
   *
   * Valid values: `audit` , `error` , `general` , `slowquery`
   *
   * *Oracle*
   *
   * Valid values: `alert` , `audit` , `listener` , `trace` , `oemagent`
   *
   * *PostgreSQL*
   *
   * Valid values: `postgresql` , `upgrade`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-enablecloudwatchlogsexports)
   */
  public fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  /**
   * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
   * accounts to database accounts.
   *
   * By default, mapping is disabled.
   *
   * This property is supported for RDS for MariaDB, RDS for MySQL, and RDS for PostgreSQL. For more
   * information, see [IAM Database Authentication for MariaDB, MySQL, and
   * PostgreSQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html) in
   * the *Amazon RDS User Guide.*
   *
   * *Amazon Aurora*
   *
   * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-enableiamdatabaseauthentication)
   */
  public fun enableIamDatabaseAuthentication(): Any? =
      unwrap(this).getEnableIamDatabaseAuthentication()

  /**
   * Specifies whether to enable Performance Insights for the DB instance.
   *
   * For more information, see [Using Amazon Performance
   * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
   * *Amazon RDS User Guide* .
   *
   * This setting doesn't apply to RDS Custom DB instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-enableperformanceinsights)
   */
  public fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

  /**
   * The connection endpoint for the DB instance.
   *
   *
   * The endpoint might not be shown for instances with the status of `creating` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-endpoint)
   */
  public fun endpoint(): Any? = unwrap(this).getEndpoint()

  /**
   * The name of the database engine that you want to use for this DB instance.
   *
   * Not every database engine is available in every AWS Region.
   *
   *
   * When you are creating a DB instance, the `Engine` property is required.
   *
   *
   * Valid Values:
   *
   * * `aurora-mysql` (for Aurora MySQL DB instances)
   * * `aurora-postgresql` (for Aurora PostgreSQL DB instances)
   * * `custom-oracle-ee` (for RDS Custom for Oracle DB instances)
   * * `custom-oracle-ee-cdb` (for RDS Custom for Oracle DB instances)
   * * `custom-sqlserver-ee` (for RDS Custom for SQL Server DB instances)
   * * `custom-sqlserver-se` (for RDS Custom for SQL Server DB instances)
   * * `custom-sqlserver-web` (for RDS Custom for SQL Server DB instances)
   * * `db2-ae`
   * * `db2-se`
   * * `mariadb`
   * * `mysql`
   * * `oracle-ee`
   * * `oracle-ee-cdb`
   * * `oracle-se2`
   * * `oracle-se2-cdb`
   * * `postgres`
   * * `sqlserver-ee`
   * * `sqlserver-se`
   * * `sqlserver-ex`
   * * `sqlserver-web`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-engine)
   */
  public fun engine(): String? = unwrap(this).getEngine()

  /**
   * The version number of the database engine to use.
   *
   * For a list of valid engine versions, use the `DescribeDBEngineVersions` action.
   *
   * The following are the database engines and links to information about the major and minor
   * versions that are available with Amazon RDS. Not every database engine is available for every AWS
   * Region.
   *
   * *Amazon Aurora*
   *
   * Not applicable. The version number of the database engine to be used by the DB instance is
   * managed by the DB cluster.
   *
   * *Db2*
   *
   * See [Amazon RDS for
   * Db2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Db2.html#Db2.Concepts.VersionMgmt)
   * in the *Amazon RDS User Guide.*
   *
   * *MariaDB*
   *
   * See [MariaDB on Amazon RDS
   * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt)
   * in the *Amazon RDS User Guide.*
   *
   * *Microsoft SQL Server*
   *
   * See [Microsoft SQL Server Versions on Amazon
   * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport)
   * in the *Amazon RDS User Guide.*
   *
   * *MySQL*
   *
   * See [MySQL on Amazon RDS
   * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt)
   * in the *Amazon RDS User Guide.*
   *
   * *Oracle*
   *
   * See [Oracle Database Engine Release
   * Notes](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html)
   * in the *Amazon RDS User Guide.*
   *
   * *PostgreSQL*
   *
   * See [Supported PostgreSQL Database
   * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions)
   * in the *Amazon RDS User Guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The number of I/O operations per second (IOPS) that the database provisions.
   *
   * The value must be equal to or greater than 1000.
   *
   * If you specify this property, you must follow the range of allowed ratios of your requested
   * IOPS rate to the amount of storage that you allocate (IOPS to allocated storage). For example, you
   * can provision an Oracle database instance with 1000 IOPS and 200 GiB of storage (a ratio of 5:1),
   * or specify 2000 IOPS with 200 GiB of storage (a ratio of 10:1). For more information, see [Amazon
   * RDS Provisioned IOPS Storage to Improve
   * Performance](https://docs.aws.amazon.com/AmazonRDS/latest/DeveloperGuide/CHAP_Storage.html#USER_PIOPS)
   * in the *Amazon RDS User Guide* .
   *
   *
   * If you specify `io1` for the `StorageType` property, then you must also specify the `Iops`
   * property.
   *
   *
   * Constraints:
   *
   * * For RDS for Db2, MariaDB, MySQL, Oracle, and PostgreSQL - Must be a multiple between .5 and
   * 50 of the storage amount for the DB instance.
   * * For RDS for SQL Server - Must be a multiple between 1 and 50 of the storage amount for the DB
   * instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-iops)
   */
  public fun iops(): Number? = unwrap(this).getIops()

  /**
   * The ARN of the AWS KMS key that's used to encrypt the DB instance, such as
   * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
   *
   * If you enable the StorageEncrypted property but don't specify this property, AWS CloudFormation
   * uses the default KMS key. If you specify this property, you must set the StorageEncrypted property
   * to true.
   *
   * If you specify the `SourceDBInstanceIdentifier` property, the value is inherited from the
   * source DB instance if the read replica is created in the same region.
   *
   * If you create an encrypted read replica in a different AWS Region, then you must specify a KMS
   * key for the destination AWS Region. KMS encryption keys are specific to the region that they're
   * created in, and you can't use encryption keys from one region in another region.
   *
   * If you specify the `SnapshotIdentifier` property, the `StorageEncrypted` property value is
   * inherited from the snapshot, and if the DB instance is encrypted, the specified `KmsKeyId`
   * property is used.
   *
   * If you specify `DBSecurityGroups` , AWS CloudFormation ignores this property. To specify both a
   * security group and this property, you must use a VPC security group. For more information about
   * Amazon RDS and VPC, see [Using Amazon RDS with Amazon
   * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html) in the *Amazon RDS User
   * Guide* .
   *
   * *Amazon Aurora*
   *
   * Not applicable. The KMS key identifier is managed by the DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * License model information for this DB instance.
   *
   * Valid Values:
   *
   * * Aurora MySQL - `general-public-license`
   * * Aurora PostgreSQL - `postgresql-license`
   * * RDS for Db2 - `bring-your-own-license` . For more information about RDS for Db2 licensing,
   * see [](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html) in the *Amazon
   * RDS User Guide.*
   * * RDS for MariaDB - `general-public-license`
   * * RDS for Microsoft SQL Server - `license-included`
   * * RDS for MySQL - `general-public-license`
   * * RDS for Oracle - `bring-your-own-license` or `license-included`
   * * RDS for PostgreSQL - `postgresql-license`
   *
   *
   * If you've specified `DBSecurityGroups` and then you update the license model, AWS
   * CloudFormation replaces the underlying DB instance. This will incur some interruptions to database
   * availability.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-licensemodel)
   */
  public fun licenseModel(): String? = unwrap(this).getLicenseModel()

  /**
   * Specifies whether to manage the master user password with AWS Secrets Manager.
   *
   * For more information, see [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
   * *Amazon RDS User Guide.*
   *
   * Constraints:
   *
   * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
   * specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-managemasteruserpassword)
   */
  public fun manageMasterUserPassword(): Any? = unwrap(this).getManageMasterUserPassword()

  /**
   * The password for the master user. The password can include any printable ASCII character except
   * "/", """, or "&#64;".
   *
   * *Amazon Aurora*
   *
   * Not applicable. The password for the master user is managed by the DB cluster.
   *
   * *RDS for Db2*
   *
   * Must contain from 8 to 255 characters.
   *
   * *RDS for MariaDB*
   *
   * Constraints: Must contain from 8 to 41 characters.
   *
   * *RDS for Microsoft SQL Server*
   *
   * Constraints: Must contain from 8 to 128 characters.
   *
   * *RDS for MySQL*
   *
   * Constraints: Must contain from 8 to 41 characters.
   *
   * *RDS for Oracle*
   *
   * Constraints: Must contain from 8 to 30 characters.
   *
   * *RDS for PostgreSQL*
   *
   * Constraints: Must contain from 8 to 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masteruserpassword)
   */
  public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  /**
   * The secret managed by RDS in AWS Secrets Manager for the master user password.
   *
   * For more information, see [Password management with AWS Secrets
   * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
   * *Amazon RDS User Guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masterusersecret)
   */
  public fun masterUserSecret(): Any? = unwrap(this).getMasterUserSecret()

  /**
   * The master user name for the DB instance.
   *
   *
   * If you specify the `SourceDBInstanceIdentifier` or `DBSnapshotIdentifier` property, don't
   * specify this property. The value is inherited from the source DB instance or snapshot.
   *
   * When migrating a self-managed Db2 database, we recommend that you use the same master username
   * as your self-managed Db2 instance name.
   *
   *
   * *Amazon Aurora*
   *
   * Not applicable. The name for the master user is managed by the DB cluster.
   *
   * *RDS for Db2*
   *
   * Constraints:
   *
   * * Must be 1 to 16 letters or numbers.
   * * First character must be a letter.
   * * Can't be a reserved word for the chosen database engine.
   *
   * *RDS for MariaDB*
   *
   * Constraints:
   *
   * * Must be 1 to 16 letters or numbers.
   * * Can't be a reserved word for the chosen database engine.
   *
   * *RDS for Microsoft SQL Server*
   *
   * Constraints:
   *
   * * Must be 1 to 128 letters or numbers.
   * * First character must be a letter.
   * * Can't be a reserved word for the chosen database engine.
   *
   * *RDS for MySQL*
   *
   * Constraints:
   *
   * * Must be 1 to 16 letters or numbers.
   * * First character must be a letter.
   * * Can't be a reserved word for the chosen database engine.
   *
   * *RDS for Oracle*
   *
   * Constraints:
   *
   * * Must be 1 to 30 letters or numbers.
   * * First character must be a letter.
   * * Can't be a reserved word for the chosen database engine.
   *
   * *RDS for PostgreSQL*
   *
   * Constraints:
   *
   * * Must be 1 to 63 letters or numbers.
   * * First character must be a letter.
   * * Can't be a reserved word for the chosen database engine.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masterusername)
   */
  public fun masterUsername(): String? = unwrap(this).getMasterUsername()

  /**
   * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of
   * the DB instance.
   *
   * For more information about this setting, including limitations that apply to it, see [Managing
   * capacity automatically with Amazon RDS storage
   * autoscaling](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling)
   * in the *Amazon RDS User Guide* .
   *
   * This setting doesn't apply to the following DB instances:
   *
   * * Amazon Aurora (Storage is managed by the DB cluster.)
   * * RDS Custom
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-maxallocatedstorage)
   */
  public fun maxAllocatedStorage(): Number? = unwrap(this).getMaxAllocatedStorage()

  /**
   * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the
   * DB instance.
   *
   * To disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.
   *
   * If `MonitoringRoleArn` is specified, then you must set `MonitoringInterval` to a value other
   * than 0.
   *
   * This setting doesn't apply to RDS Custom.
   *
   * Valid Values: `0, 1, 5, 10, 15, 30, 60`
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-monitoringinterval)
   */
  public fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

  /**
   * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon
   * CloudWatch Logs.
   *
   * For example, `arn:aws:iam:123456789012:role/emaccess` . For information on creating a
   * monitoring role, see [Setting Up and Enabling Enhanced
   * Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling)
   * in the *Amazon RDS User Guide* .
   *
   * If `MonitoringInterval` is set to a value other than `0` , then you must supply a
   * `MonitoringRoleArn` value.
   *
   * This setting doesn't apply to RDS Custom DB instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-monitoringrolearn)
   */
  public fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

  /**
   * Specifies whether the database instance is a Multi-AZ DB instance deployment.
   *
   * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to true.
   *
   * For more information, see [Multi-AZ deployments for high
   * availability](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html) in the
   * *Amazon RDS User Guide* .
   *
   * *Amazon Aurora*
   *
   * Not applicable. Amazon Aurora storage is replicated across all of the Availability Zones and
   * doesn't require the `MultiAZ` option to be set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-multiaz)
   */
  public fun multiAz(): Any? = unwrap(this).getMultiAz()

  /**
   * The name of the NCHAR character set for the Oracle DB instance.
   *
   * This setting doesn't apply to RDS Custom DB instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-ncharcharactersetname)
   */
  public fun ncharCharacterSetName(): String? = unwrap(this).getNcharCharacterSetName()

  /**
   * The network type of the DB instance.
   *
   * Valid values:
   *
   * * `IPV4`
   * * `DUAL`
   *
   * The network type is determined by the `DBSubnetGroup` specified for the DB instance. A
   * `DBSubnetGroup` can support only the IPv4 protocol or the IPv4 and IPv6 protocols ( `DUAL` ).
   *
   * For more information, see [Working with a DB instance in a
   * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html)
   * in the *Amazon RDS User Guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-networktype)
   */
  public fun networkType(): String? = unwrap(this).getNetworkType()

  /**
   * Indicates that the DB instance should be associated with the specified option group.
   *
   * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed
   * from an option group. Also, that option group can't be removed from a DB instance once it is
   * associated with a DB instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-optiongroupname)
   */
  public fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

  /**
   * The AWS KMS key identifier for encryption of Performance Insights data.
   *
   * The KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
   *
   * If you do not specify a value for `PerformanceInsightsKMSKeyId` , then Amazon RDS uses your
   * default KMS key. There is a default KMS key for your AWS account. Your AWS account has a different
   * default KMS key for each AWS Region.
   *
   * For information about enabling Performance Insights, see
   * [EnablePerformanceInsights](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableperformanceinsights)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-performanceinsightskmskeyid)
   */
  public fun performanceInsightsKmsKeyId(): String? = unwrap(this).getPerformanceInsightsKmsKeyId()

  /**
   * The number of days to retain Performance Insights data.
   *
   * This setting doesn't apply to RDS Custom DB instances.
   *
   * Valid Values:
   *
   * * `7`
   * * *month* * 31, where *month* is a number of months from 1-23. Examples: `93` (3 months * 31),
   * `341` (11 months * 31), `589` (19 months * 31)
   * * `731`
   *
   * Default: `7` days
   *
   * If you specify a retention period that isn't valid, such as `94` , Amazon RDS returns an error.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-performanceinsightsretentionperiod)
   */
  public fun performanceInsightsRetentionPeriod(): Number? =
      unwrap(this).getPerformanceInsightsRetentionPeriod()

  /**
   * The port number on which the database accepts connections.
   *
   * *Amazon Aurora*
   *
   * Not applicable. The port number is managed by the DB cluster.
   *
   * *Db2*
   *
   * Default value: `50000`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-port)
   */
  public fun port(): String? = unwrap(this).getPort()

  /**
   * The daily time range during which automated backups are created if automated backups are
   * enabled, using the `BackupRetentionPeriod` parameter.
   *
   * For more information, see [Backup
   * Window](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
   * in the *Amazon RDS User Guide.*
   *
   * Constraints:
   *
   * * Must be in the format `hh24:mi-hh24:mi` .
   * * Must be in Universal Coordinated Time (UTC).
   * * Must not conflict with the preferred maintenance window.
   * * Must be at least 30 minutes.
   *
   * *Amazon Aurora*
   *
   * Not applicable. The daily time range for creating automated backups is managed by the DB
   * cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-preferredbackupwindow)
   */
  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The weekly time range during which system maintenance can occur, in Universal Coordinated Time
   * (UTC).
   *
   * Format: `ddd:hh24:mi-ddd:hh24:mi`
   *
   * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS
   * Region, occurring on a random day of the week. To see the time blocks available, see [Adjusting
   * the Preferred DB Instance Maintenance
   * Window](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
   * in the *Amazon RDS User Guide.*
   *
   *
   * This property applies when AWS CloudFormation initially creates the DB instance. If you use AWS
   * CloudFormation to update the DB instance, those updates are applied immediately.
   *
   *
   * Constraints: Minimum 30-minute window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The number of CPU cores and the number of threads per core for the DB instance class of the DB
   * instance.
   *
   * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-processorfeatures)
   */
  public fun processorFeatures(): Any? = unwrap(this).getProcessorFeatures()

  /**
   * The order of priority in which an Aurora Replica is promoted to the primary instance after a
   * failure of the existing primary instance.
   *
   * For more information, see [Fault Tolerance for an Aurora DB
   * Cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance)
   * in the *Amazon Aurora User Guide* .
   *
   * This setting doesn't apply to RDS Custom DB instances.
   *
   * Default: `1`
   *
   * Valid Values: `0 - 15`
   *
   * Default: - 1
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-promotiontier)
   */
  public fun promotionTier(): Number? = unwrap(this).getPromotionTier()

  /**
   * Indicates whether the DB instance is an internet-facing instance.
   *
   * If you specify true, AWS CloudFormation creates an instance with a publicly resolvable DNS
   * name, which resolves to a public IP address. If you specify false, AWS CloudFormation creates an
   * internal instance with a DNS name that resolves to a private IP address.
   *
   * The default behavior value depends on your VPC setup and the database subnet group. For more
   * information, see the `PubliclyAccessible` parameter in the
   * [CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html)
   * in the *Amazon RDS API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * The open mode of an Oracle read replica.
   *
   * For more information, see [Working with Oracle Read Replicas for Amazon
   * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html) in the
   * *Amazon RDS User Guide* .
   *
   * This setting is only supported in RDS for Oracle.
   *
   * Default: `open-read-only`
   *
   * Valid Values: `open-read-only` or `mounted`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-replicamode)
   */
  public fun replicaMode(): String? = unwrap(this).getReplicaMode()

  /**
   * The date and time to restore from.
   *
   * Constraints:
   *
   * * Must be a time in Universal Coordinated Time (UTC) format.
   * * Must be before the latest restorable time for the DB instance.
   * * Can't be specified if the `UseLatestRestorableTime` parameter is enabled.
   *
   * Example: `2009-09-07T23:45:00Z`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-restoretime)
   */
  public fun restoreTime(): String? = unwrap(this).getRestoreTime()

  /**
   * The identifier of the Multi-AZ DB cluster that will act as the source for the read replica.
   *
   * Each DB cluster can have up to 15 read replicas.
   *
   * Constraints:
   *
   * * Must be the identifier of an existing Multi-AZ DB cluster.
   * * Can't be specified if the `SourceDBInstanceIdentifier` parameter is also specified.
   * * The specified DB cluster must have automatic backups enabled, that is, its backup retention
   * period must be greater than 0.
   * * The source DB cluster must be in the same AWS Region as the read replica. Cross-Region
   * replication isn't supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbclusteridentifier)
   */
  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  /**
   * The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for
   * example, `arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE` .
   *
   * This setting doesn't apply to RDS Custom.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbinstanceautomatedbackupsarn)
   */
  public fun sourceDbInstanceAutomatedBackupsArn(): String? =
      unwrap(this).getSourceDbInstanceAutomatedBackupsArn()

  /**
   * If you want to create a read replica DB instance, specify the ID of the source DB instance.
   *
   * Each DB instance can have a limited number of read replicas. For more information, see [Working
   * with Read
   * Replicas](https://docs.aws.amazon.com/AmazonRDS/latest/DeveloperGuide/USER_ReadRepl.html) in the
   * *Amazon RDS User Guide* .
   *
   * For information about constraints that apply to DB instance identifiers, see [Naming
   * constraints in Amazon
   * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
   * in the *Amazon RDS User Guide* .
   *
   * The `SourceDBInstanceIdentifier` property determines whether a DB instance is a read replica.
   * If you remove the `SourceDBInstanceIdentifier` property from your template and then update your
   * stack, AWS CloudFormation promotes the Read Replica to a standalone DB instance.
   *
   *
   * * If you specify a source DB instance that uses VPC security groups, we recommend that you
   * specify the `VPCSecurityGroups` property. If you don't specify the property, the read replica
   * inherits the value of the `VPCSecurityGroups` property from the source DB when you create the
   * replica. However, if you update the stack, AWS CloudFormation reverts the replica's
   * `VPCSecurityGroups` property to the default value because it's not defined in the stack's
   * template. This change might cause unexpected issues.
   * * Read replicas don't support deletion policies. AWS CloudFormation ignores any deletion policy
   * that's associated with a read replica.
   * * If you specify `SourceDBInstanceIdentifier` , don't specify the `DBSnapshotIdentifier`
   * property. You can't create a read replica from a snapshot.
   * * Don't set the `BackupRetentionPeriod` , `DBName` , `MasterUsername` , `MasterUserPassword` ,
   * and `PreferredBackupWindow` properties. The database attributes are inherited from the source DB
   * instance, and backups are disabled for read replicas.
   * * If the source DB instance is in a different region than the read replica, specify the source
   * region in `SourceRegion` , and specify an ARN for a valid DB instance in
   * `SourceDBInstanceIdentifier` . For more information, see [Constructing a Amazon RDS Amazon
   * Resource Name
   * (ARN)](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN)
   * in the *Amazon RDS User Guide* .
   * * For DB instances in Amazon Aurora clusters, don't specify this property. Amazon RDS
   * automatically assigns writer and reader DB instances.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier)
   */
  public fun sourceDbInstanceIdentifier(): String? = unwrap(this).getSourceDbInstanceIdentifier()

  /**
   * The resource ID of the source DB instance from which to restore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbiresourceid)
   */
  public fun sourceDbiResourceId(): String? = unwrap(this).getSourceDbiResourceId()

  /**
   * The ID of the region that contains the source DB instance for the read replica.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourceregion)
   */
  public fun sourceRegion(): String? = unwrap(this).getSourceRegion()

  /**
   * A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.
   *
   * If you specify the `KmsKeyId` property, then you must enable encryption.
   *
   * If you specify the `SourceDBInstanceIdentifier` property, don't specify this property. The
   * value is inherited from the source DB instance, and if the DB instance is encrypted, the specified
   * `KmsKeyId` property is used.
   *
   * If you specify the `DBSnapshotIdentifier` and the specified snapshot is encrypted, don't
   * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
   * property is used.
   *
   * If you specify the `DBSnapshotIdentifier` and the specified snapshot isn't encrypted, you can
   * use this property to specify that the restored DB instance is encrypted. Specify the `KmsKeyId`
   * property for the KMS key to use for encryption. If you don't want the restored DB instance to be
   * encrypted, then don't set this property or set it to `false` .
   *
   * *Amazon Aurora*
   *
   * Not applicable. The encryption for DB instances is managed by the DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-storageencrypted)
   */
  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  /**
   * Specifies the storage throughput value for the DB instance. This setting applies only to the
   * `gp3` storage type.
   *
   * This setting doesn't apply to RDS Custom or Amazon Aurora.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-storagethroughput)
   */
  public fun storageThroughput(): Number? = unwrap(this).getStorageThroughput()

  /**
   * The storage type to associate with the DB instance.
   *
   * If you specify `io1` , `io2` , or `gp3` , you must also include a value for the `Iops`
   * parameter.
   *
   * This setting doesn't apply to Amazon Aurora DB instances. Storage is managed by the DB cluster.
   *
   * Valid Values: `gp2 | gp3 | io1 | io2 | standard`
   *
   * Default: `io1` , if the `Iops` parameter is specified. Otherwise, `gp2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-storagetype)
   */
  public fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * An optional array of key-value pairs to apply to this DB instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tdecredentialarn)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun tdeCredentialArn(): String? = unwrap(this).getTdeCredentialArn()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tdecredentialpassword)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun tdeCredentialPassword(): String? = unwrap(this).getTdeCredentialPassword()

  /**
   * The time zone of the DB instance.
   *
   * The time zone parameter is currently supported only by [Microsoft SQL
   * Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-timezone)
   */
  public fun timezone(): String? = unwrap(this).getTimezone()

  /**
   * Specifies whether the DB instance class of the DB instance uses its default processor features.
   *
   * This setting doesn't apply to RDS Custom DB instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-usedefaultprocessorfeatures)
   */
  public fun useDefaultProcessorFeatures(): Any? = unwrap(this).getUseDefaultProcessorFeatures()

  /**
   * Specifies whether the DB instance is restored from the latest backup time.
   *
   * By default, the DB instance isn't restored from the latest backup time.
   *
   * Constraints:
   *
   * * Can't be specified if the `RestoreTime` parameter is provided.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-uselatestrestorabletime)
   */
  public fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  /**
   * A list of the VPC security group IDs to assign to the DB instance.
   *
   * The list can include both the physical IDs of existing VPC security groups and references to
   * [AWS::EC2::SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
   * resources created in the template.
   *
   * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
   *
   * If you set `VPCSecurityGroups` , you must not set
   * [`DBSecurityGroups`](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
   * , and vice versa.
   *
   *
   * You can migrate a DB instance in your stack from an RDS DB security group to a VPC security
   * group, but keep the following in mind:
   *
   * * You can't revert to using an RDS security group after you establish a VPC security group
   * membership.
   * * When you migrate your DB instance to VPC security groups, if your stack update rolls back
   * because the DB instance update fails or because an update fails in another AWS CloudFormation
   * resource, the rollback fails because it can't revert to an RDS security group.
   * * To use the properties that are available when you use a VPC security group, you must recreate
   * the DB instance. If you don't, AWS CloudFormation submits only the property values that are listed
   * in the
   * [`DBSecurityGroups`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
   * property.
   *
   *
   * To avoid this situation, migrate your DB instance to using VPC security groups only when that
   * is the only change in your stack template.
   *
   * *Amazon Aurora*
   *
   * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. If
   * specified, the setting must match the DB cluster setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-vpcsecuritygroups)
   */
  public fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?: emptyList()

  /**
   * A builder for [CfnDBInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocatedStorage The amount of storage in gibibytes (GiB) to be initially allocated
     * for the database instance.
     *
     * If any value is set in the `Iops` parameter, `AllocatedStorage` must be at least 100 GiB,
     * which corresponds to the minimum Iops value of 1,000. If you increase the `Iops` value (in 1,000
     * IOPS increments), then you must also increase the `AllocatedStorage` value (in 100-GiB
     * increments).
     *
     *
     * *Amazon Aurora*
     *
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your
     * database increases, though you are only charged for the space that you use in an Aurora cluster
     * volume.
     *
     * *Db2*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp3): Must be an integer from 20 to 64000.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 64000.
     *
     * *MySQL*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 5 to 3072.
     *
     * *MariaDB*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 5 to 3072.
     *
     * *PostgreSQL*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 5 to 3072.
     *
     * *Oracle*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 10 to 3072.
     *
     * *SQL Server*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2):
     * * Enterprise and Standard editions: Must be an integer from 20 to 16384.
     * * Web and Express editions: Must be an integer from 20 to 16384.
     * * Provisioned IOPS storage (io1):
     * * Enterprise and Standard editions: Must be an integer from 20 to 16384.
     * * Web and Express editions: Must be an integer from 20 to 16384.
     * * Magnetic storage (standard):
     * * Enterprise and Standard editions: Must be an integer from 20 to 1024.
     * * Web and Express editions: Must be an integer from 20 to 1024.
     */
    public fun allocatedStorage(allocatedStorage: String)

    /**
     * @param allowMajorVersionUpgrade A value that indicates whether major version upgrades are
     * allowed.
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible.
     *
     * Constraints: Major version upgrades must be allowed when specifying a value for the
     * `EngineVersion` parameter that is a different major version than the DB instance's current
     * version.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    /**
     * @param allowMajorVersionUpgrade A value that indicates whether major version upgrades are
     * allowed.
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible.
     *
     * Constraints: Major version upgrades must be allowed when specifying a value for the
     * `EngineVersion` parameter that is a different major version than the DB instance's current
     * version.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable)

    /**
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance.
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     */
    public fun associatedRoles(associatedRoles: IResolvable)

    /**
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance.
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     */
    public fun associatedRoles(associatedRoles: List<Any>)

    /**
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance.
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     */
    public fun associatedRoles(vararg associatedRoles: Any)

    /**
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the DB instance during the maintenance window.
     * By default, minor engine upgrades are applied automatically.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the DB instance during the maintenance window.
     * By default, minor engine upgrades are applied automatically.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * @param automaticBackupReplicationRegion The destination region for the backup replication of
     * the DB instance.
     * For more info, see [Replicating automated backups to another AWS
     * Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html) in
     * the *Amazon RDS User Guide* .
     */
    public fun automaticBackupReplicationRegion(automaticBackupReplicationRegion: String)

    /**
     * @param availabilityZone The Availability Zone (AZ) where the database will be created.
     * For information on AWS Regions and Availability Zones, see [Regions and Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * .
     *
     * For Amazon Aurora, each Aurora DB cluster hosts copies of its storage in three separate
     * Availability Zones. Specify one of these Availability Zones. Aurora automatically chooses an
     * appropriate Availability Zone if you don't specify one.
     *
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
     *
     * Constraints:
     *
     * * The `AvailabilityZone` parameter can't be specified if the DB instance is a Multi-AZ
     * deployment.
     * * The specified Availability Zone must be in the same AWS Region as the current endpoint.
     *
     * Example: `us-east-1d`
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param backupRetentionPeriod The number of days for which automated backups are retained.
     * Setting this parameter to a positive number enables backups. Setting this parameter to 0
     * disables automated backups.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The retention period for automated backups is managed by the DB cluster.
     *
     * Default: 1
     *
     * Constraints:
     *
     * * Must be a value from 0 to 35
     * * Can't be set to 0 if the DB instance is a source to read replicas
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    /**
     * @param caCertificateIdentifier The identifier of the CA certificate for this DB instance.
     * For more information, see [Using SSL/TLS to encrypt a connection to a DB
     * instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html) in the
     * *Amazon RDS User Guide* and [Using SSL/TLS to encrypt a connection to a DB
     * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html) in
     * the *Amazon Aurora User Guide* .
     */
    public fun caCertificateIdentifier(caCertificateIdentifier: String)

    /**
     * @param certificateDetails The details of the DB instance's server certificate.
     */
    public fun certificateDetails(certificateDetails: IResolvable)

    /**
     * @param certificateDetails The details of the DB instance's server certificate.
     */
    public fun certificateDetails(certificateDetails: CfnDBInstance.CertificateDetailsProperty)

    /**
     * @param certificateDetails The details of the DB instance's server certificate.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a28138b43a7cdc1c509818c0a0be65dc8ab95a94f0468fe9a64f453036e07923")
    public
        fun certificateDetails(certificateDetails: CfnDBInstance.CertificateDetailsProperty.Builder.() -> Unit)

    /**
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate.
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
     * certificate is not updated until the DB instance is restarted.
     *
     *
     * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
     *
     *
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions
     * for your DB engine to rotate your SSL/TLS certificate:
     *
     * * For more information about rotating your SSL/TLS certificate for RDS DB engines, see
     * [Rotating Your SSL/TLS
     * Certificate.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * in the *Amazon RDS User Guide.*
     * * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see
     * [Rotating Your SSL/TLS
     * Certificate](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * in the *Amazon Aurora User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     */
    public fun certificateRotationRestart(certificateRotationRestart: Boolean)

    /**
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate.
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
     * certificate is not updated until the DB instance is restarted.
     *
     *
     * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
     *
     *
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions
     * for your DB engine to rotate your SSL/TLS certificate:
     *
     * * For more information about rotating your SSL/TLS certificate for RDS DB engines, see
     * [Rotating Your SSL/TLS
     * Certificate.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * in the *Amazon RDS User Guide.*
     * * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see
     * [Rotating Your SSL/TLS
     * Certificate](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * in the *Amazon Aurora User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     */
    public fun certificateRotationRestart(certificateRotationRestart: IResolvable)

    /**
     * @param characterSetName For supported engines, indicates that the DB instance should be
     * associated with the specified character set.
     * *Amazon Aurora*
     *
     * Not applicable. The character set is managed by the DB cluster. For more information, see
     * [AWS::RDS::DBCluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
     * .
     */
    public fun characterSetName(characterSetName: String)

    /**
     * @param copyTagsToSnapshot Specifies whether to copy tags from the DB instance to snapshots of
     * the DB instance.
     * By default, tags are not copied.
     *
     * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is
     * managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * @param copyTagsToSnapshot Specifies whether to copy tags from the DB instance to snapshots of
     * the DB instance.
     * By default, tags are not copied.
     *
     * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is
     * managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

    /**
     * @param customIamInstanceProfile The instance profile associated with the underlying Amazon
     * EC2 instance of an RDS Custom DB instance.
     * This setting is required for RDS Custom.
     *
     * Constraints:
     *
     * * The profile must exist in your account.
     * * The profile must have an IAM role that Amazon EC2 has permissions to assume.
     * * The instance profile name and the associated IAM role name must start with the prefix
     * `AWSRDSCustom` .
     *
     * For the list of permissions required for the IAM role, see [Configure IAM and your
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc)
     * in the *Amazon RDS User Guide* .
     */
    public fun customIamInstanceProfile(customIamInstanceProfile: String)

    /**
     * @param dbClusterIdentifier The identifier of the DB cluster that the instance will belong to.
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * @param dbClusterSnapshotIdentifier The identifier for the Multi-AZ DB cluster snapshot to
     * restore from.
     * For more information on Multi-AZ DB clusters, see [Multi-AZ DB cluster
     * deployments](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html)
     * in the *Amazon RDS User Guide* .
     *
     * Constraints:
     *
     * * Must match the identifier of an existing Multi-AZ DB cluster snapshot.
     * * Can't be specified when `DBSnapshotIdentifier` is specified.
     * * Must be specified when `DBSnapshotIdentifier` isn't specified.
     * * If you are restoring from a shared manual Multi-AZ DB cluster snapshot, the
     * `DBClusterSnapshotIdentifier` must be the ARN of the shared snapshot.
     * * Can't be the identifier of an Aurora DB cluster snapshot.
     */
    public fun dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier: String)

    /**
     * @param dbInstanceClass The compute and memory capacity of the DB instance, for example
     * `db.m5.large` . Not all DB instance classes are available in all AWS Regions , or for all
     * database engines. For the full list of DB instance classes, and availability for your engine,
     * see [DB instance
     * classes](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html)
     * in the *Amazon RDS User Guide* or [Aurora DB instance
     * classes](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html)
     * in the *Amazon Aurora User Guide* .
     */
    public fun dbInstanceClass(dbInstanceClass: String)

    /**
     * @param dbInstanceIdentifier A name for the DB instance.
     * If you specify a name, AWS CloudFormation converts it to lowercase. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the DB instance.
     * For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * For information about constraints that apply to DB instance identifiers, see [Naming
     * constraints in Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * in the *Amazon RDS User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

    /**
     * @param dbName The meaning of this parameter differs according to the database engine you use.
     *
     * If you specify the
     * `[DBSnapshotIdentifier](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier)`
     * property, this property only applies to RDS for Oracle.
     *
     *
     * *Amazon Aurora*
     *
     * Not applicable. The database name is managed by the DB cluster.
     *
     * *Db2*
     *
     * The name of the database to create when the DB instance is created. If this parameter isn't
     * specified, no database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must contain 1 to 64 letters or numbers.
     * * Must begin with a letter. Subsequent characters can be letters, underscores, or digits
     * (0-9).
     * * Can't be a word reserved by the specified database engine.
     *
     * *MySQL*
     *
     * The name of the database to create when the DB instance is created. If this parameter is not
     * specified, no database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must contain 1 to 64 letters or numbers.
     * * Can't be a word reserved by the specified database engine
     *
     * *MariaDB*
     *
     * The name of the database to create when the DB instance is created. If this parameter is not
     * specified, no database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must contain 1 to 64 letters or numbers.
     * * Can't be a word reserved by the specified database engine
     *
     * *PostgreSQL*
     *
     * The name of the database to create when the DB instance is created. If this parameter is not
     * specified, the default `postgres` database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must begin with a letter. Subsequent characters can be letters, underscores, or digits
     * (0-9).
     * * Must contain 1 to 63 characters.
     * * Can't be a word reserved by the specified database engine
     *
     * *Oracle*
     *
     * The Oracle System ID (SID) of the created DB instance. If you specify `null` , the default
     * value `ORCL` is used. You can't specify the string NULL, or any other reserved word, for
     * `DBName` .
     *
     * Default: `ORCL`
     *
     * Constraints:
     *
     * * Can't be longer than 8 characters
     *
     * *SQL Server*
     *
     * Not applicable. Must be null.
     */
    public fun dbName(dbName: String)

    /**
     * @param dbParameterGroupName The name of an existing DB parameter group or a reference to an
     * [AWS::RDS::DBParameterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html)
     * resource created in the template.
     * To list all of the available DB parameter group names, use the following command:
     *
     * `aws rds describe-db-parameter-groups --query
     * "DBParameterGroups[].DBParameterGroupName" --output text`
     *
     *
     * If any of the data members of the referenced parameter group are changed during an update,
     * the DB instance might need to be restarted, which causes some interruption. If the parameter
     * group contains static parameters, whether they were changed or not, an update triggers a reboot.
     *
     *
     * If you don't specify a value for `DBParameterGroupName` property, the default DB parameter
     * group for the specified engine and engine version is used.
     */
    public fun dbParameterGroupName(dbParameterGroupName: String)

    /**
     * @param dbSecurityGroups A list of the DB security groups to assign to the DB instance.
     * The list can include both the name of existing DB security groups or references to
     * AWS::RDS::DBSecurityGroup resources created in the template.
     *
     * If you set DBSecurityGroups, you must not set VPCSecurityGroups, and vice versa. Also, note
     * that the DBSecurityGroups property exists only for backwards compatibility with older regions
     * and is no longer recommended for providing security information to an RDS DB instance. Instead,
     * use VPCSecurityGroups.
     *
     *
     * If you specify this property, AWS CloudFormation sends only the following properties (if
     * specified) to Amazon RDS during create operations:
     *
     * * `AllocatedStorage`
     * * `AutoMinorVersionUpgrade`
     * * `AvailabilityZone`
     * * `BackupRetentionPeriod`
     * * `CharacterSetName`
     * * `DBInstanceClass`
     * * `DBName`
     * * `DBParameterGroupName`
     * * `DBSecurityGroups`
     * * `DBSubnetGroupName`
     * * `Engine`
     * * `EngineVersion`
     * * `Iops`
     * * `LicenseModel`
     * * `MasterUsername`
     * * `MasterUserPassword`
     * * `MultiAZ`
     * * `OptionGroupName`
     * * `PreferredBackupWindow`
     * * `PreferredMaintenanceWindow`
     *
     * All other properties are ignored. Specify a virtual private cloud (VPC) security group if you
     * want to submit other properties, such as `StorageType` , `StorageEncrypted` , or `KmsKeyId` . If
     * you're already using the `DBSecurityGroups` property, you can't use these other properties by
     * updating your DB instance to use a VPC security group. You must recreate the DB instance.
     */
    public fun dbSecurityGroups(dbSecurityGroups: List<String>)

    /**
     * @param dbSecurityGroups A list of the DB security groups to assign to the DB instance.
     * The list can include both the name of existing DB security groups or references to
     * AWS::RDS::DBSecurityGroup resources created in the template.
     *
     * If you set DBSecurityGroups, you must not set VPCSecurityGroups, and vice versa. Also, note
     * that the DBSecurityGroups property exists only for backwards compatibility with older regions
     * and is no longer recommended for providing security information to an RDS DB instance. Instead,
     * use VPCSecurityGroups.
     *
     *
     * If you specify this property, AWS CloudFormation sends only the following properties (if
     * specified) to Amazon RDS during create operations:
     *
     * * `AllocatedStorage`
     * * `AutoMinorVersionUpgrade`
     * * `AvailabilityZone`
     * * `BackupRetentionPeriod`
     * * `CharacterSetName`
     * * `DBInstanceClass`
     * * `DBName`
     * * `DBParameterGroupName`
     * * `DBSecurityGroups`
     * * `DBSubnetGroupName`
     * * `Engine`
     * * `EngineVersion`
     * * `Iops`
     * * `LicenseModel`
     * * `MasterUsername`
     * * `MasterUserPassword`
     * * `MultiAZ`
     * * `OptionGroupName`
     * * `PreferredBackupWindow`
     * * `PreferredMaintenanceWindow`
     *
     * All other properties are ignored. Specify a virtual private cloud (VPC) security group if you
     * want to submit other properties, such as `StorageType` , `StorageEncrypted` , or `KmsKeyId` . If
     * you're already using the `DBSecurityGroups` property, you can't use these other properties by
     * updating your DB instance to use a VPC security group. You must recreate the DB instance.
     */
    public fun dbSecurityGroups(vararg dbSecurityGroups: String)

    /**
     * @param dbSnapshotIdentifier The name or Amazon Resource Name (ARN) of the DB snapshot that's
     * used to restore the DB instance.
     * If you're restoring from a shared manual DB snapshot, you must specify the ARN of the
     * snapshot.
     *
     * By specifying this property, you can create a DB instance from the specified DB snapshot. If
     * the `DBSnapshotIdentifier` property is an empty string or the `AWS::RDS::DBInstance` declaration
     * has no `DBSnapshotIdentifier` property, AWS CloudFormation creates a new database. If the
     * property contains a value (other than an empty string), AWS CloudFormation creates a database
     * from the specified snapshot. If a snapshot with the specified name doesn't exist, AWS
     * CloudFormation can't create the database and it rolls back the stack.
     *
     * Some DB instance properties aren't valid when you restore from a snapshot, such as the
     * `MasterUsername` and `MasterUserPassword` properties. For information about the properties that
     * you can specify, see the `RestoreDBInstanceFromDBSnapshot` action in the *Amazon RDS API
     * Reference* .
     *
     * After you restore a DB instance with a `DBSnapshotIdentifier` property, you must specify the
     * same `DBSnapshotIdentifier` property for any future updates to the DB instance. When you specify
     * this property for an update, the DB instance is not restored from the DB snapshot again, and the
     * data in the database is not changed. However, if you don't specify the `DBSnapshotIdentifier`
     * property, an empty DB instance is created, and the original DB instance is deleted. If you
     * specify a property that is different from the previous snapshot restore property, a new DB
     * instance is restored from the specified `DBSnapshotIdentifier` property, and the original DB
     * instance is deleted.
     *
     * If you specify the `DBSnapshotIdentifier` property to restore a DB instance (as opposed to
     * specifying it for DB instance updates), then don't specify the following properties:
     *
     * * `CharacterSetName`
     * * `DBClusterIdentifier`
     * * `DBName`
     * * `DeleteAutomatedBackups`
     * * `EnablePerformanceInsights`
     * * `KmsKeyId`
     * * `MasterUsername`
     * * `MasterUserPassword`
     * * `PerformanceInsightsKMSKeyId`
     * * `PerformanceInsightsRetentionPeriod`
     * * `PromotionTier`
     * * `SourceDBInstanceIdentifier`
     * * `SourceRegion`
     * * `StorageEncrypted` (for an encrypted snapshot)
     * * `Timezone`
     *
     * *Amazon Aurora*
     *
     * Not applicable. Snapshot restore is managed by the DB cluster.
     */
    public fun dbSnapshotIdentifier(dbSnapshotIdentifier: String)

    /**
     * @param dbSubnetGroupName A DB subnet group to associate with the DB instance.
     * If you update this value, the new subnet group must be a subnet group in a new VPC.
     *
     * If there's no DB subnet group, then the DB instance isn't a VPC DB instance.
     *
     * For more information about using Amazon RDS in a VPC, see [Using Amazon RDS with Amazon
     * Virtual Private Cloud
     * (VPC)](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html) in the *Amazon RDS
     * User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The DB subnet group is managed by the DB cluster. If specified, the setting
     * must match the DB cluster setting.
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * @param dedicatedLogVolume Indicates whether the DB instance has a dedicated log volume (DLV)
     * enabled.
     */
    public fun dedicatedLogVolume(dedicatedLogVolume: Boolean)

    /**
     * @param dedicatedLogVolume Indicates whether the DB instance has a dedicated log volume (DLV)
     * enabled.
     */
    public fun dedicatedLogVolume(dedicatedLogVolume: IResolvable)

    /**
     * @param deleteAutomatedBackups A value that indicates whether to remove automated backups
     * immediately after the DB instance is deleted.
     * This parameter isn't case-sensitive. The default is to remove automated backups immediately
     * after the DB instance is deleted.
     *
     * *Amazon Aurora*
     *
     * Not applicable. When you delete a DB cluster, all automated backups for that DB cluster are
     * deleted and can't be recovered. Manual DB cluster snapshots of the DB cluster are not deleted.
     */
    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean)

    /**
     * @param deleteAutomatedBackups A value that indicates whether to remove automated backups
     * immediately after the DB instance is deleted.
     * This parameter isn't case-sensitive. The default is to remove automated backups immediately
     * after the DB instance is deleted.
     *
     * *Amazon Aurora*
     *
     * Not applicable. When you delete a DB cluster, all automated backups for that DB cluster are
     * deleted and can't be recovered. Manual DB cluster snapshots of the DB cluster are not deleted.
     */
    public fun deleteAutomatedBackups(deleteAutomatedBackups: IResolvable)

    /**
     * @param deletionProtection A value that indicates whether the DB instance has deletion
     * protection enabled.
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled. For more information, see [Deleting a DB
     * Instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html) .
     *
     * *Amazon Aurora*
     *
     * Not applicable. You can enable or disable deletion protection for the DB cluster. For more
     * information, see `CreateDBCluster` . DB instances in a DB cluster can be deleted even when
     * deletion protection is enabled for the DB cluster.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param deletionProtection A value that indicates whether the DB instance has deletion
     * protection enabled.
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled. For more information, see [Deleting a DB
     * Instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html) .
     *
     * *Amazon Aurora*
     *
     * Not applicable. You can enable or disable deletion protection for the DB cluster. For more
     * information, see `CreateDBCluster` . DB instances in a DB cluster can be deleted even when
     * deletion protection is enabled for the DB cluster.
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * @param domain The Active Directory directory ID to create the DB instance in.
     * Currently, only Db2, MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be
     * created in an Active Directory Domain.
     *
     * For more information, see [Kerberos
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html)
     * in the *Amazon RDS User Guide* .
     */
    public fun domain(domain: String)

    /**
     * @param domainAuthSecretArn The ARN for the Secrets Manager secret with the credentials for
     * the user joining the domain.
     * Example:
     * `arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456`
     */
    public fun domainAuthSecretArn(domainAuthSecretArn: String)

    /**
     * @param domainDnsIps The IPv4 DNS IP addresses of your primary and secondary Active Directory
     * domain controllers.
     * Constraints:
     *
     * * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP
     * address of the primary domain controller for both entries in the list.
     *
     * Example: `123.124.125.126,234.235.236.237`
     */
    public fun domainDnsIps(domainDnsIps: List<String>)

    /**
     * @param domainDnsIps The IPv4 DNS IP addresses of your primary and secondary Active Directory
     * domain controllers.
     * Constraints:
     *
     * * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP
     * address of the primary domain controller for both entries in the list.
     *
     * Example: `123.124.125.126,234.235.236.237`
     */
    public fun domainDnsIps(vararg domainDnsIps: String)

    /**
     * @param domainFqdn The fully qualified domain name (FQDN) of an Active Directory domain.
     * Constraints:
     *
     * * Can't be longer than 64 characters.
     *
     * Example: `mymanagedADtest.mymanagedAD.mydomain`
     */
    public fun domainFqdn(domainFqdn: String)

    /**
     * @param domainIamRoleName The name of the IAM role to use when making API calls to the
     * Directory Service.
     * This setting doesn't apply to the following DB instances:
     *
     * * Amazon Aurora (The domain is managed by the DB cluster.)
     * * RDS Custom
     */
    public fun domainIamRoleName(domainIamRoleName: String)

    /**
     * @param domainOu The Active Directory organizational unit for your DB instance to join.
     * Constraints:
     *
     * * Must be in the distinguished name format.
     * * Can't be longer than 64 characters.
     *
     * Example: `OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain`
     */
    public fun domainOu(domainOu: String)

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs.
     * The values in the list depend on the DB engine being used. For more information, see
     * [Publishing Database Logs to Amazon CloudWatch
     * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
     * in the *Amazon Relational Database Service User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     *
     * *Db2*
     *
     * Valid values: `diag.log` , `notify.log`
     *
     * *MariaDB*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Microsoft SQL Server*
     *
     * Valid values: `agent` , `error`
     *
     * *MySQL*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Oracle*
     *
     * Valid values: `alert` , `audit` , `listener` , `trace` , `oemagent`
     *
     * *PostgreSQL*
     *
     * Valid values: `postgresql` , `upgrade`
     */
    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs.
     * The values in the list depend on the DB engine being used. For more information, see
     * [Publishing Database Logs to Amazon CloudWatch
     * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
     * in the *Amazon Relational Database Service User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     *
     * *Db2*
     *
     * Valid values: `diag.log` , `notify.log`
     *
     * *MariaDB*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Microsoft SQL Server*
     *
     * Valid values: `agent` , `error`
     *
     * *MySQL*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Oracle*
     *
     * Valid values: `alert` , `audit` , `listener` , `trace` , `oemagent`
     *
     * *PostgreSQL*
     *
     * Valid values: `postgresql` , `upgrade`
     */
    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    /**
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts.
     * By default, mapping is disabled.
     *
     * This property is supported for RDS for MariaDB, RDS for MySQL, and RDS for PostgreSQL. For
     * more information, see [IAM Database Authentication for MariaDB, MySQL, and
     * PostgreSQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon RDS User Guide.*
     *
     * *Amazon Aurora*
     *
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster.
     */
    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean)

    /**
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts.
     * By default, mapping is disabled.
     *
     * This property is supported for RDS for MariaDB, RDS for MySQL, and RDS for PostgreSQL. For
     * more information, see [IAM Database Authentication for MariaDB, MySQL, and
     * PostgreSQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon RDS User Guide.*
     *
     * *Amazon Aurora*
     *
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster.
     */
    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable)

    /**
     * @param enablePerformanceInsights Specifies whether to enable Performance Insights for the DB
     * instance.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * @param enablePerformanceInsights Specifies whether to enable Performance Insights for the DB
     * instance.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: IResolvable)

    /**
     * @param endpoint The connection endpoint for the DB instance.
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     */
    public fun endpoint(endpoint: IResolvable)

    /**
     * @param endpoint The connection endpoint for the DB instance.
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     */
    public fun endpoint(endpoint: CfnDBInstance.EndpointProperty)

    /**
     * @param endpoint The connection endpoint for the DB instance.
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7947e5819bba5c75904e4610cb293a5a01f8267d49b226670e67ad3e8b09537d")
    public fun endpoint(endpoint: CfnDBInstance.EndpointProperty.Builder.() -> Unit)

    /**
     * @param engine The name of the database engine that you want to use for this DB instance.
     * Not every database engine is available in every AWS Region.
     *
     *
     * When you are creating a DB instance, the `Engine` property is required.
     *
     *
     * Valid Values:
     *
     * * `aurora-mysql` (for Aurora MySQL DB instances)
     * * `aurora-postgresql` (for Aurora PostgreSQL DB instances)
     * * `custom-oracle-ee` (for RDS Custom for Oracle DB instances)
     * * `custom-oracle-ee-cdb` (for RDS Custom for Oracle DB instances)
     * * `custom-sqlserver-ee` (for RDS Custom for SQL Server DB instances)
     * * `custom-sqlserver-se` (for RDS Custom for SQL Server DB instances)
     * * `custom-sqlserver-web` (for RDS Custom for SQL Server DB instances)
     * * `db2-ae`
     * * `db2-se`
     * * `mariadb`
     * * `mysql`
     * * `oracle-ee`
     * * `oracle-ee-cdb`
     * * `oracle-se2`
     * * `oracle-se2-cdb`
     * * `postgres`
     * * `sqlserver-ee`
     * * `sqlserver-se`
     * * `sqlserver-ex`
     * * `sqlserver-web`
     */
    public fun engine(engine: String)

    /**
     * @param engineVersion The version number of the database engine to use.
     * For a list of valid engine versions, use the `DescribeDBEngineVersions` action.
     *
     * The following are the database engines and links to information about the major and minor
     * versions that are available with Amazon RDS. Not every database engine is available for every
     * AWS Region.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The version number of the database engine to be used by the DB instance is
     * managed by the DB cluster.
     *
     * *Db2*
     *
     * See [Amazon RDS for
     * Db2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Db2.html#Db2.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide.*
     *
     * *MariaDB*
     *
     * See [MariaDB on Amazon RDS
     * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide.*
     *
     * *Microsoft SQL Server*
     *
     * See [Microsoft SQL Server Versions on Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport)
     * in the *Amazon RDS User Guide.*
     *
     * *MySQL*
     *
     * See [MySQL on Amazon RDS
     * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide.*
     *
     * *Oracle*
     *
     * See [Oracle Database Engine Release
     * Notes](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html)
     * in the *Amazon RDS User Guide.*
     *
     * *PostgreSQL*
     *
     * See [Supported PostgreSQL Database
     * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions)
     * in the *Amazon RDS User Guide.*
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param iops The number of I/O operations per second (IOPS) that the database provisions.
     * The value must be equal to or greater than 1000.
     *
     * If you specify this property, you must follow the range of allowed ratios of your requested
     * IOPS rate to the amount of storage that you allocate (IOPS to allocated storage). For example,
     * you can provision an Oracle database instance with 1000 IOPS and 200 GiB of storage (a ratio of
     * 5:1), or specify 2000 IOPS with 200 GiB of storage (a ratio of 10:1). For more information, see
     * [Amazon RDS Provisioned IOPS Storage to Improve
     * Performance](https://docs.aws.amazon.com/AmazonRDS/latest/DeveloperGuide/CHAP_Storage.html#USER_PIOPS)
     * in the *Amazon RDS User Guide* .
     *
     *
     * If you specify `io1` for the `StorageType` property, then you must also specify the `Iops`
     * property.
     *
     *
     * Constraints:
     *
     * * For RDS for Db2, MariaDB, MySQL, Oracle, and PostgreSQL - Must be a multiple between .5 and
     * 50 of the storage amount for the DB instance.
     * * For RDS for SQL Server - Must be a multiple between 1 and 50 of the storage amount for the
     * DB instance.
     */
    public fun iops(iops: Number)

    /**
     * @param kmsKeyId The ARN of the AWS KMS key that's used to encrypt the DB instance, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
     * If you enable the StorageEncrypted property but don't specify this property, AWS
     * CloudFormation uses the default KMS key. If you specify this property, you must set the
     * StorageEncrypted property to true.
     *
     * If you specify the `SourceDBInstanceIdentifier` property, the value is inherited from the
     * source DB instance if the read replica is created in the same region.
     *
     * If you create an encrypted read replica in a different AWS Region, then you must specify a
     * KMS key for the destination AWS Region. KMS encryption keys are specific to the region that
     * they're created in, and you can't use encryption keys from one region in another region.
     *
     * If you specify the `SnapshotIdentifier` property, the `StorageEncrypted` property value is
     * inherited from the snapshot, and if the DB instance is encrypted, the specified `KmsKeyId`
     * property is used.
     *
     * If you specify `DBSecurityGroups` , AWS CloudFormation ignores this property. To specify both
     * a security group and this property, you must use a VPC security group. For more information
     * about Amazon RDS and VPC, see [Using Amazon RDS with Amazon
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html) in the *Amazon RDS
     * User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The KMS key identifier is managed by the DB cluster.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param licenseModel License model information for this DB instance.
     * Valid Values:
     *
     * * Aurora MySQL - `general-public-license`
     * * Aurora PostgreSQL - `postgresql-license`
     * * RDS for Db2 - `bring-your-own-license` . For more information about RDS for Db2 licensing,
     * see [](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html) in the *Amazon
     * RDS User Guide.*
     * * RDS for MariaDB - `general-public-license`
     * * RDS for Microsoft SQL Server - `license-included`
     * * RDS for MySQL - `general-public-license`
     * * RDS for Oracle - `bring-your-own-license` or `license-included`
     * * RDS for PostgreSQL - `postgresql-license`
     *
     *
     * If you've specified `DBSecurityGroups` and then you update the license model, AWS
     * CloudFormation replaces the underlying DB instance. This will incur some interruptions to
     * database availability.
     */
    public fun licenseModel(licenseModel: String)

    /**
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     */
    public fun manageMasterUserPassword(manageMasterUserPassword: Boolean)

    /**
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     */
    public fun manageMasterUserPassword(manageMasterUserPassword: IResolvable)

    /**
     * @param masterUserPassword The password for the master user. The password can include any
     * printable ASCII character except "/", """, or "&#64;".
     * *Amazon Aurora*
     *
     * Not applicable. The password for the master user is managed by the DB cluster.
     *
     * *RDS for Db2*
     *
     * Must contain from 8 to 255 characters.
     *
     * *RDS for MariaDB*
     *
     * Constraints: Must contain from 8 to 41 characters.
     *
     * *RDS for Microsoft SQL Server*
     *
     * Constraints: Must contain from 8 to 128 characters.
     *
     * *RDS for MySQL*
     *
     * Constraints: Must contain from 8 to 41 characters.
     *
     * *RDS for Oracle*
     *
     * Constraints: Must contain from 8 to 30 characters.
     *
     * *RDS for PostgreSQL*
     *
     * Constraints: Must contain from 8 to 128 characters.
     */
    public fun masterUserPassword(masterUserPassword: String)

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     */
    public fun masterUserSecret(masterUserSecret: IResolvable)

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     */
    public fun masterUserSecret(masterUserSecret: CfnDBInstance.MasterUserSecretProperty)

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64022dfb8dc7b9545e66d18484a4eef57beed16a27bc24d8bd93c488e9761f42")
    public
        fun masterUserSecret(masterUserSecret: CfnDBInstance.MasterUserSecretProperty.Builder.() -> Unit)

    /**
     * @param masterUsername The master user name for the DB instance.
     *
     * If you specify the `SourceDBInstanceIdentifier` or `DBSnapshotIdentifier` property, don't
     * specify this property. The value is inherited from the source DB instance or snapshot.
     *
     * When migrating a self-managed Db2 database, we recommend that you use the same master
     * username as your self-managed Db2 instance name.
     *
     *
     * *Amazon Aurora*
     *
     * Not applicable. The name for the master user is managed by the DB cluster.
     *
     * *RDS for Db2*
     *
     * Constraints:
     *
     * * Must be 1 to 16 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for MariaDB*
     *
     * Constraints:
     *
     * * Must be 1 to 16 letters or numbers.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for Microsoft SQL Server*
     *
     * Constraints:
     *
     * * Must be 1 to 128 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for MySQL*
     *
     * Constraints:
     *
     * * Must be 1 to 16 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for Oracle*
     *
     * Constraints:
     *
     * * Must be 1 to 30 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for PostgreSQL*
     *
     * Constraints:
     *
     * * Must be 1 to 63 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     */
    public fun masterUsername(masterUsername: String)

    /**
     * @param maxAllocatedStorage The upper limit in gibibytes (GiB) to which Amazon RDS can
     * automatically scale the storage of the DB instance.
     * For more information about this setting, including limitations that apply to it, see
     * [Managing capacity automatically with Amazon RDS storage
     * autoscaling](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling)
     * in the *Amazon RDS User Guide* .
     *
     * This setting doesn't apply to the following DB instances:
     *
     * * Amazon Aurora (Storage is managed by the DB cluster.)
     * * RDS Custom
     */
    public fun maxAllocatedStorage(maxAllocatedStorage: Number)

    /**
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB instance.
     * To disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.
     *
     * If `MonitoringRoleArn` is specified, then you must set `MonitoringInterval` to a value other
     * than 0.
     *
     * This setting doesn't apply to RDS Custom.
     *
     * Valid Values: `0, 1, 5, 10, 15, 30, 60`
     */
    public fun monitoringInterval(monitoringInterval: Number)

    /**
     * @param monitoringRoleArn The ARN for the IAM role that permits RDS to send enhanced
     * monitoring metrics to Amazon CloudWatch Logs.
     * For example, `arn:aws:iam:123456789012:role/emaccess` . For information on creating a
     * monitoring role, see [Setting Up and Enabling Enhanced
     * Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling)
     * in the *Amazon RDS User Guide* .
     *
     * If `MonitoringInterval` is set to a value other than `0` , then you must supply a
     * `MonitoringRoleArn` value.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     */
    public fun monitoringRoleArn(monitoringRoleArn: String)

    /**
     * @param multiAz Specifies whether the database instance is a Multi-AZ DB instance deployment.
     * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to true.
     *
     * For more information, see [Multi-AZ deployments for high
     * availability](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html) in
     * the *Amazon RDS User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. Amazon Aurora storage is replicated across all of the Availability Zones and
     * doesn't require the `MultiAZ` option to be set.
     */
    public fun multiAz(multiAz: Boolean)

    /**
     * @param multiAz Specifies whether the database instance is a Multi-AZ DB instance deployment.
     * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to true.
     *
     * For more information, see [Multi-AZ deployments for high
     * availability](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html) in
     * the *Amazon RDS User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. Amazon Aurora storage is replicated across all of the Availability Zones and
     * doesn't require the `MultiAZ` option to be set.
     */
    public fun multiAz(multiAz: IResolvable)

    /**
     * @param ncharCharacterSetName The name of the NCHAR character set for the Oracle DB instance.
     * This setting doesn't apply to RDS Custom DB instances.
     */
    public fun ncharCharacterSetName(ncharCharacterSetName: String)

    /**
     * @param networkType The network type of the DB instance.
     * Valid values:
     *
     * * `IPV4`
     * * `DUAL`
     *
     * The network type is determined by the `DBSubnetGroup` specified for the DB instance. A
     * `DBSubnetGroup` can support only the IPv4 protocol or the IPv4 and IPv6 protocols ( `DUAL` ).
     *
     * For more information, see [Working with a DB instance in a
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html)
     * in the *Amazon RDS User Guide.*
     */
    public fun networkType(networkType: String)

    /**
     * @param optionGroupName Indicates that the DB instance should be associated with the specified
     * option group.
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed
     * from an option group. Also, that option group can't be removed from a DB instance once it is
     * associated with a DB instance.
     */
    public fun optionGroupName(optionGroupName: String)

    /**
     * @param performanceInsightsKmsKeyId The AWS KMS key identifier for encryption of Performance
     * Insights data.
     * The KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     *
     * If you do not specify a value for `PerformanceInsightsKMSKeyId` , then Amazon RDS uses your
     * default KMS key. There is a default KMS key for your AWS account. Your AWS account has a
     * different default KMS key for each AWS Region.
     *
     * For information about enabling Performance Insights, see
     * [EnablePerformanceInsights](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableperformanceinsights)
     * .
     */
    public fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String)

    /**
     * @param performanceInsightsRetentionPeriod The number of days to retain Performance Insights
     * data.
     * This setting doesn't apply to RDS Custom DB instances.
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
     * If you specify a retention period that isn't valid, such as `94` , Amazon RDS returns an
     * error.
     */
    public fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number)

    /**
     * @param port The port number on which the database accepts connections.
     * *Amazon Aurora*
     *
     * Not applicable. The port number is managed by the DB cluster.
     *
     * *Db2*
     *
     * Default value: `50000`
     */
    public fun port(port: String)

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled, using the `BackupRetentionPeriod` parameter.
     * For more information, see [Backup
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
     * in the *Amazon RDS User Guide.*
     *
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi` .
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The daily time range for creating automated backups is managed by the DB
     * cluster.
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region, occurring on a random day of the week. To see the time blocks available, see
     * [Adjusting the Preferred DB Instance Maintenance
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
     * in the *Amazon RDS User Guide.*
     *
     *
     * This property applies when AWS CloudFormation initially creates the DB instance. If you use
     * AWS CloudFormation to update the DB instance, those updates are applied immediately.
     *
     *
     * Constraints: Minimum 30-minute window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance.
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     */
    public fun processorFeatures(processorFeatures: IResolvable)

    /**
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance.
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     */
    public fun processorFeatures(processorFeatures: List<Any>)

    /**
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance.
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     */
    public fun processorFeatures(vararg processorFeatures: Any)

    /**
     * @param promotionTier The order of priority in which an Aurora Replica is promoted to the
     * primary instance after a failure of the existing primary instance.
     * For more information, see [Fault Tolerance for an Aurora DB
     * Cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance)
     * in the *Amazon Aurora User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * Default: `1`
     *
     * Valid Values: `0 - 15`
     */
    public fun promotionTier(promotionTier: Number)

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     * If you specify true, AWS CloudFormation creates an instance with a publicly resolvable DNS
     * name, which resolves to a public IP address. If you specify false, AWS CloudFormation creates an
     * internal instance with a DNS name that resolves to a private IP address.
     *
     * The default behavior value depends on your VPC setup and the database subnet group. For more
     * information, see the `PubliclyAccessible` parameter in the
     * [CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html)
     * in the *Amazon RDS API Reference* .
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     * If you specify true, AWS CloudFormation creates an instance with a publicly resolvable DNS
     * name, which resolves to a public IP address. If you specify false, AWS CloudFormation creates an
     * internal instance with a DNS name that resolves to a private IP address.
     *
     * The default behavior value depends on your VPC setup and the database subnet group. For more
     * information, see the `PubliclyAccessible` parameter in the
     * [CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html)
     * in the *Amazon RDS API Reference* .
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param replicaMode The open mode of an Oracle read replica.
     * For more information, see [Working with Oracle Read Replicas for Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html) in the
     * *Amazon RDS User Guide* .
     *
     * This setting is only supported in RDS for Oracle.
     *
     * Default: `open-read-only`
     *
     * Valid Values: `open-read-only` or `mounted`
     */
    public fun replicaMode(replicaMode: String)

    /**
     * @param restoreTime The date and time to restore from.
     * Constraints:
     *
     * * Must be a time in Universal Coordinated Time (UTC) format.
     * * Must be before the latest restorable time for the DB instance.
     * * Can't be specified if the `UseLatestRestorableTime` parameter is enabled.
     *
     * Example: `2009-09-07T23:45:00Z`
     */
    public fun restoreTime(restoreTime: String)

    /**
     * @param sourceDbClusterIdentifier The identifier of the Multi-AZ DB cluster that will act as
     * the source for the read replica.
     * Each DB cluster can have up to 15 read replicas.
     *
     * Constraints:
     *
     * * Must be the identifier of an existing Multi-AZ DB cluster.
     * * Can't be specified if the `SourceDBInstanceIdentifier` parameter is also specified.
     * * The specified DB cluster must have automatic backups enabled, that is, its backup retention
     * period must be greater than 0.
     * * The source DB cluster must be in the same AWS Region as the read replica. Cross-Region
     * replication isn't supported.
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    /**
     * @param sourceDbInstanceAutomatedBackupsArn The Amazon Resource Name (ARN) of the replicated
     * automated backups from which to restore, for example,
     * `arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE` .
     * This setting doesn't apply to RDS Custom.
     */
    public fun sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn: String)

    /**
     * @param sourceDbInstanceIdentifier If you want to create a read replica DB instance, specify
     * the ID of the source DB instance.
     * Each DB instance can have a limited number of read replicas. For more information, see
     * [Working with Read
     * Replicas](https://docs.aws.amazon.com/AmazonRDS/latest/DeveloperGuide/USER_ReadRepl.html) in the
     * *Amazon RDS User Guide* .
     *
     * For information about constraints that apply to DB instance identifiers, see [Naming
     * constraints in Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * in the *Amazon RDS User Guide* .
     *
     * The `SourceDBInstanceIdentifier` property determines whether a DB instance is a read replica.
     * If you remove the `SourceDBInstanceIdentifier` property from your template and then update your
     * stack, AWS CloudFormation promotes the Read Replica to a standalone DB instance.
     *
     *
     * * If you specify a source DB instance that uses VPC security groups, we recommend that you
     * specify the `VPCSecurityGroups` property. If you don't specify the property, the read replica
     * inherits the value of the `VPCSecurityGroups` property from the source DB when you create the
     * replica. However, if you update the stack, AWS CloudFormation reverts the replica's
     * `VPCSecurityGroups` property to the default value because it's not defined in the stack's
     * template. This change might cause unexpected issues.
     * * Read replicas don't support deletion policies. AWS CloudFormation ignores any deletion
     * policy that's associated with a read replica.
     * * If you specify `SourceDBInstanceIdentifier` , don't specify the `DBSnapshotIdentifier`
     * property. You can't create a read replica from a snapshot.
     * * Don't set the `BackupRetentionPeriod` , `DBName` , `MasterUsername` , `MasterUserPassword`
     * , and `PreferredBackupWindow` properties. The database attributes are inherited from the source
     * DB instance, and backups are disabled for read replicas.
     * * If the source DB instance is in a different region than the read replica, specify the
     * source region in `SourceRegion` , and specify an ARN for a valid DB instance in
     * `SourceDBInstanceIdentifier` . For more information, see [Constructing a Amazon RDS Amazon
     * Resource Name
     * (ARN)](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN)
     * in the *Amazon RDS User Guide* .
     * * For DB instances in Amazon Aurora clusters, don't specify this property. Amazon RDS
     * automatically assigns writer and reader DB instances.
     */
    public fun sourceDbInstanceIdentifier(sourceDbInstanceIdentifier: String)

    /**
     * @param sourceDbiResourceId The resource ID of the source DB instance from which to restore.
     */
    public fun sourceDbiResourceId(sourceDbiResourceId: String)

    /**
     * @param sourceRegion The ID of the region that contains the source DB instance for the read
     * replica.
     */
    public fun sourceRegion(sourceRegion: String)

    /**
     * @param storageEncrypted A value that indicates whether the DB instance is encrypted. By
     * default, it isn't encrypted.
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBInstanceIdentifier` property, don't specify this property. The
     * value is inherited from the source DB instance, and if the DB instance is encrypted, the
     * specified `KmsKeyId` property is used.
     *
     * If you specify the `DBSnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `DBSnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB instance is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB instance to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The encryption for DB instances is managed by the DB cluster.
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * @param storageEncrypted A value that indicates whether the DB instance is encrypted. By
     * default, it isn't encrypted.
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBInstanceIdentifier` property, don't specify this property. The
     * value is inherited from the source DB instance, and if the DB instance is encrypted, the
     * specified `KmsKeyId` property is used.
     *
     * If you specify the `DBSnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `DBSnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB instance is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB instance to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The encryption for DB instances is managed by the DB cluster.
     */
    public fun storageEncrypted(storageEncrypted: IResolvable)

    /**
     * @param storageThroughput Specifies the storage throughput value for the DB instance. This
     * setting applies only to the `gp3` storage type.
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     */
    public fun storageThroughput(storageThroughput: Number)

    /**
     * @param storageType The storage type to associate with the DB instance.
     * If you specify `io1` , `io2` , or `gp3` , you must also include a value for the `Iops`
     * parameter.
     *
     * This setting doesn't apply to Amazon Aurora DB instances. Storage is managed by the DB
     * cluster.
     *
     * Valid Values: `gp2 | gp3 | io1 | io2 | standard`
     *
     * Default: `io1` , if the `Iops` parameter is specified. Otherwise, `gp2` .
     */
    public fun storageType(storageType: String)

    /**
     * @param tags An optional array of key-value pairs to apply to this DB instance.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional array of key-value pairs to apply to this DB instance.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tdeCredentialArn the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tdeCredentialArn(tdeCredentialArn: String)

    /**
     * @param tdeCredentialPassword the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tdeCredentialPassword(tdeCredentialPassword: String)

    /**
     * @param timezone The time zone of the DB instance.
     * The time zone parameter is currently supported only by [Microsoft SQL
     * Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
     * .
     */
    public fun timezone(timezone: String)

    /**
     * @param useDefaultProcessorFeatures Specifies whether the DB instance class of the DB instance
     * uses its default processor features.
     * This setting doesn't apply to RDS Custom DB instances.
     */
    public fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: Boolean)

    /**
     * @param useDefaultProcessorFeatures Specifies whether the DB instance class of the DB instance
     * uses its default processor features.
     * This setting doesn't apply to RDS Custom DB instances.
     */
    public fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: IResolvable)

    /**
     * @param useLatestRestorableTime Specifies whether the DB instance is restored from the latest
     * backup time.
     * By default, the DB instance isn't restored from the latest backup time.
     *
     * Constraints:
     *
     * * Can't be specified if the `RestoreTime` parameter is provided.
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

    /**
     * @param useLatestRestorableTime Specifies whether the DB instance is restored from the latest
     * backup time.
     * By default, the DB instance isn't restored from the latest backup time.
     *
     * Constraints:
     *
     * * Can't be specified if the `RestoreTime` parameter is provided.
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    /**
     * @param vpcSecurityGroups A list of the VPC security group IDs to assign to the DB instance.
     * The list can include both the physical IDs of existing VPC security groups and references to
     * [AWS::EC2::SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * If you set `VPCSecurityGroups` , you must not set
     * [`DBSecurityGroups`](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
     * , and vice versa.
     *
     *
     * You can migrate a DB instance in your stack from an RDS DB security group to a VPC security
     * group, but keep the following in mind:
     *
     * * You can't revert to using an RDS security group after you establish a VPC security group
     * membership.
     * * When you migrate your DB instance to VPC security groups, if your stack update rolls back
     * because the DB instance update fails or because an update fails in another AWS CloudFormation
     * resource, the rollback fails because it can't revert to an RDS security group.
     * * To use the properties that are available when you use a VPC security group, you must
     * recreate the DB instance. If you don't, AWS CloudFormation submits only the property values that
     * are listed in the
     * [`DBSecurityGroups`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
     * property.
     *
     *
     * To avoid this situation, migrate your DB instance to using VPC security groups only when that
     * is the only change in your stack template.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     * If specified, the setting must match the DB cluster setting.
     */
    public fun vpcSecurityGroups(vpcSecurityGroups: List<String>)

    /**
     * @param vpcSecurityGroups A list of the VPC security group IDs to assign to the DB instance.
     * The list can include both the physical IDs of existing VPC security groups and references to
     * [AWS::EC2::SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * If you set `VPCSecurityGroups` , you must not set
     * [`DBSecurityGroups`](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
     * , and vice versa.
     *
     *
     * You can migrate a DB instance in your stack from an RDS DB security group to a VPC security
     * group, but keep the following in mind:
     *
     * * You can't revert to using an RDS security group after you establish a VPC security group
     * membership.
     * * When you migrate your DB instance to VPC security groups, if your stack update rolls back
     * because the DB instance update fails or because an update fails in another AWS CloudFormation
     * resource, the rollback fails because it can't revert to an RDS security group.
     * * To use the properties that are available when you use a VPC security group, you must
     * recreate the DB instance. If you don't, AWS CloudFormation submits only the property values that
     * are listed in the
     * [`DBSecurityGroups`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
     * property.
     *
     *
     * To avoid this situation, migrate your DB instance to using VPC security groups only when that
     * is the only change in your stack template.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     * If specified, the setting must match the DB cluster setting.
     */
    public fun vpcSecurityGroups(vararg vpcSecurityGroups: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBInstanceProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBInstanceProps.builder()

    /**
     * @param allocatedStorage The amount of storage in gibibytes (GiB) to be initially allocated
     * for the database instance.
     *
     * If any value is set in the `Iops` parameter, `AllocatedStorage` must be at least 100 GiB,
     * which corresponds to the minimum Iops value of 1,000. If you increase the `Iops` value (in 1,000
     * IOPS increments), then you must also increase the `AllocatedStorage` value (in 100-GiB
     * increments).
     *
     *
     * *Amazon Aurora*
     *
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your
     * database increases, though you are only charged for the space that you use in an Aurora cluster
     * volume.
     *
     * *Db2*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp3): Must be an integer from 20 to 64000.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 64000.
     *
     * *MySQL*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 5 to 3072.
     *
     * *MariaDB*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 5 to 3072.
     *
     * *PostgreSQL*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 5 to 3072.
     *
     * *Oracle*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 10 to 3072.
     *
     * *SQL Server*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2):
     * * Enterprise and Standard editions: Must be an integer from 20 to 16384.
     * * Web and Express editions: Must be an integer from 20 to 16384.
     * * Provisioned IOPS storage (io1):
     * * Enterprise and Standard editions: Must be an integer from 20 to 16384.
     * * Web and Express editions: Must be an integer from 20 to 16384.
     * * Magnetic storage (standard):
     * * Enterprise and Standard editions: Must be an integer from 20 to 1024.
     * * Web and Express editions: Must be an integer from 20 to 1024.
     */
    override fun allocatedStorage(allocatedStorage: String) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    /**
     * @param allowMajorVersionUpgrade A value that indicates whether major version upgrades are
     * allowed.
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible.
     *
     * Constraints: Major version upgrades must be allowed when specifying a value for the
     * `EngineVersion` parameter that is a different major version than the DB instance's current
     * version.
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param allowMajorVersionUpgrade A value that indicates whether major version upgrades are
     * allowed.
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible.
     *
     * Constraints: Major version upgrades must be allowed when specifying a value for the
     * `EngineVersion` parameter that is a different major version than the DB instance's current
     * version.
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance.
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     */
    override fun associatedRoles(associatedRoles: IResolvable) {
      cdkBuilder.associatedRoles(associatedRoles.let(IResolvable::unwrap))
    }

    /**
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance.
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     */
    override fun associatedRoles(associatedRoles: List<Any>) {
      cdkBuilder.associatedRoles(associatedRoles)
    }

    /**
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance.
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     */
    override fun associatedRoles(vararg associatedRoles: Any): Unit =
        associatedRoles(associatedRoles.toList())

    /**
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the DB instance during the maintenance window.
     * By default, minor engine upgrades are applied automatically.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the DB instance during the maintenance window.
     * By default, minor engine upgrades are applied automatically.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * @param automaticBackupReplicationRegion The destination region for the backup replication of
     * the DB instance.
     * For more info, see [Replicating automated backups to another AWS
     * Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html) in
     * the *Amazon RDS User Guide* .
     */
    override fun automaticBackupReplicationRegion(automaticBackupReplicationRegion: String) {
      cdkBuilder.automaticBackupReplicationRegion(automaticBackupReplicationRegion)
    }

    /**
     * @param availabilityZone The Availability Zone (AZ) where the database will be created.
     * For information on AWS Regions and Availability Zones, see [Regions and Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * .
     *
     * For Amazon Aurora, each Aurora DB cluster hosts copies of its storage in three separate
     * Availability Zones. Specify one of these Availability Zones. Aurora automatically chooses an
     * appropriate Availability Zone if you don't specify one.
     *
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
     *
     * Constraints:
     *
     * * The `AvailabilityZone` parameter can't be specified if the DB instance is a Multi-AZ
     * deployment.
     * * The specified Availability Zone must be in the same AWS Region as the current endpoint.
     *
     * Example: `us-east-1d`
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param backupRetentionPeriod The number of days for which automated backups are retained.
     * Setting this parameter to a positive number enables backups. Setting this parameter to 0
     * disables automated backups.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The retention period for automated backups is managed by the DB cluster.
     *
     * Default: 1
     *
     * Constraints:
     *
     * * Must be a value from 0 to 35
     * * Can't be set to 0 if the DB instance is a source to read replicas
     */
    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    /**
     * @param caCertificateIdentifier The identifier of the CA certificate for this DB instance.
     * For more information, see [Using SSL/TLS to encrypt a connection to a DB
     * instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html) in the
     * *Amazon RDS User Guide* and [Using SSL/TLS to encrypt a connection to a DB
     * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html) in
     * the *Amazon Aurora User Guide* .
     */
    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
      cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

    /**
     * @param certificateDetails The details of the DB instance's server certificate.
     */
    override fun certificateDetails(certificateDetails: IResolvable) {
      cdkBuilder.certificateDetails(certificateDetails.let(IResolvable::unwrap))
    }

    /**
     * @param certificateDetails The details of the DB instance's server certificate.
     */
    override fun certificateDetails(certificateDetails: CfnDBInstance.CertificateDetailsProperty) {
      cdkBuilder.certificateDetails(certificateDetails.let(CfnDBInstance.CertificateDetailsProperty::unwrap))
    }

    /**
     * @param certificateDetails The details of the DB instance's server certificate.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a28138b43a7cdc1c509818c0a0be65dc8ab95a94f0468fe9a64f453036e07923")
    override
        fun certificateDetails(certificateDetails: CfnDBInstance.CertificateDetailsProperty.Builder.() -> Unit):
        Unit = certificateDetails(CfnDBInstance.CertificateDetailsProperty(certificateDetails))

    /**
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate.
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
     * certificate is not updated until the DB instance is restarted.
     *
     *
     * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
     *
     *
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions
     * for your DB engine to rotate your SSL/TLS certificate:
     *
     * * For more information about rotating your SSL/TLS certificate for RDS DB engines, see
     * [Rotating Your SSL/TLS
     * Certificate.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * in the *Amazon RDS User Guide.*
     * * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see
     * [Rotating Your SSL/TLS
     * Certificate](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * in the *Amazon Aurora User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     */
    override fun certificateRotationRestart(certificateRotationRestart: Boolean) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart)
    }

    /**
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate.
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
     * certificate is not updated until the DB instance is restarted.
     *
     *
     * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
     *
     *
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions
     * for your DB engine to rotate your SSL/TLS certificate:
     *
     * * For more information about rotating your SSL/TLS certificate for RDS DB engines, see
     * [Rotating Your SSL/TLS
     * Certificate.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * in the *Amazon RDS User Guide.*
     * * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see
     * [Rotating Your SSL/TLS
     * Certificate](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * in the *Amazon Aurora User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     */
    override fun certificateRotationRestart(certificateRotationRestart: IResolvable) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart.let(IResolvable::unwrap))
    }

    /**
     * @param characterSetName For supported engines, indicates that the DB instance should be
     * associated with the specified character set.
     * *Amazon Aurora*
     *
     * Not applicable. The character set is managed by the DB cluster. For more information, see
     * [AWS::RDS::DBCluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
     * .
     */
    override fun characterSetName(characterSetName: String) {
      cdkBuilder.characterSetName(characterSetName)
    }

    /**
     * @param copyTagsToSnapshot Specifies whether to copy tags from the DB instance to snapshots of
     * the DB instance.
     * By default, tags are not copied.
     *
     * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is
     * managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting.
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * @param copyTagsToSnapshot Specifies whether to copy tags from the DB instance to snapshots of
     * the DB instance.
     * By default, tags are not copied.
     *
     * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is
     * managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting.
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    /**
     * @param customIamInstanceProfile The instance profile associated with the underlying Amazon
     * EC2 instance of an RDS Custom DB instance.
     * This setting is required for RDS Custom.
     *
     * Constraints:
     *
     * * The profile must exist in your account.
     * * The profile must have an IAM role that Amazon EC2 has permissions to assume.
     * * The instance profile name and the associated IAM role name must start with the prefix
     * `AWSRDSCustom` .
     *
     * For the list of permissions required for the IAM role, see [Configure IAM and your
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc)
     * in the *Amazon RDS User Guide* .
     */
    override fun customIamInstanceProfile(customIamInstanceProfile: String) {
      cdkBuilder.customIamInstanceProfile(customIamInstanceProfile)
    }

    /**
     * @param dbClusterIdentifier The identifier of the DB cluster that the instance will belong to.
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * @param dbClusterSnapshotIdentifier The identifier for the Multi-AZ DB cluster snapshot to
     * restore from.
     * For more information on Multi-AZ DB clusters, see [Multi-AZ DB cluster
     * deployments](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html)
     * in the *Amazon RDS User Guide* .
     *
     * Constraints:
     *
     * * Must match the identifier of an existing Multi-AZ DB cluster snapshot.
     * * Can't be specified when `DBSnapshotIdentifier` is specified.
     * * Must be specified when `DBSnapshotIdentifier` isn't specified.
     * * If you are restoring from a shared manual Multi-AZ DB cluster snapshot, the
     * `DBClusterSnapshotIdentifier` must be the ARN of the shared snapshot.
     * * Can't be the identifier of an Aurora DB cluster snapshot.
     */
    override fun dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier: String) {
      cdkBuilder.dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier)
    }

    /**
     * @param dbInstanceClass The compute and memory capacity of the DB instance, for example
     * `db.m5.large` . Not all DB instance classes are available in all AWS Regions , or for all
     * database engines. For the full list of DB instance classes, and availability for your engine,
     * see [DB instance
     * classes](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html)
     * in the *Amazon RDS User Guide* or [Aurora DB instance
     * classes](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html)
     * in the *Amazon Aurora User Guide* .
     */
    override fun dbInstanceClass(dbInstanceClass: String) {
      cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

    /**
     * @param dbInstanceIdentifier A name for the DB instance.
     * If you specify a name, AWS CloudFormation converts it to lowercase. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the DB instance.
     * For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * For information about constraints that apply to DB instance identifiers, see [Naming
     * constraints in Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * in the *Amazon RDS User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
      cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    /**
     * @param dbName The meaning of this parameter differs according to the database engine you use.
     *
     * If you specify the
     * `[DBSnapshotIdentifier](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier)`
     * property, this property only applies to RDS for Oracle.
     *
     *
     * *Amazon Aurora*
     *
     * Not applicable. The database name is managed by the DB cluster.
     *
     * *Db2*
     *
     * The name of the database to create when the DB instance is created. If this parameter isn't
     * specified, no database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must contain 1 to 64 letters or numbers.
     * * Must begin with a letter. Subsequent characters can be letters, underscores, or digits
     * (0-9).
     * * Can't be a word reserved by the specified database engine.
     *
     * *MySQL*
     *
     * The name of the database to create when the DB instance is created. If this parameter is not
     * specified, no database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must contain 1 to 64 letters or numbers.
     * * Can't be a word reserved by the specified database engine
     *
     * *MariaDB*
     *
     * The name of the database to create when the DB instance is created. If this parameter is not
     * specified, no database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must contain 1 to 64 letters or numbers.
     * * Can't be a word reserved by the specified database engine
     *
     * *PostgreSQL*
     *
     * The name of the database to create when the DB instance is created. If this parameter is not
     * specified, the default `postgres` database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must begin with a letter. Subsequent characters can be letters, underscores, or digits
     * (0-9).
     * * Must contain 1 to 63 characters.
     * * Can't be a word reserved by the specified database engine
     *
     * *Oracle*
     *
     * The Oracle System ID (SID) of the created DB instance. If you specify `null` , the default
     * value `ORCL` is used. You can't specify the string NULL, or any other reserved word, for
     * `DBName` .
     *
     * Default: `ORCL`
     *
     * Constraints:
     *
     * * Can't be longer than 8 characters
     *
     * *SQL Server*
     *
     * Not applicable. Must be null.
     */
    override fun dbName(dbName: String) {
      cdkBuilder.dbName(dbName)
    }

    /**
     * @param dbParameterGroupName The name of an existing DB parameter group or a reference to an
     * [AWS::RDS::DBParameterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html)
     * resource created in the template.
     * To list all of the available DB parameter group names, use the following command:
     *
     * `aws rds describe-db-parameter-groups --query
     * "DBParameterGroups[].DBParameterGroupName" --output text`
     *
     *
     * If any of the data members of the referenced parameter group are changed during an update,
     * the DB instance might need to be restarted, which causes some interruption. If the parameter
     * group contains static parameters, whether they were changed or not, an update triggers a reboot.
     *
     *
     * If you don't specify a value for `DBParameterGroupName` property, the default DB parameter
     * group for the specified engine and engine version is used.
     */
    override fun dbParameterGroupName(dbParameterGroupName: String) {
      cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    /**
     * @param dbSecurityGroups A list of the DB security groups to assign to the DB instance.
     * The list can include both the name of existing DB security groups or references to
     * AWS::RDS::DBSecurityGroup resources created in the template.
     *
     * If you set DBSecurityGroups, you must not set VPCSecurityGroups, and vice versa. Also, note
     * that the DBSecurityGroups property exists only for backwards compatibility with older regions
     * and is no longer recommended for providing security information to an RDS DB instance. Instead,
     * use VPCSecurityGroups.
     *
     *
     * If you specify this property, AWS CloudFormation sends only the following properties (if
     * specified) to Amazon RDS during create operations:
     *
     * * `AllocatedStorage`
     * * `AutoMinorVersionUpgrade`
     * * `AvailabilityZone`
     * * `BackupRetentionPeriod`
     * * `CharacterSetName`
     * * `DBInstanceClass`
     * * `DBName`
     * * `DBParameterGroupName`
     * * `DBSecurityGroups`
     * * `DBSubnetGroupName`
     * * `Engine`
     * * `EngineVersion`
     * * `Iops`
     * * `LicenseModel`
     * * `MasterUsername`
     * * `MasterUserPassword`
     * * `MultiAZ`
     * * `OptionGroupName`
     * * `PreferredBackupWindow`
     * * `PreferredMaintenanceWindow`
     *
     * All other properties are ignored. Specify a virtual private cloud (VPC) security group if you
     * want to submit other properties, such as `StorageType` , `StorageEncrypted` , or `KmsKeyId` . If
     * you're already using the `DBSecurityGroups` property, you can't use these other properties by
     * updating your DB instance to use a VPC security group. You must recreate the DB instance.
     */
    override fun dbSecurityGroups(dbSecurityGroups: List<String>) {
      cdkBuilder.dbSecurityGroups(dbSecurityGroups)
    }

    /**
     * @param dbSecurityGroups A list of the DB security groups to assign to the DB instance.
     * The list can include both the name of existing DB security groups or references to
     * AWS::RDS::DBSecurityGroup resources created in the template.
     *
     * If you set DBSecurityGroups, you must not set VPCSecurityGroups, and vice versa. Also, note
     * that the DBSecurityGroups property exists only for backwards compatibility with older regions
     * and is no longer recommended for providing security information to an RDS DB instance. Instead,
     * use VPCSecurityGroups.
     *
     *
     * If you specify this property, AWS CloudFormation sends only the following properties (if
     * specified) to Amazon RDS during create operations:
     *
     * * `AllocatedStorage`
     * * `AutoMinorVersionUpgrade`
     * * `AvailabilityZone`
     * * `BackupRetentionPeriod`
     * * `CharacterSetName`
     * * `DBInstanceClass`
     * * `DBName`
     * * `DBParameterGroupName`
     * * `DBSecurityGroups`
     * * `DBSubnetGroupName`
     * * `Engine`
     * * `EngineVersion`
     * * `Iops`
     * * `LicenseModel`
     * * `MasterUsername`
     * * `MasterUserPassword`
     * * `MultiAZ`
     * * `OptionGroupName`
     * * `PreferredBackupWindow`
     * * `PreferredMaintenanceWindow`
     *
     * All other properties are ignored. Specify a virtual private cloud (VPC) security group if you
     * want to submit other properties, such as `StorageType` , `StorageEncrypted` , or `KmsKeyId` . If
     * you're already using the `DBSecurityGroups` property, you can't use these other properties by
     * updating your DB instance to use a VPC security group. You must recreate the DB instance.
     */
    override fun dbSecurityGroups(vararg dbSecurityGroups: String): Unit =
        dbSecurityGroups(dbSecurityGroups.toList())

    /**
     * @param dbSnapshotIdentifier The name or Amazon Resource Name (ARN) of the DB snapshot that's
     * used to restore the DB instance.
     * If you're restoring from a shared manual DB snapshot, you must specify the ARN of the
     * snapshot.
     *
     * By specifying this property, you can create a DB instance from the specified DB snapshot. If
     * the `DBSnapshotIdentifier` property is an empty string or the `AWS::RDS::DBInstance` declaration
     * has no `DBSnapshotIdentifier` property, AWS CloudFormation creates a new database. If the
     * property contains a value (other than an empty string), AWS CloudFormation creates a database
     * from the specified snapshot. If a snapshot with the specified name doesn't exist, AWS
     * CloudFormation can't create the database and it rolls back the stack.
     *
     * Some DB instance properties aren't valid when you restore from a snapshot, such as the
     * `MasterUsername` and `MasterUserPassword` properties. For information about the properties that
     * you can specify, see the `RestoreDBInstanceFromDBSnapshot` action in the *Amazon RDS API
     * Reference* .
     *
     * After you restore a DB instance with a `DBSnapshotIdentifier` property, you must specify the
     * same `DBSnapshotIdentifier` property for any future updates to the DB instance. When you specify
     * this property for an update, the DB instance is not restored from the DB snapshot again, and the
     * data in the database is not changed. However, if you don't specify the `DBSnapshotIdentifier`
     * property, an empty DB instance is created, and the original DB instance is deleted. If you
     * specify a property that is different from the previous snapshot restore property, a new DB
     * instance is restored from the specified `DBSnapshotIdentifier` property, and the original DB
     * instance is deleted.
     *
     * If you specify the `DBSnapshotIdentifier` property to restore a DB instance (as opposed to
     * specifying it for DB instance updates), then don't specify the following properties:
     *
     * * `CharacterSetName`
     * * `DBClusterIdentifier`
     * * `DBName`
     * * `DeleteAutomatedBackups`
     * * `EnablePerformanceInsights`
     * * `KmsKeyId`
     * * `MasterUsername`
     * * `MasterUserPassword`
     * * `PerformanceInsightsKMSKeyId`
     * * `PerformanceInsightsRetentionPeriod`
     * * `PromotionTier`
     * * `SourceDBInstanceIdentifier`
     * * `SourceRegion`
     * * `StorageEncrypted` (for an encrypted snapshot)
     * * `Timezone`
     *
     * *Amazon Aurora*
     *
     * Not applicable. Snapshot restore is managed by the DB cluster.
     */
    override fun dbSnapshotIdentifier(dbSnapshotIdentifier: String) {
      cdkBuilder.dbSnapshotIdentifier(dbSnapshotIdentifier)
    }

    /**
     * @param dbSubnetGroupName A DB subnet group to associate with the DB instance.
     * If you update this value, the new subnet group must be a subnet group in a new VPC.
     *
     * If there's no DB subnet group, then the DB instance isn't a VPC DB instance.
     *
     * For more information about using Amazon RDS in a VPC, see [Using Amazon RDS with Amazon
     * Virtual Private Cloud
     * (VPC)](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html) in the *Amazon RDS
     * User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The DB subnet group is managed by the DB cluster. If specified, the setting
     * must match the DB cluster setting.
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * @param dedicatedLogVolume Indicates whether the DB instance has a dedicated log volume (DLV)
     * enabled.
     */
    override fun dedicatedLogVolume(dedicatedLogVolume: Boolean) {
      cdkBuilder.dedicatedLogVolume(dedicatedLogVolume)
    }

    /**
     * @param dedicatedLogVolume Indicates whether the DB instance has a dedicated log volume (DLV)
     * enabled.
     */
    override fun dedicatedLogVolume(dedicatedLogVolume: IResolvable) {
      cdkBuilder.dedicatedLogVolume(dedicatedLogVolume.let(IResolvable::unwrap))
    }

    /**
     * @param deleteAutomatedBackups A value that indicates whether to remove automated backups
     * immediately after the DB instance is deleted.
     * This parameter isn't case-sensitive. The default is to remove automated backups immediately
     * after the DB instance is deleted.
     *
     * *Amazon Aurora*
     *
     * Not applicable. When you delete a DB cluster, all automated backups for that DB cluster are
     * deleted and can't be recovered. Manual DB cluster snapshots of the DB cluster are not deleted.
     */
    override fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    /**
     * @param deleteAutomatedBackups A value that indicates whether to remove automated backups
     * immediately after the DB instance is deleted.
     * This parameter isn't case-sensitive. The default is to remove automated backups immediately
     * after the DB instance is deleted.
     *
     * *Amazon Aurora*
     *
     * Not applicable. When you delete a DB cluster, all automated backups for that DB cluster are
     * deleted and can't be recovered. Manual DB cluster snapshots of the DB cluster are not deleted.
     */
    override fun deleteAutomatedBackups(deleteAutomatedBackups: IResolvable) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups.let(IResolvable::unwrap))
    }

    /**
     * @param deletionProtection A value that indicates whether the DB instance has deletion
     * protection enabled.
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled. For more information, see [Deleting a DB
     * Instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html) .
     *
     * *Amazon Aurora*
     *
     * Not applicable. You can enable or disable deletion protection for the DB cluster. For more
     * information, see `CreateDBCluster` . DB instances in a DB cluster can be deleted even when
     * deletion protection is enabled for the DB cluster.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deletionProtection A value that indicates whether the DB instance has deletion
     * protection enabled.
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled. For more information, see [Deleting a DB
     * Instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html) .
     *
     * *Amazon Aurora*
     *
     * Not applicable. You can enable or disable deletion protection for the DB cluster. For more
     * information, see `CreateDBCluster` . DB instances in a DB cluster can be deleted even when
     * deletion protection is enabled for the DB cluster.
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    /**
     * @param domain The Active Directory directory ID to create the DB instance in.
     * Currently, only Db2, MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be
     * created in an Active Directory Domain.
     *
     * For more information, see [Kerberos
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html)
     * in the *Amazon RDS User Guide* .
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param domainAuthSecretArn The ARN for the Secrets Manager secret with the credentials for
     * the user joining the domain.
     * Example:
     * `arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456`
     */
    override fun domainAuthSecretArn(domainAuthSecretArn: String) {
      cdkBuilder.domainAuthSecretArn(domainAuthSecretArn)
    }

    /**
     * @param domainDnsIps The IPv4 DNS IP addresses of your primary and secondary Active Directory
     * domain controllers.
     * Constraints:
     *
     * * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP
     * address of the primary domain controller for both entries in the list.
     *
     * Example: `123.124.125.126,234.235.236.237`
     */
    override fun domainDnsIps(domainDnsIps: List<String>) {
      cdkBuilder.domainDnsIps(domainDnsIps)
    }

    /**
     * @param domainDnsIps The IPv4 DNS IP addresses of your primary and secondary Active Directory
     * domain controllers.
     * Constraints:
     *
     * * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP
     * address of the primary domain controller for both entries in the list.
     *
     * Example: `123.124.125.126,234.235.236.237`
     */
    override fun domainDnsIps(vararg domainDnsIps: String): Unit =
        domainDnsIps(domainDnsIps.toList())

    /**
     * @param domainFqdn The fully qualified domain name (FQDN) of an Active Directory domain.
     * Constraints:
     *
     * * Can't be longer than 64 characters.
     *
     * Example: `mymanagedADtest.mymanagedAD.mydomain`
     */
    override fun domainFqdn(domainFqdn: String) {
      cdkBuilder.domainFqdn(domainFqdn)
    }

    /**
     * @param domainIamRoleName The name of the IAM role to use when making API calls to the
     * Directory Service.
     * This setting doesn't apply to the following DB instances:
     *
     * * Amazon Aurora (The domain is managed by the DB cluster.)
     * * RDS Custom
     */
    override fun domainIamRoleName(domainIamRoleName: String) {
      cdkBuilder.domainIamRoleName(domainIamRoleName)
    }

    /**
     * @param domainOu The Active Directory organizational unit for your DB instance to join.
     * Constraints:
     *
     * * Must be in the distinguished name format.
     * * Can't be longer than 64 characters.
     *
     * Example: `OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain`
     */
    override fun domainOu(domainOu: String) {
      cdkBuilder.domainOu(domainOu)
    }

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs.
     * The values in the list depend on the DB engine being used. For more information, see
     * [Publishing Database Logs to Amazon CloudWatch
     * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
     * in the *Amazon Relational Database Service User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     *
     * *Db2*
     *
     * Valid values: `diag.log` , `notify.log`
     *
     * *MariaDB*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Microsoft SQL Server*
     *
     * Valid values: `agent` , `error`
     *
     * *MySQL*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Oracle*
     *
     * Valid values: `alert` , `audit` , `listener` , `trace` , `oemagent`
     *
     * *PostgreSQL*
     *
     * Valid values: `postgresql` , `upgrade`
     */
    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    /**
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs.
     * The values in the list depend on the DB engine being used. For more information, see
     * [Publishing Database Logs to Amazon CloudWatch
     * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
     * in the *Amazon Relational Database Service User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     *
     * *Db2*
     *
     * Valid values: `diag.log` , `notify.log`
     *
     * *MariaDB*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Microsoft SQL Server*
     *
     * Valid values: `agent` , `error`
     *
     * *MySQL*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Oracle*
     *
     * Valid values: `alert` , `audit` , `listener` , `trace` , `oemagent`
     *
     * *PostgreSQL*
     *
     * Valid values: `postgresql` , `upgrade`
     */
    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

    /**
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts.
     * By default, mapping is disabled.
     *
     * This property is supported for RDS for MariaDB, RDS for MySQL, and RDS for PostgreSQL. For
     * more information, see [IAM Database Authentication for MariaDB, MySQL, and
     * PostgreSQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon RDS User Guide.*
     *
     * *Amazon Aurora*
     *
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster.
     */
    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
    }

    /**
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts.
     * By default, mapping is disabled.
     *
     * This property is supported for RDS for MariaDB, RDS for MySQL, and RDS for PostgreSQL. For
     * more information, see [IAM Database Authentication for MariaDB, MySQL, and
     * PostgreSQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon RDS User Guide.*
     *
     * *Amazon Aurora*
     *
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster.
     */
    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication.let(IResolvable::unwrap))
    }

    /**
     * @param enablePerformanceInsights Specifies whether to enable Performance Insights for the DB
     * instance.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * @param enablePerformanceInsights Specifies whether to enable Performance Insights for the DB
     * instance.
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: IResolvable) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights.let(IResolvable::unwrap))
    }

    /**
     * @param endpoint The connection endpoint for the DB instance.
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     */
    override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
    }

    /**
     * @param endpoint The connection endpoint for the DB instance.
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     */
    override fun endpoint(endpoint: CfnDBInstance.EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(CfnDBInstance.EndpointProperty::unwrap))
    }

    /**
     * @param endpoint The connection endpoint for the DB instance.
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7947e5819bba5c75904e4610cb293a5a01f8267d49b226670e67ad3e8b09537d")
    override fun endpoint(endpoint: CfnDBInstance.EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(CfnDBInstance.EndpointProperty(endpoint))

    /**
     * @param engine The name of the database engine that you want to use for this DB instance.
     * Not every database engine is available in every AWS Region.
     *
     *
     * When you are creating a DB instance, the `Engine` property is required.
     *
     *
     * Valid Values:
     *
     * * `aurora-mysql` (for Aurora MySQL DB instances)
     * * `aurora-postgresql` (for Aurora PostgreSQL DB instances)
     * * `custom-oracle-ee` (for RDS Custom for Oracle DB instances)
     * * `custom-oracle-ee-cdb` (for RDS Custom for Oracle DB instances)
     * * `custom-sqlserver-ee` (for RDS Custom for SQL Server DB instances)
     * * `custom-sqlserver-se` (for RDS Custom for SQL Server DB instances)
     * * `custom-sqlserver-web` (for RDS Custom for SQL Server DB instances)
     * * `db2-ae`
     * * `db2-se`
     * * `mariadb`
     * * `mysql`
     * * `oracle-ee`
     * * `oracle-ee-cdb`
     * * `oracle-se2`
     * * `oracle-se2-cdb`
     * * `postgres`
     * * `sqlserver-ee`
     * * `sqlserver-se`
     * * `sqlserver-ex`
     * * `sqlserver-web`
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param engineVersion The version number of the database engine to use.
     * For a list of valid engine versions, use the `DescribeDBEngineVersions` action.
     *
     * The following are the database engines and links to information about the major and minor
     * versions that are available with Amazon RDS. Not every database engine is available for every
     * AWS Region.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The version number of the database engine to be used by the DB instance is
     * managed by the DB cluster.
     *
     * *Db2*
     *
     * See [Amazon RDS for
     * Db2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Db2.html#Db2.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide.*
     *
     * *MariaDB*
     *
     * See [MariaDB on Amazon RDS
     * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide.*
     *
     * *Microsoft SQL Server*
     *
     * See [Microsoft SQL Server Versions on Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport)
     * in the *Amazon RDS User Guide.*
     *
     * *MySQL*
     *
     * See [MySQL on Amazon RDS
     * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide.*
     *
     * *Oracle*
     *
     * See [Oracle Database Engine Release
     * Notes](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html)
     * in the *Amazon RDS User Guide.*
     *
     * *PostgreSQL*
     *
     * See [Supported PostgreSQL Database
     * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions)
     * in the *Amazon RDS User Guide.*
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param iops The number of I/O operations per second (IOPS) that the database provisions.
     * The value must be equal to or greater than 1000.
     *
     * If you specify this property, you must follow the range of allowed ratios of your requested
     * IOPS rate to the amount of storage that you allocate (IOPS to allocated storage). For example,
     * you can provision an Oracle database instance with 1000 IOPS and 200 GiB of storage (a ratio of
     * 5:1), or specify 2000 IOPS with 200 GiB of storage (a ratio of 10:1). For more information, see
     * [Amazon RDS Provisioned IOPS Storage to Improve
     * Performance](https://docs.aws.amazon.com/AmazonRDS/latest/DeveloperGuide/CHAP_Storage.html#USER_PIOPS)
     * in the *Amazon RDS User Guide* .
     *
     *
     * If you specify `io1` for the `StorageType` property, then you must also specify the `Iops`
     * property.
     *
     *
     * Constraints:
     *
     * * For RDS for Db2, MariaDB, MySQL, Oracle, and PostgreSQL - Must be a multiple between .5 and
     * 50 of the storage amount for the DB instance.
     * * For RDS for SQL Server - Must be a multiple between 1 and 50 of the storage amount for the
     * DB instance.
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * @param kmsKeyId The ARN of the AWS KMS key that's used to encrypt the DB instance, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
     * If you enable the StorageEncrypted property but don't specify this property, AWS
     * CloudFormation uses the default KMS key. If you specify this property, you must set the
     * StorageEncrypted property to true.
     *
     * If you specify the `SourceDBInstanceIdentifier` property, the value is inherited from the
     * source DB instance if the read replica is created in the same region.
     *
     * If you create an encrypted read replica in a different AWS Region, then you must specify a
     * KMS key for the destination AWS Region. KMS encryption keys are specific to the region that
     * they're created in, and you can't use encryption keys from one region in another region.
     *
     * If you specify the `SnapshotIdentifier` property, the `StorageEncrypted` property value is
     * inherited from the snapshot, and if the DB instance is encrypted, the specified `KmsKeyId`
     * property is used.
     *
     * If you specify `DBSecurityGroups` , AWS CloudFormation ignores this property. To specify both
     * a security group and this property, you must use a VPC security group. For more information
     * about Amazon RDS and VPC, see [Using Amazon RDS with Amazon
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html) in the *Amazon RDS
     * User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The KMS key identifier is managed by the DB cluster.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param licenseModel License model information for this DB instance.
     * Valid Values:
     *
     * * Aurora MySQL - `general-public-license`
     * * Aurora PostgreSQL - `postgresql-license`
     * * RDS for Db2 - `bring-your-own-license` . For more information about RDS for Db2 licensing,
     * see [](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html) in the *Amazon
     * RDS User Guide.*
     * * RDS for MariaDB - `general-public-license`
     * * RDS for Microsoft SQL Server - `license-included`
     * * RDS for MySQL - `general-public-license`
     * * RDS for Oracle - `bring-your-own-license` or `license-included`
     * * RDS for PostgreSQL - `postgresql-license`
     *
     *
     * If you've specified `DBSecurityGroups` and then you update the license model, AWS
     * CloudFormation replaces the underlying DB instance. This will incur some interruptions to
     * database availability.
     */
    override fun licenseModel(licenseModel: String) {
      cdkBuilder.licenseModel(licenseModel)
    }

    /**
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     */
    override fun manageMasterUserPassword(manageMasterUserPassword: Boolean) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword)
    }

    /**
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     */
    override fun manageMasterUserPassword(manageMasterUserPassword: IResolvable) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword.let(IResolvable::unwrap))
    }

    /**
     * @param masterUserPassword The password for the master user. The password can include any
     * printable ASCII character except "/", """, or "&#64;".
     * *Amazon Aurora*
     *
     * Not applicable. The password for the master user is managed by the DB cluster.
     *
     * *RDS for Db2*
     *
     * Must contain from 8 to 255 characters.
     *
     * *RDS for MariaDB*
     *
     * Constraints: Must contain from 8 to 41 characters.
     *
     * *RDS for Microsoft SQL Server*
     *
     * Constraints: Must contain from 8 to 128 characters.
     *
     * *RDS for MySQL*
     *
     * Constraints: Must contain from 8 to 41 characters.
     *
     * *RDS for Oracle*
     *
     * Constraints: Must contain from 8 to 30 characters.
     *
     * *RDS for PostgreSQL*
     *
     * Constraints: Must contain from 8 to 128 characters.
     */
    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     */
    override fun masterUserSecret(masterUserSecret: IResolvable) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(IResolvable::unwrap))
    }

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     */
    override fun masterUserSecret(masterUserSecret: CfnDBInstance.MasterUserSecretProperty) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(CfnDBInstance.MasterUserSecretProperty::unwrap))
    }

    /**
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password.
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64022dfb8dc7b9545e66d18484a4eef57beed16a27bc24d8bd93c488e9761f42")
    override
        fun masterUserSecret(masterUserSecret: CfnDBInstance.MasterUserSecretProperty.Builder.() -> Unit):
        Unit = masterUserSecret(CfnDBInstance.MasterUserSecretProperty(masterUserSecret))

    /**
     * @param masterUsername The master user name for the DB instance.
     *
     * If you specify the `SourceDBInstanceIdentifier` or `DBSnapshotIdentifier` property, don't
     * specify this property. The value is inherited from the source DB instance or snapshot.
     *
     * When migrating a self-managed Db2 database, we recommend that you use the same master
     * username as your self-managed Db2 instance name.
     *
     *
     * *Amazon Aurora*
     *
     * Not applicable. The name for the master user is managed by the DB cluster.
     *
     * *RDS for Db2*
     *
     * Constraints:
     *
     * * Must be 1 to 16 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for MariaDB*
     *
     * Constraints:
     *
     * * Must be 1 to 16 letters or numbers.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for Microsoft SQL Server*
     *
     * Constraints:
     *
     * * Must be 1 to 128 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for MySQL*
     *
     * Constraints:
     *
     * * Must be 1 to 16 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for Oracle*
     *
     * Constraints:
     *
     * * Must be 1 to 30 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for PostgreSQL*
     *
     * Constraints:
     *
     * * Must be 1 to 63 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     */
    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * @param maxAllocatedStorage The upper limit in gibibytes (GiB) to which Amazon RDS can
     * automatically scale the storage of the DB instance.
     * For more information about this setting, including limitations that apply to it, see
     * [Managing capacity automatically with Amazon RDS storage
     * autoscaling](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling)
     * in the *Amazon RDS User Guide* .
     *
     * This setting doesn't apply to the following DB instances:
     *
     * * Amazon Aurora (Storage is managed by the DB cluster.)
     * * RDS Custom
     */
    override fun maxAllocatedStorage(maxAllocatedStorage: Number) {
      cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

    /**
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB instance.
     * To disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.
     *
     * If `MonitoringRoleArn` is specified, then you must set `MonitoringInterval` to a value other
     * than 0.
     *
     * This setting doesn't apply to RDS Custom.
     *
     * Valid Values: `0, 1, 5, 10, 15, 30, 60`
     */
    override fun monitoringInterval(monitoringInterval: Number) {
      cdkBuilder.monitoringInterval(monitoringInterval)
    }

    /**
     * @param monitoringRoleArn The ARN for the IAM role that permits RDS to send enhanced
     * monitoring metrics to Amazon CloudWatch Logs.
     * For example, `arn:aws:iam:123456789012:role/emaccess` . For information on creating a
     * monitoring role, see [Setting Up and Enabling Enhanced
     * Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling)
     * in the *Amazon RDS User Guide* .
     *
     * If `MonitoringInterval` is set to a value other than `0` , then you must supply a
     * `MonitoringRoleArn` value.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     */
    override fun monitoringRoleArn(monitoringRoleArn: String) {
      cdkBuilder.monitoringRoleArn(monitoringRoleArn)
    }

    /**
     * @param multiAz Specifies whether the database instance is a Multi-AZ DB instance deployment.
     * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to true.
     *
     * For more information, see [Multi-AZ deployments for high
     * availability](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html) in
     * the *Amazon RDS User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. Amazon Aurora storage is replicated across all of the Availability Zones and
     * doesn't require the `MultiAZ` option to be set.
     */
    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    /**
     * @param multiAz Specifies whether the database instance is a Multi-AZ DB instance deployment.
     * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to true.
     *
     * For more information, see [Multi-AZ deployments for high
     * availability](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html) in
     * the *Amazon RDS User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. Amazon Aurora storage is replicated across all of the Availability Zones and
     * doesn't require the `MultiAZ` option to be set.
     */
    override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
    }

    /**
     * @param ncharCharacterSetName The name of the NCHAR character set for the Oracle DB instance.
     * This setting doesn't apply to RDS Custom DB instances.
     */
    override fun ncharCharacterSetName(ncharCharacterSetName: String) {
      cdkBuilder.ncharCharacterSetName(ncharCharacterSetName)
    }

    /**
     * @param networkType The network type of the DB instance.
     * Valid values:
     *
     * * `IPV4`
     * * `DUAL`
     *
     * The network type is determined by the `DBSubnetGroup` specified for the DB instance. A
     * `DBSubnetGroup` can support only the IPv4 protocol or the IPv4 and IPv6 protocols ( `DUAL` ).
     *
     * For more information, see [Working with a DB instance in a
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html)
     * in the *Amazon RDS User Guide.*
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    /**
     * @param optionGroupName Indicates that the DB instance should be associated with the specified
     * option group.
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed
     * from an option group. Also, that option group can't be removed from a DB instance once it is
     * associated with a DB instance.
     */
    override fun optionGroupName(optionGroupName: String) {
      cdkBuilder.optionGroupName(optionGroupName)
    }

    /**
     * @param performanceInsightsKmsKeyId The AWS KMS key identifier for encryption of Performance
     * Insights data.
     * The KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     *
     * If you do not specify a value for `PerformanceInsightsKMSKeyId` , then Amazon RDS uses your
     * default KMS key. There is a default KMS key for your AWS account. Your AWS account has a
     * different default KMS key for each AWS Region.
     *
     * For information about enabling Performance Insights, see
     * [EnablePerformanceInsights](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableperformanceinsights)
     * .
     */
    override fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
      cdkBuilder.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId)
    }

    /**
     * @param performanceInsightsRetentionPeriod The number of days to retain Performance Insights
     * data.
     * This setting doesn't apply to RDS Custom DB instances.
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
     * If you specify a retention period that isn't valid, such as `94` , Amazon RDS returns an
     * error.
     */
    override fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
      cdkBuilder.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod)
    }

    /**
     * @param port The port number on which the database accepts connections.
     * *Amazon Aurora*
     *
     * Not applicable. The port number is managed by the DB cluster.
     *
     * *Db2*
     *
     * Default value: `50000`
     */
    override fun port(port: String) {
      cdkBuilder.port(port)
    }

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled, using the `BackupRetentionPeriod` parameter.
     * For more information, see [Backup
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
     * in the *Amazon RDS User Guide.*
     *
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi` .
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The daily time range for creating automated backups is managed by the DB
     * cluster.
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region, occurring on a random day of the week. To see the time blocks available, see
     * [Adjusting the Preferred DB Instance Maintenance
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
     * in the *Amazon RDS User Guide.*
     *
     *
     * This property applies when AWS CloudFormation initially creates the DB instance. If you use
     * AWS CloudFormation to update the DB instance, those updates are applied immediately.
     *
     *
     * Constraints: Minimum 30-minute window.
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance.
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     */
    override fun processorFeatures(processorFeatures: IResolvable) {
      cdkBuilder.processorFeatures(processorFeatures.let(IResolvable::unwrap))
    }

    /**
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance.
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     */
    override fun processorFeatures(processorFeatures: List<Any>) {
      cdkBuilder.processorFeatures(processorFeatures)
    }

    /**
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance.
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     */
    override fun processorFeatures(vararg processorFeatures: Any): Unit =
        processorFeatures(processorFeatures.toList())

    /**
     * @param promotionTier The order of priority in which an Aurora Replica is promoted to the
     * primary instance after a failure of the existing primary instance.
     * For more information, see [Fault Tolerance for an Aurora DB
     * Cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance)
     * in the *Amazon Aurora User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * Default: `1`
     *
     * Valid Values: `0 - 15`
     */
    override fun promotionTier(promotionTier: Number) {
      cdkBuilder.promotionTier(promotionTier)
    }

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     * If you specify true, AWS CloudFormation creates an instance with a publicly resolvable DNS
     * name, which resolves to a public IP address. If you specify false, AWS CloudFormation creates an
     * internal instance with a DNS name that resolves to a private IP address.
     *
     * The default behavior value depends on your VPC setup and the database subnet group. For more
     * information, see the `PubliclyAccessible` parameter in the
     * [CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html)
     * in the *Amazon RDS API Reference* .
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     * If you specify true, AWS CloudFormation creates an instance with a publicly resolvable DNS
     * name, which resolves to a public IP address. If you specify false, AWS CloudFormation creates an
     * internal instance with a DNS name that resolves to a private IP address.
     *
     * The default behavior value depends on your VPC setup and the database subnet group. For more
     * information, see the `PubliclyAccessible` parameter in the
     * [CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html)
     * in the *Amazon RDS API Reference* .
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * @param replicaMode The open mode of an Oracle read replica.
     * For more information, see [Working with Oracle Read Replicas for Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html) in the
     * *Amazon RDS User Guide* .
     *
     * This setting is only supported in RDS for Oracle.
     *
     * Default: `open-read-only`
     *
     * Valid Values: `open-read-only` or `mounted`
     */
    override fun replicaMode(replicaMode: String) {
      cdkBuilder.replicaMode(replicaMode)
    }

    /**
     * @param restoreTime The date and time to restore from.
     * Constraints:
     *
     * * Must be a time in Universal Coordinated Time (UTC) format.
     * * Must be before the latest restorable time for the DB instance.
     * * Can't be specified if the `UseLatestRestorableTime` parameter is enabled.
     *
     * Example: `2009-09-07T23:45:00Z`
     */
    override fun restoreTime(restoreTime: String) {
      cdkBuilder.restoreTime(restoreTime)
    }

    /**
     * @param sourceDbClusterIdentifier The identifier of the Multi-AZ DB cluster that will act as
     * the source for the read replica.
     * Each DB cluster can have up to 15 read replicas.
     *
     * Constraints:
     *
     * * Must be the identifier of an existing Multi-AZ DB cluster.
     * * Can't be specified if the `SourceDBInstanceIdentifier` parameter is also specified.
     * * The specified DB cluster must have automatic backups enabled, that is, its backup retention
     * period must be greater than 0.
     * * The source DB cluster must be in the same AWS Region as the read replica. Cross-Region
     * replication isn't supported.
     */
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * @param sourceDbInstanceAutomatedBackupsArn The Amazon Resource Name (ARN) of the replicated
     * automated backups from which to restore, for example,
     * `arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE` .
     * This setting doesn't apply to RDS Custom.
     */
    override fun sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn: String) {
      cdkBuilder.sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn)
    }

    /**
     * @param sourceDbInstanceIdentifier If you want to create a read replica DB instance, specify
     * the ID of the source DB instance.
     * Each DB instance can have a limited number of read replicas. For more information, see
     * [Working with Read
     * Replicas](https://docs.aws.amazon.com/AmazonRDS/latest/DeveloperGuide/USER_ReadRepl.html) in the
     * *Amazon RDS User Guide* .
     *
     * For information about constraints that apply to DB instance identifiers, see [Naming
     * constraints in Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * in the *Amazon RDS User Guide* .
     *
     * The `SourceDBInstanceIdentifier` property determines whether a DB instance is a read replica.
     * If you remove the `SourceDBInstanceIdentifier` property from your template and then update your
     * stack, AWS CloudFormation promotes the Read Replica to a standalone DB instance.
     *
     *
     * * If you specify a source DB instance that uses VPC security groups, we recommend that you
     * specify the `VPCSecurityGroups` property. If you don't specify the property, the read replica
     * inherits the value of the `VPCSecurityGroups` property from the source DB when you create the
     * replica. However, if you update the stack, AWS CloudFormation reverts the replica's
     * `VPCSecurityGroups` property to the default value because it's not defined in the stack's
     * template. This change might cause unexpected issues.
     * * Read replicas don't support deletion policies. AWS CloudFormation ignores any deletion
     * policy that's associated with a read replica.
     * * If you specify `SourceDBInstanceIdentifier` , don't specify the `DBSnapshotIdentifier`
     * property. You can't create a read replica from a snapshot.
     * * Don't set the `BackupRetentionPeriod` , `DBName` , `MasterUsername` , `MasterUserPassword`
     * , and `PreferredBackupWindow` properties. The database attributes are inherited from the source
     * DB instance, and backups are disabled for read replicas.
     * * If the source DB instance is in a different region than the read replica, specify the
     * source region in `SourceRegion` , and specify an ARN for a valid DB instance in
     * `SourceDBInstanceIdentifier` . For more information, see [Constructing a Amazon RDS Amazon
     * Resource Name
     * (ARN)](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN)
     * in the *Amazon RDS User Guide* .
     * * For DB instances in Amazon Aurora clusters, don't specify this property. Amazon RDS
     * automatically assigns writer and reader DB instances.
     */
    override fun sourceDbInstanceIdentifier(sourceDbInstanceIdentifier: String) {
      cdkBuilder.sourceDbInstanceIdentifier(sourceDbInstanceIdentifier)
    }

    /**
     * @param sourceDbiResourceId The resource ID of the source DB instance from which to restore.
     */
    override fun sourceDbiResourceId(sourceDbiResourceId: String) {
      cdkBuilder.sourceDbiResourceId(sourceDbiResourceId)
    }

    /**
     * @param sourceRegion The ID of the region that contains the source DB instance for the read
     * replica.
     */
    override fun sourceRegion(sourceRegion: String) {
      cdkBuilder.sourceRegion(sourceRegion)
    }

    /**
     * @param storageEncrypted A value that indicates whether the DB instance is encrypted. By
     * default, it isn't encrypted.
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBInstanceIdentifier` property, don't specify this property. The
     * value is inherited from the source DB instance, and if the DB instance is encrypted, the
     * specified `KmsKeyId` property is used.
     *
     * If you specify the `DBSnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `DBSnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB instance is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB instance to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The encryption for DB instances is managed by the DB cluster.
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param storageEncrypted A value that indicates whether the DB instance is encrypted. By
     * default, it isn't encrypted.
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBInstanceIdentifier` property, don't specify this property. The
     * value is inherited from the source DB instance, and if the DB instance is encrypted, the
     * specified `KmsKeyId` property is used.
     *
     * If you specify the `DBSnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `DBSnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB instance is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB instance to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The encryption for DB instances is managed by the DB cluster.
     */
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    /**
     * @param storageThroughput Specifies the storage throughput value for the DB instance. This
     * setting applies only to the `gp3` storage type.
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     */
    override fun storageThroughput(storageThroughput: Number) {
      cdkBuilder.storageThroughput(storageThroughput)
    }

    /**
     * @param storageType The storage type to associate with the DB instance.
     * If you specify `io1` , `io2` , or `gp3` , you must also include a value for the `Iops`
     * parameter.
     *
     * This setting doesn't apply to Amazon Aurora DB instances. Storage is managed by the DB
     * cluster.
     *
     * Valid Values: `gp2 | gp3 | io1 | io2 | standard`
     *
     * Default: `io1` , if the `Iops` parameter is specified. Otherwise, `gp2` .
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this DB instance.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this DB instance.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tdeCredentialArn the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tdeCredentialArn(tdeCredentialArn: String) {
      cdkBuilder.tdeCredentialArn(tdeCredentialArn)
    }

    /**
     * @param tdeCredentialPassword the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tdeCredentialPassword(tdeCredentialPassword: String) {
      cdkBuilder.tdeCredentialPassword(tdeCredentialPassword)
    }

    /**
     * @param timezone The time zone of the DB instance.
     * The time zone parameter is currently supported only by [Microsoft SQL
     * Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
     * .
     */
    override fun timezone(timezone: String) {
      cdkBuilder.timezone(timezone)
    }

    /**
     * @param useDefaultProcessorFeatures Specifies whether the DB instance class of the DB instance
     * uses its default processor features.
     * This setting doesn't apply to RDS Custom DB instances.
     */
    override fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: Boolean) {
      cdkBuilder.useDefaultProcessorFeatures(useDefaultProcessorFeatures)
    }

    /**
     * @param useDefaultProcessorFeatures Specifies whether the DB instance class of the DB instance
     * uses its default processor features.
     * This setting doesn't apply to RDS Custom DB instances.
     */
    override fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: IResolvable) {
      cdkBuilder.useDefaultProcessorFeatures(useDefaultProcessorFeatures.let(IResolvable::unwrap))
    }

    /**
     * @param useLatestRestorableTime Specifies whether the DB instance is restored from the latest
     * backup time.
     * By default, the DB instance isn't restored from the latest backup time.
     *
     * Constraints:
     *
     * * Can't be specified if the `RestoreTime` parameter is provided.
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    /**
     * @param useLatestRestorableTime Specifies whether the DB instance is restored from the latest
     * backup time.
     * By default, the DB instance isn't restored from the latest backup time.
     *
     * Constraints:
     *
     * * Can't be specified if the `RestoreTime` parameter is provided.
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    /**
     * @param vpcSecurityGroups A list of the VPC security group IDs to assign to the DB instance.
     * The list can include both the physical IDs of existing VPC security groups and references to
     * [AWS::EC2::SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * If you set `VPCSecurityGroups` , you must not set
     * [`DBSecurityGroups`](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
     * , and vice versa.
     *
     *
     * You can migrate a DB instance in your stack from an RDS DB security group to a VPC security
     * group, but keep the following in mind:
     *
     * * You can't revert to using an RDS security group after you establish a VPC security group
     * membership.
     * * When you migrate your DB instance to VPC security groups, if your stack update rolls back
     * because the DB instance update fails or because an update fails in another AWS CloudFormation
     * resource, the rollback fails because it can't revert to an RDS security group.
     * * To use the properties that are available when you use a VPC security group, you must
     * recreate the DB instance. If you don't, AWS CloudFormation submits only the property values that
     * are listed in the
     * [`DBSecurityGroups`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
     * property.
     *
     *
     * To avoid this situation, migrate your DB instance to using VPC security groups only when that
     * is the only change in your stack template.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     * If specified, the setting must match the DB cluster setting.
     */
    override fun vpcSecurityGroups(vpcSecurityGroups: List<String>) {
      cdkBuilder.vpcSecurityGroups(vpcSecurityGroups)
    }

    /**
     * @param vpcSecurityGroups A list of the VPC security group IDs to assign to the DB instance.
     * The list can include both the physical IDs of existing VPC security groups and references to
     * [AWS::EC2::SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * If you set `VPCSecurityGroups` , you must not set
     * [`DBSecurityGroups`](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
     * , and vice versa.
     *
     *
     * You can migrate a DB instance in your stack from an RDS DB security group to a VPC security
     * group, but keep the following in mind:
     *
     * * You can't revert to using an RDS security group after you establish a VPC security group
     * membership.
     * * When you migrate your DB instance to VPC security groups, if your stack update rolls back
     * because the DB instance update fails or because an update fails in another AWS CloudFormation
     * resource, the rollback fails because it can't revert to an RDS security group.
     * * To use the properties that are available when you use a VPC security group, you must
     * recreate the DB instance. If you don't, AWS CloudFormation submits only the property values that
     * are listed in the
     * [`DBSecurityGroups`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
     * property.
     *
     *
     * To avoid this situation, migrate your DB instance to using VPC security groups only when that
     * is the only change in your stack template.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     * If specified, the setting must match the DB cluster setting.
     */
    override fun vpcSecurityGroups(vararg vpcSecurityGroups: String): Unit =
        vpcSecurityGroups(vpcSecurityGroups.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBInstanceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CfnDBInstanceProps,
  ) : CdkObject(cdkObject), CfnDBInstanceProps {
    /**
     * The amount of storage in gibibytes (GiB) to be initially allocated for the database instance.
     *
     *
     * If any value is set in the `Iops` parameter, `AllocatedStorage` must be at least 100 GiB,
     * which corresponds to the minimum Iops value of 1,000. If you increase the `Iops` value (in 1,000
     * IOPS increments), then you must also increase the `AllocatedStorage` value (in 100-GiB
     * increments).
     *
     *
     * *Amazon Aurora*
     *
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your
     * database increases, though you are only charged for the space that you use in an Aurora cluster
     * volume.
     *
     * *Db2*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp3): Must be an integer from 20 to 64000.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 64000.
     *
     * *MySQL*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 5 to 3072.
     *
     * *MariaDB*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 5 to 3072.
     *
     * *PostgreSQL*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 5 to 3072.
     *
     * *Oracle*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * * Magnetic storage (standard): Must be an integer from 10 to 3072.
     *
     * *SQL Server*
     *
     * Constraints to the amount of storage for each storage type are the following:
     *
     * * General Purpose (SSD) storage (gp2):
     * * Enterprise and Standard editions: Must be an integer from 20 to 16384.
     * * Web and Express editions: Must be an integer from 20 to 16384.
     * * Provisioned IOPS storage (io1):
     * * Enterprise and Standard editions: Must be an integer from 20 to 16384.
     * * Web and Express editions: Must be an integer from 20 to 16384.
     * * Magnetic storage (standard):
     * * Enterprise and Standard editions: Must be an integer from 20 to 1024.
     * * Web and Express editions: Must be an integer from 20 to 1024.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-allocatedstorage)
     */
    override fun allocatedStorage(): String? = unwrap(this).getAllocatedStorage()

    /**
     * A value that indicates whether major version upgrades are allowed.
     *
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied
     * as soon as possible.
     *
     * Constraints: Major version upgrades must be allowed when specifying a value for the
     * `EngineVersion` parameter that is a different major version than the DB instance's current
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-allowmajorversionupgrade)
     */
    override fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

    /**
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-associatedroles)
     */
    override fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

    /**
     * A value that indicates whether minor engine upgrades are applied automatically to the DB
     * instance during the maintenance window.
     *
     * By default, minor engine upgrades are applied automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-autominorversionupgrade)
     */
    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * The destination region for the backup replication of the DB instance.
     *
     * For more info, see [Replicating automated backups to another AWS
     * Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html) in
     * the *Amazon RDS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-automaticbackupreplicationregion)
     */
    override fun automaticBackupReplicationRegion(): String? =
        unwrap(this).getAutomaticBackupReplicationRegion()

    /**
     * The Availability Zone (AZ) where the database will be created.
     *
     * For information on AWS Regions and Availability Zones, see [Regions and Availability
     * Zones](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html)
     * .
     *
     * For Amazon Aurora, each Aurora DB cluster hosts copies of its storage in three separate
     * Availability Zones. Specify one of these Availability Zones. Aurora automatically chooses an
     * appropriate Availability Zone if you don't specify one.
     *
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
     *
     * Constraints:
     *
     * * The `AvailabilityZone` parameter can't be specified if the DB instance is a Multi-AZ
     * deployment.
     * * The specified Availability Zone must be in the same AWS Region as the current endpoint.
     *
     * Example: `us-east-1d`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The number of days for which automated backups are retained.
     *
     * Setting this parameter to a positive number enables backups. Setting this parameter to 0
     * disables automated backups.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The retention period for automated backups is managed by the DB cluster.
     *
     * Default: 1
     *
     * Constraints:
     *
     * * Must be a value from 0 to 35
     * * Can't be set to 0 if the DB instance is a source to read replicas
     *
     * Default: - 1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-backupretentionperiod)
     */
    override fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

    /**
     * The identifier of the CA certificate for this DB instance.
     *
     * For more information, see [Using SSL/TLS to encrypt a connection to a DB
     * instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html) in the
     * *Amazon RDS User Guide* and [Using SSL/TLS to encrypt a connection to a DB
     * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html) in
     * the *Amazon Aurora User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-cacertificateidentifier)
     */
    override fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

    /**
     * The details of the DB instance's server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-certificatedetails)
     */
    override fun certificateDetails(): Any? = unwrap(this).getCertificateDetails()

    /**
     * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     *
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The
     * certificate is not updated until the DB instance is restarted.
     *
     *
     * Set this parameter only if you are *not* using SSL/TLS to connect to the DB instance.
     *
     *
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions
     * for your DB engine to rotate your SSL/TLS certificate:
     *
     * * For more information about rotating your SSL/TLS certificate for RDS DB engines, see
     * [Rotating Your SSL/TLS
     * Certificate.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * in the *Amazon RDS User Guide.*
     * * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see
     * [Rotating Your SSL/TLS
     * Certificate](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     * in the *Amazon Aurora User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-certificaterotationrestart)
     */
    override fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

    /**
     * For supported engines, indicates that the DB instance should be associated with the specified
     * character set.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The character set is managed by the DB cluster. For more information, see
     * [AWS::RDS::DBCluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-charactersetname)
     */
    override fun characterSetName(): String? = unwrap(this).getCharacterSetName()

    /**
     * Specifies whether to copy tags from the DB instance to snapshots of the DB instance.
     *
     * By default, tags are not copied.
     *
     * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is
     * managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-copytagstosnapshot)
     */
    override fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

    /**
     * The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB
     * instance.
     *
     * This setting is required for RDS Custom.
     *
     * Constraints:
     *
     * * The profile must exist in your account.
     * * The profile must have an IAM role that Amazon EC2 has permissions to assume.
     * * The instance profile name and the associated IAM role name must start with the prefix
     * `AWSRDSCustom` .
     *
     * For the list of permissions required for the IAM role, see [Configure IAM and your
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc)
     * in the *Amazon RDS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-customiaminstanceprofile)
     */
    override fun customIamInstanceProfile(): String? = unwrap(this).getCustomIamInstanceProfile()

    /**
     * The identifier of the DB cluster that the instance will belong to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbclusteridentifier)
     */
    override fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

    /**
     * The identifier for the Multi-AZ DB cluster snapshot to restore from.
     *
     * For more information on Multi-AZ DB clusters, see [Multi-AZ DB cluster
     * deployments](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html)
     * in the *Amazon RDS User Guide* .
     *
     * Constraints:
     *
     * * Must match the identifier of an existing Multi-AZ DB cluster snapshot.
     * * Can't be specified when `DBSnapshotIdentifier` is specified.
     * * Must be specified when `DBSnapshotIdentifier` isn't specified.
     * * If you are restoring from a shared manual Multi-AZ DB cluster snapshot, the
     * `DBClusterSnapshotIdentifier` must be the ARN of the shared snapshot.
     * * Can't be the identifier of an Aurora DB cluster snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbclustersnapshotidentifier)
     */
    override fun dbClusterSnapshotIdentifier(): String? =
        unwrap(this).getDbClusterSnapshotIdentifier()

    /**
     * The compute and memory capacity of the DB instance, for example `db.m5.large` . Not all DB
     * instance classes are available in all AWS Regions , or for all database engines. For the full
     * list of DB instance classes, and availability for your engine, see [DB instance
     * classes](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html)
     * in the *Amazon RDS User Guide* or [Aurora DB instance
     * classes](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html)
     * in the *Amazon Aurora User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbinstanceclass)
     */
    override fun dbInstanceClass(): String? = unwrap(this).getDbInstanceClass()

    /**
     * A name for the DB instance.
     *
     * If you specify a name, AWS CloudFormation converts it to lowercase. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the DB instance.
     * For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * For information about constraints that apply to DB instance identifiers, see [Naming
     * constraints in Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * in the *Amazon RDS User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbinstanceidentifier)
     */
    override fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

    /**
     * The meaning of this parameter differs according to the database engine you use.
     *
     *
     * If you specify the
     * `[DBSnapshotIdentifier](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier)`
     * property, this property only applies to RDS for Oracle.
     *
     *
     * *Amazon Aurora*
     *
     * Not applicable. The database name is managed by the DB cluster.
     *
     * *Db2*
     *
     * The name of the database to create when the DB instance is created. If this parameter isn't
     * specified, no database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must contain 1 to 64 letters or numbers.
     * * Must begin with a letter. Subsequent characters can be letters, underscores, or digits
     * (0-9).
     * * Can't be a word reserved by the specified database engine.
     *
     * *MySQL*
     *
     * The name of the database to create when the DB instance is created. If this parameter is not
     * specified, no database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must contain 1 to 64 letters or numbers.
     * * Can't be a word reserved by the specified database engine
     *
     * *MariaDB*
     *
     * The name of the database to create when the DB instance is created. If this parameter is not
     * specified, no database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must contain 1 to 64 letters or numbers.
     * * Can't be a word reserved by the specified database engine
     *
     * *PostgreSQL*
     *
     * The name of the database to create when the DB instance is created. If this parameter is not
     * specified, the default `postgres` database is created in the DB instance.
     *
     * Constraints:
     *
     * * Must begin with a letter. Subsequent characters can be letters, underscores, or digits
     * (0-9).
     * * Must contain 1 to 63 characters.
     * * Can't be a word reserved by the specified database engine
     *
     * *Oracle*
     *
     * The Oracle System ID (SID) of the created DB instance. If you specify `null` , the default
     * value `ORCL` is used. You can't specify the string NULL, or any other reserved word, for
     * `DBName` .
     *
     * Default: `ORCL`
     *
     * Constraints:
     *
     * * Can't be longer than 8 characters
     *
     * *SQL Server*
     *
     * Not applicable. Must be null.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbname)
     */
    override fun dbName(): String? = unwrap(this).getDbName()

    /**
     * The name of an existing DB parameter group or a reference to an
     * [AWS::RDS::DBParameterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html)
     * resource created in the template.
     *
     * To list all of the available DB parameter group names, use the following command:
     *
     * `aws rds describe-db-parameter-groups --query
     * "DBParameterGroups[].DBParameterGroupName" --output text`
     *
     *
     * If any of the data members of the referenced parameter group are changed during an update,
     * the DB instance might need to be restarted, which causes some interruption. If the parameter
     * group contains static parameters, whether they were changed or not, an update triggers a reboot.
     *
     *
     * If you don't specify a value for `DBParameterGroupName` property, the default DB parameter
     * group for the specified engine and engine version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbparametergroupname)
     */
    override fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

    /**
     * A list of the DB security groups to assign to the DB instance.
     *
     * The list can include both the name of existing DB security groups or references to
     * AWS::RDS::DBSecurityGroup resources created in the template.
     *
     * If you set DBSecurityGroups, you must not set VPCSecurityGroups, and vice versa. Also, note
     * that the DBSecurityGroups property exists only for backwards compatibility with older regions
     * and is no longer recommended for providing security information to an RDS DB instance. Instead,
     * use VPCSecurityGroups.
     *
     *
     * If you specify this property, AWS CloudFormation sends only the following properties (if
     * specified) to Amazon RDS during create operations:
     *
     * * `AllocatedStorage`
     * * `AutoMinorVersionUpgrade`
     * * `AvailabilityZone`
     * * `BackupRetentionPeriod`
     * * `CharacterSetName`
     * * `DBInstanceClass`
     * * `DBName`
     * * `DBParameterGroupName`
     * * `DBSecurityGroups`
     * * `DBSubnetGroupName`
     * * `Engine`
     * * `EngineVersion`
     * * `Iops`
     * * `LicenseModel`
     * * `MasterUsername`
     * * `MasterUserPassword`
     * * `MultiAZ`
     * * `OptionGroupName`
     * * `PreferredBackupWindow`
     * * `PreferredMaintenanceWindow`
     *
     * All other properties are ignored. Specify a virtual private cloud (VPC) security group if you
     * want to submit other properties, such as `StorageType` , `StorageEncrypted` , or `KmsKeyId` . If
     * you're already using the `DBSecurityGroups` property, you can't use these other properties by
     * updating your DB instance to use a VPC security group. You must recreate the DB instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbsecuritygroups)
     */
    override fun dbSecurityGroups(): List<String> = unwrap(this).getDbSecurityGroups() ?:
        emptyList()

    /**
     * The name or Amazon Resource Name (ARN) of the DB snapshot that's used to restore the DB
     * instance.
     *
     * If you're restoring from a shared manual DB snapshot, you must specify the ARN of the
     * snapshot.
     *
     * By specifying this property, you can create a DB instance from the specified DB snapshot. If
     * the `DBSnapshotIdentifier` property is an empty string or the `AWS::RDS::DBInstance` declaration
     * has no `DBSnapshotIdentifier` property, AWS CloudFormation creates a new database. If the
     * property contains a value (other than an empty string), AWS CloudFormation creates a database
     * from the specified snapshot. If a snapshot with the specified name doesn't exist, AWS
     * CloudFormation can't create the database and it rolls back the stack.
     *
     * Some DB instance properties aren't valid when you restore from a snapshot, such as the
     * `MasterUsername` and `MasterUserPassword` properties. For information about the properties that
     * you can specify, see the `RestoreDBInstanceFromDBSnapshot` action in the *Amazon RDS API
     * Reference* .
     *
     * After you restore a DB instance with a `DBSnapshotIdentifier` property, you must specify the
     * same `DBSnapshotIdentifier` property for any future updates to the DB instance. When you specify
     * this property for an update, the DB instance is not restored from the DB snapshot again, and the
     * data in the database is not changed. However, if you don't specify the `DBSnapshotIdentifier`
     * property, an empty DB instance is created, and the original DB instance is deleted. If you
     * specify a property that is different from the previous snapshot restore property, a new DB
     * instance is restored from the specified `DBSnapshotIdentifier` property, and the original DB
     * instance is deleted.
     *
     * If you specify the `DBSnapshotIdentifier` property to restore a DB instance (as opposed to
     * specifying it for DB instance updates), then don't specify the following properties:
     *
     * * `CharacterSetName`
     * * `DBClusterIdentifier`
     * * `DBName`
     * * `DeleteAutomatedBackups`
     * * `EnablePerformanceInsights`
     * * `KmsKeyId`
     * * `MasterUsername`
     * * `MasterUserPassword`
     * * `PerformanceInsightsKMSKeyId`
     * * `PerformanceInsightsRetentionPeriod`
     * * `PromotionTier`
     * * `SourceDBInstanceIdentifier`
     * * `SourceRegion`
     * * `StorageEncrypted` (for an encrypted snapshot)
     * * `Timezone`
     *
     * *Amazon Aurora*
     *
     * Not applicable. Snapshot restore is managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbsnapshotidentifier)
     */
    override fun dbSnapshotIdentifier(): String? = unwrap(this).getDbSnapshotIdentifier()

    /**
     * A DB subnet group to associate with the DB instance.
     *
     * If you update this value, the new subnet group must be a subnet group in a new VPC.
     *
     * If there's no DB subnet group, then the DB instance isn't a VPC DB instance.
     *
     * For more information about using Amazon RDS in a VPC, see [Using Amazon RDS with Amazon
     * Virtual Private Cloud
     * (VPC)](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html) in the *Amazon RDS
     * User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The DB subnet group is managed by the DB cluster. If specified, the setting
     * must match the DB cluster setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbsubnetgroupname)
     */
    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    /**
     * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dedicatedlogvolume)
     */
    override fun dedicatedLogVolume(): Any? = unwrap(this).getDedicatedLogVolume()

    /**
     * A value that indicates whether to remove automated backups immediately after the DB instance
     * is deleted.
     *
     * This parameter isn't case-sensitive. The default is to remove automated backups immediately
     * after the DB instance is deleted.
     *
     * *Amazon Aurora*
     *
     * Not applicable. When you delete a DB cluster, all automated backups for that DB cluster are
     * deleted and can't be recovered. Manual DB cluster snapshots of the DB cluster are not deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-deleteautomatedbackups)
     */
    override fun deleteAutomatedBackups(): Any? = unwrap(this).getDeleteAutomatedBackups()

    /**
     * A value that indicates whether the DB instance has deletion protection enabled.
     *
     * The database can't be deleted when deletion protection is enabled. By default, deletion
     * protection is disabled. For more information, see [Deleting a DB
     * Instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html) .
     *
     * *Amazon Aurora*
     *
     * Not applicable. You can enable or disable deletion protection for the DB cluster. For more
     * information, see `CreateDBCluster` . DB instances in a DB cluster can be deleted even when
     * deletion protection is enabled for the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-deletionprotection)
     */
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    /**
     * The Active Directory directory ID to create the DB instance in.
     *
     * Currently, only Db2, MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be
     * created in an Active Directory Domain.
     *
     * For more information, see [Kerberos
     * Authentication](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html)
     * in the *Amazon RDS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
     *
     * Example:
     * `arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainauthsecretarn)
     */
    override fun domainAuthSecretArn(): String? = unwrap(this).getDomainAuthSecretArn()

    /**
     * The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.
     *
     * Constraints:
     *
     * * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP
     * address of the primary domain controller for both entries in the list.
     *
     * Example: `123.124.125.126,234.235.236.237`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domaindnsips)
     */
    override fun domainDnsIps(): List<String> = unwrap(this).getDomainDnsIps() ?: emptyList()

    /**
     * The fully qualified domain name (FQDN) of an Active Directory domain.
     *
     * Constraints:
     *
     * * Can't be longer than 64 characters.
     *
     * Example: `mymanagedADtest.mymanagedAD.mydomain`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainfqdn)
     */
    override fun domainFqdn(): String? = unwrap(this).getDomainFqdn()

    /**
     * The name of the IAM role to use when making API calls to the Directory Service.
     *
     * This setting doesn't apply to the following DB instances:
     *
     * * Amazon Aurora (The domain is managed by the DB cluster.)
     * * RDS Custom
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainiamrolename)
     */
    override fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

    /**
     * The Active Directory organizational unit for your DB instance to join.
     *
     * Constraints:
     *
     * * Must be in the distinguished name format.
     * * Can't be longer than 64 characters.
     *
     * Example: `OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainou)
     */
    override fun domainOu(): String? = unwrap(this).getDomainOu()

    /**
     * The list of log types that need to be enabled for exporting to CloudWatch Logs.
     *
     * The values in the list depend on the DB engine being used. For more information, see
     * [Publishing Database Logs to Amazon CloudWatch
     * Logs](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch)
     * in the *Amazon Relational Database Service User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     *
     * *Db2*
     *
     * Valid values: `diag.log` , `notify.log`
     *
     * *MariaDB*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Microsoft SQL Server*
     *
     * Valid values: `agent` , `error`
     *
     * *MySQL*
     *
     * Valid values: `audit` , `error` , `general` , `slowquery`
     *
     * *Oracle*
     *
     * Valid values: `alert` , `audit` , `listener` , `trace` , `oemagent`
     *
     * *PostgreSQL*
     *
     * Valid values: `postgresql` , `upgrade`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-enablecloudwatchlogsexports)
     */
    override fun enableCloudwatchLogsExports(): List<String> =
        unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

    /**
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM)
     * accounts to database accounts.
     *
     * By default, mapping is disabled.
     *
     * This property is supported for RDS for MariaDB, RDS for MySQL, and RDS for PostgreSQL. For
     * more information, see [IAM Database Authentication for MariaDB, MySQL, and
     * PostgreSQL](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html)
     * in the *Amazon RDS User Guide.*
     *
     * *Amazon Aurora*
     *
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-enableiamdatabaseauthentication)
     */
    override fun enableIamDatabaseAuthentication(): Any? =
        unwrap(this).getEnableIamDatabaseAuthentication()

    /**
     * Specifies whether to enable Performance Insights for the DB instance.
     *
     * For more information, see [Using Amazon Performance
     * Insights](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html) in the
     * *Amazon RDS User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-enableperformanceinsights)
     */
    override fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

    /**
     * The connection endpoint for the DB instance.
     *
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-endpoint)
     */
    override fun endpoint(): Any? = unwrap(this).getEndpoint()

    /**
     * The name of the database engine that you want to use for this DB instance.
     *
     * Not every database engine is available in every AWS Region.
     *
     *
     * When you are creating a DB instance, the `Engine` property is required.
     *
     *
     * Valid Values:
     *
     * * `aurora-mysql` (for Aurora MySQL DB instances)
     * * `aurora-postgresql` (for Aurora PostgreSQL DB instances)
     * * `custom-oracle-ee` (for RDS Custom for Oracle DB instances)
     * * `custom-oracle-ee-cdb` (for RDS Custom for Oracle DB instances)
     * * `custom-sqlserver-ee` (for RDS Custom for SQL Server DB instances)
     * * `custom-sqlserver-se` (for RDS Custom for SQL Server DB instances)
     * * `custom-sqlserver-web` (for RDS Custom for SQL Server DB instances)
     * * `db2-ae`
     * * `db2-se`
     * * `mariadb`
     * * `mysql`
     * * `oracle-ee`
     * * `oracle-ee-cdb`
     * * `oracle-se2`
     * * `oracle-se2-cdb`
     * * `postgres`
     * * `sqlserver-ee`
     * * `sqlserver-se`
     * * `sqlserver-ex`
     * * `sqlserver-web`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-engine)
     */
    override fun engine(): String? = unwrap(this).getEngine()

    /**
     * The version number of the database engine to use.
     *
     * For a list of valid engine versions, use the `DescribeDBEngineVersions` action.
     *
     * The following are the database engines and links to information about the major and minor
     * versions that are available with Amazon RDS. Not every database engine is available for every
     * AWS Region.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The version number of the database engine to be used by the DB instance is
     * managed by the DB cluster.
     *
     * *Db2*
     *
     * See [Amazon RDS for
     * Db2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Db2.html#Db2.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide.*
     *
     * *MariaDB*
     *
     * See [MariaDB on Amazon RDS
     * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide.*
     *
     * *Microsoft SQL Server*
     *
     * See [Microsoft SQL Server Versions on Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport)
     * in the *Amazon RDS User Guide.*
     *
     * *MySQL*
     *
     * See [MySQL on Amazon RDS
     * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt)
     * in the *Amazon RDS User Guide.*
     *
     * *Oracle*
     *
     * See [Oracle Database Engine Release
     * Notes](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html)
     * in the *Amazon RDS User Guide.*
     *
     * *PostgreSQL*
     *
     * See [Supported PostgreSQL Database
     * Versions](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions)
     * in the *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * The number of I/O operations per second (IOPS) that the database provisions.
     *
     * The value must be equal to or greater than 1000.
     *
     * If you specify this property, you must follow the range of allowed ratios of your requested
     * IOPS rate to the amount of storage that you allocate (IOPS to allocated storage). For example,
     * you can provision an Oracle database instance with 1000 IOPS and 200 GiB of storage (a ratio of
     * 5:1), or specify 2000 IOPS with 200 GiB of storage (a ratio of 10:1). For more information, see
     * [Amazon RDS Provisioned IOPS Storage to Improve
     * Performance](https://docs.aws.amazon.com/AmazonRDS/latest/DeveloperGuide/CHAP_Storage.html#USER_PIOPS)
     * in the *Amazon RDS User Guide* .
     *
     *
     * If you specify `io1` for the `StorageType` property, then you must also specify the `Iops`
     * property.
     *
     *
     * Constraints:
     *
     * * For RDS for Db2, MariaDB, MySQL, Oracle, and PostgreSQL - Must be a multiple between .5 and
     * 50 of the storage amount for the DB instance.
     * * For RDS for SQL Server - Must be a multiple between 1 and 50 of the storage amount for the
     * DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-iops)
     */
    override fun iops(): Number? = unwrap(this).getIops()

    /**
     * The ARN of the AWS KMS key that's used to encrypt the DB instance, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
     *
     * If you enable the StorageEncrypted property but don't specify this property, AWS
     * CloudFormation uses the default KMS key. If you specify this property, you must set the
     * StorageEncrypted property to true.
     *
     * If you specify the `SourceDBInstanceIdentifier` property, the value is inherited from the
     * source DB instance if the read replica is created in the same region.
     *
     * If you create an encrypted read replica in a different AWS Region, then you must specify a
     * KMS key for the destination AWS Region. KMS encryption keys are specific to the region that
     * they're created in, and you can't use encryption keys from one region in another region.
     *
     * If you specify the `SnapshotIdentifier` property, the `StorageEncrypted` property value is
     * inherited from the snapshot, and if the DB instance is encrypted, the specified `KmsKeyId`
     * property is used.
     *
     * If you specify `DBSecurityGroups` , AWS CloudFormation ignores this property. To specify both
     * a security group and this property, you must use a VPC security group. For more information
     * about Amazon RDS and VPC, see [Using Amazon RDS with Amazon
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html) in the *Amazon RDS
     * User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The KMS key identifier is managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * License model information for this DB instance.
     *
     * Valid Values:
     *
     * * Aurora MySQL - `general-public-license`
     * * Aurora PostgreSQL - `postgresql-license`
     * * RDS for Db2 - `bring-your-own-license` . For more information about RDS for Db2 licensing,
     * see [](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html) in the *Amazon
     * RDS User Guide.*
     * * RDS for MariaDB - `general-public-license`
     * * RDS for Microsoft SQL Server - `license-included`
     * * RDS for MySQL - `general-public-license`
     * * RDS for Oracle - `bring-your-own-license` or `license-included`
     * * RDS for PostgreSQL - `postgresql-license`
     *
     *
     * If you've specified `DBSecurityGroups` and then you update the license model, AWS
     * CloudFormation replaces the underlying DB instance. This will incur some interruptions to
     * database availability.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-licensemodel)
     */
    override fun licenseModel(): String? = unwrap(this).getLicenseModel()

    /**
     * Specifies whether to manage the master user password with AWS Secrets Manager.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-managemasteruserpassword)
     */
    override fun manageMasterUserPassword(): Any? = unwrap(this).getManageMasterUserPassword()

    /**
     * The password for the master user. The password can include any printable ASCII character
     * except "/", """, or "&#64;".
     *
     * *Amazon Aurora*
     *
     * Not applicable. The password for the master user is managed by the DB cluster.
     *
     * *RDS for Db2*
     *
     * Must contain from 8 to 255 characters.
     *
     * *RDS for MariaDB*
     *
     * Constraints: Must contain from 8 to 41 characters.
     *
     * *RDS for Microsoft SQL Server*
     *
     * Constraints: Must contain from 8 to 128 characters.
     *
     * *RDS for MySQL*
     *
     * Constraints: Must contain from 8 to 41 characters.
     *
     * *RDS for Oracle*
     *
     * Constraints: Must contain from 8 to 30 characters.
     *
     * *RDS for PostgreSQL*
     *
     * Constraints: Must contain from 8 to 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masteruserpassword)
     */
    override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masterusersecret)
     */
    override fun masterUserSecret(): Any? = unwrap(this).getMasterUserSecret()

    /**
     * The master user name for the DB instance.
     *
     *
     * If you specify the `SourceDBInstanceIdentifier` or `DBSnapshotIdentifier` property, don't
     * specify this property. The value is inherited from the source DB instance or snapshot.
     *
     * When migrating a self-managed Db2 database, we recommend that you use the same master
     * username as your self-managed Db2 instance name.
     *
     *
     * *Amazon Aurora*
     *
     * Not applicable. The name for the master user is managed by the DB cluster.
     *
     * *RDS for Db2*
     *
     * Constraints:
     *
     * * Must be 1 to 16 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for MariaDB*
     *
     * Constraints:
     *
     * * Must be 1 to 16 letters or numbers.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for Microsoft SQL Server*
     *
     * Constraints:
     *
     * * Must be 1 to 128 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for MySQL*
     *
     * Constraints:
     *
     * * Must be 1 to 16 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for Oracle*
     *
     * Constraints:
     *
     * * Must be 1 to 30 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * *RDS for PostgreSQL*
     *
     * Constraints:
     *
     * * Must be 1 to 63 letters or numbers.
     * * First character must be a letter.
     * * Can't be a reserved word for the chosen database engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masterusername)
     */
    override fun masterUsername(): String? = unwrap(this).getMasterUsername()

    /**
     * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of
     * the DB instance.
     *
     * For more information about this setting, including limitations that apply to it, see
     * [Managing capacity automatically with Amazon RDS storage
     * autoscaling](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling)
     * in the *Amazon RDS User Guide* .
     *
     * This setting doesn't apply to the following DB instances:
     *
     * * Amazon Aurora (Storage is managed by the DB cluster.)
     * * RDS Custom
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-maxallocatedstorage)
     */
    override fun maxAllocatedStorage(): Number? = unwrap(this).getMaxAllocatedStorage()

    /**
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for
     * the DB instance.
     *
     * To disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.
     *
     * If `MonitoringRoleArn` is specified, then you must set `MonitoringInterval` to a value other
     * than 0.
     *
     * This setting doesn't apply to RDS Custom.
     *
     * Valid Values: `0, 1, 5, 10, 15, 30, 60`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-monitoringinterval)
     */
    override fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

    /**
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon
     * CloudWatch Logs.
     *
     * For example, `arn:aws:iam:123456789012:role/emaccess` . For information on creating a
     * monitoring role, see [Setting Up and Enabling Enhanced
     * Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling)
     * in the *Amazon RDS User Guide* .
     *
     * If `MonitoringInterval` is set to a value other than `0` , then you must supply a
     * `MonitoringRoleArn` value.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-monitoringrolearn)
     */
    override fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

    /**
     * Specifies whether the database instance is a Multi-AZ DB instance deployment.
     *
     * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to true.
     *
     * For more information, see [Multi-AZ deployments for high
     * availability](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html) in
     * the *Amazon RDS User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. Amazon Aurora storage is replicated across all of the Availability Zones and
     * doesn't require the `MultiAZ` option to be set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-multiaz)
     */
    override fun multiAz(): Any? = unwrap(this).getMultiAz()

    /**
     * The name of the NCHAR character set for the Oracle DB instance.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-ncharcharactersetname)
     */
    override fun ncharCharacterSetName(): String? = unwrap(this).getNcharCharacterSetName()

    /**
     * The network type of the DB instance.
     *
     * Valid values:
     *
     * * `IPV4`
     * * `DUAL`
     *
     * The network type is determined by the `DBSubnetGroup` specified for the DB instance. A
     * `DBSubnetGroup` can support only the IPv4 protocol or the IPv4 and IPv6 protocols ( `DUAL` ).
     *
     * For more information, see [Working with a DB instance in a
     * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html)
     * in the *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-networktype)
     */
    override fun networkType(): String? = unwrap(this).getNetworkType()

    /**
     * Indicates that the DB instance should be associated with the specified option group.
     *
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed
     * from an option group. Also, that option group can't be removed from a DB instance once it is
     * associated with a DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-optiongroupname)
     */
    override fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

    /**
     * The AWS KMS key identifier for encryption of Performance Insights data.
     *
     * The KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     *
     * If you do not specify a value for `PerformanceInsightsKMSKeyId` , then Amazon RDS uses your
     * default KMS key. There is a default KMS key for your AWS account. Your AWS account has a
     * different default KMS key for each AWS Region.
     *
     * For information about enabling Performance Insights, see
     * [EnablePerformanceInsights](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableperformanceinsights)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-performanceinsightskmskeyid)
     */
    override fun performanceInsightsKmsKeyId(): String? =
        unwrap(this).getPerformanceInsightsKmsKeyId()

    /**
     * The number of days to retain Performance Insights data.
     *
     * This setting doesn't apply to RDS Custom DB instances.
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
     * If you specify a retention period that isn't valid, such as `94` , Amazon RDS returns an
     * error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-performanceinsightsretentionperiod)
     */
    override fun performanceInsightsRetentionPeriod(): Number? =
        unwrap(this).getPerformanceInsightsRetentionPeriod()

    /**
     * The port number on which the database accepts connections.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The port number is managed by the DB cluster.
     *
     * *Db2*
     *
     * Default value: `50000`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-port)
     */
    override fun port(): String? = unwrap(this).getPort()

    /**
     * The daily time range during which automated backups are created if automated backups are
     * enabled, using the `BackupRetentionPeriod` parameter.
     *
     * For more information, see [Backup
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
     * in the *Amazon RDS User Guide.*
     *
     * Constraints:
     *
     * * Must be in the format `hh24:mi-hh24:mi` .
     * * Must be in Universal Coordinated Time (UTC).
     * * Must not conflict with the preferred maintenance window.
     * * Must be at least 30 minutes.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The daily time range for creating automated backups is managed by the DB
     * cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-preferredbackupwindow)
     */
    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated
     * Time (UTC).
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region, occurring on a random day of the week. To see the time blocks available, see
     * [Adjusting the Preferred DB Instance Maintenance
     * Window](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
     * in the *Amazon RDS User Guide.*
     *
     *
     * This property applies when AWS CloudFormation initially creates the DB instance. If you use
     * AWS CloudFormation to update the DB instance, those updates are applied immediately.
     *
     *
     * Constraints: Minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-preferredmaintenancewindow)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * The number of CPU cores and the number of threads per core for the DB instance class of the
     * DB instance.
     *
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-processorfeatures)
     */
    override fun processorFeatures(): Any? = unwrap(this).getProcessorFeatures()

    /**
     * The order of priority in which an Aurora Replica is promoted to the primary instance after a
     * failure of the existing primary instance.
     *
     * For more information, see [Fault Tolerance for an Aurora DB
     * Cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance)
     * in the *Amazon Aurora User Guide* .
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * Default: `1`
     *
     * Valid Values: `0 - 15`
     *
     * Default: - 1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-promotiontier)
     */
    override fun promotionTier(): Number? = unwrap(this).getPromotionTier()

    /**
     * Indicates whether the DB instance is an internet-facing instance.
     *
     * If you specify true, AWS CloudFormation creates an instance with a publicly resolvable DNS
     * name, which resolves to a public IP address. If you specify false, AWS CloudFormation creates an
     * internal instance with a DNS name that resolves to a private IP address.
     *
     * The default behavior value depends on your VPC setup and the database subnet group. For more
     * information, see the `PubliclyAccessible` parameter in the
     * [CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html)
     * in the *Amazon RDS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * The open mode of an Oracle read replica.
     *
     * For more information, see [Working with Oracle Read Replicas for Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html) in the
     * *Amazon RDS User Guide* .
     *
     * This setting is only supported in RDS for Oracle.
     *
     * Default: `open-read-only`
     *
     * Valid Values: `open-read-only` or `mounted`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-replicamode)
     */
    override fun replicaMode(): String? = unwrap(this).getReplicaMode()

    /**
     * The date and time to restore from.
     *
     * Constraints:
     *
     * * Must be a time in Universal Coordinated Time (UTC) format.
     * * Must be before the latest restorable time for the DB instance.
     * * Can't be specified if the `UseLatestRestorableTime` parameter is enabled.
     *
     * Example: `2009-09-07T23:45:00Z`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-restoretime)
     */
    override fun restoreTime(): String? = unwrap(this).getRestoreTime()

    /**
     * The identifier of the Multi-AZ DB cluster that will act as the source for the read replica.
     *
     * Each DB cluster can have up to 15 read replicas.
     *
     * Constraints:
     *
     * * Must be the identifier of an existing Multi-AZ DB cluster.
     * * Can't be specified if the `SourceDBInstanceIdentifier` parameter is also specified.
     * * The specified DB cluster must have automatic backups enabled, that is, its backup retention
     * period must be greater than 0.
     * * The source DB cluster must be in the same AWS Region as the read replica. Cross-Region
     * replication isn't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbclusteridentifier)
     */
    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

    /**
     * The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for
     * example, `arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE` .
     *
     * This setting doesn't apply to RDS Custom.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbinstanceautomatedbackupsarn)
     */
    override fun sourceDbInstanceAutomatedBackupsArn(): String? =
        unwrap(this).getSourceDbInstanceAutomatedBackupsArn()

    /**
     * If you want to create a read replica DB instance, specify the ID of the source DB instance.
     *
     * Each DB instance can have a limited number of read replicas. For more information, see
     * [Working with Read
     * Replicas](https://docs.aws.amazon.com/AmazonRDS/latest/DeveloperGuide/USER_ReadRepl.html) in the
     * *Amazon RDS User Guide* .
     *
     * For information about constraints that apply to DB instance identifiers, see [Naming
     * constraints in Amazon
     * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * in the *Amazon RDS User Guide* .
     *
     * The `SourceDBInstanceIdentifier` property determines whether a DB instance is a read replica.
     * If you remove the `SourceDBInstanceIdentifier` property from your template and then update your
     * stack, AWS CloudFormation promotes the Read Replica to a standalone DB instance.
     *
     *
     * * If you specify a source DB instance that uses VPC security groups, we recommend that you
     * specify the `VPCSecurityGroups` property. If you don't specify the property, the read replica
     * inherits the value of the `VPCSecurityGroups` property from the source DB when you create the
     * replica. However, if you update the stack, AWS CloudFormation reverts the replica's
     * `VPCSecurityGroups` property to the default value because it's not defined in the stack's
     * template. This change might cause unexpected issues.
     * * Read replicas don't support deletion policies. AWS CloudFormation ignores any deletion
     * policy that's associated with a read replica.
     * * If you specify `SourceDBInstanceIdentifier` , don't specify the `DBSnapshotIdentifier`
     * property. You can't create a read replica from a snapshot.
     * * Don't set the `BackupRetentionPeriod` , `DBName` , `MasterUsername` , `MasterUserPassword`
     * , and `PreferredBackupWindow` properties. The database attributes are inherited from the source
     * DB instance, and backups are disabled for read replicas.
     * * If the source DB instance is in a different region than the read replica, specify the
     * source region in `SourceRegion` , and specify an ARN for a valid DB instance in
     * `SourceDBInstanceIdentifier` . For more information, see [Constructing a Amazon RDS Amazon
     * Resource Name
     * (ARN)](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN)
     * in the *Amazon RDS User Guide* .
     * * For DB instances in Amazon Aurora clusters, don't specify this property. Amazon RDS
     * automatically assigns writer and reader DB instances.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier)
     */
    override fun sourceDbInstanceIdentifier(): String? =
        unwrap(this).getSourceDbInstanceIdentifier()

    /**
     * The resource ID of the source DB instance from which to restore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbiresourceid)
     */
    override fun sourceDbiResourceId(): String? = unwrap(this).getSourceDbiResourceId()

    /**
     * The ID of the region that contains the source DB instance for the read replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourceregion)
     */
    override fun sourceRegion(): String? = unwrap(this).getSourceRegion()

    /**
     * A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.
     *
     * If you specify the `KmsKeyId` property, then you must enable encryption.
     *
     * If you specify the `SourceDBInstanceIdentifier` property, don't specify this property. The
     * value is inherited from the source DB instance, and if the DB instance is encrypted, the
     * specified `KmsKeyId` property is used.
     *
     * If you specify the `DBSnapshotIdentifier` and the specified snapshot is encrypted, don't
     * specify this property. The value is inherited from the snapshot, and the specified `KmsKeyId`
     * property is used.
     *
     * If you specify the `DBSnapshotIdentifier` and the specified snapshot isn't encrypted, you can
     * use this property to specify that the restored DB instance is encrypted. Specify the `KmsKeyId`
     * property for the KMS key to use for encryption. If you don't want the restored DB instance to be
     * encrypted, then don't set this property or set it to `false` .
     *
     * *Amazon Aurora*
     *
     * Not applicable. The encryption for DB instances is managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-storageencrypted)
     */
    override fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

    /**
     * Specifies the storage throughput value for the DB instance. This setting applies only to the
     * `gp3` storage type.
     *
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-storagethroughput)
     */
    override fun storageThroughput(): Number? = unwrap(this).getStorageThroughput()

    /**
     * The storage type to associate with the DB instance.
     *
     * If you specify `io1` , `io2` , or `gp3` , you must also include a value for the `Iops`
     * parameter.
     *
     * This setting doesn't apply to Amazon Aurora DB instances. Storage is managed by the DB
     * cluster.
     *
     * Valid Values: `gp2 | gp3 | io1 | io2 | standard`
     *
     * Default: `io1` , if the `Iops` parameter is specified. Otherwise, `gp2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-storagetype)
     */
    override fun storageType(): String? = unwrap(this).getStorageType()

    /**
     * An optional array of key-value pairs to apply to this DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tdecredentialarn)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tdeCredentialArn(): String? = unwrap(this).getTdeCredentialArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tdecredentialpassword)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tdeCredentialPassword(): String? = unwrap(this).getTdeCredentialPassword()

    /**
     * The time zone of the DB instance.
     *
     * The time zone parameter is currently supported only by [Microsoft SQL
     * Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-timezone)
     */
    override fun timezone(): String? = unwrap(this).getTimezone()

    /**
     * Specifies whether the DB instance class of the DB instance uses its default processor
     * features.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-usedefaultprocessorfeatures)
     */
    override fun useDefaultProcessorFeatures(): Any? = unwrap(this).getUseDefaultProcessorFeatures()

    /**
     * Specifies whether the DB instance is restored from the latest backup time.
     *
     * By default, the DB instance isn't restored from the latest backup time.
     *
     * Constraints:
     *
     * * Can't be specified if the `RestoreTime` parameter is provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-uselatestrestorabletime)
     */
    override fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

    /**
     * A list of the VPC security group IDs to assign to the DB instance.
     *
     * The list can include both the physical IDs of existing VPC security groups and references to
     * [AWS::EC2::SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * If you set `VPCSecurityGroups` , you must not set
     * [`DBSecurityGroups`](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
     * , and vice versa.
     *
     *
     * You can migrate a DB instance in your stack from an RDS DB security group to a VPC security
     * group, but keep the following in mind:
     *
     * * You can't revert to using an RDS security group after you establish a VPC security group
     * membership.
     * * When you migrate your DB instance to VPC security groups, if your stack update rolls back
     * because the DB instance update fails or because an update fails in another AWS CloudFormation
     * resource, the rollback fails because it can't revert to an RDS security group.
     * * To use the properties that are available when you use a VPC security group, you must
     * recreate the DB instance. If you don't, AWS CloudFormation submits only the property values that
     * are listed in the
     * [`DBSecurityGroups`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
     * property.
     *
     *
     * To avoid this situation, migrate your DB instance to using VPC security groups only when that
     * is the only change in your stack template.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     * If specified, the setting must match the DB cluster setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-vpcsecuritygroups)
     */
    override fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstanceProps):
        CfnDBInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDBInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBInstanceProps):
        software.amazon.awscdk.services.rds.CfnDBInstanceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.CfnDBInstanceProps
  }
}
