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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextPropertyDsl {
    private val cdkBuilder:
        CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty.Builder =
        CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty.builder()

    public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    public fun subjectAlternativeNames(subjectAlternativeNames: CfnVirtualGateway.SubjectAlternativeNamesProperty) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    public fun trust(trust: IResolvable) {
        cdkBuilder.trust(trust)
    }

    public fun trust(trust: CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty) {
        cdkBuilder.trust(trust)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty =
        cdkBuilder.build()
}
