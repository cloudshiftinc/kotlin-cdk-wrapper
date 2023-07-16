@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe
import software.amazon.awscdk.services.pipes.CfnPipeProps
import software.constructs.Construct

public object pipes {
  public inline fun cfnPipe(
    scope: Construct,
    id: String,
    block: CfnPipeDsl.() -> Unit = {},
  ): CfnPipe {
    val builder = CfnPipeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeAwsVpcConfigurationProperty(block: CfnPipeAwsVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnPipe.AwsVpcConfigurationProperty {
    val builder = CfnPipeAwsVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeBatchArrayPropertiesProperty(block: CfnPipeBatchArrayPropertiesPropertyDsl.() -> Unit
      = {}): CfnPipe.BatchArrayPropertiesProperty {
    val builder = CfnPipeBatchArrayPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeBatchContainerOverridesProperty(block: CfnPipeBatchContainerOverridesPropertyDsl.() -> Unit
      = {}): CfnPipe.BatchContainerOverridesProperty {
    val builder = CfnPipeBatchContainerOverridesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeBatchEnvironmentVariableProperty(block: CfnPipeBatchEnvironmentVariablePropertyDsl.() -> Unit
      = {}): CfnPipe.BatchEnvironmentVariableProperty {
    val builder = CfnPipeBatchEnvironmentVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeBatchJobDependencyProperty(block: CfnPipeBatchJobDependencyPropertyDsl.() -> Unit =
      {}): CfnPipe.BatchJobDependencyProperty {
    val builder = CfnPipeBatchJobDependencyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeBatchResourceRequirementProperty(block: CfnPipeBatchResourceRequirementPropertyDsl.() -> Unit
      = {}): CfnPipe.BatchResourceRequirementProperty {
    val builder = CfnPipeBatchResourceRequirementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeBatchRetryStrategyProperty(block: CfnPipeBatchRetryStrategyPropertyDsl.() -> Unit =
      {}): CfnPipe.BatchRetryStrategyProperty {
    val builder = CfnPipeBatchRetryStrategyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeCapacityProviderStrategyItemProperty(block: CfnPipeCapacityProviderStrategyItemPropertyDsl.() -> Unit
      = {}): CfnPipe.CapacityProviderStrategyItemProperty {
    val builder = CfnPipeCapacityProviderStrategyItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeDeadLetterConfigProperty(block: CfnPipeDeadLetterConfigPropertyDsl.() -> Unit =
      {}): CfnPipe.DeadLetterConfigProperty {
    val builder = CfnPipeDeadLetterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeEcsContainerOverrideProperty(block: CfnPipeEcsContainerOverridePropertyDsl.() -> Unit
      = {}): CfnPipe.EcsContainerOverrideProperty {
    val builder = CfnPipeEcsContainerOverridePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeEcsEnvironmentFileProperty(block: CfnPipeEcsEnvironmentFilePropertyDsl.() -> Unit =
      {}): CfnPipe.EcsEnvironmentFileProperty {
    val builder = CfnPipeEcsEnvironmentFilePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeEcsEnvironmentVariableProperty(block: CfnPipeEcsEnvironmentVariablePropertyDsl.() -> Unit
      = {}): CfnPipe.EcsEnvironmentVariableProperty {
    val builder = CfnPipeEcsEnvironmentVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeEcsEphemeralStorageProperty(block: CfnPipeEcsEphemeralStoragePropertyDsl.() -> Unit
      = {}): CfnPipe.EcsEphemeralStorageProperty {
    val builder = CfnPipeEcsEphemeralStoragePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeEcsInferenceAcceleratorOverrideProperty(block: CfnPipeEcsInferenceAcceleratorOverridePropertyDsl.() -> Unit
      = {}): CfnPipe.EcsInferenceAcceleratorOverrideProperty {
    val builder = CfnPipeEcsInferenceAcceleratorOverridePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeEcsResourceRequirementProperty(block: CfnPipeEcsResourceRequirementPropertyDsl.() -> Unit
      = {}): CfnPipe.EcsResourceRequirementProperty {
    val builder = CfnPipeEcsResourceRequirementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeEcsTaskOverrideProperty(block: CfnPipeEcsTaskOverridePropertyDsl.() -> Unit = {}):
      CfnPipe.EcsTaskOverrideProperty {
    val builder = CfnPipeEcsTaskOverridePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipeFilterCriteriaProperty(block: CfnPipeFilterCriteriaPropertyDsl.() -> Unit
      = {}): CfnPipe.FilterCriteriaProperty {
    val builder = CfnPipeFilterCriteriaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipeFilterProperty(block: CfnPipeFilterPropertyDsl.() -> Unit = {}):
      CfnPipe.FilterProperty {
    val builder = CfnPipeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeMQBrokerAccessCredentialsProperty(block: CfnPipeMQBrokerAccessCredentialsPropertyDsl.() -> Unit
      = {}): CfnPipe.MQBrokerAccessCredentialsProperty {
    val builder = CfnPipeMQBrokerAccessCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeMSKAccessCredentialsProperty(block: CfnPipeMSKAccessCredentialsPropertyDsl.() -> Unit
      = {}): CfnPipe.MSKAccessCredentialsProperty {
    val builder = CfnPipeMSKAccessCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeNetworkConfigurationProperty(block: CfnPipeNetworkConfigurationPropertyDsl.() -> Unit
      = {}): CfnPipe.NetworkConfigurationProperty {
    val builder = CfnPipeNetworkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeEnrichmentHttpParametersProperty(block: CfnPipePipeEnrichmentHttpParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeEnrichmentHttpParametersProperty {
    val builder = CfnPipePipeEnrichmentHttpParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeEnrichmentParametersProperty(block: CfnPipePipeEnrichmentParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeEnrichmentParametersProperty {
    val builder = CfnPipePipeEnrichmentParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeSourceActiveMQBrokerParametersProperty(block: CfnPipePipeSourceActiveMQBrokerParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeSourceActiveMQBrokerParametersProperty {
    val builder = CfnPipePipeSourceActiveMQBrokerParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeSourceDynamoDBStreamParametersProperty(block: CfnPipePipeSourceDynamoDBStreamParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeSourceDynamoDBStreamParametersProperty {
    val builder = CfnPipePipeSourceDynamoDBStreamParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeSourceKinesisStreamParametersProperty(block: CfnPipePipeSourceKinesisStreamParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeSourceKinesisStreamParametersProperty {
    val builder = CfnPipePipeSourceKinesisStreamParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeSourceManagedStreamingKafkaParametersProperty(block: CfnPipePipeSourceManagedStreamingKafkaParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty {
    val builder = CfnPipePipeSourceManagedStreamingKafkaParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeSourceParametersProperty(block: CfnPipePipeSourceParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeSourceParametersProperty {
    val builder = CfnPipePipeSourceParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeSourceRabbitMQBrokerParametersProperty(block: CfnPipePipeSourceRabbitMQBrokerParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeSourceRabbitMQBrokerParametersProperty {
    val builder = CfnPipePipeSourceRabbitMQBrokerParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeSourceSelfManagedKafkaParametersProperty(block: CfnPipePipeSourceSelfManagedKafkaParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeSourceSelfManagedKafkaParametersProperty {
    val builder = CfnPipePipeSourceSelfManagedKafkaParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeSourceSqsQueueParametersProperty(block: CfnPipePipeSourceSqsQueueParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeSourceSqsQueueParametersProperty {
    val builder = CfnPipePipeSourceSqsQueueParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetBatchJobParametersProperty(block: CfnPipePipeTargetBatchJobParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetBatchJobParametersProperty {
    val builder = CfnPipePipeTargetBatchJobParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetCloudWatchLogsParametersProperty(block: CfnPipePipeTargetCloudWatchLogsParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetCloudWatchLogsParametersProperty {
    val builder = CfnPipePipeTargetCloudWatchLogsParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetEcsTaskParametersProperty(block: CfnPipePipeTargetEcsTaskParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetEcsTaskParametersProperty {
    val builder = CfnPipePipeTargetEcsTaskParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetEventBridgeEventBusParametersProperty(block: CfnPipePipeTargetEventBridgeEventBusParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetEventBridgeEventBusParametersProperty {
    val builder = CfnPipePipeTargetEventBridgeEventBusParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetHttpParametersProperty(block: CfnPipePipeTargetHttpParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetHttpParametersProperty {
    val builder = CfnPipePipeTargetHttpParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetKinesisStreamParametersProperty(block: CfnPipePipeTargetKinesisStreamParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetKinesisStreamParametersProperty {
    val builder = CfnPipePipeTargetKinesisStreamParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetLambdaFunctionParametersProperty(block: CfnPipePipeTargetLambdaFunctionParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetLambdaFunctionParametersProperty {
    val builder = CfnPipePipeTargetLambdaFunctionParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetParametersProperty(block: CfnPipePipeTargetParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetParametersProperty {
    val builder = CfnPipePipeTargetParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetRedshiftDataParametersProperty(block: CfnPipePipeTargetRedshiftDataParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetRedshiftDataParametersProperty {
    val builder = CfnPipePipeTargetRedshiftDataParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetSageMakerPipelineParametersProperty(block: CfnPipePipeTargetSageMakerPipelineParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetSageMakerPipelineParametersProperty {
    val builder = CfnPipePipeTargetSageMakerPipelineParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetSqsQueueParametersProperty(block: CfnPipePipeTargetSqsQueueParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetSqsQueueParametersProperty {
    val builder = CfnPipePipeTargetSqsQueueParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePipeTargetStateMachineParametersProperty(block: CfnPipePipeTargetStateMachineParametersPropertyDsl.() -> Unit
      = {}): CfnPipe.PipeTargetStateMachineParametersProperty {
    val builder = CfnPipePipeTargetStateMachineParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePlacementConstraintProperty(block: CfnPipePlacementConstraintPropertyDsl.() -> Unit
      = {}): CfnPipe.PlacementConstraintProperty {
    val builder = CfnPipePlacementConstraintPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipePlacementStrategyProperty(block: CfnPipePlacementStrategyPropertyDsl.() -> Unit =
      {}): CfnPipe.PlacementStrategyProperty {
    val builder = CfnPipePlacementStrategyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipeProps(block: CfnPipePropsDsl.() -> Unit = {}): CfnPipeProps {
    val builder = CfnPipePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeSageMakerPipelineParameterProperty(block: CfnPipeSageMakerPipelineParameterPropertyDsl.() -> Unit
      = {}): CfnPipe.SageMakerPipelineParameterProperty {
    val builder = CfnPipeSageMakerPipelineParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeSelfManagedKafkaAccessConfigurationCredentialsProperty(block: CfnPipeSelfManagedKafkaAccessConfigurationCredentialsPropertyDsl.() -> Unit
      = {}): CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty {
    val builder = CfnPipeSelfManagedKafkaAccessConfigurationCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipeSelfManagedKafkaAccessConfigurationVpcProperty(block: CfnPipeSelfManagedKafkaAccessConfigurationVpcPropertyDsl.() -> Unit
      = {}): CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty {
    val builder = CfnPipeSelfManagedKafkaAccessConfigurationVpcPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
