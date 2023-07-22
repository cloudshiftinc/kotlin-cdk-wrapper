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

  /**
   * @param name A custom output group name that you can optionally define.
   * Only letters, numbers, and the underscore character are allowed. The maximum length is 32
   * characters.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param outputGroupSettings The settings associated with the output group.
   */
  public fun outputGroupSettings(outputGroupSettings: IResolvable) {
    cdkBuilder.outputGroupSettings(outputGroupSettings)
  }

  /**
   * @param outputGroupSettings The settings associated with the output group.
   */
  public fun outputGroupSettings(outputGroupSettings: CfnChannel.OutputGroupSettingsProperty) {
    cdkBuilder.outputGroupSettings(outputGroupSettings)
  }

  /**
   * @param outputs The settings for the outputs in the output group.
   */
  public fun outputs(vararg outputs: Any) {
    _outputs.addAll(listOf(*outputs))
  }

  /**
   * @param outputs The settings for the outputs in the output group.
   */
  public fun outputs(outputs: Collection<Any>) {
    _outputs.addAll(outputs)
  }

  /**
   * @param outputs The settings for the outputs in the output group.
   */
  public fun outputs(outputs: IResolvable) {
    cdkBuilder.outputs(outputs)
  }

  public fun build(): CfnChannel.OutputGroupProperty {
    if(_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
    return cdkBuilder.build()
  }
}
