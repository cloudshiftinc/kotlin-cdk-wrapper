@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ChoiceTransitionOptions {
  public fun comment(): String? = unwrap(this).getComment()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions,
  ) : CdkObject(cdkObject), ChoiceTransitionOptions {
    override fun comment(): String? = unwrap(this).getComment()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ChoiceTransitionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions):
        ChoiceTransitionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ChoiceTransitionOptions):
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions
  }
}
