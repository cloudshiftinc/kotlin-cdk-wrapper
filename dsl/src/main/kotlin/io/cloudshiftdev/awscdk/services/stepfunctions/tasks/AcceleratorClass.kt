package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String

public open class AcceleratorClass internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass,
) {
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public open fun of(version: String): AcceleratorClass =
        software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass.of(version).let(AcceleratorClass::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass):
        AcceleratorClass = AcceleratorClass(cdkObject)

    internal fun unwrap(wrapped: AcceleratorClass):
        software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorClass = wrapped.cdkObject
  }
}
