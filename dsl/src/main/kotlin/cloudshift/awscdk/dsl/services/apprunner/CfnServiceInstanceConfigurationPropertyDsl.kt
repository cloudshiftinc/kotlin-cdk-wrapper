@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceInstanceConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.InstanceConfigurationProperty.Builder =
      CfnService.InstanceConfigurationProperty.builder()

  public fun cpu(cpu: String) {
    cdkBuilder.cpu(cpu)
  }

  public fun instanceRoleArn(instanceRoleArn: String) {
    cdkBuilder.instanceRoleArn(instanceRoleArn)
  }

  public fun memory(memory: String) {
    cdkBuilder.memory(memory)
  }

  public fun build(): CfnService.InstanceConfigurationProperty = cdkBuilder.build()
}
