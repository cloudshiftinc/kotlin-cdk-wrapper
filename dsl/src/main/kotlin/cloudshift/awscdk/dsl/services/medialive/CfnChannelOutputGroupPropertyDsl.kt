@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelOutputGroupPropertyDsl {
  private val cdkBuilder: CfnChannel.OutputGroupProperty.Builder =
      CfnChannel.OutputGroupProperty.builder()

  private val _outputs: MutableList<Any> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun outputGroupSettings(outputGroupSettings: IResolvable) {
    cdkBuilder.outputGroupSettings(outputGroupSettings)
  }

  public fun outputGroupSettings(outputGroupSettings: CfnChannel.OutputGroupSettingsProperty) {
    cdkBuilder.outputGroupSettings(outputGroupSettings)
  }

  public fun outputs(vararg outputs: Any) {
    _outputs.addAll(listOf(*outputs))
  }

  public fun outputs(outputs: Collection<Any>) {
    _outputs.addAll(outputs)
  }

  public fun outputs(outputs: IResolvable) {
    cdkBuilder.outputs(outputs)
  }

  public fun build(): CfnChannel.OutputGroupProperty {
    if(_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
    return cdkBuilder.build()
  }
}
