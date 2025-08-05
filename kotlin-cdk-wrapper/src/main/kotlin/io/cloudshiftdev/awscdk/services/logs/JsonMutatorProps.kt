@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for creating JSON mutator processors.
 *
 * Example:
 *
 * ```
 * // Create a log group
 * LogGroup logGroup = new LogGroup(this, "MyLogGroup");
 * // Create a JSON parser processor
 * ParserProcessor jsonParser = ParserProcessor.Builder.create()
 * .type(ParserProcessorType.JSON)
 * .build();
 * // Create a processor to add keys
 * JsonMutatorProcessor addKeysProcessor = JsonMutatorProcessor.Builder.create()
 * .type(JsonMutatorType.ADD_KEYS)
 * .addKeysOptions(AddKeysProperty.builder()
 * .entries(List.of(AddKeyEntryProperty.builder()
 * .key("metadata.transformed_in")
 * .value("CloudWatchLogs")
 * .build()))
 * .build())
 * .build();
 * // Create a transformer with these processors
 * // Create a transformer with these processors
 * Transformer.Builder.create(this, "Transformer")
 * .transformerName("MyTransformer")
 * .logGroup(logGroup)
 * .transformerConfig(List.of(jsonParser, addKeysProcessor))
 * .build();
 * ```
 */
public interface JsonMutatorProps : BaseProcessorProps {
  /**
   * Options for adding keys.
   *
   * Required when type is ADD_KEYS.
   *
   * Default: - No adding keys processor is created if props not set
   */
  public fun addKeysOptions(): AddKeysProperty? =
      unwrap(this).getAddKeysOptions()?.let(AddKeysProperty::wrap)

  /**
   * Options for copying values.
   *
   * Required when type is COPY_VALUE.
   *
   * Default: - No copy value processor is created if props not set
   */
  public fun copyValueOptions(): CopyValueProperty? =
      unwrap(this).getCopyValueOptions()?.let(CopyValueProperty::wrap)

  /**
   * Keys to delete.
   *
   * Required when type is DELETE_KEYS.
   *
   * Default: - No delete key processor is created if props not set
   */
  public fun deleteKeysOptions(): ProcessorDeleteKeysProperty? =
      unwrap(this).getDeleteKeysOptions()?.let(ProcessorDeleteKeysProperty::wrap)

  /**
   * Options for converting lists to maps.
   *
   * Required when type is LIST_TO_MAP.
   *
   * Default: - No list-to-map processor is created if props not set
   */
  public fun listToMapOptions(): ListToMapProperty? =
      unwrap(this).getListToMapOptions()?.let(ListToMapProperty::wrap)

  /**
   * Options for moving keys.
   *
   * Required when type is MOVE_KEYS.
   *
   * Default: - No move key processor is created if props not set
   */
  public fun moveKeysOptions(): MoveKeysProperty? =
      unwrap(this).getMoveKeysOptions()?.let(MoveKeysProperty::wrap)

  /**
   * Options for renaming keys.
   *
   * Required when type is RENAME_KEYS.
   *
   * Default: - No rename key processor is created if props not set
   */
  public fun renameKeysOptions(): RenameKeysProperty? =
      unwrap(this).getRenameKeysOptions()?.let(RenameKeysProperty::wrap)

  /**
   * The type of JSON mutation operation.
   */
  public fun type(): JsonMutatorType

  /**
   * A builder for [JsonMutatorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addKeysOptions Options for adding keys.
     * Required when type is ADD_KEYS.
     */
    public fun addKeysOptions(addKeysOptions: AddKeysProperty)

    /**
     * @param addKeysOptions Options for adding keys.
     * Required when type is ADD_KEYS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b5f59f1a7934a8a79bda770d53ea164a3281c17a826ae98220f905635d55b05")
    public fun addKeysOptions(addKeysOptions: AddKeysProperty.Builder.() -> Unit)

    /**
     * @param copyValueOptions Options for copying values.
     * Required when type is COPY_VALUE.
     */
    public fun copyValueOptions(copyValueOptions: CopyValueProperty)

    /**
     * @param copyValueOptions Options for copying values.
     * Required when type is COPY_VALUE.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f74fe2e85d9ca9b93b168b4d1f86cc94645233faae157218cc51516bd34d07")
    public fun copyValueOptions(copyValueOptions: CopyValueProperty.Builder.() -> Unit)

    /**
     * @param deleteKeysOptions Keys to delete.
     * Required when type is DELETE_KEYS.
     */
    public fun deleteKeysOptions(deleteKeysOptions: ProcessorDeleteKeysProperty)

    /**
     * @param deleteKeysOptions Keys to delete.
     * Required when type is DELETE_KEYS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("222d2c207ab6e8c46a1aaf5f49c8a61933dbc9ee8a1c5b2354461c0d5776edc0")
    public fun deleteKeysOptions(deleteKeysOptions: ProcessorDeleteKeysProperty.Builder.() -> Unit)

    /**
     * @param listToMapOptions Options for converting lists to maps.
     * Required when type is LIST_TO_MAP.
     */
    public fun listToMapOptions(listToMapOptions: ListToMapProperty)

    /**
     * @param listToMapOptions Options for converting lists to maps.
     * Required when type is LIST_TO_MAP.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0052a2eb0ea89d2715a394d8843b9edcaedb5fa1bcfbf9213936d530c86de1ec")
    public fun listToMapOptions(listToMapOptions: ListToMapProperty.Builder.() -> Unit)

    /**
     * @param moveKeysOptions Options for moving keys.
     * Required when type is MOVE_KEYS.
     */
    public fun moveKeysOptions(moveKeysOptions: MoveKeysProperty)

    /**
     * @param moveKeysOptions Options for moving keys.
     * Required when type is MOVE_KEYS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("826f04096a74d545737c1fe442937f23ecd62bade7d4e0213408fc6cb224e6b7")
    public fun moveKeysOptions(moveKeysOptions: MoveKeysProperty.Builder.() -> Unit)

    /**
     * @param renameKeysOptions Options for renaming keys.
     * Required when type is RENAME_KEYS.
     */
    public fun renameKeysOptions(renameKeysOptions: RenameKeysProperty)

    /**
     * @param renameKeysOptions Options for renaming keys.
     * Required when type is RENAME_KEYS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("240352679b9a78badda2384632605e4bc194e391886fb9aab47e7c0de49ee66a")
    public fun renameKeysOptions(renameKeysOptions: RenameKeysProperty.Builder.() -> Unit)

    /**
     * @param type The type of JSON mutation operation. 
     */
    public fun type(type: JsonMutatorType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.JsonMutatorProps.Builder =
        software.amazon.awscdk.services.logs.JsonMutatorProps.builder()

    /**
     * @param addKeysOptions Options for adding keys.
     * Required when type is ADD_KEYS.
     */
    override fun addKeysOptions(addKeysOptions: AddKeysProperty) {
      cdkBuilder.addKeysOptions(addKeysOptions.let(AddKeysProperty.Companion::unwrap))
    }

    /**
     * @param addKeysOptions Options for adding keys.
     * Required when type is ADD_KEYS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b5f59f1a7934a8a79bda770d53ea164a3281c17a826ae98220f905635d55b05")
    override fun addKeysOptions(addKeysOptions: AddKeysProperty.Builder.() -> Unit): Unit =
        addKeysOptions(AddKeysProperty(addKeysOptions))

    /**
     * @param copyValueOptions Options for copying values.
     * Required when type is COPY_VALUE.
     */
    override fun copyValueOptions(copyValueOptions: CopyValueProperty) {
      cdkBuilder.copyValueOptions(copyValueOptions.let(CopyValueProperty.Companion::unwrap))
    }

    /**
     * @param copyValueOptions Options for copying values.
     * Required when type is COPY_VALUE.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f74fe2e85d9ca9b93b168b4d1f86cc94645233faae157218cc51516bd34d07")
    override fun copyValueOptions(copyValueOptions: CopyValueProperty.Builder.() -> Unit): Unit =
        copyValueOptions(CopyValueProperty(copyValueOptions))

    /**
     * @param deleteKeysOptions Keys to delete.
     * Required when type is DELETE_KEYS.
     */
    override fun deleteKeysOptions(deleteKeysOptions: ProcessorDeleteKeysProperty) {
      cdkBuilder.deleteKeysOptions(deleteKeysOptions.let(ProcessorDeleteKeysProperty.Companion::unwrap))
    }

    /**
     * @param deleteKeysOptions Keys to delete.
     * Required when type is DELETE_KEYS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("222d2c207ab6e8c46a1aaf5f49c8a61933dbc9ee8a1c5b2354461c0d5776edc0")
    override
        fun deleteKeysOptions(deleteKeysOptions: ProcessorDeleteKeysProperty.Builder.() -> Unit):
        Unit = deleteKeysOptions(ProcessorDeleteKeysProperty(deleteKeysOptions))

    /**
     * @param listToMapOptions Options for converting lists to maps.
     * Required when type is LIST_TO_MAP.
     */
    override fun listToMapOptions(listToMapOptions: ListToMapProperty) {
      cdkBuilder.listToMapOptions(listToMapOptions.let(ListToMapProperty.Companion::unwrap))
    }

    /**
     * @param listToMapOptions Options for converting lists to maps.
     * Required when type is LIST_TO_MAP.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0052a2eb0ea89d2715a394d8843b9edcaedb5fa1bcfbf9213936d530c86de1ec")
    override fun listToMapOptions(listToMapOptions: ListToMapProperty.Builder.() -> Unit): Unit =
        listToMapOptions(ListToMapProperty(listToMapOptions))

    /**
     * @param moveKeysOptions Options for moving keys.
     * Required when type is MOVE_KEYS.
     */
    override fun moveKeysOptions(moveKeysOptions: MoveKeysProperty) {
      cdkBuilder.moveKeysOptions(moveKeysOptions.let(MoveKeysProperty.Companion::unwrap))
    }

    /**
     * @param moveKeysOptions Options for moving keys.
     * Required when type is MOVE_KEYS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("826f04096a74d545737c1fe442937f23ecd62bade7d4e0213408fc6cb224e6b7")
    override fun moveKeysOptions(moveKeysOptions: MoveKeysProperty.Builder.() -> Unit): Unit =
        moveKeysOptions(MoveKeysProperty(moveKeysOptions))

    /**
     * @param renameKeysOptions Options for renaming keys.
     * Required when type is RENAME_KEYS.
     */
    override fun renameKeysOptions(renameKeysOptions: RenameKeysProperty) {
      cdkBuilder.renameKeysOptions(renameKeysOptions.let(RenameKeysProperty.Companion::unwrap))
    }

    /**
     * @param renameKeysOptions Options for renaming keys.
     * Required when type is RENAME_KEYS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("240352679b9a78badda2384632605e4bc194e391886fb9aab47e7c0de49ee66a")
    override fun renameKeysOptions(renameKeysOptions: RenameKeysProperty.Builder.() -> Unit): Unit =
        renameKeysOptions(RenameKeysProperty(renameKeysOptions))

    /**
     * @param type The type of JSON mutation operation. 
     */
    override fun type(type: JsonMutatorType) {
      cdkBuilder.type(type.let(JsonMutatorType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.JsonMutatorProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.JsonMutatorProps,
  ) : CdkObject(cdkObject),
      JsonMutatorProps {
    /**
     * Options for adding keys.
     *
     * Required when type is ADD_KEYS.
     *
     * Default: - No adding keys processor is created if props not set
     */
    override fun addKeysOptions(): AddKeysProperty? =
        unwrap(this).getAddKeysOptions()?.let(AddKeysProperty::wrap)

    /**
     * Options for copying values.
     *
     * Required when type is COPY_VALUE.
     *
     * Default: - No copy value processor is created if props not set
     */
    override fun copyValueOptions(): CopyValueProperty? =
        unwrap(this).getCopyValueOptions()?.let(CopyValueProperty::wrap)

    /**
     * Keys to delete.
     *
     * Required when type is DELETE_KEYS.
     *
     * Default: - No delete key processor is created if props not set
     */
    override fun deleteKeysOptions(): ProcessorDeleteKeysProperty? =
        unwrap(this).getDeleteKeysOptions()?.let(ProcessorDeleteKeysProperty::wrap)

    /**
     * Options for converting lists to maps.
     *
     * Required when type is LIST_TO_MAP.
     *
     * Default: - No list-to-map processor is created if props not set
     */
    override fun listToMapOptions(): ListToMapProperty? =
        unwrap(this).getListToMapOptions()?.let(ListToMapProperty::wrap)

    /**
     * Options for moving keys.
     *
     * Required when type is MOVE_KEYS.
     *
     * Default: - No move key processor is created if props not set
     */
    override fun moveKeysOptions(): MoveKeysProperty? =
        unwrap(this).getMoveKeysOptions()?.let(MoveKeysProperty::wrap)

    /**
     * Options for renaming keys.
     *
     * Required when type is RENAME_KEYS.
     *
     * Default: - No rename key processor is created if props not set
     */
    override fun renameKeysOptions(): RenameKeysProperty? =
        unwrap(this).getRenameKeysOptions()?.let(RenameKeysProperty::wrap)

    /**
     * The type of JSON mutation operation.
     */
    override fun type(): JsonMutatorType = unwrap(this).getType().let(JsonMutatorType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonMutatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.JsonMutatorProps):
        JsonMutatorProps = CdkObjectWrappers.wrap(cdkObject) as? JsonMutatorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonMutatorProps):
        software.amazon.awscdk.services.logs.JsonMutatorProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.JsonMutatorProps
  }
}
