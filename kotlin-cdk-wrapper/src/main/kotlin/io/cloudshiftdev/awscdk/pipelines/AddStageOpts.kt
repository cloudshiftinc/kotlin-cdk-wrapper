@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface AddStageOpts {
  public fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

  public fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

  public fun stackSteps(): List<StackSteps> = unwrap(this).getStackSteps()?.map(StackSteps::wrap) ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun post(post: List<Step>)

    public fun post(vararg post: Step)

    public fun pre(pre: List<Step>)

    public fun pre(vararg pre: Step)

    public fun stackSteps(stackSteps: List<StackSteps>)

    public fun stackSteps(vararg stackSteps: StackSteps)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.AddStageOpts.Builder =
        software.amazon.awscdk.pipelines.AddStageOpts.builder()

    override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step::unwrap))
    }

    override fun post(vararg post: Step): Unit = post(post.toList())

    override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step::unwrap))
    }

    override fun pre(vararg pre: Step): Unit = pre(pre.toList())

    override fun stackSteps(stackSteps: List<StackSteps>) {
      cdkBuilder.stackSteps(stackSteps.map(StackSteps::unwrap))
    }

    override fun stackSteps(vararg stackSteps: StackSteps): Unit = stackSteps(stackSteps.toList())

    public fun build(): software.amazon.awscdk.pipelines.AddStageOpts = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.AddStageOpts,
  ) : CdkObject(cdkObject), AddStageOpts {
    override fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

    override fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

    override fun stackSteps(): List<StackSteps> =
        unwrap(this).getStackSteps()?.map(StackSteps::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddStageOpts {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.AddStageOpts): AddStageOpts =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddStageOpts): software.amazon.awscdk.pipelines.AddStageOpts =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.pipelines.AddStageOpts
  }
}
