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

package cloudshift.awscdk.dsl.pipelines

import software.amazon.awscdk.pipelines.AddStageOpts
import software.amazon.awscdk.pipelines.CodeBuildOptions
import software.amazon.awscdk.pipelines.CodeBuildStep
import software.amazon.awscdk.pipelines.CodeBuildStepProps
import software.amazon.awscdk.pipelines.CodeCommitSourceOptions
import software.amazon.awscdk.pipelines.CodePipeline
import software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult
import software.amazon.awscdk.pipelines.CodePipelineProps
import software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening
import software.amazon.awscdk.pipelines.ConnectionSourceOptions
import software.amazon.awscdk.pipelines.ECRSourceOptions
import software.amazon.awscdk.pipelines.EcrDockerCredentialOptions
import software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions
import software.amazon.awscdk.pipelines.FileSetLocation
import software.amazon.awscdk.pipelines.GitHubSourceOptions
import software.amazon.awscdk.pipelines.ManualApprovalStep
import software.amazon.awscdk.pipelines.ManualApprovalStepProps
import software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps
import software.amazon.awscdk.pipelines.PipelineBaseProps
import software.amazon.awscdk.pipelines.ProduceActionOptions
import software.amazon.awscdk.pipelines.S3SourceOptions
import software.amazon.awscdk.pipelines.ShellStep
import software.amazon.awscdk.pipelines.ShellStepProps
import software.amazon.awscdk.pipelines.StackAsset
import software.amazon.awscdk.pipelines.StackDeploymentProps
import software.amazon.awscdk.pipelines.StackSteps
import software.amazon.awscdk.pipelines.StageDeploymentProps
import software.amazon.awscdk.pipelines.Wave
import software.amazon.awscdk.pipelines.WaveOptions
import software.amazon.awscdk.pipelines.WaveProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object pipelines {
    public inline fun addStageOpts(block: AddStageOptsDsl.() -> Unit = {}): AddStageOpts {
        val builder = AddStageOptsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeBuildOptions(block: CodeBuildOptionsDsl.() -> Unit = {}): CodeBuildOptions {
        val builder = CodeBuildOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeBuildStep(id: String, block: CodeBuildStepDsl.() -> Unit = {}): CodeBuildStep {
        val builder = CodeBuildStepDsl(id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeBuildStepProps(block: CodeBuildStepPropsDsl.() -> Unit = {}): CodeBuildStepProps {
        val builder = CodeBuildStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codeCommitSourceOptions(block: CodeCommitSourceOptionsDsl.() -> Unit = {}): CodeCommitSourceOptions {
        val builder = CodeCommitSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codePipeline(
        scope: Construct,
        id: String,
        block: CodePipelineDsl.() -> Unit = {},
    ): CodePipeline {
        val builder = CodePipelineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun codePipelineActionFactoryResult(
        block: CodePipelineActionFactoryResultDsl.() -> Unit =
            {},
    ): CodePipelineActionFactoryResult {
        val builder = CodePipelineActionFactoryResultDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun codePipelineProps(block: CodePipelinePropsDsl.() -> Unit = {}): CodePipelineProps {
        val builder = CodePipelinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun confirmPermissionsBroadening(
        id: String,
        block: ConfirmPermissionsBroadeningDsl.() -> Unit = {},
    ): ConfirmPermissionsBroadening {
        val builder = ConfirmPermissionsBroadeningDsl(id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun connectionSourceOptions(block: ConnectionSourceOptionsDsl.() -> Unit = {}): ConnectionSourceOptions {
        val builder = ConnectionSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun eCRSourceOptions(block: ECRSourceOptionsDsl.() -> Unit = {}): ECRSourceOptions {
        val builder = ECRSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecrDockerCredentialOptions(
        block: EcrDockerCredentialOptionsDsl.() -> Unit =
            {},
    ): EcrDockerCredentialOptions {
        val builder = EcrDockerCredentialOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun externalDockerCredentialOptions(
        block: ExternalDockerCredentialOptionsDsl.() -> Unit =
            {},
    ): ExternalDockerCredentialOptions {
        val builder = ExternalDockerCredentialOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fileSetLocation(block: FileSetLocationDsl.() -> Unit = {}): FileSetLocation {
        val builder = FileSetLocationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gitHubSourceOptions(block: GitHubSourceOptionsDsl.() -> Unit = {}): GitHubSourceOptions {
        val builder = GitHubSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun manualApprovalStep(id: String, block: ManualApprovalStepDsl.() -> Unit = {}): ManualApprovalStep {
        val builder = ManualApprovalStepDsl(id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun manualApprovalStepProps(block: ManualApprovalStepPropsDsl.() -> Unit = {}): ManualApprovalStepProps {
        val builder = ManualApprovalStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun permissionsBroadeningCheckProps(
        block: PermissionsBroadeningCheckPropsDsl.() -> Unit =
            {},
    ): PermissionsBroadeningCheckProps {
        val builder = PermissionsBroadeningCheckPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun pipelineBaseProps(block: PipelineBasePropsDsl.() -> Unit = {}): PipelineBaseProps {
        val builder = PipelineBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun produceActionOptions(block: ProduceActionOptionsDsl.() -> Unit = {}): ProduceActionOptions {
        val builder = ProduceActionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3SourceOptions(block: S3SourceOptionsDsl.() -> Unit = {}): S3SourceOptions {
        val builder = S3SourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun shellStep(id: String, block: ShellStepDsl.() -> Unit = {}): ShellStep {
        val builder = ShellStepDsl(id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun shellStepProps(block: ShellStepPropsDsl.() -> Unit = {}): ShellStepProps {
        val builder = ShellStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stackAsset(block: StackAssetDsl.() -> Unit = {}): StackAsset {
        val builder = StackAssetDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stackDeploymentProps(block: StackDeploymentPropsDsl.() -> Unit = {}): StackDeploymentProps {
        val builder = StackDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stackSteps(block: StackStepsDsl.() -> Unit = {}): StackSteps {
        val builder = StackStepsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stageDeploymentProps(block: StageDeploymentPropsDsl.() -> Unit = {}): StageDeploymentProps {
        val builder = StageDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun wave(id: String, block: WaveDsl.() -> Unit = {}): Wave {
        val builder = WaveDsl(id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun waveOptions(block: WaveOptionsDsl.() -> Unit = {}): WaveOptions {
        val builder = WaveOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun waveProps(block: WavePropsDsl.() -> Unit = {}): WaveProps {
        val builder = WavePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
