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

package io.cloudshiftdev.awscdkdsl.services.elasticache

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnCacheCluster
import software.amazon.awscdk.services.elasticache.CfnCacheClusterProps
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps
import software.amazon.awscdk.services.elasticache.CfnParameterGroup
import software.amazon.awscdk.services.elasticache.CfnParameterGroupProps
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup
import software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps
import software.amazon.awscdk.services.elasticache.CfnSecurityGroup
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps
import software.amazon.awscdk.services.elasticache.CfnServerlessCache
import software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps
import software.amazon.awscdk.services.elasticache.CfnSubnetGroup
import software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps
import software.amazon.awscdk.services.elasticache.CfnUser
import software.amazon.awscdk.services.elasticache.CfnUserGroup
import software.amazon.awscdk.services.elasticache.CfnUserGroupProps
import software.amazon.awscdk.services.elasticache.CfnUserProps
import software.constructs.Construct

public object elasticache {
    /**
     * The `AWS::ElastiCache::CacheCluster` type creates an Amazon ElastiCache cache cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnCacheCluster cfnCacheCluster = CfnCacheCluster.Builder.create(this, "MyCfnCacheCluster")
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
    public inline fun cfnCacheCluster(
        scope: Construct,
        id: String,
        block: CfnCacheClusterDsl.() -> Unit = {},
    ): CfnCacheCluster {
        val builder = CfnCacheClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration details of a CloudWatch Logs destination.
     *
     * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
     * destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CloudWatchLogsDestinationDetailsProperty cloudWatchLogsDestinationDetailsProperty =
     * CloudWatchLogsDestinationDetailsProperty.builder()
     * .logGroup("logGroup")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-cloudwatchlogsdestinationdetails.html)
     */
    public inline fun cfnCacheClusterCloudWatchLogsDestinationDetailsProperty(
        block: CfnCacheClusterCloudWatchLogsDestinationDetailsPropertyDsl.() -> Unit = {}
    ): CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty {
        val builder = CfnCacheClusterCloudWatchLogsDestinationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose
     * destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-destinationdetails.html)
     */
    public inline fun cfnCacheClusterDestinationDetailsProperty(
        block: CfnCacheClusterDestinationDetailsPropertyDsl.() -> Unit = {}
    ): CfnCacheCluster.DestinationDetailsProperty {
        val builder = CfnCacheClusterDestinationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration details of the Kinesis Data Firehose destination.
     *
     * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
     * the destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * KinesisFirehoseDestinationDetailsProperty kinesisFirehoseDestinationDetailsProperty =
     * KinesisFirehoseDestinationDetailsProperty.builder()
     * .deliveryStream("deliveryStream")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-kinesisfirehosedestinationdetails.html)
     */
    public inline fun cfnCacheClusterKinesisFirehoseDestinationDetailsProperty(
        block: CfnCacheClusterKinesisFirehoseDestinationDetailsPropertyDsl.() -> Unit = {}
    ): CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty {
        val builder = CfnCacheClusterKinesisFirehoseDestinationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the destination, format and type of the logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html)
     */
    public inline fun cfnCacheClusterLogDeliveryConfigurationRequestProperty(
        block: CfnCacheClusterLogDeliveryConfigurationRequestPropertyDsl.() -> Unit = {}
    ): CfnCacheCluster.LogDeliveryConfigurationRequestProperty {
        val builder = CfnCacheClusterLogDeliveryConfigurationRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCacheCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
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
    public inline fun cfnCacheClusterProps(
        block: CfnCacheClusterPropsDsl.() -> Unit = {}
    ): CfnCacheClusterProps {
        val builder = CfnCacheClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Consists of a primary cluster that accepts writes and an associated secondary cluster that
     * resides in a different Amazon region.
     *
     * The secondary cluster accepts only reads. The primary cluster automatically replicates
     * updates to the secondary cluster.
     * * The *GlobalReplicationGroupIdSuffix* represents the name of the Global datastore, which is
     *   what you use to associate a secondary cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnGlobalReplicationGroup cfnGlobalReplicationGroup =
     * CfnGlobalReplicationGroup.Builder.create(this, "MyCfnGlobalReplicationGroup")
     * .members(List.of(GlobalReplicationGroupMemberProperty.builder()
     * .replicationGroupId("replicationGroupId")
     * .replicationGroupRegion("replicationGroupRegion")
     * .role("role")
     * .build()))
     * // the properties below are optional
     * .automaticFailoverEnabled(false)
     * .cacheNodeType("cacheNodeType")
     * .cacheParameterGroupName("cacheParameterGroupName")
     * .engineVersion("engineVersion")
     * .globalNodeGroupCount(123)
     * .globalReplicationGroupDescription("globalReplicationGroupDescription")
     * .globalReplicationGroupIdSuffix("globalReplicationGroupIdSuffix")
     * .regionalConfigurations(List.of(RegionalConfigurationProperty.builder()
     * .replicationGroupId("replicationGroupId")
     * .replicationGroupRegion("replicationGroupRegion")
     * .reshardingConfigurations(List.of(ReshardingConfigurationProperty.builder()
     * .nodeGroupId("nodeGroupId")
     * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
     * .build()))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html)
     */
    public inline fun cfnGlobalReplicationGroup(
        scope: Construct,
        id: String,
        block: CfnGlobalReplicationGroupDsl.() -> Unit = {},
    ): CfnGlobalReplicationGroup {
        val builder = CfnGlobalReplicationGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A member of a Global datastore.
     *
     * It contains the Replication Group Id, the Amazon region and the role of the replication
     * group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * GlobalReplicationGroupMemberProperty globalReplicationGroupMemberProperty =
     * GlobalReplicationGroupMemberProperty.builder()
     * .replicationGroupId("replicationGroupId")
     * .replicationGroupRegion("replicationGroupRegion")
     * .role("role")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-globalreplicationgroupmember.html)
     */
    public inline fun cfnGlobalReplicationGroupGlobalReplicationGroupMemberProperty(
        block: CfnGlobalReplicationGroupGlobalReplicationGroupMemberPropertyDsl.() -> Unit = {}
    ): CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty {
        val builder = CfnGlobalReplicationGroupGlobalReplicationGroupMemberPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGlobalReplicationGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnGlobalReplicationGroupProps cfnGlobalReplicationGroupProps =
     * CfnGlobalReplicationGroupProps.builder()
     * .members(List.of(GlobalReplicationGroupMemberProperty.builder()
     * .replicationGroupId("replicationGroupId")
     * .replicationGroupRegion("replicationGroupRegion")
     * .role("role")
     * .build()))
     * // the properties below are optional
     * .automaticFailoverEnabled(false)
     * .cacheNodeType("cacheNodeType")
     * .cacheParameterGroupName("cacheParameterGroupName")
     * .engineVersion("engineVersion")
     * .globalNodeGroupCount(123)
     * .globalReplicationGroupDescription("globalReplicationGroupDescription")
     * .globalReplicationGroupIdSuffix("globalReplicationGroupIdSuffix")
     * .regionalConfigurations(List.of(RegionalConfigurationProperty.builder()
     * .replicationGroupId("replicationGroupId")
     * .replicationGroupRegion("replicationGroupRegion")
     * .reshardingConfigurations(List.of(ReshardingConfigurationProperty.builder()
     * .nodeGroupId("nodeGroupId")
     * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
     * .build()))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html)
     */
    public inline fun cfnGlobalReplicationGroupProps(
        block: CfnGlobalReplicationGroupPropsDsl.() -> Unit = {}
    ): CfnGlobalReplicationGroupProps {
        val builder = CfnGlobalReplicationGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of the replication groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * RegionalConfigurationProperty regionalConfigurationProperty =
     * RegionalConfigurationProperty.builder()
     * .replicationGroupId("replicationGroupId")
     * .replicationGroupRegion("replicationGroupRegion")
     * .reshardingConfigurations(List.of(ReshardingConfigurationProperty.builder()
     * .nodeGroupId("nodeGroupId")
     * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-regionalconfiguration.html)
     */
    public inline fun cfnGlobalReplicationGroupRegionalConfigurationProperty(
        block: CfnGlobalReplicationGroupRegionalConfigurationPropertyDsl.() -> Unit = {}
    ): CfnGlobalReplicationGroup.RegionalConfigurationProperty {
        val builder = CfnGlobalReplicationGroupRegionalConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of `PreferredAvailabilityZones` objects that specifies the configuration of a node
     * group in the resharded cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * ReshardingConfigurationProperty reshardingConfigurationProperty =
     * ReshardingConfigurationProperty.builder()
     * .nodeGroupId("nodeGroupId")
     * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-reshardingconfiguration.html)
     */
    public inline fun cfnGlobalReplicationGroupReshardingConfigurationProperty(
        block: CfnGlobalReplicationGroupReshardingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnGlobalReplicationGroup.ReshardingConfigurationProperty {
        val builder = CfnGlobalReplicationGroupReshardingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ElastiCache::ParameterGroup` type creates a new cache parameter group.
     *
     * Cache parameter groups control the parameters for a cache cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnParameterGroup cfnParameterGroup = CfnParameterGroup.Builder.create(this,
     * "MyCfnParameterGroup")
     * .cacheParameterGroupFamily("cacheParameterGroupFamily")
     * .description("description")
     * // the properties below are optional
     * .properties(Map.of(
     * "propertiesKey", "properties"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html)
     */
    public inline fun cfnParameterGroup(
        scope: Construct,
        id: String,
        block: CfnParameterGroupDsl.() -> Unit = {},
    ): CfnParameterGroup {
        val builder = CfnParameterGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnParameterGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnParameterGroupProps cfnParameterGroupProps = CfnParameterGroupProps.builder()
     * .cacheParameterGroupFamily("cacheParameterGroupFamily")
     * .description("description")
     * // the properties below are optional
     * .properties(Map.of(
     * "propertiesKey", "properties"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html)
     */
    public inline fun cfnParameterGroupProps(
        block: CfnParameterGroupPropsDsl.() -> Unit = {}
    ): CfnParameterGroupProps {
        val builder = CfnParameterGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ElastiCache::ReplicationGroup` resource creates an Amazon ElastiCache Redis
     * replication group.
     *
     * A Redis (cluster mode disabled) replication group is a collection of cache clusters, where
     * one of the clusters is a primary read-write cluster and the others are read-only replicas.
     *
     * A Redis (cluster mode enabled) cluster is comprised of from 1 to 90 shards (API/CLI: node
     * groups). Each shard has a primary node and up to 5 read-only replica nodes. The configuration
     * can range from 90 shards and 0 replicas to 15 shards and 5 replicas, which is the maximum
     * number or replicas allowed.
     *
     * The node or shard limit can be increased to a maximum of 500 per cluster if the Redis engine
     * version is 5.0.6 or higher. For example, you can choose to configure a 500 node cluster that
     * ranges between 83 shards (one primary and 5 replicas per shard) and 500 shards (single
     * primary and no replicas). Make sure there are enough available IP addresses to accommodate
     * the increase. Common pitfalls include the subnets in the subnet group have too small a CIDR
     * range or the subnets are shared and heavily used by other clusters. For more information, see
     * [Creating a Subnet Group](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SubnetGroups.Creating.html)
     * . For versions below 5.0.6, the limit is 250 per cluster.
     *
     * To request a limit increase, see
     * [Amazon Service Limits](https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html)
     * and choose the limit type *Nodes per cluster per instance type* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
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
    public inline fun cfnReplicationGroup(
        scope: Construct,
        id: String,
        block: CfnReplicationGroupDsl.() -> Unit = {},
    ): CfnReplicationGroup {
        val builder = CfnReplicationGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration details of the CloudWatch Logs destination.
     *
     * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
     * destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CloudWatchLogsDestinationDetailsProperty cloudWatchLogsDestinationDetailsProperty =
     * CloudWatchLogsDestinationDetailsProperty.builder()
     * .logGroup("logGroup")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-cloudwatchlogsdestinationdetails.html)
     */
    public inline fun cfnReplicationGroupCloudWatchLogsDestinationDetailsProperty(
        block: CfnReplicationGroupCloudWatchLogsDestinationDetailsPropertyDsl.() -> Unit = {}
    ): CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty {
        val builder = CfnReplicationGroupCloudWatchLogsDestinationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose
     * destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
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
    public inline fun cfnReplicationGroupDestinationDetailsProperty(
        block: CfnReplicationGroupDestinationDetailsPropertyDsl.() -> Unit = {}
    ): CfnReplicationGroup.DestinationDetailsProperty {
        val builder = CfnReplicationGroupDestinationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration details of the Kinesis Data Firehose destination.
     *
     * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
     * the destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * KinesisFirehoseDestinationDetailsProperty kinesisFirehoseDestinationDetailsProperty =
     * KinesisFirehoseDestinationDetailsProperty.builder()
     * .deliveryStream("deliveryStream")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-kinesisfirehosedestinationdetails.html)
     */
    public inline fun cfnReplicationGroupKinesisFirehoseDestinationDetailsProperty(
        block: CfnReplicationGroupKinesisFirehoseDestinationDetailsPropertyDsl.() -> Unit = {}
    ): CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty {
        val builder = CfnReplicationGroupKinesisFirehoseDestinationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the destination, format and type of the logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
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
    public inline fun cfnReplicationGroupLogDeliveryConfigurationRequestProperty(
        block: CfnReplicationGroupLogDeliveryConfigurationRequestPropertyDsl.() -> Unit = {}
    ): CfnReplicationGroup.LogDeliveryConfigurationRequestProperty {
        val builder = CfnReplicationGroupLogDeliveryConfigurationRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
     * that configures an Amazon ElastiCache (ElastiCache) Redis cluster node group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
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
    public inline fun cfnReplicationGroupNodeGroupConfigurationProperty(
        block: CfnReplicationGroupNodeGroupConfigurationPropertyDsl.() -> Unit = {}
    ): CfnReplicationGroup.NodeGroupConfigurationProperty {
        val builder = CfnReplicationGroupNodeGroupConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReplicationGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnReplicationGroupProps cfnReplicationGroupProps = CfnReplicationGroupProps.builder()
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
    public inline fun cfnReplicationGroupProps(
        block: CfnReplicationGroupPropsDsl.() -> Unit = {}
    ): CfnReplicationGroupProps {
        val builder = CfnReplicationGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ElastiCache::SecurityGroup` resource creates a cache security group.
     *
     * For more information about cache security groups, go to
     * [CacheSecurityGroups](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/VPCs.html)
     * in the *Amazon ElastiCache User Guide* or go to
     * [CreateCacheSecurityGroup](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSecurityGroup.html)
     * in the *Amazon ElastiCache API Reference Guide* .
     *
     * For more information, see
     * [CreateCacheSubnetGroup](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnSecurityGroup cfnSecurityGroup = CfnSecurityGroup.Builder.create(this, "MyCfnSecurityGroup")
     * .description("description")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html)
     */
    public inline fun cfnSecurityGroup(
        scope: Construct,
        id: String,
        block: CfnSecurityGroupDsl.() -> Unit = {},
    ): CfnSecurityGroup {
        val builder = CfnSecurityGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::ElastiCache::SecurityGroupIngress type authorizes ingress to a cache security group
     * from hosts in specified Amazon EC2 security groups.
     *
     * For more information about ElastiCache security group ingress, go to
     * [AuthorizeCacheSecurityGroupIngress](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_AuthorizeCacheSecurityGroupIngress.html)
     * in the *Amazon ElastiCache API Reference Guide* .
     *
     * Updates are not supported.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnSecurityGroupIngress cfnSecurityGroupIngress = CfnSecurityGroupIngress.Builder.create(this,
     * "MyCfnSecurityGroupIngress")
     * .cacheSecurityGroupName("cacheSecurityGroupName")
     * .ec2SecurityGroupName("ec2SecurityGroupName")
     * // the properties below are optional
     * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html)
     */
    public inline fun cfnSecurityGroupIngress(
        scope: Construct,
        id: String,
        block: CfnSecurityGroupIngressDsl.() -> Unit = {},
    ): CfnSecurityGroupIngress {
        val builder = CfnSecurityGroupIngressDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecurityGroupIngress`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnSecurityGroupIngressProps cfnSecurityGroupIngressProps =
     * CfnSecurityGroupIngressProps.builder()
     * .cacheSecurityGroupName("cacheSecurityGroupName")
     * .ec2SecurityGroupName("ec2SecurityGroupName")
     * // the properties below are optional
     * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html)
     */
    public inline fun cfnSecurityGroupIngressProps(
        block: CfnSecurityGroupIngressPropsDsl.() -> Unit = {}
    ): CfnSecurityGroupIngressProps {
        val builder = CfnSecurityGroupIngressPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecurityGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnSecurityGroupProps cfnSecurityGroupProps = CfnSecurityGroupProps.builder()
     * .description("description")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html)
     */
    public inline fun cfnSecurityGroupProps(
        block: CfnSecurityGroupPropsDsl.() -> Unit = {}
    ): CfnSecurityGroupProps {
        val builder = CfnSecurityGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The resource representing a serverless cache.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnServerlessCache cfnServerlessCache = CfnServerlessCache.Builder.create(this,
     * "MyCfnServerlessCache")
     * .engine("engine")
     * .serverlessCacheName("serverlessCacheName")
     * // the properties below are optional
     * .cacheUsageLimits(CacheUsageLimitsProperty.builder()
     * .dataStorage(DataStorageProperty.builder()
     * .maximum(123)
     * .unit("unit")
     * .build())
     * .ecpuPerSecond(ECPUPerSecondProperty.builder()
     * .maximum(123)
     * .build())
     * .build())
     * .dailySnapshotTime("dailySnapshotTime")
     * .description("description")
     * .endpoint(EndpointProperty.builder()
     * .address("address")
     * .port("port")
     * .build())
     * .finalSnapshotName("finalSnapshotName")
     * .kmsKeyId("kmsKeyId")
     * .majorEngineVersion("majorEngineVersion")
     * .readerEndpoint(EndpointProperty.builder()
     * .address("address")
     * .port("port")
     * .build())
     * .securityGroupIds(List.of("securityGroupIds"))
     * .snapshotArnsToRestore(List.of("snapshotArnsToRestore"))
     * .snapshotRetentionLimit(123)
     * .subnetIds(List.of("subnetIds"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userGroupId("userGroupId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html)
     */
    public inline fun cfnServerlessCache(
        scope: Construct,
        id: String,
        block: CfnServerlessCacheDsl.() -> Unit = {},
    ): CfnServerlessCache {
        val builder = CfnServerlessCacheDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The usage limits for storage and ElastiCache Processing Units for the cache.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CacheUsageLimitsProperty cacheUsageLimitsProperty = CacheUsageLimitsProperty.builder()
     * .dataStorage(DataStorageProperty.builder()
     * .maximum(123)
     * .unit("unit")
     * .build())
     * .ecpuPerSecond(ECPUPerSecondProperty.builder()
     * .maximum(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-cacheusagelimits.html)
     */
    public inline fun cfnServerlessCacheCacheUsageLimitsProperty(
        block: CfnServerlessCacheCacheUsageLimitsPropertyDsl.() -> Unit = {}
    ): CfnServerlessCache.CacheUsageLimitsProperty {
        val builder = CfnServerlessCacheCacheUsageLimitsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The data storage limit.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * DataStorageProperty dataStorageProperty = DataStorageProperty.builder()
     * .maximum(123)
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-datastorage.html)
     */
    public inline fun cfnServerlessCacheDataStorageProperty(
        block: CfnServerlessCacheDataStoragePropertyDsl.() -> Unit = {}
    ): CfnServerlessCache.DataStorageProperty {
        val builder = CfnServerlessCacheDataStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the number of ElastiCache Processing Units (ECPU) the cache can consume
     * per second.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * ECPUPerSecondProperty eCPUPerSecondProperty = ECPUPerSecondProperty.builder()
     * .maximum(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-ecpupersecond.html)
     */
    public inline fun cfnServerlessCacheECPUPerSecondProperty(
        block: CfnServerlessCacheECPUPerSecondPropertyDsl.() -> Unit = {}
    ): CfnServerlessCache.ECPUPerSecondProperty {
        val builder = CfnServerlessCacheECPUPerSecondPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * EndpointProperty endpointProperty = EndpointProperty.builder()
     * .address("address")
     * .port("port")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-endpoint.html)
     */
    public inline fun cfnServerlessCacheEndpointProperty(
        block: CfnServerlessCacheEndpointPropertyDsl.() -> Unit = {}
    ): CfnServerlessCache.EndpointProperty {
        val builder = CfnServerlessCacheEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServerlessCache`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnServerlessCacheProps cfnServerlessCacheProps = CfnServerlessCacheProps.builder()
     * .engine("engine")
     * .serverlessCacheName("serverlessCacheName")
     * // the properties below are optional
     * .cacheUsageLimits(CacheUsageLimitsProperty.builder()
     * .dataStorage(DataStorageProperty.builder()
     * .maximum(123)
     * .unit("unit")
     * .build())
     * .ecpuPerSecond(ECPUPerSecondProperty.builder()
     * .maximum(123)
     * .build())
     * .build())
     * .dailySnapshotTime("dailySnapshotTime")
     * .description("description")
     * .endpoint(EndpointProperty.builder()
     * .address("address")
     * .port("port")
     * .build())
     * .finalSnapshotName("finalSnapshotName")
     * .kmsKeyId("kmsKeyId")
     * .majorEngineVersion("majorEngineVersion")
     * .readerEndpoint(EndpointProperty.builder()
     * .address("address")
     * .port("port")
     * .build())
     * .securityGroupIds(List.of("securityGroupIds"))
     * .snapshotArnsToRestore(List.of("snapshotArnsToRestore"))
     * .snapshotRetentionLimit(123)
     * .subnetIds(List.of("subnetIds"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userGroupId("userGroupId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html)
     */
    public inline fun cfnServerlessCacheProps(
        block: CfnServerlessCachePropsDsl.() -> Unit = {}
    ): CfnServerlessCacheProps {
        val builder = CfnServerlessCachePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a cache subnet group.
     *
     * For more information about cache subnet groups, go to Cache Subnet Groups in the *Amazon
     * ElastiCache User Guide* or go to
     * [CreateCacheSubnetGroup](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html)
     * in the *Amazon ElastiCache API Reference Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnSubnetGroup cfnSubnetGroup = CfnSubnetGroup.Builder.create(this, "MyCfnSubnetGroup")
     * .description("description")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .cacheSubnetGroupName("cacheSubnetGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html)
     */
    public inline fun cfnSubnetGroup(
        scope: Construct,
        id: String,
        block: CfnSubnetGroupDsl.() -> Unit = {},
    ): CfnSubnetGroup {
        val builder = CfnSubnetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSubnetGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnSubnetGroupProps cfnSubnetGroupProps = CfnSubnetGroupProps.builder()
     * .description("description")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .cacheSubnetGroupName("cacheSubnetGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html)
     */
    public inline fun cfnSubnetGroupProps(
        block: CfnSubnetGroupPropsDsl.() -> Unit = {}
    ): CfnSubnetGroupProps {
        val builder = CfnSubnetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For Redis engine version 6.0 onwards: Creates a Redis user. For more information, see
     * [Using Role Based Access Control (RBAC)](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * Object authenticationMode;
     * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
     * .engine("engine")
     * .userId("userId")
     * .userName("userName")
     * // the properties below are optional
     * .accessString("accessString")
     * .authenticationMode(authenticationMode)
     * .noPasswordRequired(false)
     * .passwords(List.of("passwords"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html)
     */
    public inline fun cfnUser(
        scope: Construct,
        id: String,
        block: CfnUserDsl.() -> Unit = {},
    ): CfnUser {
        val builder = CfnUserDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the authentication mode to use.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * AuthenticationModeProperty authenticationModeProperty = AuthenticationModeProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .passwords(List.of("passwords"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-user-authenticationmode.html)
     */
    public inline fun cfnUserAuthenticationModeProperty(
        block: CfnUserAuthenticationModePropertyDsl.() -> Unit = {}
    ): CfnUser.AuthenticationModeProperty {
        val builder = CfnUserAuthenticationModePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For Redis engine version 6.0 onwards: Creates a Redis user group. For more information, see
     * [Using Role Based Access Control (RBAC)](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnUserGroup cfnUserGroup = CfnUserGroup.Builder.create(this, "MyCfnUserGroup")
     * .engine("engine")
     * .userGroupId("userGroupId")
     * .userIds(List.of("userIds"))
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html)
     */
    public inline fun cfnUserGroup(
        scope: Construct,
        id: String,
        block: CfnUserGroupDsl.() -> Unit = {},
    ): CfnUserGroup {
        val builder = CfnUserGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * CfnUserGroupProps cfnUserGroupProps = CfnUserGroupProps.builder()
     * .engine("engine")
     * .userGroupId("userGroupId")
     * .userIds(List.of("userIds"))
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html)
     */
    public inline fun cfnUserGroupProps(
        block: CfnUserGroupPropsDsl.() -> Unit = {}
    ): CfnUserGroupProps {
        val builder = CfnUserGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUser`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticache.*;
     * Object authenticationMode;
     * CfnUserProps cfnUserProps = CfnUserProps.builder()
     * .engine("engine")
     * .userId("userId")
     * .userName("userName")
     * // the properties below are optional
     * .accessString("accessString")
     * .authenticationMode(authenticationMode)
     * .noPasswordRequired(false)
     * .passwords(List.of("passwords"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html)
     */
    public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
        val builder = CfnUserPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
