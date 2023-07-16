@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

@CdkDslMarker
public class CfnStudioComponentComputeFarmConfigurationPropertyDsl {
  private val cdkBuilder: CfnStudioComponent.ComputeFarmConfigurationProperty.Builder =
      CfnStudioComponent.ComputeFarmConfigurationProperty.builder()

  public fun activeDirectoryUser(activeDirectoryUser: String) {
    cdkBuilder.activeDirectoryUser(activeDirectoryUser)
  }

  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun build(): CfnStudioComponent.ComputeFarmConfigurationProperty = cdkBuilder.build()
}
