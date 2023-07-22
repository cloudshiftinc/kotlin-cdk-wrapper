@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.lambda.LayerVersionOptions

@CdkDslMarker
public class LayerVersionOptionsDsl {
  private val cdkBuilder: LayerVersionOptions.Builder = LayerVersionOptions.builder()

  /**
   * @param description The description the this Lambda Layer.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param layerVersionName The name of the layer.
   */
  public fun layerVersionName(layerVersionName: String) {
    cdkBuilder.layerVersionName(layerVersionName)
  }

  /**
   * @param license The SPDX licence identifier or URL to the license file for this layer.
   */
  public fun license(license: String) {
    cdkBuilder.license(license)
  }

  /**
   * @param removalPolicy Whether to retain this version of the layer when a new version is added or
   * when the stack is deleted.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun build(): LayerVersionOptions = cdkBuilder.build()
}
