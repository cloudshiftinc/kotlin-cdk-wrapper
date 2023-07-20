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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction
import software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateUpdateStackAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateUpdateStackActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction
import software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables
import software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables
import software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction
import software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction
import software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceVariables
import software.amazon.awscdk.services.codepipeline.actions.JenkinsAction
import software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps
import software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction
import software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps
import software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction
import software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps
import software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps
import software.amazon.awscdk.services.codepipeline.actions.S3DeployAction
import software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps
import software.amazon.awscdk.services.codepipeline.actions.S3SourceAction
import software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables
import software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps
import software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1
import software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object actions {
    public inline fun alexaSkillDeployAction(block: AlexaSkillDeployActionDsl.() -> Unit = {}): AlexaSkillDeployAction {
        val builder = AlexaSkillDeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun alexaSkillDeployActionProps(
        block: AlexaSkillDeployActionPropsDsl.() -> Unit =
            {},
    ): AlexaSkillDeployActionProps {
        val builder = AlexaSkillDeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationCreateReplaceChangeSetAction(
        block: CloudFormationCreateReplaceChangeSetActionDsl.() -> Unit =
            {},
    ): CloudFormationCreateReplaceChangeSetAction {
        val builder = CloudFormationCreateReplaceChangeSetActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationCreateReplaceChangeSetActionProps(
        block: CloudFormationCreateReplaceChangeSetActionPropsDsl.() -> Unit =
            {},
    ): CloudFormationCreateReplaceChangeSetActionProps {
        val builder = CloudFormationCreateReplaceChangeSetActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationCreateUpdateStackAction(
        block: CloudFormationCreateUpdateStackActionDsl.() -> Unit =
            {},
    ): CloudFormationCreateUpdateStackAction {
        val builder = CloudFormationCreateUpdateStackActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationCreateUpdateStackActionProps(
        block: CloudFormationCreateUpdateStackActionPropsDsl.() -> Unit =
            {},
    ): CloudFormationCreateUpdateStackActionProps {
        val builder = CloudFormationCreateUpdateStackActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationDeleteStackAction(
        block: CloudFormationDeleteStackActionDsl.() -> Unit =
            {},
    ): CloudFormationDeleteStackAction {
        val builder = CloudFormationDeleteStackActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationDeleteStackActionProps(
        block: CloudFormationDeleteStackActionPropsDsl.() -> Unit =
            {},
    ): CloudFormationDeleteStackActionProps {
        val builder = CloudFormationDeleteStackActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationDeployStackInstancesAction(
        block: CloudFormationDeployStackInstancesActionDsl.() -> Unit =
            {},
    ): CloudFormationDeployStackInstancesAction {
        val builder = CloudFormationDeployStackInstancesActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationDeployStackInstancesActionProps(
        block: CloudFormationDeployStackInstancesActionPropsDsl.() -> Unit =
            {},
    ): CloudFormationDeployStackInstancesActionProps {
        val builder = CloudFormationDeployStackInstancesActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationDeployStackSetAction(
        block: CloudFormationDeployStackSetActionDsl.() -> Unit =
            {},
    ): CloudFormationDeployStackSetAction {
        val builder = CloudFormationDeployStackSetActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationDeployStackSetActionProps(
        block: CloudFormationDeployStackSetActionPropsDsl.() -> Unit =
            {},
    ): CloudFormationDeployStackSetActionProps {
        val builder = CloudFormationDeployStackSetActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationExecuteChangeSetAction(
        block: CloudFormationExecuteChangeSetActionDsl.() -> Unit =
            {},
    ): CloudFormationExecuteChangeSetAction {
        val builder = CloudFormationExecuteChangeSetActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationExecuteChangeSetActionProps(
        block: CloudFormationExecuteChangeSetActionPropsDsl.() -> Unit =
            {},
    ): CloudFormationExecuteChangeSetActionProps {
        val builder = CloudFormationExecuteChangeSetActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeBuildAction(block: CodeBuildActionDsl.() -> Unit = {}): CodeBuildAction {
        val builder = CodeBuildActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeBuildActionProps(block: CodeBuildActionPropsDsl.() -> Unit = {}): CodeBuildActionProps {
        val builder = CodeBuildActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeCommitSourceAction(block: CodeCommitSourceActionDsl.() -> Unit = {}): CodeCommitSourceAction {
        val builder = CodeCommitSourceActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeCommitSourceActionProps(
        block: CodeCommitSourceActionPropsDsl.() -> Unit =
            {},
    ): CodeCommitSourceActionProps {
        val builder = CodeCommitSourceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeCommitSourceVariables(block: CodeCommitSourceVariablesDsl.() -> Unit = {}): CodeCommitSourceVariables {
        val builder = CodeCommitSourceVariablesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeDeployEcsContainerImageInput(
        block: CodeDeployEcsContainerImageInputDsl.() -> Unit =
            {},
    ): CodeDeployEcsContainerImageInput {
        val builder = CodeDeployEcsContainerImageInputDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeDeployEcsDeployAction(block: CodeDeployEcsDeployActionDsl.() -> Unit = {}): CodeDeployEcsDeployAction {
        val builder = CodeDeployEcsDeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeDeployEcsDeployActionProps(block: CodeDeployEcsDeployActionPropsDsl.() -> Unit = {}): CodeDeployEcsDeployActionProps {
        val builder = CodeDeployEcsDeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeDeployServerDeployAction(
        block: CodeDeployServerDeployActionDsl.() -> Unit =
            {},
    ): CodeDeployServerDeployAction {
        val builder = CodeDeployServerDeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeDeployServerDeployActionProps(
        block: CodeDeployServerDeployActionPropsDsl.() -> Unit =
            {},
    ): CodeDeployServerDeployActionProps {
        val builder = CodeDeployServerDeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeStarConnectionsSourceAction(
        block: CodeStarConnectionsSourceActionDsl.() -> Unit =
            {},
    ): CodeStarConnectionsSourceAction {
        val builder = CodeStarConnectionsSourceActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeStarConnectionsSourceActionProps(
        block: CodeStarConnectionsSourceActionPropsDsl.() -> Unit =
            {},
    ): CodeStarConnectionsSourceActionProps {
        val builder = CodeStarConnectionsSourceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeStarSourceVariables(block: CodeStarSourceVariablesDsl.() -> Unit = {}): CodeStarSourceVariables {
        val builder = CodeStarSourceVariablesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun commonCloudFormationStackSetOptions(
        block: CommonCloudFormationStackSetOptionsDsl.() -> Unit =
            {},
    ): CommonCloudFormationStackSetOptions {
        val builder = CommonCloudFormationStackSetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecrSourceAction(block: EcrSourceActionDsl.() -> Unit = {}): EcrSourceAction {
        val builder = EcrSourceActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecrSourceActionProps(block: EcrSourceActionPropsDsl.() -> Unit = {}): EcrSourceActionProps {
        val builder = EcrSourceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecrSourceVariables(block: EcrSourceVariablesDsl.() -> Unit = {}): EcrSourceVariables {
        val builder = EcrSourceVariablesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsDeployAction(block: EcsDeployActionDsl.() -> Unit = {}): EcsDeployAction {
        val builder = EcsDeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsDeployActionProps(block: EcsDeployActionPropsDsl.() -> Unit = {}): EcsDeployActionProps {
        val builder = EcsDeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun elasticBeanstalkDeployAction(
        block: ElasticBeanstalkDeployActionDsl.() -> Unit =
            {},
    ): ElasticBeanstalkDeployAction {
        val builder = ElasticBeanstalkDeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun elasticBeanstalkDeployActionProps(
        block: ElasticBeanstalkDeployActionPropsDsl.() -> Unit =
            {},
    ): ElasticBeanstalkDeployActionProps {
        val builder = ElasticBeanstalkDeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gitHubSourceAction(block: GitHubSourceActionDsl.() -> Unit = {}): GitHubSourceAction {
        val builder = GitHubSourceActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gitHubSourceActionProps(block: GitHubSourceActionPropsDsl.() -> Unit = {}): GitHubSourceActionProps {
        val builder = GitHubSourceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gitHubSourceVariables(block: GitHubSourceVariablesDsl.() -> Unit = {}): GitHubSourceVariables {
        val builder = GitHubSourceVariablesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun jenkinsAction(block: JenkinsActionDsl.() -> Unit = {}): JenkinsAction {
        val builder = JenkinsActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun jenkinsActionProps(block: JenkinsActionPropsDsl.() -> Unit = {}): JenkinsActionProps {
        val builder = JenkinsActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun jenkinsProvider(
        scope: Construct,
        id: String,
        block: JenkinsProviderDsl.() -> Unit = {},
    ): JenkinsProvider {
        val builder = JenkinsProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun jenkinsProviderAttributes(block: JenkinsProviderAttributesDsl.() -> Unit = {}): JenkinsProviderAttributes {
        val builder = JenkinsProviderAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun jenkinsProviderProps(block: JenkinsProviderPropsDsl.() -> Unit = {}): JenkinsProviderProps {
        val builder = JenkinsProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaInvokeAction(block: LambdaInvokeActionDsl.() -> Unit = {}): LambdaInvokeAction {
        val builder = LambdaInvokeActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaInvokeActionProps(block: LambdaInvokeActionPropsDsl.() -> Unit = {}): LambdaInvokeActionProps {
        val builder = LambdaInvokeActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun manualApprovalAction(block: ManualApprovalActionDsl.() -> Unit = {}): ManualApprovalAction {
        val builder = ManualApprovalActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun manualApprovalActionProps(block: ManualApprovalActionPropsDsl.() -> Unit = {}): ManualApprovalActionProps {
        val builder = ManualApprovalActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun organizationsDeploymentProps(
        block: OrganizationsDeploymentPropsDsl.() -> Unit =
            {},
    ): OrganizationsDeploymentProps {
        val builder = OrganizationsDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3DeployAction(block: S3DeployActionDsl.() -> Unit = {}): S3DeployAction {
        val builder = S3DeployActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3DeployActionProps(block: S3DeployActionPropsDsl.() -> Unit = {}): S3DeployActionProps {
        val builder = S3DeployActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3SourceAction(block: S3SourceActionDsl.() -> Unit = {}): S3SourceAction {
        val builder = S3SourceActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3SourceActionProps(block: S3SourceActionPropsDsl.() -> Unit = {}): S3SourceActionProps {
        val builder = S3SourceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3SourceVariables(block: S3SourceVariablesDsl.() -> Unit = {}): S3SourceVariables {
        val builder = S3SourceVariablesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun selfManagedDeploymentProps(
        block: SelfManagedDeploymentPropsDsl.() -> Unit =
            {},
    ): SelfManagedDeploymentProps {
        val builder = SelfManagedDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceCatalogDeployActionBeta1(
        block: ServiceCatalogDeployActionBeta1Dsl.() -> Unit =
            {},
    ): ServiceCatalogDeployActionBeta1 {
        val builder = ServiceCatalogDeployActionBeta1Dsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceCatalogDeployActionBeta1Props(
        block: ServiceCatalogDeployActionBeta1PropsDsl.() -> Unit =
            {},
    ): ServiceCatalogDeployActionBeta1Props {
        val builder = ServiceCatalogDeployActionBeta1PropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepFunctionInvokeAction(block: StepFunctionInvokeActionDsl.() -> Unit = {}): StepFunctionInvokeAction {
        val builder = StepFunctionInvokeActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepFunctionsInvokeActionProps(block: StepFunctionsInvokeActionPropsDsl.() -> Unit = {}): StepFunctionsInvokeActionProps {
        val builder = StepFunctionsInvokeActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
