package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingInterval
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.Ec2Service
import io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.PlacementConstraint
import io.cloudshiftdev.awscdk.services.ecs.PlacementStrategy
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.Secret
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class QueueProcessingEc2Service internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service,
) : QueueProcessingServiceBase(cdkObject) {
  /**
   * The EC2 service in this construct.
   */
  public open fun service(): Ec2Service = unwrap(this).getService().let(Ec2Service::wrap)

  /**
   * The EC2 task definition in this construct.
   */
  public open fun taskDefinition(): Ec2TaskDefinition =
      unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.patterns.QueueProcessingEc2Service].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1eb7aa4699ab36b0fdc52879df2df932e1f23f9c71c88f49b89662c44eb855a1")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     *
     * @param cluster The name of the cluster that hosts the service. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     *
     * @param command The command that is passed to the container. 
     */
    public fun command(command: List<String>)

    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     *
     * @param command The command that is passed to the container. 
     */
    public fun command(vararg command: String)

    /**
     * Optional name for the container added.
     *
     * Default: - QueueProcessingContainer
     *
     * @param containerName Optional name for the container added. 
     */
    public fun containerName(containerName: String)

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
     * @param cooldown Grace period after scaling activity in seconds. 
     */
    public fun cooldown(cooldown: Duration)

    /**
     * The number of cpu units used by the task.
     *
     * Valid values, which determines your range of valid values for the memory parameter:
     *
     * 256 (.25 vCPU) - Available memory values: 0.5GB, 1GB, 2GB
     *
     * 512 (.5 vCPU) - Available memory values: 1GB, 2GB, 3GB, 4GB
     *
     * 1024 (1 vCPU) - Available memory values: 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB
     *
     * 2048 (2 vCPU) - Available memory values: Between 4GB and 16GB in 1GB increments
     *
     * 4096 (4 vCPU) - Available memory values: Between 8GB and 30GB in 1GB increments
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     *
     * Default: none
     *
     * @param cpu The number of cpu units used by the task. 
     */
    public fun cpu(cpu: Number)

    /**
     * The target CPU utilization percentage for CPU based scaling strategy when enabled.
     *
     * Default: - 50
     *
     * @param cpuTargetUtilizationPercent The target CPU utilization percentage for CPU based
     * scaling strategy when enabled. 
     */
    public fun cpuTargetUtilizationPercent(cpuTargetUtilizationPercent: Number)

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    public fun deploymentController(deploymentController: DeploymentController)

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ede7043074bb86a7a8192d6554577c5337ac2bf1a8e8a68f62deef21fc822e99")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    /**
     * Flag to disable CPU based auto scaling strategy on the service.
     *
     * Default: - false
     *
     * @param disableCpuBasedScaling Flag to disable CPU based auto scaling strategy on the service.
     * 
     */
    public fun disableCpuBasedScaling(disableCpuBasedScaling: Boolean)

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     *
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service. 
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: - false
     *
     * @param enableExecuteCommand Whether ECS Exec should be enabled. 
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * Flag to indicate whether to enable logging.
     *
     * Default: true
     *
     * @param enableLogging Flag to indicate whether to enable logging. 
     */
    public fun enableLogging(enableLogging: Boolean)

    /**
     * The environment variables to pass to the container.
     *
     * The variable `QUEUE_NAME` with value `queue.queueName` will
     * always be passed.
     *
     * Default: 'QUEUE_NAME: queue.queueName'
     *
     * @param environment The environment variables to pass to the container. 
     */
    public fun environment(environment: Map<String, String>)

    /**
     * The name of a family that the task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     *
     * Default: - Automatically generated name.
     *
     * @param family The name of a family that the task definition is registered to. 
     */
    public fun family(family: String)

    /**
     * Gpu count for container in task definition.
     *
     * Set this if you want to use gpu based instances.
     *
     * Default: - No GPUs assigned.
     *
     * @param gpuCount Gpu count for container in task definition. 
     */
    public fun gpuCount(gpuCount: Number)

    /**
     * The image used to start a container.
     *
     * For `QueueProcessingFargateService`, either `image` or `taskDefinition` must be specified,
     * but not both.
     * For `QueueProcessingEc2Service`, `image` is required.
     *
     * Default: - the image of the task definition is used for Fargate, required otherwise
     *
     * @param image The image used to start a container. 
     */
    public fun image(image: ContainerImage)

    /**
     * The log driver to use.
     *
     * Default: - AwsLogDriver if enableLogging is true
     *
     * @param logDriver The log driver to use. 
     */
    public fun logDriver(logDriver: LogDriver)

    /**
     * The maximum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that can run in a service during a deployment.
     *
     * Default: - default from underlying service.
     *
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment. 
     */
    public fun maxHealthyPercent(maxHealthyPercent: Number)

    /**
     * The maximum number of times that a message can be received by consumers.
     *
     * When this value is exceeded for a message the message will be automatically sent to the Dead
     * Letter Queue.
     *
     * If the queue construct is specified, maxReceiveCount should be omitted.
     *
     * Default: 3
     *
     * @param maxReceiveCount The maximum number of times that a message can be received by
     * consumers. 
     */
    public fun maxReceiveCount(maxReceiveCount: Number)

    /**
     * Maximum capacity to scale to.
     *
     * Default: 2
     *
     * @param maxScalingCapacity Maximum capacity to scale to. 
     */
    public fun maxScalingCapacity(maxScalingCapacity: Number)

    /**
     * The hard limit (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory limit.
     *
     * @param memoryLimitMiB The hard limit (in MiB) of memory to present to the container. 
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number)

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * When system memory is under contention, Docker attempts to keep the
     * container memory within the limit. If the container requires more memory,
     * it can consume up to the value specified by the Memory property or all of
     * the available memory on the container instance—whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory reserved.
     *
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container. 
     */
    public fun memoryReservationMiB(memoryReservationMiB: Number)

    /**
     * The minimum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that must continue to run and remain healthy during a deployment.
     *
     * Default: - default from underlying service.
     *
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment. 
     */
    public fun minHealthyPercent(minHealthyPercent: Number)

    /**
     * Minimum capacity to scale to.
     *
     * Default: 1
     *
     * @param minScalingCapacity Minimum capacity to scale to. 
     */
    public fun minScalingCapacity(minScalingCapacity: Number)

    /**
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    /**
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    public fun placementStrategies(placementStrategies: List<PlacementStrategy>)

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    public fun placementStrategies(vararg placementStrategies: PlacementStrategy)

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Tags can only be propagated to the tasks within the service during service creation.
     *
     * Default: - none
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. 
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * A queue for which to process items from.
     *
     * If specified and this is a FIFO queue, the queue name must end in the string '.fifo'. See
     * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
     *
     * Default: 'SQSQueue with CloudFormation-generated name'
     *
     * @param queue A queue for which to process items from. 
     */
    public fun queue(queue: IQueue)

    /**
     * The number of seconds that Dead Letter Queue retains a message.
     *
     * If the queue construct is specified, retentionPeriod should be omitted.
     *
     * Default: Duration.days(14)
     *
     * @param retentionPeriod The number of seconds that Dead Letter Queue retains a message. 
     */
    public fun retentionPeriod(retentionPeriod: Duration)

    /**
     * The intervals for scaling based on the SQS queue's ApproximateNumberOfMessagesVisible metric.
     *
     * Maps a range of metric values to a particular scaling behavior. See
     * [Simple and Step Scaling Policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
     *
     * Default: [{ upper: 0, change: -1 },{ lower: 100, change: +1 },{ lower: 500, change: +5 }]
     *
     * @param scalingSteps The intervals for scaling based on the SQS queue's
     * ApproximateNumberOfMessagesVisible metric. 
     */
    public fun scalingSteps(scalingSteps: List<ScalingInterval>)

    /**
     * The intervals for scaling based on the SQS queue's ApproximateNumberOfMessagesVisible metric.
     *
     * Maps a range of metric values to a particular scaling behavior. See
     * [Simple and Step Scaling Policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
     *
     * Default: [{ upper: 0, change: -1 },{ lower: 100, change: +1 },{ lower: 500, change: +5 }]
     *
     * @param scalingSteps The intervals for scaling based on the SQS queue's
     * ApproximateNumberOfMessagesVisible metric. 
     */
    public fun scalingSteps(vararg scalingSteps: ScalingInterval)

    /**
     * The secret to expose to the container as an environment variable.
     *
     * Default: - No secret environment variables.
     *
     * @param secrets The secret to expose to the container as an environment variable. 
     */
    public fun secrets(secrets: Map<String, Secret>)

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     *
     * @param serviceName The name of the service. 
     */
    public fun serviceName(serviceName: String)

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
     *
     * @param visibilityTimeout Timeout of processing a single message. 
     */
    public fun visibilityTimeout(visibilityTimeout: Duration)

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     *
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service.Builder =
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service.Builder.create(scope,
        id)

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
    }

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    override fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy): Unit =
        capacityProviderStrategies(capacityProviderStrategies.toList())

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
    }

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1eb7aa4699ab36b0fdc52879df2df932e1f23f9c71c88f49b89662c44eb855a1")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     *
     * @param cluster The name of the cluster that hosts the service. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     *
     * @param command The command that is passed to the container. 
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     *
     * @param command The command that is passed to the container. 
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * Optional name for the container added.
     *
     * Default: - QueueProcessingContainer
     *
     * @param containerName Optional name for the container added. 
     */
    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

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
     * @param cooldown Grace period after scaling activity in seconds. 
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * The number of cpu units used by the task.
     *
     * Valid values, which determines your range of valid values for the memory parameter:
     *
     * 256 (.25 vCPU) - Available memory values: 0.5GB, 1GB, 2GB
     *
     * 512 (.5 vCPU) - Available memory values: 1GB, 2GB, 3GB, 4GB
     *
     * 1024 (1 vCPU) - Available memory values: 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB
     *
     * 2048 (2 vCPU) - Available memory values: Between 4GB and 16GB in 1GB increments
     *
     * 4096 (4 vCPU) - Available memory values: Between 8GB and 30GB in 1GB increments
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     *
     * Default: none
     *
     * @param cpu The number of cpu units used by the task. 
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * The target CPU utilization percentage for CPU based scaling strategy when enabled.
     *
     * Default: - 50
     *
     * @param cpuTargetUtilizationPercent The target CPU utilization percentage for CPU based
     * scaling strategy when enabled. 
     */
    override fun cpuTargetUtilizationPercent(cpuTargetUtilizationPercent: Number) {
      cdkBuilder.cpuTargetUtilizationPercent(cpuTargetUtilizationPercent)
    }

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ede7043074bb86a7a8192d6554577c5337ac2bf1a8e8a68f62deef21fc822e99")
    override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    /**
     * Flag to disable CPU based auto scaling strategy on the service.
     *
     * Default: - false
     *
     * @param disableCpuBasedScaling Flag to disable CPU based auto scaling strategy on the service.
     * 
     */
    override fun disableCpuBasedScaling(disableCpuBasedScaling: Boolean) {
      cdkBuilder.disableCpuBasedScaling(disableCpuBasedScaling)
    }

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     *
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service. 
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: - false
     *
     * @param enableExecuteCommand Whether ECS Exec should be enabled. 
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * Flag to indicate whether to enable logging.
     *
     * Default: true
     *
     * @param enableLogging Flag to indicate whether to enable logging. 
     */
    override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    /**
     * The environment variables to pass to the container.
     *
     * The variable `QUEUE_NAME` with value `queue.queueName` will
     * always be passed.
     *
     * Default: 'QUEUE_NAME: queue.queueName'
     *
     * @param environment The environment variables to pass to the container. 
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * The name of a family that the task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     *
     * Default: - Automatically generated name.
     *
     * @param family The name of a family that the task definition is registered to. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * Gpu count for container in task definition.
     *
     * Set this if you want to use gpu based instances.
     *
     * Default: - No GPUs assigned.
     *
     * @param gpuCount Gpu count for container in task definition. 
     */
    override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    /**
     * The image used to start a container.
     *
     * For `QueueProcessingFargateService`, either `image` or `taskDefinition` must be specified,
     * but not both.
     * For `QueueProcessingEc2Service`, `image` is required.
     *
     * Default: - the image of the task definition is used for Fargate, required otherwise
     *
     * @param image The image used to start a container. 
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    /**
     * The log driver to use.
     *
     * Default: - AwsLogDriver if enableLogging is true
     *
     * @param logDriver The log driver to use. 
     */
    override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    /**
     * The maximum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that can run in a service during a deployment.
     *
     * Default: - default from underlying service.
     *
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment. 
     */
    override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    /**
     * The maximum number of times that a message can be received by consumers.
     *
     * When this value is exceeded for a message the message will be automatically sent to the Dead
     * Letter Queue.
     *
     * If the queue construct is specified, maxReceiveCount should be omitted.
     *
     * Default: 3
     *
     * @param maxReceiveCount The maximum number of times that a message can be received by
     * consumers. 
     */
    override fun maxReceiveCount(maxReceiveCount: Number) {
      cdkBuilder.maxReceiveCount(maxReceiveCount)
    }

    /**
     * Maximum capacity to scale to.
     *
     * Default: 2
     *
     * @param maxScalingCapacity Maximum capacity to scale to. 
     */
    override fun maxScalingCapacity(maxScalingCapacity: Number) {
      cdkBuilder.maxScalingCapacity(maxScalingCapacity)
    }

    /**
     * The hard limit (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory limit.
     *
     * @param memoryLimitMiB The hard limit (in MiB) of memory to present to the container. 
     */
    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * When system memory is under contention, Docker attempts to keep the
     * container memory within the limit. If the container requires more memory,
     * it can consume up to the value specified by the Memory property or all of
     * the available memory on the container instance—whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory reserved.
     *
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container. 
     */
    override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    /**
     * The minimum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that must continue to run and remain healthy during a deployment.
     *
     * Default: - default from underlying service.
     *
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment. 
     */
    override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    /**
     * Minimum capacity to scale to.
     *
     * Default: 1
     *
     * @param minScalingCapacity Minimum capacity to scale to. 
     */
    override fun minScalingCapacity(minScalingCapacity: Number) {
      cdkBuilder.minScalingCapacity(minScalingCapacity)
    }

    /**
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    /**
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    override fun placementStrategies(vararg placementStrategies: PlacementStrategy): Unit =
        placementStrategies(placementStrategies.toList())

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Tags can only be propagated to the tasks within the service during service creation.
     *
     * Default: - none
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. 
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    /**
     * A queue for which to process items from.
     *
     * If specified and this is a FIFO queue, the queue name must end in the string '.fifo'. See
     * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
     *
     * Default: 'SQSQueue with CloudFormation-generated name'
     *
     * @param queue A queue for which to process items from. 
     */
    override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue::unwrap))
    }

    /**
     * The number of seconds that Dead Letter Queue retains a message.
     *
     * If the queue construct is specified, retentionPeriod should be omitted.
     *
     * Default: Duration.days(14)
     *
     * @param retentionPeriod The number of seconds that Dead Letter Queue retains a message. 
     */
    override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    /**
     * The intervals for scaling based on the SQS queue's ApproximateNumberOfMessagesVisible metric.
     *
     * Maps a range of metric values to a particular scaling behavior. See
     * [Simple and Step Scaling Policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
     *
     * Default: [{ upper: 0, change: -1 },{ lower: 100, change: +1 },{ lower: 500, change: +5 }]
     *
     * @param scalingSteps The intervals for scaling based on the SQS queue's
     * ApproximateNumberOfMessagesVisible metric. 
     */
    override fun scalingSteps(scalingSteps: List<ScalingInterval>) {
      cdkBuilder.scalingSteps(scalingSteps.map(ScalingInterval::unwrap))
    }

    /**
     * The intervals for scaling based on the SQS queue's ApproximateNumberOfMessagesVisible metric.
     *
     * Maps a range of metric values to a particular scaling behavior. See
     * [Simple and Step Scaling Policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html)
     *
     * Default: [{ upper: 0, change: -1 },{ lower: 100, change: +1 },{ lower: 500, change: +5 }]
     *
     * @param scalingSteps The intervals for scaling based on the SQS queue's
     * ApproximateNumberOfMessagesVisible metric. 
     */
    override fun scalingSteps(vararg scalingSteps: ScalingInterval): Unit =
        scalingSteps(scalingSteps.toList())

    /**
     * The secret to expose to the container as an environment variable.
     *
     * Default: - No secret environment variables.
     *
     * @param secrets The secret to expose to the container as an environment variable. 
     */
    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     *
     * @param serviceName The name of the service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

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
     *
     * @param visibilityTimeout Timeout of processing a single message. 
     */
    override fun visibilityTimeout(visibilityTimeout: Duration) {
      cdkBuilder.visibilityTimeout(visibilityTimeout.let(Duration::unwrap))
    }

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     *
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): QueueProcessingEc2Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return QueueProcessingEc2Service(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service):
        QueueProcessingEc2Service = QueueProcessingEc2Service(cdkObject)

    internal fun unwrap(wrapped: QueueProcessingEc2Service):
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service = wrapped.cdkObject
  }
}
