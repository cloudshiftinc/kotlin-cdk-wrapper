package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class Unit(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.Unit,
) {
  SECONDS(software.amazon.awscdk.services.cloudwatch.Unit.SECONDS),
  MICROSECONDS(software.amazon.awscdk.services.cloudwatch.Unit.MICROSECONDS),
  MILLISECONDS(software.amazon.awscdk.services.cloudwatch.Unit.MILLISECONDS),
  BYTES(software.amazon.awscdk.services.cloudwatch.Unit.BYTES),
  KILOBYTES(software.amazon.awscdk.services.cloudwatch.Unit.KILOBYTES),
  MEGABYTES(software.amazon.awscdk.services.cloudwatch.Unit.MEGABYTES),
  GIGABYTES(software.amazon.awscdk.services.cloudwatch.Unit.GIGABYTES),
  TERABYTES(software.amazon.awscdk.services.cloudwatch.Unit.TERABYTES),
  BITS(software.amazon.awscdk.services.cloudwatch.Unit.BITS),
  KILOBITS(software.amazon.awscdk.services.cloudwatch.Unit.KILOBITS),
  MEGABITS(software.amazon.awscdk.services.cloudwatch.Unit.MEGABITS),
  GIGABITS(software.amazon.awscdk.services.cloudwatch.Unit.GIGABITS),
  TERABITS(software.amazon.awscdk.services.cloudwatch.Unit.TERABITS),
  PERCENT(software.amazon.awscdk.services.cloudwatch.Unit.PERCENT),
  COUNT(software.amazon.awscdk.services.cloudwatch.Unit.COUNT),
  BYTES_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.BYTES_PER_SECOND),
  KILOBYTES_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.KILOBYTES_PER_SECOND),
  MEGABYTES_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.MEGABYTES_PER_SECOND),
  GIGABYTES_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.GIGABYTES_PER_SECOND),
  TERABYTES_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.TERABYTES_PER_SECOND),
  BITS_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.BITS_PER_SECOND),
  KILOBITS_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.KILOBITS_PER_SECOND),
  MEGABITS_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.MEGABITS_PER_SECOND),
  GIGABITS_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.GIGABITS_PER_SECOND),
  TERABITS_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.TERABITS_PER_SECOND),
  COUNT_PER_SECOND(software.amazon.awscdk.services.cloudwatch.Unit.COUNT_PER_SECOND),
  NONE(software.amazon.awscdk.services.cloudwatch.Unit.NONE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Unit): Unit = when
        (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.Unit.SECONDS -> Unit.SECONDS
      software.amazon.awscdk.services.cloudwatch.Unit.MICROSECONDS -> Unit.MICROSECONDS
      software.amazon.awscdk.services.cloudwatch.Unit.MILLISECONDS -> Unit.MILLISECONDS
      software.amazon.awscdk.services.cloudwatch.Unit.BYTES -> Unit.BYTES
      software.amazon.awscdk.services.cloudwatch.Unit.KILOBYTES -> Unit.KILOBYTES
      software.amazon.awscdk.services.cloudwatch.Unit.MEGABYTES -> Unit.MEGABYTES
      software.amazon.awscdk.services.cloudwatch.Unit.GIGABYTES -> Unit.GIGABYTES
      software.amazon.awscdk.services.cloudwatch.Unit.TERABYTES -> Unit.TERABYTES
      software.amazon.awscdk.services.cloudwatch.Unit.BITS -> Unit.BITS
      software.amazon.awscdk.services.cloudwatch.Unit.KILOBITS -> Unit.KILOBITS
      software.amazon.awscdk.services.cloudwatch.Unit.MEGABITS -> Unit.MEGABITS
      software.amazon.awscdk.services.cloudwatch.Unit.GIGABITS -> Unit.GIGABITS
      software.amazon.awscdk.services.cloudwatch.Unit.TERABITS -> Unit.TERABITS
      software.amazon.awscdk.services.cloudwatch.Unit.PERCENT -> Unit.PERCENT
      software.amazon.awscdk.services.cloudwatch.Unit.COUNT -> Unit.COUNT
      software.amazon.awscdk.services.cloudwatch.Unit.BYTES_PER_SECOND -> Unit.BYTES_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.KILOBYTES_PER_SECOND ->
          Unit.KILOBYTES_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.MEGABYTES_PER_SECOND ->
          Unit.MEGABYTES_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.GIGABYTES_PER_SECOND ->
          Unit.GIGABYTES_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.TERABYTES_PER_SECOND ->
          Unit.TERABYTES_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.BITS_PER_SECOND -> Unit.BITS_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.KILOBITS_PER_SECOND ->
          Unit.KILOBITS_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.MEGABITS_PER_SECOND ->
          Unit.MEGABITS_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.GIGABITS_PER_SECOND ->
          Unit.GIGABITS_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.TERABITS_PER_SECOND ->
          Unit.TERABITS_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.COUNT_PER_SECOND -> Unit.COUNT_PER_SECOND
      software.amazon.awscdk.services.cloudwatch.Unit.NONE -> Unit.NONE
    }

    internal fun unwrap(wrapped: Unit): software.amazon.awscdk.services.cloudwatch.Unit =
        wrapped.cdkObject
  }
}
