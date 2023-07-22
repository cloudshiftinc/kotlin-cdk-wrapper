@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

@CdkDslMarker
public class CfnFHIRDatastorePreloadDataConfigPropertyDsl {
  private val cdkBuilder: CfnFHIRDatastore.PreloadDataConfigProperty.Builder =
      CfnFHIRDatastore.PreloadDataConfigProperty.builder()

  /**
   * @param preloadDataType The type of preloaded data. 
   * Only Synthea preloaded data is supported.
   */
  public fun preloadDataType(preloadDataType: String) {
    cdkBuilder.preloadDataType(preloadDataType)
  }

  public fun build(): CfnFHIRDatastore.PreloadDataConfigProperty = cdkBuilder.build()
}
