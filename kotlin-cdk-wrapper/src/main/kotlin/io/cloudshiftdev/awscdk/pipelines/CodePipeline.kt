@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codebuild.IProject
import io.cloudshiftdev.awscdk.services.codepipeline.Pipeline
import io.cloudshiftdev.awscdk.services.codepipeline.PipelineType
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CDK Pipeline that uses CodePipeline to deploy CDK apps.
 *
 * This is a `Pipeline` with its `engine` property set to
 * `CodePipelineEngine`, and exists for nicer ergonomics for
 * users that don't need to switch out engines.
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
public open class CodePipeline(
  cdkObject: software.amazon.awscdk.pipelines.CodePipeline,
) : PipelineBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CodePipelineProps,
  ) :
      this(software.amazon.awscdk.pipelines.CodePipeline(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CodePipelineProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CodePipelineProps.Builder.() -> Unit,
  ) : this(scope, id, CodePipelineProps(props)
  )

  /**
   * The CodePipeline pipeline that deploys the CDK app.
   *
   * Only available after the pipeline has been built.
   */
  public open fun pipeline(): Pipeline = unwrap(this).getPipeline().let(Pipeline::wrap)

  /**
   * Whether SelfMutation is enabled for this CDK Pipeline.
   */
  public open fun selfMutationEnabled(): Boolean = unwrap(this).getSelfMutationEnabled()

  /**
   * The CodeBuild project that performs the SelfMutation.
   *
   * Will throw an error if this is accessed before `buildPipeline()`
   * is called, or if selfMutation has been disabled.
   */
  public open fun selfMutationProject(): IProject =
      unwrap(this).getSelfMutationProject().let(IProject::wrap)

  /**
   * The CodeBuild project that performs the Synth.
   *
   * Only available after the pipeline has been built.
   */
  public open fun synthProject(): IProject = unwrap(this).getSynthProject().let(IProject::wrap)

  /**
   * Allow pipeline service role used for actions if no action role configured instead of creating a
   * new role for each action.
   */
  public open fun usePipelineRoleForActions(): Boolean = unwrap(this).getUsePipelineRoleForActions()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.pipelines.CodePipeline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An existing S3 Bucket to use for storing the pipeline's artifact.
     *
     * Default: - A new S3 bucket will be created.
     *
     * @param artifactBucket An existing S3 Bucket to use for storing the pipeline's artifact. 
     */
    public fun artifactBucket(artifactBucket: IBucket)

    /**
     * Additional customizations to apply to the asset publishing CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param assetPublishingCodeBuildDefaults Additional customizations to apply to the asset
     * publishing CodeBuild projects. 
     */
    public fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions)

    /**
     * Additional customizations to apply to the asset publishing CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param assetPublishingCodeBuildDefaults Additional customizations to apply to the asset
     * publishing CodeBuild projects. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13976c16c7fda8250624b156d2574ea437cfda46a000cb44a752fa302b503f7e")
    public
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    /**
     * CDK CLI version to use in asset publishing steps.
     *
     * If you want to lock the `cdk-assets` version used in the pipeline, by steps
     * that are automatically generated for you, specify the version here.
     *
     * We recommend you do not specify this value, as not specifying it always
     * uses the latest CLI version which is backwards compatible with old versions.
     *
     * Default: - Latest version
     *
     * [Documentation](https://www.npmjs.com/package/cdk-assets)
     * @param cdkAssetsCliVersion CDK CLI version to use in asset publishing steps. 
     */
    public fun cdkAssetsCliVersion(cdkAssetsCliVersion: String)

    /**
     * CDK CLI version to use in self-mutation step.
     *
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
     *
     * Default: - Latest version
     *
     * @param cliVersion CDK CLI version to use in self-mutation step. 
     */
    public fun cliVersion(cliVersion: String)

    /**
     * Customize the CodeBuild projects created for this pipeline.
     *
     * Default: - All projects run non-privileged build, SMALL instance,
     * LinuxBuildImage.STANDARD_7_0
     *
     * @param codeBuildDefaults Customize the CodeBuild projects created for this pipeline. 
     */
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions)

    /**
     * Customize the CodeBuild projects created for this pipeline.
     *
     * Default: - All projects run non-privileged build, SMALL instance,
     * LinuxBuildImage.STANDARD_7_0
     *
     * @param codeBuildDefaults Customize the CodeBuild projects created for this pipeline. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92416628ee0d4ef7efc74754c30fcf9c872c992904f5b1db3c94b24ca77cd7ed")
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    /**
     * An existing Pipeline to be reused and built upon.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - a new underlying pipeline is created.
     *
     * @param codePipeline An existing Pipeline to be reused and built upon. 
     */
    public fun codePipeline(codePipeline: Pipeline)

    /**
     * Create KMS keys for the artifact buckets, allowing cross-account deployments.
     *
     * The artifact buckets have to be encrypted to support deploying CDK apps to
     * another account, so if you want to do that or want to have your artifact
     * buckets encrypted, be sure to set this value to `true`.
     *
     * Be aware there is a cost associated with maintaining the KMS keys.
     *
     * Default: false
     *
     * @param crossAccountKeys Create KMS keys for the artifact buckets, allowing cross-account
     * deployments. 
     */
    public fun crossAccountKeys(crossAccountKeys: Boolean)

    /**
     * A map of region to S3 bucket name used for cross-region CodePipeline.
     *
     * For every Action that you specify targeting a different region than the Pipeline itself,
     * if you don't provide an explicit Bucket for that region using this property,
     * the construct will automatically create a Stack containing an S3 Bucket in that region.
     * Passed directly through to the [cp.Pipeline].
     *
     * Default: - no cross region replication buckets.
     *
     * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
     * CodePipeline. 
     */
    public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>)

    /**
     * A list of credentials used to authenticate to Docker registries.
     *
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     *
     * Default: []
     *
     * @param dockerCredentials A list of credentials used to authenticate to Docker registries. 
     */
    public fun dockerCredentials(dockerCredentials: List<DockerCredential>)

    /**
     * A list of credentials used to authenticate to Docker registries.
     *
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     *
     * Default: []
     *
     * @param dockerCredentials A list of credentials used to authenticate to Docker registries. 
     */
    public fun dockerCredentials(vararg dockerCredentials: DockerCredential)

    /**
     * Enable Docker for the self-mutate step.
     *
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
     *
     * Default: false
     *
     * @param dockerEnabledForSelfMutation Enable Docker for the self-mutate step. 
     */
    public fun dockerEnabledForSelfMutation(dockerEnabledForSelfMutation: Boolean)

    /**
     * Enable Docker for the 'synth' step.
     *
     * Set this to true if you are using file assets that require
     * "bundling" anywhere in your application (meaning an asset
     * compilation step will be run with the tools provided by
     * a Docker image), both for the Pipeline stack as well as the
     * application stacks.
     *
     * A common way to use bundling assets in your application is by
     * using the `aws-cdk-lib/aws-lambda-nodejs` library.
     *
     * Configures privileged mode for the synth CodeBuild action.
     *
     * If you are about to turn this on in an already-deployed Pipeline,
     * set the value to `true` first, commit and allow the pipeline to
     * self-update, and only then use the bundled asset.
     *
     * Default: false
     *
     * @param dockerEnabledForSynth Enable Docker for the 'synth' step. 
     */
    public fun dockerEnabledForSynth(dockerEnabledForSynth: Boolean)

    /**
     * Enable KMS key rotation for the generated KMS keys.
     *
     * By default KMS key rotation is disabled, but will add
     * additional costs when enabled.
     *
     * Default: - false (key rotation is disabled)
     *
     * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys. 
     */
    public fun enableKeyRotation(enableKeyRotation: Boolean)

    /**
     * The name of the CodePipeline pipeline.
     *
     * Default: - Automatically generated
     *
     * @param pipelineName The name of the CodePipeline pipeline. 
     */
    public fun pipelineName(pipelineName: String)

    /**
     * Type of the pipeline.
     *
     * Default: - PipelineType.V2 if the feature flag `CODEPIPELINE_DEFAULT_PIPELINE_TYPE_TO_V2`
     * is true, PipelineType.V1 otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
     * @param pipelineType Type of the pipeline. 
     */
    public fun pipelineType(pipelineType: PipelineType)

    /**
     * Publish assets in multiple CodeBuild projects.
     *
     * If set to false, use one Project per type to publish all assets.
     *
     * Publishing in parallel improves concurrency and may reduce publishing
     * latency, but may also increase overall provisioning time of the CodeBuild
     * projects.
     *
     * Experiment and see what value works best for you.
     *
     * Default: true
     *
     * @param publishAssetsInParallel Publish assets in multiple CodeBuild projects. 
     */
    public fun publishAssetsInParallel(publishAssetsInParallel: Boolean)

    /**
     * Reuse the same cross region support stack for all pipelines in the App.
     *
     * Default: - true (Use the same support stack for all pipelines in App)
     *
     * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
     * pipelines in the App. 
     */
    public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean)

    /**
     * The IAM role to be assumed by this Pipeline.
     *
     * Default: - A new role is created
     *
     * @param role The IAM role to be assumed by this Pipeline. 
     */
    public fun role(role: IRole)

    /**
     * Whether the pipeline will update itself.
     *
     * This needs to be set to `true` to allow the pipeline to reconfigure
     * itself when assets or stages are being added to it, and `true` is the
     * recommended setting.
     *
     * You can temporarily set this to `false` while you are iterating
     * on the pipeline itself and prefer to deploy changes using `cdk deploy`.
     *
     * Default: true
     *
     * @param selfMutation Whether the pipeline will update itself. 
     */
    public fun selfMutation(selfMutation: Boolean)

    /**
     * Additional customizations to apply to the self mutation CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param selfMutationCodeBuildDefaults Additional customizations to apply to the self mutation
     * CodeBuild projects. 
     */
    public fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions)

    /**
     * Additional customizations to apply to the self mutation CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param selfMutationCodeBuildDefaults Additional customizations to apply to the self mutation
     * CodeBuild projects. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2790694c1a1ce1299e7bfb748866e114b8b330eb250494bb1b607438cedb87c")
    public
        fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    /**
     * The build step that produces the CDK Cloud Assembly.
     *
     * The primary output of this step needs to be the `cdk.out` directory
     * generated by the `cdk synth` command.
     *
     * If you use a `ShellStep` here and you don't configure an output directory,
     * the output directory will automatically be assumed to be `cdk.out`.
     *
     * @param synth The build step that produces the CDK Cloud Assembly. 
     */
    public fun synth(synth: IFileSetProducer)

    /**
     * Additional customizations to apply to the synthesize CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param synthCodeBuildDefaults Additional customizations to apply to the synthesize CodeBuild
     * projects. 
     */
    public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions)

    /**
     * Additional customizations to apply to the synthesize CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param synthCodeBuildDefaults Additional customizations to apply to the synthesize CodeBuild
     * projects. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ca7d4625a6b01d9bbb45d464baf8d48c59aaca88a925ec8b7f0ee11d400412d")
    public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    /**
     * Deploy every stack by creating a change set and executing it.
     *
     * When enabled, creates a "Prepare" and "Execute" action for each stack. Disable
     * to deploy the stack in one pipeline action.
     *
     * Default: true
     *
     * @param useChangeSets Deploy every stack by creating a change set and executing it. 
     */
    public fun useChangeSets(useChangeSets: Boolean)

    /**
     * Use pipeline service role for actions if no action role configured.
     *
     * Default: - false
     *
     * @param usePipelineRoleForActions Use pipeline service role for actions if no action role
     * configured. 
     */
    public fun usePipelineRoleForActions(usePipelineRoleForActions: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodePipeline.Builder =
        software.amazon.awscdk.pipelines.CodePipeline.Builder.create(scope, id)

    /**
     * An existing S3 Bucket to use for storing the pipeline's artifact.
     *
     * Default: - A new S3 bucket will be created.
     *
     * @param artifactBucket An existing S3 Bucket to use for storing the pipeline's artifact. 
     */
    override fun artifactBucket(artifactBucket: IBucket) {
      cdkBuilder.artifactBucket(artifactBucket.let(IBucket.Companion::unwrap))
    }

    /**
     * Additional customizations to apply to the asset publishing CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param assetPublishingCodeBuildDefaults Additional customizations to apply to the asset
     * publishing CodeBuild projects. 
     */
    override
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults.let(CodeBuildOptions.Companion::unwrap))
    }

    /**
     * Additional customizations to apply to the asset publishing CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param assetPublishingCodeBuildDefaults Additional customizations to apply to the asset
     * publishing CodeBuild projects. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13976c16c7fda8250624b156d2574ea437cfda46a000cb44a752fa302b503f7e")
    override
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = assetPublishingCodeBuildDefaults(CodeBuildOptions(assetPublishingCodeBuildDefaults))

    /**
     * CDK CLI version to use in asset publishing steps.
     *
     * If you want to lock the `cdk-assets` version used in the pipeline, by steps
     * that are automatically generated for you, specify the version here.
     *
     * We recommend you do not specify this value, as not specifying it always
     * uses the latest CLI version which is backwards compatible with old versions.
     *
     * Default: - Latest version
     *
     * [Documentation](https://www.npmjs.com/package/cdk-assets)
     * @param cdkAssetsCliVersion CDK CLI version to use in asset publishing steps. 
     */
    override fun cdkAssetsCliVersion(cdkAssetsCliVersion: String) {
      cdkBuilder.cdkAssetsCliVersion(cdkAssetsCliVersion)
    }

    /**
     * CDK CLI version to use in self-mutation step.
     *
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
     *
     * Default: - Latest version
     *
     * @param cliVersion CDK CLI version to use in self-mutation step. 
     */
    override fun cliVersion(cliVersion: String) {
      cdkBuilder.cliVersion(cliVersion)
    }

    /**
     * Customize the CodeBuild projects created for this pipeline.
     *
     * Default: - All projects run non-privileged build, SMALL instance,
     * LinuxBuildImage.STANDARD_7_0
     *
     * @param codeBuildDefaults Customize the CodeBuild projects created for this pipeline. 
     */
    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.codeBuildDefaults(codeBuildDefaults.let(CodeBuildOptions.Companion::unwrap))
    }

    /**
     * Customize the CodeBuild projects created for this pipeline.
     *
     * Default: - All projects run non-privileged build, SMALL instance,
     * LinuxBuildImage.STANDARD_7_0
     *
     * @param codeBuildDefaults Customize the CodeBuild projects created for this pipeline. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92416628ee0d4ef7efc74754c30fcf9c872c992904f5b1db3c94b24ca77cd7ed")
    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit): Unit =
        codeBuildDefaults(CodeBuildOptions(codeBuildDefaults))

    /**
     * An existing Pipeline to be reused and built upon.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - a new underlying pipeline is created.
     *
     * @param codePipeline An existing Pipeline to be reused and built upon. 
     */
    override fun codePipeline(codePipeline: Pipeline) {
      cdkBuilder.codePipeline(codePipeline.let(Pipeline.Companion::unwrap))
    }

    /**
     * Create KMS keys for the artifact buckets, allowing cross-account deployments.
     *
     * The artifact buckets have to be encrypted to support deploying CDK apps to
     * another account, so if you want to do that or want to have your artifact
     * buckets encrypted, be sure to set this value to `true`.
     *
     * Be aware there is a cost associated with maintaining the KMS keys.
     *
     * Default: false
     *
     * @param crossAccountKeys Create KMS keys for the artifact buckets, allowing cross-account
     * deployments. 
     */
    override fun crossAccountKeys(crossAccountKeys: Boolean) {
      cdkBuilder.crossAccountKeys(crossAccountKeys)
    }

    /**
     * A map of region to S3 bucket name used for cross-region CodePipeline.
     *
     * For every Action that you specify targeting a different region than the Pipeline itself,
     * if you don't provide an explicit Bucket for that region using this property,
     * the construct will automatically create a Stack containing an S3 Bucket in that region.
     * Passed directly through to the [cp.Pipeline].
     *
     * Default: - no cross region replication buckets.
     *
     * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
     * CodePipeline. 
     */
    override
        fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
      cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets.mapValues{IBucket.unwrap(it.value)})
    }

    /**
     * A list of credentials used to authenticate to Docker registries.
     *
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     *
     * Default: []
     *
     * @param dockerCredentials A list of credentials used to authenticate to Docker registries. 
     */
    override fun dockerCredentials(dockerCredentials: List<DockerCredential>) {
      cdkBuilder.dockerCredentials(dockerCredentials.map(DockerCredential.Companion::unwrap))
    }

    /**
     * A list of credentials used to authenticate to Docker registries.
     *
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     *
     * Default: []
     *
     * @param dockerCredentials A list of credentials used to authenticate to Docker registries. 
     */
    override fun dockerCredentials(vararg dockerCredentials: DockerCredential): Unit =
        dockerCredentials(dockerCredentials.toList())

    /**
     * Enable Docker for the self-mutate step.
     *
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
     *
     * Default: false
     *
     * @param dockerEnabledForSelfMutation Enable Docker for the self-mutate step. 
     */
    override fun dockerEnabledForSelfMutation(dockerEnabledForSelfMutation: Boolean) {
      cdkBuilder.dockerEnabledForSelfMutation(dockerEnabledForSelfMutation)
    }

    /**
     * Enable Docker for the 'synth' step.
     *
     * Set this to true if you are using file assets that require
     * "bundling" anywhere in your application (meaning an asset
     * compilation step will be run with the tools provided by
     * a Docker image), both for the Pipeline stack as well as the
     * application stacks.
     *
     * A common way to use bundling assets in your application is by
     * using the `aws-cdk-lib/aws-lambda-nodejs` library.
     *
     * Configures privileged mode for the synth CodeBuild action.
     *
     * If you are about to turn this on in an already-deployed Pipeline,
     * set the value to `true` first, commit and allow the pipeline to
     * self-update, and only then use the bundled asset.
     *
     * Default: false
     *
     * @param dockerEnabledForSynth Enable Docker for the 'synth' step. 
     */
    override fun dockerEnabledForSynth(dockerEnabledForSynth: Boolean) {
      cdkBuilder.dockerEnabledForSynth(dockerEnabledForSynth)
    }

    /**
     * Enable KMS key rotation for the generated KMS keys.
     *
     * By default KMS key rotation is disabled, but will add
     * additional costs when enabled.
     *
     * Default: - false (key rotation is disabled)
     *
     * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys. 
     */
    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    /**
     * The name of the CodePipeline pipeline.
     *
     * Default: - Automatically generated
     *
     * @param pipelineName The name of the CodePipeline pipeline. 
     */
    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * Type of the pipeline.
     *
     * Default: - PipelineType.V2 if the feature flag `CODEPIPELINE_DEFAULT_PIPELINE_TYPE_TO_V2`
     * is true, PipelineType.V1 otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
     * @param pipelineType Type of the pipeline. 
     */
    override fun pipelineType(pipelineType: PipelineType) {
      cdkBuilder.pipelineType(pipelineType.let(PipelineType.Companion::unwrap))
    }

    /**
     * Publish assets in multiple CodeBuild projects.
     *
     * If set to false, use one Project per type to publish all assets.
     *
     * Publishing in parallel improves concurrency and may reduce publishing
     * latency, but may also increase overall provisioning time of the CodeBuild
     * projects.
     *
     * Experiment and see what value works best for you.
     *
     * Default: true
     *
     * @param publishAssetsInParallel Publish assets in multiple CodeBuild projects. 
     */
    override fun publishAssetsInParallel(publishAssetsInParallel: Boolean) {
      cdkBuilder.publishAssetsInParallel(publishAssetsInParallel)
    }

    /**
     * Reuse the same cross region support stack for all pipelines in the App.
     *
     * Default: - true (Use the same support stack for all pipelines in App)
     *
     * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
     * pipelines in the App. 
     */
    override fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
      cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
    }

    /**
     * The IAM role to be assumed by this Pipeline.
     *
     * Default: - A new role is created
     *
     * @param role The IAM role to be assumed by this Pipeline. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * Whether the pipeline will update itself.
     *
     * This needs to be set to `true` to allow the pipeline to reconfigure
     * itself when assets or stages are being added to it, and `true` is the
     * recommended setting.
     *
     * You can temporarily set this to `false` while you are iterating
     * on the pipeline itself and prefer to deploy changes using `cdk deploy`.
     *
     * Default: true
     *
     * @param selfMutation Whether the pipeline will update itself. 
     */
    override fun selfMutation(selfMutation: Boolean) {
      cdkBuilder.selfMutation(selfMutation)
    }

    /**
     * Additional customizations to apply to the self mutation CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param selfMutationCodeBuildDefaults Additional customizations to apply to the self mutation
     * CodeBuild projects. 
     */
    override fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults.let(CodeBuildOptions.Companion::unwrap))
    }

    /**
     * Additional customizations to apply to the self mutation CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param selfMutationCodeBuildDefaults Additional customizations to apply to the self mutation
     * CodeBuild projects. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2790694c1a1ce1299e7bfb748866e114b8b330eb250494bb1b607438cedb87c")
    override
        fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = selfMutationCodeBuildDefaults(CodeBuildOptions(selfMutationCodeBuildDefaults))

    /**
     * The build step that produces the CDK Cloud Assembly.
     *
     * The primary output of this step needs to be the `cdk.out` directory
     * generated by the `cdk synth` command.
     *
     * If you use a `ShellStep` here and you don't configure an output directory,
     * the output directory will automatically be assumed to be `cdk.out`.
     *
     * @param synth The build step that produces the CDK Cloud Assembly. 
     */
    override fun synth(synth: IFileSetProducer) {
      cdkBuilder.synth(synth.let(IFileSetProducer.Companion::unwrap))
    }

    /**
     * Additional customizations to apply to the synthesize CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param synthCodeBuildDefaults Additional customizations to apply to the synthesize CodeBuild
     * projects. 
     */
    override fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.synthCodeBuildDefaults(synthCodeBuildDefaults.let(CodeBuildOptions.Companion::unwrap))
    }

    /**
     * Additional customizations to apply to the synthesize CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     *
     * @param synthCodeBuildDefaults Additional customizations to apply to the synthesize CodeBuild
     * projects. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ca7d4625a6b01d9bbb45d464baf8d48c59aaca88a925ec8b7f0ee11d400412d")
    override
        fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = synthCodeBuildDefaults(CodeBuildOptions(synthCodeBuildDefaults))

    /**
     * Deploy every stack by creating a change set and executing it.
     *
     * When enabled, creates a "Prepare" and "Execute" action for each stack. Disable
     * to deploy the stack in one pipeline action.
     *
     * Default: true
     *
     * @param useChangeSets Deploy every stack by creating a change set and executing it. 
     */
    override fun useChangeSets(useChangeSets: Boolean) {
      cdkBuilder.useChangeSets(useChangeSets)
    }

    /**
     * Use pipeline service role for actions if no action role configured.
     *
     * Default: - false
     *
     * @param usePipelineRoleForActions Use pipeline service role for actions if no action role
     * configured. 
     */
    override fun usePipelineRoleForActions(usePipelineRoleForActions: Boolean) {
      cdkBuilder.usePipelineRoleForActions(usePipelineRoleForActions)
    }

    public fun build(): software.amazon.awscdk.pipelines.CodePipeline = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CodePipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CodePipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodePipeline): CodePipeline =
        CodePipeline(cdkObject)

    internal fun unwrap(wrapped: CodePipeline): software.amazon.awscdk.pipelines.CodePipeline =
        wrapped.cdkObject as software.amazon.awscdk.pipelines.CodePipeline
  }
}
