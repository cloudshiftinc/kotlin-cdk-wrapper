@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudformation.include

import io.cloudshiftdev.awscdk.NestedStack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface IncludedNestedStack {
  public fun includedTemplate(): CfnInclude

  public fun stack(): NestedStack

  @CdkDslMarker
  public interface Builder {
    public fun includedTemplate(includedTemplate: CfnInclude)

    public fun stack(stack: NestedStack)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudformation.include.IncludedNestedStack.Builder =
        software.amazon.awscdk.cloudformation.include.IncludedNestedStack.builder()

    override fun includedTemplate(includedTemplate: CfnInclude) {
      cdkBuilder.includedTemplate(includedTemplate.let(CfnInclude::unwrap))
    }

    override fun stack(stack: NestedStack) {
      cdkBuilder.stack(stack.let(NestedStack::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloudformation.include.IncludedNestedStack =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudformation.include.IncludedNestedStack,
  ) : CdkObject(cdkObject), IncludedNestedStack {
    override fun includedTemplate(): CfnInclude =
        unwrap(this).getIncludedTemplate().let(CfnInclude::wrap)

    override fun stack(): NestedStack = unwrap(this).getStack().let(NestedStack::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IncludedNestedStack {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudformation.include.IncludedNestedStack):
        IncludedNestedStack = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IncludedNestedStack):
        software.amazon.awscdk.cloudformation.include.IncludedNestedStack = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudformation.include.IncludedNestedStack
  }
}
