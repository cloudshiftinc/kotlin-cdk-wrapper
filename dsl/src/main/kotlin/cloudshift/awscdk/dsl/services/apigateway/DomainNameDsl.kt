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
import software.amazon.awscdk.services.apigateway.DomainName
import software.amazon.awscdk.services.apigateway.EndpointType
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.MTLSConfig
import software.amazon.awscdk.services.apigateway.SecurityPolicy
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class DomainNameDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DomainName.Builder = DomainName.Builder.create(scope, id)

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

    public fun mapping(mapping: IRestApi) {
        cdkBuilder.mapping(mapping)
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

    public fun build(): DomainName = cdkBuilder.build()
}
