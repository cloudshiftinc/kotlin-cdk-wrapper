package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String

public open class Classification internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Classification,
) {
  public open fun classificationStatement(): String = unwrap(this).getClassificationStatement()

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Classification):
        Classification = Classification(cdkObject)

    internal fun unwrap(wrapped: Classification):
        software.amazon.awscdk.services.stepfunctions.tasks.Classification = wrapped.cdkObject
  }
}
