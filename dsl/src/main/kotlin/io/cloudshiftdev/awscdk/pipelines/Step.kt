package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public abstract class Step internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.Step,
) : CdkObject(cdkObject), IFileSetProducer {
  /**
   * Add a dependency on another step.
   *
   * @param step 
   */
  public open fun addStepDependency(step: Step) {
    unwrap(this).addStepDependency(step.let(Step::unwrap))
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
    override val cdkObject: software.amazon.awscdk.pipelines.Step,
  ) : Step(cdkObject)

  public companion object {
    public fun sequence(steps: List<Step>): List<Step> =
        software.amazon.awscdk.pipelines.Step.sequence(steps.map(Step::unwrap)).map(Step::wrap)

    public fun sequence(vararg steps: Step): List<Step> = sequence(steps.toList())

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.Step): Step = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Step): software.amazon.awscdk.pipelines.Step = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.Step
  }
}
