@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataMigration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnDataMigrationProps cfnDataMigrationProps = CfnDataMigrationProps.builder()
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
public interface CfnDataMigrationProps {
  /**
   * The property describes an ARN of the data migration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationidentifier)
   */
  public fun dataMigrationIdentifier(): String? = unwrap(this).getDataMigrationIdentifier()

  /**
   * The user-friendly name for the data migration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationname)
   */
  public fun dataMigrationName(): String? = unwrap(this).getDataMigrationName()

  /**
   * Specifies CloudWatch settings and selection rules for the data migration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationsettings)
   */
  public fun dataMigrationSettings(): Any? = unwrap(this).getDataMigrationSettings()

  /**
   * Specifies whether the data migration is full-load only, change data capture (CDC) only, or
   * full-load and CDC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationtype)
   */
  public fun dataMigrationType(): String

  /**
   * The property describes an identifier for the migration project.
   *
   * It is used for describing/deleting/modifying can be name/arn
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-migrationprojectidentifier)
   */
  public fun migrationProjectIdentifier(): String

  /**
   * The IAM role that the data migration uses to access AWS resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-serviceaccessrolearn)
   */
  public fun serviceAccessRoleArn(): String

  /**
   * Specifies information about the data migration's source data provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-sourcedatasettings)
   */
  public fun sourceDataSettings(): Any? = unwrap(this).getSourceDataSettings()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataMigrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataMigrationIdentifier The property describes an ARN of the data migration.
     */
    public fun dataMigrationIdentifier(dataMigrationIdentifier: String)

    /**
     * @param dataMigrationName The user-friendly name for the data migration.
     */
    public fun dataMigrationName(dataMigrationName: String)

    /**
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration.
     */
    public fun dataMigrationSettings(dataMigrationSettings: IResolvable)

    /**
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration.
     */
    public
        fun dataMigrationSettings(dataMigrationSettings: CfnDataMigration.DataMigrationSettingsProperty)

    /**
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("583514b3f5a46483dedb2beb3c369bc74498252e1251127df6292f4cba5fb88d")
    public
        fun dataMigrationSettings(dataMigrationSettings: CfnDataMigration.DataMigrationSettingsProperty.Builder.() -> Unit)

    /**
     * @param dataMigrationType Specifies whether the data migration is full-load only, change data
     * capture (CDC) only, or full-load and CDC. 
     */
    public fun dataMigrationType(dataMigrationType: String)

    /**
     * @param migrationProjectIdentifier The property describes an identifier for the migration
     * project. 
     * It is used for describing/deleting/modifying can be name/arn
     */
    public fun migrationProjectIdentifier(migrationProjectIdentifier: String)

    /**
     * @param serviceAccessRoleArn The IAM role that the data migration uses to access AWS
     * resources. 
     */
    public fun serviceAccessRoleArn(serviceAccessRoleArn: String)

    /**
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider.
     */
    public fun sourceDataSettings(sourceDataSettings: IResolvable)

    /**
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider.
     */
    public fun sourceDataSettings(sourceDataSettings: List<Any>)

    /**
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider.
     */
    public fun sourceDataSettings(vararg sourceDataSettings: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnDataMigrationProps.Builder =
        software.amazon.awscdk.services.dms.CfnDataMigrationProps.builder()

    /**
     * @param dataMigrationIdentifier The property describes an ARN of the data migration.
     */
    override fun dataMigrationIdentifier(dataMigrationIdentifier: String) {
      cdkBuilder.dataMigrationIdentifier(dataMigrationIdentifier)
    }

    /**
     * @param dataMigrationName The user-friendly name for the data migration.
     */
    override fun dataMigrationName(dataMigrationName: String) {
      cdkBuilder.dataMigrationName(dataMigrationName)
    }

    /**
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration.
     */
    override fun dataMigrationSettings(dataMigrationSettings: IResolvable) {
      cdkBuilder.dataMigrationSettings(dataMigrationSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration.
     */
    override
        fun dataMigrationSettings(dataMigrationSettings: CfnDataMigration.DataMigrationSettingsProperty) {
      cdkBuilder.dataMigrationSettings(dataMigrationSettings.let(CfnDataMigration.DataMigrationSettingsProperty.Companion::unwrap))
    }

    /**
     * @param dataMigrationSettings Specifies CloudWatch settings and selection rules for the data
     * migration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("583514b3f5a46483dedb2beb3c369bc74498252e1251127df6292f4cba5fb88d")
    override
        fun dataMigrationSettings(dataMigrationSettings: CfnDataMigration.DataMigrationSettingsProperty.Builder.() -> Unit):
        Unit =
        dataMigrationSettings(CfnDataMigration.DataMigrationSettingsProperty(dataMigrationSettings))

    /**
     * @param dataMigrationType Specifies whether the data migration is full-load only, change data
     * capture (CDC) only, or full-load and CDC. 
     */
    override fun dataMigrationType(dataMigrationType: String) {
      cdkBuilder.dataMigrationType(dataMigrationType)
    }

    /**
     * @param migrationProjectIdentifier The property describes an identifier for the migration
     * project. 
     * It is used for describing/deleting/modifying can be name/arn
     */
    override fun migrationProjectIdentifier(migrationProjectIdentifier: String) {
      cdkBuilder.migrationProjectIdentifier(migrationProjectIdentifier)
    }

    /**
     * @param serviceAccessRoleArn The IAM role that the data migration uses to access AWS
     * resources. 
     */
    override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
      cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
    }

    /**
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider.
     */
    override fun sourceDataSettings(sourceDataSettings: IResolvable) {
      cdkBuilder.sourceDataSettings(sourceDataSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider.
     */
    override fun sourceDataSettings(sourceDataSettings: List<Any>) {
      cdkBuilder.sourceDataSettings(sourceDataSettings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param sourceDataSettings Specifies information about the data migration's source data
     * provider.
     */
    override fun sourceDataSettings(vararg sourceDataSettings: Any): Unit =
        sourceDataSettings(sourceDataSettings.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnDataMigrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dms.CfnDataMigrationProps,
  ) : CdkObject(cdkObject),
      CfnDataMigrationProps {
    /**
     * The property describes an ARN of the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationidentifier)
     */
    override fun dataMigrationIdentifier(): String? = unwrap(this).getDataMigrationIdentifier()

    /**
     * The user-friendly name for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationname)
     */
    override fun dataMigrationName(): String? = unwrap(this).getDataMigrationName()

    /**
     * Specifies CloudWatch settings and selection rules for the data migration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationsettings)
     */
    override fun dataMigrationSettings(): Any? = unwrap(this).getDataMigrationSettings()

    /**
     * Specifies whether the data migration is full-load only, change data capture (CDC) only, or
     * full-load and CDC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-datamigrationtype)
     */
    override fun dataMigrationType(): String = unwrap(this).getDataMigrationType()

    /**
     * The property describes an identifier for the migration project.
     *
     * It is used for describing/deleting/modifying can be name/arn
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-migrationprojectidentifier)
     */
    override fun migrationProjectIdentifier(): String = unwrap(this).getMigrationProjectIdentifier()

    /**
     * The IAM role that the data migration uses to access AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-serviceaccessrolearn)
     */
    override fun serviceAccessRoleArn(): String = unwrap(this).getServiceAccessRoleArn()

    /**
     * Specifies information about the data migration's source data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-sourcedatasettings)
     */
    override fun sourceDataSettings(): Any? = unwrap(this).getSourceDataSettings()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-datamigration.html#cfn-dms-datamigration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataMigrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataMigrationProps):
        CfnDataMigrationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDataMigrationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataMigrationProps):
        software.amazon.awscdk.services.dms.CfnDataMigrationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dms.CfnDataMigrationProps
  }
}
