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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions
import software.amazon.awscdk.services.route53.IHostedZone
import kotlin.Deprecated
import kotlin.String

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class CustomEndpointOptionsDsl {
    private val cdkBuilder: CustomEndpointOptions.Builder = CustomEndpointOptions.builder()

    @Deprecated(message = "deprecated in CDK")
    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun hostedZone(hostedZone: IHostedZone) {
        cdkBuilder.hostedZone(hostedZone)
    }

    public fun build(): CustomEndpointOptions = cdkBuilder.build()
}
