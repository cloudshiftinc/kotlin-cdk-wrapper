@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface StackSteps {
  public fun changeSet(): List<Step> = unwrap(this).getChangeSet()?.map(Step::wrap) ?: emptyList()

  public fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

  public fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

  public fun stack(): Stack

  @CdkDslMarker
  public interface Builder {
    public fun changeSet(changeSet: List<Step>)

    public fun changeSet(vararg changeSet: Step)

    public fun post(post: List<Step>)

    public fun post(vararg post: Step)

    public fun pre(pre: List<Step>)

    public fun pre(vararg pre: Step)

    public fun stack(stack: Stack)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.StackSteps.Builder =
        software.amazon.awscdk.pipelines.StackSteps.builder()

    override fun changeSet(changeSet: List<Step>) {
      cdkBuilder.changeSet(changeSet.map(Step::unwrap))
    }

    override fun changeSet(vararg changeSet: Step): Unit = changeSet(changeSet.toList())

    override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step::unwrap))
    }

    override fun post(vararg post: Step): Unit = post(post.toList())

    override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step::unwrap))
    }

    override fun pre(vararg pre: Step): Unit = pre(pre.toList())

    override fun stack(stack: Stack) {
      cdkBuilder.stack(stack.let(Stack::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.StackSteps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.StackSteps,
  ) : CdkObject(cdkObject), StackSteps {
    override fun changeSet(): List<Step> = unwrap(this).getChangeSet()?.map(Step::wrap) ?:
        emptyList()

    override fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

    override fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StackSteps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackSteps): StackSteps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackSteps): software.amazon.awscdk.pipelines.StackSteps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.pipelines.StackSteps
  }
}
