@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnResourceProps {
  public fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun properties(properties: Map<String, Any>)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnResourceProps.Builder =
        software.amazon.awscdk.CfnResourceProps.builder()

    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnResourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnResourceProps,
  ) : CdkObject(cdkObject), CfnResourceProps {
    override fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnResourceProps): CfnResourceProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceProps): software.amazon.awscdk.CfnResourceProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnResourceProps
  }
}
