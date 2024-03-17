@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A SAML metadata document.
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
public abstract class SamlMetadataDocument internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.SamlMetadataDocument,
) : CdkObject(cdkObject) {
  /**
   * The XML content of the metadata document.
   */
  public open fun xml(): String = unwrap(this).getXml()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.SamlMetadataDocument,
  ) : SamlMetadataDocument(cdkObject)

  public companion object {
    public fun fromFile(path: String): SamlMetadataDocument =
        software.amazon.awscdk.services.iam.SamlMetadataDocument.fromFile(path).let(SamlMetadataDocument::wrap)

    public fun fromXml(xml: String): SamlMetadataDocument =
        software.amazon.awscdk.services.iam.SamlMetadataDocument.fromXml(xml).let(SamlMetadataDocument::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.SamlMetadataDocument):
        SamlMetadataDocument = CdkObjectWrappers.wrap(cdkObject) as? SamlMetadataDocument ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SamlMetadataDocument):
        software.amazon.awscdk.services.iam.SamlMetadataDocument = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.SamlMetadataDocument
  }
}
