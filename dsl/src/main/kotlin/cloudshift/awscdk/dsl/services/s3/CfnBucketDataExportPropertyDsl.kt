@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketDataExportPropertyDsl {
  private val cdkBuilder: CfnBucket.DataExportProperty.Builder =
      CfnBucket.DataExportProperty.builder()

  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  public fun destination(destination: CfnBucket.DestinationProperty) {
    cdkBuilder.destination(destination)
  }

  public fun outputSchemaVersion(outputSchemaVersion: String) {
    cdkBuilder.outputSchemaVersion(outputSchemaVersion)
  }

  public fun build(): CfnBucket.DataExportProperty = cdkBuilder.build()
}
