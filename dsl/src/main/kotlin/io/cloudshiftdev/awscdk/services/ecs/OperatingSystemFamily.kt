package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Boolean
import kotlin.String

public open class OperatingSystemFamily internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.OperatingSystemFamily,
) {
  public open fun isWindows(): Boolean = unwrap(this).isWindows()

  public companion object {
    public open fun of(family: String): OperatingSystemFamily =
        software.amazon.awscdk.services.ecs.OperatingSystemFamily.of(family).let(OperatingSystemFamily::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.OperatingSystemFamily):
        OperatingSystemFamily = OperatingSystemFamily(cdkObject)

    internal fun unwrap(wrapped: OperatingSystemFamily):
        software.amazon.awscdk.services.ecs.OperatingSystemFamily = wrapped.cdkObject
  }
}
