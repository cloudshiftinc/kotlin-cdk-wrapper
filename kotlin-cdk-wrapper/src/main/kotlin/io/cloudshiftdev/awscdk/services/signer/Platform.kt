@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class Platform internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.signer.Platform,
) : CdkObject(cdkObject) {
  public open fun platformId(): String = unwrap(this).getPlatformId()

  public companion object {
    public val AMAZON_FREE_RTOS_DEFAULT: Platform =
        Platform.wrap(software.amazon.awscdk.services.signer.Platform.AMAZON_FREE_RTOS_DEFAULT)

    public val AMAZON_FREE_RTOS_TI_CC3220_SF: Platform =
        Platform.wrap(software.amazon.awscdk.services.signer.Platform.AMAZON_FREE_RTOS_TI_CC3220_SF)

    public val AWS_IOT_DEVICE_MANAGEMENT_SHA256_ECDSA: Platform =
        Platform.wrap(software.amazon.awscdk.services.signer.Platform.AWS_IOT_DEVICE_MANAGEMENT_SHA256_ECDSA)

    public val AWS_LAMBDA_SHA384_ECDSA: Platform =
        Platform.wrap(software.amazon.awscdk.services.signer.Platform.AWS_LAMBDA_SHA384_ECDSA)

    public val NOTATION_OCI_SHA384_ECDSA: Platform =
        Platform.wrap(software.amazon.awscdk.services.signer.Platform.NOTATION_OCI_SHA384_ECDSA)

    public fun of(platformId: String): Platform =
        software.amazon.awscdk.services.signer.Platform.of(platformId).let(Platform::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.Platform): Platform =
        Platform(cdkObject)

    internal fun unwrap(wrapped: Platform): software.amazon.awscdk.services.signer.Platform =
        wrapped.cdkObject
  }
}
