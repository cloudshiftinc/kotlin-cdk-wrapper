@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CpuArch
import software.amazon.awscdk.services.eks.EksOptimizedImageProps
import software.amazon.awscdk.services.eks.NodeType

/**
 * Properties for EksOptimizedImage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * EksOptimizedImageProps eksOptimizedImageProps = EksOptimizedImageProps.builder()
 * .cpuArch(CpuArch.ARM_64)
 * .kubernetesVersion("kubernetesVersion")
 * .nodeType(NodeType.STANDARD)
 * .build();
 * ```
 */
@CdkDslMarker
public class EksOptimizedImagePropsDsl {
    private val cdkBuilder: EksOptimizedImageProps.Builder = EksOptimizedImageProps.builder()

    /** @param cpuArch What cpu architecture to retrieve the image for (arm64 or x86_64). */
    public fun cpuArch(cpuArch: CpuArch) {
        cdkBuilder.cpuArch(cpuArch)
    }

    /** @param kubernetesVersion The Kubernetes version to use. */
    public fun kubernetesVersion(kubernetesVersion: String) {
        cdkBuilder.kubernetesVersion(kubernetesVersion)
    }

    /** @param nodeType What instance type to retrieve the image for (standard or GPU-optimized). */
    public fun nodeType(nodeType: NodeType) {
        cdkBuilder.nodeType(nodeType)
    }

    public fun build(): EksOptimizedImageProps = cdkBuilder.build()
}
