@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * This processor parses a specified field in the original log event into key-value pairs.
 *
 * For more information about this processor including examples, see parseKeyValue in the CloudWatch
 * Logs User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * ParseKeyValueProperty parseKeyValueProperty = ParseKeyValueProperty.builder()
 * .destination("destination")
 * .fieldDelimiter(KeyValuePairDelimiter.AMPERSAND)
 * .keyPrefix("keyPrefix")
 * .keyValueDelimiter(KeyValueDelimiter.EQUAL)
 * .nonMatchValue("nonMatchValue")
 * .overwriteIfExists(false)
 * .source("source")
 * .build();
 * ```
 */
public interface ParseKeyValueProperty {
  /**
   * The destination field to put the extracted key-value pairs into.
   *
   * Default: - Places at the root of the JSON input.
   */
  public fun destination(): String? = unwrap(this).getDestination()

  /**
   * The field delimiter string that is used between key-value pairs in the original log events.
   *
   * Default: KeyValuePairDelimiter.AMPERSAND
   */
  public fun fieldDelimiter(): KeyValuePairDelimiter? =
      unwrap(this).getFieldDelimiter()?.let(KeyValuePairDelimiter::wrap)

  /**
   * If you want to add a prefix to all transformed keys, specify it here.
   *
   * Default: - No prefix is added to the keys.
   */
  public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

  /**
   * The delimiter string to use between the key and value in each pair in the transformed log
   * event.
   *
   * Default: KeyValueDelimiter.EQUAL
   */
  public fun keyValueDelimiter(): KeyValueDelimiter? =
      unwrap(this).getKeyValueDelimiter()?.let(KeyValueDelimiter::wrap)

  /**
   * A value to insert into the value field in the result, when a key-value pair is not successfully
   * split.
   *
   * Default: - No values is inserted when split is not successful.
   */
  public fun nonMatchValue(): String? = unwrap(this).getNonMatchValue()

  /**
   * Specifies whether to overwrite the value if the destination key already exists.
   *
   * Default: false
   */
  public fun overwriteIfExists(): Boolean? = unwrap(this).getOverwriteIfExists()

  /**
   * Path to the field in the log event that will be parsed.
   *
   * Use dot notation to access child fields.
   *
   * Default: '@message'
   */
  public fun source(): String? = unwrap(this).getSource()

  /**
   * A builder for [ParseKeyValueProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destination The destination field to put the extracted key-value pairs into.
     */
    public fun destination(destination: String)

    /**
     * @param fieldDelimiter The field delimiter string that is used between key-value pairs in the
     * original log events.
     */
    public fun fieldDelimiter(fieldDelimiter: KeyValuePairDelimiter)

    /**
     * @param keyPrefix If you want to add a prefix to all transformed keys, specify it here.
     */
    public fun keyPrefix(keyPrefix: String)

    /**
     * @param keyValueDelimiter The delimiter string to use between the key and value in each pair
     * in the transformed log event.
     */
    public fun keyValueDelimiter(keyValueDelimiter: KeyValueDelimiter)

    /**
     * @param nonMatchValue A value to insert into the value field in the result, when a key-value
     * pair is not successfully split.
     */
    public fun nonMatchValue(nonMatchValue: String)

    /**
     * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
     * already exists.
     */
    public fun overwriteIfExists(overwriteIfExists: Boolean)

    /**
     * @param source Path to the field in the log event that will be parsed.
     * Use dot notation to access child fields.
     */
    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ParseKeyValueProperty.Builder =
        software.amazon.awscdk.services.logs.ParseKeyValueProperty.builder()

    /**
     * @param destination The destination field to put the extracted key-value pairs into.
     */
    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    /**
     * @param fieldDelimiter The field delimiter string that is used between key-value pairs in the
     * original log events.
     */
    override fun fieldDelimiter(fieldDelimiter: KeyValuePairDelimiter) {
      cdkBuilder.fieldDelimiter(fieldDelimiter.let(KeyValuePairDelimiter.Companion::unwrap))
    }

    /**
     * @param keyPrefix If you want to add a prefix to all transformed keys, specify it here.
     */
    override fun keyPrefix(keyPrefix: String) {
      cdkBuilder.keyPrefix(keyPrefix)
    }

    /**
     * @param keyValueDelimiter The delimiter string to use between the key and value in each pair
     * in the transformed log event.
     */
    override fun keyValueDelimiter(keyValueDelimiter: KeyValueDelimiter) {
      cdkBuilder.keyValueDelimiter(keyValueDelimiter.let(KeyValueDelimiter.Companion::unwrap))
    }

    /**
     * @param nonMatchValue A value to insert into the value field in the result, when a key-value
     * pair is not successfully split.
     */
    override fun nonMatchValue(nonMatchValue: String) {
      cdkBuilder.nonMatchValue(nonMatchValue)
    }

    /**
     * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
     * already exists.
     */
    override fun overwriteIfExists(overwriteIfExists: Boolean) {
      cdkBuilder.overwriteIfExists(overwriteIfExists)
    }

    /**
     * @param source Path to the field in the log event that will be parsed.
     * Use dot notation to access child fields.
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.logs.ParseKeyValueProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.ParseKeyValueProperty,
  ) : CdkObject(cdkObject),
      ParseKeyValueProperty {
    /**
     * The destination field to put the extracted key-value pairs into.
     *
     * Default: - Places at the root of the JSON input.
     */
    override fun destination(): String? = unwrap(this).getDestination()

    /**
     * The field delimiter string that is used between key-value pairs in the original log events.
     *
     * Default: KeyValuePairDelimiter.AMPERSAND
     */
    override fun fieldDelimiter(): KeyValuePairDelimiter? =
        unwrap(this).getFieldDelimiter()?.let(KeyValuePairDelimiter::wrap)

    /**
     * If you want to add a prefix to all transformed keys, specify it here.
     *
     * Default: - No prefix is added to the keys.
     */
    override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    /**
     * The delimiter string to use between the key and value in each pair in the transformed log
     * event.
     *
     * Default: KeyValueDelimiter.EQUAL
     */
    override fun keyValueDelimiter(): KeyValueDelimiter? =
        unwrap(this).getKeyValueDelimiter()?.let(KeyValueDelimiter::wrap)

    /**
     * A value to insert into the value field in the result, when a key-value pair is not
     * successfully split.
     *
     * Default: - No values is inserted when split is not successful.
     */
    override fun nonMatchValue(): String? = unwrap(this).getNonMatchValue()

    /**
     * Specifies whether to overwrite the value if the destination key already exists.
     *
     * Default: false
     */
    override fun overwriteIfExists(): Boolean? = unwrap(this).getOverwriteIfExists()

    /**
     * Path to the field in the log event that will be parsed.
     *
     * Use dot notation to access child fields.
     *
     * Default: '@message'
     */
    override fun source(): String? = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParseKeyValueProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ParseKeyValueProperty):
        ParseKeyValueProperty = CdkObjectWrappers.wrap(cdkObject) as? ParseKeyValueProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParseKeyValueProperty):
        software.amazon.awscdk.services.logs.ParseKeyValueProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.ParseKeyValueProperty
  }
}
