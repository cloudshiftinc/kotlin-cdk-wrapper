@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Processor for JSON mutation operations.
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
public open class JsonMutatorProcessor(
  cdkObject: software.amazon.awscdk.services.logs.JsonMutatorProcessor,
) : CdkObject(cdkObject),
    IProcessor {
  public constructor(props: JsonMutatorProps) :
      this(software.amazon.awscdk.services.logs.JsonMutatorProcessor(props.let(JsonMutatorProps.Companion::unwrap))
  )

  public constructor(props: JsonMutatorProps.Builder.() -> Unit) : this(JsonMutatorProps(props)
  )

  /**
   * The type of JSON mutation operation.
   */
  public open fun type(): JsonMutatorType = unwrap(this).getType().let(JsonMutatorType::wrap)

  /**
   * The type of JSON mutation operation.
   */
  public open fun type(`value`: JsonMutatorType) {
    unwrap(this).setType(`value`.let(JsonMutatorType.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.JsonMutatorProcessor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Options for adding keys.
     *
     * Required when type is ADD_KEYS.
     *
     * Default: - No adding keys processor is created if props not set
     *
     * @param addKeysOptions Options for adding keys. 
     */
    public fun addKeysOptions(addKeysOptions: AddKeysProperty)

    /**
     * Options for adding keys.
     *
     * Required when type is ADD_KEYS.
     *
     * Default: - No adding keys processor is created if props not set
     *
     * @param addKeysOptions Options for adding keys. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf92d14a949f59b17b305b5a754549f2aaba318b261afc7f098f2f8e7fc6fd08")
    public fun addKeysOptions(addKeysOptions: AddKeysProperty.Builder.() -> Unit)

    /**
     * Options for copying values.
     *
     * Required when type is COPY_VALUE.
     *
     * Default: - No copy value processor is created if props not set
     *
     * @param copyValueOptions Options for copying values. 
     */
    public fun copyValueOptions(copyValueOptions: CopyValueProperty)

    /**
     * Options for copying values.
     *
     * Required when type is COPY_VALUE.
     *
     * Default: - No copy value processor is created if props not set
     *
     * @param copyValueOptions Options for copying values. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daab513de8cc9ba6b594936757f57943b757a586c5bb6d71edf8bcf846f1c0fb")
    public fun copyValueOptions(copyValueOptions: CopyValueProperty.Builder.() -> Unit)

    /**
     * Keys to delete.
     *
     * Required when type is DELETE_KEYS.
     *
     * Default: - No delete key processor is created if props not set
     *
     * @param deleteKeysOptions Keys to delete. 
     */
    public fun deleteKeysOptions(deleteKeysOptions: ProcessorDeleteKeysProperty)

    /**
     * Keys to delete.
     *
     * Required when type is DELETE_KEYS.
     *
     * Default: - No delete key processor is created if props not set
     *
     * @param deleteKeysOptions Keys to delete. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a624a960837b5c382235b7ab394e4ad55a86b47c3ee8553b59d6d430c2290e7")
    public fun deleteKeysOptions(deleteKeysOptions: ProcessorDeleteKeysProperty.Builder.() -> Unit)

    /**
     * Options for converting lists to maps.
     *
     * Required when type is LIST_TO_MAP.
     *
     * Default: - No list-to-map processor is created if props not set
     *
     * @param listToMapOptions Options for converting lists to maps. 
     */
    public fun listToMapOptions(listToMapOptions: ListToMapProperty)

    /**
     * Options for converting lists to maps.
     *
     * Required when type is LIST_TO_MAP.
     *
     * Default: - No list-to-map processor is created if props not set
     *
     * @param listToMapOptions Options for converting lists to maps. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ef2c86a2bc72925998e42bd51739312e006f45ef399dd4ffe1da58ae768396b")
    public fun listToMapOptions(listToMapOptions: ListToMapProperty.Builder.() -> Unit)

    /**
     * Options for moving keys.
     *
     * Required when type is MOVE_KEYS.
     *
     * Default: - No move key processor is created if props not set
     *
     * @param moveKeysOptions Options for moving keys. 
     */
    public fun moveKeysOptions(moveKeysOptions: MoveKeysProperty)

    /**
     * Options for moving keys.
     *
     * Required when type is MOVE_KEYS.
     *
     * Default: - No move key processor is created if props not set
     *
     * @param moveKeysOptions Options for moving keys. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e21cce8bda7ccd567ea99986bf69ca30e0c82417e740894abf1a8d515a4006d")
    public fun moveKeysOptions(moveKeysOptions: MoveKeysProperty.Builder.() -> Unit)

    /**
     * Options for renaming keys.
     *
     * Required when type is RENAME_KEYS.
     *
     * Default: - No rename key processor is created if props not set
     *
     * @param renameKeysOptions Options for renaming keys. 
     */
    public fun renameKeysOptions(renameKeysOptions: RenameKeysProperty)

    /**
     * Options for renaming keys.
     *
     * Required when type is RENAME_KEYS.
     *
     * Default: - No rename key processor is created if props not set
     *
     * @param renameKeysOptions Options for renaming keys. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecb7d01fba05abcee20ed26158819c045780015d10c596cfaed2f1998a40ee1a")
    public fun renameKeysOptions(renameKeysOptions: RenameKeysProperty.Builder.() -> Unit)

    /**
     * The type of JSON mutation operation.
     *
     * @param type The type of JSON mutation operation. 
     */
    public fun type(type: JsonMutatorType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.JsonMutatorProcessor.Builder =
        software.amazon.awscdk.services.logs.JsonMutatorProcessor.Builder.create()

    /**
     * Options for adding keys.
     *
     * Required when type is ADD_KEYS.
     *
     * Default: - No adding keys processor is created if props not set
     *
     * @param addKeysOptions Options for adding keys. 
     */
    override fun addKeysOptions(addKeysOptions: AddKeysProperty) {
      cdkBuilder.addKeysOptions(addKeysOptions.let(AddKeysProperty.Companion::unwrap))
    }

    /**
     * Options for adding keys.
     *
     * Required when type is ADD_KEYS.
     *
     * Default: - No adding keys processor is created if props not set
     *
     * @param addKeysOptions Options for adding keys. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf92d14a949f59b17b305b5a754549f2aaba318b261afc7f098f2f8e7fc6fd08")
    override fun addKeysOptions(addKeysOptions: AddKeysProperty.Builder.() -> Unit): Unit =
        addKeysOptions(AddKeysProperty(addKeysOptions))

    /**
     * Options for copying values.
     *
     * Required when type is COPY_VALUE.
     *
     * Default: - No copy value processor is created if props not set
     *
     * @param copyValueOptions Options for copying values. 
     */
    override fun copyValueOptions(copyValueOptions: CopyValueProperty) {
      cdkBuilder.copyValueOptions(copyValueOptions.let(CopyValueProperty.Companion::unwrap))
    }

    /**
     * Options for copying values.
     *
     * Required when type is COPY_VALUE.
     *
     * Default: - No copy value processor is created if props not set
     *
     * @param copyValueOptions Options for copying values. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daab513de8cc9ba6b594936757f57943b757a586c5bb6d71edf8bcf846f1c0fb")
    override fun copyValueOptions(copyValueOptions: CopyValueProperty.Builder.() -> Unit): Unit =
        copyValueOptions(CopyValueProperty(copyValueOptions))

    /**
     * Keys to delete.
     *
     * Required when type is DELETE_KEYS.
     *
     * Default: - No delete key processor is created if props not set
     *
     * @param deleteKeysOptions Keys to delete. 
     */
    override fun deleteKeysOptions(deleteKeysOptions: ProcessorDeleteKeysProperty) {
      cdkBuilder.deleteKeysOptions(deleteKeysOptions.let(ProcessorDeleteKeysProperty.Companion::unwrap))
    }

    /**
     * Keys to delete.
     *
     * Required when type is DELETE_KEYS.
     *
     * Default: - No delete key processor is created if props not set
     *
     * @param deleteKeysOptions Keys to delete. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a624a960837b5c382235b7ab394e4ad55a86b47c3ee8553b59d6d430c2290e7")
    override
        fun deleteKeysOptions(deleteKeysOptions: ProcessorDeleteKeysProperty.Builder.() -> Unit):
        Unit = deleteKeysOptions(ProcessorDeleteKeysProperty(deleteKeysOptions))

    /**
     * Options for converting lists to maps.
     *
     * Required when type is LIST_TO_MAP.
     *
     * Default: - No list-to-map processor is created if props not set
     *
     * @param listToMapOptions Options for converting lists to maps. 
     */
    override fun listToMapOptions(listToMapOptions: ListToMapProperty) {
      cdkBuilder.listToMapOptions(listToMapOptions.let(ListToMapProperty.Companion::unwrap))
    }

    /**
     * Options for converting lists to maps.
     *
     * Required when type is LIST_TO_MAP.
     *
     * Default: - No list-to-map processor is created if props not set
     *
     * @param listToMapOptions Options for converting lists to maps. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ef2c86a2bc72925998e42bd51739312e006f45ef399dd4ffe1da58ae768396b")
    override fun listToMapOptions(listToMapOptions: ListToMapProperty.Builder.() -> Unit): Unit =
        listToMapOptions(ListToMapProperty(listToMapOptions))

    /**
     * Options for moving keys.
     *
     * Required when type is MOVE_KEYS.
     *
     * Default: - No move key processor is created if props not set
     *
     * @param moveKeysOptions Options for moving keys. 
     */
    override fun moveKeysOptions(moveKeysOptions: MoveKeysProperty) {
      cdkBuilder.moveKeysOptions(moveKeysOptions.let(MoveKeysProperty.Companion::unwrap))
    }

    /**
     * Options for moving keys.
     *
     * Required when type is MOVE_KEYS.
     *
     * Default: - No move key processor is created if props not set
     *
     * @param moveKeysOptions Options for moving keys. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e21cce8bda7ccd567ea99986bf69ca30e0c82417e740894abf1a8d515a4006d")
    override fun moveKeysOptions(moveKeysOptions: MoveKeysProperty.Builder.() -> Unit): Unit =
        moveKeysOptions(MoveKeysProperty(moveKeysOptions))

    /**
     * Options for renaming keys.
     *
     * Required when type is RENAME_KEYS.
     *
     * Default: - No rename key processor is created if props not set
     *
     * @param renameKeysOptions Options for renaming keys. 
     */
    override fun renameKeysOptions(renameKeysOptions: RenameKeysProperty) {
      cdkBuilder.renameKeysOptions(renameKeysOptions.let(RenameKeysProperty.Companion::unwrap))
    }

    /**
     * Options for renaming keys.
     *
     * Required when type is RENAME_KEYS.
     *
     * Default: - No rename key processor is created if props not set
     *
     * @param renameKeysOptions Options for renaming keys. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecb7d01fba05abcee20ed26158819c045780015d10c596cfaed2f1998a40ee1a")
    override fun renameKeysOptions(renameKeysOptions: RenameKeysProperty.Builder.() -> Unit): Unit =
        renameKeysOptions(RenameKeysProperty(renameKeysOptions))

    /**
     * The type of JSON mutation operation.
     *
     * @param type The type of JSON mutation operation. 
     */
    override fun type(type: JsonMutatorType) {
      cdkBuilder.type(type.let(JsonMutatorType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.JsonMutatorProcessor =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonMutatorProcessor {
      val builderImpl = BuilderImpl()
      return JsonMutatorProcessor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.JsonMutatorProcessor):
        JsonMutatorProcessor = JsonMutatorProcessor(cdkObject)

    internal fun unwrap(wrapped: JsonMutatorProcessor):
        software.amazon.awscdk.services.logs.JsonMutatorProcessor = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.JsonMutatorProcessor
  }
}
