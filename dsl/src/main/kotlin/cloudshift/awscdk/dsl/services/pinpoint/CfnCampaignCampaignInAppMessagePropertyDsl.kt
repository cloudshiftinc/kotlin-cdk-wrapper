@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignCampaignInAppMessagePropertyDsl {
  private val cdkBuilder: CfnCampaign.CampaignInAppMessageProperty.Builder =
      CfnCampaign.CampaignInAppMessageProperty.builder()

  private val _content: MutableList<Any> = mutableListOf()

  public fun content(vararg content: Any) {
    _content.addAll(listOf(*content))
  }

  public fun content(content: Collection<Any>) {
    _content.addAll(content)
  }

  public fun content(content: IResolvable) {
    cdkBuilder.content(content)
  }

  public fun customConfig(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.customConfig(builder.map)
  }

  public fun customConfig(customConfig: Any) {
    cdkBuilder.customConfig(customConfig)
  }

  public fun layout(layout: String) {
    cdkBuilder.layout(layout)
  }

  public fun build(): CfnCampaign.CampaignInAppMessageProperty {
    if(_content.isNotEmpty()) cdkBuilder.content(_content)
    return cdkBuilder.build()
  }
}
