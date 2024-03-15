@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class ClientAttributes internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.ClientAttributes,
) : CdkObject(cdkObject) {
  public open fun attributes(): List<String> = unwrap(this).attributes()

  public open fun withCustomAttributes(attributes: String): ClientAttributes =
      unwrap(this).withCustomAttributes(attributes).let(ClientAttributes::wrap)

  public open fun withStandardAttributes(attributes: StandardAttributesMask): ClientAttributes =
      unwrap(this).withStandardAttributes(attributes.let(StandardAttributesMask::unwrap)).let(ClientAttributes::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b92efc43d9edc56ffb41e35942a05b2fa0e6a82608012541a2e38c3c0dd445ba")
  public open fun withStandardAttributes(attributes: StandardAttributesMask.Builder.() -> Unit):
      ClientAttributes = withStandardAttributes(StandardAttributesMask(attributes))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ClientAttributes):
        ClientAttributes = ClientAttributes(cdkObject)

    internal fun unwrap(wrapped: ClientAttributes):
        software.amazon.awscdk.services.cognito.ClientAttributes = wrapped.cdkObject
  }
}
