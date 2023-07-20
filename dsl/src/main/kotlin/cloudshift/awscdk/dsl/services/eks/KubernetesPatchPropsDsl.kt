@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubernetesPatchProps
import software.amazon.awscdk.services.eks.PatchType

@CdkDslMarker
public class KubernetesPatchPropsDsl {
  private val cdkBuilder: KubernetesPatchProps.Builder = KubernetesPatchProps.builder()

  public fun applyPatch(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.applyPatch(builder.map)
  }

  public fun applyPatch(applyPatch: Map<String, Any>) {
    cdkBuilder.applyPatch(applyPatch)
  }

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun patchType(patchType: PatchType) {
    cdkBuilder.patchType(patchType)
  }

  public fun resourceName(resourceName: String) {
    cdkBuilder.resourceName(resourceName)
  }

  public fun resourceNamespace(resourceNamespace: String) {
    cdkBuilder.resourceNamespace(resourceNamespace)
  }

  public fun restorePatch(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.restorePatch(builder.map)
  }

  public fun restorePatch(restorePatch: Map<String, Any>) {
    cdkBuilder.restorePatch(restorePatch)
  }

  public fun build(): KubernetesPatchProps = cdkBuilder.build()
}
