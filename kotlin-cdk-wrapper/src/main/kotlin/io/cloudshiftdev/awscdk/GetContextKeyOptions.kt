@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface GetContextKeyOptions {
  public fun includeEnvironment(): Boolean? = unwrap(this).getIncludeEnvironment()

  public fun props(): Map<String, Any> = unwrap(this).getProps() ?: emptyMap()

  public fun provider(): String

  @CdkDslMarker
  public interface Builder {
    public fun includeEnvironment(includeEnvironment: Boolean)

    public fun props(props: Map<String, Any>)

    public fun provider(provider: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.GetContextKeyOptions.Builder =
        software.amazon.awscdk.GetContextKeyOptions.builder()

    override fun includeEnvironment(includeEnvironment: Boolean) {
      cdkBuilder.includeEnvironment(includeEnvironment)
    }

    override fun props(props: Map<String, Any>) {
      cdkBuilder.props(props)
    }

    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    public fun build(): software.amazon.awscdk.GetContextKeyOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.GetContextKeyOptions,
  ) : CdkObject(cdkObject), GetContextKeyOptions {
    override fun includeEnvironment(): Boolean? = unwrap(this).getIncludeEnvironment()

    override fun props(): Map<String, Any> = unwrap(this).getProps() ?: emptyMap()

    override fun provider(): String = unwrap(this).getProvider()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GetContextKeyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.GetContextKeyOptions): GetContextKeyOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GetContextKeyOptions): software.amazon.awscdk.GetContextKeyOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.GetContextKeyOptions
  }
}
