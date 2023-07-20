@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnBucketReplicationRulePropertyDsl {
    private val cdkBuilder: CfnBucket.ReplicationRuleProperty.Builder =
        CfnBucket.ReplicationRuleProperty.builder()

    public fun deleteMarkerReplication(deleteMarkerReplication: IResolvable) {
        cdkBuilder.deleteMarkerReplication(deleteMarkerReplication)
    }

    public fun deleteMarkerReplication(deleteMarkerReplication: CfnBucket.DeleteMarkerReplicationProperty) {
        cdkBuilder.deleteMarkerReplication(deleteMarkerReplication)
    }

    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    public fun destination(destination: CfnBucket.ReplicationDestinationProperty) {
        cdkBuilder.destination(destination)
    }

    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    public fun filter(filter: CfnBucket.ReplicationRuleFilterProperty) {
        cdkBuilder.filter(filter)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun sourceSelectionCriteria(sourceSelectionCriteria: IResolvable) {
        cdkBuilder.sourceSelectionCriteria(sourceSelectionCriteria)
    }

    public fun sourceSelectionCriteria(sourceSelectionCriteria: CfnBucket.SourceSelectionCriteriaProperty) {
        cdkBuilder.sourceSelectionCriteria(sourceSelectionCriteria)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnBucket.ReplicationRuleProperty = cdkBuilder.build()
}
