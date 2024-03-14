package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Unit

public interface AppsyncFunctionAttributes {
  public fun functionArn(): String

  public interface Builder {
    public fun functionArn(functionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes.Builder =
        software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes.builder()

    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes,
  ) : AppsyncFunctionAttributes {
    override fun functionArn(): String = unwrap(this).getFunctionArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AppsyncFunctionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes):
        AppsyncFunctionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppsyncFunctionAttributes):
        software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
