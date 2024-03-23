@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEventDataStore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
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
public interface CfnEventDataStoreProps {
  /**
   * The advanced event selectors to use to select the events for the data store.
   *
   * You can configure up to five advanced event selectors for each event data store.
   *
   * For more information about how to use advanced event selectors to log CloudTrail events, see
   * [Log events by using advanced event
   * selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
   * in the CloudTrail User Guide.
   *
   * For more information about how to use advanced event selectors to include AWS Config
   * configuration items in your event data store, see [Create an event data store for AWS Config
   * configuration
   * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
   * in the CloudTrail User Guide.
   *
   * For more information about how to use advanced event selectors to include non- AWS events in
   * your event data store, see [Create an integration to log events from outside
   * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
   * in the CloudTrail User Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
   */
  public fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

  /**
   * The billing mode for the event data store determines the cost for ingesting events and the
   * default and maximum retention period for the event data store.
   *
   * The following are the possible values:
   *
   * * `EXTENDABLE_RETENTION_PRICING` - This billing mode is generally recommended if you want a
   * flexible retention period of up to 3653 days (about 10 years). The default retention period for
   * this billing mode is 366 days.
   * * `FIXED_RETENTION_PRICING` - This billing mode is recommended if you expect to ingest more
   * than 25 TB of event data per month and need a retention period of up to 2557 days (about 7 years).
   * The default retention period for this billing mode is 2557 days.
   *
   * The default value is `EXTENDABLE_RETENTION_PRICING` .
   *
   * For more information about CloudTrail pricing, see [AWS CloudTrail
   * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) and [Managing CloudTrail Lake
   * costs](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-billingmode)
   */
  public fun billingMode(): String? = unwrap(this).getBillingMode()

  /**
   * Indicates if [Lake query
   * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
   * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
   * Lake query federation is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-federationenabled)
   */
  public fun federationEnabled(): Any? = unwrap(this).getFederationEnabled()

  /**
   * If Lake query federation is enabled, provides the ARN of the federation role used to access the
   * resources for the federated event data store.
   *
   * The federation role must exist in your account and provide the [required minimum
   * permissions](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-federationrolearn)
   */
  public fun federationRoleArn(): String? = unwrap(this).getFederationRoleArn()

  /**
   * Specifies whether the event data store should start ingesting live events.
   *
   * The default is true.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-ingestionenabled)
   */
  public fun ingestionEnabled(): Any? = unwrap(this).getIngestionEnabled()

  /**
   * A JSON string that contains the Insights types you want to log on an event data store.
   *
   * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
   *
   * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
   * aggregated per minute against a baseline API call volume.
   *
   * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
   * codes. The error is shown if the API call is unsuccessful.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-insightselectors)
   */
  public fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

  /**
   * The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights
   * events.
   *
   * For more information, see [Create an event data store for CloudTrail Insights
   * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-insights.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-insightsdestination)
   */
  public fun insightsDestination(): String? = unwrap(this).getInsightsDestination()

  /**
   * Specifies the AWS KMS key ID to use to encrypt the events delivered by CloudTrail.
   *
   * The value can be an alias name prefixed by `alias/` , a fully specified ARN to an alias, a
   * fully specified ARN to a key, or a globally unique identifier.
   *
   *
   * Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents
   * CloudTrail from logging events to the event data store, and prevents users from querying the data
   * in the event data store that was encrypted with the key. After you associate an event data store
   * with a KMS key, the KMS key cannot be removed or changed. Before you disable or delete a KMS key
   * that you are using with an event data store, delete or back up your event data store.
   *
   *
   * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
   * keys, see [Using multi-Region
   * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
   * the *AWS Key Management Service Developer Guide* .
   *
   * Examples:
   *
   * * `alias/MyAliasName`
   * * `arn:aws:kms:us-east-2:123456789012:alias/MyAliasName`
   * * `arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012`
   * * `12345678-1234-1234-1234-123456789012`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Specifies whether the event data store includes events from all Regions, or only from the
   * Region in which the event data store is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-multiregionenabled)
   */
  public fun multiRegionEnabled(): Any? = unwrap(this).getMultiRegionEnabled()

  /**
   * The name of the event data store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Specifies whether an event data store collects events logged for an organization in AWS
   * Organizations .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-organizationenabled)
   */
  public fun organizationEnabled(): Any? = unwrap(this).getOrganizationEnabled()

  /**
   * The retention period of the event data store, in days.
   *
   * If `BillingMode` is set to `EXTENDABLE_RETENTION_PRICING` , you can set a retention period of
   * up to 3653 days, the equivalent of 10 years. If `BillingMode` is set to `FIXED_RETENTION_PRICING`
   * , you can set a retention period of up to 2557 days, the equivalent of seven years.
   *
   * CloudTrail Lake determines whether to retain an event by checking if the `eventTime` of the
   * event is within the specified retention period. For example, if you set a retention period of 90
   * days, CloudTrail will remove events when the `eventTime` is older than 90 days.
   *
   *
   * If you plan to copy trail events to this event data store, we recommend that you consider both
   * the age of the events that you want to copy as well as how long you want to keep the copied events
   * in your event data store. For example, if you copy trail events that are 5 years old and specify a
   * retention period of 7 years, the event data store will retain those events for two years.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-retentionperiod)
   */
  public fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

  /**
   * A list of tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies whether termination protection is enabled for the event data store.
   *
   * If termination protection is enabled, you cannot delete the event data store until termination
   * protection is disabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-terminationprotectionenabled)
   */
  public fun terminationProtectionEnabled(): Any? = unwrap(this).getTerminationProtectionEnabled()

  /**
   * A builder for [CfnEventDataStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store.
     * You can configure up to five advanced event selectors for each event data store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event
     * selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see [Create an event data store for AWS Config
     * configuration
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     */
    public fun advancedEventSelectors(advancedEventSelectors: IResolvable)

    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store.
     * You can configure up to five advanced event selectors for each event data store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event
     * selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see [Create an event data store for AWS Config
     * configuration
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     */
    public fun advancedEventSelectors(advancedEventSelectors: List<Any>)

    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store.
     * You can configure up to five advanced event selectors for each event data store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event
     * selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see [Create an event data store for AWS Config
     * configuration
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     */
    public fun advancedEventSelectors(vararg advancedEventSelectors: Any)

    /**
     * @param billingMode The billing mode for the event data store determines the cost for
     * ingesting events and the default and maximum retention period for the event data store.
     * The following are the possible values:
     *
     * * `EXTENDABLE_RETENTION_PRICING` - This billing mode is generally recommended if you want a
     * flexible retention period of up to 3653 days (about 10 years). The default retention period for
     * this billing mode is 366 days.
     * * `FIXED_RETENTION_PRICING` - This billing mode is recommended if you expect to ingest more
     * than 25 TB of event data per month and need a retention period of up to 2557 days (about 7
     * years). The default retention period for this billing mode is 2557 days.
     *
     * The default value is `EXTENDABLE_RETENTION_PRICING` .
     *
     * For more information about CloudTrail pricing, see [AWS CloudTrail
     * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) and [Managing CloudTrail Lake
     * costs](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html)
     * .
     */
    public fun billingMode(billingMode: String)

    /**
     * @param federationEnabled Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled.
     */
    public fun federationEnabled(federationEnabled: Boolean)

    /**
     * @param federationEnabled Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled.
     */
    public fun federationEnabled(federationEnabled: IResolvable)

    /**
     * @param federationRoleArn If Lake query federation is enabled, provides the ARN of the
     * federation role used to access the resources for the federated event data store.
     * The federation role must exist in your account and provide the [required minimum
     * permissions](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role)
     * .
     */
    public fun federationRoleArn(federationRoleArn: String)

    /**
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     * events.
     * The default is true.
     */
    public fun ingestionEnabled(ingestionEnabled: Boolean)

    /**
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     * events.
     * The default is true.
     */
    public fun ingestionEnabled(ingestionEnabled: IResolvable)

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    public fun insightSelectors(insightSelectors: IResolvable)

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    public fun insightSelectors(insightSelectors: List<Any>)

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    public fun insightSelectors(vararg insightSelectors: Any)

    /**
     * @param insightsDestination The ARN (or ID suffix of the ARN) of the destination event data
     * store that logs Insights events.
     * For more information, see [Create an event data store for CloudTrail Insights
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-insights.html)
     * .
     */
    public fun insightsDestination(insightsDestination: String)

    /**
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the events delivered by
     * CloudTrail.
     * The value can be an alias name prefixed by `alias/` , a fully specified ARN to an alias, a
     * fully specified ARN to a key, or a globally unique identifier.
     *
     *
     * Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents
     * CloudTrail from logging events to the event data store, and prevents users from querying the
     * data in the event data store that was encrypted with the key. After you associate an event data
     * store with a KMS key, the KMS key cannot be removed or changed. Before you disable or delete a
     * KMS key that you are using with an event data store, delete or back up your event data store.
     *
     *
     * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
     * keys, see [Using multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * Examples:
     *
     * * `alias/MyAliasName`
     * * `arn:aws:kms:us-east-2:123456789012:alias/MyAliasName`
     * * `arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012`
     * * `12345678-1234-1234-1234-123456789012`
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     * Regions, or only from the Region in which the event data store is created.
     */
    public fun multiRegionEnabled(multiRegionEnabled: Boolean)

    /**
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     * Regions, or only from the Region in which the event data store is created.
     */
    public fun multiRegionEnabled(multiRegionEnabled: IResolvable)

    /**
     * @param name The name of the event data store.
     */
    public fun name(name: String)

    /**
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     * an organization in AWS Organizations .
     */
    public fun organizationEnabled(organizationEnabled: Boolean)

    /**
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     * an organization in AWS Organizations .
     */
    public fun organizationEnabled(organizationEnabled: IResolvable)

    /**
     * @param retentionPeriod The retention period of the event data store, in days.
     * If `BillingMode` is set to `EXTENDABLE_RETENTION_PRICING` , you can set a retention period of
     * up to 3653 days, the equivalent of 10 years. If `BillingMode` is set to
     * `FIXED_RETENTION_PRICING` , you can set a retention period of up to 2557 days, the equivalent of
     * seven years.
     *
     * CloudTrail Lake determines whether to retain an event by checking if the `eventTime` of the
     * event is within the specified retention period. For example, if you set a retention period of 90
     * days, CloudTrail will remove events when the `eventTime` is older than 90 days.
     *
     *
     * If you plan to copy trail events to this event data store, we recommend that you consider
     * both the age of the events that you want to copy as well as how long you want to keep the copied
     * events in your event data store. For example, if you copy trail events that are 5 years old and
     * specify a retention period of 7 years, the event data store will retain those events for two
     * years.
     */
    public fun retentionPeriod(retentionPeriod: Number)

    /**
     * @param tags A list of tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the event data store.
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean)

    /**
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the event data store.
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps.builder()

    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store.
     * You can configure up to five advanced event selectors for each event data store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event
     * selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see [Create an event data store for AWS Config
     * configuration
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     */
    override fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors.let(IResolvable::unwrap))
    }

    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store.
     * You can configure up to five advanced event selectors for each event data store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event
     * selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see [Create an event data store for AWS Config
     * configuration
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     */
    override fun advancedEventSelectors(advancedEventSelectors: List<Any>) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors)
    }

    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store.
     * You can configure up to five advanced event selectors for each event data store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event
     * selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see [Create an event data store for AWS Config
     * configuration
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     */
    override fun advancedEventSelectors(vararg advancedEventSelectors: Any): Unit =
        advancedEventSelectors(advancedEventSelectors.toList())

    /**
     * @param billingMode The billing mode for the event data store determines the cost for
     * ingesting events and the default and maximum retention period for the event data store.
     * The following are the possible values:
     *
     * * `EXTENDABLE_RETENTION_PRICING` - This billing mode is generally recommended if you want a
     * flexible retention period of up to 3653 days (about 10 years). The default retention period for
     * this billing mode is 366 days.
     * * `FIXED_RETENTION_PRICING` - This billing mode is recommended if you expect to ingest more
     * than 25 TB of event data per month and need a retention period of up to 2557 days (about 7
     * years). The default retention period for this billing mode is 2557 days.
     *
     * The default value is `EXTENDABLE_RETENTION_PRICING` .
     *
     * For more information about CloudTrail pricing, see [AWS CloudTrail
     * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) and [Managing CloudTrail Lake
     * costs](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html)
     * .
     */
    override fun billingMode(billingMode: String) {
      cdkBuilder.billingMode(billingMode)
    }

    /**
     * @param federationEnabled Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled.
     */
    override fun federationEnabled(federationEnabled: Boolean) {
      cdkBuilder.federationEnabled(federationEnabled)
    }

    /**
     * @param federationEnabled Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled.
     */
    override fun federationEnabled(federationEnabled: IResolvable) {
      cdkBuilder.federationEnabled(federationEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param federationRoleArn If Lake query federation is enabled, provides the ARN of the
     * federation role used to access the resources for the federated event data store.
     * The federation role must exist in your account and provide the [required minimum
     * permissions](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role)
     * .
     */
    override fun federationRoleArn(federationRoleArn: String) {
      cdkBuilder.federationRoleArn(federationRoleArn)
    }

    /**
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     * events.
     * The default is true.
     */
    override fun ingestionEnabled(ingestionEnabled: Boolean) {
      cdkBuilder.ingestionEnabled(ingestionEnabled)
    }

    /**
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     * events.
     * The default is true.
     */
    override fun ingestionEnabled(ingestionEnabled: IResolvable) {
      cdkBuilder.ingestionEnabled(ingestionEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    override fun insightSelectors(insightSelectors: IResolvable) {
      cdkBuilder.insightSelectors(insightSelectors.let(IResolvable::unwrap))
    }

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    override fun insightSelectors(insightSelectors: List<Any>) {
      cdkBuilder.insightSelectors(insightSelectors)
    }

    /**
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store.
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    override fun insightSelectors(vararg insightSelectors: Any): Unit =
        insightSelectors(insightSelectors.toList())

    /**
     * @param insightsDestination The ARN (or ID suffix of the ARN) of the destination event data
     * store that logs Insights events.
     * For more information, see [Create an event data store for CloudTrail Insights
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-insights.html)
     * .
     */
    override fun insightsDestination(insightsDestination: String) {
      cdkBuilder.insightsDestination(insightsDestination)
    }

    /**
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the events delivered by
     * CloudTrail.
     * The value can be an alias name prefixed by `alias/` , a fully specified ARN to an alias, a
     * fully specified ARN to a key, or a globally unique identifier.
     *
     *
     * Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents
     * CloudTrail from logging events to the event data store, and prevents users from querying the
     * data in the event data store that was encrypted with the key. After you associate an event data
     * store with a KMS key, the KMS key cannot be removed or changed. Before you disable or delete a
     * KMS key that you are using with an event data store, delete or back up your event data store.
     *
     *
     * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
     * keys, see [Using multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * Examples:
     *
     * * `alias/MyAliasName`
     * * `arn:aws:kms:us-east-2:123456789012:alias/MyAliasName`
     * * `arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012`
     * * `12345678-1234-1234-1234-123456789012`
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     * Regions, or only from the Region in which the event data store is created.
     */
    override fun multiRegionEnabled(multiRegionEnabled: Boolean) {
      cdkBuilder.multiRegionEnabled(multiRegionEnabled)
    }

    /**
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     * Regions, or only from the Region in which the event data store is created.
     */
    override fun multiRegionEnabled(multiRegionEnabled: IResolvable) {
      cdkBuilder.multiRegionEnabled(multiRegionEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param name The name of the event data store.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     * an organization in AWS Organizations .
     */
    override fun organizationEnabled(organizationEnabled: Boolean) {
      cdkBuilder.organizationEnabled(organizationEnabled)
    }

    /**
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     * an organization in AWS Organizations .
     */
    override fun organizationEnabled(organizationEnabled: IResolvable) {
      cdkBuilder.organizationEnabled(organizationEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param retentionPeriod The retention period of the event data store, in days.
     * If `BillingMode` is set to `EXTENDABLE_RETENTION_PRICING` , you can set a retention period of
     * up to 3653 days, the equivalent of 10 years. If `BillingMode` is set to
     * `FIXED_RETENTION_PRICING` , you can set a retention period of up to 2557 days, the equivalent of
     * seven years.
     *
     * CloudTrail Lake determines whether to retain an event by checking if the `eventTime` of the
     * event is within the specified retention period. For example, if you set a retention period of 90
     * days, CloudTrail will remove events when the `eventTime` is older than 90 days.
     *
     *
     * If you plan to copy trail events to this event data store, we recommend that you consider
     * both the age of the events that you want to copy as well as how long you want to keep the copied
     * events in your event data store. For example, if you copy trail events that are 5 years old and
     * specify a retention period of 7 years, the event data store will retain those events for two
     * years.
     */
    override fun retentionPeriod(retentionPeriod: Number) {
      cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * @param tags A list of tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the event data store.
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     */
    override fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean) {
      cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    /**
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the event data store.
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     */
    override fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable) {
      cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps,
  ) : CdkObject(cdkObject), CfnEventDataStoreProps {
    /**
     * The advanced event selectors to use to select the events for the data store.
     *
     * You can configure up to five advanced event selectors for each event data store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event
     * selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see [Create an event data store for AWS Config
     * configuration
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
     */
    override fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

    /**
     * The billing mode for the event data store determines the cost for ingesting events and the
     * default and maximum retention period for the event data store.
     *
     * The following are the possible values:
     *
     * * `EXTENDABLE_RETENTION_PRICING` - This billing mode is generally recommended if you want a
     * flexible retention period of up to 3653 days (about 10 years). The default retention period for
     * this billing mode is 366 days.
     * * `FIXED_RETENTION_PRICING` - This billing mode is recommended if you expect to ingest more
     * than 25 TB of event data per month and need a retention period of up to 2557 days (about 7
     * years). The default retention period for this billing mode is 2557 days.
     *
     * The default value is `EXTENDABLE_RETENTION_PRICING` .
     *
     * For more information about CloudTrail pricing, see [AWS CloudTrail
     * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) and [Managing CloudTrail Lake
     * costs](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-billingmode)
     */
    override fun billingMode(): String? = unwrap(this).getBillingMode()

    /**
     * Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-federationenabled)
     */
    override fun federationEnabled(): Any? = unwrap(this).getFederationEnabled()

    /**
     * If Lake query federation is enabled, provides the ARN of the federation role used to access
     * the resources for the federated event data store.
     *
     * The federation role must exist in your account and provide the [required minimum
     * permissions](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-federationrolearn)
     */
    override fun federationRoleArn(): String? = unwrap(this).getFederationRoleArn()

    /**
     * Specifies whether the event data store should start ingesting live events.
     *
     * The default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-ingestionenabled)
     */
    override fun ingestionEnabled(): Any? = unwrap(this).getIngestionEnabled()

    /**
     * A JSON string that contains the Insights types you want to log on an event data store.
     *
     * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-insightselectors)
     */
    override fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

    /**
     * The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights
     * events.
     *
     * For more information, see [Create an event data store for CloudTrail Insights
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-insights.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-insightsdestination)
     */
    override fun insightsDestination(): String? = unwrap(this).getInsightsDestination()

    /**
     * Specifies the AWS KMS key ID to use to encrypt the events delivered by CloudTrail.
     *
     * The value can be an alias name prefixed by `alias/` , a fully specified ARN to an alias, a
     * fully specified ARN to a key, or a globally unique identifier.
     *
     *
     * Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents
     * CloudTrail from logging events to the event data store, and prevents users from querying the
     * data in the event data store that was encrypted with the key. After you associate an event data
     * store with a KMS key, the KMS key cannot be removed or changed. Before you disable or delete a
     * KMS key that you are using with an event data store, delete or back up your event data store.
     *
     *
     * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
     * keys, see [Using multi-Region
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * Examples:
     *
     * * `alias/MyAliasName`
     * * `arn:aws:kms:us-east-2:123456789012:alias/MyAliasName`
     * * `arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012`
     * * `12345678-1234-1234-1234-123456789012`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies whether the event data store includes events from all Regions, or only from the
     * Region in which the event data store is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-multiregionenabled)
     */
    override fun multiRegionEnabled(): Any? = unwrap(this).getMultiRegionEnabled()

    /**
     * The name of the event data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specifies whether an event data store collects events logged for an organization in AWS
     * Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-organizationenabled)
     */
    override fun organizationEnabled(): Any? = unwrap(this).getOrganizationEnabled()

    /**
     * The retention period of the event data store, in days.
     *
     * If `BillingMode` is set to `EXTENDABLE_RETENTION_PRICING` , you can set a retention period of
     * up to 3653 days, the equivalent of 10 years. If `BillingMode` is set to
     * `FIXED_RETENTION_PRICING` , you can set a retention period of up to 2557 days, the equivalent of
     * seven years.
     *
     * CloudTrail Lake determines whether to retain an event by checking if the `eventTime` of the
     * event is within the specified retention period. For example, if you set a retention period of 90
     * days, CloudTrail will remove events when the `eventTime` is older than 90 days.
     *
     *
     * If you plan to copy trail events to this event data store, we recommend that you consider
     * both the age of the events that you want to copy as well as how long you want to keep the copied
     * events in your event data store. For example, if you copy trail events that are 5 years old and
     * specify a retention period of 7 years, the event data store will retain those events for two
     * years.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-retentionperiod)
     */
    override fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies whether termination protection is enabled for the event data store.
     *
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-terminationprotectionenabled)
     */
    override fun terminationProtectionEnabled(): Any? =
        unwrap(this).getTerminationProtectionEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventDataStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps):
        CfnEventDataStoreProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventDataStoreProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventDataStoreProps):
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps
  }
}
