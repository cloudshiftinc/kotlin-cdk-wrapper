@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Additional properties for looking up an existing StringParameter.
 *
 * Example:
 *
 * ```
 * String stringValue = StringParameter.valueFromLookup(this, "/My/Public/Parameter", undefined,
 * StringParameterLookupOptions.builder().additionalCacheKey(this.node.getPath()).build());
 * ```
 */
public interface StringParameterLookupOptions {
  /**
   * Adds an additional discriminator to the `cdk.context.json` cache key.
   *
   * Default: - no additional cache key
   */
  public fun additionalCacheKey(): String? = unwrap(this).getAdditionalCacheKey()

  /**
   * A builder for [StringParameterLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalCacheKey Adds an additional discriminator to the `cdk.context.json` cache
     * key.
     */
    public fun additionalCacheKey(additionalCacheKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.StringParameterLookupOptions.Builder
        = software.amazon.awscdk.services.ssm.StringParameterLookupOptions.builder()

    /**
     * @param additionalCacheKey Adds an additional discriminator to the `cdk.context.json` cache
     * key.
     */
    override fun additionalCacheKey(additionalCacheKey: String) {
      cdkBuilder.additionalCacheKey(additionalCacheKey)
    }

    public fun build(): software.amazon.awscdk.services.ssm.StringParameterLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssm.StringParameterLookupOptions,
  ) : CdkObject(cdkObject),
      StringParameterLookupOptions {
    /**
     * Adds an additional discriminator to the `cdk.context.json` cache key.
     *
     * Default: - no additional cache key
     */
    override fun additionalCacheKey(): String? = unwrap(this).getAdditionalCacheKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringParameterLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.StringParameterLookupOptions):
        StringParameterLookupOptions = CdkObjectWrappers.wrap(cdkObject) as?
        StringParameterLookupOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringParameterLookupOptions):
        software.amazon.awscdk.services.ssm.StringParameterLookupOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.StringParameterLookupOptions
  }
}
