package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String

public abstract class Timeout internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout,
) : CdkObject(cdkObject) {
  /**
   * Path for this timeout.
   */
  public open fun path(): String? = unwrap(this).getPath()

  /**
   * Seconds for this timeout.
   */
  public open fun seconds(): Number? = unwrap(this).getSeconds()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout,
  ) : Timeout(cdkObject)

  public companion object {
    public fun at(path: String): Timeout =
        software.amazon.awscdk.services.stepfunctions.Timeout.at(path).let(Timeout::wrap)

    public fun duration(duration: Duration): Timeout =
        software.amazon.awscdk.services.stepfunctions.Timeout.duration(duration.let(Duration::unwrap)).let(Timeout::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Timeout): Timeout =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Timeout): software.amazon.awscdk.services.stepfunctions.Timeout =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.Timeout
  }
}
