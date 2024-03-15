@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface EksOptimizedImageProps {
  public fun cpuArch(): CpuArch? = unwrap(this).getCpuArch()?.let(CpuArch::wrap)

  public fun kubernetesVersion(): String? = unwrap(this).getKubernetesVersion()

  public fun nodeType(): NodeType? = unwrap(this).getNodeType()?.let(NodeType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cpuArch(cpuArch: CpuArch)

    public fun kubernetesVersion(kubernetesVersion: String)

    public fun nodeType(nodeType: NodeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.EksOptimizedImageProps.Builder =
        software.amazon.awscdk.services.eks.EksOptimizedImageProps.builder()

    override fun cpuArch(cpuArch: CpuArch) {
      cdkBuilder.cpuArch(cpuArch.let(CpuArch::unwrap))
    }

    override fun kubernetesVersion(kubernetesVersion: String) {
      cdkBuilder.kubernetesVersion(kubernetesVersion)
    }

    override fun nodeType(nodeType: NodeType) {
      cdkBuilder.nodeType(nodeType.let(NodeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.EksOptimizedImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.EksOptimizedImageProps,
  ) : CdkObject(cdkObject), EksOptimizedImageProps {
    override fun cpuArch(): CpuArch? = unwrap(this).getCpuArch()?.let(CpuArch::wrap)

    override fun kubernetesVersion(): String? = unwrap(this).getKubernetesVersion()

    override fun nodeType(): NodeType? = unwrap(this).getNodeType()?.let(NodeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EksOptimizedImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.EksOptimizedImageProps):
        EksOptimizedImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EksOptimizedImageProps):
        software.amazon.awscdk.services.eks.EksOptimizedImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.EksOptimizedImageProps
  }
}
