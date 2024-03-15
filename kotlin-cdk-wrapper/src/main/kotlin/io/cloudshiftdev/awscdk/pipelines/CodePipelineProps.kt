@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Pipeline
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CodePipelineProps {
  public fun artifactBucket(): IBucket? = unwrap(this).getArtifactBucket()?.let(IBucket::wrap)

  public fun assetPublishingCodeBuildDefaults(): CodeBuildOptions? =
      unwrap(this).getAssetPublishingCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

  public fun cliVersion(): String? = unwrap(this).getCliVersion()

  public fun codeBuildDefaults(): CodeBuildOptions? =
      unwrap(this).getCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

  public fun codePipeline(): Pipeline? = unwrap(this).getCodePipeline()?.let(Pipeline::wrap)

  public fun crossAccountKeys(): Boolean? = unwrap(this).getCrossAccountKeys()

  public fun crossRegionReplicationBuckets(): Map<String, IBucket> =
      unwrap(this).getCrossRegionReplicationBuckets()?.mapValues{IBucket.wrap(it.value)} ?:
      emptyMap()

  public fun dockerCredentials(): List<DockerCredential> =
      unwrap(this).getDockerCredentials()?.map(DockerCredential::wrap) ?: emptyList()

  public fun dockerEnabledForSelfMutation(): Boolean? =
      unwrap(this).getDockerEnabledForSelfMutation()

  public fun dockerEnabledForSynth(): Boolean? = unwrap(this).getDockerEnabledForSynth()

  public fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

  public fun pipelineName(): String? = unwrap(this).getPipelineName()

  public fun publishAssetsInParallel(): Boolean? = unwrap(this).getPublishAssetsInParallel()

  public fun reuseCrossRegionSupportStacks(): Boolean? =
      unwrap(this).getReuseCrossRegionSupportStacks()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun selfMutation(): Boolean? = unwrap(this).getSelfMutation()

  public fun selfMutationCodeBuildDefaults(): CodeBuildOptions? =
      unwrap(this).getSelfMutationCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

  public fun synth(): IFileSetProducer

  public fun synthCodeBuildDefaults(): CodeBuildOptions? =
      unwrap(this).getSynthCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

  public fun useChangeSets(): Boolean? = unwrap(this).getUseChangeSets()

  @CdkDslMarker
  public interface Builder {
    public fun artifactBucket(artifactBucket: IBucket)

    public fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc05f6afad6c601bf72f5dfb08d0f9bcce02e0e1c39024a05149d1944b5769f6")
    public
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    public fun cliVersion(cliVersion: String)

    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72a16a892580a6023335a12198c55152878f7e1c21c01c0d4f30f1606765def4")
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    public fun codePipeline(codePipeline: Pipeline)

    public fun crossAccountKeys(crossAccountKeys: Boolean)

    public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>)

    public fun dockerCredentials(dockerCredentials: List<DockerCredential>)

    public fun dockerCredentials(vararg dockerCredentials: DockerCredential)

    public fun dockerEnabledForSelfMutation(dockerEnabledForSelfMutation: Boolean)

    public fun dockerEnabledForSynth(dockerEnabledForSynth: Boolean)

    public fun enableKeyRotation(enableKeyRotation: Boolean)

    public fun pipelineName(pipelineName: String)

    public fun publishAssetsInParallel(publishAssetsInParallel: Boolean)

    public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean)

    public fun role(role: IRole)

    public fun selfMutation(selfMutation: Boolean)

    public fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53e8ce8e34a14870a2d83d8e6b90ec087697b2552f308de61e98a40ac27359b9")
    public
        fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    public fun synth(synth: IFileSetProducer)

    public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bbe6a41d04e977e91b23a5362c5d507ae739c7980b32ac861664abcc5ebc31d")
    public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    public fun useChangeSets(useChangeSets: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodePipelineProps.Builder =
        software.amazon.awscdk.pipelines.CodePipelineProps.builder()

    override fun artifactBucket(artifactBucket: IBucket) {
      cdkBuilder.artifactBucket(artifactBucket.let(IBucket::unwrap))
    }

    override
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc05f6afad6c601bf72f5dfb08d0f9bcce02e0e1c39024a05149d1944b5769f6")
    override
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = assetPublishingCodeBuildDefaults(CodeBuildOptions(assetPublishingCodeBuildDefaults))

    override fun cliVersion(cliVersion: String) {
      cdkBuilder.cliVersion(cliVersion)
    }

    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.codeBuildDefaults(codeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72a16a892580a6023335a12198c55152878f7e1c21c01c0d4f30f1606765def4")
    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit): Unit =
        codeBuildDefaults(CodeBuildOptions(codeBuildDefaults))

    override fun codePipeline(codePipeline: Pipeline) {
      cdkBuilder.codePipeline(codePipeline.let(Pipeline::unwrap))
    }

    override fun crossAccountKeys(crossAccountKeys: Boolean) {
      cdkBuilder.crossAccountKeys(crossAccountKeys)
    }

    override
        fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
      cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets.mapValues{IBucket.unwrap(it.value)})
    }

    override fun dockerCredentials(dockerCredentials: List<DockerCredential>) {
      cdkBuilder.dockerCredentials(dockerCredentials.map(DockerCredential::unwrap))
    }

    override fun dockerCredentials(vararg dockerCredentials: DockerCredential): Unit =
        dockerCredentials(dockerCredentials.toList())

    override fun dockerEnabledForSelfMutation(dockerEnabledForSelfMutation: Boolean) {
      cdkBuilder.dockerEnabledForSelfMutation(dockerEnabledForSelfMutation)
    }

    override fun dockerEnabledForSynth(dockerEnabledForSynth: Boolean) {
      cdkBuilder.dockerEnabledForSynth(dockerEnabledForSynth)
    }

    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    override fun publishAssetsInParallel(publishAssetsInParallel: Boolean) {
      cdkBuilder.publishAssetsInParallel(publishAssetsInParallel)
    }

    override fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
      cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun selfMutation(selfMutation: Boolean) {
      cdkBuilder.selfMutation(selfMutation)
    }

    override fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53e8ce8e34a14870a2d83d8e6b90ec087697b2552f308de61e98a40ac27359b9")
    override
        fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = selfMutationCodeBuildDefaults(CodeBuildOptions(selfMutationCodeBuildDefaults))

    override fun synth(synth: IFileSetProducer) {
      cdkBuilder.synth(synth.let(IFileSetProducer::unwrap))
    }

    override fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.synthCodeBuildDefaults(synthCodeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bbe6a41d04e977e91b23a5362c5d507ae739c7980b32ac861664abcc5ebc31d")
    override
        fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = synthCodeBuildDefaults(CodeBuildOptions(synthCodeBuildDefaults))

    override fun useChangeSets(useChangeSets: Boolean) {
      cdkBuilder.useChangeSets(useChangeSets)
    }

    public fun build(): software.amazon.awscdk.pipelines.CodePipelineProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.CodePipelineProps,
  ) : CdkObject(cdkObject), CodePipelineProps {
    override fun artifactBucket(): IBucket? = unwrap(this).getArtifactBucket()?.let(IBucket::wrap)

    override fun assetPublishingCodeBuildDefaults(): CodeBuildOptions? =
        unwrap(this).getAssetPublishingCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

    override fun cliVersion(): String? = unwrap(this).getCliVersion()

    override fun codeBuildDefaults(): CodeBuildOptions? =
        unwrap(this).getCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

    override fun codePipeline(): Pipeline? = unwrap(this).getCodePipeline()?.let(Pipeline::wrap)

    override fun crossAccountKeys(): Boolean? = unwrap(this).getCrossAccountKeys()

    override fun crossRegionReplicationBuckets(): Map<String, IBucket> =
        unwrap(this).getCrossRegionReplicationBuckets()?.mapValues{IBucket.wrap(it.value)} ?:
        emptyMap()

    override fun dockerCredentials(): List<DockerCredential> =
        unwrap(this).getDockerCredentials()?.map(DockerCredential::wrap) ?: emptyList()

    override fun dockerEnabledForSelfMutation(): Boolean? =
        unwrap(this).getDockerEnabledForSelfMutation()

    override fun dockerEnabledForSynth(): Boolean? = unwrap(this).getDockerEnabledForSynth()

    override fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

    override fun pipelineName(): String? = unwrap(this).getPipelineName()

    override fun publishAssetsInParallel(): Boolean? = unwrap(this).getPublishAssetsInParallel()

    override fun reuseCrossRegionSupportStacks(): Boolean? =
        unwrap(this).getReuseCrossRegionSupportStacks()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun selfMutation(): Boolean? = unwrap(this).getSelfMutation()

    override fun selfMutationCodeBuildDefaults(): CodeBuildOptions? =
        unwrap(this).getSelfMutationCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

    override fun synth(): IFileSetProducer = unwrap(this).getSynth().let(IFileSetProducer::wrap)

    override fun synthCodeBuildDefaults(): CodeBuildOptions? =
        unwrap(this).getSynthCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

    override fun useChangeSets(): Boolean? = unwrap(this).getUseChangeSets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodePipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodePipelineProps):
        CodePipelineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodePipelineProps):
        software.amazon.awscdk.pipelines.CodePipelineProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.CodePipelineProps
  }
}
