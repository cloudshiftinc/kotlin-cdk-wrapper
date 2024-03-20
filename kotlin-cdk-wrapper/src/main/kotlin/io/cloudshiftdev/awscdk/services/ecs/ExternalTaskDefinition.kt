@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The details of a task definition run on an External cluster.
 *
 * Example:
 *
 * ```
 * ExternalTaskDefinition externalTaskDefinition = new ExternalTaskDefinition(this, "TaskDef");
 * ContainerDefinition container = externalTaskDefinition.addContainer("WebContainer",
 * ContainerDefinitionOptions.builder()
 * // Use an image from DockerHub
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryLimitMiB(1024)
 * .build());
 * ```
 */
public open class ExternalTaskDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.ExternalTaskDefinition,
) : TaskDefinition(cdkObject), IExternalTaskDefinition {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ecs.ExternalTaskDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ExternalTaskDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.ecs.ExternalTaskDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ExternalTaskDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ExternalTaskDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, ExternalTaskDefinitionProps(props)
  )

  /**
   * Overriden method to throw error as interface accelerators are not supported for external tasks.
   *
   * @param _inferenceAccelerator 
   */
  public override fun addInferenceAccelerator(inferenceAccelerator: InferenceAccelerator) {
    unwrap(this).addInferenceAccelerator(inferenceAccelerator.let(InferenceAccelerator::unwrap))
  }

  /**
   * Overriden method to throw error as interface accelerators are not supported for external tasks.
   *
   * @param _inferenceAccelerator 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5ed9df469538219aa4a519c5c670da4fa01bf9950e8d2a410fbf5d7fc465f966")
  public override
      fun addInferenceAccelerator(inferenceAccelerator: InferenceAccelerator.Builder.() -> Unit):
      Unit = addInferenceAccelerator(InferenceAccelerator(inferenceAccelerator))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.ExternalTaskDefinition].
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
     * The networking mode to use for the containers in the task.
     *
     * With ECS Anywhere, supported modes are bridge, host and none.
     *
     * Default: NetworkMode.BRIDGE
     *
     * @param networkMode The networking mode to use for the containers in the task. 
     */
    public fun networkMode(networkMode: NetworkMode)

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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ExternalTaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.ExternalTaskDefinition.Builder.create(scope, id)

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
     * The networking mode to use for the containers in the task.
     *
     * With ECS Anywhere, supported modes are bridge, host and none.
     *
     * Default: NetworkMode.BRIDGE
     *
     * @param networkMode The networking mode to use for the containers in the task. 
     */
    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.ecs.ExternalTaskDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromEc2TaskDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      externalTaskDefinitionArn: String,
    ): IExternalTaskDefinition =
        software.amazon.awscdk.services.ecs.ExternalTaskDefinition.fromEc2TaskDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, externalTaskDefinitionArn).let(IExternalTaskDefinition::wrap)

    public fun fromExternalTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExternalTaskDefinitionAttributes,
    ): IExternalTaskDefinition =
        software.amazon.awscdk.services.ecs.ExternalTaskDefinition.fromExternalTaskDefinitionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ExternalTaskDefinitionAttributes::unwrap)).let(IExternalTaskDefinition::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79b74a848577dd70dae18e1ee2e46d90562825a4b2b91ccfd7a22ec79c56b22a")
    public fun fromExternalTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExternalTaskDefinitionAttributes.Builder.() -> Unit,
    ): IExternalTaskDefinition = fromExternalTaskDefinitionAttributes(scope, id,
        ExternalTaskDefinitionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ExternalTaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ExternalTaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExternalTaskDefinition):
        ExternalTaskDefinition = ExternalTaskDefinition(cdkObject)

    internal fun unwrap(wrapped: ExternalTaskDefinition):
        software.amazon.awscdk.services.ecs.ExternalTaskDefinition = wrapped.cdkObject
  }
}
