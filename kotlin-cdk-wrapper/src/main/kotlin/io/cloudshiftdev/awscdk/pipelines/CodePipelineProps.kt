@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Pipeline
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for a `CodePipeline`.
 *
 * Example:
 *
 * ```
 * // Modern API
 * CodePipeline modernPipeline = CodePipeline.Builder.create(this, "Pipeline")
 * .selfMutation(false)
 * .synth(ShellStep.Builder.create("Synth")
 * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
 * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
 * .build()))
 * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
 * .build())
 * .build();
 * // Original API
 * Artifact cloudAssemblyArtifact = new Artifact();
 * CdkPipeline originalPipeline = new CdkPipeline(this, "Pipeline", new CdkPipelineProps()
 * .selfMutating(false)
 * .cloudAssemblyArtifact(cloudAssemblyArtifact)
 * );
 * ```
 */
public interface CodePipelineProps {
  /**
   * An existing S3 Bucket to use for storing the pipeline's artifact.
   *
   * Default: - A new S3 bucket will be created.
   */
  public fun artifactBucket(): IBucket? = unwrap(this).getArtifactBucket()?.let(IBucket::wrap)

  /**
   * Additional customizations to apply to the asset publishing CodeBuild projects.
   *
   * Default: - Only `codeBuildDefaults` are applied
   */
  public fun assetPublishingCodeBuildDefaults(): CodeBuildOptions? =
      unwrap(this).getAssetPublishingCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

  /**
   * CDK CLI version to use in self-mutation and asset publishing steps.
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
   */
  public fun cliVersion(): String? = unwrap(this).getCliVersion()

  /**
   * Customize the CodeBuild projects created for this pipeline.
   *
   * Default: - All projects run non-privileged build, SMALL instance, LinuxBuildImage.STANDARD_7_0
   */
  public fun codeBuildDefaults(): CodeBuildOptions? =
      unwrap(this).getCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

  /**
   * An existing Pipeline to be reused and built upon.
   *
   * [disable-awslint:ref-via-interface]
   *
   * Default: - a new underlying pipeline is created.
   */
  public fun codePipeline(): Pipeline? = unwrap(this).getCodePipeline()?.let(Pipeline::wrap)

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
   */
  public fun crossAccountKeys(): Boolean? = unwrap(this).getCrossAccountKeys()

  /**
   * A map of region to S3 bucket name used for cross-region CodePipeline.
   *
   * For every Action that you specify targeting a different region than the Pipeline itself,
   * if you don't provide an explicit Bucket for that region using this property,
   * the construct will automatically create a Stack containing an S3 Bucket in that region.
   * Passed directly through to the [cp.Pipeline].
   *
   * Default: - no cross region replication buckets.
   */
  public fun crossRegionReplicationBuckets(): Map<String, IBucket> =
      unwrap(this).getCrossRegionReplicationBuckets()?.mapValues{IBucket.wrap(it.value)} ?:
      emptyMap()

  /**
   * A list of credentials used to authenticate to Docker registries.
   *
   * Specify any credentials necessary within the pipeline to build, synth, update, or publish
   * assets.
   *
   * Default: []
   */
  public fun dockerCredentials(): List<DockerCredential> =
      unwrap(this).getDockerCredentials()?.map(DockerCredential::wrap) ?: emptyList()

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
   */
  public fun dockerEnabledForSelfMutation(): Boolean? =
      unwrap(this).getDockerEnabledForSelfMutation()

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
   */
  public fun dockerEnabledForSynth(): Boolean? = unwrap(this).getDockerEnabledForSynth()

  /**
   * Enable KMS key rotation for the generated KMS keys.
   *
   * By default KMS key rotation is disabled, but will add
   * additional costs when enabled.
   *
   * Default: - false (key rotation is disabled)
   */
  public fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

  /**
   * The name of the CodePipeline pipeline.
   *
   * Default: - Automatically generated
   */
  public fun pipelineName(): String? = unwrap(this).getPipelineName()

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
   */
  public fun publishAssetsInParallel(): Boolean? = unwrap(this).getPublishAssetsInParallel()

  /**
   * Reuse the same cross region support stack for all pipelines in the App.
   *
   * Default: - true (Use the same support stack for all pipelines in App)
   */
  public fun reuseCrossRegionSupportStacks(): Boolean? =
      unwrap(this).getReuseCrossRegionSupportStacks()

  /**
   * The IAM role to be assumed by this Pipeline.
   *
   * Default: - A new role is created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

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
   */
  public fun selfMutation(): Boolean? = unwrap(this).getSelfMutation()

  /**
   * Additional customizations to apply to the self mutation CodeBuild projects.
   *
   * Default: - Only `codeBuildDefaults` are applied
   */
  public fun selfMutationCodeBuildDefaults(): CodeBuildOptions? =
      unwrap(this).getSelfMutationCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

  /**
   * The build step that produces the CDK Cloud Assembly.
   *
   * The primary output of this step needs to be the `cdk.out` directory
   * generated by the `cdk synth` command.
   *
   * If you use a `ShellStep` here and you don't configure an output directory,
   * the output directory will automatically be assumed to be `cdk.out`.
   */
  public fun synth(): IFileSetProducer

  /**
   * Additional customizations to apply to the synthesize CodeBuild projects.
   *
   * Default: - Only `codeBuildDefaults` are applied
   */
  public fun synthCodeBuildDefaults(): CodeBuildOptions? =
      unwrap(this).getSynthCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

  /**
   * Deploy every stack by creating a change set and executing it.
   *
   * When enabled, creates a "Prepare" and "Execute" action for each stack. Disable
   * to deploy the stack in one pipeline action.
   *
   * Default: true
   */
  public fun useChangeSets(): Boolean? = unwrap(this).getUseChangeSets()

  /**
   * A builder for [CodePipelineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifactBucket An existing S3 Bucket to use for storing the pipeline's artifact.
     */
    public fun artifactBucket(artifactBucket: IBucket)

    /**
     * @param assetPublishingCodeBuildDefaults Additional customizations to apply to the asset
     * publishing CodeBuild projects.
     */
    public fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions)

    /**
     * @param assetPublishingCodeBuildDefaults Additional customizations to apply to the asset
     * publishing CodeBuild projects.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc05f6afad6c601bf72f5dfb08d0f9bcce02e0e1c39024a05149d1944b5769f6")
    public
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

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
    public fun cliVersion(cliVersion: String)

    /**
     * @param codeBuildDefaults Customize the CodeBuild projects created for this pipeline.
     */
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions)

    /**
     * @param codeBuildDefaults Customize the CodeBuild projects created for this pipeline.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72a16a892580a6023335a12198c55152878f7e1c21c01c0d4f30f1606765def4")
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    /**
     * @param codePipeline An existing Pipeline to be reused and built upon.
     * [disable-awslint:ref-via-interface]
     */
    public fun codePipeline(codePipeline: Pipeline)

    /**
     * @param crossAccountKeys Create KMS keys for the artifact buckets, allowing cross-account
     * deployments.
     * The artifact buckets have to be encrypted to support deploying CDK apps to
     * another account, so if you want to do that or want to have your artifact
     * buckets encrypted, be sure to set this value to `true`.
     *
     * Be aware there is a cost associated with maintaining the KMS keys.
     */
    public fun crossAccountKeys(crossAccountKeys: Boolean)

    /**
     * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
     * CodePipeline.
     * For every Action that you specify targeting a different region than the Pipeline itself,
     * if you don't provide an explicit Bucket for that region using this property,
     * the construct will automatically create a Stack containing an S3 Bucket in that region.
     * Passed directly through to the [cp.Pipeline].
     */
    public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>)

    /**
     * @param dockerCredentials A list of credentials used to authenticate to Docker registries.
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     */
    public fun dockerCredentials(dockerCredentials: List<DockerCredential>)

    /**
     * @param dockerCredentials A list of credentials used to authenticate to Docker registries.
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     */
    public fun dockerCredentials(vararg dockerCredentials: DockerCredential)

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
    public fun dockerEnabledForSelfMutation(dockerEnabledForSelfMutation: Boolean)

    /**
     * @param dockerEnabledForSynth Enable Docker for the 'synth' step.
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
     */
    public fun dockerEnabledForSynth(dockerEnabledForSynth: Boolean)

    /**
     * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys.
     * By default KMS key rotation is disabled, but will add
     * additional costs when enabled.
     */
    public fun enableKeyRotation(enableKeyRotation: Boolean)

    /**
     * @param pipelineName The name of the CodePipeline pipeline.
     */
    public fun pipelineName(pipelineName: String)

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
    public fun publishAssetsInParallel(publishAssetsInParallel: Boolean)

    /**
     * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
     * pipelines in the App.
     */
    public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean)

    /**
     * @param role The IAM role to be assumed by this Pipeline.
     */
    public fun role(role: IRole)

    /**
     * @param selfMutation Whether the pipeline will update itself.
     * This needs to be set to `true` to allow the pipeline to reconfigure
     * itself when assets or stages are being added to it, and `true` is the
     * recommended setting.
     *
     * You can temporarily set this to `false` while you are iterating
     * on the pipeline itself and prefer to deploy changes using `cdk deploy`.
     */
    public fun selfMutation(selfMutation: Boolean)

    /**
     * @param selfMutationCodeBuildDefaults Additional customizations to apply to the self mutation
     * CodeBuild projects.
     */
    public fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions)

    /**
     * @param selfMutationCodeBuildDefaults Additional customizations to apply to the self mutation
     * CodeBuild projects.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53e8ce8e34a14870a2d83d8e6b90ec087697b2552f308de61e98a40ac27359b9")
    public
        fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    /**
     * @param synth The build step that produces the CDK Cloud Assembly. 
     * The primary output of this step needs to be the `cdk.out` directory
     * generated by the `cdk synth` command.
     *
     * If you use a `ShellStep` here and you don't configure an output directory,
     * the output directory will automatically be assumed to be `cdk.out`.
     */
    public fun synth(synth: IFileSetProducer)

    /**
     * @param synthCodeBuildDefaults Additional customizations to apply to the synthesize CodeBuild
     * projects.
     */
    public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions)

    /**
     * @param synthCodeBuildDefaults Additional customizations to apply to the synthesize CodeBuild
     * projects.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bbe6a41d04e977e91b23a5362c5d507ae739c7980b32ac861664abcc5ebc31d")
    public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    /**
     * @param useChangeSets Deploy every stack by creating a change set and executing it.
     * When enabled, creates a "Prepare" and "Execute" action for each stack. Disable
     * to deploy the stack in one pipeline action.
     */
    public fun useChangeSets(useChangeSets: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodePipelineProps.Builder =
        software.amazon.awscdk.pipelines.CodePipelineProps.builder()

    /**
     * @param artifactBucket An existing S3 Bucket to use for storing the pipeline's artifact.
     */
    override fun artifactBucket(artifactBucket: IBucket) {
      cdkBuilder.artifactBucket(artifactBucket.let(IBucket::unwrap))
    }

    /**
     * @param assetPublishingCodeBuildDefaults Additional customizations to apply to the asset
     * publishing CodeBuild projects.
     */
    override
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    /**
     * @param assetPublishingCodeBuildDefaults Additional customizations to apply to the asset
     * publishing CodeBuild projects.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc05f6afad6c601bf72f5dfb08d0f9bcce02e0e1c39024a05149d1944b5769f6")
    override
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = assetPublishingCodeBuildDefaults(CodeBuildOptions(assetPublishingCodeBuildDefaults))

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
    override fun cliVersion(cliVersion: String) {
      cdkBuilder.cliVersion(cliVersion)
    }

    /**
     * @param codeBuildDefaults Customize the CodeBuild projects created for this pipeline.
     */
    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.codeBuildDefaults(codeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    /**
     * @param codeBuildDefaults Customize the CodeBuild projects created for this pipeline.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72a16a892580a6023335a12198c55152878f7e1c21c01c0d4f30f1606765def4")
    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit): Unit =
        codeBuildDefaults(CodeBuildOptions(codeBuildDefaults))

    /**
     * @param codePipeline An existing Pipeline to be reused and built upon.
     * [disable-awslint:ref-via-interface]
     */
    override fun codePipeline(codePipeline: Pipeline) {
      cdkBuilder.codePipeline(codePipeline.let(Pipeline::unwrap))
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
    override fun crossAccountKeys(crossAccountKeys: Boolean) {
      cdkBuilder.crossAccountKeys(crossAccountKeys)
    }

    /**
     * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
     * CodePipeline.
     * For every Action that you specify targeting a different region than the Pipeline itself,
     * if you don't provide an explicit Bucket for that region using this property,
     * the construct will automatically create a Stack containing an S3 Bucket in that region.
     * Passed directly through to the [cp.Pipeline].
     */
    override
        fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
      cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets.mapValues{IBucket.unwrap(it.value)})
    }

    /**
     * @param dockerCredentials A list of credentials used to authenticate to Docker registries.
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     */
    override fun dockerCredentials(dockerCredentials: List<DockerCredential>) {
      cdkBuilder.dockerCredentials(dockerCredentials.map(DockerCredential::unwrap))
    }

    /**
     * @param dockerCredentials A list of credentials used to authenticate to Docker registries.
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     */
    override fun dockerCredentials(vararg dockerCredentials: DockerCredential): Unit =
        dockerCredentials(dockerCredentials.toList())

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
    override fun dockerEnabledForSelfMutation(dockerEnabledForSelfMutation: Boolean) {
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
     * using the `aws-cdk-lib/aws-lambda-nodejs` library.
     *
     * Configures privileged mode for the synth CodeBuild action.
     *
     * If you are about to turn this on in an already-deployed Pipeline,
     * set the value to `true` first, commit and allow the pipeline to
     * self-update, and only then use the bundled asset.
     */
    override fun dockerEnabledForSynth(dockerEnabledForSynth: Boolean) {
      cdkBuilder.dockerEnabledForSynth(dockerEnabledForSynth)
    }

    /**
     * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys.
     * By default KMS key rotation is disabled, but will add
     * additional costs when enabled.
     */
    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    /**
     * @param pipelineName The name of the CodePipeline pipeline.
     */
    override fun pipelineName(pipelineName: String) {
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
    override fun publishAssetsInParallel(publishAssetsInParallel: Boolean) {
      cdkBuilder.publishAssetsInParallel(publishAssetsInParallel)
    }

    /**
     * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
     * pipelines in the App.
     */
    override fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
      cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
    }

    /**
     * @param role The IAM role to be assumed by this Pipeline.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
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
    override fun selfMutation(selfMutation: Boolean) {
      cdkBuilder.selfMutation(selfMutation)
    }

    /**
     * @param selfMutationCodeBuildDefaults Additional customizations to apply to the self mutation
     * CodeBuild projects.
     */
    override fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    /**
     * @param selfMutationCodeBuildDefaults Additional customizations to apply to the self mutation
     * CodeBuild projects.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53e8ce8e34a14870a2d83d8e6b90ec087697b2552f308de61e98a40ac27359b9")
    override
        fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = selfMutationCodeBuildDefaults(CodeBuildOptions(selfMutationCodeBuildDefaults))

    /**
     * @param synth The build step that produces the CDK Cloud Assembly. 
     * The primary output of this step needs to be the `cdk.out` directory
     * generated by the `cdk synth` command.
     *
     * If you use a `ShellStep` here and you don't configure an output directory,
     * the output directory will automatically be assumed to be `cdk.out`.
     */
    override fun synth(synth: IFileSetProducer) {
      cdkBuilder.synth(synth.let(IFileSetProducer::unwrap))
    }

    /**
     * @param synthCodeBuildDefaults Additional customizations to apply to the synthesize CodeBuild
     * projects.
     */
    override fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.synthCodeBuildDefaults(synthCodeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    /**
     * @param synthCodeBuildDefaults Additional customizations to apply to the synthesize CodeBuild
     * projects.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bbe6a41d04e977e91b23a5362c5d507ae739c7980b32ac861664abcc5ebc31d")
    override
        fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = synthCodeBuildDefaults(CodeBuildOptions(synthCodeBuildDefaults))

    /**
     * @param useChangeSets Deploy every stack by creating a change set and executing it.
     * When enabled, creates a "Prepare" and "Execute" action for each stack. Disable
     * to deploy the stack in one pipeline action.
     */
    override fun useChangeSets(useChangeSets: Boolean) {
      cdkBuilder.useChangeSets(useChangeSets)
    }

    public fun build(): software.amazon.awscdk.pipelines.CodePipelineProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.CodePipelineProps,
  ) : CdkObject(cdkObject), CodePipelineProps {
    /**
     * An existing S3 Bucket to use for storing the pipeline's artifact.
     *
     * Default: - A new S3 bucket will be created.
     */
    override fun artifactBucket(): IBucket? = unwrap(this).getArtifactBucket()?.let(IBucket::wrap)

    /**
     * Additional customizations to apply to the asset publishing CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     */
    override fun assetPublishingCodeBuildDefaults(): CodeBuildOptions? =
        unwrap(this).getAssetPublishingCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

    /**
     * CDK CLI version to use in self-mutation and asset publishing steps.
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
     */
    override fun cliVersion(): String? = unwrap(this).getCliVersion()

    /**
     * Customize the CodeBuild projects created for this pipeline.
     *
     * Default: - All projects run non-privileged build, SMALL instance,
     * LinuxBuildImage.STANDARD_7_0
     */
    override fun codeBuildDefaults(): CodeBuildOptions? =
        unwrap(this).getCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

    /**
     * An existing Pipeline to be reused and built upon.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - a new underlying pipeline is created.
     */
    override fun codePipeline(): Pipeline? = unwrap(this).getCodePipeline()?.let(Pipeline::wrap)

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
     */
    override fun crossAccountKeys(): Boolean? = unwrap(this).getCrossAccountKeys()

    /**
     * A map of region to S3 bucket name used for cross-region CodePipeline.
     *
     * For every Action that you specify targeting a different region than the Pipeline itself,
     * if you don't provide an explicit Bucket for that region using this property,
     * the construct will automatically create a Stack containing an S3 Bucket in that region.
     * Passed directly through to the [cp.Pipeline].
     *
     * Default: - no cross region replication buckets.
     */
    override fun crossRegionReplicationBuckets(): Map<String, IBucket> =
        unwrap(this).getCrossRegionReplicationBuckets()?.mapValues{IBucket.wrap(it.value)} ?:
        emptyMap()

    /**
     * A list of credentials used to authenticate to Docker registries.
     *
     * Specify any credentials necessary within the pipeline to build, synth, update, or publish
     * assets.
     *
     * Default: []
     */
    override fun dockerCredentials(): List<DockerCredential> =
        unwrap(this).getDockerCredentials()?.map(DockerCredential::wrap) ?: emptyList()

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
     */
    override fun dockerEnabledForSelfMutation(): Boolean? =
        unwrap(this).getDockerEnabledForSelfMutation()

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
     */
    override fun dockerEnabledForSynth(): Boolean? = unwrap(this).getDockerEnabledForSynth()

    /**
     * Enable KMS key rotation for the generated KMS keys.
     *
     * By default KMS key rotation is disabled, but will add
     * additional costs when enabled.
     *
     * Default: - false (key rotation is disabled)
     */
    override fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

    /**
     * The name of the CodePipeline pipeline.
     *
     * Default: - Automatically generated
     */
    override fun pipelineName(): String? = unwrap(this).getPipelineName()

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
     */
    override fun publishAssetsInParallel(): Boolean? = unwrap(this).getPublishAssetsInParallel()

    /**
     * Reuse the same cross region support stack for all pipelines in the App.
     *
     * Default: - true (Use the same support stack for all pipelines in App)
     */
    override fun reuseCrossRegionSupportStacks(): Boolean? =
        unwrap(this).getReuseCrossRegionSupportStacks()

    /**
     * The IAM role to be assumed by this Pipeline.
     *
     * Default: - A new role is created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

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
     */
    override fun selfMutation(): Boolean? = unwrap(this).getSelfMutation()

    /**
     * Additional customizations to apply to the self mutation CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     */
    override fun selfMutationCodeBuildDefaults(): CodeBuildOptions? =
        unwrap(this).getSelfMutationCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

    /**
     * The build step that produces the CDK Cloud Assembly.
     *
     * The primary output of this step needs to be the `cdk.out` directory
     * generated by the `cdk synth` command.
     *
     * If you use a `ShellStep` here and you don't configure an output directory,
     * the output directory will automatically be assumed to be `cdk.out`.
     */
    override fun synth(): IFileSetProducer = unwrap(this).getSynth().let(IFileSetProducer::wrap)

    /**
     * Additional customizations to apply to the synthesize CodeBuild projects.
     *
     * Default: - Only `codeBuildDefaults` are applied
     */
    override fun synthCodeBuildDefaults(): CodeBuildOptions? =
        unwrap(this).getSynthCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

    /**
     * Deploy every stack by creating a change set and executing it.
     *
     * When enabled, creates a "Prepare" and "Execute" action for each stack. Disable
     * to deploy the stack in one pipeline action.
     *
     * Default: true
     */
    override fun useChangeSets(): Boolean? = unwrap(this).getUseChangeSets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodePipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodePipelineProps):
        CodePipelineProps = CdkObjectWrappers.wrap(cdkObject) as? CodePipelineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodePipelineProps):
        software.amazon.awscdk.pipelines.CodePipelineProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.CodePipelineProps
  }
}
