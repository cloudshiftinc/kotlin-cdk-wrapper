@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilledMapFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilledMapFieldWellsProperty.Builder =
      CfnTemplate.FilledMapFieldWellsProperty.builder()

  public fun filledMapAggregatedFieldWells(filledMapAggregatedFieldWells: IResolvable) {
    cdkBuilder.filledMapAggregatedFieldWells(filledMapAggregatedFieldWells)
  }

  public
      fun filledMapAggregatedFieldWells(filledMapAggregatedFieldWells: CfnTemplate.FilledMapAggregatedFieldWellsProperty) {
    cdkBuilder.filledMapAggregatedFieldWells(filledMapAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.FilledMapFieldWellsProperty = cdkBuilder.build()
}
