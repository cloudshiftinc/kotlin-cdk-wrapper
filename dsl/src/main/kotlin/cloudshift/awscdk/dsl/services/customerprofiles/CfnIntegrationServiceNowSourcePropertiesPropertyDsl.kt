@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * The properties that are applied when ServiceNow is being used as a source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ServiceNowSourcePropertiesProperty serviceNowSourcePropertiesProperty =
 * ServiceNowSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-servicenowsourceproperties.html)
 */
@CdkDslMarker
public class CfnIntegrationServiceNowSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnIntegration.ServiceNowSourcePropertiesProperty.Builder =
      CfnIntegration.ServiceNowSourcePropertiesProperty.builder()

  /**
   * @param object The object specified in the ServiceNow flow source. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnIntegration.ServiceNowSourcePropertiesProperty = cdkBuilder.build()
}
