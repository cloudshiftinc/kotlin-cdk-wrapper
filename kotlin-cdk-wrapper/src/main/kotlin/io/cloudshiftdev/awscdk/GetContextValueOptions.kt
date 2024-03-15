@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface GetContextValueOptions : GetContextKeyOptions {
  public fun dummyValue(): Any

  @CdkDslMarker
  public interface Builder {
    public fun dummyValue(dummyValue: Any)

    public fun includeEnvironment(includeEnvironment: Boolean)

    public fun props(props: Map<String, Any>)

    public fun provider(provider: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.GetContextValueOptions.Builder =
        software.amazon.awscdk.GetContextValueOptions.builder()

    override fun dummyValue(dummyValue: Any) {
      cdkBuilder.dummyValue(dummyValue)
    }

    override fun includeEnvironment(includeEnvironment: Boolean) {
      cdkBuilder.includeEnvironment(includeEnvironment)
    }

    override fun props(props: Map<String, Any>) {
      cdkBuilder.props(props)
    }

    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    public fun build(): software.amazon.awscdk.GetContextValueOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.GetContextValueOptions,
  ) : CdkObject(cdkObject), GetContextValueOptions {
    override fun dummyValue(): Any = unwrap(this).getDummyValue()

    override fun includeEnvironment(): Boolean? = unwrap(this).getIncludeEnvironment()

    override fun props(): Map<String, Any> = unwrap(this).getProps() ?: emptyMap()

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
