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

public interface CfnEnabledBaselineProps {
  public fun baselineIdentifier(): String

  public fun baselineVersion(): String

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetIdentifier(): String

  @CdkDslMarker
  public interface Builder {
    public fun baselineIdentifier(baselineIdentifier: String)

    public fun baselineVersion(baselineVersion: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: List<Any>)

    public fun parameters(vararg parameters: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetIdentifier(targetIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps.Builder =
        software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps.builder()

    override fun baselineIdentifier(baselineIdentifier: String) {
      cdkBuilder.baselineIdentifier(baselineIdentifier)
    }

    override fun baselineVersion(baselineVersion: String) {
      cdkBuilder.baselineVersion(baselineVersion)
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

    public fun build(): software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps,
  ) : CdkObject(cdkObject), CfnEnabledBaselineProps {
    override fun baselineIdentifier(): String = unwrap(this).getBaselineIdentifier()

    override fun baselineVersion(): String = unwrap(this).getBaselineVersion()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetIdentifier(): String = unwrap(this).getTargetIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnabledBaselineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps):
        CfnEnabledBaselineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnabledBaselineProps):
        software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps
  }
}
