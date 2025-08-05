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
 * vpc.addClientVpnEndpoint("Endpoint", ClientVpnEndpointOptions.builder()
 * .cidr("10.100.0.0/16")
 * .serverCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/server-certificate-id")
 * // Mutual authentication
 * .clientCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/client-certificate-id")
 * // User-based authentication
 * .userBasedAuthentication(ClientVpnUserBasedAuthentication.federated(samlProvider))
 * .build());
 * ```
 */
public abstract class SamlMetadataDocument(
  cdkObject: software.amazon.awscdk.services.iam.SamlMetadataDocument,
) : CdkObject(cdkObject) {
  /**
   * The XML content of the metadata document.
   */
  public open fun xml(): String = unwrap(this).getXml()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.SamlMetadataDocument,
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
