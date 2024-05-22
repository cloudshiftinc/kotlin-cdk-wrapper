@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::Certificate` resource to declare an AWS IoT X.509 certificate. For information
 * about working with X.509 certificates, see [X.509 Client
 * Certificates](https://docs.aws.amazon.com/iot/latest/developerguide/x509-client-certs.html) in the
 * *AWS IoT Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
 * .status("status")
 * // the properties below are optional
 * .caCertificatePem("caCertificatePem")
 * .certificateMode("certificateMode")
 * .certificatePem("certificatePem")
 * .certificateSigningRequest("certificateSigningRequest")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html)
 */
public open class CfnCertificate(
  cdkObject: software.amazon.awscdk.services.iot.CfnCertificate,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCertificateProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnCertificate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCertificateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCertificateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCertificateProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) for the certificate. For example:.
   *
   * `{ "Fn::GetAtt": ["MyCertificate", "Arn"] }`
   *
   * A value similar to the following is returned:
   *
   * `arn:aws:iot:ap-southeast-2:123456789012:cert/a1234567b89c012d3e4fg567hij8k9l01mno1p23q45678901rs234567890t1u2`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The certificate ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The CA certificate used to sign the device certificate being registered, not available when
   * CertificateMode is SNI_ONLY.
   */
  public open fun caCertificatePem(): String? = unwrap(this).getCaCertificatePem()

  /**
   * The CA certificate used to sign the device certificate being registered, not available when
   * CertificateMode is SNI_ONLY.
   */
  public open fun caCertificatePem(`value`: String) {
    unwrap(this).setCaCertificatePem(`value`)
  }

  /**
   * Specifies which mode of certificate registration to use with this resource.
   */
  public open fun certificateMode(): String? = unwrap(this).getCertificateMode()

  /**
   * Specifies which mode of certificate registration to use with this resource.
   */
  public open fun certificateMode(`value`: String) {
    unwrap(this).setCertificateMode(`value`)
  }

  /**
   * The certificate data in PEM format.
   */
  public open fun certificatePem(): String? = unwrap(this).getCertificatePem()

  /**
   * The certificate data in PEM format.
   */
  public open fun certificatePem(`value`: String) {
    unwrap(this).setCertificatePem(`value`)
  }

  /**
   * The certificate signing request (CSR).
   */
  public open fun certificateSigningRequest(): String? = unwrap(this).getCertificateSigningRequest()

  /**
   * The certificate signing request (CSR).
   */
  public open fun certificateSigningRequest(`value`: String) {
    unwrap(this).setCertificateSigningRequest(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The status of the certificate.
   */
  public open fun status(): String = unwrap(this).getStatus()

  /**
   * The status of the certificate.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnCertificate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CA certificate used to sign the device certificate being registered, not available when
     * CertificateMode is SNI_ONLY.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-cacertificatepem)
     * @param caCertificatePem The CA certificate used to sign the device certificate being
     * registered, not available when CertificateMode is SNI_ONLY. 
     */
    public fun caCertificatePem(caCertificatePem: String)

    /**
     * Specifies which mode of certificate registration to use with this resource.
     *
     * Valid options are DEFAULT with CaCertificatePem and CertificatePem, SNI_ONLY with
     * CertificatePem, and Default with CertificateSigningRequest.
     *
     * `DEFAULT` : A certificate in `DEFAULT` mode is either generated by AWS IoT Core or registered
     * with an issuer certificate authority (CA). Devices with certificates in `DEFAULT` mode aren't
     * required to send the Server Name Indication (SNI) extension when connecting to AWS IoT Core .
     * However, to use features such as custom domains and VPC endpoints, we recommend that you use the
     * SNI extension when connecting to AWS IoT Core .
     *
     * `SNI_ONLY` : A certificate in `SNI_ONLY` mode is registered without an issuer CA. Devices
     * with certificates in `SNI_ONLY` mode must send the SNI extension when connecting to AWS IoT Core
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatemode)
     * @param certificateMode Specifies which mode of certificate registration to use with this
     * resource. 
     */
    public fun certificateMode(certificateMode: String)

    /**
     * The certificate data in PEM format.
     *
     * Requires SNI_ONLY for the certificate mode or the accompanying CACertificatePem for
     * registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatepem)
     * @param certificatePem The certificate data in PEM format. 
     */
    public fun certificatePem(certificatePem: String)

    /**
     * The certificate signing request (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatesigningrequest)
     * @param certificateSigningRequest The certificate signing request (CSR). 
     */
    public fun certificateSigningRequest(certificateSigningRequest: String)

    /**
     * The status of the certificate.
     *
     * Valid values are ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER, and PENDING_ACTIVATION.
     *
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-status)
     * @param status The status of the certificate. 
     */
    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCertificate.Builder =
        software.amazon.awscdk.services.iot.CfnCertificate.Builder.create(scope, id)

    /**
     * The CA certificate used to sign the device certificate being registered, not available when
     * CertificateMode is SNI_ONLY.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-cacertificatepem)
     * @param caCertificatePem The CA certificate used to sign the device certificate being
     * registered, not available when CertificateMode is SNI_ONLY. 
     */
    override fun caCertificatePem(caCertificatePem: String) {
      cdkBuilder.caCertificatePem(caCertificatePem)
    }

    /**
     * Specifies which mode of certificate registration to use with this resource.
     *
     * Valid options are DEFAULT with CaCertificatePem and CertificatePem, SNI_ONLY with
     * CertificatePem, and Default with CertificateSigningRequest.
     *
     * `DEFAULT` : A certificate in `DEFAULT` mode is either generated by AWS IoT Core or registered
     * with an issuer certificate authority (CA). Devices with certificates in `DEFAULT` mode aren't
     * required to send the Server Name Indication (SNI) extension when connecting to AWS IoT Core .
     * However, to use features such as custom domains and VPC endpoints, we recommend that you use the
     * SNI extension when connecting to AWS IoT Core .
     *
     * `SNI_ONLY` : A certificate in `SNI_ONLY` mode is registered without an issuer CA. Devices
     * with certificates in `SNI_ONLY` mode must send the SNI extension when connecting to AWS IoT Core
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatemode)
     * @param certificateMode Specifies which mode of certificate registration to use with this
     * resource. 
     */
    override fun certificateMode(certificateMode: String) {
      cdkBuilder.certificateMode(certificateMode)
    }

    /**
     * The certificate data in PEM format.
     *
     * Requires SNI_ONLY for the certificate mode or the accompanying CACertificatePem for
     * registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatepem)
     * @param certificatePem The certificate data in PEM format. 
     */
    override fun certificatePem(certificatePem: String) {
      cdkBuilder.certificatePem(certificatePem)
    }

    /**
     * The certificate signing request (CSR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatesigningrequest)
     * @param certificateSigningRequest The certificate signing request (CSR). 
     */
    override fun certificateSigningRequest(certificateSigningRequest: String) {
      cdkBuilder.certificateSigningRequest(certificateSigningRequest)
    }

    /**
     * The status of the certificate.
     *
     * Valid values are ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER, and PENDING_ACTIVATION.
     *
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-status)
     * @param status The status of the certificate. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnCertificate = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnCertificate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCertificate): CfnCertificate
        = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate): software.amazon.awscdk.services.iot.CfnCertificate
        = wrapped.cdkObject as software.amazon.awscdk.services.iot.CfnCertificate
  }
}
