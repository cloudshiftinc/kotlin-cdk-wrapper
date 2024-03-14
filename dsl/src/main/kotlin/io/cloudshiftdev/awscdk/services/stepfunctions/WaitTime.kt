package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import kotlin.String

public open class WaitTime internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.WaitTime,
) : CdkObject(cdkObject) {
  public companion object {
    public fun duration(duration: Duration): WaitTime =
        software.amazon.awscdk.services.stepfunctions.WaitTime.duration(duration.let(Duration::unwrap)).let(WaitTime::wrap)

    public fun secondsPath(path: String): WaitTime =
        software.amazon.awscdk.services.stepfunctions.WaitTime.secondsPath(path).let(WaitTime::wrap)

    public fun timestamp(timestamp: String): WaitTime =
        software.amazon.awscdk.services.stepfunctions.WaitTime.timestamp(timestamp).let(WaitTime::wrap)

    public fun timestampPath(path: String): WaitTime =
        software.amazon.awscdk.services.stepfunctions.WaitTime.timestampPath(path).let(WaitTime::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.WaitTime): WaitTime =
        WaitTime(cdkObject)

    internal fun unwrap(wrapped: WaitTime): software.amazon.awscdk.services.stepfunctions.WaitTime =
        wrapped.cdkObject
  }
}
