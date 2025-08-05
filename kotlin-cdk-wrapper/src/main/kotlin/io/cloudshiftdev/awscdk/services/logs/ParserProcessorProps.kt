@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for creating configurable parser processors.
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
public interface ParserProcessorProps : BaseProcessorProps {
  /**
   * Options for CSV parser.
   *
   * Required when type is CSV.
   *
   * Default: - No CSV parser is created if props not set
   */
  public fun csvOptions(): CsvProperty? = unwrap(this).getCsvOptions()?.let(CsvProperty::wrap)

  /**
   * Options for Grok parser.
   *
   * Required when type is GROK.
   *
   * Default: - No Grok parser is created if props not set
   */
  public fun grokOptions(): GrokProperty? = unwrap(this).getGrokOptions()?.let(GrokProperty::wrap)

  /**
   * Options for JSON parser.
   *
   * Required when type is JSON.
   *
   * Default: - No JSON parser is created if props not set
   */
  public fun jsonOptions(): ParseJSONProperty? =
      unwrap(this).getJsonOptions()?.let(ParseJSONProperty::wrap)

  /**
   * Options for key-value parser.
   *
   * Required when type is KEY_VALUE.
   *
   * Default: - No key-value parser is created if props not set
   */
  public fun keyValueOptions(): ParseKeyValueProperty? =
      unwrap(this).getKeyValueOptions()?.let(ParseKeyValueProperty::wrap)

  /**
   * Options for ParseToOCSF parser.
   *
   * Required when type is set to OCSF
   *
   * Default: - no OCSF parser is created.
   */
  public fun parseToOCSFOptions(): ParseToOCSFProperty? =
      unwrap(this).getParseToOCSFOptions()?.let(ParseToOCSFProperty::wrap)

  /**
   * The type of parser processor.
   */
  public fun type(): ParserProcessorType

  /**
   * A builder for [ParserProcessorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param csvOptions Options for CSV parser.
     * Required when type is CSV.
     */
    public fun csvOptions(csvOptions: CsvProperty)

    /**
     * @param csvOptions Options for CSV parser.
     * Required when type is CSV.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb84b878df84692dc2434495682ce3b67767a687a889e857497dc8cd32cf90bb")
    public fun csvOptions(csvOptions: CsvProperty.Builder.() -> Unit)

    /**
     * @param grokOptions Options for Grok parser.
     * Required when type is GROK.
     */
    public fun grokOptions(grokOptions: GrokProperty)

    /**
     * @param grokOptions Options for Grok parser.
     * Required when type is GROK.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d17043f47ea341fa100e0263efa796702bd3fe282049d5f43ee012861c2822b5")
    public fun grokOptions(grokOptions: GrokProperty.Builder.() -> Unit)

    /**
     * @param jsonOptions Options for JSON parser.
     * Required when type is JSON.
     */
    public fun jsonOptions(jsonOptions: ParseJSONProperty)

    /**
     * @param jsonOptions Options for JSON parser.
     * Required when type is JSON.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92228fd205ccf822797cdc371021166bea9e22901c39dbe0121bb9b7a8c57011")
    public fun jsonOptions(jsonOptions: ParseJSONProperty.Builder.() -> Unit)

    /**
     * @param keyValueOptions Options for key-value parser.
     * Required when type is KEY_VALUE.
     */
    public fun keyValueOptions(keyValueOptions: ParseKeyValueProperty)

    /**
     * @param keyValueOptions Options for key-value parser.
     * Required when type is KEY_VALUE.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b069a1a14f89c5146e7b4c6d373f92bcabfb6884e85ef34f2c4c3376cabc8015")
    public fun keyValueOptions(keyValueOptions: ParseKeyValueProperty.Builder.() -> Unit)

    /**
     * @param parseToOcsfOptions Options for ParseToOCSF parser.
     * Required when type is set to OCSF
     */
    public fun parseToOcsfOptions(parseToOcsfOptions: ParseToOCSFProperty)

    /**
     * @param parseToOcsfOptions Options for ParseToOCSF parser.
     * Required when type is set to OCSF
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e7b1dec67dab0e0fbeaf1de8f1818ee66f0c8fa1c651ef37934502e1e022308")
    public fun parseToOcsfOptions(parseToOcsfOptions: ParseToOCSFProperty.Builder.() -> Unit)

    /**
     * @param type The type of parser processor. 
     */
    public fun type(type: ParserProcessorType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ParserProcessorProps.Builder =
        software.amazon.awscdk.services.logs.ParserProcessorProps.builder()

    /**
     * @param csvOptions Options for CSV parser.
     * Required when type is CSV.
     */
    override fun csvOptions(csvOptions: CsvProperty) {
      cdkBuilder.csvOptions(csvOptions.let(CsvProperty.Companion::unwrap))
    }

    /**
     * @param csvOptions Options for CSV parser.
     * Required when type is CSV.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb84b878df84692dc2434495682ce3b67767a687a889e857497dc8cd32cf90bb")
    override fun csvOptions(csvOptions: CsvProperty.Builder.() -> Unit): Unit =
        csvOptions(CsvProperty(csvOptions))

    /**
     * @param grokOptions Options for Grok parser.
     * Required when type is GROK.
     */
    override fun grokOptions(grokOptions: GrokProperty) {
      cdkBuilder.grokOptions(grokOptions.let(GrokProperty.Companion::unwrap))
    }

    /**
     * @param grokOptions Options for Grok parser.
     * Required when type is GROK.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d17043f47ea341fa100e0263efa796702bd3fe282049d5f43ee012861c2822b5")
    override fun grokOptions(grokOptions: GrokProperty.Builder.() -> Unit): Unit =
        grokOptions(GrokProperty(grokOptions))

    /**
     * @param jsonOptions Options for JSON parser.
     * Required when type is JSON.
     */
    override fun jsonOptions(jsonOptions: ParseJSONProperty) {
      cdkBuilder.jsonOptions(jsonOptions.let(ParseJSONProperty.Companion::unwrap))
    }

    /**
     * @param jsonOptions Options for JSON parser.
     * Required when type is JSON.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92228fd205ccf822797cdc371021166bea9e22901c39dbe0121bb9b7a8c57011")
    override fun jsonOptions(jsonOptions: ParseJSONProperty.Builder.() -> Unit): Unit =
        jsonOptions(ParseJSONProperty(jsonOptions))

    /**
     * @param keyValueOptions Options for key-value parser.
     * Required when type is KEY_VALUE.
     */
    override fun keyValueOptions(keyValueOptions: ParseKeyValueProperty) {
      cdkBuilder.keyValueOptions(keyValueOptions.let(ParseKeyValueProperty.Companion::unwrap))
    }

    /**
     * @param keyValueOptions Options for key-value parser.
     * Required when type is KEY_VALUE.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b069a1a14f89c5146e7b4c6d373f92bcabfb6884e85ef34f2c4c3376cabc8015")
    override fun keyValueOptions(keyValueOptions: ParseKeyValueProperty.Builder.() -> Unit): Unit =
        keyValueOptions(ParseKeyValueProperty(keyValueOptions))

    /**
     * @param parseToOcsfOptions Options for ParseToOCSF parser.
     * Required when type is set to OCSF
     */
    override fun parseToOcsfOptions(parseToOcsfOptions: ParseToOCSFProperty) {
      cdkBuilder.parseToOcsfOptions(parseToOcsfOptions.let(ParseToOCSFProperty.Companion::unwrap))
    }

    /**
     * @param parseToOcsfOptions Options for ParseToOCSF parser.
     * Required when type is set to OCSF
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e7b1dec67dab0e0fbeaf1de8f1818ee66f0c8fa1c651ef37934502e1e022308")
    override fun parseToOcsfOptions(parseToOcsfOptions: ParseToOCSFProperty.Builder.() -> Unit):
        Unit = parseToOcsfOptions(ParseToOCSFProperty(parseToOcsfOptions))

    /**
     * @param type The type of parser processor. 
     */
    override fun type(type: ParserProcessorType) {
      cdkBuilder.type(type.let(ParserProcessorType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.ParserProcessorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.ParserProcessorProps,
  ) : CdkObject(cdkObject),
      ParserProcessorProps {
    /**
     * Options for CSV parser.
     *
     * Required when type is CSV.
     *
     * Default: - No CSV parser is created if props not set
     */
    override fun csvOptions(): CsvProperty? = unwrap(this).getCsvOptions()?.let(CsvProperty::wrap)

    /**
     * Options for Grok parser.
     *
     * Required when type is GROK.
     *
     * Default: - No Grok parser is created if props not set
     */
    override fun grokOptions(): GrokProperty? =
        unwrap(this).getGrokOptions()?.let(GrokProperty::wrap)

    /**
     * Options for JSON parser.
     *
     * Required when type is JSON.
     *
     * Default: - No JSON parser is created if props not set
     */
    override fun jsonOptions(): ParseJSONProperty? =
        unwrap(this).getJsonOptions()?.let(ParseJSONProperty::wrap)

    /**
     * Options for key-value parser.
     *
     * Required when type is KEY_VALUE.
     *
     * Default: - No key-value parser is created if props not set
     */
    override fun keyValueOptions(): ParseKeyValueProperty? =
        unwrap(this).getKeyValueOptions()?.let(ParseKeyValueProperty::wrap)

    /**
     * Options for ParseToOCSF parser.
     *
     * Required when type is set to OCSF
     *
     * Default: - no OCSF parser is created.
     */
    override fun parseToOCSFOptions(): ParseToOCSFProperty? =
        unwrap(this).getParseToOCSFOptions()?.let(ParseToOCSFProperty::wrap)

    /**
     * The type of parser processor.
     */
    override fun type(): ParserProcessorType = unwrap(this).getType().let(ParserProcessorType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParserProcessorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ParserProcessorProps):
        ParserProcessorProps = CdkObjectWrappers.wrap(cdkObject) as? ParserProcessorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParserProcessorProps):
        software.amazon.awscdk.services.logs.ParserProcessorProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.ParserProcessorProps
  }
}
