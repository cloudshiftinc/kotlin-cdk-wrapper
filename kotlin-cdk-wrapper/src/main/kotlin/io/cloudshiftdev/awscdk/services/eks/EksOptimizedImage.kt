@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import io.cloudshiftdev.awscdk.services.ec2.MachineImageConfig
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

/**
 * Construct an Amazon Linux 2 image from the latest EKS Optimized AMI published in SSM.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * EksOptimizedImage eksOptimizedImage = EksOptimizedImage.Builder.create()
 * .cpuArch(CpuArch.ARM_64)
 * .kubernetesVersion("kubernetesVersion")
 * .nodeType(NodeType.STANDARD)
 * .build();
 * ```
 */
public open class EksOptimizedImage(
  cdkObject: software.amazon.awscdk.services.eks.EksOptimizedImage,
) : CdkObject(cdkObject), IMachineImage {
  public constructor() : this(software.amazon.awscdk.services.eks.EksOptimizedImage()
  )

  public constructor(props: EksOptimizedImageProps) :
      this(software.amazon.awscdk.services.eks.EksOptimizedImage(props.let(EksOptimizedImageProps::unwrap))
  )

  public constructor(props: EksOptimizedImageProps.Builder.() -> Unit) :
      this(EksOptimizedImageProps(props)
  )

  /**
   * Return the correct image.
   *
   * @param scope 
   */
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.EksOptimizedImage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * What cpu architecture to retrieve the image for (arm64 or x86_64).
     *
     * Default: CpuArch.X86_64
     *
     * @param cpuArch What cpu architecture to retrieve the image for (arm64 or x86_64). 
     */
    public fun cpuArch(cpuArch: CpuArch)

    /**
     * The Kubernetes version to use.
     *
     * Default: - The latest version
     *
     * @param kubernetesVersion The Kubernetes version to use. 
     */
    public fun kubernetesVersion(kubernetesVersion: String)

    /**
     * What instance type to retrieve the image for (standard or GPU-optimized).
     *
     * Default: NodeType.STANDARD
     *
     * @param nodeType What instance type to retrieve the image for (standard or GPU-optimized). 
     */
    public fun nodeType(nodeType: NodeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.EksOptimizedImage.Builder =
        software.amazon.awscdk.services.eks.EksOptimizedImage.Builder.create()

    /**
     * What cpu architecture to retrieve the image for (arm64 or x86_64).
     *
     * Default: CpuArch.X86_64
     *
     * @param cpuArch What cpu architecture to retrieve the image for (arm64 or x86_64). 
     */
    override fun cpuArch(cpuArch: CpuArch) {
      cdkBuilder.cpuArch(cpuArch.let(CpuArch::unwrap))
    }

    /**
     * The Kubernetes version to use.
     *
     * Default: - The latest version
     *
     * @param kubernetesVersion The Kubernetes version to use. 
     */
    override fun kubernetesVersion(kubernetesVersion: String) {
      cdkBuilder.kubernetesVersion(kubernetesVersion)
    }

    /**
     * What instance type to retrieve the image for (standard or GPU-optimized).
     *
     * Default: NodeType.STANDARD
     *
     * @param nodeType What instance type to retrieve the image for (standard or GPU-optimized). 
     */
    override fun nodeType(nodeType: NodeType) {
      cdkBuilder.nodeType(nodeType.let(NodeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.EksOptimizedImage = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EksOptimizedImage {
      val builderImpl = BuilderImpl()
      return EksOptimizedImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.EksOptimizedImage):
        EksOptimizedImage = EksOptimizedImage(cdkObject)

    internal fun unwrap(wrapped: EksOptimizedImage):
        software.amazon.awscdk.services.eks.EksOptimizedImage = wrapped.cdkObject as
        software.amazon.awscdk.services.eks.EksOptimizedImage
  }
}
