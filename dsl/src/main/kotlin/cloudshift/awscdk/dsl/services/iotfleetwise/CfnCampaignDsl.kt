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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import software.constructs.Construct

/**
 * Creates an orchestration of data collection rules.
 *
 * The AWS IoT FleetWise Edge Agent software running in vehicles uses campaigns to decide how to
 * collect and transfer data to the cloud. You create campaigns in the cloud. After you or your team
 * approve campaigns, AWS IoT FleetWise automatically deploys them to vehicles.
 *
 * For more information, see
 * [Collect and transfer data with campaigns](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/campaigns.html)
 * in the *AWS IoT FleetWise Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * CfnCampaign cfnCampaign = CfnCampaign.Builder.create(this, "MyCfnCampaign")
 * .action("action")
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
 * .compression("compression")
 * .dataDestinationConfigs(List.of(DataDestinationConfigProperty.builder()
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
 * .description("description")
 * .diagnosticsMode("diagnosticsMode")
 * .expiryTime("expiryTime")
 * .postTriggerCollectionDuration(123)
 * .priority(123)
 * .signalsToCollect(List.of(SignalInformationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .maxSampleCount(123)
 * .minimumSamplingIntervalMs(123)
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
@CdkDslMarker
public class CfnCampaignDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCampaign.Builder = CfnCampaign.Builder.create(scope, id)

    private val _dataDestinationConfigs: MutableList<Any> = mutableListOf()

    private val _dataExtraDimensions: MutableList<String> = mutableListOf()

    private val _signalsToCollect: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies how to update a campaign. The action can be one of the following:.
     * * `APPROVE` - To approve delivering a data collection scheme to vehicles.
     * * `SUSPEND` - To suspend collecting signal data. The campaign is deleted from vehicles and
     *   all vehicles in the suspended campaign will stop sending data.
     * * `RESUME` - To reactivate the `SUSPEND` campaign. The campaign is redeployed to all vehicles
     *   and the vehicles will resume sending data.
     * * `UPDATE` - To update a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-action)
     *
     * @param action Specifies how to update a campaign. The action can be one of the following:.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * The data collection scheme associated with the campaign.
     *
     * You can specify a scheme that collects data based on time or an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-collectionscheme)
     *
     * @param collectionScheme The data collection scheme associated with the campaign.
     */
    public fun collectionScheme(collectionScheme: IResolvable) {
        cdkBuilder.collectionScheme(collectionScheme)
    }

    /**
     * The data collection scheme associated with the campaign.
     *
     * You can specify a scheme that collects data based on time or an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-collectionscheme)
     *
     * @param collectionScheme The data collection scheme associated with the campaign.
     */
    public fun collectionScheme(collectionScheme: CfnCampaign.CollectionSchemeProperty) {
        cdkBuilder.collectionScheme(collectionScheme)
    }

    /**
     * (Optional) Whether to compress signals before transmitting data to AWS IoT FleetWise .
     *
     * If you don't want to compress the signals, use `OFF` . If it's not specified, `SNAPPY` is
     * used.
     *
     * Default: `SNAPPY`
     *
     * Default: - "OFF"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-compression)
     *
     * @param compression (Optional) Whether to compress signals before transmitting data to AWS IoT
     *   FleetWise .
     */
    public fun compression(compression: String) {
        cdkBuilder.compression(compression)
    }

    /**
     * (Optional) The destination where the campaign sends data.
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
     *
     * @param dataDestinationConfigs (Optional) The destination where the campaign sends data.
     */
    public fun dataDestinationConfigs(vararg dataDestinationConfigs: Any) {
        _dataDestinationConfigs.addAll(listOf(*dataDestinationConfigs))
    }

    /**
     * (Optional) The destination where the campaign sends data.
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
     *
     * @param dataDestinationConfigs (Optional) The destination where the campaign sends data.
     */
    public fun dataDestinationConfigs(dataDestinationConfigs: Collection<Any>) {
        _dataDestinationConfigs.addAll(dataDestinationConfigs)
    }

    /**
     * (Optional) The destination where the campaign sends data.
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
     *
     * @param dataDestinationConfigs (Optional) The destination where the campaign sends data.
     */
    public fun dataDestinationConfigs(dataDestinationConfigs: IResolvable) {
        cdkBuilder.dataDestinationConfigs(dataDestinationConfigs)
    }

    /**
     * (Optional) A list of vehicle attributes to associate with a campaign.
     *
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions
     * in Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-dataextradimensions)
     *
     * @param dataExtraDimensions (Optional) A list of vehicle attributes to associate with a
     *   campaign.
     */
    public fun dataExtraDimensions(vararg dataExtraDimensions: String) {
        _dataExtraDimensions.addAll(listOf(*dataExtraDimensions))
    }

    /**
     * (Optional) A list of vehicle attributes to associate with a campaign.
     *
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions
     * in Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-dataextradimensions)
     *
     * @param dataExtraDimensions (Optional) A list of vehicle attributes to associate with a
     *   campaign.
     */
    public fun dataExtraDimensions(dataExtraDimensions: Collection<String>) {
        _dataExtraDimensions.addAll(dataExtraDimensions)
    }

    /**
     * (Optional) The description of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-description)
     *
     * @param description (Optional) The description of the campaign.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * (Optional) Option for a vehicle to send diagnostic trouble codes to AWS IoT FleetWise .
     *
     * If you want to send diagnostic trouble codes, use `SEND_ACTIVE_DTCS` . If it's not specified,
     * `OFF` is used.
     *
     * Default: `OFF`
     *
     * Default: - "OFF"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-diagnosticsmode)
     *
     * @param diagnosticsMode (Optional) Option for a vehicle to send diagnostic trouble codes to
     *   AWS IoT FleetWise .
     */
    public fun diagnosticsMode(diagnosticsMode: String) {
        cdkBuilder.diagnosticsMode(diagnosticsMode)
    }

    /**
     * (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight
     * UTC time).
     *
     * Vehicle data isn't collected after the campaign expires.
     *
     * Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     *
     * Default: - "253402214400"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-expirytime)
     *
     * @param expiryTime (Optional) The time the campaign expires, in seconds since epoch (January
     *   1, 1970 at midnight UTC time).
     */
    public fun expiryTime(expiryTime: String) {
        cdkBuilder.expiryTime(expiryTime)
    }

    /**
     * The name of a campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-name)
     *
     * @param name The name of a campaign.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates
     * the collection.
     *
     * If it's not specified, `0` is used.
     *
     * Default: `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-posttriggercollectionduration)
     *
     * @param postTriggerCollectionDuration (Optional) How long (in milliseconds) to collect raw
     *   data after a triggering event initiates the collection.
     */
    public fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number) {
        cdkBuilder.postTriggerCollectionDuration(postTriggerCollectionDuration)
    }

    /**
     * (Optional) A number indicating the priority of one campaign over another campaign for a
     * certain vehicle or fleet.
     *
     * A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's
     * not specified, `0` is used.
     *
     * Default: `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-priority)
     *
     * @param priority (Optional) A number indicating the priority of one campaign over another
     *   campaign for a certain vehicle or fleet.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalcatalogarn)
     *
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     *   the campaign.
     */
    public fun signalCatalogArn(signalCatalogArn: String) {
        cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * (Optional) A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     *
     * @param signalsToCollect (Optional) A list of information about signals to collect.
     */
    public fun signalsToCollect(vararg signalsToCollect: Any) {
        _signalsToCollect.addAll(listOf(*signalsToCollect))
    }

    /**
     * (Optional) A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     *
     * @param signalsToCollect (Optional) A list of information about signals to collect.
     */
    public fun signalsToCollect(signalsToCollect: Collection<Any>) {
        _signalsToCollect.addAll(signalsToCollect)
    }

    /**
     * (Optional) A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     *
     * @param signalsToCollect (Optional) A list of information about signals to collect.
     */
    public fun signalsToCollect(signalsToCollect: IResolvable) {
        cdkBuilder.signalsToCollect(signalsToCollect)
    }

    /**
     * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud.
     *
     * After a connection is re-established, the data is automatically forwarded to AWS IoT
     * FleetWise . If you want to store collected data when a vehicle loses connection with the
     * cloud, use `TO_DISK` . If it's not specified, `OFF` is used.
     *
     * Default: `OFF`
     *
     * Default: - "OFF"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-spoolingmode)
     *
     * @param spoolingMode (Optional) Whether to store collected data after a vehicle lost a
     *   connection with the cloud.
     */
    public fun spoolingMode(spoolingMode: String) {
        cdkBuilder.spoolingMode(spoolingMode)
    }

    /**
     * (Optional) The time, in milliseconds, to deliver a campaign after it was approved.
     *
     * If it's not specified, `0` is used.
     *
     * Default: `0`
     *
     * Default: - "0"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-starttime)
     *
     * @param startTime (Optional) The time, in milliseconds, to deliver a campaign after it was
     *   approved.
     */
    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    /**
     * (Optional) Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     *
     * @param tags (Optional) Metadata that can be used to manage the campaign.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * (Optional) Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     *
     * @param tags (Optional) Metadata that can be used to manage the campaign.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign is deployed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-targetarn)
     *
     * @param targetArn The Amazon Resource Name (ARN) of a vehicle or fleet to which the campaign
     *   is deployed.
     */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnCampaign {
        if (_dataDestinationConfigs.isNotEmpty())
            cdkBuilder.dataDestinationConfigs(_dataDestinationConfigs)
        if (_dataExtraDimensions.isNotEmpty()) cdkBuilder.dataExtraDimensions(_dataExtraDimensions)
        if (_signalsToCollect.isNotEmpty()) cdkBuilder.signalsToCollect(_signalsToCollect)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
