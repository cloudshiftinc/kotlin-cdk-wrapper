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
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubectlProviderProps

@CdkDslMarker
public class KubectlProviderPropsDsl {
    private val cdkBuilder: KubectlProviderProps.Builder = KubectlProviderProps.builder()

    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun build(): KubectlProviderProps = cdkBuilder.build()
}
