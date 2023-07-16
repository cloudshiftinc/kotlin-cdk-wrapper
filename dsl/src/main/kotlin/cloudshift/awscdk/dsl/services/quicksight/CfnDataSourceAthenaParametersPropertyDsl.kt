@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceAthenaParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.AthenaParametersProperty.Builder =
      CfnDataSource.AthenaParametersProperty.builder()

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun workGroup(workGroup: String) {
    cdkBuilder.workGroup(workGroup)
  }

  public fun build(): CfnDataSource.AthenaParametersProperty = cdkBuilder.build()
}
