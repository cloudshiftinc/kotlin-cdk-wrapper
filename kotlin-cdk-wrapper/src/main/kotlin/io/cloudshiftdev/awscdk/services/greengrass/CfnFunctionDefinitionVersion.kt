@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Greengrass::FunctionDefinitionVersion` resource represents a function definition
 * version for AWS IoT Greengrass .
 *
 * A function definition version contains contain a list of functions.
 *
 *
 * To create a function definition version, you must specify the ID of the function definition that
 * you want to associate with the version. For information about creating a function definition, see
 * [`AWS::Greengrass::FunctionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html)
 * .
 *
 * After you create a function definition version that contains the functions you want to deploy,
 * you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object variables;
 * CfnFunctionDefinitionVersion cfnFunctionDefinitionVersion =
 * CfnFunctionDefinitionVersion.Builder.create(this, "MyCfnFunctionDefinitionVersion")
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
public open class CfnFunctionDefinitionVersion(
  cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFunctionDefinitionVersionProps,
  ) :
      this(software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFunctionDefinitionVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFunctionDefinitionVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFunctionDefinitionVersionProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The default configuration that applies to all Lambda functions in the group.
   */
  public open fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

  /**
   * The default configuration that applies to all Lambda functions in the group.
   */
  public open fun defaultConfig(`value`: IResolvable) {
    unwrap(this).setDefaultConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The default configuration that applies to all Lambda functions in the group.
   */
  public open fun defaultConfig(`value`: DefaultConfigProperty) {
    unwrap(this).setDefaultConfig(`value`.let(DefaultConfigProperty.Companion::unwrap))
  }

  /**
   * The default configuration that applies to all Lambda functions in the group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("78dcce2d9060f612ef47e9dad8c41f8af04c482e01979ccc46fc7f459c08d9bc")
  public open fun defaultConfig(`value`: DefaultConfigProperty.Builder.() -> Unit): Unit =
      defaultConfig(DefaultConfigProperty(`value`))

  /**
   * The ID of the function definition associated with this version.
   */
  public open fun functionDefinitionId(): String = unwrap(this).getFunctionDefinitionId()

  /**
   * The ID of the function definition associated with this version.
   */
  public open fun functionDefinitionId(`value`: String) {
    unwrap(this).setFunctionDefinitionId(`value`)
  }

  /**
   * The functions in this version.
   */
  public open fun functions(): Any = unwrap(this).getFunctions()

  /**
   * The functions in this version.
   */
  public open fun functions(`value`: IResolvable) {
    unwrap(this).setFunctions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The functions in this version.
   */
  public open fun functions(`value`: List<Any>) {
    unwrap(this).setFunctions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The functions in this version.
   */
  public open fun functions(vararg `value`: Any): Unit = functions(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.greengrass.CfnFunctionDefinitionVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The default configuration that applies to all Lambda functions in the group.
     *
     * Individual Lambda functions can override these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-defaultconfig)
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group. 
     */
    public fun defaultConfig(defaultConfig: IResolvable)

    /**
     * The default configuration that applies to all Lambda functions in the group.
     *
     * Individual Lambda functions can override these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-defaultconfig)
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group. 
     */
    public fun defaultConfig(defaultConfig: DefaultConfigProperty)

    /**
     * The default configuration that applies to all Lambda functions in the group.
     *
     * Individual Lambda functions can override these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-defaultconfig)
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82019ff910152f47747b71a66a37a07586105750ffcaeb88e0d746a78cec0f6")
    public fun defaultConfig(defaultConfig: DefaultConfigProperty.Builder.() -> Unit)

    /**
     * The ID of the function definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functiondefinitionid)
     * @param functionDefinitionId The ID of the function definition associated with this version. 
     */
    public fun functionDefinitionId(functionDefinitionId: String)

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
     * @param functions The functions in this version. 
     */
    public fun functions(functions: IResolvable)

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
     * @param functions The functions in this version. 
     */
    public fun functions(functions: List<Any>)

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
     * @param functions The functions in this version. 
     */
    public fun functions(vararg functions: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.Builder.create(scope,
        id)

    /**
     * The default configuration that applies to all Lambda functions in the group.
     *
     * Individual Lambda functions can override these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-defaultconfig)
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group. 
     */
    override fun defaultConfig(defaultConfig: IResolvable) {
      cdkBuilder.defaultConfig(defaultConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The default configuration that applies to all Lambda functions in the group.
     *
     * Individual Lambda functions can override these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-defaultconfig)
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group. 
     */
    override fun defaultConfig(defaultConfig: DefaultConfigProperty) {
      cdkBuilder.defaultConfig(defaultConfig.let(DefaultConfigProperty.Companion::unwrap))
    }

    /**
     * The default configuration that applies to all Lambda functions in the group.
     *
     * Individual Lambda functions can override these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-defaultconfig)
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82019ff910152f47747b71a66a37a07586105750ffcaeb88e0d746a78cec0f6")
    override fun defaultConfig(defaultConfig: DefaultConfigProperty.Builder.() -> Unit): Unit =
        defaultConfig(DefaultConfigProperty(defaultConfig))

    /**
     * The ID of the function definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functiondefinitionid)
     * @param functionDefinitionId The ID of the function definition associated with this version. 
     */
    override fun functionDefinitionId(functionDefinitionId: String) {
      cdkBuilder.functionDefinitionId(functionDefinitionId)
    }

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
     * @param functions The functions in this version. 
     */
    override fun functions(functions: IResolvable) {
      cdkBuilder.functions(functions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
     * @param functions The functions in this version. 
     */
    override fun functions(functions: List<Any>) {
      cdkBuilder.functions(functions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
     * @param functions The functions in this version. 
     */
    override fun functions(vararg functions: Any): Unit = functions(functions.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunctionDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunctionDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion):
        CfnFunctionDefinitionVersion = CfnFunctionDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion = wrapped.cdkObject
        as software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
  }

  /**
   * The default configuration that applies to all Lambda functions in the function definition
   * version.
   *
   * Individual Lambda functions can override these settings.
   *
   * In an AWS CloudFormation template, `DefaultConfig` is a property of the
   * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * DefaultConfigProperty defaultConfigProperty = DefaultConfigProperty.builder()
   * .execution(ExecutionProperty.builder()
   * .isolationMode("isolationMode")
   * .runAs(RunAsProperty.builder()
   * .gid(123)
   * .uid(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
   */
  public interface DefaultConfigProperty {
    /**
     * Configuration settings for the Lambda execution environment on the AWS IoT Greengrass core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html#cfn-greengrass-functiondefinitionversion-defaultconfig-execution)
     */
    public fun execution(): Any

    /**
     * A builder for [DefaultConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
       * Greengrass core. 
       */
      public fun execution(execution: IResolvable)

      /**
       * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
       * Greengrass core. 
       */
      public fun execution(execution: ExecutionProperty)

      /**
       * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
       * Greengrass core. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab209a2e03d21862e10902f454c3fb314447a1fbf2f24169b400dcf856b22465")
      public fun execution(execution: ExecutionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty.builder()

      /**
       * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
       * Greengrass core. 
       */
      override fun execution(execution: IResolvable) {
        cdkBuilder.execution(execution.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
       * Greengrass core. 
       */
      override fun execution(execution: ExecutionProperty) {
        cdkBuilder.execution(execution.let(ExecutionProperty.Companion::unwrap))
      }

      /**
       * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
       * Greengrass core. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab209a2e03d21862e10902f454c3fb314447a1fbf2f24169b400dcf856b22465")
      override fun execution(execution: ExecutionProperty.Builder.() -> Unit): Unit =
          execution(ExecutionProperty(execution))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty,
    ) : CdkObject(cdkObject),
        DefaultConfigProperty {
      /**
       * Configuration settings for the Lambda execution environment on the AWS IoT Greengrass core.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html#cfn-greengrass-functiondefinitionversion-defaultconfig-execution)
       */
      override fun execution(): Any = unwrap(this).getExecution()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty):
          DefaultConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? DefaultConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultConfigProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty
    }
  }

  /**
   * The environment configuration for a Lambda function on the AWS IoT Greengrass core.
   *
   * In an AWS CloudFormation template, `Environment` is a property of the
   * [`FunctionConfiguration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * Object variables;
   * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
   */
  public interface EnvironmentProperty {
    /**
     * Indicates whether the function is allowed to access the `/sys` directory on the core device,
     * which allows the read device information from `/sys` .
     *
     *
     * This property applies only to Lambda functions that run in a Greengrass container.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-accesssysfs)
     */
    public fun accessSysfs(): Any? = unwrap(this).getAccessSysfs()

    /**
     * Settings for the Lambda execution environment in AWS IoT Greengrass .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-execution)
     */
    public fun execution(): Any? = unwrap(this).getExecution()

    /**
     * A list of the
     * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
     * in the group that the function can access, with the corresponding read-only or read-write
     * permissions. The maximum is 10 resources.
     *
     *
     * This property applies only to Lambda functions that run in a Greengrass container.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-resourceaccesspolicies)
     */
    public fun resourceAccessPolicies(): Any? = unwrap(this).getResourceAccessPolicies()

    /**
     * Environment variables for the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-variables)
     */
    public fun variables(): Any? = unwrap(this).getVariables()

    /**
     * A builder for [EnvironmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessSysfs Indicates whether the function is allowed to access the `/sys` directory
       * on the core device, which allows the read device information from `/sys` .
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      public fun accessSysfs(accessSysfs: Boolean)

      /**
       * @param accessSysfs Indicates whether the function is allowed to access the `/sys` directory
       * on the core device, which allows the read device information from `/sys` .
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      public fun accessSysfs(accessSysfs: IResolvable)

      /**
       * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
       */
      public fun execution(execution: IResolvable)

      /**
       * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
       */
      public fun execution(execution: ExecutionProperty)

      /**
       * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5eb0289413331ee1a13511f29f86627b3364b0c1f246a611a4480965fbae462")
      public fun execution(execution: ExecutionProperty.Builder.() -> Unit)

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      public fun resourceAccessPolicies(resourceAccessPolicies: IResolvable)

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      public fun resourceAccessPolicies(resourceAccessPolicies: List<Any>)

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      public fun resourceAccessPolicies(vararg resourceAccessPolicies: Any)

      /**
       * @param variables Environment variables for the Lambda function.
       */
      public fun variables(variables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty.builder()

      /**
       * @param accessSysfs Indicates whether the function is allowed to access the `/sys` directory
       * on the core device, which allows the read device information from `/sys` .
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      override fun accessSysfs(accessSysfs: Boolean) {
        cdkBuilder.accessSysfs(accessSysfs)
      }

      /**
       * @param accessSysfs Indicates whether the function is allowed to access the `/sys` directory
       * on the core device, which allows the read device information from `/sys` .
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      override fun accessSysfs(accessSysfs: IResolvable) {
        cdkBuilder.accessSysfs(accessSysfs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
       */
      override fun execution(execution: IResolvable) {
        cdkBuilder.execution(execution.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
       */
      override fun execution(execution: ExecutionProperty) {
        cdkBuilder.execution(execution.let(ExecutionProperty.Companion::unwrap))
      }

      /**
       * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5eb0289413331ee1a13511f29f86627b3364b0c1f246a611a4480965fbae462")
      override fun execution(execution: ExecutionProperty.Builder.() -> Unit): Unit =
          execution(ExecutionProperty(execution))

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      override fun resourceAccessPolicies(resourceAccessPolicies: IResolvable) {
        cdkBuilder.resourceAccessPolicies(resourceAccessPolicies.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      override fun resourceAccessPolicies(resourceAccessPolicies: List<Any>) {
        cdkBuilder.resourceAccessPolicies(resourceAccessPolicies.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      override fun resourceAccessPolicies(vararg resourceAccessPolicies: Any): Unit =
          resourceAccessPolicies(resourceAccessPolicies.toList())

      /**
       * @param variables Environment variables for the Lambda function.
       */
      override fun variables(variables: Any) {
        cdkBuilder.variables(variables)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty,
    ) : CdkObject(cdkObject),
        EnvironmentProperty {
      /**
       * Indicates whether the function is allowed to access the `/sys` directory on the core
       * device, which allows the read device information from `/sys` .
       *
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-accesssysfs)
       */
      override fun accessSysfs(): Any? = unwrap(this).getAccessSysfs()

      /**
       * Settings for the Lambda execution environment in AWS IoT Greengrass .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-execution)
       */
      override fun execution(): Any? = unwrap(this).getExecution()

      /**
       * A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-resourceaccesspolicies)
       */
      override fun resourceAccessPolicies(): Any? = unwrap(this).getResourceAccessPolicies()

      /**
       * Environment variables for the Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html#cfn-greengrass-functiondefinitionversion-environment-variables)
       */
      override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty):
          EnvironmentProperty = CdkObjectWrappers.wrap(cdkObject) as? EnvironmentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty
    }
  }

  /**
   * Configuration settings for the Lambda execution environment on the AWS IoT Greengrass core.
   *
   * In an AWS CloudFormation template, `Execution` is a property of the
   * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
   * property type for a function definition version and the
   * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
   * property type for a function.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * ExecutionProperty executionProperty = ExecutionProperty.builder()
   * .isolationMode("isolationMode")
   * .runAs(RunAsProperty.builder()
   * .gid(123)
   * .uid(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html)
   */
  public interface ExecutionProperty {
    /**
     * The containerization that the Lambda function runs in.
     *
     * Valid values are `GreengrassContainer` or `NoContainer` . Typically, this is
     * `GreengrassContainer` . For more information, see
     * [Containerization](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-function-containerization)
     * in the *Developer Guide* .
     *
     * * When set on the
     * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
     * property of a function definition version, this setting is used as the default containerization
     * for all Lambda functions in the function definition version.
     * * When set on the
     * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
     * property of a function, this setting applies to the individual function and overrides the
     * default. Omit this value to run the function with the default containerization.
     *
     *
     * We recommend that you run in a Greengrass container unless your business case requires that
     * you run without containerization.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html#cfn-greengrass-functiondefinitionversion-execution-isolationmode)
     */
    public fun isolationMode(): String? = unwrap(this).getIsolationMode()

    /**
     * The user and group permissions used to run the Lambda function.
     *
     * Typically, this is the ggc_user and ggc_group. For more information, see [Run
     * as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
     * in the *Developer Guide* .
     *
     * * When set on the
     * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
     * property of a function definition version, this setting is used as the default access identity
     * for all Lambda functions in the function definition version.
     * * When set on the
     * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
     * property of a function, this setting applies to the individual function and overrides the
     * default. You can override the user, group, or both. Omit this value to run the function with the
     * default permissions.
     *
     *
     * Running as the root user increases risks to your data and device. Do not run as root
     * (UID/GID=0) unless your business case requires it. For more information and requirements, see
     * [Running a Lambda Function as
     * Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html#cfn-greengrass-functiondefinitionversion-execution-runas)
     */
    public fun runAs(): Any? = unwrap(this).getRunAs()

    /**
     * A builder for [ExecutionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isolationMode The containerization that the Lambda function runs in.
       * Valid values are `GreengrassContainer` or `NoContainer` . Typically, this is
       * `GreengrassContainer` . For more information, see
       * [Containerization](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-function-containerization)
       * in the *Developer Guide* .
       *
       * * When set on the
       * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
       * property of a function definition version, this setting is used as the default
       * containerization for all Lambda functions in the function definition version.
       * * When set on the
       * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
       * property of a function, this setting applies to the individual function and overrides the
       * default. Omit this value to run the function with the default containerization.
       *
       *
       * We recommend that you run in a Greengrass container unless your business case requires that
       * you run without containerization.
       */
      public fun isolationMode(isolationMode: String)

      /**
       * @param runAs The user and group permissions used to run the Lambda function.
       * Typically, this is the ggc_user and ggc_group. For more information, see [Run
       * as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
       * in the *Developer Guide* .
       *
       * * When set on the
       * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
       * property of a function definition version, this setting is used as the default access identity
       * for all Lambda functions in the function definition version.
       * * When set on the
       * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
       * property of a function, this setting applies to the individual function and overrides the
       * default. You can override the user, group, or both. Omit this value to run the function with
       * the default permissions.
       *
       *
       * Running as the root user increases risks to your data and device. Do not run as root
       * (UID/GID=0) unless your business case requires it. For more information and requirements, see
       * [Running a Lambda Function as
       * Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
       * .
       */
      public fun runAs(runAs: IResolvable)

      /**
       * @param runAs The user and group permissions used to run the Lambda function.
       * Typically, this is the ggc_user and ggc_group. For more information, see [Run
       * as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
       * in the *Developer Guide* .
       *
       * * When set on the
       * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
       * property of a function definition version, this setting is used as the default access identity
       * for all Lambda functions in the function definition version.
       * * When set on the
       * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
       * property of a function, this setting applies to the individual function and overrides the
       * default. You can override the user, group, or both. Omit this value to run the function with
       * the default permissions.
       *
       *
       * Running as the root user increases risks to your data and device. Do not run as root
       * (UID/GID=0) unless your business case requires it. For more information and requirements, see
       * [Running a Lambda Function as
       * Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
       * .
       */
      public fun runAs(runAs: RunAsProperty)

      /**
       * @param runAs The user and group permissions used to run the Lambda function.
       * Typically, this is the ggc_user and ggc_group. For more information, see [Run
       * as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
       * in the *Developer Guide* .
       *
       * * When set on the
       * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
       * property of a function definition version, this setting is used as the default access identity
       * for all Lambda functions in the function definition version.
       * * When set on the
       * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
       * property of a function, this setting applies to the individual function and overrides the
       * default. You can override the user, group, or both. Omit this value to run the function with
       * the default permissions.
       *
       *
       * Running as the root user increases risks to your data and device. Do not run as root
       * (UID/GID=0) unless your business case requires it. For more information and requirements, see
       * [Running a Lambda Function as
       * Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b05d229ae33ce9ef95d2388945e8e2b7fffebb1afeb93441d166cee3fb750a64")
      public fun runAs(runAs: RunAsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty.builder()

      /**
       * @param isolationMode The containerization that the Lambda function runs in.
       * Valid values are `GreengrassContainer` or `NoContainer` . Typically, this is
       * `GreengrassContainer` . For more information, see
       * [Containerization](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-function-containerization)
       * in the *Developer Guide* .
       *
       * * When set on the
       * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
       * property of a function definition version, this setting is used as the default
       * containerization for all Lambda functions in the function definition version.
       * * When set on the
       * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
       * property of a function, this setting applies to the individual function and overrides the
       * default. Omit this value to run the function with the default containerization.
       *
       *
       * We recommend that you run in a Greengrass container unless your business case requires that
       * you run without containerization.
       */
      override fun isolationMode(isolationMode: String) {
        cdkBuilder.isolationMode(isolationMode)
      }

      /**
       * @param runAs The user and group permissions used to run the Lambda function.
       * Typically, this is the ggc_user and ggc_group. For more information, see [Run
       * as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
       * in the *Developer Guide* .
       *
       * * When set on the
       * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
       * property of a function definition version, this setting is used as the default access identity
       * for all Lambda functions in the function definition version.
       * * When set on the
       * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
       * property of a function, this setting applies to the individual function and overrides the
       * default. You can override the user, group, or both. Omit this value to run the function with
       * the default permissions.
       *
       *
       * Running as the root user increases risks to your data and device. Do not run as root
       * (UID/GID=0) unless your business case requires it. For more information and requirements, see
       * [Running a Lambda Function as
       * Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
       * .
       */
      override fun runAs(runAs: IResolvable) {
        cdkBuilder.runAs(runAs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param runAs The user and group permissions used to run the Lambda function.
       * Typically, this is the ggc_user and ggc_group. For more information, see [Run
       * as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
       * in the *Developer Guide* .
       *
       * * When set on the
       * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
       * property of a function definition version, this setting is used as the default access identity
       * for all Lambda functions in the function definition version.
       * * When set on the
       * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
       * property of a function, this setting applies to the individual function and overrides the
       * default. You can override the user, group, or both. Omit this value to run the function with
       * the default permissions.
       *
       *
       * Running as the root user increases risks to your data and device. Do not run as root
       * (UID/GID=0) unless your business case requires it. For more information and requirements, see
       * [Running a Lambda Function as
       * Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
       * .
       */
      override fun runAs(runAs: RunAsProperty) {
        cdkBuilder.runAs(runAs.let(RunAsProperty.Companion::unwrap))
      }

      /**
       * @param runAs The user and group permissions used to run the Lambda function.
       * Typically, this is the ggc_user and ggc_group. For more information, see [Run
       * as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
       * in the *Developer Guide* .
       *
       * * When set on the
       * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
       * property of a function definition version, this setting is used as the default access identity
       * for all Lambda functions in the function definition version.
       * * When set on the
       * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
       * property of a function, this setting applies to the individual function and overrides the
       * default. You can override the user, group, or both. Omit this value to run the function with
       * the default permissions.
       *
       *
       * Running as the root user increases risks to your data and device. Do not run as root
       * (UID/GID=0) unless your business case requires it. For more information and requirements, see
       * [Running a Lambda Function as
       * Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b05d229ae33ce9ef95d2388945e8e2b7fffebb1afeb93441d166cee3fb750a64")
      override fun runAs(runAs: RunAsProperty.Builder.() -> Unit): Unit =
          runAs(RunAsProperty(runAs))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty,
    ) : CdkObject(cdkObject),
        ExecutionProperty {
      /**
       * The containerization that the Lambda function runs in.
       *
       * Valid values are `GreengrassContainer` or `NoContainer` . Typically, this is
       * `GreengrassContainer` . For more information, see
       * [Containerization](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-function-containerization)
       * in the *Developer Guide* .
       *
       * * When set on the
       * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
       * property of a function definition version, this setting is used as the default
       * containerization for all Lambda functions in the function definition version.
       * * When set on the
       * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
       * property of a function, this setting applies to the individual function and overrides the
       * default. Omit this value to run the function with the default containerization.
       *
       *
       * We recommend that you run in a Greengrass container unless your business case requires that
       * you run without containerization.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html#cfn-greengrass-functiondefinitionversion-execution-isolationmode)
       */
      override fun isolationMode(): String? = unwrap(this).getIsolationMode()

      /**
       * The user and group permissions used to run the Lambda function.
       *
       * Typically, this is the ggc_user and ggc_group. For more information, see [Run
       * as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
       * in the *Developer Guide* .
       *
       * * When set on the
       * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
       * property of a function definition version, this setting is used as the default access identity
       * for all Lambda functions in the function definition version.
       * * When set on the
       * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
       * property of a function, this setting applies to the individual function and overrides the
       * default. You can override the user, group, or both. Omit this value to run the function with
       * the default permissions.
       *
       *
       * Running as the root user increases risks to your data and device. Do not run as root
       * (UID/GID=0) unless your business case requires it. For more information and requirements, see
       * [Running a Lambda Function as
       * Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html#cfn-greengrass-functiondefinitionversion-execution-runas)
       */
      override fun runAs(): Any? = unwrap(this).getRunAs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExecutionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty):
          ExecutionProperty = CdkObjectWrappers.wrap(cdkObject) as? ExecutionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecutionProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty
    }
  }

  /**
   * The group-specific configuration settings for a Lambda function.
   *
   * These settings configure the function's behavior in the Greengrass group. For more information,
   * see [Controlling Execution of Greengrass Lambda Functions by Using Group-Specific
   * Configuration](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html)
   * in the *Developer Guide* .
   *
   * In an AWS CloudFormation template, `FunctionConfiguration` is a property of the
   * [`Function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * Object variables;
   * FunctionConfigurationProperty functionConfigurationProperty =
   * FunctionConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html)
   */
  public interface FunctionConfigurationProperty {
    /**
     * The expected encoding type of the input payload for the function.
     *
     * Valid values are `json` (default) and `binary` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-encodingtype)
     */
    public fun encodingType(): String? = unwrap(this).getEncodingType()

    /**
     * The environment configuration of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The execution arguments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-execargs)
     */
    public fun execArgs(): String? = unwrap(this).getExecArgs()

    /**
     * The name of the function executable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-executable)
     */
    public fun executable(): String? = unwrap(this).getExecutable()

    /**
     * The memory size (in KB) required by the function.
     *
     *
     * This property applies only to Lambda functions that run in a Greengrass container.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-memorysize)
     */
    public fun memorySize(): Number? = unwrap(this).getMemorySize()

    /**
     * Indicates whether the function is pinned (or *long-lived* ).
     *
     * Pinned functions start when the core starts and process all requests in the same container.
     * The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-pinned)
     */
    public fun pinned(): Any? = unwrap(this).getPinned()

    /**
     * The allowed execution time (in seconds) after which the function should terminate.
     *
     * For pinned functions, this timeout applies for each request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-timeout)
     */
    public fun timeout(): Number? = unwrap(this).getTimeout()

    /**
     * A builder for [FunctionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encodingType The expected encoding type of the input payload for the function.
       * Valid values are `json` (default) and `binary` .
       */
      public fun encodingType(encodingType: String)

      /**
       * @param environment The environment configuration of the function.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment The environment configuration of the function.
       */
      public fun environment(environment: EnvironmentProperty)

      /**
       * @param environment The environment configuration of the function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7c32354bfdcfec201e24ffa9b00ad1629815013bfd4d0cf2281a5048400a998")
      public fun environment(environment: EnvironmentProperty.Builder.() -> Unit)

      /**
       * @param execArgs The execution arguments.
       */
      public fun execArgs(execArgs: String)

      /**
       * @param executable The name of the function executable.
       */
      public fun executable(executable: String)

      /**
       * @param memorySize The memory size (in KB) required by the function.
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      public fun memorySize(memorySize: Number)

      /**
       * @param pinned Indicates whether the function is pinned (or *long-lived* ).
       * Pinned functions start when the core starts and process all requests in the same container.
       * The default value is false.
       */
      public fun pinned(pinned: Boolean)

      /**
       * @param pinned Indicates whether the function is pinned (or *long-lived* ).
       * Pinned functions start when the core starts and process all requests in the same container.
       * The default value is false.
       */
      public fun pinned(pinned: IResolvable)

      /**
       * @param timeout The allowed execution time (in seconds) after which the function should
       * terminate.
       * For pinned functions, this timeout applies for each request.
       */
      public fun timeout(timeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty.builder()

      /**
       * @param encodingType The expected encoding type of the input payload for the function.
       * Valid values are `json` (default) and `binary` .
       */
      override fun encodingType(encodingType: String) {
        cdkBuilder.encodingType(encodingType)
      }

      /**
       * @param environment The environment configuration of the function.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environment The environment configuration of the function.
       */
      override fun environment(environment: EnvironmentProperty) {
        cdkBuilder.environment(environment.let(EnvironmentProperty.Companion::unwrap))
      }

      /**
       * @param environment The environment configuration of the function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7c32354bfdcfec201e24ffa9b00ad1629815013bfd4d0cf2281a5048400a998")
      override fun environment(environment: EnvironmentProperty.Builder.() -> Unit): Unit =
          environment(EnvironmentProperty(environment))

      /**
       * @param execArgs The execution arguments.
       */
      override fun execArgs(execArgs: String) {
        cdkBuilder.execArgs(execArgs)
      }

      /**
       * @param executable The name of the function executable.
       */
      override fun executable(executable: String) {
        cdkBuilder.executable(executable)
      }

      /**
       * @param memorySize The memory size (in KB) required by the function.
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       */
      override fun memorySize(memorySize: Number) {
        cdkBuilder.memorySize(memorySize)
      }

      /**
       * @param pinned Indicates whether the function is pinned (or *long-lived* ).
       * Pinned functions start when the core starts and process all requests in the same container.
       * The default value is false.
       */
      override fun pinned(pinned: Boolean) {
        cdkBuilder.pinned(pinned)
      }

      /**
       * @param pinned Indicates whether the function is pinned (or *long-lived* ).
       * Pinned functions start when the core starts and process all requests in the same container.
       * The default value is false.
       */
      override fun pinned(pinned: IResolvable) {
        cdkBuilder.pinned(pinned.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeout The allowed execution time (in seconds) after which the function should
       * terminate.
       * For pinned functions, this timeout applies for each request.
       */
      override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty,
    ) : CdkObject(cdkObject),
        FunctionConfigurationProperty {
      /**
       * The expected encoding type of the input payload for the function.
       *
       * Valid values are `json` (default) and `binary` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-encodingtype)
       */
      override fun encodingType(): String? = unwrap(this).getEncodingType()

      /**
       * The environment configuration of the function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The execution arguments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-execargs)
       */
      override fun execArgs(): String? = unwrap(this).getExecArgs()

      /**
       * The name of the function executable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-executable)
       */
      override fun executable(): String? = unwrap(this).getExecutable()

      /**
       * The memory size (in KB) required by the function.
       *
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-memorysize)
       */
      override fun memorySize(): Number? = unwrap(this).getMemorySize()

      /**
       * Indicates whether the function is pinned (or *long-lived* ).
       *
       * Pinned functions start when the core starts and process all requests in the same container.
       * The default value is false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-pinned)
       */
      override fun pinned(): Any? = unwrap(this).getPinned()

      /**
       * The allowed execution time (in seconds) after which the function should terminate.
       *
       * For pinned functions, this timeout applies for each request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html#cfn-greengrass-functiondefinitionversion-functionconfiguration-timeout)
       */
      override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty):
          FunctionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FunctionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionConfigurationProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty
    }
  }

  /**
   * A function is a Lambda function that's referenced from an AWS IoT Greengrass group.
   *
   * The function is deployed to a Greengrass core where it runs locally. For more information, see
   * [Run Lambda Functions on the AWS IoT Greengrass
   * Core](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-functions.html) in the
   * *Developer Guide* .
   *
   * In an AWS CloudFormation template, the `Functions` property of the
   * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
   * resource contains a list of `Function` property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * Object variables;
   * FunctionProperty functionProperty = FunctionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html)
   */
  public interface FunctionProperty {
    /**
     * The Amazon Resource Name (ARN) of the alias (recommended) or version of the referenced Lambda
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html#cfn-greengrass-functiondefinitionversion-function-functionarn)
     */
    public fun functionArn(): String

    /**
     * The group-specific settings of the Lambda function.
     *
     * These settings configure the function's behavior in the Greengrass group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html#cfn-greengrass-functiondefinitionversion-function-functionconfiguration)
     */
    public fun functionConfiguration(): Any

    /**
     * A descriptive or arbitrary ID for the function.
     *
     * This value must be unique within the function definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html#cfn-greengrass-functiondefinitionversion-function-id)
     */
    public fun id(): String

    /**
     * A builder for [FunctionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functionArn The Amazon Resource Name (ARN) of the alias (recommended) or version of
       * the referenced Lambda function. 
       */
      public fun functionArn(functionArn: String)

      /**
       * @param functionConfiguration The group-specific settings of the Lambda function. 
       * These settings configure the function's behavior in the Greengrass group.
       */
      public fun functionConfiguration(functionConfiguration: IResolvable)

      /**
       * @param functionConfiguration The group-specific settings of the Lambda function. 
       * These settings configure the function's behavior in the Greengrass group.
       */
      public fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty)

      /**
       * @param functionConfiguration The group-specific settings of the Lambda function. 
       * These settings configure the function's behavior in the Greengrass group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c2168400448b4a6908898625dbcd08ebc3550cb295a3a9a6f56aea1149fdbce")
      public
          fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param id A descriptive or arbitrary ID for the function. 
       * This value must be unique within the function definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty.builder()

      /**
       * @param functionArn The Amazon Resource Name (ARN) of the alias (recommended) or version of
       * the referenced Lambda function. 
       */
      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      /**
       * @param functionConfiguration The group-specific settings of the Lambda function. 
       * These settings configure the function's behavior in the Greengrass group.
       */
      override fun functionConfiguration(functionConfiguration: IResolvable) {
        cdkBuilder.functionConfiguration(functionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param functionConfiguration The group-specific settings of the Lambda function. 
       * These settings configure the function's behavior in the Greengrass group.
       */
      override fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty) {
        cdkBuilder.functionConfiguration(functionConfiguration.let(FunctionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param functionConfiguration The group-specific settings of the Lambda function. 
       * These settings configure the function's behavior in the Greengrass group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c2168400448b4a6908898625dbcd08ebc3550cb295a3a9a6f56aea1149fdbce")
      override
          fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty.Builder.() -> Unit):
          Unit = functionConfiguration(FunctionConfigurationProperty(functionConfiguration))

      /**
       * @param id A descriptive or arbitrary ID for the function. 
       * This value must be unique within the function definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty,
    ) : CdkObject(cdkObject),
        FunctionProperty {
      /**
       * The Amazon Resource Name (ARN) of the alias (recommended) or version of the referenced
       * Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html#cfn-greengrass-functiondefinitionversion-function-functionarn)
       */
      override fun functionArn(): String = unwrap(this).getFunctionArn()

      /**
       * The group-specific settings of the Lambda function.
       *
       * These settings configure the function's behavior in the Greengrass group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html#cfn-greengrass-functiondefinitionversion-function-functionconfiguration)
       */
      override fun functionConfiguration(): Any = unwrap(this).getFunctionConfiguration()

      /**
       * A descriptive or arbitrary ID for the function.
       *
       * This value must be unique within the function definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html#cfn-greengrass-functiondefinitionversion-function-id)
       */
      override fun id(): String = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty):
          FunctionProperty = CdkObjectWrappers.wrap(cdkObject) as? FunctionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty
    }
  }

  /**
   * A list of the
   * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
   * in the group that the function can access, with the corresponding read-only or read-write
   * permissions. The maximum is 10 resources.
   *
   *
   * This property applies only to Lambda functions that run in a Greengrass container.
   *
   *
   * In an AWS CloudFormation template, `ResourceAccessPolicy` is a property of the
   * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * ResourceAccessPolicyProperty resourceAccessPolicyProperty =
   * ResourceAccessPolicyProperty.builder()
   * .resourceId("resourceId")
   * // the properties below are optional
   * .permission("permission")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-resourceaccesspolicy.html)
   */
  public interface ResourceAccessPolicyProperty {
    /**
     * The read-only or read-write access that the Lambda function has to the resource.
     *
     * Valid values are `ro` or `rw` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-resourceaccesspolicy.html#cfn-greengrass-functiondefinitionversion-resourceaccesspolicy-permission)
     */
    public fun permission(): String? = unwrap(this).getPermission()

    /**
     * The ID of the resource.
     *
     * This ID is assigned to the resource when you create the resource definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-resourceaccesspolicy.html#cfn-greengrass-functiondefinitionversion-resourceaccesspolicy-resourceid)
     */
    public fun resourceId(): String

    /**
     * A builder for [ResourceAccessPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param permission The read-only or read-write access that the Lambda function has to the
       * resource.
       * Valid values are `ro` or `rw` .
       */
      public fun permission(permission: String)

      /**
       * @param resourceId The ID of the resource. 
       * This ID is assigned to the resource when you create the resource definition.
       */
      public fun resourceId(resourceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty.builder()

      /**
       * @param permission The read-only or read-write access that the Lambda function has to the
       * resource.
       * Valid values are `ro` or `rw` .
       */
      override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      /**
       * @param resourceId The ID of the resource. 
       * This ID is assigned to the resource when you create the resource definition.
       */
      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty,
    ) : CdkObject(cdkObject),
        ResourceAccessPolicyProperty {
      /**
       * The read-only or read-write access that the Lambda function has to the resource.
       *
       * Valid values are `ro` or `rw` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-resourceaccesspolicy.html#cfn-greengrass-functiondefinitionversion-resourceaccesspolicy-permission)
       */
      override fun permission(): String? = unwrap(this).getPermission()

      /**
       * The ID of the resource.
       *
       * This ID is assigned to the resource when you create the resource definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-resourceaccesspolicy.html#cfn-greengrass-functiondefinitionversion-resourceaccesspolicy-resourceid)
       */
      override fun resourceId(): String = unwrap(this).getResourceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceAccessPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty):
          ResourceAccessPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceAccessPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceAccessPolicyProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty
    }
  }

  /**
   * The user and group permissions used to run the Lambda function.
   *
   * This setting overrides the default access identity that's specified for the group (by default,
   * ggc_user and ggc_group). You can override the user, group, or both. For more information, see [Run
   * as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
   * in the *Developer Guide* .
   *
   *
   * Running as the root user increases risks to your data and device. Do not run as root
   * (UID/GID=0) unless your business case requires it. For more information and requirements, see
   * [Running a Lambda Function as
   * Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
   * .
   *
   *
   * In an AWS CloudFormation template, `RunAs` is a property of the
   * [`Execution`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * RunAsProperty runAsProperty = RunAsProperty.builder()
   * .gid(123)
   * .uid(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html)
   */
  public interface RunAsProperty {
    /**
     * The group ID whose permissions are used to run the Lambda function.
     *
     * You can use the `getent group` command on your core device to look up the group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-gid)
     */
    public fun gid(): Number? = unwrap(this).getGid()

    /**
     * The user ID whose permissions are used to run the Lambda function.
     *
     * You can use the `getent passwd` command on your core device to look up the user ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-uid)
     */
    public fun uid(): Number? = unwrap(this).getUid()

    /**
     * A builder for [RunAsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gid The group ID whose permissions are used to run the Lambda function.
       * You can use the `getent group` command on your core device to look up the group ID.
       */
      public fun gid(gid: Number)

      /**
       * @param uid The user ID whose permissions are used to run the Lambda function.
       * You can use the `getent passwd` command on your core device to look up the user ID.
       */
      public fun uid(uid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty.builder()

      /**
       * @param gid The group ID whose permissions are used to run the Lambda function.
       * You can use the `getent group` command on your core device to look up the group ID.
       */
      override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      /**
       * @param uid The user ID whose permissions are used to run the Lambda function.
       * You can use the `getent passwd` command on your core device to look up the user ID.
       */
      override fun uid(uid: Number) {
        cdkBuilder.uid(uid)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty,
    ) : CdkObject(cdkObject),
        RunAsProperty {
      /**
       * The group ID whose permissions are used to run the Lambda function.
       *
       * You can use the `getent group` command on your core device to look up the group ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-gid)
       */
      override fun gid(): Number? = unwrap(this).getGid()

      /**
       * The user ID whose permissions are used to run the Lambda function.
       *
       * You can use the `getent passwd` command on your core device to look up the user ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html#cfn-greengrass-functiondefinitionversion-runas-uid)
       */
      override fun uid(): Number? = unwrap(this).getUid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RunAsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty):
          RunAsProperty = CdkObjectWrappers.wrap(cdkObject) as? RunAsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunAsProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty
    }
  }
}
