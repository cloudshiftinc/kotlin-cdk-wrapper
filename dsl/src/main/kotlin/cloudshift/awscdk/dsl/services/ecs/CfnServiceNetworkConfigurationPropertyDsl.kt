@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

@CdkDslMarker
public class CfnServiceNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.NetworkConfigurationProperty.Builder =
      CfnService.NetworkConfigurationProperty.builder()

  public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
    cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
  }

  public fun awsvpcConfiguration(awsvpcConfiguration: CfnService.AwsVpcConfigurationProperty) {
    cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
  }

  public fun build(): CfnService.NetworkConfigurationProperty = cdkBuilder.build()
}
