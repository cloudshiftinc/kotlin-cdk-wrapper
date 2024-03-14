package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceVersion
internal constructor(
    private val cdkObject: software.amazon.awscdk.CfnResourceVersion,
) : CfnResource(cdkObject), IInspectable {
    /** The Amazon Resource Name (ARN) of the extension. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * Whether the specified extension version is set as the default version.
     *
     * This applies only to private extensions you have registered in your account, and extensions
     * published by AWS . For public third-party extensions, whether they are activated in your
     * account, CloudFormation returns `null` .
     */
    public open fun attrIsDefaultVersion(): IResolvable =
        unwrap(this).getAttrIsDefaultVersion().let(IResolvable::wrap)

    /**
     * For resource type extensions, the provisioning behavior of the resource type.
     *
     * AWS CloudFormation determines the provisioning type during registration, based on the types
     * of handlers in the schema handler package submitted.
     *
     * Valid values include:
     * * `FULLY_MUTABLE` : The resource type includes an update handler to process updates to the
     *   type during stack update operations.
     * * `IMMUTABLE` : The resource type doesn't include an update handler, so the type can't be
     *   updated and must instead be replaced during stack update operations.
     * * `NON_PROVISIONABLE` : The resource type doesn't include all the following handlers, and
     *   therefore can't actually be provisioned.
     * * create
     * * read
     * * delete
     */
    public open fun attrProvisioningType(): String = unwrap(this).getAttrProvisioningType()

    /** The Amazon Resource Name (ARN) of the extension. */
    public open fun attrTypeArn(): String = unwrap(this).getAttrTypeArn()

    /**
     * The ID of a specific version of the extension.
     *
     * The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the
     * extension version when it is registered.
     *
     * If you specify a `VersionId` , `DescribeType` returns information about that specific
     * extension version. Otherwise, it returns information about the default extension version.
     */
    public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

    /**
     * The scope at which the extension is visible and usable in CloudFormation operations.
     *
     * Valid values include:
     * * `PRIVATE` : The extension is only visible and usable within the account in which it is
     *   registered. AWS CloudFormation marks any extensions you register as `PRIVATE` .
     * * `PUBLIC` : The extension is publicly visible and usable within any AWS account.
     */
    public open fun attrVisibility(): String = unwrap(this).getAttrVisibility()

    /**
     * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the
     * resource.
     */
    public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the
     * resource.
     */
    public open fun executionRoleArn(`value`: String) {
        unwrap(this).setExecutionRoleArn(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Logging configuration information for a resource. */
    public open fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    /** Logging configuration information for a resource. */
    public open fun loggingConfig(`value`: IResolvable) {
        unwrap(this).setLoggingConfig(`value`.let(IResolvable::unwrap))
    }

    /** Logging configuration information for a resource. */
    public open fun loggingConfig(`value`: LoggingConfigProperty) {
        unwrap(this).setLoggingConfig(`value`.let(LoggingConfigProperty::unwrap))
    }

    /** Logging configuration information for a resource. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("898127e69c92b33376d7b990c1022aea15f27a09b06ea17e4eeba77a5c5478f8")
    public open fun loggingConfig(`value`: LoggingConfigProperty.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfigProperty(`value`))

    /**
     * A URL to the S3 bucket containing the resource project package that contains the necessary
     * files for the resource you want to register.
     */
    public open fun schemaHandlerPackage(): String = unwrap(this).getSchemaHandlerPackage()

    /**
     * A URL to the S3 bucket containing the resource project package that contains the necessary
     * files for the resource you want to register.
     */
    public open fun schemaHandlerPackage(`value`: String) {
        unwrap(this).setSchemaHandlerPackage(`value`)
    }

    /** The name of the resource being registered. */
    public open fun typeName(): String = unwrap(this).getTypeName()

    /** The name of the resource being registered. */
    public open fun typeName(`value`: String) {
        unwrap(this).setTypeName(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.CfnResourceVersion]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking
         * the resource.
         *
         * If your resource calls AWS APIs in any of its handlers, you must create an *[IAM
         * execution role](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html)* that
         * includes the necessary permissions to call those AWS APIs, and provision that execution
         * role in your account. When CloudFormation needs to invoke the resource type handler,
         * CloudFormation assumes this execution role to create a temporary session token, which it
         * then passes to the resource type handler, thereby supplying your resource type with the
         * appropriate credentials.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-executionrolearn)
         *
         * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role for CloudFormation
         *   to assume when invoking the resource.
         */
        public fun executionRoleArn(executionRoleArn: String)

        /**
         * Logging configuration information for a resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
         *
         * @param loggingConfig Logging configuration information for a resource.
         */
        public fun loggingConfig(loggingConfig: IResolvable)

        /**
         * Logging configuration information for a resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
         *
         * @param loggingConfig Logging configuration information for a resource.
         */
        public fun loggingConfig(loggingConfig: LoggingConfigProperty)

        /**
         * Logging configuration information for a resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
         *
         * @param loggingConfig Logging configuration information for a resource.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("847dbb4122cc613e24d915f369e2e8953b20799c06bf9b5ab679f5a9bc6471c4")
        public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit)

        /**
         * A URL to the S3 bucket containing the resource project package that contains the
         * necessary files for the resource you want to register.
         *
         * For information on generating a schema handler package for the resource you want to
         * register, see
         * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
         * in the *CloudFormation CLI User Guide* .
         *
         * The user registering the resource must be able to access the package in the S3 bucket.
         * That is, the user needs to have
         * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html)
         * permissions for the schema handler package. For more information, see
         * [Actions, Resources, and Condition Keys for Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html)
         * in the *AWS Identity and Access Management User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-schemahandlerpackage)
         *
         * @param schemaHandlerPackage A URL to the S3 bucket containing the resource project
         *   package that contains the necessary files for the resource you want to register.
         */
        public fun schemaHandlerPackage(schemaHandlerPackage: String)

        /**
         * The name of the resource being registered.
         *
         * We recommend that resource names adhere to the following pattern:
         * *company_or_organization* :: *service* :: *type* .
         *
         * The following organization namespaces are reserved and can't be used in your resource
         * names:
         * * `Alexa`
         * * `AMZN`
         * * `Amazon`
         * * `AWS`
         * * `Custom`
         * * `Dev`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-typename)
         *
         * @param typeName The name of the resource being registered.
         */
        public fun typeName(typeName: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.CfnResourceVersion.Builder =
            software.amazon.awscdk.CfnResourceVersion.Builder.create(scope, id)

        /**
         * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking
         * the resource.
         *
         * If your resource calls AWS APIs in any of its handlers, you must create an *[IAM
         * execution role](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html)* that
         * includes the necessary permissions to call those AWS APIs, and provision that execution
         * role in your account. When CloudFormation needs to invoke the resource type handler,
         * CloudFormation assumes this execution role to create a temporary session token, which it
         * then passes to the resource type handler, thereby supplying your resource type with the
         * appropriate credentials.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-executionrolearn)
         *
         * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role for CloudFormation
         *   to assume when invoking the resource.
         */
        override fun executionRoleArn(executionRoleArn: String) {
            cdkBuilder.executionRoleArn(executionRoleArn)
        }

        /**
         * Logging configuration information for a resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
         *
         * @param loggingConfig Logging configuration information for a resource.
         */
        override fun loggingConfig(loggingConfig: IResolvable) {
            cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
        }

        /**
         * Logging configuration information for a resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
         *
         * @param loggingConfig Logging configuration information for a resource.
         */
        override fun loggingConfig(loggingConfig: LoggingConfigProperty) {
            cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfigProperty::unwrap))
        }

        /**
         * Logging configuration information for a resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
         *
         * @param loggingConfig Logging configuration information for a resource.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("847dbb4122cc613e24d915f369e2e8953b20799c06bf9b5ab679f5a9bc6471c4")
        override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit =
            loggingConfig(LoggingConfigProperty(loggingConfig))

        /**
         * A URL to the S3 bucket containing the resource project package that contains the
         * necessary files for the resource you want to register.
         *
         * For information on generating a schema handler package for the resource you want to
         * register, see
         * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
         * in the *CloudFormation CLI User Guide* .
         *
         * The user registering the resource must be able to access the package in the S3 bucket.
         * That is, the user needs to have
         * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html)
         * permissions for the schema handler package. For more information, see
         * [Actions, Resources, and Condition Keys for Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html)
         * in the *AWS Identity and Access Management User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-schemahandlerpackage)
         *
         * @param schemaHandlerPackage A URL to the S3 bucket containing the resource project
         *   package that contains the necessary files for the resource you want to register.
         */
        override fun schemaHandlerPackage(schemaHandlerPackage: String) {
            cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
        }

        /**
         * The name of the resource being registered.
         *
         * We recommend that resource names adhere to the following pattern:
         * *company_or_organization* :: *service* :: *type* .
         *
         * The following organization namespaces are reserved and can't be used in your resource
         * names:
         * * `Alexa`
         * * `AMZN`
         * * `Amazon`
         * * `AWS`
         * * `Custom`
         * * `Dev`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-typename)
         *
         * @param typeName The name of the resource being registered.
         */
        override fun typeName(typeName: String) {
            cdkBuilder.typeName(typeName)
        }

        public fun build(): software.amazon.awscdk.CfnResourceVersion = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnResourceVersion {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnResourceVersion(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.CfnResourceVersion
        ): CfnResourceVersion = CfnResourceVersion(cdkObject)

        internal fun unwrap(
            wrapped: CfnResourceVersion
        ): software.amazon.awscdk.CfnResourceVersion = wrapped.cdkObject
    }

    public interface LoggingConfigProperty {
        /**
         * The Amazon CloudWatch logs group to which CloudFormation sends error logging information
         * when invoking the type's handlers.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html#cfn-cloudformation-resourceversion-loggingconfig-loggroupname)
         */
        public fun logGroupName(): String? = unwrap(this).getLogGroupName()

        /**
         * The ARN of the role that CloudFormation should assume when sending log entries to
         * CloudWatch logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html#cfn-cloudformation-resourceversion-loggingconfig-logrolearn)
         */
        public fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

        /** A builder for [LoggingConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param logGroupName The Amazon CloudWatch logs group to which CloudFormation sends
             *   error logging information when invoking the type's handlers.
             */
            public fun logGroupName(logGroupName: String)

            /**
             * @param logRoleArn The ARN of the role that CloudFormation should assume when sending
             *   log entries to CloudWatch logs.
             */
            public fun logRoleArn(logRoleArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.CfnResourceVersion.LoggingConfigProperty.Builder =
                software.amazon.awscdk.CfnResourceVersion.LoggingConfigProperty.builder()

            /**
             * @param logGroupName The Amazon CloudWatch logs group to which CloudFormation sends
             *   error logging information when invoking the type's handlers.
             */
            override fun logGroupName(logGroupName: String) {
                cdkBuilder.logGroupName(logGroupName)
            }

            /**
             * @param logRoleArn The ARN of the role that CloudFormation should assume when sending
             *   log entries to CloudWatch logs.
             */
            override fun logRoleArn(logRoleArn: String) {
                cdkBuilder.logRoleArn(logRoleArn)
            }

            public fun build(): software.amazon.awscdk.CfnResourceVersion.LoggingConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject: software.amazon.awscdk.CfnResourceVersion.LoggingConfigProperty,
        ) : LoggingConfigProperty {
            /**
             * The Amazon CloudWatch logs group to which CloudFormation sends error logging
             * information when invoking the type's handlers.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html#cfn-cloudformation-resourceversion-loggingconfig-loggroupname)
             */
            override fun logGroupName(): String? = unwrap(this).getLogGroupName()

            /**
             * The ARN of the role that CloudFormation should assume when sending log entries to
             * CloudWatch logs.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html#cfn-cloudformation-resourceversion-loggingconfig-logrolearn)
             */
            override fun logRoleArn(): String? = unwrap(this).getLogRoleArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.CfnResourceVersion.LoggingConfigProperty
            ): LoggingConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: LoggingConfigProperty
            ): software.amazon.awscdk.CfnResourceVersion.LoggingConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
