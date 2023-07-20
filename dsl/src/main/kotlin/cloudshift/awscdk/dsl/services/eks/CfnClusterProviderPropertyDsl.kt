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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterProviderPropertyDsl {
    private val cdkBuilder: CfnCluster.ProviderProperty.Builder =
        CfnCluster.ProviderProperty.builder()

    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    public fun build(): CfnCluster.ProviderProperty = cdkBuilder.build()
}
