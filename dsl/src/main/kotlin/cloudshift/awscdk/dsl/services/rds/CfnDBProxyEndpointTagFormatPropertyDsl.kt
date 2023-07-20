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
import software.amazon.awscdk.services.rds.CfnDBProxyEndpoint
import kotlin.String

@CdkDslMarker
public class CfnDBProxyEndpointTagFormatPropertyDsl {
    private val cdkBuilder: CfnDBProxyEndpoint.TagFormatProperty.Builder =
        CfnDBProxyEndpoint.TagFormatProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDBProxyEndpoint.TagFormatProperty = cdkBuilder.build()
}
