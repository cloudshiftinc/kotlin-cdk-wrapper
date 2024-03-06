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

package io.cloudshiftdev.awscdkdsl.services.logs

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnAccountPolicy
import software.amazon.awscdk.services.logs.CfnAccountPolicyProps
import software.amazon.awscdk.services.logs.CfnDelivery
import software.amazon.awscdk.services.logs.CfnDeliveryDestination
import software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps
import software.amazon.awscdk.services.logs.CfnDeliveryProps
import software.amazon.awscdk.services.logs.CfnDeliverySource
import software.amazon.awscdk.services.logs.CfnDeliverySourceProps
import software.amazon.awscdk.services.logs.CfnDestination
import software.amazon.awscdk.services.logs.CfnDestinationProps
import software.amazon.awscdk.services.logs.CfnLogAnomalyDetector
import software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps
import software.amazon.awscdk.services.logs.CfnLogGroup
import software.amazon.awscdk.services.logs.CfnLogGroupProps
import software.amazon.awscdk.services.logs.CfnLogStream
import software.amazon.awscdk.services.logs.CfnLogStreamProps
import software.amazon.awscdk.services.logs.CfnMetricFilter
import software.amazon.awscdk.services.logs.CfnMetricFilterProps
import software.amazon.awscdk.services.logs.CfnQueryDefinition
import software.amazon.awscdk.services.logs.CfnQueryDefinitionProps
import software.amazon.awscdk.services.logs.CfnResourcePolicy
import software.amazon.awscdk.services.logs.CfnResourcePolicyProps
import software.amazon.awscdk.services.logs.CfnSubscriptionFilter
import software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps
import software.amazon.awscdk.services.logs.ColumnRestriction
import software.amazon.awscdk.services.logs.CrossAccountDestination
import software.amazon.awscdk.services.logs.CrossAccountDestinationProps
import software.amazon.awscdk.services.logs.DataProtectionPolicy
import software.amazon.awscdk.services.logs.DataProtectionPolicyProps
import software.amazon.awscdk.services.logs.LogGroup
import software.amazon.awscdk.services.logs.LogGroupProps
import software.amazon.awscdk.services.logs.LogRetention
import software.amazon.awscdk.services.logs.LogRetentionProps
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions
import software.amazon.awscdk.services.logs.LogStream
import software.amazon.awscdk.services.logs.LogStreamProps
import software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig
import software.amazon.awscdk.services.logs.MetricFilter
import software.amazon.awscdk.services.logs.MetricFilterOptions
import software.amazon.awscdk.services.logs.MetricFilterProps
import software.amazon.awscdk.services.logs.QueryDefinition
import software.amazon.awscdk.services.logs.QueryDefinitionProps
import software.amazon.awscdk.services.logs.QueryString
import software.amazon.awscdk.services.logs.QueryStringProps
import software.amazon.awscdk.services.logs.ResourcePolicy
import software.amazon.awscdk.services.logs.ResourcePolicyProps
import software.amazon.awscdk.services.logs.StreamOptions
import software.amazon.awscdk.services.logs.SubscriptionFilter
import software.amazon.awscdk.services.logs.SubscriptionFilterOptions
import software.amazon.awscdk.services.logs.SubscriptionFilterProps
import software.constructs.Construct

public object logs {
    /**
     * Creates or updates an account-level data protection policy or subscription filter policy that
     * applies to all log groups or a subset of log groups in the account.
     *
     * *Data protection policy*
     *
     * A data protection policy can help safeguard sensitive data that's ingested by your log groups
     * by auditing and masking the sensitive log data. Each account can have only one account-level
     * data protection policy.
     *
     * Sensitive data is detected and masked when it is ingested into a log group. When you set a
     * data protection policy, log events ingested into the log groups before that time are not
     * masked.
     *
     * If you create a data protection policy for your whole account, it applies to both existing
     * log groups and all log groups that are created later in this account. The account policy is
     * applied to existing log groups with eventual consistency. It might take up to 5 minutes
     * before sensitive data in existing log groups begins to be masked.
     *
     * By default, when a user views a log event that includes masked data, the sensitive data is
     * replaced by asterisks. A user who has the `logs:Unmask` permission can use a
     * [GetLogEvents](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetLogEvents.html)
     * or
     * [FilterLogEvents](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_FilterLogEvents.html)
     * operation with the `unmask` parameter set to `true` to view the unmasked log events. Users
     * with the `logs:Unmask` can also view unmasked data in the CloudWatch Logs console by running
     * a CloudWatch Logs Insights query with the `unmask` query command.
     *
     * For more information, including a list of types of data that can be audited and masked, see
     * [Protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html)
     * .
     *
     * To create an account-level policy, you must be signed on with the
     * `logs:PutDataProtectionPolicy` and `logs:PutAccountPolicy` permissions.
     *
     * An account-level policy applies to all log groups in the account. You can also create a data
     * protection policy that applies to just one log group. If a log group has its own data
     * protection policy and the account also has an account-level data protection policy, then the
     * two policies are cumulative. Any sensitive term specified in either policy is masked.
     *
     * *Subscription filter policy*
     *
     * A subscription filter policy sets up a real-time feed of log events from CloudWatch Logs to
     * other AWS services. Account-level subscription filter policies apply to both existing log
     * groups and log groups that are created later in this account. Supported destinations are
     * Kinesis Data Streams , Firehose , and Lambda . When log events are sent to the receiving
     * service, they are Base64 encoded and compressed with the GZIP format.
     *
     * The following destinations are supported for subscription filters:
     * * An Kinesis Data Streams data stream in the same account as the subscription policy, for
     *   same-account delivery.
     * * An Firehose data stream in the same account as the subscription policy, for same-account
     *   delivery.
     * * A Lambda function in the same account as the subscription policy, for same-account
     *   delivery.
     * * A logical destination in a different account created with
     *   [PutDestination](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDestination.html)
     *   , for cross-account delivery. Kinesis Data Streams and Firehose are supported as logical
     *   destinations.
     *
     * Each account can have one account-level subscription filter policy. If you are updating an
     * existing filter, you must specify the correct name in `PolicyName` . To perform a
     * `PutAccountPolicy` subscription filter operation for any destination except a Lambda
     * function, you must also have the `iam:PassRole` permission.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnAccountPolicy cfnAccountPolicy = CfnAccountPolicy.Builder.create(this, "MyCfnAccountPolicy")
     * .policyDocument("policyDocument")
     * .policyName("policyName")
     * .policyType("policyType")
     * // the properties below are optional
     * .scope("scope")
     * .selectionCriteria("selectionCriteria")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html)
     */
    public inline fun cfnAccountPolicy(
        scope: Construct,
        id: String,
        block: CfnAccountPolicyDsl.() -> Unit = {},
    ): CfnAccountPolicy {
        val builder = CfnAccountPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccountPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnAccountPolicyProps cfnAccountPolicyProps = CfnAccountPolicyProps.builder()
     * .policyDocument("policyDocument")
     * .policyName("policyName")
     * .policyType("policyType")
     * // the properties below are optional
     * .scope("scope")
     * .selectionCriteria("selectionCriteria")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-accountpolicy.html)
     */
    public inline fun cfnAccountPolicyProps(
        block: CfnAccountPolicyPropsDsl.() -> Unit = {}
    ): CfnAccountPolicyProps {
        val builder = CfnAccountPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure contains information about one *delivery* in your account.
     *
     * A delivery is a connection between a logical *delivery source* and a logical *delivery
     * destination* .
     *
     * For more information, see
     * [CreateDelivery](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html)
     * .
     *
     * You can't update an existing delivery. You can only create and delete deliveries.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnDelivery cfnDelivery = CfnDelivery.Builder.create(this, "MyCfnDelivery")
     * .deliveryDestinationArn("deliveryDestinationArn")
     * .deliverySourceName("deliverySourceName")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html)
     */
    public inline fun cfnDelivery(
        scope: Construct,
        id: String,
        block: CfnDeliveryDsl.() -> Unit = {},
    ): CfnDelivery {
        val builder = CfnDeliveryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure contains information about one *delivery destination* in your account.
     *
     * A delivery destination is an AWS resource that represents an AWS service that logs can be
     * sent to. CloudWatch Logs, Amazon S3, are supported as Firehose delivery destinations.
     *
     * To configure logs delivery between a supported AWS service and a destination, you must do the
     * following:
     * * Create a delivery source, which is a logical object that represents the resource that is
     *   actually sending the logs. For more information, see
     *   [PutDeliverySource](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html)
     *   .
     * * Create a *delivery destination* , which is a logical object that represents the actual
     *   delivery destination.
     * * If you are delivering logs cross-account, you must use
     *   [PutDeliveryDestinationPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html)
     *   in the destination account to assign an IAM policy to the destination. This policy allows
     *   delivery to that destination.
     * * Create a *delivery* by pairing exactly one delivery source and one delivery destination.
     *   For more information, see
     *   [CreateDelivery](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html)
     *   .
     *
     * You can configure a single delivery source to send logs to multiple destinations by creating
     * multiple deliveries. You can also create multiple deliveries to configure multiple delivery
     * sources to send logs to the same delivery destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * Object deliveryDestinationPolicy;
     * CfnDeliveryDestination cfnDeliveryDestination = CfnDeliveryDestination.Builder.create(this,
     * "MyCfnDeliveryDestination")
     * .name("name")
     * // the properties below are optional
     * .deliveryDestinationPolicy(deliveryDestinationPolicy)
     * .destinationResourceArn("destinationResourceArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html)
     */
    public inline fun cfnDeliveryDestination(
        scope: Construct,
        id: String,
        block: CfnDeliveryDestinationDsl.() -> Unit = {},
    ): CfnDeliveryDestination {
        val builder = CfnDeliveryDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeliveryDestination`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * Object deliveryDestinationPolicy;
     * CfnDeliveryDestinationProps cfnDeliveryDestinationProps = CfnDeliveryDestinationProps.builder()
     * .name("name")
     * // the properties below are optional
     * .deliveryDestinationPolicy(deliveryDestinationPolicy)
     * .destinationResourceArn("destinationResourceArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html)
     */
    public inline fun cfnDeliveryDestinationProps(
        block: CfnDeliveryDestinationPropsDsl.() -> Unit = {}
    ): CfnDeliveryDestinationProps {
        val builder = CfnDeliveryDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDelivery`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnDeliveryProps cfnDeliveryProps = CfnDeliveryProps.builder()
     * .deliveryDestinationArn("deliveryDestinationArn")
     * .deliverySourceName("deliverySourceName")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html)
     */
    public inline fun cfnDeliveryProps(
        block: CfnDeliveryPropsDsl.() -> Unit = {}
    ): CfnDeliveryProps {
        val builder = CfnDeliveryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure contains information about one *delivery source* in your account.
     *
     * A delivery source is an AWS resource that sends logs to an AWS destination. The destination
     * can be CloudWatch Logs, Amazon S3, or Firehose.
     *
     * Only some AWS services support being configured as a delivery source. These services are
     * listed as *Supported [V2 Permissions]* in the table at
     * [Enabling logging from AWS services.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html)
     *
     * To configure logs delivery between a supported AWS service and a destination, you must do the
     * following:
     * * Create a delivery source, which is a logical object that represents the resource that is
     *   actually sending the logs. For more information, see
     *   [PutDeliverySource](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html)
     *   .
     * * Create a *delivery destination* , which is a logical object that represents the actual
     *   delivery destination. For more information, see
     *   [PutDeliveryDestination](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestination.html)
     *   .
     * * If you are delivering logs cross-account, you must use
     *   [PutDeliveryDestinationPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html)
     *   in the destination account to assign an IAM policy to the destination. This policy allows
     *   delivery to that destination.
     * * Create a *delivery* by pairing exactly one delivery source and one delivery destination.
     *   For more information, see
     *   [CreateDelivery](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html)
     *   .
     *
     * You can configure a single delivery source to send logs to multiple destinations by creating
     * multiple deliveries. You can also create multiple deliveries to configure multiple delivery
     * sources to send logs to the same delivery destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnDeliverySource cfnDeliverySource = CfnDeliverySource.Builder.create(this,
     * "MyCfnDeliverySource")
     * .name("name")
     * // the properties below are optional
     * .logType("logType")
     * .resourceArn("resourceArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html)
     */
    public inline fun cfnDeliverySource(
        scope: Construct,
        id: String,
        block: CfnDeliverySourceDsl.() -> Unit = {},
    ): CfnDeliverySource {
        val builder = CfnDeliverySourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeliverySource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnDeliverySourceProps cfnDeliverySourceProps = CfnDeliverySourceProps.builder()
     * .name("name")
     * // the properties below are optional
     * .logType("logType")
     * .resourceArn("resourceArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html)
     */
    public inline fun cfnDeliverySourceProps(
        block: CfnDeliverySourcePropsDsl.() -> Unit = {}
    ): CfnDeliverySourceProps {
        val builder = CfnDeliverySourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::Logs::Destination resource specifies a CloudWatch Logs destination.
     *
     * A destination encapsulates a physical resource (such as an Amazon Kinesis data stream) and
     * enables you to subscribe that resource to a stream of log events.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnDestination cfnDestination = CfnDestination.Builder.create(this, "MyCfnDestination")
     * .destinationName("destinationName")
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .destinationPolicy("destinationPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html)
     */
    public inline fun cfnDestination(
        scope: Construct,
        id: String,
        block: CfnDestinationDsl.() -> Unit = {},
    ): CfnDestination {
        val builder = CfnDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDestination`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnDestinationProps cfnDestinationProps = CfnDestinationProps.builder()
     * .destinationName("destinationName")
     * .roleArn("roleArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .destinationPolicy("destinationPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html)
     */
    public inline fun cfnDestinationProps(
        block: CfnDestinationPropsDsl.() -> Unit = {}
    ): CfnDestinationProps {
        val builder = CfnDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates an *anomaly detector* that regularly scans one or more log groups and look
     * for patterns and anomalies in the logs.
     *
     * An anomaly detector can help surface issues by automatically discovering anomalies in your
     * log event traffic. An anomaly detector uses machine learning algorithms to scan log events
     * and find *patterns* . A pattern is a shared text structure that recurs among your log fields.
     * Patterns provide a useful tool for analyzing large sets of logs because a large number of log
     * events can often be compressed into a few patterns.
     *
     * The anomaly detector uses pattern recognition to find `anomalies` , which are unusual log
     * events. It compares current log events and patterns with trained baselines.
     *
     * Fields within a pattern are called *tokens* . Fields that vary within a pattern, such as a
     * request ID or timestamp, are referred to as *dynamic tokens* and represented by `&lt;*&gt;` .
     *
     * For more information see
     * [Log anomaly detection](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnLogAnomalyDetector cfnLogAnomalyDetector = CfnLogAnomalyDetector.Builder.create(this,
     * "MyCfnLogAnomalyDetector")
     * .accountId("accountId")
     * .anomalyVisibilityTime(123)
     * .detectorName("detectorName")
     * .evaluationFrequency("evaluationFrequency")
     * .filterPattern("filterPattern")
     * .kmsKeyId("kmsKeyId")
     * .logGroupArnList(List.of("logGroupArnList"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html)
     */
    public inline fun cfnLogAnomalyDetector(
        scope: Construct,
        id: String,
        block: CfnLogAnomalyDetectorDsl.() -> Unit = {},
    ): CfnLogAnomalyDetector {
        val builder = CfnLogAnomalyDetectorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLogAnomalyDetector`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnLogAnomalyDetectorProps cfnLogAnomalyDetectorProps = CfnLogAnomalyDetectorProps.builder()
     * .accountId("accountId")
     * .anomalyVisibilityTime(123)
     * .detectorName("detectorName")
     * .evaluationFrequency("evaluationFrequency")
     * .filterPattern("filterPattern")
     * .kmsKeyId("kmsKeyId")
     * .logGroupArnList(List.of("logGroupArnList"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html)
     */
    public inline fun cfnLogAnomalyDetectorProps(
        block: CfnLogAnomalyDetectorPropsDsl.() -> Unit = {}
    ): CfnLogAnomalyDetectorProps {
        val builder = CfnLogAnomalyDetectorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Logs::LogGroup` resource specifies a log group.
     *
     * A log group defines common properties for log streams, such as their retention and access
     * control rules. Each log stream must belong to one log group.
     *
     * You can create up to 1,000,000 log groups per Region per account. You must use the following
     * guidelines when naming a log group:
     * * Log group names must be unique within a Region for an AWS account.
     * * Log group names can be between 1 and 512 characters long.
     * * Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-'
     *   (hyphen), '/' (forward slash), and '.' (period).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * Object dataProtectionPolicy;
     * CfnLogGroup cfnLogGroup = CfnLogGroup.Builder.create(this, "MyCfnLogGroup")
     * .dataProtectionPolicy(dataProtectionPolicy)
     * .kmsKeyId("kmsKeyId")
     * .logGroupClass("logGroupClass")
     * .logGroupName("logGroupName")
     * .retentionInDays(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
     */
    public inline fun cfnLogGroup(
        scope: Construct,
        id: String,
        block: CfnLogGroupDsl.() -> Unit = {},
    ): CfnLogGroup {
        val builder = CfnLogGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLogGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * Object dataProtectionPolicy;
     * CfnLogGroupProps cfnLogGroupProps = CfnLogGroupProps.builder()
     * .dataProtectionPolicy(dataProtectionPolicy)
     * .kmsKeyId("kmsKeyId")
     * .logGroupClass("logGroupClass")
     * .logGroupName("logGroupName")
     * .retentionInDays(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
     */
    public inline fun cfnLogGroupProps(
        block: CfnLogGroupPropsDsl.() -> Unit = {}
    ): CfnLogGroupProps {
        val builder = CfnLogGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Logs::LogStream` resource specifies an Amazon CloudWatch Logs log stream in a
     * specific log group.
     *
     * A log stream represents the sequence of events coming from an application instance or
     * resource that you are monitoring.
     *
     * There is no limit on the number of log streams that you can create for a log group.
     *
     * You must use the following guidelines when naming a log stream:
     * * Log stream names must be unique within the log group.
     * * Log stream names can be between 1 and 512 characters long.
     * * The ':' (colon) and '*' (asterisk) characters are not allowed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnLogStream cfnLogStream = CfnLogStream.Builder.create(this, "MyCfnLogStream")
     * .logGroupName("logGroupName")
     * // the properties below are optional
     * .logStreamName("logStreamName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html)
     */
    public inline fun cfnLogStream(
        scope: Construct,
        id: String,
        block: CfnLogStreamDsl.() -> Unit = {},
    ): CfnLogStream {
        val builder = CfnLogStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLogStream`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnLogStreamProps cfnLogStreamProps = CfnLogStreamProps.builder()
     * .logGroupName("logGroupName")
     * // the properties below are optional
     * .logStreamName("logStreamName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html)
     */
    public inline fun cfnLogStreamProps(
        block: CfnLogStreamPropsDsl.() -> Unit = {}
    ): CfnLogStreamProps {
        val builder = CfnLogStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Logs::MetricFilter` resource specifies a metric filter that describes how
     * CloudWatch Logs extracts information from logs and transforms it into Amazon CloudWatch
     * metrics.
     *
     * If you have multiple metric filters that are associated with a log group, all the filters are
     * applied to the log streams in that group.
     *
     * The maximum number of metric filters that can be associated with a log group is 100.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnMetricFilter cfnMetricFilter = CfnMetricFilter.Builder.create(this, "MyCfnMetricFilter")
     * .filterPattern("filterPattern")
     * .logGroupName("logGroupName")
     * .metricTransformations(List.of(MetricTransformationProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricValue("metricValue")
     * // the properties below are optional
     * .defaultValue(123)
     * .dimensions(List.of(DimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build()))
     * // the properties below are optional
     * .filterName("filterName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html)
     */
    public inline fun cfnMetricFilter(
        scope: Construct,
        id: String,
        block: CfnMetricFilterDsl.() -> Unit = {},
    ): CfnMetricFilter {
        val builder = CfnMetricFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the CloudWatch metric dimensions to publish with this metric.
     *
     * Because dimensions are part of the unique identifier for a metric, whenever a unique
     * dimension name/value pair is extracted from your logs, you are creating a new variation of
     * that metric.
     *
     * For more information about publishing dimensions with metrics created by metric filters, see
     * [Publishing dimensions with metrics from values in JSON or space-delimited log events](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html#logs-metric-filters-dimensions)
     * .
     *
     * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
     * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as
     * dimensions. Each different value found for a dimension is treated as a separate metric and
     * accrues charges as a separate custom metric.
     *
     * To help prevent accidental high charges, Amazon disables a metric filter if it generates 1000
     * different name/value pairs for the dimensions that you have specified within a certain amount
     * of time.
     *
     * You can also set up a billing alarm to alert you if your charges are higher than expected.
     * For more information, see
     * [Creating a Billing Alarm to Monitor Your Estimated AWS Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * DimensionProperty dimensionProperty = DimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-dimension.html)
     */
    public inline fun cfnMetricFilterDimensionProperty(
        block: CfnMetricFilterDimensionPropertyDsl.() -> Unit = {}
    ): CfnMetricFilter.DimensionProperty {
        val builder = CfnMetricFilterDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MetricTransformation` is a property of the `AWS::Logs::MetricFilter` resource that describes
     * how to transform log streams into a CloudWatch metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * MetricTransformationProperty metricTransformationProperty =
     * MetricTransformationProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricValue("metricValue")
     * // the properties below are optional
     * .defaultValue(123)
     * .dimensions(List.of(DimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html)
     */
    public inline fun cfnMetricFilterMetricTransformationProperty(
        block: CfnMetricFilterMetricTransformationPropertyDsl.() -> Unit = {}
    ): CfnMetricFilter.MetricTransformationProperty {
        val builder = CfnMetricFilterMetricTransformationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMetricFilter`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnMetricFilterProps cfnMetricFilterProps = CfnMetricFilterProps.builder()
     * .filterPattern("filterPattern")
     * .logGroupName("logGroupName")
     * .metricTransformations(List.of(MetricTransformationProperty.builder()
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * .metricValue("metricValue")
     * // the properties below are optional
     * .defaultValue(123)
     * .dimensions(List.of(DimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build()))
     * // the properties below are optional
     * .filterName("filterName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html)
     */
    public inline fun cfnMetricFilterProps(
        block: CfnMetricFilterPropsDsl.() -> Unit = {}
    ): CfnMetricFilterProps {
        val builder = CfnMetricFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a query definition for CloudWatch Logs Insights.
     *
     * For more information, see
     * [Analyzing Log Data with CloudWatch Logs Insights](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AnalyzingLogData.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnQueryDefinition cfnQueryDefinition = CfnQueryDefinition.Builder.create(this,
     * "MyCfnQueryDefinition")
     * .name("name")
     * .queryString("queryString")
     * // the properties below are optional
     * .logGroupNames(List.of("logGroupNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html)
     */
    public inline fun cfnQueryDefinition(
        scope: Construct,
        id: String,
        block: CfnQueryDefinitionDsl.() -> Unit = {},
    ): CfnQueryDefinition {
        val builder = CfnQueryDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnQueryDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnQueryDefinitionProps cfnQueryDefinitionProps = CfnQueryDefinitionProps.builder()
     * .name("name")
     * .queryString("queryString")
     * // the properties below are optional
     * .logGroupNames(List.of("logGroupNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html)
     */
    public inline fun cfnQueryDefinitionProps(
        block: CfnQueryDefinitionPropsDsl.() -> Unit = {}
    ): CfnQueryDefinitionProps {
        val builder = CfnQueryDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates a resource policy that allows other AWS services to put log events to this
     * account.
     *
     * An account can have up to 10 resource policies per AWS Region.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
     * "MyCfnResourcePolicy")
     * .policyDocument("policyDocument")
     * .policyName("policyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicy(
        scope: Construct,
        id: String,
        block: CfnResourcePolicyDsl.() -> Unit = {},
    ): CfnResourcePolicy {
        val builder = CfnResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourcePolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
     * .policyDocument("policyDocument")
     * .policyName("policyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicyProps(
        block: CfnResourcePolicyPropsDsl.() -> Unit = {}
    ): CfnResourcePolicyProps {
        val builder = CfnResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Logs::SubscriptionFilter` resource specifies a subscription filter and associates
     * it with the specified log group.
     *
     * Subscription filters allow you to subscribe to a real-time stream of log events and have them
     * delivered to a specific destination. Currently, the supported destinations are:
     * * An Amazon Kinesis data stream belonging to the same account as the subscription filter, for
     *   same-account delivery.
     * * A logical destination that belongs to a different account, for cross-account delivery.
     * * An Amazon Kinesis Firehose delivery stream that belongs to the same account as the
     *   subscription filter, for same-account delivery.
     * * An AWS Lambda function that belongs to the same account as the subscription filter, for
     *   same-account delivery.
     *
     * There can be as many as two subscription filters associated with a log group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnSubscriptionFilter cfnSubscriptionFilter = CfnSubscriptionFilter.Builder.create(this,
     * "MyCfnSubscriptionFilter")
     * .destinationArn("destinationArn")
     * .filterPattern("filterPattern")
     * .logGroupName("logGroupName")
     * // the properties below are optional
     * .distribution("distribution")
     * .filterName("filterName")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html)
     */
    public inline fun cfnSubscriptionFilter(
        scope: Construct,
        id: String,
        block: CfnSubscriptionFilterDsl.() -> Unit = {},
    ): CfnSubscriptionFilter {
        val builder = CfnSubscriptionFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSubscriptionFilter`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * CfnSubscriptionFilterProps cfnSubscriptionFilterProps = CfnSubscriptionFilterProps.builder()
     * .destinationArn("destinationArn")
     * .filterPattern("filterPattern")
     * .logGroupName("logGroupName")
     * // the properties below are optional
     * .distribution("distribution")
     * .filterName("filterName")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html)
     */
    public inline fun cfnSubscriptionFilterProps(
        block: CfnSubscriptionFilterPropsDsl.() -> Unit = {}
    ): CfnSubscriptionFilterProps {
        val builder = CfnSubscriptionFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * ColumnRestriction columnRestriction = ColumnRestriction.builder()
     * .comparison("comparison")
     * // the properties below are optional
     * .numberValue(123)
     * .stringValue("stringValue")
     * .build();
     * ```
     */
    public inline fun columnRestriction(
        block: ColumnRestrictionDsl.() -> Unit = {}
    ): ColumnRestriction {
        val builder = ColumnRestrictionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new CloudWatch Logs Destination for use in cross-account scenarios.
     *
     * CrossAccountDestinations are used to subscribe a Kinesis stream in a different account to a
     * CloudWatch Subscription.
     *
     * Consumers will hardly ever need to use this class. Instead, directly subscribe a Kinesis
     * stream using the integration class in the `aws-cdk-lib/aws-logs-destinations` package; if
     * necessary, a `CrossAccountDestination` will be created automatically.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.logs.*;
     * Role role;
     * CrossAccountDestination crossAccountDestination = CrossAccountDestination.Builder.create(this,
     * "MyCrossAccountDestination")
     * .role(role)
     * .targetArn("targetArn")
     * // the properties below are optional
     * .destinationName("destinationName")
     * .build();
     * ```
     */
    public inline fun crossAccountDestination(
        scope: Construct,
        id: String,
        block: CrossAccountDestinationDsl.() -> Unit = {},
    ): CrossAccountDestination {
        val builder = CrossAccountDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a CrossAccountDestination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.logs.*;
     * Role role;
     * CrossAccountDestinationProps crossAccountDestinationProps =
     * CrossAccountDestinationProps.builder()
     * .role(role)
     * .targetArn("targetArn")
     * // the properties below are optional
     * .destinationName("destinationName")
     * .build();
     * ```
     */
    public inline fun crossAccountDestinationProps(
        block: CrossAccountDestinationPropsDsl.() -> Unit = {}
    ): CrossAccountDestinationProps {
        val builder = CrossAccountDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a data protection policy for CloudWatch Logs log groups.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.kinesisfirehose.alpha.*;
     * import software.amazon.awscdk.services.kinesisfirehose.destinations.alpha.*;
     * LogGroup logGroupDestination = LogGroup.Builder.create(this, "LogGroupLambdaAudit")
     * .logGroupName("auditDestinationForCDK")
     * .build();
     * Bucket bucket = new Bucket(this, "audit-bucket");
     * S3Bucket s3Destination = new S3Bucket(bucket);
     * DeliveryStream deliveryStream = DeliveryStream.Builder.create(this, "Delivery Stream")
     * .destinations(List.of(s3Destination))
     * .build();
     * DataProtectionPolicy dataProtectionPolicy = DataProtectionPolicy.Builder.create()
     * .name("data protection policy")
     * .description("policy description")
     * .identifiers(List.of(DataIdentifier.DRIVERSLICENSE_US,  // managed data identifier
     * new DataIdentifier("EmailAddress"),  // forward compatibility for new managed data identifiers
     * new CustomDataIdentifier("EmployeeId", "EmployeeId-\\d{9}"))) // custom data identifier
     * .logGroupAuditDestination(logGroupDestination)
     * .s3BucketAuditDestination(bucket)
     * .deliveryStreamNameAuditDestination(deliveryStream.getDeliveryStreamName())
     * .build();
     * LogGroup.Builder.create(this, "LogGroupLambda")
     * .logGroupName("cdkIntegLogGroup")
     * .dataProtectionPolicy(dataProtectionPolicy)
     * .build();
     * ```
     */
    public inline fun dataProtectionPolicy(
        block: DataProtectionPolicyDsl.() -> Unit = {}
    ): DataProtectionPolicy {
        val builder = DataProtectionPolicyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a data protection policy.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.kinesisfirehose.alpha.*;
     * import software.amazon.awscdk.services.kinesisfirehose.destinations.alpha.*;
     * LogGroup logGroupDestination = LogGroup.Builder.create(this, "LogGroupLambdaAudit")
     * .logGroupName("auditDestinationForCDK")
     * .build();
     * Bucket bucket = new Bucket(this, "audit-bucket");
     * S3Bucket s3Destination = new S3Bucket(bucket);
     * DeliveryStream deliveryStream = DeliveryStream.Builder.create(this, "Delivery Stream")
     * .destinations(List.of(s3Destination))
     * .build();
     * DataProtectionPolicy dataProtectionPolicy = DataProtectionPolicy.Builder.create()
     * .name("data protection policy")
     * .description("policy description")
     * .identifiers(List.of(DataIdentifier.DRIVERSLICENSE_US,  // managed data identifier
     * new DataIdentifier("EmailAddress"),  // forward compatibility for new managed data identifiers
     * new CustomDataIdentifier("EmployeeId", "EmployeeId-\\d{9}"))) // custom data identifier
     * .logGroupAuditDestination(logGroupDestination)
     * .s3BucketAuditDestination(bucket)
     * .deliveryStreamNameAuditDestination(deliveryStream.getDeliveryStreamName())
     * .build();
     * LogGroup.Builder.create(this, "LogGroupLambda")
     * .logGroupName("cdkIntegLogGroup")
     * .dataProtectionPolicy(dataProtectionPolicy)
     * .build();
     * ```
     */
    public inline fun dataProtectionPolicyProps(
        block: DataProtectionPolicyPropsDsl.() -> Unit = {}
    ): DataProtectionPolicyProps {
        val builder = DataProtectionPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a CloudWatch Log Group.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.logs.*;
     * LogGroup logGroup = new LogGroup(this, "Log Group");
     * Bucket logBucket = new Bucket(this, "S3 Bucket");
     * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
     * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
     * .releaseLabel(ReleaseLabel.EMR_6_2_0)
     * .jobDriver(JobDriver.builder()
     * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
     * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
     * .sparkSubmitParameters("--conf spark.executor.instances=2 --conf
     * spark.executor.memory=2G --conf spark.executor.cores=2 --conf spark.driver.cores=1")
     * .build())
     * .build())
     * .monitoring(Monitoring.builder()
     * .logGroup(logGroup)
     * .logBucket(logBucket)
     * .build())
     * .build();
     * ```
     */
    public inline fun logGroup(
        scope: Construct,
        id: String,
        block: LogGroupDsl.() -> Unit = {},
    ): LogGroup {
        val builder = LogGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a LogGroup.
     *
     * Example:
     * ```
     * Vpc vpc;
     * Key kmsKey = new Key(this, "KmsKey");
     * // Pass the KMS key in the `encryptionKey` field to associate the key to the log group
     * LogGroup logGroup = LogGroup.Builder.create(this, "LogGroup")
     * .encryptionKey(kmsKey)
     * .build();
     * // Pass the KMS key in the `encryptionKey` field to associate the key to the S3 bucket
     * Bucket execBucket = Bucket.Builder.create(this, "EcsExecBucket")
     * .encryptionKey(kmsKey)
     * .build();
     * Cluster cluster = Cluster.Builder.create(this, "Cluster")
     * .vpc(vpc)
     * .executeCommandConfiguration(ExecuteCommandConfiguration.builder()
     * .kmsKey(kmsKey)
     * .logConfiguration(ExecuteCommandLogConfiguration.builder()
     * .cloudWatchLogGroup(logGroup)
     * .cloudWatchEncryptionEnabled(true)
     * .s3Bucket(execBucket)
     * .s3EncryptionEnabled(true)
     * .s3KeyPrefix("exec-command-output")
     * .build())
     * .logging(ExecuteCommandLogging.OVERRIDE)
     * .build())
     * .build();
     * ```
     */
    public inline fun logGroupProps(block: LogGroupPropsDsl.() -> Unit = {}): LogGroupProps {
        val builder = LogGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a custom resource to control the retention policy of a CloudWatch Logs log group.
     *
     * The log group is created if it doesn't already exist. The policy is removed when
     * `retentionDays` is `undefined` or equal to `Infinity`. Log group can be created in the region
     * that is different from stack region by specifying `logGroupRegion`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.logs.*;
     * Role role;
     * LogRetention logRetention = LogRetention.Builder.create(this, "MyLogRetention")
     * .logGroupName("logGroupName")
     * .retention(RetentionDays.ONE_DAY)
     * // the properties below are optional
     * .logGroupRegion("logGroupRegion")
     * .logRetentionRetryOptions(LogRetentionRetryOptions.builder()
     * .base(Duration.minutes(30))
     * .maxRetries(123)
     * .build())
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .role(role)
     * .build();
     * ```
     */
    public inline fun logRetention(
        scope: Construct,
        id: String,
        block: LogRetentionDsl.() -> Unit = {},
    ): LogRetention {
        val builder = LogRetentionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a LogRetention.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.logs.*;
     * Role role;
     * LogRetentionProps logRetentionProps = LogRetentionProps.builder()
     * .logGroupName("logGroupName")
     * .retention(RetentionDays.ONE_DAY)
     * // the properties below are optional
     * .logGroupRegion("logGroupRegion")
     * .logRetentionRetryOptions(LogRetentionRetryOptions.builder()
     * .base(Duration.minutes(30))
     * .maxRetries(123)
     * .build())
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .role(role)
     * .build();
     * ```
     */
    public inline fun logRetentionProps(
        block: LogRetentionPropsDsl.() -> Unit = {}
    ): LogRetentionProps {
        val builder = LogRetentionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Retry options for all AWS API calls.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.logs.*;
     * LogRetentionRetryOptions logRetentionRetryOptions = LogRetentionRetryOptions.builder()
     * .base(Duration.minutes(30))
     * .maxRetries(123)
     * .build();
     * ```
     */
    public inline fun logRetentionRetryOptions(
        block: LogRetentionRetryOptionsDsl.() -> Unit = {}
    ): LogRetentionRetryOptions {
        val builder = LogRetentionRetryOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Log Stream in a Log Group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.logs.*;
     * LogGroup logGroup;
     * LogStream logStream = LogStream.Builder.create(this, "MyLogStream")
     * .logGroup(logGroup)
     * // the properties below are optional
     * .logStreamName("logStreamName")
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .build();
     * ```
     */
    public inline fun logStream(
        scope: Construct,
        id: String,
        block: LogStreamDsl.() -> Unit = {},
    ): LogStream {
        val builder = LogStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a LogStream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.logs.*;
     * LogGroup logGroup;
     * LogStreamProps logStreamProps = LogStreamProps.builder()
     * .logGroup(logGroup)
     * // the properties below are optional
     * .logStreamName("logStreamName")
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .build();
     * ```
     */
    public inline fun logStreamProps(block: LogStreamPropsDsl.() -> Unit = {}): LogStreamProps {
        val builder = LogStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties returned by a Subscription destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.logs.*;
     * Role role;
     * LogSubscriptionDestinationConfig logSubscriptionDestinationConfig =
     * LogSubscriptionDestinationConfig.builder()
     * .arn("arn")
     * // the properties below are optional
     * .role(role)
     * .build();
     * ```
     */
    public inline fun logSubscriptionDestinationConfig(
        block: LogSubscriptionDestinationConfigDsl.() -> Unit = {}
    ): LogSubscriptionDestinationConfig {
        val builder = LogSubscriptionDestinationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A filter that extracts information from CloudWatch Logs and emits to CloudWatch Metrics.
     *
     * Example:
     * ```
     * MetricFilter.Builder.create(this, "MetricFilter")
     * .logGroup(logGroup)
     * .metricNamespace("MyApp")
     * .metricName("Latency")
     * .filterPattern(FilterPattern.exists("$.latency"))
     * .metricValue("$.latency")
     * .build();
     * ```
     */
    public inline fun metricFilter(
        scope: Construct,
        id: String,
        block: MetricFilterDsl.() -> Unit = {},
    ): MetricFilter {
        val builder = MetricFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a MetricFilter created from a LogGroup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * import software.amazon.awscdk.services.logs.*;
     * IFilterPattern filterPattern;
     * MetricFilterOptions metricFilterOptions = MetricFilterOptions.builder()
     * .filterPattern(filterPattern)
     * .metricName("metricName")
     * .metricNamespace("metricNamespace")
     * // the properties below are optional
     * .defaultValue(123)
     * .dimensions(Map.of(
     * "dimensionsKey", "dimensions"))
     * .filterName("filterName")
     * .metricValue("metricValue")
     * .unit(Unit.SECONDS)
     * .build();
     * ```
     */
    public inline fun metricFilterOptions(
        block: MetricFilterOptionsDsl.() -> Unit = {}
    ): MetricFilterOptions {
        val builder = MetricFilterOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a MetricFilter.
     *
     * Example:
     * ```
     * MetricFilter.Builder.create(this, "MetricFilter")
     * .logGroup(logGroup)
     * .metricNamespace("MyApp")
     * .metricName("Latency")
     * .filterPattern(FilterPattern.exists("$.latency"))
     * .metricValue("$.latency")
     * .build();
     * ```
     */
    public inline fun metricFilterProps(
        block: MetricFilterPropsDsl.() -> Unit = {}
    ): MetricFilterProps {
        val builder = MetricFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a query definition for CloudWatch Logs Insights.
     *
     * Example:
     * ```
     * QueryDefinition.Builder.create(this, "QueryDefinition")
     * .queryDefinitionName("MyQuery")
     * .queryString(QueryString.Builder.create()
     * .fields(List.of("&#64;timestamp", "&#64;message"))
     * .parseStatements(List.of("&#64;message \"[*] *\" as loggingType, loggingMessage", "&#64;message
     * \"&lt;*&gt;: *\" as differentLoggingType, differentLoggingMessage"))
     * .filterStatements(List.of("loggingType = \"ERROR\"", "loggingMessage = \"A very strange error
     * occurred!\""))
     * .sort("&#64;timestamp desc")
     * .limit(20)
     * .build())
     * .build();
     * ```
     */
    public inline fun queryDefinition(
        scope: Construct,
        id: String,
        block: QueryDefinitionDsl.() -> Unit = {},
    ): QueryDefinition {
        val builder = QueryDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a QueryDefinition.
     *
     * Example:
     * ```
     * QueryDefinition.Builder.create(this, "QueryDefinition")
     * .queryDefinitionName("MyQuery")
     * .queryString(QueryString.Builder.create()
     * .fields(List.of("&#64;timestamp", "&#64;message"))
     * .parseStatements(List.of("&#64;message \"[*] *\" as loggingType, loggingMessage", "&#64;message
     * \"&lt;*&gt;: *\" as differentLoggingType, differentLoggingMessage"))
     * .filterStatements(List.of("loggingType = \"ERROR\"", "loggingMessage = \"A very strange error
     * occurred!\""))
     * .sort("&#64;timestamp desc")
     * .limit(20)
     * .build())
     * .build();
     * ```
     */
    public inline fun queryDefinitionProps(
        block: QueryDefinitionPropsDsl.() -> Unit = {}
    ): QueryDefinitionProps {
        val builder = QueryDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a QueryString.
     *
     * Example:
     * ```
     * QueryDefinition.Builder.create(this, "QueryDefinition")
     * .queryDefinitionName("MyQuery")
     * .queryString(QueryString.Builder.create()
     * .fields(List.of("&#64;timestamp", "&#64;message"))
     * .parseStatements(List.of("&#64;message \"[*] *\" as loggingType, loggingMessage", "&#64;message
     * \"&lt;*&gt;: *\" as differentLoggingType, differentLoggingMessage"))
     * .filterStatements(List.of("loggingType = \"ERROR\"", "loggingMessage = \"A very strange error
     * occurred!\""))
     * .sort("&#64;timestamp desc")
     * .limit(20)
     * .build())
     * .build();
     * ```
     */
    public inline fun queryString(block: QueryStringDsl.() -> Unit = {}): QueryString {
        val builder = QueryStringDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a QueryString.
     *
     * Example:
     * ```
     * QueryDefinition.Builder.create(this, "QueryDefinition")
     * .queryDefinitionName("MyQuery")
     * .queryString(QueryString.Builder.create()
     * .fields(List.of("&#64;timestamp", "&#64;message"))
     * .parseStatements(List.of("&#64;message \"[*] *\" as loggingType, loggingMessage", "&#64;message
     * \"&lt;*&gt;: *\" as differentLoggingType, differentLoggingMessage"))
     * .filterStatements(List.of("loggingType = \"ERROR\"", "loggingMessage = \"A very strange error
     * occurred!\""))
     * .sort("&#64;timestamp desc")
     * .limit(20)
     * .build())
     * .build();
     * ```
     */
    public inline fun queryStringProps(
        block: QueryStringPropsDsl.() -> Unit = {}
    ): QueryStringProps {
        val builder = QueryStringPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Resource Policy for CloudWatch Log Groups.
     *
     * Policies define the operations that are allowed on this resource.
     *
     * You almost never need to define this construct directly.
     *
     * All AWS resources that support resource policies have a method called
     * `addToResourcePolicy()`, which will automatically create a new resource policy if one doesn't
     * exist yet, otherwise it will add to the existing policy.
     *
     * Prefer to use `addToResourcePolicy()` instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.logs.*;
     * PolicyStatement policyStatement;
     * ResourcePolicy resourcePolicy = ResourcePolicy.Builder.create(this, "MyResourcePolicy")
     * .policyStatements(List.of(policyStatement))
     * .resourcePolicyName("resourcePolicyName")
     * .build();
     * ```
     */
    public inline fun resourcePolicy(
        scope: Construct,
        id: String,
        block: ResourcePolicyDsl.() -> Unit = {},
    ): ResourcePolicy {
        val builder = ResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define Cloudwatch log group resource policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.logs.*;
     * PolicyStatement policyStatement;
     * ResourcePolicyProps resourcePolicyProps = ResourcePolicyProps.builder()
     * .policyStatements(List.of(policyStatement))
     * .resourcePolicyName("resourcePolicyName")
     * .build();
     * ```
     */
    public inline fun resourcePolicyProps(
        block: ResourcePolicyPropsDsl.() -> Unit = {}
    ): ResourcePolicyProps {
        val builder = ResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a new LogStream created from a LogGroup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * StreamOptions streamOptions = StreamOptions.builder()
     * .logStreamName("logStreamName")
     * .build();
     * ```
     */
    public inline fun streamOptions(block: StreamOptionsDsl.() -> Unit = {}): StreamOptions {
        val builder = StreamOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new Subscription on a CloudWatch log group.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.logs.destinations.*;
     * Function fn;
     * LogGroup logGroup;
     * SubscriptionFilter.Builder.create(this, "Subscription")
     * .logGroup(logGroup)
     * .destination(new LambdaDestination(fn))
     * .filterPattern(FilterPattern.allTerms("ERROR", "MainThread"))
     * .filterName("ErrorInMainThread")
     * .build();
     * ```
     */
    public inline fun subscriptionFilter(
        scope: Construct,
        id: String,
        block: SubscriptionFilterDsl.() -> Unit = {},
    ): SubscriptionFilter {
        val builder = SubscriptionFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a new SubscriptionFilter created from a LogGroup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.*;
     * IFilterPattern filterPattern;
     * ILogSubscriptionDestination logSubscriptionDestination;
     * SubscriptionFilterOptions subscriptionFilterOptions = SubscriptionFilterOptions.builder()
     * .destination(logSubscriptionDestination)
     * .filterPattern(filterPattern)
     * // the properties below are optional
     * .filterName("filterName")
     * .build();
     * ```
     */
    public inline fun subscriptionFilterOptions(
        block: SubscriptionFilterOptionsDsl.() -> Unit = {}
    ): SubscriptionFilterOptions {
        val builder = SubscriptionFilterOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a SubscriptionFilter.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.logs.destinations.*;
     * Function fn;
     * LogGroup logGroup;
     * SubscriptionFilter.Builder.create(this, "Subscription")
     * .logGroup(logGroup)
     * .destination(new LambdaDestination(fn))
     * .filterPattern(FilterPattern.allTerms("ERROR", "MainThread"))
     * .filterName("ErrorInMainThread")
     * .build();
     * ```
     */
    public inline fun subscriptionFilterProps(
        block: SubscriptionFilterPropsDsl.() -> Unit = {}
    ): SubscriptionFilterProps {
        val builder = SubscriptionFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
