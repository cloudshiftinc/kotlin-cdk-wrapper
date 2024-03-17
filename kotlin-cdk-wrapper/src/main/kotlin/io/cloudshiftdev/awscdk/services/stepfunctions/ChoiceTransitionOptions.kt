@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options for Choice Transition.
 *
 * Example:
 *
 * ```
 * Choice choice = Choice.Builder.create(this, "What color is it?")
 * .comment("color comment")
 * .build();
 * Pass handleBlueItem = new Pass(this, "HandleBlueItem");
 * Pass handleOtherItemColor = new Pass(this, "HanldeOtherItemColor");
 * choice.when(Condition.stringEquals("$.color", "BLUE"), handleBlueItem,
 * ChoiceTransitionOptions.builder()
 * .comment("blue item comment")
 * .build());
 * choice.otherwise(handleOtherItemColor);
 * ```
 */
public interface ChoiceTransitionOptions {
  /**
   * An optional description for the choice transition.
   *
   * Default: No comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * A builder for [ChoiceTransitionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment An optional description for the choice transition.
     */
    public fun comment(comment: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions.builder()

    /**
     * @param comment An optional description for the choice transition.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions,
  ) : CdkObject(cdkObject), ChoiceTransitionOptions {
    /**
     * An optional description for the choice transition.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ChoiceTransitionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions):
        ChoiceTransitionOptions = CdkObjectWrappers.wrap(cdkObject) as? ChoiceTransitionOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ChoiceTransitionOptions):
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions
  }
}
