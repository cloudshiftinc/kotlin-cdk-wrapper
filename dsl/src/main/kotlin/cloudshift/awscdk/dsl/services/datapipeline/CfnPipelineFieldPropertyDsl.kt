@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datapipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineFieldPropertyDsl {
  private val cdkBuilder: CfnPipeline.FieldProperty.Builder = CfnPipeline.FieldProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun refValue(refValue: String) {
    cdkBuilder.refValue(refValue)
  }

  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun build(): CfnPipeline.FieldProperty = cdkBuilder.build()
}
