@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@CdkDslMarker
public class CfnComponentVersionLambdaEventSourcePropertyDsl {
  private val cdkBuilder: CfnComponentVersion.LambdaEventSourceProperty.Builder =
      CfnComponentVersion.LambdaEventSourceProperty.builder()

  public fun topic(topic: String) {
    cdkBuilder.topic(topic)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnComponentVersion.LambdaEventSourceProperty = cdkBuilder.build()
}
