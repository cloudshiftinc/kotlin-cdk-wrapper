@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

@CdkDslMarker
public class CfnStudioComponentComputeFarmConfigurationPropertyDsl {
  private val cdkBuilder: CfnStudioComponent.ComputeFarmConfigurationProperty.Builder =
      CfnStudioComponent.ComputeFarmConfigurationProperty.builder()

  /**
   * @param activeDirectoryUser The name of an Active Directory user that is used on ComputeFarm
   * worker instances.
   */
  public fun activeDirectoryUser(activeDirectoryUser: String) {
    cdkBuilder.activeDirectoryUser(activeDirectoryUser)
  }

  /**
   * @param endpoint The endpoint of the ComputeFarm that is accessed by the studio component
   * resource.
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun build(): CfnStudioComponent.ComputeFarmConfigurationProperty = cdkBuilder.build()
}
