@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class HttpParameter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.HttpParameter,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.HttpParameter,
  ) : HttpParameter(cdkObject)

  public companion object {
    public fun fromSecret(`value`: SecretValue): HttpParameter =
        software.amazon.awscdk.services.events.HttpParameter.fromSecret(`value`.let(SecretValue::unwrap)).let(HttpParameter::wrap)

    public fun fromString(`value`: String): HttpParameter =
        software.amazon.awscdk.services.events.HttpParameter.fromString(`value`).let(HttpParameter::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.HttpParameter):
        HttpParameter = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpParameter):
        software.amazon.awscdk.services.events.HttpParameter = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.HttpParameter
  }
}
