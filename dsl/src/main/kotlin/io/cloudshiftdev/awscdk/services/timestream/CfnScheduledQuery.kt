package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScheduledQuery
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The `ARN` of the scheduled query. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** The scheduled query error reporting configuration. */
    public open fun attrSqErrorReportConfiguration(): String =
        unwrap(this).getAttrSqErrorReportConfiguration()

    /**
     * The KMS key used to encrypt the query resource, if a customer managed KMS key was provided.
     */
    public open fun attrSqKmsKeyId(): String = unwrap(this).getAttrSqKmsKeyId()

    /** The scheduled query name. */
    public open fun attrSqName(): String = unwrap(this).getAttrSqName()

    /** The scheduled query notification configuration. */
    public open fun attrSqNotificationConfiguration(): String =
        unwrap(this).getAttrSqNotificationConfiguration()

    /** The scheduled query string.. */
    public open fun attrSqQueryString(): String = unwrap(this).getAttrSqQueryString()

    /** The scheduled query schedule configuration. */
    public open fun attrSqScheduleConfiguration(): String =
        unwrap(this).getAttrSqScheduleConfiguration()

    /** The ARN of the IAM role that will be used by Timestream to run the query. */
    public open fun attrSqScheduledQueryExecutionRoleArn(): String =
        unwrap(this).getAttrSqScheduledQueryExecutionRoleArn()

    /** The configuration for query output. */
    public open fun attrSqTargetConfiguration(): String =
        unwrap(this).getAttrSqTargetConfiguration()

    /**
     * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making
     * the same request repeatedly will produce the same result.
     */
    public open fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words, making
     * the same request repeatedly will produce the same result.
     */
    public open fun clientToken(`value`: String) {
        unwrap(this).setClientToken(`value`)
    }

    /** Configuration for error reporting. */
    public open fun errorReportConfiguration(): Any = unwrap(this).getErrorReportConfiguration()

    /** Configuration for error reporting. */
    public open fun errorReportConfiguration(`value`: IResolvable) {
        unwrap(this).setErrorReportConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** Configuration for error reporting. */
    public open fun errorReportConfiguration(`value`: ErrorReportConfigurationProperty) {
        unwrap(this)
            .setErrorReportConfiguration(`value`.let(ErrorReportConfigurationProperty::unwrap))
    }

    /** Configuration for error reporting. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("010b3e38a64e759724e6812dc3dbea07a1cf3218555514124e83afd8babad7ef")
    public open fun errorReportConfiguration(
        `value`: ErrorReportConfigurationProperty.Builder.() -> Unit
    ): Unit = errorReportConfiguration(ErrorReportConfigurationProperty(`value`))

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The Amazon KMS key used to encrypt the scheduled query resource, at-rest. */
    public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /** The Amazon KMS key used to encrypt the scheduled query resource, at-rest. */
    public open fun kmsKeyId(`value`: String) {
        unwrap(this).setKmsKeyId(`value`)
    }

    /** Notification configuration for the scheduled query. */
    public open fun notificationConfiguration(): Any = unwrap(this).getNotificationConfiguration()

    /** Notification configuration for the scheduled query. */
    public open fun notificationConfiguration(`value`: IResolvable) {
        unwrap(this).setNotificationConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** Notification configuration for the scheduled query. */
    public open fun notificationConfiguration(`value`: NotificationConfigurationProperty) {
        unwrap(this)
            .setNotificationConfiguration(`value`.let(NotificationConfigurationProperty::unwrap))
    }

    /** Notification configuration for the scheduled query. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56f183054324ff5ee3fc2a8d48a787c74d4cbea6a1e4249fc6d1dfc49db5d4f4")
    public open fun notificationConfiguration(
        `value`: NotificationConfigurationProperty.Builder.() -> Unit
    ): Unit = notificationConfiguration(NotificationConfigurationProperty(`value`))

    /** The query string to run. */
    public open fun queryString(): String = unwrap(this).getQueryString()

    /** The query string to run. */
    public open fun queryString(`value`: String) {
        unwrap(this).setQueryString(`value`)
    }

    /** Schedule configuration. */
    public open fun scheduleConfiguration(): Any = unwrap(this).getScheduleConfiguration()

    /** Schedule configuration. */
    public open fun scheduleConfiguration(`value`: IResolvable) {
        unwrap(this).setScheduleConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** Schedule configuration. */
    public open fun scheduleConfiguration(`value`: ScheduleConfigurationProperty) {
        unwrap(this).setScheduleConfiguration(`value`.let(ScheduleConfigurationProperty::unwrap))
    }

    /** Schedule configuration. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68108985027733be256a4fcfd6a2e917eed623f4800ebafe5117b0e1bddd14b0")
    public open fun scheduleConfiguration(
        `value`: ScheduleConfigurationProperty.Builder.() -> Unit
    ): Unit = scheduleConfiguration(ScheduleConfigurationProperty(`value`))

    /** The ARN for the IAM role that Timestream will assume when running the scheduled query. */
    public open fun scheduledQueryExecutionRoleArn(): String =
        unwrap(this).getScheduledQueryExecutionRoleArn()

    /** The ARN for the IAM role that Timestream will assume when running the scheduled query. */
    public open fun scheduledQueryExecutionRoleArn(`value`: String) {
        unwrap(this).setScheduledQueryExecutionRoleArn(`value`)
    }

    /** A name for the query. */
    public open fun scheduledQueryName(): String? = unwrap(this).getScheduledQueryName()

    /** A name for the query. */
    public open fun scheduledQueryName(`value`: String) {
        unwrap(this).setScheduledQueryName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** A list of key-value pairs to label the scheduled query. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** A list of key-value pairs to label the scheduled query. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** A list of key-value pairs to label the scheduled query. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** Scheduled query target store configuration. */
    public open fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()

    /** Scheduled query target store configuration. */
    public open fun targetConfiguration(`value`: IResolvable) {
        unwrap(this).setTargetConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** Scheduled query target store configuration. */
    public open fun targetConfiguration(`value`: TargetConfigurationProperty) {
        unwrap(this).setTargetConfiguration(`value`.let(TargetConfigurationProperty::unwrap))
    }

    /** Scheduled query target store configuration. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6254f0e7d28d1aba781cd8f1484da7065814f90869ba1f68f0899d6c8a2730a3")
    public open fun targetConfiguration(
        `value`: TargetConfigurationProperty.Builder.() -> Unit
    ): Unit = targetConfiguration(TargetConfigurationProperty(`value`))

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.timestream.CfnScheduledQuery]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words,
         * making the same request repeatedly will produce the same result.
         *
         * Making multiple identical CreateScheduledQuery requests has the same effect as making a
         * single request.
         * * If CreateScheduledQuery is called without a `ClientToken` , the Query SDK generates a
         *   `ClientToken` on your behalf.
         * * After 8 hours, any request with the same `ClientToken` is treated as a new request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-clienttoken)
         *
         * @param clientToken Using a ClientToken makes the call to CreateScheduledQuery idempotent,
         *   in other words, making the same request repeatedly will produce the same result.
         */
        public fun clientToken(clientToken: String)

        /**
         * Configuration for error reporting.
         *
         * Error reports will be generated when a problem is encountered when writing the query
         * results.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-errorreportconfiguration)
         *
         * @param errorReportConfiguration Configuration for error reporting.
         */
        public fun errorReportConfiguration(errorReportConfiguration: IResolvable)

        /**
         * Configuration for error reporting.
         *
         * Error reports will be generated when a problem is encountered when writing the query
         * results.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-errorreportconfiguration)
         *
         * @param errorReportConfiguration Configuration for error reporting.
         */
        public fun errorReportConfiguration(
            errorReportConfiguration: ErrorReportConfigurationProperty
        )

        /**
         * Configuration for error reporting.
         *
         * Error reports will be generated when a problem is encountered when writing the query
         * results.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-errorreportconfiguration)
         *
         * @param errorReportConfiguration Configuration for error reporting.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7bfe794776193612b5485c99f5ba93321fe0df4156921ed0dc1b035331c40d3e")
        public fun errorReportConfiguration(
            errorReportConfiguration: ErrorReportConfigurationProperty.Builder.() -> Unit
        )

        /**
         * The Amazon KMS key used to encrypt the scheduled query resource, at-rest.
         *
         * If the Amazon KMS key is not specified, the scheduled query resource will be encrypted
         * with a Timestream owned Amazon KMS key. To specify a KMS key, use the key ID, key ARN,
         * alias name, or alias ARN. When using an alias name, prefix the name with *alias/ *
         *
         * If ErrorReportConfiguration uses `SSE_KMS` as encryption type, the same KmsKeyId is used
         * to encrypt the error report at rest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-kmskeyid)
         *
         * @param kmsKeyId The Amazon KMS key used to encrypt the scheduled query resource, at-rest.
         */
        public fun kmsKeyId(kmsKeyId: String)

        /**
         * Notification configuration for the scheduled query.
         *
         * A notification is sent by Timestream when a query run finishes, when the state is updated
         * or when you delete it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-notificationconfiguration)
         *
         * @param notificationConfiguration Notification configuration for the scheduled query.
         */
        public fun notificationConfiguration(notificationConfiguration: IResolvable)

        /**
         * Notification configuration for the scheduled query.
         *
         * A notification is sent by Timestream when a query run finishes, when the state is updated
         * or when you delete it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-notificationconfiguration)
         *
         * @param notificationConfiguration Notification configuration for the scheduled query.
         */
        public fun notificationConfiguration(
            notificationConfiguration: NotificationConfigurationProperty
        )

        /**
         * Notification configuration for the scheduled query.
         *
         * A notification is sent by Timestream when a query run finishes, when the state is updated
         * or when you delete it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-notificationconfiguration)
         *
         * @param notificationConfiguration Notification configuration for the scheduled query.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("0581f4d091c9b040397b06ada7726e666675f642d252b1bda9a21d664c96bd78")
        public fun notificationConfiguration(
            notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit
        )

        /**
         * The query string to run.
         *
         * Parameter names can be specified in the query string `&#64;` character followed by an
         * identifier. The named Parameter `&#64;scheduled_runtime` is reserved and can be used in
         * the query to get the time at which the query is scheduled to run.
         *
         * The timestamp calculated according to the ScheduleConfiguration parameter, will be the
         * value of `&#64;scheduled_runtime` paramater for each query run. For example, consider an
         * instance of a scheduled query executing on 2021-12-01 00:00:00. For this instance, the
         * `&#64;scheduled_runtime` parameter is initialized to the timestamp 2021-12-01 00:00:00
         * when invoking the query.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-querystring)
         *
         * @param queryString The query string to run.
         */
        public fun queryString(queryString: String)

        /**
         * Schedule configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduleconfiguration)
         *
         * @param scheduleConfiguration Schedule configuration.
         */
        public fun scheduleConfiguration(scheduleConfiguration: IResolvable)

        /**
         * Schedule configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduleconfiguration)
         *
         * @param scheduleConfiguration Schedule configuration.
         */
        public fun scheduleConfiguration(scheduleConfiguration: ScheduleConfigurationProperty)

        /**
         * Schedule configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduleconfiguration)
         *
         * @param scheduleConfiguration Schedule configuration.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ac3e7fbea51588daf5501c3f5e4234a2843fee71ff735a1d567c3dabce05d27a")
        public fun scheduleConfiguration(
            scheduleConfiguration: ScheduleConfigurationProperty.Builder.() -> Unit
        )

        /**
         * The ARN for the IAM role that Timestream will assume when running the scheduled query.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduledqueryexecutionrolearn)
         *
         * @param scheduledQueryExecutionRoleArn The ARN for the IAM role that Timestream will
         *   assume when running the scheduled query.
         */
        public fun scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn: String)

        /**
         * A name for the query.
         *
         * Scheduled query names must be unique within each Region.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduledqueryname)
         *
         * @param scheduledQueryName A name for the query.
         */
        public fun scheduledQueryName(scheduledQueryName: String)

        /**
         * A list of key-value pairs to label the scheduled query.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-tags)
         *
         * @param tags A list of key-value pairs to label the scheduled query.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * A list of key-value pairs to label the scheduled query.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-tags)
         *
         * @param tags A list of key-value pairs to label the scheduled query.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * Scheduled query target store configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-targetconfiguration)
         *
         * @param targetConfiguration Scheduled query target store configuration.
         */
        public fun targetConfiguration(targetConfiguration: IResolvable)

        /**
         * Scheduled query target store configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-targetconfiguration)
         *
         * @param targetConfiguration Scheduled query target store configuration.
         */
        public fun targetConfiguration(targetConfiguration: TargetConfigurationProperty)

        /**
         * Scheduled query target store configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-targetconfiguration)
         *
         * @param targetConfiguration Scheduled query target store configuration.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("15214f67673f1b761dd057fb89e573b913589d1b0b19b4a46e90b5ff8afd6b90")
        public fun targetConfiguration(
            targetConfiguration: TargetConfigurationProperty.Builder.() -> Unit
        )
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.timestream.CfnScheduledQuery.Builder =
            software.amazon.awscdk.services.timestream.CfnScheduledQuery.Builder.create(scope, id)

        /**
         * Using a ClientToken makes the call to CreateScheduledQuery idempotent, in other words,
         * making the same request repeatedly will produce the same result.
         *
         * Making multiple identical CreateScheduledQuery requests has the same effect as making a
         * single request.
         * * If CreateScheduledQuery is called without a `ClientToken` , the Query SDK generates a
         *   `ClientToken` on your behalf.
         * * After 8 hours, any request with the same `ClientToken` is treated as a new request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-clienttoken)
         *
         * @param clientToken Using a ClientToken makes the call to CreateScheduledQuery idempotent,
         *   in other words, making the same request repeatedly will produce the same result.
         */
        override fun clientToken(clientToken: String) {
            cdkBuilder.clientToken(clientToken)
        }

        /**
         * Configuration for error reporting.
         *
         * Error reports will be generated when a problem is encountered when writing the query
         * results.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-errorreportconfiguration)
         *
         * @param errorReportConfiguration Configuration for error reporting.
         */
        override fun errorReportConfiguration(errorReportConfiguration: IResolvable) {
            cdkBuilder.errorReportConfiguration(errorReportConfiguration.let(IResolvable::unwrap))
        }

        /**
         * Configuration for error reporting.
         *
         * Error reports will be generated when a problem is encountered when writing the query
         * results.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-errorreportconfiguration)
         *
         * @param errorReportConfiguration Configuration for error reporting.
         */
        override fun errorReportConfiguration(
            errorReportConfiguration: ErrorReportConfigurationProperty
        ) {
            cdkBuilder.errorReportConfiguration(
                errorReportConfiguration.let(ErrorReportConfigurationProperty::unwrap)
            )
        }

        /**
         * Configuration for error reporting.
         *
         * Error reports will be generated when a problem is encountered when writing the query
         * results.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-errorreportconfiguration)
         *
         * @param errorReportConfiguration Configuration for error reporting.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7bfe794776193612b5485c99f5ba93321fe0df4156921ed0dc1b035331c40d3e")
        override fun errorReportConfiguration(
            errorReportConfiguration: ErrorReportConfigurationProperty.Builder.() -> Unit
        ): Unit =
            errorReportConfiguration(ErrorReportConfigurationProperty(errorReportConfiguration))

        /**
         * The Amazon KMS key used to encrypt the scheduled query resource, at-rest.
         *
         * If the Amazon KMS key is not specified, the scheduled query resource will be encrypted
         * with a Timestream owned Amazon KMS key. To specify a KMS key, use the key ID, key ARN,
         * alias name, or alias ARN. When using an alias name, prefix the name with *alias/ *
         *
         * If ErrorReportConfiguration uses `SSE_KMS` as encryption type, the same KmsKeyId is used
         * to encrypt the error report at rest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-kmskeyid)
         *
         * @param kmsKeyId The Amazon KMS key used to encrypt the scheduled query resource, at-rest.
         */
        override fun kmsKeyId(kmsKeyId: String) {
            cdkBuilder.kmsKeyId(kmsKeyId)
        }

        /**
         * Notification configuration for the scheduled query.
         *
         * A notification is sent by Timestream when a query run finishes, when the state is updated
         * or when you delete it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-notificationconfiguration)
         *
         * @param notificationConfiguration Notification configuration for the scheduled query.
         */
        override fun notificationConfiguration(notificationConfiguration: IResolvable) {
            cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
        }

        /**
         * Notification configuration for the scheduled query.
         *
         * A notification is sent by Timestream when a query run finishes, when the state is updated
         * or when you delete it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-notificationconfiguration)
         *
         * @param notificationConfiguration Notification configuration for the scheduled query.
         */
        override fun notificationConfiguration(
            notificationConfiguration: NotificationConfigurationProperty
        ) {
            cdkBuilder.notificationConfiguration(
                notificationConfiguration.let(NotificationConfigurationProperty::unwrap)
            )
        }

        /**
         * Notification configuration for the scheduled query.
         *
         * A notification is sent by Timestream when a query run finishes, when the state is updated
         * or when you delete it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-notificationconfiguration)
         *
         * @param notificationConfiguration Notification configuration for the scheduled query.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("0581f4d091c9b040397b06ada7726e666675f642d252b1bda9a21d664c96bd78")
        override fun notificationConfiguration(
            notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit
        ): Unit =
            notificationConfiguration(NotificationConfigurationProperty(notificationConfiguration))

        /**
         * The query string to run.
         *
         * Parameter names can be specified in the query string `&#64;` character followed by an
         * identifier. The named Parameter `&#64;scheduled_runtime` is reserved and can be used in
         * the query to get the time at which the query is scheduled to run.
         *
         * The timestamp calculated according to the ScheduleConfiguration parameter, will be the
         * value of `&#64;scheduled_runtime` paramater for each query run. For example, consider an
         * instance of a scheduled query executing on 2021-12-01 00:00:00. For this instance, the
         * `&#64;scheduled_runtime` parameter is initialized to the timestamp 2021-12-01 00:00:00
         * when invoking the query.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-querystring)
         *
         * @param queryString The query string to run.
         */
        override fun queryString(queryString: String) {
            cdkBuilder.queryString(queryString)
        }

        /**
         * Schedule configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduleconfiguration)
         *
         * @param scheduleConfiguration Schedule configuration.
         */
        override fun scheduleConfiguration(scheduleConfiguration: IResolvable) {
            cdkBuilder.scheduleConfiguration(scheduleConfiguration.let(IResolvable::unwrap))
        }

        /**
         * Schedule configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduleconfiguration)
         *
         * @param scheduleConfiguration Schedule configuration.
         */
        override fun scheduleConfiguration(scheduleConfiguration: ScheduleConfigurationProperty) {
            cdkBuilder.scheduleConfiguration(
                scheduleConfiguration.let(ScheduleConfigurationProperty::unwrap)
            )
        }

        /**
         * Schedule configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduleconfiguration)
         *
         * @param scheduleConfiguration Schedule configuration.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ac3e7fbea51588daf5501c3f5e4234a2843fee71ff735a1d567c3dabce05d27a")
        override fun scheduleConfiguration(
            scheduleConfiguration: ScheduleConfigurationProperty.Builder.() -> Unit
        ): Unit = scheduleConfiguration(ScheduleConfigurationProperty(scheduleConfiguration))

        /**
         * The ARN for the IAM role that Timestream will assume when running the scheduled query.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduledqueryexecutionrolearn)
         *
         * @param scheduledQueryExecutionRoleArn The ARN for the IAM role that Timestream will
         *   assume when running the scheduled query.
         */
        override fun scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn: String) {
            cdkBuilder.scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn)
        }

        /**
         * A name for the query.
         *
         * Scheduled query names must be unique within each Region.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-scheduledqueryname)
         *
         * @param scheduledQueryName A name for the query.
         */
        override fun scheduledQueryName(scheduledQueryName: String) {
            cdkBuilder.scheduledQueryName(scheduledQueryName)
        }

        /**
         * A list of key-value pairs to label the scheduled query.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-tags)
         *
         * @param tags A list of key-value pairs to label the scheduled query.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * A list of key-value pairs to label the scheduled query.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-tags)
         *
         * @param tags A list of key-value pairs to label the scheduled query.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * Scheduled query target store configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-targetconfiguration)
         *
         * @param targetConfiguration Scheduled query target store configuration.
         */
        override fun targetConfiguration(targetConfiguration: IResolvable) {
            cdkBuilder.targetConfiguration(targetConfiguration.let(IResolvable::unwrap))
        }

        /**
         * Scheduled query target store configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-targetconfiguration)
         *
         * @param targetConfiguration Scheduled query target store configuration.
         */
        override fun targetConfiguration(targetConfiguration: TargetConfigurationProperty) {
            cdkBuilder.targetConfiguration(
                targetConfiguration.let(TargetConfigurationProperty::unwrap)
            )
        }

        /**
         * Scheduled query target store configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-scheduledquery.html#cfn-timestream-scheduledquery-targetconfiguration)
         *
         * @param targetConfiguration Scheduled query target store configuration.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("15214f67673f1b761dd057fb89e573b913589d1b0b19b4a46e90b5ff8afd6b90")
        override fun targetConfiguration(
            targetConfiguration: TargetConfigurationProperty.Builder.() -> Unit
        ): Unit = targetConfiguration(TargetConfigurationProperty(targetConfiguration))

        public fun build(): software.amazon.awscdk.services.timestream.CfnScheduledQuery =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnScheduledQuery {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnScheduledQuery(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery
        ): CfnScheduledQuery = CfnScheduledQuery(cdkObject)

        internal fun unwrap(
            wrapped: CfnScheduledQuery
        ): software.amazon.awscdk.services.timestream.CfnScheduledQuery = wrapped.cdkObject
    }

    public interface DimensionMappingProperty {
        /**
         * Type for the dimension: VARCHAR.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-dimensionmapping.html#cfn-timestream-scheduledquery-dimensionmapping-dimensionvaluetype)
         */
        public fun dimensionValueType(): String

        /**
         * Column name from query result.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-dimensionmapping.html#cfn-timestream-scheduledquery-dimensionmapping-name)
         */
        public fun name(): String

        /** A builder for [DimensionMappingProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param dimensionValueType Type for the dimension: VARCHAR. */
            public fun dimensionValueType(dimensionValueType: String)

            /** @param name Column name from query result. */
            public fun name(name: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery
                    .DimensionMappingProperty
                    .builder()

            /** @param dimensionValueType Type for the dimension: VARCHAR. */
            override fun dimensionValueType(dimensionValueType: String) {
                cdkBuilder.dimensionValueType(dimensionValueType)
            }

            /** @param name Column name from query result. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty,
        ) : DimensionMappingProperty {
            /**
             * Type for the dimension: VARCHAR.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-dimensionmapping.html#cfn-timestream-scheduledquery-dimensionmapping-dimensionvaluetype)
             */
            override fun dimensionValueType(): String = unwrap(this).getDimensionValueType()

            /**
             * Column name from query result.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-dimensionmapping.html#cfn-timestream-scheduledquery-dimensionmapping-name)
             */
            override fun name(): String = unwrap(this).getName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): DimensionMappingProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty
            ): DimensionMappingProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DimensionMappingProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface TargetConfigurationProperty {
        /**
         * Configuration needed to write data into the Timestream database and table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-targetconfiguration.html#cfn-timestream-scheduledquery-targetconfiguration-timestreamconfiguration)
         */
        public fun timestreamConfiguration(): Any

        /** A builder for [TargetConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param timestreamConfiguration Configuration needed to write data into the Timestream
             *   database and table.
             */
            public fun timestreamConfiguration(timestreamConfiguration: IResolvable)

            /**
             * @param timestreamConfiguration Configuration needed to write data into the Timestream
             *   database and table.
             */
            public fun timestreamConfiguration(
                timestreamConfiguration: TimestreamConfigurationProperty
            )

            /**
             * @param timestreamConfiguration Configuration needed to write data into the Timestream
             *   database and table.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a1ac9ecda4c2a7bc502ab841a078ca5ebdc294da4d1316e3d67027be3199eaef")
            public fun timestreamConfiguration(
                timestreamConfiguration: TimestreamConfigurationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery
                    .TargetConfigurationProperty
                    .builder()

            /**
             * @param timestreamConfiguration Configuration needed to write data into the Timestream
             *   database and table.
             */
            override fun timestreamConfiguration(timestreamConfiguration: IResolvable) {
                cdkBuilder.timestreamConfiguration(timestreamConfiguration.let(IResolvable::unwrap))
            }

            /**
             * @param timestreamConfiguration Configuration needed to write data into the Timestream
             *   database and table.
             */
            override fun timestreamConfiguration(
                timestreamConfiguration: TimestreamConfigurationProperty
            ) {
                cdkBuilder.timestreamConfiguration(
                    timestreamConfiguration.let(TimestreamConfigurationProperty::unwrap)
                )
            }

            /**
             * @param timestreamConfiguration Configuration needed to write data into the Timestream
             *   database and table.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a1ac9ecda4c2a7bc502ab841a078ca5ebdc294da4d1316e3d67027be3199eaef")
            override fun timestreamConfiguration(
                timestreamConfiguration: TimestreamConfigurationProperty.Builder.() -> Unit
            ): Unit =
                timestreamConfiguration(TimestreamConfigurationProperty(timestreamConfiguration))

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty,
        ) : TargetConfigurationProperty {
            /**
             * Configuration needed to write data into the Timestream database and table.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-targetconfiguration.html#cfn-timestream-scheduledquery-targetconfiguration-timestreamconfiguration)
             */
            override fun timestreamConfiguration(): Any = unwrap(this).getTimestreamConfiguration()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): TargetConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty
            ): TargetConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TargetConfigurationProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface TimestreamConfigurationProperty {
        /**
         * Name of Timestream database to which the query result will be written.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-databasename)
         */
        public fun databaseName(): String

        /**
         * This is to allow mapping column(s) from the query result to the dimension in the
         * destination table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-dimensionmappings)
         */
        public fun dimensionMappings(): Any

        /**
         * Name of the measure column.
         *
         * Also see `MultiMeasureMappings` and `MixedMeasureMappings` for how measure name
         * properties on those relate to `MeasureNameColumn` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-measurenamecolumn)
         */
        public fun measureNameColumn(): String? = unwrap(this).getMeasureNameColumn()

        /**
         * Specifies how to map measures to multi-measure records.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-mixedmeasuremappings)
         */
        public fun mixedMeasureMappings(): Any? = unwrap(this).getMixedMeasureMappings()

        /**
         * Multi-measure mappings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-multimeasuremappings)
         */
        public fun multiMeasureMappings(): Any? = unwrap(this).getMultiMeasureMappings()

        /**
         * Name of Timestream table that the query result will be written to.
         *
         * The table should be within the same database that is provided in Timestream
         * configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-tablename)
         */
        public fun tableName(): String

        /**
         * Column from query result that should be used as the time column in destination table.
         *
         * Column type for this should be TIMESTAMP.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-timecolumn)
         */
        public fun timeColumn(): String

        /** A builder for [TimestreamConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param databaseName Name of Timestream database to which the query result will be
             *   written.
             */
            public fun databaseName(databaseName: String)

            /**
             * @param dimensionMappings This is to allow mapping column(s) from the query result to
             *   the dimension in the destination table.
             */
            public fun dimensionMappings(dimensionMappings: IResolvable)

            /**
             * @param dimensionMappings This is to allow mapping column(s) from the query result to
             *   the dimension in the destination table.
             */
            public fun dimensionMappings(dimensionMappings: List<Any>)

            /**
             * @param dimensionMappings This is to allow mapping column(s) from the query result to
             *   the dimension in the destination table.
             */
            public fun dimensionMappings(vararg dimensionMappings: Any)

            /**
             * @param measureNameColumn Name of the measure column. Also see `MultiMeasureMappings`
             *   and `MixedMeasureMappings` for how measure name properties on those relate to
             *   `MeasureNameColumn` .
             */
            public fun measureNameColumn(measureNameColumn: String)

            /**
             * @param mixedMeasureMappings Specifies how to map measures to multi-measure records.
             */
            public fun mixedMeasureMappings(mixedMeasureMappings: IResolvable)

            /**
             * @param mixedMeasureMappings Specifies how to map measures to multi-measure records.
             */
            public fun mixedMeasureMappings(mixedMeasureMappings: List<Any>)

            /**
             * @param mixedMeasureMappings Specifies how to map measures to multi-measure records.
             */
            public fun mixedMeasureMappings(vararg mixedMeasureMappings: Any)

            /** @param multiMeasureMappings Multi-measure mappings. */
            public fun multiMeasureMappings(multiMeasureMappings: IResolvable)

            /** @param multiMeasureMappings Multi-measure mappings. */
            public fun multiMeasureMappings(multiMeasureMappings: MultiMeasureMappingsProperty)

            /** @param multiMeasureMappings Multi-measure mappings. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("87aeb44d2a317d991b450e74460067fbe99618c5d2ef7dfba8a64d43392b5601")
            public fun multiMeasureMappings(
                multiMeasureMappings: MultiMeasureMappingsProperty.Builder.() -> Unit
            )

            /**
             * @param tableName Name of Timestream table that the query result will be written to.
             *   The table should be within the same database that is provided in Timestream
             *   configuration.
             */
            public fun tableName(tableName: String)

            /**
             * @param timeColumn Column from query result that should be used as the time column in
             *   destination table. Column type for this should be TIMESTAMP.
             */
            public fun timeColumn(timeColumn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery
                    .TimestreamConfigurationProperty
                    .builder()

            /**
             * @param databaseName Name of Timestream database to which the query result will be
             *   written.
             */
            override fun databaseName(databaseName: String) {
                cdkBuilder.databaseName(databaseName)
            }

            /**
             * @param dimensionMappings This is to allow mapping column(s) from the query result to
             *   the dimension in the destination table.
             */
            override fun dimensionMappings(dimensionMappings: IResolvable) {
                cdkBuilder.dimensionMappings(dimensionMappings.let(IResolvable::unwrap))
            }

            /**
             * @param dimensionMappings This is to allow mapping column(s) from the query result to
             *   the dimension in the destination table.
             */
            override fun dimensionMappings(dimensionMappings: List<Any>) {
                cdkBuilder.dimensionMappings(dimensionMappings)
            }

            /**
             * @param dimensionMappings This is to allow mapping column(s) from the query result to
             *   the dimension in the destination table.
             */
            override fun dimensionMappings(vararg dimensionMappings: Any): Unit =
                dimensionMappings(dimensionMappings.toList())

            /**
             * @param measureNameColumn Name of the measure column. Also see `MultiMeasureMappings`
             *   and `MixedMeasureMappings` for how measure name properties on those relate to
             *   `MeasureNameColumn` .
             */
            override fun measureNameColumn(measureNameColumn: String) {
                cdkBuilder.measureNameColumn(measureNameColumn)
            }

            /**
             * @param mixedMeasureMappings Specifies how to map measures to multi-measure records.
             */
            override fun mixedMeasureMappings(mixedMeasureMappings: IResolvable) {
                cdkBuilder.mixedMeasureMappings(mixedMeasureMappings.let(IResolvable::unwrap))
            }

            /**
             * @param mixedMeasureMappings Specifies how to map measures to multi-measure records.
             */
            override fun mixedMeasureMappings(mixedMeasureMappings: List<Any>) {
                cdkBuilder.mixedMeasureMappings(mixedMeasureMappings)
            }

            /**
             * @param mixedMeasureMappings Specifies how to map measures to multi-measure records.
             */
            override fun mixedMeasureMappings(vararg mixedMeasureMappings: Any): Unit =
                mixedMeasureMappings(mixedMeasureMappings.toList())

            /** @param multiMeasureMappings Multi-measure mappings. */
            override fun multiMeasureMappings(multiMeasureMappings: IResolvable) {
                cdkBuilder.multiMeasureMappings(multiMeasureMappings.let(IResolvable::unwrap))
            }

            /** @param multiMeasureMappings Multi-measure mappings. */
            override fun multiMeasureMappings(multiMeasureMappings: MultiMeasureMappingsProperty) {
                cdkBuilder.multiMeasureMappings(
                    multiMeasureMappings.let(MultiMeasureMappingsProperty::unwrap)
                )
            }

            /** @param multiMeasureMappings Multi-measure mappings. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("87aeb44d2a317d991b450e74460067fbe99618c5d2ef7dfba8a64d43392b5601")
            override fun multiMeasureMappings(
                multiMeasureMappings: MultiMeasureMappingsProperty.Builder.() -> Unit
            ): Unit = multiMeasureMappings(MultiMeasureMappingsProperty(multiMeasureMappings))

            /**
             * @param tableName Name of Timestream table that the query result will be written to.
             *   The table should be within the same database that is provided in Timestream
             *   configuration.
             */
            override fun tableName(tableName: String) {
                cdkBuilder.tableName(tableName)
            }

            /**
             * @param timeColumn Column from query result that should be used as the time column in
             *   destination table. Column type for this should be TIMESTAMP.
             */
            override fun timeColumn(timeColumn: String) {
                cdkBuilder.timeColumn(timeColumn)
            }

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty,
        ) : TimestreamConfigurationProperty {
            /**
             * Name of Timestream database to which the query result will be written.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-databasename)
             */
            override fun databaseName(): String = unwrap(this).getDatabaseName()

            /**
             * This is to allow mapping column(s) from the query result to the dimension in the
             * destination table.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-dimensionmappings)
             */
            override fun dimensionMappings(): Any = unwrap(this).getDimensionMappings()

            /**
             * Name of the measure column.
             *
             * Also see `MultiMeasureMappings` and `MixedMeasureMappings` for how measure name
             * properties on those relate to `MeasureNameColumn` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-measurenamecolumn)
             */
            override fun measureNameColumn(): String? = unwrap(this).getMeasureNameColumn()

            /**
             * Specifies how to map measures to multi-measure records.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-mixedmeasuremappings)
             */
            override fun mixedMeasureMappings(): Any? = unwrap(this).getMixedMeasureMappings()

            /**
             * Multi-measure mappings.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-multimeasuremappings)
             */
            override fun multiMeasureMappings(): Any? = unwrap(this).getMultiMeasureMappings()

            /**
             * Name of Timestream table that the query result will be written to.
             *
             * The table should be within the same database that is provided in Timestream
             * configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-tablename)
             */
            override fun tableName(): String = unwrap(this).getTableName()

            /**
             * Column from query result that should be used as the time column in destination table.
             *
             * Column type for this should be TIMESTAMP.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-timestreamconfiguration.html#cfn-timestream-scheduledquery-timestreamconfiguration-timecolumn)
             */
            override fun timeColumn(): String = unwrap(this).getTimeColumn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): TimestreamConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty
            ): TimestreamConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TimestreamConfigurationProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SnsConfigurationProperty {
        /**
         * SNS topic ARN that the scheduled query status notifications will be sent to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-snsconfiguration.html#cfn-timestream-scheduledquery-snsconfiguration-topicarn)
         */
        public fun topicArn(): String

        /** A builder for [SnsConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param topicArn SNS topic ARN that the scheduled query status notifications will be
             *   sent to.
             */
            public fun topicArn(topicArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery
                    .SnsConfigurationProperty
                    .builder()

            /**
             * @param topicArn SNS topic ARN that the scheduled query status notifications will be
             *   sent to.
             */
            override fun topicArn(topicArn: String) {
                cdkBuilder.topicArn(topicArn)
            }

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty,
        ) : SnsConfigurationProperty {
            /**
             * SNS topic ARN that the scheduled query status notifications will be sent to.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-snsconfiguration.html#cfn-timestream-scheduledquery-snsconfiguration-topicarn)
             */
            override fun topicArn(): String = unwrap(this).getTopicArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SnsConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty
            ): SnsConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SnsConfigurationProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MultiMeasureAttributeMappingProperty {
        /**
         * Type of the attribute to be read from the source column.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasureattributemapping.html#cfn-timestream-scheduledquery-multimeasureattributemapping-measurevaluetype)
         */
        public fun measureValueType(): String

        /**
         * Source column from where the attribute value is to be read.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasureattributemapping.html#cfn-timestream-scheduledquery-multimeasureattributemapping-sourcecolumn)
         */
        public fun sourceColumn(): String

        /**
         * Custom name to be used for attribute name in derived table.
         *
         * If not provided, source column name would be used.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasureattributemapping.html#cfn-timestream-scheduledquery-multimeasureattributemapping-targetmultimeasureattributename)
         */
        public fun targetMultiMeasureAttributeName(): String? =
            unwrap(this).getTargetMultiMeasureAttributeName()

        /** A builder for [MultiMeasureAttributeMappingProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param measureValueType Type of the attribute to be read from the source column. */
            public fun measureValueType(measureValueType: String)

            /** @param sourceColumn Source column from where the attribute value is to be read. */
            public fun sourceColumn(sourceColumn: String)

            /**
             * @param targetMultiMeasureAttributeName Custom name to be used for attribute name in
             *   derived table. If not provided, source column name would be used.
             */
            public fun targetMultiMeasureAttributeName(targetMultiMeasureAttributeName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery
                    .MultiMeasureAttributeMappingProperty
                    .builder()

            /** @param measureValueType Type of the attribute to be read from the source column. */
            override fun measureValueType(measureValueType: String) {
                cdkBuilder.measureValueType(measureValueType)
            }

            /** @param sourceColumn Source column from where the attribute value is to be read. */
            override fun sourceColumn(sourceColumn: String) {
                cdkBuilder.sourceColumn(sourceColumn)
            }

            /**
             * @param targetMultiMeasureAttributeName Custom name to be used for attribute name in
             *   derived table. If not provided, source column name would be used.
             */
            override fun targetMultiMeasureAttributeName(targetMultiMeasureAttributeName: String) {
                cdkBuilder.targetMultiMeasureAttributeName(targetMultiMeasureAttributeName)
            }

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty,
        ) : MultiMeasureAttributeMappingProperty {
            /**
             * Type of the attribute to be read from the source column.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasureattributemapping.html#cfn-timestream-scheduledquery-multimeasureattributemapping-measurevaluetype)
             */
            override fun measureValueType(): String = unwrap(this).getMeasureValueType()

            /**
             * Source column from where the attribute value is to be read.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasureattributemapping.html#cfn-timestream-scheduledquery-multimeasureattributemapping-sourcecolumn)
             */
            override fun sourceColumn(): String = unwrap(this).getSourceColumn()

            /**
             * Custom name to be used for attribute name in derived table.
             *
             * If not provided, source column name would be used.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasureattributemapping.html#cfn-timestream-scheduledquery-multimeasureattributemapping-targetmultimeasureattributename)
             */
            override fun targetMultiMeasureAttributeName(): String? =
                unwrap(this).getTargetMultiMeasureAttributeName()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MultiMeasureAttributeMappingProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty
            ): MultiMeasureAttributeMappingProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MultiMeasureAttributeMappingProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ScheduleConfigurationProperty {
        /**
         * An expression that denotes when to trigger the scheduled query run.
         *
         * This can be a cron expression or a rate expression.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-scheduleconfiguration.html#cfn-timestream-scheduledquery-scheduleconfiguration-scheduleexpression)
         */
        public fun scheduleExpression(): String

        /** A builder for [ScheduleConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param scheduleExpression An expression that denotes when to trigger the scheduled
             *   query run. This can be a cron expression or a rate expression.
             */
            public fun scheduleExpression(scheduleExpression: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery
                    .ScheduleConfigurationProperty
                    .builder()

            /**
             * @param scheduleExpression An expression that denotes when to trigger the scheduled
             *   query run. This can be a cron expression or a rate expression.
             */
            override fun scheduleExpression(scheduleExpression: String) {
                cdkBuilder.scheduleExpression(scheduleExpression)
            }

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty,
        ) : ScheduleConfigurationProperty {
            /**
             * An expression that denotes when to trigger the scheduled query run.
             *
             * This can be a cron expression or a rate expression.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-scheduleconfiguration.html#cfn-timestream-scheduledquery-scheduleconfiguration-scheduleexpression)
             */
            override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ScheduleConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty
            ): ScheduleConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ScheduleConfigurationProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface S3ConfigurationProperty {
        /**
         * Name of the S3 bucket under which error reports will be created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-s3configuration.html#cfn-timestream-scheduledquery-s3configuration-bucketname)
         */
        public fun bucketName(): String

        /**
         * Encryption at rest options for the error reports.
         *
         * If no encryption option is specified, Timestream will choose SSE_S3 as default.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-s3configuration.html#cfn-timestream-scheduledquery-s3configuration-encryptionoption)
         */
        public fun encryptionOption(): String? = unwrap(this).getEncryptionOption()

        /**
         * Prefix for the error report key.
         *
         * Timestream by default adds the following prefix to the error report path.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-s3configuration.html#cfn-timestream-scheduledquery-s3configuration-objectkeyprefix)
         */
        public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

        /** A builder for [S3ConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param bucketName Name of the S3 bucket under which error reports will be created.
             */
            public fun bucketName(bucketName: String)

            /**
             * @param encryptionOption Encryption at rest options for the error reports. If no
             *   encryption option is specified, Timestream will choose SSE_S3 as default.
             */
            public fun encryptionOption(encryptionOption: String)

            /**
             * @param objectKeyPrefix Prefix for the error report key. Timestream by default adds
             *   the following prefix to the error report path.
             */
            public fun objectKeyPrefix(objectKeyPrefix: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty
                    .builder()

            /**
             * @param bucketName Name of the S3 bucket under which error reports will be created.
             */
            override fun bucketName(bucketName: String) {
                cdkBuilder.bucketName(bucketName)
            }

            /**
             * @param encryptionOption Encryption at rest options for the error reports. If no
             *   encryption option is specified, Timestream will choose SSE_S3 as default.
             */
            override fun encryptionOption(encryptionOption: String) {
                cdkBuilder.encryptionOption(encryptionOption)
            }

            /**
             * @param objectKeyPrefix Prefix for the error report key. Timestream by default adds
             *   the following prefix to the error report path.
             */
            override fun objectKeyPrefix(objectKeyPrefix: String) {
                cdkBuilder.objectKeyPrefix(objectKeyPrefix)
            }

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty,
        ) : S3ConfigurationProperty {
            /**
             * Name of the S3 bucket under which error reports will be created.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-s3configuration.html#cfn-timestream-scheduledquery-s3configuration-bucketname)
             */
            override fun bucketName(): String = unwrap(this).getBucketName()

            /**
             * Encryption at rest options for the error reports.
             *
             * If no encryption option is specified, Timestream will choose SSE_S3 as default.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-s3configuration.html#cfn-timestream-scheduledquery-s3configuration-encryptionoption)
             */
            override fun encryptionOption(): String? = unwrap(this).getEncryptionOption()

            /**
             * Prefix for the error report key.
             *
             * Timestream by default adds the following prefix to the error report path.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-s3configuration.html#cfn-timestream-scheduledquery-s3configuration-objectkeyprefix)
             */
            override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty
            ): S3ConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: S3ConfigurationProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface NotificationConfigurationProperty {
        /**
         * Details on SNS configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-notificationconfiguration.html#cfn-timestream-scheduledquery-notificationconfiguration-snsconfiguration)
         */
        public fun snsConfiguration(): Any

        /** A builder for [NotificationConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param snsConfiguration Details on SNS configuration. */
            public fun snsConfiguration(snsConfiguration: IResolvable)

            /** @param snsConfiguration Details on SNS configuration. */
            public fun snsConfiguration(snsConfiguration: SnsConfigurationProperty)

            /** @param snsConfiguration Details on SNS configuration. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8247785498329ea3a738659a4497f5286a4da42d7f30083f3f27a84af446aeb9")
            public fun snsConfiguration(
                snsConfiguration: SnsConfigurationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery
                    .NotificationConfigurationProperty
                    .builder()

            /** @param snsConfiguration Details on SNS configuration. */
            override fun snsConfiguration(snsConfiguration: IResolvable) {
                cdkBuilder.snsConfiguration(snsConfiguration.let(IResolvable::unwrap))
            }

            /** @param snsConfiguration Details on SNS configuration. */
            override fun snsConfiguration(snsConfiguration: SnsConfigurationProperty) {
                cdkBuilder.snsConfiguration(snsConfiguration.let(SnsConfigurationProperty::unwrap))
            }

            /** @param snsConfiguration Details on SNS configuration. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8247785498329ea3a738659a4497f5286a4da42d7f30083f3f27a84af446aeb9")
            override fun snsConfiguration(
                snsConfiguration: SnsConfigurationProperty.Builder.() -> Unit
            ): Unit = snsConfiguration(SnsConfigurationProperty(snsConfiguration))

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty,
        ) : NotificationConfigurationProperty {
            /**
             * Details on SNS configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-notificationconfiguration.html#cfn-timestream-scheduledquery-notificationconfiguration-snsconfiguration)
             */
            override fun snsConfiguration(): Any = unwrap(this).getSnsConfiguration()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): NotificationConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty
            ): NotificationConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: NotificationConfigurationProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MixedMeasureMappingProperty {
        /**
         * Refers to the value of measure_name in a result row.
         *
         * This field is required if MeasureNameColumn is provided.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html#cfn-timestream-scheduledquery-mixedmeasuremapping-measurename)
         */
        public fun measureName(): String? = unwrap(this).getMeasureName()

        /**
         * Type of the value that is to be read from sourceColumn.
         *
         * If the mapping is for MULTI, use MeasureValueType.MULTI.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html#cfn-timestream-scheduledquery-mixedmeasuremapping-measurevaluetype)
         */
        public fun measureValueType(): String

        /**
         * Required when measureValueType is MULTI.
         *
         * Attribute mappings for MULTI value measures.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html#cfn-timestream-scheduledquery-mixedmeasuremapping-multimeasureattributemappings)
         */
        public fun multiMeasureAttributeMappings(): Any? =
            unwrap(this).getMultiMeasureAttributeMappings()

        /**
         * This field refers to the source column from which measure-value is to be read for result
         * materialization.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html#cfn-timestream-scheduledquery-mixedmeasuremapping-sourcecolumn)
         */
        public fun sourceColumn(): String? = unwrap(this).getSourceColumn()

        /**
         * Target measure name to be used.
         *
         * If not provided, the target measure name by default would be measure-name if provided, or
         * sourceColumn otherwise.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html#cfn-timestream-scheduledquery-mixedmeasuremapping-targetmeasurename)
         */
        public fun targetMeasureName(): String? = unwrap(this).getTargetMeasureName()

        /** A builder for [MixedMeasureMappingProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param measureName Refers to the value of measure_name in a result row. This field is
             *   required if MeasureNameColumn is provided.
             */
            public fun measureName(measureName: String)

            /**
             * @param measureValueType Type of the value that is to be read from sourceColumn. If
             *   the mapping is for MULTI, use MeasureValueType.MULTI.
             */
            public fun measureValueType(measureValueType: String)

            /**
             * @param multiMeasureAttributeMappings Required when measureValueType is MULTI.
             *   Attribute mappings for MULTI value measures.
             */
            public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable)

            /**
             * @param multiMeasureAttributeMappings Required when measureValueType is MULTI.
             *   Attribute mappings for MULTI value measures.
             */
            public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: List<Any>)

            /**
             * @param multiMeasureAttributeMappings Required when measureValueType is MULTI.
             *   Attribute mappings for MULTI value measures.
             */
            public fun multiMeasureAttributeMappings(vararg multiMeasureAttributeMappings: Any)

            /**
             * @param sourceColumn This field refers to the source column from which measure-value
             *   is to be read for result materialization.
             */
            public fun sourceColumn(sourceColumn: String)

            /**
             * @param targetMeasureName Target measure name to be used. If not provided, the target
             *   measure name by default would be measure-name if provided, or sourceColumn
             *   otherwise.
             */
            public fun targetMeasureName(targetMeasureName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery
                    .MixedMeasureMappingProperty
                    .builder()

            /**
             * @param measureName Refers to the value of measure_name in a result row. This field is
             *   required if MeasureNameColumn is provided.
             */
            override fun measureName(measureName: String) {
                cdkBuilder.measureName(measureName)
            }

            /**
             * @param measureValueType Type of the value that is to be read from sourceColumn. If
             *   the mapping is for MULTI, use MeasureValueType.MULTI.
             */
            override fun measureValueType(measureValueType: String) {
                cdkBuilder.measureValueType(measureValueType)
            }

            /**
             * @param multiMeasureAttributeMappings Required when measureValueType is MULTI.
             *   Attribute mappings for MULTI value measures.
             */
            override fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable) {
                cdkBuilder.multiMeasureAttributeMappings(
                    multiMeasureAttributeMappings.let(IResolvable::unwrap)
                )
            }

            /**
             * @param multiMeasureAttributeMappings Required when measureValueType is MULTI.
             *   Attribute mappings for MULTI value measures.
             */
            override fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: List<Any>) {
                cdkBuilder.multiMeasureAttributeMappings(multiMeasureAttributeMappings)
            }

            /**
             * @param multiMeasureAttributeMappings Required when measureValueType is MULTI.
             *   Attribute mappings for MULTI value measures.
             */
            override fun multiMeasureAttributeMappings(
                vararg multiMeasureAttributeMappings: Any
            ): Unit = multiMeasureAttributeMappings(multiMeasureAttributeMappings.toList())

            /**
             * @param sourceColumn This field refers to the source column from which measure-value
             *   is to be read for result materialization.
             */
            override fun sourceColumn(sourceColumn: String) {
                cdkBuilder.sourceColumn(sourceColumn)
            }

            /**
             * @param targetMeasureName Target measure name to be used. If not provided, the target
             *   measure name by default would be measure-name if provided, or sourceColumn
             *   otherwise.
             */
            override fun targetMeasureName(targetMeasureName: String) {
                cdkBuilder.targetMeasureName(targetMeasureName)
            }

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty,
        ) : MixedMeasureMappingProperty {
            /**
             * Refers to the value of measure_name in a result row.
             *
             * This field is required if MeasureNameColumn is provided.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html#cfn-timestream-scheduledquery-mixedmeasuremapping-measurename)
             */
            override fun measureName(): String? = unwrap(this).getMeasureName()

            /**
             * Type of the value that is to be read from sourceColumn.
             *
             * If the mapping is for MULTI, use MeasureValueType.MULTI.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html#cfn-timestream-scheduledquery-mixedmeasuremapping-measurevaluetype)
             */
            override fun measureValueType(): String = unwrap(this).getMeasureValueType()

            /**
             * Required when measureValueType is MULTI.
             *
             * Attribute mappings for MULTI value measures.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html#cfn-timestream-scheduledquery-mixedmeasuremapping-multimeasureattributemappings)
             */
            override fun multiMeasureAttributeMappings(): Any? =
                unwrap(this).getMultiMeasureAttributeMappings()

            /**
             * This field refers to the source column from which measure-value is to be read for
             * result materialization.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html#cfn-timestream-scheduledquery-mixedmeasuremapping-sourcecolumn)
             */
            override fun sourceColumn(): String? = unwrap(this).getSourceColumn()

            /**
             * Target measure name to be used.
             *
             * If not provided, the target measure name by default would be measure-name if
             * provided, or sourceColumn otherwise.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html#cfn-timestream-scheduledquery-mixedmeasuremapping-targetmeasurename)
             */
            override fun targetMeasureName(): String? = unwrap(this).getTargetMeasureName()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MixedMeasureMappingProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty
            ): MixedMeasureMappingProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MixedMeasureMappingProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MultiMeasureMappingsProperty {
        /**
         * Required.
         *
         * Attribute mappings to be used for mapping query results to ingest data for multi-measure
         * attributes.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasuremappings.html#cfn-timestream-scheduledquery-multimeasuremappings-multimeasureattributemappings)
         */
        public fun multiMeasureAttributeMappings(): Any

        /**
         * The name of the target multi-measure name in the derived table.
         *
         * This input is required when measureNameColumn is not provided. If MeasureNameColumn is
         * provided, then value from that column will be used as multi-measure name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasuremappings.html#cfn-timestream-scheduledquery-multimeasuremappings-targetmultimeasurename)
         */
        public fun targetMultiMeasureName(): String? = unwrap(this).getTargetMultiMeasureName()

        /** A builder for [MultiMeasureMappingsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param multiMeasureAttributeMappings Required. Attribute mappings to be used for
             *   mapping query results to ingest data for multi-measure attributes.
             */
            public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable)

            /**
             * @param multiMeasureAttributeMappings Required. Attribute mappings to be used for
             *   mapping query results to ingest data for multi-measure attributes.
             */
            public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: List<Any>)

            /**
             * @param multiMeasureAttributeMappings Required. Attribute mappings to be used for
             *   mapping query results to ingest data for multi-measure attributes.
             */
            public fun multiMeasureAttributeMappings(vararg multiMeasureAttributeMappings: Any)

            /**
             * @param targetMultiMeasureName The name of the target multi-measure name in the
             *   derived table. This input is required when measureNameColumn is not provided. If
             *   MeasureNameColumn is provided, then value from that column will be used as
             *   multi-measure name.
             */
            public fun targetMultiMeasureName(targetMultiMeasureName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery
                    .MultiMeasureMappingsProperty
                    .builder()

            /**
             * @param multiMeasureAttributeMappings Required. Attribute mappings to be used for
             *   mapping query results to ingest data for multi-measure attributes.
             */
            override fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable) {
                cdkBuilder.multiMeasureAttributeMappings(
                    multiMeasureAttributeMappings.let(IResolvable::unwrap)
                )
            }

            /**
             * @param multiMeasureAttributeMappings Required. Attribute mappings to be used for
             *   mapping query results to ingest data for multi-measure attributes.
             */
            override fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: List<Any>) {
                cdkBuilder.multiMeasureAttributeMappings(multiMeasureAttributeMappings)
            }

            /**
             * @param multiMeasureAttributeMappings Required. Attribute mappings to be used for
             *   mapping query results to ingest data for multi-measure attributes.
             */
            override fun multiMeasureAttributeMappings(
                vararg multiMeasureAttributeMappings: Any
            ): Unit = multiMeasureAttributeMappings(multiMeasureAttributeMappings.toList())

            /**
             * @param targetMultiMeasureName The name of the target multi-measure name in the
             *   derived table. This input is required when measureNameColumn is not provided. If
             *   MeasureNameColumn is provided, then value from that column will be used as
             *   multi-measure name.
             */
            override fun targetMultiMeasureName(targetMultiMeasureName: String) {
                cdkBuilder.targetMultiMeasureName(targetMultiMeasureName)
            }

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty,
        ) : MultiMeasureMappingsProperty {
            /**
             * Required.
             *
             * Attribute mappings to be used for mapping query results to ingest data for
             * multi-measure attributes.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasuremappings.html#cfn-timestream-scheduledquery-multimeasuremappings-multimeasureattributemappings)
             */
            override fun multiMeasureAttributeMappings(): Any =
                unwrap(this).getMultiMeasureAttributeMappings()

            /**
             * The name of the target multi-measure name in the derived table.
             *
             * This input is required when measureNameColumn is not provided. If MeasureNameColumn
             * is provided, then value from that column will be used as multi-measure name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasuremappings.html#cfn-timestream-scheduledquery-multimeasuremappings-targetmultimeasurename)
             */
            override fun targetMultiMeasureName(): String? =
                unwrap(this).getTargetMultiMeasureName()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MultiMeasureMappingsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty
            ): MultiMeasureMappingsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MultiMeasureMappingsProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ErrorReportConfigurationProperty {
        /**
         * The S3 configuration for the error reports.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-errorreportconfiguration.html#cfn-timestream-scheduledquery-errorreportconfiguration-s3configuration)
         */
        public fun s3Configuration(): Any

        /** A builder for [ErrorReportConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param s3Configuration The S3 configuration for the error reports. */
            public fun s3Configuration(s3Configuration: IResolvable)

            /** @param s3Configuration The S3 configuration for the error reports. */
            public fun s3Configuration(s3Configuration: S3ConfigurationProperty)

            /** @param s3Configuration The S3 configuration for the error reports. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2b4d8f1b5c3437012e697fbcab384cbae30b7a7c335885984356212fa9d386e5")
            public fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty.Builder =
                software.amazon.awscdk.services.timestream.CfnScheduledQuery
                    .ErrorReportConfigurationProperty
                    .builder()

            /** @param s3Configuration The S3 configuration for the error reports. */
            override fun s3Configuration(s3Configuration: IResolvable) {
                cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
            }

            /** @param s3Configuration The S3 configuration for the error reports. */
            override fun s3Configuration(s3Configuration: S3ConfigurationProperty) {
                cdkBuilder.s3Configuration(s3Configuration.let(S3ConfigurationProperty::unwrap))
            }

            /** @param s3Configuration The S3 configuration for the error reports. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2b4d8f1b5c3437012e697fbcab384cbae30b7a7c335885984356212fa9d386e5")
            override fun s3Configuration(
                s3Configuration: S3ConfigurationProperty.Builder.() -> Unit
            ): Unit = s3Configuration(S3ConfigurationProperty(s3Configuration))

            public fun build():
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty,
        ) : ErrorReportConfigurationProperty {
            /**
             * The S3 configuration for the error reports.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-errorreportconfiguration.html#cfn-timestream-scheduledquery-errorreportconfiguration-s3configuration)
             */
            override fun s3Configuration(): Any = unwrap(this).getS3Configuration()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ErrorReportConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty
            ): ErrorReportConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ErrorReportConfigurationProperty
            ): software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
