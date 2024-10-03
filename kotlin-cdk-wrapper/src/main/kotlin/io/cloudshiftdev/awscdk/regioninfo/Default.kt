@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.regioninfo

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String

/**
 * (deprecated) Provides default values for certain regional information points.
 *
 * This class is no longer needed because service principals are no longer needed except in very
 * specific cases
 * that are handled in the IAM ServicePrincipal class.
 *
 * * Service principals are now globally `&lt;SERVICE&gt;.amazonaws.com`, use iam.ServicePrincipal
 * instead.
 */
public open class Default(
  cdkObject: software.amazon.awscdk.regioninfo.Default,
) : CdkObject(cdkObject) {
  public companion object {
    public val VPC_ENDPOINT_SERVICE_NAME_PREFIX: String =
        software.amazon.awscdk.regioninfo.Default.VPC_ENDPOINT_SERVICE_NAME_PREFIX

    @Deprecated(message = "deprecated in CDK")
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
