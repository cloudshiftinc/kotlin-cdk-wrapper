@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnCACertificate
import software.amazon.awscdk.services.iot.CfnCACertificateProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCACertificatePropsDsl {
    private val cdkBuilder: CfnCACertificateProps.Builder = CfnCACertificateProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun autoRegistrationStatus(autoRegistrationStatus: String) {
        cdkBuilder.autoRegistrationStatus(autoRegistrationStatus)
    }

    public fun caCertificatePem(caCertificatePem: String) {
        cdkBuilder.caCertificatePem(caCertificatePem)
    }

    public fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
    }

    public fun registrationConfig(registrationConfig: IResolvable) {
        cdkBuilder.registrationConfig(registrationConfig)
    }

    public fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty) {
        cdkBuilder.registrationConfig(registrationConfig)
    }

    public fun removeAutoRegistration(removeAutoRegistration: Boolean) {
        cdkBuilder.removeAutoRegistration(removeAutoRegistration)
    }

    public fun removeAutoRegistration(removeAutoRegistration: IResolvable) {
        cdkBuilder.removeAutoRegistration(removeAutoRegistration)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun verificationCertificatePem(verificationCertificatePem: String) {
        cdkBuilder.verificationCertificatePem(verificationCertificatePem)
    }

    public fun build(): CfnCACertificateProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
