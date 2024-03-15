@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * A set of files traveling through the deployment pipeline.
 *
 * Individual steps in the pipeline produce or consume
 * `FileSet`s.
 *
 * Example:
 *
 * ```
 * public class MyJenkinsStep extends Step implements ICodePipelineActionFactory {
 * public MyJenkinsStep(JenkinsProvider provider, FileSet input) {
 * super("MyJenkinsStep");
 * // This is necessary if your step accepts parameters, like environment variables,
 * // that may contain outputs from other steps. It doesn't matter what the
 * // structure is, as long as it contains the values that may contain outputs.
 * this.discoverReferencedOutputs(Map.of(
 * "env", Map.of()));
 * }
 * public CodePipelineActionFactoryResult produceAction(IStage stage, ProduceActionOptions options)
 * {
 * // This is where you control what type of Action gets added to the
 * // CodePipeline
 * stage.addAction(JenkinsAction.Builder.create()
 * // Copy 'actionName' and 'runOrder' from the options
 * .actionName(options.getActionName())
 * .runOrder(options.getRunOrder())
 * // Jenkins-specific configuration
 * .type(JenkinsActionType.TEST)
 * .jenkinsProvider(this.provider)
 * .projectName("MyJenkinsProject")
 * // Translate the FileSet into a codepipeline.Artifact
 * .inputs(List.of(options.artifacts.toCodePipeline(this.input)))
 * .build());
 * return CodePipelineActionFactoryResult.builder().runOrdersConsumed(1).build();
 * }
 * }
 * ```
 */
public open class FileSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.FileSet,
) : CdkObject(cdkObject), IFileSetProducer {
  /**
   * Human-readable descriptor for this file set (does not need to be unique).
   */
  public open fun id(): String = unwrap(this).getId()

  /**
   * The primary output of a file set producer.
   *
   * The primary output of a FileSet is itself.
   */
  public override fun primaryOutput(): FileSet? =
      unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)

  /**
   * Mark the given Step as the producer for this FileSet.
   *
   * This method can only be called once.
   *
   * @param producer
   */
  public open fun producedBy() {
    unwrap(this).producedBy()
  }

  /**
   * Mark the given Step as the producer for this FileSet.
   *
   * This method can only be called once.
   *
   * @param producer
   */
  public open fun producedBy(producer: Step) {
    unwrap(this).producedBy(producer.let(Step::unwrap))
  }

  /**
   * The Step that produces this FileSet.
   */
  public open fun producer(): Step = unwrap(this).getProducer().let(Step::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.FileSet): FileSet =
        FileSet(cdkObject)

    internal fun unwrap(wrapped: FileSet): software.amazon.awscdk.pipelines.FileSet =
        wrapped.cdkObject
  }
}
