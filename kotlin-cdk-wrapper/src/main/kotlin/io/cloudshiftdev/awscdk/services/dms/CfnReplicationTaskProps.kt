@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnReplicationTask`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnReplicationTaskProps cfnReplicationTaskProps = CfnReplicationTaskProps.builder()
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
public interface CfnReplicationTaskProps {
  /**
   * Indicates when you want a change data capture (CDC) operation to start.
   *
   * Use either `CdcStartPosition` or `CdcStartTime` to specify when you want a CDC operation to
   * start. Specifying both values results in an error.
   *
   * The value can be in date, checkpoint, log sequence number (LSN), or system change number (SCN)
   * format.
   *
   * Here is a date example: `--cdc-start-position "2018-03-08T12:12:12"`
   *
   * Here is a checkpoint example: `--cdc-start-position
   * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"`
   *
   * Here is an LSN example: `--cdc-start-position “mysql-bin-changelog.000024:373”`
   *
   *
   * When you use this task setting with a source PostgreSQL database, a logical replication slot
   * should already be created and associated with the source endpoint. You can verify this by setting
   * the `slotName` extra connection attribute to the name of this logical replication slot. For more
   * information, see [Extra Connection Attributes When Using PostgreSQL as a Source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstartposition)
   */
  public fun cdcStartPosition(): String? = unwrap(this).getCdcStartPosition()

  /**
   * Indicates the start time for a change data capture (CDC) operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime)
   */
  public fun cdcStartTime(): Number? = unwrap(this).getCdcStartTime()

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
   */
  public fun cdcStopPosition(): String? = unwrap(this).getCdcStopPosition()

  /**
   * The migration type.
   *
   * Valid values: `full-load` | `cdc` | `full-load-and-cdc`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype)
   */
  public fun migrationType(): String

  /**
   * The Amazon Resource Name (ARN) of a replication instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn)
   */
  public fun replicationInstanceArn(): String

  /**
   * An identifier for the replication task.
   *
   * Constraints:
   *
   * * Must contain 1-255 alphanumeric characters or hyphens.
   * * First character must be a letter.
   * * Cannot end with a hyphen or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier)
   */
  public fun replicationTaskIdentifier(): String? = unwrap(this).getReplicationTaskIdentifier()

  /**
   * Overall settings for the task, in JSON format.
   *
   * For more information, see [Specifying Task Settings for AWS Database Migration Service
   * Tasks](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings)
   */
  public fun replicationTaskSettings(): String? = unwrap(this).getReplicationTaskSettings()

  /**
   * A display name for the resource identifier at the end of the `EndpointArn` response parameter
   * that is returned in the created `Endpoint` object.
   *
   * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
   * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens, and
   * can only begin with a letter, such as `Example-App-ARN1` .
   *
   * For example, this value might result in the `EndpointArn` value
   * `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
   * `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
   * `EndpointArn` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-resourceidentifier)
   */
  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn)
   */
  public fun sourceEndpointArn(): String

  /**
   * The table mappings for the task, in JSON format.
   *
   * For more information, see [Using Table Mapping to Specify Task
   * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings)
   */
  public fun tableMappings(): String

  /**
   * One or more tags to be assigned to the replication task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn)
   */
  public fun targetEndpointArn(): String

  /**
   * Supplemental information that the task requires to migrate the data for certain source and
   * target endpoints.
   *
   * For more information, see [Specifying Supplemental Data for Task
   * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) in the *AWS
   * Database Migration Service User Guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-taskdata)
   */
  public fun taskData(): String? = unwrap(this).getTaskData()

  /**
   * A builder for [CfnReplicationTaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cdcStartPosition Indicates when you want a change data capture (CDC) operation to
     * start.
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
     *
     * When you use this task setting with a source PostgreSQL database, a logical replication slot
     * should already be created and associated with the source endpoint. You can verify this by
     * setting the `slotName` extra connection attribute to the name of this logical replication slot.
     * For more information, see [Extra Connection Attributes When Using PostgreSQL as a Source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun cdcStartPosition(cdcStartPosition: String)

    /**
     * @param cdcStartTime Indicates the start time for a change data capture (CDC) operation.
     */
    public fun cdcStartTime(cdcStartTime: Number)

    /**
     * @param cdcStopPosition Indicates when you want a change data capture (CDC) operation to stop.
     * The value can be either server time or commit time.
     *
     * Here is a server time example: `--cdc-stop-position "server_time:2018-02-09T12:12:12"`
     *
     * Here is a commit time example: `--cdc-stop-position "commit_time: 2018-02-09T12:12:12"`
     */
    public fun cdcStopPosition(cdcStopPosition: String)

    /**
     * @param migrationType The migration type. 
     * Valid values: `full-load` | `cdc` | `full-load-and-cdc`
     */
    public fun migrationType(migrationType: String)

    /**
     * @param replicationInstanceArn The Amazon Resource Name (ARN) of a replication instance. 
     */
    public fun replicationInstanceArn(replicationInstanceArn: String)

    /**
     * @param replicationTaskIdentifier An identifier for the replication task.
     * Constraints:
     *
     * * Must contain 1-255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     */
    public fun replicationTaskIdentifier(replicationTaskIdentifier: String)

    /**
     * @param replicationTaskSettings Overall settings for the task, in JSON format.
     * For more information, see [Specifying Task Settings for AWS Database Migration Service
     * Tasks](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun replicationTaskSettings(replicationTaskSettings: String)

    /**
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object.
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter, such as `Example-App-ARN1` .
     *
     * For example, this value might result in the `EndpointArn` value
     * `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
     * `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
     * `EndpointArn` .
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * @param sourceEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the source
     * endpoint. 
     */
    public fun sourceEndpointArn(sourceEndpointArn: String)

    /**
     * @param tableMappings The table mappings for the task, in JSON format. 
     * For more information, see [Using Table Mapping to Specify Task
     * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun tableMappings(tableMappings: String)

    /**
     * @param tags One or more tags to be assigned to the replication task.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags One or more tags to be assigned to the replication task.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the target
     * endpoint. 
     */
    public fun targetEndpointArn(targetEndpointArn: String)

    /**
     * @param taskData Supplemental information that the task requires to migrate the data for
     * certain source and target endpoints.
     * For more information, see [Specifying Supplemental Data for Task
     * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) in the *AWS
     * Database Migration Service User Guide.*
     */
    public fun taskData(taskData: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationTaskProps.builder()

    /**
     * @param cdcStartPosition Indicates when you want a change data capture (CDC) operation to
     * start.
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
     *
     * When you use this task setting with a source PostgreSQL database, a logical replication slot
     * should already be created and associated with the source endpoint. You can verify this by
     * setting the `slotName` extra connection attribute to the name of this logical replication slot.
     * For more information, see [Extra Connection Attributes When Using PostgreSQL as a Source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun cdcStartPosition(cdcStartPosition: String) {
      cdkBuilder.cdcStartPosition(cdcStartPosition)
    }

    /**
     * @param cdcStartTime Indicates the start time for a change data capture (CDC) operation.
     */
    override fun cdcStartTime(cdcStartTime: Number) {
      cdkBuilder.cdcStartTime(cdcStartTime)
    }

    /**
     * @param cdcStopPosition Indicates when you want a change data capture (CDC) operation to stop.
     * The value can be either server time or commit time.
     *
     * Here is a server time example: `--cdc-stop-position "server_time:2018-02-09T12:12:12"`
     *
     * Here is a commit time example: `--cdc-stop-position "commit_time: 2018-02-09T12:12:12"`
     */
    override fun cdcStopPosition(cdcStopPosition: String) {
      cdkBuilder.cdcStopPosition(cdcStopPosition)
    }

    /**
     * @param migrationType The migration type. 
     * Valid values: `full-load` | `cdc` | `full-load-and-cdc`
     */
    override fun migrationType(migrationType: String) {
      cdkBuilder.migrationType(migrationType)
    }

    /**
     * @param replicationInstanceArn The Amazon Resource Name (ARN) of a replication instance. 
     */
    override fun replicationInstanceArn(replicationInstanceArn: String) {
      cdkBuilder.replicationInstanceArn(replicationInstanceArn)
    }

    /**
     * @param replicationTaskIdentifier An identifier for the replication task.
     * Constraints:
     *
     * * Must contain 1-255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     */
    override fun replicationTaskIdentifier(replicationTaskIdentifier: String) {
      cdkBuilder.replicationTaskIdentifier(replicationTaskIdentifier)
    }

    /**
     * @param replicationTaskSettings Overall settings for the task, in JSON format.
     * For more information, see [Specifying Task Settings for AWS Database Migration Service
     * Tasks](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun replicationTaskSettings(replicationTaskSettings: String) {
      cdkBuilder.replicationTaskSettings(replicationTaskSettings)
    }

    /**
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object.
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter, such as `Example-App-ARN1` .
     *
     * For example, this value might result in the `EndpointArn` value
     * `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
     * `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
     * `EndpointArn` .
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param sourceEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the source
     * endpoint. 
     */
    override fun sourceEndpointArn(sourceEndpointArn: String) {
      cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    /**
     * @param tableMappings The table mappings for the task, in JSON format. 
     * For more information, see [Using Table Mapping to Specify Task
     * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun tableMappings(tableMappings: String) {
      cdkBuilder.tableMappings(tableMappings)
    }

    /**
     * @param tags One or more tags to be assigned to the replication task.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags One or more tags to be assigned to the replication task.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the target
     * endpoint. 
     */
    override fun targetEndpointArn(targetEndpointArn: String) {
      cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    /**
     * @param taskData Supplemental information that the task requires to migrate the data for
     * certain source and target endpoints.
     * For more information, see [Specifying Supplemental Data for Task
     * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) in the *AWS
     * Database Migration Service User Guide.*
     */
    override fun taskData(taskData: String) {
      cdkBuilder.taskData(taskData)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dms.CfnReplicationTaskProps,
  ) : CdkObject(cdkObject), CfnReplicationTaskProps {
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
     *
     * When you use this task setting with a source PostgreSQL database, a logical replication slot
     * should already be created and associated with the source endpoint. You can verify this by
     * setting the `slotName` extra connection attribute to the name of this logical replication slot.
     * For more information, see [Extra Connection Attributes When Using PostgreSQL as a Source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstartposition)
     */
    override fun cdcStartPosition(): String? = unwrap(this).getCdcStartPosition()

    /**
     * Indicates the start time for a change data capture (CDC) operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime)
     */
    override fun cdcStartTime(): Number? = unwrap(this).getCdcStartTime()

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
     */
    override fun cdcStopPosition(): String? = unwrap(this).getCdcStopPosition()

    /**
     * The migration type.
     *
     * Valid values: `full-load` | `cdc` | `full-load-and-cdc`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype)
     */
    override fun migrationType(): String = unwrap(this).getMigrationType()

    /**
     * The Amazon Resource Name (ARN) of a replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn)
     */
    override fun replicationInstanceArn(): String = unwrap(this).getReplicationInstanceArn()

    /**
     * An identifier for the replication task.
     *
     * Constraints:
     *
     * * Must contain 1-255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier)
     */
    override fun replicationTaskIdentifier(): String? = unwrap(this).getReplicationTaskIdentifier()

    /**
     * Overall settings for the task, in JSON format.
     *
     * For more information, see [Specifying Task Settings for AWS Database Migration Service
     * Tasks](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings)
     */
    override fun replicationTaskSettings(): String? = unwrap(this).getReplicationTaskSettings()

    /**
     * A display name for the resource identifier at the end of the `EndpointArn` response parameter
     * that is returned in the created `Endpoint` object.
     *
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter, such as `Example-App-ARN1` .
     *
     * For example, this value might result in the `EndpointArn` value
     * `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
     * `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
     * `EndpointArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-resourceidentifier)
     */
    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn)
     */
    override fun sourceEndpointArn(): String = unwrap(this).getSourceEndpointArn()

    /**
     * The table mappings for the task, in JSON format.
     *
     * For more information, see [Using Table Mapping to Specify Task
     * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings)
     */
    override fun tableMappings(): String = unwrap(this).getTableMappings()

    /**
     * One or more tags to be assigned to the replication task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn)
     */
    override fun targetEndpointArn(): String = unwrap(this).getTargetEndpointArn()

    /**
     * Supplemental information that the task requires to migrate the data for certain source and
     * target endpoints.
     *
     * For more information, see [Specifying Supplemental Data for Task
     * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) in the *AWS
     * Database Migration Service User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-taskdata)
     */
    override fun taskData(): String? = unwrap(this).getTaskData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationTaskProps):
        CfnReplicationTaskProps = CdkObjectWrappers.wrap(cdkObject) as? CfnReplicationTaskProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationTaskProps):
        software.amazon.awscdk.services.dms.CfnReplicationTaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnReplicationTaskProps
  }
}
