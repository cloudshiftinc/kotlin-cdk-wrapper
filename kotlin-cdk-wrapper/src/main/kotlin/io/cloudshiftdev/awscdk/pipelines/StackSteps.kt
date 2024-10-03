@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Instructions for additional steps that are run at stack level.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * Stack stack;
 * Step step;
 * StackSteps stackSteps = StackSteps.builder()
 * .stack(stack)
 * // the properties below are optional
 * .changeSet(List.of(step))
 * .post(List.of(step))
 * .pre(List.of(step))
 * .build();
 * ```
 */
public interface StackSteps {
  /**
   * Steps that execute after stack is prepared but before stack is deployed.
   *
   * Default: - no additional steps
   */
  public fun changeSet(): List<Step> = unwrap(this).getChangeSet()?.map(Step::wrap) ?: emptyList()

  /**
   * Steps that execute after stack is deployed.
   *
   * Default: - no additional steps
   */
  public fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

  /**
   * Steps that execute before stack is prepared.
   *
   * Default: - no additional steps
   */
  public fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

  /**
   * The stack you want the steps to run in.
   */
  public fun stack(): Stack

  /**
   * A builder for [StackSteps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param changeSet Steps that execute after stack is prepared but before stack is deployed.
     */
    public fun changeSet(changeSet: List<Step>)

    /**
     * @param changeSet Steps that execute after stack is prepared but before stack is deployed.
     */
    public fun changeSet(vararg changeSet: Step)

    /**
     * @param post Steps that execute after stack is deployed.
     */
    public fun post(post: List<Step>)

    /**
     * @param post Steps that execute after stack is deployed.
     */
    public fun post(vararg post: Step)

    /**
     * @param pre Steps that execute before stack is prepared.
     */
    public fun pre(pre: List<Step>)

    /**
     * @param pre Steps that execute before stack is prepared.
     */
    public fun pre(vararg pre: Step)

    /**
     * @param stack The stack you want the steps to run in. 
     */
    public fun stack(stack: Stack)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.StackSteps.Builder =
        software.amazon.awscdk.pipelines.StackSteps.builder()

    /**
     * @param changeSet Steps that execute after stack is prepared but before stack is deployed.
     */
    override fun changeSet(changeSet: List<Step>) {
      cdkBuilder.changeSet(changeSet.map(Step.Companion::unwrap))
    }

    /**
     * @param changeSet Steps that execute after stack is prepared but before stack is deployed.
     */
    override fun changeSet(vararg changeSet: Step): Unit = changeSet(changeSet.toList())

    /**
     * @param post Steps that execute after stack is deployed.
     */
    override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step.Companion::unwrap))
    }

    /**
     * @param post Steps that execute after stack is deployed.
     */
    override fun post(vararg post: Step): Unit = post(post.toList())

    /**
     * @param pre Steps that execute before stack is prepared.
     */
    override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step.Companion::unwrap))
    }

    /**
     * @param pre Steps that execute before stack is prepared.
     */
    override fun pre(vararg pre: Step): Unit = pre(pre.toList())

    /**
     * @param stack The stack you want the steps to run in. 
     */
    override fun stack(stack: Stack) {
      cdkBuilder.stack(stack.let(Stack.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.StackSteps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.StackSteps,
  ) : CdkObject(cdkObject),
      StackSteps {
    /**
     * Steps that execute after stack is prepared but before stack is deployed.
     *
     * Default: - no additional steps
     */
    override fun changeSet(): List<Step> = unwrap(this).getChangeSet()?.map(Step::wrap) ?:
        emptyList()

    /**
     * Steps that execute after stack is deployed.
     *
     * Default: - no additional steps
     */
    override fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

    /**
     * Steps that execute before stack is prepared.
     *
     * Default: - no additional steps
     */
    override fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

    /**
     * The stack you want the steps to run in.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StackSteps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackSteps): StackSteps =
        CdkObjectWrappers.wrap(cdkObject) as? StackSteps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackSteps): software.amazon.awscdk.pipelines.StackSteps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.pipelines.StackSteps
  }
}
