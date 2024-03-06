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

package io.cloudshiftdev.awscdkdsl.services.cloudtrail

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps

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
 * .billingMode("billingMode")
 * .federationEnabled(false)
 * .federationRoleArn("federationRoleArn")
 * .ingestionEnabled(false)
 * .insightsDestination("insightsDestination")
 * .insightSelectors(List.of(InsightSelectorProperty.builder()
 * .insightType("insightType")
 * .build()))
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
@CdkDslMarker
public class CfnEventDataStorePropsDsl {
    private val cdkBuilder: CfnEventDataStoreProps.Builder = CfnEventDataStoreProps.builder()

    private val _advancedEventSelectors: MutableList<Any> = mutableListOf()

    private val _insightSelectors: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     *   the data store. You can configure up to five advanced event selectors for each event data
     *   store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see
     * [Create an event data store for AWS Config configuration items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see
     * [Create an integration to log events from outside AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     */
    public fun advancedEventSelectors(vararg advancedEventSelectors: Any) {
        _advancedEventSelectors.addAll(listOf(*advancedEventSelectors))
    }

    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     *   the data store. You can configure up to five advanced event selectors for each event data
     *   store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see
     * [Create an event data store for AWS Config configuration items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see
     * [Create an integration to log events from outside AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     */
    public fun advancedEventSelectors(advancedEventSelectors: Collection<Any>) {
        _advancedEventSelectors.addAll(advancedEventSelectors)
    }

    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     *   the data store. You can configure up to five advanced event selectors for each event data
     *   store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see
     * [Create an event data store for AWS Config configuration items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see
     * [Create an integration to log events from outside AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     */
    public fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
        cdkBuilder.advancedEventSelectors(advancedEventSelectors)
    }

    /**
     * @param billingMode The billing mode for the event data store determines the cost for
     *   ingesting events and the default and maximum retention period for the event data store. The
     *   following are the possible values:
     * * `EXTENDABLE_RETENTION_PRICING` - This billing mode is generally recommended if you want a
     *   flexible retention period of up to 3653 days (about 10 years). The default retention period
     *   for this billing mode is 366 days.
     * * `FIXED_RETENTION_PRICING` - This billing mode is recommended if you expect to ingest more
     *   than 25 TB of event data per month and need a retention period of up to 2557 days (about 7
     *   years). The default retention period for this billing mode is 2557 days.
     *
     * The default value is `EXTENDABLE_RETENTION_PRICING` .
     *
     * For more information about CloudTrail pricing, see
     * [AWS CloudTrail Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) and
     * [Managing CloudTrail Lake costs](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html)
     * .
     */
    public fun billingMode(billingMode: String) {
        cdkBuilder.billingMode(billingMode)
    }

    /**
     * @param federationEnabled Indicates if
     *   [Lake query federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html)
     *   is enabled. By default, Lake query federation is disabled. You cannot delete an event data
     *   store if Lake query federation is enabled.
     */
    public fun federationEnabled(federationEnabled: Boolean) {
        cdkBuilder.federationEnabled(federationEnabled)
    }

    /**
     * @param federationEnabled Indicates if
     *   [Lake query federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html)
     *   is enabled. By default, Lake query federation is disabled. You cannot delete an event data
     *   store if Lake query federation is enabled.
     */
    public fun federationEnabled(federationEnabled: IResolvable) {
        cdkBuilder.federationEnabled(federationEnabled)
    }

    /**
     * @param federationRoleArn If Lake query federation is enabled, provides the ARN of the
     *   federation role used to access the resources for the federated event data store. The
     *   federation role must exist in your account and provide the
     *   [required minimum permissions](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role)
     *   .
     */
    public fun federationRoleArn(federationRoleArn: String) {
        cdkBuilder.federationRoleArn(federationRoleArn)
    }

    /**
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     *   events. The default is true.
     */
    public fun ingestionEnabled(ingestionEnabled: Boolean) {
        cdkBuilder.ingestionEnabled(ingestionEnabled)
    }

    /**
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     *   events. The default is true.
     */
    public fun ingestionEnabled(ingestionEnabled: IResolvable) {
        cdkBuilder.ingestionEnabled(ingestionEnabled)
    }

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     *   event data store. `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    public fun insightSelectors(vararg insightSelectors: Any) {
        _insightSelectors.addAll(listOf(*insightSelectors))
    }

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     *   event data store. `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    public fun insightSelectors(insightSelectors: Collection<Any>) {
        _insightSelectors.addAll(insightSelectors)
    }

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     *   event data store. `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    public fun insightSelectors(insightSelectors: IResolvable) {
        cdkBuilder.insightSelectors(insightSelectors)
    }

    /**
     * @param insightsDestination The ARN (or ID suffix of the ARN) of the destination event data
     *   store that logs Insights events. For more information, see
     *   [Create an event data store for CloudTrail Insights events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-insights.html)
     *   .
     */
    public fun insightsDestination(insightsDestination: String) {
        cdkBuilder.insightsDestination(insightsDestination)
    }

    /**
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the events delivered by
     *   CloudTrail. The value can be an alias name prefixed by `alias/` , a fully specified ARN to
     *   an alias, a fully specified ARN to a key, or a globally unique identifier.
     *
     * Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents
     * CloudTrail from logging events to the event data store, and prevents users from querying the
     * data in the event data store that was encrypted with the key. After you associate an event
     * data store with a KMS key, the KMS key cannot be removed or changed. Before you disable or
     * delete a KMS key that you are using with an event data store, delete or back up your event
     * data store.
     *
     * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
     * keys, see
     * [Using multi-Region keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * Examples:
     * * `alias/MyAliasName`
     * * `arn:aws:kms:us-east-2:123456789012:alias/MyAliasName`
     * * `arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012`
     * * `12345678-1234-1234-1234-123456789012`
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     *   Regions, or only from the Region in which the event data store is created.
     */
    public fun multiRegionEnabled(multiRegionEnabled: Boolean) {
        cdkBuilder.multiRegionEnabled(multiRegionEnabled)
    }

    /**
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     *   Regions, or only from the Region in which the event data store is created.
     */
    public fun multiRegionEnabled(multiRegionEnabled: IResolvable) {
        cdkBuilder.multiRegionEnabled(multiRegionEnabled)
    }

    /** @param name The name of the event data store. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     *   an organization in AWS Organizations .
     */
    public fun organizationEnabled(organizationEnabled: Boolean) {
        cdkBuilder.organizationEnabled(organizationEnabled)
    }

    /**
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     *   an organization in AWS Organizations .
     */
    public fun organizationEnabled(organizationEnabled: IResolvable) {
        cdkBuilder.organizationEnabled(organizationEnabled)
    }

    /**
     * @param retentionPeriod The retention period of the event data store, in days. If
     *   `BillingMode` is set to `EXTENDABLE_RETENTION_PRICING` , you can set a retention period of
     *   up to 3653 days, the equivalent of 10 years. If `BillingMode` is set to
     *   `FIXED_RETENTION_PRICING` , you can set a retention period of up to 2557 days, the
     *   equivalent of seven years.
     *
     * CloudTrail Lake determines whether to retain an event by checking if the `eventTime` of the
     * event is within the specified retention period. For example, if you set a retention period of
     * 90 days, CloudTrail will remove events when the `eventTime` is older than 90 days.
     *
     * If you plan to copy trail events to this event data store, we recommend that you consider
     * both the age of the events that you want to copy as well as how long you want to keep the
     * copied events in your event data store. For example, if you copy trail events that are 5
     * years old and specify a retention period of 7 years, the event data store will retain those
     * events for two years.
     */
    public fun retentionPeriod(retentionPeriod: Number) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /** @param tags A list of tags. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A list of tags. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     *   the event data store. If termination protection is enabled, you cannot delete the event
     *   data store until termination protection is disabled.
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean) {
        cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    /**
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     *   the event data store. If termination protection is enabled, you cannot delete the event
     *   data store until termination protection is disabled.
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable) {
        cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    public fun build(): CfnEventDataStoreProps {
        if (_advancedEventSelectors.isNotEmpty())
            cdkBuilder.advancedEventSelectors(_advancedEventSelectors)
        if (_insightSelectors.isNotEmpty()) cdkBuilder.insightSelectors(_insightSelectors)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
