@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@CdkDslMarker
public class CfnGlobalTableReplicaGlobalSecondaryIndexSpecificationPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.Builder =
      CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.builder()

  public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
    cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
  }

  public
      fun contributorInsightsSpecification(contributorInsightsSpecification: CfnGlobalTable.ContributorInsightsSpecificationProperty) {
    cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
  }

  public fun indexName(indexName: String) {
    cdkBuilder.indexName(indexName)
  }

  public fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable) {
    cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings)
  }

  public
      fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: CfnGlobalTable.ReadProvisionedThroughputSettingsProperty) {
    cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings)
  }

  public fun build(): CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty =
      cdkBuilder.build()
}
