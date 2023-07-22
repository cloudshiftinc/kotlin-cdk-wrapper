@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisEntityPropertyDsl {
  private val cdkBuilder: CfnAnalysis.EntityProperty.Builder = CfnAnalysis.EntityProperty.builder()

  /**
   * @param path The hierarchical path of the entity within the analysis, template, or dashboard
   * definition tree.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnAnalysis.EntityProperty = cdkBuilder.build()
}
