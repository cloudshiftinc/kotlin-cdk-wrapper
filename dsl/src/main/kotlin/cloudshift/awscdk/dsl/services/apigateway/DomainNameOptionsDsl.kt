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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.DomainNameOptions
import software.amazon.awscdk.services.apigateway.EndpointType
import software.amazon.awscdk.services.apigateway.MTLSConfig
import software.amazon.awscdk.services.apigateway.SecurityPolicy
import software.amazon.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class DomainNameOptionsDsl {
    private val cdkBuilder: DomainNameOptions.Builder = DomainNameOptions.builder()

    public fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
    }

    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun endpointType(endpointType: EndpointType) {
        cdkBuilder.endpointType(endpointType)
    }

    public fun mtls(block: MTLSConfigDsl.() -> Unit = {}) {
        val builder = MTLSConfigDsl()
        builder.apply(block)
        cdkBuilder.mtls(builder.build())
    }

    public fun mtls(mtls: MTLSConfig) {
        cdkBuilder.mtls(mtls)
    }

    public fun securityPolicy(securityPolicy: SecurityPolicy) {
        cdkBuilder.securityPolicy(securityPolicy)
    }

    public fun build(): DomainNameOptions = cdkBuilder.build()
}
