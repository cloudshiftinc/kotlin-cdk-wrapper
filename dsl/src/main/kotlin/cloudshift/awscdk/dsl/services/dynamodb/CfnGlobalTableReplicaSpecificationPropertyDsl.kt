@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@CdkDslMarker
public class CfnGlobalTableReplicaSpecificationPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.ReplicaSpecificationProperty.Builder =
      CfnGlobalTable.ReplicaSpecificationProperty.builder()

  private val _globalSecondaryIndexes: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
    cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
  }

  public
      fun contributorInsightsSpecification(contributorInsightsSpecification: CfnGlobalTable.ContributorInsightsSpecificationProperty) {
    cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
  }

  public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
    cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
  }

  public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
    cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
  }

  public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any) {
    _globalSecondaryIndexes.addAll(listOf(*globalSecondaryIndexes))
  }

  public fun globalSecondaryIndexes(globalSecondaryIndexes: Collection<Any>) {
    _globalSecondaryIndexes.addAll(globalSecondaryIndexes)
  }

  public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
    cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
  }

  public fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable) {
    cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification)
  }

  public
      fun kinesisStreamSpecification(kinesisStreamSpecification: CfnGlobalTable.KinesisStreamSpecificationProperty) {
    cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification)
  }

  public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable) {
    cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification)
  }

  public
      fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: CfnGlobalTable.PointInTimeRecoverySpecificationProperty) {
    cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification)
  }

  public fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable) {
    cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings)
  }

  public
      fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: CfnGlobalTable.ReadProvisionedThroughputSettingsProperty) {
    cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun sseSpecification(sseSpecification: IResolvable) {
    cdkBuilder.sseSpecification(sseSpecification)
  }

  public fun sseSpecification(sseSpecification: CfnGlobalTable.ReplicaSSESpecificationProperty) {
    cdkBuilder.sseSpecification(sseSpecification)
  }

  public fun tableClass(tableClass: String) {
    cdkBuilder.tableClass(tableClass)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnGlobalTable.ReplicaSpecificationProperty {
    if(_globalSecondaryIndexes.isNotEmpty())
        cdkBuilder.globalSecondaryIndexes(_globalSecondaryIndexes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
