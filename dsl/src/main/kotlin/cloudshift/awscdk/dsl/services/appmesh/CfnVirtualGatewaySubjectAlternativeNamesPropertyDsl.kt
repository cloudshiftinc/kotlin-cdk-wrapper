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
public class CfnVirtualGatewaySubjectAlternativeNamesPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.SubjectAlternativeNamesProperty.Builder =
        CfnVirtualGateway.SubjectAlternativeNamesProperty.builder()

    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    public fun match(match: CfnVirtualGateway.SubjectAlternativeNameMatchersProperty) {
        cdkBuilder.match(match)
    }

    public fun build(): CfnVirtualGateway.SubjectAlternativeNamesProperty = cdkBuilder.build()
}
