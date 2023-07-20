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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl
import kotlin.String

@CdkDslMarker
public class CfnOriginAccessControlOriginAccessControlConfigPropertyDsl {
    private val cdkBuilder: CfnOriginAccessControl.OriginAccessControlConfigProperty.Builder =
        CfnOriginAccessControl.OriginAccessControlConfigProperty.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun originAccessControlOriginType(originAccessControlOriginType: String) {
        cdkBuilder.originAccessControlOriginType(originAccessControlOriginType)
    }

    public fun signingBehavior(signingBehavior: String) {
        cdkBuilder.signingBehavior(signingBehavior)
    }

    public fun signingProtocol(signingProtocol: String) {
        cdkBuilder.signingProtocol(signingProtocol)
    }

    public fun build(): CfnOriginAccessControl.OriginAccessControlConfigProperty = cdkBuilder.build()
}
