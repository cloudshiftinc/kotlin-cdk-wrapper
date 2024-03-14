package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.List

public interface AddStageOpts {
  /**
   * Additional steps to run after all of the stacks in the stage.
   *
   * Default: - No additional steps
   */
  public fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

  /**
   * Additional steps to run before any of the stacks in the stage.
   *
   * Default: - No additional steps
   */
  public fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

  /**
   * Instructions for stack level steps.
   *
   * Default: - No additional instructions
   */
  public fun stackSteps(): List<StackSteps> = unwrap(this).getStackSteps()?.map(StackSteps::wrap) ?:
      emptyList()

  /**
   * A builder for [AddStageOpts]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param post Additional steps to run after all of the stacks in the stage.
     */
    public fun post(post: List<Step>)

    /**
     * @param post Additional steps to run after all of the stacks in the stage.
     */
    public fun post(vararg post: Step)

    /**
     * @param pre Additional steps to run before any of the stacks in the stage.
     */
    public fun pre(pre: List<Step>)

    /**
     * @param pre Additional steps to run before any of the stacks in the stage.
     */
    public fun pre(vararg pre: Step)

    /**
     * @param stackSteps Instructions for stack level steps.
     */
    public fun stackSteps(stackSteps: List<StackSteps>)

    /**
     * @param stackSteps Instructions for stack level steps.
     */
    public fun stackSteps(vararg stackSteps: StackSteps)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.AddStageOpts.Builder =
        software.amazon.awscdk.pipelines.AddStageOpts.builder()

    /**
     * @param post Additional steps to run after all of the stacks in the stage.
     */
    override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step::unwrap))
    }

    /**
     * @param post Additional steps to run after all of the stacks in the stage.
     */
    override fun post(vararg post: Step): Unit = post(post.toList())

    /**
     * @param pre Additional steps to run before any of the stacks in the stage.
     */
    override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step::unwrap))
    }

    /**
     * @param pre Additional steps to run before any of the stacks in the stage.
     */
    override fun pre(vararg pre: Step): Unit = pre(pre.toList())

    /**
     * @param stackSteps Instructions for stack level steps.
     */
    override fun stackSteps(stackSteps: List<StackSteps>) {
      cdkBuilder.stackSteps(stackSteps.map(StackSteps::unwrap))
    }

    /**
     * @param stackSteps Instructions for stack level steps.
     */
    override fun stackSteps(vararg stackSteps: StackSteps): Unit = stackSteps(stackSteps.toList())

    public fun build(): software.amazon.awscdk.pipelines.AddStageOpts = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.AddStageOpts,
  ) : AddStageOpts {
    /**
     * Additional steps to run after all of the stacks in the stage.
     *
     * Default: - No additional steps
     */
    override fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

    /**
     * Additional steps to run before any of the stacks in the stage.
     *
     * Default: - No additional steps
     */
    override fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

    /**
     * Instructions for stack level steps.
     *
     * Default: - No additional instructions
     */
    override fun stackSteps(): List<StackSteps> =
        unwrap(this).getStackSteps()?.map(StackSteps::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddStageOpts {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.AddStageOpts): AddStageOpts =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddStageOpts): software.amazon.awscdk.pipelines.AddStageOpts =
        (wrapped as Wrapper).cdkObject
  }
}
