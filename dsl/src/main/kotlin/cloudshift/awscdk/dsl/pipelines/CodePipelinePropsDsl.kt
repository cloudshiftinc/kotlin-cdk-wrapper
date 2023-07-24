@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.CodeBuildOptions
import software.amazon.awscdk.pipelines.CodePipelineProps
import software.amazon.awscdk.pipelines.DockerCredential
import software.amazon.awscdk.pipelines.IFileSetProducer
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for a `CodePipeline`.
 *
 * Example:
 *
 * ```
 * Pipeline codePipeline;
 * Artifact sourceArtifact = new Artifact("MySourceArtifact");
 * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
 * .codePipeline(codePipeline)
 * .synth(ShellStep.Builder.create("Synth")
 * .input(CodePipelineFileSet.fromArtifact(sourceArtifact))
 * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CodePipelinePropsDsl {
    private val cdkBuilder: CodePipelineProps.Builder = CodePipelineProps.builder()

    private val _dockerCredentials: MutableList<DockerCredential> = mutableListOf()

    /**
     * @param artifactBucket An existing S3 Bucket to use for storing the pipeline's artifact.
     */
    public fun artifactBucket(artifactBucket: IBucket) {
        cdkBuilder.artifactBucket(artifactBucket)
    }

    /**
     * @param assetPublishingCodeBuildDefaults Additional customizations to apply to the asset
     * publishing CodeBuild projects.
     */
    public fun assetPublishingCodeBuildDefaults(
        assetPublishingCodeBuildDefaults: CodeBuildOptionsDsl.() -> Unit =
            {}
    ) {
        val builder = CodeBuildOptionsDsl()
        builder.apply(assetPublishingCodeBuildDefaults)
        cdkBuilder.assetPublishingCodeBuildDefaults(builder.build())
    }

    /**
     * @param assetPublishingCodeBuildDefaults Additional customizations to apply to the asset
     * publishing CodeBuild projects.
     */
    public fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions) {
        cdkBuilder.assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults)
    }

    /**
     * @param cliVersion CDK CLI version to use in self-mutation and asset publishing steps.
     * If you want to lock the CDK CLI version used in the pipeline, by steps
     * that are automatically generated for you, specify the version here.
     *
     * We recommend you do not specify this value, as not specifying it always
     * uses the latest CLI version which is backwards compatible with old versions.
     *
     * If you do specify it, be aware that this version should always be equal to or higher than the
     * version of the CDK framework used by the CDK app, when the CDK commands are
     * run during your pipeline execution. When you change this version, the *next
     * time* the `SelfMutate` step runs it will still be using the CLI of the the
     * *previous* version that was in this property: it will only start using the
     * new version after `SelfMutate` completes successfully. That means that if
     * you want to update both framework and CLI version, you should update the
     * CLI version first, commit, push and deploy, and only then update the
     * framework version.
     */
    public fun cliVersion(cliVersion: String) {
        cdkBuilder.cliVersion(cliVersion)
    }

    /**
     * @param codeBuildDefaults Customize the CodeBuild projects created for this pipeline.
     */
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptionsDsl.() -> Unit = {}) {
        val builder = CodeBuildOptionsDsl()
        builder.apply(codeBuildDefaults)
        cdkBuilder.codeBuildDefaults(builder.build())
    }

    /**
     * @param codeBuildDefaults Customize the CodeBuild projects created for this pipeline.
     */
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
        cdkBuilder.codeBuildDefaults(codeBuildDefaults)
    }

    /**
     * @param codePipeline An existing Pipeline to be reused and built upon.
     * [disable-awslint:ref-via-interface]
     */
    public fun codePipeline(codePipeline: Pipeline) {
        cdkBuilder.codePipeline(codePipeline)
    }

    /**
     * @param crossAccountKeys Create KMS keys for the artifact buckets, allowing cross-account
     * deployments.
     * The artifact buckets have to be encrypted to support deploying CDK apps to
     * another account, so if you want to do that or want to have your artifact
     * buckets encrypted, be sure to set this value to `true`.
     *
     * Be aware there is a cost associated with maintaining the KMS keys.
     */
    public fun crossAccountKeys(crossAccountKeys: Boolean) {
        cdkBuilder.crossAccountKeys(crossAccountKeys)
    }

    /**
     * @param dockerCredentials A list of credentials used to authenticate to Docker registries.
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     */
    public fun dockerCredentials(vararg dockerCredentials: DockerCredential) {
        _dockerCredentials.addAll(listOf(*dockerCredentials))
    }

    /**
     * @param dockerCredentials A list of credentials used to authenticate to Docker registries.
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     */
    public fun dockerCredentials(dockerCredentials: Collection<DockerCredential>) {
        _dockerCredentials.addAll(dockerCredentials)
    }

    /**
     * @param dockerEnabledForSelfMutation Enable Docker for the self-mutate step.
     * Set this to true if the pipeline itself uses Docker container assets
     * (for example, if you use `LinuxBuildImage.fromAsset()` as the build
     * image of a CodeBuild step in the pipeline).
     *
     * You do not need to set it if you build Docker image assets in the
     * application Stages and Stacks that are *deployed* by this pipeline.
     *
     * Configures privileged mode for the self-mutation CodeBuild action.
     *
     * If you are about to turn this on in an already-deployed Pipeline,
     * set the value to `true` first, commit and allow the pipeline to
     * self-update, and only then use the Docker asset in the pipeline.
     */
    public fun dockerEnabledForSelfMutation(dockerEnabledForSelfMutation: Boolean) {
        cdkBuilder.dockerEnabledForSelfMutation(dockerEnabledForSelfMutation)
    }

    /**
     * @param dockerEnabledForSynth Enable Docker for the 'synth' step.
     * Set this to true if you are using file assets that require
     * "bundling" anywhere in your application (meaning an asset
     * compilation step will be run with the tools provided by
     * a Docker image), both for the Pipeline stack as well as the
     * application stacks.
     *
     * A common way to use bundling assets in your application is by
     * using the `&#64;aws-cdk/aws-lambda-nodejs` library.
     *
     * Configures privileged mode for the synth CodeBuild action.
     *
     * If you are about to turn this on in an already-deployed Pipeline,
     * set the value to `true` first, commit and allow the pipeline to
     * self-update, and only then use the bundled asset.
     */
    public fun dockerEnabledForSynth(dockerEnabledForSynth: Boolean) {
        cdkBuilder.dockerEnabledForSynth(dockerEnabledForSynth)
    }

    /**
     * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys.
     * By default KMS key rotation is disabled, but will add
     * additional costs when enabled.
     */
    public fun enableKeyRotation(enableKeyRotation: Boolean) {
        cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    /**
     * @param pipelineName The name of the CodePipeline pipeline.
     */
    public fun pipelineName(pipelineName: String) {
        cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * @param publishAssetsInParallel Publish assets in multiple CodeBuild projects.
     * If set to false, use one Project per type to publish all assets.
     *
     * Publishing in parallel improves concurrency and may reduce publishing
     * latency, but may also increase overall provisioning time of the CodeBuild
     * projects.
     *
     * Experiment and see what value works best for you.
     */
    public fun publishAssetsInParallel(publishAssetsInParallel: Boolean) {
        cdkBuilder.publishAssetsInParallel(publishAssetsInParallel)
    }

    /**
     * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
     * pipelines in the App.
     */
    public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
        cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
    }

    /**
     * @param role The IAM role to be assumed by this Pipeline.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param selfMutation Whether the pipeline will update itself.
     * This needs to be set to `true` to allow the pipeline to reconfigure
     * itself when assets or stages are being added to it, and `true` is the
     * recommended setting.
     *
     * You can temporarily set this to `false` while you are iterating
     * on the pipeline itself and prefer to deploy changes using `cdk deploy`.
     */
    public fun selfMutation(selfMutation: Boolean) {
        cdkBuilder.selfMutation(selfMutation)
    }

    /**
     * @param selfMutationCodeBuildDefaults Additional customizations to apply to the self mutation
     * CodeBuild projects.
     */
    public fun selfMutationCodeBuildDefaults(
        selfMutationCodeBuildDefaults: CodeBuildOptionsDsl.() -> Unit =
            {}
    ) {
        val builder = CodeBuildOptionsDsl()
        builder.apply(selfMutationCodeBuildDefaults)
        cdkBuilder.selfMutationCodeBuildDefaults(builder.build())
    }

    /**
     * @param selfMutationCodeBuildDefaults Additional customizations to apply to the self mutation
     * CodeBuild projects.
     */
    public fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions) {
        cdkBuilder.selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults)
    }

    /**
     * @param synth The build step that produces the CDK Cloud Assembly.
     * The primary output of this step needs to be the `cdk.out` directory
     * generated by the `cdk synth` command.
     *
     * If you use a `ShellStep` here and you don't configure an output directory,
     * the output directory will automatically be assumed to be `cdk.out`.
     */
    public fun synth(synth: IFileSetProducer) {
        cdkBuilder.synth(synth)
    }

    /**
     * @param synthCodeBuildDefaults Additional customizations to apply to the synthesize CodeBuild
     * projects.
     */
    public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptionsDsl.() -> Unit = {}) {
        val builder = CodeBuildOptionsDsl()
        builder.apply(synthCodeBuildDefaults)
        cdkBuilder.synthCodeBuildDefaults(builder.build())
    }

    /**
     * @param synthCodeBuildDefaults Additional customizations to apply to the synthesize CodeBuild
     * projects.
     */
    public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions) {
        cdkBuilder.synthCodeBuildDefaults(synthCodeBuildDefaults)
    }

    /**
     * @param useChangeSets Deploy every stack by creating a change set and executing it.
     * When enabled, creates a "Prepare" and "Execute" action for each stack. Disable
     * to deploy the stack in one pipeline action.
     */
    public fun useChangeSets(useChangeSets: Boolean) {
        cdkBuilder.useChangeSets(useChangeSets)
    }

    public fun build(): CodePipelineProps {
        if (_dockerCredentials.isNotEmpty()) cdkBuilder.dockerCredentials(_dockerCredentials)
        return cdkBuilder.build()
    }
}
