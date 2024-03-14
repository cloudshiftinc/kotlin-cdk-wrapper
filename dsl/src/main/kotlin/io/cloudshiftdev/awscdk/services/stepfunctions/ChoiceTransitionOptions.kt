package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.String
import kotlin.Unit

public interface ChoiceTransitionOptions {
  public fun comment(): String? = unwrap(this).getComment()

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions,
  ) : ChoiceTransitionOptions {
    override fun comment(): String? = unwrap(this).getComment()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ChoiceTransitionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions):
        ChoiceTransitionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ChoiceTransitionOptions):
        software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions = (wrapped as
        Wrapper).cdkObject
  }
}
