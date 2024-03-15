@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface FunctionProps {
  public fun code(): FunctionCode

  public fun comment(): String? = unwrap(this).getComment()

  public fun functionName(): String? = unwrap(this).getFunctionName()

  public fun keyValueStore(): IKeyValueStore? =
      unwrap(this).getKeyValueStore()?.let(IKeyValueStore::wrap)

  public fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun code(code: FunctionCode)

    public fun comment(comment: String)

    public fun functionName(functionName: String)

    public fun keyValueStore(keyValueStore: IKeyValueStore)

    public fun runtime(runtime: FunctionRuntime)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.FunctionProps.Builder =
        software.amazon.awscdk.services.cloudfront.FunctionProps.builder()

    override fun code(code: FunctionCode) {
      cdkBuilder.code(code.let(FunctionCode::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun keyValueStore(keyValueStore: IKeyValueStore) {
      cdkBuilder.keyValueStore(keyValueStore.let(IKeyValueStore::unwrap))
    }

    override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.FunctionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.FunctionProps,
  ) : CdkObject(cdkObject), FunctionProps {
    override fun code(): FunctionCode = unwrap(this).getCode().let(FunctionCode::wrap)

    override fun comment(): String? = unwrap(this).getComment()

    override fun functionName(): String? = unwrap(this).getFunctionName()

    override fun keyValueStore(): IKeyValueStore? =
        unwrap(this).getKeyValueStore()?.let(IKeyValueStore::wrap)

    override fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionProps):
        FunctionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionProps):
        software.amazon.awscdk.services.cloudfront.FunctionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.FunctionProps
  }
}
