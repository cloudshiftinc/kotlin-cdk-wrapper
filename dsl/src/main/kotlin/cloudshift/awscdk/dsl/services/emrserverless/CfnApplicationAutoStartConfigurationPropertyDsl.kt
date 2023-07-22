@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationAutoStartConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.AutoStartConfigurationProperty.Builder =
      CfnApplication.AutoStartConfigurationProperty.builder()

  /**
   * @param enabled Enables the application to automatically start on job submission.
   * Defaults to true.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Enables the application to automatically start on job submission.
   * Defaults to true.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnApplication.AutoStartConfigurationProperty = cdkBuilder.build()
}
