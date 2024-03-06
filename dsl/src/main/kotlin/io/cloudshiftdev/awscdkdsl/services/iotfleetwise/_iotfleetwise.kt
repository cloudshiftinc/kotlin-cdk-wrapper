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

package io.cloudshiftdev.awscdkdsl.services.iotfleetwise

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps
import software.amazon.awscdk.services.iotfleetwise.CfnFleet
import software.amazon.awscdk.services.iotfleetwise.CfnFleetProps
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifest
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps
import software.amazon.awscdk.services.iotfleetwise.CfnVehicle
import software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps
import software.constructs.Construct

public object iotfleetwise {
    /**
     * Creates an orchestration of data collection rules.
     *
     * The AWS IoT FleetWise Edge Agent software running in vehicles uses campaigns to decide how to
     * collect and transfer data to the cloud. You create campaigns in the cloud. After you or your
     * team approve campaigns, AWS IoT FleetWise automatically deploys them to vehicles.
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
    public inline fun cfnCampaign(
        scope: Construct,
        id: String,
        block: CfnCampaignDsl.() -> Unit = {},
    ): CfnCampaign {
        val builder = CfnCampaignDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies what data to collect and how often or when to collect it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
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
    public inline fun cfnCampaignCollectionSchemeProperty(
        block: CfnCampaignCollectionSchemePropertyDsl.() -> Unit = {}
    ): CfnCampaign.CollectionSchemeProperty {
        val builder = CfnCampaignCollectionSchemePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a collection scheme that uses a simple logical expression to recognize what
     * data to collect.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
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
    public inline fun cfnCampaignConditionBasedCollectionSchemeProperty(
        block: CfnCampaignConditionBasedCollectionSchemePropertyDsl.() -> Unit = {}
    ): CfnCampaign.ConditionBasedCollectionSchemeProperty {
        val builder = CfnCampaignConditionBasedCollectionSchemePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The destination where the AWS IoT FleetWise campaign sends data.
     *
     * You can send data to be stored in Amazon S3 or Amazon Timestream .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
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
    public inline fun cfnCampaignDataDestinationConfigProperty(
        block: CfnCampaignDataDestinationConfigPropertyDsl.() -> Unit = {}
    ): CfnCampaign.DataDestinationConfigProperty {
        val builder = CfnCampaignDataDestinationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCampaign`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnCampaignProps cfnCampaignProps = CfnCampaignProps.builder()
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
    public inline fun cfnCampaignProps(
        block: CfnCampaignPropsDsl.() -> Unit = {}
    ): CfnCampaignProps {
        val builder = CfnCampaignPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 bucket where the AWS IoT FleetWise campaign sends data.
     *
     * Amazon S3 is an object storage service that stores data as objects within buckets. For more
     * information, see
     * [Creating, configuring, and working with Amazon S3 buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html)
     * in the *Amazon Simple Storage Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
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
    public inline fun cfnCampaignS3ConfigProperty(
        block: CfnCampaignS3ConfigPropertyDsl.() -> Unit = {}
    ): CfnCampaign.S3ConfigProperty {
        val builder = CfnCampaignS3ConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a signal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
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
    public inline fun cfnCampaignSignalInformationProperty(
        block: CfnCampaignSignalInformationPropertyDsl.() -> Unit = {}
    ): CfnCampaign.SignalInformationProperty {
        val builder = CfnCampaignSignalInformationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a collection scheme that uses a time period to decide how often to collect
     * data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * TimeBasedCollectionSchemeProperty timeBasedCollectionSchemeProperty =
     * TimeBasedCollectionSchemeProperty.builder()
     * .periodMs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timebasedcollectionscheme.html)
     */
    public inline fun cfnCampaignTimeBasedCollectionSchemeProperty(
        block: CfnCampaignTimeBasedCollectionSchemePropertyDsl.() -> Unit = {}
    ): CfnCampaign.TimeBasedCollectionSchemeProperty {
        val builder = CfnCampaignTimeBasedCollectionSchemePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon Timestream table where the AWS IoT FleetWise campaign sends data.
     *
     * Timestream stores and organizes data to optimize query processing time and to reduce storage
     * costs. For more information, see
     * [Data modeling](https://docs.aws.amazon.com/timestream/latest/developerguide/data-modeling.html)
     * in the *Amazon Timestream Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * TimestreamConfigProperty timestreamConfigProperty = TimestreamConfigProperty.builder()
     * .executionRoleArn("executionRoleArn")
     * .timestreamTableArn("timestreamTableArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timestreamconfig.html)
     */
    public inline fun cfnCampaignTimestreamConfigProperty(
        block: CfnCampaignTimestreamConfigPropertyDsl.() -> Unit = {}
    ): CfnCampaign.TimestreamConfigProperty {
        val builder = CfnCampaignTimestreamConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates the decoder manifest associated with a model manifest. To create a decoder manifest,
     * the following must be true:.
     * * Every signal decoder has a unique name.
     * * Each signal decoder is associated with a network interface.
     * * Each network interface has a unique ID.
     * * The signal decoders are specified in the model manifest.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnDecoderManifest cfnDecoderManifest = CfnDecoderManifest.Builder.create(this,
     * "MyCfnDecoderManifest")
     * .modelManifestArn("modelManifestArn")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .networkInterfaces(List.of(NetworkInterfacesItemsProperty.builder()
     * .interfaceId("interfaceId")
     * .type("type")
     * // the properties below are optional
     * .canInterface(CanInterfaceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .protocolName("protocolName")
     * .protocolVersion("protocolVersion")
     * .build())
     * .obdInterface(ObdInterfaceProperty.builder()
     * .name("name")
     * .requestMessageId("requestMessageId")
     * // the properties below are optional
     * .dtcRequestIntervalSeconds("dtcRequestIntervalSeconds")
     * .hasTransmissionEcu("hasTransmissionEcu")
     * .obdStandard("obdStandard")
     * .pidRequestIntervalSeconds("pidRequestIntervalSeconds")
     * .useExtendedIds("useExtendedIds")
     * .build())
     * .build()))
     * .signalDecoders(List.of(SignalDecodersItemsProperty.builder()
     * .fullyQualifiedName("fullyQualifiedName")
     * .interfaceId("interfaceId")
     * .type("type")
     * // the properties below are optional
     * .canSignal(CanSignalProperty.builder()
     * .factor("factor")
     * .isBigEndian("isBigEndian")
     * .isSigned("isSigned")
     * .length("length")
     * .messageId("messageId")
     * .offset("offset")
     * .startBit("startBit")
     * // the properties below are optional
     * .name("name")
     * .build())
     * .obdSignal(ObdSignalProperty.builder()
     * .byteLength("byteLength")
     * .offset("offset")
     * .pid("pid")
     * .pidResponseLength("pidResponseLength")
     * .scaling("scaling")
     * .serviceMode("serviceMode")
     * .startByte("startByte")
     * // the properties below are optional
     * .bitMaskLength("bitMaskLength")
     * .bitRightShift("bitRightShift")
     * .build())
     * .build()))
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html)
     */
    public inline fun cfnDecoderManifest(
        scope: Construct,
        id: String,
        block: CfnDecoderManifestDsl.() -> Unit = {},
    ): CfnDecoderManifest {
        val builder = CfnDecoderManifestDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single controller area network (CAN) device interface.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CanInterfaceProperty canInterfaceProperty = CanInterfaceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .protocolName("protocolName")
     * .protocolVersion("protocolVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-caninterface.html)
     */
    public inline fun cfnDecoderManifestCanInterfaceProperty(
        block: CfnDecoderManifestCanInterfacePropertyDsl.() -> Unit = {}
    ): CfnDecoderManifest.CanInterfaceProperty {
        val builder = CfnDecoderManifestCanInterfacePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a node and its specifications in an in-vehicle communication network.
     *
     * All signal decoders must be associated with a network node.
     *
     * To return this information about all the network interfaces specified in a decoder manifest,
     * use the
     * [ListDecoderManifestNetworkInterfaces](https://docs.aws.amazon.com/iot-fleetwise/latest/APIReference/API_ListDecoderManifestNetworkInterfaces.html)
     * in the *AWS IoT FleetWise API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CanNetworkInterfaceProperty canNetworkInterfaceProperty = CanNetworkInterfaceProperty.builder()
     * .canInterface(CanInterfaceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .protocolName("protocolName")
     * .protocolVersion("protocolVersion")
     * .build())
     * .interfaceId("interfaceId")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cannetworkinterface.html)
     */
    public inline fun cfnDecoderManifestCanNetworkInterfaceProperty(
        block: CfnDecoderManifestCanNetworkInterfacePropertyDsl.() -> Unit = {}
    ): CfnDecoderManifest.CanNetworkInterfaceProperty {
        val builder = CfnDecoderManifestCanNetworkInterfacePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about signal decoder using the Controller Area Network (CAN) protocol.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CanSignalDecoderProperty canSignalDecoderProperty = CanSignalDecoderProperty.builder()
     * .canSignal(CanSignalProperty.builder()
     * .factor("factor")
     * .isBigEndian("isBigEndian")
     * .isSigned("isSigned")
     * .length("length")
     * .messageId("messageId")
     * .offset("offset")
     * .startBit("startBit")
     * // the properties below are optional
     * .name("name")
     * .build())
     * .fullyQualifiedName("fullyQualifiedName")
     * .interfaceId("interfaceId")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignaldecoder.html)
     */
    public inline fun cfnDecoderManifestCanSignalDecoderProperty(
        block: CfnDecoderManifestCanSignalDecoderPropertyDsl.() -> Unit = {}
    ): CfnDecoderManifest.CanSignalDecoderProperty {
        val builder = CfnDecoderManifestCanSignalDecoderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (Optional) Information about a single controller area network (CAN) signal and the messages
     * it receives and transmits.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CanSignalProperty canSignalProperty = CanSignalProperty.builder()
     * .factor("factor")
     * .isBigEndian("isBigEndian")
     * .isSigned("isSigned")
     * .length("length")
     * .messageId("messageId")
     * .offset("offset")
     * .startBit("startBit")
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html)
     */
    public inline fun cfnDecoderManifestCanSignalProperty(
        block: CfnDecoderManifestCanSignalPropertyDsl.() -> Unit = {}
    ): CfnDecoderManifest.CanSignalProperty {
        val builder = CfnDecoderManifestCanSignalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (Optional) A list of information about available network interfaces.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * NetworkInterfacesItemsProperty networkInterfacesItemsProperty =
     * NetworkInterfacesItemsProperty.builder()
     * .interfaceId("interfaceId")
     * .type("type")
     * // the properties below are optional
     * .canInterface(CanInterfaceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .protocolName("protocolName")
     * .protocolVersion("protocolVersion")
     * .build())
     * .obdInterface(ObdInterfaceProperty.builder()
     * .name("name")
     * .requestMessageId("requestMessageId")
     * // the properties below are optional
     * .dtcRequestIntervalSeconds("dtcRequestIntervalSeconds")
     * .hasTransmissionEcu("hasTransmissionEcu")
     * .obdStandard("obdStandard")
     * .pidRequestIntervalSeconds("pidRequestIntervalSeconds")
     * .useExtendedIds("useExtendedIds")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-networkinterfacesitems.html)
     */
    public inline fun cfnDecoderManifestNetworkInterfacesItemsProperty(
        block: CfnDecoderManifestNetworkInterfacesItemsPropertyDsl.() -> Unit = {}
    ): CfnDecoderManifest.NetworkInterfacesItemsProperty {
        val builder = CfnDecoderManifestNetworkInterfacesItemsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A network interface that specifies the On-board diagnostic (OBD) II network protocol.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * ObdInterfaceProperty obdInterfaceProperty = ObdInterfaceProperty.builder()
     * .name("name")
     * .requestMessageId("requestMessageId")
     * // the properties below are optional
     * .dtcRequestIntervalSeconds("dtcRequestIntervalSeconds")
     * .hasTransmissionEcu("hasTransmissionEcu")
     * .obdStandard("obdStandard")
     * .pidRequestIntervalSeconds("pidRequestIntervalSeconds")
     * .useExtendedIds("useExtendedIds")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html)
     */
    public inline fun cfnDecoderManifestObdInterfaceProperty(
        block: CfnDecoderManifestObdInterfacePropertyDsl.() -> Unit = {}
    ): CfnDecoderManifest.ObdInterfaceProperty {
        val builder = CfnDecoderManifestObdInterfacePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a network interface specified by the On-board diagnostic (OBD) II protocol.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * ObdNetworkInterfaceProperty obdNetworkInterfaceProperty = ObdNetworkInterfaceProperty.builder()
     * .interfaceId("interfaceId")
     * .obdInterface(ObdInterfaceProperty.builder()
     * .name("name")
     * .requestMessageId("requestMessageId")
     * // the properties below are optional
     * .dtcRequestIntervalSeconds("dtcRequestIntervalSeconds")
     * .hasTransmissionEcu("hasTransmissionEcu")
     * .obdStandard("obdStandard")
     * .pidRequestIntervalSeconds("pidRequestIntervalSeconds")
     * .useExtendedIds("useExtendedIds")
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdnetworkinterface.html)
     */
    public inline fun cfnDecoderManifestObdNetworkInterfaceProperty(
        block: CfnDecoderManifestObdNetworkInterfacePropertyDsl.() -> Unit = {}
    ): CfnDecoderManifest.ObdNetworkInterfaceProperty {
        val builder = CfnDecoderManifestObdNetworkInterfacePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of information about signal decoders.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * ObdSignalDecoderProperty obdSignalDecoderProperty = ObdSignalDecoderProperty.builder()
     * .fullyQualifiedName("fullyQualifiedName")
     * .interfaceId("interfaceId")
     * .obdSignal(ObdSignalProperty.builder()
     * .byteLength("byteLength")
     * .offset("offset")
     * .pid("pid")
     * .pidResponseLength("pidResponseLength")
     * .scaling("scaling")
     * .serviceMode("serviceMode")
     * .startByte("startByte")
     * // the properties below are optional
     * .bitMaskLength("bitMaskLength")
     * .bitRightShift("bitRightShift")
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignaldecoder.html)
     */
    public inline fun cfnDecoderManifestObdSignalDecoderProperty(
        block: CfnDecoderManifestObdSignalDecoderPropertyDsl.() -> Unit = {}
    ): CfnDecoderManifest.ObdSignalDecoderProperty {
        val builder = CfnDecoderManifestObdSignalDecoderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about signal messages using the on-board diagnostics (OBD) II protocol in a
     * vehicle.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * ObdSignalProperty obdSignalProperty = ObdSignalProperty.builder()
     * .byteLength("byteLength")
     * .offset("offset")
     * .pid("pid")
     * .pidResponseLength("pidResponseLength")
     * .scaling("scaling")
     * .serviceMode("serviceMode")
     * .startByte("startByte")
     * // the properties below are optional
     * .bitMaskLength("bitMaskLength")
     * .bitRightShift("bitRightShift")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html)
     */
    public inline fun cfnDecoderManifestObdSignalProperty(
        block: CfnDecoderManifestObdSignalPropertyDsl.() -> Unit = {}
    ): CfnDecoderManifest.ObdSignalProperty {
        val builder = CfnDecoderManifestObdSignalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDecoderManifest`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnDecoderManifestProps cfnDecoderManifestProps = CfnDecoderManifestProps.builder()
     * .modelManifestArn("modelManifestArn")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .networkInterfaces(List.of(NetworkInterfacesItemsProperty.builder()
     * .interfaceId("interfaceId")
     * .type("type")
     * // the properties below are optional
     * .canInterface(CanInterfaceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .protocolName("protocolName")
     * .protocolVersion("protocolVersion")
     * .build())
     * .obdInterface(ObdInterfaceProperty.builder()
     * .name("name")
     * .requestMessageId("requestMessageId")
     * // the properties below are optional
     * .dtcRequestIntervalSeconds("dtcRequestIntervalSeconds")
     * .hasTransmissionEcu("hasTransmissionEcu")
     * .obdStandard("obdStandard")
     * .pidRequestIntervalSeconds("pidRequestIntervalSeconds")
     * .useExtendedIds("useExtendedIds")
     * .build())
     * .build()))
     * .signalDecoders(List.of(SignalDecodersItemsProperty.builder()
     * .fullyQualifiedName("fullyQualifiedName")
     * .interfaceId("interfaceId")
     * .type("type")
     * // the properties below are optional
     * .canSignal(CanSignalProperty.builder()
     * .factor("factor")
     * .isBigEndian("isBigEndian")
     * .isSigned("isSigned")
     * .length("length")
     * .messageId("messageId")
     * .offset("offset")
     * .startBit("startBit")
     * // the properties below are optional
     * .name("name")
     * .build())
     * .obdSignal(ObdSignalProperty.builder()
     * .byteLength("byteLength")
     * .offset("offset")
     * .pid("pid")
     * .pidResponseLength("pidResponseLength")
     * .scaling("scaling")
     * .serviceMode("serviceMode")
     * .startByte("startByte")
     * // the properties below are optional
     * .bitMaskLength("bitMaskLength")
     * .bitRightShift("bitRightShift")
     * .build())
     * .build()))
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html)
     */
    public inline fun cfnDecoderManifestProps(
        block: CfnDecoderManifestPropsDsl.() -> Unit = {}
    ): CfnDecoderManifestProps {
        val builder = CfnDecoderManifestPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a signal decoder.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * SignalDecodersItemsProperty signalDecodersItemsProperty = SignalDecodersItemsProperty.builder()
     * .fullyQualifiedName("fullyQualifiedName")
     * .interfaceId("interfaceId")
     * .type("type")
     * // the properties below are optional
     * .canSignal(CanSignalProperty.builder()
     * .factor("factor")
     * .isBigEndian("isBigEndian")
     * .isSigned("isSigned")
     * .length("length")
     * .messageId("messageId")
     * .offset("offset")
     * .startBit("startBit")
     * // the properties below are optional
     * .name("name")
     * .build())
     * .obdSignal(ObdSignalProperty.builder()
     * .byteLength("byteLength")
     * .offset("offset")
     * .pid("pid")
     * .pidResponseLength("pidResponseLength")
     * .scaling("scaling")
     * .serviceMode("serviceMode")
     * .startByte("startByte")
     * // the properties below are optional
     * .bitMaskLength("bitMaskLength")
     * .bitRightShift("bitRightShift")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html)
     */
    public inline fun cfnDecoderManifestSignalDecodersItemsProperty(
        block: CfnDecoderManifestSignalDecodersItemsPropertyDsl.() -> Unit = {}
    ): CfnDecoderManifest.SignalDecodersItemsProperty {
        val builder = CfnDecoderManifestSignalDecodersItemsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a fleet that represents a group of vehicles.
     *
     * You must create both a signal catalog and vehicles before you can create a fleet.
     *
     * For more information, see
     * [Fleets](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleets.html) in the
     * *AWS IoT FleetWise Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnFleet cfnFleet = CfnFleet.Builder.create(this, "MyCfnFleet")
     * .id("id")
     * .signalCatalogArn("signalCatalogArn")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html)
     */
    public inline fun cfnFleet(
        scope: Construct,
        id: String,
        block: CfnFleetDsl.() -> Unit = {},
    ): CfnFleet {
        val builder = CfnFleetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFleet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
     * .id("id")
     * .signalCatalogArn("signalCatalogArn")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html)
     */
    public inline fun cfnFleetProps(block: CfnFleetPropsDsl.() -> Unit = {}): CfnFleetProps {
        val builder = CfnFleetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a vehicle model (model manifest) that specifies signals (attributes, branches,
     * sensors, and actuators).
     *
     * For more information, see
     * [Vehicle models](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/vehicle-models.html)
     * in the *AWS IoT FleetWise Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnModelManifest cfnModelManifest = CfnModelManifest.Builder.create(this, "MyCfnModelManifest")
     * .name("name")
     * .signalCatalogArn("signalCatalogArn")
     * // the properties below are optional
     * .description("description")
     * .nodes(List.of("nodes"))
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html)
     */
    public inline fun cfnModelManifest(
        scope: Construct,
        id: String,
        block: CfnModelManifestDsl.() -> Unit = {},
    ): CfnModelManifest {
        val builder = CfnModelManifestDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModelManifest`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnModelManifestProps cfnModelManifestProps = CfnModelManifestProps.builder()
     * .name("name")
     * .signalCatalogArn("signalCatalogArn")
     * // the properties below are optional
     * .description("description")
     * .nodes(List.of("nodes"))
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html)
     */
    public inline fun cfnModelManifestProps(
        block: CfnModelManifestPropsDsl.() -> Unit = {}
    ): CfnModelManifestProps {
        val builder = CfnModelManifestPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a collection of standardized signals that can be reused to create vehicle models.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnSignalCatalog cfnSignalCatalog = CfnSignalCatalog.Builder.create(this, "MyCfnSignalCatalog")
     * .description("description")
     * .name("name")
     * .nodeCounts(NodeCountsProperty.builder()
     * .totalActuators(123)
     * .totalAttributes(123)
     * .totalBranches(123)
     * .totalNodes(123)
     * .totalSensors(123)
     * .build())
     * .nodes(List.of(NodeProperty.builder()
     * .actuator(ActuatorProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .assignedValue("assignedValue")
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build())
     * .attribute(AttributeProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .assignedValue("assignedValue")
     * .defaultValue("defaultValue")
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build())
     * .branch(BranchProperty.builder()
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .description("description")
     * .build())
     * .sensor(SensorProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build())
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html)
     */
    public inline fun cfnSignalCatalog(
        scope: Construct,
        id: String,
        block: CfnSignalCatalogDsl.() -> Unit = {},
    ): CfnSignalCatalog {
        val builder = CfnSignalCatalogDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A signal that represents a vehicle device such as the engine, heater, and door locks.
     *
     * Data from an actuator reports the state of a certain vehicle device.
     *
     * Updating actuator data can change the state of a device. For example, you can turn on or off
     * the heater by updating its actuator data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * ActuatorProperty actuatorProperty = ActuatorProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .assignedValue("assignedValue")
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html)
     */
    public inline fun cfnSignalCatalogActuatorProperty(
        block: CfnSignalCatalogActuatorPropertyDsl.() -> Unit = {}
    ): CfnSignalCatalog.ActuatorProperty {
        val builder = CfnSignalCatalogActuatorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A signal that represents static information about the vehicle, such as engine type or
     * manufacturing date.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * AttributeProperty attributeProperty = AttributeProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .assignedValue("assignedValue")
     * .defaultValue("defaultValue")
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html)
     */
    public inline fun cfnSignalCatalogAttributeProperty(
        block: CfnSignalCatalogAttributePropertyDsl.() -> Unit = {}
    ): CfnSignalCatalog.AttributeProperty {
        val builder = CfnSignalCatalogAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A group of signals that are defined in a hierarchical structure.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * BranchProperty branchProperty = BranchProperty.builder()
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-branch.html)
     */
    public inline fun cfnSignalCatalogBranchProperty(
        block: CfnSignalCatalogBranchPropertyDsl.() -> Unit = {}
    ): CfnSignalCatalog.BranchProperty {
        val builder = CfnSignalCatalogBranchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the number of nodes and node types in a vehicle network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * NodeCountsProperty nodeCountsProperty = NodeCountsProperty.builder()
     * .totalActuators(123)
     * .totalAttributes(123)
     * .totalBranches(123)
     * .totalNodes(123)
     * .totalSensors(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html)
     */
    public inline fun cfnSignalCatalogNodeCountsProperty(
        block: CfnSignalCatalogNodeCountsPropertyDsl.() -> Unit = {}
    ): CfnSignalCatalog.NodeCountsProperty {
        val builder = CfnSignalCatalogNodeCountsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A general abstraction of a signal.
     *
     * A node can be specified as an actuator, attribute, branch, or sensor.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * NodeProperty nodeProperty = NodeProperty.builder()
     * .actuator(ActuatorProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .assignedValue("assignedValue")
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build())
     * .attribute(AttributeProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .assignedValue("assignedValue")
     * .defaultValue("defaultValue")
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build())
     * .branch(BranchProperty.builder()
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .description("description")
     * .build())
     * .sensor(SensorProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html)
     */
    public inline fun cfnSignalCatalogNodeProperty(
        block: CfnSignalCatalogNodePropertyDsl.() -> Unit = {}
    ): CfnSignalCatalog.NodeProperty {
        val builder = CfnSignalCatalogNodePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSignalCatalog`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnSignalCatalogProps cfnSignalCatalogProps = CfnSignalCatalogProps.builder()
     * .description("description")
     * .name("name")
     * .nodeCounts(NodeCountsProperty.builder()
     * .totalActuators(123)
     * .totalAttributes(123)
     * .totalBranches(123)
     * .totalNodes(123)
     * .totalSensors(123)
     * .build())
     * .nodes(List.of(NodeProperty.builder()
     * .actuator(ActuatorProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .assignedValue("assignedValue")
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build())
     * .attribute(AttributeProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .assignedValue("assignedValue")
     * .defaultValue("defaultValue")
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build())
     * .branch(BranchProperty.builder()
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .description("description")
     * .build())
     * .sensor(SensorProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build())
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html)
     */
    public inline fun cfnSignalCatalogProps(
        block: CfnSignalCatalogPropsDsl.() -> Unit = {}
    ): CfnSignalCatalogProps {
        val builder = CfnSignalCatalogPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An input component that reports the environmental condition of a vehicle.
     *
     * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
     * sensors.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * SensorProperty sensorProperty = SensorProperty.builder()
     * .dataType("dataType")
     * .fullyQualifiedName("fullyQualifiedName")
     * // the properties below are optional
     * .allowedValues(List.of("allowedValues"))
     * .description("description")
     * .max(123)
     * .min(123)
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html)
     */
    public inline fun cfnSignalCatalogSensorProperty(
        block: CfnSignalCatalogSensorPropertyDsl.() -> Unit = {}
    ): CfnSignalCatalog.SensorProperty {
        val builder = CfnSignalCatalogSensorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a vehicle, which is an instance of a vehicle model (model manifest).
     *
     * Vehicles created from the same vehicle model consist of the same signals inherited from the
     * vehicle model.
     *
     * If you have an existing AWS IoT thing, you can use AWS IoT FleetWise to create a vehicle and
     * collect data from your thing.
     *
     * For more information, see
     * [Create a vehicle (console)](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/create-vehicle-console.html)
     * in the *AWS IoT FleetWise Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnVehicle cfnVehicle = CfnVehicle.Builder.create(this, "MyCfnVehicle")
     * .decoderManifestArn("decoderManifestArn")
     * .modelManifestArn("modelManifestArn")
     * .name("name")
     * // the properties below are optional
     * .associationBehavior("associationBehavior")
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html)
     */
    public inline fun cfnVehicle(
        scope: Construct,
        id: String,
        block: CfnVehicleDsl.() -> Unit = {},
    ): CfnVehicle {
        val builder = CfnVehicleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVehicle`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleetwise.*;
     * CfnVehicleProps cfnVehicleProps = CfnVehicleProps.builder()
     * .decoderManifestArn("decoderManifestArn")
     * .modelManifestArn("modelManifestArn")
     * .name("name")
     * // the properties below are optional
     * .associationBehavior("associationBehavior")
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html)
     */
    public inline fun cfnVehicleProps(block: CfnVehiclePropsDsl.() -> Unit = {}): CfnVehicleProps {
        val builder = CfnVehiclePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
