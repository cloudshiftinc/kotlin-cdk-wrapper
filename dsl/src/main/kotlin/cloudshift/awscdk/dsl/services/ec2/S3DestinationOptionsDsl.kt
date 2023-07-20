@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.FlowLogFileFormat
import software.amazon.awscdk.services.ec2.S3DestinationOptions

@CdkDslMarker
public class S3DestinationOptionsDsl {
  private val cdkBuilder: S3DestinationOptions.Builder = S3DestinationOptions.builder()

  public fun fileFormat(fileFormat: FlowLogFileFormat) {
    cdkBuilder.fileFormat(fileFormat)
  }

  public fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean) {
    cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
  }

  public fun perHourPartition(perHourPartition: Boolean) {
    cdkBuilder.perHourPartition(perHourPartition)
  }

  public fun build(): S3DestinationOptions = cdkBuilder.build()
}
