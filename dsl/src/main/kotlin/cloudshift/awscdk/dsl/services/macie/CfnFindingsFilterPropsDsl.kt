@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import software.amazon.awscdk.services.macie.CfnFindingsFilterProps

@CdkDslMarker
public class CfnFindingsFilterPropsDsl {
  private val cdkBuilder: CfnFindingsFilterProps.Builder = CfnFindingsFilterProps.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun findingCriteria(findingCriteria: IResolvable) {
    cdkBuilder.findingCriteria(findingCriteria)
  }

  public fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty) {
    cdkBuilder.findingCriteria(findingCriteria)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun position(position: Number) {
    cdkBuilder.position(position)
  }

  public fun build(): CfnFindingsFilterProps = cdkBuilder.build()
}
