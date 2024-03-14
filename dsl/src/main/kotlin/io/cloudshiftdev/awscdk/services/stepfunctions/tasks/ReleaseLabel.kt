package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String

public open class ReleaseLabel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel,
) {
  public open fun label(): String = unwrap(this).getLabel()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel):
        ReleaseLabel = ReleaseLabel(cdkObject)

    internal fun unwrap(wrapped: ReleaseLabel):
        software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel = wrapped.cdkObject
  }
}
