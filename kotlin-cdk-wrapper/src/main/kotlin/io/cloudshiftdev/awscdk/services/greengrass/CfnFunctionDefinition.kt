@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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
 * The `AWS::Greengrass::FunctionDefinition` resource represents a function definition for AWS IoT
 * Greengrass .
 *
 * Function definitions are used to organize your function definition versions.
 *
 * Function definitions can reference multiple function definition versions. All function definition
 * versions must be associated with a function definition. Each function definition version can contain
 * one or more functions.
 *
 *
 * When you create a function definition, you can optionally include an initial function definition
 * version. To associate a function definition version later, create an
 * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
 * resource and specify the ID of this function definition.
 *
 * After you create the function definition version that contains the functions you want to deploy,
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
 * Object tags;
 * Object variables;
 * CfnFunctionDefinition cfnFunctionDefinition = CfnFunctionDefinition.Builder.create(this,
 * "MyCfnFunctionDefinition")
 * .name("name")
 * // the properties below are optional
 * .initialVersion(FunctionDefinitionVersionProperty.builder()
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
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html)
 */
public open class CfnFunctionDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the `FunctionDefinition` , such as
   * `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/functions/1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the `FunctionDefinition` , such as `1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the last `FunctionDefinitionVersion` that was added to the `FunctionDefinition` ,
   * such as `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/functions/1234a5b6-78cd-901e-2fgh-3i45j6k178l9/versions/9876ac30-4bdb-4f9d-95af-b5fdb66be1a2`
   * .
   */
  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  /**
   * The name of the `FunctionDefinition` , such as `MyFunctionDefinition` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The function definition version to include when the function definition is created.
   */
  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The function definition version to include when the function definition is created.
   */
  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  /**
   * The function definition version to include when the function definition is created.
   */
  public open fun initialVersion(`value`: FunctionDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(FunctionDefinitionVersionProperty::unwrap))
  }

  /**
   * The function definition version to include when the function definition is created.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("beb5b3aa701a5afe064aec11a41e272bd9efe589ab90b6c3bc13195d44b2bfa2")
  public open fun initialVersion(`value`: FunctionDefinitionVersionProperty.Builder.() -> Unit):
      Unit = initialVersion(FunctionDefinitionVersionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the function definition.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the function definition.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Application-specific metadata to attach to the function definition.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * Application-specific metadata to attach to the function definition.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnFunctionDefinition].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param initialVersion The function definition version to include when the function definition
     * is created. 
     */
    public fun initialVersion(initialVersion: IResolvable)

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
     * @param initialVersion The function definition version to include when the function definition
     * is created. 
     */
    public fun initialVersion(initialVersion: FunctionDefinitionVersionProperty)

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
     * @param initialVersion The function definition version to include when the function definition
     * is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35ee5dff470757cc407ff4b9413c987d9546c3773f3711023827474554734ec3")
    public fun initialVersion(initialVersion: FunctionDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * The name of the function definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-name)
     * @param name The name of the function definition. 
     */
    public fun name(name: String)

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
     * @param tags Application-specific metadata to attach to the function definition. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.Builder
        = software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.Builder.create(scope, id)

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
     * @param initialVersion The function definition version to include when the function definition
     * is created. 
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

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
     * @param initialVersion The function definition version to include when the function definition
     * is created. 
     */
    override fun initialVersion(initialVersion: FunctionDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(FunctionDefinitionVersionProperty::unwrap))
    }

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
     * @param initialVersion The function definition version to include when the function definition
     * is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35ee5dff470757cc407ff4b9413c987d9546c3773f3711023827474554734ec3")
    override
        fun initialVersion(initialVersion: FunctionDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(FunctionDefinitionVersionProperty(initialVersion))

    /**
     * The name of the function definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-name)
     * @param name The name of the function definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param tags Application-specific metadata to attach to the function definition. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunctionDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunctionDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition):
        CfnFunctionDefinition = CfnFunctionDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionDefinition):
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinition = wrapped.cdkObject
  }

  /**
   * The access identity whose permissions are used to run the Lambda function.
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
   * [`Execution`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html)
   */
  public interface RunAsProperty {
    /**
     * The group ID whose permissions are used to run the Lambda function.
     *
     * You can use the `getent group` command on your core device to look up the group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-gid)
     */
    public fun gid(): Number? = unwrap(this).getGid()

    /**
     * The user ID whose permissions are used to run the Lambda function.
     *
     * You can use the `getent passwd` command on your core device to look up the user ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-uid)
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
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty.builder()

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
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty,
    ) : CdkObject(cdkObject), RunAsProperty {
      /**
       * The group ID whose permissions are used to run the Lambda function.
       *
       * You can use the `getent group` command on your core device to look up the group ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-gid)
       */
      override fun gid(): Number? = unwrap(this).getGid()

      /**
       * The user ID whose permissions are used to run the Lambda function.
       *
       * You can use the `getent passwd` command on your core device to look up the user ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html#cfn-greengrass-functiondefinition-runas-uid)
       */
      override fun uid(): Number? = unwrap(this).getUid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RunAsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty):
          RunAsProperty = CdkObjectWrappers.wrap(cdkObject) as RunAsProperty

      internal fun unwrap(wrapped: RunAsProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty
    }
  }

  /**
   * The environment configuration for a Lambda function on the AWS IoT Greengrass core.
   *
   * In an AWS CloudFormation template, `Environment` is a property of the
   * [`FunctionConfiguration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-accesssysfs)
     */
    public fun accessSysfs(): Any? = unwrap(this).getAccessSysfs()

    /**
     * Settings for the Lambda execution environment in AWS IoT Greengrass .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-execution)
     */
    public fun execution(): Any? = unwrap(this).getExecution()

    /**
     * A list of the
     * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
     * in the group that the function can access, with the corresponding read-only or read-write
     * permissions. The maximum is 10 resources.
     *
     *
     * This property applies only for Lambda functions that run in a Greengrass container.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-resourceaccesspolicies)
     */
    public fun resourceAccessPolicies(): Any? = unwrap(this).getResourceAccessPolicies()

    /**
     * Environment variables for the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-variables)
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
      @JvmName("672960fd906b1abcf1b7d98c45f3d0decd0fe6799e1f8677c19d7f1cabaa5865")
      public fun execution(execution: ExecutionProperty.Builder.() -> Unit)

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only for Lambda functions that run in a Greengrass container.
       */
      public fun resourceAccessPolicies(resourceAccessPolicies: IResolvable)

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only for Lambda functions that run in a Greengrass container.
       */
      public fun resourceAccessPolicies(resourceAccessPolicies: List<Any>)

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only for Lambda functions that run in a Greengrass container.
       */
      public fun resourceAccessPolicies(vararg resourceAccessPolicies: Any)

      /**
       * @param variables Environment variables for the Lambda function.
       */
      public fun variables(variables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty.builder()

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
        cdkBuilder.accessSysfs(accessSysfs.let(IResolvable::unwrap))
      }

      /**
       * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
       */
      override fun execution(execution: IResolvable) {
        cdkBuilder.execution(execution.let(IResolvable::unwrap))
      }

      /**
       * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
       */
      override fun execution(execution: ExecutionProperty) {
        cdkBuilder.execution(execution.let(ExecutionProperty::unwrap))
      }

      /**
       * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("672960fd906b1abcf1b7d98c45f3d0decd0fe6799e1f8677c19d7f1cabaa5865")
      override fun execution(execution: ExecutionProperty.Builder.() -> Unit): Unit =
          execution(ExecutionProperty(execution))

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only for Lambda functions that run in a Greengrass container.
       */
      override fun resourceAccessPolicies(resourceAccessPolicies: IResolvable) {
        cdkBuilder.resourceAccessPolicies(resourceAccessPolicies.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only for Lambda functions that run in a Greengrass container.
       */
      override fun resourceAccessPolicies(resourceAccessPolicies: List<Any>) {
        cdkBuilder.resourceAccessPolicies(resourceAccessPolicies)
      }

      /**
       * @param resourceAccessPolicies A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       * This property applies only for Lambda functions that run in a Greengrass container.
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
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty,
    ) : CdkObject(cdkObject), EnvironmentProperty {
      /**
       * Indicates whether the function is allowed to access the `/sys` directory on the core
       * device, which allows the read device information from `/sys` .
       *
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-accesssysfs)
       */
      override fun accessSysfs(): Any? = unwrap(this).getAccessSysfs()

      /**
       * Settings for the Lambda execution environment in AWS IoT Greengrass .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-execution)
       */
      override fun execution(): Any? = unwrap(this).getExecution()

      /**
       * A list of the
       * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
       * in the group that the function can access, with the corresponding read-only or read-write
       * permissions. The maximum is 10 resources.
       *
       *
       * This property applies only for Lambda functions that run in a Greengrass container.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-resourceaccesspolicies)
       */
      override fun resourceAccessPolicies(): Any? = unwrap(this).getResourceAccessPolicies()

      /**
       * Environment variables for the Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html#cfn-greengrass-functiondefinition-environment-variables)
       */
      override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty):
          EnvironmentProperty = CdkObjectWrappers.wrap(cdkObject) as EnvironmentProperty

      internal fun unwrap(wrapped: EnvironmentProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty
    }
  }

  /**
   * A function definition version contains a list of functions.
   *
   *
   * After you create a function definition version that contains the functions you want to deploy,
   * you must add it to your group version. For more information, see
   * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
   * .
   *
   *
   * In an AWS CloudFormation template, `FunctionDefinitionVersion` is the property type of the
   * `InitialVersion` property in the
   * [`AWS::Greengrass::FunctionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * Object variables;
   * FunctionDefinitionVersionProperty functionDefinitionVersionProperty =
   * FunctionDefinitionVersionProperty.builder()
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html)
   */
  public interface FunctionDefinitionVersionProperty {
    /**
     * The default configuration that applies to all Lambda functions in the group.
     *
     * Individual Lambda functions can override these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html#cfn-greengrass-functiondefinition-functiondefinitionversion-defaultconfig)
     */
    public fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html#cfn-greengrass-functiondefinition-functiondefinitionversion-functions)
     */
    public fun functions(): Any

    /**
     * A builder for [FunctionDefinitionVersionProperty]
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
      public fun defaultConfig(defaultConfig: DefaultConfigProperty)

      /**
       * @param defaultConfig The default configuration that applies to all Lambda functions in the
       * group.
       * Individual Lambda functions can override these settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("640e413cb0991a190f5d0c30f659f1b13592efa61decd9a9413f22a1fb8fa8b3")
      public fun defaultConfig(defaultConfig: DefaultConfigProperty.Builder.() -> Unit)

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
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty.builder()

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
      override fun defaultConfig(defaultConfig: DefaultConfigProperty) {
        cdkBuilder.defaultConfig(defaultConfig.let(DefaultConfigProperty::unwrap))
      }

      /**
       * @param defaultConfig The default configuration that applies to all Lambda functions in the
       * group.
       * Individual Lambda functions can override these settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("640e413cb0991a190f5d0c30f659f1b13592efa61decd9a9413f22a1fb8fa8b3")
      override fun defaultConfig(defaultConfig: DefaultConfigProperty.Builder.() -> Unit): Unit =
          defaultConfig(DefaultConfigProperty(defaultConfig))

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

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty,
    ) : CdkObject(cdkObject), FunctionDefinitionVersionProperty {
      /**
       * The default configuration that applies to all Lambda functions in the group.
       *
       * Individual Lambda functions can override these settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html#cfn-greengrass-functiondefinition-functiondefinitionversion-defaultconfig)
       */
      override fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

      /**
       * The functions in this version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html#cfn-greengrass-functiondefinition-functiondefinitionversion-functions)
       */
      override fun functions(): Any = unwrap(this).getFunctions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FunctionDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty):
          FunctionDefinitionVersionProperty = CdkObjectWrappers.wrap(cdkObject) as
          FunctionDefinitionVersionProperty

      internal fun unwrap(wrapped: FunctionDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty
    }
  }

  /**
   * The default configuration that applies to all Lambda functions in the function definition
   * version.
   *
   * Individual Lambda functions can override these settings.
   *
   * In an AWS CloudFormation template, `DefaultConfig` is a property of the
   * [`FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html)
   * property type.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-defaultconfig.html)
   */
  public interface DefaultConfigProperty {
    /**
     * Configuration settings for the Lambda execution environment on the AWS IoT Greengrass core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-defaultconfig.html#cfn-greengrass-functiondefinition-defaultconfig-execution)
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
      @JvmName("c0d7aa90f70b632c2ce686a06d0bda529e91590bcb1e14a2a20e7a4bfbb03b39")
      public fun execution(execution: ExecutionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty.builder()

      /**
       * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
       * Greengrass core. 
       */
      override fun execution(execution: IResolvable) {
        cdkBuilder.execution(execution.let(IResolvable::unwrap))
      }

      /**
       * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
       * Greengrass core. 
       */
      override fun execution(execution: ExecutionProperty) {
        cdkBuilder.execution(execution.let(ExecutionProperty::unwrap))
      }

      /**
       * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
       * Greengrass core. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0d7aa90f70b632c2ce686a06d0bda529e91590bcb1e14a2a20e7a4bfbb03b39")
      override fun execution(execution: ExecutionProperty.Builder.() -> Unit): Unit =
          execution(ExecutionProperty(execution))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty,
    ) : CdkObject(cdkObject), DefaultConfigProperty {
      /**
       * Configuration settings for the Lambda execution environment on the AWS IoT Greengrass core.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-defaultconfig.html#cfn-greengrass-functiondefinition-defaultconfig-execution)
       */
      override fun execution(): Any = unwrap(this).getExecution()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty):
          DefaultConfigProperty = CdkObjectWrappers.wrap(cdkObject) as DefaultConfigProperty

      internal fun unwrap(wrapped: DefaultConfigProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty
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
   * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-resourceaccesspolicy.html)
   */
  public interface ResourceAccessPolicyProperty {
    /**
     * The read-only or read-write access that the Lambda function has to the resource.
     *
     * Valid values are `ro` or `rw` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-resourceaccesspolicy.html#cfn-greengrass-functiondefinition-resourceaccesspolicy-permission)
     */
    public fun permission(): String? = unwrap(this).getPermission()

    /**
     * The ID of the resource.
     *
     * This ID is assigned to the resource when you create the resource definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-resourceaccesspolicy.html#cfn-greengrass-functiondefinition-resourceaccesspolicy-resourceid)
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
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty.builder()

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
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty,
    ) : CdkObject(cdkObject), ResourceAccessPolicyProperty {
      /**
       * The read-only or read-write access that the Lambda function has to the resource.
       *
       * Valid values are `ro` or `rw` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-resourceaccesspolicy.html#cfn-greengrass-functiondefinition-resourceaccesspolicy-permission)
       */
      override fun permission(): String? = unwrap(this).getPermission()

      /**
       * The ID of the resource.
       *
       * This ID is assigned to the resource when you create the resource definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-resourceaccesspolicy.html#cfn-greengrass-functiondefinition-resourceaccesspolicy-resourceid)
       */
      override fun resourceId(): String = unwrap(this).getResourceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceAccessPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty):
          ResourceAccessPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as
          ResourceAccessPolicyProperty

      internal fun unwrap(wrapped: ResourceAccessPolicyProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty
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
   * [`Function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html)
   */
  public interface FunctionConfigurationProperty {
    /**
     * The expected encoding type of the input payload for the function.
     *
     * Valid values are `json` (default) and `binary` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-encodingtype)
     */
    public fun encodingType(): String? = unwrap(this).getEncodingType()

    /**
     * The environment configuration of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The execution arguments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-execargs)
     */
    public fun execArgs(): String? = unwrap(this).getExecArgs()

    /**
     * The name of the function executable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-executable)
     */
    public fun executable(): String? = unwrap(this).getExecutable()

    /**
     * The memory size (in KB) required by the function.
     *
     *
     * This property applies only to Lambda functions that run in a Greengrass container.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-memorysize)
     */
    public fun memorySize(): Number? = unwrap(this).getMemorySize()

    /**
     * Indicates whether the function is pinned (or *long-lived* ).
     *
     * Pinned functions start when the core starts and process all requests in the same container.
     * The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-pinned)
     */
    public fun pinned(): Any? = unwrap(this).getPinned()

    /**
     * The allowed execution time (in seconds) after which the function should terminate.
     *
     * For pinned functions, this timeout applies for each request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-timeout)
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
      @JvmName("624cecd4ba9144d0fd5fd38efd0d37c8f49797e7c6d4ed99b2080ca22ad31f25")
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
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty.builder()

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
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      /**
       * @param environment The environment configuration of the function.
       */
      override fun environment(environment: EnvironmentProperty) {
        cdkBuilder.environment(environment.let(EnvironmentProperty::unwrap))
      }

      /**
       * @param environment The environment configuration of the function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("624cecd4ba9144d0fd5fd38efd0d37c8f49797e7c6d4ed99b2080ca22ad31f25")
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
        cdkBuilder.pinned(pinned.let(IResolvable::unwrap))
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
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty,
    ) : CdkObject(cdkObject), FunctionConfigurationProperty {
      /**
       * The expected encoding type of the input payload for the function.
       *
       * Valid values are `json` (default) and `binary` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-encodingtype)
       */
      override fun encodingType(): String? = unwrap(this).getEncodingType()

      /**
       * The environment configuration of the function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The execution arguments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-execargs)
       */
      override fun execArgs(): String? = unwrap(this).getExecArgs()

      /**
       * The name of the function executable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-executable)
       */
      override fun executable(): String? = unwrap(this).getExecutable()

      /**
       * The memory size (in KB) required by the function.
       *
       *
       * This property applies only to Lambda functions that run in a Greengrass container.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-memorysize)
       */
      override fun memorySize(): Number? = unwrap(this).getMemorySize()

      /**
       * Indicates whether the function is pinned (or *long-lived* ).
       *
       * Pinned functions start when the core starts and process all requests in the same container.
       * The default value is false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-pinned)
       */
      override fun pinned(): Any? = unwrap(this).getPinned()

      /**
       * The allowed execution time (in seconds) after which the function should terminate.
       *
       * For pinned functions, this timeout applies for each request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html#cfn-greengrass-functiondefinition-functionconfiguration-timeout)
       */
      override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty):
          FunctionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          FunctionConfigurationProperty

      internal fun unwrap(wrapped: FunctionConfigurationProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty
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
   * [`FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html)
   * property type contains a list of `Function` property types.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
   */
  public interface FunctionProperty {
    /**
     * The Amazon Resource Name (ARN) of the alias (recommended) or version of the referenced Lambda
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-functionarn)
     */
    public fun functionArn(): String

    /**
     * The group-specific settings of the Lambda function.
     *
     * These settings configure the function's behavior in the Greengrass group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-functionconfiguration)
     */
    public fun functionConfiguration(): Any

    /**
     * A descriptive or arbitrary ID for the function.
     *
     * This value must be unique within the function definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-id)
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
      @JvmName("892b908b091068977fd0b73643160004688a7b1cd1cedeeea3833f6c37f40c63")
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
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty.builder()

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
        cdkBuilder.functionConfiguration(functionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param functionConfiguration The group-specific settings of the Lambda function. 
       * These settings configure the function's behavior in the Greengrass group.
       */
      override fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty) {
        cdkBuilder.functionConfiguration(functionConfiguration.let(FunctionConfigurationProperty::unwrap))
      }

      /**
       * @param functionConfiguration The group-specific settings of the Lambda function. 
       * These settings configure the function's behavior in the Greengrass group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892b908b091068977fd0b73643160004688a7b1cd1cedeeea3833f6c37f40c63")
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
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty,
    ) : CdkObject(cdkObject), FunctionProperty {
      /**
       * The Amazon Resource Name (ARN) of the alias (recommended) or version of the referenced
       * Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-functionarn)
       */
      override fun functionArn(): String = unwrap(this).getFunctionArn()

      /**
       * The group-specific settings of the Lambda function.
       *
       * These settings configure the function's behavior in the Greengrass group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-functionconfiguration)
       */
      override fun functionConfiguration(): Any = unwrap(this).getFunctionConfiguration()

      /**
       * A descriptive or arbitrary ID for the function.
       *
       * This value must be unique within the function definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html#cfn-greengrass-functiondefinition-function-id)
       */
      override fun id(): String = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty):
          FunctionProperty = CdkObjectWrappers.wrap(cdkObject) as FunctionProperty

      internal fun unwrap(wrapped: FunctionProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty
    }
  }

  /**
   * Configuration settings for the Lambda execution environment on the AWS IoT Greengrass core.
   *
   * In an AWS CloudFormation template, `Execution` is a property of the
   * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-defaultconfig.html)
   * property type for a function definition version and the
   * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html#cfn-greengrass-functiondefinition-execution-isolationmode)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html#cfn-greengrass-functiondefinition-execution-runas)
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
      @JvmName("0586c371bdcad0496c02c8d58830c4dfdc86614590e0f6bc6161a132d5dcf809")
      public fun runAs(runAs: RunAsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty.builder()

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
        cdkBuilder.runAs(runAs.let(IResolvable::unwrap))
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
        cdkBuilder.runAs(runAs.let(RunAsProperty::unwrap))
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
      @JvmName("0586c371bdcad0496c02c8d58830c4dfdc86614590e0f6bc6161a132d5dcf809")
      override fun runAs(runAs: RunAsProperty.Builder.() -> Unit): Unit =
          runAs(RunAsProperty(runAs))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty,
    ) : CdkObject(cdkObject), ExecutionProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html#cfn-greengrass-functiondefinition-execution-isolationmode)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html#cfn-greengrass-functiondefinition-execution-runas)
       */
      override fun runAs(): Any? = unwrap(this).getRunAs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExecutionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty):
          ExecutionProperty = CdkObjectWrappers.wrap(cdkObject) as ExecutionProperty

      internal fun unwrap(wrapped: ExecutionProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty
    }
  }
}
