@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The common properties for all task definitions.
 *
 * For more information, see
 * [Task Definition
 * Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * ProxyConfiguration proxyConfiguration;
 * Role role;
 * CommonTaskDefinitionProps commonTaskDefinitionProps = CommonTaskDefinitionProps.builder()
 * .executionRole(role)
 * .family("family")
 * .proxyConfiguration(proxyConfiguration)
 * .taskRole(role)
 * .volumes(List.of(Volume.builder()
 * .name("name")
 * // the properties below are optional
 * .configuredAtLaunch(false)
 * .dockerVolumeConfiguration(DockerVolumeConfiguration.builder()
 * .driver("driver")
 * .scope(Scope.TASK)
 * // the properties below are optional
 * .autoprovision(false)
 * .driverOpts(Map.of(
 * "driverOptsKey", "driverOpts"))
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .build())
 * .efsVolumeConfiguration(EfsVolumeConfiguration.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .authorizationConfig(AuthorizationConfig.builder()
 * .accessPointId("accessPointId")
 * .iam("iam")
 * .build())
 * .rootDirectory("rootDirectory")
 * .transitEncryption("transitEncryption")
 * .transitEncryptionPort(123)
 * .build())
 * .host(Host.builder()
 * .sourcePath("sourcePath")
 * .build())
 * .build()))
 * .build();
 * ```
 */
public interface CommonTaskDefinitionProps {
  /**
   * The name of the IAM task execution role that grants the ECS agent permission to call AWS APIs
   * on your behalf.
   *
   * The role will be used to retrieve container images from ECR and create CloudWatch log groups.
   *
   * Default: - An execution role will be automatically created if you use ECR images in your task
   * definition.
   */
  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  /**
   * The name of a family that this task definition is registered to.
   *
   * A family groups multiple versions of a task definition.
   *
   * Default: - Automatically generated name.
   */
  public fun family(): String? = unwrap(this).getFamily()

  /**
   * The configuration details for the App Mesh proxy.
   *
   * Default: - No proxy configuration.
   */
  public fun proxyConfiguration(): ProxyConfiguration? =
      unwrap(this).getProxyConfiguration()?.let(ProxyConfiguration::wrap)

  /**
   * The name of the IAM role that grants containers in the task permission to call AWS APIs on your
   * behalf.
   *
   * Default: - A task role is automatically created for you.
   */
  public fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)

  /**
   * The list of volume definitions for the task.
   *
   * For more information, see
   * [Task Definition Parameter
   * Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
   *
   * Default: - No volumes are passed to the Docker daemon on a container instance.
   */
  public fun volumes(): List<Volume> = unwrap(this).getVolumes()?.map(Volume::wrap) ?: emptyList()

  /**
   * A builder for [CommonTaskDefinitionProps]
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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder =
        software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps,
  ) : CdkObject(cdkObject), CommonTaskDefinitionProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonTaskDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps):
        CommonTaskDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonTaskDefinitionProps):
        software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps
  }
}
