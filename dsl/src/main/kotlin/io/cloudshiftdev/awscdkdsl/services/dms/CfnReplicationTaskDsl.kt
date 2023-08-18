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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.dms.CfnReplicationTask
import software.constructs.Construct

/**
 * The `AWS::DMS::ReplicationTask` resource creates an AWS DMS replication task.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * CfnReplicationTask cfnReplicationTask = CfnReplicationTask.Builder.create(this,
 * "MyCfnReplicationTask")
 * .migrationType("migrationType")
 * .replicationInstanceArn("replicationInstanceArn")
 * .sourceEndpointArn("sourceEndpointArn")
 * .tableMappings("tableMappings")
 * .targetEndpointArn("targetEndpointArn")
 * // the properties below are optional
 * .cdcStartPosition("cdcStartPosition")
 * .cdcStartTime(123)
 * .cdcStopPosition("cdcStopPosition")
 * .replicationTaskIdentifier("replicationTaskIdentifier")
 * .replicationTaskSettings("replicationTaskSettings")
 * .resourceIdentifier("resourceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskData("taskData")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html)
 */
@CdkDslMarker
public class CfnReplicationTaskDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReplicationTask.Builder =
        CfnReplicationTask.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Indicates when you want a change data capture (CDC) operation to start.
     *
     * Use either `CdcStartPosition` or `CdcStartTime` to specify when you want a CDC operation to
     * start. Specifying both values results in an error.
     *
     * The value can be in date, checkpoint, log sequence number (LSN), or system change number
     * (SCN) format.
     *
     * Here is a date example: `--cdc-start-position "2018-03-08T12:12:12"`
     *
     * Here is a checkpoint example: `--cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"`
     *
     * Here is an LSN example: `--cdc-start-position “mysql-bin-changelog.000024:373”`
     *
     * When you use this task setting with a source PostgreSQL database, a logical replication slot
     * should already be created and associated with the source endpoint. You can verify this by
     * setting the `slotName` extra connection attribute to the name of this logical replication
     * slot. For more information, see
     * [Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstartposition)
     *
     * @param cdcStartPosition Indicates when you want a change data capture (CDC) operation to
     *   start.
     */
    public fun cdcStartPosition(cdcStartPosition: String) {
        cdkBuilder.cdcStartPosition(cdcStartPosition)
    }

    /**
     * Indicates the start time for a change data capture (CDC) operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime)
     *
     * @param cdcStartTime Indicates the start time for a change data capture (CDC) operation.
     */
    public fun cdcStartTime(cdcStartTime: Number) {
        cdkBuilder.cdcStartTime(cdcStartTime)
    }

    /**
     * Indicates when you want a change data capture (CDC) operation to stop.
     *
     * The value can be either server time or commit time.
     *
     * Here is a server time example: `--cdc-stop-position "server_time:2018-02-09T12:12:12"`
     *
     * Here is a commit time example: `--cdc-stop-position "commit_time: 2018-02-09T12:12:12"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstopposition)
     *
     * @param cdcStopPosition Indicates when you want a change data capture (CDC) operation to stop.
     */
    public fun cdcStopPosition(cdcStopPosition: String) {
        cdkBuilder.cdcStopPosition(cdcStopPosition)
    }

    /**
     * The migration type.
     *
     * Valid values: `full-load` | `cdc` | `full-load-and-cdc`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype)
     *
     * @param migrationType The migration type.
     */
    public fun migrationType(migrationType: String) {
        cdkBuilder.migrationType(migrationType)
    }

    /**
     * The Amazon Resource Name (ARN) of a replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn)
     *
     * @param replicationInstanceArn The Amazon Resource Name (ARN) of a replication instance.
     */
    public fun replicationInstanceArn(replicationInstanceArn: String) {
        cdkBuilder.replicationInstanceArn(replicationInstanceArn)
    }

    /**
     * An identifier for the replication task.
     *
     * Constraints:
     * * Must contain 1-255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier)
     *
     * @param replicationTaskIdentifier An identifier for the replication task.
     */
    public fun replicationTaskIdentifier(replicationTaskIdentifier: String) {
        cdkBuilder.replicationTaskIdentifier(replicationTaskIdentifier)
    }

    /**
     * Overall settings for the task, in JSON format.
     *
     * For more information, see
     * [Specifying Task Settings for AWS Database Migration Service Tasks](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings)
     *
     * @param replicationTaskSettings Overall settings for the task, in JSON format.
     */
    public fun replicationTaskSettings(replicationTaskSettings: String) {
        cdkBuilder.replicationTaskSettings(replicationTaskSettings)
    }

    /**
     * A display name for the resource identifier at the end of the `EndpointArn` response parameter
     * that is returned in the created `Endpoint` object.
     *
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive
     * hyphens, and can only begin with a letter, such as `Example-App-ARN1` .
     *
     * For example, this value might result in the `EndpointArn` value
     * `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
     * `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
     * `EndpointArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-resourceidentifier)
     *
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     *   `EndpointArn` response parameter that is returned in the created `Endpoint` object.
     */
    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn)
     *
     * @param sourceEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the source
     *   endpoint.
     */
    public fun sourceEndpointArn(sourceEndpointArn: String) {
        cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    /**
     * The table mappings for the task, in JSON format.
     *
     * For more information, see
     * [Using Table Mapping to Specify Task Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings)
     *
     * @param tableMappings The table mappings for the task, in JSON format.
     */
    public fun tableMappings(tableMappings: String) {
        cdkBuilder.tableMappings(tableMappings)
    }

    /**
     * One or more tags to be assigned to the replication task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
     *
     * @param tags One or more tags to be assigned to the replication task.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * One or more tags to be assigned to the replication task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
     *
     * @param tags One or more tags to be assigned to the replication task.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn)
     *
     * @param targetEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the target
     *   endpoint.
     */
    public fun targetEndpointArn(targetEndpointArn: String) {
        cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-taskdata)
     *
     * @param taskData
     */
    public fun taskData(taskData: String) {
        cdkBuilder.taskData(taskData)
    }

    public fun build(): CfnReplicationTask {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
