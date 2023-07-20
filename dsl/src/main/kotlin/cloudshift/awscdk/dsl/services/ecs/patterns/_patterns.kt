@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps
import software.amazon.awscdk.services.ecs.patterns.FargateServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps
import software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps
import software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps
import software.constructs.Construct

public object patterns {
  public inline fun applicationListenerProps(block: ApplicationListenerPropsDsl.() -> Unit = {}):
      ApplicationListenerProps {
    val builder = ApplicationListenerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationLoadBalancedEc2Service(
    scope: Construct,
    id: String,
    block: ApplicationLoadBalancedEc2ServiceDsl.() -> Unit = {},
  ): ApplicationLoadBalancedEc2Service {
    val builder = ApplicationLoadBalancedEc2ServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationLoadBalancedEc2ServiceProps(block: ApplicationLoadBalancedEc2ServicePropsDsl.() -> Unit
      = {}): ApplicationLoadBalancedEc2ServiceProps {
    val builder = ApplicationLoadBalancedEc2ServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationLoadBalancedFargateService(
    scope: Construct,
    id: String,
    block: ApplicationLoadBalancedFargateServiceDsl.() -> Unit = {},
  ): ApplicationLoadBalancedFargateService {
    val builder = ApplicationLoadBalancedFargateServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationLoadBalancedFargateServiceProps(block: ApplicationLoadBalancedFargateServicePropsDsl.() -> Unit
      = {}): ApplicationLoadBalancedFargateServiceProps {
    val builder = ApplicationLoadBalancedFargateServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationLoadBalancedServiceBaseProps(block: ApplicationLoadBalancedServiceBasePropsDsl.() -> Unit
      = {}): ApplicationLoadBalancedServiceBaseProps {
    val builder = ApplicationLoadBalancedServiceBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationLoadBalancedTaskImageOptions(block: ApplicationLoadBalancedTaskImageOptionsDsl.() -> Unit
      = {}): ApplicationLoadBalancedTaskImageOptions {
    val builder = ApplicationLoadBalancedTaskImageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationLoadBalancedTaskImageProps(block: ApplicationLoadBalancedTaskImagePropsDsl.() -> Unit
      = {}): ApplicationLoadBalancedTaskImageProps {
    val builder = ApplicationLoadBalancedTaskImagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationLoadBalancerProps(block: ApplicationLoadBalancerPropsDsl.() -> Unit =
      {}): ApplicationLoadBalancerProps {
    val builder = ApplicationLoadBalancerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationMultipleTargetGroupsEc2Service(
    scope: Construct,
    id: String,
    block: ApplicationMultipleTargetGroupsEc2ServiceDsl.() -> Unit = {},
  ): ApplicationMultipleTargetGroupsEc2Service {
    val builder = ApplicationMultipleTargetGroupsEc2ServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationMultipleTargetGroupsEc2ServiceProps(block: ApplicationMultipleTargetGroupsEc2ServicePropsDsl.() -> Unit
      = {}): ApplicationMultipleTargetGroupsEc2ServiceProps {
    val builder = ApplicationMultipleTargetGroupsEc2ServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationMultipleTargetGroupsFargateService(
    scope: Construct,
    id: String,
    block: ApplicationMultipleTargetGroupsFargateServiceDsl.() -> Unit = {},
  ): ApplicationMultipleTargetGroupsFargateService {
    val builder = ApplicationMultipleTargetGroupsFargateServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationMultipleTargetGroupsFargateServiceProps(block: ApplicationMultipleTargetGroupsFargateServicePropsDsl.() -> Unit
      = {}): ApplicationMultipleTargetGroupsFargateServiceProps {
    val builder = ApplicationMultipleTargetGroupsFargateServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationMultipleTargetGroupsServiceBaseProps(block: ApplicationMultipleTargetGroupsServiceBasePropsDsl.() -> Unit
      = {}): ApplicationMultipleTargetGroupsServiceBaseProps {
    val builder = ApplicationMultipleTargetGroupsServiceBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationTargetProps(block: ApplicationTargetPropsDsl.() -> Unit = {}):
      ApplicationTargetProps {
    val builder = ApplicationTargetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fargateServiceBaseProps(block: FargateServiceBasePropsDsl.() -> Unit = {}):
      FargateServiceBaseProps {
    val builder = FargateServiceBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkListenerProps(block: NetworkListenerPropsDsl.() -> Unit = {}):
      NetworkListenerProps {
    val builder = NetworkListenerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkLoadBalancedEc2Service(
    scope: Construct,
    id: String,
    block: NetworkLoadBalancedEc2ServiceDsl.() -> Unit = {},
  ): NetworkLoadBalancedEc2Service {
    val builder = NetworkLoadBalancedEc2ServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun networkLoadBalancedEc2ServiceProps(block: NetworkLoadBalancedEc2ServicePropsDsl.() -> Unit
      = {}): NetworkLoadBalancedEc2ServiceProps {
    val builder = NetworkLoadBalancedEc2ServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkLoadBalancedFargateService(
    scope: Construct,
    id: String,
    block: NetworkLoadBalancedFargateServiceDsl.() -> Unit = {},
  ): NetworkLoadBalancedFargateService {
    val builder = NetworkLoadBalancedFargateServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun networkLoadBalancedFargateServiceProps(block: NetworkLoadBalancedFargateServicePropsDsl.() -> Unit
      = {}): NetworkLoadBalancedFargateServiceProps {
    val builder = NetworkLoadBalancedFargateServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun networkLoadBalancedServiceBaseProps(block: NetworkLoadBalancedServiceBasePropsDsl.() -> Unit
      = {}): NetworkLoadBalancedServiceBaseProps {
    val builder = NetworkLoadBalancedServiceBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun networkLoadBalancedTaskImageOptions(block: NetworkLoadBalancedTaskImageOptionsDsl.() -> Unit
      = {}): NetworkLoadBalancedTaskImageOptions {
    val builder = NetworkLoadBalancedTaskImageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun networkLoadBalancedTaskImageProps(block: NetworkLoadBalancedTaskImagePropsDsl.() -> Unit =
      {}): NetworkLoadBalancedTaskImageProps {
    val builder = NetworkLoadBalancedTaskImagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkLoadBalancerProps(block: NetworkLoadBalancerPropsDsl.() -> Unit = {}):
      NetworkLoadBalancerProps {
    val builder = NetworkLoadBalancerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkMultipleTargetGroupsEc2Service(
    scope: Construct,
    id: String,
    block: NetworkMultipleTargetGroupsEc2ServiceDsl.() -> Unit = {},
  ): NetworkMultipleTargetGroupsEc2Service {
    val builder = NetworkMultipleTargetGroupsEc2ServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun networkMultipleTargetGroupsEc2ServiceProps(block: NetworkMultipleTargetGroupsEc2ServicePropsDsl.() -> Unit
      = {}): NetworkMultipleTargetGroupsEc2ServiceProps {
    val builder = NetworkMultipleTargetGroupsEc2ServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkMultipleTargetGroupsFargateService(
    scope: Construct,
    id: String,
    block: NetworkMultipleTargetGroupsFargateServiceDsl.() -> Unit = {},
  ): NetworkMultipleTargetGroupsFargateService {
    val builder = NetworkMultipleTargetGroupsFargateServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun networkMultipleTargetGroupsFargateServiceProps(block: NetworkMultipleTargetGroupsFargateServicePropsDsl.() -> Unit
      = {}): NetworkMultipleTargetGroupsFargateServiceProps {
    val builder = NetworkMultipleTargetGroupsFargateServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun networkMultipleTargetGroupsServiceBaseProps(block: NetworkMultipleTargetGroupsServiceBasePropsDsl.() -> Unit
      = {}): NetworkMultipleTargetGroupsServiceBaseProps {
    val builder = NetworkMultipleTargetGroupsServiceBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkTargetProps(block: NetworkTargetPropsDsl.() -> Unit = {}):
      NetworkTargetProps {
    val builder = NetworkTargetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun queueProcessingEc2Service(
    scope: Construct,
    id: String,
    block: QueueProcessingEc2ServiceDsl.() -> Unit = {},
  ): QueueProcessingEc2Service {
    val builder = QueueProcessingEc2ServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun queueProcessingEc2ServiceProps(block: QueueProcessingEc2ServicePropsDsl.() -> Unit = {}):
      QueueProcessingEc2ServiceProps {
    val builder = QueueProcessingEc2ServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun queueProcessingFargateService(
    scope: Construct,
    id: String,
    block: QueueProcessingFargateServiceDsl.() -> Unit = {},
  ): QueueProcessingFargateService {
    val builder = QueueProcessingFargateServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun queueProcessingFargateServiceProps(block: QueueProcessingFargateServicePropsDsl.() -> Unit
      = {}): QueueProcessingFargateServiceProps {
    val builder = QueueProcessingFargateServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun queueProcessingServiceBaseProps(block: QueueProcessingServiceBasePropsDsl.() -> Unit =
      {}): QueueProcessingServiceBaseProps {
    val builder = QueueProcessingServiceBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun scheduledEc2Task(
    scope: Construct,
    id: String,
    block: ScheduledEc2TaskDsl.() -> Unit = {},
  ): ScheduledEc2Task {
    val builder = ScheduledEc2TaskDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun scheduledEc2TaskDefinitionOptions(block: ScheduledEc2TaskDefinitionOptionsDsl.() -> Unit =
      {}): ScheduledEc2TaskDefinitionOptions {
    val builder = ScheduledEc2TaskDefinitionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun scheduledEc2TaskImageOptions(block: ScheduledEc2TaskImageOptionsDsl.() -> Unit =
      {}): ScheduledEc2TaskImageOptions {
    val builder = ScheduledEc2TaskImageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun scheduledEc2TaskProps(block: ScheduledEc2TaskPropsDsl.() -> Unit = {}):
      ScheduledEc2TaskProps {
    val builder = ScheduledEc2TaskPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun scheduledFargateTask(
    scope: Construct,
    id: String,
    block: ScheduledFargateTaskDsl.() -> Unit = {},
  ): ScheduledFargateTask {
    val builder = ScheduledFargateTaskDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun scheduledFargateTaskDefinitionOptions(block: ScheduledFargateTaskDefinitionOptionsDsl.() -> Unit
      = {}): ScheduledFargateTaskDefinitionOptions {
    val builder = ScheduledFargateTaskDefinitionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun scheduledFargateTaskImageOptions(block: ScheduledFargateTaskImageOptionsDsl.() -> Unit =
      {}): ScheduledFargateTaskImageOptions {
    val builder = ScheduledFargateTaskImageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun scheduledFargateTaskProps(block: ScheduledFargateTaskPropsDsl.() -> Unit = {}):
      ScheduledFargateTaskProps {
    val builder = ScheduledFargateTaskPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun scheduledTaskBaseProps(block: ScheduledTaskBasePropsDsl.() -> Unit = {}):
      ScheduledTaskBaseProps {
    val builder = ScheduledTaskBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun scheduledTaskImageProps(block: ScheduledTaskImagePropsDsl.() -> Unit = {}):
      ScheduledTaskImageProps {
    val builder = ScheduledTaskImagePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
