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

package io.cloudshiftdev.awscdkdsl.services.certificatemanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.CertificateProps
import software.amazon.awscdk.services.certificatemanager.CertificateValidation

/**
 * Properties for your certificate.
 *
 * Example:
 * ```
 * HostedZone exampleCom = HostedZone.Builder.create(this, "ExampleCom")
 * .zoneName("example.com")
 * .build();
 * HostedZone exampleNet = HostedZone.Builder.create(this, "ExampleNet")
 * .zoneName("example.net")
 * .build();
 * Certificate cert = Certificate.Builder.create(this, "Certificate")
 * .domainName("test.example.com")
 * .subjectAlternativeNames(List.of("cool.example.com", "test.example.net"))
 * .validation(CertificateValidation.fromDnsMultiZone(Map.of(
 * "test.example.com", exampleCom,
 * "cool.example.com", exampleCom,
 * "test.example.net", exampleNet)))
 * .build();
 * ```
 */
@CdkDslMarker
public class CertificatePropsDsl {
    private val cdkBuilder: CertificateProps.Builder = CertificateProps.builder()

    private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

    /**
     * @param certificateName The Certificate name. Since the Certificate resource doesn't support
     *   providing a physical name, the value provided here will be recorded in the `Name` tag
     */
    public fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
    }

    /**
     * @param domainName Fully-qualified domain name to request a certificate for. May contain
     *   wildcards, such as `*.domain.com`.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * @param subjectAlternativeNames Alternative domain names on your certificate. Use this to
     *   register alternative domain names that represent the same site.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
        _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
    }

    /**
     * @param subjectAlternativeNames Alternative domain names on your certificate. Use this to
     *   register alternative domain names that represent the same site.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
        _subjectAlternativeNames.addAll(subjectAlternativeNames)
    }

    /**
     * @param transparencyLoggingEnabled Enable or disable transparency logging for this
     *   certificate. Once a certificate has been logged, it cannot be removed from the log. Opting
     *   out at that point will have no effect. If you opt out of logging when you request a
     *   certificate and then choose later to opt back in, your certificate will not be logged until
     *   it is renewed. If you want the certificate to be logged immediately, we recommend that you
     *   issue a new one.
     */
    public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean) {
        cdkBuilder.transparencyLoggingEnabled(transparencyLoggingEnabled)
    }

    /** @param validation How to validate this certificate. */
    public fun validation(validation: CertificateValidation) {
        cdkBuilder.validation(validation)
    }

    public fun build(): CertificateProps {
        if (_subjectAlternativeNames.isNotEmpty())
            cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
        return cdkBuilder.build()
    }
}
