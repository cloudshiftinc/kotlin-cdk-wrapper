@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnFindingsFilter

@CdkDslMarker
public class CfnFindingsFilterFindingCriteriaPropertyDsl {
  private val cdkBuilder: CfnFindingsFilter.FindingCriteriaProperty.Builder =
      CfnFindingsFilter.FindingCriteriaProperty.builder()

  /**
   * @param criterion Specifies a condition that defines the property, operator, and one or more
   * values to use to filter the results.
   */
  public fun criterion(criterion: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(criterion)
    cdkBuilder.criterion(builder.map)
  }

  /**
   * @param criterion Specifies a condition that defines the property, operator, and one or more
   * values to use to filter the results.
   */
  public fun criterion(criterion: Map<String, Any>) {
    cdkBuilder.criterion(criterion)
  }

  /**
   * @param criterion Specifies a condition that defines the property, operator, and one or more
   * values to use to filter the results.
   */
  public fun criterion(criterion: IResolvable) {
    cdkBuilder.criterion(criterion)
  }

  public fun build(): CfnFindingsFilter.FindingCriteriaProperty = cdkBuilder.build()
}
