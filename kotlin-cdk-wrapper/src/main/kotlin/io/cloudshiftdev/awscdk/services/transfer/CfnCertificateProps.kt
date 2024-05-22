@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCertificate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * CfnCertificateProps cfnCertificateProps = CfnCertificateProps.builder()
 * .certificate("certificate")
 * .usage("usage")
 * // the properties below are optional
 * .activeDate("activeDate")
 * .certificateChain("certificateChain")
 * .description("description")
 * .inactiveDate("inactiveDate")
 * .privateKey("privateKey")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html)
 */
public interface CfnCertificateProps {
  /**
   * An optional date that specifies when the certificate becomes active.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-activedate)
   */
  public fun activeDate(): String? = unwrap(this).getActiveDate()

  /**
   * The file name for the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-certificate)
   */
  public fun certificate(): String

  /**
   * The list of certificates that make up the chain for the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-certificatechain)
   */
  public fun certificateChain(): String? = unwrap(this).getCertificateChain()

  /**
   * The name or description that's used to identity the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional date that specifies when the certificate becomes inactive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-inactivedate)
   */
  public fun inactiveDate(): String? = unwrap(this).getInactiveDate()

  /**
   * The file that contains the private key for the certificate that's being imported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-privatekey)
   */
  public fun privateKey(): String? = unwrap(this).getPrivateKey()

  /**
   * Key-value pairs that can be used to group and search for certificates.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies how this certificate is used. It can be used in the following ways:.
   *
   * * `SIGNING` : For signing AS2 messages
   * * `ENCRYPTION` : For encrypting AS2 messages
   * * `TLS` : For securing AS2 communications sent over HTTPS
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-usage)
   */
  public fun usage(): String

  /**
   * A builder for [CfnCertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param activeDate An optional date that specifies when the certificate becomes active.
     */
    public fun activeDate(activeDate: String)

    /**
     * @param certificate The file name for the certificate. 
     */
    public fun certificate(certificate: String)

    /**
     * @param certificateChain The list of certificates that make up the chain for the certificate.
     */
    public fun certificateChain(certificateChain: String)

    /**
     * @param description The name or description that's used to identity the certificate.
     */
    public fun description(description: String)

    /**
     * @param inactiveDate An optional date that specifies when the certificate becomes inactive.
     */
    public fun inactiveDate(inactiveDate: String)

    /**
     * @param privateKey The file that contains the private key for the certificate that's being
     * imported.
     */
    public fun privateKey(privateKey: String)

    /**
     * @param tags Key-value pairs that can be used to group and search for certificates.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs that can be used to group and search for certificates.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param usage Specifies how this certificate is used. It can be used in the following ways:. 
     * * `SIGNING` : For signing AS2 messages
     * * `ENCRYPTION` : For encrypting AS2 messages
     * * `TLS` : For securing AS2 communications sent over HTTPS
     */
    public fun usage(usage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnCertificateProps.Builder =
        software.amazon.awscdk.services.transfer.CfnCertificateProps.builder()

    /**
     * @param activeDate An optional date that specifies when the certificate becomes active.
     */
    override fun activeDate(activeDate: String) {
      cdkBuilder.activeDate(activeDate)
    }

    /**
     * @param certificate The file name for the certificate. 
     */
    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    /**
     * @param certificateChain The list of certificates that make up the chain for the certificate.
     */
    override fun certificateChain(certificateChain: String) {
      cdkBuilder.certificateChain(certificateChain)
    }

    /**
     * @param description The name or description that's used to identity the certificate.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param inactiveDate An optional date that specifies when the certificate becomes inactive.
     */
    override fun inactiveDate(inactiveDate: String) {
      cdkBuilder.inactiveDate(inactiveDate)
    }

    /**
     * @param privateKey The file that contains the private key for the certificate that's being
     * imported.
     */
    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for certificates.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for certificates.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param usage Specifies how this certificate is used. It can be used in the following ways:. 
     * * `SIGNING` : For signing AS2 messages
     * * `ENCRYPTION` : For encrypting AS2 messages
     * * `TLS` : For securing AS2 communications sent over HTTPS
     */
    override fun usage(usage: String) {
      cdkBuilder.usage(usage)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.transfer.CfnCertificateProps,
  ) : CdkObject(cdkObject), CfnCertificateProps {
    /**
     * An optional date that specifies when the certificate becomes active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-activedate)
     */
    override fun activeDate(): String? = unwrap(this).getActiveDate()

    /**
     * The file name for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-certificate)
     */
    override fun certificate(): String = unwrap(this).getCertificate()

    /**
     * The list of certificates that make up the chain for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-certificatechain)
     */
    override fun certificateChain(): String? = unwrap(this).getCertificateChain()

    /**
     * The name or description that's used to identity the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An optional date that specifies when the certificate becomes inactive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-inactivedate)
     */
    override fun inactiveDate(): String? = unwrap(this).getInactiveDate()

    /**
     * The file that contains the private key for the certificate that's being imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-privatekey)
     */
    override fun privateKey(): String? = unwrap(this).getPrivateKey()

    /**
     * Key-value pairs that can be used to group and search for certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies how this certificate is used. It can be used in the following ways:.
     *
     * * `SIGNING` : For signing AS2 messages
     * * `ENCRYPTION` : For encrypting AS2 messages
     * * `TLS` : For securing AS2 communications sent over HTTPS
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-usage)
     */
    override fun usage(): String = unwrap(this).getUsage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnCertificateProps):
        CfnCertificateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCertificateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProps):
        software.amazon.awscdk.services.transfer.CfnCertificateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.transfer.CfnCertificateProps
  }
}
