package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class VerticalShading(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.VerticalShading,
) {
  NONE(software.amazon.awscdk.services.cloudwatch.VerticalShading.NONE),
  BEFORE(software.amazon.awscdk.services.cloudwatch.VerticalShading.BEFORE),
  AFTER(software.amazon.awscdk.services.cloudwatch.VerticalShading.AFTER),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.VerticalShading):
        VerticalShading = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.VerticalShading.NONE -> VerticalShading.NONE
      software.amazon.awscdk.services.cloudwatch.VerticalShading.BEFORE -> VerticalShading.BEFORE
      software.amazon.awscdk.services.cloudwatch.VerticalShading.AFTER -> VerticalShading.AFTER
    }

    internal fun unwrap(wrapped: VerticalShading):
        software.amazon.awscdk.services.cloudwatch.VerticalShading = wrapped.cdkObject
  }
}
