@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointDynamoDbSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.DynamoDbSettingsProperty.Builder =
      CfnEndpoint.DynamoDbSettingsProperty.builder()

  public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
    cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
  }

  public fun build(): CfnEndpoint.DynamoDbSettingsProperty = cdkBuilder.build()
}
