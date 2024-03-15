@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Placeholders which can be used manifests.
 *
 * These can occur both in the Asset Manifest as well as the general
 * Cloud Assembly manifest.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * EnvironmentPlaceholders environmentPlaceholders = new EnvironmentPlaceholders();
 * ```
 */
public open class EnvironmentPlaceholders internal constructor(
  internal override val cdkObject: software.amazon.awscdk.cxapi.EnvironmentPlaceholders,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.cxapi.EnvironmentPlaceholders())

  public companion object {
    public val CURRENT_ACCOUNT: String =
        software.amazon.awscdk.cxapi.EnvironmentPlaceholders.CURRENT_ACCOUNT

    public val CURRENT_PARTITION: String =
        software.amazon.awscdk.cxapi.EnvironmentPlaceholders.CURRENT_PARTITION

    public val CURRENT_REGION: String =
        software.amazon.awscdk.cxapi.EnvironmentPlaceholders.CURRENT_REGION

    public fun replace(`object`: Any, values: EnvironmentPlaceholderValues): Any =
        software.amazon.awscdk.cxapi.EnvironmentPlaceholders.replace(`object`,
        values.let(EnvironmentPlaceholderValues::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("785e3c820271672ee7ab806f3653d017d158b5caa7cafba34113e206fe0f8e00")
    public fun replace(`object`: Any, values: EnvironmentPlaceholderValues.Builder.() -> Unit): Any
        = replace(`object`, EnvironmentPlaceholderValues(values))

    public fun replaceAsync(`object`: Any, provider: IEnvironmentPlaceholderProvider): Any =
        software.amazon.awscdk.cxapi.EnvironmentPlaceholders.replaceAsync(`object`,
        provider.let(IEnvironmentPlaceholderProvider::unwrap))

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.EnvironmentPlaceholders):
        EnvironmentPlaceholders = EnvironmentPlaceholders(cdkObject)

    internal fun unwrap(wrapped: EnvironmentPlaceholders):
        software.amazon.awscdk.cxapi.EnvironmentPlaceholders = wrapped.cdkObject
  }
}
