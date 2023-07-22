@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.comprehend.CfnFlywheel

@CdkDslMarker
public class CfnFlywheelDocumentClassificationConfigPropertyDsl {
  private val cdkBuilder: CfnFlywheel.DocumentClassificationConfigProperty.Builder =
      CfnFlywheel.DocumentClassificationConfigProperty.builder()

  private val _labels: MutableList<String> = mutableListOf()

  /**
   * @param labels One or more labels to associate with the custom classifier.
   */
  public fun labels(vararg labels: String) {
    _labels.addAll(listOf(*labels))
  }

  /**
   * @param labels One or more labels to associate with the custom classifier.
   */
  public fun labels(labels: Collection<String>) {
    _labels.addAll(labels)
  }

  /**
   * @param mode Classification mode indicates whether the documents are `MULTI_CLASS` or
   * `MULTI_LABEL` . 
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun build(): CfnFlywheel.DocumentClassificationConfigProperty {
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
