@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new event data store.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
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
 * .billingMode("billingMode")
 * .contextKeySelectors(List.of(ContextKeySelectorProperty.builder()
 * .equalTo(List.of("equalTo"))
 * .type("type")
 * .build()))
 * .federationEnabled(false)
 * .federationRoleArn("federationRoleArn")
 * .ingestionEnabled(false)
 * .insightsDestination("insightsDestination")
 * .insightSelectors(List.of(InsightSelectorProperty.builder()
 * .insightType("insightType")
 * .build()))
 * .kmsKeyId("kmsKeyId")
 * .maxEventSize("maxEventSize")
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
public open class CfnEventDataStore(
  cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cloudtrail.CfnEventDataStore(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventDataStoreProps,
  ) :
      this(software.amazon.awscdk.services.cloudtrail.CfnEventDataStore(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventDataStoreProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventDataStoreProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventDataStoreProps(props)
  )

  /**
   * The advanced event selectors to use to select the events for the data store.
   */
  public open fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

  /**
   * The advanced event selectors to use to select the events for the data store.
   */
  public open fun advancedEventSelectors(`value`: IResolvable) {
    unwrap(this).setAdvancedEventSelectors(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The advanced event selectors to use to select the events for the data store.
   */
  public open fun advancedEventSelectors(`value`: List<Any>) {
    unwrap(this).setAdvancedEventSelectors(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The advanced event selectors to use to select the events for the data store.
   */
  public open fun advancedEventSelectors(vararg `value`: Any): Unit =
      advancedEventSelectors(`value`.toList())

  /**
   * `Ref` returns the time stamp of the creation of the event data store, such as `1248496624` .
   */
  public open fun attrCreatedTimestamp(): String = unwrap(this).getAttrCreatedTimestamp()

  /**
   * `Ref` returns the ARN of the CloudTrail event data store, such as
   * `arn:aws:cloudtrail:us-east-1:12345678910:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE` .
   */
  public open fun attrEventDataStoreArn(): String = unwrap(this).getAttrEventDataStoreArn()

  /**
   * `Ref` returns the status of the event data store, such as `ENABLED` .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * `Ref` returns the time stamp that updates were made to an event data store, such as
   * `1598296624` .
   */
  public open fun attrUpdatedTimestamp(): String = unwrap(this).getAttrUpdatedTimestamp()

  /**
   * The billing mode for the event data store determines the cost for ingesting events and the
   * default and maximum retention period for the event data store.
   */
  public open fun billingMode(): String? = unwrap(this).getBillingMode()

  /**
   * The billing mode for the event data store determines the cost for ingesting events and the
   * default and maximum retention period for the event data store.
   */
  public open fun billingMode(`value`: String) {
    unwrap(this).setBillingMode(`value`)
  }

  /**
   * The list of context key selectors that are configured for the event data store.
   */
  public open fun contextKeySelectors(): Any? = unwrap(this).getContextKeySelectors()

  /**
   * The list of context key selectors that are configured for the event data store.
   */
  public open fun contextKeySelectors(`value`: IResolvable) {
    unwrap(this).setContextKeySelectors(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The list of context key selectors that are configured for the event data store.
   */
  public open fun contextKeySelectors(`value`: List<Any>) {
    unwrap(this).setContextKeySelectors(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The list of context key selectors that are configured for the event data store.
   */
  public open fun contextKeySelectors(vararg `value`: Any): Unit =
      contextKeySelectors(`value`.toList())

  /**
   * Indicates if [Lake query
   * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
   * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
   * Lake query federation is enabled.
   */
  public open fun federationEnabled(): Any? = unwrap(this).getFederationEnabled()

  /**
   * Indicates if [Lake query
   * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
   * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
   * Lake query federation is enabled.
   */
  public open fun federationEnabled(`value`: Boolean) {
    unwrap(this).setFederationEnabled(`value`)
  }

  /**
   * Indicates if [Lake query
   * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
   * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
   * Lake query federation is enabled.
   */
  public open fun federationEnabled(`value`: IResolvable) {
    unwrap(this).setFederationEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * If Lake query federation is enabled, provides the ARN of the federation role used to access the
   * resources for the federated event data store.
   */
  public open fun federationRoleArn(): String? = unwrap(this).getFederationRoleArn()

  /**
   * If Lake query federation is enabled, provides the ARN of the federation role used to access the
   * resources for the federated event data store.
   */
  public open fun federationRoleArn(`value`: String) {
    unwrap(this).setFederationRoleArn(`value`)
  }

  /**
   * Specifies whether the event data store should start ingesting live events.
   */
  public open fun ingestionEnabled(): Any? = unwrap(this).getIngestionEnabled()

  /**
   * Specifies whether the event data store should start ingesting live events.
   */
  public open fun ingestionEnabled(`value`: Boolean) {
    unwrap(this).setIngestionEnabled(`value`)
  }

  /**
   * Specifies whether the event data store should start ingesting live events.
   */
  public open fun ingestionEnabled(`value`: IResolvable) {
    unwrap(this).setIngestionEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A JSON string that contains the Insights types you want to log on an event data store.
   */
  public open fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

  /**
   * A JSON string that contains the Insights types you want to log on an event data store.
   */
  public open fun insightSelectors(`value`: IResolvable) {
    unwrap(this).setInsightSelectors(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A JSON string that contains the Insights types you want to log on an event data store.
   */
  public open fun insightSelectors(`value`: List<Any>) {
    unwrap(this).setInsightSelectors(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A JSON string that contains the Insights types you want to log on an event data store.
   */
  public open fun insightSelectors(vararg `value`: Any): Unit = insightSelectors(`value`.toList())

  /**
   * The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights
   * events.
   */
  public open fun insightsDestination(): String? = unwrap(this).getInsightsDestination()

  /**
   * The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights
   * events.
   */
  public open fun insightsDestination(`value`: String) {
    unwrap(this).setInsightsDestination(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specifies the AWS KMS key ID to use to encrypt the events delivered by CloudTrail.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Specifies the AWS KMS key ID to use to encrypt the events delivered by CloudTrail.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The maximum allowed size for events to be stored in the specified event data store.
   */
  public open fun maxEventSize(): String? = unwrap(this).getMaxEventSize()

  /**
   * The maximum allowed size for events to be stored in the specified event data store.
   */
  public open fun maxEventSize(`value`: String) {
    unwrap(this).setMaxEventSize(`value`)
  }

  /**
   * Specifies whether the event data store includes events from all Regions, or only from the
   * Region in which the event data store is created.
   */
  public open fun multiRegionEnabled(): Any? = unwrap(this).getMultiRegionEnabled()

  /**
   * Specifies whether the event data store includes events from all Regions, or only from the
   * Region in which the event data store is created.
   */
  public open fun multiRegionEnabled(`value`: Boolean) {
    unwrap(this).setMultiRegionEnabled(`value`)
  }

  /**
   * Specifies whether the event data store includes events from all Regions, or only from the
   * Region in which the event data store is created.
   */
  public open fun multiRegionEnabled(`value`: IResolvable) {
    unwrap(this).setMultiRegionEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The name of the event data store.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the event data store.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies whether an event data store collects events logged for an organization in AWS
   * Organizations .
   */
  public open fun organizationEnabled(): Any? = unwrap(this).getOrganizationEnabled()

  /**
   * Specifies whether an event data store collects events logged for an organization in AWS
   * Organizations .
   */
  public open fun organizationEnabled(`value`: Boolean) {
    unwrap(this).setOrganizationEnabled(`value`)
  }

  /**
   * Specifies whether an event data store collects events logged for an organization in AWS
   * Organizations .
   */
  public open fun organizationEnabled(`value`: IResolvable) {
    unwrap(this).setOrganizationEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The retention period of the event data store, in days.
   */
  public open fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

  /**
   * The retention period of the event data store, in days.
   */
  public open fun retentionPeriod(`value`: Number) {
    unwrap(this).setRetentionPeriod(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies whether termination protection is enabled for the event data store.
   */
  public open fun terminationProtectionEnabled(): Any? =
      unwrap(this).getTerminationProtectionEnabled()

  /**
   * Specifies whether termination protection is enabled for the event data store.
   */
  public open fun terminationProtectionEnabled(`value`: Boolean) {
    unwrap(this).setTerminationProtectionEnabled(`value`)
  }

  /**
   * Specifies whether termination protection is enabled for the event data store.
   */
  public open fun terminationProtectionEnabled(`value`: IResolvable) {
    unwrap(this).setTerminationProtectionEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudtrail.CfnEventDataStore].
   */
  @CdkDslMarker
  public interface Builder {
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
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-eds-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include events outside of
     * AWS events in your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-integrations-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store. 
     */
    public fun advancedEventSelectors(advancedEventSelectors: IResolvable)

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
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-eds-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include events outside of
     * AWS events in your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-integrations-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store. 
     */
    public fun advancedEventSelectors(advancedEventSelectors: List<Any>)

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
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-eds-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include events outside of
     * AWS events in your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-integrations-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store. 
     */
    public fun advancedEventSelectors(vararg advancedEventSelectors: Any)

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
     * @param billingMode The billing mode for the event data store determines the cost for
     * ingesting events and the default and maximum retention period for the event data store. 
     */
    public fun billingMode(billingMode: String)

    /**
     * The list of context key selectors that are configured for the event data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-contextkeyselectors)
     * @param contextKeySelectors The list of context key selectors that are configured for the
     * event data store. 
     */
    public fun contextKeySelectors(contextKeySelectors: IResolvable)

    /**
     * The list of context key selectors that are configured for the event data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-contextkeyselectors)
     * @param contextKeySelectors The list of context key selectors that are configured for the
     * event data store. 
     */
    public fun contextKeySelectors(contextKeySelectors: List<Any>)

    /**
     * The list of context key selectors that are configured for the event data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-contextkeyselectors)
     * @param contextKeySelectors The list of context key selectors that are configured for the
     * event data store. 
     */
    public fun contextKeySelectors(vararg contextKeySelectors: Any)

    /**
     * Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-federationenabled)
     * @param federationEnabled Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled. 
     */
    public fun federationEnabled(federationEnabled: Boolean)

    /**
     * Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-federationenabled)
     * @param federationEnabled Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled. 
     */
    public fun federationEnabled(federationEnabled: IResolvable)

    /**
     * If Lake query federation is enabled, provides the ARN of the federation role used to access
     * the resources for the federated event data store.
     *
     * The federation role must exist in your account and provide the [required minimum
     * permissions](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-federationrolearn)
     * @param federationRoleArn If Lake query federation is enabled, provides the ARN of the
     * federation role used to access the resources for the federated event data store. 
     */
    public fun federationRoleArn(federationRoleArn: String)

    /**
     * Specifies whether the event data store should start ingesting live events.
     *
     * The default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-ingestionenabled)
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     * events. 
     */
    public fun ingestionEnabled(ingestionEnabled: Boolean)

    /**
     * Specifies whether the event data store should start ingesting live events.
     *
     * The default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-ingestionenabled)
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     * events. 
     */
    public fun ingestionEnabled(ingestionEnabled: IResolvable)

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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store. 
     */
    public fun insightSelectors(insightSelectors: IResolvable)

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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store. 
     */
    public fun insightSelectors(insightSelectors: List<Any>)

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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store. 
     */
    public fun insightSelectors(vararg insightSelectors: Any)

    /**
     * The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights
     * events.
     *
     * For more information, see [Create an event data store for CloudTrail Insights
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-insights.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-insightsdestination)
     * @param insightsDestination The ARN (or ID suffix of the ARN) of the destination event data
     * store that logs Insights events. 
     */
    public fun insightsDestination(insightsDestination: String)

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
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the events delivered by
     * CloudTrail. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The maximum allowed size for events to be stored in the specified event data store.
     *
     * If you are using context key selectors, MaxEventSize must be set to Large.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-maxeventsize)
     * @param maxEventSize The maximum allowed size for events to be stored in the specified event
     * data store. 
     */
    public fun maxEventSize(maxEventSize: String)

    /**
     * Specifies whether the event data store includes events from all Regions, or only from the
     * Region in which the event data store is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-multiregionenabled)
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     * Regions, or only from the Region in which the event data store is created. 
     */
    public fun multiRegionEnabled(multiRegionEnabled: Boolean)

    /**
     * Specifies whether the event data store includes events from all Regions, or only from the
     * Region in which the event data store is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-multiregionenabled)
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     * Regions, or only from the Region in which the event data store is created. 
     */
    public fun multiRegionEnabled(multiRegionEnabled: IResolvable)

    /**
     * The name of the event data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-name)
     * @param name The name of the event data store. 
     */
    public fun name(name: String)

    /**
     * Specifies whether an event data store collects events logged for an organization in AWS
     * Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-organizationenabled)
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     * an organization in AWS Organizations . 
     */
    public fun organizationEnabled(organizationEnabled: Boolean)

    /**
     * Specifies whether an event data store collects events logged for an organization in AWS
     * Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-organizationenabled)
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     * an organization in AWS Organizations . 
     */
    public fun organizationEnabled(organizationEnabled: IResolvable)

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
     * @param retentionPeriod The retention period of the event data store, in days. 
     */
    public fun retentionPeriod(retentionPeriod: Number)

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-tags)
     * @param tags A list of tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-tags)
     * @param tags A list of tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies whether termination protection is enabled for the event data store.
     *
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-terminationprotectionenabled)
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the event data store. 
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean)

    /**
     * Specifies whether termination protection is enabled for the event data store.
     *
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-terminationprotectionenabled)
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the event data store. 
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.Builder.create(scope, id)

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
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-eds-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include events outside of
     * AWS events in your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-integrations-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store. 
     */
    override fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors.let(IResolvable.Companion::unwrap))
    }

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
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-eds-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include events outside of
     * AWS events in your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-integrations-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store. 
     */
    override fun advancedEventSelectors(advancedEventSelectors: List<Any>) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-eds-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include events outside of
     * AWS events in your event data store, see [Create an integration to log events from outside
     * AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-integrations-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     * the data store. 
     */
    override fun advancedEventSelectors(vararg advancedEventSelectors: Any): Unit =
        advancedEventSelectors(advancedEventSelectors.toList())

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
     * @param billingMode The billing mode for the event data store determines the cost for
     * ingesting events and the default and maximum retention period for the event data store. 
     */
    override fun billingMode(billingMode: String) {
      cdkBuilder.billingMode(billingMode)
    }

    /**
     * The list of context key selectors that are configured for the event data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-contextkeyselectors)
     * @param contextKeySelectors The list of context key selectors that are configured for the
     * event data store. 
     */
    override fun contextKeySelectors(contextKeySelectors: IResolvable) {
      cdkBuilder.contextKeySelectors(contextKeySelectors.let(IResolvable.Companion::unwrap))
    }

    /**
     * The list of context key selectors that are configured for the event data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-contextkeyselectors)
     * @param contextKeySelectors The list of context key selectors that are configured for the
     * event data store. 
     */
    override fun contextKeySelectors(contextKeySelectors: List<Any>) {
      cdkBuilder.contextKeySelectors(contextKeySelectors.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The list of context key selectors that are configured for the event data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-contextkeyselectors)
     * @param contextKeySelectors The list of context key selectors that are configured for the
     * event data store. 
     */
    override fun contextKeySelectors(vararg contextKeySelectors: Any): Unit =
        contextKeySelectors(contextKeySelectors.toList())

    /**
     * Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-federationenabled)
     * @param federationEnabled Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled. 
     */
    override fun federationEnabled(federationEnabled: Boolean) {
      cdkBuilder.federationEnabled(federationEnabled)
    }

    /**
     * Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-federationenabled)
     * @param federationEnabled Indicates if [Lake query
     * federation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html) is
     * enabled. By default, Lake query federation is disabled. You cannot delete an event data store if
     * Lake query federation is enabled. 
     */
    override fun federationEnabled(federationEnabled: IResolvable) {
      cdkBuilder.federationEnabled(federationEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * If Lake query federation is enabled, provides the ARN of the federation role used to access
     * the resources for the federated event data store.
     *
     * The federation role must exist in your account and provide the [required minimum
     * permissions](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html#query-federation-permissions-role)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-federationrolearn)
     * @param federationRoleArn If Lake query federation is enabled, provides the ARN of the
     * federation role used to access the resources for the federated event data store. 
     */
    override fun federationRoleArn(federationRoleArn: String) {
      cdkBuilder.federationRoleArn(federationRoleArn)
    }

    /**
     * Specifies whether the event data store should start ingesting live events.
     *
     * The default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-ingestionenabled)
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     * events. 
     */
    override fun ingestionEnabled(ingestionEnabled: Boolean) {
      cdkBuilder.ingestionEnabled(ingestionEnabled)
    }

    /**
     * Specifies whether the event data store should start ingesting live events.
     *
     * The default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-ingestionenabled)
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     * events. 
     */
    override fun ingestionEnabled(ingestionEnabled: IResolvable) {
      cdkBuilder.ingestionEnabled(ingestionEnabled.let(IResolvable.Companion::unwrap))
    }

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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store. 
     */
    override fun insightSelectors(insightSelectors: IResolvable) {
      cdkBuilder.insightSelectors(insightSelectors.let(IResolvable.Companion::unwrap))
    }

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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store. 
     */
    override fun insightSelectors(insightSelectors: List<Any>) {
      cdkBuilder.insightSelectors(insightSelectors.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param insightSelectors A JSON string that contains the Insights types you want to log on an
     * event data store. 
     */
    override fun insightSelectors(vararg insightSelectors: Any): Unit =
        insightSelectors(insightSelectors.toList())

    /**
     * The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights
     * events.
     *
     * For more information, see [Create an event data store for CloudTrail Insights
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-insights.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-insightsdestination)
     * @param insightsDestination The ARN (or ID suffix of the ARN) of the destination event data
     * store that logs Insights events. 
     */
    override fun insightsDestination(insightsDestination: String) {
      cdkBuilder.insightsDestination(insightsDestination)
    }

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
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the events delivered by
     * CloudTrail. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The maximum allowed size for events to be stored in the specified event data store.
     *
     * If you are using context key selectors, MaxEventSize must be set to Large.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-maxeventsize)
     * @param maxEventSize The maximum allowed size for events to be stored in the specified event
     * data store. 
     */
    override fun maxEventSize(maxEventSize: String) {
      cdkBuilder.maxEventSize(maxEventSize)
    }

    /**
     * Specifies whether the event data store includes events from all Regions, or only from the
     * Region in which the event data store is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-multiregionenabled)
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     * Regions, or only from the Region in which the event data store is created. 
     */
    override fun multiRegionEnabled(multiRegionEnabled: Boolean) {
      cdkBuilder.multiRegionEnabled(multiRegionEnabled)
    }

    /**
     * Specifies whether the event data store includes events from all Regions, or only from the
     * Region in which the event data store is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-multiregionenabled)
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     * Regions, or only from the Region in which the event data store is created. 
     */
    override fun multiRegionEnabled(multiRegionEnabled: IResolvable) {
      cdkBuilder.multiRegionEnabled(multiRegionEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The name of the event data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-name)
     * @param name The name of the event data store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies whether an event data store collects events logged for an organization in AWS
     * Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-organizationenabled)
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     * an organization in AWS Organizations . 
     */
    override fun organizationEnabled(organizationEnabled: Boolean) {
      cdkBuilder.organizationEnabled(organizationEnabled)
    }

    /**
     * Specifies whether an event data store collects events logged for an organization in AWS
     * Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-organizationenabled)
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     * an organization in AWS Organizations . 
     */
    override fun organizationEnabled(organizationEnabled: IResolvable) {
      cdkBuilder.organizationEnabled(organizationEnabled.let(IResolvable.Companion::unwrap))
    }

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
     * @param retentionPeriod The retention period of the event data store, in days. 
     */
    override fun retentionPeriod(retentionPeriod: Number) {
      cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-tags)
     * @param tags A list of tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-tags)
     * @param tags A list of tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies whether termination protection is enabled for the event data store.
     *
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-terminationprotectionenabled)
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the event data store. 
     */
    override fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean) {
      cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    /**
     * Specifies whether termination protection is enabled for the event data store.
     *
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-terminationprotectionenabled)
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the event data store. 
     */
    override fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable) {
      cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnEventDataStore =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventDataStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventDataStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore):
        CfnEventDataStore = CfnEventDataStore(cdkObject)

    internal fun unwrap(wrapped: CfnEventDataStore):
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStore = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStore
  }

  /**
   * Advanced event selectors let you create fine-grained selectors for AWS CloudTrail management,
   * data, and network activity events.
   *
   * They help you control costs by logging only those events that are important to you. For more
   * information about configuring advanced event selectors, see the [Logging data
   * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * , [Logging network activity
   * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-network-events-with-cloudtrail.html)
   * , and [Logging management
   * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html)
   * topics in the *AWS CloudTrail User Guide* .
   *
   * You cannot apply both event selectors and advanced event selectors to a trail.
   *
   * *Supported CloudTrail event record fields for management events*
   *
   * * `eventCategory` (required)
   * * `eventSource`
   * * `readOnly`
   *
   * The following additional fields are available for event data stores:
   *
   * * `eventName`
   * * `eventType`
   * * `sessionCredentialFromConsole`
   * * `userIdentity.arn`
   *
   * *Supported CloudTrail event record fields for data events*
   *
   * * `eventCategory` (required)
   * * `eventName`
   * * `eventSource`
   * * `eventType`
   * * `resources.ARN`
   * * `resources.type` (required)
   * * `readOnly`
   * * `sessionCredentialFromConsole`
   * * `userIdentity.arn`
   *
   * *Supported CloudTrail event record fields for network activity events*
   *
   * * `eventCategory` (required)
   * * `eventSource` (required)
   * * `eventName`
   * * `errorCode` - The only valid value for `errorCode` is `VpceAccessDenied` .
   * * `vpcEndpointId`
   *
   *
   * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
   * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
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
  public interface AdvancedEventSelectorProperty {
    /**
     * Contains all selector statements in an advanced event selector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedeventselector.html#cfn-cloudtrail-eventdatastore-advancedeventselector-fieldselectors)
     */
    public fun fieldSelectors(): Any

    /**
     * An optional, descriptive name for an advanced event selector, such as "Log data events for
     * only two S3 buckets".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedeventselector.html#cfn-cloudtrail-eventdatastore-advancedeventselector-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [AdvancedEventSelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      public fun fieldSelectors(fieldSelectors: IResolvable)

      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      public fun fieldSelectors(fieldSelectors: List<Any>)

      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      public fun fieldSelectors(vararg fieldSelectors: Any)

      /**
       * @param name An optional, descriptive name for an advanced event selector, such as "Log data
       * events for only two S3 buckets".
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty.builder()

      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      override fun fieldSelectors(fieldSelectors: IResolvable) {
        cdkBuilder.fieldSelectors(fieldSelectors.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      override fun fieldSelectors(fieldSelectors: List<Any>) {
        cdkBuilder.fieldSelectors(fieldSelectors.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param fieldSelectors Contains all selector statements in an advanced event selector. 
       */
      override fun fieldSelectors(vararg fieldSelectors: Any): Unit =
          fieldSelectors(fieldSelectors.toList())

      /**
       * @param name An optional, descriptive name for an advanced event selector, such as "Log data
       * events for only two S3 buckets".
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty,
    ) : CdkObject(cdkObject),
        AdvancedEventSelectorProperty {
      /**
       * Contains all selector statements in an advanced event selector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedeventselector.html#cfn-cloudtrail-eventdatastore-advancedeventselector-fieldselectors)
       */
      override fun fieldSelectors(): Any = unwrap(this).getFieldSelectors()

      /**
       * An optional, descriptive name for an advanced event selector, such as "Log data events for
       * only two S3 buckets".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedeventselector.html#cfn-cloudtrail-eventdatastore-advancedeventselector-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedEventSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty):
          AdvancedEventSelectorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdvancedEventSelectorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedEventSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty
    }
  }

  /**
   * A single selector statement in an advanced event selector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
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
  public interface AdvancedFieldSelectorProperty {
    /**
     * An operator that includes events that match the last few characters of the event record field
     * specified as the value of `Field` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-endswith)
     */
    public fun endsWith(): List<String> = unwrap(this).getEndsWith() ?: emptyList()

    /**
     * An operator that includes events that match the exact value of the event record field
     * specified as the value of `Field` .
     *
     * This is the only valid operator that you can use with the `readOnly` , `eventCategory` , and
     * `resources.type` fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-equals)
     */
    public fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

    /**
     * A field in a CloudTrail event record on which to filter events to be logged.
     *
     * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
     * Manager evidence, or events outside of AWS , the field is used only for selecting events as
     * filtering is not supported.
     *
     * For CloudTrail management events, supported fields include `eventCategory` (required),
     * `eventSource` , and `readOnly` . The following additional fields are available for event data
     * stores: `eventName` , `eventType` , `sessionCredentialFromConsole` , and `userIdentity.arn` .
     *
     * For CloudTrail data events, supported fields include `eventCategory` (required), `eventName`
     * , `eventSource` , `eventType` , `resources.type` (required), `readOnly` , `resources.ARN` ,
     * `sessionCredentialFromConsole` , and `userIdentity.arn` .
     *
     * For CloudTrail network activity events, supported fields include `eventCategory` (required),
     * `eventSource` (required), `eventName` , `errorCode` , and `vpcEndpointId` .
     *
     * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
     * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
     *
     *
     * Selectors don't support the use of wildcards like `*` . To match multiple values with a
     * single condition, you may use `StartsWith` , `EndsWith` , `NotStartsWith` , or `NotEndsWith` to
     * explicitly match the beginning or end of the event field.
     *
     *
     * * *`readOnly`* - This is an optional field that is only used for management events and data
     * events. This field can be set to `Equals` with a value of `true` or `false` . If you do not add
     * this field, CloudTrail logs both `read` and `write` events. A value of `true` logs only `read`
     * events. A value of `false` logs only `write` events.
     * * *`eventSource`* - This field is only used for management events, data events, and network
     * activity events.
     *
     * For management events for trails, this is an optional field that can be set to `NotEquals`
     * `kms.amazonaws.com` to exclude KMS management events, or `NotEquals` `rdsdata.amazonaws.com` to
     * exclude RDS management events.
     *
     * For data events for trails, this is an optional field that you can use to include or exclude
     * any event source and can use any operator.
     *
     * For management and data events for event data stores, this is an optional field that you can
     * use to include or exclude any event source and can use any operator.
     *
     * For network activity events, this is a required field that only uses the `Equals` operator.
     * Set this field to the event source for which you want to log network activity events. If you
     * want to log network activity events for multiple event sources, you must create a separate field
     * selector for each event source. For a list of services supporting network activity events, see
     * [Logging network activity
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-network-events-with-cloudtrail.html)
     * in the *AWS CloudTrail User Guide* .
     *
     * * *`eventName`* - This is an optional field that is only used for data events, management
     * events (for event data stores only), and network activity events. You can use any operator with
     * `eventName` . You can use it to ﬁlter in or ﬁlter out specific events. You can have multiple
     * values for this ﬁeld, separated by commas.
     * * *`eventCategory`* - This field is required and must be set to `Equals` .
     * * For CloudTrail management events, the value must be `Management` .
     * * For CloudTrail data events, the value must be `Data` .
     * * For CloudTrail network activity events, the value must be `NetworkActivity` .
     *
     * The following are used only for event data stores:
     *
     * * For CloudTrail Insights events, the value must be `Insight` .
     * * For AWS Config configuration items, the value must be `ConfigurationItem` .
     * * For Audit Manager evidence, the value must be `Evidence` .
     * * For events outside of AWS , the value must be `ActivityAuditLog` .
     * * *`eventType`* - For event data stores, this is an optional field available for event data
     * stores to filter management and data events on the event type. For trails, this is an optional
     * field to filter data events on the event type. For information about available event types, see
     * [CloudTrail record
     * contents](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-event-reference-record-contents.html#ct-event-type)
     * in the *AWS CloudTrail user guide* .
     * * *`errorCode`* - This ﬁeld is only used to filter CloudTrail network activity events and is
     * optional. This is the error code to filter on. Currently, the only valid `errorCode` is
     * `VpceAccessDenied` . `errorCode` can only use the `Equals` operator.
     * * *`sessionCredentialFromConsole`* - For event data stores, this is an optional field used to
     * filter management and data events based on whether the events originated from an AWS Management
     * Console session. For trails, this is an optional field used to filter data events.
     * `sessionCredentialFromConsole` can only use the `Equals` and `NotEquals` operators.
     * * *`resources.type`* - This ﬁeld is required for CloudTrail data events. `resources.type` can
     * only use the `Equals` operator.
     *
     * For a list of available resource types for data events, see [Data
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#logging-data-events)
     * in the *AWS CloudTrail User Guide* .
     *
     * You can have only one `resources.type` ﬁeld per selector. To log events on more than one
     * resource type, add another selector.
     *
     * * *`resources.ARN`* - The `resources.ARN` is an optional field for data events. You can use
     * any operator with `resources.ARN` , but if you use `Equals` or `NotEquals` , the value must
     * exactly match the ARN of a valid resource of the type you've speciﬁed in the template as the
     * value of resources.type. To log all data events for all objects in a specific S3 bucket, use the
     * `StartsWith` operator, and include only the bucket ARN as the matching value.
     *
     * For more information about the ARN formats of data event resources, see [Actions, resources,
     * and condition keys for AWS
     * services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
     * in the *Service Authorization Reference* .
     *
     *
     * You can't use the `resources.ARN` field to filter resource types that do not have ARNs.
     *
     *
     * * *`userIdentity.arn`* - For event data stores, this is an optional field used to filter
     * management and data events for actions taken by specific IAM identities. For trails, this is an
     * optional field used to filter data events. You can use any operator with `userIdentity.arn` .
     * For more information on the userIdentity element, see [CloudTrail userIdentity
     * element](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-event-reference-user-identity.html)
     * in the *AWS CloudTrail User Guide* .
     * * *`vpcEndpointId`* - This ﬁeld is only used to filter CloudTrail network activity events and
     * is optional. This field identifies the VPC endpoint that the request passed through. You can use
     * any operator with `vpcEndpointId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-field)
     */
    public fun `field`(): String

    /**
     * An operator that excludes events that match the last few characters of the event record field
     * specified as the value of `Field` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-notendswith)
     */
    public fun notEndsWith(): List<String> = unwrap(this).getNotEndsWith() ?: emptyList()

    /**
     * An operator that excludes events that match the exact value of the event record field
     * specified as the value of `Field` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-notequals)
     */
    public fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()

    /**
     * An operator that excludes events that match the first few characters of the event record
     * field specified as the value of `Field` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-notstartswith)
     */
    public fun notStartsWith(): List<String> = unwrap(this).getNotStartsWith() ?: emptyList()

    /**
     * An operator that includes events that match the first few characters of the event record
     * field specified as the value of `Field` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-startswith)
     */
    public fun startsWith(): List<String> = unwrap(this).getStartsWith() ?: emptyList()

    /**
     * A builder for [AdvancedFieldSelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endsWith An operator that includes events that match the last few characters of the
       * event record field specified as the value of `Field` .
       */
      public fun endsWith(endsWith: List<String>)

      /**
       * @param endsWith An operator that includes events that match the last few characters of the
       * event record field specified as the value of `Field` .
       */
      public fun endsWith(vararg endsWith: String)

      /**
       * @param equalTo An operator that includes events that match the exact value of the event
       * record field specified as the value of `Field` .
       * This is the only valid operator that you can use with the `readOnly` , `eventCategory` ,
       * and `resources.type` fields.
       */
      public fun equalTo(equalTo: List<String>)

      /**
       * @param equalTo An operator that includes events that match the exact value of the event
       * record field specified as the value of `Field` .
       * This is the only valid operator that you can use with the `readOnly` , `eventCategory` ,
       * and `resources.type` fields.
       */
      public fun equalTo(vararg equalTo: String)

      /**
       * @param field A field in a CloudTrail event record on which to filter events to be logged. 
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the field is used only for selecting events as
       * filtering is not supported.
       *
       * For CloudTrail management events, supported fields include `eventCategory` (required),
       * `eventSource` , and `readOnly` . The following additional fields are available for event data
       * stores: `eventName` , `eventType` , `sessionCredentialFromConsole` , and `userIdentity.arn` .
       *
       * For CloudTrail data events, supported fields include `eventCategory` (required),
       * `eventName` , `eventSource` , `eventType` , `resources.type` (required), `readOnly` ,
       * `resources.ARN` , `sessionCredentialFromConsole` , and `userIdentity.arn` .
       *
       * For CloudTrail network activity events, supported fields include `eventCategory`
       * (required), `eventSource` (required), `eventName` , `errorCode` , and `vpcEndpointId` .
       *
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
       *
       *
       * Selectors don't support the use of wildcards like `*` . To match multiple values with a
       * single condition, you may use `StartsWith` , `EndsWith` , `NotStartsWith` , or `NotEndsWith`
       * to explicitly match the beginning or end of the event field.
       *
       *
       * * *`readOnly`* - This is an optional field that is only used for management events and data
       * events. This field can be set to `Equals` with a value of `true` or `false` . If you do not
       * add this field, CloudTrail logs both `read` and `write` events. A value of `true` logs only
       * `read` events. A value of `false` logs only `write` events.
       * * *`eventSource`* - This field is only used for management events, data events, and network
       * activity events.
       *
       * For management events for trails, this is an optional field that can be set to `NotEquals`
       * `kms.amazonaws.com` to exclude KMS management events, or `NotEquals` `rdsdata.amazonaws.com`
       * to exclude RDS management events.
       *
       * For data events for trails, this is an optional field that you can use to include or
       * exclude any event source and can use any operator.
       *
       * For management and data events for event data stores, this is an optional field that you
       * can use to include or exclude any event source and can use any operator.
       *
       * For network activity events, this is a required field that only uses the `Equals` operator.
       * Set this field to the event source for which you want to log network activity events. If you
       * want to log network activity events for multiple event sources, you must create a separate
       * field selector for each event source. For a list of services supporting network activity
       * events, see [Logging network activity
       * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-network-events-with-cloudtrail.html)
       * in the *AWS CloudTrail User Guide* .
       *
       * * *`eventName`* - This is an optional field that is only used for data events, management
       * events (for event data stores only), and network activity events. You can use any operator
       * with `eventName` . You can use it to ﬁlter in or ﬁlter out specific events. You can have
       * multiple values for this ﬁeld, separated by commas.
       * * *`eventCategory`* - This field is required and must be set to `Equals` .
       * * For CloudTrail management events, the value must be `Management` .
       * * For CloudTrail data events, the value must be `Data` .
       * * For CloudTrail network activity events, the value must be `NetworkActivity` .
       *
       * The following are used only for event data stores:
       *
       * * For CloudTrail Insights events, the value must be `Insight` .
       * * For AWS Config configuration items, the value must be `ConfigurationItem` .
       * * For Audit Manager evidence, the value must be `Evidence` .
       * * For events outside of AWS , the value must be `ActivityAuditLog` .
       * * *`eventType`* - For event data stores, this is an optional field available for event data
       * stores to filter management and data events on the event type. For trails, this is an optional
       * field to filter data events on the event type. For information about available event types,
       * see [CloudTrail record
       * contents](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-event-reference-record-contents.html#ct-event-type)
       * in the *AWS CloudTrail user guide* .
       * * *`errorCode`* - This ﬁeld is only used to filter CloudTrail network activity events and
       * is optional. This is the error code to filter on. Currently, the only valid `errorCode` is
       * `VpceAccessDenied` . `errorCode` can only use the `Equals` operator.
       * * *`sessionCredentialFromConsole`* - For event data stores, this is an optional field used
       * to filter management and data events based on whether the events originated from an AWS
       * Management Console session. For trails, this is an optional field used to filter data events.
       * `sessionCredentialFromConsole` can only use the `Equals` and `NotEquals` operators.
       * * *`resources.type`* - This ﬁeld is required for CloudTrail data events. `resources.type`
       * can only use the `Equals` operator.
       *
       * For a list of available resource types for data events, see [Data
       * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#logging-data-events)
       * in the *AWS CloudTrail User Guide* .
       *
       * You can have only one `resources.type` ﬁeld per selector. To log events on more than one
       * resource type, add another selector.
       *
       * * *`resources.ARN`* - The `resources.ARN` is an optional field for data events. You can use
       * any operator with `resources.ARN` , but if you use `Equals` or `NotEquals` , the value must
       * exactly match the ARN of a valid resource of the type you've speciﬁed in the template as the
       * value of resources.type. To log all data events for all objects in a specific S3 bucket, use
       * the `StartsWith` operator, and include only the bucket ARN as the matching value.
       *
       * For more information about the ARN formats of data event resources, see [Actions,
       * resources, and condition keys for AWS
       * services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
       * in the *Service Authorization Reference* .
       *
       *
       * You can't use the `resources.ARN` field to filter resource types that do not have ARNs.
       *
       *
       * * *`userIdentity.arn`* - For event data stores, this is an optional field used to filter
       * management and data events for actions taken by specific IAM identities. For trails, this is
       * an optional field used to filter data events. You can use any operator with `userIdentity.arn`
       * . For more information on the userIdentity element, see [CloudTrail userIdentity
       * element](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-event-reference-user-identity.html)
       * in the *AWS CloudTrail User Guide* .
       * * *`vpcEndpointId`* - This ﬁeld is only used to filter CloudTrail network activity events
       * and is optional. This field identifies the VPC endpoint that the request passed through. You
       * can use any operator with `vpcEndpointId` .
       */
      public fun `field`(`field`: String)

      /**
       * @param notEndsWith An operator that excludes events that match the last few characters of
       * the event record field specified as the value of `Field` .
       */
      public fun notEndsWith(notEndsWith: List<String>)

      /**
       * @param notEndsWith An operator that excludes events that match the last few characters of
       * the event record field specified as the value of `Field` .
       */
      public fun notEndsWith(vararg notEndsWith: String)

      /**
       * @param notEquals An operator that excludes events that match the exact value of the event
       * record field specified as the value of `Field` .
       */
      public fun notEquals(notEquals: List<String>)

      /**
       * @param notEquals An operator that excludes events that match the exact value of the event
       * record field specified as the value of `Field` .
       */
      public fun notEquals(vararg notEquals: String)

      /**
       * @param notStartsWith An operator that excludes events that match the first few characters
       * of the event record field specified as the value of `Field` .
       */
      public fun notStartsWith(notStartsWith: List<String>)

      /**
       * @param notStartsWith An operator that excludes events that match the first few characters
       * of the event record field specified as the value of `Field` .
       */
      public fun notStartsWith(vararg notStartsWith: String)

      /**
       * @param startsWith An operator that includes events that match the first few characters of
       * the event record field specified as the value of `Field` .
       */
      public fun startsWith(startsWith: List<String>)

      /**
       * @param startsWith An operator that includes events that match the first few characters of
       * the event record field specified as the value of `Field` .
       */
      public fun startsWith(vararg startsWith: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty.builder()

      /**
       * @param endsWith An operator that includes events that match the last few characters of the
       * event record field specified as the value of `Field` .
       */
      override fun endsWith(endsWith: List<String>) {
        cdkBuilder.endsWith(endsWith)
      }

      /**
       * @param endsWith An operator that includes events that match the last few characters of the
       * event record field specified as the value of `Field` .
       */
      override fun endsWith(vararg endsWith: String): Unit = endsWith(endsWith.toList())

      /**
       * @param equalTo An operator that includes events that match the exact value of the event
       * record field specified as the value of `Field` .
       * This is the only valid operator that you can use with the `readOnly` , `eventCategory` ,
       * and `resources.type` fields.
       */
      override fun equalTo(equalTo: List<String>) {
        cdkBuilder.equalTo(equalTo)
      }

      /**
       * @param equalTo An operator that includes events that match the exact value of the event
       * record field specified as the value of `Field` .
       * This is the only valid operator that you can use with the `readOnly` , `eventCategory` ,
       * and `resources.type` fields.
       */
      override fun equalTo(vararg equalTo: String): Unit = equalTo(equalTo.toList())

      /**
       * @param field A field in a CloudTrail event record on which to filter events to be logged. 
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the field is used only for selecting events as
       * filtering is not supported.
       *
       * For CloudTrail management events, supported fields include `eventCategory` (required),
       * `eventSource` , and `readOnly` . The following additional fields are available for event data
       * stores: `eventName` , `eventType` , `sessionCredentialFromConsole` , and `userIdentity.arn` .
       *
       * For CloudTrail data events, supported fields include `eventCategory` (required),
       * `eventName` , `eventSource` , `eventType` , `resources.type` (required), `readOnly` ,
       * `resources.ARN` , `sessionCredentialFromConsole` , and `userIdentity.arn` .
       *
       * For CloudTrail network activity events, supported fields include `eventCategory`
       * (required), `eventSource` (required), `eventName` , `errorCode` , and `vpcEndpointId` .
       *
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
       *
       *
       * Selectors don't support the use of wildcards like `*` . To match multiple values with a
       * single condition, you may use `StartsWith` , `EndsWith` , `NotStartsWith` , or `NotEndsWith`
       * to explicitly match the beginning or end of the event field.
       *
       *
       * * *`readOnly`* - This is an optional field that is only used for management events and data
       * events. This field can be set to `Equals` with a value of `true` or `false` . If you do not
       * add this field, CloudTrail logs both `read` and `write` events. A value of `true` logs only
       * `read` events. A value of `false` logs only `write` events.
       * * *`eventSource`* - This field is only used for management events, data events, and network
       * activity events.
       *
       * For management events for trails, this is an optional field that can be set to `NotEquals`
       * `kms.amazonaws.com` to exclude KMS management events, or `NotEquals` `rdsdata.amazonaws.com`
       * to exclude RDS management events.
       *
       * For data events for trails, this is an optional field that you can use to include or
       * exclude any event source and can use any operator.
       *
       * For management and data events for event data stores, this is an optional field that you
       * can use to include or exclude any event source and can use any operator.
       *
       * For network activity events, this is a required field that only uses the `Equals` operator.
       * Set this field to the event source for which you want to log network activity events. If you
       * want to log network activity events for multiple event sources, you must create a separate
       * field selector for each event source. For a list of services supporting network activity
       * events, see [Logging network activity
       * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-network-events-with-cloudtrail.html)
       * in the *AWS CloudTrail User Guide* .
       *
       * * *`eventName`* - This is an optional field that is only used for data events, management
       * events (for event data stores only), and network activity events. You can use any operator
       * with `eventName` . You can use it to ﬁlter in or ﬁlter out specific events. You can have
       * multiple values for this ﬁeld, separated by commas.
       * * *`eventCategory`* - This field is required and must be set to `Equals` .
       * * For CloudTrail management events, the value must be `Management` .
       * * For CloudTrail data events, the value must be `Data` .
       * * For CloudTrail network activity events, the value must be `NetworkActivity` .
       *
       * The following are used only for event data stores:
       *
       * * For CloudTrail Insights events, the value must be `Insight` .
       * * For AWS Config configuration items, the value must be `ConfigurationItem` .
       * * For Audit Manager evidence, the value must be `Evidence` .
       * * For events outside of AWS , the value must be `ActivityAuditLog` .
       * * *`eventType`* - For event data stores, this is an optional field available for event data
       * stores to filter management and data events on the event type. For trails, this is an optional
       * field to filter data events on the event type. For information about available event types,
       * see [CloudTrail record
       * contents](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-event-reference-record-contents.html#ct-event-type)
       * in the *AWS CloudTrail user guide* .
       * * *`errorCode`* - This ﬁeld is only used to filter CloudTrail network activity events and
       * is optional. This is the error code to filter on. Currently, the only valid `errorCode` is
       * `VpceAccessDenied` . `errorCode` can only use the `Equals` operator.
       * * *`sessionCredentialFromConsole`* - For event data stores, this is an optional field used
       * to filter management and data events based on whether the events originated from an AWS
       * Management Console session. For trails, this is an optional field used to filter data events.
       * `sessionCredentialFromConsole` can only use the `Equals` and `NotEquals` operators.
       * * *`resources.type`* - This ﬁeld is required for CloudTrail data events. `resources.type`
       * can only use the `Equals` operator.
       *
       * For a list of available resource types for data events, see [Data
       * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#logging-data-events)
       * in the *AWS CloudTrail User Guide* .
       *
       * You can have only one `resources.type` ﬁeld per selector. To log events on more than one
       * resource type, add another selector.
       *
       * * *`resources.ARN`* - The `resources.ARN` is an optional field for data events. You can use
       * any operator with `resources.ARN` , but if you use `Equals` or `NotEquals` , the value must
       * exactly match the ARN of a valid resource of the type you've speciﬁed in the template as the
       * value of resources.type. To log all data events for all objects in a specific S3 bucket, use
       * the `StartsWith` operator, and include only the bucket ARN as the matching value.
       *
       * For more information about the ARN formats of data event resources, see [Actions,
       * resources, and condition keys for AWS
       * services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
       * in the *Service Authorization Reference* .
       *
       *
       * You can't use the `resources.ARN` field to filter resource types that do not have ARNs.
       *
       *
       * * *`userIdentity.arn`* - For event data stores, this is an optional field used to filter
       * management and data events for actions taken by specific IAM identities. For trails, this is
       * an optional field used to filter data events. You can use any operator with `userIdentity.arn`
       * . For more information on the userIdentity element, see [CloudTrail userIdentity
       * element](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-event-reference-user-identity.html)
       * in the *AWS CloudTrail User Guide* .
       * * *`vpcEndpointId`* - This ﬁeld is only used to filter CloudTrail network activity events
       * and is optional. This field identifies the VPC endpoint that the request passed through. You
       * can use any operator with `vpcEndpointId` .
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param notEndsWith An operator that excludes events that match the last few characters of
       * the event record field specified as the value of `Field` .
       */
      override fun notEndsWith(notEndsWith: List<String>) {
        cdkBuilder.notEndsWith(notEndsWith)
      }

      /**
       * @param notEndsWith An operator that excludes events that match the last few characters of
       * the event record field specified as the value of `Field` .
       */
      override fun notEndsWith(vararg notEndsWith: String): Unit = notEndsWith(notEndsWith.toList())

      /**
       * @param notEquals An operator that excludes events that match the exact value of the event
       * record field specified as the value of `Field` .
       */
      override fun notEquals(notEquals: List<String>) {
        cdkBuilder.notEquals(notEquals)
      }

      /**
       * @param notEquals An operator that excludes events that match the exact value of the event
       * record field specified as the value of `Field` .
       */
      override fun notEquals(vararg notEquals: String): Unit = notEquals(notEquals.toList())

      /**
       * @param notStartsWith An operator that excludes events that match the first few characters
       * of the event record field specified as the value of `Field` .
       */
      override fun notStartsWith(notStartsWith: List<String>) {
        cdkBuilder.notStartsWith(notStartsWith)
      }

      /**
       * @param notStartsWith An operator that excludes events that match the first few characters
       * of the event record field specified as the value of `Field` .
       */
      override fun notStartsWith(vararg notStartsWith: String): Unit =
          notStartsWith(notStartsWith.toList())

      /**
       * @param startsWith An operator that includes events that match the first few characters of
       * the event record field specified as the value of `Field` .
       */
      override fun startsWith(startsWith: List<String>) {
        cdkBuilder.startsWith(startsWith)
      }

      /**
       * @param startsWith An operator that includes events that match the first few characters of
       * the event record field specified as the value of `Field` .
       */
      override fun startsWith(vararg startsWith: String): Unit = startsWith(startsWith.toList())

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty,
    ) : CdkObject(cdkObject),
        AdvancedFieldSelectorProperty {
      /**
       * An operator that includes events that match the last few characters of the event record
       * field specified as the value of `Field` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-endswith)
       */
      override fun endsWith(): List<String> = unwrap(this).getEndsWith() ?: emptyList()

      /**
       * An operator that includes events that match the exact value of the event record field
       * specified as the value of `Field` .
       *
       * This is the only valid operator that you can use with the `readOnly` , `eventCategory` ,
       * and `resources.type` fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-equals)
       */
      override fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

      /**
       * A field in a CloudTrail event record on which to filter events to be logged.
       *
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the field is used only for selecting events as
       * filtering is not supported.
       *
       * For CloudTrail management events, supported fields include `eventCategory` (required),
       * `eventSource` , and `readOnly` . The following additional fields are available for event data
       * stores: `eventName` , `eventType` , `sessionCredentialFromConsole` , and `userIdentity.arn` .
       *
       * For CloudTrail data events, supported fields include `eventCategory` (required),
       * `eventName` , `eventSource` , `eventType` , `resources.type` (required), `readOnly` ,
       * `resources.ARN` , `sessionCredentialFromConsole` , and `userIdentity.arn` .
       *
       * For CloudTrail network activity events, supported fields include `eventCategory`
       * (required), `eventSource` (required), `eventName` , `errorCode` , and `vpcEndpointId` .
       *
       * For event data stores for CloudTrail Insights events, AWS Config configuration items, Audit
       * Manager evidence, or events outside of AWS , the only supported field is `eventCategory` .
       *
       *
       * Selectors don't support the use of wildcards like `*` . To match multiple values with a
       * single condition, you may use `StartsWith` , `EndsWith` , `NotStartsWith` , or `NotEndsWith`
       * to explicitly match the beginning or end of the event field.
       *
       *
       * * *`readOnly`* - This is an optional field that is only used for management events and data
       * events. This field can be set to `Equals` with a value of `true` or `false` . If you do not
       * add this field, CloudTrail logs both `read` and `write` events. A value of `true` logs only
       * `read` events. A value of `false` logs only `write` events.
       * * *`eventSource`* - This field is only used for management events, data events, and network
       * activity events.
       *
       * For management events for trails, this is an optional field that can be set to `NotEquals`
       * `kms.amazonaws.com` to exclude KMS management events, or `NotEquals` `rdsdata.amazonaws.com`
       * to exclude RDS management events.
       *
       * For data events for trails, this is an optional field that you can use to include or
       * exclude any event source and can use any operator.
       *
       * For management and data events for event data stores, this is an optional field that you
       * can use to include or exclude any event source and can use any operator.
       *
       * For network activity events, this is a required field that only uses the `Equals` operator.
       * Set this field to the event source for which you want to log network activity events. If you
       * want to log network activity events for multiple event sources, you must create a separate
       * field selector for each event source. For a list of services supporting network activity
       * events, see [Logging network activity
       * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-network-events-with-cloudtrail.html)
       * in the *AWS CloudTrail User Guide* .
       *
       * * *`eventName`* - This is an optional field that is only used for data events, management
       * events (for event data stores only), and network activity events. You can use any operator
       * with `eventName` . You can use it to ﬁlter in or ﬁlter out specific events. You can have
       * multiple values for this ﬁeld, separated by commas.
       * * *`eventCategory`* - This field is required and must be set to `Equals` .
       * * For CloudTrail management events, the value must be `Management` .
       * * For CloudTrail data events, the value must be `Data` .
       * * For CloudTrail network activity events, the value must be `NetworkActivity` .
       *
       * The following are used only for event data stores:
       *
       * * For CloudTrail Insights events, the value must be `Insight` .
       * * For AWS Config configuration items, the value must be `ConfigurationItem` .
       * * For Audit Manager evidence, the value must be `Evidence` .
       * * For events outside of AWS , the value must be `ActivityAuditLog` .
       * * *`eventType`* - For event data stores, this is an optional field available for event data
       * stores to filter management and data events on the event type. For trails, this is an optional
       * field to filter data events on the event type. For information about available event types,
       * see [CloudTrail record
       * contents](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-event-reference-record-contents.html#ct-event-type)
       * in the *AWS CloudTrail user guide* .
       * * *`errorCode`* - This ﬁeld is only used to filter CloudTrail network activity events and
       * is optional. This is the error code to filter on. Currently, the only valid `errorCode` is
       * `VpceAccessDenied` . `errorCode` can only use the `Equals` operator.
       * * *`sessionCredentialFromConsole`* - For event data stores, this is an optional field used
       * to filter management and data events based on whether the events originated from an AWS
       * Management Console session. For trails, this is an optional field used to filter data events.
       * `sessionCredentialFromConsole` can only use the `Equals` and `NotEquals` operators.
       * * *`resources.type`* - This ﬁeld is required for CloudTrail data events. `resources.type`
       * can only use the `Equals` operator.
       *
       * For a list of available resource types for data events, see [Data
       * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#logging-data-events)
       * in the *AWS CloudTrail User Guide* .
       *
       * You can have only one `resources.type` ﬁeld per selector. To log events on more than one
       * resource type, add another selector.
       *
       * * *`resources.ARN`* - The `resources.ARN` is an optional field for data events. You can use
       * any operator with `resources.ARN` , but if you use `Equals` or `NotEquals` , the value must
       * exactly match the ARN of a valid resource of the type you've speciﬁed in the template as the
       * value of resources.type. To log all data events for all objects in a specific S3 bucket, use
       * the `StartsWith` operator, and include only the bucket ARN as the matching value.
       *
       * For more information about the ARN formats of data event resources, see [Actions,
       * resources, and condition keys for AWS
       * services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
       * in the *Service Authorization Reference* .
       *
       *
       * You can't use the `resources.ARN` field to filter resource types that do not have ARNs.
       *
       *
       * * *`userIdentity.arn`* - For event data stores, this is an optional field used to filter
       * management and data events for actions taken by specific IAM identities. For trails, this is
       * an optional field used to filter data events. You can use any operator with `userIdentity.arn`
       * . For more information on the userIdentity element, see [CloudTrail userIdentity
       * element](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-event-reference-user-identity.html)
       * in the *AWS CloudTrail User Guide* .
       * * *`vpcEndpointId`* - This ﬁeld is only used to filter CloudTrail network activity events
       * and is optional. This field identifies the VPC endpoint that the request passed through. You
       * can use any operator with `vpcEndpointId` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-field)
       */
      override fun `field`(): String = unwrap(this).getField()

      /**
       * An operator that excludes events that match the last few characters of the event record
       * field specified as the value of `Field` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-notendswith)
       */
      override fun notEndsWith(): List<String> = unwrap(this).getNotEndsWith() ?: emptyList()

      /**
       * An operator that excludes events that match the exact value of the event record field
       * specified as the value of `Field` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-notequals)
       */
      override fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()

      /**
       * An operator that excludes events that match the first few characters of the event record
       * field specified as the value of `Field` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-notstartswith)
       */
      override fun notStartsWith(): List<String> = unwrap(this).getNotStartsWith() ?: emptyList()

      /**
       * An operator that includes events that match the first few characters of the event record
       * field specified as the value of `Field` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-advancedfieldselector.html#cfn-cloudtrail-eventdatastore-advancedfieldselector-startswith)
       */
      override fun startsWith(): List<String> = unwrap(this).getStartsWith() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedFieldSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty):
          AdvancedFieldSelectorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdvancedFieldSelectorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedFieldSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty
    }
  }

  /**
   * An object that contains information types to be included in CloudTrail enriched events.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * ContextKeySelectorProperty contextKeySelectorProperty = ContextKeySelectorProperty.builder()
   * .equalTo(List.of("equalTo"))
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-contextkeyselector.html)
   */
  public interface ContextKeySelectorProperty {
    /**
     * A list of keys defined by Type to be included in CloudTrail enriched events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-contextkeyselector.html#cfn-cloudtrail-eventdatastore-contextkeyselector-equals)
     */
    public fun equalTo(): List<String>

    /**
     * Specifies the type of the event record field in ContextKeySelector.
     *
     * Valid values include RequestContext, TagContext.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-contextkeyselector.html#cfn-cloudtrail-eventdatastore-contextkeyselector-type)
     */
    public fun type(): String

    /**
     * A builder for [ContextKeySelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param equalTo A list of keys defined by Type to be included in CloudTrail enriched events.
       * 
       */
      public fun equalTo(equalTo: List<String>)

      /**
       * @param equalTo A list of keys defined by Type to be included in CloudTrail enriched events.
       * 
       */
      public fun equalTo(vararg equalTo: String)

      /**
       * @param type Specifies the type of the event record field in ContextKeySelector. 
       * Valid values include RequestContext, TagContext.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.ContextKeySelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.ContextKeySelectorProperty.builder()

      /**
       * @param equalTo A list of keys defined by Type to be included in CloudTrail enriched events.
       * 
       */
      override fun equalTo(equalTo: List<String>) {
        cdkBuilder.equalTo(equalTo)
      }

      /**
       * @param equalTo A list of keys defined by Type to be included in CloudTrail enriched events.
       * 
       */
      override fun equalTo(vararg equalTo: String): Unit = equalTo(equalTo.toList())

      /**
       * @param type Specifies the type of the event record field in ContextKeySelector. 
       * Valid values include RequestContext, TagContext.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.ContextKeySelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.ContextKeySelectorProperty,
    ) : CdkObject(cdkObject),
        ContextKeySelectorProperty {
      /**
       * A list of keys defined by Type to be included in CloudTrail enriched events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-contextkeyselector.html#cfn-cloudtrail-eventdatastore-contextkeyselector-equals)
       */
      override fun equalTo(): List<String> = unwrap(this).getEqualTo()

      /**
       * Specifies the type of the event record field in ContextKeySelector.
       *
       * Valid values include RequestContext, TagContext.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-contextkeyselector.html#cfn-cloudtrail-eventdatastore-contextkeyselector-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContextKeySelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.ContextKeySelectorProperty):
          ContextKeySelectorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContextKeySelectorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContextKeySelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.ContextKeySelectorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.ContextKeySelectorProperty
    }
  }

  /**
   * A JSON string that contains a list of Insights types that are logged on an event data store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * InsightSelectorProperty insightSelectorProperty = InsightSelectorProperty.builder()
   * .insightType("insightType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-insightselector.html)
   */
  public interface InsightSelectorProperty {
    /**
     * The type of Insights events to log on an event data store. `ApiCallRateInsight` and
     * `ApiErrorRateInsight` are valid Insight types.
     *
     * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     * aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-insightselector.html#cfn-cloudtrail-eventdatastore-insightselector-insighttype)
     */
    public fun insightType(): String? = unwrap(this).getInsightType()

    /**
     * A builder for [InsightSelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param insightType The type of Insights events to log on an event data store.
       * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
       * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
       * aggregated per minute against a baseline API call volume.
       *
       * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
       * codes. The error is shown if the API call is unsuccessful.
       */
      public fun insightType(insightType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty.builder()

      /**
       * @param insightType The type of Insights events to log on an event data store.
       * `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types.
       * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
       * aggregated per minute against a baseline API call volume.
       *
       * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
       * codes. The error is shown if the API call is unsuccessful.
       */
      override fun insightType(insightType: String) {
        cdkBuilder.insightType(insightType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty,
    ) : CdkObject(cdkObject),
        InsightSelectorProperty {
      /**
       * The type of Insights events to log on an event data store. `ApiCallRateInsight` and
       * `ApiErrorRateInsight` are valid Insight types.
       *
       * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
       * aggregated per minute against a baseline API call volume.
       *
       * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
       * codes. The error is shown if the API call is unsuccessful.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-insightselector.html#cfn-cloudtrail-eventdatastore-insightselector-insighttype)
       */
      override fun insightType(): String? = unwrap(this).getInsightType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InsightSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty):
          InsightSelectorProperty = CdkObjectWrappers.wrap(cdkObject) as? InsightSelectorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InsightSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty
    }
  }
}
