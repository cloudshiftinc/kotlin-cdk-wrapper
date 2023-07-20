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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iottwinmaker.CfnSyncJob
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnSyncJobDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSyncJob.Builder = CfnSyncJob.Builder.create(scope, id)

    public fun syncRole(syncRole: String) {
        cdkBuilder.syncRole(syncRole)
    }

    public fun syncSource(syncSource: String) {
        cdkBuilder.syncSource(syncSource)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnSyncJob = cdkBuilder.build()
}
