@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
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
 * Object dummyValue;
 * Object props;
 * GetContextValueOptions getContextValueOptions = GetContextValueOptions.builder()
 * .dummyValue(dummyValue)
 * .provider("provider")
 * // the properties below are optional
 * .additionalCacheKey("additionalCacheKey")
 * .ignoreErrorOnMissingContext(false)
 * .includeEnvironment(false)
 * .mustExist(false)
 * .props(Map.of(
 * "propsKey", props))
 * .build();
 * ```
 */
public interface GetContextValueOptions : GetContextKeyOptions {
  /**
   * The value to return if the lookup has not yet been performed.
   *
   * Upon first synthesis, the lookups has not yet been performed. The
   * `getValue()` operation returns this value instead, so that synthesis can
   * proceed. After synthesis completes the first time, the actual lookup will
   * be performed and synthesis will run again with the *real* value.
   *
   * Dummy values should preferably have valid shapes so that downstream
   * consumers of lookup values don't throw validation exceptions if they
   * encounter a dummy value (or all possible downstream consumers need to
   * effectively check for the well-known shape of the dummy value); throwing an
   * exception would error out the synthesis operation and prevent the lookup
   * and the second, real, synthesis from happening.
   *
   * <h2>Connection to mustExist</h2>
   *
   * `dummyValue` is also used as the official value to return if the lookup has
   * failed and `mustExist == false`.
   */
  public fun dummyValue(): Any

  /**
   * (deprecated) Ignore a lookup failure and return the `dummyValue` instead.
   *
   * `mustExist` is the recommended alias for this deprecated
   * property (note that its value is reversed).
   *
   * Default: false
   *
   * @deprecated Use mustExist instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun ignoreErrorOnMissingContext(): Boolean? = unwrap(this).getIgnoreErrorOnMissingContext()

  /**
   * Whether the resource must exist.
   *
   * If this is set (the default), the query fails if the value or resource we
   * tried to look up doesn't exist.
   *
   * If this is `false` and the value we tried to look up could not be found, the
   * failure is suppressed and `dummyValue` is officially returned instead.
   *
   * When this happens, `dummyValue` is encoded into cached context and it will
   * never be refreshed anymore until the user runs `cdk context --reset &lt;key&gt;`.
   *
   * Note that it is not possible for the CDK app code to make a distinction
   * between "the lookup has not been performed yet" and "the lookup didn't
   * find anything and we returned a default value instead".
   *
   * <h2>Context providers</h2>
   *
   * This feature must explicitly be supported by context providers. It is
   * currently supported by:
   *
   * * KMS key provider
   * * SSM parameter provider
   *
   * <h2>Note to implementors</h2>
   *
   * The dummy value should not be returned for all SDK lookup failures. For
   * example, "no network" or "no credentials" or "malformed query" should
   * not lead to the dummy value being returned. Only the case of "no such
   * resource" should.
   *
   * Default: true
   */
  public fun mustExist(): Boolean? = unwrap(this).getMustExist()

  /**
   * A builder for [GetContextValueOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalCacheKey Adds an additional discriminator to the `cdk.context.json` cache
     * key.
     */
    public fun additionalCacheKey(additionalCacheKey: String)

    /**
     * @param dummyValue The value to return if the lookup has not yet been performed. 
     * Upon first synthesis, the lookups has not yet been performed. The
     * `getValue()` operation returns this value instead, so that synthesis can
     * proceed. After synthesis completes the first time, the actual lookup will
     * be performed and synthesis will run again with the *real* value.
     *
     * Dummy values should preferably have valid shapes so that downstream
     * consumers of lookup values don't throw validation exceptions if they
     * encounter a dummy value (or all possible downstream consumers need to
     * effectively check for the well-known shape of the dummy value); throwing an
     * exception would error out the synthesis operation and prevent the lookup
     * and the second, real, synthesis from happening.
     *
     * <h2>Connection to mustExist</h2>
     *
     * `dummyValue` is also used as the official value to return if the lookup has
     * failed and `mustExist == false`.
     */
    public fun dummyValue(dummyValue: Any)

    /**
     * @param ignoreErrorOnMissingContext Ignore a lookup failure and return the `dummyValue`
     * instead.
     * `mustExist` is the recommended alias for this deprecated
     * property (note that its value is reversed).
     * @deprecated Use mustExist instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun ignoreErrorOnMissingContext(ignoreErrorOnMissingContext: Boolean)

    /**
     * @param includeEnvironment Whether to include the stack's account and region automatically.
     */
    public fun includeEnvironment(includeEnvironment: Boolean)

    /**
     * @param mustExist Whether the resource must exist.
     * If this is set (the default), the query fails if the value or resource we
     * tried to look up doesn't exist.
     *
     * If this is `false` and the value we tried to look up could not be found, the
     * failure is suppressed and `dummyValue` is officially returned instead.
     *
     * When this happens, `dummyValue` is encoded into cached context and it will
     * never be refreshed anymore until the user runs `cdk context --reset &lt;key&gt;`.
     *
     * Note that it is not possible for the CDK app code to make a distinction
     * between "the lookup has not been performed yet" and "the lookup didn't
     * find anything and we returned a default value instead".
     *
     * <h2>Context providers</h2>
     *
     * This feature must explicitly be supported by context providers. It is
     * currently supported by:
     *
     * * KMS key provider
     * * SSM parameter provider
     *
     * <h2>Note to implementors</h2>
     *
     * The dummy value should not be returned for all SDK lookup failures. For
     * example, "no network" or "no credentials" or "malformed query" should
     * not lead to the dummy value being returned. Only the case of "no such
     * resource" should.
     */
    public fun mustExist(mustExist: Boolean)

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
    private val cdkBuilder: software.amazon.awscdk.GetContextValueOptions.Builder =
        software.amazon.awscdk.GetContextValueOptions.builder()

    /**
     * @param additionalCacheKey Adds an additional discriminator to the `cdk.context.json` cache
     * key.
     */
    override fun additionalCacheKey(additionalCacheKey: String) {
      cdkBuilder.additionalCacheKey(additionalCacheKey)
    }

    /**
     * @param dummyValue The value to return if the lookup has not yet been performed. 
     * Upon first synthesis, the lookups has not yet been performed. The
     * `getValue()` operation returns this value instead, so that synthesis can
     * proceed. After synthesis completes the first time, the actual lookup will
     * be performed and synthesis will run again with the *real* value.
     *
     * Dummy values should preferably have valid shapes so that downstream
     * consumers of lookup values don't throw validation exceptions if they
     * encounter a dummy value (or all possible downstream consumers need to
     * effectively check for the well-known shape of the dummy value); throwing an
     * exception would error out the synthesis operation and prevent the lookup
     * and the second, real, synthesis from happening.
     *
     * <h2>Connection to mustExist</h2>
     *
     * `dummyValue` is also used as the official value to return if the lookup has
     * failed and `mustExist == false`.
     */
    override fun dummyValue(dummyValue: Any) {
      cdkBuilder.dummyValue(dummyValue)
    }

    /**
     * @param ignoreErrorOnMissingContext Ignore a lookup failure and return the `dummyValue`
     * instead.
     * `mustExist` is the recommended alias for this deprecated
     * property (note that its value is reversed).
     * @deprecated Use mustExist instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ignoreErrorOnMissingContext(ignoreErrorOnMissingContext: Boolean) {
      cdkBuilder.ignoreErrorOnMissingContext(ignoreErrorOnMissingContext)
    }

    /**
     * @param includeEnvironment Whether to include the stack's account and region automatically.
     */
    override fun includeEnvironment(includeEnvironment: Boolean) {
      cdkBuilder.includeEnvironment(includeEnvironment)
    }

    /**
     * @param mustExist Whether the resource must exist.
     * If this is set (the default), the query fails if the value or resource we
     * tried to look up doesn't exist.
     *
     * If this is `false` and the value we tried to look up could not be found, the
     * failure is suppressed and `dummyValue` is officially returned instead.
     *
     * When this happens, `dummyValue` is encoded into cached context and it will
     * never be refreshed anymore until the user runs `cdk context --reset &lt;key&gt;`.
     *
     * Note that it is not possible for the CDK app code to make a distinction
     * between "the lookup has not been performed yet" and "the lookup didn't
     * find anything and we returned a default value instead".
     *
     * <h2>Context providers</h2>
     *
     * This feature must explicitly be supported by context providers. It is
     * currently supported by:
     *
     * * KMS key provider
     * * SSM parameter provider
     *
     * <h2>Note to implementors</h2>
     *
     * The dummy value should not be returned for all SDK lookup failures. For
     * example, "no network" or "no credentials" or "malformed query" should
     * not lead to the dummy value being returned. Only the case of "no such
     * resource" should.
     */
    override fun mustExist(mustExist: Boolean) {
      cdkBuilder.mustExist(mustExist)
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

    public fun build(): software.amazon.awscdk.GetContextValueOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.GetContextValueOptions,
  ) : CdkObject(cdkObject),
      GetContextValueOptions {
    /**
     * Adds an additional discriminator to the `cdk.context.json` cache key.
     *
     * Default: - no additional cache key
     */
    override fun additionalCacheKey(): String? = unwrap(this).getAdditionalCacheKey()

    /**
     * The value to return if the lookup has not yet been performed.
     *
     * Upon first synthesis, the lookups has not yet been performed. The
     * `getValue()` operation returns this value instead, so that synthesis can
     * proceed. After synthesis completes the first time, the actual lookup will
     * be performed and synthesis will run again with the *real* value.
     *
     * Dummy values should preferably have valid shapes so that downstream
     * consumers of lookup values don't throw validation exceptions if they
     * encounter a dummy value (or all possible downstream consumers need to
     * effectively check for the well-known shape of the dummy value); throwing an
     * exception would error out the synthesis operation and prevent the lookup
     * and the second, real, synthesis from happening.
     *
     * <h2>Connection to mustExist</h2>
     *
     * `dummyValue` is also used as the official value to return if the lookup has
     * failed and `mustExist == false`.
     */
    override fun dummyValue(): Any = unwrap(this).getDummyValue()

    /**
     * (deprecated) Ignore a lookup failure and return the `dummyValue` instead.
     *
     * `mustExist` is the recommended alias for this deprecated
     * property (note that its value is reversed).
     *
     * Default: false
     *
     * @deprecated Use mustExist instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ignoreErrorOnMissingContext(): Boolean? =
        unwrap(this).getIgnoreErrorOnMissingContext()

    /**
     * Whether to include the stack's account and region automatically.
     *
     * Default: true
     */
    override fun includeEnvironment(): Boolean? = unwrap(this).getIncludeEnvironment()

    /**
     * Whether the resource must exist.
     *
     * If this is set (the default), the query fails if the value or resource we
     * tried to look up doesn't exist.
     *
     * If this is `false` and the value we tried to look up could not be found, the
     * failure is suppressed and `dummyValue` is officially returned instead.
     *
     * When this happens, `dummyValue` is encoded into cached context and it will
     * never be refreshed anymore until the user runs `cdk context --reset &lt;key&gt;`.
     *
     * Note that it is not possible for the CDK app code to make a distinction
     * between "the lookup has not been performed yet" and "the lookup didn't
     * find anything and we returned a default value instead".
     *
     * <h2>Context providers</h2>
     *
     * This feature must explicitly be supported by context providers. It is
     * currently supported by:
     *
     * * KMS key provider
     * * SSM parameter provider
     *
     * <h2>Note to implementors</h2>
     *
     * The dummy value should not be returned for all SDK lookup failures. For
     * example, "no network" or "no credentials" or "malformed query" should
     * not lead to the dummy value being returned. Only the case of "no such
     * resource" should.
     *
     * Default: true
     */
    override fun mustExist(): Boolean? = unwrap(this).getMustExist()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): GetContextValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.GetContextValueOptions):
        GetContextValueOptions = CdkObjectWrappers.wrap(cdkObject) as? GetContextValueOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GetContextValueOptions):
        software.amazon.awscdk.GetContextValueOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.GetContextValueOptions
  }
}
