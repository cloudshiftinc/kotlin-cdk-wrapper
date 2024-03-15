@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

public open class AnyPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.AnyPrincipal,
) : ArnPrincipal(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AnyPrincipal): AnyPrincipal =
        AnyPrincipal(cdkObject)

    internal fun unwrap(wrapped: AnyPrincipal): software.amazon.awscdk.services.iam.AnyPrincipal =
        wrapped.cdkObject
  }
}
