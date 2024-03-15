@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface FunctionAttributes {
  public fun functionArn(): String

  public fun functionName(): String

  public fun functionRuntime(): String? = unwrap(this).getFunctionRuntime()

  @CdkDslMarker
  public interface Builder {
    public fun functionArn(functionArn: String)

    public fun functionName(functionName: String)

    public fun functionRuntime(functionRuntime: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.FunctionAttributes.Builder =
        software.amazon.awscdk.services.cloudfront.FunctionAttributes.builder()

    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun functionRuntime(functionRuntime: String) {
      cdkBuilder.functionRuntime(functionRuntime)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.FunctionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.FunctionAttributes,
  ) : CdkObject(cdkObject), FunctionAttributes {
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    override fun functionName(): String = unwrap(this).getFunctionName()

    override fun functionRuntime(): String? = unwrap(this).getFunctionRuntime()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionAttributes):
        FunctionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionAttributes):
        software.amazon.awscdk.services.cloudfront.FunctionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.FunctionAttributes
  }
}
