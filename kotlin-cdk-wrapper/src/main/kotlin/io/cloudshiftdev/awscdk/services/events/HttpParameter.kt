@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * An additional HTTP parameter to send along with the OAuth request.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.events.*;
 * SecretValue secretValue;
 * HttpParameter httpParameter = HttpParameter.fromSecret(secretValue);
 * ```
 */
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
