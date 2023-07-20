@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisGlobalTableBorderOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.GlobalTableBorderOptionsProperty.Builder =
      CfnAnalysis.GlobalTableBorderOptionsProperty.builder()

  public fun sideSpecificBorder(sideSpecificBorder: IResolvable) {
    cdkBuilder.sideSpecificBorder(sideSpecificBorder)
  }

  public fun sideSpecificBorder(sideSpecificBorder: CfnAnalysis.TableSideBorderOptionsProperty) {
    cdkBuilder.sideSpecificBorder(sideSpecificBorder)
  }

  public fun uniformBorder(uniformBorder: IResolvable) {
    cdkBuilder.uniformBorder(uniformBorder)
  }

  public fun uniformBorder(uniformBorder: CfnAnalysis.TableBorderOptionsProperty) {
    cdkBuilder.uniformBorder(uniformBorder)
  }

  public fun build(): CfnAnalysis.GlobalTableBorderOptionsProperty = cdkBuilder.build()
}
