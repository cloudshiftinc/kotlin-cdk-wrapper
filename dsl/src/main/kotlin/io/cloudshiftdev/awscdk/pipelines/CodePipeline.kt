package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.services.codebuild.IProject
import io.cloudshiftdev.awscdk.services.codepipeline.Pipeline
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CodePipeline internal constructor(
  private val cdkObject: software.amazon.awscdk.pipelines.CodePipeline,
) : PipelineBase(cdkObject) {
  public open fun pipeline(): Pipeline = unwrap(this).getPipeline().let(Pipeline::wrap)

  public open fun selfMutationEnabled(): Boolean = unwrap(this).getSelfMutationEnabled()

  public open fun selfMutationProject(): IProject =
      unwrap(this).getSelfMutationProject().let(IProject::wrap)

  public open fun synthProject(): IProject = unwrap(this).getSynthProject().let(IProject::wrap)

  public interface Builder {
    public fun artifactBucket(artifactBucket: IBucket)

    public fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13976c16c7fda8250624b156d2574ea437cfda46a000cb44a752fa302b503f7e")
    public
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    public fun cliVersion(cliVersion: String)

    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92416628ee0d4ef7efc74754c30fcf9c872c992904f5b1db3c94b24ca77cd7ed")
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    public fun codePipeline(codePipeline: Pipeline)

    public fun crossAccountKeys(crossAccountKeys: Boolean)

    public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>)

    public fun dockerCredentials(dockerCredentials: List<DockerCredential>)

    public fun dockerEnabledForSelfMutation(dockerEnabledForSelfMutation: Boolean)

    public fun dockerEnabledForSynth(dockerEnabledForSynth: Boolean)

    public fun enableKeyRotation(enableKeyRotation: Boolean)

    public fun pipelineName(pipelineName: String)

    public fun publishAssetsInParallel(publishAssetsInParallel: Boolean)

    public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean)

    public fun role(role: IRole)

    public fun selfMutation(selfMutation: Boolean)

    public fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2790694c1a1ce1299e7bfb748866e114b8b330eb250494bb1b607438cedb87c")
    public
        fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    public fun synth(synth: IFileSetProducer)

    public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ca7d4625a6b01d9bbb45d464baf8d48c59aaca88a925ec8b7f0ee11d400412d")
    public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    public fun useChangeSets(useChangeSets: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodePipeline.Builder =
        software.amazon.awscdk.pipelines.CodePipeline.Builder.create(scope, id)

    override fun artifactBucket(artifactBucket: IBucket) {
      cdkBuilder.artifactBucket(artifactBucket.let(IBucket::unwrap))
    }

    override
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13976c16c7fda8250624b156d2574ea437cfda46a000cb44a752fa302b503f7e")
    override
        fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = assetPublishingCodeBuildDefaults(CodeBuildOptions(assetPublishingCodeBuildDefaults))

    override fun cliVersion(cliVersion: String) {
      cdkBuilder.cliVersion(cliVersion)
    }

    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.codeBuildDefaults(codeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92416628ee0d4ef7efc74754c30fcf9c872c992904f5b1db3c94b24ca77cd7ed")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2790694c1a1ce1299e7bfb748866e114b8b330eb250494bb1b607438cedb87c")
    override
        fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = selfMutationCodeBuildDefaults(CodeBuildOptions(selfMutationCodeBuildDefaults))

    override fun synth(synth: IFileSetProducer) {
      cdkBuilder.synth(synth.let(IFileSetProducer::unwrap))
    }

    override fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.synthCodeBuildDefaults(synthCodeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ca7d4625a6b01d9bbb45d464baf8d48c59aaca88a925ec8b7f0ee11d400412d")
    override
        fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions.Builder.() -> Unit):
        Unit = synthCodeBuildDefaults(CodeBuildOptions(synthCodeBuildDefaults))

    override fun useChangeSets(useChangeSets: Boolean) {
      cdkBuilder.useChangeSets(useChangeSets)
    }

    public fun build(): software.amazon.awscdk.pipelines.CodePipeline = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        wrapped.cdkObject
  }
}
