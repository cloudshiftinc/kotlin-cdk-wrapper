@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnLayer

/**
 * The Shutdown event configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * ShutdownEventConfigurationProperty shutdownEventConfigurationProperty =
 * ShutdownEventConfigurationProperty.builder()
 * .delayUntilElbConnectionsDrained(false)
 * .executionTimeout(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-shutdowneventconfiguration.html)
 */
@CdkDslMarker
public class CfnLayerShutdownEventConfigurationPropertyDsl {
  private val cdkBuilder: CfnLayer.ShutdownEventConfigurationProperty.Builder =
      CfnLayer.ShutdownEventConfigurationProperty.builder()

  /**
   * @param delayUntilElbConnectionsDrained Whether to enable Elastic Load Balancing connection
   * draining.
   * For more information, see [Connection
   * Draining](https://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain)
   */
  public fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: Boolean) {
    cdkBuilder.delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained)
  }

  /**
   * @param delayUntilElbConnectionsDrained Whether to enable Elastic Load Balancing connection
   * draining.
   * For more information, see [Connection
   * Draining](https://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain)
   */
  public fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: IResolvable) {
    cdkBuilder.delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained)
  }

  /**
   * @param executionTimeout The time, in seconds, that AWS OpsWorks Stacks waits after triggering a
   * Shutdown event before shutting down an instance.
   */
  public fun executionTimeout(executionTimeout: Number) {
    cdkBuilder.executionTimeout(executionTimeout)
  }

  public fun build(): CfnLayer.ShutdownEventConfigurationProperty = cdkBuilder.build()
}
