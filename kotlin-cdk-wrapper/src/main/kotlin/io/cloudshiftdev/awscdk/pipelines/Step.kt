@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public abstract class Step internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.Step,
) : CdkObject(cdkObject), IFileSetProducer {
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
