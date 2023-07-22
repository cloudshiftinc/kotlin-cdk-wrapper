@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnCACertificate
import software.constructs.Construct

/**
 * Specifies a CA certificate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnCACertificate cfnCACertificate = CfnCACertificate.Builder.create(this, "MyCfnCACertificate")
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
@CdkDslMarker
public class CfnCACertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCACertificate.Builder = CfnCACertificate.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Whether the CA certificate is configured for auto registration of device certificates.
   *
   * Valid values are "ENABLE" and "DISABLE".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-autoregistrationstatus)
   * @param autoRegistrationStatus Whether the CA certificate is configured for auto registration of
   * device certificates. 
   */
  public fun autoRegistrationStatus(autoRegistrationStatus: String) {
    cdkBuilder.autoRegistrationStatus(autoRegistrationStatus)
  }

  /**
   * The certificate data in PEM format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-cacertificatepem)
   * @param caCertificatePem The certificate data in PEM format. 
   */
  public fun caCertificatePem(caCertificatePem: String) {
    cdkBuilder.caCertificatePem(caCertificatePem)
  }

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
   * @param certificateMode The mode of the CA. 
   */
  public fun certificateMode(certificateMode: String) {
    cdkBuilder.certificateMode(certificateMode)
  }

  /**
   * Information about the registration configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-registrationconfig)
   * @param registrationConfig Information about the registration configuration. 
   */
  public fun registrationConfig(registrationConfig: IResolvable) {
    cdkBuilder.registrationConfig(registrationConfig)
  }

  /**
   * Information about the registration configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-registrationconfig)
   * @param registrationConfig Information about the registration configuration. 
   */
  public fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty) {
    cdkBuilder.registrationConfig(registrationConfig)
  }

  /**
   * If true, removes auto registration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-removeautoregistration)
   * @param removeAutoRegistration If true, removes auto registration. 
   */
  public fun removeAutoRegistration(removeAutoRegistration: Boolean) {
    cdkBuilder.removeAutoRegistration(removeAutoRegistration)
  }

  /**
   * If true, removes auto registration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-removeautoregistration)
   * @param removeAutoRegistration If true, removes auto registration. 
   */
  public fun removeAutoRegistration(removeAutoRegistration: IResolvable) {
    cdkBuilder.removeAutoRegistration(removeAutoRegistration)
  }

  /**
   * The status of the CA certificate.
   *
   * Valid values are "ACTIVE" and "INACTIVE".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-status)
   * @param status The status of the CA certificate. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The private key verification certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-verificationcertificatepem)
   * @param verificationCertificatePem The private key verification certificate. 
   */
  public fun verificationCertificatePem(verificationCertificatePem: String) {
    cdkBuilder.verificationCertificatePem(verificationCertificatePem)
  }

  public fun build(): CfnCACertificate {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
