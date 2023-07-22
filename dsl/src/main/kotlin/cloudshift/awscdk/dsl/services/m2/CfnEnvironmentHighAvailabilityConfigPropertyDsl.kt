@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.m2.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentHighAvailabilityConfigPropertyDsl {
  private val cdkBuilder: CfnEnvironment.HighAvailabilityConfigProperty.Builder =
      CfnEnvironment.HighAvailabilityConfigProperty.builder()

  /**
   * @param desiredCapacity The number of instances in a high availability configuration. 
   */
  public fun desiredCapacity(desiredCapacity: Number) {
    cdkBuilder.desiredCapacity(desiredCapacity)
  }

  public fun build(): CfnEnvironment.HighAvailabilityConfigProperty = cdkBuilder.build()
}
