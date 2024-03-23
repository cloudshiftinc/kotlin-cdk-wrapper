@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.regioninfo

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Provides default values for certain regional information points.
 */
public open class Default(
  cdkObject: software.amazon.awscdk.regioninfo.Default,
) : CdkObject(cdkObject) {
  public companion object {
    public val VPC_ENDPOINT_SERVICE_NAME_PREFIX: String =
        software.amazon.awscdk.regioninfo.Default.VPC_ENDPOINT_SERVICE_NAME_PREFIX

    public fun servicePrincipal(
      serviceFqn: String,
      region: String,
      urlSuffix: String,
    ): String = software.amazon.awscdk.regioninfo.Default.servicePrincipal(serviceFqn, region,
        urlSuffix)

    internal fun wrap(cdkObject: software.amazon.awscdk.regioninfo.Default): Default =
        Default(cdkObject)

    internal fun unwrap(wrapped: Default): software.amazon.awscdk.regioninfo.Default =
        wrapped.cdkObject as software.amazon.awscdk.regioninfo.Default
  }
}
