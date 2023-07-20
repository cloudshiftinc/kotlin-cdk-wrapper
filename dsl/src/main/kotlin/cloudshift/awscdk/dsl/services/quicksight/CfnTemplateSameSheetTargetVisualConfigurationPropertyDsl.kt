@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSameSheetTargetVisualConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.SameSheetTargetVisualConfigurationProperty.Builder =
      CfnTemplate.SameSheetTargetVisualConfigurationProperty.builder()

  private val _targetVisuals: MutableList<String> = mutableListOf()

  public fun targetVisualOptions(targetVisualOptions: String) {
    cdkBuilder.targetVisualOptions(targetVisualOptions)
  }

  public fun targetVisuals(vararg targetVisuals: String) {
    _targetVisuals.addAll(listOf(*targetVisuals))
  }

  public fun targetVisuals(targetVisuals: Collection<String>) {
    _targetVisuals.addAll(targetVisuals)
  }

  public fun build(): CfnTemplate.SameSheetTargetVisualConfigurationProperty {
    if(_targetVisuals.isNotEmpty()) cdkBuilder.targetVisuals(_targetVisuals)
    return cdkBuilder.build()
  }
}
