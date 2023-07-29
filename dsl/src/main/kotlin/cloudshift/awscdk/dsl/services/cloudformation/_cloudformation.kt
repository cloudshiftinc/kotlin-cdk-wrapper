@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cloudformation

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnCustomResource
import software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps
import software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps
import software.amazon.awscdk.services.cloudformation.CfnHookVersion
import software.amazon.awscdk.services.cloudformation.CfnHookVersionProps
import software.amazon.awscdk.services.cloudformation.CfnMacro
import software.amazon.awscdk.services.cloudformation.CfnMacroProps
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps
import software.amazon.awscdk.services.cloudformation.CfnModuleVersion
import software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersion
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps
import software.amazon.awscdk.services.cloudformation.CfnPublisher
import software.amazon.awscdk.services.cloudformation.CfnPublisherProps
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps
import software.amazon.awscdk.services.cloudformation.CfnResourceVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps
import software.amazon.awscdk.services.cloudformation.CfnStack
import software.amazon.awscdk.services.cloudformation.CfnStackProps
import software.amazon.awscdk.services.cloudformation.CfnStackSet
import software.amazon.awscdk.services.cloudformation.CfnStackSetProps
import software.amazon.awscdk.services.cloudformation.CfnTypeActivation
import software.amazon.awscdk.services.cloudformation.CfnTypeActivationProps
import software.amazon.awscdk.services.cloudformation.CfnWaitCondition
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandle
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandleProps
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps
import software.constructs.Construct

public object cloudformation {
    /**
     * In a CloudFormation template, you use the `AWS::CloudFormation::CustomResource` or `Custom::
     * *String*` resource type to specify custom resources.
     *
     * Custom resources provide a way for you to write custom provisioning logic in CloudFormation
     * template and have CloudFormation run it during a stack operation, such as when you create,
     * update or delete a stack. For more information, see
     * [Custom resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-custom-resources.html)
     * .
     *
     * If you use the
     * [VPC endpoints](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html) feature,
     * custom resources in the VPC must have access to CloudFormation -specific Amazon Simple
     * Storage Service ( Amazon S3 ) buckets. Custom resources must send responses to a presigned
     * Amazon S3 URL. If they can't send responses to Amazon S3 , CloudFormation won't receive a
     * response and the stack operation fails. For more information, see
     * [Setting up VPC endpoints for AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-vpce-bucketnames.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnCustomResource cfnCustomResource = CfnCustomResource.Builder.create(this,
     * "MyCfnCustomResource")
     * .serviceToken("serviceToken")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html)
     */
    public inline fun cfnCustomResource(
        scope: Construct,
        id: String,
        block: CfnCustomResourceDsl.() -> Unit = {},
    ): CfnCustomResource {
        val builder = CfnCustomResourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCustomResource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnCustomResourceProps cfnCustomResourceProps = CfnCustomResourceProps.builder()
     * .serviceToken("serviceToken")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html)
     */
    public inline fun cfnCustomResourceProps(
        block: CfnCustomResourcePropsDsl.() -> Unit = {}
    ): CfnCustomResourceProps {
        val builder = CfnCustomResourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `HookDefaultVersion` resource specifies the default version of the hook.
     *
     * The default version of the hook is used in CloudFormation operations for this AWS account and
     * AWS Region .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnHookDefaultVersion cfnHookDefaultVersion = CfnHookDefaultVersion.Builder.create(this,
     * "MyCfnHookDefaultVersion")
     * .typeName("typeName")
     * .typeVersionArn("typeVersionArn")
     * .versionId("versionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html)
     */
    public inline fun cfnHookDefaultVersion(
        scope: Construct,
        id: String,
        block: CfnHookDefaultVersionDsl.() -> Unit = {},
    ): CfnHookDefaultVersion {
        val builder = CfnHookDefaultVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHookDefaultVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnHookDefaultVersionProps cfnHookDefaultVersionProps = CfnHookDefaultVersionProps.builder()
     * .typeName("typeName")
     * .typeVersionArn("typeVersionArn")
     * .versionId("versionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html)
     */
    public inline fun cfnHookDefaultVersionProps(
        block: CfnHookDefaultVersionPropsDsl.() -> Unit = {}
    ): CfnHookDefaultVersionProps {
        val builder = CfnHookDefaultVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `HookTypeConfig` resource specifies the configuration of a hook.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnHookTypeConfig cfnHookTypeConfig = CfnHookTypeConfig.Builder.create(this,
     * "MyCfnHookTypeConfig")
     * .configuration("configuration")
     * // the properties below are optional
     * .configurationAlias("configurationAlias")
     * .typeArn("typeArn")
     * .typeName("typeName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html)
     */
    public inline fun cfnHookTypeConfig(
        scope: Construct,
        id: String,
        block: CfnHookTypeConfigDsl.() -> Unit = {},
    ): CfnHookTypeConfig {
        val builder = CfnHookTypeConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHookTypeConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnHookTypeConfigProps cfnHookTypeConfigProps = CfnHookTypeConfigProps.builder()
     * .configuration("configuration")
     * // the properties below are optional
     * .configurationAlias("configurationAlias")
     * .typeArn("typeArn")
     * .typeName("typeName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html)
     */
    public inline fun cfnHookTypeConfigProps(
        block: CfnHookTypeConfigPropsDsl.() -> Unit = {}
    ): CfnHookTypeConfigProps {
        val builder = CfnHookTypeConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `HookVersion` resource publishes new or first hook version to the AWS CloudFormation
     * registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnHookVersion cfnHookVersion = CfnHookVersion.Builder.create(this, "MyCfnHookVersion")
     * .schemaHandlerPackage("schemaHandlerPackage")
     * .typeName("typeName")
     * // the properties below are optional
     * .executionRoleArn("executionRoleArn")
     * .loggingConfig(LoggingConfigProperty.builder()
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html)
     */
    public inline fun cfnHookVersion(
        scope: Construct,
        id: String,
        block: CfnHookVersionDsl.() -> Unit = {},
    ): CfnHookVersion {
        val builder = CfnHookVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `LoggingConfig` property type specifies logging configuration information for an
     * extension.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-hookversion-loggingconfig.html)
     */
    public inline fun cfnHookVersionLoggingConfigProperty(
        block: CfnHookVersionLoggingConfigPropertyDsl.() -> Unit = {}
    ): CfnHookVersion.LoggingConfigProperty {
        val builder = CfnHookVersionLoggingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHookVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnHookVersionProps cfnHookVersionProps = CfnHookVersionProps.builder()
     * .schemaHandlerPackage("schemaHandlerPackage")
     * .typeName("typeName")
     * // the properties below are optional
     * .executionRoleArn("executionRoleArn")
     * .loggingConfig(LoggingConfigProperty.builder()
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html)
     */
    public inline fun cfnHookVersionProps(
        block: CfnHookVersionPropsDsl.() -> Unit = {}
    ): CfnHookVersionProps {
        val builder = CfnHookVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CloudFormation::Macro` resource is a CloudFormation resource type that creates a
     * CloudFormation macro to perform custom processing on CloudFormation templates.
     *
     * For more information, see
     * [Using AWS CloudFormation macros to perform custom processing on templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnMacro cfnMacro = CfnMacro.Builder.create(this, "MyCfnMacro")
     * .functionName("functionName")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html)
     */
    public inline fun cfnMacro(
        scope: Construct,
        id: String,
        block: CfnMacroDsl.() -> Unit = {},
    ): CfnMacro {
        val builder = CfnMacroDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMacro`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnMacroProps cfnMacroProps = CfnMacroProps.builder()
     * .functionName("functionName")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html)
     */
    public inline fun cfnMacroProps(block: CfnMacroPropsDsl.() -> Unit = {}): CfnMacroProps {
        val builder = CfnMacroPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the default version of a module.
     *
     * The default version of the module will be used in CloudFormation operations for this account
     * and Region.
     *
     * To register a module version, use the
     * `[AWS::CloudFormation::ModuleVersion](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html)`
     * resource.
     *
     * For more information using modules, see
     * [Using modules to encapsulate and reuse resource configurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/modules.html)
     * and
     * [Registering extensions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register)
     * in the *AWS CloudFormation User Guide* . For information on developing modules, see
     * [Developing modules](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules.html)
     * in the *AWS CloudFormation CLI User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnModuleDefaultVersion cfnModuleDefaultVersion = CfnModuleDefaultVersion.Builder.create(this,
     * "MyCfnModuleDefaultVersion")
     * .arn("arn")
     * .moduleName("moduleName")
     * .versionId("versionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html)
     */
    public inline fun cfnModuleDefaultVersion(
        scope: Construct,
        id: String,
        block: CfnModuleDefaultVersionDsl.() -> Unit = {},
    ): CfnModuleDefaultVersion {
        val builder = CfnModuleDefaultVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModuleDefaultVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnModuleDefaultVersionProps cfnModuleDefaultVersionProps =
     * CfnModuleDefaultVersionProps.builder()
     * .arn("arn")
     * .moduleName("moduleName")
     * .versionId("versionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html)
     */
    public inline fun cfnModuleDefaultVersionProps(
        block: CfnModuleDefaultVersionPropsDsl.() -> Unit = {}
    ): CfnModuleDefaultVersionProps {
        val builder = CfnModuleDefaultVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Registers the specified version of the module with the CloudFormation service.
     *
     * Registering a module makes it available for use in CloudFormation templates in your AWS
     * account and Region.
     *
     * To specify a module version as the default version, use the
     * `[AWS::CloudFormation::ModuleDefaultVersion](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html)`
     * resource.
     *
     * For more information using modules, see
     * [Using modules to encapsulate and reuse resource configurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/modules.html)
     * and
     * [Registering extensions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register)
     * in the *CloudFormation User Guide* . For information on developing modules, see
     * [Developing modules](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules.html)
     * in the *CloudFormation CLI User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnModuleVersion cfnModuleVersion = CfnModuleVersion.Builder.create(this, "MyCfnModuleVersion")
     * .moduleName("moduleName")
     * .modulePackage("modulePackage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html)
     */
    public inline fun cfnModuleVersion(
        scope: Construct,
        id: String,
        block: CfnModuleVersionDsl.() -> Unit = {},
    ): CfnModuleVersion {
        val builder = CfnModuleVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModuleVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnModuleVersionProps cfnModuleVersionProps = CfnModuleVersionProps.builder()
     * .moduleName("moduleName")
     * .modulePackage("modulePackage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html)
     */
    public inline fun cfnModuleVersionProps(
        block: CfnModuleVersionPropsDsl.() -> Unit = {}
    ): CfnModuleVersionProps {
        val builder = CfnModuleVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Tests and publishes a registered extension as a public, third-party extension.
     *
     * CloudFormation first tests the extension to make sure it meets all necessary requirements for
     * being published in the CloudFormation registry. If it does, CloudFormation then publishes it
     * to the registry as a public third-party extension in this Region. Public extensions are
     * available for use by all CloudFormation users.
     * * For resource types, testing includes passing all contracts tests defined for the type.
     * * For modules, testing includes determining if the module's model meets all necessary
     *   requirements.
     *
     * For more information, see
     * [Testing your public extension prior to publishing](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-testing)
     * in the *CloudFormation CLI User Guide* .
     *
     * If you don't specify a version, CloudFormation uses the default version of the extension in
     * your account and Region for testing.
     *
     * To perform testing, CloudFormation assumes the execution role specified when the type was
     * registered.
     *
     * An extension must have a test status of `PASSED` before it can be published. For more
     * information, see
     * [Publishing extensions to make them available for public use](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html)
     * in the *CloudFormation CLI User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnPublicTypeVersion cfnPublicTypeVersion = CfnPublicTypeVersion.Builder.create(this,
     * "MyCfnPublicTypeVersion")
     * .arn("arn")
     * .logDeliveryBucket("logDeliveryBucket")
     * .publicVersionNumber("publicVersionNumber")
     * .type("type")
     * .typeName("typeName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html)
     */
    public inline fun cfnPublicTypeVersion(
        scope: Construct,
        id: String,
        block: CfnPublicTypeVersionDsl.() -> Unit = {},
    ): CfnPublicTypeVersion {
        val builder = CfnPublicTypeVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPublicTypeVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnPublicTypeVersionProps cfnPublicTypeVersionProps = CfnPublicTypeVersionProps.builder()
     * .arn("arn")
     * .logDeliveryBucket("logDeliveryBucket")
     * .publicVersionNumber("publicVersionNumber")
     * .type("type")
     * .typeName("typeName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html)
     */
    public inline fun cfnPublicTypeVersionProps(
        block: CfnPublicTypeVersionPropsDsl.() -> Unit = {}
    ): CfnPublicTypeVersionProps {
        val builder = CfnPublicTypeVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Registers your account as a publisher of public extensions in the CloudFormation registry.
     *
     * Public extensions are available for use by all CloudFormation users.
     *
     * For information on requirements for registering as a public extension publisher, see
     * [Registering your account to publish CloudFormation extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
     * in the *CloudFormation CLI User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnPublisher cfnPublisher = CfnPublisher.Builder.create(this, "MyCfnPublisher")
     * .acceptTermsAndConditions(false)
     * // the properties below are optional
     * .connectionArn("connectionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html)
     */
    public inline fun cfnPublisher(
        scope: Construct,
        id: String,
        block: CfnPublisherDsl.() -> Unit = {},
    ): CfnPublisher {
        val builder = CfnPublisherDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPublisher`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnPublisherProps cfnPublisherProps = CfnPublisherProps.builder()
     * .acceptTermsAndConditions(false)
     * // the properties below are optional
     * .connectionArn("connectionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html)
     */
    public inline fun cfnPublisherProps(
        block: CfnPublisherPropsDsl.() -> Unit = {}
    ): CfnPublisherProps {
        val builder = CfnPublisherPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the default version of a resource.
     *
     * The default version of a resource will be used in CloudFormation operations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnResourceDefaultVersion cfnResourceDefaultVersion =
     * CfnResourceDefaultVersion.Builder.create(this, "MyCfnResourceDefaultVersion")
     * .typeName("typeName")
     * .typeVersionArn("typeVersionArn")
     * .versionId("versionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html)
     */
    public inline fun cfnResourceDefaultVersion(
        scope: Construct,
        id: String,
        block: CfnResourceDefaultVersionDsl.() -> Unit = {},
    ): CfnResourceDefaultVersion {
        val builder = CfnResourceDefaultVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceDefaultVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnResourceDefaultVersionProps cfnResourceDefaultVersionProps =
     * CfnResourceDefaultVersionProps.builder()
     * .typeName("typeName")
     * .typeVersionArn("typeVersionArn")
     * .versionId("versionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html)
     */
    public inline fun cfnResourceDefaultVersionProps(
        block: CfnResourceDefaultVersionPropsDsl.() -> Unit = {}
    ): CfnResourceDefaultVersionProps {
        val builder = CfnResourceDefaultVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Registers a resource version with the CloudFormation service.
     *
     * Registering a resource version makes it available for use in CloudFormation templates in your
     * AWS account , and includes:
     * * Validating the resource schema.
     * * Determining which handlers, if any, have been specified for the resource.
     * * Making the resource available for use in your account.
     *
     * For more information on how to develop resources and ready them for registration, see
     * [Creating Resource Providers](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-types.html)
     * in the *CloudFormation CLI User Guide* .
     *
     * You can have a maximum of 50 resource versions registered at a time. This maximum is per
     * account and per Region.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnResourceVersion cfnResourceVersion = CfnResourceVersion.Builder.create(this,
     * "MyCfnResourceVersion")
     * .schemaHandlerPackage("schemaHandlerPackage")
     * .typeName("typeName")
     * // the properties below are optional
     * .executionRoleArn("executionRoleArn")
     * .loggingConfig(LoggingConfigProperty.builder()
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html)
     */
    public inline fun cfnResourceVersion(
        scope: Construct,
        id: String,
        block: CfnResourceVersionDsl.() -> Unit = {},
    ): CfnResourceVersion {
        val builder = CfnResourceVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Logging configuration information for a resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html)
     */
    public inline fun cfnResourceVersionLoggingConfigProperty(
        block: CfnResourceVersionLoggingConfigPropertyDsl.() -> Unit = {}
    ): CfnResourceVersion.LoggingConfigProperty {
        val builder = CfnResourceVersionLoggingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnResourceVersionProps cfnResourceVersionProps = CfnResourceVersionProps.builder()
     * .schemaHandlerPackage("schemaHandlerPackage")
     * .typeName("typeName")
     * // the properties below are optional
     * .executionRoleArn("executionRoleArn")
     * .loggingConfig(LoggingConfigProperty.builder()
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html)
     */
    public inline fun cfnResourceVersionProps(
        block: CfnResourceVersionPropsDsl.() -> Unit = {}
    ): CfnResourceVersionProps {
        val builder = CfnResourceVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CloudFormation::Stack` resource nests a stack as a resource in a top-level
     * template.
     *
     * You can add output values from a nested stack within the containing template. You use the
     * [GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
     * function with the nested stack's logical name and the name of the output value in the nested
     * stack in the format `Outputs. *NestedStackOutputName*` .
     *
     * We strongly recommend that updates to nested stacks are run from the parent stack.
     *
     * When you apply template changes to update a top-level stack, CloudFormation updates the
     * top-level stack and initiates an update to its nested stacks. CloudFormation updates the
     * resources of modified nested stacks, but doesn't update the resources of unmodified nested
     * stacks. For more information, see
     * [CloudFormation stack updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
     * .
     *
     * You must acknowledge IAM capabilities for nested stacks that contain IAM resources. Also,
     * verify that you have cancel update stack permissions, which is required if an update rolls
     * back. For more information about IAM and CloudFormation , see
     * [Controlling access with AWS Identity and Access Management](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnStack cfnStack = CfnStack.Builder.create(this, "MyCfnStack")
     * .templateUrl("templateUrl")
     * // the properties below are optional
     * .notificationArns(List.of("notificationArns"))
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .timeoutInMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html)
     */
    public inline fun cfnStack(
        scope: Construct,
        id: String,
        block: CfnStackDsl.() -> Unit = {},
    ): CfnStack {
        val builder = CfnStackDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStack`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnStackProps cfnStackProps = CfnStackProps.builder()
     * .templateUrl("templateUrl")
     * // the properties below are optional
     * .notificationArns(List.of("notificationArns"))
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .timeoutInMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html)
     */
    public inline fun cfnStackProps(block: CfnStackPropsDsl.() -> Unit = {}): CfnStackProps {
        val builder = CfnStackPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CloudFormation::StackSet` enables you to provision stacks into AWS accounts and
     * across Regions by using a single CloudFormation template.
     *
     * In the stack set, you specify the template to use, in addition to any parameters and
     * capabilities that the template requires.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * Object managedExecution;
     * CfnStackSet cfnStackSet = CfnStackSet.Builder.create(this, "MyCfnStackSet")
     * .permissionModel("permissionModel")
     * .stackSetName("stackSetName")
     * // the properties below are optional
     * .administrationRoleArn("administrationRoleArn")
     * .autoDeployment(AutoDeploymentProperty.builder()
     * .enabled(false)
     * .retainStacksOnAccountRemoval(false)
     * .build())
     * .callAs("callAs")
     * .capabilities(List.of("capabilities"))
     * .description("description")
     * .executionRoleName("executionRoleName")
     * .managedExecution(managedExecution)
     * .operationPreferences(OperationPreferencesProperty.builder()
     * .failureToleranceCount(123)
     * .failureTolerancePercentage(123)
     * .maxConcurrentCount(123)
     * .maxConcurrentPercentage(123)
     * .regionConcurrencyType("regionConcurrencyType")
     * .regionOrder(List.of("regionOrder"))
     * .build())
     * .parameters(List.of(ParameterProperty.builder()
     * .parameterKey("parameterKey")
     * .parameterValue("parameterValue")
     * .build()))
     * .stackInstancesGroup(List.of(StackInstancesProperty.builder()
     * .deploymentTargets(DeploymentTargetsProperty.builder()
     * .accountFilterType("accountFilterType")
     * .accounts(List.of("accounts"))
     * .organizationalUnitIds(List.of("organizationalUnitIds"))
     * .build())
     * .regions(List.of("regions"))
     * // the properties below are optional
     * .parameterOverrides(List.of(ParameterProperty.builder()
     * .parameterKey("parameterKey")
     * .parameterValue("parameterValue")
     * .build()))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .templateBody("templateBody")
     * .templateUrl("templateUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html)
     */
    public inline fun cfnStackSet(
        scope: Construct,
        id: String,
        block: CfnStackSetDsl.() -> Unit = {},
    ): CfnStackSet {
        val builder = CfnStackSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * [ `Service-managed` permissions] Describes whether StackSets automatically deploys to AWS
     * Organizations accounts that are added to a target organizational unit (OU).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * AutoDeploymentProperty autoDeploymentProperty = AutoDeploymentProperty.builder()
     * .enabled(false)
     * .retainStacksOnAccountRemoval(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-autodeployment.html)
     */
    public inline fun cfnStackSetAutoDeploymentProperty(
        block: CfnStackSetAutoDeploymentPropertyDsl.() -> Unit = {}
    ): CfnStackSet.AutoDeploymentProperty {
        val builder = CfnStackSetAutoDeploymentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS OrganizationalUnitIds or Accounts for which to create stack instances in the
     * specified Regions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * DeploymentTargetsProperty deploymentTargetsProperty = DeploymentTargetsProperty.builder()
     * .accountFilterType("accountFilterType")
     * .accounts(List.of("accounts"))
     * .organizationalUnitIds(List.of("organizationalUnitIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html)
     */
    public inline fun cfnStackSetDeploymentTargetsProperty(
        block: CfnStackSetDeploymentTargetsPropertyDsl.() -> Unit = {}
    ): CfnStackSet.DeploymentTargetsProperty {
        val builder = CfnStackSetDeploymentTargetsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes whether StackSets performs non-conflicting operations concurrently and queues
     * conflicting operations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * ManagedExecutionProperty managedExecutionProperty = ManagedExecutionProperty.builder()
     * .active(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-managedexecution.html)
     */
    public inline fun cfnStackSetManagedExecutionProperty(
        block: CfnStackSetManagedExecutionPropertyDsl.() -> Unit = {}
    ): CfnStackSet.ManagedExecutionProperty {
        val builder = CfnStackSetManagedExecutionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The user-specified preferences for how AWS CloudFormation performs a stack set operation.
     *
     * For more information on maximum concurrent accounts and failure tolerance, see
     * [Stack set operation options](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * OperationPreferencesProperty operationPreferencesProperty =
     * OperationPreferencesProperty.builder()
     * .failureToleranceCount(123)
     * .failureTolerancePercentage(123)
     * .maxConcurrentCount(123)
     * .maxConcurrentPercentage(123)
     * .regionConcurrencyType("regionConcurrencyType")
     * .regionOrder(List.of("regionOrder"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html)
     */
    public inline fun cfnStackSetOperationPreferencesProperty(
        block: CfnStackSetOperationPreferencesPropertyDsl.() -> Unit = {}
    ): CfnStackSet.OperationPreferencesProperty {
        val builder = CfnStackSetOperationPreferencesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Parameter data type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * ParameterProperty parameterProperty = ParameterProperty.builder()
     * .parameterKey("parameterKey")
     * .parameterValue("parameterValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-parameter.html)
     */
    public inline fun cfnStackSetParameterProperty(
        block: CfnStackSetParameterPropertyDsl.() -> Unit = {}
    ): CfnStackSet.ParameterProperty {
        val builder = CfnStackSetParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStackSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * Object managedExecution;
     * CfnStackSetProps cfnStackSetProps = CfnStackSetProps.builder()
     * .permissionModel("permissionModel")
     * .stackSetName("stackSetName")
     * // the properties below are optional
     * .administrationRoleArn("administrationRoleArn")
     * .autoDeployment(AutoDeploymentProperty.builder()
     * .enabled(false)
     * .retainStacksOnAccountRemoval(false)
     * .build())
     * .callAs("callAs")
     * .capabilities(List.of("capabilities"))
     * .description("description")
     * .executionRoleName("executionRoleName")
     * .managedExecution(managedExecution)
     * .operationPreferences(OperationPreferencesProperty.builder()
     * .failureToleranceCount(123)
     * .failureTolerancePercentage(123)
     * .maxConcurrentCount(123)
     * .maxConcurrentPercentage(123)
     * .regionConcurrencyType("regionConcurrencyType")
     * .regionOrder(List.of("regionOrder"))
     * .build())
     * .parameters(List.of(ParameterProperty.builder()
     * .parameterKey("parameterKey")
     * .parameterValue("parameterValue")
     * .build()))
     * .stackInstancesGroup(List.of(StackInstancesProperty.builder()
     * .deploymentTargets(DeploymentTargetsProperty.builder()
     * .accountFilterType("accountFilterType")
     * .accounts(List.of("accounts"))
     * .organizationalUnitIds(List.of("organizationalUnitIds"))
     * .build())
     * .regions(List.of("regions"))
     * // the properties below are optional
     * .parameterOverrides(List.of(ParameterProperty.builder()
     * .parameterKey("parameterKey")
     * .parameterValue("parameterValue")
     * .build()))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .templateBody("templateBody")
     * .templateUrl("templateUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html)
     */
    public inline fun cfnStackSetProps(
        block: CfnStackSetPropsDsl.() -> Unit = {}
    ): CfnStackSetProps {
        val builder = CfnStackSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Stack instances in some specific accounts and Regions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * StackInstancesProperty stackInstancesProperty = StackInstancesProperty.builder()
     * .deploymentTargets(DeploymentTargetsProperty.builder()
     * .accountFilterType("accountFilterType")
     * .accounts(List.of("accounts"))
     * .organizationalUnitIds(List.of("organizationalUnitIds"))
     * .build())
     * .regions(List.of("regions"))
     * // the properties below are optional
     * .parameterOverrides(List.of(ParameterProperty.builder()
     * .parameterKey("parameterKey")
     * .parameterValue("parameterValue")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-stackinstances.html)
     */
    public inline fun cfnStackSetStackInstancesProperty(
        block: CfnStackSetStackInstancesPropertyDsl.() -> Unit = {}
    ): CfnStackSet.StackInstancesProperty {
        val builder = CfnStackSetStackInstancesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Activates a public third-party extension, making it available for use in stack templates.
     *
     * For more information, see
     * [Using public extensions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Once you have activated a public third-party extension in your account and Region, use
     * [SetTypeConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html)
     * to specify configuration properties for the extension. For more information, see
     * [Configuring extensions at the account level](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration)
     * in the *CloudFormation User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnTypeActivation cfnTypeActivation = CfnTypeActivation.Builder.create(this,
     * "MyCfnTypeActivation")
     * .autoUpdate(false)
     * .executionRoleArn("executionRoleArn")
     * .loggingConfig(LoggingConfigProperty.builder()
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build())
     * .majorVersion("majorVersion")
     * .publicTypeArn("publicTypeArn")
     * .publisherId("publisherId")
     * .type("type")
     * .typeName("typeName")
     * .typeNameAlias("typeNameAlias")
     * .versionBump("versionBump")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html)
     */
    public inline fun cfnTypeActivation(
        scope: Construct,
        id: String,
        block: CfnTypeActivationDsl.() -> Unit = {},
    ): CfnTypeActivation {
        val builder = CfnTypeActivationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains logging configuration information for an extension.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html)
     */
    public inline fun cfnTypeActivationLoggingConfigProperty(
        block: CfnTypeActivationLoggingConfigPropertyDsl.() -> Unit = {}
    ): CfnTypeActivation.LoggingConfigProperty {
        val builder = CfnTypeActivationLoggingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTypeActivation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnTypeActivationProps cfnTypeActivationProps = CfnTypeActivationProps.builder()
     * .autoUpdate(false)
     * .executionRoleArn("executionRoleArn")
     * .loggingConfig(LoggingConfigProperty.builder()
     * .logGroupName("logGroupName")
     * .logRoleArn("logRoleArn")
     * .build())
     * .majorVersion("majorVersion")
     * .publicTypeArn("publicTypeArn")
     * .publisherId("publisherId")
     * .type("type")
     * .typeName("typeName")
     * .typeNameAlias("typeNameAlias")
     * .versionBump("versionBump")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html)
     */
    public inline fun cfnTypeActivationProps(
        block: CfnTypeActivationPropsDsl.() -> Unit = {}
    ): CfnTypeActivationProps {
        val builder = CfnTypeActivationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For Amazon EC2 and Auto Scaling resources, we recommend that you use a `CreationPolicy`
     * attribute instead of wait conditions.
     *
     * Add a CreationPolicy attribute to those resources, and use the cfn-signal helper script to
     * signal when an instance creation process has completed successfully.
     *
     * You can use a wait condition for situations like the following:
     * * To coordinate stack resource creation with configuration actions that are external to the
     *   stack creation.
     * * To track the status of a configuration process.
     *
     * For these situations, we recommend that you associate a
     * [CreationPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-creationpolicy.html)
     * attribute with the wait condition so that you don't have to use a wait condition handle. For
     * more information and an example, see
     * [Creating wait conditions in a template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-waitcondition.html)
     * . If you use a CreationPolicy with a wait condition, don't specify any of the wait
     * condition's properties.
     *
     * If you use the
     * [VPC endpoints](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html) feature,
     * resources in the VPC that respond to wait conditions must have access to CloudFormation ,
     * specific Amazon Simple Storage Service ( Amazon S3 ) buckets. Resources must send wait
     * condition responses to a presigned Amazon S3 URL. If they can't send responses to Amazon S3 ,
     * CloudFormation won't receive a response and the stack operation fails. For more information,
     * see
     * [Setting up VPC endpoints for AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-vpce-bucketnames.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnWaitCondition cfnWaitCondition = CfnWaitCondition.Builder.create(this, "MyCfnWaitCondition")
     * .count(123)
     * .handle("handle")
     * .timeout("timeout")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html)
     */
    public inline fun cfnWaitCondition(
        scope: Construct,
        id: String,
        block: CfnWaitConditionDsl.() -> Unit = {},
    ): CfnWaitCondition {
        val builder = CfnWaitConditionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * For Amazon EC2 and Auto Scaling resources, we recommend that you use a `CreationPolicy`
     * attribute instead of wait conditions.
     *
     * Add a `CreationPolicy` attribute to those resources, and use the cfn-signal helper script to
     * signal when an instance creation process has completed successfully.
     *
     * For more information, see
     * [Deploying applications on Amazon EC2 with AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/deploying.applications.html)
     * .
     *
     * The `AWS::CloudFormation::WaitConditionHandle` type has no properties. When you reference the
     * `WaitConditionHandle` resource by using the `Ref` function, AWS CloudFormation returns a
     * presigned URL. You pass this URL to applications or scripts that are running on your Amazon
     * EC2 instances to send signals to that URL. An associated `AWS::CloudFormation::WaitCondition`
     * resource checks the URL for the required number of success signals or for a failure signal.
     *
     * Anytime you add a `WaitCondition` resource during a stack update or update a resource with a
     * wait condition, you must associate the wait condition with a new `WaitConditionHandle`
     * resource. Don't reuse an old wait condition handle that has already been defined in the
     * template. If you reuse a wait condition handle, the wait condition might evaluate old signals
     * from a previous create or update stack command. &gt; Updates aren't supported for this
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnWaitConditionHandle cfnWaitConditionHandle = CfnWaitConditionHandle.Builder.create(this,
     * "MyCfnWaitConditionHandle").build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitconditionhandle.html)
     */
    public inline fun cfnWaitConditionHandle(
        scope: Construct,
        id: String,
        block: CfnWaitConditionHandleDsl.() -> Unit = {},
    ): CfnWaitConditionHandle {
        val builder = CfnWaitConditionHandleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWaitConditionHandle`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnWaitConditionHandleProps cfnWaitConditionHandleProps =
     * CfnWaitConditionHandleProps.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitconditionhandle.html)
     */
    public inline fun cfnWaitConditionHandleProps(
        block: CfnWaitConditionHandlePropsDsl.() -> Unit = {}
    ): CfnWaitConditionHandleProps {
        val builder = CfnWaitConditionHandlePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWaitCondition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudformation.*;
     * CfnWaitConditionProps cfnWaitConditionProps = CfnWaitConditionProps.builder()
     * .count(123)
     * .handle("handle")
     * .timeout("timeout")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html)
     */
    public inline fun cfnWaitConditionProps(
        block: CfnWaitConditionPropsDsl.() -> Unit = {}
    ): CfnWaitConditionProps {
        val builder = CfnWaitConditionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
