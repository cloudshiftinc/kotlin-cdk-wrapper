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
    public val LINUX: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.LINUX)

    public val WINDOWS_SERVER_2004_CORE: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2004_CORE)

    public val WINDOWS_SERVER_2016_FULL: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2016_FULL)

    public val WINDOWS_SERVER_2019_CORE: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2019_CORE)

    public val WINDOWS_SERVER_2019_FULL: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2019_FULL)

    public val WINDOWS_SERVER_2022_CORE: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2022_CORE)

    public val WINDOWS_SERVER_2022_FULL: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2022_FULL)

    public val WINDOWS_SERVER_20_H2_CORE: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_20_H2_CORE)

    public fun of(family: String): OperatingSystemFamily =
        software.amazon.awscdk.services.ecs.OperatingSystemFamily.of(family).let(OperatingSystemFamily::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.OperatingSystemFamily):
        OperatingSystemFamily = OperatingSystemFamily(cdkObject)

    internal fun unwrap(wrapped: OperatingSystemFamily):
        software.amazon.awscdk.services.ecs.OperatingSystemFamily = wrapped.cdkObject
  }
}
