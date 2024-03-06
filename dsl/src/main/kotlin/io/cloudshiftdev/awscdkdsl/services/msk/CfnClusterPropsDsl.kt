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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster
import software.amazon.awscdk.services.msk.CfnClusterProps

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
@CdkDslMarker
public class CfnClusterPropsDsl {
    private val cdkBuilder: CfnClusterProps.Builder = CfnClusterProps.builder()

    /** @param brokerNodeGroupInfo Information about the broker nodes in the cluster. */
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: IResolvable) {
        cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo)
    }

    /** @param brokerNodeGroupInfo Information about the broker nodes in the cluster. */
    public fun brokerNodeGroupInfo(brokerNodeGroupInfo: CfnCluster.BrokerNodeGroupInfoProperty) {
        cdkBuilder.brokerNodeGroupInfo(brokerNodeGroupInfo)
    }

    /** @param clientAuthentication VPC connection control settings for brokers. */
    public fun clientAuthentication(clientAuthentication: IResolvable) {
        cdkBuilder.clientAuthentication(clientAuthentication)
    }

    /** @param clientAuthentication VPC connection control settings for brokers. */
    public fun clientAuthentication(clientAuthentication: CfnCluster.ClientAuthenticationProperty) {
        cdkBuilder.clientAuthentication(clientAuthentication)
    }

    /** @param clusterName The name of the cluster. */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     *   cluster.
     */
    public fun configurationInfo(configurationInfo: IResolvable) {
        cdkBuilder.configurationInfo(configurationInfo)
    }

    /**
     * @param configurationInfo Represents the configuration that you want MSK to use for the
     *   cluster.
     */
    public fun configurationInfo(configurationInfo: CfnCluster.ConfigurationInfoProperty) {
        cdkBuilder.configurationInfo(configurationInfo)
    }

    /** @param currentVersion The version of the cluster that you want to update. */
    public fun currentVersion(currentVersion: String) {
        cdkBuilder.currentVersion(currentVersion)
    }

    /** @param encryptionInfo Includes all encryption-related information. */
    public fun encryptionInfo(encryptionInfo: IResolvable) {
        cdkBuilder.encryptionInfo(encryptionInfo)
    }

    /** @param encryptionInfo Includes all encryption-related information. */
    public fun encryptionInfo(encryptionInfo: CfnCluster.EncryptionInfoProperty) {
        cdkBuilder.encryptionInfo(encryptionInfo)
    }

    /**
     * @param enhancedMonitoring Specifies the level of monitoring for the MSK cluster. The possible
     *   values are `DEFAULT` , `PER_BROKER` , and `PER_TOPIC_PER_BROKER` .
     */
    public fun enhancedMonitoring(enhancedMonitoring: String) {
        cdkBuilder.enhancedMonitoring(enhancedMonitoring)
    }

    /**
     * @param kafkaVersion The version of Apache Kafka. You can use Amazon MSK to create clusters
     *   that use Apache Kafka versions 1.1.1 and 2.2.1.
     */
    public fun kafkaVersion(kafkaVersion: String) {
        cdkBuilder.kafkaVersion(kafkaVersion)
    }

    /** @param loggingInfo Logging Info details. */
    public fun loggingInfo(loggingInfo: IResolvable) {
        cdkBuilder.loggingInfo(loggingInfo)
    }

    /** @param loggingInfo Logging Info details. */
    public fun loggingInfo(loggingInfo: CfnCluster.LoggingInfoProperty) {
        cdkBuilder.loggingInfo(loggingInfo)
    }

    /** @param numberOfBrokerNodes The number of broker nodes in the cluster. */
    public fun numberOfBrokerNodes(numberOfBrokerNodes: Number) {
        cdkBuilder.numberOfBrokerNodes(numberOfBrokerNodes)
    }

    /** @param openMonitoring The settings for open monitoring. */
    public fun openMonitoring(openMonitoring: IResolvable) {
        cdkBuilder.openMonitoring(openMonitoring)
    }

    /** @param openMonitoring The settings for open monitoring. */
    public fun openMonitoring(openMonitoring: CfnCluster.OpenMonitoringProperty) {
        cdkBuilder.openMonitoring(openMonitoring)
    }

    /** @param storageMode This controls storage mode for supported storage tiers. */
    public fun storageMode(storageMode: String) {
        cdkBuilder.storageMode(storageMode)
    }

    /** @param tags Create tags when creating the cluster. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnClusterProps = cdkBuilder.build()
}
