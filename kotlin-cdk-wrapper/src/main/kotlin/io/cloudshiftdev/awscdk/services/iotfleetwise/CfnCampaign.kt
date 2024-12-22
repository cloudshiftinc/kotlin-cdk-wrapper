@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an orchestration of data collection rules.
 *
 * The AWS IoT FleetWise Edge Agent software running in vehicles uses campaigns to decide how to
 * collect and transfer data to the cloud. You create campaigns in the cloud. After you or your team
 * approve campaigns, AWS IoT FleetWise automatically deploys them to vehicles.
 *
 * For more information, see
 * [Campaigns](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/campaigns.html) in the
 * *AWS IoT FleetWise Developer Guide* .
 *
 *
 * Access to certain AWS IoT FleetWise features is currently gated. For more information, see [AWS
 * Region and feature
 * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
 * in the *AWS IoT FleetWise Developer Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * CfnCampaign cfnCampaign = CfnCampaign.Builder.create(this, "MyCfnCampaign")
 * .collectionScheme(CollectionSchemeProperty.builder()
 * .conditionBasedCollectionScheme(ConditionBasedCollectionSchemeProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .conditionLanguageVersion(123)
 * .minimumTriggerIntervalMs(123)
 * .triggerMode("triggerMode")
 * .build())
 * .timeBasedCollectionScheme(TimeBasedCollectionSchemeProperty.builder()
 * .periodMs(123)
 * .build())
 * .build())
 * .name("name")
 * .signalCatalogArn("signalCatalogArn")
 * .targetArn("targetArn")
 * // the properties below are optional
 * .action("action")
 * .compression("compression")
 * .dataDestinationConfigs(List.of(DataDestinationConfigProperty.builder()
 * .mqttTopicConfig(MqttTopicConfigProperty.builder()
 * .executionRoleArn("executionRoleArn")
 * .mqttTopicArn("mqttTopicArn")
 * .build())
 * .s3Config(S3ConfigProperty.builder()
 * .bucketArn("bucketArn")
 * // the properties below are optional
 * .dataFormat("dataFormat")
 * .prefix("prefix")
 * .storageCompressionFormat("storageCompressionFormat")
 * .build())
 * .timestreamConfig(TimestreamConfigProperty.builder()
 * .executionRoleArn("executionRoleArn")
 * .timestreamTableArn("timestreamTableArn")
 * .build())
 * .build()))
 * .dataExtraDimensions(List.of("dataExtraDimensions"))
 * .dataPartitions(List.of(DataPartitionProperty.builder()
 * .id("id")
 * .storageOptions(DataPartitionStorageOptionsProperty.builder()
 * .maximumSize(StorageMaximumSizeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .minimumTimeToLive(StorageMinimumTimeToLiveProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .storageLocation("storageLocation")
 * .build())
 * // the properties below are optional
 * .uploadOptions(DataPartitionUploadOptionsProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .conditionLanguageVersion(123)
 * .build())
 * .build()))
 * .description("description")
 * .diagnosticsMode("diagnosticsMode")
 * .expiryTime("expiryTime")
 * .postTriggerCollectionDuration(123)
 * .priority(123)
 * .signalsToCollect(List.of(SignalInformationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .dataPartitionId("dataPartitionId")
 * .maxSampleCount(123)
 * .minimumSamplingIntervalMs(123)
 * .build()))
 * .signalsToFetch(List.of(SignalFetchInformationProperty.builder()
 * .actions(List.of("actions"))
 * .fullyQualifiedName("fullyQualifiedName")
 * .signalFetchConfig(SignalFetchConfigProperty.builder()
 * .conditionBased(ConditionBasedSignalFetchConfigProperty.builder()
 * .conditionExpression("conditionExpression")
 * .triggerMode("triggerMode")
 * .build())
 * .timeBased(TimeBasedSignalFetchConfigProperty.builder()
 * .executionFrequencyMs(123)
 * .build())
 * .build())
 * // the properties below are optional
 * .conditionLanguageVersion(123)
 * .build()))
 * .spoolingMode("spoolingMode")
 * .startTime("startTime")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html)
 */
public open class CfnCampaign(
  cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCampaignProps,
  ) :
      this(software.amazon.awscdk.services.iotfleetwise.CfnCampaign(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCampaignProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCampaignProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCampaignProps(props)
  )

  /**
   * Specifies how to update a campaign.
   *
   * The action can be one of the following:.
   */
  public open fun action(): String? = unwrap(this).getAction()

  /**
   * Specifies how to update a campaign.
   *
   * The action can be one of the following:.
   */
  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the campaign.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the campaign was created in seconds since epoch (January 1, 1970 at midnight UTC
   * time).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The last time the campaign was modified.
   */
  public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

  /**
   * The state of the campaign.
   *
   * The status can be one of: `CREATING` , `WAITING_FOR_APPROVAL` , `RUNNING` , and `SUSPENDED` .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The data collection scheme associated with the campaign.
   */
  public open fun collectionScheme(): Any = unwrap(this).getCollectionScheme()

  /**
   * The data collection scheme associated with the campaign.
   */
  public open fun collectionScheme(`value`: IResolvable) {
    unwrap(this).setCollectionScheme(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The data collection scheme associated with the campaign.
   */
  public open fun collectionScheme(`value`: CollectionSchemeProperty) {
    unwrap(this).setCollectionScheme(`value`.let(CollectionSchemeProperty.Companion::unwrap))
  }

  /**
   * The data collection scheme associated with the campaign.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe7179166329cb94f995f1cfded061bed66608388e53c06cfa9ec3f60eef345b")
  public open fun collectionScheme(`value`: CollectionSchemeProperty.Builder.() -> Unit): Unit =
      collectionScheme(CollectionSchemeProperty(`value`))

  /**
   * Whether to compress signals before transmitting data to AWS IoT FleetWise .
   */
  public open fun compression(): String? = unwrap(this).getCompression()

  /**
   * Whether to compress signals before transmitting data to AWS IoT FleetWise .
   */
  public open fun compression(`value`: String) {
    unwrap(this).setCompression(`value`)
  }

  /**
   * The destination where the campaign sends data.
   */
  public open fun dataDestinationConfigs(): Any? = unwrap(this).getDataDestinationConfigs()

  /**
   * The destination where the campaign sends data.
   */
  public open fun dataDestinationConfigs(`value`: IResolvable) {
    unwrap(this).setDataDestinationConfigs(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The destination where the campaign sends data.
   */
  public open fun dataDestinationConfigs(`value`: List<Any>) {
    unwrap(this).setDataDestinationConfigs(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The destination where the campaign sends data.
   */
  public open fun dataDestinationConfigs(vararg `value`: Any): Unit =
      dataDestinationConfigs(`value`.toList())

  /**
   * A list of vehicle attributes to associate with a campaign.
   */
  public open fun dataExtraDimensions(): List<String> = unwrap(this).getDataExtraDimensions() ?:
      emptyList()

  /**
   * A list of vehicle attributes to associate with a campaign.
   */
  public open fun dataExtraDimensions(`value`: List<String>) {
    unwrap(this).setDataExtraDimensions(`value`)
  }

  /**
   * A list of vehicle attributes to associate with a campaign.
   */
  public open fun dataExtraDimensions(vararg `value`: String): Unit =
      dataExtraDimensions(`value`.toList())

  /**
   * The data partitions associated with the signals collected from the vehicle.
   */
  public open fun dataPartitions(): Any? = unwrap(this).getDataPartitions()

  /**
   * The data partitions associated with the signals collected from the vehicle.
   */
  public open fun dataPartitions(`value`: IResolvable) {
    unwrap(this).setDataPartitions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The data partitions associated with the signals collected from the vehicle.
   */
  public open fun dataPartitions(`value`: List<Any>) {
    unwrap(this).setDataPartitions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The data partitions associated with the signals collected from the vehicle.
   */
  public open fun dataPartitions(vararg `value`: Any): Unit = dataPartitions(`value`.toList())

  /**
   * The description of the campaign.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the campaign.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Option for a vehicle to send diagnostic trouble codes to AWS IoT FleetWise .
   */
  public open fun diagnosticsMode(): String? = unwrap(this).getDiagnosticsMode()

  /**
   * Option for a vehicle to send diagnostic trouble codes to AWS IoT FleetWise .
   */
  public open fun diagnosticsMode(`value`: String) {
    unwrap(this).setDiagnosticsMode(`value`)
  }

  /**
   * The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time).
   */
  public open fun expiryTime(): String? = unwrap(this).getExpiryTime()

  /**
   * The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time).
   */
  public open fun expiryTime(`value`: String) {
    unwrap(this).setExpiryTime(`value`)
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
   * The name of a campaign.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of a campaign.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * How long (in milliseconds) to collect raw data after a triggering event initiates the
   * collection.
   */
  public open fun postTriggerCollectionDuration(): Number? =
      unwrap(this).getPostTriggerCollectionDuration()

  /**
   * How long (in milliseconds) to collect raw data after a triggering event initiates the
   * collection.
   */
  public open fun postTriggerCollectionDuration(`value`: Number) {
    unwrap(this).setPostTriggerCollectionDuration(`value`)
  }

  /**
   * A number indicating the priority of one campaign over another campaign for a certain vehicle or
   * fleet.
   */
  public open fun priority(): Number? = unwrap(this).getPriority()

  /**
   * A number indicating the priority of one campaign over another campaign for a certain vehicle or
   * fleet.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the signal catalog associated with the campaign.
   */
  public open fun signalCatalogArn(): String = unwrap(this).getSignalCatalogArn()

  /**
   * The Amazon Resource Name (ARN) of the signal catalog associated with the campaign.
   */
  public open fun signalCatalogArn(`value`: String) {
    unwrap(this).setSignalCatalogArn(`value`)
  }

  /**
   * A list of information about signals to collect.
   */
  public open fun signalsToCollect(): Any? = unwrap(this).getSignalsToCollect()

  /**
   * A list of information about signals to collect.
   */
  public open fun signalsToCollect(`value`: IResolvable) {
    unwrap(this).setSignalsToCollect(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of information about signals to collect.
   */
  public open fun signalsToCollect(`value`: List<Any>) {
    unwrap(this).setSignalsToCollect(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of information about signals to collect.
   */
  public open fun signalsToCollect(vararg `value`: Any): Unit = signalsToCollect(`value`.toList())

  /**
   * A list of information about signals to fetch.
   */
  public open fun signalsToFetch(): Any? = unwrap(this).getSignalsToFetch()

  /**
   * A list of information about signals to fetch.
   */
  public open fun signalsToFetch(`value`: IResolvable) {
    unwrap(this).setSignalsToFetch(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of information about signals to fetch.
   */
  public open fun signalsToFetch(`value`: List<Any>) {
    unwrap(this).setSignalsToFetch(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of information about signals to fetch.
   */
  public open fun signalsToFetch(vararg `value`: Any): Unit = signalsToFetch(`value`.toList())

  /**
   * Whether to store collected data after a vehicle lost a connection with the cloud.
   */
  public open fun spoolingMode(): String? = unwrap(this).getSpoolingMode()

  /**
   * Whether to store collected data after a vehicle lost a connection with the cloud.
   */
  public open fun spoolingMode(`value`: String) {
    unwrap(this).setSpoolingMode(`value`)
  }

  /**
   * The time, in milliseconds, to deliver a campaign after it was approved.
   *
   * If it's not specified, `0` is used.
   */
  public open fun startTime(): String? = unwrap(this).getStartTime()

  /**
   * The time, in milliseconds, to deliver a campaign after it was approved.
   *
   * If it's not specified, `0` is used.
   */
  public open fun startTime(`value`: String) {
    unwrap(this).setStartTime(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that can be used to manage the campaign.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that can be used to manage the campaign.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata that can be used to manage the campaign.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign is deployed.
   */
  public open fun targetArn(): String = unwrap(this).getTargetArn()

  /**
   * The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign is deployed.
   */
  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotfleetwise.CfnCampaign].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies how to update a campaign. The action can be one of the following:.
     *
     * * `APPROVE` - To approve delivering a data collection scheme to vehicles.
     * * `SUSPEND` - To suspend collecting signal data. The campaign is deleted from vehicles and
     * all vehicles in the suspended campaign will stop sending data.
     * * `RESUME` - To reactivate the `SUSPEND` campaign. The campaign is redeployed to all vehicles
     * and the vehicles will resume sending data.
     * * `UPDATE` - To update a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-action)
     * @param action Specifies how to update a campaign. The action can be one of the following:. 
     */
    public fun action(action: String)

    /**
     * The data collection scheme associated with the campaign.
     *
     * You can specify a scheme that collects data based on time or an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-collectionscheme)
     * @param collectionScheme The data collection scheme associated with the campaign. 
     */
    public fun collectionScheme(collectionScheme: IResolvable)

    /**
     * The data collection scheme associated with the campaign.
     *
     * You can specify a scheme that collects data based on time or an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-collectionscheme)
     * @param collectionScheme The data collection scheme associated with the campaign. 
     */
    public fun collectionScheme(collectionScheme: CollectionSchemeProperty)

    /**
     * The data collection scheme associated with the campaign.
     *
     * You can specify a scheme that collects data based on time or an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-collectionscheme)
     * @param collectionScheme The data collection scheme associated with the campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23e874d3a7fb59a1ad9dd2e35c421f8957a6099da01feca6c7bd8d5039ddd67d")
    public fun collectionScheme(collectionScheme: CollectionSchemeProperty.Builder.() -> Unit)

    /**
     * Whether to compress signals before transmitting data to AWS IoT FleetWise .
     *
     * If you don't want to compress the signals, use `OFF` . If it's not specified, `SNAPPY` is
     * used.
     *
     * Default: `SNAPPY`
     *
     * Default: - "OFF"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-compression)
     * @param compression Whether to compress signals before transmitting data to AWS IoT FleetWise
     * . 
     */
    public fun compression(compression: String)

    /**
     * The destination where the campaign sends data.
     *
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datadestinationconfigs)
     * @param dataDestinationConfigs The destination where the campaign sends data. 
     */
    public fun dataDestinationConfigs(dataDestinationConfigs: IResolvable)

    /**
     * The destination where the campaign sends data.
     *
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datadestinationconfigs)
     * @param dataDestinationConfigs The destination where the campaign sends data. 
     */
    public fun dataDestinationConfigs(dataDestinationConfigs: List<Any>)

    /**
     * The destination where the campaign sends data.
     *
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datadestinationconfigs)
     * @param dataDestinationConfigs The destination where the campaign sends data. 
     */
    public fun dataDestinationConfigs(vararg dataDestinationConfigs: Any)

    /**
     * A list of vehicle attributes to associate with a campaign.
     *
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-dataextradimensions)
     * @param dataExtraDimensions A list of vehicle attributes to associate with a campaign. 
     */
    public fun dataExtraDimensions(dataExtraDimensions: List<String>)

    /**
     * A list of vehicle attributes to associate with a campaign.
     *
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-dataextradimensions)
     * @param dataExtraDimensions A list of vehicle attributes to associate with a campaign. 
     */
    public fun dataExtraDimensions(vararg dataExtraDimensions: String)

    /**
     * The data partitions associated with the signals collected from the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datapartitions)
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle. 
     */
    public fun dataPartitions(dataPartitions: IResolvable)

    /**
     * The data partitions associated with the signals collected from the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datapartitions)
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle. 
     */
    public fun dataPartitions(dataPartitions: List<Any>)

    /**
     * The data partitions associated with the signals collected from the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datapartitions)
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle. 
     */
    public fun dataPartitions(vararg dataPartitions: Any)

    /**
     * The description of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-description)
     * @param description The description of the campaign. 
     */
    public fun description(description: String)

    /**
     * Option for a vehicle to send diagnostic trouble codes to AWS IoT FleetWise .
     *
     * If you want to send diagnostic trouble codes, use `SEND_ACTIVE_DTCS` . If it's not specified,
     * `OFF` is used.
     *
     * Default: `OFF`
     *
     * Default: - "OFF"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-diagnosticsmode)
     * @param diagnosticsMode Option for a vehicle to send diagnostic trouble codes to AWS IoT
     * FleetWise . 
     */
    public fun diagnosticsMode(diagnosticsMode: String)

    /**
     * The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time).
     *
     * Vehicle data isn't collected after the campaign expires.
     *
     * Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     *
     * Default: - "253402214400"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-expirytime)
     * @param expiryTime The time the campaign expires, in seconds since epoch (January 1, 1970 at
     * midnight UTC time). 
     */
    public fun expiryTime(expiryTime: String)

    /**
     * The name of a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-name)
     * @param name The name of a campaign. 
     */
    public fun name(name: String)

    /**
     * How long (in milliseconds) to collect raw data after a triggering event initiates the
     * collection.
     *
     * If it's not specified, `0` is used.
     *
     * Default: `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-posttriggercollectionduration)
     * @param postTriggerCollectionDuration How long (in milliseconds) to collect raw data after a
     * triggering event initiates the collection. 
     */
    public fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number)

    /**
     * A number indicating the priority of one campaign over another campaign for a certain vehicle
     * or fleet.
     *
     * A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's
     * not specified, `0` is used.
     *
     * Default: `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-priority)
     * @param priority A number indicating the priority of one campaign over another campaign for a
     * certain vehicle or fleet. 
     */
    public fun priority(priority: Number)

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalcatalogarn)
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the campaign. 
     */
    public fun signalCatalogArn(signalCatalogArn: String)

    /**
     * A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect A list of information about signals to collect. 
     */
    public fun signalsToCollect(signalsToCollect: IResolvable)

    /**
     * A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect A list of information about signals to collect. 
     */
    public fun signalsToCollect(signalsToCollect: List<Any>)

    /**
     * A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect A list of information about signals to collect. 
     */
    public fun signalsToCollect(vararg signalsToCollect: Any)

    /**
     * A list of information about signals to fetch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstofetch)
     * @param signalsToFetch A list of information about signals to fetch. 
     */
    public fun signalsToFetch(signalsToFetch: IResolvable)

    /**
     * A list of information about signals to fetch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstofetch)
     * @param signalsToFetch A list of information about signals to fetch. 
     */
    public fun signalsToFetch(signalsToFetch: List<Any>)

    /**
     * A list of information about signals to fetch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstofetch)
     * @param signalsToFetch A list of information about signals to fetch. 
     */
    public fun signalsToFetch(vararg signalsToFetch: Any)

    /**
     * Whether to store collected data after a vehicle lost a connection with the cloud.
     *
     * After a connection is re-established, the data is automatically forwarded to AWS IoT
     * FleetWise . If you want to store collected data when a vehicle loses connection with the cloud,
     * use `TO_DISK` . If it's not specified, `OFF` is used.
     *
     * Default: `OFF`
     *
     * Default: - "OFF"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-spoolingmode)
     * @param spoolingMode Whether to store collected data after a vehicle lost a connection with
     * the cloud. 
     */
    public fun spoolingMode(spoolingMode: String)

    /**
     * The time, in milliseconds, to deliver a campaign after it was approved. If it's not
     * specified, `0` is used.
     *
     * Default: `0`
     *
     * Default: - "0"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-starttime)
     * @param startTime The time, in milliseconds, to deliver a campaign after it was approved. If
     * it's not specified, `0` is used. 
     */
    public fun startTime(startTime: String)

    /**
     * Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     * @param tags Metadata that can be used to manage the campaign. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     * @param tags Metadata that can be used to manage the campaign. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign is deployed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-targetarn)
     * @param targetArn The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign
     * is deployed. 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnCampaign.Builder.create(scope, id)

    /**
     * Specifies how to update a campaign. The action can be one of the following:.
     *
     * * `APPROVE` - To approve delivering a data collection scheme to vehicles.
     * * `SUSPEND` - To suspend collecting signal data. The campaign is deleted from vehicles and
     * all vehicles in the suspended campaign will stop sending data.
     * * `RESUME` - To reactivate the `SUSPEND` campaign. The campaign is redeployed to all vehicles
     * and the vehicles will resume sending data.
     * * `UPDATE` - To update a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-action)
     * @param action Specifies how to update a campaign. The action can be one of the following:. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * The data collection scheme associated with the campaign.
     *
     * You can specify a scheme that collects data based on time or an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-collectionscheme)
     * @param collectionScheme The data collection scheme associated with the campaign. 
     */
    override fun collectionScheme(collectionScheme: IResolvable) {
      cdkBuilder.collectionScheme(collectionScheme.let(IResolvable.Companion::unwrap))
    }

    /**
     * The data collection scheme associated with the campaign.
     *
     * You can specify a scheme that collects data based on time or an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-collectionscheme)
     * @param collectionScheme The data collection scheme associated with the campaign. 
     */
    override fun collectionScheme(collectionScheme: CollectionSchemeProperty) {
      cdkBuilder.collectionScheme(collectionScheme.let(CollectionSchemeProperty.Companion::unwrap))
    }

    /**
     * The data collection scheme associated with the campaign.
     *
     * You can specify a scheme that collects data based on time or an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-collectionscheme)
     * @param collectionScheme The data collection scheme associated with the campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23e874d3a7fb59a1ad9dd2e35c421f8957a6099da01feca6c7bd8d5039ddd67d")
    override fun collectionScheme(collectionScheme: CollectionSchemeProperty.Builder.() -> Unit):
        Unit = collectionScheme(CollectionSchemeProperty(collectionScheme))

    /**
     * Whether to compress signals before transmitting data to AWS IoT FleetWise .
     *
     * If you don't want to compress the signals, use `OFF` . If it's not specified, `SNAPPY` is
     * used.
     *
     * Default: `SNAPPY`
     *
     * Default: - "OFF"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-compression)
     * @param compression Whether to compress signals before transmitting data to AWS IoT FleetWise
     * . 
     */
    override fun compression(compression: String) {
      cdkBuilder.compression(compression)
    }

    /**
     * The destination where the campaign sends data.
     *
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datadestinationconfigs)
     * @param dataDestinationConfigs The destination where the campaign sends data. 
     */
    override fun dataDestinationConfigs(dataDestinationConfigs: IResolvable) {
      cdkBuilder.dataDestinationConfigs(dataDestinationConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * The destination where the campaign sends data.
     *
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datadestinationconfigs)
     * @param dataDestinationConfigs The destination where the campaign sends data. 
     */
    override fun dataDestinationConfigs(dataDestinationConfigs: List<Any>) {
      cdkBuilder.dataDestinationConfigs(dataDestinationConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The destination where the campaign sends data.
     *
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datadestinationconfigs)
     * @param dataDestinationConfigs The destination where the campaign sends data. 
     */
    override fun dataDestinationConfigs(vararg dataDestinationConfigs: Any): Unit =
        dataDestinationConfigs(dataDestinationConfigs.toList())

    /**
     * A list of vehicle attributes to associate with a campaign.
     *
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-dataextradimensions)
     * @param dataExtraDimensions A list of vehicle attributes to associate with a campaign. 
     */
    override fun dataExtraDimensions(dataExtraDimensions: List<String>) {
      cdkBuilder.dataExtraDimensions(dataExtraDimensions)
    }

    /**
     * A list of vehicle attributes to associate with a campaign.
     *
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-dataextradimensions)
     * @param dataExtraDimensions A list of vehicle attributes to associate with a campaign. 
     */
    override fun dataExtraDimensions(vararg dataExtraDimensions: String): Unit =
        dataExtraDimensions(dataExtraDimensions.toList())

    /**
     * The data partitions associated with the signals collected from the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datapartitions)
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle. 
     */
    override fun dataPartitions(dataPartitions: IResolvable) {
      cdkBuilder.dataPartitions(dataPartitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The data partitions associated with the signals collected from the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datapartitions)
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle. 
     */
    override fun dataPartitions(dataPartitions: List<Any>) {
      cdkBuilder.dataPartitions(dataPartitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The data partitions associated with the signals collected from the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datapartitions)
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle. 
     */
    override fun dataPartitions(vararg dataPartitions: Any): Unit =
        dataPartitions(dataPartitions.toList())

    /**
     * The description of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-description)
     * @param description The description of the campaign. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Option for a vehicle to send diagnostic trouble codes to AWS IoT FleetWise .
     *
     * If you want to send diagnostic trouble codes, use `SEND_ACTIVE_DTCS` . If it's not specified,
     * `OFF` is used.
     *
     * Default: `OFF`
     *
     * Default: - "OFF"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-diagnosticsmode)
     * @param diagnosticsMode Option for a vehicle to send diagnostic trouble codes to AWS IoT
     * FleetWise . 
     */
    override fun diagnosticsMode(diagnosticsMode: String) {
      cdkBuilder.diagnosticsMode(diagnosticsMode)
    }

    /**
     * The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time).
     *
     * Vehicle data isn't collected after the campaign expires.
     *
     * Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     *
     * Default: - "253402214400"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-expirytime)
     * @param expiryTime The time the campaign expires, in seconds since epoch (January 1, 1970 at
     * midnight UTC time). 
     */
    override fun expiryTime(expiryTime: String) {
      cdkBuilder.expiryTime(expiryTime)
    }

    /**
     * The name of a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-name)
     * @param name The name of a campaign. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * How long (in milliseconds) to collect raw data after a triggering event initiates the
     * collection.
     *
     * If it's not specified, `0` is used.
     *
     * Default: `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-posttriggercollectionduration)
     * @param postTriggerCollectionDuration How long (in milliseconds) to collect raw data after a
     * triggering event initiates the collection. 
     */
    override fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number) {
      cdkBuilder.postTriggerCollectionDuration(postTriggerCollectionDuration)
    }

    /**
     * A number indicating the priority of one campaign over another campaign for a certain vehicle
     * or fleet.
     *
     * A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's
     * not specified, `0` is used.
     *
     * Default: `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-priority)
     * @param priority A number indicating the priority of one campaign over another campaign for a
     * certain vehicle or fleet. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalcatalogarn)
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the campaign. 
     */
    override fun signalCatalogArn(signalCatalogArn: String) {
      cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect A list of information about signals to collect. 
     */
    override fun signalsToCollect(signalsToCollect: IResolvable) {
      cdkBuilder.signalsToCollect(signalsToCollect.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect A list of information about signals to collect. 
     */
    override fun signalsToCollect(signalsToCollect: List<Any>) {
      cdkBuilder.signalsToCollect(signalsToCollect.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect A list of information about signals to collect. 
     */
    override fun signalsToCollect(vararg signalsToCollect: Any): Unit =
        signalsToCollect(signalsToCollect.toList())

    /**
     * A list of information about signals to fetch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstofetch)
     * @param signalsToFetch A list of information about signals to fetch. 
     */
    override fun signalsToFetch(signalsToFetch: IResolvable) {
      cdkBuilder.signalsToFetch(signalsToFetch.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of information about signals to fetch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstofetch)
     * @param signalsToFetch A list of information about signals to fetch. 
     */
    override fun signalsToFetch(signalsToFetch: List<Any>) {
      cdkBuilder.signalsToFetch(signalsToFetch.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of information about signals to fetch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstofetch)
     * @param signalsToFetch A list of information about signals to fetch. 
     */
    override fun signalsToFetch(vararg signalsToFetch: Any): Unit =
        signalsToFetch(signalsToFetch.toList())

    /**
     * Whether to store collected data after a vehicle lost a connection with the cloud.
     *
     * After a connection is re-established, the data is automatically forwarded to AWS IoT
     * FleetWise . If you want to store collected data when a vehicle loses connection with the cloud,
     * use `TO_DISK` . If it's not specified, `OFF` is used.
     *
     * Default: `OFF`
     *
     * Default: - "OFF"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-spoolingmode)
     * @param spoolingMode Whether to store collected data after a vehicle lost a connection with
     * the cloud. 
     */
    override fun spoolingMode(spoolingMode: String) {
      cdkBuilder.spoolingMode(spoolingMode)
    }

    /**
     * The time, in milliseconds, to deliver a campaign after it was approved. If it's not
     * specified, `0` is used.
     *
     * Default: `0`
     *
     * Default: - "0"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-starttime)
     * @param startTime The time, in milliseconds, to deliver a campaign after it was approved. If
     * it's not specified, `0` is used. 
     */
    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     * @param tags Metadata that can be used to manage the campaign. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     * @param tags Metadata that can be used to manage the campaign. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign is deployed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-targetarn)
     * @param targetArn The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign
     * is deployed. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnCampaign =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCampaign {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCampaign(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign):
        CfnCampaign = CfnCampaign(cdkObject)

    internal fun unwrap(wrapped: CfnCampaign):
        software.amazon.awscdk.services.iotfleetwise.CfnCampaign = wrapped.cdkObject as
        software.amazon.awscdk.services.iotfleetwise.CfnCampaign
  }

  /**
   * Specifies what data to collect and how often or when to collect it.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * CollectionSchemeProperty collectionSchemeProperty = CollectionSchemeProperty.builder()
   * .conditionBasedCollectionScheme(ConditionBasedCollectionSchemeProperty.builder()
   * .expression("expression")
   * // the properties below are optional
   * .conditionLanguageVersion(123)
   * .minimumTriggerIntervalMs(123)
   * .triggerMode("triggerMode")
   * .build())
   * .timeBasedCollectionScheme(TimeBasedCollectionSchemeProperty.builder()
   * .periodMs(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-collectionscheme.html)
   */
  public interface CollectionSchemeProperty {
    /**
     * Information about a collection scheme that uses a simple logical expression to recognize what
     * data to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-collectionscheme.html#cfn-iotfleetwise-campaign-collectionscheme-conditionbasedcollectionscheme)
     */
    public fun conditionBasedCollectionScheme(): Any? =
        unwrap(this).getConditionBasedCollectionScheme()

    /**
     * Information about a collection scheme that uses a time period to decide how often to collect
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-collectionscheme.html#cfn-iotfleetwise-campaign-collectionscheme-timebasedcollectionscheme)
     */
    public fun timeBasedCollectionScheme(): Any? = unwrap(this).getTimeBasedCollectionScheme()

    /**
     * A builder for [CollectionSchemeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionBasedCollectionScheme Information about a collection scheme that uses a
       * simple logical expression to recognize what data to collect.
       */
      public fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: IResolvable)

      /**
       * @param conditionBasedCollectionScheme Information about a collection scheme that uses a
       * simple logical expression to recognize what data to collect.
       */
      public
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty)

      /**
       * @param conditionBasedCollectionScheme Information about a collection scheme that uses a
       * simple logical expression to recognize what data to collect.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1df1e2b1bf841c9ce4e9b5e01afaaea56630c36b5a28789a4f8544aa030e0e3")
      public
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty.Builder.() -> Unit)

      /**
       * @param timeBasedCollectionScheme Information about a collection scheme that uses a time
       * period to decide how often to collect data.
       */
      public fun timeBasedCollectionScheme(timeBasedCollectionScheme: IResolvable)

      /**
       * @param timeBasedCollectionScheme Information about a collection scheme that uses a time
       * period to decide how often to collect data.
       */
      public
          fun timeBasedCollectionScheme(timeBasedCollectionScheme: TimeBasedCollectionSchemeProperty)

      /**
       * @param timeBasedCollectionScheme Information about a collection scheme that uses a time
       * period to decide how often to collect data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb6d5f9760f304755b0590d89a23765cc637c5c42cd4e2e9220310753a03f05a")
      public
          fun timeBasedCollectionScheme(timeBasedCollectionScheme: TimeBasedCollectionSchemeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty.builder()

      /**
       * @param conditionBasedCollectionScheme Information about a collection scheme that uses a
       * simple logical expression to recognize what data to collect.
       */
      override fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: IResolvable) {
        cdkBuilder.conditionBasedCollectionScheme(conditionBasedCollectionScheme.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditionBasedCollectionScheme Information about a collection scheme that uses a
       * simple logical expression to recognize what data to collect.
       */
      override
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty) {
        cdkBuilder.conditionBasedCollectionScheme(conditionBasedCollectionScheme.let(ConditionBasedCollectionSchemeProperty.Companion::unwrap))
      }

      /**
       * @param conditionBasedCollectionScheme Information about a collection scheme that uses a
       * simple logical expression to recognize what data to collect.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1df1e2b1bf841c9ce4e9b5e01afaaea56630c36b5a28789a4f8544aa030e0e3")
      override
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty.Builder.() -> Unit):
          Unit =
          conditionBasedCollectionScheme(ConditionBasedCollectionSchemeProperty(conditionBasedCollectionScheme))

      /**
       * @param timeBasedCollectionScheme Information about a collection scheme that uses a time
       * period to decide how often to collect data.
       */
      override fun timeBasedCollectionScheme(timeBasedCollectionScheme: IResolvable) {
        cdkBuilder.timeBasedCollectionScheme(timeBasedCollectionScheme.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeBasedCollectionScheme Information about a collection scheme that uses a time
       * period to decide how often to collect data.
       */
      override
          fun timeBasedCollectionScheme(timeBasedCollectionScheme: TimeBasedCollectionSchemeProperty) {
        cdkBuilder.timeBasedCollectionScheme(timeBasedCollectionScheme.let(TimeBasedCollectionSchemeProperty.Companion::unwrap))
      }

      /**
       * @param timeBasedCollectionScheme Information about a collection scheme that uses a time
       * period to decide how often to collect data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb6d5f9760f304755b0590d89a23765cc637c5c42cd4e2e9220310753a03f05a")
      override
          fun timeBasedCollectionScheme(timeBasedCollectionScheme: TimeBasedCollectionSchemeProperty.Builder.() -> Unit):
          Unit =
          timeBasedCollectionScheme(TimeBasedCollectionSchemeProperty(timeBasedCollectionScheme))

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty,
    ) : CdkObject(cdkObject),
        CollectionSchemeProperty {
      /**
       * Information about a collection scheme that uses a simple logical expression to recognize
       * what data to collect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-collectionscheme.html#cfn-iotfleetwise-campaign-collectionscheme-conditionbasedcollectionscheme)
       */
      override fun conditionBasedCollectionScheme(): Any? =
          unwrap(this).getConditionBasedCollectionScheme()

      /**
       * Information about a collection scheme that uses a time period to decide how often to
       * collect data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-collectionscheme.html#cfn-iotfleetwise-campaign-collectionscheme-timebasedcollectionscheme)
       */
      override fun timeBasedCollectionScheme(): Any? = unwrap(this).getTimeBasedCollectionScheme()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CollectionSchemeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty):
          CollectionSchemeProperty = CdkObjectWrappers.wrap(cdkObject) as? CollectionSchemeProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CollectionSchemeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty
    }
  }

  /**
   * Information about a collection scheme that uses a simple logical expression to recognize what
   * data to collect.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * ConditionBasedCollectionSchemeProperty conditionBasedCollectionSchemeProperty =
   * ConditionBasedCollectionSchemeProperty.builder()
   * .expression("expression")
   * // the properties below are optional
   * .conditionLanguageVersion(123)
   * .minimumTriggerIntervalMs(123)
   * .triggerMode("triggerMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html)
   */
  public interface ConditionBasedCollectionSchemeProperty {
    /**
     * Specifies the version of the conditional expression language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html#cfn-iotfleetwise-campaign-conditionbasedcollectionscheme-conditionlanguageversion)
     */
    public fun conditionLanguageVersion(): Number? = unwrap(this).getConditionLanguageVersion()

    /**
     * The logical expression used to recognize what data to collect.
     *
     * For example, `$variable.Vehicle.OutsideAirTemperature &gt;= 105.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html#cfn-iotfleetwise-campaign-conditionbasedcollectionscheme-expression)
     */
    public fun expression(): String

    /**
     * The minimum duration of time between two triggering events to collect data, in milliseconds.
     *
     *
     * If a signal changes often, you might want to collect data at a slower rate.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html#cfn-iotfleetwise-campaign-conditionbasedcollectionscheme-minimumtriggerintervalms)
     */
    public fun minimumTriggerIntervalMs(): Number? = unwrap(this).getMinimumTriggerIntervalMs()

    /**
     * Whether to collect data for all triggering events ( `ALWAYS` ).
     *
     * Specify ( `RISING_EDGE` ), or specify only when the condition first evaluates to false. For
     * example, triggering on "AirbagDeployed"; Users aren't interested on triggering when the airbag
     * is already exploded; they only care about the change from not deployed =&gt; deployed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html#cfn-iotfleetwise-campaign-conditionbasedcollectionscheme-triggermode)
     */
    public fun triggerMode(): String? = unwrap(this).getTriggerMode()

    /**
     * A builder for [ConditionBasedCollectionSchemeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionLanguageVersion Specifies the version of the conditional expression
       * language.
       */
      public fun conditionLanguageVersion(conditionLanguageVersion: Number)

      /**
       * @param expression The logical expression used to recognize what data to collect. 
       * For example, `$variable.Vehicle.OutsideAirTemperature &gt;= 105.0` .
       */
      public fun expression(expression: String)

      /**
       * @param minimumTriggerIntervalMs The minimum duration of time between two triggering events
       * to collect data, in milliseconds.
       *
       * If a signal changes often, you might want to collect data at a slower rate.
       */
      public fun minimumTriggerIntervalMs(minimumTriggerIntervalMs: Number)

      /**
       * @param triggerMode Whether to collect data for all triggering events ( `ALWAYS` ).
       * Specify ( `RISING_EDGE` ), or specify only when the condition first evaluates to false. For
       * example, triggering on "AirbagDeployed"; Users aren't interested on triggering when the airbag
       * is already exploded; they only care about the change from not deployed =&gt; deployed.
       */
      public fun triggerMode(triggerMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty.builder()

      /**
       * @param conditionLanguageVersion Specifies the version of the conditional expression
       * language.
       */
      override fun conditionLanguageVersion(conditionLanguageVersion: Number) {
        cdkBuilder.conditionLanguageVersion(conditionLanguageVersion)
      }

      /**
       * @param expression The logical expression used to recognize what data to collect. 
       * For example, `$variable.Vehicle.OutsideAirTemperature &gt;= 105.0` .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param minimumTriggerIntervalMs The minimum duration of time between two triggering events
       * to collect data, in milliseconds.
       *
       * If a signal changes often, you might want to collect data at a slower rate.
       */
      override fun minimumTriggerIntervalMs(minimumTriggerIntervalMs: Number) {
        cdkBuilder.minimumTriggerIntervalMs(minimumTriggerIntervalMs)
      }

      /**
       * @param triggerMode Whether to collect data for all triggering events ( `ALWAYS` ).
       * Specify ( `RISING_EDGE` ), or specify only when the condition first evaluates to false. For
       * example, triggering on "AirbagDeployed"; Users aren't interested on triggering when the airbag
       * is already exploded; they only care about the change from not deployed =&gt; deployed.
       */
      override fun triggerMode(triggerMode: String) {
        cdkBuilder.triggerMode(triggerMode)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty,
    ) : CdkObject(cdkObject),
        ConditionBasedCollectionSchemeProperty {
      /**
       * Specifies the version of the conditional expression language.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html#cfn-iotfleetwise-campaign-conditionbasedcollectionscheme-conditionlanguageversion)
       */
      override fun conditionLanguageVersion(): Number? = unwrap(this).getConditionLanguageVersion()

      /**
       * The logical expression used to recognize what data to collect.
       *
       * For example, `$variable.Vehicle.OutsideAirTemperature &gt;= 105.0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html#cfn-iotfleetwise-campaign-conditionbasedcollectionscheme-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()

      /**
       * The minimum duration of time between two triggering events to collect data, in
       * milliseconds.
       *
       *
       * If a signal changes often, you might want to collect data at a slower rate.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html#cfn-iotfleetwise-campaign-conditionbasedcollectionscheme-minimumtriggerintervalms)
       */
      override fun minimumTriggerIntervalMs(): Number? = unwrap(this).getMinimumTriggerIntervalMs()

      /**
       * Whether to collect data for all triggering events ( `ALWAYS` ).
       *
       * Specify ( `RISING_EDGE` ), or specify only when the condition first evaluates to false. For
       * example, triggering on "AirbagDeployed"; Users aren't interested on triggering when the airbag
       * is already exploded; they only care about the change from not deployed =&gt; deployed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html#cfn-iotfleetwise-campaign-conditionbasedcollectionscheme-triggermode)
       */
      override fun triggerMode(): String? = unwrap(this).getTriggerMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConditionBasedCollectionSchemeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty):
          ConditionBasedCollectionSchemeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConditionBasedCollectionSchemeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionBasedCollectionSchemeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty
    }
  }

  /**
   * Specifies the condition under which a signal fetch occurs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * ConditionBasedSignalFetchConfigProperty conditionBasedSignalFetchConfigProperty =
   * ConditionBasedSignalFetchConfigProperty.builder()
   * .conditionExpression("conditionExpression")
   * .triggerMode("triggerMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedsignalfetchconfig.html)
   */
  public interface ConditionBasedSignalFetchConfigProperty {
    /**
     * The condition that must be satisfied to trigger a signal fetch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedsignalfetchconfig.html#cfn-iotfleetwise-campaign-conditionbasedsignalfetchconfig-conditionexpression)
     */
    public fun conditionExpression(): String

    /**
     * Indicates the mode in which the signal fetch is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedsignalfetchconfig.html#cfn-iotfleetwise-campaign-conditionbasedsignalfetchconfig-triggermode)
     */
    public fun triggerMode(): String

    /**
     * A builder for [ConditionBasedSignalFetchConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionExpression The condition that must be satisfied to trigger a signal fetch. 
       */
      public fun conditionExpression(conditionExpression: String)

      /**
       * @param triggerMode Indicates the mode in which the signal fetch is triggered. 
       */
      public fun triggerMode(triggerMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedSignalFetchConfigProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedSignalFetchConfigProperty.builder()

      /**
       * @param conditionExpression The condition that must be satisfied to trigger a signal fetch. 
       */
      override fun conditionExpression(conditionExpression: String) {
        cdkBuilder.conditionExpression(conditionExpression)
      }

      /**
       * @param triggerMode Indicates the mode in which the signal fetch is triggered. 
       */
      override fun triggerMode(triggerMode: String) {
        cdkBuilder.triggerMode(triggerMode)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedSignalFetchConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedSignalFetchConfigProperty,
    ) : CdkObject(cdkObject),
        ConditionBasedSignalFetchConfigProperty {
      /**
       * The condition that must be satisfied to trigger a signal fetch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedsignalfetchconfig.html#cfn-iotfleetwise-campaign-conditionbasedsignalfetchconfig-conditionexpression)
       */
      override fun conditionExpression(): String = unwrap(this).getConditionExpression()

      /**
       * Indicates the mode in which the signal fetch is triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedsignalfetchconfig.html#cfn-iotfleetwise-campaign-conditionbasedsignalfetchconfig-triggermode)
       */
      override fun triggerMode(): String = unwrap(this).getTriggerMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConditionBasedSignalFetchConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedSignalFetchConfigProperty):
          ConditionBasedSignalFetchConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConditionBasedSignalFetchConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionBasedSignalFetchConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedSignalFetchConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedSignalFetchConfigProperty
    }
  }

  /**
   * The destination where the AWS IoT FleetWise campaign sends data.
   *
   * You can send data to be stored in Amazon S3 or Amazon Timestream .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * DataDestinationConfigProperty dataDestinationConfigProperty =
   * DataDestinationConfigProperty.builder()
   * .mqttTopicConfig(MqttTopicConfigProperty.builder()
   * .executionRoleArn("executionRoleArn")
   * .mqttTopicArn("mqttTopicArn")
   * .build())
   * .s3Config(S3ConfigProperty.builder()
   * .bucketArn("bucketArn")
   * // the properties below are optional
   * .dataFormat("dataFormat")
   * .prefix("prefix")
   * .storageCompressionFormat("storageCompressionFormat")
   * .build())
   * .timestreamConfig(TimestreamConfigProperty.builder()
   * .executionRoleArn("executionRoleArn")
   * .timestreamTableArn("timestreamTableArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datadestinationconfig.html)
   */
  public interface DataDestinationConfigProperty {
    /**
     * The MQTT topic to which the AWS IoT FleetWise campaign routes data.
     *
     *
     * Access to certain AWS IoT FleetWise features is currently gated. For more information, see
     * [AWS Region and feature
     * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
     * in the *AWS IoT FleetWise Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datadestinationconfig.html#cfn-iotfleetwise-campaign-datadestinationconfig-mqtttopicconfig)
     */
    public fun mqttTopicConfig(): Any? = unwrap(this).getMqttTopicConfig()

    /**
     * The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datadestinationconfig.html#cfn-iotfleetwise-campaign-datadestinationconfig-s3config)
     */
    public fun s3Config(): Any? = unwrap(this).getS3Config()

    /**
     * The Amazon Timestream table where the campaign sends data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datadestinationconfig.html#cfn-iotfleetwise-campaign-datadestinationconfig-timestreamconfig)
     */
    public fun timestreamConfig(): Any? = unwrap(this).getTimestreamConfig()

    /**
     * A builder for [DataDestinationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mqttTopicConfig The MQTT topic to which the AWS IoT FleetWise campaign routes data.
       *
       * Access to certain AWS IoT FleetWise features is currently gated. For more information, see
       * [AWS Region and feature
       * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
       * in the *AWS IoT FleetWise Developer Guide* .
       */
      public fun mqttTopicConfig(mqttTopicConfig: IResolvable)

      /**
       * @param mqttTopicConfig The MQTT topic to which the AWS IoT FleetWise campaign routes data.
       *
       * Access to certain AWS IoT FleetWise features is currently gated. For more information, see
       * [AWS Region and feature
       * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
       * in the *AWS IoT FleetWise Developer Guide* .
       */
      public fun mqttTopicConfig(mqttTopicConfig: MqttTopicConfigProperty)

      /**
       * @param mqttTopicConfig The MQTT topic to which the AWS IoT FleetWise campaign routes data.
       *
       * Access to certain AWS IoT FleetWise features is currently gated. For more information, see
       * [AWS Region and feature
       * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
       * in the *AWS IoT FleetWise Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56eb0f11ad367f66b034a2f29775d7135605ee5356c6e51b5c013a12de9e5188")
      public fun mqttTopicConfig(mqttTopicConfig: MqttTopicConfigProperty.Builder.() -> Unit)

      /**
       * @param s3Config The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
       */
      public fun s3Config(s3Config: IResolvable)

      /**
       * @param s3Config The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
       */
      public fun s3Config(s3Config: S3ConfigProperty)

      /**
       * @param s3Config The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa0827b0454fc9c29afa4ccc11da06ed4a232455f4ac9194e6f07ac3800cd503")
      public fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit)

      /**
       * @param timestreamConfig The Amazon Timestream table where the campaign sends data.
       */
      public fun timestreamConfig(timestreamConfig: IResolvable)

      /**
       * @param timestreamConfig The Amazon Timestream table where the campaign sends data.
       */
      public fun timestreamConfig(timestreamConfig: TimestreamConfigProperty)

      /**
       * @param timestreamConfig The Amazon Timestream table where the campaign sends data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e05a80e07ddd9ec9c84f411b8d0482847c9fa86797ac250f5483a620132e716")
      public fun timestreamConfig(timestreamConfig: TimestreamConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty.builder()

      /**
       * @param mqttTopicConfig The MQTT topic to which the AWS IoT FleetWise campaign routes data.
       *
       * Access to certain AWS IoT FleetWise features is currently gated. For more information, see
       * [AWS Region and feature
       * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
       * in the *AWS IoT FleetWise Developer Guide* .
       */
      override fun mqttTopicConfig(mqttTopicConfig: IResolvable) {
        cdkBuilder.mqttTopicConfig(mqttTopicConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mqttTopicConfig The MQTT topic to which the AWS IoT FleetWise campaign routes data.
       *
       * Access to certain AWS IoT FleetWise features is currently gated. For more information, see
       * [AWS Region and feature
       * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
       * in the *AWS IoT FleetWise Developer Guide* .
       */
      override fun mqttTopicConfig(mqttTopicConfig: MqttTopicConfigProperty) {
        cdkBuilder.mqttTopicConfig(mqttTopicConfig.let(MqttTopicConfigProperty.Companion::unwrap))
      }

      /**
       * @param mqttTopicConfig The MQTT topic to which the AWS IoT FleetWise campaign routes data.
       *
       * Access to certain AWS IoT FleetWise features is currently gated. For more information, see
       * [AWS Region and feature
       * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
       * in the *AWS IoT FleetWise Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56eb0f11ad367f66b034a2f29775d7135605ee5356c6e51b5c013a12de9e5188")
      override fun mqttTopicConfig(mqttTopicConfig: MqttTopicConfigProperty.Builder.() -> Unit):
          Unit = mqttTopicConfig(MqttTopicConfigProperty(mqttTopicConfig))

      /**
       * @param s3Config The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
       */
      override fun s3Config(s3Config: IResolvable) {
        cdkBuilder.s3Config(s3Config.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Config The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
       */
      override fun s3Config(s3Config: S3ConfigProperty) {
        cdkBuilder.s3Config(s3Config.let(S3ConfigProperty.Companion::unwrap))
      }

      /**
       * @param s3Config The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa0827b0454fc9c29afa4ccc11da06ed4a232455f4ac9194e6f07ac3800cd503")
      override fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit): Unit =
          s3Config(S3ConfigProperty(s3Config))

      /**
       * @param timestreamConfig The Amazon Timestream table where the campaign sends data.
       */
      override fun timestreamConfig(timestreamConfig: IResolvable) {
        cdkBuilder.timestreamConfig(timestreamConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timestreamConfig The Amazon Timestream table where the campaign sends data.
       */
      override fun timestreamConfig(timestreamConfig: TimestreamConfigProperty) {
        cdkBuilder.timestreamConfig(timestreamConfig.let(TimestreamConfigProperty.Companion::unwrap))
      }

      /**
       * @param timestreamConfig The Amazon Timestream table where the campaign sends data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e05a80e07ddd9ec9c84f411b8d0482847c9fa86797ac250f5483a620132e716")
      override fun timestreamConfig(timestreamConfig: TimestreamConfigProperty.Builder.() -> Unit):
          Unit = timestreamConfig(TimestreamConfigProperty(timestreamConfig))

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty,
    ) : CdkObject(cdkObject),
        DataDestinationConfigProperty {
      /**
       * The MQTT topic to which the AWS IoT FleetWise campaign routes data.
       *
       *
       * Access to certain AWS IoT FleetWise features is currently gated. For more information, see
       * [AWS Region and feature
       * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
       * in the *AWS IoT FleetWise Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datadestinationconfig.html#cfn-iotfleetwise-campaign-datadestinationconfig-mqtttopicconfig)
       */
      override fun mqttTopicConfig(): Any? = unwrap(this).getMqttTopicConfig()

      /**
       * The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datadestinationconfig.html#cfn-iotfleetwise-campaign-datadestinationconfig-s3config)
       */
      override fun s3Config(): Any? = unwrap(this).getS3Config()

      /**
       * The Amazon Timestream table where the campaign sends data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datadestinationconfig.html#cfn-iotfleetwise-campaign-datadestinationconfig-timestreamconfig)
       */
      override fun timestreamConfig(): Any? = unwrap(this).getTimestreamConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataDestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty):
          DataDestinationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataDestinationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataDestinationConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty
    }
  }

  /**
   * The configuration for signal data storage and upload options.
   *
   * You can only specify these options when the campaign's spooling mode is `TO_DISK` .
   *
   *
   * Access to certain AWS IoT FleetWise features is currently gated. For more information, see [AWS
   * Region and feature
   * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
   * in the *AWS IoT FleetWise Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * DataPartitionProperty dataPartitionProperty = DataPartitionProperty.builder()
   * .id("id")
   * .storageOptions(DataPartitionStorageOptionsProperty.builder()
   * .maximumSize(StorageMaximumSizeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .minimumTimeToLive(StorageMinimumTimeToLiveProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .storageLocation("storageLocation")
   * .build())
   * // the properties below are optional
   * .uploadOptions(DataPartitionUploadOptionsProperty.builder()
   * .expression("expression")
   * // the properties below are optional
   * .conditionLanguageVersion(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartition.html)
   */
  public interface DataPartitionProperty {
    /**
     * The ID of the data partition.
     *
     * The data partition ID must be unique within a campaign. You can establish a data partition as
     * the default partition for a campaign by using `default` as the ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartition.html#cfn-iotfleetwise-campaign-datapartition-id)
     */
    public fun id(): String

    /**
     * The storage options for a data partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartition.html#cfn-iotfleetwise-campaign-datapartition-storageoptions)
     */
    public fun storageOptions(): Any

    /**
     * The upload options for the data partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartition.html#cfn-iotfleetwise-campaign-datapartition-uploadoptions)
     */
    public fun uploadOptions(): Any? = unwrap(this).getUploadOptions()

    /**
     * A builder for [DataPartitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID of the data partition. 
       * The data partition ID must be unique within a campaign. You can establish a data partition
       * as the default partition for a campaign by using `default` as the ID.
       */
      public fun id(id: String)

      /**
       * @param storageOptions The storage options for a data partition. 
       */
      public fun storageOptions(storageOptions: IResolvable)

      /**
       * @param storageOptions The storage options for a data partition. 
       */
      public fun storageOptions(storageOptions: DataPartitionStorageOptionsProperty)

      /**
       * @param storageOptions The storage options for a data partition. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a9e56ad962ffdfe974db5bb030a740e825690c274679e4a844d940af8c7744d")
      public
          fun storageOptions(storageOptions: DataPartitionStorageOptionsProperty.Builder.() -> Unit)

      /**
       * @param uploadOptions The upload options for the data partition.
       */
      public fun uploadOptions(uploadOptions: IResolvable)

      /**
       * @param uploadOptions The upload options for the data partition.
       */
      public fun uploadOptions(uploadOptions: DataPartitionUploadOptionsProperty)

      /**
       * @param uploadOptions The upload options for the data partition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("251daca10f1f22ea63ca09869ecebf5e10622487a5b21a6036ce0d070e3918fe")
      public fun uploadOptions(uploadOptions: DataPartitionUploadOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionProperty.builder()

      /**
       * @param id The ID of the data partition. 
       * The data partition ID must be unique within a campaign. You can establish a data partition
       * as the default partition for a campaign by using `default` as the ID.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param storageOptions The storage options for a data partition. 
       */
      override fun storageOptions(storageOptions: IResolvable) {
        cdkBuilder.storageOptions(storageOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param storageOptions The storage options for a data partition. 
       */
      override fun storageOptions(storageOptions: DataPartitionStorageOptionsProperty) {
        cdkBuilder.storageOptions(storageOptions.let(DataPartitionStorageOptionsProperty.Companion::unwrap))
      }

      /**
       * @param storageOptions The storage options for a data partition. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a9e56ad962ffdfe974db5bb030a740e825690c274679e4a844d940af8c7744d")
      override
          fun storageOptions(storageOptions: DataPartitionStorageOptionsProperty.Builder.() -> Unit):
          Unit = storageOptions(DataPartitionStorageOptionsProperty(storageOptions))

      /**
       * @param uploadOptions The upload options for the data partition.
       */
      override fun uploadOptions(uploadOptions: IResolvable) {
        cdkBuilder.uploadOptions(uploadOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param uploadOptions The upload options for the data partition.
       */
      override fun uploadOptions(uploadOptions: DataPartitionUploadOptionsProperty) {
        cdkBuilder.uploadOptions(uploadOptions.let(DataPartitionUploadOptionsProperty.Companion::unwrap))
      }

      /**
       * @param uploadOptions The upload options for the data partition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("251daca10f1f22ea63ca09869ecebf5e10622487a5b21a6036ce0d070e3918fe")
      override
          fun uploadOptions(uploadOptions: DataPartitionUploadOptionsProperty.Builder.() -> Unit):
          Unit = uploadOptions(DataPartitionUploadOptionsProperty(uploadOptions))

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionProperty,
    ) : CdkObject(cdkObject),
        DataPartitionProperty {
      /**
       * The ID of the data partition.
       *
       * The data partition ID must be unique within a campaign. You can establish a data partition
       * as the default partition for a campaign by using `default` as the ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartition.html#cfn-iotfleetwise-campaign-datapartition-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The storage options for a data partition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartition.html#cfn-iotfleetwise-campaign-datapartition-storageoptions)
       */
      override fun storageOptions(): Any = unwrap(this).getStorageOptions()

      /**
       * The upload options for the data partition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartition.html#cfn-iotfleetwise-campaign-datapartition-uploadoptions)
       */
      override fun uploadOptions(): Any? = unwrap(this).getUploadOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataPartitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionProperty):
          DataPartitionProperty = CdkObjectWrappers.wrap(cdkObject) as? DataPartitionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataPartitionProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionProperty
    }
  }

  /**
   * Size, time, and location options for the data partition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * DataPartitionStorageOptionsProperty dataPartitionStorageOptionsProperty =
   * DataPartitionStorageOptionsProperty.builder()
   * .maximumSize(StorageMaximumSizeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .minimumTimeToLive(StorageMinimumTimeToLiveProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .storageLocation("storageLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionstorageoptions.html)
   */
  public interface DataPartitionStorageOptionsProperty {
    /**
     * The maximum storage size of the data stored in the data partition.
     *
     *
     * Newer data overwrites older data when the partition reaches the maximum size.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionstorageoptions.html#cfn-iotfleetwise-campaign-datapartitionstorageoptions-maximumsize)
     */
    public fun maximumSize(): Any

    /**
     * The amount of time that data in this partition will be kept on disk.
     *
     * * After the designated amount of time passes, the data can be removed, but it's not
     * guaranteed to be removed.
     * * Before the time expires, data in this partition can still be deleted if the partition
     * reaches its configured maximum size.
     * * Newer data will overwrite older data when the partition reaches the maximum size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionstorageoptions.html#cfn-iotfleetwise-campaign-datapartitionstorageoptions-minimumtimetolive)
     */
    public fun minimumTimeToLive(): Any

    /**
     * The folder name for the data partition under the campaign storage folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionstorageoptions.html#cfn-iotfleetwise-campaign-datapartitionstorageoptions-storagelocation)
     */
    public fun storageLocation(): String

    /**
     * A builder for [DataPartitionStorageOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumSize The maximum storage size of the data stored in the data partition. 
       *
       * Newer data overwrites older data when the partition reaches the maximum size.
       */
      public fun maximumSize(maximumSize: IResolvable)

      /**
       * @param maximumSize The maximum storage size of the data stored in the data partition. 
       *
       * Newer data overwrites older data when the partition reaches the maximum size.
       */
      public fun maximumSize(maximumSize: StorageMaximumSizeProperty)

      /**
       * @param maximumSize The maximum storage size of the data stored in the data partition. 
       *
       * Newer data overwrites older data when the partition reaches the maximum size.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9672c4d18f444e2c702e0b739eb99dd0fdf2ec3f64a73350a22cbbff9abdb4a7")
      public fun maximumSize(maximumSize: StorageMaximumSizeProperty.Builder.() -> Unit)

      /**
       * @param minimumTimeToLive The amount of time that data in this partition will be kept on
       * disk. 
       * * After the designated amount of time passes, the data can be removed, but it's not
       * guaranteed to be removed.
       * * Before the time expires, data in this partition can still be deleted if the partition
       * reaches its configured maximum size.
       * * Newer data will overwrite older data when the partition reaches the maximum size.
       */
      public fun minimumTimeToLive(minimumTimeToLive: IResolvable)

      /**
       * @param minimumTimeToLive The amount of time that data in this partition will be kept on
       * disk. 
       * * After the designated amount of time passes, the data can be removed, but it's not
       * guaranteed to be removed.
       * * Before the time expires, data in this partition can still be deleted if the partition
       * reaches its configured maximum size.
       * * Newer data will overwrite older data when the partition reaches the maximum size.
       */
      public fun minimumTimeToLive(minimumTimeToLive: StorageMinimumTimeToLiveProperty)

      /**
       * @param minimumTimeToLive The amount of time that data in this partition will be kept on
       * disk. 
       * * After the designated amount of time passes, the data can be removed, but it's not
       * guaranteed to be removed.
       * * Before the time expires, data in this partition can still be deleted if the partition
       * reaches its configured maximum size.
       * * Newer data will overwrite older data when the partition reaches the maximum size.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5a50995f5b7fb6b53066d2bbde132a93b43c659bbd65c4c437baa744bbee5d4")
      public
          fun minimumTimeToLive(minimumTimeToLive: StorageMinimumTimeToLiveProperty.Builder.() -> Unit)

      /**
       * @param storageLocation The folder name for the data partition under the campaign storage
       * folder. 
       */
      public fun storageLocation(storageLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionStorageOptionsProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionStorageOptionsProperty.builder()

      /**
       * @param maximumSize The maximum storage size of the data stored in the data partition. 
       *
       * Newer data overwrites older data when the partition reaches the maximum size.
       */
      override fun maximumSize(maximumSize: IResolvable) {
        cdkBuilder.maximumSize(maximumSize.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maximumSize The maximum storage size of the data stored in the data partition. 
       *
       * Newer data overwrites older data when the partition reaches the maximum size.
       */
      override fun maximumSize(maximumSize: StorageMaximumSizeProperty) {
        cdkBuilder.maximumSize(maximumSize.let(StorageMaximumSizeProperty.Companion::unwrap))
      }

      /**
       * @param maximumSize The maximum storage size of the data stored in the data partition. 
       *
       * Newer data overwrites older data when the partition reaches the maximum size.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9672c4d18f444e2c702e0b739eb99dd0fdf2ec3f64a73350a22cbbff9abdb4a7")
      override fun maximumSize(maximumSize: StorageMaximumSizeProperty.Builder.() -> Unit): Unit =
          maximumSize(StorageMaximumSizeProperty(maximumSize))

      /**
       * @param minimumTimeToLive The amount of time that data in this partition will be kept on
       * disk. 
       * * After the designated amount of time passes, the data can be removed, but it's not
       * guaranteed to be removed.
       * * Before the time expires, data in this partition can still be deleted if the partition
       * reaches its configured maximum size.
       * * Newer data will overwrite older data when the partition reaches the maximum size.
       */
      override fun minimumTimeToLive(minimumTimeToLive: IResolvable) {
        cdkBuilder.minimumTimeToLive(minimumTimeToLive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param minimumTimeToLive The amount of time that data in this partition will be kept on
       * disk. 
       * * After the designated amount of time passes, the data can be removed, but it's not
       * guaranteed to be removed.
       * * Before the time expires, data in this partition can still be deleted if the partition
       * reaches its configured maximum size.
       * * Newer data will overwrite older data when the partition reaches the maximum size.
       */
      override fun minimumTimeToLive(minimumTimeToLive: StorageMinimumTimeToLiveProperty) {
        cdkBuilder.minimumTimeToLive(minimumTimeToLive.let(StorageMinimumTimeToLiveProperty.Companion::unwrap))
      }

      /**
       * @param minimumTimeToLive The amount of time that data in this partition will be kept on
       * disk. 
       * * After the designated amount of time passes, the data can be removed, but it's not
       * guaranteed to be removed.
       * * Before the time expires, data in this partition can still be deleted if the partition
       * reaches its configured maximum size.
       * * Newer data will overwrite older data when the partition reaches the maximum size.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5a50995f5b7fb6b53066d2bbde132a93b43c659bbd65c4c437baa744bbee5d4")
      override
          fun minimumTimeToLive(minimumTimeToLive: StorageMinimumTimeToLiveProperty.Builder.() -> Unit):
          Unit = minimumTimeToLive(StorageMinimumTimeToLiveProperty(minimumTimeToLive))

      /**
       * @param storageLocation The folder name for the data partition under the campaign storage
       * folder. 
       */
      override fun storageLocation(storageLocation: String) {
        cdkBuilder.storageLocation(storageLocation)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionStorageOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionStorageOptionsProperty,
    ) : CdkObject(cdkObject),
        DataPartitionStorageOptionsProperty {
      /**
       * The maximum storage size of the data stored in the data partition.
       *
       *
       * Newer data overwrites older data when the partition reaches the maximum size.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionstorageoptions.html#cfn-iotfleetwise-campaign-datapartitionstorageoptions-maximumsize)
       */
      override fun maximumSize(): Any = unwrap(this).getMaximumSize()

      /**
       * The amount of time that data in this partition will be kept on disk.
       *
       * * After the designated amount of time passes, the data can be removed, but it's not
       * guaranteed to be removed.
       * * Before the time expires, data in this partition can still be deleted if the partition
       * reaches its configured maximum size.
       * * Newer data will overwrite older data when the partition reaches the maximum size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionstorageoptions.html#cfn-iotfleetwise-campaign-datapartitionstorageoptions-minimumtimetolive)
       */
      override fun minimumTimeToLive(): Any = unwrap(this).getMinimumTimeToLive()

      /**
       * The folder name for the data partition under the campaign storage folder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionstorageoptions.html#cfn-iotfleetwise-campaign-datapartitionstorageoptions-storagelocation)
       */
      override fun storageLocation(): String = unwrap(this).getStorageLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataPartitionStorageOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionStorageOptionsProperty):
          DataPartitionStorageOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataPartitionStorageOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataPartitionStorageOptionsProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionStorageOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionStorageOptionsProperty
    }
  }

  /**
   * The upload options for the data partition.
   *
   * If upload options are specified, you must also specify storage options. See
   * [DataPartitionStorageOptions](https://docs.aws.amazon.com/iot-fleetwise/latest/APIReference/API_DataPartitionStorageOptions.html)
   * .
   *
   *
   * Access to certain AWS IoT FleetWise features is currently gated. For more information, see [AWS
   * Region and feature
   * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
   * in the *AWS IoT FleetWise Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * DataPartitionUploadOptionsProperty dataPartitionUploadOptionsProperty =
   * DataPartitionUploadOptionsProperty.builder()
   * .expression("expression")
   * // the properties below are optional
   * .conditionLanguageVersion(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionuploadoptions.html)
   */
  public interface DataPartitionUploadOptionsProperty {
    /**
     * The version of the condition language.
     *
     * Defaults to the most recent condition language version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionuploadoptions.html#cfn-iotfleetwise-campaign-datapartitionuploadoptions-conditionlanguageversion)
     */
    public fun conditionLanguageVersion(): Number? = unwrap(this).getConditionLanguageVersion()

    /**
     * The logical expression used to recognize what data to collect.
     *
     * For example, `$variable.`Vehicle.OutsideAirTemperature` &gt;= 105.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionuploadoptions.html#cfn-iotfleetwise-campaign-datapartitionuploadoptions-expression)
     */
    public fun expression(): String

    /**
     * A builder for [DataPartitionUploadOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionLanguageVersion The version of the condition language.
       * Defaults to the most recent condition language version.
       */
      public fun conditionLanguageVersion(conditionLanguageVersion: Number)

      /**
       * @param expression The logical expression used to recognize what data to collect. 
       * For example, `$variable.`Vehicle.OutsideAirTemperature` &gt;= 105.0` .
       */
      public fun expression(expression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionUploadOptionsProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionUploadOptionsProperty.builder()

      /**
       * @param conditionLanguageVersion The version of the condition language.
       * Defaults to the most recent condition language version.
       */
      override fun conditionLanguageVersion(conditionLanguageVersion: Number) {
        cdkBuilder.conditionLanguageVersion(conditionLanguageVersion)
      }

      /**
       * @param expression The logical expression used to recognize what data to collect. 
       * For example, `$variable.`Vehicle.OutsideAirTemperature` &gt;= 105.0` .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionUploadOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionUploadOptionsProperty,
    ) : CdkObject(cdkObject),
        DataPartitionUploadOptionsProperty {
      /**
       * The version of the condition language.
       *
       * Defaults to the most recent condition language version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionuploadoptions.html#cfn-iotfleetwise-campaign-datapartitionuploadoptions-conditionlanguageversion)
       */
      override fun conditionLanguageVersion(): Number? = unwrap(this).getConditionLanguageVersion()

      /**
       * The logical expression used to recognize what data to collect.
       *
       * For example, `$variable.`Vehicle.OutsideAirTemperature` &gt;= 105.0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datapartitionuploadoptions.html#cfn-iotfleetwise-campaign-datapartitionuploadoptions-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataPartitionUploadOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionUploadOptionsProperty):
          DataPartitionUploadOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataPartitionUploadOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataPartitionUploadOptionsProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionUploadOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataPartitionUploadOptionsProperty
    }
  }

  /**
   * The MQTT topic to which the AWS IoT FleetWise campaign routes data.
   *
   * For more information, see [Device communication
   * protocols](https://docs.aws.amazon.com/iot/latest/developerguide/protocols.html) in the *AWS IoT
   * Core Developer Guide* .
   *
   *
   * Access to certain AWS IoT FleetWise features is currently gated. For more information, see [AWS
   * Region and feature
   * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
   * in the *AWS IoT FleetWise Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * MqttTopicConfigProperty mqttTopicConfigProperty = MqttTopicConfigProperty.builder()
   * .executionRoleArn("executionRoleArn")
   * .mqttTopicArn("mqttTopicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-mqtttopicconfig.html)
   */
  public interface MqttTopicConfigProperty {
    /**
     * The ARN of the role that grants AWS IoT FleetWise permission to access and act on messages
     * sent to the MQTT topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-mqtttopicconfig.html#cfn-iotfleetwise-campaign-mqtttopicconfig-executionrolearn)
     */
    public fun executionRoleArn(): String

    /**
     * The ARN of the MQTT topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-mqtttopicconfig.html#cfn-iotfleetwise-campaign-mqtttopicconfig-mqtttopicarn)
     */
    public fun mqttTopicArn(): String

    /**
     * A builder for [MqttTopicConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executionRoleArn The ARN of the role that grants AWS IoT FleetWise permission to
       * access and act on messages sent to the MQTT topic. 
       */
      public fun executionRoleArn(executionRoleArn: String)

      /**
       * @param mqttTopicArn The ARN of the MQTT topic. 
       */
      public fun mqttTopicArn(mqttTopicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.MqttTopicConfigProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.MqttTopicConfigProperty.builder()

      /**
       * @param executionRoleArn The ARN of the role that grants AWS IoT FleetWise permission to
       * access and act on messages sent to the MQTT topic. 
       */
      override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      /**
       * @param mqttTopicArn The ARN of the MQTT topic. 
       */
      override fun mqttTopicArn(mqttTopicArn: String) {
        cdkBuilder.mqttTopicArn(mqttTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.MqttTopicConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.MqttTopicConfigProperty,
    ) : CdkObject(cdkObject),
        MqttTopicConfigProperty {
      /**
       * The ARN of the role that grants AWS IoT FleetWise permission to access and act on messages
       * sent to the MQTT topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-mqtttopicconfig.html#cfn-iotfleetwise-campaign-mqtttopicconfig-executionrolearn)
       */
      override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

      /**
       * The ARN of the MQTT topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-mqtttopicconfig.html#cfn-iotfleetwise-campaign-mqtttopicconfig-mqtttopicarn)
       */
      override fun mqttTopicArn(): String = unwrap(this).getMqttTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MqttTopicConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.MqttTopicConfigProperty):
          MqttTopicConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? MqttTopicConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MqttTopicConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.MqttTopicConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.MqttTopicConfigProperty
    }
  }

  /**
   * The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
   *
   * Amazon S3 is an object storage service that stores data as objects within buckets. For more
   * information, see [Creating, configuring, and working with Amazon S3
   * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html) in the
   * *Amazon Simple Storage Service User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * S3ConfigProperty s3ConfigProperty = S3ConfigProperty.builder()
   * .bucketArn("bucketArn")
   * // the properties below are optional
   * .dataFormat("dataFormat")
   * .prefix("prefix")
   * .storageCompressionFormat("storageCompressionFormat")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-s3config.html)
   */
  public interface S3ConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-s3config.html#cfn-iotfleetwise-campaign-s3config-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * Specify the format that files are saved in the Amazon S3 bucket.
     *
     * You can save files in an Apache Parquet or JSON format.
     *
     * * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data
     * retrieval and can reduce costs. This option is selected by default.
     * * JSON - Store data in a standard text-based JSON file format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-s3config.html#cfn-iotfleetwise-campaign-s3config-dataformat)
     */
    public fun dataFormat(): String? = unwrap(this).getDataFormat()

    /**
     * Enter an S3 bucket prefix.
     *
     * The prefix is the string of characters after the bucket name and before the object name. You
     * can use the prefix to organize data stored in Amazon S3 buckets. For more information, see
     * [Organizing objects using
     * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) in the
     * *Amazon Simple Storage Service User Guide* .
     *
     * By default, AWS IoT FleetWise sets the prefix
     * `processed-data/year=YY/month=MM/date=DD/hour=HH/` (in UTC) to data it delivers to Amazon S3 .
     * You can enter a prefix to append it to this default prefix. For example, if you enter the prefix
     * `vehicles` , the prefix will be `vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-s3config.html#cfn-iotfleetwise-campaign-s3config-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * By default, stored data is compressed as a .gzip file. Compressed files have a reduced file
     * size, which can optimize the cost of data storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-s3config.html#cfn-iotfleetwise-campaign-s3config-storagecompressionformat)
     */
    public fun storageCompressionFormat(): String? = unwrap(this).getStorageCompressionFormat()

    /**
     * A builder for [S3ConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket. 
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param dataFormat Specify the format that files are saved in the Amazon S3 bucket.
       * You can save files in an Apache Parquet or JSON format.
       *
       * * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data
       * retrieval and can reduce costs. This option is selected by default.
       * * JSON - Store data in a standard text-based JSON file format.
       */
      public fun dataFormat(dataFormat: String)

      /**
       * @param prefix Enter an S3 bucket prefix.
       * The prefix is the string of characters after the bucket name and before the object name.
       * You can use the prefix to organize data stored in Amazon S3 buckets. For more information, see
       * [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) in the
       * *Amazon Simple Storage Service User Guide* .
       *
       * By default, AWS IoT FleetWise sets the prefix
       * `processed-data/year=YY/month=MM/date=DD/hour=HH/` (in UTC) to data it delivers to Amazon S3 .
       * You can enter a prefix to append it to this default prefix. For example, if you enter the
       * prefix `vehicles` , the prefix will be
       * `vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/` .
       */
      public fun prefix(prefix: String)

      /**
       * @param storageCompressionFormat By default, stored data is compressed as a .gzip file.
       * Compressed files have a reduced file size, which can optimize the cost of data storage.
       */
      public fun storageCompressionFormat(storageCompressionFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty.builder()

      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket. 
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param dataFormat Specify the format that files are saved in the Amazon S3 bucket.
       * You can save files in an Apache Parquet or JSON format.
       *
       * * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data
       * retrieval and can reduce costs. This option is selected by default.
       * * JSON - Store data in a standard text-based JSON file format.
       */
      override fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
      }

      /**
       * @param prefix Enter an S3 bucket prefix.
       * The prefix is the string of characters after the bucket name and before the object name.
       * You can use the prefix to organize data stored in Amazon S3 buckets. For more information, see
       * [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) in the
       * *Amazon Simple Storage Service User Guide* .
       *
       * By default, AWS IoT FleetWise sets the prefix
       * `processed-data/year=YY/month=MM/date=DD/hour=HH/` (in UTC) to data it delivers to Amazon S3 .
       * You can enter a prefix to append it to this default prefix. For example, if you enter the
       * prefix `vehicles` , the prefix will be
       * `vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/` .
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param storageCompressionFormat By default, stored data is compressed as a .gzip file.
       * Compressed files have a reduced file size, which can optimize the cost of data storage.
       */
      override fun storageCompressionFormat(storageCompressionFormat: String) {
        cdkBuilder.storageCompressionFormat(storageCompressionFormat)
      }

      public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty,
    ) : CdkObject(cdkObject),
        S3ConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-s3config.html#cfn-iotfleetwise-campaign-s3config-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * Specify the format that files are saved in the Amazon S3 bucket.
       *
       * You can save files in an Apache Parquet or JSON format.
       *
       * * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data
       * retrieval and can reduce costs. This option is selected by default.
       * * JSON - Store data in a standard text-based JSON file format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-s3config.html#cfn-iotfleetwise-campaign-s3config-dataformat)
       */
      override fun dataFormat(): String? = unwrap(this).getDataFormat()

      /**
       * Enter an S3 bucket prefix.
       *
       * The prefix is the string of characters after the bucket name and before the object name.
       * You can use the prefix to organize data stored in Amazon S3 buckets. For more information, see
       * [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) in the
       * *Amazon Simple Storage Service User Guide* .
       *
       * By default, AWS IoT FleetWise sets the prefix
       * `processed-data/year=YY/month=MM/date=DD/hour=HH/` (in UTC) to data it delivers to Amazon S3 .
       * You can enter a prefix to append it to this default prefix. For example, if you enter the
       * prefix `vehicles` , the prefix will be
       * `vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-s3config.html#cfn-iotfleetwise-campaign-s3config-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * By default, stored data is compressed as a .gzip file. Compressed files have a reduced file
       * size, which can optimize the cost of data storage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-s3config.html#cfn-iotfleetwise-campaign-s3config-storagecompressionformat)
       */
      override fun storageCompressionFormat(): String? = unwrap(this).getStorageCompressionFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty):
          S3ConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? S3ConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty
    }
  }

  /**
   * The configuration of the signal fetch operation.
   *
   *
   * Access to certain AWS IoT FleetWise features is currently gated. For more information, see [AWS
   * Region and feature
   * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
   * in the *AWS IoT FleetWise Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * SignalFetchConfigProperty signalFetchConfigProperty = SignalFetchConfigProperty.builder()
   * .conditionBased(ConditionBasedSignalFetchConfigProperty.builder()
   * .conditionExpression("conditionExpression")
   * .triggerMode("triggerMode")
   * .build())
   * .timeBased(TimeBasedSignalFetchConfigProperty.builder()
   * .executionFrequencyMs(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchconfig.html)
   */
  public interface SignalFetchConfigProperty {
    /**
     * The configuration of a condition-based signal fetch operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchconfig.html#cfn-iotfleetwise-campaign-signalfetchconfig-conditionbased)
     */
    public fun conditionBased(): Any? = unwrap(this).getConditionBased()

    /**
     * The configuration of a time-based signal fetch operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchconfig.html#cfn-iotfleetwise-campaign-signalfetchconfig-timebased)
     */
    public fun timeBased(): Any? = unwrap(this).getTimeBased()

    /**
     * A builder for [SignalFetchConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionBased The configuration of a condition-based signal fetch operation.
       */
      public fun conditionBased(conditionBased: IResolvable)

      /**
       * @param conditionBased The configuration of a condition-based signal fetch operation.
       */
      public fun conditionBased(conditionBased: ConditionBasedSignalFetchConfigProperty)

      /**
       * @param conditionBased The configuration of a condition-based signal fetch operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0792e8d6a50c4d84d0d00d2d7644caad0646ca0941c06c22932753e3b6794de8")
      public
          fun conditionBased(conditionBased: ConditionBasedSignalFetchConfigProperty.Builder.() -> Unit)

      /**
       * @param timeBased The configuration of a time-based signal fetch operation.
       */
      public fun timeBased(timeBased: IResolvable)

      /**
       * @param timeBased The configuration of a time-based signal fetch operation.
       */
      public fun timeBased(timeBased: TimeBasedSignalFetchConfigProperty)

      /**
       * @param timeBased The configuration of a time-based signal fetch operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c4cf236a85c5ab84bc92f6aa9bc27c3c11b82c9ef1c7e9d1dcd9c5ad79ed595e")
      public fun timeBased(timeBased: TimeBasedSignalFetchConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchConfigProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchConfigProperty.builder()

      /**
       * @param conditionBased The configuration of a condition-based signal fetch operation.
       */
      override fun conditionBased(conditionBased: IResolvable) {
        cdkBuilder.conditionBased(conditionBased.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditionBased The configuration of a condition-based signal fetch operation.
       */
      override fun conditionBased(conditionBased: ConditionBasedSignalFetchConfigProperty) {
        cdkBuilder.conditionBased(conditionBased.let(ConditionBasedSignalFetchConfigProperty.Companion::unwrap))
      }

      /**
       * @param conditionBased The configuration of a condition-based signal fetch operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0792e8d6a50c4d84d0d00d2d7644caad0646ca0941c06c22932753e3b6794de8")
      override
          fun conditionBased(conditionBased: ConditionBasedSignalFetchConfigProperty.Builder.() -> Unit):
          Unit = conditionBased(ConditionBasedSignalFetchConfigProperty(conditionBased))

      /**
       * @param timeBased The configuration of a time-based signal fetch operation.
       */
      override fun timeBased(timeBased: IResolvable) {
        cdkBuilder.timeBased(timeBased.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeBased The configuration of a time-based signal fetch operation.
       */
      override fun timeBased(timeBased: TimeBasedSignalFetchConfigProperty) {
        cdkBuilder.timeBased(timeBased.let(TimeBasedSignalFetchConfigProperty.Companion::unwrap))
      }

      /**
       * @param timeBased The configuration of a time-based signal fetch operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c4cf236a85c5ab84bc92f6aa9bc27c3c11b82c9ef1c7e9d1dcd9c5ad79ed595e")
      override fun timeBased(timeBased: TimeBasedSignalFetchConfigProperty.Builder.() -> Unit): Unit
          = timeBased(TimeBasedSignalFetchConfigProperty(timeBased))

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchConfigProperty,
    ) : CdkObject(cdkObject),
        SignalFetchConfigProperty {
      /**
       * The configuration of a condition-based signal fetch operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchconfig.html#cfn-iotfleetwise-campaign-signalfetchconfig-conditionbased)
       */
      override fun conditionBased(): Any? = unwrap(this).getConditionBased()

      /**
       * The configuration of a time-based signal fetch operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchconfig.html#cfn-iotfleetwise-campaign-signalfetchconfig-timebased)
       */
      override fun timeBased(): Any? = unwrap(this).getTimeBased()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SignalFetchConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchConfigProperty):
          SignalFetchConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SignalFetchConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SignalFetchConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchConfigProperty
    }
  }

  /**
   * Information about the signal to be fetched.
   *
   *
   * Access to certain AWS IoT FleetWise features is currently gated. For more information, see [AWS
   * Region and feature
   * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
   * in the *AWS IoT FleetWise Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * SignalFetchInformationProperty signalFetchInformationProperty =
   * SignalFetchInformationProperty.builder()
   * .actions(List.of("actions"))
   * .fullyQualifiedName("fullyQualifiedName")
   * .signalFetchConfig(SignalFetchConfigProperty.builder()
   * .conditionBased(ConditionBasedSignalFetchConfigProperty.builder()
   * .conditionExpression("conditionExpression")
   * .triggerMode("triggerMode")
   * .build())
   * .timeBased(TimeBasedSignalFetchConfigProperty.builder()
   * .executionFrequencyMs(123)
   * .build())
   * .build())
   * // the properties below are optional
   * .conditionLanguageVersion(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchinformation.html)
   */
  public interface SignalFetchInformationProperty {
    /**
     * The actions to be performed by the signal fetch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchinformation.html#cfn-iotfleetwise-campaign-signalfetchinformation-actions)
     */
    public fun actions(): List<String>

    /**
     * The version of the condition language used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchinformation.html#cfn-iotfleetwise-campaign-signalfetchinformation-conditionlanguageversion)
     */
    public fun conditionLanguageVersion(): Number? = unwrap(this).getConditionLanguageVersion()

    /**
     * The fully qualified name of the signal to be fetched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchinformation.html#cfn-iotfleetwise-campaign-signalfetchinformation-fullyqualifiedname)
     */
    public fun fullyQualifiedName(): String

    /**
     * The configuration of the signal fetch operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchinformation.html#cfn-iotfleetwise-campaign-signalfetchinformation-signalfetchconfig)
     */
    public fun signalFetchConfig(): Any

    /**
     * A builder for [SignalFetchInformationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The actions to be performed by the signal fetch. 
       */
      public fun actions(actions: List<String>)

      /**
       * @param actions The actions to be performed by the signal fetch. 
       */
      public fun actions(vararg actions: String)

      /**
       * @param conditionLanguageVersion The version of the condition language used.
       */
      public fun conditionLanguageVersion(conditionLanguageVersion: Number)

      /**
       * @param fullyQualifiedName The fully qualified name of the signal to be fetched. 
       */
      public fun fullyQualifiedName(fullyQualifiedName: String)

      /**
       * @param signalFetchConfig The configuration of the signal fetch operation. 
       */
      public fun signalFetchConfig(signalFetchConfig: IResolvable)

      /**
       * @param signalFetchConfig The configuration of the signal fetch operation. 
       */
      public fun signalFetchConfig(signalFetchConfig: SignalFetchConfigProperty)

      /**
       * @param signalFetchConfig The configuration of the signal fetch operation. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fead850def1f2655988c799819e78891e79f097f3bd3834a5fcd8d5570211117")
      public fun signalFetchConfig(signalFetchConfig: SignalFetchConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchInformationProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchInformationProperty.builder()

      /**
       * @param actions The actions to be performed by the signal fetch. 
       */
      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions The actions to be performed by the signal fetch. 
       */
      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      /**
       * @param conditionLanguageVersion The version of the condition language used.
       */
      override fun conditionLanguageVersion(conditionLanguageVersion: Number) {
        cdkBuilder.conditionLanguageVersion(conditionLanguageVersion)
      }

      /**
       * @param fullyQualifiedName The fully qualified name of the signal to be fetched. 
       */
      override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      /**
       * @param signalFetchConfig The configuration of the signal fetch operation. 
       */
      override fun signalFetchConfig(signalFetchConfig: IResolvable) {
        cdkBuilder.signalFetchConfig(signalFetchConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param signalFetchConfig The configuration of the signal fetch operation. 
       */
      override fun signalFetchConfig(signalFetchConfig: SignalFetchConfigProperty) {
        cdkBuilder.signalFetchConfig(signalFetchConfig.let(SignalFetchConfigProperty.Companion::unwrap))
      }

      /**
       * @param signalFetchConfig The configuration of the signal fetch operation. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fead850def1f2655988c799819e78891e79f097f3bd3834a5fcd8d5570211117")
      override
          fun signalFetchConfig(signalFetchConfig: SignalFetchConfigProperty.Builder.() -> Unit):
          Unit = signalFetchConfig(SignalFetchConfigProperty(signalFetchConfig))

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchInformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchInformationProperty,
    ) : CdkObject(cdkObject),
        SignalFetchInformationProperty {
      /**
       * The actions to be performed by the signal fetch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchinformation.html#cfn-iotfleetwise-campaign-signalfetchinformation-actions)
       */
      override fun actions(): List<String> = unwrap(this).getActions()

      /**
       * The version of the condition language used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchinformation.html#cfn-iotfleetwise-campaign-signalfetchinformation-conditionlanguageversion)
       */
      override fun conditionLanguageVersion(): Number? = unwrap(this).getConditionLanguageVersion()

      /**
       * The fully qualified name of the signal to be fetched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchinformation.html#cfn-iotfleetwise-campaign-signalfetchinformation-fullyqualifiedname)
       */
      override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      /**
       * The configuration of the signal fetch operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalfetchinformation.html#cfn-iotfleetwise-campaign-signalfetchinformation-signalfetchconfig)
       */
      override fun signalFetchConfig(): Any = unwrap(this).getSignalFetchConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SignalFetchInformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchInformationProperty):
          SignalFetchInformationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SignalFetchInformationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SignalFetchInformationProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchInformationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalFetchInformationProperty
    }
  }

  /**
   * Information about a signal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * SignalInformationProperty signalInformationProperty = SignalInformationProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .dataPartitionId("dataPartitionId")
   * .maxSampleCount(123)
   * .minimumSamplingIntervalMs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html)
   */
  public interface SignalInformationProperty {
    /**
     * The ID of the data partition this signal is associated with.
     *
     * The ID must match one of the IDs provided in `dataPartitions` . This is accomplished either
     * by specifying a particular data partition ID or by using `default` for an established default
     * partition. You can establish a default partition in the `DataPartition` data type.
     *
     *
     * If you upload a signal as a condition for a campaign's data partition, the same signal must
     * be included in `signalsToCollect` . &gt; Access to certain AWS IoT FleetWise features is
     * currently gated. For more information, see [AWS Region and feature
     * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
     * in the *AWS IoT FleetWise Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html#cfn-iotfleetwise-campaign-signalinformation-datapartitionid)
     */
    public fun dataPartitionId(): String? = unwrap(this).getDataPartitionId()

    /**
     * The maximum number of samples to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html#cfn-iotfleetwise-campaign-signalinformation-maxsamplecount)
     */
    public fun maxSampleCount(): Number? = unwrap(this).getMaxSampleCount()

    /**
     * The minimum duration of time (in milliseconds) between two triggering events to collect data.
     *
     *
     * If a signal changes often, you might want to collect data at a slower rate.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html#cfn-iotfleetwise-campaign-signalinformation-minimumsamplingintervalms)
     */
    public fun minimumSamplingIntervalMs(): Number? = unwrap(this).getMinimumSamplingIntervalMs()

    /**
     * The name of the signal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html#cfn-iotfleetwise-campaign-signalinformation-name)
     */
    public fun name(): String

    /**
     * A builder for [SignalInformationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataPartitionId The ID of the data partition this signal is associated with.
       * The ID must match one of the IDs provided in `dataPartitions` . This is accomplished either
       * by specifying a particular data partition ID or by using `default` for an established default
       * partition. You can establish a default partition in the `DataPartition` data type.
       *
       *
       * If you upload a signal as a condition for a campaign's data partition, the same signal must
       * be included in `signalsToCollect` . &gt; Access to certain AWS IoT FleetWise features is
       * currently gated. For more information, see [AWS Region and feature
       * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
       * in the *AWS IoT FleetWise Developer Guide* .
       */
      public fun dataPartitionId(dataPartitionId: String)

      /**
       * @param maxSampleCount The maximum number of samples to collect.
       */
      public fun maxSampleCount(maxSampleCount: Number)

      /**
       * @param minimumSamplingIntervalMs The minimum duration of time (in milliseconds) between two
       * triggering events to collect data.
       *
       * If a signal changes often, you might want to collect data at a slower rate.
       */
      public fun minimumSamplingIntervalMs(minimumSamplingIntervalMs: Number)

      /**
       * @param name The name of the signal. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty.builder()

      /**
       * @param dataPartitionId The ID of the data partition this signal is associated with.
       * The ID must match one of the IDs provided in `dataPartitions` . This is accomplished either
       * by specifying a particular data partition ID or by using `default` for an established default
       * partition. You can establish a default partition in the `DataPartition` data type.
       *
       *
       * If you upload a signal as a condition for a campaign's data partition, the same signal must
       * be included in `signalsToCollect` . &gt; Access to certain AWS IoT FleetWise features is
       * currently gated. For more information, see [AWS Region and feature
       * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
       * in the *AWS IoT FleetWise Developer Guide* .
       */
      override fun dataPartitionId(dataPartitionId: String) {
        cdkBuilder.dataPartitionId(dataPartitionId)
      }

      /**
       * @param maxSampleCount The maximum number of samples to collect.
       */
      override fun maxSampleCount(maxSampleCount: Number) {
        cdkBuilder.maxSampleCount(maxSampleCount)
      }

      /**
       * @param minimumSamplingIntervalMs The minimum duration of time (in milliseconds) between two
       * triggering events to collect data.
       *
       * If a signal changes often, you might want to collect data at a slower rate.
       */
      override fun minimumSamplingIntervalMs(minimumSamplingIntervalMs: Number) {
        cdkBuilder.minimumSamplingIntervalMs(minimumSamplingIntervalMs)
      }

      /**
       * @param name The name of the signal. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty,
    ) : CdkObject(cdkObject),
        SignalInformationProperty {
      /**
       * The ID of the data partition this signal is associated with.
       *
       * The ID must match one of the IDs provided in `dataPartitions` . This is accomplished either
       * by specifying a particular data partition ID or by using `default` for an established default
       * partition. You can establish a default partition in the `DataPartition` data type.
       *
       *
       * If you upload a signal as a condition for a campaign's data partition, the same signal must
       * be included in `signalsToCollect` . &gt; Access to certain AWS IoT FleetWise features is
       * currently gated. For more information, see [AWS Region and feature
       * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
       * in the *AWS IoT FleetWise Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html#cfn-iotfleetwise-campaign-signalinformation-datapartitionid)
       */
      override fun dataPartitionId(): String? = unwrap(this).getDataPartitionId()

      /**
       * The maximum number of samples to collect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html#cfn-iotfleetwise-campaign-signalinformation-maxsamplecount)
       */
      override fun maxSampleCount(): Number? = unwrap(this).getMaxSampleCount()

      /**
       * The minimum duration of time (in milliseconds) between two triggering events to collect
       * data.
       *
       *
       * If a signal changes often, you might want to collect data at a slower rate.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html#cfn-iotfleetwise-campaign-signalinformation-minimumsamplingintervalms)
       */
      override fun minimumSamplingIntervalMs(): Number? =
          unwrap(this).getMinimumSamplingIntervalMs()

      /**
       * The name of the signal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html#cfn-iotfleetwise-campaign-signalinformation-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SignalInformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty):
          SignalInformationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SignalInformationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SignalInformationProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty
    }
  }

  /**
   * The maximum storage size for the data partition.
   *
   *
   * Access to certain AWS IoT FleetWise features is currently gated. For more information, see [AWS
   * Region and feature
   * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
   * in the *AWS IoT FleetWise Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * StorageMaximumSizeProperty storageMaximumSizeProperty = StorageMaximumSizeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-storagemaximumsize.html)
   */
  public interface StorageMaximumSizeProperty {
    /**
     * The data type of the data to store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-storagemaximumsize.html#cfn-iotfleetwise-campaign-storagemaximumsize-unit)
     */
    public fun unit(): String

    /**
     * The maximum amount of time to store data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-storagemaximumsize.html#cfn-iotfleetwise-campaign-storagemaximumsize-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [StorageMaximumSizeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit The data type of the data to store. 
       */
      public fun unit(unit: String)

      /**
       * @param value The maximum amount of time to store data. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMaximumSizeProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMaximumSizeProperty.builder()

      /**
       * @param unit The data type of the data to store. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value The maximum amount of time to store data. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMaximumSizeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMaximumSizeProperty,
    ) : CdkObject(cdkObject),
        StorageMaximumSizeProperty {
      /**
       * The data type of the data to store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-storagemaximumsize.html#cfn-iotfleetwise-campaign-storagemaximumsize-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * The maximum amount of time to store data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-storagemaximumsize.html#cfn-iotfleetwise-campaign-storagemaximumsize-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageMaximumSizeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMaximumSizeProperty):
          StorageMaximumSizeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageMaximumSizeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageMaximumSizeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMaximumSizeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMaximumSizeProperty
    }
  }

  /**
   * Information about the minimum amount of time that data will be kept.
   *
   *
   * Access to certain AWS IoT FleetWise features is currently gated. For more information, see [AWS
   * Region and feature
   * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
   * in the *AWS IoT FleetWise Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * StorageMinimumTimeToLiveProperty storageMinimumTimeToLiveProperty =
   * StorageMinimumTimeToLiveProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-storageminimumtimetolive.html)
   */
  public interface StorageMinimumTimeToLiveProperty {
    /**
     * The time increment type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-storageminimumtimetolive.html#cfn-iotfleetwise-campaign-storageminimumtimetolive-unit)
     */
    public fun unit(): String

    /**
     * The minimum amount of time to store the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-storageminimumtimetolive.html#cfn-iotfleetwise-campaign-storageminimumtimetolive-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [StorageMinimumTimeToLiveProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit The time increment type. 
       */
      public fun unit(unit: String)

      /**
       * @param value The minimum amount of time to store the data. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMinimumTimeToLiveProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMinimumTimeToLiveProperty.builder()

      /**
       * @param unit The time increment type. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value The minimum amount of time to store the data. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMinimumTimeToLiveProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMinimumTimeToLiveProperty,
    ) : CdkObject(cdkObject),
        StorageMinimumTimeToLiveProperty {
      /**
       * The time increment type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-storageminimumtimetolive.html#cfn-iotfleetwise-campaign-storageminimumtimetolive-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * The minimum amount of time to store the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-storageminimumtimetolive.html#cfn-iotfleetwise-campaign-storageminimumtimetolive-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageMinimumTimeToLiveProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMinimumTimeToLiveProperty):
          StorageMinimumTimeToLiveProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageMinimumTimeToLiveProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageMinimumTimeToLiveProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMinimumTimeToLiveProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.StorageMinimumTimeToLiveProperty
    }
  }

  /**
   * Information about a collection scheme that uses a time period to decide how often to collect
   * data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * TimeBasedCollectionSchemeProperty timeBasedCollectionSchemeProperty =
   * TimeBasedCollectionSchemeProperty.builder()
   * .periodMs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timebasedcollectionscheme.html)
   */
  public interface TimeBasedCollectionSchemeProperty {
    /**
     * The time period (in milliseconds) to decide how often to collect data.
     *
     * For example, if the time period is `60000` , the Edge Agent software collects data once every
     * minute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timebasedcollectionscheme.html#cfn-iotfleetwise-campaign-timebasedcollectionscheme-periodms)
     */
    public fun periodMs(): Number

    /**
     * A builder for [TimeBasedCollectionSchemeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param periodMs The time period (in milliseconds) to decide how often to collect data. 
       * For example, if the time period is `60000` , the Edge Agent software collects data once
       * every minute.
       */
      public fun periodMs(periodMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty.builder()

      /**
       * @param periodMs The time period (in milliseconds) to decide how often to collect data. 
       * For example, if the time period is `60000` , the Edge Agent software collects data once
       * every minute.
       */
      override fun periodMs(periodMs: Number) {
        cdkBuilder.periodMs(periodMs)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty,
    ) : CdkObject(cdkObject),
        TimeBasedCollectionSchemeProperty {
      /**
       * The time period (in milliseconds) to decide how often to collect data.
       *
       * For example, if the time period is `60000` , the Edge Agent software collects data once
       * every minute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timebasedcollectionscheme.html#cfn-iotfleetwise-campaign-timebasedcollectionscheme-periodms)
       */
      override fun periodMs(): Number = unwrap(this).getPeriodMs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TimeBasedCollectionSchemeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty):
          TimeBasedCollectionSchemeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TimeBasedCollectionSchemeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedCollectionSchemeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty
    }
  }

  /**
   * Used to configure a frequency-based vehicle signal fetch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * TimeBasedSignalFetchConfigProperty timeBasedSignalFetchConfigProperty =
   * TimeBasedSignalFetchConfigProperty.builder()
   * .executionFrequencyMs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timebasedsignalfetchconfig.html)
   */
  public interface TimeBasedSignalFetchConfigProperty {
    /**
     * The frequency with which the signal fetch will be executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timebasedsignalfetchconfig.html#cfn-iotfleetwise-campaign-timebasedsignalfetchconfig-executionfrequencyms)
     */
    public fun executionFrequencyMs(): Number

    /**
     * A builder for [TimeBasedSignalFetchConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executionFrequencyMs The frequency with which the signal fetch will be executed. 
       */
      public fun executionFrequencyMs(executionFrequencyMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedSignalFetchConfigProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedSignalFetchConfigProperty.builder()

      /**
       * @param executionFrequencyMs The frequency with which the signal fetch will be executed. 
       */
      override fun executionFrequencyMs(executionFrequencyMs: Number) {
        cdkBuilder.executionFrequencyMs(executionFrequencyMs)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedSignalFetchConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedSignalFetchConfigProperty,
    ) : CdkObject(cdkObject),
        TimeBasedSignalFetchConfigProperty {
      /**
       * The frequency with which the signal fetch will be executed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timebasedsignalfetchconfig.html#cfn-iotfleetwise-campaign-timebasedsignalfetchconfig-executionfrequencyms)
       */
      override fun executionFrequencyMs(): Number = unwrap(this).getExecutionFrequencyMs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TimeBasedSignalFetchConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedSignalFetchConfigProperty):
          TimeBasedSignalFetchConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TimeBasedSignalFetchConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedSignalFetchConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedSignalFetchConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedSignalFetchConfigProperty
    }
  }

  /**
   * The Amazon Timestream table where the AWS IoT FleetWise campaign sends data.
   *
   * Timestream stores and organizes data to optimize query processing time and to reduce storage
   * costs. For more information, see [Data
   * modeling](https://docs.aws.amazon.com/timestream/latest/developerguide/data-modeling.html) in the
   * *Amazon Timestream Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * TimestreamConfigProperty timestreamConfigProperty = TimestreamConfigProperty.builder()
   * .executionRoleArn("executionRoleArn")
   * .timestreamTableArn("timestreamTableArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timestreamconfig.html)
   */
  public interface TimestreamConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the task execution role that grants AWS IoT FleetWise
     * permission to deliver data to the Amazon Timestream table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timestreamconfig.html#cfn-iotfleetwise-campaign-timestreamconfig-executionrolearn)
     */
    public fun executionRoleArn(): String

    /**
     * The Amazon Resource Name (ARN) of the Amazon Timestream table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timestreamconfig.html#cfn-iotfleetwise-campaign-timestreamconfig-timestreamtablearn)
     */
    public fun timestreamTableArn(): String

    /**
     * A builder for [TimestreamConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that
       * grants AWS IoT FleetWise permission to deliver data to the Amazon Timestream table. 
       */
      public fun executionRoleArn(executionRoleArn: String)

      /**
       * @param timestreamTableArn The Amazon Resource Name (ARN) of the Amazon Timestream table. 
       */
      public fun timestreamTableArn(timestreamTableArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty.builder()

      /**
       * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that
       * grants AWS IoT FleetWise permission to deliver data to the Amazon Timestream table. 
       */
      override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      /**
       * @param timestreamTableArn The Amazon Resource Name (ARN) of the Amazon Timestream table. 
       */
      override fun timestreamTableArn(timestreamTableArn: String) {
        cdkBuilder.timestreamTableArn(timestreamTableArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty,
    ) : CdkObject(cdkObject),
        TimestreamConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the task execution role that grants AWS IoT FleetWise
       * permission to deliver data to the Amazon Timestream table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timestreamconfig.html#cfn-iotfleetwise-campaign-timestreamconfig-executionrolearn)
       */
      override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

      /**
       * The Amazon Resource Name (ARN) of the Amazon Timestream table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timestreamconfig.html#cfn-iotfleetwise-campaign-timestreamconfig-timestreamtablearn)
       */
      override fun timestreamTableArn(): String = unwrap(this).getTimestreamTableArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty):
          TimestreamConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TimestreamConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty
    }
  }
}
