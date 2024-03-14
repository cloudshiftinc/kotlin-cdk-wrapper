package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class S3Code internal constructor(
  private val cdkObject: software.amazon.awscdk.services.synthetics.S3Code,
) : Code(cdkObject) {
  public override fun bind(
    _scope: Construct,
    _handler: String,
    _family: RuntimeFamily,
  ): CodeConfig = unwrap(this).bind(_scope.let(Construct::unwrap), _handler,
      _family.let(RuntimeFamily::unwrap)).let(CodeConfig::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.S3Code): S3Code =
        S3Code(cdkObject)

    internal fun unwrap(wrapped: S3Code): software.amazon.awscdk.services.synthetics.S3Code =
        wrapped.cdkObject
  }
}
