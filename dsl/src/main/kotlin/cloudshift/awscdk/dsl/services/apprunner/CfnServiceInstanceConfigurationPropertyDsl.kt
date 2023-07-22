@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceInstanceConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.InstanceConfigurationProperty.Builder =
      CfnService.InstanceConfigurationProperty.builder()

  /**
   * @param cpu The number of CPU units reserved for each instance of your App Runner service.
   * Default: `1 vCPU`
   */
  public fun cpu(cpu: String) {
    cdkBuilder.cpu(cpu)
  }

  /**
   * @param instanceRoleArn The Amazon Resource Name (ARN) of an IAM role that provides permissions
   * to your App Runner service.
   * These are permissions that your code needs when it calls any AWS APIs.
   */
  public fun instanceRoleArn(instanceRoleArn: String) {
    cdkBuilder.instanceRoleArn(instanceRoleArn)
  }

  /**
   * @param memory The amount of memory, in MB or GB, reserved for each instance of your App Runner
   * service.
   * Default: `2 GB`
   */
  public fun memory(memory: String) {
    cdkBuilder.memory(memory)
  }

  public fun build(): CfnService.InstanceConfigurationProperty = cdkBuilder.build()
}
