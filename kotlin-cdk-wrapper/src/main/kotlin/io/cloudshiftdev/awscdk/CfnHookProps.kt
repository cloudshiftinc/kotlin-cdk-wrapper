@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnHookProps {
  public fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun properties(properties: Map<String, Any>)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHookProps.Builder =
        software.amazon.awscdk.CfnHookProps.builder()

    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnHookProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnHookProps,
  ) : CdkObject(cdkObject), CfnHookProps {
    override fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookProps): CfnHookProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHookProps): software.amazon.awscdk.CfnHookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnHookProps
  }
}
