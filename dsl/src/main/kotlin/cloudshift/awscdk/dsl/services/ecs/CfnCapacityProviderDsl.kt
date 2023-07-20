@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCapacityProvider
import software.constructs.Construct

@CdkDslMarker
public class CfnCapacityProviderDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCapacityProvider.Builder = CfnCapacityProvider.Builder.create(scope,
      id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable) {
    cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider)
  }

  public
      fun autoScalingGroupProvider(autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty) {
    cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider)
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

  public fun build(): CfnCapacityProvider {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
