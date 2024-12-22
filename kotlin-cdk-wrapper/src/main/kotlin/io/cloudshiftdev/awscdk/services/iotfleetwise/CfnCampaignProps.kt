@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCampaign`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * CfnCampaignProps cfnCampaignProps = CfnCampaignProps.builder()
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
public interface CfnCampaignProps {
  /**
   * Specifies how to update a campaign. The action can be one of the following:.
   *
   * * `APPROVE` - To approve delivering a data collection scheme to vehicles.
   * * `SUSPEND` - To suspend collecting signal data. The campaign is deleted from vehicles and all
   * vehicles in the suspended campaign will stop sending data.
   * * `RESUME` - To reactivate the `SUSPEND` campaign. The campaign is redeployed to all vehicles
   * and the vehicles will resume sending data.
   * * `UPDATE` - To update a campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-action)
   */
  public fun action(): String? = unwrap(this).getAction()

  /**
   * The data collection scheme associated with the campaign.
   *
   * You can specify a scheme that collects data based on time or an event.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-collectionscheme)
   */
  public fun collectionScheme(): Any

  /**
   * Whether to compress signals before transmitting data to AWS IoT FleetWise .
   *
   * If you don't want to compress the signals, use `OFF` . If it's not specified, `SNAPPY` is used.
   *
   * Default: `SNAPPY`
   *
   * Default: - "OFF"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-compression)
   */
  public fun compression(): String? = unwrap(this).getCompression()

  /**
   * The destination where the campaign sends data.
   *
   * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
   *
   * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use vehicle
   * data, such as data lakes, centralized data storage, data processing pipelines, and analytics. AWS
   * IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is stored on multiple
   * AWS IoT FleetWise servers for redundancy and high availability.
   *
   * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
   * vehicle data so that you can identify trends and patterns.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datadestinationconfigs)
   */
  public fun dataDestinationConfigs(): Any? = unwrap(this).getDataDestinationConfigs()

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
   */
  public fun dataExtraDimensions(): List<String> = unwrap(this).getDataExtraDimensions() ?:
      emptyList()

  /**
   * The data partitions associated with the signals collected from the vehicle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datapartitions)
   */
  public fun dataPartitions(): Any? = unwrap(this).getDataPartitions()

  /**
   * The description of the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun diagnosticsMode(): String? = unwrap(this).getDiagnosticsMode()

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
   */
  public fun expiryTime(): String? = unwrap(this).getExpiryTime()

  /**
   * The name of a campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-name)
   */
  public fun name(): String

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
   */
  public fun postTriggerCollectionDuration(): Number? =
      unwrap(this).getPostTriggerCollectionDuration()

  /**
   * A number indicating the priority of one campaign over another campaign for a certain vehicle or
   * fleet.
   *
   * A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's
   * not specified, `0` is used.
   *
   * Default: `0`
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-priority)
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * The Amazon Resource Name (ARN) of the signal catalog associated with the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalcatalogarn)
   */
  public fun signalCatalogArn(): String

  /**
   * A list of information about signals to collect.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
   */
  public fun signalsToCollect(): Any? = unwrap(this).getSignalsToCollect()

  /**
   * A list of information about signals to fetch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstofetch)
   */
  public fun signalsToFetch(): Any? = unwrap(this).getSignalsToFetch()

  /**
   * Whether to store collected data after a vehicle lost a connection with the cloud.
   *
   * After a connection is re-established, the data is automatically forwarded to AWS IoT FleetWise
   * . If you want to store collected data when a vehicle loses connection with the cloud, use
   * `TO_DISK` . If it's not specified, `OFF` is used.
   *
   * Default: `OFF`
   *
   * Default: - "OFF"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-spoolingmode)
   */
  public fun spoolingMode(): String? = unwrap(this).getSpoolingMode()

  /**
   * The time, in milliseconds, to deliver a campaign after it was approved. If it's not specified,
   * `0` is used.
   *
   * Default: `0`
   *
   * Default: - "0"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-starttime)
   */
  public fun startTime(): String? = unwrap(this).getStartTime()

  /**
   * Metadata that can be used to manage the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign is deployed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-targetarn)
   */
  public fun targetArn(): String

  /**
   * A builder for [CfnCampaignProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action Specifies how to update a campaign. The action can be one of the following:.
     * * `APPROVE` - To approve delivering a data collection scheme to vehicles.
     * * `SUSPEND` - To suspend collecting signal data. The campaign is deleted from vehicles and
     * all vehicles in the suspended campaign will stop sending data.
     * * `RESUME` - To reactivate the `SUSPEND` campaign. The campaign is redeployed to all vehicles
     * and the vehicles will resume sending data.
     * * `UPDATE` - To update a campaign.
     */
    public fun action(action: String)

    /**
     * @param collectionScheme The data collection scheme associated with the campaign. 
     * You can specify a scheme that collects data based on time or an event.
     */
    public fun collectionScheme(collectionScheme: IResolvable)

    /**
     * @param collectionScheme The data collection scheme associated with the campaign. 
     * You can specify a scheme that collects data based on time or an event.
     */
    public fun collectionScheme(collectionScheme: CfnCampaign.CollectionSchemeProperty)

    /**
     * @param collectionScheme The data collection scheme associated with the campaign. 
     * You can specify a scheme that collects data based on time or an event.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3a78aa42b017abf19e8ceda14b40cf5d2d6bdac04d95bbb3a6c568f4882e9e9")
    public
        fun collectionScheme(collectionScheme: CfnCampaign.CollectionSchemeProperty.Builder.() -> Unit)

    /**
     * @param compression Whether to compress signals before transmitting data to AWS IoT FleetWise
     * .
     * If you don't want to compress the signals, use `OFF` . If it's not specified, `SNAPPY` is
     * used.
     *
     * Default: `SNAPPY`
     */
    public fun compression(compression: String)

    /**
     * @param dataDestinationConfigs The destination where the campaign sends data.
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     */
    public fun dataDestinationConfigs(dataDestinationConfigs: IResolvable)

    /**
     * @param dataDestinationConfigs The destination where the campaign sends data.
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     */
    public fun dataDestinationConfigs(dataDestinationConfigs: List<Any>)

    /**
     * @param dataDestinationConfigs The destination where the campaign sends data.
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     */
    public fun dataDestinationConfigs(vararg dataDestinationConfigs: Any)

    /**
     * @param dataExtraDimensions A list of vehicle attributes to associate with a campaign.
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     */
    public fun dataExtraDimensions(dataExtraDimensions: List<String>)

    /**
     * @param dataExtraDimensions A list of vehicle attributes to associate with a campaign.
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     */
    public fun dataExtraDimensions(vararg dataExtraDimensions: String)

    /**
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle.
     */
    public fun dataPartitions(dataPartitions: IResolvable)

    /**
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle.
     */
    public fun dataPartitions(dataPartitions: List<Any>)

    /**
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle.
     */
    public fun dataPartitions(vararg dataPartitions: Any)

    /**
     * @param description The description of the campaign.
     */
    public fun description(description: String)

    /**
     * @param diagnosticsMode Option for a vehicle to send diagnostic trouble codes to AWS IoT
     * FleetWise .
     * If you want to send diagnostic trouble codes, use `SEND_ACTIVE_DTCS` . If it's not specified,
     * `OFF` is used.
     *
     * Default: `OFF`
     */
    public fun diagnosticsMode(diagnosticsMode: String)

    /**
     * @param expiryTime The time the campaign expires, in seconds since epoch (January 1, 1970 at
     * midnight UTC time).
     * Vehicle data isn't collected after the campaign expires.
     *
     * Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     */
    public fun expiryTime(expiryTime: String)

    /**
     * @param name The name of a campaign. 
     */
    public fun name(name: String)

    /**
     * @param postTriggerCollectionDuration How long (in milliseconds) to collect raw data after a
     * triggering event initiates the collection.
     * If it's not specified, `0` is used.
     *
     * Default: `0`
     */
    public fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number)

    /**
     * @param priority A number indicating the priority of one campaign over another campaign for a
     * certain vehicle or fleet.
     * A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's
     * not specified, `0` is used.
     *
     * Default: `0`
     */
    public fun priority(priority: Number)

    /**
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the campaign. 
     */
    public fun signalCatalogArn(signalCatalogArn: String)

    /**
     * @param signalsToCollect A list of information about signals to collect.
     */
    public fun signalsToCollect(signalsToCollect: IResolvable)

    /**
     * @param signalsToCollect A list of information about signals to collect.
     */
    public fun signalsToCollect(signalsToCollect: List<Any>)

    /**
     * @param signalsToCollect A list of information about signals to collect.
     */
    public fun signalsToCollect(vararg signalsToCollect: Any)

    /**
     * @param signalsToFetch A list of information about signals to fetch.
     */
    public fun signalsToFetch(signalsToFetch: IResolvable)

    /**
     * @param signalsToFetch A list of information about signals to fetch.
     */
    public fun signalsToFetch(signalsToFetch: List<Any>)

    /**
     * @param signalsToFetch A list of information about signals to fetch.
     */
    public fun signalsToFetch(vararg signalsToFetch: Any)

    /**
     * @param spoolingMode Whether to store collected data after a vehicle lost a connection with
     * the cloud.
     * After a connection is re-established, the data is automatically forwarded to AWS IoT
     * FleetWise . If you want to store collected data when a vehicle loses connection with the cloud,
     * use `TO_DISK` . If it's not specified, `OFF` is used.
     *
     * Default: `OFF`
     */
    public fun spoolingMode(spoolingMode: String)

    /**
     * @param startTime The time, in milliseconds, to deliver a campaign after it was approved. If
     * it's not specified, `0` is used.
     * Default: `0`
     */
    public fun startTime(startTime: String)

    /**
     * @param tags Metadata that can be used to manage the campaign.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the campaign.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetArn The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign
     * is deployed. 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps.builder()

    /**
     * @param action Specifies how to update a campaign. The action can be one of the following:.
     * * `APPROVE` - To approve delivering a data collection scheme to vehicles.
     * * `SUSPEND` - To suspend collecting signal data. The campaign is deleted from vehicles and
     * all vehicles in the suspended campaign will stop sending data.
     * * `RESUME` - To reactivate the `SUSPEND` campaign. The campaign is redeployed to all vehicles
     * and the vehicles will resume sending data.
     * * `UPDATE` - To update a campaign.
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param collectionScheme The data collection scheme associated with the campaign. 
     * You can specify a scheme that collects data based on time or an event.
     */
    override fun collectionScheme(collectionScheme: IResolvable) {
      cdkBuilder.collectionScheme(collectionScheme.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param collectionScheme The data collection scheme associated with the campaign. 
     * You can specify a scheme that collects data based on time or an event.
     */
    override fun collectionScheme(collectionScheme: CfnCampaign.CollectionSchemeProperty) {
      cdkBuilder.collectionScheme(collectionScheme.let(CfnCampaign.CollectionSchemeProperty.Companion::unwrap))
    }

    /**
     * @param collectionScheme The data collection scheme associated with the campaign. 
     * You can specify a scheme that collects data based on time or an event.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3a78aa42b017abf19e8ceda14b40cf5d2d6bdac04d95bbb3a6c568f4882e9e9")
    override
        fun collectionScheme(collectionScheme: CfnCampaign.CollectionSchemeProperty.Builder.() -> Unit):
        Unit = collectionScheme(CfnCampaign.CollectionSchemeProperty(collectionScheme))

    /**
     * @param compression Whether to compress signals before transmitting data to AWS IoT FleetWise
     * .
     * If you don't want to compress the signals, use `OFF` . If it's not specified, `SNAPPY` is
     * used.
     *
     * Default: `SNAPPY`
     */
    override fun compression(compression: String) {
      cdkBuilder.compression(compression)
    }

    /**
     * @param dataDestinationConfigs The destination where the campaign sends data.
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     */
    override fun dataDestinationConfigs(dataDestinationConfigs: IResolvable) {
      cdkBuilder.dataDestinationConfigs(dataDestinationConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataDestinationConfigs The destination where the campaign sends data.
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     */
    override fun dataDestinationConfigs(dataDestinationConfigs: List<Any>) {
      cdkBuilder.dataDestinationConfigs(dataDestinationConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param dataDestinationConfigs The destination where the campaign sends data.
     * You can choose to send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Amazon S3 optimizes the cost of data storage and provides additional mechanisms to use
     * vehicle data, such as data lakes, centralized data storage, data processing pipelines, and
     * analytics. AWS IoT FleetWise supports at-least-once file delivery to S3. Your vehicle data is
     * stored on multiple AWS IoT FleetWise servers for redundancy and high availability.
     *
     * You can use Amazon Timestream to access and analyze time series data, and Timestream to query
     * vehicle data so that you can identify trends and patterns.
     */
    override fun dataDestinationConfigs(vararg dataDestinationConfigs: Any): Unit =
        dataDestinationConfigs(dataDestinationConfigs.toList())

    /**
     * @param dataExtraDimensions A list of vehicle attributes to associate with a campaign.
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     */
    override fun dataExtraDimensions(dataExtraDimensions: List<String>) {
      cdkBuilder.dataExtraDimensions(dataExtraDimensions)
    }

    /**
     * @param dataExtraDimensions A list of vehicle attributes to associate with a campaign.
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     */
    override fun dataExtraDimensions(vararg dataExtraDimensions: String): Unit =
        dataExtraDimensions(dataExtraDimensions.toList())

    /**
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle.
     */
    override fun dataPartitions(dataPartitions: IResolvable) {
      cdkBuilder.dataPartitions(dataPartitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle.
     */
    override fun dataPartitions(dataPartitions: List<Any>) {
      cdkBuilder.dataPartitions(dataPartitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param dataPartitions The data partitions associated with the signals collected from the
     * vehicle.
     */
    override fun dataPartitions(vararg dataPartitions: Any): Unit =
        dataPartitions(dataPartitions.toList())

    /**
     * @param description The description of the campaign.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param diagnosticsMode Option for a vehicle to send diagnostic trouble codes to AWS IoT
     * FleetWise .
     * If you want to send diagnostic trouble codes, use `SEND_ACTIVE_DTCS` . If it's not specified,
     * `OFF` is used.
     *
     * Default: `OFF`
     */
    override fun diagnosticsMode(diagnosticsMode: String) {
      cdkBuilder.diagnosticsMode(diagnosticsMode)
    }

    /**
     * @param expiryTime The time the campaign expires, in seconds since epoch (January 1, 1970 at
     * midnight UTC time).
     * Vehicle data isn't collected after the campaign expires.
     *
     * Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     */
    override fun expiryTime(expiryTime: String) {
      cdkBuilder.expiryTime(expiryTime)
    }

    /**
     * @param name The name of a campaign. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param postTriggerCollectionDuration How long (in milliseconds) to collect raw data after a
     * triggering event initiates the collection.
     * If it's not specified, `0` is used.
     *
     * Default: `0`
     */
    override fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number) {
      cdkBuilder.postTriggerCollectionDuration(postTriggerCollectionDuration)
    }

    /**
     * @param priority A number indicating the priority of one campaign over another campaign for a
     * certain vehicle or fleet.
     * A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's
     * not specified, `0` is used.
     *
     * Default: `0`
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the campaign. 
     */
    override fun signalCatalogArn(signalCatalogArn: String) {
      cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * @param signalsToCollect A list of information about signals to collect.
     */
    override fun signalsToCollect(signalsToCollect: IResolvable) {
      cdkBuilder.signalsToCollect(signalsToCollect.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param signalsToCollect A list of information about signals to collect.
     */
    override fun signalsToCollect(signalsToCollect: List<Any>) {
      cdkBuilder.signalsToCollect(signalsToCollect.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param signalsToCollect A list of information about signals to collect.
     */
    override fun signalsToCollect(vararg signalsToCollect: Any): Unit =
        signalsToCollect(signalsToCollect.toList())

    /**
     * @param signalsToFetch A list of information about signals to fetch.
     */
    override fun signalsToFetch(signalsToFetch: IResolvable) {
      cdkBuilder.signalsToFetch(signalsToFetch.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param signalsToFetch A list of information about signals to fetch.
     */
    override fun signalsToFetch(signalsToFetch: List<Any>) {
      cdkBuilder.signalsToFetch(signalsToFetch.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param signalsToFetch A list of information about signals to fetch.
     */
    override fun signalsToFetch(vararg signalsToFetch: Any): Unit =
        signalsToFetch(signalsToFetch.toList())

    /**
     * @param spoolingMode Whether to store collected data after a vehicle lost a connection with
     * the cloud.
     * After a connection is re-established, the data is automatically forwarded to AWS IoT
     * FleetWise . If you want to store collected data when a vehicle loses connection with the cloud,
     * use `TO_DISK` . If it's not specified, `OFF` is used.
     *
     * Default: `OFF`
     */
    override fun spoolingMode(spoolingMode: String) {
      cdkBuilder.spoolingMode(spoolingMode)
    }

    /**
     * @param startTime The time, in milliseconds, to deliver a campaign after it was approved. If
     * it's not specified, `0` is used.
     * Default: `0`
     */
    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * @param tags Metadata that can be used to manage the campaign.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the campaign.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetArn The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign
     * is deployed. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps,
  ) : CdkObject(cdkObject),
      CfnCampaignProps {
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
     */
    override fun action(): String? = unwrap(this).getAction()

    /**
     * The data collection scheme associated with the campaign.
     *
     * You can specify a scheme that collects data based on time or an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-collectionscheme)
     */
    override fun collectionScheme(): Any = unwrap(this).getCollectionScheme()

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
     */
    override fun compression(): String? = unwrap(this).getCompression()

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
     */
    override fun dataDestinationConfigs(): Any? = unwrap(this).getDataDestinationConfigs()

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
     */
    override fun dataExtraDimensions(): List<String> = unwrap(this).getDataExtraDimensions() ?:
        emptyList()

    /**
     * The data partitions associated with the signals collected from the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-datapartitions)
     */
    override fun dataPartitions(): Any? = unwrap(this).getDataPartitions()

    /**
     * The description of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun diagnosticsMode(): String? = unwrap(this).getDiagnosticsMode()

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
     */
    override fun expiryTime(): String? = unwrap(this).getExpiryTime()

    /**
     * The name of a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-name)
     */
    override fun name(): String = unwrap(this).getName()

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
     */
    override fun postTriggerCollectionDuration(): Number? =
        unwrap(this).getPostTriggerCollectionDuration()

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
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalcatalogarn)
     */
    override fun signalCatalogArn(): String = unwrap(this).getSignalCatalogArn()

    /**
     * A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     */
    override fun signalsToCollect(): Any? = unwrap(this).getSignalsToCollect()

    /**
     * A list of information about signals to fetch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstofetch)
     */
    override fun signalsToFetch(): Any? = unwrap(this).getSignalsToFetch()

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
     */
    override fun spoolingMode(): String? = unwrap(this).getSpoolingMode()

    /**
     * The time, in milliseconds, to deliver a campaign after it was approved. If it's not
     * specified, `0` is used.
     *
     * Default: `0`
     *
     * Default: - "0"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-starttime)
     */
    override fun startTime(): String? = unwrap(this).getStartTime()

    /**
     * Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign is deployed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-targetarn)
     */
    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCampaignProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps):
        CfnCampaignProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCampaignProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCampaignProps):
        software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps
  }
}
