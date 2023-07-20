@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.detective.CfnGraphProps

@CdkDslMarker
public class CfnGraphPropsDsl {
  private val cdkBuilder: CfnGraphProps.Builder = CfnGraphProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun autoEnableMembers(autoEnableMembers: Boolean) {
    cdkBuilder.autoEnableMembers(autoEnableMembers)
  }

  public fun autoEnableMembers(autoEnableMembers: IResolvable) {
    cdkBuilder.autoEnableMembers(autoEnableMembers)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnGraphProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
