package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String

public open class SourceAccessConfigurationType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfigurationType,
) {
  public open fun type(): String = unwrap(this).getType()

  public companion object {
    public open fun of(name: String): SourceAccessConfigurationType =
        software.amazon.awscdk.services.lambda.SourceAccessConfigurationType.of(name).let(SourceAccessConfigurationType::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfigurationType):
        SourceAccessConfigurationType = SourceAccessConfigurationType(cdkObject)

    internal fun unwrap(wrapped: SourceAccessConfigurationType):
        software.amazon.awscdk.services.lambda.SourceAccessConfigurationType = wrapped.cdkObject
  }
}
