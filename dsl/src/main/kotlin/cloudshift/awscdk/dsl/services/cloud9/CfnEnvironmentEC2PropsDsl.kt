@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloud9

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props

@CdkDslMarker
public class CfnEnvironmentEC2PropsDsl {
  private val cdkBuilder: CfnEnvironmentEC2Props.Builder = CfnEnvironmentEC2Props.builder()

  private val _repositories: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number) {
    cdkBuilder.automaticStopTimeMinutes(automaticStopTimeMinutes)
  }

  public fun connectionType(connectionType: String) {
    cdkBuilder.connectionType(connectionType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun imageId(imageId: String) {
    cdkBuilder.imageId(imageId)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun ownerArn(ownerArn: String) {
    cdkBuilder.ownerArn(ownerArn)
  }

  public fun repositories(vararg repositories: Any) {
    _repositories.addAll(listOf(*repositories))
  }

  public fun repositories(repositories: Collection<Any>) {
    _repositories.addAll(repositories)
  }

  public fun repositories(repositories: IResolvable) {
    cdkBuilder.repositories(repositories)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEnvironmentEC2Props {
    if(_repositories.isNotEmpty()) cdkBuilder.repositories(_repositories)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
