@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetIngestionWaitPolicyPropertyDsl {
  private val cdkBuilder: CfnDataSet.IngestionWaitPolicyProperty.Builder =
      CfnDataSet.IngestionWaitPolicyProperty.builder()

  public fun ingestionWaitTimeInHours(ingestionWaitTimeInHours: Number) {
    cdkBuilder.ingestionWaitTimeInHours(ingestionWaitTimeInHours)
  }

  public fun waitForSpiceIngestion(waitForSpiceIngestion: Boolean) {
    cdkBuilder.waitForSpiceIngestion(waitForSpiceIngestion)
  }

  public fun waitForSpiceIngestion(waitForSpiceIngestion: IResolvable) {
    cdkBuilder.waitForSpiceIngestion(waitForSpiceIngestion)
  }

  public fun build(): CfnDataSet.IngestionWaitPolicyProperty = cdkBuilder.build()
}
