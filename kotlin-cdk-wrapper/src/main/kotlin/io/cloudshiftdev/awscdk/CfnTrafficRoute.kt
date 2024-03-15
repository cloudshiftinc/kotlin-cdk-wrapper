@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnTrafficRoute {
  public fun logicalId(): String

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun logicalId(logicalId: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRoute.Builder =
        software.amazon.awscdk.CfnTrafficRoute.builder()

    override fun logicalId(logicalId: String) {
      cdkBuilder.logicalId(logicalId)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnTrafficRoute = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnTrafficRoute,
  ) : CdkObject(cdkObject), CfnTrafficRoute {
    override fun logicalId(): String = unwrap(this).getLogicalId()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRoute {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRoute): CfnTrafficRoute =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficRoute): software.amazon.awscdk.CfnTrafficRoute = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.CfnTrafficRoute
  }
}
