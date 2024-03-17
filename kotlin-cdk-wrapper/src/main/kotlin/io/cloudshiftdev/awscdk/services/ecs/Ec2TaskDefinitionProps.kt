@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The properties for a task definition run on an EC2 cluster.
 *
 * Example:
 *
 * ```
 * Ec2TaskDefinition ec2TaskDefinition = Ec2TaskDefinition.Builder.create(this, "TaskDef")
 * .networkMode(NetworkMode.BRIDGE)
 * .build();
 * ContainerDefinition container = ec2TaskDefinition.addContainer("WebContainer",
 * ContainerDefinitionOptions.builder()
 * // Use an image from DockerHub
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryLimitMiB(1024)
 * .build());
 * ```
 */
public interface Ec2TaskDefinitionProps : CommonTaskDefinitionProps {
  /**
   * The inference accelerators to use for the containers in the task.
   *
   * Not supported in Fargate.
   *
   * Default: - No inference accelerators.
   */
  public fun inferenceAccelerators(): List<InferenceAccelerator> =
      unwrap(this).getInferenceAccelerators()?.map(InferenceAccelerator::wrap) ?: emptyList()

  /**
   * The IPC resource namespace to use for the containers in the task.
   *
   * Not supported in Fargate and Windows containers.
   *
   * Default: - IpcMode used by the task is not specified
   */
  public fun ipcMode(): IpcMode? = unwrap(this).getIpcMode()?.let(IpcMode::wrap)

  /**
   * The Docker networking mode to use for the containers in the task.
   *
   * The valid values are NONE, BRIDGE, AWS_VPC, and HOST.
   *
   * Default: - NetworkMode.BRIDGE for EC2 tasks, AWS_VPC for Fargate tasks.
   */
  public fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

  /**
   * The process namespace to use for the containers in the task.
   *
   * Not supported in Fargate and Windows containers.
   *
   * Default: - PidMode used by the task is not specified
   */
  public fun pidMode(): PidMode? = unwrap(this).getPidMode()?.let(PidMode::wrap)

  /**
   * An array of placement constraint objects to use for the task.
   *
   * You can
   * specify a maximum of 10 constraints per task (this limit includes
   * constraints in the task definition and those specified at run time).
   *
   * Default: - No placement constraints.
   */
  public fun placementConstraints(): List<PlacementConstraint> =
      unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

  /**
   * A builder for [Ec2TaskDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param executionRole The name of the IAM task execution role that grants the ECS agent
     * permission to call AWS APIs on your behalf.
     * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
     */
    public fun executionRole(executionRole: IRole)

    /**
     * @param family The name of a family that this task definition is registered to.
     * A family groups multiple versions of a task definition.
     */
    public fun family(family: String)

    /**
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task.
     * Not supported in Fargate.
     */
    public fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>)

    /**
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task.
     * Not supported in Fargate.
     */
    public fun inferenceAccelerators(vararg inferenceAccelerators: InferenceAccelerator)

    /**
     * @param ipcMode The IPC resource namespace to use for the containers in the task.
     * Not supported in Fargate and Windows containers.
     */
    public fun ipcMode(ipcMode: IpcMode)

    /**
     * @param networkMode The Docker networking mode to use for the containers in the task.
     * The valid values are NONE, BRIDGE, AWS_VPC, and HOST.
     */
    public fun networkMode(networkMode: NetworkMode)

    /**
     * @param pidMode The process namespace to use for the containers in the task.
     * Not supported in Fargate and Windows containers.
     */
    public fun pidMode(pidMode: PidMode)

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task.
     * You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     */
    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task.
     * You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    /**
     * @param proxyConfiguration The configuration details for the App Mesh proxy.
     */
    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration)

    /**
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     * call AWS APIs on your behalf.
     */
    public fun taskRole(taskRole: IRole)

    /**
     * @param volumes The list of volume definitions for the task.
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     */
    public fun volumes(volumes: List<Volume>)

    /**
     * @param volumes The list of volume definitions for the task.
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     */
    public fun volumes(vararg volumes: Volume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder =
        software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.builder()

    /**
     * @param executionRole The name of the IAM task execution role that grants the ECS agent
     * permission to call AWS APIs on your behalf.
     * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    /**
     * @param family The name of a family that this task definition is registered to.
     * A family groups multiple versions of a task definition.
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task.
     * Not supported in Fargate.
     */
    override fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators.map(InferenceAccelerator::unwrap))
    }

    /**
     * @param inferenceAccelerators The inference accelerators to use for the containers in the
     * task.
     * Not supported in Fargate.
     */
    override fun inferenceAccelerators(vararg inferenceAccelerators: InferenceAccelerator): Unit =
        inferenceAccelerators(inferenceAccelerators.toList())

    /**
     * @param ipcMode The IPC resource namespace to use for the containers in the task.
     * Not supported in Fargate and Windows containers.
     */
    override fun ipcMode(ipcMode: IpcMode) {
      cdkBuilder.ipcMode(ipcMode.let(IpcMode::unwrap))
    }

    /**
     * @param networkMode The Docker networking mode to use for the containers in the task.
     * The valid values are NONE, BRIDGE, AWS_VPC, and HOST.
     */
    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    /**
     * @param pidMode The process namespace to use for the containers in the task.
     * Not supported in Fargate and Windows containers.
     */
    override fun pidMode(pidMode: PidMode) {
      cdkBuilder.pidMode(pidMode.let(PidMode::unwrap))
    }

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task.
     * You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     */
    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task.
     * You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     */
    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * @param proxyConfiguration The configuration details for the App Mesh proxy.
     */
    override fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfiguration::unwrap))
    }

    /**
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     * call AWS APIs on your behalf.
     */
    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    /**
     * @param volumes The list of volume definitions for the task.
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     */
    override fun volumes(volumes: List<Volume>) {
      cdkBuilder.volumes(volumes.map(Volume::unwrap))
    }

    /**
     * @param volumes The list of volume definitions for the task.
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     */
    override fun volumes(vararg volumes: Volume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps,
  ) : CdkObject(cdkObject), Ec2TaskDefinitionProps {
    /**
     * The name of the IAM task execution role that grants the ECS agent permission to call AWS APIs
     * on your behalf.
     *
     * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
     *
     * Default: - An execution role will be automatically created if you use ECR images in your task
     * definition.
     */
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    /**
     * The name of a family that this task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     *
     * Default: - Automatically generated name.
     */
    override fun family(): String? = unwrap(this).getFamily()

    /**
     * The inference accelerators to use for the containers in the task.
     *
     * Not supported in Fargate.
     *
     * Default: - No inference accelerators.
     */
    override fun inferenceAccelerators(): List<InferenceAccelerator> =
        unwrap(this).getInferenceAccelerators()?.map(InferenceAccelerator::wrap) ?: emptyList()

    /**
     * The IPC resource namespace to use for the containers in the task.
     *
     * Not supported in Fargate and Windows containers.
     *
     * Default: - IpcMode used by the task is not specified
     */
    override fun ipcMode(): IpcMode? = unwrap(this).getIpcMode()?.let(IpcMode::wrap)

    /**
     * The Docker networking mode to use for the containers in the task.
     *
     * The valid values are NONE, BRIDGE, AWS_VPC, and HOST.
     *
     * Default: - NetworkMode.BRIDGE for EC2 tasks, AWS_VPC for Fargate tasks.
     */
    override fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    /**
     * The process namespace to use for the containers in the task.
     *
     * Not supported in Fargate and Windows containers.
     *
     * Default: - PidMode used by the task is not specified
     */
    override fun pidMode(): PidMode? = unwrap(this).getPidMode()?.let(PidMode::wrap)

    /**
     * An array of placement constraint objects to use for the task.
     *
     * You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at run time).
     *
     * Default: - No placement constraints.
     */
    override fun placementConstraints(): List<PlacementConstraint> =
        unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Default: - No proxy configuration.
     */
    override fun proxyConfiguration(): ProxyConfiguration? =
        unwrap(this).getProxyConfiguration()?.let(ProxyConfiguration::wrap)

    /**
     * The name of the IAM role that grants containers in the task permission to call AWS APIs on
     * your behalf.
     *
     * Default: - A task role is automatically created for you.
     */
    override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)

    /**
     * The list of volume definitions for the task.
     *
     * For more information, see
     * [Task Definition Parameter
     * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     *
     * Default: - No volumes are passed to the Docker daemon on a container instance.
     */
    override fun volumes(): List<Volume> = unwrap(this).getVolumes()?.map(Volume::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2TaskDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps):
        Ec2TaskDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as? Ec2TaskDefinitionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2TaskDefinitionProps):
        software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps
  }
}
