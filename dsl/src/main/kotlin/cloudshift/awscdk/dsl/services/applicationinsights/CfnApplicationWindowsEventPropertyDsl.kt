@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationWindowsEventPropertyDsl {
  private val cdkBuilder: CfnApplication.WindowsEventProperty.Builder =
      CfnApplication.WindowsEventProperty.builder()

  private val _eventLevels: MutableList<String> = mutableListOf()

  public fun eventLevels(vararg eventLevels: String) {
    _eventLevels.addAll(listOf(*eventLevels))
  }

  public fun eventLevels(eventLevels: Collection<String>) {
    _eventLevels.addAll(eventLevels)
  }

  public fun eventName(eventName: String) {
    cdkBuilder.eventName(eventName)
  }

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun patternSet(patternSet: String) {
    cdkBuilder.patternSet(patternSet)
  }

  public fun build(): CfnApplication.WindowsEventProperty {
    if(_eventLevels.isNotEmpty()) cdkBuilder.eventLevels(_eventLevels)
    return cdkBuilder.build()
  }
}
