@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrassv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnComponentVersionProps {
  public fun inlineRecipe(): String? = unwrap(this).getInlineRecipe()

  public fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun inlineRecipe(inlineRecipe: String)

    public fun lambdaFunction(lambdaFunction: IResolvable)

    public
        fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a1df1ec664aaca9b8619e75a1c4dc280da304836964a8d34daba4e1763883d0")
    public
        fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps.Builder =
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps.builder()

    override fun inlineRecipe(inlineRecipe: String) {
      cdkBuilder.inlineRecipe(inlineRecipe)
    }

    override fun lambdaFunction(lambdaFunction: IResolvable) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IResolvable::unwrap))
    }

    override
        fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(CfnComponentVersion.LambdaFunctionRecipeSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a1df1ec664aaca9b8619e75a1c4dc280da304836964a8d34daba4e1763883d0")
    override
        fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty.Builder.() -> Unit):
        Unit =
        lambdaFunction(CfnComponentVersion.LambdaFunctionRecipeSourceProperty(lambdaFunction))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps,
  ) : CdkObject(cdkObject), CfnComponentVersionProps {
    override fun inlineRecipe(): String? = unwrap(this).getInlineRecipe()

    override fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnComponentVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps):
        CfnComponentVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnComponentVersionProps):
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps
  }
}
