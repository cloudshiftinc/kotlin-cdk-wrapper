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
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::RDS::DBInstance` resource creates an Amazon DB instance.
 *
 * The new DB instance can be an RDS DB instance, or it can be a DB instance in an Aurora DB
 * cluster.
 *
 * For more information about creating an RDS DB instance, see [Creating an Amazon RDS DB
 * instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CreateDBInstance.html) in the
 * *Amazon RDS User Guide* .
 *
 * For more information about creating a DB instance in an Aurora DB cluster, see [Creating an
 * Amazon Aurora DB
 * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.CreateInstance.html) in
 * the *Amazon Aurora User Guide* .
 *
 * If you import an existing DB instance, and the template configuration doesn't match the actual
 * configuration of the DB instance, AWS CloudFormation applies the changes in the template during the
 * import operation.
 *
 *
 * If a DB instance is deleted or replaced during an update, AWS CloudFormation deletes all
 * automated snapshots. However, it retains manual DB snapshots. During an update that requires
 * replacement, you can apply a stack policy to prevent DB instances from being replaced. For more
 * information, see [Prevent Updates to Stack
 * Resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html)
 * .
 *
 *
 * *Updating DB instances*
 *
 * When properties labeled " *Update requires:*
 * [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
 * " are updated, AWS CloudFormation first creates a replacement DB instance, then changes references
 * from other dependent resources to point to the replacement DB instance, and finally deletes the old
 * DB instance.
 *
 *
 * We highly recommend that you take a snapshot of the database before updating the stack. If you
 * don't, you lose the data when AWS CloudFormation replaces your DB instance. To preserve your data,
 * perform the following procedure:
 *
 * * Deactivate any applications that are using the DB instance so that there's no activity on the
 * DB instance.
 * * Create a snapshot of the DB instance. For more information, see [Creating a DB
 * Snapshot](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CreateSnapshot.html) .
 * * If you want to restore your instance using a DB snapshot, modify the updated template with your
 * DB instance changes and add the `DBSnapshotIdentifier` property with the ID of the DB snapshot that
 * you want to use.
 *
 * After you restore a DB instance with a `DBSnapshotIdentifier` property, you can delete the
 * `DBSnapshotIdentifier` property. When you specify this property for an update, the DB instance is
 * not restored from the DB snapshot again, and the data in the database is not changed. However, if
 * you don't specify the `DBSnapshotIdentifier` property, an empty DB instance is created, and the
 * original DB instance is deleted. If you specify a property that is different from the previous
 * snapshot restore property, a new DB instance is restored from the specified `DBSnapshotIdentifier`
 * property, and the original DB instance is deleted.
 *
 * * Update the stack.
 *
 *
 * For more information about updating other properties of this resource, see
 * `[ModifyDBInstance](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_ModifyDBInstance.html)`
 * . For more information about updating stacks, see [AWS CloudFormation Stacks
 * Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
 * .
 *
 * *Deleting DB instances*
 *
 * For DB instances that are part of an Aurora DB cluster, you can set a deletion policy for your DB
 * instance to control how AWS CloudFormation handles the DB instance when the stack is deleted. For
 * Amazon RDS DB instances, you can choose to *retain* the DB instance, to *delete* the DB instance, or
 * to *create a snapshot* of the DB instance. The default AWS CloudFormation behavior depends on the
 * `DBClusterIdentifier` property:
 *
 * * For `AWS::RDS::DBInstance` resources that don't specify the `DBClusterIdentifier` property, AWS
 * CloudFormation saves a snapshot of the DB instance.
 * * For `AWS::RDS::DBInstance` resources that do specify the `DBClusterIdentifier` property, AWS
 * CloudFormation deletes the DB instance.
 *
 * For more information, see [DeletionPolicy
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBInstance cfnDBInstance = CfnDBInstance.Builder.create(this, "MyCfnDBInstance")
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
public open class CfnDBInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The amount of storage in gibibytes (GiB) to be initially allocated for the database instance.
   */
  public open fun allocatedStorage(): String? = unwrap(this).getAllocatedStorage()

  /**
   * The amount of storage in gibibytes (GiB) to be initially allocated for the database instance.
   */
  public open fun allocatedStorage(`value`: String) {
    unwrap(this).setAllocatedStorage(`value`)
  }

  /**
   * A value that indicates whether major version upgrades are allowed.
   */
  public open fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

  /**
   * A value that indicates whether major version upgrades are allowed.
   */
  public open fun allowMajorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAllowMajorVersionUpgrade(`value`)
  }

  /**
   * A value that indicates whether major version upgrades are allowed.
   */
  public open fun allowMajorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAllowMajorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  /**
   * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
   */
  public open fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  /**
   * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
   */
  public open fun associatedRoles(`value`: IResolvable) {
    unwrap(this).setAssociatedRoles(`value`.let(IResolvable::unwrap))
  }

  /**
   * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
   */
  public open fun associatedRoles(`value`: List<Any>) {
    unwrap(this).setAssociatedRoles(`value`)
  }

  /**
   * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
   */
  public open fun associatedRoles(vararg `value`: Any): Unit = associatedRoles(`value`.toList())

  /**
   * The CA identifier of the CA certificate used for the DB instance's server certificate.
   */
  public open fun attrCertificateDetailsCaIdentifier(): String =
      unwrap(this).getAttrCertificateDetailsCaIdentifier()

  /**
   * The expiration date of the DB instance’s server certificate.
   */
  public open fun attrCertificateDetailsValidTill(): String =
      unwrap(this).getAttrCertificateDetailsValidTill()

  /**
   * The Amazon Resource Name (ARN) for the DB instance.
   */
  public open fun attrDbInstanceArn(): String = unwrap(this).getAttrDbInstanceArn()

  /**
   * The Oracle system ID (Oracle SID) for a container database (CDB).
   *
   * The Oracle SID is also the name of the CDB.
   *
   * This setting is valid for RDS Custom only.
   */
  public open fun attrDbSystemId(): String = unwrap(this).getAttrDbSystemId()

  /**
   * The AWS Region-unique, immutable identifier for the DB instance.
   *
   * This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB
   * instance is accessed.
   */
  public open fun attrDbiResourceId(): String = unwrap(this).getAttrDbiResourceId()

  /**
   * The connection endpoint for the database. For example:
   * `mystack-mydb-1apw1j4phylrk.cg034hpkmmjt.us-east-2.rds.amazonaws.com`.
   *
   * For Aurora Serverless DB clusters, the connection endpoint only applies to the DB cluster.
   */
  public open fun attrEndpointAddress(): String = unwrap(this).getAttrEndpointAddress()

  /**
   * The ID that Amazon Route 53 assigns when you create a hosted zone.
   */
  public open fun attrEndpointHostedZoneId(): String = unwrap(this).getAttrEndpointHostedZoneId()

  /**
   * The port number on which the database accepts connections.
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
   * A value that indicates whether minor engine upgrades are applied automatically to the DB
   * instance during the maintenance window.
   */
  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * A value that indicates whether minor engine upgrades are applied automatically to the DB
   * instance during the maintenance window.
   */
  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  /**
   * A value that indicates whether minor engine upgrades are applied automatically to the DB
   * instance during the maintenance window.
   */
  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  /**
   * The destination region for the backup replication of the DB instance.
   */
  public open fun automaticBackupReplicationRegion(): String? =
      unwrap(this).getAutomaticBackupReplicationRegion()

  /**
   * The destination region for the backup replication of the DB instance.
   */
  public open fun automaticBackupReplicationRegion(`value`: String) {
    unwrap(this).setAutomaticBackupReplicationRegion(`value`)
  }

  /**
   * The Availability Zone (AZ) where the database will be created.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone (AZ) where the database will be created.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
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
   * The identifier of the CA certificate for this DB instance.
   */
  public open fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  /**
   * The identifier of the CA certificate for this DB instance.
   */
  public open fun caCertificateIdentifier(`value`: String) {
    unwrap(this).setCaCertificateIdentifier(`value`)
  }

  /**
   * The details of the DB instance's server certificate.
   */
  public open fun certificateDetails(): Any? = unwrap(this).getCertificateDetails()

  /**
   * The details of the DB instance's server certificate.
   */
  public open fun certificateDetails(`value`: IResolvable) {
    unwrap(this).setCertificateDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * The details of the DB instance's server certificate.
   */
  public open fun certificateDetails(`value`: CertificateDetailsProperty) {
    unwrap(this).setCertificateDetails(`value`.let(CertificateDetailsProperty::unwrap))
  }

  /**
   * The details of the DB instance's server certificate.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72c0235a771cef5c2223531d74a28375f5777647f6bad059dc74c67a7be0cf78")
  public open fun certificateDetails(`value`: CertificateDetailsProperty.Builder.() -> Unit): Unit =
      certificateDetails(CertificateDetailsProperty(`value`))

  /**
   * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
   */
  public open fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

  /**
   * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
   */
  public open fun certificateRotationRestart(`value`: Boolean) {
    unwrap(this).setCertificateRotationRestart(`value`)
  }

  /**
   * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
   */
  public open fun certificateRotationRestart(`value`: IResolvable) {
    unwrap(this).setCertificateRotationRestart(`value`.let(IResolvable::unwrap))
  }

  /**
   * For supported engines, indicates that the DB instance should be associated with the specified
   * character set.
   */
  public open fun characterSetName(): String? = unwrap(this).getCharacterSetName()

  /**
   * For supported engines, indicates that the DB instance should be associated with the specified
   * character set.
   */
  public open fun characterSetName(`value`: String) {
    unwrap(this).setCharacterSetName(`value`)
  }

  /**
   * Specifies whether to copy tags from the DB instance to snapshots of the DB instance.
   */
  public open fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  /**
   * Specifies whether to copy tags from the DB instance to snapshots of the DB instance.
   */
  public open fun copyTagsToSnapshot(`value`: Boolean) {
    unwrap(this).setCopyTagsToSnapshot(`value`)
  }

  /**
   * Specifies whether to copy tags from the DB instance to snapshots of the DB instance.
   */
  public open fun copyTagsToSnapshot(`value`: IResolvable) {
    unwrap(this).setCopyTagsToSnapshot(`value`.let(IResolvable::unwrap))
  }

  /**
   * The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB
   * instance.
   */
  public open fun customIamInstanceProfile(): String? = unwrap(this).getCustomIamInstanceProfile()

  /**
   * The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB
   * instance.
   */
  public open fun customIamInstanceProfile(`value`: String) {
    unwrap(this).setCustomIamInstanceProfile(`value`)
  }

  /**
   * The identifier of the DB cluster that the instance will belong to.
   */
  public open fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  /**
   * The identifier of the DB cluster that the instance will belong to.
   */
  public open fun dbClusterIdentifier(`value`: String) {
    unwrap(this).setDbClusterIdentifier(`value`)
  }

  /**
   * The identifier for the Multi-AZ DB cluster snapshot to restore from.
   */
  public open fun dbClusterSnapshotIdentifier(): String? =
      unwrap(this).getDbClusterSnapshotIdentifier()

  /**
   * The identifier for the Multi-AZ DB cluster snapshot to restore from.
   */
  public open fun dbClusterSnapshotIdentifier(`value`: String) {
    unwrap(this).setDbClusterSnapshotIdentifier(`value`)
  }

  /**
   * The compute and memory capacity of the DB instance, for example, `db.m4.large` . Not all DB
   * instance classes are available in all AWS Regions, or for all database engines.
   */
  public open fun dbInstanceClass(): String? = unwrap(this).getDbInstanceClass()

  /**
   * The compute and memory capacity of the DB instance, for example, `db.m4.large` . Not all DB
   * instance classes are available in all AWS Regions, or for all database engines.
   */
  public open fun dbInstanceClass(`value`: String) {
    unwrap(this).setDbInstanceClass(`value`)
  }

  /**
   * A name for the DB instance.
   */
  public open fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

  /**
   * A name for the DB instance.
   */
  public open fun dbInstanceIdentifier(`value`: String) {
    unwrap(this).setDbInstanceIdentifier(`value`)
  }

  /**
   * The meaning of this parameter differs according to the database engine you use.
   */
  public open fun dbName(): String? = unwrap(this).getDbName()

  /**
   * The meaning of this parameter differs according to the database engine you use.
   */
  public open fun dbName(`value`: String) {
    unwrap(this).setDbName(`value`)
  }

  /**
   * The name of an existing DB parameter group or a reference to an
   * [AWS::RDS::DBParameterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html)
   * resource created in the template.
   */
  public open fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

  /**
   * The name of an existing DB parameter group or a reference to an
   * [AWS::RDS::DBParameterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html)
   * resource created in the template.
   */
  public open fun dbParameterGroupName(`value`: String) {
    unwrap(this).setDbParameterGroupName(`value`)
  }

  /**
   * A list of the DB security groups to assign to the DB instance.
   */
  public open fun dbSecurityGroups(): List<String> = unwrap(this).getDbSecurityGroups() ?:
      emptyList()

  /**
   * A list of the DB security groups to assign to the DB instance.
   */
  public open fun dbSecurityGroups(`value`: List<String>) {
    unwrap(this).setDbSecurityGroups(`value`)
  }

  /**
   * A list of the DB security groups to assign to the DB instance.
   */
  public open fun dbSecurityGroups(vararg `value`: String): Unit =
      dbSecurityGroups(`value`.toList())

  /**
   * The name or Amazon Resource Name (ARN) of the DB snapshot that's used to restore the DB
   * instance.
   */
  public open fun dbSnapshotIdentifier(): String? = unwrap(this).getDbSnapshotIdentifier()

  /**
   * The name or Amazon Resource Name (ARN) of the DB snapshot that's used to restore the DB
   * instance.
   */
  public open fun dbSnapshotIdentifier(`value`: String) {
    unwrap(this).setDbSnapshotIdentifier(`value`)
  }

  /**
   * A DB subnet group to associate with the DB instance.
   */
  public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * A DB subnet group to associate with the DB instance.
   */
  public open fun dbSubnetGroupName(`value`: String) {
    unwrap(this).setDbSubnetGroupName(`value`)
  }

  /**
   * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
   */
  public open fun dedicatedLogVolume(): Any? = unwrap(this).getDedicatedLogVolume()

  /**
   * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
   */
  public open fun dedicatedLogVolume(`value`: Boolean) {
    unwrap(this).setDedicatedLogVolume(`value`)
  }

  /**
   * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
   */
  public open fun dedicatedLogVolume(`value`: IResolvable) {
    unwrap(this).setDedicatedLogVolume(`value`.let(IResolvable::unwrap))
  }

  /**
   * A value that indicates whether to remove automated backups immediately after the DB instance is
   * deleted.
   */
  public open fun deleteAutomatedBackups(): Any? = unwrap(this).getDeleteAutomatedBackups()

  /**
   * A value that indicates whether to remove automated backups immediately after the DB instance is
   * deleted.
   */
  public open fun deleteAutomatedBackups(`value`: Boolean) {
    unwrap(this).setDeleteAutomatedBackups(`value`)
  }

  /**
   * A value that indicates whether to remove automated backups immediately after the DB instance is
   * deleted.
   */
  public open fun deleteAutomatedBackups(`value`: IResolvable) {
    unwrap(this).setDeleteAutomatedBackups(`value`.let(IResolvable::unwrap))
  }

  /**
   * A value that indicates whether the DB instance has deletion protection enabled.
   */
  public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * A value that indicates whether the DB instance has deletion protection enabled.
   */
  public open fun deletionProtection(`value`: Boolean) {
    unwrap(this).setDeletionProtection(`value`)
  }

  /**
   * A value that indicates whether the DB instance has deletion protection enabled.
   */
  public open fun deletionProtection(`value`: IResolvable) {
    unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Active Directory directory ID to create the DB instance in.
   */
  public open fun domain(): String? = unwrap(this).getDomain()

  /**
   * The Active Directory directory ID to create the DB instance in.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  /**
   * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
   */
  public open fun domainAuthSecretArn(): String? = unwrap(this).getDomainAuthSecretArn()

  /**
   * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
   */
  public open fun domainAuthSecretArn(`value`: String) {
    unwrap(this).setDomainAuthSecretArn(`value`)
  }

  /**
   * The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.
   */
  public open fun domainDnsIps(): List<String> = unwrap(this).getDomainDnsIps() ?: emptyList()

  /**
   * The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.
   */
  public open fun domainDnsIps(`value`: List<String>) {
    unwrap(this).setDomainDnsIps(`value`)
  }

  /**
   * The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.
   */
  public open fun domainDnsIps(vararg `value`: String): Unit = domainDnsIps(`value`.toList())

  /**
   * The fully qualified domain name (FQDN) of an Active Directory domain.
   */
  public open fun domainFqdn(): String? = unwrap(this).getDomainFqdn()

  /**
   * The fully qualified domain name (FQDN) of an Active Directory domain.
   */
  public open fun domainFqdn(`value`: String) {
    unwrap(this).setDomainFqdn(`value`)
  }

  /**
   * The name of the IAM role to use when making API calls to the Directory Service.
   */
  public open fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

  /**
   * The name of the IAM role to use when making API calls to the Directory Service.
   */
  public open fun domainIamRoleName(`value`: String) {
    unwrap(this).setDomainIamRoleName(`value`)
  }

  /**
   * The Active Directory organizational unit for your DB instance to join.
   */
  public open fun domainOu(): String? = unwrap(this).getDomainOu()

  /**
   * The Active Directory organizational unit for your DB instance to join.
   */
  public open fun domainOu(`value`: String) {
    unwrap(this).setDomainOu(`value`)
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
   * Specifies whether to enable Performance Insights for the DB instance.
   */
  public open fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

  /**
   * Specifies whether to enable Performance Insights for the DB instance.
   */
  public open fun enablePerformanceInsights(`value`: Boolean) {
    unwrap(this).setEnablePerformanceInsights(`value`)
  }

  /**
   * Specifies whether to enable Performance Insights for the DB instance.
   */
  public open fun enablePerformanceInsights(`value`: IResolvable) {
    unwrap(this).setEnablePerformanceInsights(`value`.let(IResolvable::unwrap))
  }

  /**
   * The connection endpoint for the DB instance.
   */
  public open fun endpoint(): Any? = unwrap(this).getEndpoint()

  /**
   * The connection endpoint for the DB instance.
   */
  public open fun endpoint(`value`: IResolvable) {
    unwrap(this).setEndpoint(`value`.let(IResolvable::unwrap))
  }

  /**
   * The connection endpoint for the DB instance.
   */
  public open fun endpoint(`value`: EndpointProperty) {
    unwrap(this).setEndpoint(`value`.let(EndpointProperty::unwrap))
  }

  /**
   * The connection endpoint for the DB instance.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("675265e7a9b1c675662bf4e5ee24963e9bdfa23cca88d689215d07fa6833d5fc")
  public open fun endpoint(`value`: EndpointProperty.Builder.() -> Unit): Unit =
      endpoint(EndpointProperty(`value`))

  /**
   * The name of the database engine that you want to use for this DB instance.
   */
  public open fun engine(): String? = unwrap(this).getEngine()

  /**
   * The name of the database engine that you want to use for this DB instance.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
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
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The number of I/O operations per second (IOPS) that the database provisions.
   */
  public open fun iops(): Number? = unwrap(this).getIops()

  /**
   * The number of I/O operations per second (IOPS) that the database provisions.
   */
  public open fun iops(`value`: Number) {
    unwrap(this).setIops(`value`)
  }

  /**
   * The ARN of the AWS KMS key that's used to encrypt the DB instance, such as
   * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ARN of the AWS KMS key that's used to encrypt the DB instance, such as
   * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` .
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * License model information for this DB instance.
   */
  public open fun licenseModel(): String? = unwrap(this).getLicenseModel()

  /**
   * License model information for this DB instance.
   */
  public open fun licenseModel(`value`: String) {
    unwrap(this).setLicenseModel(`value`)
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
   * The password for the master user.
   *
   * The password can include any printable ASCII character except "/", """, or "&#64;".
   */
  public open fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  /**
   * The password for the master user.
   *
   * The password can include any printable ASCII character except "/", """, or "&#64;".
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
  @JvmName("62c7cc57cdb59a1a7d8a9a6e969b261b145d1740266c88a6f594ec67cedfc2c1")
  public open fun masterUserSecret(`value`: MasterUserSecretProperty.Builder.() -> Unit): Unit =
      masterUserSecret(MasterUserSecretProperty(`value`))

  /**
   * The master user name for the DB instance.
   */
  public open fun masterUsername(): String? = unwrap(this).getMasterUsername()

  /**
   * The master user name for the DB instance.
   */
  public open fun masterUsername(`value`: String) {
    unwrap(this).setMasterUsername(`value`)
  }

  /**
   * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of
   * the DB instance.
   */
  public open fun maxAllocatedStorage(): Number? = unwrap(this).getMaxAllocatedStorage()

  /**
   * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of
   * the DB instance.
   */
  public open fun maxAllocatedStorage(`value`: Number) {
    unwrap(this).setMaxAllocatedStorage(`value`)
  }

  /**
   * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the
   * DB instance.
   */
  public open fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

  /**
   * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the
   * DB instance.
   */
  public open fun monitoringInterval(`value`: Number) {
    unwrap(this).setMonitoringInterval(`value`)
  }

  /**
   * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon
   * CloudWatch Logs.
   */
  public open fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

  /**
   * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon
   * CloudWatch Logs.
   */
  public open fun monitoringRoleArn(`value`: String) {
    unwrap(this).setMonitoringRoleArn(`value`)
  }

  /**
   * Specifies whether the database instance is a Multi-AZ DB instance deployment.
   */
  public open fun multiAz(): Any? = unwrap(this).getMultiAz()

  /**
   * Specifies whether the database instance is a Multi-AZ DB instance deployment.
   */
  public open fun multiAz(`value`: Boolean) {
    unwrap(this).setMultiAz(`value`)
  }

  /**
   * Specifies whether the database instance is a Multi-AZ DB instance deployment.
   */
  public open fun multiAz(`value`: IResolvable) {
    unwrap(this).setMultiAz(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the NCHAR character set for the Oracle DB instance.
   */
  public open fun ncharCharacterSetName(): String? = unwrap(this).getNcharCharacterSetName()

  /**
   * The name of the NCHAR character set for the Oracle DB instance.
   */
  public open fun ncharCharacterSetName(`value`: String) {
    unwrap(this).setNcharCharacterSetName(`value`)
  }

  /**
   * The network type of the DB instance.
   */
  public open fun networkType(): String? = unwrap(this).getNetworkType()

  /**
   * The network type of the DB instance.
   */
  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
  }

  /**
   * Indicates that the DB instance should be associated with the specified option group.
   */
  public open fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

  /**
   * Indicates that the DB instance should be associated with the specified option group.
   */
  public open fun optionGroupName(`value`: String) {
    unwrap(this).setOptionGroupName(`value`)
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
   * The port number on which the database accepts connections.
   */
  public open fun port(): String? = unwrap(this).getPort()

  /**
   * The port number on which the database accepts connections.
   */
  public open fun port(`value`: String) {
    unwrap(this).setPort(`value`)
  }

  /**
   * The daily time range during which automated backups are created if automated backups are
   * enabled, using the `BackupRetentionPeriod` parameter.
   */
  public open fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The daily time range during which automated backups are created if automated backups are
   * enabled, using the `BackupRetentionPeriod` parameter.
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
   * The number of CPU cores and the number of threads per core for the DB instance class of the DB
   * instance.
   */
  public open fun processorFeatures(): Any? = unwrap(this).getProcessorFeatures()

  /**
   * The number of CPU cores and the number of threads per core for the DB instance class of the DB
   * instance.
   */
  public open fun processorFeatures(`value`: IResolvable) {
    unwrap(this).setProcessorFeatures(`value`.let(IResolvable::unwrap))
  }

  /**
   * The number of CPU cores and the number of threads per core for the DB instance class of the DB
   * instance.
   */
  public open fun processorFeatures(`value`: List<Any>) {
    unwrap(this).setProcessorFeatures(`value`)
  }

  /**
   * The number of CPU cores and the number of threads per core for the DB instance class of the DB
   * instance.
   */
  public open fun processorFeatures(vararg `value`: Any): Unit = processorFeatures(`value`.toList())

  /**
   * The order of priority in which an Aurora Replica is promoted to the primary instance after a
   * failure of the existing primary instance.
   */
  public open fun promotionTier(): Number? = unwrap(this).getPromotionTier()

  /**
   * The order of priority in which an Aurora Replica is promoted to the primary instance after a
   * failure of the existing primary instance.
   */
  public open fun promotionTier(`value`: Number) {
    unwrap(this).setPromotionTier(`value`)
  }

  /**
   * Indicates whether the DB instance is an internet-facing instance.
   */
  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * Indicates whether the DB instance is an internet-facing instance.
   */
  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  /**
   * Indicates whether the DB instance is an internet-facing instance.
   */
  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  /**
   * The open mode of an Oracle read replica.
   */
  public open fun replicaMode(): String? = unwrap(this).getReplicaMode()

  /**
   * The open mode of an Oracle read replica.
   */
  public open fun replicaMode(`value`: String) {
    unwrap(this).setReplicaMode(`value`)
  }

  /**
   * The date and time to restore from.
   */
  public open fun restoreTime(): String? = unwrap(this).getRestoreTime()

  /**
   * The date and time to restore from.
   */
  public open fun restoreTime(`value`: String) {
    unwrap(this).setRestoreTime(`value`)
  }

  /**
   * The identifier of the Multi-AZ DB cluster that will act as the source for the read replica.
   */
  public open fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  /**
   * The identifier of the Multi-AZ DB cluster that will act as the source for the read replica.
   */
  public open fun sourceDbClusterIdentifier(`value`: String) {
    unwrap(this).setSourceDbClusterIdentifier(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for
   * example, `arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE` .
   */
  public open fun sourceDbInstanceAutomatedBackupsArn(): String? =
      unwrap(this).getSourceDbInstanceAutomatedBackupsArn()

  /**
   * The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for
   * example, `arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE` .
   */
  public open fun sourceDbInstanceAutomatedBackupsArn(`value`: String) {
    unwrap(this).setSourceDbInstanceAutomatedBackupsArn(`value`)
  }

  /**
   * If you want to create a read replica DB instance, specify the ID of the source DB instance.
   */
  public open fun sourceDbInstanceIdentifier(): String? =
      unwrap(this).getSourceDbInstanceIdentifier()

  /**
   * If you want to create a read replica DB instance, specify the ID of the source DB instance.
   */
  public open fun sourceDbInstanceIdentifier(`value`: String) {
    unwrap(this).setSourceDbInstanceIdentifier(`value`)
  }

  /**
   * The resource ID of the source DB instance from which to restore.
   */
  public open fun sourceDbiResourceId(): String? = unwrap(this).getSourceDbiResourceId()

  /**
   * The resource ID of the source DB instance from which to restore.
   */
  public open fun sourceDbiResourceId(`value`: String) {
    unwrap(this).setSourceDbiResourceId(`value`)
  }

  /**
   * The ID of the region that contains the source DB instance for the read replica.
   */
  public open fun sourceRegion(): String? = unwrap(this).getSourceRegion()

  /**
   * The ID of the region that contains the source DB instance for the read replica.
   */
  public open fun sourceRegion(`value`: String) {
    unwrap(this).setSourceRegion(`value`)
  }

  /**
   * A value that indicates whether the DB instance is encrypted.
   *
   * By default, it isn't encrypted.
   */
  public open fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  /**
   * A value that indicates whether the DB instance is encrypted.
   *
   * By default, it isn't encrypted.
   */
  public open fun storageEncrypted(`value`: Boolean) {
    unwrap(this).setStorageEncrypted(`value`)
  }

  /**
   * A value that indicates whether the DB instance is encrypted.
   *
   * By default, it isn't encrypted.
   */
  public open fun storageEncrypted(`value`: IResolvable) {
    unwrap(this).setStorageEncrypted(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the storage throughput value for the DB instance.
   *
   * This setting applies only to the `gp3` storage type.
   */
  public open fun storageThroughput(): Number? = unwrap(this).getStorageThroughput()

  /**
   * Specifies the storage throughput value for the DB instance.
   *
   * This setting applies only to the `gp3` storage type.
   */
  public open fun storageThroughput(`value`: Number) {
    unwrap(this).setStorageThroughput(`value`)
  }

  /**
   * Specifies the storage type to be associated with the DB instance.
   */
  public open fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * Specifies the storage type to be associated with the DB instance.
   */
  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An optional array of key-value pairs to apply to this DB instance.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An optional array of key-value pairs to apply to this DB instance.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An optional array of key-value pairs to apply to this DB instance.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun tdeCredentialArn(): String? = unwrap(this).getTdeCredentialArn()

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun tdeCredentialArn(`value`: String) {
    unwrap(this).setTdeCredentialArn(`value`)
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun tdeCredentialPassword(): String? = unwrap(this).getTdeCredentialPassword()

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun tdeCredentialPassword(`value`: String) {
    unwrap(this).setTdeCredentialPassword(`value`)
  }

  /**
   * The time zone of the DB instance.
   */
  public open fun timezone(): String? = unwrap(this).getTimezone()

  /**
   * The time zone of the DB instance.
   */
  public open fun timezone(`value`: String) {
    unwrap(this).setTimezone(`value`)
  }

  /**
   * Specifies whether the DB instance class of the DB instance uses its default processor features.
   */
  public open fun useDefaultProcessorFeatures(): Any? =
      unwrap(this).getUseDefaultProcessorFeatures()

  /**
   * Specifies whether the DB instance class of the DB instance uses its default processor features.
   */
  public open fun useDefaultProcessorFeatures(`value`: Boolean) {
    unwrap(this).setUseDefaultProcessorFeatures(`value`)
  }

  /**
   * Specifies whether the DB instance class of the DB instance uses its default processor features.
   */
  public open fun useDefaultProcessorFeatures(`value`: IResolvable) {
    unwrap(this).setUseDefaultProcessorFeatures(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether the DB instance is restored from the latest backup time.
   */
  public open fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  /**
   * Specifies whether the DB instance is restored from the latest backup time.
   */
  public open fun useLatestRestorableTime(`value`: Boolean) {
    unwrap(this).setUseLatestRestorableTime(`value`)
  }

  /**
   * Specifies whether the DB instance is restored from the latest backup time.
   */
  public open fun useLatestRestorableTime(`value`: IResolvable) {
    unwrap(this).setUseLatestRestorableTime(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of the VPC security group IDs to assign to the DB instance.
   */
  public open fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?:
      emptyList()

  /**
   * A list of the VPC security group IDs to assign to the DB instance.
   */
  public open fun vpcSecurityGroups(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroups(`value`)
  }

  /**
   * A list of the VPC security group IDs to assign to the DB instance.
   */
  public open fun vpcSecurityGroups(vararg `value`: String): Unit =
      vpcSecurityGroups(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBInstance].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param allocatedStorage The amount of storage in gibibytes (GiB) to be initially allocated
     * for the database instance. 
     */
    public fun allocatedStorage(allocatedStorage: String)

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
     * @param allowMajorVersionUpgrade A value that indicates whether major version upgrades are
     * allowed. 
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

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
     * @param allowMajorVersionUpgrade A value that indicates whether major version upgrades are
     * allowed. 
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable)

    /**
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-associatedroles)
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance. 
     */
    public fun associatedRoles(associatedRoles: IResolvable)

    /**
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-associatedroles)
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance. 
     */
    public fun associatedRoles(associatedRoles: List<Any>)

    /**
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-associatedroles)
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance. 
     */
    public fun associatedRoles(vararg associatedRoles: Any)

    /**
     * A value that indicates whether minor engine upgrades are applied automatically to the DB
     * instance during the maintenance window.
     *
     * By default, minor engine upgrades are applied automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the DB instance during the maintenance window. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * A value that indicates whether minor engine upgrades are applied automatically to the DB
     * instance during the maintenance window.
     *
     * By default, minor engine upgrades are applied automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the DB instance during the maintenance window. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * The destination region for the backup replication of the DB instance.
     *
     * For more info, see [Replicating automated backups to another AWS
     * Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html) in
     * the *Amazon RDS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-automaticbackupreplicationregion)
     * @param automaticBackupReplicationRegion The destination region for the backup replication of
     * the DB instance. 
     */
    public fun automaticBackupReplicationRegion(automaticBackupReplicationRegion: String)

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
     * @param availabilityZone The Availability Zone (AZ) where the database will be created. 
     */
    public fun availabilityZone(availabilityZone: String)

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
     * @param backupRetentionPeriod The number of days for which automated backups are retained. 
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

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
     * @param caCertificateIdentifier The identifier of the CA certificate for this DB instance. 
     */
    public fun caCertificateIdentifier(caCertificateIdentifier: String)

    /**
     * The details of the DB instance's server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-certificatedetails)
     * @param certificateDetails The details of the DB instance's server certificate. 
     */
    public fun certificateDetails(certificateDetails: IResolvable)

    /**
     * The details of the DB instance's server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-certificatedetails)
     * @param certificateDetails The details of the DB instance's server certificate. 
     */
    public fun certificateDetails(certificateDetails: CertificateDetailsProperty)

    /**
     * The details of the DB instance's server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-certificatedetails)
     * @param certificateDetails The details of the DB instance's server certificate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("527e2d3895792e597e6dd0df6c49c0c759da008f3ce325ffa8f5506a21c6806b")
    public fun certificateDetails(certificateDetails: CertificateDetailsProperty.Builder.() -> Unit)

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
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate. 
     */
    public fun certificateRotationRestart(certificateRotationRestart: Boolean)

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
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate. 
     */
    public fun certificateRotationRestart(certificateRotationRestart: IResolvable)

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
     * @param characterSetName For supported engines, indicates that the DB instance should be
     * associated with the specified character set. 
     */
    public fun characterSetName(characterSetName: String)

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
     * @param copyTagsToSnapshot Specifies whether to copy tags from the DB instance to snapshots of
     * the DB instance. 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

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
     * @param copyTagsToSnapshot Specifies whether to copy tags from the DB instance to snapshots of
     * the DB instance. 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

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
     * @param customIamInstanceProfile The instance profile associated with the underlying Amazon
     * EC2 instance of an RDS Custom DB instance. 
     */
    public fun customIamInstanceProfile(customIamInstanceProfile: String)

    /**
     * The identifier of the DB cluster that the instance will belong to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbclusteridentifier)
     * @param dbClusterIdentifier The identifier of the DB cluster that the instance will belong to.
     * 
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

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
     * @param dbClusterSnapshotIdentifier The identifier for the Multi-AZ DB cluster snapshot to
     * restore from. 
     */
    public fun dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier: String)

    /**
     * The compute and memory capacity of the DB instance, for example, `db.m4.large` . Not all DB
     * instance classes are available in all AWS Regions, or for all database engines.
     *
     * For the full list of DB instance classes, and availability for your engine, see [DB Instance
     * Class](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) in
     * the *Amazon RDS User Guide.* For more information about DB instance class pricing and AWS Region
     * support for DB instance classes, see [Amazon RDS
     * Pricing](https://docs.aws.amazon.com/rds/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbinstanceclass)
     * @param dbInstanceClass The compute and memory capacity of the DB instance, for example,
     * `db.m4.large` . Not all DB instance classes are available in all AWS Regions, or for all
     * database engines. 
     */
    public fun dbInstanceClass(dbInstanceClass: String)

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
     * @param dbInstanceIdentifier A name for the DB instance. 
     */
    public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

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
     * @param dbName The meaning of this parameter differs according to the database engine you use.
     * 
     */
    public fun dbName(dbName: String)

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
     * @param dbParameterGroupName The name of an existing DB parameter group or a reference to an
     * [AWS::RDS::DBParameterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html)
     * resource created in the template. 
     */
    public fun dbParameterGroupName(dbParameterGroupName: String)

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
     * @param dbSecurityGroups A list of the DB security groups to assign to the DB instance. 
     */
    public fun dbSecurityGroups(dbSecurityGroups: List<String>)

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
     * @param dbSecurityGroups A list of the DB security groups to assign to the DB instance. 
     */
    public fun dbSecurityGroups(vararg dbSecurityGroups: String)

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
     * @param dbSnapshotIdentifier The name or Amazon Resource Name (ARN) of the DB snapshot that's
     * used to restore the DB instance. 
     */
    public fun dbSnapshotIdentifier(dbSnapshotIdentifier: String)

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
     * @param dbSubnetGroupName A DB subnet group to associate with the DB instance. 
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dedicatedlogvolume)
     * @param dedicatedLogVolume Indicates whether the DB instance has a dedicated log volume (DLV)
     * enabled. 
     */
    public fun dedicatedLogVolume(dedicatedLogVolume: Boolean)

    /**
     * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dedicatedlogvolume)
     * @param dedicatedLogVolume Indicates whether the DB instance has a dedicated log volume (DLV)
     * enabled. 
     */
    public fun dedicatedLogVolume(dedicatedLogVolume: IResolvable)

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
     * @param deleteAutomatedBackups A value that indicates whether to remove automated backups
     * immediately after the DB instance is deleted. 
     */
    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean)

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
     * @param deleteAutomatedBackups A value that indicates whether to remove automated backups
     * immediately after the DB instance is deleted. 
     */
    public fun deleteAutomatedBackups(deleteAutomatedBackups: IResolvable)

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
     * @param deletionProtection A value that indicates whether the DB instance has deletion
     * protection enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

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
     * @param deletionProtection A value that indicates whether the DB instance has deletion
     * protection enabled. 
     */
    public fun deletionProtection(deletionProtection: IResolvable)

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
     * @param domain The Active Directory directory ID to create the DB instance in. 
     */
    public fun domain(domain: String)

    /**
     * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
     *
     * Example:
     * `arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainauthsecretarn)
     * @param domainAuthSecretArn The ARN for the Secrets Manager secret with the credentials for
     * the user joining the domain. 
     */
    public fun domainAuthSecretArn(domainAuthSecretArn: String)

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
     * @param domainDnsIps The IPv4 DNS IP addresses of your primary and secondary Active Directory
     * domain controllers. 
     */
    public fun domainDnsIps(domainDnsIps: List<String>)

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
     * @param domainDnsIps The IPv4 DNS IP addresses of your primary and secondary Active Directory
     * domain controllers. 
     */
    public fun domainDnsIps(vararg domainDnsIps: String)

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
     * @param domainFqdn The fully qualified domain name (FQDN) of an Active Directory domain. 
     */
    public fun domainFqdn(domainFqdn: String)

    /**
     * The name of the IAM role to use when making API calls to the Directory Service.
     *
     * This setting doesn't apply to the following DB instances:
     *
     * * Amazon Aurora (The domain is managed by the DB cluster.)
     * * RDS Custom
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainiamrolename)
     * @param domainIamRoleName The name of the IAM role to use when making API calls to the
     * Directory Service. 
     */
    public fun domainIamRoleName(domainIamRoleName: String)

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
     * @param domainOu The Active Directory organizational unit for your DB instance to join. 
     */
    public fun domainOu(domainOu: String)

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
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs. 
     */
    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

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
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs. 
     */
    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

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
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts. 
     */
    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable)

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
     * @param enablePerformanceInsights Specifies whether to enable Performance Insights for the DB
     * instance. 
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

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
     * @param enablePerformanceInsights Specifies whether to enable Performance Insights for the DB
     * instance. 
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: IResolvable)

    /**
     * The connection endpoint for the DB instance.
     *
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-endpoint)
     * @param endpoint The connection endpoint for the DB instance. 
     */
    public fun endpoint(endpoint: IResolvable)

    /**
     * The connection endpoint for the DB instance.
     *
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-endpoint)
     * @param endpoint The connection endpoint for the DB instance. 
     */
    public fun endpoint(endpoint: EndpointProperty)

    /**
     * The connection endpoint for the DB instance.
     *
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-endpoint)
     * @param endpoint The connection endpoint for the DB instance. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4452934eeca24e633389478e0f49757d09a975774c1f229cfa992255ae2a6b9a")
    public fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit)

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
     * @param engine The name of the database engine that you want to use for this DB instance. 
     */
    public fun engine(engine: String)

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
     * @param engineVersion The version number of the database engine to use. 
     */
    public fun engineVersion(engineVersion: String)

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
     * @param iops The number of I/O operations per second (IOPS) that the database provisions. 
     */
    public fun iops(iops: Number)

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
     * @param kmsKeyId The ARN of the AWS KMS key that's used to encrypt the DB instance, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` . 
     */
    public fun kmsKeyId(kmsKeyId: String)

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
     * @param licenseModel License model information for this DB instance. 
     */
    public fun licenseModel(licenseModel: String)

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
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager. 
     */
    public fun manageMasterUserPassword(manageMasterUserPassword: Boolean)

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
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager. 
     */
    public fun manageMasterUserPassword(manageMasterUserPassword: IResolvable)

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
     * @param masterUserPassword The password for the master user. The password can include any
     * printable ASCII character except "/", """, or "&#64;". 
     */
    public fun masterUserPassword(masterUserPassword: String)

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masterusersecret)
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password. 
     */
    public fun masterUserSecret(masterUserSecret: IResolvable)

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masterusersecret)
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password. 
     */
    public fun masterUserSecret(masterUserSecret: MasterUserSecretProperty)

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masterusersecret)
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd2e9e3e70cdc72e383888e63bd1e2a69e4b1df6b4c3b633e7736d38e672fb2c")
    public fun masterUserSecret(masterUserSecret: MasterUserSecretProperty.Builder.() -> Unit)

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
     * @param masterUsername The master user name for the DB instance. 
     */
    public fun masterUsername(masterUsername: String)

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
     * @param maxAllocatedStorage The upper limit in gibibytes (GiB) to which Amazon RDS can
     * automatically scale the storage of the DB instance. 
     */
    public fun maxAllocatedStorage(maxAllocatedStorage: Number)

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
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB instance. 
     */
    public fun monitoringInterval(monitoringInterval: Number)

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
     * @param monitoringRoleArn The ARN for the IAM role that permits RDS to send enhanced
     * monitoring metrics to Amazon CloudWatch Logs. 
     */
    public fun monitoringRoleArn(monitoringRoleArn: String)

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
     * @param multiAz Specifies whether the database instance is a Multi-AZ DB instance deployment. 
     */
    public fun multiAz(multiAz: Boolean)

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
     * @param multiAz Specifies whether the database instance is a Multi-AZ DB instance deployment. 
     */
    public fun multiAz(multiAz: IResolvable)

    /**
     * The name of the NCHAR character set for the Oracle DB instance.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-ncharcharactersetname)
     * @param ncharCharacterSetName The name of the NCHAR character set for the Oracle DB instance. 
     */
    public fun ncharCharacterSetName(ncharCharacterSetName: String)

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
     * @param networkType The network type of the DB instance. 
     */
    public fun networkType(networkType: String)

    /**
     * Indicates that the DB instance should be associated with the specified option group.
     *
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed
     * from an option group. Also, that option group can't be removed from a DB instance once it is
     * associated with a DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-optiongroupname)
     * @param optionGroupName Indicates that the DB instance should be associated with the specified
     * option group. 
     */
    public fun optionGroupName(optionGroupName: String)

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
     * @param performanceInsightsKmsKeyId The AWS KMS key identifier for encryption of Performance
     * Insights data. 
     */
    public fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String)

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
     * @param performanceInsightsRetentionPeriod The number of days to retain Performance Insights
     * data. 
     */
    public fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number)

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
     * @param port The port number on which the database accepts connections. 
     */
    public fun port(port: String)

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
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled, using the `BackupRetentionPeriod` parameter. 
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
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC). 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * The number of CPU cores and the number of threads per core for the DB instance class of the
     * DB instance.
     *
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-processorfeatures)
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance. 
     */
    public fun processorFeatures(processorFeatures: IResolvable)

    /**
     * The number of CPU cores and the number of threads per core for the DB instance class of the
     * DB instance.
     *
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-processorfeatures)
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance. 
     */
    public fun processorFeatures(processorFeatures: List<Any>)

    /**
     * The number of CPU cores and the number of threads per core for the DB instance class of the
     * DB instance.
     *
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-processorfeatures)
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance. 
     */
    public fun processorFeatures(vararg processorFeatures: Any)

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
     * @param promotionTier The order of priority in which an Aurora Replica is promoted to the
     * primary instance after a failure of the existing primary instance. 
     */
    public fun promotionTier(promotionTier: Number)

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
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

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
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

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
     * @param replicaMode The open mode of an Oracle read replica. 
     */
    public fun replicaMode(replicaMode: String)

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
     * @param restoreTime The date and time to restore from. 
     */
    public fun restoreTime(restoreTime: String)

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
     * @param sourceDbClusterIdentifier The identifier of the Multi-AZ DB cluster that will act as
     * the source for the read replica. 
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    /**
     * The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for
     * example, `arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE` .
     *
     * This setting doesn't apply to RDS Custom.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbinstanceautomatedbackupsarn)
     * @param sourceDbInstanceAutomatedBackupsArn The Amazon Resource Name (ARN) of the replicated
     * automated backups from which to restore, for example,
     * `arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE` . 
     */
    public fun sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn: String)

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
     * @param sourceDbInstanceIdentifier If you want to create a read replica DB instance, specify
     * the ID of the source DB instance. 
     */
    public fun sourceDbInstanceIdentifier(sourceDbInstanceIdentifier: String)

    /**
     * The resource ID of the source DB instance from which to restore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbiresourceid)
     * @param sourceDbiResourceId The resource ID of the source DB instance from which to restore. 
     */
    public fun sourceDbiResourceId(sourceDbiResourceId: String)

    /**
     * The ID of the region that contains the source DB instance for the read replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourceregion)
     * @param sourceRegion The ID of the region that contains the source DB instance for the read
     * replica. 
     */
    public fun sourceRegion(sourceRegion: String)

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
     * @param storageEncrypted A value that indicates whether the DB instance is encrypted. By
     * default, it isn't encrypted. 
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

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
     * @param storageEncrypted A value that indicates whether the DB instance is encrypted. By
     * default, it isn't encrypted. 
     */
    public fun storageEncrypted(storageEncrypted: IResolvable)

    /**
     * Specifies the storage throughput value for the DB instance. This setting applies only to the
     * `gp3` storage type.
     *
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-storagethroughput)
     * @param storageThroughput Specifies the storage throughput value for the DB instance. This
     * setting applies only to the `gp3` storage type. 
     */
    public fun storageThroughput(storageThroughput: Number)

    /**
     * Specifies the storage type to be associated with the DB instance.
     *
     * Valid values: `gp2 | gp3 | io1 | standard`
     *
     * The `standard` value is also known as magnetic.
     *
     * If you specify `io1` or `gp3` , you must also include a value for the `Iops` parameter.
     *
     * Default: `io1` if the `Iops` parameter is specified, otherwise `gp2`
     *
     * For more information, see [Amazon RDS DB Instance
     * Storage](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html) in the
     * *Amazon RDS User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. Aurora data is stored in the cluster volume, which is a single, virtual
     * volume that uses solid state drives (SSDs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-storagetype)
     * @param storageType Specifies the storage type to be associated with the DB instance. 
     */
    public fun storageType(storageType: String)

    /**
     * An optional array of key-value pairs to apply to this DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tags)
     * @param tags An optional array of key-value pairs to apply to this DB instance. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional array of key-value pairs to apply to this DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tags)
     * @param tags An optional array of key-value pairs to apply to this DB instance. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tdecredentialarn)
     * @deprecated this property has been deprecated
     * @param tdeCredentialArn 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tdeCredentialArn(tdeCredentialArn: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tdecredentialpassword)
     * @deprecated this property has been deprecated
     * @param tdeCredentialPassword 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tdeCredentialPassword(tdeCredentialPassword: String)

    /**
     * The time zone of the DB instance.
     *
     * The time zone parameter is currently supported only by [Microsoft SQL
     * Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-timezone)
     * @param timezone The time zone of the DB instance. 
     */
    public fun timezone(timezone: String)

    /**
     * Specifies whether the DB instance class of the DB instance uses its default processor
     * features.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-usedefaultprocessorfeatures)
     * @param useDefaultProcessorFeatures Specifies whether the DB instance class of the DB instance
     * uses its default processor features. 
     */
    public fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: Boolean)

    /**
     * Specifies whether the DB instance class of the DB instance uses its default processor
     * features.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-usedefaultprocessorfeatures)
     * @param useDefaultProcessorFeatures Specifies whether the DB instance class of the DB instance
     * uses its default processor features. 
     */
    public fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: IResolvable)

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
     * @param useLatestRestorableTime Specifies whether the DB instance is restored from the latest
     * backup time. 
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

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
     * @param useLatestRestorableTime Specifies whether the DB instance is restored from the latest
     * backup time. 
     */
    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

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
     * @param vpcSecurityGroups A list of the VPC security group IDs to assign to the DB instance. 
     */
    public fun vpcSecurityGroups(vpcSecurityGroups: List<String>)

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
     * @param vpcSecurityGroups A list of the VPC security group IDs to assign to the DB instance. 
     */
    public fun vpcSecurityGroups(vararg vpcSecurityGroups: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBInstance.Builder =
        software.amazon.awscdk.services.rds.CfnDBInstance.Builder.create(scope, id)

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
     * @param allocatedStorage The amount of storage in gibibytes (GiB) to be initially allocated
     * for the database instance. 
     */
    override fun allocatedStorage(allocatedStorage: String) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

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
     * @param allowMajorVersionUpgrade A value that indicates whether major version upgrades are
     * allowed. 
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

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
     * @param allowMajorVersionUpgrade A value that indicates whether major version upgrades are
     * allowed. 
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-associatedroles)
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance. 
     */
    override fun associatedRoles(associatedRoles: IResolvable) {
      cdkBuilder.associatedRoles(associatedRoles.let(IResolvable::unwrap))
    }

    /**
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-associatedroles)
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance. 
     */
    override fun associatedRoles(associatedRoles: List<Any>) {
      cdkBuilder.associatedRoles(associatedRoles)
    }

    /**
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     *
     * *Amazon Aurora*
     *
     * Not applicable. The associated roles are managed by the DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-associatedroles)
     * @param associatedRoles The AWS Identity and Access Management (IAM) roles associated with the
     * DB instance. 
     */
    override fun associatedRoles(vararg associatedRoles: Any): Unit =
        associatedRoles(associatedRoles.toList())

    /**
     * A value that indicates whether minor engine upgrades are applied automatically to the DB
     * instance during the maintenance window.
     *
     * By default, minor engine upgrades are applied automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the DB instance during the maintenance window. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * A value that indicates whether minor engine upgrades are applied automatically to the DB
     * instance during the maintenance window.
     *
     * By default, minor engine upgrades are applied automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-autominorversionupgrade)
     * @param autoMinorVersionUpgrade A value that indicates whether minor engine upgrades are
     * applied automatically to the DB instance during the maintenance window. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * The destination region for the backup replication of the DB instance.
     *
     * For more info, see [Replicating automated backups to another AWS
     * Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html) in
     * the *Amazon RDS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-automaticbackupreplicationregion)
     * @param automaticBackupReplicationRegion The destination region for the backup replication of
     * the DB instance. 
     */
    override fun automaticBackupReplicationRegion(automaticBackupReplicationRegion: String) {
      cdkBuilder.automaticBackupReplicationRegion(automaticBackupReplicationRegion)
    }

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
     * @param availabilityZone The Availability Zone (AZ) where the database will be created. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

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
     * @param backupRetentionPeriod The number of days for which automated backups are retained. 
     */
    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

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
     * @param caCertificateIdentifier The identifier of the CA certificate for this DB instance. 
     */
    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
      cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

    /**
     * The details of the DB instance's server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-certificatedetails)
     * @param certificateDetails The details of the DB instance's server certificate. 
     */
    override fun certificateDetails(certificateDetails: IResolvable) {
      cdkBuilder.certificateDetails(certificateDetails.let(IResolvable::unwrap))
    }

    /**
     * The details of the DB instance's server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-certificatedetails)
     * @param certificateDetails The details of the DB instance's server certificate. 
     */
    override fun certificateDetails(certificateDetails: CertificateDetailsProperty) {
      cdkBuilder.certificateDetails(certificateDetails.let(CertificateDetailsProperty::unwrap))
    }

    /**
     * The details of the DB instance's server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-certificatedetails)
     * @param certificateDetails The details of the DB instance's server certificate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("527e2d3895792e597e6dd0df6c49c0c759da008f3ce325ffa8f5506a21c6806b")
    override
        fun certificateDetails(certificateDetails: CertificateDetailsProperty.Builder.() -> Unit):
        Unit = certificateDetails(CertificateDetailsProperty(certificateDetails))

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
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate. 
     */
    override fun certificateRotationRestart(certificateRotationRestart: Boolean) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart)
    }

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
     * @param certificateRotationRestart Specifies whether the DB instance is restarted when you
     * rotate your SSL/TLS certificate. 
     */
    override fun certificateRotationRestart(certificateRotationRestart: IResolvable) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart.let(IResolvable::unwrap))
    }

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
     * @param characterSetName For supported engines, indicates that the DB instance should be
     * associated with the specified character set. 
     */
    override fun characterSetName(characterSetName: String) {
      cdkBuilder.characterSetName(characterSetName)
    }

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
     * @param copyTagsToSnapshot Specifies whether to copy tags from the DB instance to snapshots of
     * the DB instance. 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

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
     * @param copyTagsToSnapshot Specifies whether to copy tags from the DB instance to snapshots of
     * the DB instance. 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

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
     * @param customIamInstanceProfile The instance profile associated with the underlying Amazon
     * EC2 instance of an RDS Custom DB instance. 
     */
    override fun customIamInstanceProfile(customIamInstanceProfile: String) {
      cdkBuilder.customIamInstanceProfile(customIamInstanceProfile)
    }

    /**
     * The identifier of the DB cluster that the instance will belong to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbclusteridentifier)
     * @param dbClusterIdentifier The identifier of the DB cluster that the instance will belong to.
     * 
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

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
     * @param dbClusterSnapshotIdentifier The identifier for the Multi-AZ DB cluster snapshot to
     * restore from. 
     */
    override fun dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier: String) {
      cdkBuilder.dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier)
    }

    /**
     * The compute and memory capacity of the DB instance, for example, `db.m4.large` . Not all DB
     * instance classes are available in all AWS Regions, or for all database engines.
     *
     * For the full list of DB instance classes, and availability for your engine, see [DB Instance
     * Class](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) in
     * the *Amazon RDS User Guide.* For more information about DB instance class pricing and AWS Region
     * support for DB instance classes, see [Amazon RDS
     * Pricing](https://docs.aws.amazon.com/rds/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dbinstanceclass)
     * @param dbInstanceClass The compute and memory capacity of the DB instance, for example,
     * `db.m4.large` . Not all DB instance classes are available in all AWS Regions, or for all
     * database engines. 
     */
    override fun dbInstanceClass(dbInstanceClass: String) {
      cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

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
     * @param dbInstanceIdentifier A name for the DB instance. 
     */
    override fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
      cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

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
     * @param dbName The meaning of this parameter differs according to the database engine you use.
     * 
     */
    override fun dbName(dbName: String) {
      cdkBuilder.dbName(dbName)
    }

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
     * @param dbParameterGroupName The name of an existing DB parameter group or a reference to an
     * [AWS::RDS::DBParameterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html)
     * resource created in the template. 
     */
    override fun dbParameterGroupName(dbParameterGroupName: String) {
      cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

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
     * @param dbSecurityGroups A list of the DB security groups to assign to the DB instance. 
     */
    override fun dbSecurityGroups(dbSecurityGroups: List<String>) {
      cdkBuilder.dbSecurityGroups(dbSecurityGroups)
    }

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
     * @param dbSecurityGroups A list of the DB security groups to assign to the DB instance. 
     */
    override fun dbSecurityGroups(vararg dbSecurityGroups: String): Unit =
        dbSecurityGroups(dbSecurityGroups.toList())

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
     * @param dbSnapshotIdentifier The name or Amazon Resource Name (ARN) of the DB snapshot that's
     * used to restore the DB instance. 
     */
    override fun dbSnapshotIdentifier(dbSnapshotIdentifier: String) {
      cdkBuilder.dbSnapshotIdentifier(dbSnapshotIdentifier)
    }

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
     * @param dbSubnetGroupName A DB subnet group to associate with the DB instance. 
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dedicatedlogvolume)
     * @param dedicatedLogVolume Indicates whether the DB instance has a dedicated log volume (DLV)
     * enabled. 
     */
    override fun dedicatedLogVolume(dedicatedLogVolume: Boolean) {
      cdkBuilder.dedicatedLogVolume(dedicatedLogVolume)
    }

    /**
     * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-dedicatedlogvolume)
     * @param dedicatedLogVolume Indicates whether the DB instance has a dedicated log volume (DLV)
     * enabled. 
     */
    override fun dedicatedLogVolume(dedicatedLogVolume: IResolvable) {
      cdkBuilder.dedicatedLogVolume(dedicatedLogVolume.let(IResolvable::unwrap))
    }

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
     * @param deleteAutomatedBackups A value that indicates whether to remove automated backups
     * immediately after the DB instance is deleted. 
     */
    override fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

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
     * @param deleteAutomatedBackups A value that indicates whether to remove automated backups
     * immediately after the DB instance is deleted. 
     */
    override fun deleteAutomatedBackups(deleteAutomatedBackups: IResolvable) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups.let(IResolvable::unwrap))
    }

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
     * @param deletionProtection A value that indicates whether the DB instance has deletion
     * protection enabled. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

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
     * @param deletionProtection A value that indicates whether the DB instance has deletion
     * protection enabled. 
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

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
     * @param domain The Active Directory directory ID to create the DB instance in. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
     *
     * Example:
     * `arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainauthsecretarn)
     * @param domainAuthSecretArn The ARN for the Secrets Manager secret with the credentials for
     * the user joining the domain. 
     */
    override fun domainAuthSecretArn(domainAuthSecretArn: String) {
      cdkBuilder.domainAuthSecretArn(domainAuthSecretArn)
    }

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
     * @param domainDnsIps The IPv4 DNS IP addresses of your primary and secondary Active Directory
     * domain controllers. 
     */
    override fun domainDnsIps(domainDnsIps: List<String>) {
      cdkBuilder.domainDnsIps(domainDnsIps)
    }

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
     * @param domainDnsIps The IPv4 DNS IP addresses of your primary and secondary Active Directory
     * domain controllers. 
     */
    override fun domainDnsIps(vararg domainDnsIps: String): Unit =
        domainDnsIps(domainDnsIps.toList())

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
     * @param domainFqdn The fully qualified domain name (FQDN) of an Active Directory domain. 
     */
    override fun domainFqdn(domainFqdn: String) {
      cdkBuilder.domainFqdn(domainFqdn)
    }

    /**
     * The name of the IAM role to use when making API calls to the Directory Service.
     *
     * This setting doesn't apply to the following DB instances:
     *
     * * Amazon Aurora (The domain is managed by the DB cluster.)
     * * RDS Custom
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-domainiamrolename)
     * @param domainIamRoleName The name of the IAM role to use when making API calls to the
     * Directory Service. 
     */
    override fun domainIamRoleName(domainIamRoleName: String) {
      cdkBuilder.domainIamRoleName(domainIamRoleName)
    }

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
     * @param domainOu The Active Directory organizational unit for your DB instance to join. 
     */
    override fun domainOu(domainOu: String) {
      cdkBuilder.domainOu(domainOu)
    }

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
     * @param enableCloudwatchLogsExports The list of log types that need to be enabled for
     * exporting to CloudWatch Logs. 
     */
    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

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
     * @param enableIamDatabaseAuthentication A value that indicates whether to enable mapping of
     * AWS Identity and Access Management (IAM) accounts to database accounts. 
     */
    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication.let(IResolvable::unwrap))
    }

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
     * @param enablePerformanceInsights Specifies whether to enable Performance Insights for the DB
     * instance. 
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

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
     * @param enablePerformanceInsights Specifies whether to enable Performance Insights for the DB
     * instance. 
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: IResolvable) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights.let(IResolvable::unwrap))
    }

    /**
     * The connection endpoint for the DB instance.
     *
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-endpoint)
     * @param endpoint The connection endpoint for the DB instance. 
     */
    override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
    }

    /**
     * The connection endpoint for the DB instance.
     *
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-endpoint)
     * @param endpoint The connection endpoint for the DB instance. 
     */
    override fun endpoint(endpoint: EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(EndpointProperty::unwrap))
    }

    /**
     * The connection endpoint for the DB instance.
     *
     *
     * The endpoint might not be shown for instances with the status of `creating` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-endpoint)
     * @param endpoint The connection endpoint for the DB instance. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4452934eeca24e633389478e0f49757d09a975774c1f229cfa992255ae2a6b9a")
    override fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(EndpointProperty(endpoint))

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
     * @param engine The name of the database engine that you want to use for this DB instance. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

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
     * @param engineVersion The version number of the database engine to use. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

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
     * @param iops The number of I/O operations per second (IOPS) that the database provisions. 
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

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
     * @param kmsKeyId The ARN of the AWS KMS key that's used to encrypt the DB instance, such as
     * `arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef` . 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

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
     * @param licenseModel License model information for this DB instance. 
     */
    override fun licenseModel(licenseModel: String) {
      cdkBuilder.licenseModel(licenseModel)
    }

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
     * *Amazon RDS User Guide.*
     *
     * Constraints:
     *
     * * Can't manage the master user password with AWS Secrets Manager if `MasterUserPassword` is
     * specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-managemasteruserpassword)
     * @param manageMasterUserPassword Specifies whether to manage the master user password with AWS
     * Secrets Manager. 
     */
    override fun manageMasterUserPassword(manageMasterUserPassword: IResolvable) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword.let(IResolvable::unwrap))
    }

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
     * @param masterUserPassword The password for the master user. The password can include any
     * printable ASCII character except "/", """, or "&#64;". 
     */
    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    /**
     * The secret managed by RDS in AWS Secrets Manager for the master user password.
     *
     * For more information, see [Password management with AWS Secrets
     * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masterusersecret)
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
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masterusersecret)
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
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-masterusersecret)
     * @param masterUserSecret The secret managed by RDS in AWS Secrets Manager for the master user
     * password. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd2e9e3e70cdc72e383888e63bd1e2a69e4b1df6b4c3b633e7736d38e672fb2c")
    override fun masterUserSecret(masterUserSecret: MasterUserSecretProperty.Builder.() -> Unit):
        Unit = masterUserSecret(MasterUserSecretProperty(masterUserSecret))

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
     * @param masterUsername The master user name for the DB instance. 
     */
    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

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
     * @param maxAllocatedStorage The upper limit in gibibytes (GiB) to which Amazon RDS can
     * automatically scale the storage of the DB instance. 
     */
    override fun maxAllocatedStorage(maxAllocatedStorage: Number) {
      cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

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
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB instance. 
     */
    override fun monitoringInterval(monitoringInterval: Number) {
      cdkBuilder.monitoringInterval(monitoringInterval)
    }

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
     * @param monitoringRoleArn The ARN for the IAM role that permits RDS to send enhanced
     * monitoring metrics to Amazon CloudWatch Logs. 
     */
    override fun monitoringRoleArn(monitoringRoleArn: String) {
      cdkBuilder.monitoringRoleArn(monitoringRoleArn)
    }

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
     * @param multiAz Specifies whether the database instance is a Multi-AZ DB instance deployment. 
     */
    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

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
     * @param multiAz Specifies whether the database instance is a Multi-AZ DB instance deployment. 
     */
    override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
    }

    /**
     * The name of the NCHAR character set for the Oracle DB instance.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-ncharcharactersetname)
     * @param ncharCharacterSetName The name of the NCHAR character set for the Oracle DB instance. 
     */
    override fun ncharCharacterSetName(ncharCharacterSetName: String) {
      cdkBuilder.ncharCharacterSetName(ncharCharacterSetName)
    }

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
     * @param networkType The network type of the DB instance. 
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    /**
     * Indicates that the DB instance should be associated with the specified option group.
     *
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed
     * from an option group. Also, that option group can't be removed from a DB instance once it is
     * associated with a DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-optiongroupname)
     * @param optionGroupName Indicates that the DB instance should be associated with the specified
     * option group. 
     */
    override fun optionGroupName(optionGroupName: String) {
      cdkBuilder.optionGroupName(optionGroupName)
    }

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
     * @param performanceInsightsKmsKeyId The AWS KMS key identifier for encryption of Performance
     * Insights data. 
     */
    override fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
      cdkBuilder.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId)
    }

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
     * @param performanceInsightsRetentionPeriod The number of days to retain Performance Insights
     * data. 
     */
    override fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
      cdkBuilder.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod)
    }

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
     * @param port The port number on which the database accepts connections. 
     */
    override fun port(port: String) {
      cdkBuilder.port(port)
    }

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
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled, using the `BackupRetentionPeriod` parameter. 
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
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC). 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * The number of CPU cores and the number of threads per core for the DB instance class of the
     * DB instance.
     *
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-processorfeatures)
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance. 
     */
    override fun processorFeatures(processorFeatures: IResolvable) {
      cdkBuilder.processorFeatures(processorFeatures.let(IResolvable::unwrap))
    }

    /**
     * The number of CPU cores and the number of threads per core for the DB instance class of the
     * DB instance.
     *
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-processorfeatures)
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance. 
     */
    override fun processorFeatures(processorFeatures: List<Any>) {
      cdkBuilder.processorFeatures(processorFeatures)
    }

    /**
     * The number of CPU cores and the number of threads per core for the DB instance class of the
     * DB instance.
     *
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-processorfeatures)
     * @param processorFeatures The number of CPU cores and the number of threads per core for the
     * DB instance class of the DB instance. 
     */
    override fun processorFeatures(vararg processorFeatures: Any): Unit =
        processorFeatures(processorFeatures.toList())

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
     * @param promotionTier The order of priority in which an Aurora Replica is promoted to the
     * primary instance after a failure of the existing primary instance. 
     */
    override fun promotionTier(promotionTier: Number) {
      cdkBuilder.promotionTier(promotionTier)
    }

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
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

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
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

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
     * @param replicaMode The open mode of an Oracle read replica. 
     */
    override fun replicaMode(replicaMode: String) {
      cdkBuilder.replicaMode(replicaMode)
    }

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
     * @param restoreTime The date and time to restore from. 
     */
    override fun restoreTime(restoreTime: String) {
      cdkBuilder.restoreTime(restoreTime)
    }

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
     * @param sourceDbClusterIdentifier The identifier of the Multi-AZ DB cluster that will act as
     * the source for the read replica. 
     */
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for
     * example, `arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE` .
     *
     * This setting doesn't apply to RDS Custom.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbinstanceautomatedbackupsarn)
     * @param sourceDbInstanceAutomatedBackupsArn The Amazon Resource Name (ARN) of the replicated
     * automated backups from which to restore, for example,
     * `arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE` . 
     */
    override fun sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn: String) {
      cdkBuilder.sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn)
    }

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
     * @param sourceDbInstanceIdentifier If you want to create a read replica DB instance, specify
     * the ID of the source DB instance. 
     */
    override fun sourceDbInstanceIdentifier(sourceDbInstanceIdentifier: String) {
      cdkBuilder.sourceDbInstanceIdentifier(sourceDbInstanceIdentifier)
    }

    /**
     * The resource ID of the source DB instance from which to restore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourcedbiresourceid)
     * @param sourceDbiResourceId The resource ID of the source DB instance from which to restore. 
     */
    override fun sourceDbiResourceId(sourceDbiResourceId: String) {
      cdkBuilder.sourceDbiResourceId(sourceDbiResourceId)
    }

    /**
     * The ID of the region that contains the source DB instance for the read replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-sourceregion)
     * @param sourceRegion The ID of the region that contains the source DB instance for the read
     * replica. 
     */
    override fun sourceRegion(sourceRegion: String) {
      cdkBuilder.sourceRegion(sourceRegion)
    }

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
     * @param storageEncrypted A value that indicates whether the DB instance is encrypted. By
     * default, it isn't encrypted. 
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

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
     * @param storageEncrypted A value that indicates whether the DB instance is encrypted. By
     * default, it isn't encrypted. 
     */
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    /**
     * Specifies the storage throughput value for the DB instance. This setting applies only to the
     * `gp3` storage type.
     *
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-storagethroughput)
     * @param storageThroughput Specifies the storage throughput value for the DB instance. This
     * setting applies only to the `gp3` storage type. 
     */
    override fun storageThroughput(storageThroughput: Number) {
      cdkBuilder.storageThroughput(storageThroughput)
    }

    /**
     * Specifies the storage type to be associated with the DB instance.
     *
     * Valid values: `gp2 | gp3 | io1 | standard`
     *
     * The `standard` value is also known as magnetic.
     *
     * If you specify `io1` or `gp3` , you must also include a value for the `Iops` parameter.
     *
     * Default: `io1` if the `Iops` parameter is specified, otherwise `gp2`
     *
     * For more information, see [Amazon RDS DB Instance
     * Storage](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html) in the
     * *Amazon RDS User Guide* .
     *
     * *Amazon Aurora*
     *
     * Not applicable. Aurora data is stored in the cluster volume, which is a single, virtual
     * volume that uses solid state drives (SSDs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-storagetype)
     * @param storageType Specifies the storage type to be associated with the DB instance. 
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * An optional array of key-value pairs to apply to this DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tags)
     * @param tags An optional array of key-value pairs to apply to this DB instance. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An optional array of key-value pairs to apply to this DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tags)
     * @param tags An optional array of key-value pairs to apply to this DB instance. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tdecredentialarn)
     * @deprecated this property has been deprecated
     * @param tdeCredentialArn 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tdeCredentialArn(tdeCredentialArn: String) {
      cdkBuilder.tdeCredentialArn(tdeCredentialArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-tdecredentialpassword)
     * @deprecated this property has been deprecated
     * @param tdeCredentialPassword 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tdeCredentialPassword(tdeCredentialPassword: String) {
      cdkBuilder.tdeCredentialPassword(tdeCredentialPassword)
    }

    /**
     * The time zone of the DB instance.
     *
     * The time zone parameter is currently supported only by [Microsoft SQL
     * Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-timezone)
     * @param timezone The time zone of the DB instance. 
     */
    override fun timezone(timezone: String) {
      cdkBuilder.timezone(timezone)
    }

    /**
     * Specifies whether the DB instance class of the DB instance uses its default processor
     * features.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-usedefaultprocessorfeatures)
     * @param useDefaultProcessorFeatures Specifies whether the DB instance class of the DB instance
     * uses its default processor features. 
     */
    override fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: Boolean) {
      cdkBuilder.useDefaultProcessorFeatures(useDefaultProcessorFeatures)
    }

    /**
     * Specifies whether the DB instance class of the DB instance uses its default processor
     * features.
     *
     * This setting doesn't apply to RDS Custom DB instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#cfn-rds-dbinstance-usedefaultprocessorfeatures)
     * @param useDefaultProcessorFeatures Specifies whether the DB instance class of the DB instance
     * uses its default processor features. 
     */
    override fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: IResolvable) {
      cdkBuilder.useDefaultProcessorFeatures(useDefaultProcessorFeatures.let(IResolvable::unwrap))
    }

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
     * @param useLatestRestorableTime Specifies whether the DB instance is restored from the latest
     * backup time. 
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

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
     * @param useLatestRestorableTime Specifies whether the DB instance is restored from the latest
     * backup time. 
     */
    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

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
     * @param vpcSecurityGroups A list of the VPC security group IDs to assign to the DB instance. 
     */
    override fun vpcSecurityGroups(vpcSecurityGroups: List<String>) {
      cdkBuilder.vpcSecurityGroups(vpcSecurityGroups)
    }

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
     * @param vpcSecurityGroups A list of the VPC security group IDs to assign to the DB instance. 
     */
    override fun vpcSecurityGroups(vararg vpcSecurityGroups: String): Unit =
        vpcSecurityGroups(vpcSecurityGroups.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBInstance = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance): CfnDBInstance =
        CfnDBInstance(cdkObject)

    internal fun unwrap(wrapped: CfnDBInstance): software.amazon.awscdk.services.rds.CfnDBInstance =
        wrapped.cdkObject
  }

  /**
   * Information about an AWS Identity and Access Management (IAM) role that is associated with a DB
   * instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * DBInstanceRoleProperty dBInstanceRoleProperty = DBInstanceRoleProperty.builder()
   * .featureName("featureName")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-dbinstancerole.html)
   */
  public interface DBInstanceRoleProperty {
    /**
     * The name of the feature associated with the AWS Identity and Access Management (IAM) role.
     *
     * IAM roles that are associated with a DB instance grant permission for the DB instance to
     * access other AWS services on your behalf. For the list of supported feature names, see the
     * `SupportedFeatureNames` description in
     * [DBEngineVersion](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
     * in the *Amazon RDS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-dbinstancerole.html#cfn-rds-dbinstance-dbinstancerole-featurename)
     */
    public fun featureName(): String

    /**
     * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-dbinstancerole.html#cfn-rds-dbinstance-dbinstancerole-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [DBInstanceRoleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param featureName The name of the feature associated with the AWS Identity and Access
       * Management (IAM) role. 
       * IAM roles that are associated with a DB instance grant permission for the DB instance to
       * access other AWS services on your behalf. For the list of supported feature names, see the
       * `SupportedFeatureNames` description in
       * [DBEngineVersion](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
       * in the *Amazon RDS API Reference* .
       */
      public fun featureName(featureName: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that is associated with the
       * DB instance. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty.builder()

      /**
       * @param featureName The name of the feature associated with the AWS Identity and Access
       * Management (IAM) role. 
       * IAM roles that are associated with a DB instance grant permission for the DB instance to
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
       * DB instance. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty,
    ) : CdkObject(cdkObject), DBInstanceRoleProperty {
      /**
       * The name of the feature associated with the AWS Identity and Access Management (IAM) role.
       *
       * IAM roles that are associated with a DB instance grant permission for the DB instance to
       * access other AWS services on your behalf. For the list of supported feature names, see the
       * `SupportedFeatureNames` description in
       * [DBEngineVersion](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
       * in the *Amazon RDS API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-dbinstancerole.html#cfn-rds-dbinstance-dbinstancerole-featurename)
       */
      override fun featureName(): String = unwrap(this).getFeatureName()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-dbinstancerole.html#cfn-rds-dbinstance-dbinstancerole-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DBInstanceRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty):
          DBInstanceRoleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DBInstanceRoleProperty):
          software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty
    }
  }

  /**
   * This data type represents the information you need to connect to an Amazon RDS DB instance.
   *
   * This data type is used as a response element in the following actions:
   *
   * * `CreateDBInstance`
   * * `DescribeDBInstances`
   * * `DeleteDBInstance`
   *
   * For the data structure that represents Amazon Aurora DB cluster endpoints, see
   * `DBClusterEndpoint` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * EndpointProperty endpointProperty = EndpointProperty.builder()
   * .address("address")
   * .hostedZoneId("hostedZoneId")
   * .port("port")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-endpoint.html)
   */
  public interface EndpointProperty {
    /**
     * Specifies the DNS address of the DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-endpoint.html#cfn-rds-dbinstance-endpoint-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-endpoint.html#cfn-rds-dbinstance-endpoint-hostedzoneid)
     */
    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    /**
     * Specifies the port that the database engine is listening on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-endpoint.html#cfn-rds-dbinstance-endpoint-port)
     */
    public fun port(): String? = unwrap(this).getPort()

    /**
     * A builder for [EndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address Specifies the DNS address of the DB instance.
       */
      public fun address(address: String)

      /**
       * @param hostedZoneId Specifies the ID that Amazon Route 53 assigns when you create a hosted
       * zone.
       */
      public fun hostedZoneId(hostedZoneId: String)

      /**
       * @param port Specifies the port that the database engine is listening on.
       */
      public fun port(port: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty.builder()

      /**
       * @param address Specifies the DNS address of the DB instance.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param hostedZoneId Specifies the ID that Amazon Route 53 assigns when you create a hosted
       * zone.
       */
      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      /**
       * @param port Specifies the port that the database engine is listening on.
       */
      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty,
    ) : CdkObject(cdkObject), EndpointProperty {
      /**
       * Specifies the DNS address of the DB instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-endpoint.html#cfn-rds-dbinstance-endpoint-address)
       */
      override fun address(): String? = unwrap(this).getAddress()

      /**
       * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-endpoint.html#cfn-rds-dbinstance-endpoint-hostedzoneid)
       */
      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

      /**
       * Specifies the port that the database engine is listening on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-endpoint.html#cfn-rds-dbinstance-endpoint-port)
       */
      override fun port(): String? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty):
          EndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty
    }
  }

  /**
   * Returns the details of the DB instance’s server certificate.
   *
   * For more information, see [Using SSL/TLS to encrypt a connection to a DB
   * instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html) in the
   * *Amazon RDS User Guide* and [Using SSL/TLS to encrypt a connection to a DB
   * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html) in
   * the *Amazon Aurora User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * CertificateDetailsProperty certificateDetailsProperty = CertificateDetailsProperty.builder()
   * .caIdentifier("caIdentifier")
   * .validTill("validTill")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-certificatedetails.html)
   */
  public interface CertificateDetailsProperty {
    /**
     * The CA identifier of the CA certificate used for the DB instance's server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-certificatedetails.html#cfn-rds-dbinstance-certificatedetails-caidentifier)
     */
    public fun caIdentifier(): String? = unwrap(this).getCaIdentifier()

    /**
     * The expiration date of the DB instance’s server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-certificatedetails.html#cfn-rds-dbinstance-certificatedetails-validtill)
     */
    public fun validTill(): String? = unwrap(this).getValidTill()

    /**
     * A builder for [CertificateDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param caIdentifier The CA identifier of the CA certificate used for the DB instance's
       * server certificate.
       */
      public fun caIdentifier(caIdentifier: String)

      /**
       * @param validTill The expiration date of the DB instance’s server certificate.
       */
      public fun validTill(validTill: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty.builder()

      /**
       * @param caIdentifier The CA identifier of the CA certificate used for the DB instance's
       * server certificate.
       */
      override fun caIdentifier(caIdentifier: String) {
        cdkBuilder.caIdentifier(caIdentifier)
      }

      /**
       * @param validTill The expiration date of the DB instance’s server certificate.
       */
      override fun validTill(validTill: String) {
        cdkBuilder.validTill(validTill)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty,
    ) : CdkObject(cdkObject), CertificateDetailsProperty {
      /**
       * The CA identifier of the CA certificate used for the DB instance's server certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-certificatedetails.html#cfn-rds-dbinstance-certificatedetails-caidentifier)
       */
      override fun caIdentifier(): String? = unwrap(this).getCaIdentifier()

      /**
       * The expiration date of the DB instance’s server certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-certificatedetails.html#cfn-rds-dbinstance-certificatedetails-validtill)
       */
      override fun validTill(): String? = unwrap(this).getValidTill()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty):
          CertificateDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateDetailsProperty):
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty
    }
  }

  /**
   * The `ProcessorFeature` property type specifies the processor features of a DB instance class
   * status.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * ProcessorFeatureProperty processorFeatureProperty = ProcessorFeatureProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-processorfeature.html)
   */
  public interface ProcessorFeatureProperty {
    /**
     * The name of the processor feature.
     *
     * Valid names are `coreCount` and `threadsPerCore` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-processorfeature.html#cfn-rds-dbinstance-processorfeature-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of a processor feature name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-processorfeature.html#cfn-rds-dbinstance-processorfeature-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ProcessorFeatureProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the processor feature.
       * Valid names are `coreCount` and `threadsPerCore` .
       */
      public fun name(name: String)

      /**
       * @param value The value of a processor feature name.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty.builder()

      /**
       * @param name The name of the processor feature.
       * Valid names are `coreCount` and `threadsPerCore` .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of a processor feature name.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty,
    ) : CdkObject(cdkObject), ProcessorFeatureProperty {
      /**
       * The name of the processor feature.
       *
       * Valid names are `coreCount` and `threadsPerCore` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-processorfeature.html#cfn-rds-dbinstance-processorfeature-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of a processor feature name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-processorfeature.html#cfn-rds-dbinstance-processorfeature-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorFeatureProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty):
          ProcessorFeatureProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProcessorFeatureProperty):
          software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-masterusersecret.html)
   */
  public interface MasterUserSecretProperty {
    /**
     * The AWS KMS key identifier that is used to encrypt the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-masterusersecret.html#cfn-rds-dbinstance-masterusersecret-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The Amazon Resource Name (ARN) of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-masterusersecret.html#cfn-rds-dbinstance-masterusersecret-secretarn)
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
          software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty,
    ) : CdkObject(cdkObject), MasterUserSecretProperty {
      /**
       * The AWS KMS key identifier that is used to encrypt the secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-masterusersecret.html#cfn-rds-dbinstance-masterusersecret-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The Amazon Resource Name (ARN) of the secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-masterusersecret.html#cfn-rds-dbinstance-masterusersecret-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MasterUserSecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty):
          MasterUserSecretProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MasterUserSecretProperty):
          software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty
    }
  }
}
