@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AWS Glue resource for enabling table optimizers to improve read performance for open table
 * formats.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnTableOptimizer cfnTableOptimizer = CfnTableOptimizer.Builder.create(this,
 * "MyCfnTableOptimizer")
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .tableOptimizerConfiguration(TableOptimizerConfigurationProperty.builder()
 * .enabled(false)
 * .roleArn("roleArn")
 * // the properties below are optional
 * .orphanFileDeletionConfiguration(OrphanFileDeletionConfigurationProperty.builder()
 * .icebergConfiguration(IcebergConfigurationProperty.builder()
 * .location("location")
 * .orphanFileRetentionPeriodInDays(123)
 * .build())
 * .build())
 * .retentionConfiguration(RetentionConfigurationProperty.builder()
 * .icebergConfiguration(IcebergConfigurationProperty.builder()
 * .location("location")
 * .orphanFileRetentionPeriodInDays(123)
 * .build())
 * .build())
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .glueConnectionName("glueConnectionName")
 * .build())
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html)
 */
public open class CfnTableOptimizer(
  cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableOptimizerProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnTableOptimizer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTableOptimizerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableOptimizerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTableOptimizerProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The catalog ID of the table.
   */
  public open fun catalogId(): String = unwrap(this).getCatalogId()

  /**
   * The catalog ID of the table.
   */
  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  /**
   * The name of the database.
   */
  public open fun databaseName(): String = unwrap(this).getDatabaseName()

  /**
   * The name of the database.
   */
  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
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
   * The table name.
   */
  public open fun tableName(): String = unwrap(this).getTableName()

  /**
   * The table name.
   */
  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  /**
   * Specifies configuration details of a table optimizer.
   */
  public open fun tableOptimizerConfiguration(): Any = unwrap(this).getTableOptimizerConfiguration()

  /**
   * Specifies configuration details of a table optimizer.
   */
  public open fun tableOptimizerConfiguration(`value`: IResolvable) {
    unwrap(this).setTableOptimizerConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies configuration details of a table optimizer.
   */
  public open fun tableOptimizerConfiguration(`value`: TableOptimizerConfigurationProperty) {
    unwrap(this).setTableOptimizerConfiguration(`value`.let(TableOptimizerConfigurationProperty.Companion::unwrap))
  }

  /**
   * Specifies configuration details of a table optimizer.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6acec22b313a6085ba5e377067e32e85711a941ea7f2359e7304e530517931cc")
  public open
      fun tableOptimizerConfiguration(`value`: TableOptimizerConfigurationProperty.Builder.() -> Unit):
      Unit = tableOptimizerConfiguration(TableOptimizerConfigurationProperty(`value`))

  /**
   * The type of table optimizer.
   *
   * The valid values are:.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of table optimizer.
   *
   * The valid values are:.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnTableOptimizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The catalog ID of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-catalogid)
     * @param catalogId The catalog ID of the table. 
     */
    public fun catalogId(catalogId: String)

    /**
     * The name of the database.
     *
     * For Hive compatibility, this is folded to lowercase when it is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-databasename)
     * @param databaseName The name of the database. 
     */
    public fun databaseName(databaseName: String)

    /**
     * The table name.
     *
     * For Hive compatibility, this must be entirely lowercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tablename)
     * @param tableName The table name. 
     */
    public fun tableName(tableName: String)

    /**
     * Specifies configuration details of a table optimizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration Specifies configuration details of a table optimizer. 
     */
    public fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable)

    /**
     * Specifies configuration details of a table optimizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration Specifies configuration details of a table optimizer. 
     */
    public
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty)

    /**
     * Specifies configuration details of a table optimizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration Specifies configuration details of a table optimizer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a2c8297cdf6212a0fbaf3da179bd2b62e493c16bf68663d123d3d098e086c04")
    public
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty.Builder.() -> Unit)

    /**
     * The type of table optimizer. The valid values are:.
     *
     * * compaction - for managing compaction with a table optimizer.
     * * retention - for managing the retention of snapshot with a table optimizer.
     * * orphan_file_deletion - for managing the deletion of orphan files with a table optimizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-type)
     * @param type The type of table optimizer. The valid values are:. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTableOptimizer.Builder =
        software.amazon.awscdk.services.glue.CfnTableOptimizer.Builder.create(scope, id)

    /**
     * The catalog ID of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-catalogid)
     * @param catalogId The catalog ID of the table. 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * The name of the database.
     *
     * For Hive compatibility, this is folded to lowercase when it is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-databasename)
     * @param databaseName The name of the database. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * The table name.
     *
     * For Hive compatibility, this must be entirely lowercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tablename)
     * @param tableName The table name. 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * Specifies configuration details of a table optimizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration Specifies configuration details of a table optimizer. 
     */
    override fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable) {
      cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies configuration details of a table optimizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration Specifies configuration details of a table optimizer. 
     */
    override
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty) {
      cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration.let(TableOptimizerConfigurationProperty.Companion::unwrap))
    }

    /**
     * Specifies configuration details of a table optimizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration Specifies configuration details of a table optimizer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a2c8297cdf6212a0fbaf3da179bd2b62e493c16bf68663d123d3d098e086c04")
    override
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty.Builder.() -> Unit):
        Unit =
        tableOptimizerConfiguration(TableOptimizerConfigurationProperty(tableOptimizerConfiguration))

    /**
     * The type of table optimizer. The valid values are:.
     *
     * * compaction - for managing compaction with a table optimizer.
     * * retention - for managing the retention of snapshot with a table optimizer.
     * * orphan_file_deletion - for managing the deletion of orphan files with a table optimizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-type)
     * @param type The type of table optimizer. The valid values are:. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnTableOptimizer = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnTableOptimizer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTableOptimizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTableOptimizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer):
        CfnTableOptimizer = CfnTableOptimizer(cdkObject)

    internal fun unwrap(wrapped: CfnTableOptimizer):
        software.amazon.awscdk.services.glue.CfnTableOptimizer = wrapped.cdkObject as
        software.amazon.awscdk.services.glue.CfnTableOptimizer
  }

  /**
   * IcebergConfiguration is a property type within the `AWS::Glue::TableOptimizer` resource in AWS
   * CloudFormation.
   *
   * This configuration is used when setting up table optimization for Iceberg tables in AWS Glue .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * IcebergConfigurationProperty icebergConfigurationProperty =
   * IcebergConfigurationProperty.builder()
   * .location("location")
   * .orphanFileRetentionPeriodInDays(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-icebergconfiguration.html)
   */
  public interface IcebergConfigurationProperty {
    /**
     * Specifies a directory in which to look for orphan files (defaults to the table's location).
     *
     * You may choose a sub-directory rather than the top-level table location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-icebergconfiguration.html#cfn-glue-tableoptimizer-icebergconfiguration-location)
     */
    public fun location(): String? = unwrap(this).getLocation()

    /**
     * The specific number of days you want to keep the orphan files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-icebergconfiguration.html#cfn-glue-tableoptimizer-icebergconfiguration-orphanfileretentionperiodindays)
     */
    public fun orphanFileRetentionPeriodInDays(): Number? =
        unwrap(this).getOrphanFileRetentionPeriodInDays()

    /**
     * A builder for [IcebergConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param location Specifies a directory in which to look for orphan files (defaults to the
       * table's location).
       * You may choose a sub-directory rather than the top-level table location.
       */
      public fun location(location: String)

      /**
       * @param orphanFileRetentionPeriodInDays The specific number of days you want to keep the
       * orphan files.
       */
      public fun orphanFileRetentionPeriodInDays(orphanFileRetentionPeriodInDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTableOptimizer.IcebergConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnTableOptimizer.IcebergConfigurationProperty.builder()

      /**
       * @param location Specifies a directory in which to look for orphan files (defaults to the
       * table's location).
       * You may choose a sub-directory rather than the top-level table location.
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param orphanFileRetentionPeriodInDays The specific number of days you want to keep the
       * orphan files.
       */
      override fun orphanFileRetentionPeriodInDays(orphanFileRetentionPeriodInDays: Number) {
        cdkBuilder.orphanFileRetentionPeriodInDays(orphanFileRetentionPeriodInDays)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnTableOptimizer.IcebergConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.IcebergConfigurationProperty,
    ) : CdkObject(cdkObject),
        IcebergConfigurationProperty {
      /**
       * Specifies a directory in which to look for orphan files (defaults to the table's location).
       *
       * You may choose a sub-directory rather than the top-level table location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-icebergconfiguration.html#cfn-glue-tableoptimizer-icebergconfiguration-location)
       */
      override fun location(): String? = unwrap(this).getLocation()

      /**
       * The specific number of days you want to keep the orphan files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-icebergconfiguration.html#cfn-glue-tableoptimizer-icebergconfiguration-orphanfileretentionperiodindays)
       */
      override fun orphanFileRetentionPeriodInDays(): Number? =
          unwrap(this).getOrphanFileRetentionPeriodInDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IcebergConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.IcebergConfigurationProperty):
          IcebergConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IcebergConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IcebergConfigurationProperty):
          software.amazon.awscdk.services.glue.CfnTableOptimizer.IcebergConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTableOptimizer.IcebergConfigurationProperty
    }
  }

  /**
   * Configuration for removing files that are are not tracked by the Iceberg table metadata, and
   * are older than your configured age limit.
   *
   * This configuration helps optimize storage usage and costs by automatically cleaning up files
   * that are no longer needed by the table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * OrphanFileDeletionConfigurationProperty orphanFileDeletionConfigurationProperty =
   * OrphanFileDeletionConfigurationProperty.builder()
   * .icebergConfiguration(IcebergConfigurationProperty.builder()
   * .location("location")
   * .orphanFileRetentionPeriodInDays(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-orphanfiledeletionconfiguration.html)
   */
  public interface OrphanFileDeletionConfigurationProperty {
    /**
     * The `IcebergConfiguration` property helps optimize your Iceberg tables in AWS Glue by
     * allowing you to specify format-specific settings that control how data is stored, compressed,
     * and managed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-orphanfiledeletionconfiguration.html#cfn-glue-tableoptimizer-orphanfiledeletionconfiguration-icebergconfiguration)
     */
    public fun icebergConfiguration(): Any? = unwrap(this).getIcebergConfiguration()

    /**
     * A builder for [OrphanFileDeletionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param icebergConfiguration The `IcebergConfiguration` property helps optimize your Iceberg
       * tables in AWS Glue by allowing you to specify format-specific settings that control how data
       * is stored, compressed, and managed.
       */
      public fun icebergConfiguration(icebergConfiguration: IResolvable)

      /**
       * @param icebergConfiguration The `IcebergConfiguration` property helps optimize your Iceberg
       * tables in AWS Glue by allowing you to specify format-specific settings that control how data
       * is stored, compressed, and managed.
       */
      public fun icebergConfiguration(icebergConfiguration: IcebergConfigurationProperty)

      /**
       * @param icebergConfiguration The `IcebergConfiguration` property helps optimize your Iceberg
       * tables in AWS Glue by allowing you to specify format-specific settings that control how data
       * is stored, compressed, and managed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2713eac6aa83e69b552b784e4a0ad346d2cc426b7438471b1f8b27b1bec7efd8")
      public
          fun icebergConfiguration(icebergConfiguration: IcebergConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTableOptimizer.OrphanFileDeletionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnTableOptimizer.OrphanFileDeletionConfigurationProperty.builder()

      /**
       * @param icebergConfiguration The `IcebergConfiguration` property helps optimize your Iceberg
       * tables in AWS Glue by allowing you to specify format-specific settings that control how data
       * is stored, compressed, and managed.
       */
      override fun icebergConfiguration(icebergConfiguration: IResolvable) {
        cdkBuilder.icebergConfiguration(icebergConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param icebergConfiguration The `IcebergConfiguration` property helps optimize your Iceberg
       * tables in AWS Glue by allowing you to specify format-specific settings that control how data
       * is stored, compressed, and managed.
       */
      override fun icebergConfiguration(icebergConfiguration: IcebergConfigurationProperty) {
        cdkBuilder.icebergConfiguration(icebergConfiguration.let(IcebergConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param icebergConfiguration The `IcebergConfiguration` property helps optimize your Iceberg
       * tables in AWS Glue by allowing you to specify format-specific settings that control how data
       * is stored, compressed, and managed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2713eac6aa83e69b552b784e4a0ad346d2cc426b7438471b1f8b27b1bec7efd8")
      override
          fun icebergConfiguration(icebergConfiguration: IcebergConfigurationProperty.Builder.() -> Unit):
          Unit = icebergConfiguration(IcebergConfigurationProperty(icebergConfiguration))

      public fun build():
          software.amazon.awscdk.services.glue.CfnTableOptimizer.OrphanFileDeletionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.OrphanFileDeletionConfigurationProperty,
    ) : CdkObject(cdkObject),
        OrphanFileDeletionConfigurationProperty {
      /**
       * The `IcebergConfiguration` property helps optimize your Iceberg tables in AWS Glue by
       * allowing you to specify format-specific settings that control how data is stored, compressed,
       * and managed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-orphanfiledeletionconfiguration.html#cfn-glue-tableoptimizer-orphanfiledeletionconfiguration-icebergconfiguration)
       */
      override fun icebergConfiguration(): Any? = unwrap(this).getIcebergConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OrphanFileDeletionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.OrphanFileDeletionConfigurationProperty):
          OrphanFileDeletionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OrphanFileDeletionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrphanFileDeletionConfigurationProperty):
          software.amazon.awscdk.services.glue.CfnTableOptimizer.OrphanFileDeletionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTableOptimizer.OrphanFileDeletionConfigurationProperty
    }
  }

  /**
   * The configuration for a snapshot retention optimizer for Apache Iceberg tables.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * RetentionConfigurationProperty retentionConfigurationProperty =
   * RetentionConfigurationProperty.builder()
   * .icebergConfiguration(IcebergConfigurationProperty.builder()
   * .location("location")
   * .orphanFileRetentionPeriodInDays(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-retentionconfiguration.html)
   */
  public interface RetentionConfigurationProperty {
    /**
     * The configuration for an Iceberg snapshot retention optimizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-retentionconfiguration.html#cfn-glue-tableoptimizer-retentionconfiguration-icebergconfiguration)
     */
    public fun icebergConfiguration(): Any? = unwrap(this).getIcebergConfiguration()

    /**
     * A builder for [RetentionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param icebergConfiguration The configuration for an Iceberg snapshot retention optimizer.
       */
      public fun icebergConfiguration(icebergConfiguration: IResolvable)

      /**
       * @param icebergConfiguration The configuration for an Iceberg snapshot retention optimizer.
       */
      public fun icebergConfiguration(icebergConfiguration: IcebergConfigurationProperty)

      /**
       * @param icebergConfiguration The configuration for an Iceberg snapshot retention optimizer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d54ad68a012289c4cc55f9cd282795e59666315aebcde77a5494dcc3ba30c2")
      public
          fun icebergConfiguration(icebergConfiguration: IcebergConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTableOptimizer.RetentionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnTableOptimizer.RetentionConfigurationProperty.builder()

      /**
       * @param icebergConfiguration The configuration for an Iceberg snapshot retention optimizer.
       */
      override fun icebergConfiguration(icebergConfiguration: IResolvable) {
        cdkBuilder.icebergConfiguration(icebergConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param icebergConfiguration The configuration for an Iceberg snapshot retention optimizer.
       */
      override fun icebergConfiguration(icebergConfiguration: IcebergConfigurationProperty) {
        cdkBuilder.icebergConfiguration(icebergConfiguration.let(IcebergConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param icebergConfiguration The configuration for an Iceberg snapshot retention optimizer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d54ad68a012289c4cc55f9cd282795e59666315aebcde77a5494dcc3ba30c2")
      override
          fun icebergConfiguration(icebergConfiguration: IcebergConfigurationProperty.Builder.() -> Unit):
          Unit = icebergConfiguration(IcebergConfigurationProperty(icebergConfiguration))

      public fun build():
          software.amazon.awscdk.services.glue.CfnTableOptimizer.RetentionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.RetentionConfigurationProperty,
    ) : CdkObject(cdkObject),
        RetentionConfigurationProperty {
      /**
       * The configuration for an Iceberg snapshot retention optimizer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-retentionconfiguration.html#cfn-glue-tableoptimizer-retentionconfiguration-icebergconfiguration)
       */
      override fun icebergConfiguration(): Any? = unwrap(this).getIcebergConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.RetentionConfigurationProperty):
          RetentionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RetentionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionConfigurationProperty):
          software.amazon.awscdk.services.glue.CfnTableOptimizer.RetentionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTableOptimizer.RetentionConfigurationProperty
    }
  }

  /**
   * Specifies configuration details of a table optimizer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * TableOptimizerConfigurationProperty tableOptimizerConfigurationProperty =
   * TableOptimizerConfigurationProperty.builder()
   * .enabled(false)
   * .roleArn("roleArn")
   * // the properties below are optional
   * .orphanFileDeletionConfiguration(OrphanFileDeletionConfigurationProperty.builder()
   * .icebergConfiguration(IcebergConfigurationProperty.builder()
   * .location("location")
   * .orphanFileRetentionPeriodInDays(123)
   * .build())
   * .build())
   * .retentionConfiguration(RetentionConfigurationProperty.builder()
   * .icebergConfiguration(IcebergConfigurationProperty.builder()
   * .location("location")
   * .orphanFileRetentionPeriodInDays(123)
   * .build())
   * .build())
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .glueConnectionName("glueConnectionName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html)
   */
  public interface TableOptimizerConfigurationProperty {
    /**
     * Whether the table optimization is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-enabled)
     */
    public fun enabled(): Any

    /**
     * `OrphanFileDeletionConfiguration` is a property that can be included within the
     * TableOptimizer resource.
     *
     * It controls the automatic deletion of orphaned files - files that are not tracked by the
     * table metadata, and older than the configured age limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-orphanfiledeletionconfiguration)
     */
    public fun orphanFileDeletionConfiguration(): Any? =
        unwrap(this).getOrphanFileDeletionConfiguration()

    /**
     * The configuration for a snapshot retention optimizer for Apache Iceberg tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-retentionconfiguration)
     */
    public fun retentionConfiguration(): Any? = unwrap(this).getRetentionConfiguration()

    /**
     * A role passed by the caller which gives the service permission to update the resources
     * associated with the optimizer on the caller's behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * An object that describes the VPC configuration for a table optimizer.
     *
     * This configuration is necessary to perform optimization on tables that are in a customer VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-vpcconfiguration)
     */
    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    /**
     * A builder for [TableOptimizerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Whether the table optimization is enabled. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Whether the table optimization is enabled. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param orphanFileDeletionConfiguration `OrphanFileDeletionConfiguration` is a property that
       * can be included within the TableOptimizer resource.
       * It controls the automatic deletion of orphaned files - files that are not tracked by the
       * table metadata, and older than the configured age limit.
       */
      public fun orphanFileDeletionConfiguration(orphanFileDeletionConfiguration: IResolvable)

      /**
       * @param orphanFileDeletionConfiguration `OrphanFileDeletionConfiguration` is a property that
       * can be included within the TableOptimizer resource.
       * It controls the automatic deletion of orphaned files - files that are not tracked by the
       * table metadata, and older than the configured age limit.
       */
      public
          fun orphanFileDeletionConfiguration(orphanFileDeletionConfiguration: OrphanFileDeletionConfigurationProperty)

      /**
       * @param orphanFileDeletionConfiguration `OrphanFileDeletionConfiguration` is a property that
       * can be included within the TableOptimizer resource.
       * It controls the automatic deletion of orphaned files - files that are not tracked by the
       * table metadata, and older than the configured age limit.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd4d1b29e1732e89f139b3c6067c0531a4400069251c517c99bde9ef7a208e8f")
      public
          fun orphanFileDeletionConfiguration(orphanFileDeletionConfiguration: OrphanFileDeletionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retentionConfiguration The configuration for a snapshot retention optimizer for
       * Apache Iceberg tables.
       */
      public fun retentionConfiguration(retentionConfiguration: IResolvable)

      /**
       * @param retentionConfiguration The configuration for a snapshot retention optimizer for
       * Apache Iceberg tables.
       */
      public fun retentionConfiguration(retentionConfiguration: RetentionConfigurationProperty)

      /**
       * @param retentionConfiguration The configuration for a snapshot retention optimizer for
       * Apache Iceberg tables.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fffd4129371c0022f8cf3e138562aa29297a7a737b67dd653d65f2b0ecc4d717")
      public
          fun retentionConfiguration(retentionConfiguration: RetentionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param roleArn A role passed by the caller which gives the service permission to update the
       * resources associated with the optimizer on the caller's behalf. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param vpcConfiguration An object that describes the VPC configuration for a table
       * optimizer.
       * This configuration is necessary to perform optimization on tables that are in a customer
       * VPC.
       */
      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      /**
       * @param vpcConfiguration An object that describes the VPC configuration for a table
       * optimizer.
       * This configuration is necessary to perform optimization on tables that are in a customer
       * VPC.
       */
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      /**
       * @param vpcConfiguration An object that describes the VPC configuration for a table
       * optimizer.
       * This configuration is necessary to perform optimization on tables that are in a customer
       * VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f425099181134fa6186723ac22be54bae7901e9ae2685650f01e5c1a89b769e4")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty.builder()

      /**
       * @param enabled Whether the table optimization is enabled. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Whether the table optimization is enabled. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param orphanFileDeletionConfiguration `OrphanFileDeletionConfiguration` is a property that
       * can be included within the TableOptimizer resource.
       * It controls the automatic deletion of orphaned files - files that are not tracked by the
       * table metadata, and older than the configured age limit.
       */
      override fun orphanFileDeletionConfiguration(orphanFileDeletionConfiguration: IResolvable) {
        cdkBuilder.orphanFileDeletionConfiguration(orphanFileDeletionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param orphanFileDeletionConfiguration `OrphanFileDeletionConfiguration` is a property that
       * can be included within the TableOptimizer resource.
       * It controls the automatic deletion of orphaned files - files that are not tracked by the
       * table metadata, and older than the configured age limit.
       */
      override
          fun orphanFileDeletionConfiguration(orphanFileDeletionConfiguration: OrphanFileDeletionConfigurationProperty) {
        cdkBuilder.orphanFileDeletionConfiguration(orphanFileDeletionConfiguration.let(OrphanFileDeletionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param orphanFileDeletionConfiguration `OrphanFileDeletionConfiguration` is a property that
       * can be included within the TableOptimizer resource.
       * It controls the automatic deletion of orphaned files - files that are not tracked by the
       * table metadata, and older than the configured age limit.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd4d1b29e1732e89f139b3c6067c0531a4400069251c517c99bde9ef7a208e8f")
      override
          fun orphanFileDeletionConfiguration(orphanFileDeletionConfiguration: OrphanFileDeletionConfigurationProperty.Builder.() -> Unit):
          Unit =
          orphanFileDeletionConfiguration(OrphanFileDeletionConfigurationProperty(orphanFileDeletionConfiguration))

      /**
       * @param retentionConfiguration The configuration for a snapshot retention optimizer for
       * Apache Iceberg tables.
       */
      override fun retentionConfiguration(retentionConfiguration: IResolvable) {
        cdkBuilder.retentionConfiguration(retentionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param retentionConfiguration The configuration for a snapshot retention optimizer for
       * Apache Iceberg tables.
       */
      override fun retentionConfiguration(retentionConfiguration: RetentionConfigurationProperty) {
        cdkBuilder.retentionConfiguration(retentionConfiguration.let(RetentionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param retentionConfiguration The configuration for a snapshot retention optimizer for
       * Apache Iceberg tables.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fffd4129371c0022f8cf3e138562aa29297a7a737b67dd653d65f2b0ecc4d717")
      override
          fun retentionConfiguration(retentionConfiguration: RetentionConfigurationProperty.Builder.() -> Unit):
          Unit = retentionConfiguration(RetentionConfigurationProperty(retentionConfiguration))

      /**
       * @param roleArn A role passed by the caller which gives the service permission to update the
       * resources associated with the optimizer on the caller's behalf. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param vpcConfiguration An object that describes the VPC configuration for a table
       * optimizer.
       * This configuration is necessary to perform optimization on tables that are in a customer
       * VPC.
       */
      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcConfiguration An object that describes the VPC configuration for a table
       * optimizer.
       * This configuration is necessary to perform optimization on tables that are in a customer
       * VPC.
       */
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param vpcConfiguration An object that describes the VPC configuration for a table
       * optimizer.
       * This configuration is necessary to perform optimization on tables that are in a customer
       * VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f425099181134fa6186723ac22be54bae7901e9ae2685650f01e5c1a89b769e4")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty,
    ) : CdkObject(cdkObject),
        TableOptimizerConfigurationProperty {
      /**
       * Whether the table optimization is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * `OrphanFileDeletionConfiguration` is a property that can be included within the
       * TableOptimizer resource.
       *
       * It controls the automatic deletion of orphaned files - files that are not tracked by the
       * table metadata, and older than the configured age limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-orphanfiledeletionconfiguration)
       */
      override fun orphanFileDeletionConfiguration(): Any? =
          unwrap(this).getOrphanFileDeletionConfiguration()

      /**
       * The configuration for a snapshot retention optimizer for Apache Iceberg tables.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-retentionconfiguration)
       */
      override fun retentionConfiguration(): Any? = unwrap(this).getRetentionConfiguration()

      /**
       * A role passed by the caller which gives the service permission to update the resources
       * associated with the optimizer on the caller's behalf.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * An object that describes the VPC configuration for a table optimizer.
       *
       * This configuration is necessary to perform optimization on tables that are in a customer
       * VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-vpcconfiguration)
       */
      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TableOptimizerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty):
          TableOptimizerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TableOptimizerConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableOptimizerConfigurationProperty):
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty
    }
  }

  /**
   * An object that describes the VPC configuration for a table optimizer.
   *
   * This configuration is necessary to perform optimization on tables that are in a customer VPC.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
   * .glueConnectionName("glueConnectionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-vpcconfiguration.html)
   */
  public interface VpcConfigurationProperty {
    /**
     * The name of the AWS Glue connection used for the VPC for the table optimizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-vpcconfiguration.html#cfn-glue-tableoptimizer-vpcconfiguration-glueconnectionname)
     */
    public fun glueConnectionName(): String? = unwrap(this).getGlueConnectionName()

    /**
     * A builder for [VpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param glueConnectionName The name of the AWS Glue connection used for the VPC for the
       * table optimizer.
       */
      public fun glueConnectionName(glueConnectionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTableOptimizer.VpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTableOptimizer.VpcConfigurationProperty.builder()

      /**
       * @param glueConnectionName The name of the AWS Glue connection used for the VPC for the
       * table optimizer.
       */
      override fun glueConnectionName(glueConnectionName: String) {
        cdkBuilder.glueConnectionName(glueConnectionName)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnTableOptimizer.VpcConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.VpcConfigurationProperty,
    ) : CdkObject(cdkObject),
        VpcConfigurationProperty {
      /**
       * The name of the AWS Glue connection used for the VPC for the table optimizer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-vpcconfiguration.html#cfn-glue-tableoptimizer-vpcconfiguration-glueconnectionname)
       */
      override fun glueConnectionName(): String? = unwrap(this).getGlueConnectionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.VpcConfigurationProperty):
          VpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.glue.CfnTableOptimizer.VpcConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTableOptimizer.VpcConfigurationProperty
    }
  }
}
