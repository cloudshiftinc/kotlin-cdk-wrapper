@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * TracingConfigurationProperty tracingConfigurationProperty =
 * TracingConfigurationProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-tracingconfiguration.html)
 */
@CdkDslMarker
public class CfnStateMachineTracingConfigurationPropertyDsl {
  private val cdkBuilder: CfnStateMachine.TracingConfigurationProperty.Builder =
      CfnStateMachine.TracingConfigurationProperty.builder()

  /**
   * @param enabled the value to be set.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled the value to be set.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnStateMachine.TracingConfigurationProperty = cdkBuilder.build()
}
