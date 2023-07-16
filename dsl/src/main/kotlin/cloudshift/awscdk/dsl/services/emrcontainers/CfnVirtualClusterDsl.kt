@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster
import software.constructs.Construct

@CdkDslMarker
public class CfnVirtualClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVirtualCluster.Builder = CfnVirtualCluster.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun containerProvider(containerProvider: IResolvable) {
    cdkBuilder.containerProvider(containerProvider)
  }

  public fun containerProvider(containerProvider: CfnVirtualCluster.ContainerProviderProperty) {
    cdkBuilder.containerProvider(containerProvider)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnVirtualCluster {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
