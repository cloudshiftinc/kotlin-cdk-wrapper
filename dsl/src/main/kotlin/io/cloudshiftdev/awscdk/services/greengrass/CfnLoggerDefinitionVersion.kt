package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLoggerDefinitionVersion
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ID of the logger definition associated with this version. */
    public open fun loggerDefinitionId(): String = unwrap(this).getLoggerDefinitionId()

    /** The ID of the logger definition associated with this version. */
    public open fun loggerDefinitionId(`value`: String) {
        unwrap(this).setLoggerDefinitionId(`value`)
    }

    /** The loggers in this version. */
    public open fun loggers(): Any = unwrap(this).getLoggers()

    /** The loggers in this version. */
    public open fun loggers(`value`: IResolvable) {
        unwrap(this).setLoggers(`value`.let(IResolvable::unwrap))
    }

    /** The loggers in this version. */
    public open fun loggers(__idx_ac66f0: List<Any>) {
        unwrap(this).setLoggers(__idx_ac66f0)
    }

    /** The loggers in this version. */
    public open fun loggers(vararg __idx_ac66f0: Any): Unit = loggers(__idx_ac66f0.toList())

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.greengrass.CfnLoggerDefinitionVersion].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The ID of the logger definition associated with this version.
         *
         * This value is a GUID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid)
         *
         * @param loggerDefinitionId The ID of the logger definition associated with this version.
         */
        public fun loggerDefinitionId(loggerDefinitionId: String)

        /**
         * The loggers in this version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
         *
         * @param loggers The loggers in this version.
         */
        public fun loggers(loggers: IResolvable)

        /**
         * The loggers in this version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
         *
         * @param loggers The loggers in this version.
         */
        public fun loggers(loggers: List<Any>)

        /**
         * The loggers in this version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
         *
         * @param loggers The loggers in this version.
         */
        public fun loggers(vararg loggers: Any)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.Builder =
            software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.Builder.create(
                scope,
                id
            )

        /**
         * The ID of the logger definition associated with this version.
         *
         * This value is a GUID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid)
         *
         * @param loggerDefinitionId The ID of the logger definition associated with this version.
         */
        override fun loggerDefinitionId(loggerDefinitionId: String) {
            cdkBuilder.loggerDefinitionId(loggerDefinitionId)
        }

        /**
         * The loggers in this version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
         *
         * @param loggers The loggers in this version.
         */
        override fun loggers(loggers: IResolvable) {
            cdkBuilder.loggers(loggers.let(IResolvable::unwrap))
        }

        /**
         * The loggers in this version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
         *
         * @param loggers The loggers in this version.
         */
        override fun loggers(loggers: List<Any>) {
            cdkBuilder.loggers(loggers)
        }

        /**
         * The loggers in this version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
         *
         * @param loggers The loggers in this version.
         */
        override fun loggers(vararg loggers: Any): Unit = loggers(loggers.toList())

        public fun build(): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnLoggerDefinitionVersion {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnLoggerDefinitionVersion(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion
        ): CfnLoggerDefinitionVersion = CfnLoggerDefinitionVersion(cdkObject)

        internal fun unwrap(
            wrapped: CfnLoggerDefinitionVersion
        ): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion = wrapped.cdkObject
    }

    public interface LoggerProperty {
        /**
         * The source of the log event.
         *
         * Valid values are `GreengrassSystem` or `Lambda` . When `GreengrassSystem` is used, events
         * from Greengrass system components are logged. When `Lambda` is used, events from
         * user-defined Lambda functions are logged.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-component)
         */
        public fun component(): String

        /**
         * A descriptive or arbitrary ID for the logger.
         *
         * This value must be unique within the logger definition version. Maximum length is 128
         * characters with pattern `[a-zA-Z0-9:_-]+` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-id)
         */
        public fun id(): String

        /**
         * The log-level threshold.
         *
         * Log events below this threshold are filtered out and aren't stored. Valid values are
         * `DEBUG` , `INFO` (recommended), `WARN` , `ERROR` , or `FATAL` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-level)
         */
        public fun level(): String

        /**
         * The amount of file space (in KB) to use when writing logs to the local file system.
         *
         * This property does not apply for CloudWatch Logs .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-space)
         */
        public fun space(): Number? = unwrap(this).getSpace()

        /**
         * The storage mechanism for log events.
         *
         * Valid values are `FileSystem` or `AWSCloudWatch` . When `AWSCloudWatch` is used, log
         * events are sent to CloudWatch Logs . When `FileSystem` is used, log events are stored on
         * the local file system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-type)
         */
        public fun type(): String

        /** A builder for [LoggerProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param component The source of the log event. Valid values are `GreengrassSystem` or
             *   `Lambda` . When `GreengrassSystem` is used, events from Greengrass system
             *   components are logged. When `Lambda` is used, events from user-defined Lambda
             *   functions are logged.
             */
            public fun component(component: String)

            /**
             * @param id A descriptive or arbitrary ID for the logger. This value must be unique
             *   within the logger definition version. Maximum length is 128 characters with pattern
             *   `[a-zA-Z0-9:_-]+` .
             */
            public fun id(id: String)

            /**
             * @param level The log-level threshold. Log events below this threshold are filtered
             *   out and aren't stored. Valid values are `DEBUG` , `INFO` (recommended), `WARN` ,
             *   `ERROR` , or `FATAL` .
             */
            public fun level(level: String)

            /**
             * @param space The amount of file space (in KB) to use when writing logs to the local
             *   file system. This property does not apply for CloudWatch Logs .
             */
            public fun space(space: Number)

            /**
             * @param type The storage mechanism for log events. Valid values are `FileSystem` or
             *   `AWSCloudWatch` . When `AWSCloudWatch` is used, log events are sent to CloudWatch
             *   Logs . When `FileSystem` is used, log events are stored on the local file system.
             */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty.Builder =
                software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty
                    .builder()

            /**
             * @param component The source of the log event. Valid values are `GreengrassSystem` or
             *   `Lambda` . When `GreengrassSystem` is used, events from Greengrass system
             *   components are logged. When `Lambda` is used, events from user-defined Lambda
             *   functions are logged.
             */
            override fun component(component: String) {
                cdkBuilder.component(component)
            }

            /**
             * @param id A descriptive or arbitrary ID for the logger. This value must be unique
             *   within the logger definition version. Maximum length is 128 characters with pattern
             *   `[a-zA-Z0-9:_-]+` .
             */
            override fun id(id: String) {
                cdkBuilder.id(id)
            }

            /**
             * @param level The log-level threshold. Log events below this threshold are filtered
             *   out and aren't stored. Valid values are `DEBUG` , `INFO` (recommended), `WARN` ,
             *   `ERROR` , or `FATAL` .
             */
            override fun level(level: String) {
                cdkBuilder.level(level)
            }

            /**
             * @param space The amount of file space (in KB) to use when writing logs to the local
             *   file system. This property does not apply for CloudWatch Logs .
             */
            override fun space(space: Number) {
                cdkBuilder.space(space)
            }

            /**
             * @param type The storage mechanism for log events. Valid values are `FileSystem` or
             *   `AWSCloudWatch` . When `AWSCloudWatch` is used, log events are sent to CloudWatch
             *   Logs . When `FileSystem` is used, log events are stored on the local file system.
             */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty,
        ) : LoggerProperty {
            /**
             * The source of the log event.
             *
             * Valid values are `GreengrassSystem` or `Lambda` . When `GreengrassSystem` is used,
             * events from Greengrass system components are logged. When `Lambda` is used, events
             * from user-defined Lambda functions are logged.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-component)
             */
            override fun component(): String = unwrap(this).getComponent()

            /**
             * A descriptive or arbitrary ID for the logger.
             *
             * This value must be unique within the logger definition version. Maximum length is 128
             * characters with pattern `[a-zA-Z0-9:_-]+` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-id)
             */
            override fun id(): String = unwrap(this).getId()

            /**
             * The log-level threshold.
             *
             * Log events below this threshold are filtered out and aren't stored. Valid values are
             * `DEBUG` , `INFO` (recommended), `WARN` , `ERROR` , or `FATAL` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-level)
             */
            override fun level(): String = unwrap(this).getLevel()

            /**
             * The amount of file space (in KB) to use when writing logs to the local file system.
             *
             * This property does not apply for CloudWatch Logs .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-space)
             */
            override fun space(): Number? = unwrap(this).getSpace()

            /**
             * The storage mechanism for log events.
             *
             * Valid values are `FileSystem` or `AWSCloudWatch` . When `AWSCloudWatch` is used, log
             * events are sent to CloudWatch Logs . When `FileSystem` is used, log events are stored
             * on the local file system.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): LoggerProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty
            ): LoggerProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: LoggerProperty
            ): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
