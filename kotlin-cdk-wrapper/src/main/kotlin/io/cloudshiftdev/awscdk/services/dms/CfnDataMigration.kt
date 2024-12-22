@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This object provides information about a AWS DMS data migration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnDataMigration cfnDataMigration = CfnDataMigration.Builder.create(this, "MyCfnDataMigration")
 * .dataMigrationType("dataMigrationType")
 * .migrationProjectIdentifier("migrationProjectIdentifier")
 * .serviceAccessRoleArn("serviceAccessRoleArn")
 * // the properties below are optional
 * .dataMigrationIdentifier("dataMigrationIdentifier")
 * .dataMigrationName("dataMigrationName")
 * .dataMigrationSettings(DataMigrationSettingsProperty.builder()
 * .cloudwatchLogsEnabled(false)
 * .numberOfJobs(123)
 * .selectionRules("selectionRules")
 * .build())
 * .sourceDataSettings(List.of(SourceDataSettingsProperty.builder()
 * .cdcStartPosition("cdcStartPosition")
 * .cdcStartTime("cdcStartTime")
 * .cdcStopTime("cdcStopTime")
 * .slotName("slotName")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html)
 */
public open class CfnDataMigration(
  cdkObject: software.amazon.awscdk.services.dms.CfnDataMigration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataMigrationProps,
  ) :
      this(software.amazon.awscdk.services.dms.CfnDataMigration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDataMigrationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataMigrationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataMigrationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) that identifies this replication.
   */
  public open fun attrDataMigrationArn(): String = unwrap(this).getAttrDataMigrationArn()

  /**
   * The UTC time when DMS created the data migration.
   */
  public open fun attrDataMigrationCreateTime(): String =
      unwrap(this).getAttrDataMigrationCreateTime()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The property describes an ARN of the data migration.
   */
  public open fun dataMigrationIdentifier(): String? = unwrap(this).getDataMigrationIdentifier()

  /**
   * The property describes an ARN of the data migration.
   */
  public open fun dataMigrationIdentifier(`value`: String) {
    unwrap(this).setDataMigrationIdentifier(`value`)
  }

  /**
   * The user-friendly name for the data migration.
   */
  public open fun dataMigrationName(): String? = unwrap(this).getDataMigrationName()

  /**
   * The user-friendly name for the data migration.
   */
  public open fun dataMigrationName(`value`: String) {
    unwrap(this).setDataMigrationName(`value`)
  }

  /**
   * Specifies CloudWatch settings and selection rules for the data migration.
   */
  public open fun dataMigrationSettings(): Any? = unwrap(this).getDataMigrationSettings()

  /**
   * Specifies CloudWatch settings and selection rules for the data migration.
   */
  public open fun dataMigrationSettings(`value`: IResolvable) {
    unwrap(this).setDataMigrationSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies CloudWatch settings and selection rules for the data migration.
   */
  public open fun dataMigrationSettings(`value`: DataMigrationSettingsProperty) {
    unwrap(this).setDataMigrationSettings(`value`.let(DataMigrationSettingsProperty.Companion::unwrap))
  }

  /**
   * Specifies CloudWatch settings and selection rules for the data migration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b08418e1d874d1603923daf1c5bbd99e5cd57c1013cde18e8b28ebb8985c8c76")
  public open fun dataMigrationSettings(`value`: DataMigrationSettingsProperty.Builder.() -> Unit):
      Unit = dataMigrationSettings(DataMigrationSettingsProperty(`value`))

  /**
   * Specifies whether the data migration is full-load only, change data capture (CDC) only, or
   * full-load and CDC.
   */
  public open fun dataMigrationType(): String = unwrap(this).getDataMigrationType()

  /**
   * Specifies whether the data migration is full-load only, change data capture (CDC) only, or
   * full-load and CDC.
   */
  public open fun dataMigrationType(`value`: String) {
    unwrap(this).setDataMigrationType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The property describes an identifier for the migration project.
   */
  public open fun migrationProjectIdentifier(): String =
      unwrap(this).getMigrationProjectIdentifier()

  /**
   * The property describes an identifier for the migration project.
   */
  public open fun migrationProjectIdentifier(`value`: String) {
    unwrap(this).setMigrationProjectIdentifier(`value`)
  }

  /**
   * The IAM role that the data migration uses to access AWS resources.
   */
  public open fun serviceAccessRoleArn(): String = unwrap(this).getServiceAccessRoleArn()

  /**
   * The IAM role that the data migration uses to access AWS resources.
   */
  public open fun serviceAccessRoleArn(`value`: String) {
    unwrap(this).setServiceAccessRoleArn(`value`)
  }

  /**
   * Specifies information about the data migration's source data provider.
   */
  public open fun sourceDataSettings(): Any? = unwrap(this).getSourceDataSettings()

  /**
   * Specifies information about the data migration's source data provider.
   */
  public open fun sourceDataSettings(`value`: IResolvable) {
    unwrap(this).setSourceDataSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies information about the data migration's source data provider.
   */
  public open fun sourceDataSettings(`value`: List<Any>) {
    unwrap(this).setSourceDataSettings(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies information about the data migration's source data provider.
   */
  public open fun sourceDataSettings(vararg `value`: Any): Unit =
      sourceDataSettings(`value`.toList())

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnDataMigration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The property describes an ARN of the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationidentifier)
     * @param dataMigrationIdentifier The property describes an ARN of the data migration. 
     */
    public fun dataMigrationIdentifier(dataMigrationIdentifier: String)

    /**
     * The user-friendly name for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationname)
     * @param dataMigrationName The user-friendly name for the data migration. 
     */
    public fun dataMigrationName(dataMigrationName: String)

    /**
     * Specifies CloudWatch settings and selection rules for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationsettings)
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration. 
     */
    public fun dataMigrationSettings(dataMigrationSettings: IResolvable)

    /**
     * Specifies CloudWatch settings and selection rules for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationsettings)
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration. 
     */
    public fun dataMigrationSettings(dataMigrationSettings: DataMigrationSettingsProperty)

    /**
     * Specifies CloudWatch settings and selection rules for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationsettings)
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b67262c966c43cc95a426e3815c72b7fa9acaf746376d228ef3599676da3fd9")
    public
        fun dataMigrationSettings(dataMigrationSettings: DataMigrationSettingsProperty.Builder.() -> Unit)

    /**
     * Specifies whether the data migration is full-load only, change data capture (CDC) only, or
     * full-load and CDC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationtype)
     * @param dataMigrationType Specifies whether the data migration is full-load only, change data
     * capture (CDC) only, or full-load and CDC. 
     */
    public fun dataMigrationType(dataMigrationType: String)

    /**
     * The property describes an identifier for the migration project.
     *
     * It is used for describing/deleting/modifying can be name/arn
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-migrationprojectidentifier)
     * @param migrationProjectIdentifier The property describes an identifier for the migration
     * project. 
     */
    public fun migrationProjectIdentifier(migrationProjectIdentifier: String)

    /**
     * The IAM role that the data migration uses to access AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-serviceaccessrolearn)
     * @param serviceAccessRoleArn The IAM role that the data migration uses to access AWS
     * resources. 
     */
    public fun serviceAccessRoleArn(serviceAccessRoleArn: String)

    /**
     * Specifies information about the data migration's source data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-sourcedatasettings)
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider. 
     */
    public fun sourceDataSettings(sourceDataSettings: IResolvable)

    /**
     * Specifies information about the data migration's source data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-sourcedatasettings)
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider. 
     */
    public fun sourceDataSettings(sourceDataSettings: List<Any>)

    /**
     * Specifies information about the data migration's source data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-sourcedatasettings)
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider. 
     */
    public fun sourceDataSettings(vararg sourceDataSettings: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnDataMigration.Builder =
        software.amazon.awscdk.services.dms.CfnDataMigration.Builder.create(scope, id)

    /**
     * The property describes an ARN of the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationidentifier)
     * @param dataMigrationIdentifier The property describes an ARN of the data migration. 
     */
    override fun dataMigrationIdentifier(dataMigrationIdentifier: String) {
      cdkBuilder.dataMigrationIdentifier(dataMigrationIdentifier)
    }

    /**
     * The user-friendly name for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationname)
     * @param dataMigrationName The user-friendly name for the data migration. 
     */
    override fun dataMigrationName(dataMigrationName: String) {
      cdkBuilder.dataMigrationName(dataMigrationName)
    }

    /**
     * Specifies CloudWatch settings and selection rules for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationsettings)
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration. 
     */
    override fun dataMigrationSettings(dataMigrationSettings: IResolvable) {
      cdkBuilder.dataMigrationSettings(dataMigrationSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies CloudWatch settings and selection rules for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationsettings)
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration. 
     */
    override fun dataMigrationSettings(dataMigrationSettings: DataMigrationSettingsProperty) {
      cdkBuilder.dataMigrationSettings(dataMigrationSettings.let(DataMigrationSettingsProperty.Companion::unwrap))
    }

    /**
     * Specifies CloudWatch settings and selection rules for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationsettings)
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b67262c966c43cc95a426e3815c72b7fa9acaf746376d228ef3599676da3fd9")
    override
        fun dataMigrationSettings(dataMigrationSettings: DataMigrationSettingsProperty.Builder.() -> Unit):
        Unit = dataMigrationSettings(DataMigrationSettingsProperty(dataMigrationSettings))

    /**
     * Specifies whether the data migration is full-load only, change data capture (CDC) only, or
     * full-load and CDC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationtype)
     * @param dataMigrationType Specifies whether the data migration is full-load only, change data
     * capture (CDC) only, or full-load and CDC. 
     */
    override fun dataMigrationType(dataMigrationType: String) {
      cdkBuilder.dataMigrationType(dataMigrationType)
    }

    /**
     * The property describes an identifier for the migration project.
     *
     * It is used for describing/deleting/modifying can be name/arn
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-migrationprojectidentifier)
     * @param migrationProjectIdentifier The property describes an identifier for the migration
     * project. 
     */
    override fun migrationProjectIdentifier(migrationProjectIdentifier: String) {
      cdkBuilder.migrationProjectIdentifier(migrationProjectIdentifier)
    }

    /**
     * The IAM role that the data migration uses to access AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-serviceaccessrolearn)
     * @param serviceAccessRoleArn The IAM role that the data migration uses to access AWS
     * resources. 
     */
    override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
      cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
    }

    /**
     * Specifies information about the data migration's source data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-sourcedatasettings)
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider. 
     */
    override fun sourceDataSettings(sourceDataSettings: IResolvable) {
      cdkBuilder.sourceDataSettings(sourceDataSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies information about the data migration's source data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-sourcedatasettings)
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider. 
     */
    override fun sourceDataSettings(sourceDataSettings: List<Any>) {
      cdkBuilder.sourceDataSettings(sourceDataSettings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies information about the data migration's source data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-sourcedatasettings)
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider. 
     */
    override fun sourceDataSettings(vararg sourceDataSettings: Any): Unit =
        sourceDataSettings(sourceDataSettings.toList())

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnDataMigration = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dms.CfnDataMigration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataMigration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataMigration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataMigration):
        CfnDataMigration = CfnDataMigration(cdkObject)

    internal fun unwrap(wrapped: CfnDataMigration):
        software.amazon.awscdk.services.dms.CfnDataMigration = wrapped.cdkObject as
        software.amazon.awscdk.services.dms.CfnDataMigration
  }

  /**
   * Options for configuring a data migration, including whether to enable CloudWatch logs, and the
   * selection rules to use to include or exclude database objects from the migration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dms.*;
   * DataMigrationSettingsProperty dataMigrationSettingsProperty =
   * DataMigrationSettingsProperty.builder()
   * .cloudwatchLogsEnabled(false)
   * .numberOfJobs(123)
   * .selectionRules("selectionRules")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-datamigrationsettings.html)
   */
  public interface DataMigrationSettingsProperty {
    /**
     * Whether to enable CloudWatch logging for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-datamigrationsettings.html#cfn-dms-datamigration-datamigrationsettings-cloudwatchlogsenabled)
     */
    public fun cloudwatchLogsEnabled(): Any? = unwrap(this).getCloudwatchLogsEnabled()

    /**
     * The number of parallel jobs that trigger parallel threads to unload the tables from the
     * source, and then load them to the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-datamigrationsettings.html#cfn-dms-datamigration-datamigrationsettings-numberofjobs)
     */
    public fun numberOfJobs(): Number? = unwrap(this).getNumberOfJobs()

    /**
     * A JSON-formatted string that defines what objects to include and exclude from the migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-datamigrationsettings.html#cfn-dms-datamigration-datamigrationsettings-selectionrules)
     */
    public fun selectionRules(): String? = unwrap(this).getSelectionRules()

    /**
     * A builder for [DataMigrationSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudwatchLogsEnabled Whether to enable CloudWatch logging for the data migration.
       */
      public fun cloudwatchLogsEnabled(cloudwatchLogsEnabled: Boolean)

      /**
       * @param cloudwatchLogsEnabled Whether to enable CloudWatch logging for the data migration.
       */
      public fun cloudwatchLogsEnabled(cloudwatchLogsEnabled: IResolvable)

      /**
       * @param numberOfJobs The number of parallel jobs that trigger parallel threads to unload the
       * tables from the source, and then load them to the target.
       */
      public fun numberOfJobs(numberOfJobs: Number)

      /**
       * @param selectionRules A JSON-formatted string that defines what objects to include and
       * exclude from the migration.
       */
      public fun selectionRules(selectionRules: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnDataMigration.DataMigrationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dms.CfnDataMigration.DataMigrationSettingsProperty.builder()

      /**
       * @param cloudwatchLogsEnabled Whether to enable CloudWatch logging for the data migration.
       */
      override fun cloudwatchLogsEnabled(cloudwatchLogsEnabled: Boolean) {
        cdkBuilder.cloudwatchLogsEnabled(cloudwatchLogsEnabled)
      }

      /**
       * @param cloudwatchLogsEnabled Whether to enable CloudWatch logging for the data migration.
       */
      override fun cloudwatchLogsEnabled(cloudwatchLogsEnabled: IResolvable) {
        cdkBuilder.cloudwatchLogsEnabled(cloudwatchLogsEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param numberOfJobs The number of parallel jobs that trigger parallel threads to unload the
       * tables from the source, and then load them to the target.
       */
      override fun numberOfJobs(numberOfJobs: Number) {
        cdkBuilder.numberOfJobs(numberOfJobs)
      }

      /**
       * @param selectionRules A JSON-formatted string that defines what objects to include and
       * exclude from the migration.
       */
      override fun selectionRules(selectionRules: String) {
        cdkBuilder.selectionRules(selectionRules)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnDataMigration.DataMigrationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.dms.CfnDataMigration.DataMigrationSettingsProperty,
    ) : CdkObject(cdkObject),
        DataMigrationSettingsProperty {
      /**
       * Whether to enable CloudWatch logging for the data migration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-datamigrationsettings.html#cfn-dms-datamigration-datamigrationsettings-cloudwatchlogsenabled)
       */
      override fun cloudwatchLogsEnabled(): Any? = unwrap(this).getCloudwatchLogsEnabled()

      /**
       * The number of parallel jobs that trigger parallel threads to unload the tables from the
       * source, and then load them to the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-datamigrationsettings.html#cfn-dms-datamigration-datamigrationsettings-numberofjobs)
       */
      override fun numberOfJobs(): Number? = unwrap(this).getNumberOfJobs()

      /**
       * A JSON-formatted string that defines what objects to include and exclude from the
       * migration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-datamigrationsettings.html#cfn-dms-datamigration-datamigrationsettings-selectionrules)
       */
      override fun selectionRules(): String? = unwrap(this).getSelectionRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataMigrationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataMigration.DataMigrationSettingsProperty):
          DataMigrationSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataMigrationSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataMigrationSettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataMigration.DataMigrationSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnDataMigration.DataMigrationSettingsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dms.*;
   * SourceDataSettingsProperty sourceDataSettingsProperty = SourceDataSettingsProperty.builder()
   * .cdcStartPosition("cdcStartPosition")
   * .cdcStartTime("cdcStartTime")
   * .cdcStopTime("cdcStopTime")
   * .slotName("slotName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-sourcedatasettings.html)
   */
  public interface SourceDataSettingsProperty {
    /**
     * The property is a point in the database engine's log that defines a time where you can begin
     * CDC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-sourcedatasettings.html#cfn-dms-datamigration-sourcedatasettings-cdcstartposition)
     */
    public fun cdcStartPosition(): String? = unwrap(this).getCdcStartPosition()

    /**
     * The property indicates the start time for a change data capture (CDC) operation.
     *
     * The value is server time in UTC format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-sourcedatasettings.html#cfn-dms-datamigration-sourcedatasettings-cdcstarttime)
     */
    public fun cdcStartTime(): String? = unwrap(this).getCdcStartTime()

    /**
     * The property indicates the stop time for a change data capture (CDC) operation.
     *
     * The value is server time in UTC format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-sourcedatasettings.html#cfn-dms-datamigration-sourcedatasettings-cdcstoptime)
     */
    public fun cdcStopTime(): String? = unwrap(this).getCdcStopTime()

    /**
     * The property sets the name of a previously created logical replication slot for a change data
     * capture (CDC) load of the source instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-sourcedatasettings.html#cfn-dms-datamigration-sourcedatasettings-slotname)
     */
    public fun slotName(): String? = unwrap(this).getSlotName()

    /**
     * A builder for [SourceDataSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cdcStartPosition The property is a point in the database engine's log that defines a
       * time where you can begin CDC.
       */
      public fun cdcStartPosition(cdcStartPosition: String)

      /**
       * @param cdcStartTime The property indicates the start time for a change data capture (CDC)
       * operation.
       * The value is server time in UTC format.
       */
      public fun cdcStartTime(cdcStartTime: String)

      /**
       * @param cdcStopTime The property indicates the stop time for a change data capture (CDC)
       * operation.
       * The value is server time in UTC format.
       */
      public fun cdcStopTime(cdcStopTime: String)

      /**
       * @param slotName The property sets the name of a previously created logical replication slot
       * for a change data capture (CDC) load of the source instance.
       */
      public fun slotName(slotName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnDataMigration.SourceDataSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnDataMigration.SourceDataSettingsProperty.builder()

      /**
       * @param cdcStartPosition The property is a point in the database engine's log that defines a
       * time where you can begin CDC.
       */
      override fun cdcStartPosition(cdcStartPosition: String) {
        cdkBuilder.cdcStartPosition(cdcStartPosition)
      }

      /**
       * @param cdcStartTime The property indicates the start time for a change data capture (CDC)
       * operation.
       * The value is server time in UTC format.
       */
      override fun cdcStartTime(cdcStartTime: String) {
        cdkBuilder.cdcStartTime(cdcStartTime)
      }

      /**
       * @param cdcStopTime The property indicates the stop time for a change data capture (CDC)
       * operation.
       * The value is server time in UTC format.
       */
      override fun cdcStopTime(cdcStopTime: String) {
        cdkBuilder.cdcStopTime(cdcStopTime)
      }

      /**
       * @param slotName The property sets the name of a previously created logical replication slot
       * for a change data capture (CDC) load of the source instance.
       */
      override fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnDataMigration.SourceDataSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.dms.CfnDataMigration.SourceDataSettingsProperty,
    ) : CdkObject(cdkObject),
        SourceDataSettingsProperty {
      /**
       * The property is a point in the database engine's log that defines a time where you can
       * begin CDC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-sourcedatasettings.html#cfn-dms-datamigration-sourcedatasettings-cdcstartposition)
       */
      override fun cdcStartPosition(): String? = unwrap(this).getCdcStartPosition()

      /**
       * The property indicates the start time for a change data capture (CDC) operation.
       *
       * The value is server time in UTC format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-sourcedatasettings.html#cfn-dms-datamigration-sourcedatasettings-cdcstarttime)
       */
      override fun cdcStartTime(): String? = unwrap(this).getCdcStartTime()

      /**
       * The property indicates the stop time for a change data capture (CDC) operation.
       *
       * The value is server time in UTC format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-sourcedatasettings.html#cfn-dms-datamigration-sourcedatasettings-cdcstoptime)
       */
      override fun cdcStopTime(): String? = unwrap(this).getCdcStopTime()

      /**
       * The property sets the name of a previously created logical replication slot for a change
       * data capture (CDC) load of the source instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-datamigration-sourcedatasettings.html#cfn-dms-datamigration-sourcedatasettings-slotname)
       */
      override fun slotName(): String? = unwrap(this).getSlotName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceDataSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataMigration.SourceDataSettingsProperty):
          SourceDataSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SourceDataSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceDataSettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataMigration.SourceDataSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnDataMigration.SourceDataSettingsProperty
    }
  }
}
