@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * This processor adds new key-value pairs to the log event.
 *
 * For more information about this processor including examples, see addKeys in the CloudWatch Logs
 * User Guide.
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
public interface AddKeysProperty {
  /**
   * An array of objects, where each object contains information about one key to add to the log
   * event.
   */
  public fun entries(): List<AddKeyEntryProperty>

  /**
   * A builder for [AddKeysProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param entries An array of objects, where each object contains information about one key to
     * add to the log event. 
     */
    public fun entries(entries: List<AddKeyEntryProperty>)

    /**
     * @param entries An array of objects, where each object contains information about one key to
     * add to the log event. 
     */
    public fun entries(vararg entries: AddKeyEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.AddKeysProperty.Builder =
        software.amazon.awscdk.services.logs.AddKeysProperty.builder()

    /**
     * @param entries An array of objects, where each object contains information about one key to
     * add to the log event. 
     */
    override fun entries(entries: List<AddKeyEntryProperty>) {
      cdkBuilder.entries(entries.map(AddKeyEntryProperty.Companion::unwrap))
    }

    /**
     * @param entries An array of objects, where each object contains information about one key to
     * add to the log event. 
     */
    override fun entries(vararg entries: AddKeyEntryProperty): Unit = entries(entries.toList())

    public fun build(): software.amazon.awscdk.services.logs.AddKeysProperty = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.AddKeysProperty,
  ) : CdkObject(cdkObject),
      AddKeysProperty {
    /**
     * An array of objects, where each object contains information about one key to add to the log
     * event.
     */
    override fun entries(): List<AddKeyEntryProperty> =
        unwrap(this).getEntries().map(AddKeyEntryProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddKeysProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.AddKeysProperty):
        AddKeysProperty = CdkObjectWrappers.wrap(cdkObject) as? AddKeysProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddKeysProperty):
        software.amazon.awscdk.services.logs.AddKeysProperty = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.AddKeysProperty
  }
}
