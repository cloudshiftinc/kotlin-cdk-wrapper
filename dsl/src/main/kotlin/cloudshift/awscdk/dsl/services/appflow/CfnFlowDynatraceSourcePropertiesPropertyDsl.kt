@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Dynatrace is being used as a source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * DynatraceSourcePropertiesProperty dynatraceSourcePropertiesProperty =
 * DynatraceSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-dynatracesourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowDynatraceSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.DynatraceSourcePropertiesProperty.Builder =
      CfnFlow.DynatraceSourcePropertiesProperty.builder()

  /**
   * @param object The object specified in the Dynatrace flow source. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnFlow.DynatraceSourcePropertiesProperty = cdkBuilder.build()
}
