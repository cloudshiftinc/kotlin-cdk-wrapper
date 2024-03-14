package io.cloudshiftdev.awscdk.services.s3

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface Inventory {
  public fun destination(): InventoryDestination

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun format(): InventoryFormat? = unwrap(this).getFormat()?.let(InventoryFormat::wrap)

  public fun frequency(): InventoryFrequency? =
      unwrap(this).getFrequency()?.let(InventoryFrequency::wrap)

  public fun includeObjectVersions(): InventoryObjectVersion? =
      unwrap(this).getIncludeObjectVersions()?.let(InventoryObjectVersion::wrap)

  public fun inventoryId(): String? = unwrap(this).getInventoryId()

  public fun objectsPrefix(): String? = unwrap(this).getObjectsPrefix()

  public fun optionalFields(): List<String> = unwrap(this).getOptionalFields() ?: emptyList()

  public interface Builder {
    public fun destination(destination: InventoryDestination) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b17f6f1923546f1c621d45e32810de2eab988fb38c57ab4fe55c8905763578e")
    public fun destination(destination: InventoryDestination.Builder.() -> Unit) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun format(format: InventoryFormat) {
    }

    public fun frequency(frequency: InventoryFrequency) {
    }

    public fun includeObjectVersions(includeObjectVersions: InventoryObjectVersion) {
    }

    public fun inventoryId(inventoryId: String) {
    }

    public fun objectsPrefix(objectsPrefix: String) {
    }

    public fun optionalFields(optionalFields: List<String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.Inventory.Builder =
        software.amazon.awscdk.services.s3.Inventory.builder()

    public override fun destination(destination: InventoryDestination) {
      cdkBuilder.destination(destination.let(InventoryDestination::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b17f6f1923546f1c621d45e32810de2eab988fb38c57ab4fe55c8905763578e")
    public override fun destination(destination: InventoryDestination.Builder.() -> Unit): Unit =
        destination(InventoryDestination(destination))

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun format(format: InventoryFormat) {
      cdkBuilder.format(format.let(InventoryFormat::unwrap))
    }

    public override fun frequency(frequency: InventoryFrequency) {
      cdkBuilder.frequency(frequency.let(InventoryFrequency::unwrap))
    }

    public override fun includeObjectVersions(includeObjectVersions: InventoryObjectVersion) {
      cdkBuilder.includeObjectVersions(includeObjectVersions.let(InventoryObjectVersion::unwrap))
    }

    public override fun inventoryId(inventoryId: String) {
      cdkBuilder.inventoryId(inventoryId)
    }

    public override fun objectsPrefix(objectsPrefix: String) {
      cdkBuilder.objectsPrefix(objectsPrefix)
    }

    public override fun optionalFields(optionalFields: List<String>) {
      cdkBuilder.optionalFields(optionalFields)
    }

    public fun build(): software.amazon.awscdk.services.s3.Inventory = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.Inventory,
  ) : Inventory {
    public override fun destination(): InventoryDestination =
        unwrap(this).getDestination().let(InventoryDestination::wrap)

    public override fun enabled(): Boolean? = unwrap(this).getEnabled()

    public override fun format(): InventoryFormat? =
        unwrap(this).getFormat()?.let(InventoryFormat::wrap)

    public override fun frequency(): InventoryFrequency? =
        unwrap(this).getFrequency()?.let(InventoryFrequency::wrap)

    public override fun includeObjectVersions(): InventoryObjectVersion? =
        unwrap(this).getIncludeObjectVersions()?.let(InventoryObjectVersion::wrap)

    public override fun inventoryId(): String? = unwrap(this).getInventoryId()

    public override fun objectsPrefix(): String? = unwrap(this).getObjectsPrefix()

    public override fun optionalFields(): List<String> = unwrap(this).getOptionalFields() ?:
        emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Inventory {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Inventory): Inventory =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Inventory): software.amazon.awscdk.services.s3.Inventory = (wrapped
        as Wrapper).cdkObject
  }
}
