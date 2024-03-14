package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class LogFormat internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.LogFormat,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public fun custom(formatString: String): LogFormat =
        software.amazon.awscdk.services.ec2.LogFormat.custom(formatString).let(LogFormat::wrap)

    public fun `field`(`field`: String): LogFormat =
        software.amazon.awscdk.services.ec2.LogFormat.`field`(`field`).let(LogFormat::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LogFormat): LogFormat =
        LogFormat(cdkObject)

    internal fun unwrap(wrapped: LogFormat): software.amazon.awscdk.services.ec2.LogFormat =
        wrapped.cdkObject
  }
}
