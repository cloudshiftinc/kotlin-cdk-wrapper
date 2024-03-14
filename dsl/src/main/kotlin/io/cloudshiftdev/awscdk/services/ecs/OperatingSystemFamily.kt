package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Boolean
import kotlin.String

public open class OperatingSystemFamily internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.OperatingSystemFamily,
) : CdkObject(cdkObject) {
  /**
   * Returns true if the operating system family is Windows.
   */
  public open fun isWindows(): Boolean = unwrap(this).isWindows()

  public companion object {
    public fun of(family: String): OperatingSystemFamily =
        software.amazon.awscdk.services.ecs.OperatingSystemFamily.of(family).let(OperatingSystemFamily::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.OperatingSystemFamily):
        OperatingSystemFamily = OperatingSystemFamily(cdkObject)

    internal fun unwrap(wrapped: OperatingSystemFamily):
        software.amazon.awscdk.services.ecs.OperatingSystemFamily = wrapped.cdkObject
  }
}
