@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnFlowLog

@CdkDslMarker
public class CfnFlowLogDestinationOptionsPropertyDsl {
  private val cdkBuilder: CfnFlowLog.DestinationOptionsProperty.Builder =
      CfnFlowLog.DestinationOptionsProperty.builder()

  public fun fileFormat(fileFormat: String) {
    cdkBuilder.fileFormat(fileFormat)
  }

  public fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean) {
    cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
  }

  public fun hiveCompatiblePartitions(hiveCompatiblePartitions: IResolvable) {
    cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
  }

  public fun perHourPartition(perHourPartition: Boolean) {
    cdkBuilder.perHourPartition(perHourPartition)
  }

  public fun perHourPartition(perHourPartition: IResolvable) {
    cdkBuilder.perHourPartition(perHourPartition)
  }

  public fun build(): CfnFlowLog.DestinationOptionsProperty = cdkBuilder.build()
}
