@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Dashboard source template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DashboardSourceTemplateProperty dashboardSourceTemplateProperty =
 * DashboardSourceTemplateProperty.builder()
 * .arn("arn")
 * .dataSetReferences(List.of(DataSetReferenceProperty.builder()
 * .dataSetArn("dataSetArn")
 * .dataSetPlaceholder("dataSetPlaceholder")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-dashboardsourcetemplate.html)
 */
@CdkDslMarker
public class CfnDashboardDashboardSourceTemplatePropertyDsl {
  private val cdkBuilder: CfnDashboard.DashboardSourceTemplateProperty.Builder =
      CfnDashboard.DashboardSourceTemplateProperty.builder()

  private val _dataSetReferences: MutableList<Any> = mutableListOf()

  /**
   * @param arn The Amazon Resource Name (ARN) of the resource. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param dataSetReferences Dataset references. 
   */
  public fun dataSetReferences(vararg dataSetReferences: Any) {
    _dataSetReferences.addAll(listOf(*dataSetReferences))
  }

  /**
   * @param dataSetReferences Dataset references. 
   */
  public fun dataSetReferences(dataSetReferences: Collection<Any>) {
    _dataSetReferences.addAll(dataSetReferences)
  }

  /**
   * @param dataSetReferences Dataset references. 
   */
  public fun dataSetReferences(dataSetReferences: IResolvable) {
    cdkBuilder.dataSetReferences(dataSetReferences)
  }

  public fun build(): CfnDashboard.DashboardSourceTemplateProperty {
    if(_dataSetReferences.isNotEmpty()) cdkBuilder.dataSetReferences(_dataSetReferences)
    return cdkBuilder.build()
  }
}
