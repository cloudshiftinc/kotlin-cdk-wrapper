@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingInterval
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.Secret
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * The properties for the base QueueProcessingEc2Service or QueueProcessingFargateService service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Cluster cluster;
 * ContainerImage containerImage;
 * LogDriver logDriver;
 * Queue queue;
 * Secret secret;
 * Vpc vpc;
 * QueueProcessingServiceBaseProps queueProcessingServiceBaseProps =
 * QueueProcessingServiceBaseProps.builder()
 * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build()))
 * .circuitBreaker(DeploymentCircuitBreaker.builder()
 * .enable(false)
 * .rollback(false)
 * .build())
 * .cluster(cluster)
 * .command(List.of("command"))
 * .cooldown(Duration.minutes(30))
 * .cpuTargetUtilizationPercent(123)
 * .deploymentController(DeploymentController.builder()
 * .type(DeploymentControllerType.ECS)
 * .build())
 * .disableCpuBasedScaling(false)
 * .enableECSManagedTags(false)
 * .enableExecuteCommand(false)
 * .enableLogging(false)
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .family("family")
 * .image(containerImage)
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
public interface QueueProcessingServiceBaseProps {
  /**
   * A list of Capacity Provider strategies used to place a service.
   *
   * Default: - undefined
   */
  public fun capacityProviderStrategies(): List<CapacityProviderStrategy> =
      unwrap(this).getCapacityProviderStrategies()?.map(CapacityProviderStrategy::wrap) ?:
      emptyList()

  /**
   * Whether to enable the deployment circuit breaker.
   *
   * If this property is defined, circuit breaker will be implicitly
   * enabled.
   *
   * Default: - disabled
   */
  public fun circuitBreaker(): DeploymentCircuitBreaker? =
      unwrap(this).getCircuitBreaker()?.let(DeploymentCircuitBreaker::wrap)

  /**
   * The name of the cluster that hosts the service.
   *
   * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
   * both cluster and vpc.
   *
   * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be created
   * for you.
   */
  public fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

  /**
   * The command that is passed to the container.
   *
   * If you provide a shell command as a single string, you have to quote command-line arguments.
   *
   * Default: - CMD value built into container image.
   */
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * Grace period after scaling activity in seconds.
   *
   * Subsequent scale outs during the cooldown period are squashed so that only
   * the biggest scale out happens.
   *
   * Subsequent scale ins during the cooldown period are ignored.
   *
   * Default: 300 seconds
   *
   * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
   */
  public fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

  /**
   * The target CPU utilization percentage for CPU based scaling strategy when enabled.
   *
   * Default: - 50
   */
  public fun cpuTargetUtilizationPercent(): Number? = unwrap(this).getCpuTargetUtilizationPercent()

  /**
   * Specifies which deployment controller to use for the service.
   *
   * For more information, see
   * [Amazon ECS Deployment
   * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
   *
   * Default: - Rolling update (ECS)
   */
  public fun deploymentController(): DeploymentController? =
      unwrap(this).getDeploymentController()?.let(DeploymentController::wrap)

  /**
   * Flag to disable CPU based auto scaling strategy on the service.
   *
   * Default: - false
   */
  public fun disableCpuBasedScaling(): Boolean? = unwrap(this).getDisableCpuBasedScaling()

  /**
   * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
   *
   * For more information, see
   * [Tagging Your Amazon ECS
   * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
   *
   * Default: false
   */
  public fun enableEcsManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

  /**
   * Whether ECS Exec should be enabled.
   *
   * Default: - false
   */
  public fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

  /**
   * Flag to indicate whether to enable logging.
   *
   * Default: true
   */
  public fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

  /**
   * The environment variables to pass to the container.
   *
   * The variable `QUEUE_NAME` with value `queue.queueName` will
   * always be passed.
   *
   * Default: 'QUEUE_NAME: queue.queueName'
   */
  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * The name of a family that the task definition is registered to.
   *
   * A family groups multiple versions of a task definition.
   *
   * Default: - Automatically generated name.
   */
  public fun family(): String? = unwrap(this).getFamily()

  /**
   * The image used to start a container.
   *
   * For `QueueProcessingFargateService`, either `image` or `taskDefinition` must be specified, but
   * not both.
   * For `QueueProcessingEc2Service`, `image` is required.
   *
   * Default: - the image of the task definition is used for Fargate, required otherwise
   */
  public fun image(): ContainerImage? = unwrap(this).getImage()?.let(ContainerImage::wrap)

  /**
   * The log driver to use.
   *
   * Default: - AwsLogDriver if enableLogging is true
   */
  public fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

  /**
   * The maximum number of tasks, specified as a percentage of the Amazon ECS service's DesiredCount
   * value, that can run in a service during a deployment.
   *
   * Default: - default from underlying service.
   */
  public fun maxHealthyPercent(): Number? = unwrap(this).getMaxHealthyPercent()

  /**
   * The maximum number of times that a message can be received by consumers.
   *
   * When this value is exceeded for a message the message will be automatically sent to the Dead
   * Letter Queue.
   *
   * If the queue construct is specified, maxReceiveCount should be omitted.
   *
   * Default: 3
   */
  public fun maxReceiveCount(): Number? = unwrap(this).getMaxReceiveCount()

  /**
   * Maximum capacity to scale to.
   *
   * Default: 2
   */
  public fun maxScalingCapacity(): Number? = unwrap(this).getMaxScalingCapacity()

  /**
   * The minimum number of tasks, specified as a percentage of the Amazon ECS service's DesiredCount
   * value, that must continue to run and remain healthy during a deployment.
   *
   * Default: - default from underlying service.
   */
  public fun minHealthyPercent(): Number? = unwrap(this).getMinHealthyPercent()

  /**
   * Minimum capacity to scale to.
   *
   * Default: 1
   */
  public fun minScalingCapacity(): Number? = unwrap(this).getMinScalingCapacity()

  /**
   * Specifies whether to propagate the tags from the task definition or the service to the tasks in
   * the service.
   *
   * Tags can only be propagated to the tasks within the service during service creation.
   *
   * Default: - none
   */
  public fun propagateTags(): PropagatedTagSource? =
      unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

  /**
   * A queue for which to process items from.
   *
   * If specified and this is a FIFO queue, the queue name must end in the string '.fifo'. See
   * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
   *
   * Default: 'SQSQueue with CloudFormation-generated name'
   */
  public fun queue(): IQueue? = unwrap(this).getQueue()?.let(IQueue::wrap)

  /**
   * The number of seconds that Dead Letter Queue retains a message.
   *
   * If the queue construct is specified, retentionPeriod should be omitted.
   *
   * Default: Duration.days(14)
   */
  public fun retentionPeriod(): Duration? = unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

  /**
   * The intervals for scaling based on the SQS queue's ApproximateNumberOfMessagesVisible metric.
   *
   * Maps a range of metric values to a particular scaling behavior. See
   * [Simple and Step Scaling Policies for Amazon EC2 Auto
   * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
   *
   * Default: [{ upper: 0, change: -1 },{ lower: 100, change: +1 },{ lower: 500, change: +5 }]
   */
  public fun scalingSteps(): List<ScalingInterval> =
      unwrap(this).getScalingSteps()?.map(ScalingInterval::wrap) ?: emptyList()

  /**
   * The secret to expose to the container as an environment variable.
   *
   * Default: - No secret environment variables.
   */
  public fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  /**
   * The name of the service.
   *
   * Default: - CloudFormation-generated name.
   */
  public fun serviceName(): String? = unwrap(this).getServiceName()

  /**
   * Timeout of processing a single message.
   *
   * After dequeuing, the processor has this much time to handle the message and delete it from the
   * queue
   * before it becomes visible again for dequeueing by another processor. Values must be between 0
   * and (12 hours).
   *
   * If the queue construct is specified, visibilityTimeout should be omitted.
   *
   * Default: Duration.seconds(30)
   */
  public fun visibilityTimeout(): Duration? =
      unwrap(this).getVisibilityTimeout()?.let(Duration::wrap)

  /**
   * The VPC where the container instances will be launched or the elastic network interfaces (ENIs)
   * will be deployed.
   *
   * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
   * both vpc and cluster.
   *
   * Default: - uses the VPC defined in the cluster or creates a new VPC.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [QueueProcessingServiceBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec0151eae139d65754451a6dd22c9104160b1e8545fa1b0e72eb9574ee2906d4")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    public fun command(command: List<String>)

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    public fun command(vararg command: String)

    /**
     * @param cooldown Grace period after scaling activity in seconds.
     * Subsequent scale outs during the cooldown period are squashed so that only
     * the biggest scale out happens.
     *
     * Subsequent scale ins during the cooldown period are ignored.
     */
    public fun cooldown(cooldown: Duration)

    /**
     * @param cpuTargetUtilizationPercent The target CPU utilization percentage for CPU based
     * scaling strategy when enabled.
     */
    public fun cpuTargetUtilizationPercent(cpuTargetUtilizationPercent: Number)

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    public fun deploymentController(deploymentController: DeploymentController)

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d96b5da453b88694b2f95453b1f05f09c444ad2a4bba51bd03bcb14c41c156bb")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    /**
     * @param disableCpuBasedScaling Flag to disable CPU based auto scaling strategy on the service.
     */
    public fun disableCpuBasedScaling(disableCpuBasedScaling: Boolean)

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service.
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * @param enableExecuteCommand Whether ECS Exec should be enabled.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * @param enableLogging Flag to indicate whether to enable logging.
     */
    public fun enableLogging(enableLogging: Boolean)

    /**
     * @param environment The environment variables to pass to the container.
     * The variable `QUEUE_NAME` with value `queue.queueName` will
     * always be passed.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param family The name of a family that the task definition is registered to.
     * A family groups multiple versions of a task definition.
     */
    public fun family(family: String)

    /**
     * @param image The image used to start a container.
     * For `QueueProcessingFargateService`, either `image` or `taskDefinition` must be specified,
     * but not both.
     * For `QueueProcessingEc2Service`, `image` is required.
     */
    public fun image(image: ContainerImage)

    /**
     * @param logDriver The log driver to use.
     */
    public fun logDriver(logDriver: LogDriver)

    /**
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment.
     */
    public fun maxHealthyPercent(maxHealthyPercent: Number)

    /**
     * @param maxReceiveCount The maximum number of times that a message can be received by
     * consumers.
     * When this value is exceeded for a message the message will be automatically sent to the Dead
     * Letter Queue.
     *
     * If the queue construct is specified, maxReceiveCount should be omitted.
     */
    public fun maxReceiveCount(maxReceiveCount: Number)

    /**
     * @param maxScalingCapacity Maximum capacity to scale to.
     */
    public fun maxScalingCapacity(maxScalingCapacity: Number)

    /**
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment.
     */
    public fun minHealthyPercent(minHealthyPercent: Number)

    /**
     * @param minScalingCapacity Minimum capacity to scale to.
     */
    public fun minScalingCapacity(minScalingCapacity: Number)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Tags can only be propagated to the tasks within the service during service creation.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * @param queue A queue for which to process items from.
     * If specified and this is a FIFO queue, the queue name must end in the string '.fifo'. See
     * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
     */
    public fun queue(queue: IQueue)

    /**
     * @param retentionPeriod The number of seconds that Dead Letter Queue retains a message.
     * If the queue construct is specified, retentionPeriod should be omitted.
     */
    public fun retentionPeriod(retentionPeriod: Duration)

    /**
     * @param scalingSteps The intervals for scaling based on the SQS queue's
     * ApproximateNumberOfMessagesVisible metric.
     * Maps a range of metric values to a particular scaling behavior. See
     * [Simple and Step Scaling Policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
     */
    public fun scalingSteps(scalingSteps: List<ScalingInterval>)

    /**
     * @param scalingSteps The intervals for scaling based on the SQS queue's
     * ApproximateNumberOfMessagesVisible metric.
     * Maps a range of metric values to a particular scaling behavior. See
     * [Simple and Step Scaling Policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
     */
    public fun scalingSteps(vararg scalingSteps: ScalingInterval)

    /**
     * @param secrets The secret to expose to the container as an environment variable.
     */
    public fun secrets(secrets: Map<String, Secret>)

    /**
     * @param serviceName The name of the service.
     */
    public fun serviceName(serviceName: String)

    /**
     * @param visibilityTimeout Timeout of processing a single message.
     * After dequeuing, the processor has this much time to handle the message and delete it from
     * the queue
     * before it becomes visible again for dequeueing by another processor. Values must be between 0
     * and (12 hours).
     *
     * If the queue construct is specified, visibilityTimeout should be omitted.
     */
    public fun visibilityTimeout(visibilityTimeout: Duration)

    /**
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed.
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps.builder()

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
    }

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    override fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy): Unit =
        capacityProviderStrategies(capacityProviderStrategies.toList())

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
    }

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec0151eae139d65754451a6dd22c9104160b1e8545fa1b0e72eb9574ee2906d4")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param cooldown Grace period after scaling activity in seconds.
     * Subsequent scale outs during the cooldown period are squashed so that only
     * the biggest scale out happens.
     *
     * Subsequent scale ins during the cooldown period are ignored.
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * @param cpuTargetUtilizationPercent The target CPU utilization percentage for CPU based
     * scaling strategy when enabled.
     */
    override fun cpuTargetUtilizationPercent(cpuTargetUtilizationPercent: Number) {
      cdkBuilder.cpuTargetUtilizationPercent(cpuTargetUtilizationPercent)
    }

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d96b5da453b88694b2f95453b1f05f09c444ad2a4bba51bd03bcb14c41c156bb")
    override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    /**
     * @param disableCpuBasedScaling Flag to disable CPU based auto scaling strategy on the service.
     */
    override fun disableCpuBasedScaling(disableCpuBasedScaling: Boolean) {
      cdkBuilder.disableCpuBasedScaling(disableCpuBasedScaling)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service.
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * @param enableExecuteCommand Whether ECS Exec should be enabled.
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param enableLogging Flag to indicate whether to enable logging.
     */
    override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    /**
     * @param environment The environment variables to pass to the container.
     * The variable `QUEUE_NAME` with value `queue.queueName` will
     * always be passed.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param family The name of a family that the task definition is registered to.
     * A family groups multiple versions of a task definition.
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param image The image used to start a container.
     * For `QueueProcessingFargateService`, either `image` or `taskDefinition` must be specified,
     * but not both.
     * For `QueueProcessingEc2Service`, `image` is required.
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    /**
     * @param logDriver The log driver to use.
     */
    override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    /**
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment.
     */
    override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    /**
     * @param maxReceiveCount The maximum number of times that a message can be received by
     * consumers.
     * When this value is exceeded for a message the message will be automatically sent to the Dead
     * Letter Queue.
     *
     * If the queue construct is specified, maxReceiveCount should be omitted.
     */
    override fun maxReceiveCount(maxReceiveCount: Number) {
      cdkBuilder.maxReceiveCount(maxReceiveCount)
    }

    /**
     * @param maxScalingCapacity Maximum capacity to scale to.
     */
    override fun maxScalingCapacity(maxScalingCapacity: Number) {
      cdkBuilder.maxScalingCapacity(maxScalingCapacity)
    }

    /**
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment.
     */
    override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    /**
     * @param minScalingCapacity Minimum capacity to scale to.
     */
    override fun minScalingCapacity(minScalingCapacity: Number) {
      cdkBuilder.minScalingCapacity(minScalingCapacity)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Tags can only be propagated to the tasks within the service during service creation.
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    /**
     * @param queue A queue for which to process items from.
     * If specified and this is a FIFO queue, the queue name must end in the string '.fifo'. See
     * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
     */
    override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue::unwrap))
    }

    /**
     * @param retentionPeriod The number of seconds that Dead Letter Queue retains a message.
     * If the queue construct is specified, retentionPeriod should be omitted.
     */
    override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    /**
     * @param scalingSteps The intervals for scaling based on the SQS queue's
     * ApproximateNumberOfMessagesVisible metric.
     * Maps a range of metric values to a particular scaling behavior. See
     * [Simple and Step Scaling Policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
     */
    override fun scalingSteps(scalingSteps: List<ScalingInterval>) {
      cdkBuilder.scalingSteps(scalingSteps.map(ScalingInterval::unwrap))
    }

    /**
     * @param scalingSteps The intervals for scaling based on the SQS queue's
     * ApproximateNumberOfMessagesVisible metric.
     * Maps a range of metric values to a particular scaling behavior. See
     * [Simple and Step Scaling Policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
     */
    override fun scalingSteps(vararg scalingSteps: ScalingInterval): Unit =
        scalingSteps(scalingSteps.toList())

    /**
     * @param secrets The secret to expose to the container as an environment variable.
     */
    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    /**
     * @param serviceName The name of the service.
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param visibilityTimeout Timeout of processing a single message.
     * After dequeuing, the processor has this much time to handle the message and delete it from
     * the queue
     * before it becomes visible again for dequeueing by another processor. Values must be between 0
     * and (12 hours).
     *
     * If the queue construct is specified, visibilityTimeout should be omitted.
     */
    override fun visibilityTimeout(visibilityTimeout: Duration) {
      cdkBuilder.visibilityTimeout(visibilityTimeout.let(Duration::unwrap))
    }

    /**
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed.
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps,
  ) : CdkObject(cdkObject), QueueProcessingServiceBaseProps {
    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     */
    override fun capacityProviderStrategies(): List<CapacityProviderStrategy> =
        unwrap(this).getCapacityProviderStrategies()?.map(CapacityProviderStrategy::wrap) ?:
        emptyList()

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     */
    override fun circuitBreaker(): DeploymentCircuitBreaker? =
        unwrap(this).getCircuitBreaker()?.let(DeploymentCircuitBreaker::wrap)

    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     */
    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * Grace period after scaling activity in seconds.
     *
     * Subsequent scale outs during the cooldown period are squashed so that only
     * the biggest scale out happens.
     *
     * Subsequent scale ins during the cooldown period are ignored.
     *
     * Default: 300 seconds
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
     */
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    /**
     * The target CPU utilization percentage for CPU based scaling strategy when enabled.
     *
     * Default: - 50
     */
    override fun cpuTargetUtilizationPercent(): Number? =
        unwrap(this).getCpuTargetUtilizationPercent()

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     */
    override fun deploymentController(): DeploymentController? =
        unwrap(this).getDeploymentController()?.let(DeploymentController::wrap)

    /**
     * Flag to disable CPU based auto scaling strategy on the service.
     *
     * Default: - false
     */
    override fun disableCpuBasedScaling(): Boolean? = unwrap(this).getDisableCpuBasedScaling()

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     */
    override fun enableEcsManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: - false
     */
    override fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

    /**
     * Flag to indicate whether to enable logging.
     *
     * Default: true
     */
    override fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

    /**
     * The environment variables to pass to the container.
     *
     * The variable `QUEUE_NAME` with value `queue.queueName` will
     * always be passed.
     *
     * Default: 'QUEUE_NAME: queue.queueName'
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The name of a family that the task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     *
     * Default: - Automatically generated name.
     */
    override fun family(): String? = unwrap(this).getFamily()

    /**
     * The image used to start a container.
     *
     * For `QueueProcessingFargateService`, either `image` or `taskDefinition` must be specified,
     * but not both.
     * For `QueueProcessingEc2Service`, `image` is required.
     *
     * Default: - the image of the task definition is used for Fargate, required otherwise
     */
    override fun image(): ContainerImage? = unwrap(this).getImage()?.let(ContainerImage::wrap)

    /**
     * The log driver to use.
     *
     * Default: - AwsLogDriver if enableLogging is true
     */
    override fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

    /**
     * The maximum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that can run in a service during a deployment.
     *
     * Default: - default from underlying service.
     */
    override fun maxHealthyPercent(): Number? = unwrap(this).getMaxHealthyPercent()

    /**
     * The maximum number of times that a message can be received by consumers.
     *
     * When this value is exceeded for a message the message will be automatically sent to the Dead
     * Letter Queue.
     *
     * If the queue construct is specified, maxReceiveCount should be omitted.
     *
     * Default: 3
     */
    override fun maxReceiveCount(): Number? = unwrap(this).getMaxReceiveCount()

    /**
     * Maximum capacity to scale to.
     *
     * Default: 2
     */
    override fun maxScalingCapacity(): Number? = unwrap(this).getMaxScalingCapacity()

    /**
     * The minimum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that must continue to run and remain healthy during a deployment.
     *
     * Default: - default from underlying service.
     */
    override fun minHealthyPercent(): Number? = unwrap(this).getMinHealthyPercent()

    /**
     * Minimum capacity to scale to.
     *
     * Default: 1
     */
    override fun minScalingCapacity(): Number? = unwrap(this).getMinScalingCapacity()

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Tags can only be propagated to the tasks within the service during service creation.
     *
     * Default: - none
     */
    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    /**
     * A queue for which to process items from.
     *
     * If specified and this is a FIFO queue, the queue name must end in the string '.fifo'. See
     * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
     *
     * Default: 'SQSQueue with CloudFormation-generated name'
     */
    override fun queue(): IQueue? = unwrap(this).getQueue()?.let(IQueue::wrap)

    /**
     * The number of seconds that Dead Letter Queue retains a message.
     *
     * If the queue construct is specified, retentionPeriod should be omitted.
     *
     * Default: Duration.days(14)
     */
    override fun retentionPeriod(): Duration? =
        unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

    /**
     * The intervals for scaling based on the SQS queue's ApproximateNumberOfMessagesVisible metric.
     *
     * Maps a range of metric values to a particular scaling behavior. See
     * [Simple and Step Scaling Policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
     *
     * Default: [{ upper: 0, change: -1 },{ lower: 100, change: +1 },{ lower: 500, change: +5 }]
     */
    override fun scalingSteps(): List<ScalingInterval> =
        unwrap(this).getScalingSteps()?.map(ScalingInterval::wrap) ?: emptyList()

    /**
     * The secret to expose to the container as an environment variable.
     *
     * Default: - No secret environment variables.
     */
    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     */
    override fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * Timeout of processing a single message.
     *
     * After dequeuing, the processor has this much time to handle the message and delete it from
     * the queue
     * before it becomes visible again for dequeueing by another processor. Values must be between 0
     * and (12 hours).
     *
     * If the queue construct is specified, visibilityTimeout should be omitted.
     *
     * Default: Duration.seconds(30)
     */
    override fun visibilityTimeout(): Duration? =
        unwrap(this).getVisibilityTimeout()?.let(Duration::wrap)

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueueProcessingServiceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps):
        QueueProcessingServiceBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueueProcessingServiceBaseProps):
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps
  }
}
