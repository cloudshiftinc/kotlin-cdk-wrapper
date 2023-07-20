@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3outposts.CfnEndpoint

@CdkDslMarker
public class CfnEndpointFailedReasonPropertyDsl {
  private val cdkBuilder: CfnEndpoint.FailedReasonProperty.Builder =
      CfnEndpoint.FailedReasonProperty.builder()

  public fun errorCode(errorCode: String) {
    cdkBuilder.errorCode(errorCode)
  }

  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun build(): CfnEndpoint.FailedReasonProperty = cdkBuilder.build()
}
