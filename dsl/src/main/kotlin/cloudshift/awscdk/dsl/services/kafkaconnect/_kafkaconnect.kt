@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps
import software.constructs.Construct

public object kafkaconnect {
  /**
   * Creates a connector using the specified properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
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
  public inline fun cfnConnector(
    scope: Construct,
    id: String,
    block: CfnConnectorDsl.() -> Unit = {},
  ): CfnConnector {
    val builder = CfnConnectorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * ApacheKafkaClusterProperty apacheKafkaClusterProperty = ApacheKafkaClusterProperty.builder()
   * .bootstrapServers("bootstrapServers")
   * .vpc(VpcProperty.builder()
   * .securityGroups(List.of("securityGroups"))
   * .subnets(List.of("subnets"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-apachekafkacluster.html)
   */
  public inline
      fun cfnConnectorApacheKafkaClusterProperty(block: CfnConnectorApacheKafkaClusterPropertyDsl.() -> Unit
      = {}): CfnConnector.ApacheKafkaClusterProperty {
    val builder = CfnConnectorApacheKafkaClusterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies how the connector scales.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * AutoScalingProperty autoScalingProperty = AutoScalingProperty.builder()
   * .maxWorkerCount(123)
   * .mcuCount(123)
   * .minWorkerCount(123)
   * .scaleInPolicy(ScaleInPolicyProperty.builder()
   * .cpuUtilizationPercentage(123)
   * .build())
   * .scaleOutPolicy(ScaleOutPolicyProperty.builder()
   * .cpuUtilizationPercentage(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html)
   */
  public inline
      fun cfnConnectorAutoScalingProperty(block: CfnConnectorAutoScalingPropertyDsl.() -> Unit =
      {}): CfnConnector.AutoScalingProperty {
    val builder = CfnConnectorAutoScalingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the capacity of the connector, whether it is auto scaled or provisioned.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * CapacityProperty capacityProperty = CapacityProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-capacity.html)
   */
  public inline fun cfnConnectorCapacityProperty(block: CfnConnectorCapacityPropertyDsl.() -> Unit =
      {}): CfnConnector.CapacityProperty {
    val builder = CfnConnectorCapacityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The settings for delivering connector logs to Amazon CloudWatch Logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * CloudWatchLogsLogDeliveryProperty cloudWatchLogsLogDeliveryProperty =
   * CloudWatchLogsLogDeliveryProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .logGroup("logGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-cloudwatchlogslogdelivery.html)
   */
  public inline
      fun cfnConnectorCloudWatchLogsLogDeliveryProperty(block: CfnConnectorCloudWatchLogsLogDeliveryPropertyDsl.() -> Unit
      = {}): CfnConnector.CloudWatchLogsLogDeliveryProperty {
    val builder = CfnConnectorCloudWatchLogsLogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A plugin is an AWS resource that contains the code that defines a connector's logic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * CustomPluginProperty customPluginProperty = CustomPluginProperty.builder()
   * .customPluginArn("customPluginArn")
   * .revision(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-customplugin.html)
   */
  public inline
      fun cfnConnectorCustomPluginProperty(block: CfnConnectorCustomPluginPropertyDsl.() -> Unit =
      {}): CfnConnector.CustomPluginProperty {
    val builder = CfnConnectorCustomPluginPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The settings for delivering logs to Amazon Kinesis Data Firehose.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * FirehoseLogDeliveryProperty firehoseLogDeliveryProperty = FirehoseLogDeliveryProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .deliveryStream("deliveryStream")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-firehoselogdelivery.html)
   */
  public inline
      fun cfnConnectorFirehoseLogDeliveryProperty(block: CfnConnectorFirehoseLogDeliveryPropertyDsl.() -> Unit
      = {}): CfnConnector.FirehoseLogDeliveryProperty {
    val builder = CfnConnectorFirehoseLogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The client authentication information used in order to authenticate with the Apache Kafka
   * cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * KafkaClusterClientAuthenticationProperty kafkaClusterClientAuthenticationProperty =
   * KafkaClusterClientAuthenticationProperty.builder()
   * .authenticationType("authenticationType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkaclusterclientauthentication.html)
   */
  public inline
      fun cfnConnectorKafkaClusterClientAuthenticationProperty(block: CfnConnectorKafkaClusterClientAuthenticationPropertyDsl.() -> Unit
      = {}): CfnConnector.KafkaClusterClientAuthenticationProperty {
    val builder = CfnConnectorKafkaClusterClientAuthenticationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Details of encryption in transit to the Apache Kafka cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * KafkaClusterEncryptionInTransitProperty kafkaClusterEncryptionInTransitProperty =
   * KafkaClusterEncryptionInTransitProperty.builder()
   * .encryptionType("encryptionType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkaclusterencryptionintransit.html)
   */
  public inline
      fun cfnConnectorKafkaClusterEncryptionInTransitProperty(block: CfnConnectorKafkaClusterEncryptionInTransitPropertyDsl.() -> Unit
      = {}): CfnConnector.KafkaClusterEncryptionInTransitProperty {
    val builder = CfnConnectorKafkaClusterEncryptionInTransitPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The details of the Apache Kafka cluster to which the connector is connected.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * KafkaClusterProperty kafkaClusterProperty = KafkaClusterProperty.builder()
   * .apacheKafkaCluster(ApacheKafkaClusterProperty.builder()
   * .bootstrapServers("bootstrapServers")
   * .vpc(VpcProperty.builder()
   * .securityGroups(List.of("securityGroups"))
   * .subnets(List.of("subnets"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkacluster.html)
   */
  public inline
      fun cfnConnectorKafkaClusterProperty(block: CfnConnectorKafkaClusterPropertyDsl.() -> Unit =
      {}): CfnConnector.KafkaClusterProperty {
    val builder = CfnConnectorKafkaClusterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Details about log delivery.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * LogDeliveryProperty logDeliveryProperty = LogDeliveryProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-logdelivery.html)
   */
  public inline
      fun cfnConnectorLogDeliveryProperty(block: CfnConnectorLogDeliveryPropertyDsl.() -> Unit =
      {}): CfnConnector.LogDeliveryProperty {
    val builder = CfnConnectorLogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A plugin is an AWS resource that contains the code that defines your connector logic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * PluginProperty pluginProperty = PluginProperty.builder()
   * .customPlugin(CustomPluginProperty.builder()
   * .customPluginArn("customPluginArn")
   * .revision(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-plugin.html)
   */
  public inline fun cfnConnectorPluginProperty(block: CfnConnectorPluginPropertyDsl.() -> Unit =
      {}): CfnConnector.PluginProperty {
    val builder = CfnConnectorPluginPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnConnector`.
   *
   * Example:
   *
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
  public inline fun cfnConnectorProps(block: CfnConnectorPropsDsl.() -> Unit = {}):
      CfnConnectorProps {
    val builder = CfnConnectorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Details about a connector's provisioned capacity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * ProvisionedCapacityProperty provisionedCapacityProperty = ProvisionedCapacityProperty.builder()
   * .workerCount(123)
   * // the properties below are optional
   * .mcuCount(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-provisionedcapacity.html)
   */
  public inline
      fun cfnConnectorProvisionedCapacityProperty(block: CfnConnectorProvisionedCapacityPropertyDsl.() -> Unit
      = {}): CfnConnector.ProvisionedCapacityProperty {
    val builder = CfnConnectorProvisionedCapacityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Details about delivering logs to Amazon S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * S3LogDeliveryProperty s3LogDeliveryProperty = S3LogDeliveryProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .bucket("bucket")
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-s3logdelivery.html)
   */
  public inline
      fun cfnConnectorS3LogDeliveryProperty(block: CfnConnectorS3LogDeliveryPropertyDsl.() -> Unit =
      {}): CfnConnector.S3LogDeliveryProperty {
    val builder = CfnConnectorS3LogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The scale-in policy for the connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * ScaleInPolicyProperty scaleInPolicyProperty = ScaleInPolicyProperty.builder()
   * .cpuUtilizationPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-scaleinpolicy.html)
   */
  public inline
      fun cfnConnectorScaleInPolicyProperty(block: CfnConnectorScaleInPolicyPropertyDsl.() -> Unit =
      {}): CfnConnector.ScaleInPolicyProperty {
    val builder = CfnConnectorScaleInPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The scale-out policy for the connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * ScaleOutPolicyProperty scaleOutPolicyProperty = ScaleOutPolicyProperty.builder()
   * .cpuUtilizationPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-scaleoutpolicy.html)
   */
  public inline
      fun cfnConnectorScaleOutPolicyProperty(block: CfnConnectorScaleOutPolicyPropertyDsl.() -> Unit
      = {}): CfnConnector.ScaleOutPolicyProperty {
    val builder = CfnConnectorScaleOutPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the VPC in which the connector resides.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * VpcProperty vpcProperty = VpcProperty.builder()
   * .securityGroups(List.of("securityGroups"))
   * .subnets(List.of("subnets"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-vpc.html)
   */
  public inline fun cfnConnectorVpcProperty(block: CfnConnectorVpcPropertyDsl.() -> Unit = {}):
      CfnConnector.VpcProperty {
    val builder = CfnConnectorVpcPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration of the workers, which are the processes that run the connector logic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * WorkerConfigurationProperty workerConfigurationProperty = WorkerConfigurationProperty.builder()
   * .revision(123)
   * .workerConfigurationArn("workerConfigurationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerconfiguration.html)
   */
  public inline
      fun cfnConnectorWorkerConfigurationProperty(block: CfnConnectorWorkerConfigurationPropertyDsl.() -> Unit
      = {}): CfnConnector.WorkerConfigurationProperty {
    val builder = CfnConnectorWorkerConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Workers can send worker logs to different destination types.
   *
   * This configuration specifies the details of these destinations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.kafkaconnect.*;
   * WorkerLogDeliveryProperty workerLogDeliveryProperty = WorkerLogDeliveryProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerlogdelivery.html)
   */
  public inline
      fun cfnConnectorWorkerLogDeliveryProperty(block: CfnConnectorWorkerLogDeliveryPropertyDsl.() -> Unit
      = {}): CfnConnector.WorkerLogDeliveryProperty {
    val builder = CfnConnectorWorkerLogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
