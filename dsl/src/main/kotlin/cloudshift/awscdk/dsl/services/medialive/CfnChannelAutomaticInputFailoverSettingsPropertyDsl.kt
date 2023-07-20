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

  public fun errorClearTimeMsec(errorClearTimeMsec: Number) {
    cdkBuilder.errorClearTimeMsec(errorClearTimeMsec)
  }

  public fun failoverConditions(vararg failoverConditions: Any) {
    _failoverConditions.addAll(listOf(*failoverConditions))
  }

  public fun failoverConditions(failoverConditions: Collection<Any>) {
    _failoverConditions.addAll(failoverConditions)
  }

  public fun failoverConditions(failoverConditions: IResolvable) {
    cdkBuilder.failoverConditions(failoverConditions)
  }

  public fun inputPreference(inputPreference: String) {
    cdkBuilder.inputPreference(inputPreference)
  }

  public fun secondaryInputId(secondaryInputId: String) {
    cdkBuilder.secondaryInputId(secondaryInputId)
  }

  public fun build(): CfnChannel.AutomaticInputFailoverSettingsProperty {
    if(_failoverConditions.isNotEmpty()) cdkBuilder.failoverConditions(_failoverConditions)
    return cdkBuilder.build()
  }
}
