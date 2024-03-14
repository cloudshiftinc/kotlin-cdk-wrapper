package io.cloudshiftdev.awscdk.cloudformation.include

import io.cloudshiftdev.awscdk.NestedStack
import kotlin.Unit

public interface IncludedNestedStack {
  public fun includedTemplate(): CfnInclude

  public fun stack(): NestedStack

  public interface Builder {
    public fun includedTemplate(includedTemplate: CfnInclude) {
    }

    public fun stack(stack: NestedStack) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudformation.include.IncludedNestedStack.Builder =
        software.amazon.awscdk.cloudformation.include.IncludedNestedStack.builder()

    public override fun includedTemplate(includedTemplate: CfnInclude) {
      cdkBuilder.includedTemplate(includedTemplate.let(CfnInclude::unwrap))
    }

    public override fun stack(stack: NestedStack) {
      cdkBuilder.stack(stack.let(NestedStack::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloudformation.include.IncludedNestedStack =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudformation.include.IncludedNestedStack,
  ) : IncludedNestedStack {
    public override fun includedTemplate(): CfnInclude =
        unwrap(this).getIncludedTemplate().let(CfnInclude::wrap)

    public override fun stack(): NestedStack = unwrap(this).getStack().let(NestedStack::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): IncludedNestedStack {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudformation.include.IncludedNestedStack):
        IncludedNestedStack = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IncludedNestedStack):
        software.amazon.awscdk.cloudformation.include.IncludedNestedStack = (wrapped as
        Wrapper).cdkObject
  }
}
