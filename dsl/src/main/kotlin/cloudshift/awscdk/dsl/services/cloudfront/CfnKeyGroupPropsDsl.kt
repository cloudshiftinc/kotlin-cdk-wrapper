@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup
import software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps

@CdkDslMarker
public class CfnKeyGroupPropsDsl {
  private val cdkBuilder: CfnKeyGroupProps.Builder = CfnKeyGroupProps.builder()

  public fun keyGroupConfig(keyGroupConfig: IResolvable) {
    cdkBuilder.keyGroupConfig(keyGroupConfig)
  }

  public fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty) {
    cdkBuilder.keyGroupConfig(keyGroupConfig)
  }

  public fun build(): CfnKeyGroupProps = cdkBuilder.build()
}
