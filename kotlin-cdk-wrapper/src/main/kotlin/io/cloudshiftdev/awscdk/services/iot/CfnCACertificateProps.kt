@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCACertificate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnCACertificateProps cfnCACertificateProps = CfnCACertificateProps.builder()
 * .caCertificatePem("caCertificatePem")
 * .status("status")
 * // the properties below are optional
 * .autoRegistrationStatus("autoRegistrationStatus")
 * .certificateMode("certificateMode")
 * .registrationConfig(RegistrationConfigProperty.builder()
 * .roleArn("roleArn")
 * .templateBody("templateBody")
 * .templateName("templateName")
 * .build())
 * .removeAutoRegistration(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .verificationCertificatePem("verificationCertificatePem")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html)
 */
public interface CfnCACertificateProps {
  /**
   * Whether the CA certificate is configured for auto registration of device certificates.
   *
   * Valid values are "ENABLE" and "DISABLE".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-autoregistrationstatus)
   */
  public fun autoRegistrationStatus(): String? = unwrap(this).getAutoRegistrationStatus()

  /**
   * The certificate data in PEM format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-cacertificatepem)
   */
  public fun caCertificatePem(): String

  /**
   * The mode of the CA.
   *
   * All the device certificates that are registered using this CA will be registered in the same
   * mode as the CA. For more information about certificate mode for device certificates, see
   * [certificate
   * mode](https://docs.aws.amazon.com//iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode)
   * .
   *
   * Valid values are "DEFAULT" and "SNI_ONLY".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-certificatemode)
   */
  public fun certificateMode(): String? = unwrap(this).getCertificateMode()

  /**
   * Information about the registration configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-registrationconfig)
   */
  public fun registrationConfig(): Any? = unwrap(this).getRegistrationConfig()

  /**
   * If true, removes auto registration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-removeautoregistration)
   */
  public fun removeAutoRegistration(): Any? = unwrap(this).getRemoveAutoRegistration()

  /**
   * The status of the CA certificate.
   *
   * Valid values are "ACTIVE" and "INACTIVE".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-status)
   */
  public fun status(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The private key verification certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-verificationcertificatepem)
   */
  public fun verificationCertificatePem(): String? = unwrap(this).getVerificationCertificatePem()

  /**
   * A builder for [CfnCACertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoRegistrationStatus Whether the CA certificate is configured for auto registration
     * of device certificates.
     * Valid values are "ENABLE" and "DISABLE".
     */
    public fun autoRegistrationStatus(autoRegistrationStatus: String)

    /**
     * @param caCertificatePem The certificate data in PEM format. 
     */
    public fun caCertificatePem(caCertificatePem: String)

    /**
     * @param certificateMode The mode of the CA.
     * All the device certificates that are registered using this CA will be registered in the same
     * mode as the CA. For more information about certificate mode for device certificates, see
     * [certificate
     * mode](https://docs.aws.amazon.com//iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode)
     * .
     *
     * Valid values are "DEFAULT" and "SNI_ONLY".
     */
    public fun certificateMode(certificateMode: String)

    /**
     * @param registrationConfig Information about the registration configuration.
     */
    public fun registrationConfig(registrationConfig: IResolvable)

    /**
     * @param registrationConfig Information about the registration configuration.
     */
    public fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty)

    /**
     * @param registrationConfig Information about the registration configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("180eaaad60858f2f8f680468fe0709d6021e3e87a631cd540a25f25fd6505bfb")
    public
        fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty.Builder.() -> Unit)

    /**
     * @param removeAutoRegistration If true, removes auto registration.
     */
    public fun removeAutoRegistration(removeAutoRegistration: Boolean)

    /**
     * @param removeAutoRegistration If true, removes auto registration.
     */
    public fun removeAutoRegistration(removeAutoRegistration: IResolvable)

    /**
     * @param status The status of the CA certificate. 
     * Valid values are "ACTIVE" and "INACTIVE".
     */
    public fun status(status: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param verificationCertificatePem The private key verification certificate.
     */
    public fun verificationCertificatePem(verificationCertificatePem: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCACertificateProps.Builder =
        software.amazon.awscdk.services.iot.CfnCACertificateProps.builder()

    /**
     * @param autoRegistrationStatus Whether the CA certificate is configured for auto registration
     * of device certificates.
     * Valid values are "ENABLE" and "DISABLE".
     */
    override fun autoRegistrationStatus(autoRegistrationStatus: String) {
      cdkBuilder.autoRegistrationStatus(autoRegistrationStatus)
    }

    /**
     * @param caCertificatePem The certificate data in PEM format. 
     */
    override fun caCertificatePem(caCertificatePem: String) {
      cdkBuilder.caCertificatePem(caCertificatePem)
    }

    /**
     * @param certificateMode The mode of the CA.
     * All the device certificates that are registered using this CA will be registered in the same
     * mode as the CA. For more information about certificate mode for device certificates, see
     * [certificate
     * mode](https://docs.aws.amazon.com//iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode)
     * .
     *
     * Valid values are "DEFAULT" and "SNI_ONLY".
     */
    override fun certificateMode(certificateMode: String) {
      cdkBuilder.certificateMode(certificateMode)
    }

    /**
     * @param registrationConfig Information about the registration configuration.
     */
    override fun registrationConfig(registrationConfig: IResolvable) {
      cdkBuilder.registrationConfig(registrationConfig.let(IResolvable::unwrap))
    }

    /**
     * @param registrationConfig Information about the registration configuration.
     */
    override
        fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty) {
      cdkBuilder.registrationConfig(registrationConfig.let(CfnCACertificate.RegistrationConfigProperty::unwrap))
    }

    /**
     * @param registrationConfig Information about the registration configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("180eaaad60858f2f8f680468fe0709d6021e3e87a631cd540a25f25fd6505bfb")
    override
        fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty.Builder.() -> Unit):
        Unit = registrationConfig(CfnCACertificate.RegistrationConfigProperty(registrationConfig))

    /**
     * @param removeAutoRegistration If true, removes auto registration.
     */
    override fun removeAutoRegistration(removeAutoRegistration: Boolean) {
      cdkBuilder.removeAutoRegistration(removeAutoRegistration)
    }

    /**
     * @param removeAutoRegistration If true, removes auto registration.
     */
    override fun removeAutoRegistration(removeAutoRegistration: IResolvable) {
      cdkBuilder.removeAutoRegistration(removeAutoRegistration.let(IResolvable::unwrap))
    }

    /**
     * @param status The status of the CA certificate. 
     * Valid values are "ACTIVE" and "INACTIVE".
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param verificationCertificatePem The private key verification certificate.
     */
    override fun verificationCertificatePem(verificationCertificatePem: String) {
      cdkBuilder.verificationCertificatePem(verificationCertificatePem)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnCACertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnCACertificateProps,
  ) : CdkObject(cdkObject), CfnCACertificateProps {
    /**
     * Whether the CA certificate is configured for auto registration of device certificates.
     *
     * Valid values are "ENABLE" and "DISABLE".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-autoregistrationstatus)
     */
    override fun autoRegistrationStatus(): String? = unwrap(this).getAutoRegistrationStatus()

    /**
     * The certificate data in PEM format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-cacertificatepem)
     */
    override fun caCertificatePem(): String = unwrap(this).getCaCertificatePem()

    /**
     * The mode of the CA.
     *
     * All the device certificates that are registered using this CA will be registered in the same
     * mode as the CA. For more information about certificate mode for device certificates, see
     * [certificate
     * mode](https://docs.aws.amazon.com//iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode)
     * .
     *
     * Valid values are "DEFAULT" and "SNI_ONLY".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-certificatemode)
     */
    override fun certificateMode(): String? = unwrap(this).getCertificateMode()

    /**
     * Information about the registration configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-registrationconfig)
     */
    override fun registrationConfig(): Any? = unwrap(this).getRegistrationConfig()

    /**
     * If true, removes auto registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-removeautoregistration)
     */
    override fun removeAutoRegistration(): Any? = unwrap(this).getRemoveAutoRegistration()

    /**
     * The status of the CA certificate.
     *
     * Valid values are "ACTIVE" and "INACTIVE".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-status)
     */
    override fun status(): String = unwrap(this).getStatus()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The private key verification certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-verificationcertificatepem)
     */
    override fun verificationCertificatePem(): String? =
        unwrap(this).getVerificationCertificatePem()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCACertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCACertificateProps):
        CfnCACertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCACertificateProps):
        software.amazon.awscdk.services.iot.CfnCACertificateProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot.CfnCACertificateProps
  }
}
