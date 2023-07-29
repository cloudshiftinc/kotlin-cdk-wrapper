@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iottwinmaker.CfnSyncJob
import software.constructs.Construct

/**
 * The SyncJob.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * CfnSyncJob cfnSyncJob = CfnSyncJob.Builder.create(this, "MyCfnSyncJob")
 * .syncRole("syncRole")
 * .syncSource("syncSource")
 * .workspaceId("workspaceId")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html)
 */
@CdkDslMarker
public class CfnSyncJobDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSyncJob.Builder = CfnSyncJob.Builder.create(scope, id)

    /**
     * The SyncJob IAM role.
     *
     * This IAM role is used by the sync job to read from the syncSource, and create, update or
     * delete the corresponding resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-syncrole)
     *
     * @param syncRole The SyncJob IAM role.
     */
    public fun syncRole(syncRole: String) {
        cdkBuilder.syncRole(syncRole)
    }

    /**
     * The sync source.
     *
     * Currently the only supported syncSoucre is `SITEWISE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-syncsource)
     *
     * @param syncSource The sync source.
     */
    public fun syncSource(syncSource: String) {
        cdkBuilder.syncSource(syncSource)
    }

    /**
     * Metadata you can use to manage the SyncJob.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-tags)
     *
     * @param tags Metadata you can use to manage the SyncJob.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The ID of the workspace that contains the sync job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html#cfn-iottwinmaker-syncjob-workspaceid)
     *
     * @param workspaceId The ID of the workspace that contains the sync job.
     */
    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnSyncJob = cdkBuilder.build()
}
