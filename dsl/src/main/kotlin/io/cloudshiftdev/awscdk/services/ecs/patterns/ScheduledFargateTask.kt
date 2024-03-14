package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.applicationautoscaling.Schedule
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import io.cloudshiftdev.awscdk.services.events.targets.EcsTask
import io.cloudshiftdev.awscdk.services.events.targets.Tag
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ScheduledFargateTask
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask,
) : ScheduledTaskBase(cdkObject) {
    /** The ECS task in this construct. */
    public open fun task(): EcsTask = unwrap(this).getTask().let(EcsTask::wrap)

    /** The Fargate task definition in this construct. */
    public open fun taskDefinition(): FargateTaskDefinition =
        unwrap(this).getTaskDefinition().let(FargateTaskDefinition::wrap)

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.patterns.ScheduledFargateTask].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the cluster that hosts the service.
         *
         * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can
         * omit both cluster and vpc.
         *
         * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
         * created for you.
         *
         * @param cluster The name of the cluster that hosts the service.
         */
        public fun cluster(cluster: ICluster)

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
         *
         * @param cpu The number of cpu units used by the task.
         */
        public fun cpu(cpu: Number)

        /**
         * The desired number of instantiations of the task definition to keep running on the
         * service.
         *
         * Default: 1
         *
         * @param desiredTaskCount The desired number of instantiations of the task definition to
         *   keep running on the service.
         */
        public fun desiredTaskCount(desiredTaskCount: Number)

        /**
         * Indicates whether the rule is enabled.
         *
         * Default: true
         *
         * @param enabled Indicates whether the rule is enabled.
         */
        public fun enabled(enabled: Boolean)

        /**
         * The amount (in GiB) of ephemeral storage to be allocated to the task.
         *
         * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
         *
         * Only supported in Fargate platform version 1.4.0 or later.
         *
         * Default: Undefined, in which case, the task will receive 20GiB ephemeral storage.
         *
         * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to
         *   the task.
         */
        public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

        /**
         * The amount (in MiB) of memory used by the task.
         *
         * This field is required and you must use one of the following values, which determines
         * your range of valid values for the cpu parameter:
         *
         * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)
         *
         * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)
         *
         * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8
         * GB) - Available cpu values: 1024 (1 vCPU)
         *
         * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu
         * values: 2048 (2 vCPU)
         *
         * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu
         * values: 4096 (4 vCPU)
         *
         * Between 16384 (16 GB) and 61440 (60 GB) in increments of 4096 (4 GB) - Available cpu
         * values: 8192 (8 vCPU)
         *
         * Between 32768 (32 GB) and 122880 (120 GB) in increments of 8192 (8 GB) - Available cpu
         * values: 16384 (16 vCPU)
         *
         * This default is set in the underlying FargateTaskDefinition construct.
         *
         * Default: 512
         *
         * @param memoryLimitMiB The amount (in MiB) of memory used by the task.
         */
        public fun memoryLimitMiB(memoryLimitMiB: Number)

        /**
         * The platform version on which to run your service.
         *
         * If one is not specified, the LATEST platform version is used by default. For more
         * information, see
         * [AWS Fargate Platform Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
         * in the Amazon Elastic Container Service Developer Guide.
         *
         * Default: Latest
         *
         * @param platformVersion The platform version on which to run your service.
         */
        public fun platformVersion(platformVersion: FargatePlatformVersion)

        /**
         * Specifies whether to propagate the tags from the task definition to the task.
         *
         * If no value is specified, the tags are not propagated.
         *
         * Default: - Tags will not be propagated
         *
         * @param propagateTags Specifies whether to propagate the tags from the task definition to
         *   the task.
         */
        public fun propagateTags(propagateTags: PropagatedTagSource)

        /**
         * A name for the rule.
         *
         * Default: - AWS CloudFormation generates a unique physical ID and uses that ID for the
         * rule name. For more information, see
         * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html).
         *
         * @param ruleName A name for the rule.
         */
        public fun ruleName(ruleName: String)

        /**
         * The runtime platform of the task definition.
         *
         * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and
         * `cpuArchitecture` is X86_64
         *
         * @param runtimePlatform The runtime platform of the task definition.
         */
        public fun runtimePlatform(runtimePlatform: RuntimePlatform)

        /**
         * The runtime platform of the task definition.
         *
         * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and
         * `cpuArchitecture` is X86_64
         *
         * @param runtimePlatform The runtime platform of the task definition.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b098b43d229d8c2df0e756ab55f1541cfe98de3beae8d737390d6182aaf447c7")
        public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

        /**
         * The schedule or rate (frequency) that determines when CloudWatch Events runs the rule.
         *
         * For more information, see
         * [Schedule Expression Syntax for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
         * in the Amazon CloudWatch User Guide.
         *
         * @param schedule The schedule or rate (frequency) that determines when CloudWatch Events
         *   runs the rule.
         */
        public fun schedule(schedule: Schedule)

        /**
         * The properties to define if using an existing TaskDefinition in this construct.
         *
         * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be
         * defined, but not both.
         *
         * Default: none
         *
         * @param scheduledFargateTaskDefinitionOptions The properties to define if using an
         *   existing TaskDefinition in this construct.
         */
        public fun scheduledFargateTaskDefinitionOptions(
            scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions
        )

        /**
         * The properties to define if using an existing TaskDefinition in this construct.
         *
         * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be
         * defined, but not both.
         *
         * Default: none
         *
         * @param scheduledFargateTaskDefinitionOptions The properties to define if using an
         *   existing TaskDefinition in this construct.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7151df2ca070e6cbad671c64a5bcba05af00515eae71a0f15cc3db0fe7308692")
        public fun scheduledFargateTaskDefinitionOptions(
            scheduledFargateTaskDefinitionOptions:
                ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit
        )

        /**
         * The properties to define if the construct is to create a TaskDefinition.
         *
         * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be
         * defined, but not both.
         *
         * Default: none
         *
         * @param scheduledFargateTaskImageOptions The properties to define if the construct is to
         *   create a TaskDefinition.
         */
        public fun scheduledFargateTaskImageOptions(
            scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions
        )

        /**
         * The properties to define if the construct is to create a TaskDefinition.
         *
         * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be
         * defined, but not both.
         *
         * Default: none
         *
         * @param scheduledFargateTaskImageOptions The properties to define if the construct is to
         *   create a TaskDefinition.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("f80fd70647f97905513bf16e47224f8409b334224e87ed424380be8a5b9a227b")
        public fun scheduledFargateTaskImageOptions(
            scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions.Builder.() -> Unit
        )

        /**
         * Existing security groups to use for your service.
         *
         * Default: - a new security group will be created.
         *
         * @param securityGroups Existing security groups to use for your service.
         */
        public fun securityGroups(securityGroups: List<ISecurityGroup>)

        /**
         * Existing security groups to use for your service.
         *
         * Default: - a new security group will be created.
         *
         * @param securityGroups Existing security groups to use for your service.
         */
        public fun securityGroups(vararg securityGroups: ISecurityGroup)

        /**
         * In what subnets to place the task's ENIs.
         *
         * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
         *
         * Default: Private subnets
         *
         * @param subnetSelection In what subnets to place the task's ENIs.
         */
        public fun subnetSelection(subnetSelection: SubnetSelection)

        /**
         * In what subnets to place the task's ENIs.
         *
         * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
         *
         * Default: Private subnets
         *
         * @param subnetSelection In what subnets to place the task's ENIs.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("1a76d0f0225902f4fff257b6f9ac37d9c42d3fe22aae9d5222685488a6058927")
        public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

        /**
         * The metadata that you apply to the task to help you categorize and organize them.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * Default: - No tags are applied to the task
         *
         * @param tags The metadata that you apply to the task to help you categorize and organize
         *   them.
         */
        public fun tags(tags: List<Tag>)

        /**
         * The metadata that you apply to the task to help you categorize and organize them.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * Default: - No tags are applied to the task
         *
         * @param tags The metadata that you apply to the task to help you categorize and organize
         *   them.
         */
        public fun tags(vararg tags: Tag)

        /**
         * The task definition to use for tasks in the service. TaskDefinition or TaskImageOptions
         * must be specified, but not both.
         *
         * [disable-awslint:ref-via-interface]
         *
         * Default: - none
         *
         * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition
         *   or TaskImageOptions must be specified, but not both.
         */
        public fun taskDefinition(taskDefinition: FargateTaskDefinition)

        /**
         * The VPC where the container instances will be launched or the elastic network interfaces
         * (ENIs) will be deployed.
         *
         * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can
         * omit both vpc and cluster.
         *
         * Default: - uses the VPC defined in the cluster or creates a new VPC.
         *
         * @param vpc The VPC where the container instances will be launched or the elastic network
         *   interfaces (ENIs) will be deployed.
         */
        public fun vpc(vpc: IVpc)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask.Builder =
            software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask.Builder.create(
                scope,
                id
            )

        /**
         * The name of the cluster that hosts the service.
         *
         * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can
         * omit both cluster and vpc.
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
         *
         * @param cpu The number of cpu units used by the task.
         */
        override fun cpu(cpu: Number) {
            cdkBuilder.cpu(cpu)
        }

        /**
         * The desired number of instantiations of the task definition to keep running on the
         * service.
         *
         * Default: 1
         *
         * @param desiredTaskCount The desired number of instantiations of the task definition to
         *   keep running on the service.
         */
        override fun desiredTaskCount(desiredTaskCount: Number) {
            cdkBuilder.desiredTaskCount(desiredTaskCount)
        }

        /**
         * Indicates whether the rule is enabled.
         *
         * Default: true
         *
         * @param enabled Indicates whether the rule is enabled.
         */
        override fun enabled(enabled: Boolean) {
            cdkBuilder.enabled(enabled)
        }

        /**
         * The amount (in GiB) of ephemeral storage to be allocated to the task.
         *
         * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
         *
         * Only supported in Fargate platform version 1.4.0 or later.
         *
         * Default: Undefined, in which case, the task will receive 20GiB ephemeral storage.
         *
         * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to
         *   the task.
         */
        override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
            cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
        }

        /**
         * The amount (in MiB) of memory used by the task.
         *
         * This field is required and you must use one of the following values, which determines
         * your range of valid values for the cpu parameter:
         *
         * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)
         *
         * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)
         *
         * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8
         * GB) - Available cpu values: 1024 (1 vCPU)
         *
         * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu
         * values: 2048 (2 vCPU)
         *
         * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu
         * values: 4096 (4 vCPU)
         *
         * Between 16384 (16 GB) and 61440 (60 GB) in increments of 4096 (4 GB) - Available cpu
         * values: 8192 (8 vCPU)
         *
         * Between 32768 (32 GB) and 122880 (120 GB) in increments of 8192 (8 GB) - Available cpu
         * values: 16384 (16 vCPU)
         *
         * This default is set in the underlying FargateTaskDefinition construct.
         *
         * Default: 512
         *
         * @param memoryLimitMiB The amount (in MiB) of memory used by the task.
         */
        override fun memoryLimitMiB(memoryLimitMiB: Number) {
            cdkBuilder.memoryLimitMiB(memoryLimitMiB)
        }

        /**
         * The platform version on which to run your service.
         *
         * If one is not specified, the LATEST platform version is used by default. For more
         * information, see
         * [AWS Fargate Platform Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
         * in the Amazon Elastic Container Service Developer Guide.
         *
         * Default: Latest
         *
         * @param platformVersion The platform version on which to run your service.
         */
        override fun platformVersion(platformVersion: FargatePlatformVersion) {
            cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
        }

        /**
         * Specifies whether to propagate the tags from the task definition to the task.
         *
         * If no value is specified, the tags are not propagated.
         *
         * Default: - Tags will not be propagated
         *
         * @param propagateTags Specifies whether to propagate the tags from the task definition to
         *   the task.
         */
        override fun propagateTags(propagateTags: PropagatedTagSource) {
            cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
        }

        /**
         * A name for the rule.
         *
         * Default: - AWS CloudFormation generates a unique physical ID and uses that ID for the
         * rule name. For more information, see
         * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html).
         *
         * @param ruleName A name for the rule.
         */
        override fun ruleName(ruleName: String) {
            cdkBuilder.ruleName(ruleName)
        }

        /**
         * The runtime platform of the task definition.
         *
         * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and
         * `cpuArchitecture` is X86_64
         *
         * @param runtimePlatform The runtime platform of the task definition.
         */
        override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
            cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
        }

        /**
         * The runtime platform of the task definition.
         *
         * Default: - If the property is undefined, `operatingSystemFamily` is LINUX and
         * `cpuArchitecture` is X86_64
         *
         * @param runtimePlatform The runtime platform of the task definition.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b098b43d229d8c2df0e756ab55f1541cfe98de3beae8d737390d6182aaf447c7")
        override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
            runtimePlatform(RuntimePlatform(runtimePlatform))

        /**
         * The schedule or rate (frequency) that determines when CloudWatch Events runs the rule.
         *
         * For more information, see
         * [Schedule Expression Syntax for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
         * in the Amazon CloudWatch User Guide.
         *
         * @param schedule The schedule or rate (frequency) that determines when CloudWatch Events
         *   runs the rule.
         */
        override fun schedule(schedule: Schedule) {
            cdkBuilder.schedule(schedule.let(Schedule::unwrap))
        }

        /**
         * The properties to define if using an existing TaskDefinition in this construct.
         *
         * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be
         * defined, but not both.
         *
         * Default: none
         *
         * @param scheduledFargateTaskDefinitionOptions The properties to define if using an
         *   existing TaskDefinition in this construct.
         */
        override fun scheduledFargateTaskDefinitionOptions(
            scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions
        ) {
            cdkBuilder.scheduledFargateTaskDefinitionOptions(
                scheduledFargateTaskDefinitionOptions.let(
                    ScheduledFargateTaskDefinitionOptions::unwrap
                )
            )
        }

        /**
         * The properties to define if using an existing TaskDefinition in this construct.
         *
         * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be
         * defined, but not both.
         *
         * Default: none
         *
         * @param scheduledFargateTaskDefinitionOptions The properties to define if using an
         *   existing TaskDefinition in this construct.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7151df2ca070e6cbad671c64a5bcba05af00515eae71a0f15cc3db0fe7308692")
        override fun scheduledFargateTaskDefinitionOptions(
            scheduledFargateTaskDefinitionOptions:
                ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit
        ): Unit =
            scheduledFargateTaskDefinitionOptions(
                ScheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions)
            )

        /**
         * The properties to define if the construct is to create a TaskDefinition.
         *
         * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be
         * defined, but not both.
         *
         * Default: none
         *
         * @param scheduledFargateTaskImageOptions The properties to define if the construct is to
         *   create a TaskDefinition.
         */
        override fun scheduledFargateTaskImageOptions(
            scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions
        ) {
            cdkBuilder.scheduledFargateTaskImageOptions(
                scheduledFargateTaskImageOptions.let(ScheduledFargateTaskImageOptions::unwrap)
            )
        }

        /**
         * The properties to define if the construct is to create a TaskDefinition.
         *
         * ScheduledFargateTaskDefinitionOptions or ScheduledFargateTaskImageOptions must be
         * defined, but not both.
         *
         * Default: none
         *
         * @param scheduledFargateTaskImageOptions The properties to define if the construct is to
         *   create a TaskDefinition.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("f80fd70647f97905513bf16e47224f8409b334224e87ed424380be8a5b9a227b")
        override fun scheduledFargateTaskImageOptions(
            scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions.Builder.() -> Unit
        ): Unit =
            scheduledFargateTaskImageOptions(
                ScheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions)
            )

        /**
         * Existing security groups to use for your service.
         *
         * Default: - a new security group will be created.
         *
         * @param securityGroups Existing security groups to use for your service.
         */
        override fun securityGroups(securityGroups: List<ISecurityGroup>) {
            cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
        }

        /**
         * Existing security groups to use for your service.
         *
         * Default: - a new security group will be created.
         *
         * @param securityGroups Existing security groups to use for your service.
         */
        override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
            securityGroups(securityGroups.toList())

        /**
         * In what subnets to place the task's ENIs.
         *
         * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
         *
         * Default: Private subnets
         *
         * @param subnetSelection In what subnets to place the task's ENIs.
         */
        override fun subnetSelection(subnetSelection: SubnetSelection) {
            cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
        }

        /**
         * In what subnets to place the task's ENIs.
         *
         * (Only applicable in case the TaskDefinition is configured for AwsVpc networking)
         *
         * Default: Private subnets
         *
         * @param subnetSelection In what subnets to place the task's ENIs.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("1a76d0f0225902f4fff257b6f9ac37d9c42d3fe22aae9d5222685488a6058927")
        override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
            subnetSelection(SubnetSelection(subnetSelection))

        /**
         * The metadata that you apply to the task to help you categorize and organize them.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * Default: - No tags are applied to the task
         *
         * @param tags The metadata that you apply to the task to help you categorize and organize
         *   them.
         */
        override fun tags(tags: List<Tag>) {
            cdkBuilder.tags(tags.map(Tag::unwrap))
        }

        /**
         * The metadata that you apply to the task to help you categorize and organize them.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * Default: - No tags are applied to the task
         *
         * @param tags The metadata that you apply to the task to help you categorize and organize
         *   them.
         */
        override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

        /**
         * The task definition to use for tasks in the service. TaskDefinition or TaskImageOptions
         * must be specified, but not both.
         *
         * [disable-awslint:ref-via-interface]
         *
         * Default: - none
         *
         * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition
         *   or TaskImageOptions must be specified, but not both.
         */
        override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
            cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
        }

        /**
         * The VPC where the container instances will be launched or the elastic network interfaces
         * (ENIs) will be deployed.
         *
         * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can
         * omit both vpc and cluster.
         *
         * Default: - uses the VPC defined in the cluster or creates a new VPC.
         *
         * @param vpc The VPC where the container instances will be launched or the elastic network
         *   interfaces (ENIs) will be deployed.
         */
        override fun vpc(vpc: IVpc) {
            cdkBuilder.vpc(vpc.let(IVpc::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): ScheduledFargateTask {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return ScheduledFargateTask(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask
        ): ScheduledFargateTask = ScheduledFargateTask(cdkObject)

        internal fun unwrap(
            wrapped: ScheduledFargateTask
        ): software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask = wrapped.cdkObject
    }
}
