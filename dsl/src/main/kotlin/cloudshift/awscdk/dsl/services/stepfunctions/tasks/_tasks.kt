@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification
import software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryExecutionProps
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResults
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResultsProps
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecutionProps
import software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides
import software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency
import software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob
import software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointProps
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointProps
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps
import software.amazon.awscdk.services.stepfunctions.tasks.Channel
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuild
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuildProps
import software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides
import software.amazon.awscdk.services.stepfunctions.tasks.DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemProps
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemProps
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions
import software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskProps
import software.amazon.awscdk.services.stepfunctions.tasks.EksCall
import software.amazon.awscdk.services.stepfunctions.tasks.EksCallProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep
import software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCancelStep
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCancelStepProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualClusterProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByNameProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrSetClusterTerminationProtection
import software.amazon.awscdk.services.stepfunctions.tasks.EmrSetClusterTerminationProtectionProps
import software.amazon.awscdk.services.stepfunctions.tasks.EmrTerminateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrTerminateClusterProps
import software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.EvaluateExpression
import software.amazon.awscdk.services.stepfunctions.tasks.EvaluateExpressionProps
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEvents
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsProps
import software.amazon.awscdk.services.stepfunctions.tasks.GlueDataBrewStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueDataBrewStartJobRunProps
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunProps
import software.amazon.awscdk.services.stepfunctions.tasks.JobDependency
import software.amazon.awscdk.services.stepfunctions.tasks.JobDriver
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps
import software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute
import software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions
import software.amazon.awscdk.services.stepfunctions.tasks.Monitoring
import software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig
import software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant
import software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext
import software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig
import software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfig
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfigProps
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointProps
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModel
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModelProps
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpointProps
import software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps
import software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver
import software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage
import software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessageProps
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivity
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivityProps
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps
import software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition
import software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable
import software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource
import software.amazon.awscdk.services.stepfunctions.tasks.TransformInput
import software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput
import software.amazon.awscdk.services.stepfunctions.tasks.TransformResources
import software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object tasks {
    public inline fun algorithmSpecification(block: AlgorithmSpecificationDsl.() -> Unit = {}): AlgorithmSpecification {
        val builder = AlgorithmSpecificationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun applicationConfiguration(block: ApplicationConfigurationDsl.() -> Unit = {}): ApplicationConfiguration {
        val builder = ApplicationConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun athenaGetQueryExecution(
        scope: Construct,
        id: String,
        block: AthenaGetQueryExecutionDsl.() -> Unit = {},
    ): AthenaGetQueryExecution {
        val builder = AthenaGetQueryExecutionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun athenaGetQueryExecutionProps(
        block: AthenaGetQueryExecutionPropsDsl.() -> Unit =
            {},
    ): AthenaGetQueryExecutionProps {
        val builder = AthenaGetQueryExecutionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun athenaGetQueryResults(
        scope: Construct,
        id: String,
        block: AthenaGetQueryResultsDsl.() -> Unit = {},
    ): AthenaGetQueryResults {
        val builder = AthenaGetQueryResultsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun athenaGetQueryResultsProps(
        block: AthenaGetQueryResultsPropsDsl.() -> Unit =
            {},
    ): AthenaGetQueryResultsProps {
        val builder = AthenaGetQueryResultsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun athenaStartQueryExecution(
        scope: Construct,
        id: String,
        block: AthenaStartQueryExecutionDsl.() -> Unit = {},
    ): AthenaStartQueryExecution {
        val builder = AthenaStartQueryExecutionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun athenaStartQueryExecutionProps(block: AthenaStartQueryExecutionPropsDsl.() -> Unit = {}): AthenaStartQueryExecutionProps {
        val builder = AthenaStartQueryExecutionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun athenaStopQueryExecution(
        scope: Construct,
        id: String,
        block: AthenaStopQueryExecutionDsl.() -> Unit = {},
    ): AthenaStopQueryExecution {
        val builder = AthenaStopQueryExecutionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun athenaStopQueryExecutionProps(
        block: AthenaStopQueryExecutionPropsDsl.() -> Unit =
            {},
    ): AthenaStopQueryExecutionProps {
        val builder = AthenaStopQueryExecutionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun batchContainerOverrides(block: BatchContainerOverridesDsl.() -> Unit = {}): BatchContainerOverrides {
        val builder = BatchContainerOverridesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun batchJobDependency(block: BatchJobDependencyDsl.() -> Unit = {}): BatchJobDependency {
        val builder = BatchJobDependencyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun batchSubmitJob(
        scope: Construct,
        id: String,
        block: BatchSubmitJobDsl.() -> Unit = {},
    ): BatchSubmitJob {
        val builder = BatchSubmitJobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun batchSubmitJobProps(block: BatchSubmitJobPropsDsl.() -> Unit = {}): BatchSubmitJobProps {
        val builder = BatchSubmitJobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun callApiGatewayEndpointBaseProps(
        block: CallApiGatewayEndpointBasePropsDsl.() -> Unit =
            {},
    ): CallApiGatewayEndpointBaseProps {
        val builder = CallApiGatewayEndpointBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun callApiGatewayHttpApiEndpoint(
        scope: Construct,
        id: String,
        block: CallApiGatewayHttpApiEndpointDsl.() -> Unit = {},
    ): CallApiGatewayHttpApiEndpoint {
        val builder = CallApiGatewayHttpApiEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun callApiGatewayHttpApiEndpointProps(
        block: CallApiGatewayHttpApiEndpointPropsDsl.() -> Unit =
            {},
    ): CallApiGatewayHttpApiEndpointProps {
        val builder = CallApiGatewayHttpApiEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun callApiGatewayRestApiEndpoint(
        scope: Construct,
        id: String,
        block: CallApiGatewayRestApiEndpointDsl.() -> Unit = {},
    ): CallApiGatewayRestApiEndpoint {
        val builder = CallApiGatewayRestApiEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun callApiGatewayRestApiEndpointProps(
        block: CallApiGatewayRestApiEndpointPropsDsl.() -> Unit =
            {},
    ): CallApiGatewayRestApiEndpointProps {
        val builder = CallApiGatewayRestApiEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun callAwsService(
        scope: Construct,
        id: String,
        block: CallAwsServiceDsl.() -> Unit = {},
    ): CallAwsService {
        val builder = CallAwsServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun callAwsServiceProps(block: CallAwsServicePropsDsl.() -> Unit = {}): CallAwsServiceProps {
        val builder = CallAwsServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun channel(block: ChannelDsl.() -> Unit = {}): Channel {
        val builder = ChannelDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeBuildStartBuild(
        scope: Construct,
        id: String,
        block: CodeBuildStartBuildDsl.() -> Unit = {},
    ): CodeBuildStartBuild {
        val builder = CodeBuildStartBuildDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeBuildStartBuildProps(block: CodeBuildStartBuildPropsDsl.() -> Unit = {}): CodeBuildStartBuildProps {
        val builder = CodeBuildStartBuildPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun commonEcsRunTaskProps(block: CommonEcsRunTaskPropsDsl.() -> Unit = {}): CommonEcsRunTaskProps {
        val builder = CommonEcsRunTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun containerDefinition(block: ContainerDefinitionDsl.() -> Unit = {}): ContainerDefinition {
        val builder = ContainerDefinitionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun containerDefinitionConfig(block: ContainerDefinitionConfigDsl.() -> Unit = {}): ContainerDefinitionConfig {
        val builder = ContainerDefinitionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun containerDefinitionOptions(
        block: ContainerDefinitionOptionsDsl.() -> Unit =
            {},
    ): ContainerDefinitionOptions {
        val builder = ContainerDefinitionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun containerOverride(block: ContainerOverrideDsl.() -> Unit = {}): ContainerOverride {
        val builder = ContainerOverrideDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun containerOverrides(block: ContainerOverridesDsl.() -> Unit = {}): ContainerOverrides {
        val builder = ContainerOverridesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dataSource(block: DataSourceDsl.() -> Unit = {}): DataSource {
        val builder = DataSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dockerImageConfig(block: DockerImageConfigDsl.() -> Unit = {}): DockerImageConfig {
        val builder = DockerImageConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dynamoDeleteItem(
        scope: Construct,
        id: String,
        block: DynamoDeleteItemDsl.() -> Unit = {},
    ): DynamoDeleteItem {
        val builder = DynamoDeleteItemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun dynamoDeleteItemProps(block: DynamoDeleteItemPropsDsl.() -> Unit = {}): DynamoDeleteItemProps {
        val builder = DynamoDeleteItemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dynamoGetItem(
        scope: Construct,
        id: String,
        block: DynamoGetItemDsl.() -> Unit = {},
    ): DynamoGetItem {
        val builder = DynamoGetItemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun dynamoGetItemProps(block: DynamoGetItemPropsDsl.() -> Unit = {}): DynamoGetItemProps {
        val builder = DynamoGetItemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dynamoPutItem(
        scope: Construct,
        id: String,
        block: DynamoPutItemDsl.() -> Unit = {},
    ): DynamoPutItem {
        val builder = DynamoPutItemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun dynamoPutItemProps(block: DynamoPutItemPropsDsl.() -> Unit = {}): DynamoPutItemProps {
        val builder = DynamoPutItemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dynamoUpdateItem(
        scope: Construct,
        id: String,
        block: DynamoUpdateItemDsl.() -> Unit = {},
    ): DynamoUpdateItem {
        val builder = DynamoUpdateItemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun dynamoUpdateItemProps(block: DynamoUpdateItemPropsDsl.() -> Unit = {}): DynamoUpdateItemProps {
        val builder = DynamoUpdateItemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsEc2LaunchTarget(block: EcsEc2LaunchTargetDsl.() -> Unit = {}): EcsEc2LaunchTarget {
        val builder = EcsEc2LaunchTargetDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsEc2LaunchTargetOptions(block: EcsEc2LaunchTargetOptionsDsl.() -> Unit = {}): EcsEc2LaunchTargetOptions {
        val builder = EcsEc2LaunchTargetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsFargateLaunchTarget(block: EcsFargateLaunchTargetDsl.() -> Unit = {}): EcsFargateLaunchTarget {
        val builder = EcsFargateLaunchTargetDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsFargateLaunchTargetOptions(
        block: EcsFargateLaunchTargetOptionsDsl.() -> Unit =
            {},
    ): EcsFargateLaunchTargetOptions {
        val builder = EcsFargateLaunchTargetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsLaunchTargetConfig(block: EcsLaunchTargetConfigDsl.() -> Unit = {}): EcsLaunchTargetConfig {
        val builder = EcsLaunchTargetConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsRunTask(
        scope: Construct,
        id: String,
        block: EcsRunTaskDsl.() -> Unit = {},
    ): EcsRunTask {
        val builder = EcsRunTaskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsRunTaskProps(block: EcsRunTaskPropsDsl.() -> Unit = {}): EcsRunTaskProps {
        val builder = EcsRunTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun eksCall(
        scope: Construct,
        id: String,
        block: EksCallDsl.() -> Unit = {},
    ): EksCall {
        val builder = EksCallDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun eksCallProps(block: EksCallPropsDsl.() -> Unit = {}): EksCallProps {
        val builder = EksCallPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrAddStep(
        scope: Construct,
        id: String,
        block: EmrAddStepDsl.() -> Unit = {},
    ): EmrAddStep {
        val builder = EmrAddStepDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrAddStepProps(block: EmrAddStepPropsDsl.() -> Unit = {}): EmrAddStepProps {
        val builder = EmrAddStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCancelStep(
        scope: Construct,
        id: String,
        block: EmrCancelStepDsl.() -> Unit = {},
    ): EmrCancelStep {
        val builder = EmrCancelStepDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCancelStepProps(block: EmrCancelStepPropsDsl.() -> Unit = {}): EmrCancelStepProps {
        val builder = EmrCancelStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrContainersCreateVirtualCluster(
        scope: Construct,
        id: String,
        block: EmrContainersCreateVirtualClusterDsl.() -> Unit = {},
    ): EmrContainersCreateVirtualCluster {
        val builder = EmrContainersCreateVirtualClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrContainersCreateVirtualClusterProps(
        block: EmrContainersCreateVirtualClusterPropsDsl.() -> Unit =
            {},
    ): EmrContainersCreateVirtualClusterProps {
        val builder = EmrContainersCreateVirtualClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrContainersDeleteVirtualCluster(
        scope: Construct,
        id: String,
        block: EmrContainersDeleteVirtualClusterDsl.() -> Unit = {},
    ): EmrContainersDeleteVirtualCluster {
        val builder = EmrContainersDeleteVirtualClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrContainersDeleteVirtualClusterProps(
        block: EmrContainersDeleteVirtualClusterPropsDsl.() -> Unit =
            {},
    ): EmrContainersDeleteVirtualClusterProps {
        val builder = EmrContainersDeleteVirtualClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrContainersStartJobRun(
        scope: Construct,
        id: String,
        block: EmrContainersStartJobRunDsl.() -> Unit = {},
    ): EmrContainersStartJobRun {
        val builder = EmrContainersStartJobRunDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrContainersStartJobRunProps(
        block: EmrContainersStartJobRunPropsDsl.() -> Unit =
            {},
    ): EmrContainersStartJobRunProps {
        val builder = EmrContainersStartJobRunPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateCluster(
        scope: Construct,
        id: String,
        block: EmrCreateClusterDsl.() -> Unit = {},
    ): EmrCreateCluster {
        val builder = EmrCreateClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterApplicationConfigProperty(
        block: EmrCreateClusterApplicationConfigPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.ApplicationConfigProperty {
        val builder = EmrCreateClusterApplicationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterAutoScalingPolicyProperty(
        block: EmrCreateClusterAutoScalingPolicyPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.AutoScalingPolicyProperty {
        val builder = EmrCreateClusterAutoScalingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterBootstrapActionConfigProperty(
        block: EmrCreateClusterBootstrapActionConfigPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.BootstrapActionConfigProperty {
        val builder = EmrCreateClusterBootstrapActionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterCloudWatchAlarmDefinitionProperty(
        block: EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.CloudWatchAlarmDefinitionProperty {
        val builder = EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterConfigurationProperty(
        block: EmrCreateClusterConfigurationPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.ConfigurationProperty {
        val builder = EmrCreateClusterConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterEbsBlockDeviceConfigProperty(
        block: EmrCreateClusterEbsBlockDeviceConfigPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.EbsBlockDeviceConfigProperty {
        val builder = EmrCreateClusterEbsBlockDeviceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterEbsConfigurationProperty(
        block: EmrCreateClusterEbsConfigurationPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.EbsConfigurationProperty {
        val builder = EmrCreateClusterEbsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterInstanceFleetConfigProperty(
        block: EmrCreateClusterInstanceFleetConfigPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.InstanceFleetConfigProperty {
        val builder = EmrCreateClusterInstanceFleetConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterInstanceFleetProvisioningSpecificationsProperty(
        block: EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty {
        val builder = EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterInstanceGroupConfigProperty(
        block: EmrCreateClusterInstanceGroupConfigPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.InstanceGroupConfigProperty {
        val builder = EmrCreateClusterInstanceGroupConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterInstanceTypeConfigProperty(
        block: EmrCreateClusterInstanceTypeConfigPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.InstanceTypeConfigProperty {
        val builder = EmrCreateClusterInstanceTypeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterInstancesConfigProperty(
        block: EmrCreateClusterInstancesConfigPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.InstancesConfigProperty {
        val builder = EmrCreateClusterInstancesConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterKerberosAttributesProperty(
        block: EmrCreateClusterKerberosAttributesPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.KerberosAttributesProperty {
        val builder = EmrCreateClusterKerberosAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterMetricDimensionProperty(
        block: EmrCreateClusterMetricDimensionPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.MetricDimensionProperty {
        val builder = EmrCreateClusterMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterPlacementTypeProperty(
        block: EmrCreateClusterPlacementTypePropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.PlacementTypeProperty {
        val builder = EmrCreateClusterPlacementTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterProps(block: EmrCreateClusterPropsDsl.() -> Unit = {}): EmrCreateClusterProps {
        val builder = EmrCreateClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterScalingActionProperty(
        block: EmrCreateClusterScalingActionPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.ScalingActionProperty {
        val builder = EmrCreateClusterScalingActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterScalingConstraintsProperty(
        block: EmrCreateClusterScalingConstraintsPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.ScalingConstraintsProperty {
        val builder = EmrCreateClusterScalingConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterScalingRuleProperty(
        block: EmrCreateClusterScalingRulePropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.ScalingRuleProperty {
        val builder = EmrCreateClusterScalingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterScalingTriggerProperty(
        block: EmrCreateClusterScalingTriggerPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.ScalingTriggerProperty {
        val builder = EmrCreateClusterScalingTriggerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterScriptBootstrapActionConfigProperty(
        block: EmrCreateClusterScriptBootstrapActionConfigPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.ScriptBootstrapActionConfigProperty {
        val builder = EmrCreateClusterScriptBootstrapActionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterSimpleScalingPolicyConfigurationProperty(
        block: EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.SimpleScalingPolicyConfigurationProperty {
        val builder = EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterSpotProvisioningSpecificationProperty(
        block: EmrCreateClusterSpotProvisioningSpecificationPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.SpotProvisioningSpecificationProperty {
        val builder = EmrCreateClusterSpotProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrCreateClusterVolumeSpecificationProperty(
        block: EmrCreateClusterVolumeSpecificationPropertyDsl.() -> Unit =
            {},
    ): EmrCreateCluster.VolumeSpecificationProperty {
        val builder = EmrCreateClusterVolumeSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrModifyInstanceFleetByName(
        scope: Construct,
        id: String,
        block: EmrModifyInstanceFleetByNameDsl.() -> Unit = {},
    ): EmrModifyInstanceFleetByName {
        val builder = EmrModifyInstanceFleetByNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrModifyInstanceFleetByNameProps(
        block: EmrModifyInstanceFleetByNamePropsDsl.() -> Unit =
            {},
    ): EmrModifyInstanceFleetByNameProps {
        val builder = EmrModifyInstanceFleetByNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrModifyInstanceGroupByName(
        scope: Construct,
        id: String,
        block: EmrModifyInstanceGroupByNameDsl.() -> Unit = {},
    ): EmrModifyInstanceGroupByName {
        val builder = EmrModifyInstanceGroupByNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrModifyInstanceGroupByNameInstanceGroupModifyConfigProperty(
        block: EmrModifyInstanceGroupByNameInstanceGroupModifyConfigPropertyDsl.() -> Unit =
            {},
    ): EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty {
        val builder = EmrModifyInstanceGroupByNameInstanceGroupModifyConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrModifyInstanceGroupByNameInstanceResizePolicyProperty(
        block: EmrModifyInstanceGroupByNameInstanceResizePolicyPropertyDsl.() -> Unit =
            {},
    ): EmrModifyInstanceGroupByName.InstanceResizePolicyProperty {
        val builder = EmrModifyInstanceGroupByNameInstanceResizePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrModifyInstanceGroupByNameProps(
        block: EmrModifyInstanceGroupByNamePropsDsl.() -> Unit =
            {},
    ): EmrModifyInstanceGroupByNameProps {
        val builder = EmrModifyInstanceGroupByNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrModifyInstanceGroupByNameShrinkPolicyProperty(
        block: EmrModifyInstanceGroupByNameShrinkPolicyPropertyDsl.() -> Unit =
            {},
    ): EmrModifyInstanceGroupByName.ShrinkPolicyProperty {
        val builder = EmrModifyInstanceGroupByNameShrinkPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrSetClusterTerminationProtection(
        scope: Construct,
        id: String,
        block: EmrSetClusterTerminationProtectionDsl.() -> Unit = {},
    ): EmrSetClusterTerminationProtection {
        val builder = EmrSetClusterTerminationProtectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrSetClusterTerminationProtectionProps(
        block: EmrSetClusterTerminationProtectionPropsDsl.() -> Unit =
            {},
    ): EmrSetClusterTerminationProtectionProps {
        val builder = EmrSetClusterTerminationProtectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrTerminateCluster(
        scope: Construct,
        id: String,
        block: EmrTerminateClusterDsl.() -> Unit = {},
    ): EmrTerminateCluster {
        val builder = EmrTerminateClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun emrTerminateClusterProps(block: EmrTerminateClusterPropsDsl.() -> Unit = {}): EmrTerminateClusterProps {
        val builder = EmrTerminateClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun encryptionConfiguration(block: EncryptionConfigurationDsl.() -> Unit = {}): EncryptionConfiguration {
        val builder = EncryptionConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun evaluateExpression(
        scope: Construct,
        id: String,
        block: EvaluateExpressionDsl.() -> Unit = {},
    ): EvaluateExpression {
        val builder = EvaluateExpressionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun evaluateExpressionProps(block: EvaluateExpressionPropsDsl.() -> Unit = {}): EvaluateExpressionProps {
        val builder = EvaluateExpressionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun eventBridgePutEvents(
        scope: Construct,
        id: String,
        block: EventBridgePutEventsDsl.() -> Unit = {},
    ): EventBridgePutEvents {
        val builder = EventBridgePutEventsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun eventBridgePutEventsEntry(block: EventBridgePutEventsEntryDsl.() -> Unit = {}): EventBridgePutEventsEntry {
        val builder = EventBridgePutEventsEntryDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun eventBridgePutEventsProps(block: EventBridgePutEventsPropsDsl.() -> Unit = {}): EventBridgePutEventsProps {
        val builder = EventBridgePutEventsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun glueDataBrewStartJobRun(
        scope: Construct,
        id: String,
        block: GlueDataBrewStartJobRunDsl.() -> Unit = {},
    ): GlueDataBrewStartJobRun {
        val builder = GlueDataBrewStartJobRunDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun glueDataBrewStartJobRunProps(
        block: GlueDataBrewStartJobRunPropsDsl.() -> Unit =
            {},
    ): GlueDataBrewStartJobRunProps {
        val builder = GlueDataBrewStartJobRunPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun glueStartJobRun(
        scope: Construct,
        id: String,
        block: GlueStartJobRunDsl.() -> Unit = {},
    ): GlueStartJobRun {
        val builder = GlueStartJobRunDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun glueStartJobRunProps(block: GlueStartJobRunPropsDsl.() -> Unit = {}): GlueStartJobRunProps {
        val builder = GlueStartJobRunPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun jobDependency(block: JobDependencyDsl.() -> Unit = {}): JobDependency {
        val builder = JobDependencyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun jobDriver(block: JobDriverDsl.() -> Unit = {}): JobDriver {
        val builder = JobDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaInvoke(
        scope: Construct,
        id: String,
        block: LambdaInvokeDsl.() -> Unit = {},
    ): LambdaInvoke {
        val builder = LambdaInvokeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaInvokeProps(block: LambdaInvokePropsDsl.() -> Unit = {}): LambdaInvokeProps {
        val builder = LambdaInvokePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun launchTargetBindOptions(block: LaunchTargetBindOptionsDsl.() -> Unit = {}): LaunchTargetBindOptions {
        val builder = LaunchTargetBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun messageAttribute(block: MessageAttributeDsl.() -> Unit = {}): MessageAttribute {
        val builder = MessageAttributeDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun metricDefinition(block: MetricDefinitionDsl.() -> Unit = {}): MetricDefinition {
        val builder = MetricDefinitionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun modelClientOptions(block: ModelClientOptionsDsl.() -> Unit = {}): ModelClientOptions {
        val builder = ModelClientOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun monitoring(block: MonitoringDsl.() -> Unit = {}): Monitoring {
        val builder = MonitoringDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun outputDataConfig(block: OutputDataConfigDsl.() -> Unit = {}): OutputDataConfig {
        val builder = OutputDataConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun productionVariant(block: ProductionVariantDsl.() -> Unit = {}): ProductionVariant {
        val builder = ProductionVariantDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun queryExecutionContext(block: QueryExecutionContextDsl.() -> Unit = {}): QueryExecutionContext {
        val builder = QueryExecutionContextDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun resourceConfig(block: ResourceConfigDsl.() -> Unit = {}): ResourceConfig {
        val builder = ResourceConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun resultConfiguration(block: ResultConfigurationDsl.() -> Unit = {}): ResultConfiguration {
        val builder = ResultConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3DataSource(block: S3DataSourceDsl.() -> Unit = {}): S3DataSource {
        val builder = S3DataSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3LocationBindOptions(block: S3LocationBindOptionsDsl.() -> Unit = {}): S3LocationBindOptions {
        val builder = S3LocationBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3LocationConfig(block: S3LocationConfigDsl.() -> Unit = {}): S3LocationConfig {
        val builder = S3LocationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerCreateEndpoint(
        scope: Construct,
        id: String,
        block: SageMakerCreateEndpointDsl.() -> Unit = {},
    ): SageMakerCreateEndpoint {
        val builder = SageMakerCreateEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerCreateEndpointConfig(
        scope: Construct,
        id: String,
        block: SageMakerCreateEndpointConfigDsl.() -> Unit = {},
    ): SageMakerCreateEndpointConfig {
        val builder = SageMakerCreateEndpointConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerCreateEndpointConfigProps(
        block: SageMakerCreateEndpointConfigPropsDsl.() -> Unit =
            {},
    ): SageMakerCreateEndpointConfigProps {
        val builder = SageMakerCreateEndpointConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerCreateEndpointProps(
        block: SageMakerCreateEndpointPropsDsl.() -> Unit =
            {},
    ): SageMakerCreateEndpointProps {
        val builder = SageMakerCreateEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerCreateModel(
        scope: Construct,
        id: String,
        block: SageMakerCreateModelDsl.() -> Unit = {},
    ): SageMakerCreateModel {
        val builder = SageMakerCreateModelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerCreateModelProps(block: SageMakerCreateModelPropsDsl.() -> Unit = {}): SageMakerCreateModelProps {
        val builder = SageMakerCreateModelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerCreateTrainingJob(
        scope: Construct,
        id: String,
        block: SageMakerCreateTrainingJobDsl.() -> Unit = {},
    ): SageMakerCreateTrainingJob {
        val builder = SageMakerCreateTrainingJobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerCreateTrainingJobProps(
        block: SageMakerCreateTrainingJobPropsDsl.() -> Unit =
            {},
    ): SageMakerCreateTrainingJobProps {
        val builder = SageMakerCreateTrainingJobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerCreateTransformJob(
        scope: Construct,
        id: String,
        block: SageMakerCreateTransformJobDsl.() -> Unit = {},
    ): SageMakerCreateTransformJob {
        val builder = SageMakerCreateTransformJobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerCreateTransformJobProps(
        block: SageMakerCreateTransformJobPropsDsl.() -> Unit =
            {},
    ): SageMakerCreateTransformJobProps {
        val builder = SageMakerCreateTransformJobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerUpdateEndpoint(
        scope: Construct,
        id: String,
        block: SageMakerUpdateEndpointDsl.() -> Unit = {},
    ): SageMakerUpdateEndpoint {
        val builder = SageMakerUpdateEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun sageMakerUpdateEndpointProps(
        block: SageMakerUpdateEndpointPropsDsl.() -> Unit =
            {},
    ): SageMakerUpdateEndpointProps {
        val builder = SageMakerUpdateEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun shuffleConfig(block: ShuffleConfigDsl.() -> Unit = {}): ShuffleConfig {
        val builder = ShuffleConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun snsPublish(
        scope: Construct,
        id: String,
        block: SnsPublishDsl.() -> Unit = {},
    ): SnsPublish {
        val builder = SnsPublishDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun snsPublishProps(block: SnsPublishPropsDsl.() -> Unit = {}): SnsPublishProps {
        val builder = SnsPublishPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sparkSubmitJobDriver(block: SparkSubmitJobDriverDsl.() -> Unit = {}): SparkSubmitJobDriver {
        val builder = SparkSubmitJobDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sqsSendMessage(
        scope: Construct,
        id: String,
        block: SqsSendMessageDsl.() -> Unit = {},
    ): SqsSendMessage {
        val builder = SqsSendMessageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun sqsSendMessageProps(block: SqsSendMessagePropsDsl.() -> Unit = {}): SqsSendMessageProps {
        val builder = SqsSendMessagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepFunctionsInvokeActivity(
        scope: Construct,
        id: String,
        block: StepFunctionsInvokeActivityDsl.() -> Unit = {},
    ): StepFunctionsInvokeActivity {
        val builder = StepFunctionsInvokeActivityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepFunctionsInvokeActivityProps(
        block: StepFunctionsInvokeActivityPropsDsl.() -> Unit =
            {},
    ): StepFunctionsInvokeActivityProps {
        val builder = StepFunctionsInvokeActivityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepFunctionsStartExecution(
        scope: Construct,
        id: String,
        block: StepFunctionsStartExecutionDsl.() -> Unit = {},
    ): StepFunctionsStartExecution {
        val builder = StepFunctionsStartExecutionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepFunctionsStartExecutionProps(
        block: StepFunctionsStartExecutionPropsDsl.() -> Unit =
            {},
    ): StepFunctionsStartExecutionProps {
        val builder = StepFunctionsStartExecutionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stoppingCondition(block: StoppingConditionDsl.() -> Unit = {}): StoppingCondition {
        val builder = StoppingConditionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun taskEnvironmentVariable(block: TaskEnvironmentVariableDsl.() -> Unit = {}): TaskEnvironmentVariable {
        val builder = TaskEnvironmentVariableDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun transformDataSource(block: TransformDataSourceDsl.() -> Unit = {}): TransformDataSource {
        val builder = TransformDataSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun transformInput(block: TransformInputDsl.() -> Unit = {}): TransformInput {
        val builder = TransformInputDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun transformOutput(block: TransformOutputDsl.() -> Unit = {}): TransformOutput {
        val builder = TransformOutputDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun transformResources(block: TransformResourcesDsl.() -> Unit = {}): TransformResources {
        val builder = TransformResourcesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun transformS3DataSource(block: TransformS3DataSourceDsl.() -> Unit = {}): TransformS3DataSource {
        val builder = TransformS3DataSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun vpcConfig(block: VpcConfigDsl.() -> Unit = {}): VpcConfig {
        val builder = VpcConfigDsl()
        builder.apply(block)
        return builder.build()
    }
}
