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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModel
import software.constructs.Construct

/**
 * A Step Functions Task to create a SageMaker model.
 *
 * Example:
 * ```
 * SageMakerCreateModel.Builder.create(this, "Sagemaker")
 * .modelName("MyModel")
 * .primaryContainer(ContainerDefinition.Builder.create()
 * .image(DockerImage.fromJsonExpression(JsonPath.stringAt("$.Model.imageName")))
 * .mode(Mode.SINGLE_MODEL)
 * .modelS3Location(S3Location.fromJsonExpression("$.TrainingJob.ModelArtifacts.S3ModelArtifacts"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-sagemaker.html)
 */
@CdkDslMarker
public class SageMakerCreateModelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: SageMakerCreateModel.Builder =
        SageMakerCreateModel.Builder.create(scope, id)

    private val _containers: MutableList<IContainerDefinition> = mutableListOf()

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * Specifies the containers in the inference pipeline.
     *
     * Default: - None
     *
     * @param containers Specifies the containers in the inference pipeline.
     */
    public fun containers(vararg containers: IContainerDefinition) {
        _containers.addAll(listOf(*containers))
    }

    /**
     * Specifies the containers in the inference pipeline.
     *
     * Default: - None
     *
     * @param containers Specifies the containers in the inference pipeline.
     */
    public fun containers(containers: Collection<IContainerDefinition>) {
        _containers.addAll(containers)
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
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task.
     */
    public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(credentials)
        cdkBuilder.credentials(builder.build())
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
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task.
     */
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * Isolates the model container.
     *
     * No inbound or outbound network calls can be made to or from the model container.
     *
     * Default: false
     *
     * @param enableNetworkIsolation Isolates the model container.
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
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
    public fun heartbeat(heartbeat: Duration) {
        cdkBuilder.heartbeat(heartbeat)
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
    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective input to be
     * the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks. `IntegrationPattern.RUN_JOB`
     * for the following exceptions: `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`,
     * `EmrTerminationCluster`, and `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token)
     *
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     *   States Language.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    /**
     * The name of the new model.
     *
     * @param modelName The name of the new model.
     */
    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective output to be
     * the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result, and
     * resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     *   to the next state.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /**
     * The definition of the primary docker image containing inference code, associated artifacts,
     * and custom environment map that the inference code uses when the model is deployed for
     * predictions.
     *
     * @param primaryContainer The definition of the primary docker image containing inference code,
     *   associated artifacts, and custom environment map that the inference code uses when the
     *   model is deployed for predictions.
     */
    public fun primaryContainer(primaryContainer: IContainerDefinition) {
        cdkBuilder.primaryContainer(primaryContainer)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's input to become
     * its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static or selected from
     * the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     *
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static or selected from
     * the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     *
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * An execution role that you can pass in a CreateModel API request.
     *
     * Default: - a role will be created.
     *
     * @param role An execution role that you can pass in a CreateModel API request.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * The subnets of the VPC to which the hosted model is connected (Note this parameter is only
     * used when VPC is provided).
     *
     * Default: - Private Subnets are selected
     *
     * @param subnetSelection The subnets of the VPC to which the hosted model is connected (Note
     *   this parameter is only used when VPC is provided).
     */
    public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnetSelection)
        cdkBuilder.subnetSelection(builder.build())
    }

    /**
     * The subnets of the VPC to which the hosted model is connected (Note this parameter is only
     * used when VPC is provided).
     *
     * Default: - Private Subnets are selected
     *
     * @param subnetSelection The subnets of the VPC to which the hosted model is connected (Note
     *   this parameter is only used when VPC is provided).
     */
    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    /**
     * Tags to be applied to the model.
     *
     * Default: - No tags
     *
     * @param tags Tags to be applied to the model.
     */
    public fun tags(tags: TaskInput) {
        cdkBuilder.tags(tags)
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
    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
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
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * The VPC that is accessible by the hosted model.
     *
     * Default: - None
     *
     * @param vpc The VPC that is accessible by the hosted model.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): SageMakerCreateModel {
        if (_containers.isNotEmpty()) cdkBuilder.containers(_containers)
        return cdkBuilder.build()
    }
}
