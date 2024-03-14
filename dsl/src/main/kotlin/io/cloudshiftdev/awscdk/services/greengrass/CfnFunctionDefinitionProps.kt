package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnFunctionDefinitionProps {
  /**
   * The function definition version to include when the function definition is created.
   *
   * A function definition version contains a list of
   * [`function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
   * property types.
   *
   *
   * To associate a function definition version after the function definition is created, create an
   * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
   * resource and specify the ID of this function definition.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-initialversion)
   */
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The name of the function definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-name)
   */
  public fun name(): String

  /**
   * Application-specific metadata to attach to the function definition.
   *
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
   * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
   * the *Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnFunctionDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param initialVersion The function definition version to include when the function definition
     * is created.
     * A function definition version contains a list of
     * [`function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
     * property types.
     *
     *
     * To associate a function definition version after the function definition is created, create
     * an
     * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     * resource and specify the ID of this function definition.
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * @param initialVersion The function definition version to include when the function definition
     * is created.
     * A function definition version contains a list of
     * [`function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
     * property types.
     *
     *
     * To associate a function definition version after the function definition is created, create
     * an
     * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     * resource and specify the ID of this function definition.
     */
    public
        fun initialVersion(initialVersion: CfnFunctionDefinition.FunctionDefinitionVersionProperty)

    /**
     * @param initialVersion The function definition version to include when the function definition
     * is created.
     * A function definition version contains a list of
     * [`function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
     * property types.
     *
     *
     * To associate a function definition version after the function definition is created, create
     * an
     * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     * resource and specify the ID of this function definition.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ce3effc729fa61fc995b8c4d7d6360357337c4c933a2d5205ee5f513ad8cded")
    public
        fun initialVersion(initialVersion: CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * @param name The name of the function definition. 
     */
    public fun name(name: String)

    /**
     * @param tags Application-specific metadata to attach to the function definition.
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps.builder()

    /**
     * @param initialVersion The function definition version to include when the function definition
     * is created.
     * A function definition version contains a list of
     * [`function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
     * property types.
     *
     *
     * To associate a function definition version after the function definition is created, create
     * an
     * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     * resource and specify the ID of this function definition.
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * @param initialVersion The function definition version to include when the function definition
     * is created.
     * A function definition version contains a list of
     * [`function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
     * property types.
     *
     *
     * To associate a function definition version after the function definition is created, create
     * an
     * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     * resource and specify the ID of this function definition.
     */
    override
        fun initialVersion(initialVersion: CfnFunctionDefinition.FunctionDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnFunctionDefinition.FunctionDefinitionVersionProperty::unwrap))
    }

    /**
     * @param initialVersion The function definition version to include when the function definition
     * is created.
     * A function definition version contains a list of
     * [`function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
     * property types.
     *
     *
     * To associate a function definition version after the function definition is created, create
     * an
     * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     * resource and specify the ID of this function definition.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ce3effc729fa61fc995b8c4d7d6360357337c4c933a2d5205ee5f513ad8cded")
    override
        fun initialVersion(initialVersion: CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder.() -> Unit):
        Unit =
        initialVersion(CfnFunctionDefinition.FunctionDefinitionVersionProperty(initialVersion))

    /**
     * @param name The name of the function definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Application-specific metadata to attach to the function definition.
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps,
  ) : CdkObject(cdkObject), CfnFunctionDefinitionProps {
    /**
     * The function definition version to include when the function definition is created.
     *
     * A function definition version contains a list of
     * [`function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
     * property types.
     *
     *
     * To associate a function definition version after the function definition is created, create
     * an
     * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     * resource and specify the ID of this function definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-initialversion)
     */
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    /**
     * The name of the function definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Application-specific metadata to attach to the function definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps):
        CfnFunctionDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps
  }
}
