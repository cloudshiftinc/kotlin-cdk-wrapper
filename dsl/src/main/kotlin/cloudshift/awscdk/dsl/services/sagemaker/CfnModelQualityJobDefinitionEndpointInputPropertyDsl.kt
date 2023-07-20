@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionEndpointInputPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.EndpointInputProperty.Builder =
      CfnModelQualityJobDefinition.EndpointInputProperty.builder()

  public fun endTimeOffset(endTimeOffset: String) {
    cdkBuilder.endTimeOffset(endTimeOffset)
  }

  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  public fun inferenceAttribute(inferenceAttribute: String) {
    cdkBuilder.inferenceAttribute(inferenceAttribute)
  }

  public fun localPath(localPath: String) {
    cdkBuilder.localPath(localPath)
  }

  public fun probabilityAttribute(probabilityAttribute: String) {
    cdkBuilder.probabilityAttribute(probabilityAttribute)
  }

  public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
    cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
  }

  public fun s3DataDistributionType(s3DataDistributionType: String) {
    cdkBuilder.s3DataDistributionType(s3DataDistributionType)
  }

  public fun s3InputMode(s3InputMode: String) {
    cdkBuilder.s3InputMode(s3InputMode)
  }

  public fun startTimeOffset(startTimeOffset: String) {
    cdkBuilder.startTimeOffset(startTimeOffset)
  }

  public fun build(): CfnModelQualityJobDefinition.EndpointInputProperty = cdkBuilder.build()
}
