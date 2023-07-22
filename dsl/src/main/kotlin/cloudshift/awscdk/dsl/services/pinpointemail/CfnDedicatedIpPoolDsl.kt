@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool
import software.constructs.Construct

@CdkDslMarker
public class CfnDedicatedIpPoolDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDedicatedIpPool.Builder = CfnDedicatedIpPool.Builder.create(scope, id)

  private val _tags: MutableList<CfnDedicatedIpPool.TagsProperty> = mutableListOf()

  /**
   * The name of the dedicated IP pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-poolname)
   * @param poolName The name of the dedicated IP pool. 
   */
  public fun poolName(poolName: String) {
    cdkBuilder.poolName(poolName)
  }

  /**
   * An object that defines the tags (keys and values) that you want to associate with the dedicated
   * IP pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-tags)
   * @param tags An object that defines the tags (keys and values) that you want to associate with
   * the dedicated IP pool. 
   */
  public fun tags(tags: CfnDedicatedIpPoolTagsPropertyDsl.() -> Unit) {
    _tags.add(CfnDedicatedIpPoolTagsPropertyDsl().apply(tags).build())
  }

  /**
   * An object that defines the tags (keys and values) that you want to associate with the dedicated
   * IP pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-tags)
   * @param tags An object that defines the tags (keys and values) that you want to associate with
   * the dedicated IP pool. 
   */
  public fun tags(tags: Collection<CfnDedicatedIpPool.TagsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDedicatedIpPool {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
