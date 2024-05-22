@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * A generic Step which can be added to a Pipeline.
 *
 * Steps can be used to add Sources, Build Actions and Validations
 * to your pipeline.
 *
 * This class is abstract. See specific subclasses of Step for
 * useful steps to add to your Pipeline
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
public abstract class Step(
  cdkObject: software.amazon.awscdk.pipelines.Step,
) : CdkObject(cdkObject), IFileSetProducer {
  /**
   * Add a dependency on another step.
   *
   * @param step 
   */
  public open fun addStepDependency(step: Step) {
    unwrap(this).addStepDependency(step.let(Step.Companion::unwrap))
  }

  /**
   * StackOutputReferences this step consumes.
   */
  public open fun consumedStackOutputs(): List<StackOutputReference> =
      unwrap(this).getConsumedStackOutputs().map(StackOutputReference::wrap)

  /**
   * Return the steps this step depends on, based on the FileSets it requires.
   */
  public open fun dependencies(): List<Step> = unwrap(this).getDependencies().map(Step::wrap)

  /**
   * The list of FileSets consumed by this Step.
   */
  public open fun dependencyFileSets(): List<FileSet> =
      unwrap(this).getDependencyFileSets().map(FileSet::wrap)

  /**
   * Identifier for this step.
   */
  public open fun id(): String = unwrap(this).getId()

  /**
   * Whether or not this is a Source step.
   *
   * What it means to be a Source step depends on the engine.
   */
  public open fun isSource(): Boolean = unwrap(this).getIsSource()

  /**
   * The primary FileSet produced by this Step.
   *
   * Not all steps produce an output FileSet--if they do
   * you can substitute the `Step` object for the `FileSet` object.
   */
  public override fun primaryOutput(): FileSet? =
      unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.Step,
  ) : Step(cdkObject)

  public companion object {
    public fun sequence(steps: List<Step>): List<Step> =
        software.amazon.awscdk.pipelines.Step.sequence(steps.map(Step.Companion::unwrap)).map(Step::wrap)

    public fun sequence(vararg steps: Step): List<Step> = sequence(steps.toList())

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.Step): Step =
        CdkObjectWrappers.wrap(cdkObject) as? Step ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Step): software.amazon.awscdk.pipelines.Step = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.Step
  }
}
