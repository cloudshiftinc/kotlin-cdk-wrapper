@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * Object props;
 * GetContextKeyOptions getContextKeyOptions = GetContextKeyOptions.builder()
 * .provider("provider")
 * // the properties below are optional
 * .additionalCacheKey("additionalCacheKey")
 * .includeEnvironment(false)
 * .props(Map.of(
 * "propsKey", props))
 * .build();
 * ```
 */
public interface GetContextKeyOptions {
  /**
   * Adds an additional discriminator to the `cdk.context.json` cache key.
   *
   * Default: - no additional cache key
   */
  public fun additionalCacheKey(): String? = unwrap(this).getAdditionalCacheKey()

  /**
   * Whether to include the stack's account and region automatically.
   *
   * Default: true
   */
  public fun includeEnvironment(): Boolean? = unwrap(this).getIncludeEnvironment()

  /**
   * Provider-specific properties.
   */
  public fun props(): Map<String, Any> = unwrap(this).getProps() ?: emptyMap()

  /**
   * The context provider to query.
   */
  public fun provider(): String

  /**
   * A builder for [GetContextKeyOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalCacheKey Adds an additional discriminator to the `cdk.context.json` cache
     * key.
     */
    public fun additionalCacheKey(additionalCacheKey: String)

    /**
     * @param includeEnvironment Whether to include the stack's account and region automatically.
     */
    public fun includeEnvironment(includeEnvironment: Boolean)

    /**
     * @param props Provider-specific properties.
     */
    public fun props(props: Map<String, Any>)

    /**
     * @param provider The context provider to query. 
     */
    public fun provider(provider: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.GetContextKeyOptions.Builder =
        software.amazon.awscdk.GetContextKeyOptions.builder()

    /**
     * @param additionalCacheKey Adds an additional discriminator to the `cdk.context.json` cache
     * key.
     */
    override fun additionalCacheKey(additionalCacheKey: String) {
      cdkBuilder.additionalCacheKey(additionalCacheKey)
    }

    /**
     * @param includeEnvironment Whether to include the stack's account and region automatically.
     */
    override fun includeEnvironment(includeEnvironment: Boolean) {
      cdkBuilder.includeEnvironment(includeEnvironment)
    }

    /**
     * @param props Provider-specific properties.
     */
    override fun props(props: Map<String, Any>) {
      cdkBuilder.props(props.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param provider The context provider to query. 
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    public fun build(): software.amazon.awscdk.GetContextKeyOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.GetContextKeyOptions,
  ) : CdkObject(cdkObject),
      GetContextKeyOptions {
    /**
     * Adds an additional discriminator to the `cdk.context.json` cache key.
     *
     * Default: - no additional cache key
     */
    override fun additionalCacheKey(): String? = unwrap(this).getAdditionalCacheKey()

    /**
     * Whether to include the stack's account and region automatically.
     *
     * Default: true
     */
    override fun includeEnvironment(): Boolean? = unwrap(this).getIncludeEnvironment()

    /**
     * Provider-specific properties.
     */
    override fun props(): Map<String, Any> = unwrap(this).getProps() ?: emptyMap()

    /**
     * The context provider to query.
     */
    override fun provider(): String = unwrap(this).getProvider()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GetContextKeyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.GetContextKeyOptions): GetContextKeyOptions
        = CdkObjectWrappers.wrap(cdkObject) as? GetContextKeyOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GetContextKeyOptions): software.amazon.awscdk.GetContextKeyOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.GetContextKeyOptions
  }
}
