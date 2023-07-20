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

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnResolverDNSSECConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResolverDNSSECConfig.Builder =
        CfnResolverDNSSECConfig.Builder.create(scope, id)

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun build(): CfnResolverDNSSECConfig = cdkBuilder.build()
}
