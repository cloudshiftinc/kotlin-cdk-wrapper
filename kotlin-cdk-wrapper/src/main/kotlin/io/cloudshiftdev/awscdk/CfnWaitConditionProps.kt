@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnWaitConditionProps {
  public fun count(): Number? = unwrap(this).getCount()

  public fun handle(): String? = unwrap(this).getHandle()

  public fun timeout(): String? = unwrap(this).getTimeout()

  @CdkDslMarker
  public interface Builder {
    public fun count(count: Number)

    public fun handle(handle: String)

    public fun timeout(timeout: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnWaitConditionProps.Builder =
        software.amazon.awscdk.CfnWaitConditionProps.builder()

    override fun count(count: Number) {
      cdkBuilder.count(count)
    }

    override fun handle(handle: String) {
      cdkBuilder.handle(handle)
    }

    override fun timeout(timeout: String) {
      cdkBuilder.timeout(timeout)
    }

    public fun build(): software.amazon.awscdk.CfnWaitConditionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnWaitConditionProps,
  ) : CdkObject(cdkObject), CfnWaitConditionProps {
    override fun count(): Number? = unwrap(this).getCount()

    override fun handle(): String? = unwrap(this).getHandle()

    override fun timeout(): String? = unwrap(this).getTimeout()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWaitConditionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnWaitConditionProps):
        CfnWaitConditionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWaitConditionProps):
        software.amazon.awscdk.CfnWaitConditionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnWaitConditionProps
  }
}
