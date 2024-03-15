@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

/**
 * Principal entity that represents a SAML federated identity provider for programmatic and AWS
 * Management Console access.
 *
 * Example:
 *
 * ```
 * SamlProvider provider = SamlProvider.Builder.create(this, "Provider")
 * .metadataDocument(SamlMetadataDocument.fromFile("/path/to/saml-metadata-document.xml"))
 * .build();
 * Role.Builder.create(this, "Role")
 * .assumedBy(new SamlConsolePrincipal(provider))
 * .build();
 * ```
 */
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
