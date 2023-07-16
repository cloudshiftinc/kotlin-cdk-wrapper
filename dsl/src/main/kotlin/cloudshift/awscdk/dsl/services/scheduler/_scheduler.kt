@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule
import software.amazon.awscdk.services.scheduler.CfnScheduleGroup
import software.amazon.awscdk.services.scheduler.CfnScheduleGroupProps
import software.amazon.awscdk.services.scheduler.CfnScheduleProps
import software.constructs.Construct

public object scheduler {
  public inline fun cfnSchedule(
    scope: Construct,
    id: String,
    block: CfnScheduleDsl.() -> Unit = {},
  ): CfnSchedule {
    val builder = CfnScheduleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleAwsVpcConfigurationProperty(block: CfnScheduleAwsVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnSchedule.AwsVpcConfigurationProperty {
    val builder = CfnScheduleAwsVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleCapacityProviderStrategyItemProperty(block: CfnScheduleCapacityProviderStrategyItemPropertyDsl.() -> Unit
      = {}): CfnSchedule.CapacityProviderStrategyItemProperty {
    val builder = CfnScheduleCapacityProviderStrategyItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleDeadLetterConfigProperty(block: CfnScheduleDeadLetterConfigPropertyDsl.() -> Unit
      = {}): CfnSchedule.DeadLetterConfigProperty {
    val builder = CfnScheduleDeadLetterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleEcsParametersProperty(block: CfnScheduleEcsParametersPropertyDsl.() -> Unit =
      {}): CfnSchedule.EcsParametersProperty {
    val builder = CfnScheduleEcsParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleEventBridgeParametersProperty(block: CfnScheduleEventBridgeParametersPropertyDsl.() -> Unit
      = {}): CfnSchedule.EventBridgeParametersProperty {
    val builder = CfnScheduleEventBridgeParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleFlexibleTimeWindowProperty(block: CfnScheduleFlexibleTimeWindowPropertyDsl.() -> Unit
      = {}): CfnSchedule.FlexibleTimeWindowProperty {
    val builder = CfnScheduleFlexibleTimeWindowPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnScheduleGroup(
    scope: Construct,
    id: String,
    block: CfnScheduleGroupDsl.() -> Unit = {},
  ): CfnScheduleGroup {
    val builder = CfnScheduleGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnScheduleGroupProps(block: CfnScheduleGroupPropsDsl.() -> Unit = {}):
      CfnScheduleGroupProps {
    val builder = CfnScheduleGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleKinesisParametersProperty(block: CfnScheduleKinesisParametersPropertyDsl.() -> Unit
      = {}): CfnSchedule.KinesisParametersProperty {
    val builder = CfnScheduleKinesisParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleNetworkConfigurationProperty(block: CfnScheduleNetworkConfigurationPropertyDsl.() -> Unit
      = {}): CfnSchedule.NetworkConfigurationProperty {
    val builder = CfnScheduleNetworkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSchedulePlacementConstraintProperty(block: CfnSchedulePlacementConstraintPropertyDsl.() -> Unit
      = {}): CfnSchedule.PlacementConstraintProperty {
    val builder = CfnSchedulePlacementConstraintPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSchedulePlacementStrategyProperty(block: CfnSchedulePlacementStrategyPropertyDsl.() -> Unit
      = {}): CfnSchedule.PlacementStrategyProperty {
    val builder = CfnSchedulePlacementStrategyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnScheduleProps(block: CfnSchedulePropsDsl.() -> Unit = {}): CfnScheduleProps {
    val builder = CfnSchedulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleRetryPolicyProperty(block: CfnScheduleRetryPolicyPropertyDsl.() -> Unit = {}):
      CfnSchedule.RetryPolicyProperty {
    val builder = CfnScheduleRetryPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleSageMakerPipelineParameterProperty(block: CfnScheduleSageMakerPipelineParameterPropertyDsl.() -> Unit
      = {}): CfnSchedule.SageMakerPipelineParameterProperty {
    val builder = CfnScheduleSageMakerPipelineParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleSageMakerPipelineParametersProperty(block: CfnScheduleSageMakerPipelineParametersPropertyDsl.() -> Unit
      = {}): CfnSchedule.SageMakerPipelineParametersProperty {
    val builder = CfnScheduleSageMakerPipelineParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnScheduleSqsParametersProperty(block: CfnScheduleSqsParametersPropertyDsl.() -> Unit =
      {}): CfnSchedule.SqsParametersProperty {
    val builder = CfnScheduleSqsParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnScheduleTargetProperty(block: CfnScheduleTargetPropertyDsl.() -> Unit = {}):
      CfnSchedule.TargetProperty {
    val builder = CfnScheduleTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
