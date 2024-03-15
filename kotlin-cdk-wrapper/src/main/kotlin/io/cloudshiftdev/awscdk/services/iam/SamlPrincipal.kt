@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

/**
 * Principal entity that represents a SAML federated identity provider.
 *
 * Example:
 *
 * ```
 * SamlProvider provider = SamlProvider.Builder.create(this, "Provider")
 * .metadataDocument(SamlMetadataDocument.fromFile("/path/to/saml-metadata-document.xml"))
 * .build();
 * SamlPrincipal principal = new SamlPrincipal(provider, Map.of(
 * "StringEquals", Map.of(
 * "SAML:iss", "issuer")));
 * ```
 */
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
