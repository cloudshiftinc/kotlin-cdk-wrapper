@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

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

/**
 * Properties for defining a `CfnCacheCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnCacheClusterProps cfnCacheClusterProps = CfnCacheClusterProps.builder()
 * .cacheNodeType("cacheNodeType")
 * .engine("engine")
 * .numCacheNodes(123)
 * // the properties below are optional
 * .autoMinorVersionUpgrade(false)
 * .azMode("azMode")
 * .cacheParameterGroupName("cacheParameterGroupName")
 * .cacheSecurityGroupNames(List.of("cacheSecurityGroupNames"))
 * .cacheSubnetGroupName("cacheSubnetGroupName")
 * .clusterName("clusterName")
 * .engineVersion("engineVersion")
 * .ipDiscovery("ipDiscovery")
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
 * .networkType("networkType")
 * .notificationTopicArn("notificationTopicArn")
 * .port(123)
 * .preferredAvailabilityZone("preferredAvailabilityZone")
 * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .snapshotArns(List.of("snapshotArns"))
 * .snapshotName("snapshotName")
 * .snapshotRetentionLimit(123)
 * .snapshotWindow("snapshotWindow")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .transitEncryptionEnabled(false)
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html)
 */
public interface CfnCacheClusterProps {
  /**
   * If you are running Redis OSS engine version 6.0 or later, set this parameter to yes if you want
   * to opt-in to the next minor version upgrade campaign. This parameter is disabled for previous
   * versions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-autominorversionupgrade)
   */
  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone
   * or created across multiple Availability Zones in the cluster's region.
   *
   * This parameter is only supported for Memcached clusters.
   *
   * If the `AZMode` and `PreferredAvailabilityZones` are not specified, ElastiCache assumes
   * `single-az` mode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-azmode)
   */
  public fun azMode(): String? = unwrap(this).getAzMode()

  /**
   * The compute and memory capacity of the nodes in the node group (shard).
   *
   * The following node types are supported by ElastiCache. Generally speaking, the current
   * generation types provide more memory and computational power at lower cost when compared to their
   * equivalent previous generation counterparts. Changing the CacheNodeType of a Memcached instance is
   * currently not supported. If you need to scale using Memcached, we recommend forcing a replacement
   * update by changing the `LogicalResourceId` of the resource.
   *
   * * General purpose:
   * * Current generation:
   *
   * *M6g node types:* `cache.m6g.large` , `cache.m6g.xlarge` , `cache.m6g.2xlarge` ,
   * `cache.m6g.4xlarge` , `cache.m6g.8xlarge` , `cache.m6g.12xlarge` , `cache.m6g.16xlarge` ,
   * `cache.m6g.24xlarge`
   *
   * *M5 node types:* `cache.m5.large` , `cache.m5.xlarge` , `cache.m5.2xlarge` , `cache.m5.4xlarge`
   * , `cache.m5.12xlarge` , `cache.m5.24xlarge`
   *
   * *M4 node types:* `cache.m4.large` , `cache.m4.xlarge` , `cache.m4.2xlarge` , `cache.m4.4xlarge`
   * , `cache.m4.10xlarge`
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
   * *M3 node types:* `cache.m3.medium` , `cache.m3.large` , `cache.m3.xlarge` , `cache.m3.2xlarge`
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
   * `cache.r6g.4xlarge` , `cache.r6g.8xlarge` , `cache.r6g.12xlarge` , `cache.r6g.16xlarge` ,
   * `cache.r6g.24xlarge`
   *
   * *R5 node types:* `cache.r5.large` , `cache.r5.xlarge` , `cache.r5.2xlarge` , `cache.r5.4xlarge`
   * , `cache.r5.12xlarge` , `cache.r5.24xlarge`
   *
   * *R4 node types:* `cache.r4.large` , `cache.r4.xlarge` , `cache.r4.2xlarge` , `cache.r4.4xlarge`
   * , `cache.r4.8xlarge` , `cache.r4.16xlarge`
   *
   * * Previous generation: (not recommended)
   *
   * *M2 node types:* `cache.m2.xlarge` , `cache.m2.2xlarge` , `cache.m2.4xlarge`
   *
   * *R3 node types:* `cache.r3.large` , `cache.r3.xlarge` , `cache.r3.2xlarge` , `cache.r3.4xlarge`
   * , `cache.r3.8xlarge`
   *
   * For region availability, see [Supported Node Types by
   * Region](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion)
   *
   * *Additional node type info*
   *
   * * All current generation instance types are created in Amazon VPC by default.
   * * Redis OSS append-only files (AOF) are not supported for T1 or T2 instances.
   * * Redis OSS Multi-AZ with automatic failover is not supported on T1 instances.
   * * Redis OSS configuration variables `appendonly` and `appendfsync` are not supported on Redis
   * OSS version 2.8.22 and later.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachenodetype)
   */
  public fun cacheNodeType(): String

  /**
   * The name of the parameter group to associate with this cluster.
   *
   * If this argument is omitted, the default parameter group for the specified engine is used. You
   * cannot use any parameter group which has `cluster-enabled='yes'` when creating a cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cacheparametergroupname)
   */
  public fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

  /**
   * A list of security group names to associate with this cluster.
   *
   * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private
   * Cloud (Amazon VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames)
   */
  public fun cacheSecurityGroupNames(): List<String> = unwrap(this).getCacheSecurityGroupNames() ?:
      emptyList()

  /**
   * The name of the subnet group to be used for the cluster.
   *
   * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
   * (Amazon VPC).
   *
   *
   * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group
   * before you start creating a cluster. For more information, see
   * `[AWS::ElastiCache::SubnetGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
   * .`
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname)
   */
  public fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

  /**
   * A name for the cache cluster.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the cache cluster. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   * The name must contain 1 to 50 alphanumeric characters or hyphens. The name must start with a
   * letter and cannot end with a hyphen or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-clustername)
   */
  public fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * The name of the cache engine to be used for this cluster.
   *
   * Valid values for this parameter are: `memcached` | `redis`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-engine)
   */
  public fun engine(): String

  /**
   * The version number of the cache engine to be used for this cluster.
   *
   * To view the supported cache engine versions, use the DescribeCacheEngineVersions operation.
   *
   * *Important:* You can upgrade to a newer engine version (see [Selecting a Cache Engine and
   * Version](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement)
   * ), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine
   * version, you must delete the existing cluster or replication group and create it anew with the
   * earlier engine version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The network type you choose when modifying a cluster, either `ipv4` | `ipv6` .
   *
   * IPv6 is supported for workloads using Redis OSS engine version 6.2 onward or Memcached engine
   * version 1.6.6 on all instances built on the [Nitro system](https://docs.aws.amazon.com/ec2/nitro/)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-ipdiscovery)
   */
  public fun ipDiscovery(): String? = unwrap(this).getIpDiscovery()

  /**
   * Specifies the destination, format and type of the logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-logdeliveryconfigurations)
   */
  public fun logDeliveryConfigurations(): Any? = unwrap(this).getLogDeliveryConfigurations()

  /**
   * Must be either `ipv4` | `ipv6` | `dual_stack` .
   *
   * IPv6 is supported for workloads using Redis OSS engine version 6.2 onward or Memcached engine
   * version 1.6.6 on all instances built on the [Nitro system](https://docs.aws.amazon.com/ec2/nitro/)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-networktype)
   */
  public fun networkType(): String? = unwrap(this).getNetworkType()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
   * notifications are sent.
   *
   *
   * The Amazon SNS topic owner must be the same as the cluster owner.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-notificationtopicarn)
   */
  public fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

  /**
   * The number of cache nodes that the cache cluster should have.
   *
   *
   * However, if the `PreferredAvailabilityZone` and `PreferredAvailabilityZones` properties were
   * not previously specified and you don't specify any new values, an update requires
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-numcachenodes)
   */
  public fun numCacheNodes(): Number

  /**
   * The port number on which each of the cache nodes accepts connections.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The EC2 Availability Zone in which the cluster is created.
   *
   * All nodes belonging to this cluster are placed in the preferred Availability Zone. If you want
   * to create your nodes across multiple Availability Zones, use `PreferredAvailabilityZones` .
   *
   * Default: System chosen Availability Zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone)
   */
  public fun preferredAvailabilityZone(): String? = unwrap(this).getPreferredAvailabilityZone()

  /**
   * A list of the Availability Zones in which cache nodes are created.
   *
   * The order of the zones in the list is not important.
   *
   * This option is only supported on Memcached.
   *
   *
   * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in
   * Availability Zones that are associated with the subnets in the selected subnet group.
   *
   * The number of Availability Zones listed must equal the value of `NumCacheNodes` .
   *
   *
   * If you want all the nodes in the same Availability Zone, use `PreferredAvailabilityZone`
   * instead, or repeat the Availability Zone multiple times in the list.
   *
   * Default: System chosen Availability Zones.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones)
   */
  public fun preferredAvailabilityZones(): List<String> =
      unwrap(this).getPreferredAvailabilityZones() ?: emptyList()

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies
   * a Redis OSS RDB snapshot file stored in Amazon S3.
   *
   * The snapshot file is used to populate the node group (shard). The Amazon S3 object name in the
   * ARN cannot contain any commas.
   *
   *
   * This parameter is only valid if the `Engine` parameter is `redis` .
   *
   *
   * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotarns)
   */
  public fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

  /**
   * The name of a Redis OSS snapshot from which to restore data into the new node group (shard).
   *
   * The snapshot status changes to `restoring` while the new node group (shard) is being created.
   *
   *
   * This parameter is only valid if the `Engine` parameter is `redis` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotname)
   */
  public fun snapshotName(): String? = unwrap(this).getSnapshotName()

  /**
   * The number of days for which ElastiCache retains automatic snapshots before deleting them.
   *
   * For example, if you set `SnapshotRetentionLimit` to 5, a snapshot taken today is retained for 5
   * days before being deleted.
   *
   *
   * This parameter is only valid if the `Engine` parameter is `redis` .
   *
   *
   * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit)
   */
  public fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  /**
   * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
   * node group (shard).
   *
   * Example: `05:00-09:00`
   *
   * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time
   * range.
   *
   *
   * This parameter is only valid if the `Engine` parameter is `redis` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotwindow)
   */
  public fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

  /**
   * A list of tags to be added to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A flag that enables in-transit encryption when set to true.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-transitencryptionenabled)
   */
  public fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

  /**
   * One or more VPC security groups associated with the cluster.
   *
   * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
   * (Amazon VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A builder for [CfnCacheClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoMinorVersionUpgrade If you are running Redis OSS engine version 6.0 or later, set
     * this parameter to yes if you want to opt-in to the next minor version upgrade campaign. This
     * parameter is disabled for previous versions.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param autoMinorVersionUpgrade If you are running Redis OSS engine version 6.0 or later, set
     * this parameter to yes if you want to opt-in to the next minor version upgrade campaign. This
     * parameter is disabled for previous versions.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * @param azMode Specifies whether the nodes in this Memcached cluster are created in a single
     * Availability Zone or created across multiple Availability Zones in the cluster's region.
     * This parameter is only supported for Memcached clusters.
     *
     * If the `AZMode` and `PreferredAvailabilityZones` are not specified, ElastiCache assumes
     * `single-az` mode.
     */
    public fun azMode(azMode: String)

    /**
     * @param cacheNodeType The compute and memory capacity of the nodes in the node group (shard). 
     * The following node types are supported by ElastiCache. Generally speaking, the current
     * generation types provide more memory and computational power at lower cost when compared to
     * their equivalent previous generation counterparts. Changing the CacheNodeType of a Memcached
     * instance is currently not supported. If you need to scale using Memcached, we recommend forcing
     * a replacement update by changing the `LogicalResourceId` of the resource.
     *
     * * General purpose:
     * * Current generation:
     *
     * *M6g node types:* `cache.m6g.large` , `cache.m6g.xlarge` , `cache.m6g.2xlarge` ,
     * `cache.m6g.4xlarge` , `cache.m6g.8xlarge` , `cache.m6g.12xlarge` , `cache.m6g.16xlarge` ,
     * `cache.m6g.24xlarge`
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
     * `cache.r6g.4xlarge` , `cache.r6g.8xlarge` , `cache.r6g.12xlarge` , `cache.r6g.16xlarge` ,
     * `cache.r6g.24xlarge`
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
     * For region availability, see [Supported Node Types by
     * Region](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion)
     *
     * *Additional node type info*
     *
     * * All current generation instance types are created in Amazon VPC by default.
     * * Redis OSS append-only files (AOF) are not supported for T1 or T2 instances.
     * * Redis OSS Multi-AZ with automatic failover is not supported on T1 instances.
     * * Redis OSS configuration variables `appendonly` and `appendfsync` are not supported on Redis
     * OSS version 2.8.22 and later.
     */
    public fun cacheNodeType(cacheNodeType: String)

    /**
     * @param cacheParameterGroupName The name of the parameter group to associate with this
     * cluster.
     * If this argument is omitted, the default parameter group for the specified engine is used.
     * You cannot use any parameter group which has `cluster-enabled='yes'` when creating a cluster.
     */
    public fun cacheParameterGroupName(cacheParameterGroupName: String)

    /**
     * @param cacheSecurityGroupNames A list of security group names to associate with this cluster.
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private
     * Cloud (Amazon VPC).
     */
    public fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>)

    /**
     * @param cacheSecurityGroupNames A list of security group names to associate with this cluster.
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private
     * Cloud (Amazon VPC).
     */
    public fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String)

    /**
     * @param cacheSubnetGroupName The name of the subnet group to be used for the cluster.
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     *
     *
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group
     * before you start creating a cluster. For more information, see
     * `[AWS::ElastiCache::SubnetGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
     * .`
     */
    public fun cacheSubnetGroupName(cacheSubnetGroupName: String)

    /**
     * @param clusterName A name for the cache cluster.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the cache cluster. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * The name must contain 1 to 50 alphanumeric characters or hyphens. The name must start with a
     * letter and cannot end with a hyphen or contain two consecutive hyphens.
     */
    public fun clusterName(clusterName: String)

    /**
     * @param engine The name of the cache engine to be used for this cluster. 
     * Valid values for this parameter are: `memcached` | `redis`
     */
    public fun engine(engine: String)

    /**
     * @param engineVersion The version number of the cache engine to be used for this cluster.
     * To view the supported cache engine versions, use the DescribeCacheEngineVersions operation.
     *
     * *Important:* You can upgrade to a newer engine version (see [Selecting a Cache Engine and
     * Version](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement)
     * ), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine
     * version, you must delete the existing cluster or replication group and create it anew with the
     * earlier engine version.
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param ipDiscovery The network type you choose when modifying a cluster, either `ipv4` |
     * `ipv6` .
     * IPv6 is supported for workloads using Redis OSS engine version 6.2 onward or Memcached engine
     * version 1.6.6 on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     */
    public fun ipDiscovery(ipDiscovery: String)

    /**
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs.
     */
    public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable)

    /**
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs.
     */
    public fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>)

    /**
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs.
     */
    public fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any)

    /**
     * @param networkType Must be either `ipv4` | `ipv6` | `dual_stack` .
     * IPv6 is supported for workloads using Redis OSS engine version 6.2 onward or Memcached engine
     * version 1.6.6 on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     */
    public fun networkType(networkType: String)

    /**
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications are sent.
     *
     * The Amazon SNS topic owner must be the same as the cluster owner.
     */
    public fun notificationTopicArn(notificationTopicArn: String)

    /**
     * @param numCacheNodes The number of cache nodes that the cache cluster should have. 
     *
     * However, if the `PreferredAvailabilityZone` and `PreferredAvailabilityZones` properties were
     * not previously specified and you don't specify any new values, an update requires
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     */
    public fun numCacheNodes(numCacheNodes: Number)

    /**
     * @param port The port number on which each of the cache nodes accepts connections.
     */
    public fun port(port: Number)

    /**
     * @param preferredAvailabilityZone The EC2 Availability Zone in which the cluster is created.
     * All nodes belonging to this cluster are placed in the preferred Availability Zone. If you
     * want to create your nodes across multiple Availability Zones, use `PreferredAvailabilityZones` .
     *
     * Default: System chosen Availability Zone.
     */
    public fun preferredAvailabilityZone(preferredAvailabilityZone: String)

    /**
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes are
     * created.
     * The order of the zones in the list is not important.
     *
     * This option is only supported on Memcached.
     *
     *
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheNodes` .
     *
     *
     * If you want all the nodes in the same Availability Zone, use `PreferredAvailabilityZone`
     * instead, or repeat the Availability Zone multiple times in the list.
     *
     * Default: System chosen Availability Zones.
     */
    public fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>)

    /**
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes are
     * created.
     * The order of the zones in the list is not important.
     *
     * This option is only supported on Memcached.
     *
     *
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheNodes` .
     *
     *
     * If you want all the nodes in the same Availability Zone, use `PreferredAvailabilityZone`
     * instead, or repeat the Availability Zone multiple times in the list.
     *
     * Default: System chosen Availability Zones.
     */
    public fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String)

    /**
     * @param preferredMaintenanceWindow Specifies the weekly time range during which maintenance on
     * the cluster is performed.
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
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis OSS RDB snapshot file stored in Amazon S3.
     * The snapshot file is used to populate the node group (shard). The Amazon S3 object name in
     * the ARN cannot contain any commas.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     */
    public fun snapshotArns(snapshotArns: List<String>)

    /**
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis OSS RDB snapshot file stored in Amazon S3.
     * The snapshot file is used to populate the node group (shard). The Amazon S3 object name in
     * the ARN cannot contain any commas.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     */
    public fun snapshotArns(vararg snapshotArns: String)

    /**
     * @param snapshotName The name of a Redis OSS snapshot from which to restore data into the new
     * node group (shard).
     * The snapshot status changes to `restoring` while the new node group (shard) is being created.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     */
    public fun snapshotName(snapshotName: String)

    /**
     * @param snapshotRetentionLimit The number of days for which ElastiCache retains automatic
     * snapshots before deleting them.
     * For example, if you set `SnapshotRetentionLimit` to 5, a snapshot taken today is retained for
     * 5 days before being deleted.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     */
    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    /**
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your node group (shard).
     * Example: `05:00-09:00`
     *
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time
     * range.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     */
    public fun snapshotWindow(snapshotWindow: String)

    /**
     * @param tags A list of tags to be added to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to be added to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to true.
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean)

    /**
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to true.
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable)

    /**
     * @param vpcSecurityGroupIds One or more VPC security groups associated with the cluster.
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds One or more VPC security groups associated with the cluster.
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder
        = software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.builder()

    /**
     * @param autoMinorVersionUpgrade If you are running Redis OSS engine version 6.0 or later, set
     * this parameter to yes if you want to opt-in to the next minor version upgrade campaign. This
     * parameter is disabled for previous versions.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade If you are running Redis OSS engine version 6.0 or later, set
     * this parameter to yes if you want to opt-in to the next minor version upgrade campaign. This
     * parameter is disabled for previous versions.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param azMode Specifies whether the nodes in this Memcached cluster are created in a single
     * Availability Zone or created across multiple Availability Zones in the cluster's region.
     * This parameter is only supported for Memcached clusters.
     *
     * If the `AZMode` and `PreferredAvailabilityZones` are not specified, ElastiCache assumes
     * `single-az` mode.
     */
    override fun azMode(azMode: String) {
      cdkBuilder.azMode(azMode)
    }

    /**
     * @param cacheNodeType The compute and memory capacity of the nodes in the node group (shard). 
     * The following node types are supported by ElastiCache. Generally speaking, the current
     * generation types provide more memory and computational power at lower cost when compared to
     * their equivalent previous generation counterparts. Changing the CacheNodeType of a Memcached
     * instance is currently not supported. If you need to scale using Memcached, we recommend forcing
     * a replacement update by changing the `LogicalResourceId` of the resource.
     *
     * * General purpose:
     * * Current generation:
     *
     * *M6g node types:* `cache.m6g.large` , `cache.m6g.xlarge` , `cache.m6g.2xlarge` ,
     * `cache.m6g.4xlarge` , `cache.m6g.8xlarge` , `cache.m6g.12xlarge` , `cache.m6g.16xlarge` ,
     * `cache.m6g.24xlarge`
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
     * `cache.r6g.4xlarge` , `cache.r6g.8xlarge` , `cache.r6g.12xlarge` , `cache.r6g.16xlarge` ,
     * `cache.r6g.24xlarge`
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
     * For region availability, see [Supported Node Types by
     * Region](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion)
     *
     * *Additional node type info*
     *
     * * All current generation instance types are created in Amazon VPC by default.
     * * Redis OSS append-only files (AOF) are not supported for T1 or T2 instances.
     * * Redis OSS Multi-AZ with automatic failover is not supported on T1 instances.
     * * Redis OSS configuration variables `appendonly` and `appendfsync` are not supported on Redis
     * OSS version 2.8.22 and later.
     */
    override fun cacheNodeType(cacheNodeType: String) {
      cdkBuilder.cacheNodeType(cacheNodeType)
    }

    /**
     * @param cacheParameterGroupName The name of the parameter group to associate with this
     * cluster.
     * If this argument is omitted, the default parameter group for the specified engine is used.
     * You cannot use any parameter group which has `cluster-enabled='yes'` when creating a cluster.
     */
    override fun cacheParameterGroupName(cacheParameterGroupName: String) {
      cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
    }

    /**
     * @param cacheSecurityGroupNames A list of security group names to associate with this cluster.
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private
     * Cloud (Amazon VPC).
     */
    override fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>) {
      cdkBuilder.cacheSecurityGroupNames(cacheSecurityGroupNames)
    }

    /**
     * @param cacheSecurityGroupNames A list of security group names to associate with this cluster.
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private
     * Cloud (Amazon VPC).
     */
    override fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String): Unit =
        cacheSecurityGroupNames(cacheSecurityGroupNames.toList())

    /**
     * @param cacheSubnetGroupName The name of the subnet group to be used for the cluster.
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     *
     *
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group
     * before you start creating a cluster. For more information, see
     * `[AWS::ElastiCache::SubnetGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
     * .`
     */
    override fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
      cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
    }

    /**
     * @param clusterName A name for the cache cluster.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the cache cluster. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * The name must contain 1 to 50 alphanumeric characters or hyphens. The name must start with a
     * letter and cannot end with a hyphen or contain two consecutive hyphens.
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param engine The name of the cache engine to be used for this cluster. 
     * Valid values for this parameter are: `memcached` | `redis`
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param engineVersion The version number of the cache engine to be used for this cluster.
     * To view the supported cache engine versions, use the DescribeCacheEngineVersions operation.
     *
     * *Important:* You can upgrade to a newer engine version (see [Selecting a Cache Engine and
     * Version](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement)
     * ), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine
     * version, you must delete the existing cluster or replication group and create it anew with the
     * earlier engine version.
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param ipDiscovery The network type you choose when modifying a cluster, either `ipv4` |
     * `ipv6` .
     * IPv6 is supported for workloads using Redis OSS engine version 6.2 onward or Memcached engine
     * version 1.6.6 on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     */
    override fun ipDiscovery(ipDiscovery: String) {
      cdkBuilder.ipDiscovery(ipDiscovery)
    }

    /**
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs.
     */
    override fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs.
     */
    override fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs.
     */
    override fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any): Unit =
        logDeliveryConfigurations(logDeliveryConfigurations.toList())

    /**
     * @param networkType Must be either `ipv4` | `ipv6` | `dual_stack` .
     * IPv6 is supported for workloads using Redis OSS engine version 6.2 onward or Memcached engine
     * version 1.6.6 on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    /**
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications are sent.
     *
     * The Amazon SNS topic owner must be the same as the cluster owner.
     */
    override fun notificationTopicArn(notificationTopicArn: String) {
      cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    /**
     * @param numCacheNodes The number of cache nodes that the cache cluster should have. 
     *
     * However, if the `PreferredAvailabilityZone` and `PreferredAvailabilityZones` properties were
     * not previously specified and you don't specify any new values, an update requires
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     */
    override fun numCacheNodes(numCacheNodes: Number) {
      cdkBuilder.numCacheNodes(numCacheNodes)
    }

    /**
     * @param port The port number on which each of the cache nodes accepts connections.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param preferredAvailabilityZone The EC2 Availability Zone in which the cluster is created.
     * All nodes belonging to this cluster are placed in the preferred Availability Zone. If you
     * want to create your nodes across multiple Availability Zones, use `PreferredAvailabilityZones` .
     *
     * Default: System chosen Availability Zone.
     */
    override fun preferredAvailabilityZone(preferredAvailabilityZone: String) {
      cdkBuilder.preferredAvailabilityZone(preferredAvailabilityZone)
    }

    /**
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes are
     * created.
     * The order of the zones in the list is not important.
     *
     * This option is only supported on Memcached.
     *
     *
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheNodes` .
     *
     *
     * If you want all the nodes in the same Availability Zone, use `PreferredAvailabilityZone`
     * instead, or repeat the Availability Zone multiple times in the list.
     *
     * Default: System chosen Availability Zones.
     */
    override fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>) {
      cdkBuilder.preferredAvailabilityZones(preferredAvailabilityZones)
    }

    /**
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes are
     * created.
     * The order of the zones in the list is not important.
     *
     * This option is only supported on Memcached.
     *
     *
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheNodes` .
     *
     *
     * If you want all the nodes in the same Availability Zone, use `PreferredAvailabilityZone`
     * instead, or repeat the Availability Zone multiple times in the list.
     *
     * Default: System chosen Availability Zones.
     */
    override fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String): Unit =
        preferredAvailabilityZones(preferredAvailabilityZones.toList())

    /**
     * @param preferredMaintenanceWindow Specifies the weekly time range during which maintenance on
     * the cluster is performed.
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
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis OSS RDB snapshot file stored in Amazon S3.
     * The snapshot file is used to populate the node group (shard). The Amazon S3 object name in
     * the ARN cannot contain any commas.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     */
    override fun snapshotArns(snapshotArns: List<String>) {
      cdkBuilder.snapshotArns(snapshotArns)
    }

    /**
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis OSS RDB snapshot file stored in Amazon S3.
     * The snapshot file is used to populate the node group (shard). The Amazon S3 object name in
     * the ARN cannot contain any commas.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     */
    override fun snapshotArns(vararg snapshotArns: String): Unit =
        snapshotArns(snapshotArns.toList())

    /**
     * @param snapshotName The name of a Redis OSS snapshot from which to restore data into the new
     * node group (shard).
     * The snapshot status changes to `restoring` while the new node group (shard) is being created.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     */
    override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    /**
     * @param snapshotRetentionLimit The number of days for which ElastiCache retains automatic
     * snapshots before deleting them.
     * For example, if you set `SnapshotRetentionLimit` to 5, a snapshot taken today is retained for
     * 5 days before being deleted.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     */
    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
      cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    /**
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your node group (shard).
     * Example: `05:00-09:00`
     *
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time
     * range.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     */
    override fun snapshotWindow(snapshotWindow: String) {
      cdkBuilder.snapshotWindow(snapshotWindow)
    }

    /**
     * @param tags A list of tags to be added to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags to be added to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to true.
     */
    override fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    /**
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to true.
     */
    override fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcSecurityGroupIds One or more VPC security groups associated with the cluster.
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds One or more VPC security groups associated with the cluster.
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnCacheClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheClusterProps,
  ) : CdkObject(cdkObject),
      CfnCacheClusterProps {
    /**
     * If you are running Redis OSS engine version 6.0 or later, set this parameter to yes if you
     * want to opt-in to the next minor version upgrade campaign. This parameter is disabled for
     * previous versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-autominorversionupgrade)
     */
    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * Specifies whether the nodes in this Memcached cluster are created in a single Availability
     * Zone or created across multiple Availability Zones in the cluster's region.
     *
     * This parameter is only supported for Memcached clusters.
     *
     * If the `AZMode` and `PreferredAvailabilityZones` are not specified, ElastiCache assumes
     * `single-az` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-azmode)
     */
    override fun azMode(): String? = unwrap(this).getAzMode()

    /**
     * The compute and memory capacity of the nodes in the node group (shard).
     *
     * The following node types are supported by ElastiCache. Generally speaking, the current
     * generation types provide more memory and computational power at lower cost when compared to
     * their equivalent previous generation counterparts. Changing the CacheNodeType of a Memcached
     * instance is currently not supported. If you need to scale using Memcached, we recommend forcing
     * a replacement update by changing the `LogicalResourceId` of the resource.
     *
     * * General purpose:
     * * Current generation:
     *
     * *M6g node types:* `cache.m6g.large` , `cache.m6g.xlarge` , `cache.m6g.2xlarge` ,
     * `cache.m6g.4xlarge` , `cache.m6g.8xlarge` , `cache.m6g.12xlarge` , `cache.m6g.16xlarge` ,
     * `cache.m6g.24xlarge`
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
     * `cache.r6g.4xlarge` , `cache.r6g.8xlarge` , `cache.r6g.12xlarge` , `cache.r6g.16xlarge` ,
     * `cache.r6g.24xlarge`
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
     * For region availability, see [Supported Node Types by
     * Region](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion)
     *
     * *Additional node type info*
     *
     * * All current generation instance types are created in Amazon VPC by default.
     * * Redis OSS append-only files (AOF) are not supported for T1 or T2 instances.
     * * Redis OSS Multi-AZ with automatic failover is not supported on T1 instances.
     * * Redis OSS configuration variables `appendonly` and `appendfsync` are not supported on Redis
     * OSS version 2.8.22 and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachenodetype)
     */
    override fun cacheNodeType(): String = unwrap(this).getCacheNodeType()

    /**
     * The name of the parameter group to associate with this cluster.
     *
     * If this argument is omitted, the default parameter group for the specified engine is used.
     * You cannot use any parameter group which has `cluster-enabled='yes'` when creating a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cacheparametergroupname)
     */
    override fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

    /**
     * A list of security group names to associate with this cluster.
     *
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private
     * Cloud (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames)
     */
    override fun cacheSecurityGroupNames(): List<String> = unwrap(this).getCacheSecurityGroupNames()
        ?: emptyList()

    /**
     * The name of the subnet group to be used for the cluster.
     *
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     *
     *
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group
     * before you start creating a cluster. For more information, see
     * `[AWS::ElastiCache::SubnetGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
     * .`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname)
     */
    override fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

    /**
     * A name for the cache cluster.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the cache cluster. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * The name must contain 1 to 50 alphanumeric characters or hyphens. The name must start with a
     * letter and cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-clustername)
     */
    override fun clusterName(): String? = unwrap(this).getClusterName()

    /**
     * The name of the cache engine to be used for this cluster.
     *
     * Valid values for this parameter are: `memcached` | `redis`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-engine)
     */
    override fun engine(): String = unwrap(this).getEngine()

    /**
     * The version number of the cache engine to be used for this cluster.
     *
     * To view the supported cache engine versions, use the DescribeCacheEngineVersions operation.
     *
     * *Important:* You can upgrade to a newer engine version (see [Selecting a Cache Engine and
     * Version](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement)
     * ), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine
     * version, you must delete the existing cluster or replication group and create it anew with the
     * earlier engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * The network type you choose when modifying a cluster, either `ipv4` | `ipv6` .
     *
     * IPv6 is supported for workloads using Redis OSS engine version 6.2 onward or Memcached engine
     * version 1.6.6 on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-ipdiscovery)
     */
    override fun ipDiscovery(): String? = unwrap(this).getIpDiscovery()

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-logdeliveryconfigurations)
     */
    override fun logDeliveryConfigurations(): Any? = unwrap(this).getLogDeliveryConfigurations()

    /**
     * Must be either `ipv4` | `ipv6` | `dual_stack` .
     *
     * IPv6 is supported for workloads using Redis OSS engine version 6.2 onward or Memcached engine
     * version 1.6.6 on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-networktype)
     */
    override fun networkType(): String? = unwrap(this).getNetworkType()

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     * notifications are sent.
     *
     *
     * The Amazon SNS topic owner must be the same as the cluster owner.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-notificationtopicarn)
     */
    override fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

    /**
     * The number of cache nodes that the cache cluster should have.
     *
     *
     * However, if the `PreferredAvailabilityZone` and `PreferredAvailabilityZones` properties were
     * not previously specified and you don't specify any new values, an update requires
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-numcachenodes)
     */
    override fun numCacheNodes(): Number = unwrap(this).getNumCacheNodes()

    /**
     * The port number on which each of the cache nodes accepts connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The EC2 Availability Zone in which the cluster is created.
     *
     * All nodes belonging to this cluster are placed in the preferred Availability Zone. If you
     * want to create your nodes across multiple Availability Zones, use `PreferredAvailabilityZones` .
     *
     * Default: System chosen Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone)
     */
    override fun preferredAvailabilityZone(): String? = unwrap(this).getPreferredAvailabilityZone()

    /**
     * A list of the Availability Zones in which cache nodes are created.
     *
     * The order of the zones in the list is not important.
     *
     * This option is only supported on Memcached.
     *
     *
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheNodes` .
     *
     *
     * If you want all the nodes in the same Availability Zone, use `PreferredAvailabilityZone`
     * instead, or repeat the Availability Zone multiple times in the list.
     *
     * Default: System chosen Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones)
     */
    override fun preferredAvailabilityZones(): List<String> =
        unwrap(this).getPreferredAvailabilityZones() ?: emptyList()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * A single-element string list containing an Amazon Resource Name (ARN) that uniquely
     * identifies a Redis OSS RDB snapshot file stored in Amazon S3.
     *
     * The snapshot file is used to populate the node group (shard). The Amazon S3 object name in
     * the ARN cannot contain any commas.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotarns)
     */
    override fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

    /**
     * The name of a Redis OSS snapshot from which to restore data into the new node group (shard).
     *
     * The snapshot status changes to `restoring` while the new node group (shard) is being created.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotname)
     */
    override fun snapshotName(): String? = unwrap(this).getSnapshotName()

    /**
     * The number of days for which ElastiCache retains automatic snapshots before deleting them.
     *
     * For example, if you set `SnapshotRetentionLimit` to 5, a snapshot taken today is retained for
     * 5 days before being deleted.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit)
     */
    override fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

    /**
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
     * node group (shard).
     *
     * Example: `05:00-09:00`
     *
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time
     * range.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotwindow)
     */
    override fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A flag that enables in-transit encryption when set to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-transitencryptionenabled)
     */
    override fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

    /**
     * One or more VPC security groups associated with the cluster.
     *
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCacheClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheClusterProps):
        CfnCacheClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCacheClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCacheClusterProps):
        software.amazon.awscdk.services.elasticache.CfnCacheClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnCacheClusterProps
  }
}
