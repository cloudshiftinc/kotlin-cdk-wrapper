@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@CdkDslMarker
public class CfnEventSourceMappingOnFailurePropertyDsl {
  private val cdkBuilder: CfnEventSourceMapping.OnFailureProperty.Builder =
      CfnEventSourceMapping.OnFailureProperty.builder()

  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  public fun build(): CfnEventSourceMapping.OnFailureProperty = cdkBuilder.build()
}
