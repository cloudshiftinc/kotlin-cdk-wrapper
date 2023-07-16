@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRuleNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnRule.NetworkConfigurationProperty.Builder =
      CfnRule.NetworkConfigurationProperty.builder()

  public fun awsVpcConfiguration(awsVpcConfiguration: IResolvable) {
    cdkBuilder.awsVpcConfiguration(awsVpcConfiguration)
  }

  public fun awsVpcConfiguration(awsVpcConfiguration: CfnRule.AwsVpcConfigurationProperty) {
    cdkBuilder.awsVpcConfiguration(awsVpcConfiguration)
  }

  public fun build(): CfnRule.NetworkConfigurationProperty = cdkBuilder.build()
}
