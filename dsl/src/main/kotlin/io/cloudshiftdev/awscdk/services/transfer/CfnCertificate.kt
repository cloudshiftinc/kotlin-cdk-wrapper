package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.transfer.CfnCertificate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * An optional date that specifies when the certificate becomes active.
   */
  public open fun activeDate(): String? = unwrap(this).getActiveDate()

  /**
   * An optional date that specifies when the certificate becomes active.
   */
  public open fun activeDate(`value`: String) {
    unwrap(this).setActiveDate(`value`)
  }

  /**
   * The unique Amazon Resource Name (ARN) for the certificate.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * An array of identifiers for the imported certificates.
   *
   * You use this identifier for working with profiles and partner profiles.
   */
  public open fun attrCertificateId(): String = unwrap(this).getAttrCertificateId()

  /**
   * The final date that the certificate is valid.
   */
  public open fun attrNotAfterDate(): String = unwrap(this).getAttrNotAfterDate()

  /**
   * The earliest date that the certificate is valid.
   */
  public open fun attrNotBeforeDate(): String = unwrap(this).getAttrNotBeforeDate()

  /**
   * The serial number for the certificate.
   */
  public open fun attrSerial(): String = unwrap(this).getAttrSerial()

  /**
   * The certificate can be either `ACTIVE` , `PENDING_ROTATION` , or `INACTIVE` .
   *
   * `PENDING_ROTATION` means that this certificate will replace the current certificate when it
   * expires.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * If a private key has been specified for the certificate, its type is
   * `CERTIFICATE_WITH_PRIVATE_KEY` .
   *
   * If there is no private key, the type is `CERTIFICATE` .
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * The file name for the certificate.
   */
  public open fun certificate(): String = unwrap(this).getCertificate()

  /**
   * The file name for the certificate.
   */
  public open fun certificate(`value`: String) {
    unwrap(this).setCertificate(`value`)
  }

  /**
   * The list of certificates that make up the chain for the certificate.
   */
  public open fun certificateChain(): String? = unwrap(this).getCertificateChain()

  /**
   * The list of certificates that make up the chain for the certificate.
   */
  public open fun certificateChain(`value`: String) {
    unwrap(this).setCertificateChain(`value`)
  }

  /**
   * The name or description that's used to identity the certificate.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The name or description that's used to identity the certificate.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * An optional date that specifies when the certificate becomes inactive.
   */
  public open fun inactiveDate(): String? = unwrap(this).getInactiveDate()

  /**
   * An optional date that specifies when the certificate becomes inactive.
   */
  public open fun inactiveDate(`value`: String) {
    unwrap(this).setInactiveDate(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The file that contains the private key for the certificate that's being imported.
   */
  public open fun privateKey(): String? = unwrap(this).getPrivateKey()

  /**
   * The file that contains the private key for the certificate that's being imported.
   */
  public open fun privateKey(`value`: String) {
    unwrap(this).setPrivateKey(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs that can be used to group and search for certificates.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs that can be used to group and search for certificates.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key-value pairs that can be used to group and search for certificates.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies whether this certificate is used for signing or encryption.
   */
  public open fun usage(): String = unwrap(this).getUsage()

  /**
   * Specifies whether this certificate is used for signing or encryption.
   */
  public open fun usage(`value`: String) {
    unwrap(this).setUsage(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.transfer.CfnCertificate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional date that specifies when the certificate becomes active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-activedate)
     * @param activeDate An optional date that specifies when the certificate becomes active. 
     */
    public fun activeDate(activeDate: String)

    /**
     * The file name for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-certificate)
     * @param certificate The file name for the certificate. 
     */
    public fun certificate(certificate: String)

    /**
     * The list of certificates that make up the chain for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-certificatechain)
     * @param certificateChain The list of certificates that make up the chain for the certificate. 
     */
    public fun certificateChain(certificateChain: String)

    /**
     * The name or description that's used to identity the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-description)
     * @param description The name or description that's used to identity the certificate. 
     */
    public fun description(description: String)

    /**
     * An optional date that specifies when the certificate becomes inactive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-inactivedate)
     * @param inactiveDate An optional date that specifies when the certificate becomes inactive. 
     */
    public fun inactiveDate(inactiveDate: String)

    /**
     * The file that contains the private key for the certificate that's being imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-privatekey)
     * @param privateKey The file that contains the private key for the certificate that's being
     * imported. 
     */
    public fun privateKey(privateKey: String)

    /**
     * Key-value pairs that can be used to group and search for certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-tags)
     * @param tags Key-value pairs that can be used to group and search for certificates. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs that can be used to group and search for certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-tags)
     * @param tags Key-value pairs that can be used to group and search for certificates. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies whether this certificate is used for signing or encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-usage)
     * @param usage Specifies whether this certificate is used for signing or encryption. 
     */
    public fun usage(usage: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnCertificate.Builder =
        software.amazon.awscdk.services.transfer.CfnCertificate.Builder.create(scope, id)

    /**
     * An optional date that specifies when the certificate becomes active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-activedate)
     * @param activeDate An optional date that specifies when the certificate becomes active. 
     */
    override fun activeDate(activeDate: String) {
      cdkBuilder.activeDate(activeDate)
    }

    /**
     * The file name for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-certificate)
     * @param certificate The file name for the certificate. 
     */
    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    /**
     * The list of certificates that make up the chain for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-certificatechain)
     * @param certificateChain The list of certificates that make up the chain for the certificate. 
     */
    override fun certificateChain(certificateChain: String) {
      cdkBuilder.certificateChain(certificateChain)
    }

    /**
     * The name or description that's used to identity the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-description)
     * @param description The name or description that's used to identity the certificate. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An optional date that specifies when the certificate becomes inactive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-inactivedate)
     * @param inactiveDate An optional date that specifies when the certificate becomes inactive. 
     */
    override fun inactiveDate(inactiveDate: String) {
      cdkBuilder.inactiveDate(inactiveDate)
    }

    /**
     * The file that contains the private key for the certificate that's being imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-privatekey)
     * @param privateKey The file that contains the private key for the certificate that's being
     * imported. 
     */
    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    /**
     * Key-value pairs that can be used to group and search for certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-tags)
     * @param tags Key-value pairs that can be used to group and search for certificates. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Key-value pairs that can be used to group and search for certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-tags)
     * @param tags Key-value pairs that can be used to group and search for certificates. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies whether this certificate is used for signing or encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-usage)
     * @param usage Specifies whether this certificate is used for signing or encryption. 
     */
    override fun usage(usage: String) {
      cdkBuilder.usage(usage)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnCertificate = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnCertificate):
        CfnCertificate = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate):
        software.amazon.awscdk.services.transfer.CfnCertificate = wrapped.cdkObject
  }
}
