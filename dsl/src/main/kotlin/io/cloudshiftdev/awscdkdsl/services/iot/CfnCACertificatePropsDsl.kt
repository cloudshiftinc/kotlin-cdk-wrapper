@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnCACertificate
import software.amazon.awscdk.services.iot.CfnCACertificateProps

/**
 * Properties for defining a `CfnCACertificate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
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
@CdkDslMarker
public class CfnCACertificatePropsDsl {
    private val cdkBuilder: CfnCACertificateProps.Builder = CfnCACertificateProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param autoRegistrationStatus Whether the CA certificate is configured for auto registration
     *   of device certificates. Valid values are "ENABLE" and "DISABLE".
     */
    public fun autoRegistrationStatus(autoRegistrationStatus: String) {
        cdkBuilder.autoRegistrationStatus(autoRegistrationStatus)
    }

    /** @param caCertificatePem The certificate data in PEM format. */
    public fun caCertificatePem(caCertificatePem: String) {
        cdkBuilder.caCertificatePem(caCertificatePem)
    }

    /**
     * @param certificateMode The mode of the CA. All the device certificates that are registered
     *   using this CA will be registered in the same mode as the CA. For more information about
     *   certificate mode for device certificates, see
     *   [certificate mode](https://docs.aws.amazon.com//iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode)
     *   .
     *
     * Valid values are "DEFAULT" and "SNI_ONLY".
     */
    public fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
    }

    /** @param registrationConfig Information about the registration configuration. */
    public fun registrationConfig(registrationConfig: IResolvable) {
        cdkBuilder.registrationConfig(registrationConfig)
    }

    /** @param registrationConfig Information about the registration configuration. */
    public fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty) {
        cdkBuilder.registrationConfig(registrationConfig)
    }

    /** @param removeAutoRegistration If true, removes auto registration. */
    public fun removeAutoRegistration(removeAutoRegistration: Boolean) {
        cdkBuilder.removeAutoRegistration(removeAutoRegistration)
    }

    /** @param removeAutoRegistration If true, removes auto registration. */
    public fun removeAutoRegistration(removeAutoRegistration: IResolvable) {
        cdkBuilder.removeAutoRegistration(removeAutoRegistration)
    }

    /** @param status The status of the CA certificate. Valid values are "ACTIVE" and "INACTIVE". */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param verificationCertificatePem The private key verification certificate. */
    public fun verificationCertificatePem(verificationCertificatePem: String) {
        cdkBuilder.verificationCertificatePem(verificationCertificatePem)
    }

    public fun build(): CfnCACertificateProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
