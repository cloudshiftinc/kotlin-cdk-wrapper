@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CpuArch
import software.amazon.awscdk.services.eks.EksOptimizedImage
import software.amazon.awscdk.services.eks.NodeType

@CdkDslMarker
public class EksOptimizedImageDsl {
  private val cdkBuilder: EksOptimizedImage.Builder = EksOptimizedImage.Builder.create()

  public fun cpuArch(cpuArch: CpuArch) {
    cdkBuilder.cpuArch(cpuArch)
  }

  public fun kubernetesVersion(kubernetesVersion: String) {
    cdkBuilder.kubernetesVersion(kubernetesVersion)
  }

  public fun nodeType(nodeType: NodeType) {
    cdkBuilder.nodeType(nodeType)
  }

  public fun build(): EksOptimizedImage = cdkBuilder.build()
}
