@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.applicationautoscaling.ScalingIntervalDsl
import cloudshift.awscdk.dsl.services.ecs.CapacityProviderStrategyDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentCircuitBreakerDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentControllerDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.ScalingInterval
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps
import software.amazon.awscdk.services.sqs.IQueue

/**
 * The properties for the base QueueProcessingEc2Service or QueueProcessingFargateService service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.ecs.patterns.*;
 * import software.amazon.awscdk.services.sqs.*;
 * Cluster cluster;
 * ContainerImage containerImage;
 * LogDriver logDriver;
 * Queue queue;
 * Secret secret;
 * Vpc vpc;
 * QueueProcessingServiceBaseProps queueProcessingServiceBaseProps =
 * QueueProcessingServiceBaseProps.builder()
 * .image(containerImage)
 * // the properties below are optional
 * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build()))
 * .circuitBreaker(DeploymentCircuitBreaker.builder()
 * .rollback(false)
 * .build())
 * .cluster(cluster)
 * .command(List.of("command"))
 * .deploymentController(DeploymentController.builder()
 * .type(DeploymentControllerType.ECS)
 * .build())
 * .enableECSManagedTags(false)
 * .enableExecuteCommand(false)
 * .enableLogging(false)
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .family("family")
 * .logDriver(logDriver)
 * .maxHealthyPercent(123)
 * .maxReceiveCount(123)
 * .maxScalingCapacity(123)
 * .minHealthyPercent(123)
 * .minScalingCapacity(123)
 * .propagateTags(PropagatedTagSource.SERVICE)
 * .queue(queue)
 * .retentionPeriod(Duration.minutes(30))
 * .scalingSteps(List.of(ScalingInterval.builder()
 * .change(123)
 * // the properties below are optional
 * .lower(123)
 * .upper(123)
 * .build()))
 * .secrets(Map.of(
 * "secretsKey", secret))
 * .serviceName("serviceName")
 * .visibilityTimeout(Duration.minutes(30))
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class QueueProcessingServiceBasePropsDsl {
  private val cdkBuilder: QueueProcessingServiceBaseProps.Builder =
      QueueProcessingServiceBaseProps.builder()

  private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

  private val _command: MutableList<String> = mutableListOf()

  private val _scalingSteps: MutableList<ScalingInterval> = mutableListOf()

  /**
   * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
   * service.
   */
  public
      fun capacityProviderStrategies(capacityProviderStrategies: CapacityProviderStrategyDsl.() -> Unit) {
    _capacityProviderStrategies.add(CapacityProviderStrategyDsl().apply(capacityProviderStrategies).build())
  }

  /**
   * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
   * service.
   */
  public
      fun capacityProviderStrategies(capacityProviderStrategies: Collection<CapacityProviderStrategy>) {
    _capacityProviderStrategies.addAll(capacityProviderStrategies)
  }

  /**
   * @param circuitBreaker Whether to enable the deployment circuit breaker.
   * If this property is defined, circuit breaker will be implicitly
   * enabled.
   */
  public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreakerDsl.() -> Unit = {}) {
    val builder = DeploymentCircuitBreakerDsl()
    builder.apply(circuitBreaker)
    cdkBuilder.circuitBreaker(builder.build())
  }

  /**
   * @param circuitBreaker Whether to enable the deployment circuit breaker.
   * If this property is defined, circuit breaker will be implicitly
   * enabled.
   */
  public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
    cdkBuilder.circuitBreaker(circuitBreaker)
  }

  /**
   * @param cluster The name of the cluster that hosts the service.
   * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
   * both cluster and vpc.
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * @param command The command that is passed to the container.
   * If you provide a shell command as a single string, you have to quote command-line arguments.
   */
  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  /**
   * @param command The command that is passed to the container.
   * If you provide a shell command as a single string, you have to quote command-line arguments.
   */
  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  /**
   * @param deploymentController Specifies which deployment controller to use for the service.
   * For more information, see
   * [Amazon ECS Deployment
   * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
   */
  public fun deploymentController(deploymentController: DeploymentControllerDsl.() -> Unit = {}) {
    val builder = DeploymentControllerDsl()
    builder.apply(deploymentController)
    cdkBuilder.deploymentController(builder.build())
  }

  /**
   * @param deploymentController Specifies which deployment controller to use for the service.
   * For more information, see
   * [Amazon ECS Deployment
   * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
   */
  public fun deploymentController(deploymentController: DeploymentController) {
    cdkBuilder.deploymentController(deploymentController)
  }

  /**
   * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
   * within the service.
   * For more information, see
   * [Tagging Your Amazon ECS
   * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
   */
  public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
  }

  /**
   * @param enableExecuteCommand Whether ECS Exec should be enabled.
   */
  public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    cdkBuilder.enableExecuteCommand(enableExecuteCommand)
  }

  /**
   * @param enableLogging Flag to indicate whether to enable logging.
   */
  public fun enableLogging(enableLogging: Boolean) {
    cdkBuilder.enableLogging(enableLogging)
  }

  /**
   * @param environment The environment variables to pass to the container.
   * The variable `QUEUE_NAME` with value `queue.queueName` will
   * always be passed.
   */
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param family The name of a family that the task definition is registered to.
   * A family groups multiple versions of a task definition.
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * @param image The image used to start a container. 
   */
  public fun image(image: ContainerImage) {
    cdkBuilder.image(image)
  }

  /**
   * @param logDriver The log driver to use.
   */
  public fun logDriver(logDriver: LogDriver) {
    cdkBuilder.logDriver(logDriver)
  }

  /**
   * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
   * ECS service's DesiredCount value, that can run in a service during a deployment.
   */
  public fun maxHealthyPercent(maxHealthyPercent: Number) {
    cdkBuilder.maxHealthyPercent(maxHealthyPercent)
  }

  /**
   * @param maxReceiveCount The maximum number of times that a message can be received by consumers.
   * When this value is exceeded for a message the message will be automatically sent to the Dead
   * Letter Queue.
   *
   * If the queue construct is specified, maxReceiveCount should be omitted.
   */
  public fun maxReceiveCount(maxReceiveCount: Number) {
    cdkBuilder.maxReceiveCount(maxReceiveCount)
  }

  /**
   * @param maxScalingCapacity Maximum capacity to scale to.
   */
  public fun maxScalingCapacity(maxScalingCapacity: Number) {
    cdkBuilder.maxScalingCapacity(maxScalingCapacity)
  }

  /**
   * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
   * ECS service's DesiredCount value, that must continue to run and remain healthy during a
   * deployment.
   */
  public fun minHealthyPercent(minHealthyPercent: Number) {
    cdkBuilder.minHealthyPercent(minHealthyPercent)
  }

  /**
   * @param minScalingCapacity Minimum capacity to scale to.
   */
  public fun minScalingCapacity(minScalingCapacity: Number) {
    cdkBuilder.minScalingCapacity(minScalingCapacity)
  }

  /**
   * @param propagateTags Specifies whether to propagate the tags from the task definition or the
   * service to the tasks in the service.
   * Tags can only be propagated to the tasks within the service during service creation.
   */
  public fun propagateTags(propagateTags: PropagatedTagSource) {
    cdkBuilder.propagateTags(propagateTags)
  }

  /**
   * @param queue A queue for which to process items from.
   * If specified and this is a FIFO queue, the queue name must end in the string '.fifo'. See
   * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
   */
  public fun queue(queue: IQueue) {
    cdkBuilder.queue(queue)
  }

  /**
   * @param retentionPeriod The number of seconds that Dead Letter Queue retains a message.
   * If the queue construct is specified, retentionPeriod should be omitted.
   */
  public fun retentionPeriod(retentionPeriod: Duration) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  /**
   * @param scalingSteps The intervals for scaling based on the SQS queue's
   * ApproximateNumberOfMessagesVisible metric.
   * Maps a range of metric values to a particular scaling behavior. See
   * [Simple and Step Scaling Policies for Amazon EC2 Auto
   * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
   */
  public fun scalingSteps(scalingSteps: ScalingIntervalDsl.() -> Unit) {
    _scalingSteps.add(ScalingIntervalDsl().apply(scalingSteps).build())
  }

  /**
   * @param scalingSteps The intervals for scaling based on the SQS queue's
   * ApproximateNumberOfMessagesVisible metric.
   * Maps a range of metric values to a particular scaling behavior. See
   * [Simple and Step Scaling Policies for Amazon EC2 Auto
   * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
   */
  public fun scalingSteps(scalingSteps: Collection<ScalingInterval>) {
    _scalingSteps.addAll(scalingSteps)
  }

  /**
   * @param secrets The secret to expose to the container as an environment variable.
   */
  public fun secrets(secrets: Map<String, Secret>) {
    cdkBuilder.secrets(secrets)
  }

  /**
   * @param serviceName The name of the service.
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  /**
   * @param visibilityTimeout Timeout of processing a single message.
   * After dequeuing, the processor has this much time to handle the message and delete it from the
   * queue
   * before it becomes visible again for dequeueing by another processor. Values must be between 0
   * and (12 hours).
   *
   * If the queue construct is specified, visibilityTimeout should be omitted.
   */
  public fun visibilityTimeout(visibilityTimeout: Duration) {
    cdkBuilder.visibilityTimeout(visibilityTimeout)
  }

  /**
   * @param vpc The VPC where the container instances will be launched or the elastic network
   * interfaces (ENIs) will be deployed.
   * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
   * both vpc and cluster.
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): QueueProcessingServiceBaseProps {
    if(_capacityProviderStrategies.isNotEmpty())
        cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_scalingSteps.isNotEmpty()) cdkBuilder.scalingSteps(_scalingSteps)
    return cdkBuilder.build()
  }
}
