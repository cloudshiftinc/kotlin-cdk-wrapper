@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.redshift

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnCluster
import software.amazon.awscdk.services.redshift.CfnClusterProps

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
 * .clusterType("clusterType")
 * .dbName("dbName")
 * .masterUsername("masterUsername")
 * .masterUserPassword("masterUserPassword")
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
 * // the properties below are optional
 * .s3KeyPrefix("s3KeyPrefix")
 * .build())
 * .maintenanceTrackName("maintenanceTrackName")
 * .manualSnapshotRetentionPeriod(123)
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
@CdkDslMarker
public class CfnClusterPropsDsl {
    private val cdkBuilder: CfnClusterProps.Builder = CfnClusterProps.builder()

    private val _clusterSecurityGroups: MutableList<String> = mutableListOf()

    private val _iamRoles: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

    /**
     * @param allowVersionUpgrade If `true` , major version upgrades can be applied during the
     *   maintenance window to the Amazon Redshift engine that is running on the cluster. When a new
     *   major version of the Amazon Redshift engine is released, you can request that the service
     *   automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     *   that is running on your cluster.
     *
     * Default: `true`
     */
    public fun allowVersionUpgrade(allowVersionUpgrade: Boolean) {
        cdkBuilder.allowVersionUpgrade(allowVersionUpgrade)
    }

    /**
     * @param allowVersionUpgrade If `true` , major version upgrades can be applied during the
     *   maintenance window to the Amazon Redshift engine that is running on the cluster. When a new
     *   major version of the Amazon Redshift engine is released, you can request that the service
     *   automatically apply upgrades during the maintenance window to the Amazon Redshift engine
     *   that is running on your cluster.
     *
     * Default: `true`
     */
    public fun allowVersionUpgrade(allowVersionUpgrade: IResolvable) {
        cdkBuilder.allowVersionUpgrade(allowVersionUpgrade)
    }

    /**
     * @param aquaConfigurationStatus This parameter is retired. It does not set the AQUA
     *   configuration status. Amazon Redshift automatically determines whether to use AQUA
     *   (Advanced Query Accelerator).
     */
    public fun aquaConfigurationStatus(aquaConfigurationStatus: String) {
        cdkBuilder.aquaConfigurationStatus(aquaConfigurationStatus)
    }

    /**
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are
     *   retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots
     *   are disabled, you can still create manual snapshots when you want with
     *   [CreateClusterSnapshot](https://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterSnapshot.html)
     *   in the *Amazon Redshift API Reference* .
     *
     * Default: `1`
     *
     * Constraints: Must be a value from 0 to 35.
     */
    public fun automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod: Number) {
        cdkBuilder.automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod)
    }

    /**
     * @param availabilityZone The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     *   provision the cluster. For example, if you have several EC2 instances running in a specific
     *   Availability Zone, then you might want the cluster to be provisioned in the same zone in
     *   order to decrease network latency.
     *
     * Default: A random, system-chosen Availability Zone in the region that is specified by the
     * endpoint.
     *
     * Example: `us-east-2d`
     *
     * Constraint: The specified Availability Zone must be in the same region as the current
     * endpoint.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param availabilityZoneRelocation The option to enable relocation for an Amazon Redshift
     *   cluster between Availability Zones after the cluster is created.
     */
    public fun availabilityZoneRelocation(availabilityZoneRelocation: Boolean) {
        cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation)
    }

    /**
     * @param availabilityZoneRelocation The option to enable relocation for an Amazon Redshift
     *   cluster between Availability Zones after the cluster is created.
     */
    public fun availabilityZoneRelocation(availabilityZoneRelocation: IResolvable) {
        cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation)
    }

    /**
     * @param availabilityZoneRelocationStatus Describes the status of the Availability Zone
     *   relocation operation.
     */
    public fun availabilityZoneRelocationStatus(availabilityZoneRelocationStatus: String) {
        cdkBuilder.availabilityZoneRelocationStatus(availabilityZoneRelocationStatus)
    }

    /**
     * @param classic A boolean value indicating whether the resize operation is using the classic
     *   resize process. If you don't provide this parameter or set the value to `false` , the
     *   resize type is elastic.
     */
    public fun classic(classic: Boolean) {
        cdkBuilder.classic(classic)
    }

    /**
     * @param classic A boolean value indicating whether the resize operation is using the classic
     *   resize process. If you don't provide this parameter or set the value to `false` , the
     *   resize type is elastic.
     */
    public fun classic(classic: IResolvable) {
        cdkBuilder.classic(classic)
    }

    /**
     * @param clusterIdentifier A unique identifier for the cluster. You use this identifier to
     *   refer to the cluster for any subsequent cluster operations such as deleting or modifying.
     *   The identifier also appears in the Amazon Redshift console.
     *
     * Constraints:
     * * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * * Alphabetic characters must be lowercase.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     * * Must be unique for all clusters within an AWS account .
     *
     * Example: `myexamplecluster`
     */
    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param clusterParameterGroupName The name of the parameter group to be associated with this
     *   cluster. Default: The default Amazon Redshift cluster parameter group. For information
     *   about the default parameter group, go to
     *   [Working with Amazon Redshift Parameter Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html)
     *
     * Constraints:
     * * Must be 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     */
    public fun clusterParameterGroupName(clusterParameterGroupName: String) {
        cdkBuilder.clusterParameterGroupName(clusterParameterGroupName)
    }

    /**
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster.
     *   Default: The default cluster security group for Amazon Redshift.
     */
    public fun clusterSecurityGroups(vararg clusterSecurityGroups: String) {
        _clusterSecurityGroups.addAll(listOf(*clusterSecurityGroups))
    }

    /**
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster.
     *   Default: The default cluster security group for Amazon Redshift.
     */
    public fun clusterSecurityGroups(clusterSecurityGroups: Collection<String>) {
        _clusterSecurityGroups.addAll(clusterSecurityGroups)
    }

    /**
     * @param clusterSubnetGroupName The name of a cluster subnet group to be associated with this
     *   cluster. If this parameter is not provided the resulting cluster will be deployed outside
     *   virtual private cloud (VPC).
     */
    public fun clusterSubnetGroupName(clusterSubnetGroupName: String) {
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
    public fun clusterType(clusterType: String) {
        cdkBuilder.clusterType(clusterType)
    }

    /**
     * @param clusterVersion The version of the Amazon Redshift engine software that you want to
     *   deploy on the cluster. The version selected runs on all the nodes in the cluster.
     *
     * Constraints: Only version 1.0 is currently available.
     *
     * Example: `1.0`
     */
    public fun clusterVersion(clusterVersion: String) {
        cdkBuilder.clusterVersion(clusterVersion)
    }

    /**
     * @param dbName The name of the first database to be created when the cluster is created. To
     *   create additional databases after the cluster is created, connect to the cluster with a SQL
     *   client and use SQL commands to create a database. For more information, go to
     *   [Create a Database](https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html)
     *   in the Amazon Redshift Database Developer Guide.
     *
     * Default: `dev`
     *
     * Constraints:
     * * Must contain 1 to 64 alphanumeric characters.
     * * Must contain only lowercase letters.
     * * Cannot be a word that is reserved by the service. A list of reserved words can be found in
     *   [Reserved Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the
     *   Amazon Redshift Database Developer Guide.
     */
    public fun dbName(dbName: String) {
        cdkBuilder.dbName(dbName)
    }

    /**
     * @param deferMaintenance A Boolean indicating whether to enable the deferred maintenance
     *   window.
     */
    public fun deferMaintenance(deferMaintenance: Boolean) {
        cdkBuilder.deferMaintenance(deferMaintenance)
    }

    /**
     * @param deferMaintenance A Boolean indicating whether to enable the deferred maintenance
     *   window.
     */
    public fun deferMaintenance(deferMaintenance: IResolvable) {
        cdkBuilder.deferMaintenance(deferMaintenance)
    }

    /**
     * @param deferMaintenanceDuration An integer indicating the duration of the maintenance window
     *   in days. If you specify a duration, you can't specify an end time. The duration must be 45
     *   days or less.
     */
    public fun deferMaintenanceDuration(deferMaintenanceDuration: Number) {
        cdkBuilder.deferMaintenanceDuration(deferMaintenanceDuration)
    }

    /**
     * @param deferMaintenanceEndTime A timestamp for the end of the time period when we defer
     *   maintenance.
     */
    public fun deferMaintenanceEndTime(deferMaintenanceEndTime: String) {
        cdkBuilder.deferMaintenanceEndTime(deferMaintenanceEndTime)
    }

    /**
     * @param deferMaintenanceStartTime A timestamp indicating the start time for the deferred
     *   maintenance window.
     */
    public fun deferMaintenanceStartTime(deferMaintenanceStartTime: String) {
        cdkBuilder.deferMaintenanceStartTime(deferMaintenanceStartTime)
    }

    /**
     * @param destinationRegion The destination region that snapshots are automatically copied to
     *   when cross-region snapshot copy is enabled.
     */
    public fun destinationRegion(destinationRegion: String) {
        cdkBuilder.destinationRegion(destinationRegion)
    }

    /**
     * @param elasticIp The Elastic IP (EIP) address for the cluster. Constraints: The cluster must
     *   be provisioned in EC2-VPC and publicly-accessible through an Internet gateway. Don't
     *   specify the Elastic IP address for a publicly accessible cluster with availability zone
     *   relocation turned on. For more information about provisioning clusters in EC2-VPC, go to
     *   [Supported Platforms to Launch Your Cluster](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms)
     *   in the Amazon Redshift Cluster Management Guide.
     */
    public fun elasticIp(elasticIp: String) {
        cdkBuilder.elasticIp(elasticIp)
    }

    /** @param encrypted If `true` , the data in the cluster is encrypted at rest. Default: false */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /** @param encrypted If `true` , the data in the cluster is encrypted at rest. Default: false */
    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    /** @param endpoint The connection endpoint. */
    public fun endpoint(endpoint: IResolvable) {
        cdkBuilder.endpoint(endpoint)
    }

    /** @param endpoint The connection endpoint. */
    public fun endpoint(endpoint: CfnCluster.EndpointProperty) {
        cdkBuilder.endpoint(endpoint)
    }

    /**
     * @param enhancedVpcRouting An option that specifies whether to create the cluster with
     *   enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the
     *   cluster must be in a VPC. For more information, see
     *   [Enhanced VPC Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html)
     *   in the Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    /**
     * @param enhancedVpcRouting An option that specifies whether to create the cluster with
     *   enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the
     *   cluster must be in a VPC. For more information, see
     *   [Enhanced VPC Routing](https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html)
     *   in the Amazon Redshift Cluster Management Guide.
     *
     * If this option is `true` , enhanced VPC routing is enabled.
     *
     * Default: false
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    /**
     * @param hsmClientCertificateIdentifier Specifies the name of the HSM client certificate the
     *   Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
     */
    public fun hsmClientCertificateIdentifier(hsmClientCertificateIdentifier: String) {
        cdkBuilder.hsmClientCertificateIdentifier(hsmClientCertificateIdentifier)
    }

    /**
     * @param hsmConfigurationIdentifier Specifies the name of the HSM configuration that contains
     *   the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     */
    public fun hsmConfigurationIdentifier(hsmConfigurationIdentifier: String) {
        cdkBuilder.hsmConfigurationIdentifier(hsmConfigurationIdentifier)
    }

    /**
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be used by
     *   the cluster to access other AWS services. You must supply the IAM roles in their Amazon
     *   Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to
     * [Quotas and limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html)
     * in the *Amazon Redshift Cluster Management Guide* .
     */
    public fun iamRoles(vararg iamRoles: String) {
        _iamRoles.addAll(listOf(*iamRoles))
    }

    /**
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be used by
     *   the cluster to access other AWS services. You must supply the IAM roles in their Amazon
     *   Resource Name (ARN) format.
     *
     * The maximum number of IAM roles that you can associate is subject to a quota. For more
     * information, go to
     * [Quotas and limits](https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html)
     * in the *Amazon Redshift Cluster Management Guide* .
     */
    public fun iamRoles(iamRoles: Collection<String>) {
        _iamRoles.addAll(iamRoles)
    }

    /**
     * @param kmsKeyId The AWS Key Management Service (KMS) key ID of the encryption key that you
     *   want to use to encrypt data in the cluster.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param loggingProperties Specifies logging information, such as queries and connection
     *   attempts, for the specified Amazon Redshift cluster.
     */
    public fun loggingProperties(loggingProperties: IResolvable) {
        cdkBuilder.loggingProperties(loggingProperties)
    }

    /**
     * @param loggingProperties Specifies logging information, such as queries and connection
     *   attempts, for the specified Amazon Redshift cluster.
     */
    public fun loggingProperties(loggingProperties: CfnCluster.LoggingPropertiesProperty) {
        cdkBuilder.loggingProperties(loggingProperties)
    }

    /**
     * @param maintenanceTrackName An optional parameter for the name of the maintenance track for
     *   the cluster. If you don't provide a maintenance track name, the cluster is assigned to the
     *   `current` track.
     */
    public fun maintenanceTrackName(maintenanceTrackName: String) {
        cdkBuilder.maintenanceTrackName(maintenanceTrackName)
    }

    /**
     * @param manualSnapshotRetentionPeriod The default number of days to retain a manual snapshot.
     *   If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the
     *   retention period of existing snapshots.
     *
     * The value must be either -1 or an integer between 1 and 3,653.
     */
    public fun manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod: Number) {
        cdkBuilder.manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod)
    }

    /**
     * @param masterUserPassword The password associated with the admin user account for the cluster
     *   that is being created. Constraints:
     * * Must be between 8 and 64 characters in length.
     * * Must contain at least one uppercase letter.
     * * Must contain at least one lowercase letter.
     * * Must contain one number.
     * * Can be any printable ASCII character (ASCII code 33-126) except `'` (single quote), `"`
     *   (double quote), `\` , `/` , or `&#64;` .
     */
    public fun masterUserPassword(masterUserPassword: String) {
        cdkBuilder.masterUserPassword(masterUserPassword)
    }

    /**
     * @param masterUsername The user name associated with the admin user account for the cluster
     *   that is being created. Constraints:
     * * Must be 1 - 128 alphanumeric characters or hyphens. The user name can't be `PUBLIC` .
     * * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at
     *   symbol (&#64;), or hyphen.
     * * The first character must be a letter.
     * * Must not contain a colon (:) or a slash (/).
     * * Cannot be a reserved word. A list of reserved words can be found in
     *   [Reserved Words](https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html) in the
     *   Amazon Redshift Database Developer Guide.
     */
    public fun masterUsername(masterUsername: String) {
        cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * @param nodeType The node type to be provisioned for the cluster. For information about node
     *   types, go to
     *   [Working with Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     *   in the *Amazon Redshift Cluster Management Guide* .
     *
     * Valid Values: `ds2.xlarge` | `ds2.8xlarge` | `dc1.large` | `dc1.8xlarge` | `dc2.large` |
     * `dc2.8xlarge` | `ra3.xlplus` | `ra3.4xlarge` | `ra3.16xlarge`
     */
    public fun nodeType(nodeType: String) {
        cdkBuilder.nodeType(nodeType)
    }

    /**
     * @param numberOfNodes The number of compute nodes in the cluster. This parameter is required
     *   when the *ClusterType* parameter is specified as `multi-node` .
     *
     * For information about determining how many nodes you need, go to
     * [Working with Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * If you don't specify this parameter, you get a single-node cluster. When requesting a
     * multi-node cluster, you must specify the number of nodes that you want in the cluster.
     *
     * Default: `1`
     *
     * Constraints: Value must be at least 1 and no more than 100.
     */
    public fun numberOfNodes(numberOfNodes: Number) {
        cdkBuilder.numberOfNodes(numberOfNodes)
    }

    /**
     * @param ownerAccount The AWS account used to create or copy the snapshot. Required if you are
     *   restoring a snapshot you do not own, optional if you own the snapshot.
     */
    public fun ownerAccount(ownerAccount: String) {
        cdkBuilder.ownerAccount(ownerAccount)
    }

    /**
     * @param port The port number on which the cluster accepts incoming connections. The cluster is
     *   accessible only via the JDBC and ODBC connection strings. Part of the connection string
     *   requires the port on which the cluster will listen for incoming connections.
     *
     * Default: `5439`
     *
     * Valid Values: `1150-65535`
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which automated
     *   cluster maintenance can occur. Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * Default: A 30-minute window selected at random from an 8-hour block of time per region,
     * occurring on a random day of the week. For more information about the time blocks for each
     * region, see
     * [Maintenance Windows](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows)
     * in Amazon Redshift Cluster Management Guide.
     *
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *
     * Constraints: Minimum 30-minute window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /** @param publiclyAccessible If `true` , the cluster can be accessed from a public network. */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /** @param publiclyAccessible If `true` , the cluster can be accessed from a public network. */
    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param resourceAction The Amazon Redshift operation to be performed. Supported operations are
     *   `pause-cluster` and `resume-cluster` .
     */
    public fun resourceAction(resourceAction: String) {
        cdkBuilder.resourceAction(resourceAction)
    }

    /** @param revisionTarget Describes a `RevisionTarget` object. */
    public fun revisionTarget(revisionTarget: String) {
        cdkBuilder.revisionTarget(revisionTarget)
    }

    /** @param rotateEncryptionKey Rotates the encryption keys for a cluster. */
    public fun rotateEncryptionKey(rotateEncryptionKey: Boolean) {
        cdkBuilder.rotateEncryptionKey(rotateEncryptionKey)
    }

    /** @param rotateEncryptionKey Rotates the encryption keys for a cluster. */
    public fun rotateEncryptionKey(rotateEncryptionKey: IResolvable) {
        cdkBuilder.rotateEncryptionKey(rotateEncryptionKey)
    }

    /**
     * @param snapshotClusterIdentifier The name of the cluster the source snapshot was created
     *   from. This parameter is required if your user or role has a policy containing a snapshot
     *   resource element that specifies anything other than * for the cluster name.
     */
    public fun snapshotClusterIdentifier(snapshotClusterIdentifier: String) {
        cdkBuilder.snapshotClusterIdentifier(snapshotClusterIdentifier)
    }

    /** @param snapshotCopyGrantName The name of the snapshot copy grant. */
    public fun snapshotCopyGrantName(snapshotCopyGrantName: String) {
        cdkBuilder.snapshotCopyGrantName(snapshotCopyGrantName)
    }

    /**
     * @param snapshotCopyManual Indicates whether to apply the snapshot retention period to newly
     *   copied manual snapshots instead of automated snapshots.
     */
    public fun snapshotCopyManual(snapshotCopyManual: Boolean) {
        cdkBuilder.snapshotCopyManual(snapshotCopyManual)
    }

    /**
     * @param snapshotCopyManual Indicates whether to apply the snapshot retention period to newly
     *   copied manual snapshots instead of automated snapshots.
     */
    public fun snapshotCopyManual(snapshotCopyManual: IResolvable) {
        cdkBuilder.snapshotCopyManual(snapshotCopyManual)
    }

    /**
     * @param snapshotCopyRetentionPeriod The number of days to retain automated snapshots in the
     *   destination AWS Region after they are copied from the source AWS Region . By default, this
     *   only changes the retention period of copied automated snapshots.
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
    public fun snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod: Number) {
        cdkBuilder.snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod)
    }

    /**
     * @param snapshotIdentifier The name of the snapshot from which to create the new cluster. This
     *   parameter isn't case sensitive. You must specify this parameter or `snapshotArn` , but not
     *   both.
     *
     * Example: `my-snapshot-id`
     */
    public fun snapshotIdentifier(snapshotIdentifier: String) {
        cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /** @param tags A list of tag instances. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A list of tag instances. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be
     *   associated with the cluster. Default: The default VPC security group is associated with the
     *   cluster.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
        _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
    }

    /**
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be
     *   associated with the cluster. Default: The default VPC security group is associated with the
     *   cluster.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
        _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
    }

    public fun build(): CfnClusterProps {
        if (_clusterSecurityGroups.isNotEmpty())
            cdkBuilder.clusterSecurityGroups(_clusterSecurityGroups)
        if (_iamRoles.isNotEmpty()) cdkBuilder.iamRoles(_iamRoles)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
        return cdkBuilder.build()
    }
}
