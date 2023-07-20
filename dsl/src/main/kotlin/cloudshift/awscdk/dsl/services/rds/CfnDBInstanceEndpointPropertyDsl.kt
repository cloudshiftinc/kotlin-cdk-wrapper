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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.CfnDBInstance
import kotlin.String

@CdkDslMarker
public class CfnDBInstanceEndpointPropertyDsl {
    private val cdkBuilder: CfnDBInstance.EndpointProperty.Builder =
        CfnDBInstance.EndpointProperty.builder()

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDBInstance.EndpointProperty = cdkBuilder.build()
}
