package io.cloudshiftdev.awscdk.services.greengrassv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnComponentVersionProps {
  /**
   * The recipe to use to create the component.
   *
   * The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts,
   * and platform compatibility.
   *
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-inlinerecipe)
   */
  public fun inlineRecipe(): String? = unwrap(this).getInlineRecipe()

  /**
   * The parameters to create a component from a Lambda function.
   *
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
   */
  public fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

  /**
   * Application-specific metadata to attach to the component version.
   *
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tag your AWS IoT Greengrass
   * Version 2 resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnComponentVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param inlineRecipe The recipe to use to create the component.
     * The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts,
     * and platform compatibility.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     */
    public fun inlineRecipe(inlineRecipe: String)

    /**
     * @param lambdaFunction The parameters to create a component from a Lambda function.
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     */
    public fun lambdaFunction(lambdaFunction: IResolvable)

    /**
     * @param lambdaFunction The parameters to create a component from a Lambda function.
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     */
    public
        fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty)

    /**
     * @param lambdaFunction The parameters to create a component from a Lambda function.
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a1df1ec664aaca9b8619e75a1c4dc280da304836964a8d34daba4e1763883d0")
    public
        fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty.Builder.() -> Unit)

    /**
     * @param tags Application-specific metadata to attach to the component version.
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tag your AWS IoT
     * Greengrass Version 2
     * resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html) in the
     * *AWS IoT Greengrass V2 Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps.Builder =
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps.builder()

    /**
     * @param inlineRecipe The recipe to use to create the component.
     * The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts,
     * and platform compatibility.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     */
    override fun inlineRecipe(inlineRecipe: String) {
      cdkBuilder.inlineRecipe(inlineRecipe)
    }

    /**
     * @param lambdaFunction The parameters to create a component from a Lambda function.
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     */
    override fun lambdaFunction(lambdaFunction: IResolvable) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IResolvable::unwrap))
    }

    /**
     * @param lambdaFunction The parameters to create a component from a Lambda function.
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     */
    override
        fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(CfnComponentVersion.LambdaFunctionRecipeSourceProperty::unwrap))
    }

    /**
     * @param lambdaFunction The parameters to create a component from a Lambda function.
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a1df1ec664aaca9b8619e75a1c4dc280da304836964a8d34daba4e1763883d0")
    override
        fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty.Builder.() -> Unit):
        Unit =
        lambdaFunction(CfnComponentVersion.LambdaFunctionRecipeSourceProperty(lambdaFunction))

    /**
     * @param tags Application-specific metadata to attach to the component version.
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tag your AWS IoT
     * Greengrass Version 2
     * resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html) in the
     * *AWS IoT Greengrass V2 Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps,
  ) : CdkObject(cdkObject), CfnComponentVersionProps {
    /**
     * The recipe to use to create the component.
     *
     * The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts,
     * and platform compatibility.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-inlinerecipe)
     */
    override fun inlineRecipe(): String? = unwrap(this).getInlineRecipe()

    /**
     * The parameters to create a component from a Lambda function.
     *
     * You must specify either `InlineRecipe` or `LambdaFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
     */
    override fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

    /**
     * Application-specific metadata to attach to the component version.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tag your AWS IoT
     * Greengrass Version 2
     * resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html) in the
     * *AWS IoT Greengrass V2 Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-tags)
     */
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
