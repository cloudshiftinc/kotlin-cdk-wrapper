package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SageMakerUpdateEndpoint
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint,
) : TaskStateBase(cdkObject) {
    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * An optional description for this state.
         *
         * Default: - No comment
         *
         * @param comment An optional description for this state.
         */
        public fun comment(comment: String)

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
        @JvmName("9b4d699e4162052d0c4b307329af0bf8a397aabd16af8b0e55f9d5b189bcd895")
        public fun credentials(credentials: Credentials.Builder.() -> Unit)

        /**
         * The name of the new endpoint configuration.
         *
         * @param endpointConfigName The name of the new endpoint configuration.
         */
        public fun endpointConfigName(endpointConfigName: String)

        /**
         * The name of the endpoint whose configuration you want to update.
         *
         * @param endpointName The name of the endpoint whose configuration you want to update.
         */
        public fun endpointName(endpointName: String)

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
         * Optional name for this state.
         *
         * Default: - The construct ID will be used as state name
         *
         * @param stateName Optional name for this state.
         */
        public fun stateName(stateName: String)

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
            software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint.Builder =
            software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint.Builder
                .create(scope, id)

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
        @JvmName("9b4d699e4162052d0c4b307329af0bf8a397aabd16af8b0e55f9d5b189bcd895")
        override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
            credentials(Credentials(credentials))

        /**
         * The name of the new endpoint configuration.
         *
         * @param endpointConfigName The name of the new endpoint configuration.
         */
        override fun endpointConfigName(endpointConfigName: String) {
            cdkBuilder.endpointConfigName(endpointConfigName)
        }

        /**
         * The name of the endpoint whose configuration you want to update.
         *
         * @param endpointName The name of the endpoint whose configuration you want to update.
         */
        override fun endpointName(endpointName: String) {
            cdkBuilder.endpointName(endpointName)
        }

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

        public fun build():
            software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): SageMakerUpdateEndpoint {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return SageMakerUpdateEndpoint(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint
        ): SageMakerUpdateEndpoint = SageMakerUpdateEndpoint(cdkObject)

        internal fun unwrap(
            wrapped: SageMakerUpdateEndpoint
        ): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint =
            wrapped.cdkObject
    }
}
