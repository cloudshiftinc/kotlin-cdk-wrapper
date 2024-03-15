@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.controltower

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEnabledControlProps {
  public fun controlIdentifier(): String

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetIdentifier(): String

  @CdkDslMarker
  public interface Builder {
    public fun controlIdentifier(controlIdentifier: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: List<Any>)

    public fun parameters(vararg parameters: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetIdentifier(targetIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.controltower.CfnEnabledControlProps.Builder =
        software.amazon.awscdk.services.controltower.CfnEnabledControlProps.builder()

    override fun controlIdentifier(controlIdentifier: String) {
      cdkBuilder.controlIdentifier(controlIdentifier)
    }

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetIdentifier(targetIdentifier: String) {
      cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.controltower.CfnEnabledControlProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledControlProps,
  ) : CdkObject(cdkObject), CfnEnabledControlProps {
    override fun controlIdentifier(): String = unwrap(this).getControlIdentifier()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetIdentifier(): String = unwrap(this).getTargetIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnabledControlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledControlProps):
        CfnEnabledControlProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnabledControlProps):
        software.amazon.awscdk.services.controltower.CfnEnabledControlProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.controltower.CfnEnabledControlProps
  }
}
