@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The static data configuration of the reference line data configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ReferenceLineStaticDataConfigurationProperty referenceLineStaticDataConfigurationProperty =
 * ReferenceLineStaticDataConfigurationProperty.builder()
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-referencelinestaticdataconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardReferenceLineStaticDataConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ReferenceLineStaticDataConfigurationProperty.Builder =
      CfnDashboard.ReferenceLineStaticDataConfigurationProperty.builder()

  /**
   * @param value The double input of the static data. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.ReferenceLineStaticDataConfigurationProperty = cdkBuilder.build()
}
