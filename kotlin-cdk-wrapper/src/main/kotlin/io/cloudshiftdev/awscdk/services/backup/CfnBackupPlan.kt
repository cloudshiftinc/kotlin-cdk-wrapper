@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Contains an optional backup plan display name and an array of `BackupRule` objects, each of which
 * specifies a backup rule.
 *
 * Each rule in a backup plan is a separate scheduled task and can back up a different selection of
 * AWS resources.
 *
 * For a sample AWS CloudFormation template, see the [AWS Backup Developer
 * Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/assigning-resources.html#assigning-resources-cfn)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * Object backupOptions;
 * CfnBackupPlan cfnBackupPlan = CfnBackupPlan.Builder.create(this, "MyCfnBackupPlan")
 * .backupPlan(BackupPlanResourceTypeProperty.builder()
 * .backupPlanName("backupPlanName")
 * .backupPlanRule(List.of(BackupRuleResourceTypeProperty.builder()
 * .ruleName("ruleName")
 * .targetBackupVault("targetBackupVault")
 * // the properties below are optional
 * .completionWindowMinutes(123)
 * .copyActions(List.of(CopyActionResourceTypeProperty.builder()
 * .destinationBackupVaultArn("destinationBackupVaultArn")
 * // the properties below are optional
 * .lifecycle(LifecycleResourceTypeProperty.builder()
 * .deleteAfterDays(123)
 * .moveToColdStorageAfterDays(123)
 * .optInToArchiveForSupportedResources(false)
 * .build())
 * .build()))
 * .enableContinuousBackup(false)
 * .lifecycle(LifecycleResourceTypeProperty.builder()
 * .deleteAfterDays(123)
 * .moveToColdStorageAfterDays(123)
 * .optInToArchiveForSupportedResources(false)
 * .build())
 * .recoveryPointTags(Map.of(
 * "recoveryPointTagsKey", "recoveryPointTags"))
 * .scheduleExpression("scheduleExpression")
 * .scheduleExpressionTimezone("scheduleExpressionTimezone")
 * .startWindowMinutes(123)
 * .build()))
 * // the properties below are optional
 * .advancedBackupSettings(List.of(AdvancedBackupSettingResourceTypeProperty.builder()
 * .backupOptions(backupOptions)
 * .resourceType("resourceType")
 * .build()))
 * .build())
 * // the properties below are optional
 * .backupPlanTags(Map.of(
 * "backupPlanTagsKey", "backupPlanTags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html)
 */
public open class CfnBackupPlan(
  cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBackupPlanProps,
  ) :
      this(software.amazon.awscdk.services.backup.CfnBackupPlan(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBackupPlanProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBackupPlanProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBackupPlanProps(props)
  )

  /**
   * An Amazon Resource Name (ARN) that uniquely identifies a backup plan;
   *
   * for example, `arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50`
   * .
   */
  public open fun attrBackupPlanArn(): String = unwrap(this).getAttrBackupPlanArn()

  /**
   * Uniquely identifies a backup plan.
   */
  public open fun attrBackupPlanId(): String = unwrap(this).getAttrBackupPlanId()

  /**
   * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long.
   *
   * Version Ids cannot be edited.
   */
  public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

  /**
   * Uniquely identifies the backup plan to be associated with the selection of resources.
   */
  public open fun backupPlan(): Any = unwrap(this).getBackupPlan()

  /**
   * Uniquely identifies the backup plan to be associated with the selection of resources.
   */
  public open fun backupPlan(`value`: IResolvable) {
    unwrap(this).setBackupPlan(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Uniquely identifies the backup plan to be associated with the selection of resources.
   */
  public open fun backupPlan(`value`: BackupPlanResourceTypeProperty) {
    unwrap(this).setBackupPlan(`value`.let(BackupPlanResourceTypeProperty.Companion::unwrap))
  }

  /**
   * Uniquely identifies the backup plan to be associated with the selection of resources.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("522556c9091b796c41792f90736082229ff0533d6bd39915807003fd7833af28")
  public open fun backupPlan(`value`: BackupPlanResourceTypeProperty.Builder.() -> Unit): Unit =
      backupPlan(BackupPlanResourceTypeProperty(`value`))

  /**
   * The tags to assign to the backup plan.
   */
  public open fun backupPlanTags(): Map<String, String> = unwrap(this).getBackupPlanTags() ?:
      emptyMap()

  /**
   * The tags to assign to the backup plan.
   */
  public open fun backupPlanTags(`value`: Map<String, String>) {
    unwrap(this).setBackupPlanTags(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.CfnBackupPlan].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    public fun backupPlan(backupPlan: IResolvable)

    /**
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    public fun backupPlan(backupPlan: BackupPlanResourceTypeProperty)

    /**
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d790c488ea554c98218cf0812f40687ff90d3707d2cee1dff1218fa54bdd5c5")
    public fun backupPlan(backupPlan: BackupPlanResourceTypeProperty.Builder.() -> Unit)

    /**
     * The tags to assign to the backup plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags)
     * @param backupPlanTags The tags to assign to the backup plan. 
     */
    public fun backupPlanTags(backupPlanTags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupPlan.Builder =
        software.amazon.awscdk.services.backup.CfnBackupPlan.Builder.create(scope, id)

    /**
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    override fun backupPlan(backupPlan: IResolvable) {
      cdkBuilder.backupPlan(backupPlan.let(IResolvable.Companion::unwrap))
    }

    /**
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    override fun backupPlan(backupPlan: BackupPlanResourceTypeProperty) {
      cdkBuilder.backupPlan(backupPlan.let(BackupPlanResourceTypeProperty.Companion::unwrap))
    }

    /**
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d790c488ea554c98218cf0812f40687ff90d3707d2cee1dff1218fa54bdd5c5")
    override fun backupPlan(backupPlan: BackupPlanResourceTypeProperty.Builder.() -> Unit): Unit =
        backupPlan(BackupPlanResourceTypeProperty(backupPlan))

    /**
     * The tags to assign to the backup plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags)
     * @param backupPlanTags The tags to assign to the backup plan. 
     */
    override fun backupPlanTags(backupPlanTags: Map<String, String>) {
      cdkBuilder.backupPlanTags(backupPlanTags)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupPlan = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backup.CfnBackupPlan.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBackupPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBackupPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan):
        CfnBackupPlan = CfnBackupPlan(cdkObject)

    internal fun unwrap(wrapped: CfnBackupPlan):
        software.amazon.awscdk.services.backup.CfnBackupPlan = wrapped.cdkObject as
        software.amazon.awscdk.services.backup.CfnBackupPlan
  }

  /**
   * Specifies an object containing resource type and backup options.
   *
   * This is only supported for Windows VSS backups.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * Object backupOptions;
   * AdvancedBackupSettingResourceTypeProperty advancedBackupSettingResourceTypeProperty =
   * AdvancedBackupSettingResourceTypeProperty.builder()
   * .backupOptions(backupOptions)
   * .resourceType("resourceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-advancedbackupsettingresourcetype.html)
   */
  public interface AdvancedBackupSettingResourceTypeProperty {
    /**
     * The backup option for the resource.
     *
     * Each option is a key-value pair. This option is only available for Windows VSS backup jobs.
     *
     * Valid values:
     *
     * Set to `"WindowsVSS":"enabled"` to enable the `WindowsVSS` backup option and create a Windows
     * VSS backup.
     *
     * Set to `"WindowsVSS":"disabled"` to create a regular backup. The `WindowsVSS` option is not
     * enabled by default.
     *
     * If you specify an invalid option, you get an `InvalidParameterValueException` exception.
     *
     * For more information about Windows VSS backups, see [Creating a VSS-Enabled Windows
     * Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-advancedbackupsettingresourcetype.html#cfn-backup-backupplan-advancedbackupsettingresourcetype-backupoptions)
     */
    public fun backupOptions(): Any

    /**
     * The name of a resource type.
     *
     * The only supported resource type is EC2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-advancedbackupsettingresourcetype.html#cfn-backup-backupplan-advancedbackupsettingresourcetype-resourcetype)
     */
    public fun resourceType(): String

    /**
     * A builder for [AdvancedBackupSettingResourceTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param backupOptions The backup option for the resource. 
       * Each option is a key-value pair. This option is only available for Windows VSS backup jobs.
       *
       * Valid values:
       *
       * Set to `"WindowsVSS":"enabled"` to enable the `WindowsVSS` backup option and create a
       * Windows VSS backup.
       *
       * Set to `"WindowsVSS":"disabled"` to create a regular backup. The `WindowsVSS` option is not
       * enabled by default.
       *
       * If you specify an invalid option, you get an `InvalidParameterValueException` exception.
       *
       * For more information about Windows VSS backups, see [Creating a VSS-Enabled Windows
       * Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html) .
       */
      public fun backupOptions(backupOptions: Any)

      /**
       * @param resourceType The name of a resource type. 
       * The only supported resource type is EC2.
       */
      public fun resourceType(resourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.builder()

      /**
       * @param backupOptions The backup option for the resource. 
       * Each option is a key-value pair. This option is only available for Windows VSS backup jobs.
       *
       * Valid values:
       *
       * Set to `"WindowsVSS":"enabled"` to enable the `WindowsVSS` backup option and create a
       * Windows VSS backup.
       *
       * Set to `"WindowsVSS":"disabled"` to create a regular backup. The `WindowsVSS` option is not
       * enabled by default.
       *
       * If you specify an invalid option, you get an `InvalidParameterValueException` exception.
       *
       * For more information about Windows VSS backups, see [Creating a VSS-Enabled Windows
       * Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html) .
       */
      override fun backupOptions(backupOptions: Any) {
        cdkBuilder.backupOptions(backupOptions)
      }

      /**
       * @param resourceType The name of a resource type. 
       * The only supported resource type is EC2.
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty,
    ) : CdkObject(cdkObject), AdvancedBackupSettingResourceTypeProperty {
      /**
       * The backup option for the resource.
       *
       * Each option is a key-value pair. This option is only available for Windows VSS backup jobs.
       *
       * Valid values:
       *
       * Set to `"WindowsVSS":"enabled"` to enable the `WindowsVSS` backup option and create a
       * Windows VSS backup.
       *
       * Set to `"WindowsVSS":"disabled"` to create a regular backup. The `WindowsVSS` option is not
       * enabled by default.
       *
       * If you specify an invalid option, you get an `InvalidParameterValueException` exception.
       *
       * For more information about Windows VSS backups, see [Creating a VSS-Enabled Windows
       * Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-advancedbackupsettingresourcetype.html#cfn-backup-backupplan-advancedbackupsettingresourcetype-backupoptions)
       */
      override fun backupOptions(): Any = unwrap(this).getBackupOptions()

      /**
       * The name of a resource type.
       *
       * The only supported resource type is EC2.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-advancedbackupsettingresourcetype.html#cfn-backup-backupplan-advancedbackupsettingresourcetype-resourcetype)
       */
      override fun resourceType(): String = unwrap(this).getResourceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedBackupSettingResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty):
          AdvancedBackupSettingResourceTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdvancedBackupSettingResourceTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedBackupSettingResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty
    }
  }

  /**
   * Specifies an object containing properties used to create a backup plan.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * Object backupOptions;
   * BackupPlanResourceTypeProperty backupPlanResourceTypeProperty =
   * BackupPlanResourceTypeProperty.builder()
   * .backupPlanName("backupPlanName")
   * .backupPlanRule(List.of(BackupRuleResourceTypeProperty.builder()
   * .ruleName("ruleName")
   * .targetBackupVault("targetBackupVault")
   * // the properties below are optional
   * .completionWindowMinutes(123)
   * .copyActions(List.of(CopyActionResourceTypeProperty.builder()
   * .destinationBackupVaultArn("destinationBackupVaultArn")
   * // the properties below are optional
   * .lifecycle(LifecycleResourceTypeProperty.builder()
   * .deleteAfterDays(123)
   * .moveToColdStorageAfterDays(123)
   * .optInToArchiveForSupportedResources(false)
   * .build())
   * .build()))
   * .enableContinuousBackup(false)
   * .lifecycle(LifecycleResourceTypeProperty.builder()
   * .deleteAfterDays(123)
   * .moveToColdStorageAfterDays(123)
   * .optInToArchiveForSupportedResources(false)
   * .build())
   * .recoveryPointTags(Map.of(
   * "recoveryPointTagsKey", "recoveryPointTags"))
   * .scheduleExpression("scheduleExpression")
   * .scheduleExpressionTimezone("scheduleExpressionTimezone")
   * .startWindowMinutes(123)
   * .build()))
   * // the properties below are optional
   * .advancedBackupSettings(List.of(AdvancedBackupSettingResourceTypeProperty.builder()
   * .backupOptions(backupOptions)
   * .resourceType("resourceType")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html)
   */
  public interface BackupPlanResourceTypeProperty {
    /**
     * A list of backup options for each resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-advancedbackupsettings)
     */
    public fun advancedBackupSettings(): Any? = unwrap(this).getAdvancedBackupSettings()

    /**
     * The display name of a backup plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanname)
     */
    public fun backupPlanName(): String

    /**
     * An array of `BackupRule` objects, each of which specifies a scheduled task that is used to
     * back up a selection of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanrule)
     */
    public fun backupPlanRule(): Any

    /**
     * A builder for [BackupPlanResourceTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param advancedBackupSettings A list of backup options for each resource type.
       */
      public fun advancedBackupSettings(advancedBackupSettings: IResolvable)

      /**
       * @param advancedBackupSettings A list of backup options for each resource type.
       */
      public fun advancedBackupSettings(advancedBackupSettings: List<Any>)

      /**
       * @param advancedBackupSettings A list of backup options for each resource type.
       */
      public fun advancedBackupSettings(vararg advancedBackupSettings: Any)

      /**
       * @param backupPlanName The display name of a backup plan. 
       */
      public fun backupPlanName(backupPlanName: String)

      /**
       * @param backupPlanRule An array of `BackupRule` objects, each of which specifies a scheduled
       * task that is used to back up a selection of resources. 
       */
      public fun backupPlanRule(backupPlanRule: IResolvable)

      /**
       * @param backupPlanRule An array of `BackupRule` objects, each of which specifies a scheduled
       * task that is used to back up a selection of resources. 
       */
      public fun backupPlanRule(backupPlanRule: List<Any>)

      /**
       * @param backupPlanRule An array of `BackupRule` objects, each of which specifies a scheduled
       * task that is used to back up a selection of resources. 
       */
      public fun backupPlanRule(vararg backupPlanRule: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty.builder()

      /**
       * @param advancedBackupSettings A list of backup options for each resource type.
       */
      override fun advancedBackupSettings(advancedBackupSettings: IResolvable) {
        cdkBuilder.advancedBackupSettings(advancedBackupSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param advancedBackupSettings A list of backup options for each resource type.
       */
      override fun advancedBackupSettings(advancedBackupSettings: List<Any>) {
        cdkBuilder.advancedBackupSettings(advancedBackupSettings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param advancedBackupSettings A list of backup options for each resource type.
       */
      override fun advancedBackupSettings(vararg advancedBackupSettings: Any): Unit =
          advancedBackupSettings(advancedBackupSettings.toList())

      /**
       * @param backupPlanName The display name of a backup plan. 
       */
      override fun backupPlanName(backupPlanName: String) {
        cdkBuilder.backupPlanName(backupPlanName)
      }

      /**
       * @param backupPlanRule An array of `BackupRule` objects, each of which specifies a scheduled
       * task that is used to back up a selection of resources. 
       */
      override fun backupPlanRule(backupPlanRule: IResolvable) {
        cdkBuilder.backupPlanRule(backupPlanRule.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param backupPlanRule An array of `BackupRule` objects, each of which specifies a scheduled
       * task that is used to back up a selection of resources. 
       */
      override fun backupPlanRule(backupPlanRule: List<Any>) {
        cdkBuilder.backupPlanRule(backupPlanRule.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param backupPlanRule An array of `BackupRule` objects, each of which specifies a scheduled
       * task that is used to back up a selection of resources. 
       */
      override fun backupPlanRule(vararg backupPlanRule: Any): Unit =
          backupPlanRule(backupPlanRule.toList())

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty,
    ) : CdkObject(cdkObject), BackupPlanResourceTypeProperty {
      /**
       * A list of backup options for each resource type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-advancedbackupsettings)
       */
      override fun advancedBackupSettings(): Any? = unwrap(this).getAdvancedBackupSettings()

      /**
       * The display name of a backup plan.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanname)
       */
      override fun backupPlanName(): String = unwrap(this).getBackupPlanName()

      /**
       * An array of `BackupRule` objects, each of which specifies a scheduled task that is used to
       * back up a selection of resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanrule)
       */
      override fun backupPlanRule(): Any = unwrap(this).getBackupPlanRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty):
          BackupPlanResourceTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BackupPlanResourceTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackupPlanResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty
    }
  }

  /**
   * Specifies an object containing properties used to schedule a task to back up a selection of
   * resources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * BackupRuleResourceTypeProperty backupRuleResourceTypeProperty =
   * BackupRuleResourceTypeProperty.builder()
   * .ruleName("ruleName")
   * .targetBackupVault("targetBackupVault")
   * // the properties below are optional
   * .completionWindowMinutes(123)
   * .copyActions(List.of(CopyActionResourceTypeProperty.builder()
   * .destinationBackupVaultArn("destinationBackupVaultArn")
   * // the properties below are optional
   * .lifecycle(LifecycleResourceTypeProperty.builder()
   * .deleteAfterDays(123)
   * .moveToColdStorageAfterDays(123)
   * .optInToArchiveForSupportedResources(false)
   * .build())
   * .build()))
   * .enableContinuousBackup(false)
   * .lifecycle(LifecycleResourceTypeProperty.builder()
   * .deleteAfterDays(123)
   * .moveToColdStorageAfterDays(123)
   * .optInToArchiveForSupportedResources(false)
   * .build())
   * .recoveryPointTags(Map.of(
   * "recoveryPointTagsKey", "recoveryPointTags"))
   * .scheduleExpression("scheduleExpression")
   * .scheduleExpressionTimezone("scheduleExpressionTimezone")
   * .startWindowMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html)
   */
  public interface BackupRuleResourceTypeProperty {
    /**
     * A value in minutes after a backup job is successfully started before it must be completed or
     * it is canceled by AWS Backup .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-completionwindowminutes)
     */
    public fun completionWindowMinutes(): Number? = unwrap(this).getCompletionWindowMinutes()

    /**
     * An array of CopyAction objects, which contains the details of the copy operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-copyactions)
     */
    public fun copyActions(): Any? = unwrap(this).getCopyActions()

    /**
     * Enables continuous backup and point-in-time restores (PITR).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-enablecontinuousbackup)
     */
    public fun enableContinuousBackup(): Any? = unwrap(this).getEnableContinuousBackup()

    /**
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it
     * expires.
     *
     * AWS Backup transitions and expires backups automatically according to the lifecycle that you
     * define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-lifecycle)
     */
    public fun lifecycle(): Any? = unwrap(this).getLifecycle()

    /**
     * The tags to assign to the resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-recoverypointtags)
     */
    public fun recoveryPointTags(): Any? = unwrap(this).getRecoveryPointTags()

    /**
     * A display name for a backup rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-rulename)
     */
    public fun ruleName(): String

    /**
     * A CRON expression specifying when AWS Backup initiates a backup job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-scheduleexpression)
     */
    public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    /**
     * This is the timezone in which the schedule expression is set.
     *
     * By default, ScheduleExpressions are in UTC. You can modify this to a specified timezone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-scheduleexpressiontimezone)
     */
    public fun scheduleExpressionTimezone(): String? = unwrap(this).getScheduleExpressionTimezone()

    /**
     * An optional value that specifies a period of time in minutes after a backup is scheduled
     * before a job is canceled if it doesn't start successfully.
     *
     * If this value is included, it must be at least 60 minutes to avoid errors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-startwindowminutes)
     */
    public fun startWindowMinutes(): Number? = unwrap(this).getStartWindowMinutes()

    /**
     * The name of a logical container where backups are stored.
     *
     * Backup vaults are identified by names that are unique to the account used to create them and
     * the AWS Region where they are created. They consist of letters, numbers, and hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-targetbackupvault)
     */
    public fun targetBackupVault(): String

    /**
     * A builder for [BackupRuleResourceTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param completionWindowMinutes A value in minutes after a backup job is successfully
       * started before it must be completed or it is canceled by AWS Backup .
       */
      public fun completionWindowMinutes(completionWindowMinutes: Number)

      /**
       * @param copyActions An array of CopyAction objects, which contains the details of the copy
       * operation.
       */
      public fun copyActions(copyActions: IResolvable)

      /**
       * @param copyActions An array of CopyAction objects, which contains the details of the copy
       * operation.
       */
      public fun copyActions(copyActions: List<Any>)

      /**
       * @param copyActions An array of CopyAction objects, which contains the details of the copy
       * operation.
       */
      public fun copyActions(vararg copyActions: Any)

      /**
       * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR).
       */
      public fun enableContinuousBackup(enableContinuousBackup: Boolean)

      /**
       * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR).
       */
      public fun enableContinuousBackup(enableContinuousBackup: IResolvable)

      /**
       * @param lifecycle The lifecycle defines when a protected resource is transitioned to cold
       * storage and when it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define.
       */
      public fun lifecycle(lifecycle: IResolvable)

      /**
       * @param lifecycle The lifecycle defines when a protected resource is transitioned to cold
       * storage and when it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define.
       */
      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty)

      /**
       * @param lifecycle The lifecycle defines when a protected resource is transitioned to cold
       * storage and when it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b61328720a5c3d3b5a4be3c0e7a8de70f9f408a46a9880c179b25fb88b891133")
      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit)

      /**
       * @param recoveryPointTags The tags to assign to the resources.
       */
      public fun recoveryPointTags(recoveryPointTags: IResolvable)

      /**
       * @param recoveryPointTags The tags to assign to the resources.
       */
      public fun recoveryPointTags(recoveryPointTags: Map<String, String>)

      /**
       * @param ruleName A display name for a backup rule. 
       */
      public fun ruleName(ruleName: String)

      /**
       * @param scheduleExpression A CRON expression specifying when AWS Backup initiates a backup
       * job.
       */
      public fun scheduleExpression(scheduleExpression: String)

      /**
       * @param scheduleExpressionTimezone This is the timezone in which the schedule expression is
       * set.
       * By default, ScheduleExpressions are in UTC. You can modify this to a specified timezone.
       */
      public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String)

      /**
       * @param startWindowMinutes An optional value that specifies a period of time in minutes
       * after a backup is scheduled before a job is canceled if it doesn't start successfully.
       * If this value is included, it must be at least 60 minutes to avoid errors.
       */
      public fun startWindowMinutes(startWindowMinutes: Number)

      /**
       * @param targetBackupVault The name of a logical container where backups are stored. 
       * Backup vaults are identified by names that are unique to the account used to create them
       * and the AWS Region where they are created. They consist of letters, numbers, and hyphens.
       */
      public fun targetBackupVault(targetBackupVault: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty.builder()

      /**
       * @param completionWindowMinutes A value in minutes after a backup job is successfully
       * started before it must be completed or it is canceled by AWS Backup .
       */
      override fun completionWindowMinutes(completionWindowMinutes: Number) {
        cdkBuilder.completionWindowMinutes(completionWindowMinutes)
      }

      /**
       * @param copyActions An array of CopyAction objects, which contains the details of the copy
       * operation.
       */
      override fun copyActions(copyActions: IResolvable) {
        cdkBuilder.copyActions(copyActions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param copyActions An array of CopyAction objects, which contains the details of the copy
       * operation.
       */
      override fun copyActions(copyActions: List<Any>) {
        cdkBuilder.copyActions(copyActions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param copyActions An array of CopyAction objects, which contains the details of the copy
       * operation.
       */
      override fun copyActions(vararg copyActions: Any): Unit = copyActions(copyActions.toList())

      /**
       * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR).
       */
      override fun enableContinuousBackup(enableContinuousBackup: Boolean) {
        cdkBuilder.enableContinuousBackup(enableContinuousBackup)
      }

      /**
       * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR).
       */
      override fun enableContinuousBackup(enableContinuousBackup: IResolvable) {
        cdkBuilder.enableContinuousBackup(enableContinuousBackup.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lifecycle The lifecycle defines when a protected resource is transitioned to cold
       * storage and when it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define.
       */
      override fun lifecycle(lifecycle: IResolvable) {
        cdkBuilder.lifecycle(lifecycle.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lifecycle The lifecycle defines when a protected resource is transitioned to cold
       * storage and when it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define.
       */
      override fun lifecycle(lifecycle: LifecycleResourceTypeProperty) {
        cdkBuilder.lifecycle(lifecycle.let(LifecycleResourceTypeProperty.Companion::unwrap))
      }

      /**
       * @param lifecycle The lifecycle defines when a protected resource is transitioned to cold
       * storage and when it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b61328720a5c3d3b5a4be3c0e7a8de70f9f408a46a9880c179b25fb88b891133")
      override fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit): Unit =
          lifecycle(LifecycleResourceTypeProperty(lifecycle))

      /**
       * @param recoveryPointTags The tags to assign to the resources.
       */
      override fun recoveryPointTags(recoveryPointTags: IResolvable) {
        cdkBuilder.recoveryPointTags(recoveryPointTags.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param recoveryPointTags The tags to assign to the resources.
       */
      override fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
        cdkBuilder.recoveryPointTags(recoveryPointTags)
      }

      /**
       * @param ruleName A display name for a backup rule. 
       */
      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      /**
       * @param scheduleExpression A CRON expression specifying when AWS Backup initiates a backup
       * job.
       */
      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      /**
       * @param scheduleExpressionTimezone This is the timezone in which the schedule expression is
       * set.
       * By default, ScheduleExpressions are in UTC. You can modify this to a specified timezone.
       */
      override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
        cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
      }

      /**
       * @param startWindowMinutes An optional value that specifies a period of time in minutes
       * after a backup is scheduled before a job is canceled if it doesn't start successfully.
       * If this value is included, it must be at least 60 minutes to avoid errors.
       */
      override fun startWindowMinutes(startWindowMinutes: Number) {
        cdkBuilder.startWindowMinutes(startWindowMinutes)
      }

      /**
       * @param targetBackupVault The name of a logical container where backups are stored. 
       * Backup vaults are identified by names that are unique to the account used to create them
       * and the AWS Region where they are created. They consist of letters, numbers, and hyphens.
       */
      override fun targetBackupVault(targetBackupVault: String) {
        cdkBuilder.targetBackupVault(targetBackupVault)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty,
    ) : CdkObject(cdkObject), BackupRuleResourceTypeProperty {
      /**
       * A value in minutes after a backup job is successfully started before it must be completed
       * or it is canceled by AWS Backup .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-completionwindowminutes)
       */
      override fun completionWindowMinutes(): Number? = unwrap(this).getCompletionWindowMinutes()

      /**
       * An array of CopyAction objects, which contains the details of the copy operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-copyactions)
       */
      override fun copyActions(): Any? = unwrap(this).getCopyActions()

      /**
       * Enables continuous backup and point-in-time restores (PITR).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-enablecontinuousbackup)
       */
      override fun enableContinuousBackup(): Any? = unwrap(this).getEnableContinuousBackup()

      /**
       * The lifecycle defines when a protected resource is transitioned to cold storage and when it
       * expires.
       *
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-lifecycle)
       */
      override fun lifecycle(): Any? = unwrap(this).getLifecycle()

      /**
       * The tags to assign to the resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-recoverypointtags)
       */
      override fun recoveryPointTags(): Any? = unwrap(this).getRecoveryPointTags()

      /**
       * A display name for a backup rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-rulename)
       */
      override fun ruleName(): String = unwrap(this).getRuleName()

      /**
       * A CRON expression specifying when AWS Backup initiates a backup job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-scheduleexpression)
       */
      override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

      /**
       * This is the timezone in which the schedule expression is set.
       *
       * By default, ScheduleExpressions are in UTC. You can modify this to a specified timezone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-scheduleexpressiontimezone)
       */
      override fun scheduleExpressionTimezone(): String? =
          unwrap(this).getScheduleExpressionTimezone()

      /**
       * An optional value that specifies a period of time in minutes after a backup is scheduled
       * before a job is canceled if it doesn't start successfully.
       *
       * If this value is included, it must be at least 60 minutes to avoid errors.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-startwindowminutes)
       */
      override fun startWindowMinutes(): Number? = unwrap(this).getStartWindowMinutes()

      /**
       * The name of a logical container where backups are stored.
       *
       * Backup vaults are identified by names that are unique to the account used to create them
       * and the AWS Region where they are created. They consist of letters, numbers, and hyphens.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-targetbackupvault)
       */
      override fun targetBackupVault(): String = unwrap(this).getTargetBackupVault()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BackupRuleResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty):
          BackupRuleResourceTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BackupRuleResourceTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackupRuleResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty
    }
  }

  /**
   * Copies backups created by a backup rule to another vault.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * CopyActionResourceTypeProperty copyActionResourceTypeProperty =
   * CopyActionResourceTypeProperty.builder()
   * .destinationBackupVaultArn("destinationBackupVaultArn")
   * // the properties below are optional
   * .lifecycle(LifecycleResourceTypeProperty.builder()
   * .deleteAfterDays(123)
   * .moveToColdStorageAfterDays(123)
   * .optInToArchiveForSupportedResources(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html)
   */
  public interface CopyActionResourceTypeProperty {
    /**
     * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the
     * copied backup.
     *
     * For example, `arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html#cfn-backup-backupplan-copyactionresourcetype-destinationbackupvaultarn)
     */
    public fun destinationBackupVaultArn(): String

    /**
     * Defines when a protected resource is transitioned to cold storage and when it expires.
     *
     * AWS Backup transitions and expires backups automatically according to the lifecycle that you
     * define. If you do not specify a lifecycle, AWS Backup applies the lifecycle policy of the source
     * backup to the destination backup.
     *
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html#cfn-backup-backupplan-copyactionresourcetype-lifecycle)
     */
    public fun lifecycle(): Any? = unwrap(this).getLifecycle()

    /**
     * A builder for [CopyActionResourceTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationBackupVaultArn An Amazon Resource Name (ARN) that uniquely identifies the
       * destination backup vault for the copied backup. 
       * For example, `arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.`
       */
      public fun destinationBackupVaultArn(destinationBackupVaultArn: String)

      /**
       * @param lifecycle Defines when a protected resource is transitioned to cold storage and when
       * it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define. If you do not specify a lifecycle, AWS Backup applies the lifecycle policy of the
       * source backup to the destination backup.
       *
       * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90
       * days.
       */
      public fun lifecycle(lifecycle: IResolvable)

      /**
       * @param lifecycle Defines when a protected resource is transitioned to cold storage and when
       * it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define. If you do not specify a lifecycle, AWS Backup applies the lifecycle policy of the
       * source backup to the destination backup.
       *
       * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90
       * days.
       */
      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty)

      /**
       * @param lifecycle Defines when a protected resource is transitioned to cold storage and when
       * it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define. If you do not specify a lifecycle, AWS Backup applies the lifecycle policy of the
       * source backup to the destination backup.
       *
       * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90
       * days.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dbbe619efbd94ebbcffe3e2d61e20f2d1c9393f514d35642d54e265d1434d19")
      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty.builder()

      /**
       * @param destinationBackupVaultArn An Amazon Resource Name (ARN) that uniquely identifies the
       * destination backup vault for the copied backup. 
       * For example, `arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.`
       */
      override fun destinationBackupVaultArn(destinationBackupVaultArn: String) {
        cdkBuilder.destinationBackupVaultArn(destinationBackupVaultArn)
      }

      /**
       * @param lifecycle Defines when a protected resource is transitioned to cold storage and when
       * it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define. If you do not specify a lifecycle, AWS Backup applies the lifecycle policy of the
       * source backup to the destination backup.
       *
       * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90
       * days.
       */
      override fun lifecycle(lifecycle: IResolvable) {
        cdkBuilder.lifecycle(lifecycle.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lifecycle Defines when a protected resource is transitioned to cold storage and when
       * it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define. If you do not specify a lifecycle, AWS Backup applies the lifecycle policy of the
       * source backup to the destination backup.
       *
       * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90
       * days.
       */
      override fun lifecycle(lifecycle: LifecycleResourceTypeProperty) {
        cdkBuilder.lifecycle(lifecycle.let(LifecycleResourceTypeProperty.Companion::unwrap))
      }

      /**
       * @param lifecycle Defines when a protected resource is transitioned to cold storage and when
       * it expires.
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define. If you do not specify a lifecycle, AWS Backup applies the lifecycle policy of the
       * source backup to the destination backup.
       *
       * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90
       * days.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dbbe619efbd94ebbcffe3e2d61e20f2d1c9393f514d35642d54e265d1434d19")
      override fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit): Unit =
          lifecycle(LifecycleResourceTypeProperty(lifecycle))

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty,
    ) : CdkObject(cdkObject), CopyActionResourceTypeProperty {
      /**
       * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the
       * copied backup.
       *
       * For example, `arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html#cfn-backup-backupplan-copyactionresourcetype-destinationbackupvaultarn)
       */
      override fun destinationBackupVaultArn(): String = unwrap(this).getDestinationBackupVaultArn()

      /**
       * Defines when a protected resource is transitioned to cold storage and when it expires.
       *
       * AWS Backup transitions and expires backups automatically according to the lifecycle that
       * you define. If you do not specify a lifecycle, AWS Backup applies the lifecycle policy of the
       * source backup to the destination backup.
       *
       * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90
       * days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html#cfn-backup-backupplan-copyactionresourcetype-lifecycle)
       */
      override fun lifecycle(): Any? = unwrap(this).getLifecycle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CopyActionResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty):
          CopyActionResourceTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CopyActionResourceTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CopyActionResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty
    }
  }

  /**
   * Specifies an object containing an array of `Transition` objects that determine how long in days
   * before a recovery point transitions to cold storage or is deleted.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * LifecycleResourceTypeProperty lifecycleResourceTypeProperty =
   * LifecycleResourceTypeProperty.builder()
   * .deleteAfterDays(123)
   * .moveToColdStorageAfterDays(123)
   * .optInToArchiveForSupportedResources(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html)
   */
  public interface LifecycleResourceTypeProperty {
    /**
     * Specifies the number of days after creation that a recovery point is deleted.
     *
     * Must be greater than `MoveToColdStorageAfterDays` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-deleteafterdays)
     */
    public fun deleteAfterDays(): Number? = unwrap(this).getDeleteAfterDays()

    /**
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-movetocoldstorageafterdays)
     */
    public fun moveToColdStorageAfterDays(): Number? = unwrap(this).getMoveToColdStorageAfterDays()

    /**
     * If the value is true, your backup plan transitions supported resources to archive (cold)
     * storage tier in accordance with your lifecycle settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-optintoarchiveforsupportedresources)
     */
    public fun optInToArchiveForSupportedResources(): Any? =
        unwrap(this).getOptInToArchiveForSupportedResources()

    /**
     * A builder for [LifecycleResourceTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteAfterDays Specifies the number of days after creation that a recovery point is
       * deleted.
       * Must be greater than `MoveToColdStorageAfterDays` .
       */
      public fun deleteAfterDays(deleteAfterDays: Number)

      /**
       * @param moveToColdStorageAfterDays Specifies the number of days after creation that a
       * recovery point is moved to cold storage.
       */
      public fun moveToColdStorageAfterDays(moveToColdStorageAfterDays: Number)

      /**
       * @param optInToArchiveForSupportedResources If the value is true, your backup plan
       * transitions supported resources to archive (cold) storage tier in accordance with your
       * lifecycle settings.
       */
      public fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: Boolean)

      /**
       * @param optInToArchiveForSupportedResources If the value is true, your backup plan
       * transitions supported resources to archive (cold) storage tier in accordance with your
       * lifecycle settings.
       */
      public
          fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty.builder()

      /**
       * @param deleteAfterDays Specifies the number of days after creation that a recovery point is
       * deleted.
       * Must be greater than `MoveToColdStorageAfterDays` .
       */
      override fun deleteAfterDays(deleteAfterDays: Number) {
        cdkBuilder.deleteAfterDays(deleteAfterDays)
      }

      /**
       * @param moveToColdStorageAfterDays Specifies the number of days after creation that a
       * recovery point is moved to cold storage.
       */
      override fun moveToColdStorageAfterDays(moveToColdStorageAfterDays: Number) {
        cdkBuilder.moveToColdStorageAfterDays(moveToColdStorageAfterDays)
      }

      /**
       * @param optInToArchiveForSupportedResources If the value is true, your backup plan
       * transitions supported resources to archive (cold) storage tier in accordance with your
       * lifecycle settings.
       */
      override
          fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: Boolean) {
        cdkBuilder.optInToArchiveForSupportedResources(optInToArchiveForSupportedResources)
      }

      /**
       * @param optInToArchiveForSupportedResources If the value is true, your backup plan
       * transitions supported resources to archive (cold) storage tier in accordance with your
       * lifecycle settings.
       */
      override
          fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: IResolvable) {
        cdkBuilder.optInToArchiveForSupportedResources(optInToArchiveForSupportedResources.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty,
    ) : CdkObject(cdkObject), LifecycleResourceTypeProperty {
      /**
       * Specifies the number of days after creation that a recovery point is deleted.
       *
       * Must be greater than `MoveToColdStorageAfterDays` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-deleteafterdays)
       */
      override fun deleteAfterDays(): Number? = unwrap(this).getDeleteAfterDays()

      /**
       * Specifies the number of days after creation that a recovery point is moved to cold storage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-movetocoldstorageafterdays)
       */
      override fun moveToColdStorageAfterDays(): Number? =
          unwrap(this).getMoveToColdStorageAfterDays()

      /**
       * If the value is true, your backup plan transitions supported resources to archive (cold)
       * storage tier in accordance with your lifecycle settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-optintoarchiveforsupportedresources)
       */
      override fun optInToArchiveForSupportedResources(): Any? =
          unwrap(this).getOptInToArchiveForSupportedResources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty):
          LifecycleResourceTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LifecycleResourceTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty
    }
  }
}
