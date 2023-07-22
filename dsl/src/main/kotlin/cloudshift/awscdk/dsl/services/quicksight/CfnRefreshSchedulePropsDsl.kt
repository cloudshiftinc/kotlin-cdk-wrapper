@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps

@CdkDslMarker
public class CfnRefreshSchedulePropsDsl {
  private val cdkBuilder: CfnRefreshScheduleProps.Builder = CfnRefreshScheduleProps.builder()

  /**
   * @param awsAccountId The AWS account ID of the account that you are creating a schedule in.
   */
  public fun awsAccountId(awsAccountId: String) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  /**
   * @param dataSetId The ID of the dataset that you are creating a refresh schedule for.
   */
  public fun dataSetId(dataSetId: String) {
    cdkBuilder.dataSetId(dataSetId)
  }

  /**
   * @param schedule The refresh schedule of a dataset.
   */
  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param schedule The refresh schedule of a dataset.
   */
  public fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty) {
    cdkBuilder.schedule(schedule)
  }

  public fun build(): CfnRefreshScheduleProps = cdkBuilder.build()
}
