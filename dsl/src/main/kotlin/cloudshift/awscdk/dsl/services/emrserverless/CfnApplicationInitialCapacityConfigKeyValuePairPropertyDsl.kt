@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationInitialCapacityConfigKeyValuePairPropertyDsl {
  private val cdkBuilder: CfnApplication.InitialCapacityConfigKeyValuePairProperty.Builder =
      CfnApplication.InitialCapacityConfigKeyValuePairProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnApplication.InitialCapacityConfigProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnApplication.InitialCapacityConfigKeyValuePairProperty = cdkBuilder.build()
}
