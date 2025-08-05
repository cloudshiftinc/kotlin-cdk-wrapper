@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Parser processor for common data formats.
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
public open class ParserProcessor(
  cdkObject: software.amazon.awscdk.services.logs.ParserProcessor,
) : CdkObject(cdkObject),
    IProcessor {
  public constructor(props: ParserProcessorProps) :
      this(software.amazon.awscdk.services.logs.ParserProcessor(props.let(ParserProcessorProps.Companion::unwrap))
  )

  public constructor(props: ParserProcessorProps.Builder.() -> Unit) :
      this(ParserProcessorProps(props)
  )

  /**
   * The type of parser.
   */
  public open fun type(): ParserProcessorType =
      unwrap(this).getType().let(ParserProcessorType::wrap)

  /**
   * The type of parser.
   */
  public open fun type(`value`: ParserProcessorType) {
    unwrap(this).setType(`value`.let(ParserProcessorType.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.ParserProcessor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Options for CSV parser.
     *
     * Required when type is CSV.
     *
     * Default: - No CSV parser is created if props not set
     *
     * @param csvOptions Options for CSV parser. 
     */
    public fun csvOptions(csvOptions: CsvProperty)

    /**
     * Options for CSV parser.
     *
     * Required when type is CSV.
     *
     * Default: - No CSV parser is created if props not set
     *
     * @param csvOptions Options for CSV parser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da6de75e0fb1aa73a6d251a929b1574c4a347b0ec6845681501651c0ab40b079")
    public fun csvOptions(csvOptions: CsvProperty.Builder.() -> Unit)

    /**
     * Options for Grok parser.
     *
     * Required when type is GROK.
     *
     * Default: - No Grok parser is created if props not set
     *
     * @param grokOptions Options for Grok parser. 
     */
    public fun grokOptions(grokOptions: GrokProperty)

    /**
     * Options for Grok parser.
     *
     * Required when type is GROK.
     *
     * Default: - No Grok parser is created if props not set
     *
     * @param grokOptions Options for Grok parser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c686eedcaf80385b04701d12aad78e63142ec2c8905970608c82b97e9a4b55f")
    public fun grokOptions(grokOptions: GrokProperty.Builder.() -> Unit)

    /**
     * Options for JSON parser.
     *
     * Required when type is JSON.
     *
     * Default: - No JSON parser is created if props not set
     *
     * @param jsonOptions Options for JSON parser. 
     */
    public fun jsonOptions(jsonOptions: ParseJSONProperty)

    /**
     * Options for JSON parser.
     *
     * Required when type is JSON.
     *
     * Default: - No JSON parser is created if props not set
     *
     * @param jsonOptions Options for JSON parser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b18a7dfebca586a8c50335854cc923c17303496e6e31711d9d4bddff0c0fcb08")
    public fun jsonOptions(jsonOptions: ParseJSONProperty.Builder.() -> Unit)

    /**
     * Options for key-value parser.
     *
     * Required when type is KEY_VALUE.
     *
     * Default: - No key-value parser is created if props not set
     *
     * @param keyValueOptions Options for key-value parser. 
     */
    public fun keyValueOptions(keyValueOptions: ParseKeyValueProperty)

    /**
     * Options for key-value parser.
     *
     * Required when type is KEY_VALUE.
     *
     * Default: - No key-value parser is created if props not set
     *
     * @param keyValueOptions Options for key-value parser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("233f5c7c8d1e2617764719b33ca384aec457d38130833475e0a76aa11efac7d0")
    public fun keyValueOptions(keyValueOptions: ParseKeyValueProperty.Builder.() -> Unit)

    /**
     * Options for ParseToOCSF parser.
     *
     * Required when type is set to OCSF
     *
     * Default: - no OCSF parser is created.
     *
     * @param parseToOcsfOptions Options for ParseToOCSF parser. 
     */
    public fun parseToOcsfOptions(parseToOcsfOptions: ParseToOCSFProperty)

    /**
     * Options for ParseToOCSF parser.
     *
     * Required when type is set to OCSF
     *
     * Default: - no OCSF parser is created.
     *
     * @param parseToOcsfOptions Options for ParseToOCSF parser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("388a0ade7a2ad339690e4fd759a9868fd1f1b4ee8b7ed36d9097169c12f54480")
    public fun parseToOcsfOptions(parseToOcsfOptions: ParseToOCSFProperty.Builder.() -> Unit)

    /**
     * The type of parser processor.
     *
     * @param type The type of parser processor. 
     */
    public fun type(type: ParserProcessorType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ParserProcessor.Builder =
        software.amazon.awscdk.services.logs.ParserProcessor.Builder.create()

    /**
     * Options for CSV parser.
     *
     * Required when type is CSV.
     *
     * Default: - No CSV parser is created if props not set
     *
     * @param csvOptions Options for CSV parser. 
     */
    override fun csvOptions(csvOptions: CsvProperty) {
      cdkBuilder.csvOptions(csvOptions.let(CsvProperty.Companion::unwrap))
    }

    /**
     * Options for CSV parser.
     *
     * Required when type is CSV.
     *
     * Default: - No CSV parser is created if props not set
     *
     * @param csvOptions Options for CSV parser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da6de75e0fb1aa73a6d251a929b1574c4a347b0ec6845681501651c0ab40b079")
    override fun csvOptions(csvOptions: CsvProperty.Builder.() -> Unit): Unit =
        csvOptions(CsvProperty(csvOptions))

    /**
     * Options for Grok parser.
     *
     * Required when type is GROK.
     *
     * Default: - No Grok parser is created if props not set
     *
     * @param grokOptions Options for Grok parser. 
     */
    override fun grokOptions(grokOptions: GrokProperty) {
      cdkBuilder.grokOptions(grokOptions.let(GrokProperty.Companion::unwrap))
    }

    /**
     * Options for Grok parser.
     *
     * Required when type is GROK.
     *
     * Default: - No Grok parser is created if props not set
     *
     * @param grokOptions Options for Grok parser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c686eedcaf80385b04701d12aad78e63142ec2c8905970608c82b97e9a4b55f")
    override fun grokOptions(grokOptions: GrokProperty.Builder.() -> Unit): Unit =
        grokOptions(GrokProperty(grokOptions))

    /**
     * Options for JSON parser.
     *
     * Required when type is JSON.
     *
     * Default: - No JSON parser is created if props not set
     *
     * @param jsonOptions Options for JSON parser. 
     */
    override fun jsonOptions(jsonOptions: ParseJSONProperty) {
      cdkBuilder.jsonOptions(jsonOptions.let(ParseJSONProperty.Companion::unwrap))
    }

    /**
     * Options for JSON parser.
     *
     * Required when type is JSON.
     *
     * Default: - No JSON parser is created if props not set
     *
     * @param jsonOptions Options for JSON parser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b18a7dfebca586a8c50335854cc923c17303496e6e31711d9d4bddff0c0fcb08")
    override fun jsonOptions(jsonOptions: ParseJSONProperty.Builder.() -> Unit): Unit =
        jsonOptions(ParseJSONProperty(jsonOptions))

    /**
     * Options for key-value parser.
     *
     * Required when type is KEY_VALUE.
     *
     * Default: - No key-value parser is created if props not set
     *
     * @param keyValueOptions Options for key-value parser. 
     */
    override fun keyValueOptions(keyValueOptions: ParseKeyValueProperty) {
      cdkBuilder.keyValueOptions(keyValueOptions.let(ParseKeyValueProperty.Companion::unwrap))
    }

    /**
     * Options for key-value parser.
     *
     * Required when type is KEY_VALUE.
     *
     * Default: - No key-value parser is created if props not set
     *
     * @param keyValueOptions Options for key-value parser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("233f5c7c8d1e2617764719b33ca384aec457d38130833475e0a76aa11efac7d0")
    override fun keyValueOptions(keyValueOptions: ParseKeyValueProperty.Builder.() -> Unit): Unit =
        keyValueOptions(ParseKeyValueProperty(keyValueOptions))

    /**
     * Options for ParseToOCSF parser.
     *
     * Required when type is set to OCSF
     *
     * Default: - no OCSF parser is created.
     *
     * @param parseToOcsfOptions Options for ParseToOCSF parser. 
     */
    override fun parseToOcsfOptions(parseToOcsfOptions: ParseToOCSFProperty) {
      cdkBuilder.parseToOcsfOptions(parseToOcsfOptions.let(ParseToOCSFProperty.Companion::unwrap))
    }

    /**
     * Options for ParseToOCSF parser.
     *
     * Required when type is set to OCSF
     *
     * Default: - no OCSF parser is created.
     *
     * @param parseToOcsfOptions Options for ParseToOCSF parser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("388a0ade7a2ad339690e4fd759a9868fd1f1b4ee8b7ed36d9097169c12f54480")
    override fun parseToOcsfOptions(parseToOcsfOptions: ParseToOCSFProperty.Builder.() -> Unit):
        Unit = parseToOcsfOptions(ParseToOCSFProperty(parseToOcsfOptions))

    /**
     * The type of parser processor.
     *
     * @param type The type of parser processor. 
     */
    override fun type(type: ParserProcessorType) {
      cdkBuilder.type(type.let(ParserProcessorType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.ParserProcessor = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParserProcessor {
      val builderImpl = BuilderImpl()
      return ParserProcessor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ParserProcessor):
        ParserProcessor = ParserProcessor(cdkObject)

    internal fun unwrap(wrapped: ParserProcessor):
        software.amazon.awscdk.services.logs.ParserProcessor = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.ParserProcessor
  }
}
