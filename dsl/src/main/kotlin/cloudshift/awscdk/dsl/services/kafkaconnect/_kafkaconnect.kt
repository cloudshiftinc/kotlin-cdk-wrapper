@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps
import software.constructs.Construct

public object kafkaconnect {
  public inline fun cfnConnector(
    scope: Construct,
    id: String,
    block: CfnConnectorDsl.() -> Unit = {},
  ): CfnConnector {
    val builder = CfnConnectorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorApacheKafkaClusterProperty(block: CfnConnectorApacheKafkaClusterPropertyDsl.() -> Unit
      = {}): CfnConnector.ApacheKafkaClusterProperty {
    val builder = CfnConnectorApacheKafkaClusterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorAutoScalingProperty(block: CfnConnectorAutoScalingPropertyDsl.() -> Unit =
      {}): CfnConnector.AutoScalingProperty {
    val builder = CfnConnectorAutoScalingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorCapacityProperty(block: CfnConnectorCapacityPropertyDsl.() -> Unit =
      {}): CfnConnector.CapacityProperty {
    val builder = CfnConnectorCapacityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorCloudWatchLogsLogDeliveryProperty(block: CfnConnectorCloudWatchLogsLogDeliveryPropertyDsl.() -> Unit
      = {}): CfnConnector.CloudWatchLogsLogDeliveryProperty {
    val builder = CfnConnectorCloudWatchLogsLogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorCustomPluginProperty(block: CfnConnectorCustomPluginPropertyDsl.() -> Unit =
      {}): CfnConnector.CustomPluginProperty {
    val builder = CfnConnectorCustomPluginPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorFirehoseLogDeliveryProperty(block: CfnConnectorFirehoseLogDeliveryPropertyDsl.() -> Unit
      = {}): CfnConnector.FirehoseLogDeliveryProperty {
    val builder = CfnConnectorFirehoseLogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorKafkaClusterClientAuthenticationProperty(block: CfnConnectorKafkaClusterClientAuthenticationPropertyDsl.() -> Unit
      = {}): CfnConnector.KafkaClusterClientAuthenticationProperty {
    val builder = CfnConnectorKafkaClusterClientAuthenticationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorKafkaClusterEncryptionInTransitProperty(block: CfnConnectorKafkaClusterEncryptionInTransitPropertyDsl.() -> Unit
      = {}): CfnConnector.KafkaClusterEncryptionInTransitProperty {
    val builder = CfnConnectorKafkaClusterEncryptionInTransitPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorKafkaClusterProperty(block: CfnConnectorKafkaClusterPropertyDsl.() -> Unit =
      {}): CfnConnector.KafkaClusterProperty {
    val builder = CfnConnectorKafkaClusterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorLogDeliveryProperty(block: CfnConnectorLogDeliveryPropertyDsl.() -> Unit =
      {}): CfnConnector.LogDeliveryProperty {
    val builder = CfnConnectorLogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorPluginProperty(block: CfnConnectorPluginPropertyDsl.() -> Unit =
      {}): CfnConnector.PluginProperty {
    val builder = CfnConnectorPluginPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorProps(block: CfnConnectorPropsDsl.() -> Unit = {}):
      CfnConnectorProps {
    val builder = CfnConnectorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProvisionedCapacityProperty(block: CfnConnectorProvisionedCapacityPropertyDsl.() -> Unit
      = {}): CfnConnector.ProvisionedCapacityProperty {
    val builder = CfnConnectorProvisionedCapacityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorS3LogDeliveryProperty(block: CfnConnectorS3LogDeliveryPropertyDsl.() -> Unit =
      {}): CfnConnector.S3LogDeliveryProperty {
    val builder = CfnConnectorS3LogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorScaleInPolicyProperty(block: CfnConnectorScaleInPolicyPropertyDsl.() -> Unit =
      {}): CfnConnector.ScaleInPolicyProperty {
    val builder = CfnConnectorScaleInPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorScaleOutPolicyProperty(block: CfnConnectorScaleOutPolicyPropertyDsl.() -> Unit
      = {}): CfnConnector.ScaleOutPolicyProperty {
    val builder = CfnConnectorScaleOutPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorVpcProperty(block: CfnConnectorVpcPropertyDsl.() -> Unit = {}):
      CfnConnector.VpcProperty {
    val builder = CfnConnectorVpcPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorWorkerConfigurationProperty(block: CfnConnectorWorkerConfigurationPropertyDsl.() -> Unit
      = {}): CfnConnector.WorkerConfigurationProperty {
    val builder = CfnConnectorWorkerConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorWorkerLogDeliveryProperty(block: CfnConnectorWorkerLogDeliveryPropertyDsl.() -> Unit
      = {}): CfnConnector.WorkerLogDeliveryProperty {
    val builder = CfnConnectorWorkerLogDeliveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
