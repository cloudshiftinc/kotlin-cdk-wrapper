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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.msk.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterPublicAccessPropertyDsl {
    private val cdkBuilder: CfnCluster.PublicAccessProperty.Builder =
        CfnCluster.PublicAccessProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCluster.PublicAccessProperty = cdkBuilder.build()
}
