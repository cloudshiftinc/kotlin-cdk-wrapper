package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String

public abstract class Timeout internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout,
) {
  public open fun path(): String? = unwrap(this).getPath()

  public open fun seconds(): Number? = unwrap(this).getSeconds()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout,
  ) : Timeout(cdkObject)

  public companion object {
    public open fun at(path: String): Timeout =
        software.amazon.awscdk.services.stepfunctions.Timeout.at(path).let(Timeout::wrap)

    public open fun duration(duration: Duration): Timeout =
        software.amazon.awscdk.services.stepfunctions.Timeout.duration(duration.let(Duration::unwrap)).let(Timeout::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout): Timeout =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Timeout): software.amazon.awscdk.services.stepfunctions.Timeout =
        (wrapped as Wrapper).cdkObject
  }
}
