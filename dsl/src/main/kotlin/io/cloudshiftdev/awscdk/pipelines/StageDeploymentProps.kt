package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface StageDeploymentProps {
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
   * Instructions for additional steps that are run at the stack level.
   *
   * Default: - No additional instructions
   */
  public fun stackSteps(): List<StackSteps> = unwrap(this).getStackSteps()?.map(StackSteps::wrap) ?:
      emptyList()

  /**
   * Stage name to use in the pipeline.
   *
   * Default: - Use Stage's construct ID
   */
  public fun stageName(): String? = unwrap(this).getStageName()

  /**
   * A builder for [StageDeploymentProps]
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
     * @param stackSteps Instructions for additional steps that are run at the stack level.
     */
    public fun stackSteps(stackSteps: List<StackSteps>)

    /**
     * @param stackSteps Instructions for additional steps that are run at the stack level.
     */
    public fun stackSteps(vararg stackSteps: StackSteps)

    /**
     * @param stageName Stage name to use in the pipeline.
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.StageDeploymentProps.Builder =
        software.amazon.awscdk.pipelines.StageDeploymentProps.builder()

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
     * @param stackSteps Instructions for additional steps that are run at the stack level.
     */
    override fun stackSteps(stackSteps: List<StackSteps>) {
      cdkBuilder.stackSteps(stackSteps.map(StackSteps::unwrap))
    }

    /**
     * @param stackSteps Instructions for additional steps that are run at the stack level.
     */
    override fun stackSteps(vararg stackSteps: StackSteps): Unit = stackSteps(stackSteps.toList())

    /**
     * @param stageName Stage name to use in the pipeline.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.pipelines.StageDeploymentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.StageDeploymentProps,
  ) : CdkObject(cdkObject), StageDeploymentProps {
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
     * Instructions for additional steps that are run at the stack level.
     *
     * Default: - No additional instructions
     */
    override fun stackSteps(): List<StackSteps> =
        unwrap(this).getStackSteps()?.map(StackSteps::wrap) ?: emptyList()

    /**
     * Stage name to use in the pipeline.
     *
     * Default: - Use Stage's construct ID
     */
    override fun stageName(): String? = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StageDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StageDeploymentProps):
        StageDeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageDeploymentProps):
        software.amazon.awscdk.pipelines.StageDeploymentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.StageDeploymentProps
  }
}
