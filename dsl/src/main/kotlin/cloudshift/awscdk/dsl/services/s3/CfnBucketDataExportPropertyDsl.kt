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

  /**
   * @param destination The place to store the data for an analysis. 
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination The place to store the data for an analysis. 
   */
  public fun destination(destination: CfnBucket.DestinationProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param outputSchemaVersion The version of the output schema to use when exporting data. 
   * Must be `V_1` .
   */
  public fun outputSchemaVersion(outputSchemaVersion: String) {
    cdkBuilder.outputSchemaVersion(outputSchemaVersion)
  }

  public fun build(): CfnBucket.DataExportProperty = cdkBuilder.build()
}
