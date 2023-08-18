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
import software.amazon.awscdk.services.eks.EksOptimizedImage
import software.amazon.awscdk.services.eks.NodeType

/**
 * Construct an Amazon Linux 2 image from the latest EKS Optimized AMI published in SSM.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * EksOptimizedImage eksOptimizedImage = EksOptimizedImage.Builder.create()
 * .cpuArch(CpuArch.ARM_64)
 * .kubernetesVersion("kubernetesVersion")
 * .nodeType(NodeType.STANDARD)
 * .build();
 * ```
 */
@CdkDslMarker
public class EksOptimizedImageDsl {
    private val cdkBuilder: EksOptimizedImage.Builder = EksOptimizedImage.Builder.create()

    /**
     * What cpu architecture to retrieve the image for (arm64 or x86_64).
     *
     * Default: CpuArch.X86_64
     *
     * @param cpuArch What cpu architecture to retrieve the image for (arm64 or x86_64).
     */
    public fun cpuArch(cpuArch: CpuArch) {
        cdkBuilder.cpuArch(cpuArch)
    }

    /**
     * The Kubernetes version to use.
     *
     * Default: - The latest version
     *
     * @param kubernetesVersion The Kubernetes version to use.
     */
    public fun kubernetesVersion(kubernetesVersion: String) {
        cdkBuilder.kubernetesVersion(kubernetesVersion)
    }

    /**
     * What instance type to retrieve the image for (standard or GPU-optimized).
     *
     * Default: NodeType.STANDARD
     *
     * @param nodeType What instance type to retrieve the image for (standard or GPU-optimized).
     */
    public fun nodeType(nodeType: NodeType) {
        cdkBuilder.nodeType(nodeType)
    }

    public fun build(): EksOptimizedImage = cdkBuilder.build()
}
