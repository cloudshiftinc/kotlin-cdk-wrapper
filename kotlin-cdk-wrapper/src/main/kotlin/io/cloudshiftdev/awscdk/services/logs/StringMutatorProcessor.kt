@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Processor for string mutation operations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * StringMutatorProcessor stringMutatorProcessor = StringMutatorProcessor.Builder.create()
 * .type(StringMutatorType.LOWER_CASE)
 * // the properties below are optional
 * .lowerCaseKeys(List.of("lowerCaseKeys"))
 * .splitOptions(SplitStringProperty.builder()
 * .entries(List.of(SplitStringEntryProperty.builder()
 * .delimiter(DelimiterCharacter.COMMA)
 * .source("source")
 * .build()))
 * .build())
 * .substituteOptions(SubstituteStringProperty.builder()
 * .entries(List.of(SubstituteStringEntryProperty.builder()
 * .from("from")
 * .source("source")
 * .to("to")
 * .build()))
 * .build())
 * .trimKeys(List.of("trimKeys"))
 * .upperCaseKeys(List.of("upperCaseKeys"))
 * .build();
 * ```
 */
public open class StringMutatorProcessor(
  cdkObject: software.amazon.awscdk.services.logs.StringMutatorProcessor,
) : CdkObject(cdkObject),
    IProcessor {
  public constructor(props: StringMutatorProps) :
      this(software.amazon.awscdk.services.logs.StringMutatorProcessor(props.let(StringMutatorProps.Companion::unwrap))
  )

  public constructor(props: StringMutatorProps.Builder.() -> Unit) : this(StringMutatorProps(props)
  )

  /**
   * The type of string mutation operation.
   */
  public open fun type(): StringMutatorType = unwrap(this).getType().let(StringMutatorType::wrap)

  /**
   * The type of string mutation operation.
   */
  public open fun type(`value`: StringMutatorType) {
    unwrap(this).setType(`value`.let(StringMutatorType.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.StringMutatorProcessor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Keys for strings to convert to lowercase.
     *
     * Required when type is LOWER_CASE.
     *
     * Default: - No lowercase processor is created if props not set
     *
     * @param lowerCaseKeys Keys for strings to convert to lowercase. 
     */
    public fun lowerCaseKeys(lowerCaseKeys: List<String>)

    /**
     * Keys for strings to convert to lowercase.
     *
     * Required when type is LOWER_CASE.
     *
     * Default: - No lowercase processor is created if props not set
     *
     * @param lowerCaseKeys Keys for strings to convert to lowercase. 
     */
    public fun lowerCaseKeys(vararg lowerCaseKeys: String)

    /**
     * Options for string splitting.
     *
     * Required when type is SPLIT.
     *
     * Default: - No string splitting processor is created if props not set
     *
     * @param splitOptions Options for string splitting. 
     */
    public fun splitOptions(splitOptions: SplitStringProperty)

    /**
     * Options for string splitting.
     *
     * Required when type is SPLIT.
     *
     * Default: - No string splitting processor is created if props not set
     *
     * @param splitOptions Options for string splitting. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7728310f71e572cb017a1521040e099288b7111be1a3e51bbaa47ee561c33642")
    public fun splitOptions(splitOptions: SplitStringProperty.Builder.() -> Unit)

    /**
     * Options for string substitution.
     *
     * Required when type is SUBSTITUTE.
     *
     * Default: - No string substitution processor is created if props not set
     *
     * @param substituteOptions Options for string substitution. 
     */
    public fun substituteOptions(substituteOptions: SubstituteStringProperty)

    /**
     * Options for string substitution.
     *
     * Required when type is SUBSTITUTE.
     *
     * Default: - No string substitution processor is created if props not set
     *
     * @param substituteOptions Options for string substitution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f77c4ac79fc407a797a36f5306ce0049fbf6ca18f7bdd6e878fb055b19f74987")
    public fun substituteOptions(substituteOptions: SubstituteStringProperty.Builder.() -> Unit)

    /**
     * Keys for strings to trim.
     *
     * Required when type is TRIM.
     *
     * Default: - No trim processor is created if props not set
     *
     * @param trimKeys Keys for strings to trim. 
     */
    public fun trimKeys(trimKeys: List<String>)

    /**
     * Keys for strings to trim.
     *
     * Required when type is TRIM.
     *
     * Default: - No trim processor is created if props not set
     *
     * @param trimKeys Keys for strings to trim. 
     */
    public fun trimKeys(vararg trimKeys: String)

    /**
     * The type of string mutation operation.
     *
     * @param type The type of string mutation operation. 
     */
    public fun type(type: StringMutatorType)

    /**
     * Keys for strings to convert to uppercase.
     *
     * Required when type is UPPER_CASE.
     *
     * Default: - No uppercase processor is created if props not set
     *
     * @param upperCaseKeys Keys for strings to convert to uppercase. 
     */
    public fun upperCaseKeys(upperCaseKeys: List<String>)

    /**
     * Keys for strings to convert to uppercase.
     *
     * Required when type is UPPER_CASE.
     *
     * Default: - No uppercase processor is created if props not set
     *
     * @param upperCaseKeys Keys for strings to convert to uppercase. 
     */
    public fun upperCaseKeys(vararg upperCaseKeys: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.StringMutatorProcessor.Builder =
        software.amazon.awscdk.services.logs.StringMutatorProcessor.Builder.create()

    /**
     * Keys for strings to convert to lowercase.
     *
     * Required when type is LOWER_CASE.
     *
     * Default: - No lowercase processor is created if props not set
     *
     * @param lowerCaseKeys Keys for strings to convert to lowercase. 
     */
    override fun lowerCaseKeys(lowerCaseKeys: List<String>) {
      cdkBuilder.lowerCaseKeys(lowerCaseKeys)
    }

    /**
     * Keys for strings to convert to lowercase.
     *
     * Required when type is LOWER_CASE.
     *
     * Default: - No lowercase processor is created if props not set
     *
     * @param lowerCaseKeys Keys for strings to convert to lowercase. 
     */
    override fun lowerCaseKeys(vararg lowerCaseKeys: String): Unit =
        lowerCaseKeys(lowerCaseKeys.toList())

    /**
     * Options for string splitting.
     *
     * Required when type is SPLIT.
     *
     * Default: - No string splitting processor is created if props not set
     *
     * @param splitOptions Options for string splitting. 
     */
    override fun splitOptions(splitOptions: SplitStringProperty) {
      cdkBuilder.splitOptions(splitOptions.let(SplitStringProperty.Companion::unwrap))
    }

    /**
     * Options for string splitting.
     *
     * Required when type is SPLIT.
     *
     * Default: - No string splitting processor is created if props not set
     *
     * @param splitOptions Options for string splitting. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7728310f71e572cb017a1521040e099288b7111be1a3e51bbaa47ee561c33642")
    override fun splitOptions(splitOptions: SplitStringProperty.Builder.() -> Unit): Unit =
        splitOptions(SplitStringProperty(splitOptions))

    /**
     * Options for string substitution.
     *
     * Required when type is SUBSTITUTE.
     *
     * Default: - No string substitution processor is created if props not set
     *
     * @param substituteOptions Options for string substitution. 
     */
    override fun substituteOptions(substituteOptions: SubstituteStringProperty) {
      cdkBuilder.substituteOptions(substituteOptions.let(SubstituteStringProperty.Companion::unwrap))
    }

    /**
     * Options for string substitution.
     *
     * Required when type is SUBSTITUTE.
     *
     * Default: - No string substitution processor is created if props not set
     *
     * @param substituteOptions Options for string substitution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f77c4ac79fc407a797a36f5306ce0049fbf6ca18f7bdd6e878fb055b19f74987")
    override fun substituteOptions(substituteOptions: SubstituteStringProperty.Builder.() -> Unit):
        Unit = substituteOptions(SubstituteStringProperty(substituteOptions))

    /**
     * Keys for strings to trim.
     *
     * Required when type is TRIM.
     *
     * Default: - No trim processor is created if props not set
     *
     * @param trimKeys Keys for strings to trim. 
     */
    override fun trimKeys(trimKeys: List<String>) {
      cdkBuilder.trimKeys(trimKeys)
    }

    /**
     * Keys for strings to trim.
     *
     * Required when type is TRIM.
     *
     * Default: - No trim processor is created if props not set
     *
     * @param trimKeys Keys for strings to trim. 
     */
    override fun trimKeys(vararg trimKeys: String): Unit = trimKeys(trimKeys.toList())

    /**
     * The type of string mutation operation.
     *
     * @param type The type of string mutation operation. 
     */
    override fun type(type: StringMutatorType) {
      cdkBuilder.type(type.let(StringMutatorType.Companion::unwrap))
    }

    /**
     * Keys for strings to convert to uppercase.
     *
     * Required when type is UPPER_CASE.
     *
     * Default: - No uppercase processor is created if props not set
     *
     * @param upperCaseKeys Keys for strings to convert to uppercase. 
     */
    override fun upperCaseKeys(upperCaseKeys: List<String>) {
      cdkBuilder.upperCaseKeys(upperCaseKeys)
    }

    /**
     * Keys for strings to convert to uppercase.
     *
     * Required when type is UPPER_CASE.
     *
     * Default: - No uppercase processor is created if props not set
     *
     * @param upperCaseKeys Keys for strings to convert to uppercase. 
     */
    override fun upperCaseKeys(vararg upperCaseKeys: String): Unit =
        upperCaseKeys(upperCaseKeys.toList())

    public fun build(): software.amazon.awscdk.services.logs.StringMutatorProcessor =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringMutatorProcessor {
      val builderImpl = BuilderImpl()
      return StringMutatorProcessor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.StringMutatorProcessor):
        StringMutatorProcessor = StringMutatorProcessor(cdkObject)

    internal fun unwrap(wrapped: StringMutatorProcessor):
        software.amazon.awscdk.services.logs.StringMutatorProcessor = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.StringMutatorProcessor
  }
}
