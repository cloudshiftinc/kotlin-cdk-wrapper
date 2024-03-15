@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Specifies the inventory configuration of an S3 Bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * Inventory inventory = Inventory.builder()
 * .destination(InventoryDestination.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .prefix("prefix")
 * .build())
 * // the properties below are optional
 * .enabled(false)
 * .format(InventoryFormat.CSV)
 * .frequency(InventoryFrequency.DAILY)
 * .includeObjectVersions(InventoryObjectVersion.ALL)
 * .inventoryId("inventoryId")
 * .objectsPrefix("objectsPrefix")
 * .optionalFields(List.of("optionalFields"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
 */
public interface Inventory {
  /**
   * The destination of the inventory.
   */
  public fun destination(): InventoryDestination

  /**
   * Whether the inventory is enabled or disabled.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The format of the inventory.
   *
   * Default: InventoryFormat.CSV
   */
  public fun format(): InventoryFormat? = unwrap(this).getFormat()?.let(InventoryFormat::wrap)

  /**
   * Frequency at which the inventory should be generated.
   *
   * Default: InventoryFrequency.WEEKLY
   */
  public fun frequency(): InventoryFrequency? =
      unwrap(this).getFrequency()?.let(InventoryFrequency::wrap)

  /**
   * If the inventory should contain all the object versions or only the current one.
   *
   * Default: InventoryObjectVersion.ALL
   */
  public fun includeObjectVersions(): InventoryObjectVersion? =
      unwrap(this).getIncludeObjectVersions()?.let(InventoryObjectVersion::wrap)

  /**
   * The inventory configuration ID.
   *
   * Should be limited to 64 characters and can only contain letters, numbers, periods, dashes, and
   * underscores.
   *
   * Default: - generated ID.
   */
  public fun inventoryId(): String? = unwrap(this).getInventoryId()

  /**
   * The inventory will only include objects that meet the prefix filter criteria.
   *
   * Default: - No objects prefix
   */
  public fun objectsPrefix(): String? = unwrap(this).getObjectsPrefix()

  /**
   * A list of optional fields to be included in the inventory result.
   *
   * Default: - No optional fields.
   */
  public fun optionalFields(): List<String> = unwrap(this).getOptionalFields() ?: emptyList()

  /**
   * A builder for [Inventory]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destination The destination of the inventory. 
     */
    public fun destination(destination: InventoryDestination)

    /**
     * @param destination The destination of the inventory. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b17f6f1923546f1c621d45e32810de2eab988fb38c57ab4fe55c8905763578e")
    public fun destination(destination: InventoryDestination.Builder.() -> Unit)

    /**
     * @param enabled Whether the inventory is enabled or disabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param format The format of the inventory.
     */
    public fun format(format: InventoryFormat)

    /**
     * @param frequency Frequency at which the inventory should be generated.
     */
    public fun frequency(frequency: InventoryFrequency)

    /**
     * @param includeObjectVersions If the inventory should contain all the object versions or only
     * the current one.
     */
    public fun includeObjectVersions(includeObjectVersions: InventoryObjectVersion)

    /**
     * @param inventoryId The inventory configuration ID.
     * Should be limited to 64 characters and can only contain letters, numbers, periods, dashes,
     * and underscores.
     */
    public fun inventoryId(inventoryId: String)

    /**
     * @param objectsPrefix The inventory will only include objects that meet the prefix filter
     * criteria.
     */
    public fun objectsPrefix(objectsPrefix: String)

    /**
     * @param optionalFields A list of optional fields to be included in the inventory result.
     */
    public fun optionalFields(optionalFields: List<String>)

    /**
     * @param optionalFields A list of optional fields to be included in the inventory result.
     */
    public fun optionalFields(vararg optionalFields: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.Inventory.Builder =
        software.amazon.awscdk.services.s3.Inventory.builder()

    /**
     * @param destination The destination of the inventory. 
     */
    override fun destination(destination: InventoryDestination) {
      cdkBuilder.destination(destination.let(InventoryDestination::unwrap))
    }

    /**
     * @param destination The destination of the inventory. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b17f6f1923546f1c621d45e32810de2eab988fb38c57ab4fe55c8905763578e")
    override fun destination(destination: InventoryDestination.Builder.() -> Unit): Unit =
        destination(InventoryDestination(destination))

    /**
     * @param enabled Whether the inventory is enabled or disabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param format The format of the inventory.
     */
    override fun format(format: InventoryFormat) {
      cdkBuilder.format(format.let(InventoryFormat::unwrap))
    }

    /**
     * @param frequency Frequency at which the inventory should be generated.
     */
    override fun frequency(frequency: InventoryFrequency) {
      cdkBuilder.frequency(frequency.let(InventoryFrequency::unwrap))
    }

    /**
     * @param includeObjectVersions If the inventory should contain all the object versions or only
     * the current one.
     */
    override fun includeObjectVersions(includeObjectVersions: InventoryObjectVersion) {
      cdkBuilder.includeObjectVersions(includeObjectVersions.let(InventoryObjectVersion::unwrap))
    }

    /**
     * @param inventoryId The inventory configuration ID.
     * Should be limited to 64 characters and can only contain letters, numbers, periods, dashes,
     * and underscores.
     */
    override fun inventoryId(inventoryId: String) {
      cdkBuilder.inventoryId(inventoryId)
    }

    /**
     * @param objectsPrefix The inventory will only include objects that meet the prefix filter
     * criteria.
     */
    override fun objectsPrefix(objectsPrefix: String) {
      cdkBuilder.objectsPrefix(objectsPrefix)
    }

    /**
     * @param optionalFields A list of optional fields to be included in the inventory result.
     */
    override fun optionalFields(optionalFields: List<String>) {
      cdkBuilder.optionalFields(optionalFields)
    }

    /**
     * @param optionalFields A list of optional fields to be included in the inventory result.
     */
    override fun optionalFields(vararg optionalFields: String): Unit =
        optionalFields(optionalFields.toList())

    public fun build(): software.amazon.awscdk.services.s3.Inventory = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.Inventory,
  ) : CdkObject(cdkObject), Inventory {
    /**
     * The destination of the inventory.
     */
    override fun destination(): InventoryDestination =
        unwrap(this).getDestination().let(InventoryDestination::wrap)

    /**
     * Whether the inventory is enabled or disabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The format of the inventory.
     *
     * Default: InventoryFormat.CSV
     */
    override fun format(): InventoryFormat? = unwrap(this).getFormat()?.let(InventoryFormat::wrap)

    /**
     * Frequency at which the inventory should be generated.
     *
     * Default: InventoryFrequency.WEEKLY
     */
    override fun frequency(): InventoryFrequency? =
        unwrap(this).getFrequency()?.let(InventoryFrequency::wrap)

    /**
     * If the inventory should contain all the object versions or only the current one.
     *
     * Default: InventoryObjectVersion.ALL
     */
    override fun includeObjectVersions(): InventoryObjectVersion? =
        unwrap(this).getIncludeObjectVersions()?.let(InventoryObjectVersion::wrap)

    /**
     * The inventory configuration ID.
     *
     * Should be limited to 64 characters and can only contain letters, numbers, periods, dashes,
     * and underscores.
     *
     * Default: - generated ID.
     */
    override fun inventoryId(): String? = unwrap(this).getInventoryId()

    /**
     * The inventory will only include objects that meet the prefix filter criteria.
     *
     * Default: - No objects prefix
     */
    override fun objectsPrefix(): String? = unwrap(this).getObjectsPrefix()

    /**
     * A list of optional fields to be included in the inventory result.
     *
     * Default: - No optional fields.
     */
    override fun optionalFields(): List<String> = unwrap(this).getOptionalFields() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Inventory {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Inventory): Inventory =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Inventory): software.amazon.awscdk.services.s3.Inventory = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.s3.Inventory
  }
}
