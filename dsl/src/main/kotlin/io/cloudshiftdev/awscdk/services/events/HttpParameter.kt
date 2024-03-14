package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.SecretValue
import kotlin.String

public abstract class HttpParameter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.HttpParameter,
) {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.HttpParameter,
  ) : HttpParameter(cdkObject)

  public companion object {
    public open fun fromSecret(`value`: SecretValue): HttpParameter =
        software.amazon.awscdk.services.events.HttpParameter.fromSecret(`value`.let(SecretValue::unwrap)).let(HttpParameter::wrap)

    public open fun fromString(`value`: String): HttpParameter =
        software.amazon.awscdk.services.events.HttpParameter.fromString(`value`).let(HttpParameter::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.HttpParameter):
        HttpParameter = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpParameter):
        software.amazon.awscdk.services.events.HttpParameter = (wrapped as Wrapper).cdkObject
  }
}
