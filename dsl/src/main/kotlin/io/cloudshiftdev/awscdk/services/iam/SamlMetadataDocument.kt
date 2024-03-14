package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

public abstract class SamlMetadataDocument internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.SamlMetadataDocument,
) {
  /**
   * The XML content of the metadata document.
   */
  public open fun xml(): String = unwrap(this).getXml()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.SamlMetadataDocument,
  ) : SamlMetadataDocument(cdkObject)

  public companion object {
    public fun fromFile(path: String): SamlMetadataDocument =
        software.amazon.awscdk.services.iam.SamlMetadataDocument.fromFile(path).let(SamlMetadataDocument::wrap)

    public fun fromXml(xml: String): SamlMetadataDocument =
        software.amazon.awscdk.services.iam.SamlMetadataDocument.fromXml(xml).let(SamlMetadataDocument::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.SamlMetadataDocument):
        SamlMetadataDocument = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SamlMetadataDocument):
        software.amazon.awscdk.services.iam.SamlMetadataDocument = (wrapped as Wrapper).cdkObject
  }
}
