@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import io.cloudshiftdev.awscdk.services.ec2.MachineImageConfig
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

public open class EksOptimizedImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.EksOptimizedImage,
) : CdkObject(cdkObject), IMachineImage {
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cpuArch(cpuArch: CpuArch)

    public fun kubernetesVersion(kubernetesVersion: String)

    public fun nodeType(nodeType: NodeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.EksOptimizedImage.Builder =
        software.amazon.awscdk.services.eks.EksOptimizedImage.Builder.create()

    override fun cpuArch(cpuArch: CpuArch) {
      cdkBuilder.cpuArch(cpuArch.let(CpuArch::unwrap))
    }

    override fun kubernetesVersion(kubernetesVersion: String) {
      cdkBuilder.kubernetesVersion(kubernetesVersion)
    }

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
        software.amazon.awscdk.services.eks.EksOptimizedImage = wrapped.cdkObject
  }
}
