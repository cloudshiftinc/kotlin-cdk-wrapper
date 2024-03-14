package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stack
import kotlin.Unit
import kotlin.collections.List

public interface StackSteps {
  public fun changeSet(): List<Step> = unwrap(this).getChangeSet()?.map(Step::wrap) ?: emptyList()

  public fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

  public fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

  public fun stack(): Stack

  public interface Builder {
    public fun changeSet(changeSet: List<Step>) {
    }

    public fun post(post: List<Step>) {
    }

    public fun pre(pre: List<Step>) {
    }

    public fun stack(stack: Stack) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.StackSteps.Builder =
        software.amazon.awscdk.pipelines.StackSteps.builder()

    public override fun changeSet(changeSet: List<Step>) {
      cdkBuilder.changeSet(changeSet.map(Step::unwrap))
    }

    public override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step::unwrap))
    }

    public override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step::unwrap))
    }

    public override fun stack(stack: Stack) {
      cdkBuilder.stack(stack.let(Stack::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.StackSteps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.StackSteps,
  ) : StackSteps {
    public override fun changeSet(): List<Step> = unwrap(this).getChangeSet()?.map(Step::wrap) ?:
        emptyList()

    public override fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

    public override fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StackSteps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackSteps): StackSteps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackSteps): software.amazon.awscdk.pipelines.StackSteps = (wrapped
        as Wrapper).cdkObject
  }
}
