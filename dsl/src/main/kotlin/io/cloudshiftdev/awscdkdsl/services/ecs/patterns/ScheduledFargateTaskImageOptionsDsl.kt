@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ecs.patterns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ecs.RuntimePlatformDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions

/**
 * The properties for the ScheduledFargateTask using an image.
 *
 * Example:
 * ```
 * Vpc vpc = Vpc.Builder.create(this, "Vpc").maxAzs(1).build();
 * Cluster cluster = Cluster.Builder.create(this, "EcsCluster").vpc(vpc).build();
 * ScheduledFargateTask scheduledFargateTask = ScheduledFargateTask.Builder.create(this,
 * "ScheduledFargateTask")
 * .cluster(cluster)
 * .scheduledFargateTaskImageOptions(ScheduledFargateTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryLimitMiB(512)
 * .build())
 * .schedule(Schedule.expression("rate(1 minute)"))
 * .tags(List.of(Tag.builder()
 * .key("my-tag")
 * .value("my-tag-value")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ScheduledFargateTaskImageOptionsDsl {
    private val cdkBuilder: ScheduledFargateTaskImageOptions.Builder =
        ScheduledFargateTaskImageOptions.builder()

    private val _command: MutableList<String> = mutableListOf()

    /**
     * @param command The command that is passed to the container. If you provide a shell command as
     *   a single string, you have to quote command-line arguments.
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * @param command The command that is passed to the container. If you provide a shell command as
     *   a single string, you have to quote command-line arguments.
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /**
     * @param cpu The number of cpu units used by the task. Valid values, which determines your
     *   range of valid values for the memory parameter:
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
     * 8192 (8 vCPU) - Available memory values: Between 16GB and 60GB in 4GB increments
     *
     * 16384 (16 vCPU) - Available memory values: Between 32GB and 120GB in 8GB increments
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     */
    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    /** @param environment The environment variables to pass to the container. */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param image The image used to start a container. Image or taskDefinition must be specified,
     *   but not both.
     */
    public fun image(image: ContainerImage) {
        cdkBuilder.image(image)
    }

    /** @param logDriver The log driver to use. */
    public fun logDriver(logDriver: LogDriver) {
        cdkBuilder.logDriver(logDriver)
    }

    /**
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task. This field is required
     *   and you must use one of the following values, which determines your range of valid values
     *   for the cpu parameter:
     *
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)
     *
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)
     *
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) -
     * Available cpu values: 1024 (1 vCPU)
     *
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values:
     * 2048 (2 vCPU)
     *
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values:
     * 4096 (4 vCPU)
     *
     * Between 16384 (16 GB) and 61440 (60 GB) in increments of 4096 (4 GB) - Available cpu values:
     * 8192 (8 vCPU)
     *
     * Between 32768 (32 GB) and 122880 (120 GB) in increments of 8192 (8 GB) - Available cpu
     * values: 16384 (16 vCPU)
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * @param platformVersion The platform version on which to run your service. If one is not
     *   specified, the LATEST platform version is used by default. For more information, see
     *   [AWS Fargate Platform Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     *   in the Amazon Elastic Container Service Developer Guide.
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion) {
        cdkBuilder.platformVersion(platformVersion)
    }

    /** @param runtimePlatform The runtime platform of the task definition. */
    public fun runtimePlatform(runtimePlatform: RuntimePlatformDsl.() -> Unit = {}) {
        val builder = RuntimePlatformDsl()
        builder.apply(runtimePlatform)
        cdkBuilder.runtimePlatform(builder.build())
    }

    /** @param runtimePlatform The runtime platform of the task definition. */
    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
        cdkBuilder.runtimePlatform(runtimePlatform)
    }

    /** @param secrets The secret to expose to the container as an environment variable. */
    public fun secrets(secrets: Map<String, Secret>) {
        cdkBuilder.secrets(secrets)
    }

    /**
     * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
     *   TaskImageOptions must be specified, but not both. [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): ScheduledFargateTaskImageOptions {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        return cdkBuilder.build()
    }
}
