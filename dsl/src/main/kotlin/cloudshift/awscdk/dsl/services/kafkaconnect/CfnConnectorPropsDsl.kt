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

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps

/**
 * Properties for defining a `CfnConnector`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
 * .capacity(CapacityProperty.builder()
 * .autoScaling(AutoScalingProperty.builder()
 * .maxWorkerCount(123)
 * .mcuCount(123)
 * .minWorkerCount(123)
 * .scaleInPolicy(ScaleInPolicyProperty.builder()
 * .cpuUtilizationPercentage(123)
 * .build())
 * .scaleOutPolicy(ScaleOutPolicyProperty.builder()
 * .cpuUtilizationPercentage(123)
 * .build())
 * .build())
 * .provisionedCapacity(ProvisionedCapacityProperty.builder()
 * .workerCount(123)
 * // the properties below are optional
 * .mcuCount(123)
 * .build())
 * .build())
 * .connectorConfiguration(Map.of(
 * "connectorConfigurationKey", "connectorConfiguration"))
 * .connectorName("connectorName")
 * .kafkaCluster(KafkaClusterProperty.builder()
 * .apacheKafkaCluster(ApacheKafkaClusterProperty.builder()
 * .bootstrapServers("bootstrapServers")
 * .vpc(VpcProperty.builder()
 * .securityGroups(List.of("securityGroups"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build())
 * .build())
 * .kafkaClusterClientAuthentication(KafkaClusterClientAuthenticationProperty.builder()
 * .authenticationType("authenticationType")
 * .build())
 * .kafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransitProperty.builder()
 * .encryptionType("encryptionType")
 * .build())
 * .kafkaConnectVersion("kafkaConnectVersion")
 * .plugins(List.of(PluginProperty.builder()
 * .customPlugin(CustomPluginProperty.builder()
 * .customPluginArn("customPluginArn")
 * .revision(123)
 * .build())
 * .build()))
 * .serviceExecutionRoleArn("serviceExecutionRoleArn")
 * // the properties below are optional
 * .connectorDescription("connectorDescription")
 * .logDelivery(LogDeliveryProperty.builder()
 * .workerLogDelivery(WorkerLogDeliveryProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsLogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .logGroup("logGroup")
 * .build())
 * .firehose(FirehoseLogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .deliveryStream("deliveryStream")
 * .build())
 * .s3(S3LogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .bucket("bucket")
 * .prefix("prefix")
 * .build())
 * .build())
 * .build())
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .revision(123)
 * .workerConfigurationArn("workerConfigurationArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-connector.html)
 */
@CdkDslMarker
public class CfnConnectorPropsDsl {
    private val cdkBuilder: CfnConnectorProps.Builder = CfnConnectorProps.builder()

    private val _plugins: MutableList<Any> = mutableListOf()

    /** @param capacity The connector's compute capacity settings. */
    public fun capacity(capacity: IResolvable) {
        cdkBuilder.capacity(capacity)
    }

    /** @param capacity The connector's compute capacity settings. */
    public fun capacity(capacity: CfnConnector.CapacityProperty) {
        cdkBuilder.capacity(capacity)
    }

    /** @param connectorConfiguration The configuration of the connector. */
    public fun connectorConfiguration(connectorConfiguration: Map<String, String>) {
        cdkBuilder.connectorConfiguration(connectorConfiguration)
    }

    /** @param connectorConfiguration The configuration of the connector. */
    public fun connectorConfiguration(connectorConfiguration: IResolvable) {
        cdkBuilder.connectorConfiguration(connectorConfiguration)
    }

    /** @param connectorDescription The description of the connector. */
    public fun connectorDescription(connectorDescription: String) {
        cdkBuilder.connectorDescription(connectorDescription)
    }

    /** @param connectorName The name of the connector. */
    public fun connectorName(connectorName: String) {
        cdkBuilder.connectorName(connectorName)
    }

    /**
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     *   connected.
     */
    public fun kafkaCluster(kafkaCluster: IResolvable) {
        cdkBuilder.kafkaCluster(kafkaCluster)
    }

    /**
     * @param kafkaCluster The details of the Apache Kafka cluster to which the connector is
     *   connected.
     */
    public fun kafkaCluster(kafkaCluster: CfnConnector.KafkaClusterProperty) {
        cdkBuilder.kafkaCluster(kafkaCluster)
    }

    /**
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     *   the Apache Kafka cluster. The value is NONE when no client authentication is used.
     */
    public fun kafkaClusterClientAuthentication(kafkaClusterClientAuthentication: IResolvable) {
        cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication)
    }

    /**
     * @param kafkaClusterClientAuthentication The type of client authentication used to connect to
     *   the Apache Kafka cluster. The value is NONE when no client authentication is used.
     */
    public fun kafkaClusterClientAuthentication(
        kafkaClusterClientAuthentication: CfnConnector.KafkaClusterClientAuthenticationProperty
    ) {
        cdkBuilder.kafkaClusterClientAuthentication(kafkaClusterClientAuthentication)
    }

    /**
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     *   cluster.
     */
    public fun kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit: IResolvable) {
        cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit)
    }

    /**
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka
     *   cluster.
     */
    public fun kafkaClusterEncryptionInTransit(
        kafkaClusterEncryptionInTransit: CfnConnector.KafkaClusterEncryptionInTransitProperty
    ) {
        cdkBuilder.kafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit)
    }

    /**
     * @param kafkaConnectVersion The version of Kafka Connect. It has to be compatible with both
     *   the Apache Kafka cluster's version and the plugins.
     */
    public fun kafkaConnectVersion(kafkaConnectVersion: String) {
        cdkBuilder.kafkaConnectVersion(kafkaConnectVersion)
    }

    /** @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs. */
    public fun logDelivery(logDelivery: IResolvable) {
        cdkBuilder.logDelivery(logDelivery)
    }

    /** @param logDelivery The settings for delivering connector logs to Amazon CloudWatch Logs. */
    public fun logDelivery(logDelivery: CfnConnector.LogDeliveryProperty) {
        cdkBuilder.logDelivery(logDelivery)
    }

    /**
     * @param plugins Specifies which plugin to use for the connector. You must specify a
     *   single-element list. Amazon MSK Connect does not currently support specifying multiple
     *   plugins.
     */
    public fun plugins(vararg plugins: Any) {
        _plugins.addAll(listOf(*plugins))
    }

    /**
     * @param plugins Specifies which plugin to use for the connector. You must specify a
     *   single-element list. Amazon MSK Connect does not currently support specifying multiple
     *   plugins.
     */
    public fun plugins(plugins: Collection<Any>) {
        _plugins.addAll(plugins)
    }

    /**
     * @param plugins Specifies which plugin to use for the connector. You must specify a
     *   single-element list. Amazon MSK Connect does not currently support specifying multiple
     *   plugins.
     */
    public fun plugins(plugins: IResolvable) {
        cdkBuilder.plugins(plugins)
    }

    /**
     * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
     *   connector to access Amazon Web Services resources.
     */
    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
        cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
    }

    /** @param workerConfiguration The worker configurations that are in use with the connector. */
    public fun workerConfiguration(workerConfiguration: IResolvable) {
        cdkBuilder.workerConfiguration(workerConfiguration)
    }

    /** @param workerConfiguration The worker configurations that are in use with the connector. */
    public fun workerConfiguration(workerConfiguration: CfnConnector.WorkerConfigurationProperty) {
        cdkBuilder.workerConfiguration(workerConfiguration)
    }

    public fun build(): CfnConnectorProps {
        if (_plugins.isNotEmpty()) cdkBuilder.plugins(_plugins)
        return cdkBuilder.build()
    }
}
