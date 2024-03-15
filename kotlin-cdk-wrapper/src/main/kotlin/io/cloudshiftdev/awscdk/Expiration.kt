@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import java.time.Instant
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * Represents a date of expiration.
 *
 * The amount can be specified either as a Date object, timestamp, Duration or string.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * Expiration expiration = Expiration.after(Duration.minutes(30));
 * ```
 */
public open class Expiration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Expiration,
) : CdkObject(cdkObject) {
  /**
   * Expiration value as a Date object.
   */
  public open fun date(): Instant = unwrap(this).getDate()

  /**
   * Check if Expiration expires after input.
   *
   * @param t the duration to check against. 
   */
  public open fun isAfter(t: Duration): Boolean = unwrap(this).isAfter(t.let(Duration::unwrap))

  /**
   * Check if Expiration expires before input.
   *
   * @param t the duration to check against. 
   */
  public open fun isBefore(t: Duration): Boolean = unwrap(this).isBefore(t.let(Duration::unwrap))

  /**
   * Expiration Value in a formatted Unix Epoch Time in seconds.
   */
  public open fun toEpoch(): Number = unwrap(this).toEpoch()

  public companion object {
    public fun after(t: Duration): Expiration =
        software.amazon.awscdk.Expiration.after(t.let(Duration::unwrap)).let(Expiration::wrap)

    public fun atDate(d: Instant): Expiration =
        software.amazon.awscdk.Expiration.atDate(d).let(Expiration::wrap)

    public fun atTimestamp(t: Number): Expiration =
        software.amazon.awscdk.Expiration.atTimestamp(t).let(Expiration::wrap)

    public fun fromString(s: String): Expiration =
        software.amazon.awscdk.Expiration.fromString(s).let(Expiration::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.Expiration): Expiration =
        Expiration(cdkObject)

    internal fun unwrap(wrapped: Expiration): software.amazon.awscdk.Expiration = wrapped.cdkObject
  }
}
