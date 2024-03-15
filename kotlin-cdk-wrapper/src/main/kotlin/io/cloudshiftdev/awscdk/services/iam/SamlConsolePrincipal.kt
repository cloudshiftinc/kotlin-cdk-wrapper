@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

public open class SamlConsolePrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.SamlConsolePrincipal,
) : SamlPrincipal(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.SamlConsolePrincipal):
        SamlConsolePrincipal = SamlConsolePrincipal(cdkObject)

    internal fun unwrap(wrapped: SamlConsolePrincipal):
        software.amazon.awscdk.services.iam.SamlConsolePrincipal = wrapped.cdkObject
  }
}
