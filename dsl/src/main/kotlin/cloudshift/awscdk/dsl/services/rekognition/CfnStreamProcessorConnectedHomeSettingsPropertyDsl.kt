@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@CdkDslMarker
public class CfnStreamProcessorConnectedHomeSettingsPropertyDsl {
  private val cdkBuilder: CfnStreamProcessor.ConnectedHomeSettingsProperty.Builder =
      CfnStreamProcessor.ConnectedHomeSettingsProperty.builder()

  private val _labels: MutableList<String> = mutableListOf()

  public fun labels(vararg labels: String) {
    _labels.addAll(listOf(*labels))
  }

  public fun labels(labels: Collection<String>) {
    _labels.addAll(labels)
  }

  public fun minConfidence(minConfidence: Number) {
    cdkBuilder.minConfidence(minConfidence)
  }

  public fun build(): CfnStreamProcessor.ConnectedHomeSettingsProperty {
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
