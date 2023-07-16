@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

@CdkDslMarker
public class CfnPipelineAddAttributesPropertyDsl {
  private val cdkBuilder: CfnPipeline.AddAttributesProperty.Builder =
      CfnPipeline.AddAttributesProperty.builder()

  public fun attributes(attributes: Map<String, String>) {
    cdkBuilder.attributes(attributes)
  }

  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun next(next: String) {
    cdkBuilder.next(next)
  }

  public fun build(): CfnPipeline.AddAttributesProperty = cdkBuilder.build()
}
