@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioChannelMappingPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioChannelMappingProperty.Builder =
      CfnChannel.AudioChannelMappingProperty.builder()

  private val _inputChannelLevels: MutableList<Any> = mutableListOf()

  /**
   * @param inputChannelLevels The indices and gain values for each input channel that should be
   * remixed into this output channel.
   */
  public fun inputChannelLevels(vararg inputChannelLevels: Any) {
    _inputChannelLevels.addAll(listOf(*inputChannelLevels))
  }

  /**
   * @param inputChannelLevels The indices and gain values for each input channel that should be
   * remixed into this output channel.
   */
  public fun inputChannelLevels(inputChannelLevels: Collection<Any>) {
    _inputChannelLevels.addAll(inputChannelLevels)
  }

  /**
   * @param inputChannelLevels The indices and gain values for each input channel that should be
   * remixed into this output channel.
   */
  public fun inputChannelLevels(inputChannelLevels: IResolvable) {
    cdkBuilder.inputChannelLevels(inputChannelLevels)
  }

  /**
   * @param outputChannel The index of the output channel that is being produced.
   */
  public fun outputChannel(outputChannel: Number) {
    cdkBuilder.outputChannel(outputChannel)
  }

  public fun build(): CfnChannel.AudioChannelMappingProperty {
    if(_inputChannelLevels.isNotEmpty()) cdkBuilder.inputChannelLevels(_inputChannelLevels)
    return cdkBuilder.build()
  }
}
