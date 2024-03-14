package io.cloudshiftdev.awscdk.services.iam

public open class SamlPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.SamlPrincipal,
) : FederatedPrincipal(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.SamlPrincipal): SamlPrincipal =
        SamlPrincipal(cdkObject)

    internal fun unwrap(wrapped: SamlPrincipal): software.amazon.awscdk.services.iam.SamlPrincipal =
        wrapped.cdkObject
  }
}
