@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFunctionDefinitionVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object variables;
 * CfnFunctionDefinitionVersionProps cfnFunctionDefinitionVersionProps =
 * CfnFunctionDefinitionVersionProps.builder()
 * .functionDefinitionId("functionDefinitionId")
 * .functions(List.of(FunctionProperty.builder()
 * .functionArn("functionArn")
 * .functionConfiguration(FunctionConfigurationProperty.builder()
 * .encodingType("encodingType")
 * .environment(EnvironmentProperty.builder()
 * .accessSysfs(false)
 * .execution(ExecutionProperty.builder()
 * .isolationMode("isolationMode")
 * .runAs(RunAsProperty.builder()
 * .gid(123)
 * .uid(123)
 * .build())
 * .build())
 * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
 * .resourceId("resourceId")
 * // the properties below are optional
 * .permission("permission")
 * .build()))
 * .variables(variables)
 * .build())
 * .execArgs("execArgs")
 * .executable("executable")
 * .memorySize(123)
 * .pinned(false)
 * .timeout(123)
 * .build())
 * .id("id")
 * .build()))
 * // the properties below are optional
 * .defaultConfig(DefaultConfigProperty.builder()
 * .execution(ExecutionProperty.builder()
 * .isolationMode("isolationMode")
 * .runAs(RunAsProperty.builder()
 * .gid(123)
 * .uid(123)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
 */
public interface CfnFunctionDefinitionVersionProps {
  /**
   * The default configuration that applies to all Lambda functions in the group.
   *
   * Individual Lambda functions can override these settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-defaultconfig)
   */
  public fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

  /**
   * The ID of the function definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functiondefinitionid)
   */
  public fun functionDefinitionId(): String

  /**
   * The functions in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
   */
  public fun functions(): Any

  /**
   * A builder for [CfnFunctionDefinitionVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group.
     * Individual Lambda functions can override these settings.
     */
    public fun defaultConfig(defaultConfig: IResolvable)

    /**
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group.
     * Individual Lambda functions can override these settings.
     */
    public fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty)

    /**
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group.
     * Individual Lambda functions can override these settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72e8a8fbd45c3987c4719cf5146f49005d607ef4201abddfde1130ad2b202f2d")
    public
        fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty.Builder.() -> Unit)

    /**
     * @param functionDefinitionId The ID of the function definition associated with this version. 
     * This value is a GUID.
     */
    public fun functionDefinitionId(functionDefinitionId: String)

    /**
     * @param functions The functions in this version. 
     */
    public fun functions(functions: IResolvable)

    /**
     * @param functions The functions in this version. 
     */
    public fun functions(functions: List<Any>)

    /**
     * @param functions The functions in this version. 
     */
    public fun functions(vararg functions: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps.builder()

    /**
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group.
     * Individual Lambda functions can override these settings.
     */
    override fun defaultConfig(defaultConfig: IResolvable) {
      cdkBuilder.defaultConfig(defaultConfig.let(IResolvable::unwrap))
    }

    /**
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group.
     * Individual Lambda functions can override these settings.
     */
    override fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty) {
      cdkBuilder.defaultConfig(defaultConfig.let(CfnFunctionDefinitionVersion.DefaultConfigProperty::unwrap))
    }

    /**
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group.
     * Individual Lambda functions can override these settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72e8a8fbd45c3987c4719cf5146f49005d607ef4201abddfde1130ad2b202f2d")
    override
        fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty.Builder.() -> Unit):
        Unit = defaultConfig(CfnFunctionDefinitionVersion.DefaultConfigProperty(defaultConfig))

    /**
     * @param functionDefinitionId The ID of the function definition associated with this version. 
     * This value is a GUID.
     */
    override fun functionDefinitionId(functionDefinitionId: String) {
      cdkBuilder.functionDefinitionId(functionDefinitionId)
    }

    /**
     * @param functions The functions in this version. 
     */
    override fun functions(functions: IResolvable) {
      cdkBuilder.functions(functions.let(IResolvable::unwrap))
    }

    /**
     * @param functions The functions in this version. 
     */
    override fun functions(functions: List<Any>) {
      cdkBuilder.functions(functions)
    }

    /**
     * @param functions The functions in this version. 
     */
    override fun functions(vararg functions: Any): Unit = functions(functions.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnFunctionDefinitionVersionProps {
    /**
     * The default configuration that applies to all Lambda functions in the group.
     *
     * Individual Lambda functions can override these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-defaultconfig)
     */
    override fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

    /**
     * The ID of the function definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functiondefinitionid)
     */
    override fun functionDefinitionId(): String = unwrap(this).getFunctionDefinitionId()

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
     */
    override fun functions(): Any = unwrap(this).getFunctions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps):
        CfnFunctionDefinitionVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
  }
}
