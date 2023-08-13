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

package cloudshift.awscdk.dsl.services.cloudtrail

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions
import software.amazon.awscdk.services.cloudtrail.CfnChannel
import software.amazon.awscdk.services.cloudtrail.CfnChannelProps
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps
import software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy
import software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps
import software.amazon.awscdk.services.cloudtrail.CfnTrail
import software.amazon.awscdk.services.cloudtrail.CfnTrailProps
import software.amazon.awscdk.services.cloudtrail.S3EventSelector
import software.amazon.awscdk.services.cloudtrail.Trail
import software.amazon.awscdk.services.cloudtrail.TrailProps
import software.constructs.Construct

public object cloudtrail {
    /**
     * Options for adding an event selector.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudtrail.*;
     * Bucket sourceBucket;
     * Artifact sourceOutput = new Artifact();
     * String key = "some/key.zip";
     * Trail trail = new Trail(this, "CloudTrail");
     * trail.addS3EventSelector(List.of(S3EventSelector.builder()
     * .bucket(sourceBucket)
     * .objectPrefix(key)
     * .build()), AddEventSelectorOptions.builder()
     * .readWriteType(ReadWriteType.WRITE_ONLY)
     * .build());
     * S3SourceAction sourceAction = S3SourceAction.Builder.create()
     * .actionName("S3Source")
     * .bucketKey(key)
     * .bucket(sourceBucket)
     * .output(sourceOutput)
     * .trigger(S3Trigger.EVENTS)
     * .build();
     * ```
     */
    public inline fun addEventSelectorOptions(
        block: AddEventSelectorOptionsDsl.() -> Unit = {}
    ): AddEventSelectorOptions {
        val builder = AddEventSelectorOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a returned CloudTrail channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
     * .destinations(List.of(DestinationProperty.builder()
     * .location("location")
     * .type("type")
     * .build()))
     * .name("name")
     * .source("source")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html)
     */
    public inline fun cfnChannel(
        scope: Construct,
        id: String,
        block: CfnChannelDsl.() -> Unit = {},
    ): CfnChannel {
        val builder = CfnChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about the destination receiving events.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * DestinationProperty destinationProperty = DestinationProperty.builder()
     * .location("location")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-channel-destination.html)
     */
    public inline fun cfnChannelDestinationProperty(
        block: CfnChannelDestinationPropertyDsl.() -> Unit = {}
    ): CfnChannel.DestinationProperty {
        val builder = CfnChannelDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
     * .destinations(List.of(DestinationProperty.builder()
     * .location("location")
     * .type("type")
     * .build()))
     * .name("name")
     * .source("source")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html)
     */
    public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
        val builder = CfnChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new event data store.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * CfnEventDataStore cfnEventDataStore = CfnEventDataStore.Builder.create(this,
     * "MyCfnEventDataStore")
     * .advancedEventSelectors(List.of(AdvancedEventSelectorProperty.builder()
     * .fieldSelectors(List.of(AdvancedFieldSelectorProperty.builder()
     * .field("field")
     * // the properties below are optional
     * .endsWith(List.of("endsWith"))
     * .equalTo(List.of("equalTo"))
     * .notEndsWith(List.of("notEndsWith"))
     * .notEquals(List.of("notEquals"))
     * .notStartsWith(List.of("notStartsWith"))
     * .startsWith(List.of("startsWith"))
     * .build()))
     * // the properties below are optional
     * .name("name")
     * .build()))
     * .ingestionEnabled(false)
     * .kmsKeyId("kmsKeyId")
     * .multiRegionEnabled(false)
     * .name("name")
     * .organizationEnabled(false)
     * .retentionPeriod(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .terminationProtectionEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html)
     */
    public inline fun cfnEventDataStore(
        scope: Construct,
        id: String,
        block: CfnEventDataStoreDsl.() -> Unit = {},
    ): CfnEventDataStore {
        val builder = CfnEventDataStoreDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Advanced event selectors let you create fine-grained selectors for the following AWS
     * CloudTrail event record ﬁelds.
     *
     * They help you control costs by logging only those events that are important to you. For more
     * information about advanced event selectors, see
     * [Logging data events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     * * `readOnly`
     * * `eventSource`
     * * `eventName`
     * * `eventCategory`
     * * `resources.type`
     * * `resources.ARN`
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * AdvancedEventSelectorProperty advancedEventSelectorProperty =
     * AdvancedEventSelectorProperty.builder()
     * .fieldSelectors(List.of(AdvancedFieldSelectorProperty.builder()
     * .field("field")
     * // the properties below are optional
     * .endsWith(List.of("endsWith"))
     * .equalTo(List.of("equalTo"))
     * .notEndsWith(List.of("notEndsWith"))
     * .notEquals(List.of("notEquals"))
     * .notStartsWith(List.of("notStartsWith"))
     * .startsWith(List.of("startsWith"))
     * .build()))
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedeventselector.html)
     */
    public inline fun cfnEventDataStoreAdvancedEventSelectorProperty(
        block: CfnEventDataStoreAdvancedEventSelectorPropertyDsl.() -> Unit = {}
    ): CfnEventDataStore.AdvancedEventSelectorProperty {
        val builder = CfnEventDataStoreAdvancedEventSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single selector statement in an advanced event selector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * AdvancedFieldSelectorProperty advancedFieldSelectorProperty =
     * AdvancedFieldSelectorProperty.builder()
     * .field("field")
     * // the properties below are optional
     * .endsWith(List.of("endsWith"))
     * .equalTo(List.of("equalTo"))
     * .notEndsWith(List.of("notEndsWith"))
     * .notEquals(List.of("notEquals"))
     * .notStartsWith(List.of("notStartsWith"))
     * .startsWith(List.of("startsWith"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html)
     */
    public inline fun cfnEventDataStoreAdvancedFieldSelectorProperty(
        block: CfnEventDataStoreAdvancedFieldSelectorPropertyDsl.() -> Unit = {}
    ): CfnEventDataStore.AdvancedFieldSelectorProperty {
        val builder = CfnEventDataStoreAdvancedFieldSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEventDataStore`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * CfnEventDataStoreProps cfnEventDataStoreProps = CfnEventDataStoreProps.builder()
     * .advancedEventSelectors(List.of(AdvancedEventSelectorProperty.builder()
     * .fieldSelectors(List.of(AdvancedFieldSelectorProperty.builder()
     * .field("field")
     * // the properties below are optional
     * .endsWith(List.of("endsWith"))
     * .equalTo(List.of("equalTo"))
     * .notEndsWith(List.of("notEndsWith"))
     * .notEquals(List.of("notEquals"))
     * .notStartsWith(List.of("notStartsWith"))
     * .startsWith(List.of("startsWith"))
     * .build()))
     * // the properties below are optional
     * .name("name")
     * .build()))
     * .ingestionEnabled(false)
     * .kmsKeyId("kmsKeyId")
     * .multiRegionEnabled(false)
     * .name("name")
     * .organizationEnabled(false)
     * .retentionPeriod(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .terminationProtectionEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html)
     */
    public inline fun cfnEventDataStoreProps(
        block: CfnEventDataStorePropsDsl.() -> Unit = {}
    ): CfnEventDataStoreProps {
        val builder = CfnEventDataStorePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attaches a resource-based permission policy to a CloudTrail channel that is used for an
     * integration with an event source outside of AWS .
     *
     * For more information about resource-based policies, see
     * [CloudTrail resource-based policy examples](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/security_iam_resource-based-policy-examples.html)
     * in the *CloudTrail User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * Object resourcePolicy;
     * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
     * "MyCfnResourcePolicy")
     * .resourceArn("resourceArn")
     * .resourcePolicy(resourcePolicy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html)
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
     * import software.amazon.awscdk.services.cloudtrail.*;
     * Object resourcePolicy;
     * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
     * .resourceArn("resourceArn")
     * .resourcePolicy(resourcePolicy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicyProps(
        block: CfnResourcePolicyPropsDsl.() -> Unit = {}
    ): CfnResourcePolicyProps {
        val builder = CfnResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * CfnTrail cfnTrail = CfnTrail.Builder.create(this, "MyCfnTrail")
     * .isLogging(false)
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .advancedEventSelectors(List.of(AdvancedEventSelectorProperty.builder()
     * .fieldSelectors(List.of(AdvancedFieldSelectorProperty.builder()
     * .field("field")
     * // the properties below are optional
     * .endsWith(List.of("endsWith"))
     * .equalTo(List.of("equalTo"))
     * .notEndsWith(List.of("notEndsWith"))
     * .notEquals(List.of("notEquals"))
     * .notStartsWith(List.of("notStartsWith"))
     * .startsWith(List.of("startsWith"))
     * .build()))
     * // the properties below are optional
     * .name("name")
     * .build()))
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
     * .enableLogFileValidation(false)
     * .eventSelectors(List.of(EventSelectorProperty.builder()
     * .dataResources(List.of(DataResourceProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .values(List.of("values"))
     * .build()))
     * .excludeManagementEventSources(List.of("excludeManagementEventSources"))
     * .includeManagementEvents(false)
     * .readWriteType("readWriteType")
     * .build()))
     * .includeGlobalServiceEvents(false)
     * .insightSelectors(List.of(InsightSelectorProperty.builder()
     * .insightType("insightType")
     * .build()))
     * .isMultiRegionTrail(false)
     * .isOrganizationTrail(false)
     * .kmsKeyId("kmsKeyId")
     * .s3KeyPrefix("s3KeyPrefix")
     * .snsTopicName("snsTopicName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trailName("trailName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html)
     */
    public inline fun cfnTrail(
        scope: Construct,
        id: String,
        block: CfnTrailDsl.() -> Unit = {},
    ): CfnTrail {
        val builder = CfnTrailDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Advanced event selectors let you create fine-grained selectors for the following AWS
     * CloudTrail event record ﬁelds.
     *
     * They help you control costs by logging only those events that are important to you. For more
     * information about advanced event selectors, see
     * [Logging data events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     * * `readOnly`
     * * `eventSource`
     * * `eventName`
     * * `eventCategory`
     * * `resources.type`
     * * `resources.ARN`
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * AdvancedEventSelectorProperty advancedEventSelectorProperty =
     * AdvancedEventSelectorProperty.builder()
     * .fieldSelectors(List.of(AdvancedFieldSelectorProperty.builder()
     * .field("field")
     * // the properties below are optional
     * .endsWith(List.of("endsWith"))
     * .equalTo(List.of("equalTo"))
     * .notEndsWith(List.of("notEndsWith"))
     * .notEquals(List.of("notEquals"))
     * .notStartsWith(List.of("notStartsWith"))
     * .startsWith(List.of("startsWith"))
     * .build()))
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedeventselector.html)
     */
    public inline fun cfnTrailAdvancedEventSelectorProperty(
        block: CfnTrailAdvancedEventSelectorPropertyDsl.() -> Unit = {}
    ): CfnTrail.AdvancedEventSelectorProperty {
        val builder = CfnTrailAdvancedEventSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single selector statement in an advanced event selector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * AdvancedFieldSelectorProperty advancedFieldSelectorProperty =
     * AdvancedFieldSelectorProperty.builder()
     * .field("field")
     * // the properties below are optional
     * .endsWith(List.of("endsWith"))
     * .equalTo(List.of("equalTo"))
     * .notEndsWith(List.of("notEndsWith"))
     * .notEquals(List.of("notEquals"))
     * .notStartsWith(List.of("notStartsWith"))
     * .startsWith(List.of("startsWith"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-advancedfieldselector.html)
     */
    public inline fun cfnTrailAdvancedFieldSelectorProperty(
        block: CfnTrailAdvancedFieldSelectorPropertyDsl.() -> Unit = {}
    ): CfnTrail.AdvancedFieldSelectorProperty {
        val builder = CfnTrailAdvancedFieldSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 buckets, AWS Lambda functions, or Amazon DynamoDB tables that you specify in
     * your event selectors for your trail to log data events.
     *
     * Data events provide information about the resource operations performed on or within a
     * resource itself. These are also known as data plane operations. You can specify up to 250
     * data resources for a trail.
     *
     * The total number of allowed data resources is 250. This number can be distributed between 1
     * and 5 event selectors, but the total cannot exceed 250 across all selectors for the trail.
     *
     * If you are using advanced event selectors, the maximum total number of values for all
     * conditions, across all advanced event selectors for the trail, is 500.
     *
     * The following example demonstrates how logging works when you configure logging of all data
     * events for an S3 bucket named `bucket-1` . In this example, the CloudTrail user specified an
     * empty prefix, and the option to log both `Read` and `Write` data events.
     * * A user uploads an image file to `bucket-1` .
     * * The `PutObject` API operation is an Amazon S3 object-level API. It is recorded as a data
     *   event in CloudTrail. Because the CloudTrail user specified an S3 bucket with an empty
     *   prefix, events that occur on any object in that bucket are logged. The trail processes and
     *   logs the event.
     * * A user uploads an object to an Amazon S3 bucket named `arn:aws:s3:::bucket-2` .
     * * The `PutObject` API operation occurred for an object in an S3 bucket that the CloudTrail
     *   user didn't specify for the trail. The trail doesn’t log the event.
     *
     * The following example demonstrates how logging works when you configure logging of AWS Lambda
     * data events for a Lambda function named *MyLambdaFunction* , but not for all Lambda
     * functions.
     * * A user runs a script that includes a call to the *MyLambdaFunction* function and the
     *   *MyOtherLambdaFunction* function.
     * * The `Invoke` API operation on *MyLambdaFunction* is an Lambda API. It is recorded as a data
     *   event in CloudTrail. Because the CloudTrail user specified logging data events for
     *   *MyLambdaFunction* , any invocations of that function are logged. The trail processes and
     *   logs the event.
     * * The `Invoke` API operation on *MyOtherLambdaFunction* is an Lambda API. Because the
     *   CloudTrail user did not specify logging data events for all Lambda functions, the `Invoke`
     *   operation for *MyOtherLambdaFunction* does not match the function specified for the trail.
     *   The trail doesn’t log the event.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * DataResourceProperty dataResourceProperty = DataResourceProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html)
     */
    public inline fun cfnTrailDataResourceProperty(
        block: CfnTrailDataResourcePropertyDsl.() -> Unit = {}
    ): CfnTrail.DataResourceProperty {
        val builder = CfnTrailDataResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use event selectors to further specify the management and data event settings for your trail.
     *
     * By default, trails created without specific event selectors will be configured to log all
     * read and write management events, and no data events. When an event occurs in your account,
     * CloudTrail evaluates the event selector for all trails. For each trail, if the event matches
     * any event selector, the trail processes and logs the event. If the event doesn't match any
     * event selector, the trail doesn't log the event.
     *
     * You can configure up to five event selectors for a trail.
     *
     * You cannot apply both event selectors and advanced event selectors to a trail.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * EventSelectorProperty eventSelectorProperty = EventSelectorProperty.builder()
     * .dataResources(List.of(DataResourceProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .values(List.of("values"))
     * .build()))
     * .excludeManagementEventSources(List.of("excludeManagementEventSources"))
     * .includeManagementEvents(false)
     * .readWriteType("readWriteType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html)
     */
    public inline fun cfnTrailEventSelectorProperty(
        block: CfnTrailEventSelectorPropertyDsl.() -> Unit = {}
    ): CfnTrail.EventSelectorProperty {
        val builder = CfnTrailEventSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A JSON string that contains a list of Insights types that are logged on a trail.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * InsightSelectorProperty insightSelectorProperty = InsightSelectorProperty.builder()
     * .insightType("insightType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-insightselector.html)
     */
    public inline fun cfnTrailInsightSelectorProperty(
        block: CfnTrailInsightSelectorPropertyDsl.() -> Unit = {}
    ): CfnTrail.InsightSelectorProperty {
        val builder = CfnTrailInsightSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTrail`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * CfnTrailProps cfnTrailProps = CfnTrailProps.builder()
     * .isLogging(false)
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .advancedEventSelectors(List.of(AdvancedEventSelectorProperty.builder()
     * .fieldSelectors(List.of(AdvancedFieldSelectorProperty.builder()
     * .field("field")
     * // the properties below are optional
     * .endsWith(List.of("endsWith"))
     * .equalTo(List.of("equalTo"))
     * .notEndsWith(List.of("notEndsWith"))
     * .notEquals(List.of("notEquals"))
     * .notStartsWith(List.of("notStartsWith"))
     * .startsWith(List.of("startsWith"))
     * .build()))
     * // the properties below are optional
     * .name("name")
     * .build()))
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
     * .enableLogFileValidation(false)
     * .eventSelectors(List.of(EventSelectorProperty.builder()
     * .dataResources(List.of(DataResourceProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .values(List.of("values"))
     * .build()))
     * .excludeManagementEventSources(List.of("excludeManagementEventSources"))
     * .includeManagementEvents(false)
     * .readWriteType("readWriteType")
     * .build()))
     * .includeGlobalServiceEvents(false)
     * .insightSelectors(List.of(InsightSelectorProperty.builder()
     * .insightType("insightType")
     * .build()))
     * .isMultiRegionTrail(false)
     * .isOrganizationTrail(false)
     * .kmsKeyId("kmsKeyId")
     * .s3KeyPrefix("s3KeyPrefix")
     * .snsTopicName("snsTopicName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trailName("trailName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html)
     */
    public inline fun cfnTrailProps(block: CfnTrailPropsDsl.() -> Unit = {}): CfnTrailProps {
        val builder = CfnTrailPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Selecting an S3 bucket and an optional prefix to be logged for data events.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudtrail.*;
     * import software.amazon.awscdk.services.s3.*;
     * Bucket bucket;
     * S3EventSelector s3EventSelector = S3EventSelector.builder()
     * .bucket(bucket)
     * // the properties below are optional
     * .objectPrefix("objectPrefix")
     * .build();
     * ```
     */
    public inline fun s3EventSelector(block: S3EventSelectorDsl.() -> Unit = {}): S3EventSelector {
        val builder = S3EventSelectorDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Cloud trail allows you to log events that happen in your AWS account For example:.
     *
     * import { CloudTrail } from 'aws-cdk-lib/aws-cloudtrail'
     *
     * const cloudTrail = new CloudTrail(this, 'MyTrail');
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudtrail.*;
     * IAlias myKeyAlias = Alias.fromAliasName(this, "myKey", "alias/aws/s3");
     * Trail trail = Trail.Builder.create(this, "myCloudTrail")
     * .sendToCloudWatchLogs(true)
     * .kmsKey(myKeyAlias)
     * .build();
     * ```
     */
    public inline fun trail(
        scope: Construct,
        id: String,
        block: TrailDsl.() -> Unit = {},
    ): Trail {
        val builder = TrailDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an AWS CloudTrail trail.
     *
     * Example:
     * ```
     * Trail trail = Trail.Builder.create(this, "CloudTrail")
     * // ...
     * .managementEvents(ReadWriteType.READ_ONLY)
     * .build();
     * ```
     */
    public inline fun trailProps(block: TrailPropsDsl.() -> Unit = {}): TrailProps {
        val builder = TrailPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
