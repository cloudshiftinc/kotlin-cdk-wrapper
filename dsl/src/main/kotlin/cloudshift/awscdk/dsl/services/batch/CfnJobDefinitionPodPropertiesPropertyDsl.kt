@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionPodPropertiesPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.PodPropertiesProperty.Builder =
      CfnJobDefinition.PodPropertiesProperty.builder()

  private val _containers: MutableList<Any> = mutableListOf()

  private val _volumes: MutableList<Any> = mutableListOf()

  public fun containers(vararg containers: Any) {
    _containers.addAll(listOf(*containers))
  }

  public fun containers(containers: Collection<Any>) {
    _containers.addAll(containers)
  }

  public fun containers(containers: IResolvable) {
    cdkBuilder.containers(containers)
  }

  public fun dnsPolicy(dnsPolicy: String) {
    cdkBuilder.dnsPolicy(dnsPolicy)
  }

  public fun hostNetwork(hostNetwork: Boolean) {
    cdkBuilder.hostNetwork(hostNetwork)
  }

  public fun hostNetwork(hostNetwork: IResolvable) {
    cdkBuilder.hostNetwork(hostNetwork)
  }

  public fun metadata(metadata: IResolvable) {
    cdkBuilder.metadata(metadata)
  }

  public fun metadata(metadata: CfnJobDefinition.MetadataProperty) {
    cdkBuilder.metadata(metadata)
  }

  public fun serviceAccountName(serviceAccountName: String) {
    cdkBuilder.serviceAccountName(serviceAccountName)
  }

  public fun volumes(vararg volumes: Any) {
    _volumes.addAll(listOf(*volumes))
  }

  public fun volumes(volumes: Collection<Any>) {
    _volumes.addAll(volumes)
  }

  public fun volumes(volumes: IResolvable) {
    cdkBuilder.volumes(volumes)
  }

  public fun build(): CfnJobDefinition.PodPropertiesProperty {
    if(_containers.isNotEmpty()) cdkBuilder.containers(_containers)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    return cdkBuilder.build()
  }
}
