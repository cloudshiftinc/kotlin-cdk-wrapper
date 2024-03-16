@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The configuration for the Amazon FSx for Lustre file system.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Vpc vpc;
 * Bucket bucket;
 * Map&lt;String, Object&gt; lustreConfiguration = Map.of(
 * "deploymentType", LustreDeploymentType.SCRATCH_2,
 * "exportPath", bucket.s3UrlForObject(),
 * "importPath", bucket.s3UrlForObject(),
 * "autoImportPolicy", LustreAutoImportPolicy.NEW_CHANGED_DELETED);
 * LustreFileSystem fs = LustreFileSystem.Builder.create(this, "FsxLustreFileSystem")
 * .vpc(vpc)
 * .vpcSubnet(vpc.getPrivateSubnets()[0])
 * .storageCapacityGiB(1200)
 * .lustreConfiguration(lustreConfiguration)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html)
 */
public interface LustreConfiguration {
  /**
   * Available with `Scratch` and `Persistent_1` deployment types.
   *
   * When you create your file system, your existing S3 objects appear as file and directory
   * listings. Use this property to choose how Amazon FSx keeps your file and directory listings up to
   * date as you add or modify objects in your linked S3 bucket. `AutoImportPolicy` can have the
   * following values:
   *
   * For more information, see [Automatically import updates from your S3
   * bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) .
   *
   *
   * This parameter is not supported for Lustre file systems using the `Persistent_2` deployment
   * type.
   *
   *
   * Default: - no import policy
   */
  public fun autoImportPolicy(): LustreAutoImportPolicy? =
      unwrap(this).getAutoImportPolicy()?.let(LustreAutoImportPolicy::wrap)

  /**
   * Sets the data compression configuration for the file system.
   *
   * For more information, see [Lustre data
   * compression](https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html) in the
   * *Amazon FSx for Lustre User Guide* .
   *
   * Default: - no compression
   */
  public fun dataCompressionType(): LustreDataCompressionType? =
      unwrap(this).getDataCompressionType()?.let(LustreDataCompressionType::wrap)

  /**
   * The type of backing file system deployment used by FSx.
   */
  public fun deploymentType(): LustreDeploymentType

  /**
   * The path in Amazon S3 where the root of your Amazon FSx file system is exported.
   *
   * The path must use the same
   * Amazon S3 bucket as specified in ImportPath. If you only specify a bucket name, such as
   * s3://import-bucket, you
   * get a 1:1 mapping of file system objects to S3 bucket objects. This mapping means that the
   * input data in S3 is
   * overwritten on export. If you provide a custom prefix in the export path, such as
   * s3://import-bucket/[custom-optional-prefix], Amazon FSx exports the contents of your file
   * system to that export
   * prefix in the Amazon S3 bucket.
   *
   * Default: s3://import-bucket/FSxLustre[creation-timestamp]
   */
  public fun exportPath(): String? = unwrap(this).getExportPath()

  /**
   * The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
   * repository for your Amazon FSx for Lustre file system.
   *
   * Must be of the format "s3://{bucketName}/optional-prefix" and cannot
   * exceed 900 characters.
   *
   * Default: - no bucket is imported
   */
  public fun importPath(): String? = unwrap(this).getImportPath()

  /**
   * For files imported from a data repository, this value determines the stripe count and maximum
   * amount of data per file (in MiB) stored on a single physical disk.
   *
   * Allowed values are between 1 and 512,000.
   *
   * Default: 1024
   */
  public fun importedFileChunkSizeMiB(): Number? = unwrap(this).getImportedFileChunkSizeMiB()

  /**
   * Required for the PERSISTENT_1 deployment type, describes the amount of read and write
   * throughput for each 1 tebibyte of storage, in MB/s/TiB.
   *
   * Valid values are 50, 100, 200.
   *
   * Default: - no default, conditionally required for PERSISTENT_1 deployment type
   */
  public fun perUnitStorageThroughput(): Number? = unwrap(this).getPerUnitStorageThroughput()

  /**
   * The preferred day and time to perform weekly maintenance.
   *
   * The first digit is the day of the week, starting at 1
   * for Monday, then the following are hours and minutes in the UTC time zone, 24 hour clock. For
   * example: '2:20:30'
   * is Tuesdays at 20:30.
   *
   * Default: - no preference
   */
  public fun weeklyMaintenanceStartTime(): LustreMaintenanceTime? =
      unwrap(this).getWeeklyMaintenanceStartTime()?.let(LustreMaintenanceTime::wrap)

  /**
   * A builder for [LustreConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoImportPolicy Available with `Scratch` and `Persistent_1` deployment types.
     * When you create your file system, your existing S3 objects appear as file and directory
     * listings. Use this property to choose how Amazon FSx keeps your file and directory listings up
     * to date as you add or modify objects in your linked S3 bucket. `AutoImportPolicy` can have the
     * following values:
     *
     * For more information, see [Automatically import updates from your S3
     * bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) .
     *
     *
     * This parameter is not supported for Lustre file systems using the `Persistent_2` deployment
     * type.
     */
    public fun autoImportPolicy(autoImportPolicy: LustreAutoImportPolicy)

    /**
     * @param dataCompressionType Sets the data compression configuration for the file system.
     * For more information, see [Lustre data
     * compression](https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html) in the
     * *Amazon FSx for Lustre User Guide* .
     */
    public fun dataCompressionType(dataCompressionType: LustreDataCompressionType)

    /**
     * @param deploymentType The type of backing file system deployment used by FSx. 
     */
    public fun deploymentType(deploymentType: LustreDeploymentType)

    /**
     * @param exportPath The path in Amazon S3 where the root of your Amazon FSx file system is
     * exported.
     * The path must use the same
     * Amazon S3 bucket as specified in ImportPath. If you only specify a bucket name, such as
     * s3://import-bucket, you
     * get a 1:1 mapping of file system objects to S3 bucket objects. This mapping means that the
     * input data in S3 is
     * overwritten on export. If you provide a custom prefix in the export path, such as
     * s3://import-bucket/[custom-optional-prefix], Amazon FSx exports the contents of your file
     * system to that export
     * prefix in the Amazon S3 bucket.
     */
    public fun exportPath(exportPath: String)

    /**
     * @param importPath The path to the Amazon S3 bucket (including the optional prefix) that
     * you're using as the data repository for your Amazon FSx for Lustre file system.
     * Must be of the format "s3://{bucketName}/optional-prefix" and cannot
     * exceed 900 characters.
     */
    public fun importPath(importPath: String)

    /**
     * @param importedFileChunkSizeMiB For files imported from a data repository, this value
     * determines the stripe count and maximum amount of data per file (in MiB) stored on a single
     * physical disk.
     * Allowed values are between 1 and 512,000.
     */
    public fun importedFileChunkSizeMiB(importedFileChunkSizeMiB: Number)

    /**
     * @param perUnitStorageThroughput Required for the PERSISTENT_1 deployment type, describes the
     * amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB.
     * Valid values are 50, 100, 200.
     */
    public fun perUnitStorageThroughput(perUnitStorageThroughput: Number)

    /**
     * @param weeklyMaintenanceStartTime The preferred day and time to perform weekly maintenance.
     * The first digit is the day of the week, starting at 1
     * for Monday, then the following are hours and minutes in the UTC time zone, 24 hour clock. For
     * example: '2:20:30'
     * is Tuesdays at 20:30.
     */
    public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTime)

    /**
     * @param weeklyMaintenanceStartTime The preferred day and time to perform weekly maintenance.
     * The first digit is the day of the week, starting at 1
     * for Monday, then the following are hours and minutes in the UTC time zone, 24 hour clock. For
     * example: '2:20:30'
     * is Tuesdays at 20:30.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1343833c242fcc61da33ba57517a2aefb662f1b43aafc47411fe6741b730a2e")
    public
        fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTime.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.LustreConfiguration.Builder =
        software.amazon.awscdk.services.fsx.LustreConfiguration.builder()

    /**
     * @param autoImportPolicy Available with `Scratch` and `Persistent_1` deployment types.
     * When you create your file system, your existing S3 objects appear as file and directory
     * listings. Use this property to choose how Amazon FSx keeps your file and directory listings up
     * to date as you add or modify objects in your linked S3 bucket. `AutoImportPolicy` can have the
     * following values:
     *
     * For more information, see [Automatically import updates from your S3
     * bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) .
     *
     *
     * This parameter is not supported for Lustre file systems using the `Persistent_2` deployment
     * type.
     */
    override fun autoImportPolicy(autoImportPolicy: LustreAutoImportPolicy) {
      cdkBuilder.autoImportPolicy(autoImportPolicy.let(LustreAutoImportPolicy::unwrap))
    }

    /**
     * @param dataCompressionType Sets the data compression configuration for the file system.
     * For more information, see [Lustre data
     * compression](https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html) in the
     * *Amazon FSx for Lustre User Guide* .
     */
    override fun dataCompressionType(dataCompressionType: LustreDataCompressionType) {
      cdkBuilder.dataCompressionType(dataCompressionType.let(LustreDataCompressionType::unwrap))
    }

    /**
     * @param deploymentType The type of backing file system deployment used by FSx. 
     */
    override fun deploymentType(deploymentType: LustreDeploymentType) {
      cdkBuilder.deploymentType(deploymentType.let(LustreDeploymentType::unwrap))
    }

    /**
     * @param exportPath The path in Amazon S3 where the root of your Amazon FSx file system is
     * exported.
     * The path must use the same
     * Amazon S3 bucket as specified in ImportPath. If you only specify a bucket name, such as
     * s3://import-bucket, you
     * get a 1:1 mapping of file system objects to S3 bucket objects. This mapping means that the
     * input data in S3 is
     * overwritten on export. If you provide a custom prefix in the export path, such as
     * s3://import-bucket/[custom-optional-prefix], Amazon FSx exports the contents of your file
     * system to that export
     * prefix in the Amazon S3 bucket.
     */
    override fun exportPath(exportPath: String) {
      cdkBuilder.exportPath(exportPath)
    }

    /**
     * @param importPath The path to the Amazon S3 bucket (including the optional prefix) that
     * you're using as the data repository for your Amazon FSx for Lustre file system.
     * Must be of the format "s3://{bucketName}/optional-prefix" and cannot
     * exceed 900 characters.
     */
    override fun importPath(importPath: String) {
      cdkBuilder.importPath(importPath)
    }

    /**
     * @param importedFileChunkSizeMiB For files imported from a data repository, this value
     * determines the stripe count and maximum amount of data per file (in MiB) stored on a single
     * physical disk.
     * Allowed values are between 1 and 512,000.
     */
    override fun importedFileChunkSizeMiB(importedFileChunkSizeMiB: Number) {
      cdkBuilder.importedFileChunkSizeMiB(importedFileChunkSizeMiB)
    }

    /**
     * @param perUnitStorageThroughput Required for the PERSISTENT_1 deployment type, describes the
     * amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB.
     * Valid values are 50, 100, 200.
     */
    override fun perUnitStorageThroughput(perUnitStorageThroughput: Number) {
      cdkBuilder.perUnitStorageThroughput(perUnitStorageThroughput)
    }

    /**
     * @param weeklyMaintenanceStartTime The preferred day and time to perform weekly maintenance.
     * The first digit is the day of the week, starting at 1
     * for Monday, then the following are hours and minutes in the UTC time zone, 24 hour clock. For
     * example: '2:20:30'
     * is Tuesdays at 20:30.
     */
    override fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTime) {
      cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime.let(LustreMaintenanceTime::unwrap))
    }

    /**
     * @param weeklyMaintenanceStartTime The preferred day and time to perform weekly maintenance.
     * The first digit is the day of the week, starting at 1
     * for Monday, then the following are hours and minutes in the UTC time zone, 24 hour clock. For
     * example: '2:20:30'
     * is Tuesdays at 20:30.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1343833c242fcc61da33ba57517a2aefb662f1b43aafc47411fe6741b730a2e")
    override
        fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTime.Builder.() -> Unit):
        Unit = weeklyMaintenanceStartTime(LustreMaintenanceTime(weeklyMaintenanceStartTime))

    public fun build(): software.amazon.awscdk.services.fsx.LustreConfiguration = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.LustreConfiguration,
  ) : CdkObject(cdkObject), LustreConfiguration {
    /**
     * Available with `Scratch` and `Persistent_1` deployment types.
     *
     * When you create your file system, your existing S3 objects appear as file and directory
     * listings. Use this property to choose how Amazon FSx keeps your file and directory listings up
     * to date as you add or modify objects in your linked S3 bucket. `AutoImportPolicy` can have the
     * following values:
     *
     * For more information, see [Automatically import updates from your S3
     * bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) .
     *
     *
     * This parameter is not supported for Lustre file systems using the `Persistent_2` deployment
     * type.
     *
     *
     * Default: - no import policy
     */
    override fun autoImportPolicy(): LustreAutoImportPolicy? =
        unwrap(this).getAutoImportPolicy()?.let(LustreAutoImportPolicy::wrap)

    /**
     * Sets the data compression configuration for the file system.
     *
     * For more information, see [Lustre data
     * compression](https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html) in the
     * *Amazon FSx for Lustre User Guide* .
     *
     * Default: - no compression
     */
    override fun dataCompressionType(): LustreDataCompressionType? =
        unwrap(this).getDataCompressionType()?.let(LustreDataCompressionType::wrap)

    /**
     * The type of backing file system deployment used by FSx.
     */
    override fun deploymentType(): LustreDeploymentType =
        unwrap(this).getDeploymentType().let(LustreDeploymentType::wrap)

    /**
     * The path in Amazon S3 where the root of your Amazon FSx file system is exported.
     *
     * The path must use the same
     * Amazon S3 bucket as specified in ImportPath. If you only specify a bucket name, such as
     * s3://import-bucket, you
     * get a 1:1 mapping of file system objects to S3 bucket objects. This mapping means that the
     * input data in S3 is
     * overwritten on export. If you provide a custom prefix in the export path, such as
     * s3://import-bucket/[custom-optional-prefix], Amazon FSx exports the contents of your file
     * system to that export
     * prefix in the Amazon S3 bucket.
     *
     * Default: s3://import-bucket/FSxLustre[creation-timestamp]
     */
    override fun exportPath(): String? = unwrap(this).getExportPath()

    /**
     * The path to the Amazon S3 bucket (including the optional prefix) that you're using as the
     * data repository for your Amazon FSx for Lustre file system.
     *
     * Must be of the format "s3://{bucketName}/optional-prefix" and cannot
     * exceed 900 characters.
     *
     * Default: - no bucket is imported
     */
    override fun importPath(): String? = unwrap(this).getImportPath()

    /**
     * For files imported from a data repository, this value determines the stripe count and maximum
     * amount of data per file (in MiB) stored on a single physical disk.
     *
     * Allowed values are between 1 and 512,000.
     *
     * Default: 1024
     */
    override fun importedFileChunkSizeMiB(): Number? = unwrap(this).getImportedFileChunkSizeMiB()

    /**
     * Required for the PERSISTENT_1 deployment type, describes the amount of read and write
     * throughput for each 1 tebibyte of storage, in MB/s/TiB.
     *
     * Valid values are 50, 100, 200.
     *
     * Default: - no default, conditionally required for PERSISTENT_1 deployment type
     */
    override fun perUnitStorageThroughput(): Number? = unwrap(this).getPerUnitStorageThroughput()

    /**
     * The preferred day and time to perform weekly maintenance.
     *
     * The first digit is the day of the week, starting at 1
     * for Monday, then the following are hours and minutes in the UTC time zone, 24 hour clock. For
     * example: '2:20:30'
     * is Tuesdays at 20:30.
     *
     * Default: - no preference
     */
    override fun weeklyMaintenanceStartTime(): LustreMaintenanceTime? =
        unwrap(this).getWeeklyMaintenanceStartTime()?.let(LustreMaintenanceTime::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LustreConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreConfiguration):
        LustreConfiguration = CdkObjectWrappers.wrap(cdkObject) as LustreConfiguration

    internal fun unwrap(wrapped: LustreConfiguration):
        software.amazon.awscdk.services.fsx.LustreConfiguration = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.fsx.LustreConfiguration
  }
}
