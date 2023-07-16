@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamCopyCommandPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.CopyCommandProperty.Builder =
      CfnDeliveryStream.CopyCommandProperty.builder()

  public fun copyOptions(copyOptions: String) {
    cdkBuilder.copyOptions(copyOptions)
  }

  public fun dataTableColumns(dataTableColumns: String) {
    cdkBuilder.dataTableColumns(dataTableColumns)
  }

  public fun dataTableName(dataTableName: String) {
    cdkBuilder.dataTableName(dataTableName)
  }

  public fun build(): CfnDeliveryStream.CopyCommandProperty = cdkBuilder.build()
}
