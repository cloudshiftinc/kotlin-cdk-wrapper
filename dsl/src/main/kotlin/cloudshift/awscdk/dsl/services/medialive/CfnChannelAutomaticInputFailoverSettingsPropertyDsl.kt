@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAutomaticInputFailoverSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AutomaticInputFailoverSettingsProperty.Builder =
      CfnChannel.AutomaticInputFailoverSettingsProperty.builder()

  private val _failoverConditions: MutableList<Any> = mutableListOf()

  /**
   * @param errorClearTimeMsec This clear time defines the requirement a recovered input must meet
   * to be considered healthy.
   * The input must have no failover conditions for this length of time. Enter a time in
   * milliseconds. This value is particularly important if the input_preference for the failover pair
   * is set to PRIMARY_INPUT_PREFERRED, because after this time, MediaLive will switch back to the
   * primary input.
   */
  public fun errorClearTimeMsec(errorClearTimeMsec: Number) {
    cdkBuilder.errorClearTimeMsec(errorClearTimeMsec)
  }

  /**
   * @param failoverConditions A list of failover conditions.
   * If any of these conditions occur, MediaLive will perform a failover to the other input.
   */
  public fun failoverConditions(vararg failoverConditions: Any) {
    _failoverConditions.addAll(listOf(*failoverConditions))
  }

  /**
   * @param failoverConditions A list of failover conditions.
   * If any of these conditions occur, MediaLive will perform a failover to the other input.
   */
  public fun failoverConditions(failoverConditions: Collection<Any>) {
    _failoverConditions.addAll(failoverConditions)
  }

  /**
   * @param failoverConditions A list of failover conditions.
   * If any of these conditions occur, MediaLive will perform a failover to the other input.
   */
  public fun failoverConditions(failoverConditions: IResolvable) {
    cdkBuilder.failoverConditions(failoverConditions)
  }

  /**
   * @param inputPreference Input preference when deciding which input to make active when a
   * previously failed input has recovered.
   */
  public fun inputPreference(inputPreference: String) {
    cdkBuilder.inputPreference(inputPreference)
  }

  /**
   * @param secondaryInputId The input ID of the secondary input in the automatic input failover
   * pair.
   */
  public fun secondaryInputId(secondaryInputId: String) {
    cdkBuilder.secondaryInputId(secondaryInputId)
  }

  public fun build(): CfnChannel.AutomaticInputFailoverSettingsProperty {
    if(_failoverConditions.isNotEmpty()) cdkBuilder.failoverConditions(_failoverConditions)
    return cdkBuilder.build()
  }
}
