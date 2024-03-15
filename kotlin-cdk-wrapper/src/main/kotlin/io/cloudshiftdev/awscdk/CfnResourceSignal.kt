@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnResourceSignal {
  public fun count(): Number? = unwrap(this).getCount()

  public fun timeout(): String? = unwrap(this).getTimeout()

  @CdkDslMarker
  public interface Builder {
    public fun count(count: Number)

    public fun timeout(timeout: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnResourceSignal.Builder =
        software.amazon.awscdk.CfnResourceSignal.builder()

    override fun count(count: Number) {
      cdkBuilder.count(count)
    }

    override fun timeout(timeout: String) {
      cdkBuilder.timeout(timeout)
    }

    public fun build(): software.amazon.awscdk.CfnResourceSignal = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnResourceSignal,
  ) : CdkObject(cdkObject), CfnResourceSignal {
    override fun count(): Number? = unwrap(this).getCount()

    override fun timeout(): String? = unwrap(this).getTimeout()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceSignal {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnResourceSignal): CfnResourceSignal =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceSignal): software.amazon.awscdk.CfnResourceSignal =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnResourceSignal
  }
}
