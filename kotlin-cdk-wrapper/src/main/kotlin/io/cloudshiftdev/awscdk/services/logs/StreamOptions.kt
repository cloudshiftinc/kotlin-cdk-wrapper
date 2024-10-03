@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for a new LogStream created from a LogGroup.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * StreamOptions streamOptions = StreamOptions.builder()
 * .logStreamName("logStreamName")
 * .build();
 * ```
 */
public interface StreamOptions {
  /**
   * The name of the log stream to create.
   *
   * The name must be unique within the log group.
   *
   * Default: Automatically generated
   */
  public fun logStreamName(): String? = unwrap(this).getLogStreamName()

  /**
   * A builder for [StreamOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logStreamName The name of the log stream to create.
     * The name must be unique within the log group.
     */
    public fun logStreamName(logStreamName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.StreamOptions.Builder =
        software.amazon.awscdk.services.logs.StreamOptions.builder()

    /**
     * @param logStreamName The name of the log stream to create.
     * The name must be unique within the log group.
     */
    override fun logStreamName(logStreamName: String) {
      cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): software.amazon.awscdk.services.logs.StreamOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.StreamOptions,
  ) : CdkObject(cdkObject),
      StreamOptions {
    /**
     * The name of the log stream to create.
     *
     * The name must be unique within the log group.
     *
     * Default: Automatically generated
     */
    override fun logStreamName(): String? = unwrap(this).getLogStreamName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StreamOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.StreamOptions): StreamOptions
        = CdkObjectWrappers.wrap(cdkObject) as? StreamOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamOptions): software.amazon.awscdk.services.logs.StreamOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.StreamOptions
  }
}
