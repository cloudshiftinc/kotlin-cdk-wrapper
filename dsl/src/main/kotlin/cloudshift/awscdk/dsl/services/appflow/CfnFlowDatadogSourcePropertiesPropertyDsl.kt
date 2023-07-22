@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Datadog is being used as a source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * DatadogSourcePropertiesProperty datadogSourcePropertiesProperty =
 * DatadogSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datadogsourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowDatadogSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.DatadogSourcePropertiesProperty.Builder =
      CfnFlow.DatadogSourcePropertiesProperty.builder()

  /**
   * @param object The object specified in the Datadog flow source. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnFlow.DatadogSourcePropertiesProperty = cdkBuilder.build()
}
