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
import software.amazon.awscdk.services.eks.CpuArch
import software.amazon.awscdk.services.eks.EksOptimizedImageProps
import software.amazon.awscdk.services.eks.NodeType
import kotlin.String

@CdkDslMarker
public class EksOptimizedImagePropsDsl {
    private val cdkBuilder: EksOptimizedImageProps.Builder = EksOptimizedImageProps.builder()

    public fun cpuArch(cpuArch: CpuArch) {
        cdkBuilder.cpuArch(cpuArch)
    }

    public fun kubernetesVersion(kubernetesVersion: String) {
        cdkBuilder.kubernetesVersion(kubernetesVersion)
    }

    public fun nodeType(nodeType: NodeType) {
        cdkBuilder.nodeType(nodeType)
    }

    public fun build(): EksOptimizedImageProps = cdkBuilder.build()
}
