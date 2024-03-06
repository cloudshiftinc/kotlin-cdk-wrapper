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

package io.cloudshiftdev.awscdkdsl.services.msk

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnBatchScramSecret
import software.amazon.awscdk.services.msk.CfnBatchScramSecretProps
import software.amazon.awscdk.services.msk.CfnCluster
import software.amazon.awscdk.services.msk.CfnClusterPolicy
import software.amazon.awscdk.services.msk.CfnClusterPolicyProps
import software.amazon.awscdk.services.msk.CfnClusterProps
import software.amazon.awscdk.services.msk.CfnConfiguration
import software.amazon.awscdk.services.msk.CfnConfigurationProps
import software.amazon.awscdk.services.msk.CfnReplicator
import software.amazon.awscdk.services.msk.CfnReplicatorProps
import software.amazon.awscdk.services.msk.CfnServerlessCluster
import software.amazon.awscdk.services.msk.CfnServerlessClusterProps
import software.amazon.awscdk.services.msk.CfnVpcConnection
import software.amazon.awscdk.services.msk.CfnVpcConnectionProps
import software.constructs.Construct

public object msk {
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnBatchScramSecret cfnBatchScramSecret = CfnBatchScramSecret.Builder.create(this,
     * "MyCfnBatchScramSecret")
     * .clusterArn("clusterArn")
     * // the properties below are optional
     * .secretArnList(List.of("secretArnList"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html)
     */
    public inline fun cfnBatchScramSecret(
        scope: Construct,
        id: String,
        block: CfnBatchScramSecretDsl.() -> Unit = {},
    ): CfnBatchScramSecret {
        val builder = CfnBatchScramSecretDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBatchScramSecret`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnBatchScramSecretProps cfnBatchScramSecretProps = CfnBatchScramSecretProps.builder()
     * .clusterArn("clusterArn")
     * // the properties below are optional
     * .secretArnList(List.of("secretArnList"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html)
     */
    public inline fun cfnBatchScramSecretProps(
        block: CfnBatchScramSecretPropsDsl.() -> Unit = {}
    ): CfnBatchScramSecretProps {
        val builder = CfnBatchScramSecretPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new MSK cluster.
     *
     * The following Python 3.6 examples shows how you can create a cluster that's distributed over
     * two Availability Zones. Before you run this Python script, replace the example subnet and
     * security-group IDs with the IDs of your subnets and security group. When you create an MSK
     * cluster, its brokers get evenly distributed over a number of Availability Zones that's equal
     * to the number of subnets that you specify in the `BrokerNodeGroupInfo` parameter. In this
     * example, you can add a third subnet to get a cluster that's distributed over three
     * Availability Zones.
     *
     * ```
     * import boto3 client = boto3.client('kafka') response = client.create_cluster(
     * BrokerNodeGroupInfo={ 'BrokerAZDistribution': 'DEFAULT', 'ClientSubnets': [
     * 'subnet-012345678901fedcba', 'subnet-9876543210abcdef01' ], 'InstanceType': 'kafka.m5.large',
     * 'SecurityGroups': [ 'sg-012345abcdef789789' ] }, ClusterName='SalesCluster', EncryptionInfo={
     * 'EncryptionInTransit': { 'ClientBroker': 'TLS_PLAINTEXT', 'InCluster': True } },
     * EnhancedMonitoring='PER_TOPIC_PER_BROKER', KafkaVersion='2.2.1', NumberOfBrokerNodes=2
     * ) print(response)
     * ```
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
     * .brokerNodeGroupInfo(BrokerNodeGroupInfoProperty.builder()
     * .clientSubnets(List.of("clientSubnets"))
     * .instanceType("instanceType")
     * // the properties below are optional
     * .brokerAzDistribution("brokerAzDistribution")
     * .connectivityInfo(ConnectivityInfoProperty.builder()
     * .publicAccess(PublicAccessProperty.builder()
     * .type("type")
     * .build())
     * .vpcConnectivity(VpcConnectivityProperty.builder()
     * .clientAuthentication(VpcConnectivityClientAuthenticationProperty.builder()
     * .sasl(VpcConnectivitySaslProperty.builder()
     * .iam(VpcConnectivityIamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(VpcConnectivityScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .tls(VpcConnectivityTlsProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .build())
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .storageInfo(StorageInfoProperty.builder()
     * .ebsStorageInfo(EBSStorageInfoProperty.builder()
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .enabled(false)
     * .volumeThroughput(123)
     * .build())
     * .volumeSize(123)
     * .build())
     * .build())
     * .build())
     * .clusterName("clusterName")
     * .kafkaVersion("kafkaVersion")
     * .numberOfBrokerNodes(123)
     * // the properties below are optional
     * .clientAuthentication(ClientAuthenticationProperty.builder()
     * .sasl(SaslProperty.builder()
     * .iam(IamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(ScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .tls(TlsProperty.builder()
     * .certificateAuthorityArnList(List.of("certificateAuthorityArnList"))
     * .enabled(false)
     * .build())
     * .unauthenticated(UnauthenticatedProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .configurationInfo(ConfigurationInfoProperty.builder()
     * .arn("arn")
     * .revision(123)
     * .build())
     * .currentVersion("currentVersion")
     * .encryptionInfo(EncryptionInfoProperty.builder()
     * .encryptionAtRest(EncryptionAtRestProperty.builder()
     * .dataVolumeKmsKeyId("dataVolumeKmsKeyId")
     * .build())
     * .encryptionInTransit(EncryptionInTransitProperty.builder()
     * .clientBroker("clientBroker")
     * .inCluster(false)
     * .build())
     * .build())
     * .enhancedMonitoring("enhancedMonitoring")
     * .loggingInfo(LoggingInfoProperty.builder()
     * .brokerLogs(BrokerLogsProperty.builder()
     * .cloudWatchLogs(CloudWatchLogsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .logGroup("logGroup")
     * .build())
     * .firehose(FirehoseProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .deliveryStream("deliveryStream")
     * .build())
     * .s3(S3Property.builder()
     * .enabled(false)
     * // the properties below are optional
     * .bucket("bucket")
     * .prefix("prefix")
     * .build())
     * .build())
     * .build())
     * .openMonitoring(OpenMonitoringProperty.builder()
     * .prometheus(PrometheusProperty.builder()
     * .jmxExporter(JmxExporterProperty.builder()
     * .enabledInBroker(false)
     * .build())
     * .nodeExporter(NodeExporterProperty.builder()
     * .enabledInBroker(false)
     * .build())
     * .build())
     * .build())
     * .storageMode("storageMode")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html)
     */
    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The broker logs configuration for this MSK cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * BrokerLogsProperty brokerLogsProperty = BrokerLogsProperty.builder()
     * .cloudWatchLogs(CloudWatchLogsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .logGroup("logGroup")
     * .build())
     * .firehose(FirehoseProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .deliveryStream("deliveryStream")
     * .build())
     * .s3(S3Property.builder()
     * .enabled(false)
     * // the properties below are optional
     * .bucket("bucket")
     * .prefix("prefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokerlogs.html)
     */
    public inline fun cfnClusterBrokerLogsProperty(
        block: CfnClusterBrokerLogsPropertyDsl.() -> Unit = {}
    ): CfnCluster.BrokerLogsProperty {
        val builder = CfnClusterBrokerLogsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the setup to be used for the broker nodes in the cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * BrokerNodeGroupInfoProperty brokerNodeGroupInfoProperty = BrokerNodeGroupInfoProperty.builder()
     * .clientSubnets(List.of("clientSubnets"))
     * .instanceType("instanceType")
     * // the properties below are optional
     * .brokerAzDistribution("brokerAzDistribution")
     * .connectivityInfo(ConnectivityInfoProperty.builder()
     * .publicAccess(PublicAccessProperty.builder()
     * .type("type")
     * .build())
     * .vpcConnectivity(VpcConnectivityProperty.builder()
     * .clientAuthentication(VpcConnectivityClientAuthenticationProperty.builder()
     * .sasl(VpcConnectivitySaslProperty.builder()
     * .iam(VpcConnectivityIamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(VpcConnectivityScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .tls(VpcConnectivityTlsProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .build())
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .storageInfo(StorageInfoProperty.builder()
     * .ebsStorageInfo(EBSStorageInfoProperty.builder()
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .enabled(false)
     * .volumeThroughput(123)
     * .build())
     * .volumeSize(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html)
     */
    public inline fun cfnClusterBrokerNodeGroupInfoProperty(
        block: CfnClusterBrokerNodeGroupInfoPropertyDsl.() -> Unit = {}
    ): CfnCluster.BrokerNodeGroupInfoProperty {
        val builder = CfnClusterBrokerNodeGroupInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Includes all client authentication information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * ClientAuthenticationProperty clientAuthenticationProperty =
     * ClientAuthenticationProperty.builder()
     * .sasl(SaslProperty.builder()
     * .iam(IamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(ScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .tls(TlsProperty.builder()
     * .certificateAuthorityArnList(List.of("certificateAuthorityArnList"))
     * .enabled(false)
     * .build())
     * .unauthenticated(UnauthenticatedProperty.builder()
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html)
     */
    public inline fun cfnClusterClientAuthenticationProperty(
        block: CfnClusterClientAuthenticationPropertyDsl.() -> Unit = {}
    ): CfnCluster.ClientAuthenticationProperty {
        val builder = CfnClusterClientAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details of the CloudWatch Logs destination for broker logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CloudWatchLogsProperty cloudWatchLogsProperty = CloudWatchLogsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .logGroup("logGroup")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html)
     */
    public inline fun cfnClusterCloudWatchLogsProperty(
        block: CfnClusterCloudWatchLogsPropertyDsl.() -> Unit = {}
    ): CfnCluster.CloudWatchLogsProperty {
        val builder = CfnClusterCloudWatchLogsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration to use for the brokers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * ConfigurationInfoProperty configurationInfoProperty = ConfigurationInfoProperty.builder()
     * .arn("arn")
     * .revision(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html)
     */
    public inline fun cfnClusterConfigurationInfoProperty(
        block: CfnClusterConfigurationInfoPropertyDsl.() -> Unit = {}
    ): CfnCluster.ConfigurationInfoProperty {
        val builder = CfnClusterConfigurationInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Broker access controls.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * ConnectivityInfoProperty connectivityInfoProperty = ConnectivityInfoProperty.builder()
     * .publicAccess(PublicAccessProperty.builder()
     * .type("type")
     * .build())
     * .vpcConnectivity(VpcConnectivityProperty.builder()
     * .clientAuthentication(VpcConnectivityClientAuthenticationProperty.builder()
     * .sasl(VpcConnectivitySaslProperty.builder()
     * .iam(VpcConnectivityIamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(VpcConnectivityScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .tls(VpcConnectivityTlsProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-connectivityinfo.html)
     */
    public inline fun cfnClusterConnectivityInfoProperty(
        block: CfnClusterConnectivityInfoPropertyDsl.() -> Unit = {}
    ): CfnCluster.ConnectivityInfoProperty {
        val builder = CfnClusterConnectivityInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about the EBS storage volumes attached to the broker nodes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * EBSStorageInfoProperty eBSStorageInfoProperty = EBSStorageInfoProperty.builder()
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .enabled(false)
     * .volumeThroughput(123)
     * .build())
     * .volumeSize(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html)
     */
    public inline fun cfnClusterEBSStorageInfoProperty(
        block: CfnClusterEBSStorageInfoPropertyDsl.() -> Unit = {}
    ): CfnCluster.EBSStorageInfoProperty {
        val builder = CfnClusterEBSStorageInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The data-volume encryption details.
     *
     * You can't update encryption at rest settings for existing clusters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * EncryptionAtRestProperty encryptionAtRestProperty = EncryptionAtRestProperty.builder()
     * .dataVolumeKmsKeyId("dataVolumeKmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html)
     */
    public inline fun cfnClusterEncryptionAtRestProperty(
        block: CfnClusterEncryptionAtRestPropertyDsl.() -> Unit = {}
    ): CfnCluster.EncryptionAtRestProperty {
        val builder = CfnClusterEncryptionAtRestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for encrypting data in transit.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * EncryptionInTransitProperty encryptionInTransitProperty = EncryptionInTransitProperty.builder()
     * .clientBroker("clientBroker")
     * .inCluster(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html)
     */
    public inline fun cfnClusterEncryptionInTransitProperty(
        block: CfnClusterEncryptionInTransitPropertyDsl.() -> Unit = {}
    ): CfnCluster.EncryptionInTransitProperty {
        val builder = CfnClusterEncryptionInTransitPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Includes encryption-related information, such as the Amazon KMS key used for encrypting data
     * at rest and whether you want MSK to encrypt your data in transit.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * EncryptionInfoProperty encryptionInfoProperty = EncryptionInfoProperty.builder()
     * .encryptionAtRest(EncryptionAtRestProperty.builder()
     * .dataVolumeKmsKeyId("dataVolumeKmsKeyId")
     * .build())
     * .encryptionInTransit(EncryptionInTransitProperty.builder()
     * .clientBroker("clientBroker")
     * .inCluster(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html)
     */
    public inline fun cfnClusterEncryptionInfoProperty(
        block: CfnClusterEncryptionInfoPropertyDsl.() -> Unit = {}
    ): CfnCluster.EncryptionInfoProperty {
        val builder = CfnClusterEncryptionInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Firehose details for BrokerLogs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * FirehoseProperty firehoseProperty = FirehoseProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .deliveryStream("deliveryStream")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html)
     */
    public inline fun cfnClusterFirehoseProperty(
        block: CfnClusterFirehosePropertyDsl.() -> Unit = {}
    ): CfnCluster.FirehoseProperty {
        val builder = CfnClusterFirehosePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for SASL/IAM client authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * IamProperty iamProperty = IamProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-iam.html)
     */
    public inline fun cfnClusterIamProperty(
        block: CfnClusterIamPropertyDsl.() -> Unit = {}
    ): CfnCluster.IamProperty {
        val builder = CfnClusterIamPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Indicates whether you want to enable or disable the JMX Exporter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * JmxExporterProperty jmxExporterProperty = JmxExporterProperty.builder()
     * .enabledInBroker(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-jmxexporter.html)
     */
    public inline fun cfnClusterJmxExporterProperty(
        block: CfnClusterJmxExporterPropertyDsl.() -> Unit = {}
    ): CfnCluster.JmxExporterProperty {
        val builder = CfnClusterJmxExporterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * You can configure your MSK cluster to send broker logs to different destination types.
     *
     * This is a container for the configuration details related to broker logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * LoggingInfoProperty loggingInfoProperty = LoggingInfoProperty.builder()
     * .brokerLogs(BrokerLogsProperty.builder()
     * .cloudWatchLogs(CloudWatchLogsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .logGroup("logGroup")
     * .build())
     * .firehose(FirehoseProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .deliveryStream("deliveryStream")
     * .build())
     * .s3(S3Property.builder()
     * .enabled(false)
     * // the properties below are optional
     * .bucket("bucket")
     * .prefix("prefix")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html)
     */
    public inline fun cfnClusterLoggingInfoProperty(
        block: CfnClusterLoggingInfoPropertyDsl.() -> Unit = {}
    ): CfnCluster.LoggingInfoProperty {
        val builder = CfnClusterLoggingInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Indicates whether you want to enable or disable the Node Exporter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * NodeExporterProperty nodeExporterProperty = NodeExporterProperty.builder()
     * .enabledInBroker(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-nodeexporter.html)
     */
    public inline fun cfnClusterNodeExporterProperty(
        block: CfnClusterNodeExporterPropertyDsl.() -> Unit = {}
    ): CfnCluster.NodeExporterProperty {
        val builder = CfnClusterNodeExporterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * JMX and Node monitoring for the MSK cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * OpenMonitoringProperty openMonitoringProperty = OpenMonitoringProperty.builder()
     * .prometheus(PrometheusProperty.builder()
     * .jmxExporter(JmxExporterProperty.builder()
     * .enabledInBroker(false)
     * .build())
     * .nodeExporter(NodeExporterProperty.builder()
     * .enabledInBroker(false)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html)
     */
    public inline fun cfnClusterOpenMonitoringProperty(
        block: CfnClusterOpenMonitoringPropertyDsl.() -> Unit = {}
    ): CfnCluster.OpenMonitoringProperty {
        val builder = CfnClusterOpenMonitoringPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create or update cluster policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * Object policy;
     * CfnClusterPolicy cfnClusterPolicy = CfnClusterPolicy.Builder.create(this, "MyCfnClusterPolicy")
     * .clusterArn("clusterArn")
     * .policy(policy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html)
     */
    public inline fun cfnClusterPolicy(
        scope: Construct,
        id: String,
        block: CfnClusterPolicyDsl.() -> Unit = {},
    ): CfnClusterPolicy {
        val builder = CfnClusterPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnClusterPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * Object policy;
     * CfnClusterPolicyProps cfnClusterPolicyProps = CfnClusterPolicyProps.builder()
     * .clusterArn("clusterArn")
     * .policy(policy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html)
     */
    public inline fun cfnClusterPolicyProps(
        block: CfnClusterPolicyPropsDsl.() -> Unit = {}
    ): CfnClusterPolicyProps {
        val builder = CfnClusterPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Prometheus settings for open monitoring.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * PrometheusProperty prometheusProperty = PrometheusProperty.builder()
     * .jmxExporter(JmxExporterProperty.builder()
     * .enabledInBroker(false)
     * .build())
     * .nodeExporter(NodeExporterProperty.builder()
     * .enabledInBroker(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html)
     */
    public inline fun cfnClusterPrometheusProperty(
        block: CfnClusterPrometheusPropertyDsl.() -> Unit = {}
    ): CfnCluster.PrometheusProperty {
        val builder = CfnClusterPrometheusPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
     * .brokerNodeGroupInfo(BrokerNodeGroupInfoProperty.builder()
     * .clientSubnets(List.of("clientSubnets"))
     * .instanceType("instanceType")
     * // the properties below are optional
     * .brokerAzDistribution("brokerAzDistribution")
     * .connectivityInfo(ConnectivityInfoProperty.builder()
     * .publicAccess(PublicAccessProperty.builder()
     * .type("type")
     * .build())
     * .vpcConnectivity(VpcConnectivityProperty.builder()
     * .clientAuthentication(VpcConnectivityClientAuthenticationProperty.builder()
     * .sasl(VpcConnectivitySaslProperty.builder()
     * .iam(VpcConnectivityIamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(VpcConnectivityScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .tls(VpcConnectivityTlsProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .build())
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .storageInfo(StorageInfoProperty.builder()
     * .ebsStorageInfo(EBSStorageInfoProperty.builder()
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .enabled(false)
     * .volumeThroughput(123)
     * .build())
     * .volumeSize(123)
     * .build())
     * .build())
     * .build())
     * .clusterName("clusterName")
     * .kafkaVersion("kafkaVersion")
     * .numberOfBrokerNodes(123)
     * // the properties below are optional
     * .clientAuthentication(ClientAuthenticationProperty.builder()
     * .sasl(SaslProperty.builder()
     * .iam(IamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(ScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .tls(TlsProperty.builder()
     * .certificateAuthorityArnList(List.of("certificateAuthorityArnList"))
     * .enabled(false)
     * .build())
     * .unauthenticated(UnauthenticatedProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .configurationInfo(ConfigurationInfoProperty.builder()
     * .arn("arn")
     * .revision(123)
     * .build())
     * .currentVersion("currentVersion")
     * .encryptionInfo(EncryptionInfoProperty.builder()
     * .encryptionAtRest(EncryptionAtRestProperty.builder()
     * .dataVolumeKmsKeyId("dataVolumeKmsKeyId")
     * .build())
     * .encryptionInTransit(EncryptionInTransitProperty.builder()
     * .clientBroker("clientBroker")
     * .inCluster(false)
     * .build())
     * .build())
     * .enhancedMonitoring("enhancedMonitoring")
     * .loggingInfo(LoggingInfoProperty.builder()
     * .brokerLogs(BrokerLogsProperty.builder()
     * .cloudWatchLogs(CloudWatchLogsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .logGroup("logGroup")
     * .build())
     * .firehose(FirehoseProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .deliveryStream("deliveryStream")
     * .build())
     * .s3(S3Property.builder()
     * .enabled(false)
     * // the properties below are optional
     * .bucket("bucket")
     * .prefix("prefix")
     * .build())
     * .build())
     * .build())
     * .openMonitoring(OpenMonitoringProperty.builder()
     * .prometheus(PrometheusProperty.builder()
     * .jmxExporter(JmxExporterProperty.builder()
     * .enabledInBroker(false)
     * .build())
     * .nodeExporter(NodeExporterProperty.builder()
     * .enabledInBroker(false)
     * .build())
     * .build())
     * .build())
     * .storageMode("storageMode")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html)
     */
    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about provisioned throughput for EBS storage volumes attached to kafka
     * broker nodes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * ProvisionedThroughputProperty provisionedThroughputProperty =
     * ProvisionedThroughputProperty.builder()
     * .enabled(false)
     * .volumeThroughput(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-provisionedthroughput.html)
     */
    public inline fun cfnClusterProvisionedThroughputProperty(
        block: CfnClusterProvisionedThroughputPropertyDsl.() -> Unit = {}
    ): CfnCluster.ProvisionedThroughputProperty {
        val builder = CfnClusterProvisionedThroughputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Broker access controls.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * PublicAccessProperty publicAccessProperty = PublicAccessProperty.builder()
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-publicaccess.html)
     */
    public inline fun cfnClusterPublicAccessProperty(
        block: CfnClusterPublicAccessPropertyDsl.() -> Unit = {}
    ): CfnCluster.PublicAccessProperty {
        val builder = CfnClusterPublicAccessPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the Amazon S3 destination for broker logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * S3Property s3Property = S3Property.builder()
     * .enabled(false)
     * // the properties below are optional
     * .bucket("bucket")
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html)
     */
    public inline fun cfnClusterS3Property(
        block: CfnClusterS3PropertyDsl.() -> Unit = {}
    ): CfnCluster.S3Property {
        val builder = CfnClusterS3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for client authentication using SASL.
     *
     * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to true.
     * You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose
     * `TLS_PLAINTEXT` , then you must also set `unauthenticated` to true.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * SaslProperty saslProperty = SaslProperty.builder()
     * .iam(IamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(ScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-sasl.html)
     */
    public inline fun cfnClusterSaslProperty(
        block: CfnClusterSaslPropertyDsl.() -> Unit = {}
    ): CfnCluster.SaslProperty {
        val builder = CfnClusterSaslPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for SASL/SCRAM client authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * ScramProperty scramProperty = ScramProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-scram.html)
     */
    public inline fun cfnClusterScramProperty(
        block: CfnClusterScramPropertyDsl.() -> Unit = {}
    ): CfnCluster.ScramProperty {
        val builder = CfnClusterScramPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about storage volumes attached to Amazon MSK broker nodes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * StorageInfoProperty storageInfoProperty = StorageInfoProperty.builder()
     * .ebsStorageInfo(EBSStorageInfoProperty.builder()
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .enabled(false)
     * .volumeThroughput(123)
     * .build())
     * .volumeSize(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html)
     */
    public inline fun cfnClusterStorageInfoProperty(
        block: CfnClusterStorageInfoPropertyDsl.() -> Unit = {}
    ): CfnCluster.StorageInfoProperty {
        val builder = CfnClusterStorageInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for client authentication using TLS.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * TlsProperty tlsProperty = TlsProperty.builder()
     * .certificateAuthorityArnList(List.of("certificateAuthorityArnList"))
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html)
     */
    public inline fun cfnClusterTlsProperty(
        block: CfnClusterTlsPropertyDsl.() -> Unit = {}
    ): CfnCluster.TlsProperty {
        val builder = CfnClusterTlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for allowing no client authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * UnauthenticatedProperty unauthenticatedProperty = UnauthenticatedProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-unauthenticated.html)
     */
    public inline fun cfnClusterUnauthenticatedProperty(
        block: CfnClusterUnauthenticatedPropertyDsl.() -> Unit = {}
    ): CfnCluster.UnauthenticatedProperty {
        val builder = CfnClusterUnauthenticatedPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Includes all client authentication information for VpcConnectivity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * VpcConnectivityClientAuthenticationProperty vpcConnectivityClientAuthenticationProperty =
     * VpcConnectivityClientAuthenticationProperty.builder()
     * .sasl(VpcConnectivitySaslProperty.builder()
     * .iam(VpcConnectivityIamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(VpcConnectivityScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .tls(VpcConnectivityTlsProperty.builder()
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityclientauthentication.html)
     */
    public inline fun cfnClusterVpcConnectivityClientAuthenticationProperty(
        block: CfnClusterVpcConnectivityClientAuthenticationPropertyDsl.() -> Unit = {}
    ): CfnCluster.VpcConnectivityClientAuthenticationProperty {
        val builder = CfnClusterVpcConnectivityClientAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for SASL/IAM client authentication for VpcConnectivity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * VpcConnectivityIamProperty vpcConnectivityIamProperty = VpcConnectivityIamProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityiam.html)
     */
    public inline fun cfnClusterVpcConnectivityIamProperty(
        block: CfnClusterVpcConnectivityIamPropertyDsl.() -> Unit = {}
    ): CfnCluster.VpcConnectivityIamProperty {
        val builder = CfnClusterVpcConnectivityIamPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * VPC connection control settings for brokers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * VpcConnectivityProperty vpcConnectivityProperty = VpcConnectivityProperty.builder()
     * .clientAuthentication(VpcConnectivityClientAuthenticationProperty.builder()
     * .sasl(VpcConnectivitySaslProperty.builder()
     * .iam(VpcConnectivityIamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(VpcConnectivityScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .tls(VpcConnectivityTlsProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivity.html)
     */
    public inline fun cfnClusterVpcConnectivityProperty(
        block: CfnClusterVpcConnectivityPropertyDsl.() -> Unit = {}
    ): CfnCluster.VpcConnectivityProperty {
        val builder = CfnClusterVpcConnectivityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for client authentication using SASL for VpcConnectivity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * VpcConnectivitySaslProperty vpcConnectivitySaslProperty = VpcConnectivitySaslProperty.builder()
     * .iam(VpcConnectivityIamProperty.builder()
     * .enabled(false)
     * .build())
     * .scram(VpcConnectivityScramProperty.builder()
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitysasl.html)
     */
    public inline fun cfnClusterVpcConnectivitySaslProperty(
        block: CfnClusterVpcConnectivitySaslPropertyDsl.() -> Unit = {}
    ): CfnCluster.VpcConnectivitySaslProperty {
        val builder = CfnClusterVpcConnectivitySaslPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for SASL/SCRAM client authentication for vpcConnectivity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * VpcConnectivityScramProperty vpcConnectivityScramProperty =
     * VpcConnectivityScramProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityscram.html)
     */
    public inline fun cfnClusterVpcConnectivityScramProperty(
        block: CfnClusterVpcConnectivityScramPropertyDsl.() -> Unit = {}
    ): CfnCluster.VpcConnectivityScramProperty {
        val builder = CfnClusterVpcConnectivityScramPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for client authentication using TLS for vpcConnectivity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * VpcConnectivityTlsProperty vpcConnectivityTlsProperty = VpcConnectivityTlsProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitytls.html)
     */
    public inline fun cfnClusterVpcConnectivityTlsProperty(
        block: CfnClusterVpcConnectivityTlsPropertyDsl.() -> Unit = {}
    ): CfnCluster.VpcConnectivityTlsProperty {
        val builder = CfnClusterVpcConnectivityTlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new MSK configuration.
     *
     * To see an example of how to use this operation, first save the following text to a file and
     * name the file config-file.txt .
     *
     * `auto.create.topics.enable = true zookeeper.connection.timeout.ms = 1000 log.roll.ms =
     * 604800000`
     *
     * Now run the following Python 3.6 script in the folder where you saved config-file.txt . This
     * script uses the properties specified in config-file.txt to create a configuration named
     * `SalesClusterConfiguration` . This configuration can work with Apache Kafka versions 1.1.1
     * and 2.1.0.
     *
     * ```
     * import boto3 client = boto3.client('kafka') config_file = open('config-file.txt', 'r')
     * server_properties = config_file.read() response = client.create_configuration(
     * Name='SalesClusterConfiguration', Description='The configuration to use on all sales clusters.',
     * KafkaVersions=['1.1.1', '2.1.0'], ServerProperties=server_properties
     * ) print(response)
     * ```
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnConfiguration cfnConfiguration = CfnConfiguration.Builder.create(this, "MyCfnConfiguration")
     * .name("name")
     * .serverProperties("serverProperties")
     * // the properties below are optional
     * .description("description")
     * .kafkaVersionsList(List.of("kafkaVersionsList"))
     * .latestRevision(LatestRevisionProperty.builder()
     * .creationTime("creationTime")
     * .description("description")
     * .revision(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html)
     */
    public inline fun cfnConfiguration(
        scope: Construct,
        id: String,
        block: CfnConfigurationDsl.() -> Unit = {},
    ): CfnConfiguration {
        val builder = CfnConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * LatestRevisionProperty latestRevisionProperty = LatestRevisionProperty.builder()
     * .creationTime("creationTime")
     * .description("description")
     * .revision(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html)
     */
    public inline fun cfnConfigurationLatestRevisionProperty(
        block: CfnConfigurationLatestRevisionPropertyDsl.() -> Unit = {}
    ): CfnConfiguration.LatestRevisionProperty {
        val builder = CfnConfigurationLatestRevisionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnConfigurationProps cfnConfigurationProps = CfnConfigurationProps.builder()
     * .name("name")
     * .serverProperties("serverProperties")
     * // the properties below are optional
     * .description("description")
     * .kafkaVersionsList(List.of("kafkaVersionsList"))
     * .latestRevision(LatestRevisionProperty.builder()
     * .creationTime("creationTime")
     * .description("description")
     * .revision(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html)
     */
    public inline fun cfnConfigurationProps(
        block: CfnConfigurationPropsDsl.() -> Unit = {}
    ): CfnConfigurationProps {
        val builder = CfnConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Resource Type definition for AWS::MSK::Replicator.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnReplicator cfnReplicator = CfnReplicator.Builder.create(this, "MyCfnReplicator")
     * .kafkaClusters(List.of(KafkaClusterProperty.builder()
     * .amazonMskCluster(AmazonMskClusterProperty.builder()
     * .mskClusterArn("mskClusterArn")
     * .build())
     * .vpcConfig(KafkaClusterClientVpcConfigProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build())
     * .build()))
     * .replicationInfoList(List.of(ReplicationInfoProperty.builder()
     * .consumerGroupReplication(ConsumerGroupReplicationProperty.builder()
     * .consumerGroupsToReplicate(List.of("consumerGroupsToReplicate"))
     * // the properties below are optional
     * .consumerGroupsToExclude(List.of("consumerGroupsToExclude"))
     * .detectAndCopyNewConsumerGroups(false)
     * .synchroniseConsumerGroupOffsets(false)
     * .build())
     * .sourceKafkaClusterArn("sourceKafkaClusterArn")
     * .targetCompressionType("targetCompressionType")
     * .targetKafkaClusterArn("targetKafkaClusterArn")
     * .topicReplication(TopicReplicationProperty.builder()
     * .topicsToReplicate(List.of("topicsToReplicate"))
     * // the properties below are optional
     * .copyAccessControlListsForTopics(false)
     * .copyTopicConfigurations(false)
     * .detectAndCopyNewTopics(false)
     * .topicsToExclude(List.of("topicsToExclude"))
     * .build())
     * .build()))
     * .replicatorName("replicatorName")
     * .serviceExecutionRoleArn("serviceExecutionRoleArn")
     * // the properties below are optional
     * .currentVersion("currentVersion")
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html)
     */
    public inline fun cfnReplicator(
        scope: Construct,
        id: String,
        block: CfnReplicatorDsl.() -> Unit = {},
    ): CfnReplicator {
        val builder = CfnReplicatorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details of an Amazon MSK cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * AmazonMskClusterProperty amazonMskClusterProperty = AmazonMskClusterProperty.builder()
     * .mskClusterArn("mskClusterArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-amazonmskcluster.html)
     */
    public inline fun cfnReplicatorAmazonMskClusterProperty(
        block: CfnReplicatorAmazonMskClusterPropertyDsl.() -> Unit = {}
    ): CfnReplicator.AmazonMskClusterProperty {
        val builder = CfnReplicatorAmazonMskClusterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration relating to consumer group replication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * ConsumerGroupReplicationProperty consumerGroupReplicationProperty =
     * ConsumerGroupReplicationProperty.builder()
     * .consumerGroupsToReplicate(List.of("consumerGroupsToReplicate"))
     * // the properties below are optional
     * .consumerGroupsToExclude(List.of("consumerGroupsToExclude"))
     * .detectAndCopyNewConsumerGroups(false)
     * .synchroniseConsumerGroupOffsets(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html)
     */
    public inline fun cfnReplicatorConsumerGroupReplicationProperty(
        block: CfnReplicatorConsumerGroupReplicationPropertyDsl.() -> Unit = {}
    ): CfnReplicator.ConsumerGroupReplicationProperty {
        val builder = CfnReplicatorConsumerGroupReplicationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details of an Amazon VPC which has network connectivity to the Kafka cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * KafkaClusterClientVpcConfigProperty kafkaClusterClientVpcConfigProperty =
     * KafkaClusterClientVpcConfigProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkaclusterclientvpcconfig.html)
     */
    public inline fun cfnReplicatorKafkaClusterClientVpcConfigProperty(
        block: CfnReplicatorKafkaClusterClientVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnReplicator.KafkaClusterClientVpcConfigProperty {
        val builder = CfnReplicatorKafkaClusterClientVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details of a Kafka cluster for replication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * KafkaClusterProperty kafkaClusterProperty = KafkaClusterProperty.builder()
     * .amazonMskCluster(AmazonMskClusterProperty.builder()
     * .mskClusterArn("mskClusterArn")
     * .build())
     * .vpcConfig(KafkaClusterClientVpcConfigProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkacluster.html)
     */
    public inline fun cfnReplicatorKafkaClusterProperty(
        block: CfnReplicatorKafkaClusterPropertyDsl.() -> Unit = {}
    ): CfnReplicator.KafkaClusterProperty {
        val builder = CfnReplicatorKafkaClusterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReplicator`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnReplicatorProps cfnReplicatorProps = CfnReplicatorProps.builder()
     * .kafkaClusters(List.of(KafkaClusterProperty.builder()
     * .amazonMskCluster(AmazonMskClusterProperty.builder()
     * .mskClusterArn("mskClusterArn")
     * .build())
     * .vpcConfig(KafkaClusterClientVpcConfigProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build())
     * .build()))
     * .replicationInfoList(List.of(ReplicationInfoProperty.builder()
     * .consumerGroupReplication(ConsumerGroupReplicationProperty.builder()
     * .consumerGroupsToReplicate(List.of("consumerGroupsToReplicate"))
     * // the properties below are optional
     * .consumerGroupsToExclude(List.of("consumerGroupsToExclude"))
     * .detectAndCopyNewConsumerGroups(false)
     * .synchroniseConsumerGroupOffsets(false)
     * .build())
     * .sourceKafkaClusterArn("sourceKafkaClusterArn")
     * .targetCompressionType("targetCompressionType")
     * .targetKafkaClusterArn("targetKafkaClusterArn")
     * .topicReplication(TopicReplicationProperty.builder()
     * .topicsToReplicate(List.of("topicsToReplicate"))
     * // the properties below are optional
     * .copyAccessControlListsForTopics(false)
     * .copyTopicConfigurations(false)
     * .detectAndCopyNewTopics(false)
     * .topicsToExclude(List.of("topicsToExclude"))
     * .build())
     * .build()))
     * .replicatorName("replicatorName")
     * .serviceExecutionRoleArn("serviceExecutionRoleArn")
     * // the properties below are optional
     * .currentVersion("currentVersion")
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html)
     */
    public inline fun cfnReplicatorProps(
        block: CfnReplicatorPropsDsl.() -> Unit = {}
    ): CfnReplicatorProps {
        val builder = CfnReplicatorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration for replication between a source and target Kafka cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * ReplicationInfoProperty replicationInfoProperty = ReplicationInfoProperty.builder()
     * .consumerGroupReplication(ConsumerGroupReplicationProperty.builder()
     * .consumerGroupsToReplicate(List.of("consumerGroupsToReplicate"))
     * // the properties below are optional
     * .consumerGroupsToExclude(List.of("consumerGroupsToExclude"))
     * .detectAndCopyNewConsumerGroups(false)
     * .synchroniseConsumerGroupOffsets(false)
     * .build())
     * .sourceKafkaClusterArn("sourceKafkaClusterArn")
     * .targetCompressionType("targetCompressionType")
     * .targetKafkaClusterArn("targetKafkaClusterArn")
     * .topicReplication(TopicReplicationProperty.builder()
     * .topicsToReplicate(List.of("topicsToReplicate"))
     * // the properties below are optional
     * .copyAccessControlListsForTopics(false)
     * .copyTopicConfigurations(false)
     * .detectAndCopyNewTopics(false)
     * .topicsToExclude(List.of("topicsToExclude"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html)
     */
    public inline fun cfnReplicatorReplicationInfoProperty(
        block: CfnReplicatorReplicationInfoPropertyDsl.() -> Unit = {}
    ): CfnReplicator.ReplicationInfoProperty {
        val builder = CfnReplicatorReplicationInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * TopicReplicationProperty topicReplicationProperty = TopicReplicationProperty.builder()
     * .topicsToReplicate(List.of("topicsToReplicate"))
     * // the properties below are optional
     * .copyAccessControlListsForTopics(false)
     * .copyTopicConfigurations(false)
     * .detectAndCopyNewTopics(false)
     * .topicsToExclude(List.of("topicsToExclude"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html)
     */
    public inline fun cfnReplicatorTopicReplicationProperty(
        block: CfnReplicatorTopicReplicationPropertyDsl.() -> Unit = {}
    ): CfnReplicator.TopicReplicationProperty {
        val builder = CfnReplicatorTopicReplicationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnServerlessCluster cfnServerlessCluster = CfnServerlessCluster.Builder.create(this,
     * "MyCfnServerlessCluster")
     * .clientAuthentication(ClientAuthenticationProperty.builder()
     * .sasl(SaslProperty.builder()
     * .iam(IamProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .build())
     * .clusterName("clusterName")
     * .vpcConfigs(List.of(VpcConfigProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroups(List.of("securityGroups"))
     * .build()))
     * // the properties below are optional
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html)
     */
    public inline fun cfnServerlessCluster(
        scope: Construct,
        id: String,
        block: CfnServerlessClusterDsl.() -> Unit = {},
    ): CfnServerlessCluster {
        val builder = CfnServerlessClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Includes all client authentication information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * ClientAuthenticationProperty clientAuthenticationProperty =
     * ClientAuthenticationProperty.builder()
     * .sasl(SaslProperty.builder()
     * .iam(IamProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-serverlesscluster-clientauthentication.html)
     */
    public inline fun cfnServerlessClusterClientAuthenticationProperty(
        block: CfnServerlessClusterClientAuthenticationPropertyDsl.() -> Unit = {}
    ): CfnServerlessCluster.ClientAuthenticationProperty {
        val builder = CfnServerlessClusterClientAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for SASL/IAM client authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * IamProperty iamProperty = IamProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-serverlesscluster-iam.html)
     */
    public inline fun cfnServerlessClusterIamProperty(
        block: CfnServerlessClusterIamPropertyDsl.() -> Unit = {}
    ): CfnServerlessCluster.IamProperty {
        val builder = CfnServerlessClusterIamPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServerlessCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnServerlessClusterProps cfnServerlessClusterProps = CfnServerlessClusterProps.builder()
     * .clientAuthentication(ClientAuthenticationProperty.builder()
     * .sasl(SaslProperty.builder()
     * .iam(IamProperty.builder()
     * .enabled(false)
     * .build())
     * .build())
     * .build())
     * .clusterName("clusterName")
     * .vpcConfigs(List.of(VpcConfigProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroups(List.of("securityGroups"))
     * .build()))
     * // the properties below are optional
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html)
     */
    public inline fun cfnServerlessClusterProps(
        block: CfnServerlessClusterPropsDsl.() -> Unit = {}
    ): CfnServerlessClusterProps {
        val builder = CfnServerlessClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for client authentication using SASL.
     *
     * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to true.
     * You must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose
     * `TLS_PLAINTEXT` , then you must also set `unauthenticated` to true.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * SaslProperty saslProperty = SaslProperty.builder()
     * .iam(IamProperty.builder()
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-serverlesscluster-sasl.html)
     */
    public inline fun cfnServerlessClusterSaslProperty(
        block: CfnServerlessClusterSaslPropertyDsl.() -> Unit = {}
    ): CfnServerlessCluster.SaslProperty {
        val builder = CfnServerlessClusterSaslPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroups(List.of("securityGroups"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-serverlesscluster-vpcconfig.html)
     */
    public inline fun cfnServerlessClusterVpcConfigProperty(
        block: CfnServerlessClusterVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnServerlessCluster.VpcConfigProperty {
        val builder = CfnServerlessClusterVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create remote VPC connection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnVpcConnection cfnVpcConnection = CfnVpcConnection.Builder.create(this, "MyCfnVpcConnection")
     * .authentication("authentication")
     * .clientSubnets(List.of("clientSubnets"))
     * .securityGroups(List.of("securityGroups"))
     * .targetClusterArn("targetClusterArn")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html)
     */
    public inline fun cfnVpcConnection(
        scope: Construct,
        id: String,
        block: CfnVpcConnectionDsl.() -> Unit = {},
    ): CfnVpcConnection {
        val builder = CfnVpcConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVpcConnection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.msk.*;
     * CfnVpcConnectionProps cfnVpcConnectionProps = CfnVpcConnectionProps.builder()
     * .authentication("authentication")
     * .clientSubnets(List.of("clientSubnets"))
     * .securityGroups(List.of("securityGroups"))
     * .targetClusterArn("targetClusterArn")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html)
     */
    public inline fun cfnVpcConnectionProps(
        block: CfnVpcConnectionPropsDsl.() -> Unit = {}
    ): CfnVpcConnectionProps {
        val builder = CfnVpcConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
