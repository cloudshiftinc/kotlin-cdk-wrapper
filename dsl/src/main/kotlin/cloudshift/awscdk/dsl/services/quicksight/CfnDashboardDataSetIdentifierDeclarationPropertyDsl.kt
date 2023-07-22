@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDataSetIdentifierDeclarationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DataSetIdentifierDeclarationProperty.Builder =
      CfnDashboard.DataSetIdentifierDeclarationProperty.builder()

  /**
   * @param dataSetArn The Amazon Resource Name (ARN) of the data set. 
   */
  public fun dataSetArn(dataSetArn: String) {
    cdkBuilder.dataSetArn(dataSetArn)
  }

  /**
   * @param identifier The identifier of the data set, typically the data set's name. 
   */
  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  public fun build(): CfnDashboard.DataSetIdentifierDeclarationProperty = cdkBuilder.build()
}
