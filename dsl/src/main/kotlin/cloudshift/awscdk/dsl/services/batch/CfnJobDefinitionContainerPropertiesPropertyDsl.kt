@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionContainerPropertiesPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.ContainerPropertiesProperty.Builder =
      CfnJobDefinition.ContainerPropertiesProperty.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _environment: MutableList<Any> = mutableListOf()

  private val _mountPoints: MutableList<Any> = mutableListOf()

  private val _resourceRequirements: MutableList<Any> = mutableListOf()

  private val _secrets: MutableList<Any> = mutableListOf()

  private val _ulimits: MutableList<Any> = mutableListOf()

  private val _volumes: MutableList<Any> = mutableListOf()

  /**
   * @param command The command that's passed to the container.
   * This parameter maps to `Cmd` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `COMMAND`
   * parameter to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . For more
   * information, see
   * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
   * .
   */
  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  /**
   * @param command The command that's passed to the container.
   * This parameter maps to `Cmd` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `COMMAND`
   * parameter to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . For more
   * information, see
   * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
   * .
   */
  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  /**
   * @param environment The environment variables to pass to a container.
   * This parameter maps to `Env` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env` option
   * to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
   *
   *
   * We don't recommend using plaintext environment variables for sensitive information, such as
   * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
   * convention is reserved for variables that AWS Batch sets.
   */
  public fun environment(vararg environment: Any) {
    _environment.addAll(listOf(*environment))
  }

  /**
   * @param environment The environment variables to pass to a container.
   * This parameter maps to `Env` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env` option
   * to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
   *
   *
   * We don't recommend using plaintext environment variables for sensitive information, such as
   * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
   * convention is reserved for variables that AWS Batch sets.
   */
  public fun environment(environment: Collection<Any>) {
    _environment.addAll(environment)
  }

  /**
   * @param environment The environment variables to pass to a container.
   * This parameter maps to `Env` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--env` option
   * to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
   *
   *
   * We don't recommend using plaintext environment variables for sensitive information, such as
   * credential data. &gt; Environment variables cannot start with " `AWS_BATCH` ". This naming
   * convention is reserved for variables that AWS Batch sets.
   */
  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param ephemeralStorage The amount of ephemeral storage to allocate for the task.
   * This parameter is used to expand the total amount of ephemeral storage available, beyond the
   * default amount, for tasks hosted on AWS Fargate .
   */
  public fun ephemeralStorage(ephemeralStorage: IResolvable) {
    cdkBuilder.ephemeralStorage(ephemeralStorage)
  }

  /**
   * @param ephemeralStorage The amount of ephemeral storage to allocate for the task.
   * This parameter is used to expand the total amount of ephemeral storage available, beyond the
   * default amount, for tasks hosted on AWS Fargate .
   */
  public fun ephemeralStorage(ephemeralStorage: CfnJobDefinition.EphemeralStorageProperty) {
    cdkBuilder.ephemeralStorage(ephemeralStorage)
  }

  /**
   * @param executionRoleArn The Amazon Resource Name (ARN) of the execution role that AWS Batch can
   * assume.
   * For jobs that run on Fargate resources, you must provide an execution role. For more
   * information, see [AWS Batch execution IAM
   * role](https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html) in the *AWS
   * Batch User Guide* .
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * @param fargatePlatformConfiguration The platform configuration for jobs that are running on
   * Fargate resources.
   * Jobs that are running on EC2 resources must not specify this parameter.
   */
  public fun fargatePlatformConfiguration(fargatePlatformConfiguration: IResolvable) {
    cdkBuilder.fargatePlatformConfiguration(fargatePlatformConfiguration)
  }

  /**
   * @param fargatePlatformConfiguration The platform configuration for jobs that are running on
   * Fargate resources.
   * Jobs that are running on EC2 resources must not specify this parameter.
   */
  public
      fun fargatePlatformConfiguration(fargatePlatformConfiguration: CfnJobDefinition.FargatePlatformConfigurationProperty) {
    cdkBuilder.fargatePlatformConfiguration(fargatePlatformConfiguration)
  }

  /**
   * @param image The image used to start a container. 
   * This string is passed directly to the Docker daemon. Images in the Docker Hub registry are
   * available by default. Other repositories are specified with `*repository-url* / *image* : *tag*` .
   * It can be 255 characters long. It can contain uppercase and lowercase letters, numbers, hyphens
   * (-), underscores (_), colons (:), periods (.), forward slashes (/), and number signs (#). This
   * parameter maps to `Image` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `IMAGE`
   * parameter of [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
   *
   *
   * Docker image architecture must match the processor architecture of the compute resources that
   * they're scheduled on. For example, ARM-based Docker images can only run on ARM-based compute
   * resources.
   *
   *
   * * Images in Amazon ECR Public repositories use the full `registry/repository[:tag]` or
   * `registry/repository[&#64;digest]` naming conventions. For example, `public.ecr.aws/
   * *registry_alias* / *my-web-app* : *latest*` .
   * * Images in Amazon ECR repositories use the full registry and repository URI (for example,
   * `123456789012.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;` ).
   * * Images in official repositories on Docker Hub use a single name (for example, `ubuntu` or
   * `mongo` ).
   * * Images in other repositories on Docker Hub are qualified with an organization name (for
   * example, `amazon/amazon-ecs-agent` ).
   * * Images in other online repositories are qualified further by a domain name (for example,
   * `quay.io/assemblyline/ubuntu` ).
   */
  public fun image(image: String) {
    cdkBuilder.image(image)
  }

  /**
   * @param instanceType The instance type to use for a multi-node parallel job.
   * All node groups in a multi-node parallel job must use the same instance type.
   *
   *
   * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate
   * resources, and shouldn't be provided.
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param jobRoleArn The Amazon Resource Name (ARN) of the IAM role that the container can assume
   * for AWS permissions.
   * For more information, see [IAM roles for
   * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   */
  public fun jobRoleArn(jobRoleArn: String) {
    cdkBuilder.jobRoleArn(jobRoleArn)
  }

  /**
   * @param linuxParameters Linux-specific modifications that are applied to the container, such as
   * details for device mappings.
   */
  public fun linuxParameters(linuxParameters: IResolvable) {
    cdkBuilder.linuxParameters(linuxParameters)
  }

  /**
   * @param linuxParameters Linux-specific modifications that are applied to the container, such as
   * details for device mappings.
   */
  public fun linuxParameters(linuxParameters: CfnJobDefinition.LinuxParametersProperty) {
    cdkBuilder.linuxParameters(linuxParameters)
  }

  /**
   * @param logConfiguration The log configuration specification for the container.
   * This parameter maps to `LogConfig` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--log-driver`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * . By default, containers use the same logging driver that the Docker daemon uses. However the
   * container might use a different logging driver than the Docker daemon by specifying a log driver
   * with this parameter in the container definition. To use a different logging driver for a
   * container, the log system must be configured properly on the container instance (or on a different
   * log server for remote logging options). For more information on the options for different
   * supported log drivers, see [Configure logging
   * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/) in
   * the Docker documentation.
   *
   *
   * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon
   * (shown in the `LogConfiguration` data type).
   *
   *
   * This parameter requires version 1.18 of the Docker Remote API or greater on your container
   * instance. To check the Docker Remote API version on your container instance, log in to your
   * container instance and run the following command: `sudo docker version | grep "Server API
   * version"`
   *
   *
   * The Amazon ECS container agent running on a container instance must register the logging
   * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment variable
   * before containers placed on that instance can use these log configuration options. For more
   * information, see [Amazon ECS container agent
   * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun logConfiguration(logConfiguration: IResolvable) {
    cdkBuilder.logConfiguration(logConfiguration)
  }

  /**
   * @param logConfiguration The log configuration specification for the container.
   * This parameter maps to `LogConfig` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--log-driver`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * . By default, containers use the same logging driver that the Docker daemon uses. However the
   * container might use a different logging driver than the Docker daemon by specifying a log driver
   * with this parameter in the container definition. To use a different logging driver for a
   * container, the log system must be configured properly on the container instance (or on a different
   * log server for remote logging options). For more information on the options for different
   * supported log drivers, see [Configure logging
   * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/) in
   * the Docker documentation.
   *
   *
   * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon
   * (shown in the `LogConfiguration` data type).
   *
   *
   * This parameter requires version 1.18 of the Docker Remote API or greater on your container
   * instance. To check the Docker Remote API version on your container instance, log in to your
   * container instance and run the following command: `sudo docker version | grep "Server API
   * version"`
   *
   *
   * The Amazon ECS container agent running on a container instance must register the logging
   * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment variable
   * before containers placed on that instance can use these log configuration options. For more
   * information, see [Amazon ECS container agent
   * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun logConfiguration(logConfiguration: CfnJobDefinition.LogConfigurationProperty) {
    cdkBuilder.logConfiguration(logConfiguration)
  }

  /**
   * @param memory This parameter is deprecated, use `resourceRequirements` to specify the memory
   * requirements for the job definition.
   * It's not supported for jobs running on Fargate resources. For jobs that run on EC2 resources,
   * it specifies the memory hard limit (in MiB) for a container. If your container attempts to exceed
   * the specified number, it's terminated. You must specify at least 4 MiB of memory for a job using
   * this parameter. The memory hard limit can be specified in several places. It must be specified for
   * each node at least once.
   */
  public fun memory(memory: Number) {
    cdkBuilder.memory(memory)
  }

  /**
   * @param mountPoints The mount points for data volumes in your container.
   * This parameter maps to `Volumes` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * .
   */
  public fun mountPoints(vararg mountPoints: Any) {
    _mountPoints.addAll(listOf(*mountPoints))
  }

  /**
   * @param mountPoints The mount points for data volumes in your container.
   * This parameter maps to `Volumes` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * .
   */
  public fun mountPoints(mountPoints: Collection<Any>) {
    _mountPoints.addAll(mountPoints)
  }

  /**
   * @param mountPoints The mount points for data volumes in your container.
   * This parameter maps to `Volumes` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--volume`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * .
   */
  public fun mountPoints(mountPoints: IResolvable) {
    cdkBuilder.mountPoints(mountPoints)
  }

  /**
   * @param networkConfiguration The network configuration for jobs that are running on Fargate
   * resources.
   * Jobs that are running on EC2 resources must not specify this parameter.
   */
  public fun networkConfiguration(networkConfiguration: IResolvable) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * @param networkConfiguration The network configuration for jobs that are running on Fargate
   * resources.
   * Jobs that are running on EC2 resources must not specify this parameter.
   */
  public
      fun networkConfiguration(networkConfiguration: CfnJobDefinition.NetworkConfigurationProperty) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * @param privileged When this parameter is true, the container is given elevated permissions on
   * the host container instance (similar to the `root` user).
   * This parameter maps to `Privileged` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--privileged`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * . The default value is false.
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be
   * provided, or specified as false.
   */
  public fun privileged(privileged: Boolean) {
    cdkBuilder.privileged(privileged)
  }

  /**
   * @param privileged When this parameter is true, the container is given elevated permissions on
   * the host container instance (similar to the `root` user).
   * This parameter maps to `Privileged` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--privileged`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * . The default value is false.
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be
   * provided, or specified as false.
   */
  public fun privileged(privileged: IResolvable) {
    cdkBuilder.privileged(privileged)
  }

  /**
   * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
   * access to its root file system.
   * This parameter maps to `ReadonlyRootfs` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--read-only`
   * option to `docker run` .
   */
  public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
    cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
  }

  /**
   * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
   * access to its root file system.
   * This parameter maps to `ReadonlyRootfs` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--read-only`
   * option to `docker run` .
   */
  public fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
    cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
  }

  /**
   * @param resourceRequirements The type and amount of resources to assign to a container.
   * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
   */
  public fun resourceRequirements(vararg resourceRequirements: Any) {
    _resourceRequirements.addAll(listOf(*resourceRequirements))
  }

  /**
   * @param resourceRequirements The type and amount of resources to assign to a container.
   * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
   */
  public fun resourceRequirements(resourceRequirements: Collection<Any>) {
    _resourceRequirements.addAll(resourceRequirements)
  }

  /**
   * @param resourceRequirements The type and amount of resources to assign to a container.
   * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
   */
  public fun resourceRequirements(resourceRequirements: IResolvable) {
    cdkBuilder.resourceRequirements(resourceRequirements)
  }

  /**
   * @param secrets The secrets for the container.
   * For more information, see [Specifying sensitive
   * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in the
   * *AWS Batch User Guide* .
   */
  public fun secrets(vararg secrets: Any) {
    _secrets.addAll(listOf(*secrets))
  }

  /**
   * @param secrets The secrets for the container.
   * For more information, see [Specifying sensitive
   * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in the
   * *AWS Batch User Guide* .
   */
  public fun secrets(secrets: Collection<Any>) {
    _secrets.addAll(secrets)
  }

  /**
   * @param secrets The secrets for the container.
   * For more information, see [Specifying sensitive
   * data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html) in the
   * *AWS Batch User Guide* .
   */
  public fun secrets(secrets: IResolvable) {
    cdkBuilder.secrets(secrets)
  }

  /**
   * @param ulimits A list of `ulimits` to set in the container.
   * This parameter maps to `Ulimits` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * .
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be
   * provided.
   */
  public fun ulimits(vararg ulimits: Any) {
    _ulimits.addAll(listOf(*ulimits))
  }

  /**
   * @param ulimits A list of `ulimits` to set in the container.
   * This parameter maps to `Ulimits` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * .
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be
   * provided.
   */
  public fun ulimits(ulimits: Collection<Any>) {
    _ulimits.addAll(ulimits)
  }

  /**
   * @param ulimits A list of `ulimits` to set in the container.
   * This parameter maps to `Ulimits` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--ulimit`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * .
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be
   * provided.
   */
  public fun ulimits(ulimits: IResolvable) {
    cdkBuilder.ulimits(ulimits)
  }

  /**
   * @param user The user name to use inside the container.
   * This parameter maps to `User` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--user`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * .
   */
  public fun user(user: String) {
    cdkBuilder.user(user)
  }

  /**
   * @param vcpus This parameter is deprecated, use `resourceRequirements` to specify the vCPU
   * requirements for the job definition.
   * It's not supported for jobs running on Fargate resources. For jobs running on EC2 resources, it
   * specifies the number of vCPUs reserved for the job.
   *
   * Each vCPU is equivalent to 1,024 CPU shares. This parameter maps to `CpuShares` in the [Create
   * a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--cpu-shares`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * . The number of vCPUs must be specified but can be specified in several places. You must specify
   * it at least once for each node.
   */
  public fun vcpus(vcpus: Number) {
    cdkBuilder.vcpus(vcpus)
  }

  /**
   * @param volumes A list of data volumes used in a job.
   */
  public fun volumes(vararg volumes: Any) {
    _volumes.addAll(listOf(*volumes))
  }

  /**
   * @param volumes A list of data volumes used in a job.
   */
  public fun volumes(volumes: Collection<Any>) {
    _volumes.addAll(volumes)
  }

  /**
   * @param volumes A list of data volumes used in a job.
   */
  public fun volumes(volumes: IResolvable) {
    cdkBuilder.volumes(volumes)
  }

  public fun build(): CfnJobDefinition.ContainerPropertiesProperty {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_environment.isNotEmpty()) cdkBuilder.environment(_environment)
    if(_mountPoints.isNotEmpty()) cdkBuilder.mountPoints(_mountPoints)
    if(_resourceRequirements.isNotEmpty()) cdkBuilder.resourceRequirements(_resourceRequirements)
    if(_secrets.isNotEmpty()) cdkBuilder.secrets(_secrets)
    if(_ulimits.isNotEmpty()) cdkBuilder.ulimits(_ulimits)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    return cdkBuilder.build()
  }
}
