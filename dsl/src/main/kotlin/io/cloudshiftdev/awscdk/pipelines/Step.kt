package io.cloudshiftdev.awscdk.pipelines

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public abstract class Step internal constructor(
  private val cdkObject: software.amazon.awscdk.pipelines.Step,
) : IFileSetProducer {
  public open fun addStepDependency(step: Step) {
    unwrap(this).addStepDependency(step.let(Step::unwrap))
  }

  public open fun consumedStackOutputs(): List<StackOutputReference> =
      unwrap(this).getConsumedStackOutputs().map(StackOutputReference::wrap)

  public open fun dependencies(): List<Step> = unwrap(this).getDependencies().map(Step::wrap)

  public open fun dependencyFileSets(): List<FileSet> =
      unwrap(this).getDependencyFileSets().map(FileSet::wrap)

  public open fun id(): String = unwrap(this).getId()

  public open fun isSource(): Boolean = unwrap(this).getIsSource()

  public override fun primaryOutput(): FileSet? =
      unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.Step,
  ) : Step(cdkObject)

  public companion object {
    public open fun sequence(steps: List<Step>): List<Step> =
        software.amazon.awscdk.pipelines.Step.sequence(steps.map(Step::unwrap)).map(Step::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.Step): Step = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Step): software.amazon.awscdk.pipelines.Step = (wrapped as
        Wrapper).cdkObject
  }
}
