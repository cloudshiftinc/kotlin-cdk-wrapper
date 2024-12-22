@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

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
 * The `AWS::ElastiCache::ReplicationGroup` resource creates an Amazon ElastiCache (Valkey or Redis
 * OSS) replication group.
 *
 * A Valkey or Redis OSS (cluster mode disabled) replication group is a collection of cache
 * clusters, where one of the clusters is a primary read-write cluster and the others are read-only
 * replicas.
 *
 * A Valkey or Redis OSS (cluster mode enabled) cluster is comprised of from 1 to 90 shards
 * (API/CLI: node groups). Each shard has a primary node and up to 5 read-only replica nodes. The
 * configuration can range from 90 shards and 0 replicas to 15 shards and 5 replicas, which is the
 * maximum number or replicas allowed.
 *
 * The node or shard limit can be increased to a maximum of 500 per cluster if the engine version is
 * Valkey 7.2 or higher, or Redis OSS 5.0.6 or higher. For example, you can choose to configure a 500
 * node cluster that ranges between 83 shards (one primary and 5 replicas per shard) and 500 shards
 * (single primary and no replicas). Make sure there are enough available IP addresses to accommodate
 * the increase. Common pitfalls include the subnets in the subnet group have too small a CIDR range or
 * the subnets are shared and heavily used by other clusters. For more information, see [Creating a
 * Subnet Group](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/SubnetGroups.Creating.html) .
 * For versions below 5.0.6, the limit is 250 per cluster.
 *
 * To request a limit increase, see [Amazon Service
 * Limits](https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html) and choose the limit
 * type *Nodes per cluster per instance type* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnReplicationGroup cfnReplicationGroup = CfnReplicationGroup.Builder.create(this,
 * "MyCfnReplicationGroup")
 * .replicationGroupDescription("replicationGroupDescription")
 * // the properties below are optional
 * .atRestEncryptionEnabled(false)
 * .authToken("authToken")
 * .automaticFailoverEnabled(false)
 * .autoMinorVersionUpgrade(false)
 * .cacheNodeType("cacheNodeType")
 * .cacheParameterGroupName("cacheParameterGroupName")
 * .cacheSecurityGroupNames(List.of("cacheSecurityGroupNames"))
 * .cacheSubnetGroupName("cacheSubnetGroupName")
 * .clusterMode("clusterMode")
 * .dataTieringEnabled(false)
 * .engine("engine")
 * .engineVersion("engineVersion")
 * .globalReplicationGroupId("globalReplicationGroupId")
 * .ipDiscovery("ipDiscovery")
 * .kmsKeyId("kmsKeyId")
 * .logDeliveryConfigurations(List.of(LogDeliveryConfigurationRequestProperty.builder()
 * .destinationDetails(DestinationDetailsProperty.builder()
 * .cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty.builder()
 * .logGroup("logGroup")
 * .build())
 * .kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty.builder()
 * .deliveryStream("deliveryStream")
 * .build())
 * .build())
 * .destinationType("destinationType")
 * .logFormat("logFormat")
 * .logType("logType")
 * .build()))
 * .multiAzEnabled(false)
 * .networkType("networkType")
 * .nodeGroupConfiguration(List.of(NodeGroupConfigurationProperty.builder()
 * .nodeGroupId("nodeGroupId")
 * .primaryAvailabilityZone("primaryAvailabilityZone")
 * .replicaAvailabilityZones(List.of("replicaAvailabilityZones"))
 * .replicaCount(123)
 * .slots("slots")
 * .build()))
 * .notificationTopicArn("notificationTopicArn")
 * .numCacheClusters(123)
 * .numNodeGroups(123)
 * .port(123)
 * .preferredCacheClusterAZs(List.of("preferredCacheClusterAZs"))
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .primaryClusterId("primaryClusterId")
 * .replicasPerNodeGroup(123)
 * .replicationGroupId("replicationGroupId")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .snapshotArns(List.of("snapshotArns"))
 * .snapshotName("snapshotName")
 * .snapshotRetentionLimit(123)
 * .snapshottingClusterId("snapshottingClusterId")
 * .snapshotWindow("snapshotWindow")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .transitEncryptionEnabled(false)
 * .transitEncryptionMode("transitEncryptionMode")
 * .userGroupIds(List.of("userGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html)
 */
public open class CfnReplicationGroup(
  cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReplicationGroupProps,
  ) :
      this(software.amazon.awscdk.services.elasticache.CfnReplicationGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnReplicationGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReplicationGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnReplicationGroupProps(props)
  )

  /**
   * A flag that enables encryption at rest when set to `true` .
   */
  public open fun atRestEncryptionEnabled(): Any? = unwrap(this).getAtRestEncryptionEnabled()

  /**
   * A flag that enables encryption at rest when set to `true` .
   */
  public open fun atRestEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setAtRestEncryptionEnabled(`value`)
  }

  /**
   * A flag that enables encryption at rest when set to `true` .
   */
  public open fun atRestEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setAtRestEncryptionEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The DNS hostname of the cache node.
   *
   *
   * Valkey or Redis OSS (cluster mode disabled) replication groups don't have this attribute.
   * Therefore, `Fn::GetAtt` returns a value for this attribute only if the replication group is
   * clustered. Otherwise, `Fn::GetAtt` fails. For Valkey or Redis OSS (cluster mode disabled)
   * replication groups, use the `PrimaryEndpoint` or `ReadEndpoint` attributes.
   */
  public open fun attrConfigurationEndPointAddress(): String =
      unwrap(this).getAttrConfigurationEndPointAddress()

  /**
   * The port number that the cache engine is listening on.
   */
  public open fun attrConfigurationEndPointPort(): String =
      unwrap(this).getAttrConfigurationEndPointPort()

  /**
   * The DNS address of the primary read-write cache node.
   */
  public open fun attrPrimaryEndPointAddress(): String =
      unwrap(this).getAttrPrimaryEndPointAddress()

  /**
   * The number of the port that the primary read-write cache engine is listening on.
   */
  public open fun attrPrimaryEndPointPort(): String = unwrap(this).getAttrPrimaryEndPointPort()

  /**
   * A string with a list of endpoints for the primary and read-only replicas.
   *
   * The order of the addresses maps to the order of the ports from the `ReadEndPoint.Ports`
   * attribute.
   */
  public open fun attrReadEndPointAddresses(): String = unwrap(this).getAttrReadEndPointAddresses()

  /**
   * A string with a list of endpoints for the read-only replicas.
   *
   * The order of the addresses maps to the order of the ports from the `ReadEndPoint.Ports`
   * attribute.
   */
  public open fun attrReadEndPointAddressesList(): List<String> =
      unwrap(this).getAttrReadEndPointAddressesList()

  /**
   * A string with a list of ports for the read-only replicas.
   *
   * The order of the ports maps to the order of the addresses from the `ReadEndPoint.Addresses`
   * attribute.
   */
  public open fun attrReadEndPointPorts(): String = unwrap(this).getAttrReadEndPointPorts()

  /**
   * A string with a list of ports for the read-only replicas.
   *
   * The order of the ports maps to the order of the addresses from the ReadEndPoint.Addresses
   * attribute.
   */
  public open fun attrReadEndPointPortsList(): List<String> =
      unwrap(this).getAttrReadEndPointPortsList()

  /**
   * The address of the reader endpoint.
   */
  public open fun attrReaderEndPointAddress(): String = unwrap(this).getAttrReaderEndPointAddress()

  /**
   * The port used by the reader endpoint.
   */
  public open fun attrReaderEndPointPort(): String = unwrap(this).getAttrReaderEndPointPort()

  /**
   * *Reserved parameter.* The password used to access a password protected server.
   */
  public open fun authToken(): String? = unwrap(this).getAuthToken()

  /**
   * *Reserved parameter.* The password used to access a password protected server.
   */
  public open fun authToken(`value`: String) {
    unwrap(this).setAuthToken(`value`)
  }

  /**
   * If you are running Valkey 7.2 or later, or Redis OSS 6.0 or later, set this parameter to yes if
   * you want to opt-in to the next minor version upgrade campaign. This parameter is disabled for
   * previous versions.
   */
  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * If you are running Valkey 7.2 or later, or Redis OSS 6.0 or later, set this parameter to yes if
   * you want to opt-in to the next minor version upgrade campaign. This parameter is disabled for
   * previous versions.
   */
  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  /**
   * If you are running Valkey 7.2 or later, or Redis OSS 6.0 or later, set this parameter to yes if
   * you want to opt-in to the next minor version upgrade campaign. This parameter is disabled for
   * previous versions.
   */
  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   */
  public open fun automaticFailoverEnabled(): Any? = unwrap(this).getAutomaticFailoverEnabled()

  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   */
  public open fun automaticFailoverEnabled(`value`: Boolean) {
    unwrap(this).setAutomaticFailoverEnabled(`value`)
  }

  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   */
  public open fun automaticFailoverEnabled(`value`: IResolvable) {
    unwrap(this).setAutomaticFailoverEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The compute and memory capacity of the nodes in the node group (shard).
   */
  public open fun cacheNodeType(): String? = unwrap(this).getCacheNodeType()

  /**
   * The compute and memory capacity of the nodes in the node group (shard).
   */
  public open fun cacheNodeType(`value`: String) {
    unwrap(this).setCacheNodeType(`value`)
  }

  /**
   * The name of the parameter group to associate with this replication group.
   */
  public open fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

  /**
   * The name of the parameter group to associate with this replication group.
   */
  public open fun cacheParameterGroupName(`value`: String) {
    unwrap(this).setCacheParameterGroupName(`value`)
  }

  /**
   * A list of cache security group names to associate with this replication group.
   */
  public open fun cacheSecurityGroupNames(): List<String> =
      unwrap(this).getCacheSecurityGroupNames() ?: emptyList()

  /**
   * A list of cache security group names to associate with this replication group.
   */
  public open fun cacheSecurityGroupNames(`value`: List<String>) {
    unwrap(this).setCacheSecurityGroupNames(`value`)
  }

  /**
   * A list of cache security group names to associate with this replication group.
   */
  public open fun cacheSecurityGroupNames(vararg `value`: String): Unit =
      cacheSecurityGroupNames(`value`.toList())

  /**
   * The name of the cache subnet group to be used for the replication group.
   */
  public open fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

  /**
   * The name of the cache subnet group to be used for the replication group.
   */
  public open fun cacheSubnetGroupName(`value`: String) {
    unwrap(this).setCacheSubnetGroupName(`value`)
  }

  /**
   * Enabled or Disabled.
   */
  public open fun clusterMode(): String? = unwrap(this).getClusterMode()

  /**
   * Enabled or Disabled.
   */
  public open fun clusterMode(`value`: String) {
    unwrap(this).setClusterMode(`value`)
  }

  /**
   * Enables data tiering.
   */
  public open fun dataTieringEnabled(): Any? = unwrap(this).getDataTieringEnabled()

  /**
   * Enables data tiering.
   */
  public open fun dataTieringEnabled(`value`: Boolean) {
    unwrap(this).setDataTieringEnabled(`value`)
  }

  /**
   * Enables data tiering.
   */
  public open fun dataTieringEnabled(`value`: IResolvable) {
    unwrap(this).setDataTieringEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The name of the cache engine to be used for the clusters in this replication group.
   */
  public open fun engine(): String? = unwrap(this).getEngine()

  /**
   * The name of the cache engine to be used for the clusters in this replication group.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  /**
   * The version number of the cache engine to be used for the clusters in this replication group.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The version number of the cache engine to be used for the clusters in this replication group.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * The name of the Global datastore.
   */
  public open fun globalReplicationGroupId(): String? = unwrap(this).getGlobalReplicationGroupId()

  /**
   * The name of the Global datastore.
   */
  public open fun globalReplicationGroupId(`value`: String) {
    unwrap(this).setGlobalReplicationGroupId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The network type you choose when creating a replication group, either `ipv4` | `ipv6` .
   */
  public open fun ipDiscovery(): String? = unwrap(this).getIpDiscovery()

  /**
   * The network type you choose when creating a replication group, either `ipv4` | `ipv6` .
   */
  public open fun ipDiscovery(`value`: String) {
    unwrap(this).setIpDiscovery(`value`)
  }

  /**
   * The ID of the KMS key used to encrypt the disk on the cluster.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ID of the KMS key used to encrypt the disk on the cluster.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Specifies the destination, format and type of the logs.
   */
  public open fun logDeliveryConfigurations(): Any? = unwrap(this).getLogDeliveryConfigurations()

  /**
   * Specifies the destination, format and type of the logs.
   */
  public open fun logDeliveryConfigurations(`value`: IResolvable) {
    unwrap(this).setLogDeliveryConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the destination, format and type of the logs.
   */
  public open fun logDeliveryConfigurations(`value`: List<Any>) {
    unwrap(this).setLogDeliveryConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies the destination, format and type of the logs.
   */
  public open fun logDeliveryConfigurations(vararg `value`: Any): Unit =
      logDeliveryConfigurations(`value`.toList())

  /**
   * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance.
   */
  public open fun multiAzEnabled(): Any? = unwrap(this).getMultiAzEnabled()

  /**
   * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance.
   */
  public open fun multiAzEnabled(`value`: Boolean) {
    unwrap(this).setMultiAzEnabled(`value`)
  }

  /**
   * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance.
   */
  public open fun multiAzEnabled(`value`: IResolvable) {
    unwrap(this).setMultiAzEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Must be either `ipv4` | `ipv6` | `dual_stack` .
   */
  public open fun networkType(): String? = unwrap(this).getNetworkType()

  /**
   * Must be either `ipv4` | `ipv6` | `dual_stack` .
   */
  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
  }

  /**
   * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
   * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
   */
  public open fun nodeGroupConfiguration(): Any? = unwrap(this).getNodeGroupConfiguration()

  /**
   * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
   * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
   */
  public open fun nodeGroupConfiguration(`value`: IResolvable) {
    unwrap(this).setNodeGroupConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
   * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
   */
  public open fun nodeGroupConfiguration(`value`: List<Any>) {
    unwrap(this).setNodeGroupConfiguration(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
   * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
   */
  public open fun nodeGroupConfiguration(vararg `value`: Any): Unit =
      nodeGroupConfiguration(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
   * notifications are sent.
   */
  public open fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
   * notifications are sent.
   */
  public open fun notificationTopicArn(`value`: String) {
    unwrap(this).setNotificationTopicArn(`value`)
  }

  /**
   * The number of clusters this replication group initially has.
   */
  public open fun numCacheClusters(): Number? = unwrap(this).getNumCacheClusters()

  /**
   * The number of clusters this replication group initially has.
   */
  public open fun numCacheClusters(`value`: Number) {
    unwrap(this).setNumCacheClusters(`value`)
  }

  /**
   * An optional parameter that specifies the number of node groups (shards) for this Valkey or
   * Redis OSS (cluster mode enabled) replication group.
   */
  public open fun numNodeGroups(): Number? = unwrap(this).getNumNodeGroups()

  /**
   * An optional parameter that specifies the number of node groups (shards) for this Valkey or
   * Redis OSS (cluster mode enabled) replication group.
   */
  public open fun numNodeGroups(`value`: Number) {
    unwrap(this).setNumNodeGroups(`value`)
  }

  /**
   * The port number on which each member of the replication group accepts connections.
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * The port number on which each member of the replication group accepts connections.
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * A list of EC2 Availability Zones in which the replication group's clusters are created.
   */
  public open fun preferredCacheClusterAZs(): List<String> =
      unwrap(this).getPreferredCacheClusterAZs() ?: emptyList()

  /**
   * A list of EC2 Availability Zones in which the replication group's clusters are created.
   */
  public open fun preferredCacheClusterAZs(`value`: List<String>) {
    unwrap(this).setPreferredCacheClusterAZs(`value`)
  }

  /**
   * A list of EC2 Availability Zones in which the replication group's clusters are created.
   */
  public open fun preferredCacheClusterAZs(vararg `value`: String): Unit =
      preferredCacheClusterAZs(`value`.toList())

  /**
   * Specifies the weekly time range during which maintenance on the cluster is performed.
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * Specifies the weekly time range during which maintenance on the cluster is performed.
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * The identifier of the cluster that serves as the primary for this replication group.
   */
  public open fun primaryClusterId(): String? = unwrap(this).getPrimaryClusterId()

  /**
   * The identifier of the cluster that serves as the primary for this replication group.
   */
  public open fun primaryClusterId(`value`: String) {
    unwrap(this).setPrimaryClusterId(`value`)
  }

  /**
   * An optional parameter that specifies the number of replica nodes in each node group (shard).
   */
  public open fun replicasPerNodeGroup(): Number? = unwrap(this).getReplicasPerNodeGroup()

  /**
   * An optional parameter that specifies the number of replica nodes in each node group (shard).
   */
  public open fun replicasPerNodeGroup(`value`: Number) {
    unwrap(this).setReplicasPerNodeGroup(`value`)
  }

  /**
   * A user-created description for the replication group.
   */
  public open fun replicationGroupDescription(): String =
      unwrap(this).getReplicationGroupDescription()

  /**
   * A user-created description for the replication group.
   */
  public open fun replicationGroupDescription(`value`: String) {
    unwrap(this).setReplicationGroupDescription(`value`)
  }

  /**
   * The replication group identifier.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

  /**
   * The replication group identifier.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun replicationGroupId(`value`: String) {
    unwrap(this).setReplicationGroupId(`value`)
  }

  /**
   * One or more Amazon VPC security groups associated with this replication group.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * One or more Amazon VPC security groups associated with this replication group.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * One or more Amazon VPC security groups associated with this replication group.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * A list of Amazon Resource Names (ARN) that uniquely identify the Valkey or Redis OSS RDB
   * snapshot files stored in Amazon S3.
   */
  public open fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

  /**
   * A list of Amazon Resource Names (ARN) that uniquely identify the Valkey or Redis OSS RDB
   * snapshot files stored in Amazon S3.
   */
  public open fun snapshotArns(`value`: List<String>) {
    unwrap(this).setSnapshotArns(`value`)
  }

  /**
   * A list of Amazon Resource Names (ARN) that uniquely identify the Valkey or Redis OSS RDB
   * snapshot files stored in Amazon S3.
   */
  public open fun snapshotArns(vararg `value`: String): Unit = snapshotArns(`value`.toList())

  /**
   * The name of a snapshot from which to restore data into the new replication group.
   */
  public open fun snapshotName(): String? = unwrap(this).getSnapshotName()

  /**
   * The name of a snapshot from which to restore data into the new replication group.
   */
  public open fun snapshotName(`value`: String) {
    unwrap(this).setSnapshotName(`value`)
  }

  /**
   * The number of days for which ElastiCache retains automatic snapshots before deleting them.
   */
  public open fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  /**
   * The number of days for which ElastiCache retains automatic snapshots before deleting them.
   */
  public open fun snapshotRetentionLimit(`value`: Number) {
    unwrap(this).setSnapshotRetentionLimit(`value`)
  }

  /**
   * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
   * node group (shard).
   */
  public open fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

  /**
   * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
   * node group (shard).
   */
  public open fun snapshotWindow(`value`: String) {
    unwrap(this).setSnapshotWindow(`value`)
  }

  /**
   * The cluster ID that is used as the daily snapshot source for the replication group.
   */
  public open fun snapshottingClusterId(): String? = unwrap(this).getSnapshottingClusterId()

  /**
   * The cluster ID that is used as the daily snapshot source for the replication group.
   */
  public open fun snapshottingClusterId(`value`: String) {
    unwrap(this).setSnapshottingClusterId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags to be added to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags to be added to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags to be added to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A flag that enables in-transit encryption when set to `true` .
   */
  public open fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

  /**
   * A flag that enables in-transit encryption when set to `true` .
   */
  public open fun transitEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setTransitEncryptionEnabled(`value`)
  }

  /**
   * A flag that enables in-transit encryption when set to `true` .
   */
  public open fun transitEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setTransitEncryptionEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A setting that allows you to migrate your clients to use in-transit encryption, with no
   * downtime.
   */
  public open fun transitEncryptionMode(): String? = unwrap(this).getTransitEncryptionMode()

  /**
   * A setting that allows you to migrate your clients to use in-transit encryption, with no
   * downtime.
   */
  public open fun transitEncryptionMode(`value`: String) {
    unwrap(this).setTransitEncryptionMode(`value`)
  }

  /**
   * The ID of user group to associate with the replication group.
   */
  public open fun userGroupIds(): List<String> = unwrap(this).getUserGroupIds() ?: emptyList()

  /**
   * The ID of user group to associate with the replication group.
   */
  public open fun userGroupIds(`value`: List<String>) {
    unwrap(this).setUserGroupIds(`value`)
  }

  /**
   * The ID of user group to associate with the replication group.
   */
  public open fun userGroupIds(vararg `value`: String): Unit = userGroupIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnReplicationGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A flag that enables encryption at rest when set to `true` .
     *
     * You cannot modify the value of `AtRestEncryptionEnabled` after the replication group is
     * created. To enable encryption at rest on a replication group you must set
     * `AtRestEncryptionEnabled` to `true` when you create the replication group.
     *
     * *Required:* Only available when creating a replication group in an Amazon VPC using Redis OSS
     * version `3.2.6` or `4.x` onward.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled)
     * @param atRestEncryptionEnabled A flag that enables encryption at rest when set to `true` . 
     */
    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean)

    /**
     * A flag that enables encryption at rest when set to `true` .
     *
     * You cannot modify the value of `AtRestEncryptionEnabled` after the replication group is
     * created. To enable encryption at rest on a replication group you must set
     * `AtRestEncryptionEnabled` to `true` when you create the replication group.
     *
     * *Required:* Only available when creating a replication group in an Amazon VPC using Redis OSS
     * version `3.2.6` or `4.x` onward.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled)
     * @param atRestEncryptionEnabled A flag that enables encryption at rest when set to `true` . 
     */
    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable)

    /**
     * *Reserved parameter.* The password used to access a password protected server.
     *
     * `AuthToken` can be specified only on replication groups where `TransitEncryptionEnabled` is
     * `true` . For more information, see [Authenticating Valkey or Redis OSS users with the AUTH
     * Command](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/auth.html) .
     *
     *
     * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken`
     * , and a `CacheSubnetGroup` .
     *
     *
     * Password constraints:
     *
     * * Must be only printable ASCII characters.
     * * Must be at least 16 characters and no more than 128 characters in length.
     * * Nonalphanumeric characters are restricted to (!, &amp;, #, $, ^, &lt;, &gt;, -, ).
     *
     * For more information, see [AUTH
     * password](https://docs.aws.amazon.com/http://redis.io/commands/AUTH) at
     * http://redis.io/commands/AUTH.
     *
     *
     * If ADDING the AuthToken, update requires
     * [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-authtoken)
     * @param authToken *Reserved parameter.* The password used to access a password protected
     * server. 
     */
    public fun authToken(authToken: String)

    /**
     * If you are running Valkey 7.2 or later, or Redis OSS 6.0 or later, set this parameter to yes
     * if you want to opt-in to the next minor version upgrade campaign. This parameter is disabled for
     * previous versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade)
     * @param autoMinorVersionUpgrade If you are running Valkey 7.2 or later, or Redis OSS 6.0 or
     * later, set this parameter to yes if you want to opt-in to the next minor version upgrade
     * campaign. This parameter is disabled for previous versions. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * If you are running Valkey 7.2 or later, or Redis OSS 6.0 or later, set this parameter to yes
     * if you want to opt-in to the next minor version upgrade campaign. This parameter is disabled for
     * previous versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade)
     * @param autoMinorVersionUpgrade If you are running Valkey 7.2 or later, or Redis OSS 6.0 or
     * later, set this parameter to yes if you want to opt-in to the next minor version upgrade
     * campaign. This parameter is disabled for previous versions. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * Specifies whether a read-only replica is automatically promoted to read/write primary if the
     * existing primary fails.
     *
     * `AutomaticFailoverEnabled` must be enabled for Valkey or Redis OSS (cluster mode enabled)
     * replication groups.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled)
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails. 
     */
    public fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean)

    /**
     * Specifies whether a read-only replica is automatically promoted to read/write primary if the
     * existing primary fails.
     *
     * `AutomaticFailoverEnabled` must be enabled for Valkey or Redis OSS (cluster mode enabled)
     * replication groups.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled)
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails. 
     */
    public fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable)

    /**
     * The compute and memory capacity of the nodes in the node group (shard).
     *
     * The following node types are supported by ElastiCache. Generally speaking, the current
     * generation types provide more memory and computational power at lower cost when compared to
     * their equivalent previous generation counterparts.
     *
     * * General purpose:
     * * Current generation:
     *
     * *M6g node types:* `cache.m6g.large` , `cache.m6g.xlarge` , `cache.m6g.2xlarge` ,
     * `cache.m6g.4xlarge` , `cache.m6g.12xlarge` , `cache.m6g.24xlarge`
     *
     * *M5 node types:* `cache.m5.large` , `cache.m5.xlarge` , `cache.m5.2xlarge` ,
     * `cache.m5.4xlarge` , `cache.m5.12xlarge` , `cache.m5.24xlarge`
     *
     * *M4 node types:* `cache.m4.large` , `cache.m4.xlarge` , `cache.m4.2xlarge` ,
     * `cache.m4.4xlarge` , `cache.m4.10xlarge`
     *
     * *T4g node types:* `cache.t4g.micro` , `cache.t4g.small` , `cache.t4g.medium`
     *
     * *T3 node types:* `cache.t3.micro` , `cache.t3.small` , `cache.t3.medium`
     *
     * *T2 node types:* `cache.t2.micro` , `cache.t2.small` , `cache.t2.medium`
     *
     * * Previous generation: (not recommended)
     *
     * *T1 node types:* `cache.t1.micro`
     *
     * *M1 node types:* `cache.m1.small` , `cache.m1.medium` , `cache.m1.large` , `cache.m1.xlarge`
     *
     * *M3 node types:* `cache.m3.medium` , `cache.m3.large` , `cache.m3.xlarge` ,
     * `cache.m3.2xlarge`
     *
     * * Compute optimized:
     * * Previous generation: (not recommended)
     *
     * *C1 node types:* `cache.c1.xlarge`
     *
     * * Memory optimized:
     * * Current generation:
     *
     * *R6gd node types:* `cache.r6gd.xlarge` , `cache.r6gd.2xlarge` , `cache.r6gd.4xlarge` ,
     * `cache.r6gd.8xlarge` , `cache.r6gd.12xlarge` , `cache.r6gd.16xlarge`
     *
     *
     * The `r6gd` family is available in the following regions: `us-east-2` , `us-east-1` ,
     * `us-west-2` , `us-west-1` , `eu-west-1` , `eu-central-1` , `ap-northeast-1` , `ap-southeast-1` ,
     * `ap-southeast-2` .
     *
     *
     * *R6g node types:* `cache.r6g.large` , `cache.r6g.xlarge` , `cache.r6g.2xlarge` ,
     * `cache.r6g.4xlarge` , `cache.r6g.12xlarge` , `cache.r6g.24xlarge`
     *
     * *R5 node types:* `cache.r5.large` , `cache.r5.xlarge` , `cache.r5.2xlarge` ,
     * `cache.r5.4xlarge` , `cache.r5.12xlarge` , `cache.r5.24xlarge`
     *
     * *R4 node types:* `cache.r4.large` , `cache.r4.xlarge` , `cache.r4.2xlarge` ,
     * `cache.r4.4xlarge` , `cache.r4.8xlarge` , `cache.r4.16xlarge`
     *
     * * Previous generation: (not recommended)
     *
     * *M2 node types:* `cache.m2.xlarge` , `cache.m2.2xlarge` , `cache.m2.4xlarge`
     *
     * *R3 node types:* `cache.r3.large` , `cache.r3.xlarge` , `cache.r3.2xlarge` ,
     * `cache.r3.4xlarge` , `cache.r3.8xlarge`
     *
     * For region availability, see [Supported Node Types by Amazon
     * Region](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachenodetype)
     * @param cacheNodeType The compute and memory capacity of the nodes in the node group (shard). 
     */
    public fun cacheNodeType(cacheNodeType: String)

    /**
     * The name of the parameter group to associate with this replication group.
     *
     * If this argument is omitted, the default cache parameter group for the specified engine is
     * used.
     *
     * If you are running Valkey or Redis OSS version 3.2.4 or later, only one node group (shard),
     * and want to use a default parameter group, we recommend that you specify the parameter group by
     * name.
     *
     * * To create a Valkey or Redis OSS (cluster mode disabled) replication group, use
     * `CacheParameterGroupName=default.redis3.2` .
     * * To create a Valkey or Redis OSS (cluster mode enabled) replication group, use
     * `CacheParameterGroupName=default.redis3.2.cluster.on` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cacheparametergroupname)
     * @param cacheParameterGroupName The name of the parameter group to associate with this
     * replication group. 
     */
    public fun cacheParameterGroupName(cacheParameterGroupName: String)

    /**
     * A list of cache security group names to associate with this replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames)
     * @param cacheSecurityGroupNames A list of cache security group names to associate with this
     * replication group. 
     */
    public fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>)

    /**
     * A list of cache security group names to associate with this replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames)
     * @param cacheSecurityGroupNames A list of cache security group names to associate with this
     * replication group. 
     */
    public fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String)

    /**
     * The name of the cache subnet group to be used for the replication group.
     *
     *
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group
     * before you start creating a cluster. For more information, see
     * [AWS::ElastiCache::SubnetGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesubnetgroupname)
     * @param cacheSubnetGroupName The name of the cache subnet group to be used for the replication
     * group. 
     */
    public fun cacheSubnetGroupName(cacheSubnetGroupName: String)

    /**
     * Enabled or Disabled.
     *
     * To modify cluster mode from Disabled to Enabled, you must first set the cluster mode to
     * Compatible. Compatible mode allows your Valkey or Redis OSS clients to connect using both
     * cluster mode enabled and cluster mode disabled. After you migrate all Valkey or Redis OSS
     * clients to use cluster mode enabled, you can then complete cluster mode configuration and set
     * the cluster mode to Enabled. For more information, see [Modify cluster
     * mode](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/modify-cluster-mode.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-clustermode)
     * @param clusterMode Enabled or Disabled. 
     */
    public fun clusterMode(clusterMode: String)

    /**
     * Enables data tiering.
     *
     * Data tiering is only supported for replication groups using the r6gd node type. This
     * parameter must be set to true when using r6gd nodes. For more information, see [Data
     * tiering](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/data-tiering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-datatieringenabled)
     * @param dataTieringEnabled Enables data tiering. 
     */
    public fun dataTieringEnabled(dataTieringEnabled: Boolean)

    /**
     * Enables data tiering.
     *
     * Data tiering is only supported for replication groups using the r6gd node type. This
     * parameter must be set to true when using r6gd nodes. For more information, see [Data
     * tiering](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/data-tiering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-datatieringenabled)
     * @param dataTieringEnabled Enables data tiering. 
     */
    public fun dataTieringEnabled(dataTieringEnabled: IResolvable)

    /**
     * The name of the cache engine to be used for the clusters in this replication group.
     *
     * The value must be set to `valkey` or `redis` .
     *
     *
     * Upgrading an existing engine from redis to valkey is done through in-place migration, and
     * requires a parameter group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engine)
     * @param engine The name of the cache engine to be used for the clusters in this replication
     * group. 
     */
    public fun engine(engine: String)

    /**
     * The version number of the cache engine to be used for the clusters in this replication group.
     *
     * To view the supported cache engine versions, use the `DescribeCacheEngineVersions` operation.
     *
     * *Important:* You can upgrade to a newer engine version (see [Selecting a Cache Engine and
     * Version](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/SelectEngine.html#VersionManagement)
     * ) in the *ElastiCache User Guide* , but you cannot downgrade to an earlier engine version. If
     * you want to use an earlier engine version, you must delete the existing cluster or replication
     * group and create it anew with the earlier engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engineversion)
     * @param engineVersion The version number of the cache engine to be used for the clusters in
     * this replication group. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * The name of the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-globalreplicationgroupid)
     * @param globalReplicationGroupId The name of the Global datastore. 
     */
    public fun globalReplicationGroupId(globalReplicationGroupId: String)

    /**
     * The network type you choose when creating a replication group, either `ipv4` | `ipv6` .
     *
     * IPv6 is supported for workloads using Valkey 7.2 and above, Redis OSS engine version 6.2 to
     * 7.1 or Memcached engine version 1.6.6 and above on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-ipdiscovery)
     * @param ipDiscovery The network type you choose when creating a replication group, either
     * `ipv4` | `ipv6` . 
     */
    public fun ipDiscovery(ipDiscovery: String)

    /**
     * The ID of the KMS key used to encrypt the disk on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-kmskeyid)
     * @param kmsKeyId The ID of the KMS key used to encrypt the disk on the cluster. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable)

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    public fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>)

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    public fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any)

    /**
     * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance.
     *
     * For more information, see [Minimizing Downtime:
     * Multi-AZ](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/AutoFailover.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-multiazenabled)
     * @param multiAzEnabled A flag indicating if you have Multi-AZ enabled to enhance fault
     * tolerance. 
     */
    public fun multiAzEnabled(multiAzEnabled: Boolean)

    /**
     * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance.
     *
     * For more information, see [Minimizing Downtime:
     * Multi-AZ](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/AutoFailover.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-multiazenabled)
     * @param multiAzEnabled A flag indicating if you have Multi-AZ enabled to enhance fault
     * tolerance. 
     */
    public fun multiAzEnabled(multiAzEnabled: IResolvable)

    /**
     * Must be either `ipv4` | `ipv6` | `dual_stack` .
     *
     * IPv6 is supported for workloads using Valkey 7.2 and above, Redis OSS engine version 6.2 to
     * 7.1 and Memcached engine version 1.6.6 and above on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-networktype)
     * @param networkType Must be either `ipv4` | `ipv6` | `dual_stack` . 
     */
    public fun networkType(networkType: String)

    /**
     * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
     * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
     *
     * If you set
     * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * to `true` , you can update `NodeGroupConfiguration` without interruption. When
     * `UseOnlineResharding` is set to `false` , or is not specified, updating `NodeGroupConfiguration`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
     * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
     * `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache
     * (ElastiCache) Valkey or Redis OSS cluster node group. 
     */
    public fun nodeGroupConfiguration(nodeGroupConfiguration: IResolvable)

    /**
     * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
     * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
     *
     * If you set
     * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * to `true` , you can update `NodeGroupConfiguration` without interruption. When
     * `UseOnlineResharding` is set to `false` , or is not specified, updating `NodeGroupConfiguration`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
     * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
     * `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache
     * (ElastiCache) Valkey or Redis OSS cluster node group. 
     */
    public fun nodeGroupConfiguration(nodeGroupConfiguration: List<Any>)

    /**
     * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
     * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
     *
     * If you set
     * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * to `true` , you can update `NodeGroupConfiguration` without interruption. When
     * `UseOnlineResharding` is set to `false` , or is not specified, updating `NodeGroupConfiguration`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
     * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
     * `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache
     * (ElastiCache) Valkey or Redis OSS cluster node group. 
     */
    public fun nodeGroupConfiguration(vararg nodeGroupConfiguration: Any)

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     * notifications are sent.
     *
     *
     * The Amazon SNS topic owner must be the same as the cluster owner.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-notificationtopicarn)
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications are sent. 
     */
    public fun notificationTopicArn(notificationTopicArn: String)

    /**
     * The number of clusters this replication group initially has.
     *
     * This parameter is not used if there is more than one node group (shard). You should use
     * `ReplicasPerNodeGroup` instead.
     *
     * If `AutomaticFailoverEnabled` is `true` , the value of this parameter must be at least 2. If
     * `AutomaticFailoverEnabled` is `false` you can omit this parameter (it will default to 1), or you
     * can explicitly set it to a value between 2 and 6.
     *
     * The maximum permitted value for `NumCacheClusters` is 6 (1 primary plus 5 replicas).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numcacheclusters)
     * @param numCacheClusters The number of clusters this replication group initially has. 
     */
    public fun numCacheClusters(numCacheClusters: Number)

    /**
     * An optional parameter that specifies the number of node groups (shards) for this Valkey or
     * Redis OSS (cluster mode enabled) replication group.
     *
     * For Valkey or Redis OSS (cluster mode disabled) either omit this parameter or set it to 1.
     *
     * If you set
     * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * to `true` , you can update `NumNodeGroups` without interruption. When `UseOnlineResharding` is
     * set to `false` , or is not specified, updating `NumNodeGroups` results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * Default: 1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numnodegroups)
     * @param numNodeGroups An optional parameter that specifies the number of node groups (shards)
     * for this Valkey or Redis OSS (cluster mode enabled) replication group. 
     */
    public fun numNodeGroups(numNodeGroups: Number)

    /**
     * The port number on which each member of the replication group accepts connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-port)
     * @param port The port number on which each member of the replication group accepts
     * connections. 
     */
    public fun port(port: Number)

    /**
     * A list of EC2 Availability Zones in which the replication group's clusters are created.
     *
     * The order of the Availability Zones in the list is the order in which clusters are allocated.
     * The primary cluster is created in the first AZ in the list.
     *
     * This parameter is not used if there is more than one node group (shard). You should use
     * `NodeGroupConfiguration` instead.
     *
     *
     * If you are creating your replication group in an Amazon VPC (recommended), you can only
     * locate clusters in Availability Zones associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheClusters` .
     *
     *
     * Default: system chosen Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs)
     * @param preferredCacheClusterAZs A list of EC2 Availability Zones in which the replication
     * group's clusters are created. 
     */
    public fun preferredCacheClusterAZs(preferredCacheClusterAZs: List<String>)

    /**
     * A list of EC2 Availability Zones in which the replication group's clusters are created.
     *
     * The order of the Availability Zones in the list is the order in which clusters are allocated.
     * The primary cluster is created in the first AZ in the list.
     *
     * This parameter is not used if there is more than one node group (shard). You should use
     * `NodeGroupConfiguration` instead.
     *
     *
     * If you are creating your replication group in an Amazon VPC (recommended), you can only
     * locate clusters in Availability Zones associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheClusters` .
     *
     *
     * Default: system chosen Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs)
     * @param preferredCacheClusterAZs A list of EC2 Availability Zones in which the replication
     * group's clusters are created. 
     */
    public fun preferredCacheClusterAZs(vararg preferredCacheClusterAZs: String)

    /**
     * Specifies the weekly time range during which maintenance on the cluster is performed.
     *
     * It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
     * maintenance window is a 60 minute period.
     *
     * Valid values for `ddd` are:
     *
     * * `sun`
     * * `mon`
     * * `tue`
     * * `wed`
     * * `thu`
     * * `fri`
     * * `sat`
     *
     * Example: `sun:23:00-mon:01:30`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow Specifies the weekly time range during which maintenance on
     * the cluster is performed. 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * The identifier of the cluster that serves as the primary for this replication group.
     *
     * This cluster must already exist and have a status of `available` .
     *
     * This parameter is not required if `NumCacheClusters` , `NumNodeGroups` , or
     * `ReplicasPerNodeGroup` is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-primaryclusterid)
     * @param primaryClusterId The identifier of the cluster that serves as the primary for this
     * replication group. 
     */
    public fun primaryClusterId(primaryClusterId: String)

    /**
     * An optional parameter that specifies the number of replica nodes in each node group (shard).
     *
     * Valid values are 0 to 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicaspernodegroup)
     * @param replicasPerNodeGroup An optional parameter that specifies the number of replica nodes
     * in each node group (shard). 
     */
    public fun replicasPerNodeGroup(replicasPerNodeGroup: Number)

    /**
     * A user-created description for the replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupdescription)
     * @param replicationGroupDescription A user-created description for the replication group. 
     */
    public fun replicationGroupDescription(replicationGroupDescription: String)

    /**
     * The replication group identifier. This parameter is stored as a lowercase string.
     *
     * Constraints:
     *
     * * A name must contain from 1 to 40 alphanumeric characters or hyphens.
     * * The first character must be a letter.
     * * A name cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupid)
     * @param replicationGroupId The replication group identifier. This parameter is stored as a
     * lowercase string. 
     */
    public fun replicationGroupId(replicationGroupId: String)

    /**
     * One or more Amazon VPC security groups associated with this replication group.
     *
     * Use this parameter only when you are creating a replication group in an Amazon Virtual
     * Private Cloud (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids)
     * @param securityGroupIds One or more Amazon VPC security groups associated with this
     * replication group. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * One or more Amazon VPC security groups associated with this replication group.
     *
     * Use this parameter only when you are creating a replication group in an Amazon Virtual
     * Private Cloud (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids)
     * @param securityGroupIds One or more Amazon VPC security groups associated with this
     * replication group. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the Valkey or Redis OSS RDB
     * snapshot files stored in Amazon S3.
     *
     * The snapshot files are used to populate the new replication group. The Amazon S3 object name
     * in the ARN cannot contain any commas. The new replication group will have the number of node
     * groups (console: shards) specified by the parameter *NumNodeGroups* or the number of node groups
     * configured by *NodeGroupConfiguration* regardless of the number of ARNs specified here.
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns)
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the Valkey
     * or Redis OSS RDB snapshot files stored in Amazon S3. 
     */
    public fun snapshotArns(snapshotArns: List<String>)

    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the Valkey or Redis OSS RDB
     * snapshot files stored in Amazon S3.
     *
     * The snapshot files are used to populate the new replication group. The Amazon S3 object name
     * in the ARN cannot contain any commas. The new replication group will have the number of node
     * groups (console: shards) specified by the parameter *NumNodeGroups* or the number of node groups
     * configured by *NodeGroupConfiguration* regardless of the number of ARNs specified here.
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns)
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the Valkey
     * or Redis OSS RDB snapshot files stored in Amazon S3. 
     */
    public fun snapshotArns(vararg snapshotArns: String)

    /**
     * The name of a snapshot from which to restore data into the new replication group.
     *
     * The snapshot status changes to `restoring` while the new replication group is being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotname)
     * @param snapshotName The name of a snapshot from which to restore data into the new
     * replication group. 
     */
    public fun snapshotName(snapshotName: String)

    /**
     * The number of days for which ElastiCache retains automatic snapshots before deleting them.
     *
     * For example, if you set `SnapshotRetentionLimit` to 5, a snapshot that was taken today is
     * retained for 5 days before being deleted.
     *
     * Default: 0 (i.e., automatic backups are disabled for this cluster).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotretentionlimit)
     * @param snapshotRetentionLimit The number of days for which ElastiCache retains automatic
     * snapshots before deleting them. 
     */
    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    /**
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
     * node group (shard).
     *
     * Example: `05:00-09:00`
     *
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time
     * range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotwindow)
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your node group (shard). 
     */
    public fun snapshotWindow(snapshotWindow: String)

    /**
     * The cluster ID that is used as the daily snapshot source for the replication group.
     *
     * This parameter cannot be set for Valkey or Redis OSS (cluster mode enabled) replication
     * groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshottingclusterid)
     * @param snapshottingClusterId The cluster ID that is used as the daily snapshot source for the
     * replication group. 
     */
    public fun snapshottingClusterId(snapshottingClusterId: String)

    /**
     * A list of tags to be added to this resource.
     *
     * Tags are comma-separated key,value pairs (e.g. Key= `myKey` , Value= `myKeyValue` . You can
     * include multiple tags as shown following: Key= `myKey` , Value= `myKeyValue` Key= `mySecondKey`
     * , Value= `mySecondKeyValue` . Tags on replication groups will be replicated to all nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to be added to this resource.
     *
     * Tags are comma-separated key,value pairs (e.g. Key= `myKey` , Value= `myKeyValue` . You can
     * include multiple tags as shown following: Key= `myKey` , Value= `myKeyValue` Key= `mySecondKey`
     * , Value= `mySecondKeyValue` . Tags on replication groups will be replicated to all nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A flag that enables in-transit encryption when set to `true` .
     *
     * You cannot modify the value of `TransitEncryptionEnabled` after the cluster is created. To
     * enable in-transit encryption on a cluster you must set `TransitEncryptionEnabled` to `true` when
     * you create a cluster.
     *
     * This parameter is valid only if the `Engine` parameter is `redis` , the `EngineVersion`
     * parameter is `3.2.6` or `4.x` onward, and the cluster is being created in an Amazon VPC.
     *
     * If you enable in-transit encryption, you must also specify a value for `CacheSubnetGroup` .
     *
     *
     * * TransitEncryptionEnabled is only available when creating a replication group in an Amazon
     * VPC using Valkey version `7.2` and above, Redis OSS version `3.2.6` , or Redis OSS version `4.x`
     * and above.
     * * TransitEncryptionEnabled is required when creating a new valkey replication group.
     *
     *
     * Default: `false`
     *
     *
     * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken`
     * , and a `CacheSubnetGroup` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled)
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to `true`
     * . 
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean)

    /**
     * A flag that enables in-transit encryption when set to `true` .
     *
     * You cannot modify the value of `TransitEncryptionEnabled` after the cluster is created. To
     * enable in-transit encryption on a cluster you must set `TransitEncryptionEnabled` to `true` when
     * you create a cluster.
     *
     * This parameter is valid only if the `Engine` parameter is `redis` , the `EngineVersion`
     * parameter is `3.2.6` or `4.x` onward, and the cluster is being created in an Amazon VPC.
     *
     * If you enable in-transit encryption, you must also specify a value for `CacheSubnetGroup` .
     *
     *
     * * TransitEncryptionEnabled is only available when creating a replication group in an Amazon
     * VPC using Valkey version `7.2` and above, Redis OSS version `3.2.6` , or Redis OSS version `4.x`
     * and above.
     * * TransitEncryptionEnabled is required when creating a new valkey replication group.
     *
     *
     * Default: `false`
     *
     *
     * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken`
     * , and a `CacheSubnetGroup` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled)
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to `true`
     * . 
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable)

    /**
     * A setting that allows you to migrate your clients to use in-transit encryption, with no
     * downtime.
     *
     * When setting `TransitEncryptionEnabled` to `true` , you can set your `TransitEncryptionMode`
     * to `preferred` in the same request, to allow both encrypted and unencrypted connections at the
     * same time. Once you migrate all your Valkey or Redis OSS clients to use encrypted connections
     * you can modify the value to `required` to allow encrypted connections only.
     *
     * Setting `TransitEncryptionMode` to `required` is a two-step process that requires you to
     * first set the `TransitEncryptionMode` to `preferred` , after that you can set
     * `TransitEncryptionMode` to `required` .
     *
     * This process will not trigger the replacement of the replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionmode)
     * @param transitEncryptionMode A setting that allows you to migrate your clients to use
     * in-transit encryption, with no downtime. 
     */
    public fun transitEncryptionMode(transitEncryptionMode: String)

    /**
     * The ID of user group to associate with the replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-usergroupids)
     * @param userGroupIds The ID of user group to associate with the replication group. 
     */
    public fun userGroupIds(userGroupIds: List<String>)

    /**
     * The ID of user group to associate with the replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-usergroupids)
     * @param userGroupIds The ID of user group to associate with the replication group. 
     */
    public fun userGroupIds(vararg userGroupIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.Builder
        = software.amazon.awscdk.services.elasticache.CfnReplicationGroup.Builder.create(scope, id)

    /**
     * A flag that enables encryption at rest when set to `true` .
     *
     * You cannot modify the value of `AtRestEncryptionEnabled` after the replication group is
     * created. To enable encryption at rest on a replication group you must set
     * `AtRestEncryptionEnabled` to `true` when you create the replication group.
     *
     * *Required:* Only available when creating a replication group in an Amazon VPC using Redis OSS
     * version `3.2.6` or `4.x` onward.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled)
     * @param atRestEncryptionEnabled A flag that enables encryption at rest when set to `true` . 
     */
    override fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
    }

    /**
     * A flag that enables encryption at rest when set to `true` .
     *
     * You cannot modify the value of `AtRestEncryptionEnabled` after the replication group is
     * created. To enable encryption at rest on a replication group you must set
     * `AtRestEncryptionEnabled` to `true` when you create the replication group.
     *
     * *Required:* Only available when creating a replication group in an Amazon VPC using Redis OSS
     * version `3.2.6` or `4.x` onward.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled)
     * @param atRestEncryptionEnabled A flag that enables encryption at rest when set to `true` . 
     */
    override fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * *Reserved parameter.* The password used to access a password protected server.
     *
     * `AuthToken` can be specified only on replication groups where `TransitEncryptionEnabled` is
     * `true` . For more information, see [Authenticating Valkey or Redis OSS users with the AUTH
     * Command](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/auth.html) .
     *
     *
     * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken`
     * , and a `CacheSubnetGroup` .
     *
     *
     * Password constraints:
     *
     * * Must be only printable ASCII characters.
     * * Must be at least 16 characters and no more than 128 characters in length.
     * * Nonalphanumeric characters are restricted to (!, &amp;, #, $, ^, &lt;, &gt;, -, ).
     *
     * For more information, see [AUTH
     * password](https://docs.aws.amazon.com/http://redis.io/commands/AUTH) at
     * http://redis.io/commands/AUTH.
     *
     *
     * If ADDING the AuthToken, update requires
     * [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-authtoken)
     * @param authToken *Reserved parameter.* The password used to access a password protected
     * server. 
     */
    override fun authToken(authToken: String) {
      cdkBuilder.authToken(authToken)
    }

    /**
     * If you are running Valkey 7.2 or later, or Redis OSS 6.0 or later, set this parameter to yes
     * if you want to opt-in to the next minor version upgrade campaign. This parameter is disabled for
     * previous versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade)
     * @param autoMinorVersionUpgrade If you are running Valkey 7.2 or later, or Redis OSS 6.0 or
     * later, set this parameter to yes if you want to opt-in to the next minor version upgrade
     * campaign. This parameter is disabled for previous versions. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * If you are running Valkey 7.2 or later, or Redis OSS 6.0 or later, set this parameter to yes
     * if you want to opt-in to the next minor version upgrade campaign. This parameter is disabled for
     * previous versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade)
     * @param autoMinorVersionUpgrade If you are running Valkey 7.2 or later, or Redis OSS 6.0 or
     * later, set this parameter to yes if you want to opt-in to the next minor version upgrade
     * campaign. This parameter is disabled for previous versions. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies whether a read-only replica is automatically promoted to read/write primary if the
     * existing primary fails.
     *
     * `AutomaticFailoverEnabled` must be enabled for Valkey or Redis OSS (cluster mode enabled)
     * replication groups.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled)
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails. 
     */
    override fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean) {
      cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
    }

    /**
     * Specifies whether a read-only replica is automatically promoted to read/write primary if the
     * existing primary fails.
     *
     * `AutomaticFailoverEnabled` must be enabled for Valkey or Redis OSS (cluster mode enabled)
     * replication groups.
     *
     * Default: false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled)
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails. 
     */
    override fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable) {
      cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The compute and memory capacity of the nodes in the node group (shard).
     *
     * The following node types are supported by ElastiCache. Generally speaking, the current
     * generation types provide more memory and computational power at lower cost when compared to
     * their equivalent previous generation counterparts.
     *
     * * General purpose:
     * * Current generation:
     *
     * *M6g node types:* `cache.m6g.large` , `cache.m6g.xlarge` , `cache.m6g.2xlarge` ,
     * `cache.m6g.4xlarge` , `cache.m6g.12xlarge` , `cache.m6g.24xlarge`
     *
     * *M5 node types:* `cache.m5.large` , `cache.m5.xlarge` , `cache.m5.2xlarge` ,
     * `cache.m5.4xlarge` , `cache.m5.12xlarge` , `cache.m5.24xlarge`
     *
     * *M4 node types:* `cache.m4.large` , `cache.m4.xlarge` , `cache.m4.2xlarge` ,
     * `cache.m4.4xlarge` , `cache.m4.10xlarge`
     *
     * *T4g node types:* `cache.t4g.micro` , `cache.t4g.small` , `cache.t4g.medium`
     *
     * *T3 node types:* `cache.t3.micro` , `cache.t3.small` , `cache.t3.medium`
     *
     * *T2 node types:* `cache.t2.micro` , `cache.t2.small` , `cache.t2.medium`
     *
     * * Previous generation: (not recommended)
     *
     * *T1 node types:* `cache.t1.micro`
     *
     * *M1 node types:* `cache.m1.small` , `cache.m1.medium` , `cache.m1.large` , `cache.m1.xlarge`
     *
     * *M3 node types:* `cache.m3.medium` , `cache.m3.large` , `cache.m3.xlarge` ,
     * `cache.m3.2xlarge`
     *
     * * Compute optimized:
     * * Previous generation: (not recommended)
     *
     * *C1 node types:* `cache.c1.xlarge`
     *
     * * Memory optimized:
     * * Current generation:
     *
     * *R6gd node types:* `cache.r6gd.xlarge` , `cache.r6gd.2xlarge` , `cache.r6gd.4xlarge` ,
     * `cache.r6gd.8xlarge` , `cache.r6gd.12xlarge` , `cache.r6gd.16xlarge`
     *
     *
     * The `r6gd` family is available in the following regions: `us-east-2` , `us-east-1` ,
     * `us-west-2` , `us-west-1` , `eu-west-1` , `eu-central-1` , `ap-northeast-1` , `ap-southeast-1` ,
     * `ap-southeast-2` .
     *
     *
     * *R6g node types:* `cache.r6g.large` , `cache.r6g.xlarge` , `cache.r6g.2xlarge` ,
     * `cache.r6g.4xlarge` , `cache.r6g.12xlarge` , `cache.r6g.24xlarge`
     *
     * *R5 node types:* `cache.r5.large` , `cache.r5.xlarge` , `cache.r5.2xlarge` ,
     * `cache.r5.4xlarge` , `cache.r5.12xlarge` , `cache.r5.24xlarge`
     *
     * *R4 node types:* `cache.r4.large` , `cache.r4.xlarge` , `cache.r4.2xlarge` ,
     * `cache.r4.4xlarge` , `cache.r4.8xlarge` , `cache.r4.16xlarge`
     *
     * * Previous generation: (not recommended)
     *
     * *M2 node types:* `cache.m2.xlarge` , `cache.m2.2xlarge` , `cache.m2.4xlarge`
     *
     * *R3 node types:* `cache.r3.large` , `cache.r3.xlarge` , `cache.r3.2xlarge` ,
     * `cache.r3.4xlarge` , `cache.r3.8xlarge`
     *
     * For region availability, see [Supported Node Types by Amazon
     * Region](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachenodetype)
     * @param cacheNodeType The compute and memory capacity of the nodes in the node group (shard). 
     */
    override fun cacheNodeType(cacheNodeType: String) {
      cdkBuilder.cacheNodeType(cacheNodeType)
    }

    /**
     * The name of the parameter group to associate with this replication group.
     *
     * If this argument is omitted, the default cache parameter group for the specified engine is
     * used.
     *
     * If you are running Valkey or Redis OSS version 3.2.4 or later, only one node group (shard),
     * and want to use a default parameter group, we recommend that you specify the parameter group by
     * name.
     *
     * * To create a Valkey or Redis OSS (cluster mode disabled) replication group, use
     * `CacheParameterGroupName=default.redis3.2` .
     * * To create a Valkey or Redis OSS (cluster mode enabled) replication group, use
     * `CacheParameterGroupName=default.redis3.2.cluster.on` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cacheparametergroupname)
     * @param cacheParameterGroupName The name of the parameter group to associate with this
     * replication group. 
     */
    override fun cacheParameterGroupName(cacheParameterGroupName: String) {
      cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
    }

    /**
     * A list of cache security group names to associate with this replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames)
     * @param cacheSecurityGroupNames A list of cache security group names to associate with this
     * replication group. 
     */
    override fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>) {
      cdkBuilder.cacheSecurityGroupNames(cacheSecurityGroupNames)
    }

    /**
     * A list of cache security group names to associate with this replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames)
     * @param cacheSecurityGroupNames A list of cache security group names to associate with this
     * replication group. 
     */
    override fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String): Unit =
        cacheSecurityGroupNames(cacheSecurityGroupNames.toList())

    /**
     * The name of the cache subnet group to be used for the replication group.
     *
     *
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group
     * before you start creating a cluster. For more information, see
     * [AWS::ElastiCache::SubnetGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesubnetgroupname)
     * @param cacheSubnetGroupName The name of the cache subnet group to be used for the replication
     * group. 
     */
    override fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
      cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
    }

    /**
     * Enabled or Disabled.
     *
     * To modify cluster mode from Disabled to Enabled, you must first set the cluster mode to
     * Compatible. Compatible mode allows your Valkey or Redis OSS clients to connect using both
     * cluster mode enabled and cluster mode disabled. After you migrate all Valkey or Redis OSS
     * clients to use cluster mode enabled, you can then complete cluster mode configuration and set
     * the cluster mode to Enabled. For more information, see [Modify cluster
     * mode](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/modify-cluster-mode.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-clustermode)
     * @param clusterMode Enabled or Disabled. 
     */
    override fun clusterMode(clusterMode: String) {
      cdkBuilder.clusterMode(clusterMode)
    }

    /**
     * Enables data tiering.
     *
     * Data tiering is only supported for replication groups using the r6gd node type. This
     * parameter must be set to true when using r6gd nodes. For more information, see [Data
     * tiering](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/data-tiering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-datatieringenabled)
     * @param dataTieringEnabled Enables data tiering. 
     */
    override fun dataTieringEnabled(dataTieringEnabled: Boolean) {
      cdkBuilder.dataTieringEnabled(dataTieringEnabled)
    }

    /**
     * Enables data tiering.
     *
     * Data tiering is only supported for replication groups using the r6gd node type. This
     * parameter must be set to true when using r6gd nodes. For more information, see [Data
     * tiering](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/data-tiering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-datatieringenabled)
     * @param dataTieringEnabled Enables data tiering. 
     */
    override fun dataTieringEnabled(dataTieringEnabled: IResolvable) {
      cdkBuilder.dataTieringEnabled(dataTieringEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The name of the cache engine to be used for the clusters in this replication group.
     *
     * The value must be set to `valkey` or `redis` .
     *
     *
     * Upgrading an existing engine from redis to valkey is done through in-place migration, and
     * requires a parameter group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engine)
     * @param engine The name of the cache engine to be used for the clusters in this replication
     * group. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * The version number of the cache engine to be used for the clusters in this replication group.
     *
     * To view the supported cache engine versions, use the `DescribeCacheEngineVersions` operation.
     *
     * *Important:* You can upgrade to a newer engine version (see [Selecting a Cache Engine and
     * Version](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/SelectEngine.html#VersionManagement)
     * ) in the *ElastiCache User Guide* , but you cannot downgrade to an earlier engine version. If
     * you want to use an earlier engine version, you must delete the existing cluster or replication
     * group and create it anew with the earlier engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engineversion)
     * @param engineVersion The version number of the cache engine to be used for the clusters in
     * this replication group. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The name of the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-globalreplicationgroupid)
     * @param globalReplicationGroupId The name of the Global datastore. 
     */
    override fun globalReplicationGroupId(globalReplicationGroupId: String) {
      cdkBuilder.globalReplicationGroupId(globalReplicationGroupId)
    }

    /**
     * The network type you choose when creating a replication group, either `ipv4` | `ipv6` .
     *
     * IPv6 is supported for workloads using Valkey 7.2 and above, Redis OSS engine version 6.2 to
     * 7.1 or Memcached engine version 1.6.6 and above on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-ipdiscovery)
     * @param ipDiscovery The network type you choose when creating a replication group, either
     * `ipv4` | `ipv6` . 
     */
    override fun ipDiscovery(ipDiscovery: String) {
      cdkBuilder.ipDiscovery(ipDiscovery)
    }

    /**
     * The ID of the KMS key used to encrypt the disk on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-kmskeyid)
     * @param kmsKeyId The ID of the KMS key used to encrypt the disk on the cluster. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    override fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    override fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    override fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any): Unit =
        logDeliveryConfigurations(logDeliveryConfigurations.toList())

    /**
     * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance.
     *
     * For more information, see [Minimizing Downtime:
     * Multi-AZ](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/AutoFailover.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-multiazenabled)
     * @param multiAzEnabled A flag indicating if you have Multi-AZ enabled to enhance fault
     * tolerance. 
     */
    override fun multiAzEnabled(multiAzEnabled: Boolean) {
      cdkBuilder.multiAzEnabled(multiAzEnabled)
    }

    /**
     * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance.
     *
     * For more information, see [Minimizing Downtime:
     * Multi-AZ](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/AutoFailover.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-multiazenabled)
     * @param multiAzEnabled A flag indicating if you have Multi-AZ enabled to enhance fault
     * tolerance. 
     */
    override fun multiAzEnabled(multiAzEnabled: IResolvable) {
      cdkBuilder.multiAzEnabled(multiAzEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * Must be either `ipv4` | `ipv6` | `dual_stack` .
     *
     * IPv6 is supported for workloads using Valkey 7.2 and above, Redis OSS engine version 6.2 to
     * 7.1 and Memcached engine version 1.6.6 and above on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-networktype)
     * @param networkType Must be either `ipv4` | `ipv6` | `dual_stack` . 
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    /**
     * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
     * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
     *
     * If you set
     * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * to `true` , you can update `NodeGroupConfiguration` without interruption. When
     * `UseOnlineResharding` is set to `false` , or is not specified, updating `NodeGroupConfiguration`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
     * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
     * `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache
     * (ElastiCache) Valkey or Redis OSS cluster node group. 
     */
    override fun nodeGroupConfiguration(nodeGroupConfiguration: IResolvable) {
      cdkBuilder.nodeGroupConfiguration(nodeGroupConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
     * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
     *
     * If you set
     * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * to `true` , you can update `NodeGroupConfiguration` without interruption. When
     * `UseOnlineResharding` is set to `false` , or is not specified, updating `NodeGroupConfiguration`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
     * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
     * `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache
     * (ElastiCache) Valkey or Redis OSS cluster node group. 
     */
    override fun nodeGroupConfiguration(nodeGroupConfiguration: List<Any>) {
      cdkBuilder.nodeGroupConfiguration(nodeGroupConfiguration.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
     * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
     *
     * If you set
     * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * to `true` , you can update `NodeGroupConfiguration` without interruption. When
     * `UseOnlineResharding` is set to `false` , or is not specified, updating `NodeGroupConfiguration`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
     * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
     * `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache
     * (ElastiCache) Valkey or Redis OSS cluster node group. 
     */
    override fun nodeGroupConfiguration(vararg nodeGroupConfiguration: Any): Unit =
        nodeGroupConfiguration(nodeGroupConfiguration.toList())

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     * notifications are sent.
     *
     *
     * The Amazon SNS topic owner must be the same as the cluster owner.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-notificationtopicarn)
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications are sent. 
     */
    override fun notificationTopicArn(notificationTopicArn: String) {
      cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    /**
     * The number of clusters this replication group initially has.
     *
     * This parameter is not used if there is more than one node group (shard). You should use
     * `ReplicasPerNodeGroup` instead.
     *
     * If `AutomaticFailoverEnabled` is `true` , the value of this parameter must be at least 2. If
     * `AutomaticFailoverEnabled` is `false` you can omit this parameter (it will default to 1), or you
     * can explicitly set it to a value between 2 and 6.
     *
     * The maximum permitted value for `NumCacheClusters` is 6 (1 primary plus 5 replicas).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numcacheclusters)
     * @param numCacheClusters The number of clusters this replication group initially has. 
     */
    override fun numCacheClusters(numCacheClusters: Number) {
      cdkBuilder.numCacheClusters(numCacheClusters)
    }

    /**
     * An optional parameter that specifies the number of node groups (shards) for this Valkey or
     * Redis OSS (cluster mode enabled) replication group.
     *
     * For Valkey or Redis OSS (cluster mode disabled) either omit this parameter or set it to 1.
     *
     * If you set
     * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * to `true` , you can update `NumNodeGroups` without interruption. When `UseOnlineResharding` is
     * set to `false` , or is not specified, updating `NumNodeGroups` results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * Default: 1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numnodegroups)
     * @param numNodeGroups An optional parameter that specifies the number of node groups (shards)
     * for this Valkey or Redis OSS (cluster mode enabled) replication group. 
     */
    override fun numNodeGroups(numNodeGroups: Number) {
      cdkBuilder.numNodeGroups(numNodeGroups)
    }

    /**
     * The port number on which each member of the replication group accepts connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-port)
     * @param port The port number on which each member of the replication group accepts
     * connections. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * A list of EC2 Availability Zones in which the replication group's clusters are created.
     *
     * The order of the Availability Zones in the list is the order in which clusters are allocated.
     * The primary cluster is created in the first AZ in the list.
     *
     * This parameter is not used if there is more than one node group (shard). You should use
     * `NodeGroupConfiguration` instead.
     *
     *
     * If you are creating your replication group in an Amazon VPC (recommended), you can only
     * locate clusters in Availability Zones associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheClusters` .
     *
     *
     * Default: system chosen Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs)
     * @param preferredCacheClusterAZs A list of EC2 Availability Zones in which the replication
     * group's clusters are created. 
     */
    override fun preferredCacheClusterAZs(preferredCacheClusterAZs: List<String>) {
      cdkBuilder.preferredCacheClusterAZs(preferredCacheClusterAZs)
    }

    /**
     * A list of EC2 Availability Zones in which the replication group's clusters are created.
     *
     * The order of the Availability Zones in the list is the order in which clusters are allocated.
     * The primary cluster is created in the first AZ in the list.
     *
     * This parameter is not used if there is more than one node group (shard). You should use
     * `NodeGroupConfiguration` instead.
     *
     *
     * If you are creating your replication group in an Amazon VPC (recommended), you can only
     * locate clusters in Availability Zones associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheClusters` .
     *
     *
     * Default: system chosen Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs)
     * @param preferredCacheClusterAZs A list of EC2 Availability Zones in which the replication
     * group's clusters are created. 
     */
    override fun preferredCacheClusterAZs(vararg preferredCacheClusterAZs: String): Unit =
        preferredCacheClusterAZs(preferredCacheClusterAZs.toList())

    /**
     * Specifies the weekly time range during which maintenance on the cluster is performed.
     *
     * It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
     * maintenance window is a 60 minute period.
     *
     * Valid values for `ddd` are:
     *
     * * `sun`
     * * `mon`
     * * `tue`
     * * `wed`
     * * `thu`
     * * `fri`
     * * `sat`
     *
     * Example: `sun:23:00-mon:01:30`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow Specifies the weekly time range during which maintenance on
     * the cluster is performed. 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * The identifier of the cluster that serves as the primary for this replication group.
     *
     * This cluster must already exist and have a status of `available` .
     *
     * This parameter is not required if `NumCacheClusters` , `NumNodeGroups` , or
     * `ReplicasPerNodeGroup` is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-primaryclusterid)
     * @param primaryClusterId The identifier of the cluster that serves as the primary for this
     * replication group. 
     */
    override fun primaryClusterId(primaryClusterId: String) {
      cdkBuilder.primaryClusterId(primaryClusterId)
    }

    /**
     * An optional parameter that specifies the number of replica nodes in each node group (shard).
     *
     * Valid values are 0 to 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicaspernodegroup)
     * @param replicasPerNodeGroup An optional parameter that specifies the number of replica nodes
     * in each node group (shard). 
     */
    override fun replicasPerNodeGroup(replicasPerNodeGroup: Number) {
      cdkBuilder.replicasPerNodeGroup(replicasPerNodeGroup)
    }

    /**
     * A user-created description for the replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupdescription)
     * @param replicationGroupDescription A user-created description for the replication group. 
     */
    override fun replicationGroupDescription(replicationGroupDescription: String) {
      cdkBuilder.replicationGroupDescription(replicationGroupDescription)
    }

    /**
     * The replication group identifier. This parameter is stored as a lowercase string.
     *
     * Constraints:
     *
     * * A name must contain from 1 to 40 alphanumeric characters or hyphens.
     * * The first character must be a letter.
     * * A name cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupid)
     * @param replicationGroupId The replication group identifier. This parameter is stored as a
     * lowercase string. 
     */
    override fun replicationGroupId(replicationGroupId: String) {
      cdkBuilder.replicationGroupId(replicationGroupId)
    }

    /**
     * One or more Amazon VPC security groups associated with this replication group.
     *
     * Use this parameter only when you are creating a replication group in an Amazon Virtual
     * Private Cloud (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids)
     * @param securityGroupIds One or more Amazon VPC security groups associated with this
     * replication group. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * One or more Amazon VPC security groups associated with this replication group.
     *
     * Use this parameter only when you are creating a replication group in an Amazon Virtual
     * Private Cloud (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids)
     * @param securityGroupIds One or more Amazon VPC security groups associated with this
     * replication group. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the Valkey or Redis OSS RDB
     * snapshot files stored in Amazon S3.
     *
     * The snapshot files are used to populate the new replication group. The Amazon S3 object name
     * in the ARN cannot contain any commas. The new replication group will have the number of node
     * groups (console: shards) specified by the parameter *NumNodeGroups* or the number of node groups
     * configured by *NodeGroupConfiguration* regardless of the number of ARNs specified here.
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns)
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the Valkey
     * or Redis OSS RDB snapshot files stored in Amazon S3. 
     */
    override fun snapshotArns(snapshotArns: List<String>) {
      cdkBuilder.snapshotArns(snapshotArns)
    }

    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the Valkey or Redis OSS RDB
     * snapshot files stored in Amazon S3.
     *
     * The snapshot files are used to populate the new replication group. The Amazon S3 object name
     * in the ARN cannot contain any commas. The new replication group will have the number of node
     * groups (console: shards) specified by the parameter *NumNodeGroups* or the number of node groups
     * configured by *NodeGroupConfiguration* regardless of the number of ARNs specified here.
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns)
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the Valkey
     * or Redis OSS RDB snapshot files stored in Amazon S3. 
     */
    override fun snapshotArns(vararg snapshotArns: String): Unit =
        snapshotArns(snapshotArns.toList())

    /**
     * The name of a snapshot from which to restore data into the new replication group.
     *
     * The snapshot status changes to `restoring` while the new replication group is being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotname)
     * @param snapshotName The name of a snapshot from which to restore data into the new
     * replication group. 
     */
    override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    /**
     * The number of days for which ElastiCache retains automatic snapshots before deleting them.
     *
     * For example, if you set `SnapshotRetentionLimit` to 5, a snapshot that was taken today is
     * retained for 5 days before being deleted.
     *
     * Default: 0 (i.e., automatic backups are disabled for this cluster).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotretentionlimit)
     * @param snapshotRetentionLimit The number of days for which ElastiCache retains automatic
     * snapshots before deleting them. 
     */
    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
      cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    /**
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
     * node group (shard).
     *
     * Example: `05:00-09:00`
     *
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time
     * range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotwindow)
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your node group (shard). 
     */
    override fun snapshotWindow(snapshotWindow: String) {
      cdkBuilder.snapshotWindow(snapshotWindow)
    }

    /**
     * The cluster ID that is used as the daily snapshot source for the replication group.
     *
     * This parameter cannot be set for Valkey or Redis OSS (cluster mode enabled) replication
     * groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshottingclusterid)
     * @param snapshottingClusterId The cluster ID that is used as the daily snapshot source for the
     * replication group. 
     */
    override fun snapshottingClusterId(snapshottingClusterId: String) {
      cdkBuilder.snapshottingClusterId(snapshottingClusterId)
    }

    /**
     * A list of tags to be added to this resource.
     *
     * Tags are comma-separated key,value pairs (e.g. Key= `myKey` , Value= `myKeyValue` . You can
     * include multiple tags as shown following: Key= `myKey` , Value= `myKeyValue` Key= `mySecondKey`
     * , Value= `mySecondKeyValue` . Tags on replication groups will be replicated to all nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags to be added to this resource.
     *
     * Tags are comma-separated key,value pairs (e.g. Key= `myKey` , Value= `myKeyValue` . You can
     * include multiple tags as shown following: Key= `myKey` , Value= `myKeyValue` Key= `mySecondKey`
     * , Value= `mySecondKeyValue` . Tags on replication groups will be replicated to all nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A flag that enables in-transit encryption when set to `true` .
     *
     * You cannot modify the value of `TransitEncryptionEnabled` after the cluster is created. To
     * enable in-transit encryption on a cluster you must set `TransitEncryptionEnabled` to `true` when
     * you create a cluster.
     *
     * This parameter is valid only if the `Engine` parameter is `redis` , the `EngineVersion`
     * parameter is `3.2.6` or `4.x` onward, and the cluster is being created in an Amazon VPC.
     *
     * If you enable in-transit encryption, you must also specify a value for `CacheSubnetGroup` .
     *
     *
     * * TransitEncryptionEnabled is only available when creating a replication group in an Amazon
     * VPC using Valkey version `7.2` and above, Redis OSS version `3.2.6` , or Redis OSS version `4.x`
     * and above.
     * * TransitEncryptionEnabled is required when creating a new valkey replication group.
     *
     *
     * Default: `false`
     *
     *
     * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken`
     * , and a `CacheSubnetGroup` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled)
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to `true`
     * . 
     */
    override fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    /**
     * A flag that enables in-transit encryption when set to `true` .
     *
     * You cannot modify the value of `TransitEncryptionEnabled` after the cluster is created. To
     * enable in-transit encryption on a cluster you must set `TransitEncryptionEnabled` to `true` when
     * you create a cluster.
     *
     * This parameter is valid only if the `Engine` parameter is `redis` , the `EngineVersion`
     * parameter is `3.2.6` or `4.x` onward, and the cluster is being created in an Amazon VPC.
     *
     * If you enable in-transit encryption, you must also specify a value for `CacheSubnetGroup` .
     *
     *
     * * TransitEncryptionEnabled is only available when creating a replication group in an Amazon
     * VPC using Valkey version `7.2` and above, Redis OSS version `3.2.6` , or Redis OSS version `4.x`
     * and above.
     * * TransitEncryptionEnabled is required when creating a new valkey replication group.
     *
     *
     * Default: `false`
     *
     *
     * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken`
     * , and a `CacheSubnetGroup` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled)
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to `true`
     * . 
     */
    override fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * A setting that allows you to migrate your clients to use in-transit encryption, with no
     * downtime.
     *
     * When setting `TransitEncryptionEnabled` to `true` , you can set your `TransitEncryptionMode`
     * to `preferred` in the same request, to allow both encrypted and unencrypted connections at the
     * same time. Once you migrate all your Valkey or Redis OSS clients to use encrypted connections
     * you can modify the value to `required` to allow encrypted connections only.
     *
     * Setting `TransitEncryptionMode` to `required` is a two-step process that requires you to
     * first set the `TransitEncryptionMode` to `preferred` , after that you can set
     * `TransitEncryptionMode` to `required` .
     *
     * This process will not trigger the replacement of the replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionmode)
     * @param transitEncryptionMode A setting that allows you to migrate your clients to use
     * in-transit encryption, with no downtime. 
     */
    override fun transitEncryptionMode(transitEncryptionMode: String) {
      cdkBuilder.transitEncryptionMode(transitEncryptionMode)
    }

    /**
     * The ID of user group to associate with the replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-usergroupids)
     * @param userGroupIds The ID of user group to associate with the replication group. 
     */
    override fun userGroupIds(userGroupIds: List<String>) {
      cdkBuilder.userGroupIds(userGroupIds)
    }

    /**
     * The ID of user group to associate with the replication group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-usergroupids)
     * @param userGroupIds The ID of user group to associate with the replication group. 
     */
    override fun userGroupIds(vararg userGroupIds: String): Unit =
        userGroupIds(userGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnReplicationGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup):
        CfnReplicationGroup = CfnReplicationGroup(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationGroup):
        software.amazon.awscdk.services.elasticache.CfnReplicationGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.elasticache.CfnReplicationGroup
  }

  /**
   * The configuration details of the CloudWatch Logs destination.
   *
   * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
   * destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * CloudWatchLogsDestinationDetailsProperty cloudWatchLogsDestinationDetailsProperty =
   * CloudWatchLogsDestinationDetailsProperty.builder()
   * .logGroup("logGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-cloudwatchlogsdestinationdetails.html)
   */
  public interface CloudWatchLogsDestinationDetailsProperty {
    /**
     * The name of the CloudWatch Logs log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-cloudwatchlogsdestinationdetails.html#cfn-elasticache-replicationgroup-cloudwatchlogsdestinationdetails-loggroup)
     */
    public fun logGroup(): String

    /**
     * A builder for [CloudWatchLogsDestinationDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroup The name of the CloudWatch Logs log group. 
       */
      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.builder()

      /**
       * @param logGroup The name of the CloudWatch Logs log group. 
       */
      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty,
    ) : CdkObject(cdkObject),
        CloudWatchLogsDestinationDetailsProperty {
      /**
       * The name of the CloudWatch Logs log group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-cloudwatchlogsdestinationdetails.html#cfn-elasticache-replicationgroup-cloudwatchlogsdestinationdetails-loggroup)
       */
      override fun logGroup(): String = unwrap(this).getLogGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsDestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty):
          CloudWatchLogsDestinationDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogsDestinationDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsDestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty
    }
  }

  /**
   * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose
   * destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * DestinationDetailsProperty destinationDetailsProperty = DestinationDetailsProperty.builder()
   * .cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty.builder()
   * .logGroup("logGroup")
   * .build())
   * .kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty.builder()
   * .deliveryStream("deliveryStream")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-destinationdetails.html)
   */
  public interface DestinationDetailsProperty {
    /**
     * The configuration details of the CloudWatch Logs destination.
     *
     * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
     * destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-destinationdetails.html#cfn-elasticache-replicationgroup-destinationdetails-cloudwatchlogsdetails)
     */
    public fun cloudWatchLogsDetails(): Any? = unwrap(this).getCloudWatchLogsDetails()

    /**
     * The configuration details of the Kinesis Data Firehose destination.
     *
     * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
     * the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-destinationdetails.html#cfn-elasticache-replicationgroup-destinationdetails-kinesisfirehosedetails)
     */
    public fun kinesisFirehoseDetails(): Any? = unwrap(this).getKinesisFirehoseDetails()

    /**
     * A builder for [DestinationDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      public fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable)

      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      public
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty)

      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c0fab66a7b11abd79b203e0c3dcd007cb3c43e229073b97666d0f57dd609f1a")
      public
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit)

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      public fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable)

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      public
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty)

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e9071715f9eb9442b214016e6a2cd9f3d2d209b1f152746058d8f7ab17ec8a4")
      public
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty.builder()

      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      override fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      override
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails.let(CloudWatchLogsDestinationDetailsProperty.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c0fab66a7b11abd79b203e0c3dcd007cb3c43e229073b97666d0f57dd609f1a")
      override
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty(cloudWatchLogsDetails))

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      override fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      override
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails.let(KinesisFirehoseDestinationDetailsProperty.Companion::unwrap))
      }

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e9071715f9eb9442b214016e6a2cd9f3d2d209b1f152746058d8f7ab17ec8a4")
      override
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit):
          Unit =
          kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty(kinesisFirehoseDetails))

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty,
    ) : CdkObject(cdkObject),
        DestinationDetailsProperty {
      /**
       * The configuration details of the CloudWatch Logs destination.
       *
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-destinationdetails.html#cfn-elasticache-replicationgroup-destinationdetails-cloudwatchlogsdetails)
       */
      override fun cloudWatchLogsDetails(): Any? = unwrap(this).getCloudWatchLogsDetails()

      /**
       * The configuration details of the Kinesis Data Firehose destination.
       *
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-destinationdetails.html#cfn-elasticache-replicationgroup-destinationdetails-kinesisfirehosedetails)
       */
      override fun kinesisFirehoseDetails(): Any? = unwrap(this).getKinesisFirehoseDetails()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty):
          DestinationDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty
    }
  }

  /**
   * The configuration details of the Kinesis Data Firehose destination.
   *
   * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as the
   * destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * KinesisFirehoseDestinationDetailsProperty kinesisFirehoseDestinationDetailsProperty =
   * KinesisFirehoseDestinationDetailsProperty.builder()
   * .deliveryStream("deliveryStream")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-kinesisfirehosedestinationdetails.html)
   */
  public interface KinesisFirehoseDestinationDetailsProperty {
    /**
     * The name of the Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-kinesisfirehosedestinationdetails.html#cfn-elasticache-replicationgroup-kinesisfirehosedestinationdetails-deliverystream)
     */
    public fun deliveryStream(): String

    /**
     * A builder for [KinesisFirehoseDestinationDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStream The name of the Kinesis Data Firehose delivery stream. 
       */
      public fun deliveryStream(deliveryStream: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.builder()

      /**
       * @param deliveryStream The name of the Kinesis Data Firehose delivery stream. 
       */
      override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty,
    ) : CdkObject(cdkObject),
        KinesisFirehoseDestinationDetailsProperty {
      /**
       * The name of the Kinesis Data Firehose delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-kinesisfirehosedestinationdetails.html#cfn-elasticache-replicationgroup-kinesisfirehosedestinationdetails-deliverystream)
       */
      override fun deliveryStream(): String = unwrap(this).getDeliveryStream()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisFirehoseDestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty):
          KinesisFirehoseDestinationDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisFirehoseDestinationDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseDestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty
    }
  }

  /**
   * Specifies the destination, format and type of the logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * LogDeliveryConfigurationRequestProperty logDeliveryConfigurationRequestProperty =
   * LogDeliveryConfigurationRequestProperty.builder()
   * .destinationDetails(DestinationDetailsProperty.builder()
   * .cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty.builder()
   * .logGroup("logGroup")
   * .build())
   * .kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty.builder()
   * .deliveryStream("deliveryStream")
   * .build())
   * .build())
   * .destinationType("destinationType")
   * .logFormat("logFormat")
   * .logType("logType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-logdeliveryconfigurationrequest.html)
   */
  public interface LogDeliveryConfigurationRequestProperty {
    /**
     * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose
     * destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-logdeliveryconfigurationrequest.html#cfn-elasticache-replicationgroup-logdeliveryconfigurationrequest-destinationdetails)
     */
    public fun destinationDetails(): Any

    /**
     * Specify either CloudWatch Logs or Kinesis Data Firehose as the destination type.
     *
     * Valid values are either `cloudwatch-logs` or `kinesis-firehose` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-logdeliveryconfigurationrequest.html#cfn-elasticache-replicationgroup-logdeliveryconfigurationrequest-destinationtype)
     */
    public fun destinationType(): String

    /**
     * Valid values are either `json` or `text` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-logdeliveryconfigurationrequest.html#cfn-elasticache-replicationgroup-logdeliveryconfigurationrequest-logformat)
     */
    public fun logFormat(): String

    /**
     * Valid value is either `slow-log` , which refers to
     * [slow-log](https://docs.aws.amazon.com/https://redis.io/commands/slowlog) or `engine-log` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-logdeliveryconfigurationrequest.html#cfn-elasticache-replicationgroup-logdeliveryconfigurationrequest-logtype)
     */
    public fun logType(): String

    /**
     * A builder for [LogDeliveryConfigurationRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      public fun destinationDetails(destinationDetails: IResolvable)

      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      public fun destinationDetails(destinationDetails: DestinationDetailsProperty)

      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac403f668fc7e8e4373285dfb7c3f76cce364b31c49c3319d1b6d16e9fce7414")
      public
          fun destinationDetails(destinationDetails: DestinationDetailsProperty.Builder.() -> Unit)

      /**
       * @param destinationType Specify either CloudWatch Logs or Kinesis Data Firehose as the
       * destination type. 
       * Valid values are either `cloudwatch-logs` or `kinesis-firehose` .
       */
      public fun destinationType(destinationType: String)

      /**
       * @param logFormat Valid values are either `json` or `text` . 
       */
      public fun logFormat(logFormat: String)

      /**
       * @param logType Valid value is either `slow-log` , which refers to
       * [slow-log](https://docs.aws.amazon.com/https://redis.io/commands/slowlog) or `engine-log` . 
       */
      public fun logType(logType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.builder()

      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      override fun destinationDetails(destinationDetails: IResolvable) {
        cdkBuilder.destinationDetails(destinationDetails.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      override fun destinationDetails(destinationDetails: DestinationDetailsProperty) {
        cdkBuilder.destinationDetails(destinationDetails.let(DestinationDetailsProperty.Companion::unwrap))
      }

      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac403f668fc7e8e4373285dfb7c3f76cce364b31c49c3319d1b6d16e9fce7414")
      override
          fun destinationDetails(destinationDetails: DestinationDetailsProperty.Builder.() -> Unit):
          Unit = destinationDetails(DestinationDetailsProperty(destinationDetails))

      /**
       * @param destinationType Specify either CloudWatch Logs or Kinesis Data Firehose as the
       * destination type. 
       * Valid values are either `cloudwatch-logs` or `kinesis-firehose` .
       */
      override fun destinationType(destinationType: String) {
        cdkBuilder.destinationType(destinationType)
      }

      /**
       * @param logFormat Valid values are either `json` or `text` . 
       */
      override fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
      }

      /**
       * @param logType Valid value is either `slow-log` , which refers to
       * [slow-log](https://docs.aws.amazon.com/https://redis.io/commands/slowlog) or `engine-log` . 
       */
      override fun logType(logType: String) {
        cdkBuilder.logType(logType)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty,
    ) : CdkObject(cdkObject),
        LogDeliveryConfigurationRequestProperty {
      /**
       * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose
       * destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-logdeliveryconfigurationrequest.html#cfn-elasticache-replicationgroup-logdeliveryconfigurationrequest-destinationdetails)
       */
      override fun destinationDetails(): Any = unwrap(this).getDestinationDetails()

      /**
       * Specify either CloudWatch Logs or Kinesis Data Firehose as the destination type.
       *
       * Valid values are either `cloudwatch-logs` or `kinesis-firehose` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-logdeliveryconfigurationrequest.html#cfn-elasticache-replicationgroup-logdeliveryconfigurationrequest-destinationtype)
       */
      override fun destinationType(): String = unwrap(this).getDestinationType()

      /**
       * Valid values are either `json` or `text` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-logdeliveryconfigurationrequest.html#cfn-elasticache-replicationgroup-logdeliveryconfigurationrequest-logformat)
       */
      override fun logFormat(): String = unwrap(this).getLogFormat()

      /**
       * Valid value is either `slow-log` , which refers to
       * [slow-log](https://docs.aws.amazon.com/https://redis.io/commands/slowlog) or `engine-log` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-logdeliveryconfigurationrequest.html#cfn-elasticache-replicationgroup-logdeliveryconfigurationrequest-logtype)
       */
      override fun logType(): String = unwrap(this).getLogType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LogDeliveryConfigurationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty):
          LogDeliveryConfigurationRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LogDeliveryConfigurationRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDeliveryConfigurationRequestProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty
    }
  }

  /**
   * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
   * that configures an Amazon ElastiCache (ElastiCache) Valkey or Redis OSS cluster node group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * NodeGroupConfigurationProperty nodeGroupConfigurationProperty =
   * NodeGroupConfigurationProperty.builder()
   * .nodeGroupId("nodeGroupId")
   * .primaryAvailabilityZone("primaryAvailabilityZone")
   * .replicaAvailabilityZones(List.of("replicaAvailabilityZones"))
   * .replicaCount(123)
   * .slots("slots")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html)
   */
  public interface NodeGroupConfigurationProperty {
    /**
     * Either the ElastiCache supplied 4-digit id or a user supplied id for the node group these
     * configuration values apply to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-nodegroupid)
     */
    public fun nodeGroupId(): String? = unwrap(this).getNodeGroupId()

    /**
     * The Availability Zone where the primary node of this node group (shard) is launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone)
     */
    public fun primaryAvailabilityZone(): String? = unwrap(this).getPrimaryAvailabilityZone()

    /**
     * A list of Availability Zones to be used for the read replicas.
     *
     * The number of Availability Zones in this list must match the value of `ReplicaCount` or
     * `ReplicasPerNodeGroup` if not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones)
     */
    public fun replicaAvailabilityZones(): List<String> = unwrap(this).getReplicaAvailabilityZones()
        ?: emptyList()

    /**
     * The number of read replica nodes in this node group (shard).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicacount)
     */
    public fun replicaCount(): Number? = unwrap(this).getReplicaCount()

    /**
     * A string of comma-separated values where the first set of values are the slot numbers (zero
     * based), and the second set of values are the keyspaces for each slot.
     *
     * The following example specifies three slots (numbered 0, 1, and 2):
     * `0,1,2,0-4999,5000-9999,10000-16,383` .
     *
     * If you don't specify a value, ElastiCache allocates keys equally among each slot.
     *
     * When you use an `UseOnlineResharding` update policy to update the number of node groups
     * without interruption, ElastiCache evenly distributes the keyspaces between the specified number
     * of slots. This cannot be updated later. Therefore, after updating the number of node groups in
     * this way, you should remove the value specified for the `Slots` property of each
     * `NodeGroupConfiguration` from the stack template, as it no longer reflects the actual values in
     * each node group. For more information, see [UseOnlineResharding
     * Policy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-slots)
     */
    public fun slots(): String? = unwrap(this).getSlots()

    /**
     * A builder for [NodeGroupConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nodeGroupId Either the ElastiCache supplied 4-digit id or a user supplied id for the
       * node group these configuration values apply to.
       */
      public fun nodeGroupId(nodeGroupId: String)

      /**
       * @param primaryAvailabilityZone The Availability Zone where the primary node of this node
       * group (shard) is launched.
       */
      public fun primaryAvailabilityZone(primaryAvailabilityZone: String)

      /**
       * @param replicaAvailabilityZones A list of Availability Zones to be used for the read
       * replicas.
       * The number of Availability Zones in this list must match the value of `ReplicaCount` or
       * `ReplicasPerNodeGroup` if not specified.
       */
      public fun replicaAvailabilityZones(replicaAvailabilityZones: List<String>)

      /**
       * @param replicaAvailabilityZones A list of Availability Zones to be used for the read
       * replicas.
       * The number of Availability Zones in this list must match the value of `ReplicaCount` or
       * `ReplicasPerNodeGroup` if not specified.
       */
      public fun replicaAvailabilityZones(vararg replicaAvailabilityZones: String)

      /**
       * @param replicaCount The number of read replica nodes in this node group (shard).
       */
      public fun replicaCount(replicaCount: Number)

      /**
       * @param slots A string of comma-separated values where the first set of values are the slot
       * numbers (zero based), and the second set of values are the keyspaces for each slot.
       * The following example specifies three slots (numbered 0, 1, and 2):
       * `0,1,2,0-4999,5000-9999,10000-16,383` .
       *
       * If you don't specify a value, ElastiCache allocates keys equally among each slot.
       *
       * When you use an `UseOnlineResharding` update policy to update the number of node groups
       * without interruption, ElastiCache evenly distributes the keyspaces between the specified
       * number of slots. This cannot be updated later. Therefore, after updating the number of node
       * groups in this way, you should remove the value specified for the `Slots` property of each
       * `NodeGroupConfiguration` from the stack template, as it no longer reflects the actual values
       * in each node group. For more information, see [UseOnlineResharding
       * Policy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
       * .
       */
      public fun slots(slots: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.builder()

      /**
       * @param nodeGroupId Either the ElastiCache supplied 4-digit id or a user supplied id for the
       * node group these configuration values apply to.
       */
      override fun nodeGroupId(nodeGroupId: String) {
        cdkBuilder.nodeGroupId(nodeGroupId)
      }

      /**
       * @param primaryAvailabilityZone The Availability Zone where the primary node of this node
       * group (shard) is launched.
       */
      override fun primaryAvailabilityZone(primaryAvailabilityZone: String) {
        cdkBuilder.primaryAvailabilityZone(primaryAvailabilityZone)
      }

      /**
       * @param replicaAvailabilityZones A list of Availability Zones to be used for the read
       * replicas.
       * The number of Availability Zones in this list must match the value of `ReplicaCount` or
       * `ReplicasPerNodeGroup` if not specified.
       */
      override fun replicaAvailabilityZones(replicaAvailabilityZones: List<String>) {
        cdkBuilder.replicaAvailabilityZones(replicaAvailabilityZones)
      }

      /**
       * @param replicaAvailabilityZones A list of Availability Zones to be used for the read
       * replicas.
       * The number of Availability Zones in this list must match the value of `ReplicaCount` or
       * `ReplicasPerNodeGroup` if not specified.
       */
      override fun replicaAvailabilityZones(vararg replicaAvailabilityZones: String): Unit =
          replicaAvailabilityZones(replicaAvailabilityZones.toList())

      /**
       * @param replicaCount The number of read replica nodes in this node group (shard).
       */
      override fun replicaCount(replicaCount: Number) {
        cdkBuilder.replicaCount(replicaCount)
      }

      /**
       * @param slots A string of comma-separated values where the first set of values are the slot
       * numbers (zero based), and the second set of values are the keyspaces for each slot.
       * The following example specifies three slots (numbered 0, 1, and 2):
       * `0,1,2,0-4999,5000-9999,10000-16,383` .
       *
       * If you don't specify a value, ElastiCache allocates keys equally among each slot.
       *
       * When you use an `UseOnlineResharding` update policy to update the number of node groups
       * without interruption, ElastiCache evenly distributes the keyspaces between the specified
       * number of slots. This cannot be updated later. Therefore, after updating the number of node
       * groups in this way, you should remove the value specified for the `Slots` property of each
       * `NodeGroupConfiguration` from the stack template, as it no longer reflects the actual values
       * in each node group. For more information, see [UseOnlineResharding
       * Policy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
       * .
       */
      override fun slots(slots: String) {
        cdkBuilder.slots(slots)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty,
    ) : CdkObject(cdkObject),
        NodeGroupConfigurationProperty {
      /**
       * Either the ElastiCache supplied 4-digit id or a user supplied id for the node group these
       * configuration values apply to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-nodegroupid)
       */
      override fun nodeGroupId(): String? = unwrap(this).getNodeGroupId()

      /**
       * The Availability Zone where the primary node of this node group (shard) is launched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone)
       */
      override fun primaryAvailabilityZone(): String? = unwrap(this).getPrimaryAvailabilityZone()

      /**
       * A list of Availability Zones to be used for the read replicas.
       *
       * The number of Availability Zones in this list must match the value of `ReplicaCount` or
       * `ReplicasPerNodeGroup` if not specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones)
       */
      override fun replicaAvailabilityZones(): List<String> =
          unwrap(this).getReplicaAvailabilityZones() ?: emptyList()

      /**
       * The number of read replica nodes in this node group (shard).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicacount)
       */
      override fun replicaCount(): Number? = unwrap(this).getReplicaCount()

      /**
       * A string of comma-separated values where the first set of values are the slot numbers (zero
       * based), and the second set of values are the keyspaces for each slot.
       *
       * The following example specifies three slots (numbered 0, 1, and 2):
       * `0,1,2,0-4999,5000-9999,10000-16,383` .
       *
       * If you don't specify a value, ElastiCache allocates keys equally among each slot.
       *
       * When you use an `UseOnlineResharding` update policy to update the number of node groups
       * without interruption, ElastiCache evenly distributes the keyspaces between the specified
       * number of slots. This cannot be updated later. Therefore, after updating the number of node
       * groups in this way, you should remove the value specified for the `Slots` property of each
       * `NodeGroupConfiguration` from the stack template, as it no longer reflects the actual values
       * in each node group. For more information, see [UseOnlineResharding
       * Policy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-slots)
       */
      override fun slots(): String? = unwrap(this).getSlots()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodeGroupConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty):
          NodeGroupConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NodeGroupConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeGroupConfigurationProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty
    }
  }
}
