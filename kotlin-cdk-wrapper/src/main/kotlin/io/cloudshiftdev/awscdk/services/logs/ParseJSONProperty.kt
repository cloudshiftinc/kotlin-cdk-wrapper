@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * This processor parses log events that are in JSON format.
 *
 * It can extract JSON key-value pairs and place them
 * under a destination that you specify.
 * Additionally, because you must have at least one parse-type processor in a transformer, you can
 * use ParseJSON as that
 * processor for JSON-format logs, so that you can also apply other processors, such as mutate
 * processors, to these logs.
 * For more information about this processor including examples, see parseJSON in the CloudWatch
 * Logs User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * ParseJSONProperty parseJSONProperty = ParseJSONProperty.builder()
 * .destination("destination")
 * .source("source")
 * .build();
 * ```
 */
public interface ParseJSONProperty {
  /**
   * The location to put the parsed key value pair into.
   *
   * Default: - Placed under root of log event
   */
  public fun destination(): String? = unwrap(this).getDestination()

  /**
   * Path to the field in the log event that will be parsed.
   *
   * Use dot notation to access child fields.
   *
   * Default: '@message'
   */
  public fun source(): String? = unwrap(this).getSource()

  /**
   * A builder for [ParseJSONProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destination The location to put the parsed key value pair into.
     */
    public fun destination(destination: String)

    /**
     * @param source Path to the field in the log event that will be parsed.
     * Use dot notation to access child fields.
     */
    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ParseJSONProperty.Builder =
        software.amazon.awscdk.services.logs.ParseJSONProperty.builder()

    /**
     * @param destination The location to put the parsed key value pair into.
     */
    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    /**
     * @param source Path to the field in the log event that will be parsed.
     * Use dot notation to access child fields.
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.logs.ParseJSONProperty = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.ParseJSONProperty,
  ) : CdkObject(cdkObject),
      ParseJSONProperty {
    /**
     * The location to put the parsed key value pair into.
     *
     * Default: - Placed under root of log event
     */
    override fun destination(): String? = unwrap(this).getDestination()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ParseJSONProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ParseJSONProperty):
        ParseJSONProperty = CdkObjectWrappers.wrap(cdkObject) as? ParseJSONProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParseJSONProperty):
        software.amazon.awscdk.services.logs.ParseJSONProperty = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.ParseJSONProperty
  }
}
