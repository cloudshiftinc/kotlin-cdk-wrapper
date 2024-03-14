package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTypeActivation
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cloudformation.CfnTypeActivation,
) : CfnResource(cdkObject), IInspectable {
    /** The Amazon Resource Name (ARN) of the activated extension, in this account and Region. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * Whether to automatically update the extension in this account and Region when a new *minor*
     * version is published by the extension publisher.
     */
    public open fun autoUpdate(): Any? = unwrap(this).getAutoUpdate()

    /**
     * Whether to automatically update the extension in this account and Region when a new *minor*
     * version is published by the extension publisher.
     */
    public open fun autoUpdate(`value`: Boolean) {
        unwrap(this).setAutoUpdate(`value`)
    }

    /**
     * Whether to automatically update the extension in this account and Region when a new *minor*
     * version is published by the extension publisher.
     */
    public open fun autoUpdate(`value`: IResolvable) {
        unwrap(this).setAutoUpdate(`value`.let(IResolvable::unwrap))
    }

    /** The name of the IAM execution role to use to activate the extension. */
    public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /** The name of the IAM execution role to use to activate the extension. */
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

    /** Specifies logging configuration information for an extension. */
    public open fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    /** Specifies logging configuration information for an extension. */
    public open fun loggingConfig(`value`: IResolvable) {
        unwrap(this).setLoggingConfig(`value`.let(IResolvable::unwrap))
    }

    /** Specifies logging configuration information for an extension. */
    public open fun loggingConfig(`value`: LoggingConfigProperty) {
        unwrap(this).setLoggingConfig(`value`.let(LoggingConfigProperty::unwrap))
    }

    /** Specifies logging configuration information for an extension. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6893b97170076d32c8de07258f1142d1ab246a2bad5c98d4887e94f070342e2")
    public open fun loggingConfig(`value`: LoggingConfigProperty.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfigProperty(`value`))

    /**
     * The major version of this extension you want to activate, if multiple major versions are
     * available.
     */
    public open fun majorVersion(): String? = unwrap(this).getMajorVersion()

    /**
     * The major version of this extension you want to activate, if multiple major versions are
     * available.
     */
    public open fun majorVersion(`value`: String) {
        unwrap(this).setMajorVersion(`value`)
    }

    /** The Amazon Resource Number (ARN) of the public extension. */
    public open fun publicTypeArn(): String? = unwrap(this).getPublicTypeArn()

    /** The Amazon Resource Number (ARN) of the public extension. */
    public open fun publicTypeArn(`value`: String) {
        unwrap(this).setPublicTypeArn(`value`)
    }

    /** The ID of the extension publisher. */
    public open fun publisherId(): String? = unwrap(this).getPublisherId()

    /** The ID of the extension publisher. */
    public open fun publisherId(`value`: String) {
        unwrap(this).setPublisherId(`value`)
    }

    /** The extension type. */
    public open fun type(): String? = unwrap(this).getType()

    /** The extension type. */
    public open fun type(`value`: String) {
        unwrap(this).setType(`value`)
    }

    /** The name of the extension. */
    public open fun typeName(): String? = unwrap(this).getTypeName()

    /** The name of the extension. */
    public open fun typeName(`value`: String) {
        unwrap(this).setTypeName(`value`)
    }

    /** An alias to assign to the public extension, in this account and Region. */
    public open fun typeNameAlias(): String? = unwrap(this).getTypeNameAlias()

    /** An alias to assign to the public extension, in this account and Region. */
    public open fun typeNameAlias(`value`: String) {
        unwrap(this).setTypeNameAlias(`value`)
    }

    /**
     * Manually updates a previously-activated type to a new major or minor version, if available.
     */
    public open fun versionBump(): String? = unwrap(this).getVersionBump()

    /**
     * Manually updates a previously-activated type to a new major or minor version, if available.
     */
    public open fun versionBump(`value`: String) {
        unwrap(this).setVersionBump(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.cloudformation.CfnTypeActivation]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Whether to automatically update the extension in this account and Region when a new
         * *minor* version is published by the extension publisher.
         *
         * Major versions released by the publisher must be manually updated.
         *
         * The default is `true` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
         *
         * @param autoUpdate Whether to automatically update the extension in this account and
         *   Region when a new *minor* version is published by the extension publisher.
         */
        public fun autoUpdate(autoUpdate: Boolean)

        /**
         * Whether to automatically update the extension in this account and Region when a new
         * *minor* version is published by the extension publisher.
         *
         * Major versions released by the publisher must be manually updated.
         *
         * The default is `true` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
         *
         * @param autoUpdate Whether to automatically update the extension in this account and
         *   Region when a new *minor* version is published by the extension publisher.
         */
        public fun autoUpdate(autoUpdate: IResolvable)

        /**
         * The name of the IAM execution role to use to activate the extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-executionrolearn)
         *
         * @param executionRoleArn The name of the IAM execution role to use to activate the
         *   extension.
         */
        public fun executionRoleArn(executionRoleArn: String)

        /**
         * Specifies logging configuration information for an extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
         *
         * @param loggingConfig Specifies logging configuration information for an extension.
         */
        public fun loggingConfig(loggingConfig: IResolvable)

        /**
         * Specifies logging configuration information for an extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
         *
         * @param loggingConfig Specifies logging configuration information for an extension.
         */
        public fun loggingConfig(loggingConfig: LoggingConfigProperty)

        /**
         * Specifies logging configuration information for an extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
         *
         * @param loggingConfig Specifies logging configuration information for an extension.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("9a1b9bbc815436b201657fbc8dbec93ee9ba4e77953926bb53912bda239d93b4")
        public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit)

        /**
         * The major version of this extension you want to activate, if multiple major versions are
         * available.
         *
         * The default is the latest major version. CloudFormation uses the latest available *minor*
         * version of the major version selected.
         *
         * You can specify `MajorVersion` or `VersionBump` , but not both.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-majorversion)
         *
         * @param majorVersion The major version of this extension you want to activate, if multiple
         *   major versions are available.
         */
        public fun majorVersion(majorVersion: String)

        /**
         * The Amazon Resource Number (ARN) of the public extension.
         *
         * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and
         * `PublisherId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publictypearn)
         *
         * @param publicTypeArn The Amazon Resource Number (ARN) of the public extension.
         */
        public fun publicTypeArn(publicTypeArn: String)

        /**
         * The ID of the extension publisher.
         *
         * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and
         * `PublisherId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publisherid)
         *
         * @param publisherId The ID of the extension publisher.
         */
        public fun publisherId(publisherId: String)

        /**
         * The extension type.
         *
         * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and
         * `PublisherId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-type)
         *
         * @param type The extension type.
         */
        public fun type(type: String)

        /**
         * The name of the extension.
         *
         * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and
         * `PublisherId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typename)
         *
         * @param typeName The name of the extension.
         */
        public fun typeName(typeName: String)

        /**
         * An alias to assign to the public extension, in this account and Region.
         *
         * If you specify an alias for the extension, CloudFormation treats the alias as the
         * extension type name within this account and Region. You must use the alias to refer to
         * the extension in your templates, API calls, and CloudFormation console.
         *
         * An extension alias must be unique within a given account and Region. You can activate the
         * same public resource multiple times in the same account and Region, using different type
         * name aliases.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typenamealias)
         *
         * @param typeNameAlias An alias to assign to the public extension, in this account and
         *   Region.
         */
        public fun typeNameAlias(typeNameAlias: String)

        /**
         * Manually updates a previously-activated type to a new major or minor version, if
         * available.
         *
         * You can also use this parameter to update the value of `AutoUpdate` .
         * * `MAJOR` : CloudFormation updates the extension to the newest major version, if one is
         *   available.
         * * `MINOR` : CloudFormation updates the extension to the newest minor version, if one is
         *   available.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-versionbump)
         *
         * @param versionBump Manually updates a previously-activated type to a new major or minor
         *   version, if available.
         */
        public fun versionBump(versionBump: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cloudformation.CfnTypeActivation.Builder =
            software.amazon.awscdk.services.cloudformation.CfnTypeActivation.Builder.create(
                scope,
                id
            )

        /**
         * Whether to automatically update the extension in this account and Region when a new
         * *minor* version is published by the extension publisher.
         *
         * Major versions released by the publisher must be manually updated.
         *
         * The default is `true` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
         *
         * @param autoUpdate Whether to automatically update the extension in this account and
         *   Region when a new *minor* version is published by the extension publisher.
         */
        override fun autoUpdate(autoUpdate: Boolean) {
            cdkBuilder.autoUpdate(autoUpdate)
        }

        /**
         * Whether to automatically update the extension in this account and Region when a new
         * *minor* version is published by the extension publisher.
         *
         * Major versions released by the publisher must be manually updated.
         *
         * The default is `true` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
         *
         * @param autoUpdate Whether to automatically update the extension in this account and
         *   Region when a new *minor* version is published by the extension publisher.
         */
        override fun autoUpdate(autoUpdate: IResolvable) {
            cdkBuilder.autoUpdate(autoUpdate.let(IResolvable::unwrap))
        }

        /**
         * The name of the IAM execution role to use to activate the extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-executionrolearn)
         *
         * @param executionRoleArn The name of the IAM execution role to use to activate the
         *   extension.
         */
        override fun executionRoleArn(executionRoleArn: String) {
            cdkBuilder.executionRoleArn(executionRoleArn)
        }

        /**
         * Specifies logging configuration information for an extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
         *
         * @param loggingConfig Specifies logging configuration information for an extension.
         */
        override fun loggingConfig(loggingConfig: IResolvable) {
            cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
        }

        /**
         * Specifies logging configuration information for an extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
         *
         * @param loggingConfig Specifies logging configuration information for an extension.
         */
        override fun loggingConfig(loggingConfig: LoggingConfigProperty) {
            cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfigProperty::unwrap))
        }

        /**
         * Specifies logging configuration information for an extension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
         *
         * @param loggingConfig Specifies logging configuration information for an extension.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("9a1b9bbc815436b201657fbc8dbec93ee9ba4e77953926bb53912bda239d93b4")
        override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit =
            loggingConfig(LoggingConfigProperty(loggingConfig))

        /**
         * The major version of this extension you want to activate, if multiple major versions are
         * available.
         *
         * The default is the latest major version. CloudFormation uses the latest available *minor*
         * version of the major version selected.
         *
         * You can specify `MajorVersion` or `VersionBump` , but not both.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-majorversion)
         *
         * @param majorVersion The major version of this extension you want to activate, if multiple
         *   major versions are available.
         */
        override fun majorVersion(majorVersion: String) {
            cdkBuilder.majorVersion(majorVersion)
        }

        /**
         * The Amazon Resource Number (ARN) of the public extension.
         *
         * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and
         * `PublisherId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publictypearn)
         *
         * @param publicTypeArn The Amazon Resource Number (ARN) of the public extension.
         */
        override fun publicTypeArn(publicTypeArn: String) {
            cdkBuilder.publicTypeArn(publicTypeArn)
        }

        /**
         * The ID of the extension publisher.
         *
         * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and
         * `PublisherId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publisherid)
         *
         * @param publisherId The ID of the extension publisher.
         */
        override fun publisherId(publisherId: String) {
            cdkBuilder.publisherId(publisherId)
        }

        /**
         * The extension type.
         *
         * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and
         * `PublisherId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-type)
         *
         * @param type The extension type.
         */
        override fun type(type: String) {
            cdkBuilder.type(type)
        }

        /**
         * The name of the extension.
         *
         * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and
         * `PublisherId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typename)
         *
         * @param typeName The name of the extension.
         */
        override fun typeName(typeName: String) {
            cdkBuilder.typeName(typeName)
        }

        /**
         * An alias to assign to the public extension, in this account and Region.
         *
         * If you specify an alias for the extension, CloudFormation treats the alias as the
         * extension type name within this account and Region. You must use the alias to refer to
         * the extension in your templates, API calls, and CloudFormation console.
         *
         * An extension alias must be unique within a given account and Region. You can activate the
         * same public resource multiple times in the same account and Region, using different type
         * name aliases.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typenamealias)
         *
         * @param typeNameAlias An alias to assign to the public extension, in this account and
         *   Region.
         */
        override fun typeNameAlias(typeNameAlias: String) {
            cdkBuilder.typeNameAlias(typeNameAlias)
        }

        /**
         * Manually updates a previously-activated type to a new major or minor version, if
         * available.
         *
         * You can also use this parameter to update the value of `AutoUpdate` .
         * * `MAJOR` : CloudFormation updates the extension to the newest major version, if one is
         *   available.
         * * `MINOR` : CloudFormation updates the extension to the newest minor version, if one is
         *   available.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-versionbump)
         *
         * @param versionBump Manually updates a previously-activated type to a new major or minor
         *   version, if available.
         */
        override fun versionBump(versionBump: String) {
            cdkBuilder.versionBump(versionBump)
        }

        public fun build(): software.amazon.awscdk.services.cloudformation.CfnTypeActivation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnTypeActivation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnTypeActivation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudformation.CfnTypeActivation
        ): CfnTypeActivation = CfnTypeActivation(cdkObject)

        internal fun unwrap(
            wrapped: CfnTypeActivation
        ): software.amazon.awscdk.services.cloudformation.CfnTypeActivation = wrapped.cdkObject
    }

    public interface LoggingConfigProperty {
        /**
         * The Amazon CloudWatch Logs group to which CloudFormation sends error logging information
         * when invoking the extension's handlers.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html#cfn-cloudformation-typeactivation-loggingconfig-loggroupname)
         */
        public fun logGroupName(): String? = unwrap(this).getLogGroupName()

        /**
         * The Amazon Resource Name (ARN) of the role that CloudFormation should assume when sending
         * log entries to CloudWatch Logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html#cfn-cloudformation-typeactivation-loggingconfig-logrolearn)
         */
        public fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

        /** A builder for [LoggingConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param logGroupName The Amazon CloudWatch Logs group to which CloudFormation sends
             *   error logging information when invoking the extension's handlers.
             */
            public fun logGroupName(logGroupName: String)

            /**
             * @param logRoleArn The Amazon Resource Name (ARN) of the role that CloudFormation
             *   should assume when sending log entries to CloudWatch Logs.
             */
            public fun logRoleArn(logRoleArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cloudformation.CfnTypeActivation.LoggingConfigProperty.Builder =
                software.amazon.awscdk.services.cloudformation.CfnTypeActivation
                    .LoggingConfigProperty
                    .builder()

            /**
             * @param logGroupName The Amazon CloudWatch Logs group to which CloudFormation sends
             *   error logging information when invoking the extension's handlers.
             */
            override fun logGroupName(logGroupName: String) {
                cdkBuilder.logGroupName(logGroupName)
            }

            /**
             * @param logRoleArn The Amazon Resource Name (ARN) of the role that CloudFormation
             *   should assume when sending log entries to CloudWatch Logs.
             */
            override fun logRoleArn(logRoleArn: String) {
                cdkBuilder.logRoleArn(logRoleArn)
            }

            public fun build():
                software.amazon.awscdk.services.cloudformation.CfnTypeActivation.LoggingConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cloudformation.CfnTypeActivation.LoggingConfigProperty,
        ) : LoggingConfigProperty {
            /**
             * The Amazon CloudWatch Logs group to which CloudFormation sends error logging
             * information when invoking the extension's handlers.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html#cfn-cloudformation-typeactivation-loggingconfig-loggroupname)
             */
            override fun logGroupName(): String? = unwrap(this).getLogGroupName()

            /**
             * The Amazon Resource Name (ARN) of the role that CloudFormation should assume when
             * sending log entries to CloudWatch Logs.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html#cfn-cloudformation-typeactivation-loggingconfig-logrolearn)
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
                cdkObject:
                    software.amazon.awscdk.services.cloudformation.CfnTypeActivation.LoggingConfigProperty
            ): LoggingConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: LoggingConfigProperty
            ): software.amazon.awscdk.services.cloudformation.CfnTypeActivation.LoggingConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
