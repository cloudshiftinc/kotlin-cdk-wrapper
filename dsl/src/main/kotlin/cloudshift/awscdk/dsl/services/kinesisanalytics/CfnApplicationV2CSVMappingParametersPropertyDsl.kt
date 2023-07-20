@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2CSVMappingParametersPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.CSVMappingParametersProperty.Builder =
      CfnApplicationV2.CSVMappingParametersProperty.builder()

  public fun recordColumnDelimiter(recordColumnDelimiter: String) {
    cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
  }

  public fun recordRowDelimiter(recordRowDelimiter: String) {
    cdkBuilder.recordRowDelimiter(recordRowDelimiter)
  }

  public fun build(): CfnApplicationV2.CSVMappingParametersProperty = cdkBuilder.build()
}
