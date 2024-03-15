@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String

public open class SecretStringValueBeta1 internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1,
) : CdkObject(cdkObject) {
  @Deprecated(message = "deprecated in CDK")
  public open fun secretValue(): String = unwrap(this).secretValue()

  public companion object {
    @Deprecated(message = "deprecated in CDK")
    public fun fromToken(secretValueFromToken: String): SecretStringValueBeta1 =
        software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1.fromToken(secretValueFromToken).let(SecretStringValueBeta1::wrap)

    @Deprecated(message = "deprecated in CDK")
    public fun fromUnsafePlaintext(secretValue: String): SecretStringValueBeta1 =
        software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1.fromUnsafePlaintext(secretValue).let(SecretStringValueBeta1::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1):
        SecretStringValueBeta1 = SecretStringValueBeta1(cdkObject)

    internal fun unwrap(wrapped: SecretStringValueBeta1):
        software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1 = wrapped.cdkObject
  }
}
