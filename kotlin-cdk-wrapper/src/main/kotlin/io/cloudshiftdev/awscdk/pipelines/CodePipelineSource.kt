@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.IStage
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.codecommit.IRepository as CodecommitIRepository
import io.cloudshiftdev.awscdk.services.ecr.IRepository as EcrIRepository

public abstract class CodePipelineSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.CodePipelineSource,
) : Step(cdkObject), ICodePipelineActionFactory {
  public override fun isSource(): Boolean = unwrap(this).getIsSource()

  public override fun produceAction(stage: IStage, options: ProduceActionOptions):
      CodePipelineActionFactoryResult = unwrap(this).produceAction(stage.let(IStage::unwrap),
      options.let(ProduceActionOptions::unwrap)).let(CodePipelineActionFactoryResult::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ee07f43e69cfd8f0f23331f5dcd6cba92444f51437e346ca00f2e5d5a3e0c72e")
  public override fun produceAction(stage: IStage,
      options: ProduceActionOptions.Builder.() -> Unit): CodePipelineActionFactoryResult =
      produceAction(stage, ProduceActionOptions(options))

  public open fun sourceAttribute(name: String): String = unwrap(this).sourceAttribute(name)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.CodePipelineSource,
  ) : CodePipelineSource(cdkObject)

  public companion object {
    public fun codeCommit(repository: CodecommitIRepository, branch: String): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.codeCommit(repository.let(CodecommitIRepository::unwrap),
        branch).let(CodePipelineSource::wrap)

    public fun codeCommit(
      repository: CodecommitIRepository,
      branch: String,
      props: CodeCommitSourceOptions,
    ): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.codeCommit(repository.let(CodecommitIRepository::unwrap),
        branch, props.let(CodeCommitSourceOptions::unwrap)).let(CodePipelineSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af766cc78b4989737e7a0748a86396b6d0feecd91e635d9024e467a20eb6e5d5")
    public fun codeCommit(
      repository: CodecommitIRepository,
      branch: String,
      props: CodeCommitSourceOptions.Builder.() -> Unit,
    ): CodePipelineSource = codeCommit(repository, branch, CodeCommitSourceOptions(props))

    public fun connection(
      repoString: String,
      branch: String,
      props: ConnectionSourceOptions,
    ): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.connection(repoString, branch,
        props.let(ConnectionSourceOptions::unwrap)).let(CodePipelineSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9d603211ea17d7161ac0aa7e5e9b76bd7f0c848fd45ed175ffc808ae018c0a")
    public fun connection(
      repoString: String,
      branch: String,
      props: ConnectionSourceOptions.Builder.() -> Unit,
    ): CodePipelineSource = connection(repoString, branch, ConnectionSourceOptions(props))

    public fun ecr(repository: EcrIRepository): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.ecr(repository.let(EcrIRepository::unwrap)).let(CodePipelineSource::wrap)

    public fun ecr(repository: EcrIRepository, props: ECRSourceOptions): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.ecr(repository.let(EcrIRepository::unwrap),
        props.let(ECRSourceOptions::unwrap)).let(CodePipelineSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e96ebb53741ce049114cc3f224c00542e157bc674aeec23d21a068801a5b1047")
    public fun ecr(repository: EcrIRepository, props: ECRSourceOptions.Builder.() -> Unit):
        CodePipelineSource = ecr(repository, ECRSourceOptions(props))

    public fun gitHub(repoString: String, branch: String): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.gitHub(repoString,
        branch).let(CodePipelineSource::wrap)

    public fun gitHub(
      repoString: String,
      branch: String,
      props: GitHubSourceOptions,
    ): CodePipelineSource = software.amazon.awscdk.pipelines.CodePipelineSource.gitHub(repoString,
        branch, props.let(GitHubSourceOptions::unwrap)).let(CodePipelineSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f1315f192fa22819e71af0bc232ab9d6d3372a72870eae7481282a60759b0a3")
    public fun gitHub(
      repoString: String,
      branch: String,
      props: GitHubSourceOptions.Builder.() -> Unit,
    ): CodePipelineSource = gitHub(repoString, branch, GitHubSourceOptions(props))

    public fun s3(bucket: IBucket, objectKey: String): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.s3(bucket.let(IBucket::unwrap),
        objectKey).let(CodePipelineSource::wrap)

    public fun s3(
      bucket: IBucket,
      objectKey: String,
      props: S3SourceOptions,
    ): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.s3(bucket.let(IBucket::unwrap),
        objectKey, props.let(S3SourceOptions::unwrap)).let(CodePipelineSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90bdea80b77e041a7961236f18ef831546681ec35644e5142c997418bb03b174")
    public fun s3(
      bucket: IBucket,
      objectKey: String,
      props: S3SourceOptions.Builder.() -> Unit,
    ): CodePipelineSource = s3(bucket, objectKey, S3SourceOptions(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodePipelineSource):
        CodePipelineSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodePipelineSource):
        software.amazon.awscdk.pipelines.CodePipelineSource = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.CodePipelineSource
  }
}
