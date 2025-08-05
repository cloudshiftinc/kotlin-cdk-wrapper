@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * This processor uses pattern matching to parse and structure unstructured data.
 *
 * This processor can also extract fields from log messages.
 * For more information about this processor including examples, see grok in the CloudWatch Logs
 * User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * GrokProperty grokProperty = GrokProperty.builder()
 * .match("match")
 * // the properties below are optional
 * .source("source")
 * .build();
 * ```
 */
public interface GrokProperty {
  /**
   * The grok pattern to match against the log event.
   *
   * For a list of supported grok patterns,
   * see Supported grok patterns in the CloudWatch Logs User Guide.
   */
  public fun match(): String

  /**
   * The path to the field in the log event that you want to parse.
   *
   * Default: '@message'
   */
  public fun source(): String? = unwrap(this).getSource()

  /**
   * A builder for [GrokProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param match The grok pattern to match against the log event. 
     * For a list of supported grok patterns,
     * see Supported grok patterns in the CloudWatch Logs User Guide.
     */
    public fun match(match: String)

    /**
     * @param source The path to the field in the log event that you want to parse.
     */
    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.GrokProperty.Builder =
        software.amazon.awscdk.services.logs.GrokProperty.builder()

    /**
     * @param match The grok pattern to match against the log event. 
     * For a list of supported grok patterns,
     * see Supported grok patterns in the CloudWatch Logs User Guide.
     */
    override fun match(match: String) {
      cdkBuilder.match(match)
    }

    /**
     * @param source The path to the field in the log event that you want to parse.
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.logs.GrokProperty = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.GrokProperty,
  ) : CdkObject(cdkObject),
      GrokProperty {
    /**
     * The grok pattern to match against the log event.
     *
     * For a list of supported grok patterns,
     * see Supported grok patterns in the CloudWatch Logs User Guide.
     */
    override fun match(): String = unwrap(this).getMatch()

    /**
     * The path to the field in the log event that you want to parse.
     *
     * Default: '@message'
     */
    override fun source(): String? = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrokProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.GrokProperty): GrokProperty =
        CdkObjectWrappers.wrap(cdkObject) as? GrokProperty ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrokProperty): software.amazon.awscdk.services.logs.GrokProperty =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.GrokProperty
  }
}
