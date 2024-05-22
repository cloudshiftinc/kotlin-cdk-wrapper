@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.IStage
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.codecommit.IRepository as CodecommitIRepository
import io.cloudshiftdev.awscdk.services.ecr.IRepository as EcrIRepository

/**
 * Factory for CodePipeline source steps.
 *
 * This class contains a number of factory methods for the different types
 * of sources that CodePipeline supports.
 *
 * Example:
 *
 * ```
 * // Access the CommitId of a GitHub source in the synth
 * CodePipelineSource source = CodePipelineSource.gitHub("owner/repo", "main");
 * CodePipeline pipeline = CodePipeline.Builder.create(scope, "MyPipeline")
 * .synth(ShellStep.Builder.create("Synth")
 * .input(source)
 * .commands(List.of())
 * .env(Map.of(
 * "COMMIT_ID", source.sourceAttribute("CommitId")))
 * .build())
 * .build();
 * ```
 */
public abstract class CodePipelineSource(
  cdkObject: software.amazon.awscdk.pipelines.CodePipelineSource,
) : Step(cdkObject), ICodePipelineActionFactory {
  /**
   * Whether or not this is a Source step.
   *
   * What it means to be a Source step depends on the engine.
   */
  public override fun isSource(): Boolean = unwrap(this).getIsSource()

  /**
   * Create the desired Action and add it to the pipeline.
   *
   * @param stage 
   * @param options 
   */
  public override fun produceAction(stage: IStage, options: ProduceActionOptions):
      CodePipelineActionFactoryResult =
      unwrap(this).produceAction(stage.let(IStage.Companion::unwrap),
      options.let(ProduceActionOptions.Companion::unwrap)).let(CodePipelineActionFactoryResult::wrap)

  /**
   * Create the desired Action and add it to the pipeline.
   *
   * @param stage 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ee07f43e69cfd8f0f23331f5dcd6cba92444f51437e346ca00f2e5d5a3e0c72e")
  public override fun produceAction(stage: IStage,
      options: ProduceActionOptions.Builder.() -> Unit): CodePipelineActionFactoryResult =
      produceAction(stage, ProduceActionOptions(options))

  /**
   * Return an attribute of the current source revision.
   *
   * These values can be passed into the environment variables of pipeline steps,
   * so your steps can access information about the source revision.
   *
   * Pipeline synth step has some source attributes predefined in the environment.
   * If these suffice, you don't need to use this method for the synth step.
   *
   * Example:
   *
   * ```
   * // Access the CommitId of a GitHub source in the synth
   * CodePipelineSource source = CodePipelineSource.gitHub("owner/repo", "main");
   * CodePipeline pipeline = CodePipeline.Builder.create(scope, "MyPipeline")
   * .synth(ShellStep.Builder.create("Synth")
   * .input(source)
   * .commands(List.of())
   * .env(Map.of(
   * "COMMIT_ID", source.sourceAttribute("CommitId")))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-variables.html#reference-variables-list)
   * @param name 
   */
  public open fun sourceAttribute(name: String): String = unwrap(this).sourceAttribute(name)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.CodePipelineSource,
  ) : CodePipelineSource(cdkObject)

  public companion object {
    public fun codeCommit(repository: CodecommitIRepository, branch: String): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.codeCommit(repository.let(CodecommitIRepository.Companion::unwrap),
        branch).let(CodePipelineSource::wrap)

    public fun codeCommit(
      repository: CodecommitIRepository,
      branch: String,
      props: CodeCommitSourceOptions,
    ): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.codeCommit(repository.let(CodecommitIRepository.Companion::unwrap),
        branch, props.let(CodeCommitSourceOptions.Companion::unwrap)).let(CodePipelineSource::wrap)

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
        props.let(ConnectionSourceOptions.Companion::unwrap)).let(CodePipelineSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9d603211ea17d7161ac0aa7e5e9b76bd7f0c848fd45ed175ffc808ae018c0a")
    public fun connection(
      repoString: String,
      branch: String,
      props: ConnectionSourceOptions.Builder.() -> Unit,
    ): CodePipelineSource = connection(repoString, branch, ConnectionSourceOptions(props))

    public fun ecr(repository: EcrIRepository): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.ecr(repository.let(EcrIRepository.Companion::unwrap)).let(CodePipelineSource::wrap)

    public fun ecr(repository: EcrIRepository, props: ECRSourceOptions): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.ecr(repository.let(EcrIRepository.Companion::unwrap),
        props.let(ECRSourceOptions.Companion::unwrap)).let(CodePipelineSource::wrap)

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
        branch, props.let(GitHubSourceOptions.Companion::unwrap)).let(CodePipelineSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f1315f192fa22819e71af0bc232ab9d6d3372a72870eae7481282a60759b0a3")
    public fun gitHub(
      repoString: String,
      branch: String,
      props: GitHubSourceOptions.Builder.() -> Unit,
    ): CodePipelineSource = gitHub(repoString, branch, GitHubSourceOptions(props))

    public fun s3(bucket: IBucket, objectKey: String): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.s3(bucket.let(IBucket.Companion::unwrap),
        objectKey).let(CodePipelineSource::wrap)

    public fun s3(
      bucket: IBucket,
      objectKey: String,
      props: S3SourceOptions,
    ): CodePipelineSource =
        software.amazon.awscdk.pipelines.CodePipelineSource.s3(bucket.let(IBucket.Companion::unwrap),
        objectKey, props.let(S3SourceOptions.Companion::unwrap)).let(CodePipelineSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90bdea80b77e041a7961236f18ef831546681ec35644e5142c997418bb03b174")
    public fun s3(
      bucket: IBucket,
      objectKey: String,
      props: S3SourceOptions.Builder.() -> Unit,
    ): CodePipelineSource = s3(bucket, objectKey, S3SourceOptions(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodePipelineSource):
        CodePipelineSource = CdkObjectWrappers.wrap(cdkObject) as? CodePipelineSource ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodePipelineSource):
        software.amazon.awscdk.pipelines.CodePipelineSource = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.CodePipelineSource
  }
}
