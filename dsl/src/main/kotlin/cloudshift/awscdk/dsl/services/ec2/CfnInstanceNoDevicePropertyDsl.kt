@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnInstance

@CdkDslMarker
public class CfnInstanceNoDevicePropertyDsl {
  private val cdkBuilder: CfnInstance.NoDeviceProperty.Builder =
      CfnInstance.NoDeviceProperty.builder()

  public fun build(): CfnInstance.NoDeviceProperty = cdkBuilder.build()
}
