@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule

@CdkDslMarker
public class CfnRefreshScheduleRefreshScheduleMapPropertyDsl {
  private val cdkBuilder: CfnRefreshSchedule.RefreshScheduleMapProperty.Builder =
      CfnRefreshSchedule.RefreshScheduleMapProperty.builder()

  /**
   * @param refreshType The type of refresh that a dataset undergoes. Valid values are as follows:.
   * * `FULL_REFRESH` : A complete refresh of a dataset.
   * * `INCREMENTAL_REFRESH` : A partial refresh of some rows of a dataset, based on the time window
   * specified.
   *
   * For more information on full and incremental refreshes, see [Refreshing SPICE
   * data](https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun refreshType(refreshType: String) {
    cdkBuilder.refreshType(refreshType)
  }

  /**
   * @param scheduleFrequency The frequency for the refresh schedule.
   */
  public fun scheduleFrequency(scheduleFrequency: IResolvable) {
    cdkBuilder.scheduleFrequency(scheduleFrequency)
  }

  /**
   * @param scheduleFrequency The frequency for the refresh schedule.
   */
  public fun scheduleFrequency(scheduleFrequency: CfnRefreshSchedule.ScheduleFrequencyProperty) {
    cdkBuilder.scheduleFrequency(scheduleFrequency)
  }

  /**
   * @param scheduleId An identifier for the refresh schedule.
   */
  public fun scheduleId(scheduleId: String) {
    cdkBuilder.scheduleId(scheduleId)
  }

  /**
   * @param startAfterDateTime Time after which the refresh schedule can be started, expressed in
   * `YYYY-MM-DDTHH:MM:SS` format.
   */
  public fun startAfterDateTime(startAfterDateTime: String) {
    cdkBuilder.startAfterDateTime(startAfterDateTime)
  }

  public fun build(): CfnRefreshSchedule.RefreshScheduleMapProperty = cdkBuilder.build()
}
