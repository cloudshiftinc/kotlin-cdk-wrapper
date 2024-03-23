@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.applicationautoscaling.Schedule
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import io.cloudshiftdev.awscdk.services.events.targets.Tag
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The properties for the ScheduledFargateTask task.
 *
 * Example:
 *
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
public interface ScheduledFargateTaskProps : ScheduledTaskBaseProps, FargateServiceBaseProps {
  /**
   * The properties to define if using an existing TaskDefinition in this construct.
   *
   * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined, but
   * not both.
   *
   * Default: none
   */
  public fun scheduledFargateTaskDefinitionOptions(): ScheduledFargateTaskDefinitionOptions? =
      unwrap(this).getScheduledFargateTaskDefinitionOptions()?.let(ScheduledFargateTaskDefinitionOptions::wrap)

  /**
   * The properties to define if the construct is to create a TaskDefinition.
   *
   * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined, but
   * not both.
   *
   * Default: none
   */
  public fun scheduledFargateTaskImageOptions(): ScheduledFargateTaskImageOptions? =
      unwrap(this).getScheduledFargateTaskImageOptions()?.let(ScheduledFargateTaskImageOptions::wrap)

  /**
   * A builder for [ScheduledFargateTaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param cpu The number of cpu units used by the task.
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
     * 8192 (8 vCPU) - Available memory values: Between 16GB and 60GB in 4GB increments
     *
     * 16384 (16 vCPU) - Available memory values: Between 32GB and 120GB in 8GB increments
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     */
    public fun cpu(cpu: Number)

    /**
     * @param desiredTaskCount The desired number of instantiations of the task definition to keep
     * running on the service.
     */
    public fun desiredTaskCount(desiredTaskCount: Number)

    /**
     * @param enabled Indicates whether the rule is enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task.
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     */
    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

    /**
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task.
     * This field is required and you must use one of the following values, which determines your
     * range of valid values
     * for the cpu parameter:
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
    public fun memoryLimitMiB(memoryLimitMiB: Number)

    /**
     * @param platformVersion The platform version on which to run your service.
     * If one is not specified, the LATEST platform version is used by default. For more
     * information, see
     * [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the Amazon Elastic Container Service Developer Guide.
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task.
     * If no value is specified, the tags are not propagated.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * @param ruleName A name for the rule.
     */
    public fun ruleName(ruleName: String)

    /**
     * @param runtimePlatform The runtime platform of the task definition.
     */
    public fun runtimePlatform(runtimePlatform: RuntimePlatform)

    /**
     * @param runtimePlatform The runtime platform of the task definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb9b409e094cc338c0855db34fd67d330cf5e428d2097c75b5162f1203f757ed")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    /**
     * @param schedule The schedule or rate (frequency) that determines when CloudWatch Events runs
     * the rule. 
     * For more information, see
     * [Schedule Expression Syntax for
     * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
     * in the Amazon CloudWatch User Guide.
     */
    public fun schedule(schedule: Schedule)

    /**
     * @param scheduledFargateTaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct.
     * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined,
     * but not both.
     */
    public
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions)

    /**
     * @param scheduledFargateTaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct.
     * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined,
     * but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4b8368d7d1c43424a650d75c3b0b29013d2af0ecbff56a097ce3c399cbcfb75")
    public
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit)

    /**
     * @param scheduledFargateTaskImageOptions The properties to define if the construct is to
     * create a TaskDefinition.
     * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined,
     * but not both.
     */
    public
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions)

    /**
     * @param scheduledFargateTaskImageOptions The properties to define if the construct is to
     * create a TaskDefinition.
     * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined,
     * but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c81b1fdd27a1fea7ef778bd75eee825e6f095c18b725b6956bc6eb92aa9100b8")
    public
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions.Builder.() -> Unit)

    /**
     * @param securityGroups Existing security groups to use for your service.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Existing security groups to use for your service.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cd45beba25bf56f80e402e71ad1a40d6c13aa72038afa762d6f2a147b9710b8")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: List<Tag>)

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(vararg tags: Tag)

    /**
     * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
     * TaskImageOptions must be specified, but not both.
     * [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: FargateTaskDefinition)

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
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps.builder()

    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * @param cpu The number of cpu units used by the task.
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
     * 8192 (8 vCPU) - Available memory values: Between 16GB and 60GB in 4GB increments
     *
     * 16384 (16 vCPU) - Available memory values: Between 32GB and 120GB in 8GB increments
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param desiredTaskCount The desired number of instantiations of the task definition to keep
     * running on the service.
     */
    override fun desiredTaskCount(desiredTaskCount: Number) {
      cdkBuilder.desiredTaskCount(desiredTaskCount)
    }

    /**
     * @param enabled Indicates whether the rule is enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to the
     * task.
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     */
    override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    /**
     * @param memoryLimitMiB The amount (in MiB) of memory used by the task.
     * This field is required and you must use one of the following values, which determines your
     * range of valid values
     * for the cpu parameter:
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
    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * @param platformVersion The platform version on which to run your service.
     * If one is not specified, the LATEST platform version is used by default. For more
     * information, see
     * [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the Amazon Elastic Container Service Developer Guide.
     */
    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task.
     * If no value is specified, the tags are not propagated.
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    /**
     * @param ruleName A name for the rule.
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param runtimePlatform The runtime platform of the task definition.
     */
    override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    /**
     * @param runtimePlatform The runtime platform of the task definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb9b409e094cc338c0855db34fd67d330cf5e428d2097c75b5162f1203f757ed")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    /**
     * @param schedule The schedule or rate (frequency) that determines when CloudWatch Events runs
     * the rule. 
     * For more information, see
     * [Schedule Expression Syntax for
     * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
     * in the Amazon CloudWatch User Guide.
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    /**
     * @param scheduledFargateTaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct.
     * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined,
     * but not both.
     */
    override
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions) {
      cdkBuilder.scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions.let(ScheduledFargateTaskDefinitionOptions::unwrap))
    }

    /**
     * @param scheduledFargateTaskDefinitionOptions The properties to define if using an existing
     * TaskDefinition in this construct.
     * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined,
     * but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4b8368d7d1c43424a650d75c3b0b29013d2af0ecbff56a097ce3c399cbcfb75")
    override
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit):
        Unit =
        scheduledFargateTaskDefinitionOptions(ScheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions))

    /**
     * @param scheduledFargateTaskImageOptions The properties to define if the construct is to
     * create a TaskDefinition.
     * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined,
     * but not both.
     */
    override
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions) {
      cdkBuilder.scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions.let(ScheduledFargateTaskImageOptions::unwrap))
    }

    /**
     * @param scheduledFargateTaskImageOptions The properties to define if the construct is to
     * create a TaskDefinition.
     * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined,
     * but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c81b1fdd27a1fea7ef778bd75eee825e6f095c18b725b6956bc6eb92aa9100b8")
    override
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions.Builder.() -> Unit):
        Unit =
        scheduledFargateTaskImageOptions(ScheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions))

    /**
     * @param securityGroups Existing security groups to use for your service.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups Existing security groups to use for your service.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnetSelection In what subnets to place the task's ENIs.
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cd45beba25bf56f80e402e71ad1a40d6c13aa72038afa762d6f2a147b9710b8")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag::unwrap))
    }

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    /**
     * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
     * TaskImageOptions must be specified, but not both.
     * [disable-awslint:ref-via-interface]
     */
    override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
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

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps,
  ) : CdkObject(cdkObject), ScheduledFargateTaskProps {
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
     * 8192 (8 vCPU) - Available memory values: Between 16GB and 60GB in 4GB increments
     *
     * 16384 (16 vCPU) - Available memory values: Between 32GB and 120GB in 8GB increments
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     *
     * Default: 256
     */
    override fun cpu(): Number? = unwrap(this).getCpu()

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * Default: 1
     */
    override fun desiredTaskCount(): Number? = unwrap(this).getDesiredTaskCount()

    /**
     * Indicates whether the rule is enabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The amount (in GiB) of ephemeral storage to be allocated to the task.
     *
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     *
     * Default: Undefined, in which case, the task will receive 20GiB ephemeral storage.
     */
    override fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

    /**
     * The amount (in MiB) of memory used by the task.
     *
     * This field is required and you must use one of the following values, which determines your
     * range of valid values
     * for the cpu parameter:
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
     *
     * Default: 512
     */
    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

    /**
     * The platform version on which to run your service.
     *
     * If one is not specified, the LATEST platform version is used by default. For more
     * information, see
     * [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the Amazon Elastic Container Service Developer Guide.
     *
     * Default: Latest
     */
    override fun platformVersion(): FargatePlatformVersion? =
        unwrap(this).getPlatformVersion()?.let(FargatePlatformVersion::wrap)

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated.
     *
     * Default: - Tags will not be propagated
     */
    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    /**
     * A name for the rule.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that ID
     * for the rule name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html).
     */
    override fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * The runtime platform of the task definition.
     *
     * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and
     * `cpuArchitecture` is X86_64
     */
    override fun runtimePlatform(): RuntimePlatform? =
        unwrap(this).getRuntimePlatform()?.let(RuntimePlatform::wrap)

    /**
     * The schedule or rate (frequency) that determines when CloudWatch Events runs the rule.
     *
     * For more information, see
     * [Schedule Expression Syntax for
     * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
     * in the Amazon CloudWatch User Guide.
     */
    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    /**
     * The properties to define if using an existing TaskDefinition in this construct.
     *
     * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined,
     * but not both.
     *
     * Default: none
     */
    override fun scheduledFargateTaskDefinitionOptions(): ScheduledFargateTaskDefinitionOptions? =
        unwrap(this).getScheduledFargateTaskDefinitionOptions()?.let(ScheduledFargateTaskDefinitionOptions::wrap)

    /**
     * The properties to define if the construct is to create a TaskDefinition.
     *
     * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be defined,
     * but not both.
     *
     * Default: none
     */
    override fun scheduledFargateTaskImageOptions(): ScheduledFargateTaskImageOptions? =
        unwrap(this).getScheduledFargateTaskImageOptions()?.let(ScheduledFargateTaskImageOptions::wrap)

    /**
     * Existing security groups to use for your service.
     *
     * Default: - a new security group will be created.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * In what subnets to place the task's ENIs.
     *
     * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
     *
     * Default: Private subnets
     */
    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Default: - No tags are applied to the task
     */
    override fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

    /**
     * The task definition to use for tasks in the service. TaskDefinition or TaskImageOptions must
     * be specified, but not both.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - none
     */
    override fun taskDefinition(): FargateTaskDefinition? =
        unwrap(this).getTaskDefinition()?.let(FargateTaskDefinition::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledFargateTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps):
        ScheduledFargateTaskProps = CdkObjectWrappers.wrap(cdkObject) as? ScheduledFargateTaskProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledFargateTaskProps):
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps
  }
}
