package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Ec2TaskDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinition,
) : TaskDefinition(cdkObject), IEc2TaskDefinition {
  /**
   * Tasks running in AWSVPC networking mode requires an additional environment variable for the
   * region to be sourced.
   *
   * This override adds in the additional environment variable as required
   *
   * @param id 
   * @param props 
   */
  public override fun addContainer(id: String, props: ContainerDefinitionOptions):
      ContainerDefinition = unwrap(this).addContainer(id,
      props.let(ContainerDefinitionOptions::unwrap)).let(ContainerDefinition::wrap)

  /**
   * Tasks running in AWSVPC networking mode requires an additional environment variable for the
   * region to be sourced.
   *
   * This override adds in the additional environment variable as required
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad60dadcf6b5a99535d38733285d125986065c711b1844893efc32b804589a91")
  public override fun addContainer(id: String,
      props: ContainerDefinitionOptions.Builder.() -> Unit): ContainerDefinition = addContainer(id,
      ContainerDefinitionOptions(props))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the IAM task execution role that grants the ECS agent permission to call AWS APIs
     * on your behalf.
     *
     * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
     *
     * Default: - An execution role will be automatically created if you use ECR images in your task
     * definition.
     *
     * @param executionRole The name of the IAM task execution role that grants the ECS agent
     * permission to call AWS APIs on your behalf. 
     */
    public fun executionRole(executionRole: IRole)

    /**
     * The name of a family that this task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     *
     * Default: - Automatically generated name.
     *
     * @param family The name of a family that this task definition is registered to. 
     */
    public fun family(family: String)

    /**
     * The inference accelerators to use for the containers in the task.
     *
     * Not supported in Fargate.
     *
     * Default: - No inference accelerators.
     *
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task. 
     */
    public fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>)

    /**
     * The inference accelerators to use for the containers in the task.
     *
     * Not supported in Fargate.
     *
     * Default: - No inference accelerators.
     *
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task. 
     */
    public fun inferenceAccelerators(vararg inferenceAccelerators: InferenceAccelerator)

    /**
     * The IPC resource namespace to use for the containers in the task.
     *
     * Not supported in Fargate and Windows containers.
     *
     * Default: - IpcMode used by the task is not specified
     *
     * @param ipcMode The IPC resource namespace to use for the containers in the task. 
     */
    public fun ipcMode(ipcMode: IpcMode)

    /**
     * The Docker networking mode to use for the containers in the task.
     *
     * The valid values are NONE, BRIDGE, AWS_VPC, and HOST.
     *
     * Default: - NetworkMode.BRIDGE for EC2 tasks, AWS_VPC for Fargate tasks.
     *
     * @param networkMode The Docker networking mode to use for the containers in the task. 
     */
    public fun networkMode(networkMode: NetworkMode)

    /**
     * The process namespace to use for the containers in the task.
     *
     * Not supported in Fargate and Windows containers.
     *
     * Default: - PidMode used by the task is not specified
     *
     * @param pidMode The process namespace to use for the containers in the task. 
     */
    public fun pidMode(pidMode: PidMode)

    /**
     * An array of placement constraint objects to use for the task.
     *
     * You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     *
     * Default: - No placement constraints.
     *
     * @param placementConstraints An array of placement constraint objects to use for the task. 
     */
    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    /**
     * An array of placement constraint objects to use for the task.
     *
     * You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     *
     * Default: - No placement constraints.
     *
     * @param placementConstraints An array of placement constraint objects to use for the task. 
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Default: - No proxy configuration.
     *
     * @param proxyConfiguration The configuration details for the App Mesh proxy. 
     */
    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration)

    /**
     * The name of the IAM role that grants containers in the task permission to call AWS APIs on
     * your behalf.
     *
     * Default: - A task role is automatically created for you.
     *
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     * call AWS APIs on your behalf. 
     */
    public fun taskRole(taskRole: IRole)

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     *
     * @param volumes The list of volume definitions for the task. 
     */
    public fun volumes(volumes: List<Volume>)

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     *
     * @param volumes The list of volume definitions for the task. 
     */
    public fun volumes(vararg volumes: Volume)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ec2TaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.Ec2TaskDefinition.Builder.create(scope, id)

    /**
     * The name of the IAM task execution role that grants the ECS agent permission to call AWS APIs
     * on your behalf.
     *
     * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
     *
     * Default: - An execution role will be automatically created if you use ECR images in your task
     * definition.
     *
     * @param executionRole The name of the IAM task execution role that grants the ECS agent
     * permission to call AWS APIs on your behalf. 
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    /**
     * The name of a family that this task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     *
     * Default: - Automatically generated name.
     *
     * @param family The name of a family that this task definition is registered to. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * The inference accelerators to use for the containers in the task.
     *
     * Not supported in Fargate.
     *
     * Default: - No inference accelerators.
     *
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task. 
     */
    override fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators.map(InferenceAccelerator::unwrap))
    }

    /**
     * The inference accelerators to use for the containers in the task.
     *
     * Not supported in Fargate.
     *
     * Default: - No inference accelerators.
     *
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task. 
     */
    override fun inferenceAccelerators(vararg inferenceAccelerators: InferenceAccelerator): Unit =
        inferenceAccelerators(inferenceAccelerators.toList())

    /**
     * The IPC resource namespace to use for the containers in the task.
     *
     * Not supported in Fargate and Windows containers.
     *
     * Default: - IpcMode used by the task is not specified
     *
     * @param ipcMode The IPC resource namespace to use for the containers in the task. 
     */
    override fun ipcMode(ipcMode: IpcMode) {
      cdkBuilder.ipcMode(ipcMode.let(IpcMode::unwrap))
    }

    /**
     * The Docker networking mode to use for the containers in the task.
     *
     * The valid values are NONE, BRIDGE, AWS_VPC, and HOST.
     *
     * Default: - NetworkMode.BRIDGE for EC2 tasks, AWS_VPC for Fargate tasks.
     *
     * @param networkMode The Docker networking mode to use for the containers in the task. 
     */
    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    /**
     * The process namespace to use for the containers in the task.
     *
     * Not supported in Fargate and Windows containers.
     *
     * Default: - PidMode used by the task is not specified
     *
     * @param pidMode The process namespace to use for the containers in the task. 
     */
    override fun pidMode(pidMode: PidMode) {
      cdkBuilder.pidMode(pidMode.let(PidMode::unwrap))
    }

    /**
     * An array of placement constraint objects to use for the task.
     *
     * You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     *
     * Default: - No placement constraints.
     *
     * @param placementConstraints An array of placement constraint objects to use for the task. 
     */
    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    /**
     * An array of placement constraint objects to use for the task.
     *
     * You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     *
     * Default: - No placement constraints.
     *
     * @param placementConstraints An array of placement constraint objects to use for the task. 
     */
    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Default: - No proxy configuration.
     *
     * @param proxyConfiguration The configuration details for the App Mesh proxy. 
     */
    override fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfiguration::unwrap))
    }

    /**
     * The name of the IAM role that grants containers in the task permission to call AWS APIs on
     * your behalf.
     *
     * Default: - A task role is automatically created for you.
     *
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     * call AWS APIs on your behalf. 
     */
    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     *
     * @param volumes The list of volume definitions for the task. 
     */
    override fun volumes(volumes: List<Volume>) {
      cdkBuilder.volumes(volumes.map(Volume::unwrap))
    }

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     *
     * @param volumes The list of volume definitions for the task. 
     */
    override fun volumes(vararg volumes: Volume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ecs.Ec2TaskDefinition = cdkBuilder.build()
  }

  public companion object {
    public fun fromEc2TaskDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      ec2TaskDefinitionArn: String,
    ): IEc2TaskDefinition =
        software.amazon.awscdk.services.ecs.Ec2TaskDefinition.fromEc2TaskDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, ec2TaskDefinitionArn).let(IEc2TaskDefinition::wrap)

    public fun fromEc2TaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: Ec2TaskDefinitionAttributes,
    ): IEc2TaskDefinition =
        software.amazon.awscdk.services.ecs.Ec2TaskDefinition.fromEc2TaskDefinitionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(Ec2TaskDefinitionAttributes::unwrap)).let(IEc2TaskDefinition::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("831e03cd1177ff8a7b26c4aea6d55da95fb064478c439f83bd74f417450d0e79")
    public fun fromEc2TaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: Ec2TaskDefinitionAttributes.Builder.() -> Unit,
    ): IEc2TaskDefinition = fromEc2TaskDefinitionAttributes(scope, id,
        Ec2TaskDefinitionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Ec2TaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Ec2TaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinition):
        Ec2TaskDefinition = Ec2TaskDefinition(cdkObject)

    internal fun unwrap(wrapped: Ec2TaskDefinition):
        software.amazon.awscdk.services.ecs.Ec2TaskDefinition = wrapped.cdkObject
  }
}
