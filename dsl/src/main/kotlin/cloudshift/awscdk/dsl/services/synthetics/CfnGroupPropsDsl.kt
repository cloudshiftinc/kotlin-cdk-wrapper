@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.synthetics.CfnGroupProps

@CdkDslMarker
public class CfnGroupPropsDsl {
  private val cdkBuilder: CfnGroupProps.Builder = CfnGroupProps.builder()

  private val _resourceArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param name A name for the group. It can include any Unicode characters. 
   * The names for all groups in your account, across all Regions, must be unique.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param resourceArns The ARNs of the canaries that you want to associate with this group.
   */
  public fun resourceArns(vararg resourceArns: String) {
    _resourceArns.addAll(listOf(*resourceArns))
  }

  /**
   * @param resourceArns The ARNs of the canaries that you want to associate with this group.
   */
  public fun resourceArns(resourceArns: Collection<String>) {
    _resourceArns.addAll(resourceArns)
  }

  /**
   * @param tags The list of key-value pairs that are associated with the group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The list of key-value pairs that are associated with the group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnGroupProps {
    if(_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
