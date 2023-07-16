@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig

@CdkDslMarker
public class AccessLogDestinationConfigDsl {
  private val cdkBuilder: AccessLogDestinationConfig.Builder = AccessLogDestinationConfig.builder()

  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  public fun build(): AccessLogDestinationConfig = cdkBuilder.build()
}
