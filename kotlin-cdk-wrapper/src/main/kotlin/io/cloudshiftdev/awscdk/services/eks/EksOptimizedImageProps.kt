@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for EksOptimizedImage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * EksOptimizedImageProps eksOptimizedImageProps = EksOptimizedImageProps.builder()
 * .cpuArch(CpuArch.ARM_64)
 * .kubernetesVersion("kubernetesVersion")
 * .nodeType(NodeType.STANDARD)
 * .build();
 * ```
 */
public interface EksOptimizedImageProps {
  /**
   * What cpu architecture to retrieve the image for (arm64 or x86_64).
   *
   * Default: CpuArch.X86_64
   */
  public fun cpuArch(): CpuArch? = unwrap(this).getCpuArch()?.let(CpuArch::wrap)

  /**
   * The Kubernetes version to use.
   *
   * Default: - The latest version
   */
  public fun kubernetesVersion(): String? = unwrap(this).getKubernetesVersion()

  /**
   * What instance type to retrieve the image for (standard or GPU-optimized).
   *
   * Default: NodeType.STANDARD
   */
  public fun nodeType(): NodeType? = unwrap(this).getNodeType()?.let(NodeType::wrap)

  /**
   * A builder for [EksOptimizedImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cpuArch What cpu architecture to retrieve the image for (arm64 or x86_64).
     */
    public fun cpuArch(cpuArch: CpuArch)

    /**
     * @param kubernetesVersion The Kubernetes version to use.
     */
    public fun kubernetesVersion(kubernetesVersion: String)

    /**
     * @param nodeType What instance type to retrieve the image for (standard or GPU-optimized).
     */
    public fun nodeType(nodeType: NodeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.EksOptimizedImageProps.Builder =
        software.amazon.awscdk.services.eks.EksOptimizedImageProps.builder()

    /**
     * @param cpuArch What cpu architecture to retrieve the image for (arm64 or x86_64).
     */
    override fun cpuArch(cpuArch: CpuArch) {
      cdkBuilder.cpuArch(cpuArch.let(CpuArch::unwrap))
    }

    /**
     * @param kubernetesVersion The Kubernetes version to use.
     */
    override fun kubernetesVersion(kubernetesVersion: String) {
      cdkBuilder.kubernetesVersion(kubernetesVersion)
    }

    /**
     * @param nodeType What instance type to retrieve the image for (standard or GPU-optimized).
     */
    override fun nodeType(nodeType: NodeType) {
      cdkBuilder.nodeType(nodeType.let(NodeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.EksOptimizedImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.EksOptimizedImageProps,
  ) : CdkObject(cdkObject), EksOptimizedImageProps {
    /**
     * What cpu architecture to retrieve the image for (arm64 or x86_64).
     *
     * Default: CpuArch.X86_64
     */
    override fun cpuArch(): CpuArch? = unwrap(this).getCpuArch()?.let(CpuArch::wrap)

    /**
     * The Kubernetes version to use.
     *
     * Default: - The latest version
     */
    override fun kubernetesVersion(): String? = unwrap(this).getKubernetesVersion()

    /**
     * What instance type to retrieve the image for (standard or GPU-optimized).
     *
     * Default: NodeType.STANDARD
     */
    override fun nodeType(): NodeType? = unwrap(this).getNodeType()?.let(NodeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EksOptimizedImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.EksOptimizedImageProps):
        EksOptimizedImageProps = CdkObjectWrappers.wrap(cdkObject) as? EksOptimizedImageProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EksOptimizedImageProps):
        software.amazon.awscdk.services.eks.EksOptimizedImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.EksOptimizedImageProps
  }
}
