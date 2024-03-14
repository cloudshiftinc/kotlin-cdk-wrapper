package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface GetContextValueOptions : GetContextKeyOptions {
  /**
   * The value to return if the context value was not found and a missing context is reported.
   *
   * This should be a dummy value that should preferably
   * fail during deployment since it represents an invalid state.
   */
  public fun dummyValue(): Any

  /**
   * A builder for [GetContextValueOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dummyValue The value to return if the context value was not found and a missing
     * context is reported. 
     * This should be a dummy value that should preferably
     * fail during deployment since it represents an invalid state.
     */
    public fun dummyValue(dummyValue: Any)

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
    private val cdkBuilder: software.amazon.awscdk.GetContextValueOptions.Builder =
        software.amazon.awscdk.GetContextValueOptions.builder()

    /**
     * @param dummyValue The value to return if the context value was not found and a missing
     * context is reported. 
     * This should be a dummy value that should preferably
     * fail during deployment since it represents an invalid state.
     */
    override fun dummyValue(dummyValue: Any) {
      cdkBuilder.dummyValue(dummyValue)
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
      cdkBuilder.props(props)
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
    override val cdkObject: software.amazon.awscdk.GetContextValueOptions,
  ) : CdkObject(cdkObject), GetContextValueOptions {
    /**
     * The value to return if the context value was not found and a missing context is reported.
     *
     * This should be a dummy value that should preferably
     * fail during deployment since it represents an invalid state.
     */
    override fun dummyValue(): Any = unwrap(this).getDummyValue()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): GetContextValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.GetContextValueOptions):
        GetContextValueOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GetContextValueOptions):
        software.amazon.awscdk.GetContextValueOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.GetContextValueOptions
  }
}
