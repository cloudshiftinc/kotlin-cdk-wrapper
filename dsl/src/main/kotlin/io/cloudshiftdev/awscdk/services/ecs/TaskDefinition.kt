package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TaskDefinition
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.TaskDefinition,
) : Resource(cdkObject), ITaskDefinition {
    /**
     * Adds a new container to the task definition.
     *
     * @param id
     * @param props
     */
    public open fun addContainer(
        id: String,
        props: ContainerDefinitionOptions
    ): ContainerDefinition =
        unwrap(this)
            .addContainer(id, props.let(ContainerDefinitionOptions::unwrap))
            .let(ContainerDefinition::wrap)

    /**
     * Adds a new container to the task definition.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad60dadcf6b5a99535d38733285d125986065c711b1844893efc32b804589a91")
    public open fun addContainer(
        id: String,
        props: ContainerDefinitionOptions.Builder.() -> Unit
    ): ContainerDefinition = addContainer(id, ContainerDefinitionOptions(props))

    /**
     * Adds the specified extension to the task definition.
     *
     * Extension can be used to apply a packaged modification to a task definition.
     *
     * @param extension
     */
    public open fun addExtension(extension: ITaskDefinitionExtension) {
        unwrap(this).addExtension(extension.let(ITaskDefinitionExtension::unwrap))
    }

    /**
     * Adds a firelens log router to the task definition.
     *
     * @param id
     * @param props
     */
    public open fun addFirelensLogRouter(
        id: String,
        props: FirelensLogRouterDefinitionOptions
    ): FirelensLogRouter =
        unwrap(this)
            .addFirelensLogRouter(id, props.let(FirelensLogRouterDefinitionOptions::unwrap))
            .let(FirelensLogRouter::wrap)

    /**
     * Adds a firelens log router to the task definition.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("258a71ad373c4fb9e743bd33d3129ca14a28d65c32d22a7f72744771987c7982")
    public open fun addFirelensLogRouter(
        id: String,
        props: FirelensLogRouterDefinitionOptions.Builder.() -> Unit
    ): FirelensLogRouter = addFirelensLogRouter(id, FirelensLogRouterDefinitionOptions(props))

    /**
     * Adds an inference accelerator to the task definition.
     *
     * @param inferenceAccelerator
     */
    public open fun addInferenceAccelerator(inferenceAccelerator: InferenceAccelerator) {
        unwrap(this).addInferenceAccelerator(inferenceAccelerator.let(InferenceAccelerator::unwrap))
    }

    /**
     * Adds an inference accelerator to the task definition.
     *
     * @param inferenceAccelerator
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ed9df469538219aa4a519c5c670da4fa01bf9950e8d2a410fbf5d7fc465f966")
    public open fun addInferenceAccelerator(
        inferenceAccelerator: InferenceAccelerator.Builder.() -> Unit
    ): Unit = addInferenceAccelerator(InferenceAccelerator(inferenceAccelerator))

    /**
     * Adds the specified placement constraint to the task definition.
     *
     * @param constraint
     */
    public open fun addPlacementConstraint(constraint: PlacementConstraint) {
        unwrap(this).addPlacementConstraint(constraint.let(PlacementConstraint::unwrap))
    }

    /**
     * Adds a policy statement to the task execution IAM role.
     *
     * @param statement
     */
    public open fun addToExecutionRolePolicy(statement: PolicyStatement) {
        unwrap(this).addToExecutionRolePolicy(statement.let(PolicyStatement::unwrap))
    }

    /**
     * Adds a policy statement to the task execution IAM role.
     *
     * @param statement
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ee0881b1f72939d0f8c599ca7ef5c095e7f2670a8906152a8367c1e12787a29")
    public open fun addToExecutionRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
        addToExecutionRolePolicy(PolicyStatement(statement))

    /**
     * Adds a policy statement to the task IAM role.
     *
     * @param statement
     */
    public open fun addToTaskRolePolicy(statement: PolicyStatement) {
        unwrap(this).addToTaskRolePolicy(statement.let(PolicyStatement::unwrap))
    }

    /**
     * Adds a policy statement to the task IAM role.
     *
     * @param statement
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4455c89f8cab571ccd1f229ecd42ae6b3966874f347caabc39813cfc1946816f")
    public open fun addToTaskRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
        addToTaskRolePolicy(PolicyStatement(statement))

    /**
     * Adds a volume to the task definition.
     *
     * @param volume
     */
    public open fun addVolume(volume: Volume) {
        unwrap(this).addVolume(volume.let(Volume::unwrap))
    }

    /**
     * Adds a volume to the task definition.
     *
     * @param volume
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bffd0bc09d79ff6543111408c1d0d29f051556ff9169fbf7b3c3851b9e888429")
    public open fun addVolume(volume: Volume.Builder.() -> Unit): Unit = addVolume(Volume(volume))

    /** The task launch type compatibility requirement. */
    public override fun compatibility(): Compatibility =
        unwrap(this).getCompatibility().let(Compatibility::wrap)

    /**
     * Default container for this task.
     *
     * Load balancers will send traffic to this container. The first essential container that is
     * added to this task will become the default container.
     */
    public open fun defaultContainer(): ContainerDefinition? =
        unwrap(this).getDefaultContainer()?.let(ContainerDefinition::wrap)

    /**
     * Default container for this task.
     *
     * Load balancers will send traffic to this container. The first essential container that is
     * added to this task will become the default container.
     */
    public open fun defaultContainer(`value`: ContainerDefinition) {
        unwrap(this).setDefaultContainer(`value`.let(ContainerDefinition::unwrap))
    }

    /**
     * The amount (in GiB) of ephemeral storage to be allocated to the task.
     *
     * Only supported in Fargate platform version 1.4.0 or later.
     */
    public open fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

    /** Execution role for this task definition. */
    public override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    /**
     * The name of a family that this task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     */
    public open fun family(): String = unwrap(this).getFamily()

    /**
     * Returns the container that match the provided containerName.
     *
     * @param containerName
     */
    public open fun findContainer(containerName: String): ContainerDefinition? =
        unwrap(this).findContainer(containerName)?.let(ContainerDefinition::wrap)

    /**
     * Determine the existing port mapping for the provided name.
     *
     * @param name : port mapping name.
     * @return PortMapping for the provided name, if it exists.
     */
    public open fun findPortMappingByName(name: String): PortMapping? =
        unwrap(this).findPortMappingByName(name)?.let(PortMapping::wrap)

    /**
     * Grants permissions to run this task definition.
     *
     * This will grant the following permissions:
     * * ecs:RunTask
     * * iam:PassRole
     *
     * @param grantee Principal to grant consume rights to.
     */
    public open fun grantRun(grantee: IGrantable): Grant =
        unwrap(this).grantRun(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /** Public getter method to access list of inference accelerators attached to the instance. */
    public open fun inferenceAccelerators(): List<InferenceAccelerator> =
        unwrap(this).getInferenceAccelerators().map(InferenceAccelerator::wrap)

    /** Return true if the task definition can be run on an EC2 cluster. */
    public override fun isEc2Compatible(): Boolean = unwrap(this).getIsEc2Compatible()

    /** Return true if the task definition can be run on a ECS anywhere cluster. */
    public override fun isExternalCompatible(): Boolean = unwrap(this).getIsExternalCompatible()

    /** Return true if the task definition can be run on a Fargate cluster. */
    public override fun isFargateCompatible(): Boolean = unwrap(this).getIsFargateCompatible()

    /** The networking mode to use for the containers in the task. */
    public override fun networkMode(): NetworkMode =
        unwrap(this).getNetworkMode().let(NetworkMode::wrap)

    /** Creates the task execution IAM role if it doesn't already exist. */
    public open fun obtainExecutionRole(): IRole =
        unwrap(this).obtainExecutionRole().let(IRole::wrap)

    /**
     * Whether this task definition has at least a container that references a specific JSON field
     * of a secret stored in Secrets Manager.
     */
    public open fun referencesSecretJsonField(): Boolean? =
        unwrap(this).getReferencesSecretJsonField()

    /** The full Amazon Resource Name (ARN) of the task definition. */
    public override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()

    /**
     * The name of the IAM role that grants containers in the task permission to call AWS APIs on
     * your behalf.
     */
    public override fun taskRole(): IRole = unwrap(this).getTaskRole().let(IRole::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.TaskDefinition]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The task launch type compatiblity requirement.
         *
         * @param compatibility The task launch type compatiblity requirement.
         */
        public fun compatibility(compatibility: Compatibility)

        /**
         * The number of cpu units used by the task.
         *
         * If you are using the EC2 launch type, this field is optional and any value can be used.
         * If you are using the Fargate launch type, this field is required and you must use one of
         * the following values, which determines your range of valid values for the memory
         * parameter:
         *
         * 256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
         *
         * 512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4
         * GB)
         *
         * 1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5
         * GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
         *
         * 2048 (2 vCPU) - Available memory values: Between 4096 (4 GB) and 16384 (16 GB) in
         * increments of 1024 (1 GB)
         *
         * 4096 (4 vCPU) - Available memory values: Between 8192 (8 GB) and 30720 (30 GB) in
         * increments of 1024 (1 GB)
         *
         * 8192 (8 vCPU) - Available memory values: Between 16384 (16 GB) and 61440 (60 GB) in
         * increments of 4096 (4 GB)
         *
         * 16384 (16 vCPU) - Available memory values: Between 32768 (32 GB) and 122880 (120 GB) in
         * increments of 8192 (8 GB)
         *
         * Default: - CPU units are not specified.
         *
         * @param cpu The number of cpu units used by the task.
         */
        public fun cpu(cpu: String)

        /**
         * The amount (in GiB) of ephemeral storage to be allocated to the task.
         *
         * Only supported in Fargate platform version 1.4.0 or later.
         *
         * Default: - Undefined, in which case, the task will receive 20GiB ephemeral storage.
         *
         * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to
         *   the task.
         */
        public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

        /**
         * The name of the IAM task execution role that grants the ECS agent permission to call AWS
         * APIs on your behalf.
         *
         * The role will be used to retrieve container images from ECR and create CloudWatch log
         * groups.
         *
         * Default: - An execution role will be automatically created if you use ECR images in your
         * task definition.
         *
         * @param executionRole The name of the IAM task execution role that grants the ECS agent
         *   permission to call AWS APIs on your behalf.
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
         *   task.
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
         *   task.
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
         * The amount (in MiB) of memory used by the task.
         *
         * If using the EC2 launch type, this field is optional and any value can be used. If using
         * the Fargate launch type, this field is required and you must use one of the following
         * values, which determines your range of valid values for the cpu parameter:
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
         * Default: - Memory used by task is not specified.
         *
         * @param memoryMiB The amount (in MiB) of memory used by the task.
         */
        public fun memoryMiB(memoryMiB: String)

        /**
         * The networking mode to use for the containers in the task.
         *
         * On Fargate, the only supported networking mode is AwsVpc.
         *
         * Default: - NetworkMode.Bridge for EC2 & External tasks, AwsVpc for Fargate tasks.
         *
         * @param networkMode The networking mode to use for the containers in the task.
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
         * The placement constraints to use for tasks in the service.
         *
         * You can specify a maximum of 10 constraints per task (this limit includes constraints in
         * the task definition and those specified at run time).
         *
         * Not supported in Fargate.
         *
         * Default: - No placement constraints.
         *
         * @param placementConstraints The placement constraints to use for tasks in the service.
         */
        public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

        /**
         * The placement constraints to use for tasks in the service.
         *
         * You can specify a maximum of 10 constraints per task (this limit includes constraints in
         * the task definition and those specified at run time).
         *
         * Not supported in Fargate.
         *
         * Default: - No placement constraints.
         *
         * @param placementConstraints The placement constraints to use for tasks in the service.
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
         * The operating system that your task definitions are running on.
         *
         * A runtimePlatform is supported only for tasks using the Fargate launch type.
         *
         * Default: - Undefined.
         *
         * @param runtimePlatform The operating system that your task definitions are running on.
         */
        public fun runtimePlatform(runtimePlatform: RuntimePlatform)

        /**
         * The operating system that your task definitions are running on.
         *
         * A runtimePlatform is supported only for tasks using the Fargate launch type.
         *
         * Default: - Undefined.
         *
         * @param runtimePlatform The operating system that your task definitions are running on.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("d2ff86d615eead154754b56faf36a13fe8e205c4641867bc32276e89999f71c9")
        public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

        /**
         * The name of the IAM role that grants containers in the task permission to call AWS APIs
         * on your behalf.
         *
         * Default: - A task role is automatically created for you.
         *
         * @param taskRole The name of the IAM role that grants containers in the task permission to
         *   call AWS APIs on your behalf.
         */
        public fun taskRole(taskRole: IRole)

        /**
         * The list of volume definitions for the task.
         *
         * For more information, see
         * [Task Definition Parameter Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
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
         * [Task Definition Parameter Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
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
        private val cdkBuilder: software.amazon.awscdk.services.ecs.TaskDefinition.Builder =
            software.amazon.awscdk.services.ecs.TaskDefinition.Builder.create(scope, id)

        /**
         * The task launch type compatiblity requirement.
         *
         * @param compatibility The task launch type compatiblity requirement.
         */
        override fun compatibility(compatibility: Compatibility) {
            cdkBuilder.compatibility(compatibility.let(Compatibility::unwrap))
        }

        /**
         * The number of cpu units used by the task.
         *
         * If you are using the EC2 launch type, this field is optional and any value can be used.
         * If you are using the Fargate launch type, this field is required and you must use one of
         * the following values, which determines your range of valid values for the memory
         * parameter:
         *
         * 256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
         *
         * 512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4
         * GB)
         *
         * 1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5
         * GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
         *
         * 2048 (2 vCPU) - Available memory values: Between 4096 (4 GB) and 16384 (16 GB) in
         * increments of 1024 (1 GB)
         *
         * 4096 (4 vCPU) - Available memory values: Between 8192 (8 GB) and 30720 (30 GB) in
         * increments of 1024 (1 GB)
         *
         * 8192 (8 vCPU) - Available memory values: Between 16384 (16 GB) and 61440 (60 GB) in
         * increments of 4096 (4 GB)
         *
         * 16384 (16 vCPU) - Available memory values: Between 32768 (32 GB) and 122880 (120 GB) in
         * increments of 8192 (8 GB)
         *
         * Default: - CPU units are not specified.
         *
         * @param cpu The number of cpu units used by the task.
         */
        override fun cpu(cpu: String) {
            cdkBuilder.cpu(cpu)
        }

        /**
         * The amount (in GiB) of ephemeral storage to be allocated to the task.
         *
         * Only supported in Fargate platform version 1.4.0 or later.
         *
         * Default: - Undefined, in which case, the task will receive 20GiB ephemeral storage.
         *
         * @param ephemeralStorageGiB The amount (in GiB) of ephemeral storage to be allocated to
         *   the task.
         */
        override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
            cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
        }

        /**
         * The name of the IAM task execution role that grants the ECS agent permission to call AWS
         * APIs on your behalf.
         *
         * The role will be used to retrieve container images from ECR and create CloudWatch log
         * groups.
         *
         * Default: - An execution role will be automatically created if you use ECR images in your
         * task definition.
         *
         * @param executionRole The name of the IAM task execution role that grants the ECS agent
         *   permission to call AWS APIs on your behalf.
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
         *   task.
         */
        override fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>) {
            cdkBuilder.inferenceAccelerators(
                inferenceAccelerators.map(InferenceAccelerator::unwrap)
            )
        }

        /**
         * The inference accelerators to use for the containers in the task.
         *
         * Not supported in Fargate.
         *
         * Default: - No inference accelerators.
         *
         * @param inferenceAccelerators The inference accelerators to use for the containers in the
         *   task.
         */
        override fun inferenceAccelerators(
            vararg inferenceAccelerators: InferenceAccelerator
        ): Unit = inferenceAccelerators(inferenceAccelerators.toList())

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
         * The amount (in MiB) of memory used by the task.
         *
         * If using the EC2 launch type, this field is optional and any value can be used. If using
         * the Fargate launch type, this field is required and you must use one of the following
         * values, which determines your range of valid values for the cpu parameter:
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
         * Default: - Memory used by task is not specified.
         *
         * @param memoryMiB The amount (in MiB) of memory used by the task.
         */
        override fun memoryMiB(memoryMiB: String) {
            cdkBuilder.memoryMiB(memoryMiB)
        }

        /**
         * The networking mode to use for the containers in the task.
         *
         * On Fargate, the only supported networking mode is AwsVpc.
         *
         * Default: - NetworkMode.Bridge for EC2 & External tasks, AwsVpc for Fargate tasks.
         *
         * @param networkMode The networking mode to use for the containers in the task.
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
         * The placement constraints to use for tasks in the service.
         *
         * You can specify a maximum of 10 constraints per task (this limit includes constraints in
         * the task definition and those specified at run time).
         *
         * Not supported in Fargate.
         *
         * Default: - No placement constraints.
         *
         * @param placementConstraints The placement constraints to use for tasks in the service.
         */
        override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
            cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
        }

        /**
         * The placement constraints to use for tasks in the service.
         *
         * You can specify a maximum of 10 constraints per task (this limit includes constraints in
         * the task definition and those specified at run time).
         *
         * Not supported in Fargate.
         *
         * Default: - No placement constraints.
         *
         * @param placementConstraints The placement constraints to use for tasks in the service.
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
         * The operating system that your task definitions are running on.
         *
         * A runtimePlatform is supported only for tasks using the Fargate launch type.
         *
         * Default: - Undefined.
         *
         * @param runtimePlatform The operating system that your task definitions are running on.
         */
        override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
            cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
        }

        /**
         * The operating system that your task definitions are running on.
         *
         * A runtimePlatform is supported only for tasks using the Fargate launch type.
         *
         * Default: - Undefined.
         *
         * @param runtimePlatform The operating system that your task definitions are running on.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("d2ff86d615eead154754b56faf36a13fe8e205c4641867bc32276e89999f71c9")
        override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
            runtimePlatform(RuntimePlatform(runtimePlatform))

        /**
         * The name of the IAM role that grants containers in the task permission to call AWS APIs
         * on your behalf.
         *
         * Default: - A task role is automatically created for you.
         *
         * @param taskRole The name of the IAM role that grants containers in the task permission to
         *   call AWS APIs on your behalf.
         */
        override fun taskRole(taskRole: IRole) {
            cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
        }

        /**
         * The list of volume definitions for the task.
         *
         * For more information, see
         * [Task Definition Parameter Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
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
         * [Task Definition Parameter Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
         *
         * Default: - No volumes are passed to the Docker daemon on a container instance.
         *
         * @param volumes The list of volume definitions for the task.
         */
        override fun volumes(vararg volumes: Volume): Unit = volumes(volumes.toList())

        public fun build(): software.amazon.awscdk.services.ecs.TaskDefinition = cdkBuilder.build()
    }

    public companion object {
        public fun fromTaskDefinitionArn(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            taskDefinitionArn: String,
        ): ITaskDefinition =
            software.amazon.awscdk.services.ecs.TaskDefinition.fromTaskDefinitionArn(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    taskDefinitionArn
                )
                .let(ITaskDefinition::wrap)

        public fun fromTaskDefinitionAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: TaskDefinitionAttributes,
        ): ITaskDefinition =
            software.amazon.awscdk.services.ecs.TaskDefinition.fromTaskDefinitionAttributes(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    attrs.let(TaskDefinitionAttributes::unwrap)
                )
                .let(ITaskDefinition::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ed824df4eec5e5f45c3bcd7ff84cc08d918cf494c5b6d021f8cb2e318fba063c")
        public fun fromTaskDefinitionAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: TaskDefinitionAttributes.Builder.() -> Unit,
        ): ITaskDefinition =
            fromTaskDefinitionAttributes(scope, id, TaskDefinitionAttributes(attrs))

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): TaskDefinition {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return TaskDefinition(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.TaskDefinition
        ): TaskDefinition = TaskDefinition(cdkObject)

        internal fun unwrap(
            wrapped: TaskDefinition
        ): software.amazon.awscdk.services.ecs.TaskDefinition = wrapped.cdkObject
    }
}
