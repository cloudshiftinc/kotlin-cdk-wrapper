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
 * For more information, see [Collect and transfer data with
 * campaigns](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/campaigns.html) in the
 * *AWS IoT FleetWise Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
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
public open class CfnCampaign internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Specifies how to update a campaign.
   *
   * The action can be one of the following:.
   */
  public open fun action(): String = unwrap(this).getAction()

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
    unwrap(this).setCollectionScheme(`value`.let(IResolvable::unwrap))
  }

  /**
   * The data collection scheme associated with the campaign.
   */
  public open fun collectionScheme(`value`: CollectionSchemeProperty) {
    unwrap(this).setCollectionScheme(`value`.let(CollectionSchemeProperty::unwrap))
  }

  /**
   * The data collection scheme associated with the campaign.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe7179166329cb94f995f1cfded061bed66608388e53c06cfa9ec3f60eef345b")
  public open fun collectionScheme(`value`: CollectionSchemeProperty.Builder.() -> Unit): Unit =
      collectionScheme(CollectionSchemeProperty(`value`))

  /**
   * (Optional) Whether to compress signals before transmitting data to AWS IoT FleetWise .
   */
  public open fun compression(): String? = unwrap(this).getCompression()

  /**
   * (Optional) Whether to compress signals before transmitting data to AWS IoT FleetWise .
   */
  public open fun compression(`value`: String) {
    unwrap(this).setCompression(`value`)
  }

  /**
   * (Optional) The destination where the campaign sends data.
   */
  public open fun dataDestinationConfigs(): Any? = unwrap(this).getDataDestinationConfigs()

  /**
   * (Optional) The destination where the campaign sends data.
   */
  public open fun dataDestinationConfigs(`value`: IResolvable) {
    unwrap(this).setDataDestinationConfigs(`value`.let(IResolvable::unwrap))
  }

  /**
   * (Optional) The destination where the campaign sends data.
   */
  public open fun dataDestinationConfigs(_idx_ac66f0: List<Any>) {
    unwrap(this).setDataDestinationConfigs(_idx_ac66f0)
  }

  /**
   * (Optional) The destination where the campaign sends data.
   */
  public open fun dataDestinationConfigs(vararg _idx_ac66f0: Any): Unit =
      dataDestinationConfigs(_idx_ac66f0.toList())

  /**
   * (Optional) A list of vehicle attributes to associate with a campaign.
   */
  public open fun dataExtraDimensions(): List<String> = unwrap(this).getDataExtraDimensions() ?:
      emptyList()

  /**
   * (Optional) A list of vehicle attributes to associate with a campaign.
   */
  public open fun dataExtraDimensions(`value`: List<String>) {
    unwrap(this).setDataExtraDimensions(`value`)
  }

  /**
   * (Optional) A list of vehicle attributes to associate with a campaign.
   */
  public open fun dataExtraDimensions(vararg `value`: String): Unit =
      dataExtraDimensions(`value`.toList())

  /**
   * (Optional) The description of the campaign.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * (Optional) The description of the campaign.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * (Optional) Option for a vehicle to send diagnostic trouble codes to AWS IoT FleetWise .
   */
  public open fun diagnosticsMode(): String? = unwrap(this).getDiagnosticsMode()

  /**
   * (Optional) Option for a vehicle to send diagnostic trouble codes to AWS IoT FleetWise .
   */
  public open fun diagnosticsMode(`value`: String) {
    unwrap(this).setDiagnosticsMode(`value`)
  }

  /**
   * (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight
   * UTC time).
   */
  public open fun expiryTime(): String? = unwrap(this).getExpiryTime()

  /**
   * (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight
   * UTC time).
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
   * (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates
   * the collection.
   */
  public open fun postTriggerCollectionDuration(): Number? =
      unwrap(this).getPostTriggerCollectionDuration()

  /**
   * (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates
   * the collection.
   */
  public open fun postTriggerCollectionDuration(`value`: Number) {
    unwrap(this).setPostTriggerCollectionDuration(`value`)
  }

  /**
   * (Optional) A number indicating the priority of one campaign over another campaign for a certain
   * vehicle or fleet.
   */
  public open fun priority(): Number? = unwrap(this).getPriority()

  /**
   * (Optional) A number indicating the priority of one campaign over another campaign for a certain
   * vehicle or fleet.
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
   * (Optional) A list of information about signals to collect.
   */
  public open fun signalsToCollect(): Any? = unwrap(this).getSignalsToCollect()

  /**
   * (Optional) A list of information about signals to collect.
   */
  public open fun signalsToCollect(`value`: IResolvable) {
    unwrap(this).setSignalsToCollect(`value`.let(IResolvable::unwrap))
  }

  /**
   * (Optional) A list of information about signals to collect.
   */
  public open fun signalsToCollect(_idx_ac66f0: List<Any>) {
    unwrap(this).setSignalsToCollect(_idx_ac66f0)
  }

  /**
   * (Optional) A list of information about signals to collect.
   */
  public open fun signalsToCollect(vararg _idx_ac66f0: Any): Unit =
      signalsToCollect(_idx_ac66f0.toList())

  /**
   * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud.
   */
  public open fun spoolingMode(): String? = unwrap(this).getSpoolingMode()

  /**
   * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud.
   */
  public open fun spoolingMode(`value`: String) {
    unwrap(this).setSpoolingMode(`value`)
  }

  /**
   * (Optional) The time, in milliseconds, to deliver a campaign after it was approved.
   */
  public open fun startTime(): String? = unwrap(this).getStartTime()

  /**
   * (Optional) The time, in milliseconds, to deliver a campaign after it was approved.
   */
  public open fun startTime(`value`: String) {
    unwrap(this).setStartTime(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * (Optional) Metadata that can be used to manage the campaign.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * (Optional) Metadata that can be used to manage the campaign.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * (Optional) Metadata that can be used to manage the campaign.
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
     * @param compression (Optional) Whether to compress signals before transmitting data to AWS IoT
     * FleetWise . 
     */
    public fun compression(compression: String)

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
     * @param dataDestinationConfigs (Optional) The destination where the campaign sends data. 
     */
    public fun dataDestinationConfigs(dataDestinationConfigs: IResolvable)

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
     * @param dataDestinationConfigs (Optional) The destination where the campaign sends data. 
     */
    public fun dataDestinationConfigs(dataDestinationConfigs: List<Any>)

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
     * @param dataDestinationConfigs (Optional) The destination where the campaign sends data. 
     */
    public fun dataDestinationConfigs(vararg dataDestinationConfigs: Any)

    /**
     * (Optional) A list of vehicle attributes to associate with a campaign.
     *
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-dataextradimensions)
     * @param dataExtraDimensions (Optional) A list of vehicle attributes to associate with a
     * campaign. 
     */
    public fun dataExtraDimensions(dataExtraDimensions: List<String>)

    /**
     * (Optional) A list of vehicle attributes to associate with a campaign.
     *
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-dataextradimensions)
     * @param dataExtraDimensions (Optional) A list of vehicle attributes to associate with a
     * campaign. 
     */
    public fun dataExtraDimensions(vararg dataExtraDimensions: String)

    /**
     * (Optional) The description of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-description)
     * @param description (Optional) The description of the campaign. 
     */
    public fun description(description: String)

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
     * @param diagnosticsMode (Optional) Option for a vehicle to send diagnostic trouble codes to
     * AWS IoT FleetWise . 
     */
    public fun diagnosticsMode(diagnosticsMode: String)

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
     * @param expiryTime (Optional) The time the campaign expires, in seconds since epoch (January
     * 1, 1970 at midnight UTC time). 
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
     * @param postTriggerCollectionDuration (Optional) How long (in milliseconds) to collect raw
     * data after a triggering event initiates the collection. 
     */
    public fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number)

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
     * @param priority (Optional) A number indicating the priority of one campaign over another
     * campaign for a certain vehicle or fleet. 
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
     * (Optional) A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect (Optional) A list of information about signals to collect. 
     */
    public fun signalsToCollect(signalsToCollect: IResolvable)

    /**
     * (Optional) A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect (Optional) A list of information about signals to collect. 
     */
    public fun signalsToCollect(signalsToCollect: List<Any>)

    /**
     * (Optional) A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect (Optional) A list of information about signals to collect. 
     */
    public fun signalsToCollect(vararg signalsToCollect: Any)

    /**
     * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud.
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
     * @param spoolingMode (Optional) Whether to store collected data after a vehicle lost a
     * connection with the cloud. 
     */
    public fun spoolingMode(spoolingMode: String)

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
     * @param startTime (Optional) The time, in milliseconds, to deliver a campaign after it was
     * approved. 
     */
    public fun startTime(startTime: String)

    /**
     * (Optional) Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     * @param tags (Optional) Metadata that can be used to manage the campaign. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * (Optional) Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     * @param tags (Optional) Metadata that can be used to manage the campaign. 
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
      cdkBuilder.collectionScheme(collectionScheme.let(IResolvable::unwrap))
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
      cdkBuilder.collectionScheme(collectionScheme.let(CollectionSchemeProperty::unwrap))
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
     * @param compression (Optional) Whether to compress signals before transmitting data to AWS IoT
     * FleetWise . 
     */
    override fun compression(compression: String) {
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
     * @param dataDestinationConfigs (Optional) The destination where the campaign sends data. 
     */
    override fun dataDestinationConfigs(dataDestinationConfigs: IResolvable) {
      cdkBuilder.dataDestinationConfigs(dataDestinationConfigs.let(IResolvable::unwrap))
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
     * @param dataDestinationConfigs (Optional) The destination where the campaign sends data. 
     */
    override fun dataDestinationConfigs(dataDestinationConfigs: List<Any>) {
      cdkBuilder.dataDestinationConfigs(dataDestinationConfigs)
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
     * @param dataDestinationConfigs (Optional) The destination where the campaign sends data. 
     */
    override fun dataDestinationConfigs(vararg dataDestinationConfigs: Any): Unit =
        dataDestinationConfigs(dataDestinationConfigs.toList())

    /**
     * (Optional) A list of vehicle attributes to associate with a campaign.
     *
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-dataextradimensions)
     * @param dataExtraDimensions (Optional) A list of vehicle attributes to associate with a
     * campaign. 
     */
    override fun dataExtraDimensions(dataExtraDimensions: List<String>) {
      cdkBuilder.dataExtraDimensions(dataExtraDimensions)
    }

    /**
     * (Optional) A list of vehicle attributes to associate with a campaign.
     *
     * Enrich the data with specified vehicle attributes. For example, add `make` and `model` to the
     * campaign, and AWS IoT FleetWise will associate the data with those attributes as dimensions in
     * Amazon Timestream . You can then query the data against `make` and `model` .
     *
     * Default: An empty array
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-dataextradimensions)
     * @param dataExtraDimensions (Optional) A list of vehicle attributes to associate with a
     * campaign. 
     */
    override fun dataExtraDimensions(vararg dataExtraDimensions: String): Unit =
        dataExtraDimensions(dataExtraDimensions.toList())

    /**
     * (Optional) The description of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-description)
     * @param description (Optional) The description of the campaign. 
     */
    override fun description(description: String) {
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
     * @param diagnosticsMode (Optional) Option for a vehicle to send diagnostic trouble codes to
     * AWS IoT FleetWise . 
     */
    override fun diagnosticsMode(diagnosticsMode: String) {
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
     * @param expiryTime (Optional) The time the campaign expires, in seconds since epoch (January
     * 1, 1970 at midnight UTC time). 
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
     * @param postTriggerCollectionDuration (Optional) How long (in milliseconds) to collect raw
     * data after a triggering event initiates the collection. 
     */
    override fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number) {
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
     * @param priority (Optional) A number indicating the priority of one campaign over another
     * campaign for a certain vehicle or fleet. 
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
     * (Optional) A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect (Optional) A list of information about signals to collect. 
     */
    override fun signalsToCollect(signalsToCollect: IResolvable) {
      cdkBuilder.signalsToCollect(signalsToCollect.let(IResolvable::unwrap))
    }

    /**
     * (Optional) A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect (Optional) A list of information about signals to collect. 
     */
    override fun signalsToCollect(signalsToCollect: List<Any>) {
      cdkBuilder.signalsToCollect(signalsToCollect)
    }

    /**
     * (Optional) A list of information about signals to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-signalstocollect)
     * @param signalsToCollect (Optional) A list of information about signals to collect. 
     */
    override fun signalsToCollect(vararg signalsToCollect: Any): Unit =
        signalsToCollect(signalsToCollect.toList())

    /**
     * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud.
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
     * @param spoolingMode (Optional) Whether to store collected data after a vehicle lost a
     * connection with the cloud. 
     */
    override fun spoolingMode(spoolingMode: String) {
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
     * @param startTime (Optional) The time, in milliseconds, to deliver a campaign after it was
     * approved. 
     */
    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * (Optional) Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     * @param tags (Optional) Metadata that can be used to manage the campaign. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * (Optional) Metadata that can be used to manage the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-campaign.html#cfn-iotfleetwise-campaign-tags)
     * @param tags (Optional) Metadata that can be used to manage the campaign. 
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
        software.amazon.awscdk.services.iotfleetwise.CfnCampaign = wrapped.cdkObject
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
      override val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty,
    ) : CdkObject(cdkObject), TimeBasedCollectionSchemeProperty {
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
          TimeBasedCollectionSchemeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedCollectionSchemeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty
    }
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
     * (Optional) Information about a collection scheme that uses a simple logical expression to
     * recognize what data to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-collectionscheme.html#cfn-iotfleetwise-campaign-collectionscheme-conditionbasedcollectionscheme)
     */
    public fun conditionBasedCollectionScheme(): Any? =
        unwrap(this).getConditionBasedCollectionScheme()

    /**
     * (Optional) Information about a collection scheme that uses a time period to decide how often
     * to collect data.
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
       * @param conditionBasedCollectionScheme (Optional) Information about a collection scheme that
       * uses a simple logical expression to recognize what data to collect.
       */
      public fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: IResolvable)

      /**
       * @param conditionBasedCollectionScheme (Optional) Information about a collection scheme that
       * uses a simple logical expression to recognize what data to collect.
       */
      public
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty)

      /**
       * @param conditionBasedCollectionScheme (Optional) Information about a collection scheme that
       * uses a simple logical expression to recognize what data to collect.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1df1e2b1bf841c9ce4e9b5e01afaaea56630c36b5a28789a4f8544aa030e0e3")
      public
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty.Builder.() -> Unit)

      /**
       * @param timeBasedCollectionScheme (Optional) Information about a collection scheme that uses
       * a time period to decide how often to collect data.
       */
      public fun timeBasedCollectionScheme(timeBasedCollectionScheme: IResolvable)

      /**
       * @param timeBasedCollectionScheme (Optional) Information about a collection scheme that uses
       * a time period to decide how often to collect data.
       */
      public
          fun timeBasedCollectionScheme(timeBasedCollectionScheme: TimeBasedCollectionSchemeProperty)

      /**
       * @param timeBasedCollectionScheme (Optional) Information about a collection scheme that uses
       * a time period to decide how often to collect data.
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
       * @param conditionBasedCollectionScheme (Optional) Information about a collection scheme that
       * uses a simple logical expression to recognize what data to collect.
       */
      override fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: IResolvable) {
        cdkBuilder.conditionBasedCollectionScheme(conditionBasedCollectionScheme.let(IResolvable::unwrap))
      }

      /**
       * @param conditionBasedCollectionScheme (Optional) Information about a collection scheme that
       * uses a simple logical expression to recognize what data to collect.
       */
      override
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty) {
        cdkBuilder.conditionBasedCollectionScheme(conditionBasedCollectionScheme.let(ConditionBasedCollectionSchemeProperty::unwrap))
      }

      /**
       * @param conditionBasedCollectionScheme (Optional) Information about a collection scheme that
       * uses a simple logical expression to recognize what data to collect.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1df1e2b1bf841c9ce4e9b5e01afaaea56630c36b5a28789a4f8544aa030e0e3")
      override
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty.Builder.() -> Unit):
          Unit =
          conditionBasedCollectionScheme(ConditionBasedCollectionSchemeProperty(conditionBasedCollectionScheme))

      /**
       * @param timeBasedCollectionScheme (Optional) Information about a collection scheme that uses
       * a time period to decide how often to collect data.
       */
      override fun timeBasedCollectionScheme(timeBasedCollectionScheme: IResolvable) {
        cdkBuilder.timeBasedCollectionScheme(timeBasedCollectionScheme.let(IResolvable::unwrap))
      }

      /**
       * @param timeBasedCollectionScheme (Optional) Information about a collection scheme that uses
       * a time period to decide how often to collect data.
       */
      override
          fun timeBasedCollectionScheme(timeBasedCollectionScheme: TimeBasedCollectionSchemeProperty) {
        cdkBuilder.timeBasedCollectionScheme(timeBasedCollectionScheme.let(TimeBasedCollectionSchemeProperty::unwrap))
      }

      /**
       * @param timeBasedCollectionScheme (Optional) Information about a collection scheme that uses
       * a time period to decide how often to collect data.
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
      override val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty,
    ) : CdkObject(cdkObject), CollectionSchemeProperty {
      /**
       * (Optional) Information about a collection scheme that uses a simple logical expression to
       * recognize what data to collect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-collectionscheme.html#cfn-iotfleetwise-campaign-collectionscheme-conditionbasedcollectionscheme)
       */
      override fun conditionBasedCollectionScheme(): Any? =
          unwrap(this).getConditionBasedCollectionScheme()

      /**
       * (Optional) Information about a collection scheme that uses a time period to decide how
       * often to collect data.
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
          CollectionSchemeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CollectionSchemeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty
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
   * .maxSampleCount(123)
   * .minimumSamplingIntervalMs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html)
   */
  public interface SignalInformationProperty {
    /**
     * (Optional) The maximum number of samples to collect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html#cfn-iotfleetwise-campaign-signalinformation-maxsamplecount)
     */
    public fun maxSampleCount(): Number? = unwrap(this).getMaxSampleCount()

    /**
     * (Optional) The minimum duration of time (in milliseconds) between two triggering events to
     * collect data.
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
       * @param maxSampleCount (Optional) The maximum number of samples to collect.
       */
      public fun maxSampleCount(maxSampleCount: Number)

      /**
       * @param minimumSamplingIntervalMs (Optional) The minimum duration of time (in milliseconds)
       * between two triggering events to collect data.
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
       * @param maxSampleCount (Optional) The maximum number of samples to collect.
       */
      override fun maxSampleCount(maxSampleCount: Number) {
        cdkBuilder.maxSampleCount(maxSampleCount)
      }

      /**
       * @param minimumSamplingIntervalMs (Optional) The minimum duration of time (in milliseconds)
       * between two triggering events to collect data.
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
      override val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty,
    ) : CdkObject(cdkObject), SignalInformationProperty {
      /**
       * (Optional) The maximum number of samples to collect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html#cfn-iotfleetwise-campaign-signalinformation-maxsamplecount)
       */
      override fun maxSampleCount(): Number? = unwrap(this).getMaxSampleCount()

      /**
       * (Optional) The minimum duration of time (in milliseconds) between two triggering events to
       * collect data.
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
          SignalInformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SignalInformationProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty
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
      override val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty,
    ) : CdkObject(cdkObject), TimestreamConfigProperty {
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
          TimestreamConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty
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
     * (Optional) The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datadestinationconfig.html#cfn-iotfleetwise-campaign-datadestinationconfig-s3config)
     */
    public fun s3Config(): Any? = unwrap(this).getS3Config()

    /**
     * (Optional) The Amazon Timestream table where the campaign sends data.
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
       * @param s3Config (Optional) The Amazon S3 bucket where the AWS IoT FleetWise campaign sends
       * data.
       */
      public fun s3Config(s3Config: IResolvable)

      /**
       * @param s3Config (Optional) The Amazon S3 bucket where the AWS IoT FleetWise campaign sends
       * data.
       */
      public fun s3Config(s3Config: S3ConfigProperty)

      /**
       * @param s3Config (Optional) The Amazon S3 bucket where the AWS IoT FleetWise campaign sends
       * data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa0827b0454fc9c29afa4ccc11da06ed4a232455f4ac9194e6f07ac3800cd503")
      public fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit)

      /**
       * @param timestreamConfig (Optional) The Amazon Timestream table where the campaign sends
       * data.
       */
      public fun timestreamConfig(timestreamConfig: IResolvable)

      /**
       * @param timestreamConfig (Optional) The Amazon Timestream table where the campaign sends
       * data.
       */
      public fun timestreamConfig(timestreamConfig: TimestreamConfigProperty)

      /**
       * @param timestreamConfig (Optional) The Amazon Timestream table where the campaign sends
       * data.
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
       * @param s3Config (Optional) The Amazon S3 bucket where the AWS IoT FleetWise campaign sends
       * data.
       */
      override fun s3Config(s3Config: IResolvable) {
        cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
      }

      /**
       * @param s3Config (Optional) The Amazon S3 bucket where the AWS IoT FleetWise campaign sends
       * data.
       */
      override fun s3Config(s3Config: S3ConfigProperty) {
        cdkBuilder.s3Config(s3Config.let(S3ConfigProperty::unwrap))
      }

      /**
       * @param s3Config (Optional) The Amazon S3 bucket where the AWS IoT FleetWise campaign sends
       * data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa0827b0454fc9c29afa4ccc11da06ed4a232455f4ac9194e6f07ac3800cd503")
      override fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit): Unit =
          s3Config(S3ConfigProperty(s3Config))

      /**
       * @param timestreamConfig (Optional) The Amazon Timestream table where the campaign sends
       * data.
       */
      override fun timestreamConfig(timestreamConfig: IResolvable) {
        cdkBuilder.timestreamConfig(timestreamConfig.let(IResolvable::unwrap))
      }

      /**
       * @param timestreamConfig (Optional) The Amazon Timestream table where the campaign sends
       * data.
       */
      override fun timestreamConfig(timestreamConfig: TimestreamConfigProperty) {
        cdkBuilder.timestreamConfig(timestreamConfig.let(TimestreamConfigProperty::unwrap))
      }

      /**
       * @param timestreamConfig (Optional) The Amazon Timestream table where the campaign sends
       * data.
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
      override val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty,
    ) : CdkObject(cdkObject), DataDestinationConfigProperty {
      /**
       * (Optional) The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-datadestinationconfig.html#cfn-iotfleetwise-campaign-datadestinationconfig-s3config)
       */
      override fun s3Config(): Any? = unwrap(this).getS3Config()

      /**
       * (Optional) The Amazon Timestream table where the campaign sends data.
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
          DataDestinationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataDestinationConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty
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
     * (Optional) Specifies the version of the conditional expression language.
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
     * (Optional) The minimum duration of time between two triggering events to collect data, in
     * milliseconds.
     *
     *
     * If a signal changes often, you might want to collect data at a slower rate.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-conditionbasedcollectionscheme.html#cfn-iotfleetwise-campaign-conditionbasedcollectionscheme-minimumtriggerintervalms)
     */
    public fun minimumTriggerIntervalMs(): Number? = unwrap(this).getMinimumTriggerIntervalMs()

    /**
     * (Optional) Whether to collect data for all triggering events ( `ALWAYS` ).
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
       * @param conditionLanguageVersion (Optional) Specifies the version of the conditional
       * expression language.
       */
      public fun conditionLanguageVersion(conditionLanguageVersion: Number)

      /**
       * @param expression The logical expression used to recognize what data to collect. 
       * For example, `$variable.Vehicle.OutsideAirTemperature &gt;= 105.0` .
       */
      public fun expression(expression: String)

      /**
       * @param minimumTriggerIntervalMs (Optional) The minimum duration of time between two
       * triggering events to collect data, in milliseconds.
       *
       * If a signal changes often, you might want to collect data at a slower rate.
       */
      public fun minimumTriggerIntervalMs(minimumTriggerIntervalMs: Number)

      /**
       * @param triggerMode (Optional) Whether to collect data for all triggering events ( `ALWAYS`
       * ).
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
       * @param conditionLanguageVersion (Optional) Specifies the version of the conditional
       * expression language.
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
       * @param minimumTriggerIntervalMs (Optional) The minimum duration of time between two
       * triggering events to collect data, in milliseconds.
       *
       * If a signal changes often, you might want to collect data at a slower rate.
       */
      override fun minimumTriggerIntervalMs(minimumTriggerIntervalMs: Number) {
        cdkBuilder.minimumTriggerIntervalMs(minimumTriggerIntervalMs)
      }

      /**
       * @param triggerMode (Optional) Whether to collect data for all triggering events ( `ALWAYS`
       * ).
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
      override val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty,
    ) : CdkObject(cdkObject), ConditionBasedCollectionSchemeProperty {
      /**
       * (Optional) Specifies the version of the conditional expression language.
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
       * (Optional) The minimum duration of time between two triggering events to collect data, in
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
       * (Optional) Whether to collect data for all triggering events ( `ALWAYS` ).
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
          ConditionBasedCollectionSchemeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionBasedCollectionSchemeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty
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
     * (Optional) Specify the format that files are saved in the Amazon S3 bucket.
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
     * (Optional) Enter an S3 bucket prefix.
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
     * (Optional) By default, stored data is compressed as a .gzip file. Compressed files have a
     * reduced file size, which can optimize the cost of data storage.
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
       * @param dataFormat (Optional) Specify the format that files are saved in the Amazon S3
       * bucket.
       * You can save files in an Apache Parquet or JSON format.
       *
       * * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data
       * retrieval and can reduce costs. This option is selected by default.
       * * JSON - Store data in a standard text-based JSON file format.
       */
      public fun dataFormat(dataFormat: String)

      /**
       * @param prefix (Optional) Enter an S3 bucket prefix.
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
       * @param storageCompressionFormat (Optional) By default, stored data is compressed as a .gzip
       * file. Compressed files have a reduced file size, which can optimize the cost of data storage.
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
       * @param dataFormat (Optional) Specify the format that files are saved in the Amazon S3
       * bucket.
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
       * @param prefix (Optional) Enter an S3 bucket prefix.
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
       * @param storageCompressionFormat (Optional) By default, stored data is compressed as a .gzip
       * file. Compressed files have a reduced file size, which can optimize the cost of data storage.
       */
      override fun storageCompressionFormat(storageCompressionFormat: String) {
        cdkBuilder.storageCompressionFormat(storageCompressionFormat)
      }

      public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty,
    ) : CdkObject(cdkObject), S3ConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-s3config.html#cfn-iotfleetwise-campaign-s3config-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * (Optional) Specify the format that files are saved in the Amazon S3 bucket.
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
       * (Optional) Enter an S3 bucket prefix.
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
       * (Optional) By default, stored data is compressed as a .gzip file. Compressed files have a
       * reduced file size, which can optimize the cost of data storage.
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
          S3ConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty
    }
  }
}
