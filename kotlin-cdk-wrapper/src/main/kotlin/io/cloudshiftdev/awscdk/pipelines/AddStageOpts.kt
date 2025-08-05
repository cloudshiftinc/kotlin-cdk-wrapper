@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Options to pass to `addStage`.
 *
 * Example:
 *
 * ```
 * CodePipeline pipeline;
 * Topic topic = new Topic(this, "SecurityChangesTopic");
 * topic.addSubscription(new EmailSubscription("test&#64;email.com"));
 * MyApplicationStage stage = new MyApplicationStage(this, "MyApplication");
 * pipeline.addStage(stage, AddStageOpts.builder()
 * .pre(List.of(
 * ConfirmPermissionsBroadening.Builder.create("Check")
 * .stage(stage)
 * .notificationTopic(topic)
 * .build()))
 * .build());
 * ```
 */
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
      cdkBuilder.post(post.map(Step.Companion::unwrap))
    }

    /**
     * @param post Additional steps to run after all of the stacks in the stage.
     */
    override fun post(vararg post: Step): Unit = post(post.toList())

    /**
     * @param pre Additional steps to run before any of the stacks in the stage.
     */
    override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step.Companion::unwrap))
    }

    /**
     * @param pre Additional steps to run before any of the stacks in the stage.
     */
    override fun pre(vararg pre: Step): Unit = pre(pre.toList())

    /**
     * @param stackSteps Instructions for stack level steps.
     */
    override fun stackSteps(stackSteps: List<StackSteps>) {
      cdkBuilder.stackSteps(stackSteps.map(StackSteps.Companion::unwrap))
    }

    /**
     * @param stackSteps Instructions for stack level steps.
     */
    override fun stackSteps(vararg stackSteps: StackSteps): Unit = stackSteps(stackSteps.toList())

    public fun build(): software.amazon.awscdk.pipelines.AddStageOpts = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.AddStageOpts,
  ) : CdkObject(cdkObject),
      AddStageOpts {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): AddStageOpts {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.AddStageOpts): AddStageOpts =
        CdkObjectWrappers.wrap(cdkObject) as? AddStageOpts ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddStageOpts): software.amazon.awscdk.pipelines.AddStageOpts =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.pipelines.AddStageOpts
  }
}
