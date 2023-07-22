@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnFilter
import software.constructs.Construct

@CdkDslMarker
public class CfnFilterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFilter.Builder = CfnFilter.Builder.create(scope, id)

  /**
   * A description of the filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-description)
   * @param description A description of the filter. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The action that is to be applied to the findings that match the filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filteraction)
   * @param filterAction The action that is to be applied to the findings that match the filter. 
   */
  public fun filterAction(filterAction: String) {
    cdkBuilder.filterAction(filterAction)
  }

  /**
   * Details on the filter criteria associated with this filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
   * @param filterCriteria Details on the filter criteria associated with this filter. 
   */
  public fun filterCriteria(filterCriteria: IResolvable) {
    cdkBuilder.filterCriteria(filterCriteria)
  }

  /**
   * Details on the filter criteria associated with this filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
   * @param filterCriteria Details on the filter criteria associated with this filter. 
   */
  public fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty) {
    cdkBuilder.filterCriteria(filterCriteria)
  }

  /**
   * The name of the filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-name)
   * @param name The name of the filter. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnFilter = cdkBuilder.build()
}
