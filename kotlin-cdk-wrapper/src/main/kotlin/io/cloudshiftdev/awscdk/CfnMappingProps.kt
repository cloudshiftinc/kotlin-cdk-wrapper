@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnMappingProps {
  public fun lazy(): Boolean? = unwrap(this).getLazy()

  public fun mapping(): Map<String, Map<String, Any>> = unwrap(this).getMapping() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun lazy(lazy: Boolean)

    public fun mapping(mapping: Map<String, Map<String, Any>>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnMappingProps.Builder =
        software.amazon.awscdk.CfnMappingProps.builder()

    override fun lazy(lazy: Boolean) {
      cdkBuilder.lazy(lazy)
    }

    override fun mapping(mapping: Map<String, Map<String, Any>>) {
      cdkBuilder.mapping(mapping)
    }

    public fun build(): software.amazon.awscdk.CfnMappingProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnMappingProps,
  ) : CdkObject(cdkObject), CfnMappingProps {
    override fun lazy(): Boolean? = unwrap(this).getLazy()

    override fun mapping(): Map<String, Map<String, Any>> = unwrap(this).getMapping() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnMappingProps): CfnMappingProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMappingProps): software.amazon.awscdk.CfnMappingProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.CfnMappingProps
  }
}
