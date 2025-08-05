@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
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

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * Object namespaceResourcePolicy;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
 * .clusterType("clusterType")
 * .dbName("dbName")
 * .masterUsername("masterUsername")
 * .nodeType("nodeType")
 * // the properties below are optional
 * .allowVersionUpgrade(false)
 * .aquaConfigurationStatus("aquaConfigurationStatus")
 * .automatedSnapshotRetentionPeriod(123)
 * .availabilityZone("availabilityZone")
 * .availabilityZoneRelocation(false)
 * .availabilityZoneRelocationStatus("availabilityZoneRelocationStatus")
 * .classic(false)
 * .clusterIdentifier("clusterIdentifier")
 * .clusterParameterGroupName("clusterParameterGroupName")
 * .clusterSecurityGroups(List.of("clusterSecurityGroups"))
 * .clusterSubnetGroupName("clusterSubnetGroupName")
 * .clusterVersion("clusterVersion")
 * .deferMaintenance(false)
 * .deferMaintenanceDuration(123)
 * .deferMaintenanceEndTime("deferMaintenanceEndTime")
 * .deferMaintenanceStartTime("deferMaintenanceStartTime")
 * .destinationRegion("destinationRegion")
 * .elasticIp("elasticIp")
 * .encrypted(false)
 * .endpoint(EndpointProperty.builder()
 * .address("address")
 * .port("port")
 * .build())
 * .enhancedVpcRouting(false)
 * .hsmClientCertificateIdentifier("hsmClientCertificateIdentifier")
 * .hsmConfigurationIdentifier("hsmConfigurationIdentifier")
 * .iamRoles(List.of("iamRoles"))
 * .kmsKeyId("kmsKeyId")
 * .loggingProperties(LoggingPropertiesProperty.builder()
 * .bucketName("bucketName")
 * .logDestinationType("logDestinationType")
 * .logExports(List.of("logExports"))
 * .s3KeyPrefix("s3KeyPrefix")
 * .build())
 * .maintenanceTrackName("maintenanceTrackName")
 * .manageMasterPassword(false)
 * .manualSnapshotRetentionPeriod(123)
 * .masterPasswordSecretKmsKeyId("masterPasswordSecretKmsKeyId")
 * .masterUserPassword("masterUserPassword")
 * .multiAz(false)
 * .namespaceResourcePolicy(namespaceResourcePolicy)
 * .numberOfNodes(123)
 * .ownerAccount("ownerAccount")
 * .port(123)
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .publiclyAccessible(false)
 * .resourceAction("resourceAction")
 * .revisionTarget("revisionTarget")
 * .rotateEncryptionKey(false)
 * .snapshotClusterIdentifier("snapshotClusterIdentifier")
 * .snapshotCopyGrantName("snapshotCopyGrantName")
 * .snapshotCopyManual(false)
 * .snapshotCopyRetentionPeriod(123)
 * .snapshotIdentifier("snapshotIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html)
 */
public interface CfnClusterProps {
  /**
   * If `true` , major version upgrades can be applied during the maintenance window to the Amazon
   * Redshift engine that is running on the cluster.
   *
   * When a new major version of the Amazon Redshift engine is released, you can request that the
   * service automatically apply upgrades during the maintenance window to the Amazon Redshift engine
   * that is running on your cluster.
   *
   * Default: `true`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade)
   */
  public fun allowVersionUpgrade(): Any? = unwrap(this).getAllowVersionUpgrade()

  /**
   * This parameter is retired.
   *
   * It does not set the AQUA configuration status. Amazon Redshift automatically determines whether
   * to use AQUA (Advanced Query Accelerator).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-aquaconfigurationstatus)
   */
  public fun aquaConfigurationStatus(): String? = unwrap(this).getAquaConfigurationStatus()

  /**
   * The number of days that automated snapshots are retained.
   *
   * If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled,
   * you can still create manual snapshots when you want with
   * [CreateClusterSnapshot](https://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterSnapshot.html)
   * in the *Amazon Redshift API Reference* .
   *
   * Default: `1`
   *
   * Constraints: Must be a value from 0 to 35.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod)
   */
  public fun automatedSnapshotRetentionPeriod(): Number? =
      unwrap(this).getAutomatedSnapshotRetentionPeriod()

  /**
   * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster.
   *
   * For example, if you have several EC2 instances running in a specific Availability Zone, then
   * you might want the cluster to be provisioned in the same zone in order to decrease network
   * latency.
   *
   * Default: A random, system-chosen Availability Zone in the region that is specified by the
   * endpoint.
   *
   * Example: `us-east-2d`
   *
   * Constraint: The specified Availability Zone must be in the same region as the current endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The option to enable relocation for an Amazon Redshift cluster between Availability Zones after
   * the cluster is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzonerelocation)
   */
  public fun availabilityZoneRelocation(): Any? = unwrap(this).getAvailabilityZoneRelocation()

  /**
   * Describes the status of the Availability Zone relocation operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzonerelocationstatus)
   */
  public fun availabilityZoneRelocationStatus(): String? =
      unwrap(this).getAvailabilityZoneRelocationStatus()

  /**
   * A boolean value indicating whether the resize operation is using the classic resize process.
   *
   * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-classic)
   */
  public fun classic(): Any? = unwrap(this).getClassic()

  /**
   * A unique identifier for the cluster.
   *
   * You use this identifier to refer to the cluster for any subsequent cluster operations such as
   * deleting or modifying. The identifier also appears in the Amazon Redshift console.
   *
   * Constraints:
   *
   * * Must contain from 1 to 63 alphanumeric characters or hyphens.
   * * Alphabetic characters must be lowercase.
   * * First character must be a letter.
   * * Cannot end with a hyphen or contain two consecutive hyphens.
   * * Must be unique for all clusters within an AWS account .
   *
   * Example: `myexamplecluster`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier)
   */
  public fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

  /**
   * The name of the parameter group to be associated with this cluster.
   *
   * Default: The default Amazon Redshift cluster parameter group. For information about the default
   * parameter group, go to [Working with Amazon Redshift Parameter
   * Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html)
   *
   * Constraints:
   *
   * * Must be 1 to 255 alphanumeric characters or hyphens.
   * * First character must be a letter.
   * * Cannot end with a hyphen or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname)
   */
  public fun clusterParameterGroupName(): String? = unwrap(this).getClusterParameterGroupName()

  /**
   * A list of security groups to be associated with this cluster.
   *
   * Default: The default cluster security group for Amazon Redshift.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups)
   */
  public fun clusterSecurityGroups(): List<String> = unwrap(this).getClusterSecurityGroups() ?:
      emptyList()

  /**
   * The name of a cluster subnet group to be associated with this cluster.
   *
   * If this parameter is not provided the resulting cluster will be deployed outside virtual
   * private cloud (VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname)
   */
  public fun clusterSubnetGroupName(): String? = unwrap(this).getClusterSubnetGroupName()

  /**
   * The type of the cluster. When cluster type is specified as.
   *
   * * `single-node` , the *NumberOfNodes* parameter is not required.
   * * `multi-node` , the *NumberOfNodes* parameter is required.
   *
   * Valid Values: `multi-node` | `single-node`
   *
   * Default: `multi-node`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype)
   */
  public fun clusterType(): String

  /**
   * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
   *
   * The version selected runs on all the nodes in the cluster.
   *
   * Constraints: Only version 1.0 is currently available.
   *
   * Example: `1.0`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion)
   */
  public fun clusterVersion(): String? = unwrap(this).getClusterVersion()

  /**
   * The name of the first database to be created when the cluster is created.
   *
   * To create additional databases after the cluster is created, connect to the cluster with a SQL
   * client and use SQL commands to create a database. For more information, go to [Create a
   * Database](https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html) in the Amazon
   * Redshift Database Developer Guide.
   *
   * Default: `dev`
   *
   * Constraints:
   *
   * * Must contain 1 to 64 alphanumeric characters.
   * * Must contain only lowercase letters.
   * * Cannot be a word that is reserved by the service. A list of reserved words can be found in
   * [Reserved Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the Amazon
   * Redshift Database Developer Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname)
   */
  public fun dbName(): String

  /**
   * A Boolean indicating whether to enable the deferred maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenance)
   */
  public fun deferMaintenance(): Any? = unwrap(this).getDeferMaintenance()

  /**
   * An integer indicating the duration of the maintenance window in days.
   *
   * If you specify a duration, you can't specify an end time. The duration must be 45 days or less.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenanceduration)
   */
  public fun deferMaintenanceDuration(): Number? = unwrap(this).getDeferMaintenanceDuration()

  /**
   * A timestamp for the end of the time period when we defer maintenance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenanceendtime)
   */
  public fun deferMaintenanceEndTime(): String? = unwrap(this).getDeferMaintenanceEndTime()

  /**
   * A timestamp indicating the start time for the deferred maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenancestarttime)
   */
  public fun deferMaintenanceStartTime(): String? = unwrap(this).getDeferMaintenanceStartTime()

  /**
   * The destination region that snapshots are automatically copied to when cross-region snapshot
   * copy is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-destinationregion)
   */
  public fun destinationRegion(): String? = unwrap(this).getDestinationRegion()

  /**
   * The Elastic IP (EIP) address for the cluster.
   *
   * Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an
   * Internet gateway. Don't specify the Elastic IP address for a publicly accessible cluster with
   * availability zone relocation turned on. For more information about provisioning clusters in
   * EC2-VPC, go to [Supported Platforms to Launch Your
   * Cluster](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms)
   * in the Amazon Redshift Cluster Management Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip)
   */
  public fun elasticIp(): String? = unwrap(this).getElasticIp()

  /**
   * If `true` , the data in the cluster is encrypted at rest.
   *
   * If you set the value on this parameter to `false` , the request will fail.
   *
   * Default: true
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted)
   */
  public fun encrypted(): Any? = unwrap(this).getEncrypted()

  /**
   * The connection endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-endpoint)
   */
  public fun endpoint(): Any? = unwrap(this).getEndpoint()

  /**
   * An option that specifies whether to create the cluster with enhanced VPC routing enabled.
   *
   * To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more
   * information, see [Enhanced VPC
   * Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html) in the Amazon
   * Redshift Cluster Management Guide.
   *
   * If this option is `true` , enhanced VPC routing is enabled.
   *
   * Default: false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-enhancedvpcrouting)
   */
  public fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

  /**
   * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve
   * the data encryption keys stored in an HSM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertificateidentifier)
   */
  public fun hsmClientCertificateIdentifier(): String? =
      unwrap(this).getHsmClientCertificateIdentifier()

  /**
   * Specifies the name of the HSM configuration that contains the information the Amazon Redshift
   * cluster can use to retrieve and store keys in an HSM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmconfigurationidentifier)
   */
  public fun hsmConfigurationIdentifier(): String? = unwrap(this).getHsmConfigurationIdentifier()

  /**
   * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to
   * access other AWS services.
   *
   * You must supply the IAM roles in their Amazon Resource Name (ARN) format.
   *
   * The maximum number of IAM roles that you can associate is subject to a quota. For more
   * information, go to [Quotas and
   * limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html) in the
   * *Amazon Redshift Cluster Management Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles)
   */
  public fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

  /**
   * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to
   * encrypt data in the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Specifies logging information, such as queries and connection attempts, for the specified
   * Amazon Redshift cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
   */
  public fun loggingProperties(): Any? = unwrap(this).getLoggingProperties()

  /**
   * An optional parameter for the name of the maintenance track for the cluster.
   *
   * If you don't provide a maintenance track name, the cluster is assigned to the `current` track.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-maintenancetrackname)
   */
  public fun maintenanceTrackName(): String? = unwrap(this).getMaintenanceTrackName()

  /**
   * If `true` , Amazon Redshift uses AWS Secrets Manager to manage this cluster's admin
   * credentials.
   *
   * You can't use `MasterUserPassword` if `ManageMasterPassword` is true. If `ManageMasterPassword`
   * is false or not set, Amazon Redshift uses `MasterUserPassword` for the admin user account's
   * password.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-managemasterpassword)
   */
  public fun manageMasterPassword(): Any? = unwrap(this).getManageMasterPassword()

  /**
   * The default number of days to retain a manual snapshot.
   *
   * If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the
   * retention period of existing snapshots.
   *
   * The value must be either -1 or an integer between 1 and 3,653.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-manualsnapshotretentionperiod)
   */
  public fun manualSnapshotRetentionPeriod(): Number? =
      unwrap(this).getManualSnapshotRetentionPeriod()

  /**
   * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the cluster's
   * admin credentials secret.
   *
   * You can only use this parameter if `ManageMasterPassword` is true.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterpasswordsecretkmskeyid)
   */
  public fun masterPasswordSecretKmsKeyId(): String? =
      unwrap(this).getMasterPasswordSecretKmsKeyId()

  /**
   * The password associated with the admin user account for the cluster that is being created.
   *
   * You can't use `MasterUserPassword` if `ManageMasterPassword` is `true` .
   *
   * Constraints:
   *
   * * Must be between 8 and 64 characters in length.
   * * Must contain at least one uppercase letter.
   * * Must contain at least one lowercase letter.
   * * Must contain one number.
   * * Can be any printable ASCII character (ASCII code 33-126) except `'` (single quote), `"`
   * (double quote), `\` , `/` , or `&#64;` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword)
   */
  public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  /**
   * The user name associated with the admin user account for the cluster that is being created.
   *
   * Constraints:
   *
   * * Must be 1 - 128 alphanumeric characters or hyphens. The user name can't be `PUBLIC` .
   * * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol
   * (&#64;), or hyphen.
   * * The first character must be a letter.
   * * Must not contain a colon (:) or a slash (/).
   * * Cannot be a reserved word. A list of reserved words can be found in [Reserved
   * Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the Amazon Redshift
   * Database Developer Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername)
   */
  public fun masterUsername(): String

  /**
   * A boolean indicating whether Amazon Redshift should deploy the cluster in two Availability
   * Zones.
   *
   * The default is false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-multiaz)
   */
  public fun multiAz(): Any? = unwrap(this).getMultiAz()

  /**
   * The policy that is attached to a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-namespaceresourcepolicy)
   */
  public fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

  /**
   * The node type to be provisioned for the cluster.
   *
   * For information about node types, go to [Working with
   * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
   * in the *Amazon Redshift Cluster Management Guide* .
   *
   * Valid Values: `dc2.large` | `dc2.8xlarge` | `ra3.large` | `ra3.xlplus` | `ra3.4xlarge` |
   * `ra3.16xlarge`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype)
   */
  public fun nodeType(): String

  /**
   * The number of compute nodes in the cluster.
   *
   * This parameter is required when the *ClusterType* parameter is specified as `multi-node` .
   *
   * For information about determining how many nodes you need, go to [Working with
   * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
   * in the *Amazon Redshift Cluster Management Guide* .
   *
   * If you don't specify this parameter, you get a single-node cluster. When requesting a
   * multi-node cluster, you must specify the number of nodes that you want in the cluster.
   *
   * Default: `1`
   *
   * Constraints: Value must be at least 1 and no more than 100.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-numberofnodes)
   */
  public fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

  /**
   * The AWS account used to create or copy the snapshot.
   *
   * Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount)
   */
  public fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

  /**
   * The port number on which the cluster accepts incoming connections.
   *
   * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection
   * string requires the port on which the cluster will listen for incoming connections.
   *
   * Default: `5439`
   *
   * Valid Values:
   *
   * * For clusters with ra3 nodes - Select a port within the ranges `5431-5455` or `8191-8215` .
   * (If you have an existing cluster with ra3 nodes, it isn't required that you change the port to
   * these ranges.)
   * * For clusters with dc2 nodes - Select a port within the range `1150-65535` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The weekly time range (in UTC) during which automated cluster maintenance can occur.
   *
   * Format: `ddd:hh24:mi-ddd:hh24:mi`
   *
   * Default: A 30-minute window selected at random from an 8-hour block of time per region,
   * occurring on a random day of the week. For more information about the time blocks for each region,
   * see [Maintenance
   * Windows](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows)
   * in Amazon Redshift Cluster Management Guide.
   *
   * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
   *
   * Constraints: Minimum 30-minute window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * If `true` , the cluster can be accessed from a public network.
   *
   * Default: false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * The Amazon Redshift operation to be performed.
   *
   * Supported operations are `pause-cluster` , `resume-cluster` , and `failover-primary-compute` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-resourceaction)
   */
  public fun resourceAction(): String? = unwrap(this).getResourceAction()

  /**
   * Describes a `RevisionTarget` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-revisiontarget)
   */
  public fun revisionTarget(): String? = unwrap(this).getRevisionTarget()

  /**
   * Rotates the encryption keys for a cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-rotateencryptionkey)
   */
  public fun rotateEncryptionKey(): Any? = unwrap(this).getRotateEncryptionKey()

  /**
   * The name of the cluster the source snapshot was created from.
   *
   * This parameter is required if your user or role has a policy containing a snapshot resource
   * element that specifies anything other than * for the cluster name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier)
   */
  public fun snapshotClusterIdentifier(): String? = unwrap(this).getSnapshotClusterIdentifier()

  /**
   * The name of the snapshot copy grant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopygrantname)
   */
  public fun snapshotCopyGrantName(): String? = unwrap(this).getSnapshotCopyGrantName()

  /**
   * Indicates whether to apply the snapshot retention period to newly copied manual snapshots
   * instead of automated snapshots.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopymanual)
   */
  public fun snapshotCopyManual(): Any? = unwrap(this).getSnapshotCopyManual()

  /**
   * The number of days to retain automated snapshots in the destination AWS Region after they are
   * copied from the source AWS Region .
   *
   * By default, this only changes the retention period of copied automated snapshots.
   *
   * If you decrease the retention period for automated snapshots that are copied to a destination
   * AWS Region , Amazon Redshift deletes any existing automated snapshots that were copied to the
   * destination AWS Region and that fall outside of the new retention period.
   *
   * Constraints: Must be at least 1 and no more than 35 for automated snapshots.
   *
   * If you specify the `manual` option, only newly copied manual snapshots will have the new
   * retention period.
   *
   * If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
   *
   * Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual
   * snapshots.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopyretentionperiod)
   */
  public fun snapshotCopyRetentionPeriod(): Number? = unwrap(this).getSnapshotCopyRetentionPeriod()

  /**
   * The name of the snapshot from which to create the new cluster.
   *
   * This parameter isn't case sensitive. You must specify this parameter or `snapshotArn` , but not
   * both.
   *
   * Example: `my-snapshot-id`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier)
   */
  public fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  /**
   * A list of tag instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
   *
   * Default: The default VPC security group is associated with the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowVersionUpgrade If `true` , major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the cluster.
     * When a new major version of the Amazon Redshift engine is released, you can request that the
     * service automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     * that is running on your cluster.
     *
     * Default: `true`
     */
    public fun allowVersionUpgrade(allowVersionUpgrade: Boolean)

    /**
     * @param allowVersionUpgrade If `true` , major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the cluster.
     * When a new major version of the Amazon Redshift engine is released, you can request that the
     * service automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     * that is running on your cluster.
     *
     * Default: `true`
     */
    public fun allowVersionUpgrade(allowVersionUpgrade: IResolvable)

    /**
     * @param aquaConfigurationStatus This parameter is retired.
     * It does not set the AQUA configuration status. Amazon Redshift automatically determines
     * whether to use AQUA (Advanced Query Accelerator).
     */
    public fun aquaConfigurationStatus(aquaConfigurationStatus: String)

    /**
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are
     * retained.
     * If the value is 0, automated snapshots are disabled. Even if automated snapshots are
     * disabled, you can still create manual snapshots when you want with
     * [CreateClusterSnapshot](https://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterSnapshot.html)
     * in the *Amazon Redshift API Reference* .
     *
     * Default: `1`
     *
     * Constraints: Must be a value from 0 to 35.
     */
    public fun automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod: Number)

    /**
     * @param availabilityZone The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     * provision the cluster.
     * For example, if you have several EC2 instances running in a specific Availability Zone, then
     * you might want the cluster to be provisioned in the same zone in order to decrease network
     * latency.
     *
     * Default: A random, system-chosen Availability Zone in the region that is specified by the
     * endpoint.
     *
     * Example: `us-east-2d`
     *
     * Constraint: The specified Availability Zone must be in the same region as the current
     * endpoint.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param availabilityZoneRelocation The option to enable relocation for an Amazon Redshift
     * cluster between Availability Zones after the cluster is created.
     */
    public fun availabilityZoneRelocation(availabilityZoneRelocation: Boolean)

    /**
     * @param availabilityZoneRelocation The option to enable relocation for an Amazon Redshift
     * cluster between Availability Zones after the cluster is created.
     */
    public fun availabilityZoneRelocation(availabilityZoneRelocation: IResolvable)

    /**
     * @param availabilityZoneRelocationStatus Describes the status of the Availability Zone
     * relocation operation.
     */
    public fun availabilityZoneRelocationStatus(availabilityZoneRelocationStatus: String)

    /**
     * @param classic A boolean value indicating whether the resize operation is using the classic
     * resize process.
     * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
     */
    public fun classic(classic: Boolean)

    /**
     * @param classic A boolean value indicating whether the resize operation is using the classic
     * resize process.
     * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
     */
    public fun classic(classic: IResolvable)

    /**
     * @param clusterIdentifier A unique identifier for the cluster.
     * You use this identifier to refer to the cluster for any subsequent cluster operations such as
     * deleting or modifying. The identifier also appears in the Amazon Redshift console.
     *
     * Constraints:
     *
     * * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * * Alphabetic characters must be lowercase.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     * * Must be unique for all clusters within an AWS account .
     *
     * Example: `myexamplecluster`
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * @param clusterParameterGroupName The name of the parameter group to be associated with this
     * cluster.
     * Default: The default Amazon Redshift cluster parameter group. For information about the
     * default parameter group, go to [Working with Amazon Redshift Parameter
     * Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html)
     *
     * Constraints:
     *
     * * Must be 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     */
    public fun clusterParameterGroupName(clusterParameterGroupName: String)

    /**
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster.
     * Default: The default cluster security group for Amazon Redshift.
     */
    public fun clusterSecurityGroups(clusterSecurityGroups: List<String>)

    /**
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster.
     * Default: The default cluster security group for Amazon Redshift.
     */
    public fun clusterSecurityGroups(vararg clusterSecurityGroups: String)

    /**
     * @param clusterSubnetGroupName The name of a cluster subnet group to be associated with this
     * cluster.
     * If this parameter is not provided the resulting cluster will be deployed outside virtual
     * private cloud (VPC).
     */
    public fun clusterSubnetGroupName(clusterSubnetGroupName: String)

    /**
     * @param clusterType The type of the cluster. When cluster type is specified as. 
     * * `single-node` , the *NumberOfNodes* parameter is not required.
     * * `multi-node` , the *NumberOfNodes* parameter is required.
     *
     * Valid Values: `multi-node` | `single-node`
     *
     * Default: `multi-node`
     */
    public fun clusterType(clusterType: String)

    /**
     * @param clusterVersion The version of the Amazon Redshift engine software that you want to
     * deploy on the cluster.
     * The version selected runs on all the nodes in the cluster.
     *
     * Constraints: Only version 1.0 is currently available.
     *
     * Example: `1.0`
     */
    public fun clusterVersion(clusterVersion: String)

    /**
     * @param dbName The name of the first database to be created when the cluster is created. 
     * To create additional databases after the cluster is created, connect to the cluster with a
     * SQL client and use SQL commands to create a database. For more information, go to [Create a
     * Database](https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html) in the Amazon
     * Redshift Database Developer Guide.
     *
     * Default: `dev`
     *
     * Constraints:
     *
     * * Must contain 1 to 64 alphanumeric characters.
     * * Must contain only lowercase letters.
     * * Cannot be a word that is reserved by the service. A list of reserved words can be found in
     * [Reserved Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the
     * Amazon Redshift Database Developer Guide.
     */
    public fun dbName(dbName: String)

    /**
     * @param deferMaintenance A Boolean indicating whether to enable the deferred maintenance
     * window.
     */
    public fun deferMaintenance(deferMaintenance: Boolean)

    /**
     * @param deferMaintenance A Boolean indicating whether to enable the deferred maintenance
     * window.
     */
    public fun deferMaintenance(deferMaintenance: IResolvable)

    /**
     * @param deferMaintenanceDuration An integer indicating the duration of the maintenance window
     * in days.
     * If you specify a duration, you can't specify an end time. The duration must be 45 days or
     * less.
     */
    public fun deferMaintenanceDuration(deferMaintenanceDuration: Number)

    /**
     * @param deferMaintenanceEndTime A timestamp for the end of the time period when we defer
     * maintenance.
     */
    public fun deferMaintenanceEndTime(deferMaintenanceEndTime: String)

    /**
     * @param deferMaintenanceStartTime A timestamp indicating the start time for the deferred
     * maintenance window.
     */
    public fun deferMaintenanceStartTime(deferMaintenanceStartTime: String)

    /**
     * @param destinationRegion The destination region that snapshots are automatically copied to
     * when cross-region snapshot copy is enabled.
     */
    public fun destinationRegion(destinationRegion: String)

    /**
     * @param elasticIp The Elastic IP (EIP) address for the cluster.
     * Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an
     * Internet gateway. Don't specify the Elastic IP address for a publicly accessible cluster with
     * availability zone relocation turned on. For more information about provisioning clusters in
     * EC2-VPC, go to [Supported Platforms to Launch Your
     * Cluster](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms)
     * in the Amazon Redshift Cluster Management Guide.
     */
    public fun elasticIp(elasticIp: String)

    /**
     * @param encrypted If `true` , the data in the cluster is encrypted at rest.
     * If you set the value on this parameter to `false` , the request will fail.
     *
     * Default: true
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * @param encrypted If `true` , the data in the cluster is encrypted at rest.
     * If you set the value on this parameter to `false` , the request will fail.
     *
     * Default: true
     */
    public fun encrypted(encrypted: IResolvable)

    /**
     * @param endpoint The connection endpoint.
     */
    public fun endpoint(endpoint: IResolvable)

    /**
     * @param endpoint The connection endpoint.
     */
    public fun endpoint(endpoint: CfnCluster.EndpointProperty)

    /**
     * @param endpoint The connection endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfed4922e5f250405228a544bd84b136fdd0cd5b2812b681945a180f8812e01a")
    public fun endpoint(endpoint: CfnCluster.EndpointProperty.Builder.() -> Unit)

    /**
     * @param enhancedVpcRouting An option that specifies whether to create the cluster with
     * enhanced VPC routing enabled.
     * To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more
     * information, see [Enhanced VPC
     * Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html) in the
     * Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean)

    /**
     * @param enhancedVpcRouting An option that specifies whether to create the cluster with
     * enhanced VPC routing enabled.
     * To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more
     * information, see [Enhanced VPC
     * Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html) in the
     * Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable)

    /**
     * @param hsmClientCertificateIdentifier Specifies the name of the HSM client certificate the
     * Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
     */
    public fun hsmClientCertificateIdentifier(hsmClientCertificateIdentifier: String)

    /**
     * @param hsmConfigurationIdentifier Specifies the name of the HSM configuration that contains
     * the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     */
    public fun hsmConfigurationIdentifier(hsmConfigurationIdentifier: String)

    /**
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be used by
     * the cluster to access other AWS services.
     * You must supply the IAM roles in their Amazon Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to [Quotas and
     * limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html) in the
     * *Amazon Redshift Cluster Management Guide* .
     */
    public fun iamRoles(iamRoles: List<String>)

    /**
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be used by
     * the cluster to access other AWS services.
     * You must supply the IAM roles in their Amazon Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to [Quotas and
     * limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html) in the
     * *Amazon Redshift Cluster Management Guide* .
     */
    public fun iamRoles(vararg iamRoles: String)

    /**
     * @param kmsKeyId The AWS Key Management Service (KMS) key ID of the encryption key that you
     * want to use to encrypt data in the cluster.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster.
     */
    public fun loggingProperties(loggingProperties: IResolvable)

    /**
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster.
     */
    public fun loggingProperties(loggingProperties: CfnCluster.LoggingPropertiesProperty)

    /**
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee943571b6accd866a1f7cc55dde370e4aabaeca6d883765b8dc66c1cceee903")
    public
        fun loggingProperties(loggingProperties: CfnCluster.LoggingPropertiesProperty.Builder.() -> Unit)

    /**
     * @param maintenanceTrackName An optional parameter for the name of the maintenance track for
     * the cluster.
     * If you don't provide a maintenance track name, the cluster is assigned to the `current`
     * track.
     */
    public fun maintenanceTrackName(maintenanceTrackName: String)

    /**
     * @param manageMasterPassword If `true` , Amazon Redshift uses AWS Secrets Manager to manage
     * this cluster's admin credentials.
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is true. If
     * `ManageMasterPassword` is false or not set, Amazon Redshift uses `MasterUserPassword` for the
     * admin user account's password.
     */
    public fun manageMasterPassword(manageMasterPassword: Boolean)

    /**
     * @param manageMasterPassword If `true` , Amazon Redshift uses AWS Secrets Manager to manage
     * this cluster's admin credentials.
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is true. If
     * `ManageMasterPassword` is false or not set, Amazon Redshift uses `MasterUserPassword` for the
     * admin user account's password.
     */
    public fun manageMasterPassword(manageMasterPassword: IResolvable)

    /**
     * @param manualSnapshotRetentionPeriod The default number of days to retain a manual snapshot.
     * If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the
     * retention period of existing snapshots.
     *
     * The value must be either -1 or an integer between 1 and 3,653.
     */
    public fun manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod: Number)

    /**
     * @param masterPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used
     * to encrypt and store the cluster's admin credentials secret.
     * You can only use this parameter if `ManageMasterPassword` is true.
     */
    public fun masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId: String)

    /**
     * @param masterUserPassword The password associated with the admin user account for the cluster
     * that is being created.
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is `true` .
     *
     * Constraints:
     *
     * * Must be between 8 and 64 characters in length.
     * * Must contain at least one uppercase letter.
     * * Must contain at least one lowercase letter.
     * * Must contain one number.
     * * Can be any printable ASCII character (ASCII code 33-126) except `'` (single quote), `"`
     * (double quote), `\` , `/` , or `&#64;` .
     */
    public fun masterUserPassword(masterUserPassword: String)

    /**
     * @param masterUsername The user name associated with the admin user account for the cluster
     * that is being created. 
     * Constraints:
     *
     * * Must be 1 - 128 alphanumeric characters or hyphens. The user name can't be `PUBLIC` .
     * * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at
     * symbol (&#64;), or hyphen.
     * * The first character must be a letter.
     * * Must not contain a colon (:) or a slash (/).
     * * Cannot be a reserved word. A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the Amazon Redshift
     * Database Developer Guide.
     */
    public fun masterUsername(masterUsername: String)

    /**
     * @param multiAz A boolean indicating whether Amazon Redshift should deploy the cluster in two
     * Availability Zones.
     * The default is false.
     */
    public fun multiAz(multiAz: Boolean)

    /**
     * @param multiAz A boolean indicating whether Amazon Redshift should deploy the cluster in two
     * Availability Zones.
     * The default is false.
     */
    public fun multiAz(multiAz: IResolvable)

    /**
     * @param namespaceResourcePolicy The policy that is attached to a resource.
     */
    public fun namespaceResourcePolicy(namespaceResourcePolicy: Any)

    /**
     * @param nodeType The node type to be provisioned for the cluster. 
     * For information about node types, go to [Working with
     * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * Valid Values: `dc2.large` | `dc2.8xlarge` | `ra3.large` | `ra3.xlplus` | `ra3.4xlarge` |
     * `ra3.16xlarge`
     */
    public fun nodeType(nodeType: String)

    /**
     * @param numberOfNodes The number of compute nodes in the cluster.
     * This parameter is required when the *ClusterType* parameter is specified as `multi-node` .
     *
     * For information about determining how many nodes you need, go to [Working with
     * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * If you don't specify this parameter, you get a single-node cluster. When requesting a
     * multi-node cluster, you must specify the number of nodes that you want in the cluster.
     *
     * Default: `1`
     *
     * Constraints: Value must be at least 1 and no more than 100.
     */
    public fun numberOfNodes(numberOfNodes: Number)

    /**
     * @param ownerAccount The AWS account used to create or copy the snapshot.
     * Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
     */
    public fun ownerAccount(ownerAccount: String)

    /**
     * @param port The port number on which the cluster accepts incoming connections.
     * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the
     * connection string requires the port on which the cluster will listen for incoming connections.
     *
     * Default: `5439`
     *
     * Valid Values:
     *
     * * For clusters with ra3 nodes - Select a port within the ranges `5431-5455` or `8191-8215` .
     * (If you have an existing cluster with ra3 nodes, it isn't required that you change the port to
     * these ranges.)
     * * For clusters with dc2 nodes - Select a port within the range `1150-65535` .
     */
    public fun port(port: Number)

    /**
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which automated
     * cluster maintenance can occur.
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * Default: A 30-minute window selected at random from an 8-hour block of time per region,
     * occurring on a random day of the week. For more information about the time blocks for each
     * region, see [Maintenance
     * Windows](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows)
     * in Amazon Redshift Cluster Management Guide.
     *
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *
     * Constraints: Minimum 30-minute window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param publiclyAccessible If `true` , the cluster can be accessed from a public network.
     * Default: false
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible If `true` , the cluster can be accessed from a public network.
     * Default: false
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param resourceAction The Amazon Redshift operation to be performed.
     * Supported operations are `pause-cluster` , `resume-cluster` , and `failover-primary-compute`
     * .
     */
    public fun resourceAction(resourceAction: String)

    /**
     * @param revisionTarget Describes a `RevisionTarget` object.
     */
    public fun revisionTarget(revisionTarget: String)

    /**
     * @param rotateEncryptionKey Rotates the encryption keys for a cluster.
     */
    public fun rotateEncryptionKey(rotateEncryptionKey: Boolean)

    /**
     * @param rotateEncryptionKey Rotates the encryption keys for a cluster.
     */
    public fun rotateEncryptionKey(rotateEncryptionKey: IResolvable)

    /**
     * @param snapshotClusterIdentifier The name of the cluster the source snapshot was created
     * from.
     * This parameter is required if your user or role has a policy containing a snapshot resource
     * element that specifies anything other than * for the cluster name.
     */
    public fun snapshotClusterIdentifier(snapshotClusterIdentifier: String)

    /**
     * @param snapshotCopyGrantName The name of the snapshot copy grant.
     */
    public fun snapshotCopyGrantName(snapshotCopyGrantName: String)

    /**
     * @param snapshotCopyManual Indicates whether to apply the snapshot retention period to newly
     * copied manual snapshots instead of automated snapshots.
     */
    public fun snapshotCopyManual(snapshotCopyManual: Boolean)

    /**
     * @param snapshotCopyManual Indicates whether to apply the snapshot retention period to newly
     * copied manual snapshots instead of automated snapshots.
     */
    public fun snapshotCopyManual(snapshotCopyManual: IResolvable)

    /**
     * @param snapshotCopyRetentionPeriod The number of days to retain automated snapshots in the
     * destination AWS Region after they are copied from the source AWS Region .
     * By default, this only changes the retention period of copied automated snapshots.
     *
     * If you decrease the retention period for automated snapshots that are copied to a destination
     * AWS Region , Amazon Redshift deletes any existing automated snapshots that were copied to the
     * destination AWS Region and that fall outside of the new retention period.
     *
     * Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     *
     * If you specify the `manual` option, only newly copied manual snapshots will have the new
     * retention period.
     *
     * If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     *
     * Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for
     * manual snapshots.
     */
    public fun snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod: Number)

    /**
     * @param snapshotIdentifier The name of the snapshot from which to create the new cluster.
     * This parameter isn't case sensitive. You must specify this parameter or `snapshotArn` , but
     * not both.
     *
     * Example: `my-snapshot-id`
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

    /**
     * @param tags A list of tag instances.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tag instances.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be
     * associated with the cluster.
     * Default: The default VPC security group is associated with the cluster.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be
     * associated with the cluster.
     * Default: The default VPC security group is associated with the cluster.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnClusterProps.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterProps.builder()

    /**
     * @param allowVersionUpgrade If `true` , major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the cluster.
     * When a new major version of the Amazon Redshift engine is released, you can request that the
     * service automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     * that is running on your cluster.
     *
     * Default: `true`
     */
    override fun allowVersionUpgrade(allowVersionUpgrade: Boolean) {
      cdkBuilder.allowVersionUpgrade(allowVersionUpgrade)
    }

    /**
     * @param allowVersionUpgrade If `true` , major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on the cluster.
     * When a new major version of the Amazon Redshift engine is released, you can request that the
     * service automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     * that is running on your cluster.
     *
     * Default: `true`
     */
    override fun allowVersionUpgrade(allowVersionUpgrade: IResolvable) {
      cdkBuilder.allowVersionUpgrade(allowVersionUpgrade.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param aquaConfigurationStatus This parameter is retired.
     * It does not set the AQUA configuration status. Amazon Redshift automatically determines
     * whether to use AQUA (Advanced Query Accelerator).
     */
    override fun aquaConfigurationStatus(aquaConfigurationStatus: String) {
      cdkBuilder.aquaConfigurationStatus(aquaConfigurationStatus)
    }

    /**
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are
     * retained.
     * If the value is 0, automated snapshots are disabled. Even if automated snapshots are
     * disabled, you can still create manual snapshots when you want with
     * [CreateClusterSnapshot](https://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterSnapshot.html)
     * in the *Amazon Redshift API Reference* .
     *
     * Default: `1`
     *
     * Constraints: Must be a value from 0 to 35.
     */
    override fun automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod: Number) {
      cdkBuilder.automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod)
    }

    /**
     * @param availabilityZone The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     * provision the cluster.
     * For example, if you have several EC2 instances running in a specific Availability Zone, then
     * you might want the cluster to be provisioned in the same zone in order to decrease network
     * latency.
     *
     * Default: A random, system-chosen Availability Zone in the region that is specified by the
     * endpoint.
     *
     * Example: `us-east-2d`
     *
     * Constraint: The specified Availability Zone must be in the same region as the current
     * endpoint.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param availabilityZoneRelocation The option to enable relocation for an Amazon Redshift
     * cluster between Availability Zones after the cluster is created.
     */
    override fun availabilityZoneRelocation(availabilityZoneRelocation: Boolean) {
      cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation)
    }

    /**
     * @param availabilityZoneRelocation The option to enable relocation for an Amazon Redshift
     * cluster between Availability Zones after the cluster is created.
     */
    override fun availabilityZoneRelocation(availabilityZoneRelocation: IResolvable) {
      cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param availabilityZoneRelocationStatus Describes the status of the Availability Zone
     * relocation operation.
     */
    override fun availabilityZoneRelocationStatus(availabilityZoneRelocationStatus: String) {
      cdkBuilder.availabilityZoneRelocationStatus(availabilityZoneRelocationStatus)
    }

    /**
     * @param classic A boolean value indicating whether the resize operation is using the classic
     * resize process.
     * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
     */
    override fun classic(classic: Boolean) {
      cdkBuilder.classic(classic)
    }

    /**
     * @param classic A boolean value indicating whether the resize operation is using the classic
     * resize process.
     * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
     */
    override fun classic(classic: IResolvable) {
      cdkBuilder.classic(classic.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param clusterIdentifier A unique identifier for the cluster.
     * You use this identifier to refer to the cluster for any subsequent cluster operations such as
     * deleting or modifying. The identifier also appears in the Amazon Redshift console.
     *
     * Constraints:
     *
     * * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * * Alphabetic characters must be lowercase.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     * * Must be unique for all clusters within an AWS account .
     *
     * Example: `myexamplecluster`
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param clusterParameterGroupName The name of the parameter group to be associated with this
     * cluster.
     * Default: The default Amazon Redshift cluster parameter group. For information about the
     * default parameter group, go to [Working with Amazon Redshift Parameter
     * Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html)
     *
     * Constraints:
     *
     * * Must be 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     */
    override fun clusterParameterGroupName(clusterParameterGroupName: String) {
      cdkBuilder.clusterParameterGroupName(clusterParameterGroupName)
    }

    /**
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster.
     * Default: The default cluster security group for Amazon Redshift.
     */
    override fun clusterSecurityGroups(clusterSecurityGroups: List<String>) {
      cdkBuilder.clusterSecurityGroups(clusterSecurityGroups)
    }

    /**
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster.
     * Default: The default cluster security group for Amazon Redshift.
     */
    override fun clusterSecurityGroups(vararg clusterSecurityGroups: String): Unit =
        clusterSecurityGroups(clusterSecurityGroups.toList())

    /**
     * @param clusterSubnetGroupName The name of a cluster subnet group to be associated with this
     * cluster.
     * If this parameter is not provided the resulting cluster will be deployed outside virtual
     * private cloud (VPC).
     */
    override fun clusterSubnetGroupName(clusterSubnetGroupName: String) {
      cdkBuilder.clusterSubnetGroupName(clusterSubnetGroupName)
    }

    /**
     * @param clusterType The type of the cluster. When cluster type is specified as. 
     * * `single-node` , the *NumberOfNodes* parameter is not required.
     * * `multi-node` , the *NumberOfNodes* parameter is required.
     *
     * Valid Values: `multi-node` | `single-node`
     *
     * Default: `multi-node`
     */
    override fun clusterType(clusterType: String) {
      cdkBuilder.clusterType(clusterType)
    }

    /**
     * @param clusterVersion The version of the Amazon Redshift engine software that you want to
     * deploy on the cluster.
     * The version selected runs on all the nodes in the cluster.
     *
     * Constraints: Only version 1.0 is currently available.
     *
     * Example: `1.0`
     */
    override fun clusterVersion(clusterVersion: String) {
      cdkBuilder.clusterVersion(clusterVersion)
    }

    /**
     * @param dbName The name of the first database to be created when the cluster is created. 
     * To create additional databases after the cluster is created, connect to the cluster with a
     * SQL client and use SQL commands to create a database. For more information, go to [Create a
     * Database](https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html) in the Amazon
     * Redshift Database Developer Guide.
     *
     * Default: `dev`
     *
     * Constraints:
     *
     * * Must contain 1 to 64 alphanumeric characters.
     * * Must contain only lowercase letters.
     * * Cannot be a word that is reserved by the service. A list of reserved words can be found in
     * [Reserved Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the
     * Amazon Redshift Database Developer Guide.
     */
    override fun dbName(dbName: String) {
      cdkBuilder.dbName(dbName)
    }

    /**
     * @param deferMaintenance A Boolean indicating whether to enable the deferred maintenance
     * window.
     */
    override fun deferMaintenance(deferMaintenance: Boolean) {
      cdkBuilder.deferMaintenance(deferMaintenance)
    }

    /**
     * @param deferMaintenance A Boolean indicating whether to enable the deferred maintenance
     * window.
     */
    override fun deferMaintenance(deferMaintenance: IResolvable) {
      cdkBuilder.deferMaintenance(deferMaintenance.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deferMaintenanceDuration An integer indicating the duration of the maintenance window
     * in days.
     * If you specify a duration, you can't specify an end time. The duration must be 45 days or
     * less.
     */
    override fun deferMaintenanceDuration(deferMaintenanceDuration: Number) {
      cdkBuilder.deferMaintenanceDuration(deferMaintenanceDuration)
    }

    /**
     * @param deferMaintenanceEndTime A timestamp for the end of the time period when we defer
     * maintenance.
     */
    override fun deferMaintenanceEndTime(deferMaintenanceEndTime: String) {
      cdkBuilder.deferMaintenanceEndTime(deferMaintenanceEndTime)
    }

    /**
     * @param deferMaintenanceStartTime A timestamp indicating the start time for the deferred
     * maintenance window.
     */
    override fun deferMaintenanceStartTime(deferMaintenanceStartTime: String) {
      cdkBuilder.deferMaintenanceStartTime(deferMaintenanceStartTime)
    }

    /**
     * @param destinationRegion The destination region that snapshots are automatically copied to
     * when cross-region snapshot copy is enabled.
     */
    override fun destinationRegion(destinationRegion: String) {
      cdkBuilder.destinationRegion(destinationRegion)
    }

    /**
     * @param elasticIp The Elastic IP (EIP) address for the cluster.
     * Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an
     * Internet gateway. Don't specify the Elastic IP address for a publicly accessible cluster with
     * availability zone relocation turned on. For more information about provisioning clusters in
     * EC2-VPC, go to [Supported Platforms to Launch Your
     * Cluster](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms)
     * in the Amazon Redshift Cluster Management Guide.
     */
    override fun elasticIp(elasticIp: String) {
      cdkBuilder.elasticIp(elasticIp)
    }

    /**
     * @param encrypted If `true` , the data in the cluster is encrypted at rest.
     * If you set the value on this parameter to `false` , the request will fail.
     *
     * Default: true
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted If `true` , the data in the cluster is encrypted at rest.
     * If you set the value on this parameter to `false` , the request will fail.
     *
     * Default: true
     */
    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param endpoint The connection endpoint.
     */
    override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param endpoint The connection endpoint.
     */
    override fun endpoint(endpoint: CfnCluster.EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(CfnCluster.EndpointProperty.Companion::unwrap))
    }

    /**
     * @param endpoint The connection endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfed4922e5f250405228a544bd84b136fdd0cd5b2812b681945a180f8812e01a")
    override fun endpoint(endpoint: CfnCluster.EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(CfnCluster.EndpointProperty(endpoint))

    /**
     * @param enhancedVpcRouting An option that specifies whether to create the cluster with
     * enhanced VPC routing enabled.
     * To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more
     * information, see [Enhanced VPC
     * Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html) in the
     * Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     */
    override fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    /**
     * @param enhancedVpcRouting An option that specifies whether to create the cluster with
     * enhanced VPC routing enabled.
     * To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more
     * information, see [Enhanced VPC
     * Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html) in the
     * Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     */
    override fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param hsmClientCertificateIdentifier Specifies the name of the HSM client certificate the
     * Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
     */
    override fun hsmClientCertificateIdentifier(hsmClientCertificateIdentifier: String) {
      cdkBuilder.hsmClientCertificateIdentifier(hsmClientCertificateIdentifier)
    }

    /**
     * @param hsmConfigurationIdentifier Specifies the name of the HSM configuration that contains
     * the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     */
    override fun hsmConfigurationIdentifier(hsmConfigurationIdentifier: String) {
      cdkBuilder.hsmConfigurationIdentifier(hsmConfigurationIdentifier)
    }

    /**
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be used by
     * the cluster to access other AWS services.
     * You must supply the IAM roles in their Amazon Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to [Quotas and
     * limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html) in the
     * *Amazon Redshift Cluster Management Guide* .
     */
    override fun iamRoles(iamRoles: List<String>) {
      cdkBuilder.iamRoles(iamRoles)
    }

    /**
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be used by
     * the cluster to access other AWS services.
     * You must supply the IAM roles in their Amazon Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to [Quotas and
     * limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html) in the
     * *Amazon Redshift Cluster Management Guide* .
     */
    override fun iamRoles(vararg iamRoles: String): Unit = iamRoles(iamRoles.toList())

    /**
     * @param kmsKeyId The AWS Key Management Service (KMS) key ID of the encryption key that you
     * want to use to encrypt data in the cluster.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster.
     */
    override fun loggingProperties(loggingProperties: IResolvable) {
      cdkBuilder.loggingProperties(loggingProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster.
     */
    override fun loggingProperties(loggingProperties: CfnCluster.LoggingPropertiesProperty) {
      cdkBuilder.loggingProperties(loggingProperties.let(CfnCluster.LoggingPropertiesProperty.Companion::unwrap))
    }

    /**
     * @param loggingProperties Specifies logging information, such as queries and connection
     * attempts, for the specified Amazon Redshift cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee943571b6accd866a1f7cc55dde370e4aabaeca6d883765b8dc66c1cceee903")
    override
        fun loggingProperties(loggingProperties: CfnCluster.LoggingPropertiesProperty.Builder.() -> Unit):
        Unit = loggingProperties(CfnCluster.LoggingPropertiesProperty(loggingProperties))

    /**
     * @param maintenanceTrackName An optional parameter for the name of the maintenance track for
     * the cluster.
     * If you don't provide a maintenance track name, the cluster is assigned to the `current`
     * track.
     */
    override fun maintenanceTrackName(maintenanceTrackName: String) {
      cdkBuilder.maintenanceTrackName(maintenanceTrackName)
    }

    /**
     * @param manageMasterPassword If `true` , Amazon Redshift uses AWS Secrets Manager to manage
     * this cluster's admin credentials.
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is true. If
     * `ManageMasterPassword` is false or not set, Amazon Redshift uses `MasterUserPassword` for the
     * admin user account's password.
     */
    override fun manageMasterPassword(manageMasterPassword: Boolean) {
      cdkBuilder.manageMasterPassword(manageMasterPassword)
    }

    /**
     * @param manageMasterPassword If `true` , Amazon Redshift uses AWS Secrets Manager to manage
     * this cluster's admin credentials.
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is true. If
     * `ManageMasterPassword` is false or not set, Amazon Redshift uses `MasterUserPassword` for the
     * admin user account's password.
     */
    override fun manageMasterPassword(manageMasterPassword: IResolvable) {
      cdkBuilder.manageMasterPassword(manageMasterPassword.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param manualSnapshotRetentionPeriod The default number of days to retain a manual snapshot.
     * If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the
     * retention period of existing snapshots.
     *
     * The value must be either -1 or an integer between 1 and 3,653.
     */
    override fun manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod: Number) {
      cdkBuilder.manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod)
    }

    /**
     * @param masterPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used
     * to encrypt and store the cluster's admin credentials secret.
     * You can only use this parameter if `ManageMasterPassword` is true.
     */
    override fun masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId: String) {
      cdkBuilder.masterPasswordSecretKmsKeyId(masterPasswordSecretKmsKeyId)
    }

    /**
     * @param masterUserPassword The password associated with the admin user account for the cluster
     * that is being created.
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is `true` .
     *
     * Constraints:
     *
     * * Must be between 8 and 64 characters in length.
     * * Must contain at least one uppercase letter.
     * * Must contain at least one lowercase letter.
     * * Must contain one number.
     * * Can be any printable ASCII character (ASCII code 33-126) except `'` (single quote), `"`
     * (double quote), `\` , `/` , or `&#64;` .
     */
    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    /**
     * @param masterUsername The user name associated with the admin user account for the cluster
     * that is being created. 
     * Constraints:
     *
     * * Must be 1 - 128 alphanumeric characters or hyphens. The user name can't be `PUBLIC` .
     * * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at
     * symbol (&#64;), or hyphen.
     * * The first character must be a letter.
     * * Must not contain a colon (:) or a slash (/).
     * * Cannot be a reserved word. A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the Amazon Redshift
     * Database Developer Guide.
     */
    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * @param multiAz A boolean indicating whether Amazon Redshift should deploy the cluster in two
     * Availability Zones.
     * The default is false.
     */
    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    /**
     * @param multiAz A boolean indicating whether Amazon Redshift should deploy the cluster in two
     * Availability Zones.
     * The default is false.
     */
    override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param namespaceResourcePolicy The policy that is attached to a resource.
     */
    override fun namespaceResourcePolicy(namespaceResourcePolicy: Any) {
      cdkBuilder.namespaceResourcePolicy(namespaceResourcePolicy)
    }

    /**
     * @param nodeType The node type to be provisioned for the cluster. 
     * For information about node types, go to [Working with
     * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * Valid Values: `dc2.large` | `dc2.8xlarge` | `ra3.large` | `ra3.xlplus` | `ra3.4xlarge` |
     * `ra3.16xlarge`
     */
    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    /**
     * @param numberOfNodes The number of compute nodes in the cluster.
     * This parameter is required when the *ClusterType* parameter is specified as `multi-node` .
     *
     * For information about determining how many nodes you need, go to [Working with
     * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * If you don't specify this parameter, you get a single-node cluster. When requesting a
     * multi-node cluster, you must specify the number of nodes that you want in the cluster.
     *
     * Default: `1`
     *
     * Constraints: Value must be at least 1 and no more than 100.
     */
    override fun numberOfNodes(numberOfNodes: Number) {
      cdkBuilder.numberOfNodes(numberOfNodes)
    }

    /**
     * @param ownerAccount The AWS account used to create or copy the snapshot.
     * Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
     */
    override fun ownerAccount(ownerAccount: String) {
      cdkBuilder.ownerAccount(ownerAccount)
    }

    /**
     * @param port The port number on which the cluster accepts incoming connections.
     * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the
     * connection string requires the port on which the cluster will listen for incoming connections.
     *
     * Default: `5439`
     *
     * Valid Values:
     *
     * * For clusters with ra3 nodes - Select a port within the ranges `5431-5455` or `8191-8215` .
     * (If you have an existing cluster with ra3 nodes, it isn't required that you change the port to
     * these ranges.)
     * * For clusters with dc2 nodes - Select a port within the range `1150-65535` .
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which automated
     * cluster maintenance can occur.
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * Default: A 30-minute window selected at random from an 8-hour block of time per region,
     * occurring on a random day of the week. For more information about the time blocks for each
     * region, see [Maintenance
     * Windows](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows)
     * in Amazon Redshift Cluster Management Guide.
     *
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *
     * Constraints: Minimum 30-minute window.
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param publiclyAccessible If `true` , the cluster can be accessed from a public network.
     * Default: false
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible If `true` , the cluster can be accessed from a public network.
     * Default: false
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourceAction The Amazon Redshift operation to be performed.
     * Supported operations are `pause-cluster` , `resume-cluster` , and `failover-primary-compute`
     * .
     */
    override fun resourceAction(resourceAction: String) {
      cdkBuilder.resourceAction(resourceAction)
    }

    /**
     * @param revisionTarget Describes a `RevisionTarget` object.
     */
    override fun revisionTarget(revisionTarget: String) {
      cdkBuilder.revisionTarget(revisionTarget)
    }

    /**
     * @param rotateEncryptionKey Rotates the encryption keys for a cluster.
     */
    override fun rotateEncryptionKey(rotateEncryptionKey: Boolean) {
      cdkBuilder.rotateEncryptionKey(rotateEncryptionKey)
    }

    /**
     * @param rotateEncryptionKey Rotates the encryption keys for a cluster.
     */
    override fun rotateEncryptionKey(rotateEncryptionKey: IResolvable) {
      cdkBuilder.rotateEncryptionKey(rotateEncryptionKey.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param snapshotClusterIdentifier The name of the cluster the source snapshot was created
     * from.
     * This parameter is required if your user or role has a policy containing a snapshot resource
     * element that specifies anything other than * for the cluster name.
     */
    override fun snapshotClusterIdentifier(snapshotClusterIdentifier: String) {
      cdkBuilder.snapshotClusterIdentifier(snapshotClusterIdentifier)
    }

    /**
     * @param snapshotCopyGrantName The name of the snapshot copy grant.
     */
    override fun snapshotCopyGrantName(snapshotCopyGrantName: String) {
      cdkBuilder.snapshotCopyGrantName(snapshotCopyGrantName)
    }

    /**
     * @param snapshotCopyManual Indicates whether to apply the snapshot retention period to newly
     * copied manual snapshots instead of automated snapshots.
     */
    override fun snapshotCopyManual(snapshotCopyManual: Boolean) {
      cdkBuilder.snapshotCopyManual(snapshotCopyManual)
    }

    /**
     * @param snapshotCopyManual Indicates whether to apply the snapshot retention period to newly
     * copied manual snapshots instead of automated snapshots.
     */
    override fun snapshotCopyManual(snapshotCopyManual: IResolvable) {
      cdkBuilder.snapshotCopyManual(snapshotCopyManual.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param snapshotCopyRetentionPeriod The number of days to retain automated snapshots in the
     * destination AWS Region after they are copied from the source AWS Region .
     * By default, this only changes the retention period of copied automated snapshots.
     *
     * If you decrease the retention period for automated snapshots that are copied to a destination
     * AWS Region , Amazon Redshift deletes any existing automated snapshots that were copied to the
     * destination AWS Region and that fall outside of the new retention period.
     *
     * Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     *
     * If you specify the `manual` option, only newly copied manual snapshots will have the new
     * retention period.
     *
     * If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     *
     * Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for
     * manual snapshots.
     */
    override fun snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod: Number) {
      cdkBuilder.snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod)
    }

    /**
     * @param snapshotIdentifier The name of the snapshot from which to create the new cluster.
     * This parameter isn't case sensitive. You must specify this parameter or `snapshotArn` , but
     * not both.
     *
     * Example: `my-snapshot-id`
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /**
     * @param tags A list of tag instances.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tag instances.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be
     * associated with the cluster.
     * Default: The default VPC security group is associated with the cluster.
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be
     * associated with the cluster.
     * Default: The default VPC security group is associated with the cluster.
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.redshift.CfnClusterProps,
  ) : CdkObject(cdkObject),
      CfnClusterProps {
    /**
     * If `true` , major version upgrades can be applied during the maintenance window to the Amazon
     * Redshift engine that is running on the cluster.
     *
     * When a new major version of the Amazon Redshift engine is released, you can request that the
     * service automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     * that is running on your cluster.
     *
     * Default: `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade)
     */
    override fun allowVersionUpgrade(): Any? = unwrap(this).getAllowVersionUpgrade()

    /**
     * This parameter is retired.
     *
     * It does not set the AQUA configuration status. Amazon Redshift automatically determines
     * whether to use AQUA (Advanced Query Accelerator).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-aquaconfigurationstatus)
     */
    override fun aquaConfigurationStatus(): String? = unwrap(this).getAquaConfigurationStatus()

    /**
     * The number of days that automated snapshots are retained.
     *
     * If the value is 0, automated snapshots are disabled. Even if automated snapshots are
     * disabled, you can still create manual snapshots when you want with
     * [CreateClusterSnapshot](https://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterSnapshot.html)
     * in the *Amazon Redshift API Reference* .
     *
     * Default: `1`
     *
     * Constraints: Must be a value from 0 to 35.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod)
     */
    override fun automatedSnapshotRetentionPeriod(): Number? =
        unwrap(this).getAutomatedSnapshotRetentionPeriod()

    /**
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster.
     *
     * For example, if you have several EC2 instances running in a specific Availability Zone, then
     * you might want the cluster to be provisioned in the same zone in order to decrease network
     * latency.
     *
     * Default: A random, system-chosen Availability Zone in the region that is specified by the
     * endpoint.
     *
     * Example: `us-east-2d`
     *
     * Constraint: The specified Availability Zone must be in the same region as the current
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The option to enable relocation for an Amazon Redshift cluster between Availability Zones
     * after the cluster is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzonerelocation)
     */
    override fun availabilityZoneRelocation(): Any? = unwrap(this).getAvailabilityZoneRelocation()

    /**
     * Describes the status of the Availability Zone relocation operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzonerelocationstatus)
     */
    override fun availabilityZoneRelocationStatus(): String? =
        unwrap(this).getAvailabilityZoneRelocationStatus()

    /**
     * A boolean value indicating whether the resize operation is using the classic resize process.
     *
     * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-classic)
     */
    override fun classic(): Any? = unwrap(this).getClassic()

    /**
     * A unique identifier for the cluster.
     *
     * You use this identifier to refer to the cluster for any subsequent cluster operations such as
     * deleting or modifying. The identifier also appears in the Amazon Redshift console.
     *
     * Constraints:
     *
     * * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * * Alphabetic characters must be lowercase.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     * * Must be unique for all clusters within an AWS account .
     *
     * Example: `myexamplecluster`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier)
     */
    override fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

    /**
     * The name of the parameter group to be associated with this cluster.
     *
     * Default: The default Amazon Redshift cluster parameter group. For information about the
     * default parameter group, go to [Working with Amazon Redshift Parameter
     * Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html)
     *
     * Constraints:
     *
     * * Must be 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname)
     */
    override fun clusterParameterGroupName(): String? = unwrap(this).getClusterParameterGroupName()

    /**
     * A list of security groups to be associated with this cluster.
     *
     * Default: The default cluster security group for Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups)
     */
    override fun clusterSecurityGroups(): List<String> = unwrap(this).getClusterSecurityGroups() ?:
        emptyList()

    /**
     * The name of a cluster subnet group to be associated with this cluster.
     *
     * If this parameter is not provided the resulting cluster will be deployed outside virtual
     * private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname)
     */
    override fun clusterSubnetGroupName(): String? = unwrap(this).getClusterSubnetGroupName()

    /**
     * The type of the cluster. When cluster type is specified as.
     *
     * * `single-node` , the *NumberOfNodes* parameter is not required.
     * * `multi-node` , the *NumberOfNodes* parameter is required.
     *
     * Valid Values: `multi-node` | `single-node`
     *
     * Default: `multi-node`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype)
     */
    override fun clusterType(): String = unwrap(this).getClusterType()

    /**
     * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
     *
     * The version selected runs on all the nodes in the cluster.
     *
     * Constraints: Only version 1.0 is currently available.
     *
     * Example: `1.0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion)
     */
    override fun clusterVersion(): String? = unwrap(this).getClusterVersion()

    /**
     * The name of the first database to be created when the cluster is created.
     *
     * To create additional databases after the cluster is created, connect to the cluster with a
     * SQL client and use SQL commands to create a database. For more information, go to [Create a
     * Database](https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html) in the Amazon
     * Redshift Database Developer Guide.
     *
     * Default: `dev`
     *
     * Constraints:
     *
     * * Must contain 1 to 64 alphanumeric characters.
     * * Must contain only lowercase letters.
     * * Cannot be a word that is reserved by the service. A list of reserved words can be found in
     * [Reserved Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the
     * Amazon Redshift Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname)
     */
    override fun dbName(): String = unwrap(this).getDbName()

    /**
     * A Boolean indicating whether to enable the deferred maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenance)
     */
    override fun deferMaintenance(): Any? = unwrap(this).getDeferMaintenance()

    /**
     * An integer indicating the duration of the maintenance window in days.
     *
     * If you specify a duration, you can't specify an end time. The duration must be 45 days or
     * less.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenanceduration)
     */
    override fun deferMaintenanceDuration(): Number? = unwrap(this).getDeferMaintenanceDuration()

    /**
     * A timestamp for the end of the time period when we defer maintenance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenanceendtime)
     */
    override fun deferMaintenanceEndTime(): String? = unwrap(this).getDeferMaintenanceEndTime()

    /**
     * A timestamp indicating the start time for the deferred maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-defermaintenancestarttime)
     */
    override fun deferMaintenanceStartTime(): String? = unwrap(this).getDeferMaintenanceStartTime()

    /**
     * The destination region that snapshots are automatically copied to when cross-region snapshot
     * copy is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-destinationregion)
     */
    override fun destinationRegion(): String? = unwrap(this).getDestinationRegion()

    /**
     * The Elastic IP (EIP) address for the cluster.
     *
     * Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an
     * Internet gateway. Don't specify the Elastic IP address for a publicly accessible cluster with
     * availability zone relocation turned on. For more information about provisioning clusters in
     * EC2-VPC, go to [Supported Platforms to Launch Your
     * Cluster](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms)
     * in the Amazon Redshift Cluster Management Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip)
     */
    override fun elasticIp(): String? = unwrap(this).getElasticIp()

    /**
     * If `true` , the data in the cluster is encrypted at rest.
     *
     * If you set the value on this parameter to `false` , the request will fail.
     *
     * Default: true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted)
     */
    override fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The connection endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-endpoint)
     */
    override fun endpoint(): Any? = unwrap(this).getEndpoint()

    /**
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled.
     *
     * To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more
     * information, see [Enhanced VPC
     * Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html) in the
     * Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-enhancedvpcrouting)
     */
    override fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve
     * the data encryption keys stored in an HSM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertificateidentifier)
     */
    override fun hsmClientCertificateIdentifier(): String? =
        unwrap(this).getHsmClientCertificateIdentifier()

    /**
     * Specifies the name of the HSM configuration that contains the information the Amazon Redshift
     * cluster can use to retrieve and store keys in an HSM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmconfigurationidentifier)
     */
    override fun hsmConfigurationIdentifier(): String? =
        unwrap(this).getHsmConfigurationIdentifier()

    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to
     * access other AWS services.
     *
     * You must supply the IAM roles in their Amazon Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to [Quotas and
     * limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html) in the
     * *Amazon Redshift Cluster Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles)
     */
    override fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

    /**
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to
     * encrypt data in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies logging information, such as queries and connection attempts, for the specified
     * Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
     */
    override fun loggingProperties(): Any? = unwrap(this).getLoggingProperties()

    /**
     * An optional parameter for the name of the maintenance track for the cluster.
     *
     * If you don't provide a maintenance track name, the cluster is assigned to the `current`
     * track.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-maintenancetrackname)
     */
    override fun maintenanceTrackName(): String? = unwrap(this).getMaintenanceTrackName()

    /**
     * If `true` , Amazon Redshift uses AWS Secrets Manager to manage this cluster's admin
     * credentials.
     *
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is true. If
     * `ManageMasterPassword` is false or not set, Amazon Redshift uses `MasterUserPassword` for the
     * admin user account's password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-managemasterpassword)
     */
    override fun manageMasterPassword(): Any? = unwrap(this).getManageMasterPassword()

    /**
     * The default number of days to retain a manual snapshot.
     *
     * If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the
     * retention period of existing snapshots.
     *
     * The value must be either -1 or an integer between 1 and 3,653.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-manualsnapshotretentionperiod)
     */
    override fun manualSnapshotRetentionPeriod(): Number? =
        unwrap(this).getManualSnapshotRetentionPeriod()

    /**
     * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the cluster's
     * admin credentials secret.
     *
     * You can only use this parameter if `ManageMasterPassword` is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterpasswordsecretkmskeyid)
     */
    override fun masterPasswordSecretKmsKeyId(): String? =
        unwrap(this).getMasterPasswordSecretKmsKeyId()

    /**
     * The password associated with the admin user account for the cluster that is being created.
     *
     * You can't use `MasterUserPassword` if `ManageMasterPassword` is `true` .
     *
     * Constraints:
     *
     * * Must be between 8 and 64 characters in length.
     * * Must contain at least one uppercase letter.
     * * Must contain at least one lowercase letter.
     * * Must contain one number.
     * * Can be any printable ASCII character (ASCII code 33-126) except `'` (single quote), `"`
     * (double quote), `\` , `/` , or `&#64;` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword)
     */
    override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    /**
     * The user name associated with the admin user account for the cluster that is being created.
     *
     * Constraints:
     *
     * * Must be 1 - 128 alphanumeric characters or hyphens. The user name can't be `PUBLIC` .
     * * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at
     * symbol (&#64;), or hyphen.
     * * The first character must be a letter.
     * * Must not contain a colon (:) or a slash (/).
     * * Cannot be a reserved word. A list of reserved words can be found in [Reserved
     * Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the Amazon Redshift
     * Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername)
     */
    override fun masterUsername(): String = unwrap(this).getMasterUsername()

    /**
     * A boolean indicating whether Amazon Redshift should deploy the cluster in two Availability
     * Zones.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-multiaz)
     */
    override fun multiAz(): Any? = unwrap(this).getMultiAz()

    /**
     * The policy that is attached to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-namespaceresourcepolicy)
     */
    override fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

    /**
     * The node type to be provisioned for the cluster.
     *
     * For information about node types, go to [Working with
     * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * Valid Values: `dc2.large` | `dc2.8xlarge` | `ra3.large` | `ra3.xlplus` | `ra3.4xlarge` |
     * `ra3.16xlarge`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype)
     */
    override fun nodeType(): String = unwrap(this).getNodeType()

    /**
     * The number of compute nodes in the cluster.
     *
     * This parameter is required when the *ClusterType* parameter is specified as `multi-node` .
     *
     * For information about determining how many nodes you need, go to [Working with
     * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * If you don't specify this parameter, you get a single-node cluster. When requesting a
     * multi-node cluster, you must specify the number of nodes that you want in the cluster.
     *
     * Default: `1`
     *
     * Constraints: Value must be at least 1 and no more than 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-numberofnodes)
     */
    override fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

    /**
     * The AWS account used to create or copy the snapshot.
     *
     * Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount)
     */
    override fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

    /**
     * The port number on which the cluster accepts incoming connections.
     *
     * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the
     * connection string requires the port on which the cluster will listen for incoming connections.
     *
     * Default: `5439`
     *
     * Valid Values:
     *
     * * For clusters with ra3 nodes - Select a port within the ranges `5431-5455` or `8191-8215` .
     * (If you have an existing cluster with ra3 nodes, it isn't required that you change the port to
     * these ranges.)
     * * For clusters with dc2 nodes - Select a port within the range `1150-65535` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * Default: A 30-minute window selected at random from an 8-hour block of time per region,
     * occurring on a random day of the week. For more information about the time blocks for each
     * region, see [Maintenance
     * Windows](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows)
     * in Amazon Redshift Cluster Management Guide.
     *
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *
     * Constraints: Minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * If `true` , the cluster can be accessed from a public network.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * The Amazon Redshift operation to be performed.
     *
     * Supported operations are `pause-cluster` , `resume-cluster` , and `failover-primary-compute`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-resourceaction)
     */
    override fun resourceAction(): String? = unwrap(this).getResourceAction()

    /**
     * Describes a `RevisionTarget` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-revisiontarget)
     */
    override fun revisionTarget(): String? = unwrap(this).getRevisionTarget()

    /**
     * Rotates the encryption keys for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-rotateencryptionkey)
     */
    override fun rotateEncryptionKey(): Any? = unwrap(this).getRotateEncryptionKey()

    /**
     * The name of the cluster the source snapshot was created from.
     *
     * This parameter is required if your user or role has a policy containing a snapshot resource
     * element that specifies anything other than * for the cluster name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier)
     */
    override fun snapshotClusterIdentifier(): String? = unwrap(this).getSnapshotClusterIdentifier()

    /**
     * The name of the snapshot copy grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopygrantname)
     */
    override fun snapshotCopyGrantName(): String? = unwrap(this).getSnapshotCopyGrantName()

    /**
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots
     * instead of automated snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopymanual)
     */
    override fun snapshotCopyManual(): Any? = unwrap(this).getSnapshotCopyManual()

    /**
     * The number of days to retain automated snapshots in the destination AWS Region after they are
     * copied from the source AWS Region .
     *
     * By default, this only changes the retention period of copied automated snapshots.
     *
     * If you decrease the retention period for automated snapshots that are copied to a destination
     * AWS Region , Amazon Redshift deletes any existing automated snapshots that were copied to the
     * destination AWS Region and that fall outside of the new retention period.
     *
     * Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     *
     * If you specify the `manual` option, only newly copied manual snapshots will have the new
     * retention period.
     *
     * If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     *
     * Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for
     * manual snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotcopyretentionperiod)
     */
    override fun snapshotCopyRetentionPeriod(): Number? =
        unwrap(this).getSnapshotCopyRetentionPeriod()

    /**
     * The name of the snapshot from which to create the new cluster.
     *
     * This parameter isn't case sensitive. You must specify this parameter or `snapshotArn` , but
     * not both.
     *
     * Example: `my-snapshot-id`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier)
     */
    override fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     *
     * Default: The default VPC security group is associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.redshift.CfnClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.redshift.CfnClusterProps
  }
}
