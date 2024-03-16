@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudformation.include

import io.cloudshiftdev.awscdk.NestedStack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * The type returned from `CfnInclude.getNestedStack`. Contains both the NestedStack object and
 * CfnInclude representations of the child stack.
 *
 * Example:
 *
 * ```
 * CfnInclude parentTemplate;
 * IncludedNestedStack includedChildStack = parentTemplate.getNestedStack("ChildStack");
 * NestedStack childStack = includedChildStack.getStack();
 * CfnInclude childTemplate = includedChildStack.getIncludedTemplate();
 * ```
 */
public interface IncludedNestedStack {
  /**
   * The CfnInclude that represents the template, which can be used to access Resources and other
   * template elements.
   */
  public fun includedTemplate(): CfnInclude

  /**
   * The NestedStack object which represents the scope of the template.
   */
  public fun stack(): NestedStack

  /**
   * A builder for [IncludedNestedStack]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param includedTemplate The CfnInclude that represents the template, which can be used to
     * access Resources and other template elements. 
     */
    public fun includedTemplate(includedTemplate: CfnInclude)

    /**
     * @param stack The NestedStack object which represents the scope of the template. 
     */
    public fun stack(stack: NestedStack)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudformation.include.IncludedNestedStack.Builder =
        software.amazon.awscdk.cloudformation.include.IncludedNestedStack.builder()

    /**
     * @param includedTemplate The CfnInclude that represents the template, which can be used to
     * access Resources and other template elements. 
     */
    override fun includedTemplate(includedTemplate: CfnInclude) {
      cdkBuilder.includedTemplate(includedTemplate.let(CfnInclude::unwrap))
    }

    /**
     * @param stack The NestedStack object which represents the scope of the template. 
     */
    override fun stack(stack: NestedStack) {
      cdkBuilder.stack(stack.let(NestedStack::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloudformation.include.IncludedNestedStack =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudformation.include.IncludedNestedStack,
  ) : CdkObject(cdkObject), IncludedNestedStack {
    /**
     * The CfnInclude that represents the template, which can be used to access Resources and other
     * template elements.
     */
    override fun includedTemplate(): CfnInclude =
        unwrap(this).getIncludedTemplate().let(CfnInclude::wrap)

    /**
     * The NestedStack object which represents the scope of the template.
     */
    override fun stack(): NestedStack = unwrap(this).getStack().let(NestedStack::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IncludedNestedStack {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudformation.include.IncludedNestedStack):
        IncludedNestedStack = CdkObjectWrappers.wrap(cdkObject) as IncludedNestedStack

    internal fun unwrap(wrapped: IncludedNestedStack):
        software.amazon.awscdk.cloudformation.include.IncludedNestedStack = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudformation.include.IncludedNestedStack
  }
}
