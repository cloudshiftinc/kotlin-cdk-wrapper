@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps

@CdkDslMarker
public class CfnDedicatedIpPoolPropsDsl {
  private val cdkBuilder: CfnDedicatedIpPoolProps.Builder = CfnDedicatedIpPoolProps.builder()

  private val _tags: MutableList<CfnDedicatedIpPool.TagsProperty> = mutableListOf()

  /**
   * @param poolName The name of the dedicated IP pool.
   */
  public fun poolName(poolName: String) {
    cdkBuilder.poolName(poolName)
  }

  /**
   * @param tags An object that defines the tags (keys and values) that you want to associate with
   * the dedicated IP pool.
   */
  public fun tags(tags: CfnDedicatedIpPoolTagsPropertyDsl.() -> Unit) {
    _tags.add(CfnDedicatedIpPoolTagsPropertyDsl().apply(tags).build())
  }

  /**
   * @param tags An object that defines the tags (keys and values) that you want to associate with
   * the dedicated IP pool.
   */
  public fun tags(tags: Collection<CfnDedicatedIpPool.TagsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDedicatedIpPoolProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
