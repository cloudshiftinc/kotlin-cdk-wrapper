@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.transfer.CfnCertificateProps

@CdkDslMarker
public class CfnCertificatePropsDsl {
  private val cdkBuilder: CfnCertificateProps.Builder = CfnCertificateProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param activeDate An optional date that specifies when the certificate becomes active.
   */
  public fun activeDate(activeDate: String) {
    cdkBuilder.activeDate(activeDate)
  }

  /**
   * @param certificate The file name for the certificate. 
   */
  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param certificateChain The list of certificates that make up the chain for the certificate.
   */
  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  /**
   * @param description The name or description that's used to identity the certificate.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param inactiveDate An optional date that specifies when the certificate becomes inactive.
   */
  public fun inactiveDate(inactiveDate: String) {
    cdkBuilder.inactiveDate(inactiveDate)
  }

  /**
   * @param privateKey The file that contains the private key for the certificate that's being
   * imported.
   */
  public fun privateKey(privateKey: String) {
    cdkBuilder.privateKey(privateKey)
  }

  /**
   * @param tags Key-value pairs that can be used to group and search for certificates.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Key-value pairs that can be used to group and search for certificates.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param usage Specifies whether this certificate is used for signing or encryption. 
   */
  public fun usage(usage: String) {
    cdkBuilder.usage(usage)
  }

  public fun build(): CfnCertificateProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
