@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Duration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Duration,
) : CdkObject(cdkObject) {
  public open fun formatTokenToNumber(): String = unwrap(this).formatTokenToNumber()

  public open fun isUnresolved(): Boolean = unwrap(this).isUnresolved()

  public open fun minus(rhs: Duration): Duration =
      unwrap(this).minus(rhs.let(Duration::unwrap)).let(Duration::wrap)

  public open fun plus(rhs: Duration): Duration =
      unwrap(this).plus(rhs.let(Duration::unwrap)).let(Duration::wrap)

  public open fun toDays(): Number = unwrap(this).toDays()

  public open fun toDays(opts: TimeConversionOptions): Number =
      unwrap(this).toDays(opts.let(TimeConversionOptions::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("953e853854a579671895c309b1b3890d6e4ccc449d4de8984a198683fb581d80")
  public open fun toDays(opts: TimeConversionOptions.Builder.() -> Unit): Number =
      toDays(TimeConversionOptions(opts))

  public open fun toHours(): Number = unwrap(this).toHours()

  public open fun toHours(opts: TimeConversionOptions): Number =
      unwrap(this).toHours(opts.let(TimeConversionOptions::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c690032d9ef85b9cd02aa68ce00f91634e218b5257bd32acd08489ba4c7b7be")
  public open fun toHours(opts: TimeConversionOptions.Builder.() -> Unit): Number =
      toHours(TimeConversionOptions(opts))

  public open fun toHumanString(): String = unwrap(this).toHumanString()

  public open fun toIsoString(): String = unwrap(this).toIsoString()

  public open fun toMilliseconds(): Number = unwrap(this).toMilliseconds()

  public open fun toMilliseconds(opts: TimeConversionOptions): Number =
      unwrap(this).toMilliseconds(opts.let(TimeConversionOptions::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0abfa22579d7d19c9796064df4d5598c0ff49bc15b3a3600c05bd1249bd38fd7")
  public open fun toMilliseconds(opts: TimeConversionOptions.Builder.() -> Unit): Number =
      toMilliseconds(TimeConversionOptions(opts))

  public open fun toMinutes(): Number = unwrap(this).toMinutes()

  public open fun toMinutes(opts: TimeConversionOptions): Number =
      unwrap(this).toMinutes(opts.let(TimeConversionOptions::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("888c8440e6fc7681d3d5c5e7f4e4d35a04df98f051b7089d67818e365afa61cc")
  public open fun toMinutes(opts: TimeConversionOptions.Builder.() -> Unit): Number =
      toMinutes(TimeConversionOptions(opts))

  public open fun toSeconds(): Number = unwrap(this).toSeconds()

  public open fun toSeconds(opts: TimeConversionOptions): Number =
      unwrap(this).toSeconds(opts.let(TimeConversionOptions::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08be316a0b35bbb9305a50cbbee6fcd14e90e257d0c00e6108c84e210903c37f")
  public open fun toSeconds(opts: TimeConversionOptions.Builder.() -> Unit): Number =
      toSeconds(TimeConversionOptions(opts))

  public open fun unitLabel(): String = unwrap(this).unitLabel()

  public companion object {
    public fun days(amount: Number): Duration =
        software.amazon.awscdk.Duration.days(amount).let(Duration::wrap)

    public fun hours(amount: Number): Duration =
        software.amazon.awscdk.Duration.hours(amount).let(Duration::wrap)

    public fun millis(amount: Number): Duration =
        software.amazon.awscdk.Duration.millis(amount).let(Duration::wrap)

    public fun minutes(amount: Number): Duration =
        software.amazon.awscdk.Duration.minutes(amount).let(Duration::wrap)

    public fun parse(duration: String): Duration =
        software.amazon.awscdk.Duration.parse(duration).let(Duration::wrap)

    public fun seconds(amount: Number): Duration =
        software.amazon.awscdk.Duration.seconds(amount).let(Duration::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.Duration): Duration = Duration(cdkObject)

    internal fun unwrap(wrapped: Duration): software.amazon.awscdk.Duration = wrapped.cdkObject
  }
}
