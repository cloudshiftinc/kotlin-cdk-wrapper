package io.cloudshiftdev.awscdk.services.lambda.nodejs

public enum class SourceMapMode(
  private val cdkObject: software.amazon.awscdk.services.lambda.nodejs.SourceMapMode,
) {
  DEFAULT(software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.DEFAULT),
  EXTERNAL(software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.EXTERNAL),
  INLINE(software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.INLINE),
  BOTH(software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.BOTH),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.nodejs.SourceMapMode):
        SourceMapMode = when (cdkObject) {
      software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.DEFAULT -> SourceMapMode.DEFAULT
      software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.EXTERNAL -> SourceMapMode.EXTERNAL
      software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.INLINE -> SourceMapMode.INLINE
      software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.BOTH -> SourceMapMode.BOTH
    }

    internal fun unwrap(wrapped: SourceMapMode):
        software.amazon.awscdk.services.lambda.nodejs.SourceMapMode = wrapped.cdkObject
  }
}
