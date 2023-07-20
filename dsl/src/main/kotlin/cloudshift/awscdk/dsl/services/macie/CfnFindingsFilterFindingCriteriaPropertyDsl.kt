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

  public fun criterion(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.criterion(builder.map)
  }

  public fun criterion(criterion: Map<String, Any>) {
    cdkBuilder.criterion(criterion)
  }

  public fun criterion(criterion: IResolvable) {
    cdkBuilder.criterion(criterion)
  }

  public fun build(): CfnFindingsFilter.FindingCriteriaProperty = cdkBuilder.build()
}
