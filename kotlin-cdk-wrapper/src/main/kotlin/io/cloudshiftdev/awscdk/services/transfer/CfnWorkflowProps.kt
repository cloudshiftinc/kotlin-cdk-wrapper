@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnWorkflowProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun onExceptionSteps(): Any? = unwrap(this).getOnExceptionSteps()

  public fun steps(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun onExceptionSteps(onExceptionSteps: IResolvable)

    public fun onExceptionSteps(onExceptionSteps: List<Any>)

    public fun onExceptionSteps(vararg onExceptionSteps: Any)

    public fun steps(steps: IResolvable)

    public fun steps(steps: List<Any>)

    public fun steps(vararg steps: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnWorkflowProps.Builder =
        software.amazon.awscdk.services.transfer.CfnWorkflowProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun onExceptionSteps(onExceptionSteps: IResolvable) {
      cdkBuilder.onExceptionSteps(onExceptionSteps.let(IResolvable::unwrap))
    }

    override fun onExceptionSteps(onExceptionSteps: List<Any>) {
      cdkBuilder.onExceptionSteps(onExceptionSteps)
    }

    override fun onExceptionSteps(vararg onExceptionSteps: Any): Unit =
        onExceptionSteps(onExceptionSteps.toList())

    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable::unwrap))
    }

    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps)
    }

    override fun steps(vararg steps: Any): Unit = steps(steps.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.transfer.CfnWorkflowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflowProps,
  ) : CdkObject(cdkObject), CfnWorkflowProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun onExceptionSteps(): Any? = unwrap(this).getOnExceptionSteps()

    override fun steps(): Any = unwrap(this).getSteps()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflowProps):
        CfnWorkflowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflowProps):
        software.amazon.awscdk.services.transfer.CfnWorkflowProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.transfer.CfnWorkflowProps
  }
}
