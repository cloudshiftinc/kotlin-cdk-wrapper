@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
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
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * ProcessorDeleteKeysProperty processorDeleteKeysProperty = ProcessorDeleteKeysProperty.builder()
 * .withKeys(List.of("withKeys"))
 * .build();
 * ```
 */
public interface ProcessorDeleteKeysProperty {
  /**
   * A list of keys to delete.
   */
  public fun withKeys(): List<String>

  /**
   * A builder for [ProcessorDeleteKeysProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param withKeys A list of keys to delete. 
     */
    public fun withKeys(withKeys: List<String>)

    /**
     * @param withKeys A list of keys to delete. 
     */
    public fun withKeys(vararg withKeys: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ProcessorDeleteKeysProperty.Builder
        = software.amazon.awscdk.services.logs.ProcessorDeleteKeysProperty.builder()

    /**
     * @param withKeys A list of keys to delete. 
     */
    override fun withKeys(withKeys: List<String>) {
      cdkBuilder.withKeys(withKeys)
    }

    /**
     * @param withKeys A list of keys to delete. 
     */
    override fun withKeys(vararg withKeys: String): Unit = withKeys(withKeys.toList())

    public fun build(): software.amazon.awscdk.services.logs.ProcessorDeleteKeysProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.ProcessorDeleteKeysProperty,
  ) : CdkObject(cdkObject),
      ProcessorDeleteKeysProperty {
    /**
     * A list of keys to delete.
     */
    override fun withKeys(): List<String> = unwrap(this).getWithKeys()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorDeleteKeysProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ProcessorDeleteKeysProperty):
        ProcessorDeleteKeysProperty = CdkObjectWrappers.wrap(cdkObject) as?
        ProcessorDeleteKeysProperty ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProcessorDeleteKeysProperty):
        software.amazon.awscdk.services.logs.ProcessorDeleteKeysProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.ProcessorDeleteKeysProperty
  }
}
