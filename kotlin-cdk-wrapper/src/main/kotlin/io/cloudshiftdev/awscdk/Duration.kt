@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a length of time.
 *
 * The amount can be specified either as a literal value (e.g: `10`) which
 * cannot be negative, or as an unresolved number token.
 *
 * When the amount is passed as a token, unit conversion is not possible.
 *
 * Example:
 *
 * ```
 * Role myRole;
 * AwsCustomResource.Builder.create(this, "Customized")
 * .role(myRole) // must be assumable by the `lambda.amazonaws.com` service principal
 * .timeout(Duration.minutes(10)) // defaults to 2 minutes
 * .logGroup(LogGroup.Builder.create(this, "AwsCustomResourceLogs")
 * .retention(RetentionDays.ONE_DAY)
 * .build())
 * .functionName("my-custom-name") // defaults to a CloudFormation generated name
 * .removalPolicy(RemovalPolicy.RETAIN) // defaults to `RemovalPolicy.DESTROY`
 * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
 * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
 * .build()))
 * .build();
 * ```
 */
public open class Duration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Duration,
) : CdkObject(cdkObject) {
  /**
   * Returns stringified number of duration.
   */
  public open fun formatTokenToNumber(): String = unwrap(this).formatTokenToNumber()

  /**
   * Checks if duration is a token or a resolvable object.
   */
  public open fun isUnresolved(): Boolean = unwrap(this).isUnresolved()

  /**
   * Substract two Durations together.
   *
   * @param rhs 
   */
  public open fun minus(rhs: Duration): Duration =
      unwrap(this).minus(rhs.let(Duration::unwrap)).let(Duration::wrap)

  /**
   * Add two Durations together.
   *
   * @param rhs 
   */
  public open fun plus(rhs: Duration): Duration =
      unwrap(this).plus(rhs.let(Duration::unwrap)).let(Duration::wrap)

  /**
   * Return the total number of days in this Duration.
   *
   * @return the value of this `Duration` expressed in Days.
   * @param opts
   */
  public open fun toDays(): Number = unwrap(this).toDays()

  /**
   * Return the total number of days in this Duration.
   *
   * @return the value of this `Duration` expressed in Days.
   * @param opts
   */
  public open fun toDays(opts: TimeConversionOptions): Number =
      unwrap(this).toDays(opts.let(TimeConversionOptions::unwrap))

  /**
   * Return the total number of days in this Duration.
   *
   * @return the value of this `Duration` expressed in Days.
   * @param opts
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("953e853854a579671895c309b1b3890d6e4ccc449d4de8984a198683fb581d80")
  public open fun toDays(opts: TimeConversionOptions.Builder.() -> Unit): Number =
      toDays(TimeConversionOptions(opts))

  /**
   * Return the total number of hours in this Duration.
   *
   * @return the value of this `Duration` expressed in Hours.
   * @param opts
   */
  public open fun toHours(): Number = unwrap(this).toHours()

  /**
   * Return the total number of hours in this Duration.
   *
   * @return the value of this `Duration` expressed in Hours.
   * @param opts
   */
  public open fun toHours(opts: TimeConversionOptions): Number =
      unwrap(this).toHours(opts.let(TimeConversionOptions::unwrap))

  /**
   * Return the total number of hours in this Duration.
   *
   * @return the value of this `Duration` expressed in Hours.
   * @param opts
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c690032d9ef85b9cd02aa68ce00f91634e218b5257bd32acd08489ba4c7b7be")
  public open fun toHours(opts: TimeConversionOptions.Builder.() -> Unit): Number =
      toHours(TimeConversionOptions(opts))

  /**
   * Turn this duration into a human-readable string.
   */
  public open fun toHumanString(): String = unwrap(this).toHumanString()

  /**
   * Return an ISO 8601 representation of this period.
   *
   * @return a string starting with 'P' describing the period
   * [Documentation](https://www.iso.org/standard/70907.html)
   */
  public open fun toIsoString(): String = unwrap(this).toIsoString()

  /**
   * Return the total number of milliseconds in this Duration.
   *
   * @return the value of this `Duration` expressed in Milliseconds.
   * @param opts
   */
  public open fun toMilliseconds(): Number = unwrap(this).toMilliseconds()

  /**
   * Return the total number of milliseconds in this Duration.
   *
   * @return the value of this `Duration` expressed in Milliseconds.
   * @param opts
   */
  public open fun toMilliseconds(opts: TimeConversionOptions): Number =
      unwrap(this).toMilliseconds(opts.let(TimeConversionOptions::unwrap))

  /**
   * Return the total number of milliseconds in this Duration.
   *
   * @return the value of this `Duration` expressed in Milliseconds.
   * @param opts
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0abfa22579d7d19c9796064df4d5598c0ff49bc15b3a3600c05bd1249bd38fd7")
  public open fun toMilliseconds(opts: TimeConversionOptions.Builder.() -> Unit): Number =
      toMilliseconds(TimeConversionOptions(opts))

  /**
   * Return the total number of minutes in this Duration.
   *
   * @return the value of this `Duration` expressed in Minutes.
   * @param opts
   */
  public open fun toMinutes(): Number = unwrap(this).toMinutes()

  /**
   * Return the total number of minutes in this Duration.
   *
   * @return the value of this `Duration` expressed in Minutes.
   * @param opts
   */
  public open fun toMinutes(opts: TimeConversionOptions): Number =
      unwrap(this).toMinutes(opts.let(TimeConversionOptions::unwrap))

  /**
   * Return the total number of minutes in this Duration.
   *
   * @return the value of this `Duration` expressed in Minutes.
   * @param opts
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("888c8440e6fc7681d3d5c5e7f4e4d35a04df98f051b7089d67818e365afa61cc")
  public open fun toMinutes(opts: TimeConversionOptions.Builder.() -> Unit): Number =
      toMinutes(TimeConversionOptions(opts))

  /**
   * Return the total number of seconds in this Duration.
   *
   * @return the value of this `Duration` expressed in Seconds.
   * @param opts
   */
  public open fun toSeconds(): Number = unwrap(this).toSeconds()

  /**
   * Return the total number of seconds in this Duration.
   *
   * @return the value of this `Duration` expressed in Seconds.
   * @param opts
   */
  public open fun toSeconds(opts: TimeConversionOptions): Number =
      unwrap(this).toSeconds(opts.let(TimeConversionOptions::unwrap))

  /**
   * Return the total number of seconds in this Duration.
   *
   * @return the value of this `Duration` expressed in Seconds.
   * @param opts
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08be316a0b35bbb9305a50cbbee6fcd14e90e257d0c00e6108c84e210903c37f")
  public open fun toSeconds(opts: TimeConversionOptions.Builder.() -> Unit): Number =
      toSeconds(TimeConversionOptions(opts))

  /**
   * Returns unit of the duration.
   */
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
