@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3tables

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
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new table associated with the given namespace in a table bucket.
 *
 * For more information, see [Creating an Amazon S3
 * table](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-tables-create.html) in the *Amazon
 * Simple Storage Service User Guide* .
 *
 * * **Permissions** - - You must have the `s3tables:CreateTable` permission to use this operation.
 * * If you use this operation with the optional `metadata` request parameter you must have the
 * `s3tables:PutTableData` permission.
 * * If you use this operation with the optional `encryptionConfiguration` request parameter you
 * must have the `s3tables:PutTableEncryption` permission.
 *
 *
 * Additionally, If you choose SSE-KMS encryption you must grant the S3 Tables maintenance principal
 * access to your KMS key. For more information, see [Permissions requirements for S3 Tables SSE-KMS
 * encryption](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-tables-kms-permissions.html) .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3tables.*;
 * CfnTable cfnTable = CfnTable.Builder.create(this, "MyCfnTable")
 * .namespace("namespace")
 * .openTableFormat("openTableFormat")
 * .tableBucketArn("tableBucketArn")
 * .tableName("tableName")
 * // the properties below are optional
 * .compaction(CompactionProperty.builder()
 * .status("status")
 * .targetFileSizeMb(123)
 * .build())
 * .icebergMetadata(IcebergMetadataProperty.builder()
 * .icebergSchema(IcebergSchemaProperty.builder()
 * .schemaFieldList(List.of(SchemaFieldProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .required(false)
 * .build()))
 * .build())
 * .build())
 * .snapshotManagement(SnapshotManagementProperty.builder()
 * .maxSnapshotAgeHours(123)
 * .minSnapshotsToKeep(123)
 * .status("status")
 * .build())
 * .withoutMetadata("withoutMetadata")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html)
 */
public open class CfnTable(
  cdkObject: software.amazon.awscdk.services.s3tables.CfnTable,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableProps,
  ) :
      this(software.amazon.awscdk.services.s3tables.CfnTable(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTableProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTableProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the table.
   */
  public open fun attrTableArn(): String = unwrap(this).getAttrTableArn()

  /**
   * The version token of the table.
   */
  public open fun attrVersionToken(): String = unwrap(this).getAttrVersionToken()

  /**
   * The warehouse location of the table.
   */
  public open fun attrWarehouseLocation(): String = unwrap(this).getAttrWarehouseLocation()

  /**
   * Settings governing the Compaction maintenance action.
   */
  public open fun compaction(): Any? = unwrap(this).getCompaction()

  /**
   * Settings governing the Compaction maintenance action.
   */
  public open fun compaction(`value`: IResolvable) {
    unwrap(this).setCompaction(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Settings governing the Compaction maintenance action.
   */
  public open fun compaction(`value`: CompactionProperty) {
    unwrap(this).setCompaction(`value`.let(CompactionProperty.Companion::unwrap))
  }

  /**
   * Settings governing the Compaction maintenance action.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("511cae211a7d345df57ad1adb26ffe5fca9b17d3b26a97e2b7843015c333f40a")
  public open fun compaction(`value`: CompactionProperty.Builder.() -> Unit): Unit =
      compaction(CompactionProperty(`value`))

  /**
   * Contains details about the metadata for an Iceberg table.
   */
  public open fun icebergMetadata(): Any? = unwrap(this).getIcebergMetadata()

  /**
   * Contains details about the metadata for an Iceberg table.
   */
  public open fun icebergMetadata(`value`: IResolvable) {
    unwrap(this).setIcebergMetadata(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about the metadata for an Iceberg table.
   */
  public open fun icebergMetadata(`value`: IcebergMetadataProperty) {
    unwrap(this).setIcebergMetadata(`value`.let(IcebergMetadataProperty.Companion::unwrap))
  }

  /**
   * Contains details about the metadata for an Iceberg table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5f6f70ef1210bdc4d1b391d6189431b8bf3f289888d0508c858e0bb12d80f32")
  public open fun icebergMetadata(`value`: IcebergMetadataProperty.Builder.() -> Unit): Unit =
      icebergMetadata(IcebergMetadataProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the namespace.
   */
  public open fun namespace(): String = unwrap(this).getNamespace()

  /**
   * The name of the namespace.
   */
  public open fun namespace(`value`: String) {
    unwrap(this).setNamespace(`value`)
  }

  /**
   * Format of the table.
   */
  public open fun openTableFormat(): String = unwrap(this).getOpenTableFormat()

  /**
   * Format of the table.
   */
  public open fun openTableFormat(`value`: String) {
    unwrap(this).setOpenTableFormat(`value`)
  }

  /**
   * Contains details about the snapshot management settings for an Iceberg table.
   */
  public open fun snapshotManagement(): Any? = unwrap(this).getSnapshotManagement()

  /**
   * Contains details about the snapshot management settings for an Iceberg table.
   */
  public open fun snapshotManagement(`value`: IResolvable) {
    unwrap(this).setSnapshotManagement(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about the snapshot management settings for an Iceberg table.
   */
  public open fun snapshotManagement(`value`: SnapshotManagementProperty) {
    unwrap(this).setSnapshotManagement(`value`.let(SnapshotManagementProperty.Companion::unwrap))
  }

  /**
   * Contains details about the snapshot management settings for an Iceberg table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28833f2d4761d13f0203b9ba98904337b36fedb859592a15a922d6edfb1809e7")
  public open fun snapshotManagement(`value`: SnapshotManagementProperty.Builder.() -> Unit): Unit =
      snapshotManagement(SnapshotManagementProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the specified table bucket.
   */
  public open fun tableBucketArn(): String = unwrap(this).getTableBucketArn()

  /**
   * The Amazon Resource Name (ARN) of the specified table bucket.
   */
  public open fun tableBucketArn(`value`: String) {
    unwrap(this).setTableBucketArn(`value`)
  }

  /**
   * The name for the table.
   */
  public open fun tableName(): String = unwrap(this).getTableName()

  /**
   * The name for the table.
   */
  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  /**
   * Indicates that you don't want to specify a schema for the table.
   */
  public open fun withoutMetadata(): String? = unwrap(this).getWithoutMetadata()

  /**
   * Indicates that you don't want to specify a schema for the table.
   */
  public open fun withoutMetadata(`value`: String) {
    unwrap(this).setWithoutMetadata(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3tables.CfnTable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Settings governing the Compaction maintenance action.
     *
     * Contains details about the compaction settings for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-compaction)
     * @param compaction Settings governing the Compaction maintenance action. 
     */
    public fun compaction(compaction: IResolvable)

    /**
     * Settings governing the Compaction maintenance action.
     *
     * Contains details about the compaction settings for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-compaction)
     * @param compaction Settings governing the Compaction maintenance action. 
     */
    public fun compaction(compaction: CompactionProperty)

    /**
     * Settings governing the Compaction maintenance action.
     *
     * Contains details about the compaction settings for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-compaction)
     * @param compaction Settings governing the Compaction maintenance action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("660f4a44654d6ae45b52f6632e8e926ec7a5d5e5cd1531a8bad41005843b64cd")
    public fun compaction(compaction: CompactionProperty.Builder.() -> Unit)

    /**
     * Contains details about the metadata for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-icebergmetadata)
     * @param icebergMetadata Contains details about the metadata for an Iceberg table. 
     */
    public fun icebergMetadata(icebergMetadata: IResolvable)

    /**
     * Contains details about the metadata for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-icebergmetadata)
     * @param icebergMetadata Contains details about the metadata for an Iceberg table. 
     */
    public fun icebergMetadata(icebergMetadata: IcebergMetadataProperty)

    /**
     * Contains details about the metadata for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-icebergmetadata)
     * @param icebergMetadata Contains details about the metadata for an Iceberg table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("692cd4d5dd567e201ea8d7c24743d8546a248dac18fc028138f495bca15867db")
    public fun icebergMetadata(icebergMetadata: IcebergMetadataProperty.Builder.() -> Unit)

    /**
     * The name of the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-namespace)
     * @param namespace The name of the namespace. 
     */
    public fun namespace(namespace: String)

    /**
     * Format of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-opentableformat)
     * @param openTableFormat Format of the table. 
     */
    public fun openTableFormat(openTableFormat: String)

    /**
     * Contains details about the snapshot management settings for an Iceberg table.
     *
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-snapshotmanagement)
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table. 
     */
    public fun snapshotManagement(snapshotManagement: IResolvable)

    /**
     * Contains details about the snapshot management settings for an Iceberg table.
     *
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-snapshotmanagement)
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table. 
     */
    public fun snapshotManagement(snapshotManagement: SnapshotManagementProperty)

    /**
     * Contains details about the snapshot management settings for an Iceberg table.
     *
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-snapshotmanagement)
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("450e330dae996b94b5bf2d0342fc467f68f3b339b9910b9fffdd249624bb828d")
    public fun snapshotManagement(snapshotManagement: SnapshotManagementProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the specified table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-tablebucketarn)
     * @param tableBucketArn The Amazon Resource Name (ARN) of the specified table bucket. 
     */
    public fun tableBucketArn(tableBucketArn: String)

    /**
     * The name for the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-tablename)
     * @param tableName The name for the table. 
     */
    public fun tableName(tableName: String)

    /**
     * Indicates that you don't want to specify a schema for the table.
     *
     * This property is mutually exclusive to 'IcebergMetadata', and its only possible value is
     * 'Yes'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-withoutmetadata)
     * @param withoutMetadata Indicates that you don't want to specify a schema for the table. 
     */
    public fun withoutMetadata(withoutMetadata: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3tables.CfnTable.Builder =
        software.amazon.awscdk.services.s3tables.CfnTable.Builder.create(scope, id)

    /**
     * Settings governing the Compaction maintenance action.
     *
     * Contains details about the compaction settings for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-compaction)
     * @param compaction Settings governing the Compaction maintenance action. 
     */
    override fun compaction(compaction: IResolvable) {
      cdkBuilder.compaction(compaction.let(IResolvable.Companion::unwrap))
    }

    /**
     * Settings governing the Compaction maintenance action.
     *
     * Contains details about the compaction settings for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-compaction)
     * @param compaction Settings governing the Compaction maintenance action. 
     */
    override fun compaction(compaction: CompactionProperty) {
      cdkBuilder.compaction(compaction.let(CompactionProperty.Companion::unwrap))
    }

    /**
     * Settings governing the Compaction maintenance action.
     *
     * Contains details about the compaction settings for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-compaction)
     * @param compaction Settings governing the Compaction maintenance action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("660f4a44654d6ae45b52f6632e8e926ec7a5d5e5cd1531a8bad41005843b64cd")
    override fun compaction(compaction: CompactionProperty.Builder.() -> Unit): Unit =
        compaction(CompactionProperty(compaction))

    /**
     * Contains details about the metadata for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-icebergmetadata)
     * @param icebergMetadata Contains details about the metadata for an Iceberg table. 
     */
    override fun icebergMetadata(icebergMetadata: IResolvable) {
      cdkBuilder.icebergMetadata(icebergMetadata.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about the metadata for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-icebergmetadata)
     * @param icebergMetadata Contains details about the metadata for an Iceberg table. 
     */
    override fun icebergMetadata(icebergMetadata: IcebergMetadataProperty) {
      cdkBuilder.icebergMetadata(icebergMetadata.let(IcebergMetadataProperty.Companion::unwrap))
    }

    /**
     * Contains details about the metadata for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-icebergmetadata)
     * @param icebergMetadata Contains details about the metadata for an Iceberg table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("692cd4d5dd567e201ea8d7c24743d8546a248dac18fc028138f495bca15867db")
    override fun icebergMetadata(icebergMetadata: IcebergMetadataProperty.Builder.() -> Unit): Unit
        = icebergMetadata(IcebergMetadataProperty(icebergMetadata))

    /**
     * The name of the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-namespace)
     * @param namespace The name of the namespace. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * Format of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-opentableformat)
     * @param openTableFormat Format of the table. 
     */
    override fun openTableFormat(openTableFormat: String) {
      cdkBuilder.openTableFormat(openTableFormat)
    }

    /**
     * Contains details about the snapshot management settings for an Iceberg table.
     *
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-snapshotmanagement)
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table. 
     */
    override fun snapshotManagement(snapshotManagement: IResolvable) {
      cdkBuilder.snapshotManagement(snapshotManagement.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about the snapshot management settings for an Iceberg table.
     *
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-snapshotmanagement)
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table. 
     */
    override fun snapshotManagement(snapshotManagement: SnapshotManagementProperty) {
      cdkBuilder.snapshotManagement(snapshotManagement.let(SnapshotManagementProperty.Companion::unwrap))
    }

    /**
     * Contains details about the snapshot management settings for an Iceberg table.
     *
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-snapshotmanagement)
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("450e330dae996b94b5bf2d0342fc467f68f3b339b9910b9fffdd249624bb828d")
    override
        fun snapshotManagement(snapshotManagement: SnapshotManagementProperty.Builder.() -> Unit):
        Unit = snapshotManagement(SnapshotManagementProperty(snapshotManagement))

    /**
     * The Amazon Resource Name (ARN) of the specified table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-tablebucketarn)
     * @param tableBucketArn The Amazon Resource Name (ARN) of the specified table bucket. 
     */
    override fun tableBucketArn(tableBucketArn: String) {
      cdkBuilder.tableBucketArn(tableBucketArn)
    }

    /**
     * The name for the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-tablename)
     * @param tableName The name for the table. 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * Indicates that you don't want to specify a schema for the table.
     *
     * This property is mutually exclusive to 'IcebergMetadata', and its only possible value is
     * 'Yes'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-withoutmetadata)
     * @param withoutMetadata Indicates that you don't want to specify a schema for the table. 
     */
    override fun withoutMetadata(withoutMetadata: String) {
      cdkBuilder.withoutMetadata(withoutMetadata)
    }

    public fun build(): software.amazon.awscdk.services.s3tables.CfnTable = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3tables.CfnTable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTable): CfnTable =
        CfnTable(cdkObject)

    internal fun unwrap(wrapped: CfnTable): software.amazon.awscdk.services.s3tables.CfnTable =
        wrapped.cdkObject as software.amazon.awscdk.services.s3tables.CfnTable
  }

  /**
   * Settings governing the Compaction maintenance action.
   *
   * Contains details about the compaction settings for an Iceberg table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3tables.*;
   * CompactionProperty compactionProperty = CompactionProperty.builder()
   * .status("status")
   * .targetFileSizeMb(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-compaction.html)
   */
  public interface CompactionProperty {
    /**
     * Indicates whether the Compaction maintenance action is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-compaction.html#cfn-s3tables-table-compaction-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The target file size for the table in MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-compaction.html#cfn-s3tables-table-compaction-targetfilesizemb)
     */
    public fun targetFileSizeMb(): Number? = unwrap(this).getTargetFileSizeMb()

    /**
     * A builder for [CompactionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status Indicates whether the Compaction maintenance action is enabled.
       */
      public fun status(status: String)

      /**
       * @param targetFileSizeMb The target file size for the table in MB.
       */
      public fun targetFileSizeMb(targetFileSizeMb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3tables.CfnTable.CompactionProperty.Builder =
          software.amazon.awscdk.services.s3tables.CfnTable.CompactionProperty.builder()

      /**
       * @param status Indicates whether the Compaction maintenance action is enabled.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param targetFileSizeMb The target file size for the table in MB.
       */
      override fun targetFileSizeMb(targetFileSizeMb: Number) {
        cdkBuilder.targetFileSizeMb(targetFileSizeMb)
      }

      public fun build(): software.amazon.awscdk.services.s3tables.CfnTable.CompactionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3tables.CfnTable.CompactionProperty,
    ) : CdkObject(cdkObject),
        CompactionProperty {
      /**
       * Indicates whether the Compaction maintenance action is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-compaction.html#cfn-s3tables-table-compaction-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The target file size for the table in MB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-compaction.html#cfn-s3tables-table-compaction-targetfilesizemb)
       */
      override fun targetFileSizeMb(): Number? = unwrap(this).getTargetFileSizeMb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CompactionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTable.CompactionProperty):
          CompactionProperty = CdkObjectWrappers.wrap(cdkObject) as? CompactionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CompactionProperty):
          software.amazon.awscdk.services.s3tables.CfnTable.CompactionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3tables.CfnTable.CompactionProperty
    }
  }

  /**
   * Contains details about the metadata for an Iceberg table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3tables.*;
   * IcebergMetadataProperty icebergMetadataProperty = IcebergMetadataProperty.builder()
   * .icebergSchema(IcebergSchemaProperty.builder()
   * .schemaFieldList(List.of(SchemaFieldProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .required(false)
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-icebergmetadata.html)
   */
  public interface IcebergMetadataProperty {
    /**
     * Contains details about the schema for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-icebergmetadata.html#cfn-s3tables-table-icebergmetadata-icebergschema)
     */
    public fun icebergSchema(): Any

    /**
     * A builder for [IcebergMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param icebergSchema Contains details about the schema for an Iceberg table. 
       */
      public fun icebergSchema(icebergSchema: IResolvable)

      /**
       * @param icebergSchema Contains details about the schema for an Iceberg table. 
       */
      public fun icebergSchema(icebergSchema: IcebergSchemaProperty)

      /**
       * @param icebergSchema Contains details about the schema for an Iceberg table. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5923d9ffbf9dc3e1801e45a062088b0ffe4e4ccd6a6c47d2020a8989c04e3b99")
      public fun icebergSchema(icebergSchema: IcebergSchemaProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3tables.CfnTable.IcebergMetadataProperty.Builder =
          software.amazon.awscdk.services.s3tables.CfnTable.IcebergMetadataProperty.builder()

      /**
       * @param icebergSchema Contains details about the schema for an Iceberg table. 
       */
      override fun icebergSchema(icebergSchema: IResolvable) {
        cdkBuilder.icebergSchema(icebergSchema.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param icebergSchema Contains details about the schema for an Iceberg table. 
       */
      override fun icebergSchema(icebergSchema: IcebergSchemaProperty) {
        cdkBuilder.icebergSchema(icebergSchema.let(IcebergSchemaProperty.Companion::unwrap))
      }

      /**
       * @param icebergSchema Contains details about the schema for an Iceberg table. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5923d9ffbf9dc3e1801e45a062088b0ffe4e4ccd6a6c47d2020a8989c04e3b99")
      override fun icebergSchema(icebergSchema: IcebergSchemaProperty.Builder.() -> Unit): Unit =
          icebergSchema(IcebergSchemaProperty(icebergSchema))

      public fun build(): software.amazon.awscdk.services.s3tables.CfnTable.IcebergMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3tables.CfnTable.IcebergMetadataProperty,
    ) : CdkObject(cdkObject),
        IcebergMetadataProperty {
      /**
       * Contains details about the schema for an Iceberg table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-icebergmetadata.html#cfn-s3tables-table-icebergmetadata-icebergschema)
       */
      override fun icebergSchema(): Any = unwrap(this).getIcebergSchema()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IcebergMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTable.IcebergMetadataProperty):
          IcebergMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as? IcebergMetadataProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IcebergMetadataProperty):
          software.amazon.awscdk.services.s3tables.CfnTable.IcebergMetadataProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3tables.CfnTable.IcebergMetadataProperty
    }
  }

  /**
   * Contains details about the schema for an Iceberg table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3tables.*;
   * IcebergSchemaProperty icebergSchemaProperty = IcebergSchemaProperty.builder()
   * .schemaFieldList(List.of(SchemaFieldProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .required(false)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-icebergschema.html)
   */
  public interface IcebergSchemaProperty {
    /**
     * Contains details about the schema for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-icebergschema.html#cfn-s3tables-table-icebergschema-schemafieldlist)
     */
    public fun schemaFieldList(): Any

    /**
     * A builder for [IcebergSchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param schemaFieldList Contains details about the schema for an Iceberg table. 
       */
      public fun schemaFieldList(schemaFieldList: IResolvable)

      /**
       * @param schemaFieldList Contains details about the schema for an Iceberg table. 
       */
      public fun schemaFieldList(schemaFieldList: List<Any>)

      /**
       * @param schemaFieldList Contains details about the schema for an Iceberg table. 
       */
      public fun schemaFieldList(vararg schemaFieldList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3tables.CfnTable.IcebergSchemaProperty.Builder =
          software.amazon.awscdk.services.s3tables.CfnTable.IcebergSchemaProperty.builder()

      /**
       * @param schemaFieldList Contains details about the schema for an Iceberg table. 
       */
      override fun schemaFieldList(schemaFieldList: IResolvable) {
        cdkBuilder.schemaFieldList(schemaFieldList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param schemaFieldList Contains details about the schema for an Iceberg table. 
       */
      override fun schemaFieldList(schemaFieldList: List<Any>) {
        cdkBuilder.schemaFieldList(schemaFieldList.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param schemaFieldList Contains details about the schema for an Iceberg table. 
       */
      override fun schemaFieldList(vararg schemaFieldList: Any): Unit =
          schemaFieldList(schemaFieldList.toList())

      public fun build(): software.amazon.awscdk.services.s3tables.CfnTable.IcebergSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3tables.CfnTable.IcebergSchemaProperty,
    ) : CdkObject(cdkObject),
        IcebergSchemaProperty {
      /**
       * Contains details about the schema for an Iceberg table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-icebergschema.html#cfn-s3tables-table-icebergschema-schemafieldlist)
       */
      override fun schemaFieldList(): Any = unwrap(this).getSchemaFieldList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IcebergSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTable.IcebergSchemaProperty):
          IcebergSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? IcebergSchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IcebergSchemaProperty):
          software.amazon.awscdk.services.s3tables.CfnTable.IcebergSchemaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3tables.CfnTable.IcebergSchemaProperty
    }
  }

  /**
   * Contains details about a schema field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3tables.*;
   * SchemaFieldProperty schemaFieldProperty = SchemaFieldProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .required(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-schemafield.html)
   */
  public interface SchemaFieldProperty {
    /**
     * The name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-schemafield.html#cfn-s3tables-table-schemafield-name)
     */
    public fun name(): String

    /**
     * A Boolean value that specifies whether values are required for each row in this field.
     *
     * By default, this is `false` and null values are allowed in the field. If this is `true` the
     * field does not allow null values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-schemafield.html#cfn-s3tables-table-schemafield-required)
     */
    public fun required(): Any? = unwrap(this).getRequired()

    /**
     * The field type.
     *
     * S3 Tables supports all Apache Iceberg primitive types. For more information, see the [Apache
     * Iceberg
     * documentation](https://docs.aws.amazon.com/https://iceberg.apache.org/spec/#primitive-types) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-schemafield.html#cfn-s3tables-table-schemafield-type)
     */
    public fun type(): String

    /**
     * A builder for [SchemaFieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the field. 
       */
      public fun name(name: String)

      /**
       * @param required A Boolean value that specifies whether values are required for each row in
       * this field.
       * By default, this is `false` and null values are allowed in the field. If this is `true` the
       * field does not allow null values.
       */
      public fun required(required: Boolean)

      /**
       * @param required A Boolean value that specifies whether values are required for each row in
       * this field.
       * By default, this is `false` and null values are allowed in the field. If this is `true` the
       * field does not allow null values.
       */
      public fun required(required: IResolvable)

      /**
       * @param type The field type. 
       * S3 Tables supports all Apache Iceberg primitive types. For more information, see the
       * [Apache Iceberg
       * documentation](https://docs.aws.amazon.com/https://iceberg.apache.org/spec/#primitive-types) .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3tables.CfnTable.SchemaFieldProperty.Builder =
          software.amazon.awscdk.services.s3tables.CfnTable.SchemaFieldProperty.builder()

      /**
       * @param name The name of the field. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param required A Boolean value that specifies whether values are required for each row in
       * this field.
       * By default, this is `false` and null values are allowed in the field. If this is `true` the
       * field does not allow null values.
       */
      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      /**
       * @param required A Boolean value that specifies whether values are required for each row in
       * this field.
       * By default, this is `false` and null values are allowed in the field. If this is `true` the
       * field does not allow null values.
       */
      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param type The field type. 
       * S3 Tables supports all Apache Iceberg primitive types. For more information, see the
       * [Apache Iceberg
       * documentation](https://docs.aws.amazon.com/https://iceberg.apache.org/spec/#primitive-types) .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.s3tables.CfnTable.SchemaFieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3tables.CfnTable.SchemaFieldProperty,
    ) : CdkObject(cdkObject),
        SchemaFieldProperty {
      /**
       * The name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-schemafield.html#cfn-s3tables-table-schemafield-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * A Boolean value that specifies whether values are required for each row in this field.
       *
       * By default, this is `false` and null values are allowed in the field. If this is `true` the
       * field does not allow null values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-schemafield.html#cfn-s3tables-table-schemafield-required)
       */
      override fun required(): Any? = unwrap(this).getRequired()

      /**
       * The field type.
       *
       * S3 Tables supports all Apache Iceberg primitive types. For more information, see the
       * [Apache Iceberg
       * documentation](https://docs.aws.amazon.com/https://iceberg.apache.org/spec/#primitive-types) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-schemafield.html#cfn-s3tables-table-schemafield-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTable.SchemaFieldProperty):
          SchemaFieldProperty = CdkObjectWrappers.wrap(cdkObject) as? SchemaFieldProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaFieldProperty):
          software.amazon.awscdk.services.s3tables.CfnTable.SchemaFieldProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3tables.CfnTable.SchemaFieldProperty
    }
  }

  /**
   * Contains details about the snapshot management settings for an Iceberg table.
   *
   * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3tables.*;
   * SnapshotManagementProperty snapshotManagementProperty = SnapshotManagementProperty.builder()
   * .maxSnapshotAgeHours(123)
   * .minSnapshotsToKeep(123)
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-snapshotmanagement.html)
   */
  public interface SnapshotManagementProperty {
    /**
     * The maximum age of a snapshot before it can be expired.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-snapshotmanagement.html#cfn-s3tables-table-snapshotmanagement-maxsnapshotagehours)
     */
    public fun maxSnapshotAgeHours(): Number? = unwrap(this).getMaxSnapshotAgeHours()

    /**
     * The minimum number of snapshots to keep.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-snapshotmanagement.html#cfn-s3tables-table-snapshotmanagement-minsnapshotstokeep)
     */
    public fun minSnapshotsToKeep(): Number? = unwrap(this).getMinSnapshotsToKeep()

    /**
     * Indicates whether the SnapshotManagement maintenance action is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-snapshotmanagement.html#cfn-s3tables-table-snapshotmanagement-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [SnapshotManagementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxSnapshotAgeHours The maximum age of a snapshot before it can be expired.
       */
      public fun maxSnapshotAgeHours(maxSnapshotAgeHours: Number)

      /**
       * @param minSnapshotsToKeep The minimum number of snapshots to keep.
       */
      public fun minSnapshotsToKeep(minSnapshotsToKeep: Number)

      /**
       * @param status Indicates whether the SnapshotManagement maintenance action is enabled.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3tables.CfnTable.SnapshotManagementProperty.Builder =
          software.amazon.awscdk.services.s3tables.CfnTable.SnapshotManagementProperty.builder()

      /**
       * @param maxSnapshotAgeHours The maximum age of a snapshot before it can be expired.
       */
      override fun maxSnapshotAgeHours(maxSnapshotAgeHours: Number) {
        cdkBuilder.maxSnapshotAgeHours(maxSnapshotAgeHours)
      }

      /**
       * @param minSnapshotsToKeep The minimum number of snapshots to keep.
       */
      override fun minSnapshotsToKeep(minSnapshotsToKeep: Number) {
        cdkBuilder.minSnapshotsToKeep(minSnapshotsToKeep)
      }

      /**
       * @param status Indicates whether the SnapshotManagement maintenance action is enabled.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.s3tables.CfnTable.SnapshotManagementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3tables.CfnTable.SnapshotManagementProperty,
    ) : CdkObject(cdkObject),
        SnapshotManagementProperty {
      /**
       * The maximum age of a snapshot before it can be expired.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-snapshotmanagement.html#cfn-s3tables-table-snapshotmanagement-maxsnapshotagehours)
       */
      override fun maxSnapshotAgeHours(): Number? = unwrap(this).getMaxSnapshotAgeHours()

      /**
       * The minimum number of snapshots to keep.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-snapshotmanagement.html#cfn-s3tables-table-snapshotmanagement-minsnapshotstokeep)
       */
      override fun minSnapshotsToKeep(): Number? = unwrap(this).getMinSnapshotsToKeep()

      /**
       * Indicates whether the SnapshotManagement maintenance action is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-table-snapshotmanagement.html#cfn-s3tables-table-snapshotmanagement-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnapshotManagementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTable.SnapshotManagementProperty):
          SnapshotManagementProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SnapshotManagementProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapshotManagementProperty):
          software.amazon.awscdk.services.s3tables.CfnTable.SnapshotManagementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3tables.CfnTable.SnapshotManagementProperty
    }
  }
}
