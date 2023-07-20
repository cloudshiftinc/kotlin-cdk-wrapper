@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotcoredeviceadvisor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps

@CdkDslMarker
public class CfnSuiteDefinitionPropsDsl {
  private val cdkBuilder: CfnSuiteDefinitionProps.Builder = CfnSuiteDefinitionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun suiteDefinitionConfiguration(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.suiteDefinitionConfiguration(builder.map)
  }

  public fun suiteDefinitionConfiguration(suiteDefinitionConfiguration: Any) {
    cdkBuilder.suiteDefinitionConfiguration(suiteDefinitionConfiguration)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSuiteDefinitionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
