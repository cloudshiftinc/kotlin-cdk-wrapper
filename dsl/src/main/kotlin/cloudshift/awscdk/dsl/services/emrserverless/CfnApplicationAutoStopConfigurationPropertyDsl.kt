@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationAutoStopConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.AutoStopConfigurationProperty.Builder =
      CfnApplication.AutoStopConfigurationProperty.builder()

  /**
   * @param enabled Enables the application to automatically stop after a certain amount of time
   * being idle.
   * Defaults to true.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Enables the application to automatically stop after a certain amount of time
   * being idle.
   * Defaults to true.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param idleTimeoutMinutes The amount of idle time in minutes after which your application will
   * automatically stop. Defaults to 15 minutes.
   * *Minimum* : 1
   *
   * *Maximum* : 10080
   */
  public fun idleTimeoutMinutes(idleTimeoutMinutes: Number) {
    cdkBuilder.idleTimeoutMinutes(idleTimeoutMinutes)
  }

  public fun build(): CfnApplication.AutoStopConfigurationProperty = cdkBuilder.build()
}
