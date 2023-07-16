@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolUsernameConfigurationPropertyDsl {
  private val cdkBuilder: CfnUserPool.UsernameConfigurationProperty.Builder =
      CfnUserPool.UsernameConfigurationProperty.builder()

  public fun caseSensitive(caseSensitive: Boolean) {
    cdkBuilder.caseSensitive(caseSensitive)
  }

  public fun caseSensitive(caseSensitive: IResolvable) {
    cdkBuilder.caseSensitive(caseSensitive)
  }

  public fun build(): CfnUserPool.UsernameConfigurationProperty = cdkBuilder.build()
}
