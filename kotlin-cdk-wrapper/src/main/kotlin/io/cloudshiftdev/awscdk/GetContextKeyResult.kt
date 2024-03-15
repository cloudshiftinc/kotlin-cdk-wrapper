@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface GetContextKeyResult {
  public fun key(): String

  public fun props(): Map<String, Any>

  @CdkDslMarker
  public interface Builder {
    public fun key(key: String)

    public fun props(props: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.GetContextKeyResult.Builder =
        software.amazon.awscdk.GetContextKeyResult.builder()

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun props(props: Map<String, Any>) {
      cdkBuilder.props(props)
    }

    public fun build(): software.amazon.awscdk.GetContextKeyResult = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.GetContextKeyResult,
  ) : CdkObject(cdkObject), GetContextKeyResult {
    override fun key(): String = unwrap(this).getKey()

    override fun props(): Map<String, Any> = unwrap(this).getProps() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GetContextKeyResult {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.GetContextKeyResult): GetContextKeyResult =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GetContextKeyResult): software.amazon.awscdk.GetContextKeyResult =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.GetContextKeyResult
  }
}
