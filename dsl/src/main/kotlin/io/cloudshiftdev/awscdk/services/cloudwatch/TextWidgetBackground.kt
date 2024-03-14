package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class TextWidgetBackground(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.TextWidgetBackground,
) {
  SOLID(software.amazon.awscdk.services.cloudwatch.TextWidgetBackground.SOLID),
  TRANSPARENT(software.amazon.awscdk.services.cloudwatch.TextWidgetBackground.TRANSPARENT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TextWidgetBackground):
        TextWidgetBackground = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.TextWidgetBackground.SOLID ->
          TextWidgetBackground.SOLID
      software.amazon.awscdk.services.cloudwatch.TextWidgetBackground.TRANSPARENT ->
          TextWidgetBackground.TRANSPARENT
    }

    internal fun unwrap(wrapped: TextWidgetBackground):
        software.amazon.awscdk.services.cloudwatch.TextWidgetBackground = wrapped.cdkObject
  }
}
