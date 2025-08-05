@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for creating string mutator processors.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * StringMutatorProps stringMutatorProps = StringMutatorProps.builder()
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
public interface StringMutatorProps : BaseProcessorProps {
  /**
   * Keys for strings to convert to lowercase.
   *
   * Required when type is LOWER_CASE.
   *
   * Default: - No lowercase processor is created if props not set
   */
  public fun lowerCaseKeys(): List<String> = unwrap(this).getLowerCaseKeys() ?: emptyList()

  /**
   * Options for string splitting.
   *
   * Required when type is SPLIT.
   *
   * Default: - No string splitting processor is created if props not set
   */
  public fun splitOptions(): SplitStringProperty? =
      unwrap(this).getSplitOptions()?.let(SplitStringProperty::wrap)

  /**
   * Options for string substitution.
   *
   * Required when type is SUBSTITUTE.
   *
   * Default: - No string substitution processor is created if props not set
   */
  public fun substituteOptions(): SubstituteStringProperty? =
      unwrap(this).getSubstituteOptions()?.let(SubstituteStringProperty::wrap)

  /**
   * Keys for strings to trim.
   *
   * Required when type is TRIM.
   *
   * Default: - No trim processor is created if props not set
   */
  public fun trimKeys(): List<String> = unwrap(this).getTrimKeys() ?: emptyList()

  /**
   * The type of string mutation operation.
   */
  public fun type(): StringMutatorType

  /**
   * Keys for strings to convert to uppercase.
   *
   * Required when type is UPPER_CASE.
   *
   * Default: - No uppercase processor is created if props not set
   */
  public fun upperCaseKeys(): List<String> = unwrap(this).getUpperCaseKeys() ?: emptyList()

  /**
   * A builder for [StringMutatorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param lowerCaseKeys Keys for strings to convert to lowercase.
     * Required when type is LOWER_CASE.
     */
    public fun lowerCaseKeys(lowerCaseKeys: List<String>)

    /**
     * @param lowerCaseKeys Keys for strings to convert to lowercase.
     * Required when type is LOWER_CASE.
     */
    public fun lowerCaseKeys(vararg lowerCaseKeys: String)

    /**
     * @param splitOptions Options for string splitting.
     * Required when type is SPLIT.
     */
    public fun splitOptions(splitOptions: SplitStringProperty)

    /**
     * @param splitOptions Options for string splitting.
     * Required when type is SPLIT.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("309405ad12ce97df2770655cc0d5a12a61690a9272b7325c79fb4726806b1c59")
    public fun splitOptions(splitOptions: SplitStringProperty.Builder.() -> Unit)

    /**
     * @param substituteOptions Options for string substitution.
     * Required when type is SUBSTITUTE.
     */
    public fun substituteOptions(substituteOptions: SubstituteStringProperty)

    /**
     * @param substituteOptions Options for string substitution.
     * Required when type is SUBSTITUTE.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("156359e0c02d4ce71d79220f8a7b628e1efa84a167d186cae52a7778387a84fb")
    public fun substituteOptions(substituteOptions: SubstituteStringProperty.Builder.() -> Unit)

    /**
     * @param trimKeys Keys for strings to trim.
     * Required when type is TRIM.
     */
    public fun trimKeys(trimKeys: List<String>)

    /**
     * @param trimKeys Keys for strings to trim.
     * Required when type is TRIM.
     */
    public fun trimKeys(vararg trimKeys: String)

    /**
     * @param type The type of string mutation operation. 
     */
    public fun type(type: StringMutatorType)

    /**
     * @param upperCaseKeys Keys for strings to convert to uppercase.
     * Required when type is UPPER_CASE.
     */
    public fun upperCaseKeys(upperCaseKeys: List<String>)

    /**
     * @param upperCaseKeys Keys for strings to convert to uppercase.
     * Required when type is UPPER_CASE.
     */
    public fun upperCaseKeys(vararg upperCaseKeys: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.StringMutatorProps.Builder =
        software.amazon.awscdk.services.logs.StringMutatorProps.builder()

    /**
     * @param lowerCaseKeys Keys for strings to convert to lowercase.
     * Required when type is LOWER_CASE.
     */
    override fun lowerCaseKeys(lowerCaseKeys: List<String>) {
      cdkBuilder.lowerCaseKeys(lowerCaseKeys)
    }

    /**
     * @param lowerCaseKeys Keys for strings to convert to lowercase.
     * Required when type is LOWER_CASE.
     */
    override fun lowerCaseKeys(vararg lowerCaseKeys: String): Unit =
        lowerCaseKeys(lowerCaseKeys.toList())

    /**
     * @param splitOptions Options for string splitting.
     * Required when type is SPLIT.
     */
    override fun splitOptions(splitOptions: SplitStringProperty) {
      cdkBuilder.splitOptions(splitOptions.let(SplitStringProperty.Companion::unwrap))
    }

    /**
     * @param splitOptions Options for string splitting.
     * Required when type is SPLIT.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("309405ad12ce97df2770655cc0d5a12a61690a9272b7325c79fb4726806b1c59")
    override fun splitOptions(splitOptions: SplitStringProperty.Builder.() -> Unit): Unit =
        splitOptions(SplitStringProperty(splitOptions))

    /**
     * @param substituteOptions Options for string substitution.
     * Required when type is SUBSTITUTE.
     */
    override fun substituteOptions(substituteOptions: SubstituteStringProperty) {
      cdkBuilder.substituteOptions(substituteOptions.let(SubstituteStringProperty.Companion::unwrap))
    }

    /**
     * @param substituteOptions Options for string substitution.
     * Required when type is SUBSTITUTE.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("156359e0c02d4ce71d79220f8a7b628e1efa84a167d186cae52a7778387a84fb")
    override fun substituteOptions(substituteOptions: SubstituteStringProperty.Builder.() -> Unit):
        Unit = substituteOptions(SubstituteStringProperty(substituteOptions))

    /**
     * @param trimKeys Keys for strings to trim.
     * Required when type is TRIM.
     */
    override fun trimKeys(trimKeys: List<String>) {
      cdkBuilder.trimKeys(trimKeys)
    }

    /**
     * @param trimKeys Keys for strings to trim.
     * Required when type is TRIM.
     */
    override fun trimKeys(vararg trimKeys: String): Unit = trimKeys(trimKeys.toList())

    /**
     * @param type The type of string mutation operation. 
     */
    override fun type(type: StringMutatorType) {
      cdkBuilder.type(type.let(StringMutatorType.Companion::unwrap))
    }

    /**
     * @param upperCaseKeys Keys for strings to convert to uppercase.
     * Required when type is UPPER_CASE.
     */
    override fun upperCaseKeys(upperCaseKeys: List<String>) {
      cdkBuilder.upperCaseKeys(upperCaseKeys)
    }

    /**
     * @param upperCaseKeys Keys for strings to convert to uppercase.
     * Required when type is UPPER_CASE.
     */
    override fun upperCaseKeys(vararg upperCaseKeys: String): Unit =
        upperCaseKeys(upperCaseKeys.toList())

    public fun build(): software.amazon.awscdk.services.logs.StringMutatorProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.StringMutatorProps,
  ) : CdkObject(cdkObject),
      StringMutatorProps {
    /**
     * Keys for strings to convert to lowercase.
     *
     * Required when type is LOWER_CASE.
     *
     * Default: - No lowercase processor is created if props not set
     */
    override fun lowerCaseKeys(): List<String> = unwrap(this).getLowerCaseKeys() ?: emptyList()

    /**
     * Options for string splitting.
     *
     * Required when type is SPLIT.
     *
     * Default: - No string splitting processor is created if props not set
     */
    override fun splitOptions(): SplitStringProperty? =
        unwrap(this).getSplitOptions()?.let(SplitStringProperty::wrap)

    /**
     * Options for string substitution.
     *
     * Required when type is SUBSTITUTE.
     *
     * Default: - No string substitution processor is created if props not set
     */
    override fun substituteOptions(): SubstituteStringProperty? =
        unwrap(this).getSubstituteOptions()?.let(SubstituteStringProperty::wrap)

    /**
     * Keys for strings to trim.
     *
     * Required when type is TRIM.
     *
     * Default: - No trim processor is created if props not set
     */
    override fun trimKeys(): List<String> = unwrap(this).getTrimKeys() ?: emptyList()

    /**
     * The type of string mutation operation.
     */
    override fun type(): StringMutatorType = unwrap(this).getType().let(StringMutatorType::wrap)

    /**
     * Keys for strings to convert to uppercase.
     *
     * Required when type is UPPER_CASE.
     *
     * Default: - No uppercase processor is created if props not set
     */
    override fun upperCaseKeys(): List<String> = unwrap(this).getUpperCaseKeys() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringMutatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.StringMutatorProps):
        StringMutatorProps = CdkObjectWrappers.wrap(cdkObject) as? StringMutatorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringMutatorProps):
        software.amazon.awscdk.services.logs.StringMutatorProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.StringMutatorProps
  }
}
