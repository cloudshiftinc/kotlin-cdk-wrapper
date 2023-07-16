@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableContributorInsightsSpecificationPropertyDsl {
  private val cdkBuilder: CfnTable.ContributorInsightsSpecificationProperty.Builder =
      CfnTable.ContributorInsightsSpecificationProperty.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnTable.ContributorInsightsSpecificationProperty = cdkBuilder.build()
}
