@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnLayer

/**
 * Specifies the lifecycle event configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * LifecycleEventConfigurationProperty lifecycleEventConfigurationProperty =
 * LifecycleEventConfigurationProperty.builder()
 * .shutdownEventConfiguration(ShutdownEventConfigurationProperty.builder()
 * .delayUntilElbConnectionsDrained(false)
 * .executionTimeout(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html)
 */
@CdkDslMarker
public class CfnLayerLifecycleEventConfigurationPropertyDsl {
  private val cdkBuilder: CfnLayer.LifecycleEventConfigurationProperty.Builder =
      CfnLayer.LifecycleEventConfigurationProperty.builder()

  /**
   * @param shutdownEventConfiguration The Shutdown event configuration.
   */
  public fun shutdownEventConfiguration(shutdownEventConfiguration: IResolvable) {
    cdkBuilder.shutdownEventConfiguration(shutdownEventConfiguration)
  }

  /**
   * @param shutdownEventConfiguration The Shutdown event configuration.
   */
  public
      fun shutdownEventConfiguration(shutdownEventConfiguration: CfnLayer.ShutdownEventConfigurationProperty) {
    cdkBuilder.shutdownEventConfiguration(shutdownEventConfiguration)
  }

  public fun build(): CfnLayer.LifecycleEventConfigurationProperty = cdkBuilder.build()
}
