@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

@CdkDslMarker
public class CfnRotationRecurrenceSettingsPropertyDsl {
  private val cdkBuilder: CfnRotation.RecurrenceSettingsProperty.Builder =
      CfnRotation.RecurrenceSettingsProperty.builder()

  private val _dailySettings: MutableList<String> = mutableListOf()

  private val _monthlySettings: MutableList<Any> = mutableListOf()

  private val _shiftCoverages: MutableList<Any> = mutableListOf()

  private val _weeklySettings: MutableList<Any> = mutableListOf()

  public fun dailySettings(vararg dailySettings: String) {
    _dailySettings.addAll(listOf(*dailySettings))
  }

  public fun dailySettings(dailySettings: Collection<String>) {
    _dailySettings.addAll(dailySettings)
  }

  public fun monthlySettings(vararg monthlySettings: Any) {
    _monthlySettings.addAll(listOf(*monthlySettings))
  }

  public fun monthlySettings(monthlySettings: Collection<Any>) {
    _monthlySettings.addAll(monthlySettings)
  }

  public fun monthlySettings(monthlySettings: IResolvable) {
    cdkBuilder.monthlySettings(monthlySettings)
  }

  public fun numberOfOnCalls(numberOfOnCalls: Number) {
    cdkBuilder.numberOfOnCalls(numberOfOnCalls)
  }

  public fun recurrenceMultiplier(recurrenceMultiplier: Number) {
    cdkBuilder.recurrenceMultiplier(recurrenceMultiplier)
  }

  public fun shiftCoverages(vararg shiftCoverages: Any) {
    _shiftCoverages.addAll(listOf(*shiftCoverages))
  }

  public fun shiftCoverages(shiftCoverages: Collection<Any>) {
    _shiftCoverages.addAll(shiftCoverages)
  }

  public fun shiftCoverages(shiftCoverages: IResolvable) {
    cdkBuilder.shiftCoverages(shiftCoverages)
  }

  public fun weeklySettings(vararg weeklySettings: Any) {
    _weeklySettings.addAll(listOf(*weeklySettings))
  }

  public fun weeklySettings(weeklySettings: Collection<Any>) {
    _weeklySettings.addAll(weeklySettings)
  }

  public fun weeklySettings(weeklySettings: IResolvable) {
    cdkBuilder.weeklySettings(weeklySettings)
  }

  public fun build(): CfnRotation.RecurrenceSettingsProperty {
    if(_dailySettings.isNotEmpty()) cdkBuilder.dailySettings(_dailySettings)
    if(_monthlySettings.isNotEmpty()) cdkBuilder.monthlySettings(_monthlySettings)
    if(_shiftCoverages.isNotEmpty()) cdkBuilder.shiftCoverages(_shiftCoverages)
    if(_weeklySettings.isNotEmpty()) cdkBuilder.weeklySettings(_weeklySettings)
    return cdkBuilder.build()
  }
}
