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

  /**
   * @param contributorInsightsSpecification Updates the status for contributor insights for a
   * specific table or index.
   * CloudWatch Contributor Insights for DynamoDB graphs display the partition key and (if
   * applicable) sort key of frequently accessed items and frequently throttled items in plaintext. If
   * you require the use of AWS Key Management Service (KMS) to encrypt this table’s partition key and
   * sort key data with an AWS managed key or customer managed key, you should not enable CloudWatch
   * Contributor Insights for DynamoDB for this table.
   */
  public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
    cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
  }

  /**
   * @param contributorInsightsSpecification Updates the status for contributor insights for a
   * specific table or index.
   * CloudWatch Contributor Insights for DynamoDB graphs display the partition key and (if
   * applicable) sort key of frequently accessed items and frequently throttled items in plaintext. If
   * you require the use of AWS Key Management Service (KMS) to encrypt this table’s partition key and
   * sort key data with an AWS managed key or customer managed key, you should not enable CloudWatch
   * Contributor Insights for DynamoDB for this table.
   */
  public
      fun contributorInsightsSpecification(contributorInsightsSpecification: CfnGlobalTable.ContributorInsightsSpecificationProperty) {
    cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
  }

  /**
   * @param indexName The name of the global secondary index. 
   * The name must be unique among all other indexes on this table.
   */
  public fun indexName(indexName: String) {
    cdkBuilder.indexName(indexName)
  }

  /**
   * @param readProvisionedThroughputSettings Allows you to specify the read capacity settings for a
   * replica global secondary index when the `BillingMode` is set to `PROVISIONED` .
   */
  public fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable) {
    cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings)
  }

  /**
   * @param readProvisionedThroughputSettings Allows you to specify the read capacity settings for a
   * replica global secondary index when the `BillingMode` is set to `PROVISIONED` .
   */
  public
      fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: CfnGlobalTable.ReadProvisionedThroughputSettingsProperty) {
    cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings)
  }

  public fun build(): CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty =
      cdkBuilder.build()
}
