@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DMS::ReplicationTask` resource creates an AWS DMS replication task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
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
public open class CfnReplicationTask(
  cdkObject: software.amazon.awscdk.services.dms.CfnReplicationTask,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReplicationTaskProps,
  ) :
      this(software.amazon.awscdk.services.dms.CfnReplicationTask(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnReplicationTaskProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReplicationTaskProps.Builder.() -> Unit,
  ) : this(scope, id, CfnReplicationTaskProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Indicates when you want a change data capture (CDC) operation to start.
   */
  public open fun cdcStartPosition(): String? = unwrap(this).getCdcStartPosition()

  /**
   * Indicates when you want a change data capture (CDC) operation to start.
   */
  public open fun cdcStartPosition(`value`: String) {
    unwrap(this).setCdcStartPosition(`value`)
  }

  /**
   * Indicates the start time for a change data capture (CDC) operation.
   */
  public open fun cdcStartTime(): Number? = unwrap(this).getCdcStartTime()

  /**
   * Indicates the start time for a change data capture (CDC) operation.
   */
  public open fun cdcStartTime(`value`: Number) {
    unwrap(this).setCdcStartTime(`value`)
  }

  /**
   * Indicates when you want a change data capture (CDC) operation to stop.
   */
  public open fun cdcStopPosition(): String? = unwrap(this).getCdcStopPosition()

  /**
   * Indicates when you want a change data capture (CDC) operation to stop.
   */
  public open fun cdcStopPosition(`value`: String) {
    unwrap(this).setCdcStopPosition(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The migration type.
   */
  public open fun migrationType(): String = unwrap(this).getMigrationType()

  /**
   * The migration type.
   */
  public open fun migrationType(`value`: String) {
    unwrap(this).setMigrationType(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of a replication instance.
   */
  public open fun replicationInstanceArn(): String = unwrap(this).getReplicationInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of a replication instance.
   */
  public open fun replicationInstanceArn(`value`: String) {
    unwrap(this).setReplicationInstanceArn(`value`)
  }

  /**
   * An identifier for the replication task.
   */
  public open fun replicationTaskIdentifier(): String? = unwrap(this).getReplicationTaskIdentifier()

  /**
   * An identifier for the replication task.
   */
  public open fun replicationTaskIdentifier(`value`: String) {
    unwrap(this).setReplicationTaskIdentifier(`value`)
  }

  /**
   * Overall settings for the task, in JSON format.
   */
  public open fun replicationTaskSettings(): String? = unwrap(this).getReplicationTaskSettings()

  /**
   * Overall settings for the task, in JSON format.
   */
  public open fun replicationTaskSettings(`value`: String) {
    unwrap(this).setReplicationTaskSettings(`value`)
  }

  /**
   * A display name for the resource identifier at the end of the `EndpointArn` response parameter
   * that is returned in the created `Endpoint` object.
   */
  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * A display name for the resource identifier at the end of the `EndpointArn` response parameter
   * that is returned in the created `Endpoint` object.
   */
  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  /**
   * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
   */
  public open fun sourceEndpointArn(): String = unwrap(this).getSourceEndpointArn()

  /**
   * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
   */
  public open fun sourceEndpointArn(`value`: String) {
    unwrap(this).setSourceEndpointArn(`value`)
  }

  /**
   * The table mappings for the task, in JSON format.
   */
  public open fun tableMappings(): String = unwrap(this).getTableMappings()

  /**
   * The table mappings for the task, in JSON format.
   */
  public open fun tableMappings(`value`: String) {
    unwrap(this).setTableMappings(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more tags to be assigned to the replication task.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * One or more tags to be assigned to the replication task.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * One or more tags to be assigned to the replication task.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
   */
  public open fun targetEndpointArn(): String = unwrap(this).getTargetEndpointArn()

  /**
   * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
   */
  public open fun targetEndpointArn(`value`: String) {
    unwrap(this).setTargetEndpointArn(`value`)
  }

  /**
   * Supplemental information that the task requires to migrate the data for certain source and
   * target endpoints.
   */
  public open fun taskData(): String? = unwrap(this).getTaskData()

  /**
   * Supplemental information that the task requires to migrate the data for certain source and
   * target endpoints.
   */
  public open fun taskData(`value`: String) {
    unwrap(this).setTaskData(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnReplicationTask].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param cdcStartPosition Indicates when you want a change data capture (CDC) operation to
     * start. 
     */
    public fun cdcStartPosition(cdcStartPosition: String)

    /**
     * Indicates the start time for a change data capture (CDC) operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime)
     * @param cdcStartTime Indicates the start time for a change data capture (CDC) operation. 
     */
    public fun cdcStartTime(cdcStartTime: Number)

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
     * @param cdcStopPosition Indicates when you want a change data capture (CDC) operation to stop.
     * 
     */
    public fun cdcStopPosition(cdcStopPosition: String)

    /**
     * The migration type.
     *
     * Valid values: `full-load` | `cdc` | `full-load-and-cdc`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype)
     * @param migrationType The migration type. 
     */
    public fun migrationType(migrationType: String)

    /**
     * The Amazon Resource Name (ARN) of a replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn)
     * @param replicationInstanceArn The Amazon Resource Name (ARN) of a replication instance. 
     */
    public fun replicationInstanceArn(replicationInstanceArn: String)

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
     * @param replicationTaskIdentifier An identifier for the replication task. 
     */
    public fun replicationTaskIdentifier(replicationTaskIdentifier: String)

    /**
     * Overall settings for the task, in JSON format.
     *
     * For more information, see [Specifying Task Settings for AWS Database Migration Service
     * Tasks](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings)
     * @param replicationTaskSettings Overall settings for the task, in JSON format. 
     */
    public fun replicationTaskSettings(replicationTaskSettings: String)

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
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object. 
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn)
     * @param sourceEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the source
     * endpoint. 
     */
    public fun sourceEndpointArn(sourceEndpointArn: String)

    /**
     * The table mappings for the task, in JSON format.
     *
     * For more information, see [Using Table Mapping to Specify Task
     * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings)
     * @param tableMappings The table mappings for the task, in JSON format. 
     */
    public fun tableMappings(tableMappings: String)

    /**
     * One or more tags to be assigned to the replication task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
     * @param tags One or more tags to be assigned to the replication task. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more tags to be assigned to the replication task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
     * @param tags One or more tags to be assigned to the replication task. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn)
     * @param targetEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the target
     * endpoint. 
     */
    public fun targetEndpointArn(targetEndpointArn: String)

    /**
     * Supplemental information that the task requires to migrate the data for certain source and
     * target endpoints.
     *
     * For more information, see [Specifying Supplemental Data for Task
     * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) in the *AWS
     * Database Migration Service User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-taskdata)
     * @param taskData Supplemental information that the task requires to migrate the data for
     * certain source and target endpoints. 
     */
    public fun taskData(taskData: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationTask.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationTask.Builder.create(scope, id)

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
     * @param cdcStartPosition Indicates when you want a change data capture (CDC) operation to
     * start. 
     */
    override fun cdcStartPosition(cdcStartPosition: String) {
      cdkBuilder.cdcStartPosition(cdcStartPosition)
    }

    /**
     * Indicates the start time for a change data capture (CDC) operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime)
     * @param cdcStartTime Indicates the start time for a change data capture (CDC) operation. 
     */
    override fun cdcStartTime(cdcStartTime: Number) {
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
     * @param cdcStopPosition Indicates when you want a change data capture (CDC) operation to stop.
     * 
     */
    override fun cdcStopPosition(cdcStopPosition: String) {
      cdkBuilder.cdcStopPosition(cdcStopPosition)
    }

    /**
     * The migration type.
     *
     * Valid values: `full-load` | `cdc` | `full-load-and-cdc`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype)
     * @param migrationType The migration type. 
     */
    override fun migrationType(migrationType: String) {
      cdkBuilder.migrationType(migrationType)
    }

    /**
     * The Amazon Resource Name (ARN) of a replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn)
     * @param replicationInstanceArn The Amazon Resource Name (ARN) of a replication instance. 
     */
    override fun replicationInstanceArn(replicationInstanceArn: String) {
      cdkBuilder.replicationInstanceArn(replicationInstanceArn)
    }

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
     * @param replicationTaskIdentifier An identifier for the replication task. 
     */
    override fun replicationTaskIdentifier(replicationTaskIdentifier: String) {
      cdkBuilder.replicationTaskIdentifier(replicationTaskIdentifier)
    }

    /**
     * Overall settings for the task, in JSON format.
     *
     * For more information, see [Specifying Task Settings for AWS Database Migration Service
     * Tasks](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings)
     * @param replicationTaskSettings Overall settings for the task, in JSON format. 
     */
    override fun replicationTaskSettings(replicationTaskSettings: String) {
      cdkBuilder.replicationTaskSettings(replicationTaskSettings)
    }

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
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object. 
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn)
     * @param sourceEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the source
     * endpoint. 
     */
    override fun sourceEndpointArn(sourceEndpointArn: String) {
      cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    /**
     * The table mappings for the task, in JSON format.
     *
     * For more information, see [Using Table Mapping to Specify Task
     * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings)
     * @param tableMappings The table mappings for the task, in JSON format. 
     */
    override fun tableMappings(tableMappings: String) {
      cdkBuilder.tableMappings(tableMappings)
    }

    /**
     * One or more tags to be assigned to the replication task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
     * @param tags One or more tags to be assigned to the replication task. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * One or more tags to be assigned to the replication task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
     * @param tags One or more tags to be assigned to the replication task. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn)
     * @param targetEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the target
     * endpoint. 
     */
    override fun targetEndpointArn(targetEndpointArn: String) {
      cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    /**
     * Supplemental information that the task requires to migrate the data for certain source and
     * target endpoints.
     *
     * For more information, see [Specifying Supplemental Data for Task
     * Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) in the *AWS
     * Database Migration Service User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-taskdata)
     * @param taskData Supplemental information that the task requires to migrate the data for
     * certain source and target endpoints. 
     */
    override fun taskData(taskData: String) {
      cdkBuilder.taskData(taskData)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationTask = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dms.CfnReplicationTask.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationTask):
        CfnReplicationTask = CfnReplicationTask(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationTask):
        software.amazon.awscdk.services.dms.CfnReplicationTask = wrapped.cdkObject as
        software.amazon.awscdk.services.dms.CfnReplicationTask
  }
}
