@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Dashboard source entity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DashboardSourceEntityProperty dashboardSourceEntityProperty =
 * DashboardSourceEntityProperty.builder()
 * .sourceTemplate(DashboardSourceTemplateProperty.builder()
 * .arn("arn")
 * .dataSetReferences(List.of(DataSetReferenceProperty.builder()
 * .dataSetArn("dataSetArn")
 * .dataSetPlaceholder("dataSetPlaceholder")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-dashboardsourceentity.html)
 */
@CdkDslMarker
public class CfnDashboardDashboardSourceEntityPropertyDsl {
  private val cdkBuilder: CfnDashboard.DashboardSourceEntityProperty.Builder =
      CfnDashboard.DashboardSourceEntityProperty.builder()

  /**
   * @param sourceTemplate Source template.
   */
  public fun sourceTemplate(sourceTemplate: IResolvable) {
    cdkBuilder.sourceTemplate(sourceTemplate)
  }

  /**
   * @param sourceTemplate Source template.
   */
  public fun sourceTemplate(sourceTemplate: CfnDashboard.DashboardSourceTemplateProperty) {
    cdkBuilder.sourceTemplate(sourceTemplate)
  }

  public fun build(): CfnDashboard.DashboardSourceEntityProperty = cdkBuilder.build()
}
