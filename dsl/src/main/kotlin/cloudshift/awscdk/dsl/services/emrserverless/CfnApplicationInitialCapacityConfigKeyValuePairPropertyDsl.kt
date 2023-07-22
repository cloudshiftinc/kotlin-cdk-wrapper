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

  /**
   * @param key The worker type for an analytics framework. 
   * For Spark applications, the key can either be set to `Driver` or `Executor` . For Hive
   * applications, it can be set to `HiveDriver` or `TezTask` .
   *
   * *Minimum* : 1
   *
   * *Maximum* : 50
   *
   * *Pattern* : `^[a-zA-Z]+[-_]*[a-zA-Z]+$`
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value for the initial capacity configuration per worker. 
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The value for the initial capacity configuration per worker. 
   */
  public fun `value`(`value`: CfnApplication.InitialCapacityConfigProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnApplication.InitialCapacityConfigKeyValuePairProperty = cdkBuilder.build()
}
