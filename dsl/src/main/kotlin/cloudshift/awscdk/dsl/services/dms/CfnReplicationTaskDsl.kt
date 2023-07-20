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

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.dms.CfnReplicationTask
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnReplicationTaskDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReplicationTask.Builder = CfnReplicationTask.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun cdcStartPosition(cdcStartPosition: String) {
        cdkBuilder.cdcStartPosition(cdcStartPosition)
    }

    public fun cdcStartTime(cdcStartTime: Number) {
        cdkBuilder.cdcStartTime(cdcStartTime)
    }

    public fun cdcStopPosition(cdcStopPosition: String) {
        cdkBuilder.cdcStopPosition(cdcStopPosition)
    }

    public fun migrationType(migrationType: String) {
        cdkBuilder.migrationType(migrationType)
    }

    public fun replicationInstanceArn(replicationInstanceArn: String) {
        cdkBuilder.replicationInstanceArn(replicationInstanceArn)
    }

    public fun replicationTaskIdentifier(replicationTaskIdentifier: String) {
        cdkBuilder.replicationTaskIdentifier(replicationTaskIdentifier)
    }

    public fun replicationTaskSettings(replicationTaskSettings: String) {
        cdkBuilder.replicationTaskSettings(replicationTaskSettings)
    }

    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public fun sourceEndpointArn(sourceEndpointArn: String) {
        cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    public fun tableMappings(tableMappings: String) {
        cdkBuilder.tableMappings(tableMappings)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun targetEndpointArn(targetEndpointArn: String) {
        cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    public fun taskData(taskData: String) {
        cdkBuilder.taskData(taskData)
    }

    public fun build(): CfnReplicationTask {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
