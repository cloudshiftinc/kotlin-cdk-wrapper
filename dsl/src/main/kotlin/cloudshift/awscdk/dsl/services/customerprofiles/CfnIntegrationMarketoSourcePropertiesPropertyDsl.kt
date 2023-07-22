@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * The properties that are applied when Marketo is being used as a source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * MarketoSourcePropertiesProperty marketoSourcePropertiesProperty =
 * MarketoSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-marketosourceproperties.html)
 */
@CdkDslMarker
public class CfnIntegrationMarketoSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnIntegration.MarketoSourcePropertiesProperty.Builder =
      CfnIntegration.MarketoSourcePropertiesProperty.builder()

  /**
   * @param object The object specified in the Marketo flow source. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnIntegration.MarketoSourcePropertiesProperty = cdkBuilder.build()
}
