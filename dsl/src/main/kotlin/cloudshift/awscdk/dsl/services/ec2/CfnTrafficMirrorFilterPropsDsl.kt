@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps

@CdkDslMarker
public class CfnTrafficMirrorFilterPropsDsl {
  private val cdkBuilder: CfnTrafficMirrorFilterProps.Builder =
      CfnTrafficMirrorFilterProps.builder()

  private val _networkServices: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The description of the Traffic Mirror filter.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param networkServices The network service traffic that is associated with the Traffic Mirror
   * filter.
   * Valid values are `amazon-dns` .
   */
  public fun networkServices(vararg networkServices: String) {
    _networkServices.addAll(listOf(*networkServices))
  }

  /**
   * @param networkServices The network service traffic that is associated with the Traffic Mirror
   * filter.
   * Valid values are `amazon-dns` .
   */
  public fun networkServices(networkServices: Collection<String>) {
    _networkServices.addAll(networkServices)
  }

  /**
   * @param tags The tags to assign to a Traffic Mirror filter.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to assign to a Traffic Mirror filter.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnTrafficMirrorFilterProps {
    if(_networkServices.isNotEmpty()) cdkBuilder.networkServices(_networkServices)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
