package io.cloudshiftdev.awscdk.pipelines

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface StageDeploymentProps {
  public fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

  public fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

  public fun stackSteps(): List<StackSteps> = unwrap(this).getStackSteps()?.map(StackSteps::wrap) ?:
      emptyList()

  public fun stageName(): String? = unwrap(this).getStageName()

  public interface Builder {
    public fun post(post: List<Step>)

    public fun post(vararg post: Step)

    public fun pre(pre: List<Step>)

    public fun pre(vararg pre: Step)

    public fun stackSteps(stackSteps: List<StackSteps>)

    public fun stackSteps(vararg stackSteps: StackSteps)

    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.StageDeploymentProps.Builder =
        software.amazon.awscdk.pipelines.StageDeploymentProps.builder()

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

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.pipelines.StageDeploymentProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.StageDeploymentProps,
  ) : StageDeploymentProps {
    override fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

    override fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

    override fun stackSteps(): List<StackSteps> =
        unwrap(this).getStackSteps()?.map(StackSteps::wrap) ?: emptyList()

    override fun stageName(): String? = unwrap(this).getStageName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StageDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StageDeploymentProps):
        StageDeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageDeploymentProps):
        software.amazon.awscdk.pipelines.StageDeploymentProps = (wrapped as Wrapper).cdkObject
  }
}
