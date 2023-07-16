@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableFieldWellsProperty.Builder =
      CfnTemplate.TableFieldWellsProperty.builder()

  public fun tableAggregatedFieldWells(tableAggregatedFieldWells: IResolvable) {
    cdkBuilder.tableAggregatedFieldWells(tableAggregatedFieldWells)
  }

  public
      fun tableAggregatedFieldWells(tableAggregatedFieldWells: CfnTemplate.TableAggregatedFieldWellsProperty) {
    cdkBuilder.tableAggregatedFieldWells(tableAggregatedFieldWells)
  }

  public fun tableUnaggregatedFieldWells(tableUnaggregatedFieldWells: IResolvable) {
    cdkBuilder.tableUnaggregatedFieldWells(tableUnaggregatedFieldWells)
  }

  public
      fun tableUnaggregatedFieldWells(tableUnaggregatedFieldWells: CfnTemplate.TableUnaggregatedFieldWellsProperty) {
    cdkBuilder.tableUnaggregatedFieldWells(tableUnaggregatedFieldWells)
  }

  public fun build(): CfnTemplate.TableFieldWellsProperty = cdkBuilder.build()
}
