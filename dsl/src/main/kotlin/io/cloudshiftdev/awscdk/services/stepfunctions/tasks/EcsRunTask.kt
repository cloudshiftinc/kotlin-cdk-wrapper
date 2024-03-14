package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.TaskDefinition
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EcsRunTask
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask,
) : TaskStateBase(cdkObject), IConnectable {
    /** Manage allowed network traffic for this service. */
    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.EcsRunTask]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Assign public IP addresses to each task.
         *
         * Default: false
         *
         * @param assignPublicIp Assign public IP addresses to each task.
         */
        public fun assignPublicIp(assignPublicIp: Boolean)

        /**
         * The ECS cluster to run the task on.
         *
         * @param cluster The ECS cluster to run the task on.
         */
        public fun cluster(cluster: ICluster)

        /**
         * An optional description for this state.
         *
         * Default: - No comment
         *
         * @param comment An optional description for this state.
         */
        public fun comment(comment: String)

        /**
         * Container setting overrides.
         *
         * Specify the container to use and the overrides to apply.
         *
         * Default: - No overrides
         *
         * @param containerOverrides Container setting overrides.
         */
        public fun containerOverrides(containerOverrides: List<ContainerOverride>)

        /**
         * Container setting overrides.
         *
         * Specify the container to use and the overrides to apply.
         *
         * Default: - No overrides
         *
         * @param containerOverrides Container setting overrides.
         */
        public fun containerOverrides(vararg containerOverrides: ContainerOverride)

        /**
         * Credentials for an IAM Role that the State Machine assumes for executing the task.
         *
         * This enables cross-account resource invocations.
         *
         * Default: - None (Task is executed using the State Machine's execution role)
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
         *
         * @param credentials Credentials for an IAM Role that the State Machine assumes for
         *   executing the task.
         */
        public fun credentials(credentials: Credentials)

        /**
         * Credentials for an IAM Role that the State Machine assumes for executing the task.
         *
         * This enables cross-account resource invocations.
         *
         * Default: - None (Task is executed using the State Machine's execution role)
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
         *
         * @param credentials Credentials for an IAM Role that the State Machine assumes for
         *   executing the task.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("70ebe03278a53b551b732afadb0fad9fa84cad26998f0d5390edfd9bf918bd2e")
        public fun credentials(credentials: Credentials.Builder.() -> Unit)

        /**
         * (deprecated) Timeout for the heartbeat.
         *
         * Default: - None
         *
         * @param heartbeat Timeout for the heartbeat.
         * @deprecated use `heartbeatTimeout`
         */
        @Deprecated(message = "deprecated in CDK") public fun heartbeat(heartbeat: Duration)

        /**
         * Timeout for the heartbeat.
         *
         * [disable-awslint:duration-prop-type] is needed because all props interface in
         * aws-stepfunctions-tasks extend this interface
         *
         * Default: - None
         *
         * @param heartbeatTimeout Timeout for the heartbeat.
         */
        public fun heartbeatTimeout(heartbeatTimeout: Timeout)

        /**
         * JSONPath expression to select part of the state to be the input to this state.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the effective input to
         * be the empty object {}.
         *
         * Default: - The entire task input (JSON path '$')
         *
         * @param inputPath JSONPath expression to select part of the state to be the input to this
         *   state.
         */
        public fun inputPath(inputPath: String)

        /**
         * AWS Step Functions integrates with services directly in the Amazon States Language.
         *
         * You can control these AWS services using service integration patterns.
         *
         * Depending on the AWS Service, the Service Integration Pattern availability will vary.
         *
         * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
         * `IntegrationPattern.RUN_JOB` for the following exceptions: `BatchSubmitJob`,
         * `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
         * `EmrContainersStartJobRun`.
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
         *
         * @param integrationPattern AWS Step Functions integrates with services directly in the
         *   Amazon States Language.
         */
        public fun integrationPattern(integrationPattern: IntegrationPattern)

        /**
         * An Amazon ECS launch type determines the type of infrastructure on which your tasks and
         * services are hosted.
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
         *
         * @param launchTarget An Amazon ECS launch type determines the type of infrastructure on
         *   which your tasks and services are hosted.
         */
        public fun launchTarget(launchTarget: IEcsLaunchTarget)

        /**
         * JSONPath expression to select select a portion of the state output to pass to the next
         * state.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the effective output to
         * be the empty object {}.
         *
         * Default: - The entire JSON node determined by the state input, the task result, and
         * resultPath is passed to the next state (JSON path '$')
         *
         * @param outputPath JSONPath expression to select select a portion of the state output to
         *   pass to the next state.
         */
        public fun outputPath(outputPath: String)

        /**
         * Specifies whether to propagate the tags from the task definition to the task.
         *
         * An error will be received if you specify the SERVICE option when running a task.
         *
         * Default: - No tags are propagated.
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-propagateTags)
         *
         * @param propagatedTagSource Specifies whether to propagate the tags from the task
         *   definition to the task.
         */
        public fun propagatedTagSource(propagatedTagSource: PropagatedTagSource)

        /**
         * JSONPath expression to indicate where to inject the state's output.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the state's input to
         * become its output.
         *
         * Default: - Replaces the entire input with the result (JSON path '$')
         *
         * @param resultPath JSONPath expression to indicate where to inject the state's output.
         */
        public fun resultPath(resultPath: String)

        /**
         * The JSON that will replace the state's raw result and become the effective result before
         * ResultPath is applied.
         *
         * You can use ResultSelector to create a payload with values that are static or selected
         * from the state's raw result.
         *
         * Default: - None
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
         *
         * @param resultSelector The JSON that will replace the state's raw result and become the
         *   effective result before ResultPath is applied.
         */
        public fun resultSelector(resultSelector: Map<String, Any>)

        /**
         * The revision number of ECS task definiton family.
         *
         * Default: - '$latest'
         *
         * @param revisionNumber The revision number of ECS task definiton family.
         */
        public fun revisionNumber(revisionNumber: Number)

        /**
         * Existing security groups to use for the tasks.
         *
         * Default: - A new security group is created
         *
         * @param securityGroups Existing security groups to use for the tasks.
         */
        public fun securityGroups(securityGroups: List<ISecurityGroup>)

        /**
         * Existing security groups to use for the tasks.
         *
         * Default: - A new security group is created
         *
         * @param securityGroups Existing security groups to use for the tasks.
         */
        public fun securityGroups(vararg securityGroups: ISecurityGroup)

        /**
         * Optional name for this state.
         *
         * Default: - The construct ID will be used as state name
         *
         * @param stateName Optional name for this state.
         */
        public fun stateName(stateName: String)

        /**
         * Subnets to place the task's ENIs.
         *
         * Default: - Public subnets if assignPublicIp is set. Private subnets otherwise.
         *
         * @param subnets Subnets to place the task's ENIs.
         */
        public fun subnets(subnets: SubnetSelection)

        /**
         * Subnets to place the task's ENIs.
         *
         * Default: - Public subnets if assignPublicIp is set. Private subnets otherwise.
         *
         * @param subnets Subnets to place the task's ENIs.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("53ef47c4171694591a1bf3d57aaafc4fe3f6177bfc360a41d93d468a4f845a37")
        public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

        /**
         * [disable-awslint:ref-via-interface] Task Definition used for running tasks in the
         * service.
         *
         * Note: this must be TaskDefinition, and not ITaskDefinition, as it requires properties
         * that are not known for imported task definitions If you want to run a RunTask with an
         * imported task definition, consider using CustomState
         *
         * @param taskDefinition [disable-awslint:ref-via-interface] Task Definition used for
         *   running tasks in the service.
         */
        public fun taskDefinition(taskDefinition: TaskDefinition)

        /**
         * Timeout for the task.
         *
         * [disable-awslint:duration-prop-type] is needed because all props interface in
         * aws-stepfunctions-tasks extend this interface
         *
         * Default: - None
         *
         * @param taskTimeout Timeout for the task.
         */
        public fun taskTimeout(taskTimeout: Timeout)

        /**
         * (deprecated) Timeout for the task.
         *
         * Default: - None
         *
         * @param timeout Timeout for the task.
         * @deprecated use `taskTimeout`
         */
        @Deprecated(message = "deprecated in CDK") public fun timeout(timeout: Duration)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask.Builder =
            software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask.Builder.create(scope, id)

        /**
         * Assign public IP addresses to each task.
         *
         * Default: false
         *
         * @param assignPublicIp Assign public IP addresses to each task.
         */
        override fun assignPublicIp(assignPublicIp: Boolean) {
            cdkBuilder.assignPublicIp(assignPublicIp)
        }

        /**
         * The ECS cluster to run the task on.
         *
         * @param cluster The ECS cluster to run the task on.
         */
        override fun cluster(cluster: ICluster) {
            cdkBuilder.cluster(cluster.let(ICluster::unwrap))
        }

        /**
         * An optional description for this state.
         *
         * Default: - No comment
         *
         * @param comment An optional description for this state.
         */
        override fun comment(comment: String) {
            cdkBuilder.comment(comment)
        }

        /**
         * Container setting overrides.
         *
         * Specify the container to use and the overrides to apply.
         *
         * Default: - No overrides
         *
         * @param containerOverrides Container setting overrides.
         */
        override fun containerOverrides(containerOverrides: List<ContainerOverride>) {
            cdkBuilder.containerOverrides(containerOverrides.map(ContainerOverride::unwrap))
        }

        /**
         * Container setting overrides.
         *
         * Specify the container to use and the overrides to apply.
         *
         * Default: - No overrides
         *
         * @param containerOverrides Container setting overrides.
         */
        override fun containerOverrides(vararg containerOverrides: ContainerOverride): Unit =
            containerOverrides(containerOverrides.toList())

        /**
         * Credentials for an IAM Role that the State Machine assumes for executing the task.
         *
         * This enables cross-account resource invocations.
         *
         * Default: - None (Task is executed using the State Machine's execution role)
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
         *
         * @param credentials Credentials for an IAM Role that the State Machine assumes for
         *   executing the task.
         */
        override fun credentials(credentials: Credentials) {
            cdkBuilder.credentials(credentials.let(Credentials::unwrap))
        }

        /**
         * Credentials for an IAM Role that the State Machine assumes for executing the task.
         *
         * This enables cross-account resource invocations.
         *
         * Default: - None (Task is executed using the State Machine's execution role)
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
         *
         * @param credentials Credentials for an IAM Role that the State Machine assumes for
         *   executing the task.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("70ebe03278a53b551b732afadb0fad9fa84cad26998f0d5390edfd9bf918bd2e")
        override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
            credentials(Credentials(credentials))

        /**
         * (deprecated) Timeout for the heartbeat.
         *
         * Default: - None
         *
         * @param heartbeat Timeout for the heartbeat.
         * @deprecated use `heartbeatTimeout`
         */
        @Deprecated(message = "deprecated in CDK")
        override fun heartbeat(heartbeat: Duration) {
            cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
        }

        /**
         * Timeout for the heartbeat.
         *
         * [disable-awslint:duration-prop-type] is needed because all props interface in
         * aws-stepfunctions-tasks extend this interface
         *
         * Default: - None
         *
         * @param heartbeatTimeout Timeout for the heartbeat.
         */
        override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
            cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
        }

        /**
         * JSONPath expression to select part of the state to be the input to this state.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the effective input to
         * be the empty object {}.
         *
         * Default: - The entire task input (JSON path '$')
         *
         * @param inputPath JSONPath expression to select part of the state to be the input to this
         *   state.
         */
        override fun inputPath(inputPath: String) {
            cdkBuilder.inputPath(inputPath)
        }

        /**
         * AWS Step Functions integrates with services directly in the Amazon States Language.
         *
         * You can control these AWS services using service integration patterns.
         *
         * Depending on the AWS Service, the Service Integration Pattern availability will vary.
         *
         * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
         * `IntegrationPattern.RUN_JOB` for the following exceptions: `BatchSubmitJob`,
         * `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
         * `EmrContainersStartJobRun`.
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
         *
         * @param integrationPattern AWS Step Functions integrates with services directly in the
         *   Amazon States Language.
         */
        override fun integrationPattern(integrationPattern: IntegrationPattern) {
            cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
        }

        /**
         * An Amazon ECS launch type determines the type of infrastructure on which your tasks and
         * services are hosted.
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
         *
         * @param launchTarget An Amazon ECS launch type determines the type of infrastructure on
         *   which your tasks and services are hosted.
         */
        override fun launchTarget(launchTarget: IEcsLaunchTarget) {
            cdkBuilder.launchTarget(launchTarget.let(IEcsLaunchTarget::unwrap))
        }

        /**
         * JSONPath expression to select select a portion of the state output to pass to the next
         * state.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the effective output to
         * be the empty object {}.
         *
         * Default: - The entire JSON node determined by the state input, the task result, and
         * resultPath is passed to the next state (JSON path '$')
         *
         * @param outputPath JSONPath expression to select select a portion of the state output to
         *   pass to the next state.
         */
        override fun outputPath(outputPath: String) {
            cdkBuilder.outputPath(outputPath)
        }

        /**
         * Specifies whether to propagate the tags from the task definition to the task.
         *
         * An error will be received if you specify the SERVICE option when running a task.
         *
         * Default: - No tags are propagated.
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-propagateTags)
         *
         * @param propagatedTagSource Specifies whether to propagate the tags from the task
         *   definition to the task.
         */
        override fun propagatedTagSource(propagatedTagSource: PropagatedTagSource) {
            cdkBuilder.propagatedTagSource(propagatedTagSource.let(PropagatedTagSource::unwrap))
        }

        /**
         * JSONPath expression to indicate where to inject the state's output.
         *
         * May also be the special value JsonPath.DISCARD, which will cause the state's input to
         * become its output.
         *
         * Default: - Replaces the entire input with the result (JSON path '$')
         *
         * @param resultPath JSONPath expression to indicate where to inject the state's output.
         */
        override fun resultPath(resultPath: String) {
            cdkBuilder.resultPath(resultPath)
        }

        /**
         * The JSON that will replace the state's raw result and become the effective result before
         * ResultPath is applied.
         *
         * You can use ResultSelector to create a payload with values that are static or selected
         * from the state's raw result.
         *
         * Default: - None
         *
         * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
         *
         * @param resultSelector The JSON that will replace the state's raw result and become the
         *   effective result before ResultPath is applied.
         */
        override fun resultSelector(resultSelector: Map<String, Any>) {
            cdkBuilder.resultSelector(resultSelector)
        }

        /**
         * The revision number of ECS task definiton family.
         *
         * Default: - '$latest'
         *
         * @param revisionNumber The revision number of ECS task definiton family.
         */
        override fun revisionNumber(revisionNumber: Number) {
            cdkBuilder.revisionNumber(revisionNumber)
        }

        /**
         * Existing security groups to use for the tasks.
         *
         * Default: - A new security group is created
         *
         * @param securityGroups Existing security groups to use for the tasks.
         */
        override fun securityGroups(securityGroups: List<ISecurityGroup>) {
            cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
        }

        /**
         * Existing security groups to use for the tasks.
         *
         * Default: - A new security group is created
         *
         * @param securityGroups Existing security groups to use for the tasks.
         */
        override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
            securityGroups(securityGroups.toList())

        /**
         * Optional name for this state.
         *
         * Default: - The construct ID will be used as state name
         *
         * @param stateName Optional name for this state.
         */
        override fun stateName(stateName: String) {
            cdkBuilder.stateName(stateName)
        }

        /**
         * Subnets to place the task's ENIs.
         *
         * Default: - Public subnets if assignPublicIp is set. Private subnets otherwise.
         *
         * @param subnets Subnets to place the task's ENIs.
         */
        override fun subnets(subnets: SubnetSelection) {
            cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
        }

        /**
         * Subnets to place the task's ENIs.
         *
         * Default: - Public subnets if assignPublicIp is set. Private subnets otherwise.
         *
         * @param subnets Subnets to place the task's ENIs.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("53ef47c4171694591a1bf3d57aaafc4fe3f6177bfc360a41d93d468a4f845a37")
        override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
            subnets(SubnetSelection(subnets))

        /**
         * [disable-awslint:ref-via-interface] Task Definition used for running tasks in the
         * service.
         *
         * Note: this must be TaskDefinition, and not ITaskDefinition, as it requires properties
         * that are not known for imported task definitions If you want to run a RunTask with an
         * imported task definition, consider using CustomState
         *
         * @param taskDefinition [disable-awslint:ref-via-interface] Task Definition used for
         *   running tasks in the service.
         */
        override fun taskDefinition(taskDefinition: TaskDefinition) {
            cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition::unwrap))
        }

        /**
         * Timeout for the task.
         *
         * [disable-awslint:duration-prop-type] is needed because all props interface in
         * aws-stepfunctions-tasks extend this interface
         *
         * Default: - None
         *
         * @param taskTimeout Timeout for the task.
         */
        override fun taskTimeout(taskTimeout: Timeout) {
            cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
        }

        /**
         * (deprecated) Timeout for the task.
         *
         * Default: - None
         *
         * @param timeout Timeout for the task.
         * @deprecated use `taskTimeout`
         */
        @Deprecated(message = "deprecated in CDK")
        override fun timeout(timeout: Duration) {
            cdkBuilder.timeout(timeout.let(Duration::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): EcsRunTask {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return EcsRunTask(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask
        ): EcsRunTask = EcsRunTask(cdkObject)

        internal fun unwrap(
            wrapped: EcsRunTask
        ): software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask = wrapped.cdkObject
    }
}
