@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when using Zendesk as a flow source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ZendeskSourcePropertiesProperty zendeskSourcePropertiesProperty =
 * ZendeskSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendesksourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowZendeskSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.ZendeskSourcePropertiesProperty.Builder =
      CfnFlow.ZendeskSourcePropertiesProperty.builder()

  /**
   * @param object The object specified in the Zendesk flow source. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnFlow.ZendeskSourcePropertiesProperty = cdkBuilder.build()
}
