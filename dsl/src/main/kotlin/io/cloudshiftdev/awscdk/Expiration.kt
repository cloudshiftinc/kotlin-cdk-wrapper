package io.cloudshiftdev.awscdk

import java.time.Instant
import kotlin.Boolean
import kotlin.Number
import kotlin.String

public open class Expiration internal constructor(
  private val cdkObject: software.amazon.awscdk.Expiration,
) {
  public open fun date(): Instant = unwrap(this).getDate()

  public open fun isAfter(t: Duration): Boolean = unwrap(this).isAfter(t.let(Duration::unwrap))

  public open fun isBefore(t: Duration): Boolean = unwrap(this).isBefore(t.let(Duration::unwrap))

  public open fun toEpoch(): Number = unwrap(this).toEpoch()

  public companion object {
    public open fun after(t: Duration): Expiration =
        software.amazon.awscdk.Expiration.after(t.let(Duration::unwrap)).let(Expiration::wrap)

    public open fun atDate(d: Instant): Expiration =
        software.amazon.awscdk.Expiration.atDate(d).let(Expiration::wrap)

    public open fun atTimestamp(t: Number): Expiration =
        software.amazon.awscdk.Expiration.atTimestamp(t).let(Expiration::wrap)

    public open fun fromString(s: String): Expiration =
        software.amazon.awscdk.Expiration.fromString(s).let(Expiration::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.Expiration): Expiration =
        Expiration(cdkObject)

    internal fun unwrap(wrapped: Expiration): software.amazon.awscdk.Expiration = wrapped.cdkObject
  }
}
