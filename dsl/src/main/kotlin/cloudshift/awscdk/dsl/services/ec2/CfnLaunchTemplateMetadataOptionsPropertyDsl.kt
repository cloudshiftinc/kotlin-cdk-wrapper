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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplateMetadataOptionsPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.MetadataOptionsProperty.Builder =
        CfnLaunchTemplate.MetadataOptionsProperty.builder()

    public fun httpEndpoint(httpEndpoint: String) {
        cdkBuilder.httpEndpoint(httpEndpoint)
    }

    public fun httpProtocolIpv6(httpProtocolIpv6: String) {
        cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
    }

    public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
    }

    public fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
    }

    public fun instanceMetadataTags(instanceMetadataTags: String) {
        cdkBuilder.instanceMetadataTags(instanceMetadataTags)
    }

    public fun build(): CfnLaunchTemplate.MetadataOptionsProperty = cdkBuilder.build()
}
