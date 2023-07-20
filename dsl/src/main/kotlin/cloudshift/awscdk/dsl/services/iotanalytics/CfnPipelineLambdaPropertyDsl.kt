@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

@CdkDslMarker
public class CfnPipelineLambdaPropertyDsl {
  private val cdkBuilder: CfnPipeline.LambdaProperty.Builder = CfnPipeline.LambdaProperty.builder()

  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  public fun lambdaName(lambdaName: String) {
    cdkBuilder.lambdaName(lambdaName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun next(next: String) {
    cdkBuilder.next(next)
  }

  public fun build(): CfnPipeline.LambdaProperty = cdkBuilder.build()
}
