@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3tables

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3tables.*;
 * CfnTableProps cfnTableProps = CfnTableProps.builder()
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
public interface CfnTableProps {
  /**
   * Settings governing the Compaction maintenance action.
   *
   * Contains details about the compaction settings for an Iceberg table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-compaction)
   */
  public fun compaction(): Any? = unwrap(this).getCompaction()

  /**
   * Contains details about the metadata for an Iceberg table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-icebergmetadata)
   */
  public fun icebergMetadata(): Any? = unwrap(this).getIcebergMetadata()

  /**
   * The name of the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-namespace)
   */
  public fun namespace(): String

  /**
   * Format of the table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-opentableformat)
   */
  public fun openTableFormat(): String

  /**
   * Contains details about the snapshot management settings for an Iceberg table.
   *
   * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-snapshotmanagement)
   */
  public fun snapshotManagement(): Any? = unwrap(this).getSnapshotManagement()

  /**
   * The Amazon Resource Name (ARN) of the specified table bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-tablebucketarn)
   */
  public fun tableBucketArn(): String

  /**
   * The name for the table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-tablename)
   */
  public fun tableName(): String

  /**
   * Indicates that you don't want to specify a schema for the table.
   *
   * This property is mutually exclusive to 'IcebergMetadata', and its only possible value is 'Yes'.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-withoutmetadata)
   */
  public fun withoutMetadata(): String? = unwrap(this).getWithoutMetadata()

  /**
   * A builder for [CfnTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param compaction Settings governing the Compaction maintenance action.
     * Contains details about the compaction settings for an Iceberg table.
     */
    public fun compaction(compaction: IResolvable)

    /**
     * @param compaction Settings governing the Compaction maintenance action.
     * Contains details about the compaction settings for an Iceberg table.
     */
    public fun compaction(compaction: CfnTable.CompactionProperty)

    /**
     * @param compaction Settings governing the Compaction maintenance action.
     * Contains details about the compaction settings for an Iceberg table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a50d59745b21426741e9265c417e0faddcdff95fd5baeb539e740263e2749216")
    public fun compaction(compaction: CfnTable.CompactionProperty.Builder.() -> Unit)

    /**
     * @param icebergMetadata Contains details about the metadata for an Iceberg table.
     */
    public fun icebergMetadata(icebergMetadata: IResolvable)

    /**
     * @param icebergMetadata Contains details about the metadata for an Iceberg table.
     */
    public fun icebergMetadata(icebergMetadata: CfnTable.IcebergMetadataProperty)

    /**
     * @param icebergMetadata Contains details about the metadata for an Iceberg table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e58399080b5b5bad3d7f59705835e2ba726c289b20e3c26ddda6148cee0726c8")
    public fun icebergMetadata(icebergMetadata: CfnTable.IcebergMetadataProperty.Builder.() -> Unit)

    /**
     * @param namespace The name of the namespace. 
     */
    public fun namespace(namespace: String)

    /**
     * @param openTableFormat Format of the table. 
     */
    public fun openTableFormat(openTableFormat: String)

    /**
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table.
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     */
    public fun snapshotManagement(snapshotManagement: IResolvable)

    /**
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table.
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     */
    public fun snapshotManagement(snapshotManagement: CfnTable.SnapshotManagementProperty)

    /**
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table.
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4726a08e55c3f0716a88ff57b4be93403237a756ecc75b8a4e467e12cde223d8")
    public
        fun snapshotManagement(snapshotManagement: CfnTable.SnapshotManagementProperty.Builder.() -> Unit)

    /**
     * @param tableBucketArn The Amazon Resource Name (ARN) of the specified table bucket. 
     */
    public fun tableBucketArn(tableBucketArn: String)

    /**
     * @param tableName The name for the table. 
     */
    public fun tableName(tableName: String)

    /**
     * @param withoutMetadata Indicates that you don't want to specify a schema for the table.
     * This property is mutually exclusive to 'IcebergMetadata', and its only possible value is
     * 'Yes'.
     */
    public fun withoutMetadata(withoutMetadata: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3tables.CfnTableProps.Builder =
        software.amazon.awscdk.services.s3tables.CfnTableProps.builder()

    /**
     * @param compaction Settings governing the Compaction maintenance action.
     * Contains details about the compaction settings for an Iceberg table.
     */
    override fun compaction(compaction: IResolvable) {
      cdkBuilder.compaction(compaction.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param compaction Settings governing the Compaction maintenance action.
     * Contains details about the compaction settings for an Iceberg table.
     */
    override fun compaction(compaction: CfnTable.CompactionProperty) {
      cdkBuilder.compaction(compaction.let(CfnTable.CompactionProperty.Companion::unwrap))
    }

    /**
     * @param compaction Settings governing the Compaction maintenance action.
     * Contains details about the compaction settings for an Iceberg table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a50d59745b21426741e9265c417e0faddcdff95fd5baeb539e740263e2749216")
    override fun compaction(compaction: CfnTable.CompactionProperty.Builder.() -> Unit): Unit =
        compaction(CfnTable.CompactionProperty(compaction))

    /**
     * @param icebergMetadata Contains details about the metadata for an Iceberg table.
     */
    override fun icebergMetadata(icebergMetadata: IResolvable) {
      cdkBuilder.icebergMetadata(icebergMetadata.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param icebergMetadata Contains details about the metadata for an Iceberg table.
     */
    override fun icebergMetadata(icebergMetadata: CfnTable.IcebergMetadataProperty) {
      cdkBuilder.icebergMetadata(icebergMetadata.let(CfnTable.IcebergMetadataProperty.Companion::unwrap))
    }

    /**
     * @param icebergMetadata Contains details about the metadata for an Iceberg table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e58399080b5b5bad3d7f59705835e2ba726c289b20e3c26ddda6148cee0726c8")
    override
        fun icebergMetadata(icebergMetadata: CfnTable.IcebergMetadataProperty.Builder.() -> Unit):
        Unit = icebergMetadata(CfnTable.IcebergMetadataProperty(icebergMetadata))

    /**
     * @param namespace The name of the namespace. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param openTableFormat Format of the table. 
     */
    override fun openTableFormat(openTableFormat: String) {
      cdkBuilder.openTableFormat(openTableFormat)
    }

    /**
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table.
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     */
    override fun snapshotManagement(snapshotManagement: IResolvable) {
      cdkBuilder.snapshotManagement(snapshotManagement.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table.
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     */
    override fun snapshotManagement(snapshotManagement: CfnTable.SnapshotManagementProperty) {
      cdkBuilder.snapshotManagement(snapshotManagement.let(CfnTable.SnapshotManagementProperty.Companion::unwrap))
    }

    /**
     * @param snapshotManagement Contains details about the snapshot management settings for an
     * Iceberg table.
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4726a08e55c3f0716a88ff57b4be93403237a756ecc75b8a4e467e12cde223d8")
    override
        fun snapshotManagement(snapshotManagement: CfnTable.SnapshotManagementProperty.Builder.() -> Unit):
        Unit = snapshotManagement(CfnTable.SnapshotManagementProperty(snapshotManagement))

    /**
     * @param tableBucketArn The Amazon Resource Name (ARN) of the specified table bucket. 
     */
    override fun tableBucketArn(tableBucketArn: String) {
      cdkBuilder.tableBucketArn(tableBucketArn)
    }

    /**
     * @param tableName The name for the table. 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * @param withoutMetadata Indicates that you don't want to specify a schema for the table.
     * This property is mutually exclusive to 'IcebergMetadata', and its only possible value is
     * 'Yes'.
     */
    override fun withoutMetadata(withoutMetadata: String) {
      cdkBuilder.withoutMetadata(withoutMetadata)
    }

    public fun build(): software.amazon.awscdk.services.s3tables.CfnTableProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3tables.CfnTableProps,
  ) : CdkObject(cdkObject),
      CfnTableProps {
    /**
     * Settings governing the Compaction maintenance action.
     *
     * Contains details about the compaction settings for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-compaction)
     */
    override fun compaction(): Any? = unwrap(this).getCompaction()

    /**
     * Contains details about the metadata for an Iceberg table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-icebergmetadata)
     */
    override fun icebergMetadata(): Any? = unwrap(this).getIcebergMetadata()

    /**
     * The name of the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-namespace)
     */
    override fun namespace(): String = unwrap(this).getNamespace()

    /**
     * Format of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-opentableformat)
     */
    override fun openTableFormat(): String = unwrap(this).getOpenTableFormat()

    /**
     * Contains details about the snapshot management settings for an Iceberg table.
     *
     * A snapshot is expired when it exceeds MinSnapshotsToKeep and MaxSnapshotAgeHours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-snapshotmanagement)
     */
    override fun snapshotManagement(): Any? = unwrap(this).getSnapshotManagement()

    /**
     * The Amazon Resource Name (ARN) of the specified table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-tablebucketarn)
     */
    override fun tableBucketArn(): String = unwrap(this).getTableBucketArn()

    /**
     * The name for the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-tablename)
     */
    override fun tableName(): String = unwrap(this).getTableName()

    /**
     * Indicates that you don't want to specify a schema for the table.
     *
     * This property is mutually exclusive to 'IcebergMetadata', and its only possible value is
     * 'Yes'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-table.html#cfn-s3tables-table-withoutmetadata)
     */
    override fun withoutMetadata(): String? = unwrap(this).getWithoutMetadata()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTableProps):
        CfnTableProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTableProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableProps):
        software.amazon.awscdk.services.s3tables.CfnTableProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3tables.CfnTableProps
  }
}
