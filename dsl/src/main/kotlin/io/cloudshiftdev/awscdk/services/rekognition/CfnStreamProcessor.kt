package io.cloudshiftdev.awscdk.services.rekognition

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStreamProcessor
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** Amazon Resource Name for the newly created stream processor. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** Current status of the Amazon Rekognition stream processor. */
    public open fun attrStatus(): String = unwrap(this).getAttrStatus()

    /** Detailed status message about the stream processor. */
    public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

    /** List of BoundingBox objects, each of which denotes a region of interest on screen. */
    public open fun boundingBoxRegionsOfInterest(): Any? =
        unwrap(this).getBoundingBoxRegionsOfInterest()

    /** List of BoundingBox objects, each of which denotes a region of interest on screen. */
    public open fun boundingBoxRegionsOfInterest(`value`: IResolvable) {
        unwrap(this).setBoundingBoxRegionsOfInterest(`value`.let(IResolvable::unwrap))
    }

    /** List of BoundingBox objects, each of which denotes a region of interest on screen. */
    public open fun boundingBoxRegionsOfInterest(__idx_ac66f0: List<Any>) {
        unwrap(this).setBoundingBoxRegionsOfInterest(__idx_ac66f0)
    }

    /** List of BoundingBox objects, each of which denotes a region of interest on screen. */
    public open fun boundingBoxRegionsOfInterest(vararg __idx_ac66f0: Any): Unit =
        boundingBoxRegionsOfInterest(__idx_ac66f0.toList())

    /** Connected home settings to use on a streaming video. */
    public open fun connectedHomeSettings(): Any? = unwrap(this).getConnectedHomeSettings()

    /** Connected home settings to use on a streaming video. */
    public open fun connectedHomeSettings(`value`: IResolvable) {
        unwrap(this).setConnectedHomeSettings(`value`.let(IResolvable::unwrap))
    }

    /** Connected home settings to use on a streaming video. */
    public open fun connectedHomeSettings(`value`: ConnectedHomeSettingsProperty) {
        unwrap(this).setConnectedHomeSettings(`value`.let(ConnectedHomeSettingsProperty::unwrap))
    }

    /** Connected home settings to use on a streaming video. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9530bf209475bcab6efc9bad07658e4b6fed74e07075ff9bc8928b5d1b141eee")
    public open fun connectedHomeSettings(
        `value`: ConnectedHomeSettingsProperty.Builder.() -> Unit
    ): Unit = connectedHomeSettings(ConnectedHomeSettingsProperty(`value`))

    /**
     * Allows you to opt in or opt out to share data with Rekognition to improve model performance.
     */
    public open fun dataSharingPreference(): Any? = unwrap(this).getDataSharingPreference()

    /**
     * Allows you to opt in or opt out to share data with Rekognition to improve model performance.
     */
    public open fun dataSharingPreference(`value`: IResolvable) {
        unwrap(this).setDataSharingPreference(`value`.let(IResolvable::unwrap))
    }

    /**
     * Allows you to opt in or opt out to share data with Rekognition to improve model performance.
     */
    public open fun dataSharingPreference(`value`: DataSharingPreferenceProperty) {
        unwrap(this).setDataSharingPreference(`value`.let(DataSharingPreferenceProperty::unwrap))
    }

    /**
     * Allows you to opt in or opt out to share data with Rekognition to improve model performance.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e26b3bc42d0bc3272ed36de8710bb622d34048dfe857510696bece32d0e8d298")
    public open fun dataSharingPreference(
        `value`: DataSharingPreferenceProperty.Builder.() -> Unit
    ): Unit = dataSharingPreference(DataSharingPreferenceProperty(`value`))

    /**
     * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
     * Rekognition stream processor.
     */
    public open fun faceSearchSettings(): Any? = unwrap(this).getFaceSearchSettings()

    /**
     * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
     * Rekognition stream processor.
     */
    public open fun faceSearchSettings(`value`: IResolvable) {
        unwrap(this).setFaceSearchSettings(`value`.let(IResolvable::unwrap))
    }

    /**
     * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
     * Rekognition stream processor.
     */
    public open fun faceSearchSettings(`value`: FaceSearchSettingsProperty) {
        unwrap(this).setFaceSearchSettings(`value`.let(FaceSearchSettingsProperty::unwrap))
    }

    /**
     * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
     * Rekognition stream processor.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a116ccf30b6d2932eae1fde1a79faed9d6627b797d55cca752d9cd7777dc642e")
    public open fun faceSearchSettings(
        `value`: FaceSearchSettingsProperty.Builder.() -> Unit
    ): Unit = faceSearchSettings(FaceSearchSettingsProperty(`value`))

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input. */
    public open fun kinesisDataStream(): Any? = unwrap(this).getKinesisDataStream()

    /** Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input. */
    public open fun kinesisDataStream(`value`: IResolvable) {
        unwrap(this).setKinesisDataStream(`value`.let(IResolvable::unwrap))
    }

    /** Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input. */
    public open fun kinesisDataStream(`value`: KinesisDataStreamProperty) {
        unwrap(this).setKinesisDataStream(`value`.let(KinesisDataStreamProperty::unwrap))
    }

    /** Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc13ec97d87ca5a32c33147f4015c264a27551347ed5219815f562ba3db3fecb")
    public open fun kinesisDataStream(`value`: KinesisDataStreamProperty.Builder.() -> Unit): Unit =
        kinesisDataStream(KinesisDataStreamProperty(`value`))

    /**
     * The Kinesis video stream that provides the source of the streaming video for an Amazon
     * Rekognition Video stream processor.
     */
    public open fun kinesisVideoStream(): Any = unwrap(this).getKinesisVideoStream()

    /**
     * The Kinesis video stream that provides the source of the streaming video for an Amazon
     * Rekognition Video stream processor.
     */
    public open fun kinesisVideoStream(`value`: IResolvable) {
        unwrap(this).setKinesisVideoStream(`value`.let(IResolvable::unwrap))
    }

    /**
     * The Kinesis video stream that provides the source of the streaming video for an Amazon
     * Rekognition Video stream processor.
     */
    public open fun kinesisVideoStream(`value`: KinesisVideoStreamProperty) {
        unwrap(this).setKinesisVideoStream(`value`.let(KinesisVideoStreamProperty::unwrap))
    }

    /**
     * The Kinesis video stream that provides the source of the streaming video for an Amazon
     * Rekognition Video stream processor.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6246b62bce18fa918390220a01b856d41b358f61bf4e017b3196bd83c1b1d1ae")
    public open fun kinesisVideoStream(
        `value`: KinesisVideoStreamProperty.Builder.() -> Unit
    ): Unit = kinesisVideoStream(KinesisVideoStreamProperty(`value`))

    /** The identifier for your Amazon Key Management Service key (Amazon KMS key). */
    public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /** The identifier for your Amazon Key Management Service key (Amazon KMS key). */
    public open fun kmsKeyId(`value`: String) {
        unwrap(this).setKmsKeyId(`value`)
    }

    /**
     * The Name attribute specifies the name of the stream processor and it must be within the
     * constraints described in the Name section of
     * [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
     * . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses that ID
     * for the stream processor name.
     */
    public open fun name(): String? = unwrap(this).getName()

    /**
     * The Name attribute specifies the name of the stream processor and it must be within the
     * constraints described in the Name section of
     * [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
     * . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses that ID
     * for the stream processor name.
     */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /**
     * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the object
     * detection results and completion status of a video analysis operation.
     */
    public open fun notificationChannel(): Any? = unwrap(this).getNotificationChannel()

    /**
     * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the object
     * detection results and completion status of a video analysis operation.
     */
    public open fun notificationChannel(`value`: IResolvable) {
        unwrap(this).setNotificationChannel(`value`.let(IResolvable::unwrap))
    }

    /**
     * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the object
     * detection results and completion status of a video analysis operation.
     */
    public open fun notificationChannel(`value`: NotificationChannelProperty) {
        unwrap(this).setNotificationChannel(`value`.let(NotificationChannelProperty::unwrap))
    }

    /**
     * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the object
     * detection results and completion status of a video analysis operation.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63a823012ae69928fc478933f674f70c8cc37ba00f318f89fc49079df4d12f7d")
    public open fun notificationChannel(
        `value`: NotificationChannelProperty.Builder.() -> Unit
    ): Unit = notificationChannel(NotificationChannelProperty(`value`))

    /**
     * A set of ordered lists of
     * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. Each
     * entry of the set contains a polygon denoting a region of interest on the screen. Each polygon
     * is an ordered list of
     * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. For
     * more information, see the Polygon field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     */
    public open fun polygonRegionsOfInterest(): Any? = unwrap(this).getPolygonRegionsOfInterest()

    /**
     * A set of ordered lists of
     * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. Each
     * entry of the set contains a polygon denoting a region of interest on the screen. Each polygon
     * is an ordered list of
     * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. For
     * more information, see the Polygon field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     */
    public open fun polygonRegionsOfInterest(`value`: Any) {
        unwrap(this).setPolygonRegionsOfInterest(`value`)
    }

    /** The ARN of the IAM role that allows access to the stream processor. */
    public open fun roleArn(): String = unwrap(this).getRoleArn()

    /** The ARN of the IAM role that allows access to the stream processor. */
    public open fun roleArn(`value`: String) {
        unwrap(this).setRoleArn(`value`)
    }

    /**
     * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference
     * results of a video analysis operation.
     */
    public open fun s3Destination(): Any? = unwrap(this).getS3Destination()

    /**
     * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference
     * results of a video analysis operation.
     */
    public open fun s3Destination(`value`: IResolvable) {
        unwrap(this).setS3Destination(`value`.let(IResolvable::unwrap))
    }

    /**
     * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference
     * results of a video analysis operation.
     */
    public open fun s3Destination(`value`: S3DestinationProperty) {
        unwrap(this).setS3Destination(`value`.let(S3DestinationProperty::unwrap))
    }

    /**
     * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference
     * results of a video analysis operation.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c486822afa96b644d8e314f2de6c5e75bf084e891a7b29e89c9216c783eeaebb")
    public open fun s3Destination(`value`: S3DestinationProperty.Builder.() -> Unit): Unit =
        s3Destination(S3DestinationProperty(`value`))

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** A set of tags (key-value pairs) that you want to attach to the stream processor. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** A set of tags (key-value pairs) that you want to attach to the stream processor. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** A set of tags (key-value pairs) that you want to attach to the stream processor. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.rekognition.CfnStreamProcessor]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * List of BoundingBox objects, each of which denotes a region of interest on screen.
         *
         * For more information, see the BoundingBox field of
         * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-boundingboxregionsofinterest)
         *
         * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
         *   region of interest on screen.
         */
        public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: IResolvable)

        /**
         * List of BoundingBox objects, each of which denotes a region of interest on screen.
         *
         * For more information, see the BoundingBox field of
         * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-boundingboxregionsofinterest)
         *
         * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
         *   region of interest on screen.
         */
        public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: List<Any>)

        /**
         * List of BoundingBox objects, each of which denotes a region of interest on screen.
         *
         * For more information, see the BoundingBox field of
         * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-boundingboxregionsofinterest)
         *
         * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
         *   region of interest on screen.
         */
        public fun boundingBoxRegionsOfInterest(vararg boundingBoxRegionsOfInterest: Any)

        /**
         * Connected home settings to use on a streaming video.
         *
         * You can use a stream processor for connected home features and select what you want the
         * stream processor to detect, such as people or pets. When the stream processor has
         * started, one notification is sent for each object class specified. For more information,
         * see the ConnectedHome section of
         * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-connectedhomesettings)
         *
         * @param connectedHomeSettings Connected home settings to use on a streaming video.
         */
        public fun connectedHomeSettings(connectedHomeSettings: IResolvable)

        /**
         * Connected home settings to use on a streaming video.
         *
         * You can use a stream processor for connected home features and select what you want the
         * stream processor to detect, such as people or pets. When the stream processor has
         * started, one notification is sent for each object class specified. For more information,
         * see the ConnectedHome section of
         * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-connectedhomesettings)
         *
         * @param connectedHomeSettings Connected home settings to use on a streaming video.
         */
        public fun connectedHomeSettings(connectedHomeSettings: ConnectedHomeSettingsProperty)

        /**
         * Connected home settings to use on a streaming video.
         *
         * You can use a stream processor for connected home features and select what you want the
         * stream processor to detect, such as people or pets. When the stream processor has
         * started, one notification is sent for each object class specified. For more information,
         * see the ConnectedHome section of
         * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-connectedhomesettings)
         *
         * @param connectedHomeSettings Connected home settings to use on a streaming video.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6dcc189d64dd7b9e39501f9bf61298a83859e475de162997eb0899961553f788")
        public fun connectedHomeSettings(
            connectedHomeSettings: ConnectedHomeSettingsProperty.Builder.() -> Unit
        )

        /**
         * Allows you to opt in or opt out to share data with Rekognition to improve model
         * performance.
         *
         * You can choose this option at the account level or on a per-stream basis. Note that if
         * you opt out at the account level this setting is ignored on individual streams. For more
         * information, see
         * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-datasharingpreference)
         *
         * @param dataSharingPreference Allows you to opt in or opt out to share data with
         *   Rekognition to improve model performance.
         */
        public fun dataSharingPreference(dataSharingPreference: IResolvable)

        /**
         * Allows you to opt in or opt out to share data with Rekognition to improve model
         * performance.
         *
         * You can choose this option at the account level or on a per-stream basis. Note that if
         * you opt out at the account level this setting is ignored on individual streams. For more
         * information, see
         * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-datasharingpreference)
         *
         * @param dataSharingPreference Allows you to opt in or opt out to share data with
         *   Rekognition to improve model performance.
         */
        public fun dataSharingPreference(dataSharingPreference: DataSharingPreferenceProperty)

        /**
         * Allows you to opt in or opt out to share data with Rekognition to improve model
         * performance.
         *
         * You can choose this option at the account level or on a per-stream basis. Note that if
         * you opt out at the account level this setting is ignored on individual streams. For more
         * information, see
         * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-datasharingpreference)
         *
         * @param dataSharingPreference Allows you to opt in or opt out to share data with
         *   Rekognition to improve model performance.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e60578ad8922c64e0c0ae907cb984e9edd221c57e73ceb3adeafbc9ceee53c1b")
        public fun dataSharingPreference(
            dataSharingPreference: DataSharingPreferenceProperty.Builder.() -> Unit
        )

        /**
         * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
         * Rekognition stream processor.
         *
         * For more information regarding the contents of the parameters, see
         * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-facesearchsettings)
         *
         * @param faceSearchSettings The input parameters used to recognize faces in a streaming
         *   video analyzed by an Amazon Rekognition stream processor.
         */
        public fun faceSearchSettings(faceSearchSettings: IResolvable)

        /**
         * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
         * Rekognition stream processor.
         *
         * For more information regarding the contents of the parameters, see
         * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-facesearchsettings)
         *
         * @param faceSearchSettings The input parameters used to recognize faces in a streaming
         *   video analyzed by an Amazon Rekognition stream processor.
         */
        public fun faceSearchSettings(faceSearchSettings: FaceSearchSettingsProperty)

        /**
         * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
         * Rekognition stream processor.
         *
         * For more information regarding the contents of the parameters, see
         * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-facesearchsettings)
         *
         * @param faceSearchSettings The input parameters used to recognize faces in a streaming
         *   video analyzed by an Amazon Rekognition stream processor.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("82fc4261e3fd5e80298d1996f3e3c9cb76cc436f381309ca4c188f7283265555")
        public fun faceSearchSettings(
            faceSearchSettings: FaceSearchSettingsProperty.Builder.() -> Unit
        )

        /**
         * Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input.
         *
         * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
         * processor streams the analysis results. This must be created within the constraints
         * specified at
         * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisdatastream)
         *
         * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis
         *   video stream as input.
         */
        public fun kinesisDataStream(kinesisDataStream: IResolvable)

        /**
         * Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input.
         *
         * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
         * processor streams the analysis results. This must be created within the constraints
         * specified at
         * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisdatastream)
         *
         * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis
         *   video stream as input.
         */
        public fun kinesisDataStream(kinesisDataStream: KinesisDataStreamProperty)

        /**
         * Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input.
         *
         * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
         * processor streams the analysis results. This must be created within the constraints
         * specified at
         * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisdatastream)
         *
         * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis
         *   video stream as input.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("1327b8dfe08728ad8a4a963d4d8113fd2de16847b083f60dba7fd09e3c38a56b")
        public fun kinesisDataStream(
            kinesisDataStream: KinesisDataStreamProperty.Builder.() -> Unit
        )

        /**
         * The Kinesis video stream that provides the source of the streaming video for an Amazon
         * Rekognition Video stream processor.
         *
         * For more information, see
         * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisvideostream)
         *
         * @param kinesisVideoStream The Kinesis video stream that provides the source of the
         *   streaming video for an Amazon Rekognition Video stream processor.
         */
        public fun kinesisVideoStream(kinesisVideoStream: IResolvable)

        /**
         * The Kinesis video stream that provides the source of the streaming video for an Amazon
         * Rekognition Video stream processor.
         *
         * For more information, see
         * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisvideostream)
         *
         * @param kinesisVideoStream The Kinesis video stream that provides the source of the
         *   streaming video for an Amazon Rekognition Video stream processor.
         */
        public fun kinesisVideoStream(kinesisVideoStream: KinesisVideoStreamProperty)

        /**
         * The Kinesis video stream that provides the source of the streaming video for an Amazon
         * Rekognition Video stream processor.
         *
         * For more information, see
         * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisvideostream)
         *
         * @param kinesisVideoStream The Kinesis video stream that provides the source of the
         *   streaming video for an Amazon Rekognition Video stream processor.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e6cd4d5b1ef02e8a26a9ea52d0de652e36e2c355e6e5a868c4b37ff6bc0f6019")
        public fun kinesisVideoStream(
            kinesisVideoStream: KinesisVideoStreamProperty.Builder.() -> Unit
        )

        /**
         * The identifier for your Amazon Key Management Service key (Amazon KMS key).
         *
         * Optional parameter for connected home stream processors used to encrypt results and data
         * published to your Amazon S3 bucket. For more information, see the KMSKeyId section of
         * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kmskeyid)
         *
         * @param kmsKeyId The identifier for your Amazon Key Management Service key (Amazon KMS
         *   key).
         */
        public fun kmsKeyId(kmsKeyId: String)

        /**
         * The Name attribute specifies the name of the stream processor and it must be within the
         * constraints described in the Name section of
         * [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
         * . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses that
         * ID for the stream processor name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-name)
         *
         * @param name The Name attribute specifies the name of the stream processor and it must be
         *   within the constraints described in the Name section of
         *   [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
         *   . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses
         *   that ID for the stream processor name.
         */
        public fun name(name: String)

        /**
         * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the
         * object detection results and completion status of a video analysis operation.
         *
         * Amazon Rekognition publishes a notification the first time an object of interest or a
         * person is detected in the video stream. Amazon Rekognition also publishes an
         * end-of-session notification with a summary when the stream processing session is
         * complete. For more information, see
         * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-notificationchannel)
         *
         * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
         *   Rekognition publishes the object detection results and completion status of a video
         *   analysis operation.
         */
        public fun notificationChannel(notificationChannel: IResolvable)

        /**
         * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the
         * object detection results and completion status of a video analysis operation.
         *
         * Amazon Rekognition publishes a notification the first time an object of interest or a
         * person is detected in the video stream. Amazon Rekognition also publishes an
         * end-of-session notification with a summary when the stream processing session is
         * complete. For more information, see
         * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-notificationchannel)
         *
         * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
         *   Rekognition publishes the object detection results and completion status of a video
         *   analysis operation.
         */
        public fun notificationChannel(notificationChannel: NotificationChannelProperty)

        /**
         * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the
         * object detection results and completion status of a video analysis operation.
         *
         * Amazon Rekognition publishes a notification the first time an object of interest or a
         * person is detected in the video stream. Amazon Rekognition also publishes an
         * end-of-session notification with a summary when the stream processing session is
         * complete. For more information, see
         * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-notificationchannel)
         *
         * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
         *   Rekognition publishes the object detection results and completion status of a video
         *   analysis operation.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6de3e7e6dcf25778967cf555d6cd8f7e27b9d67c26332a4c8fd43bafdd64a998")
        public fun notificationChannel(
            notificationChannel: NotificationChannelProperty.Builder.() -> Unit
        )

        /**
         * A set of ordered lists of
         * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects.
         * Each entry of the set contains a polygon denoting a region of interest on the screen.
         * Each polygon is an ordered list of
         * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects.
         * For more information, see the Polygon field of
         * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-polygonregionsofinterest)
         *
         * @param polygonRegionsOfInterest A set of ordered lists of
         *   [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects.
         *   Each entry of the set contains a polygon denoting a region of interest on the screen.
         *   Each polygon is an ordered list of
         *   [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects.
         *   For more information, see the Polygon field of
         *   [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
         *   .
         */
        public fun polygonRegionsOfInterest(polygonRegionsOfInterest: Any)

        /**
         * The ARN of the IAM role that allows access to the stream processor.
         *
         * The IAM role provides Rekognition read permissions to the Kinesis stream. It also
         * provides write permissions to an Amazon S3 bucket and Amazon Simple Notification Service
         * topic for a connected home stream processor. This is required for both face search and
         * connected home stream processors. For information about constraints, see the RoleArn
         * section of
         * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-rolearn)
         *
         * @param roleArn The ARN of the IAM role that allows access to the stream processor.
         */
        public fun roleArn(roleArn: String)

        /**
         * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed
         * inference results of a video analysis operation.
         *
         * For more information, see the S3Destination section of
         * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-s3destination)
         *
         * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes
         *   the detailed inference results of a video analysis operation.
         */
        public fun s3Destination(s3Destination: IResolvable)

        /**
         * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed
         * inference results of a video analysis operation.
         *
         * For more information, see the S3Destination section of
         * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-s3destination)
         *
         * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes
         *   the detailed inference results of a video analysis operation.
         */
        public fun s3Destination(s3Destination: S3DestinationProperty)

        /**
         * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed
         * inference results of a video analysis operation.
         *
         * For more information, see the S3Destination section of
         * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-s3destination)
         *
         * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes
         *   the detailed inference results of a video analysis operation.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("157e6c6a57e4e2b0411189d582a8d38aed20235a06a942c6a3e506552af482f8")
        public fun s3Destination(s3Destination: S3DestinationProperty.Builder.() -> Unit)

        /**
         * A set of tags (key-value pairs) that you want to attach to the stream processor.
         *
         * For more information, see the Tags section of
         * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-tags)
         *
         * @param tags A set of tags (key-value pairs) that you want to attach to the stream
         *   processor.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * A set of tags (key-value pairs) that you want to attach to the stream processor.
         *
         * For more information, see the Tags section of
         * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-tags)
         *
         * @param tags A set of tags (key-value pairs) that you want to attach to the stream
         *   processor.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.rekognition.CfnStreamProcessor.Builder =
            software.amazon.awscdk.services.rekognition.CfnStreamProcessor.Builder.create(scope, id)

        /**
         * List of BoundingBox objects, each of which denotes a region of interest on screen.
         *
         * For more information, see the BoundingBox field of
         * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-boundingboxregionsofinterest)
         *
         * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
         *   region of interest on screen.
         */
        override fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: IResolvable) {
            cdkBuilder.boundingBoxRegionsOfInterest(
                boundingBoxRegionsOfInterest.let(IResolvable::unwrap)
            )
        }

        /**
         * List of BoundingBox objects, each of which denotes a region of interest on screen.
         *
         * For more information, see the BoundingBox field of
         * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-boundingboxregionsofinterest)
         *
         * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
         *   region of interest on screen.
         */
        override fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: List<Any>) {
            cdkBuilder.boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest)
        }

        /**
         * List of BoundingBox objects, each of which denotes a region of interest on screen.
         *
         * For more information, see the BoundingBox field of
         * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-boundingboxregionsofinterest)
         *
         * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
         *   region of interest on screen.
         */
        override fun boundingBoxRegionsOfInterest(vararg boundingBoxRegionsOfInterest: Any): Unit =
            boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest.toList())

        /**
         * Connected home settings to use on a streaming video.
         *
         * You can use a stream processor for connected home features and select what you want the
         * stream processor to detect, such as people or pets. When the stream processor has
         * started, one notification is sent for each object class specified. For more information,
         * see the ConnectedHome section of
         * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-connectedhomesettings)
         *
         * @param connectedHomeSettings Connected home settings to use on a streaming video.
         */
        override fun connectedHomeSettings(connectedHomeSettings: IResolvable) {
            cdkBuilder.connectedHomeSettings(connectedHomeSettings.let(IResolvable::unwrap))
        }

        /**
         * Connected home settings to use on a streaming video.
         *
         * You can use a stream processor for connected home features and select what you want the
         * stream processor to detect, such as people or pets. When the stream processor has
         * started, one notification is sent for each object class specified. For more information,
         * see the ConnectedHome section of
         * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-connectedhomesettings)
         *
         * @param connectedHomeSettings Connected home settings to use on a streaming video.
         */
        override fun connectedHomeSettings(connectedHomeSettings: ConnectedHomeSettingsProperty) {
            cdkBuilder.connectedHomeSettings(
                connectedHomeSettings.let(ConnectedHomeSettingsProperty::unwrap)
            )
        }

        /**
         * Connected home settings to use on a streaming video.
         *
         * You can use a stream processor for connected home features and select what you want the
         * stream processor to detect, such as people or pets. When the stream processor has
         * started, one notification is sent for each object class specified. For more information,
         * see the ConnectedHome section of
         * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-connectedhomesettings)
         *
         * @param connectedHomeSettings Connected home settings to use on a streaming video.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6dcc189d64dd7b9e39501f9bf61298a83859e475de162997eb0899961553f788")
        override fun connectedHomeSettings(
            connectedHomeSettings: ConnectedHomeSettingsProperty.Builder.() -> Unit
        ): Unit = connectedHomeSettings(ConnectedHomeSettingsProperty(connectedHomeSettings))

        /**
         * Allows you to opt in or opt out to share data with Rekognition to improve model
         * performance.
         *
         * You can choose this option at the account level or on a per-stream basis. Note that if
         * you opt out at the account level this setting is ignored on individual streams. For more
         * information, see
         * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-datasharingpreference)
         *
         * @param dataSharingPreference Allows you to opt in or opt out to share data with
         *   Rekognition to improve model performance.
         */
        override fun dataSharingPreference(dataSharingPreference: IResolvable) {
            cdkBuilder.dataSharingPreference(dataSharingPreference.let(IResolvable::unwrap))
        }

        /**
         * Allows you to opt in or opt out to share data with Rekognition to improve model
         * performance.
         *
         * You can choose this option at the account level or on a per-stream basis. Note that if
         * you opt out at the account level this setting is ignored on individual streams. For more
         * information, see
         * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-datasharingpreference)
         *
         * @param dataSharingPreference Allows you to opt in or opt out to share data with
         *   Rekognition to improve model performance.
         */
        override fun dataSharingPreference(dataSharingPreference: DataSharingPreferenceProperty) {
            cdkBuilder.dataSharingPreference(
                dataSharingPreference.let(DataSharingPreferenceProperty::unwrap)
            )
        }

        /**
         * Allows you to opt in or opt out to share data with Rekognition to improve model
         * performance.
         *
         * You can choose this option at the account level or on a per-stream basis. Note that if
         * you opt out at the account level this setting is ignored on individual streams. For more
         * information, see
         * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-datasharingpreference)
         *
         * @param dataSharingPreference Allows you to opt in or opt out to share data with
         *   Rekognition to improve model performance.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e60578ad8922c64e0c0ae907cb984e9edd221c57e73ceb3adeafbc9ceee53c1b")
        override fun dataSharingPreference(
            dataSharingPreference: DataSharingPreferenceProperty.Builder.() -> Unit
        ): Unit = dataSharingPreference(DataSharingPreferenceProperty(dataSharingPreference))

        /**
         * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
         * Rekognition stream processor.
         *
         * For more information regarding the contents of the parameters, see
         * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-facesearchsettings)
         *
         * @param faceSearchSettings The input parameters used to recognize faces in a streaming
         *   video analyzed by an Amazon Rekognition stream processor.
         */
        override fun faceSearchSettings(faceSearchSettings: IResolvable) {
            cdkBuilder.faceSearchSettings(faceSearchSettings.let(IResolvable::unwrap))
        }

        /**
         * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
         * Rekognition stream processor.
         *
         * For more information regarding the contents of the parameters, see
         * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-facesearchsettings)
         *
         * @param faceSearchSettings The input parameters used to recognize faces in a streaming
         *   video analyzed by an Amazon Rekognition stream processor.
         */
        override fun faceSearchSettings(faceSearchSettings: FaceSearchSettingsProperty) {
            cdkBuilder.faceSearchSettings(
                faceSearchSettings.let(FaceSearchSettingsProperty::unwrap)
            )
        }

        /**
         * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
         * Rekognition stream processor.
         *
         * For more information regarding the contents of the parameters, see
         * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-facesearchsettings)
         *
         * @param faceSearchSettings The input parameters used to recognize faces in a streaming
         *   video analyzed by an Amazon Rekognition stream processor.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("82fc4261e3fd5e80298d1996f3e3c9cb76cc436f381309ca4c188f7283265555")
        override fun faceSearchSettings(
            faceSearchSettings: FaceSearchSettingsProperty.Builder.() -> Unit
        ): Unit = faceSearchSettings(FaceSearchSettingsProperty(faceSearchSettings))

        /**
         * Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input.
         *
         * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
         * processor streams the analysis results. This must be created within the constraints
         * specified at
         * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisdatastream)
         *
         * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis
         *   video stream as input.
         */
        override fun kinesisDataStream(kinesisDataStream: IResolvable) {
            cdkBuilder.kinesisDataStream(kinesisDataStream.let(IResolvable::unwrap))
        }

        /**
         * Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input.
         *
         * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
         * processor streams the analysis results. This must be created within the constraints
         * specified at
         * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisdatastream)
         *
         * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis
         *   video stream as input.
         */
        override fun kinesisDataStream(kinesisDataStream: KinesisDataStreamProperty) {
            cdkBuilder.kinesisDataStream(kinesisDataStream.let(KinesisDataStreamProperty::unwrap))
        }

        /**
         * Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input.
         *
         * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
         * processor streams the analysis results. This must be created within the constraints
         * specified at
         * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisdatastream)
         *
         * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis
         *   video stream as input.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("1327b8dfe08728ad8a4a963d4d8113fd2de16847b083f60dba7fd09e3c38a56b")
        override fun kinesisDataStream(
            kinesisDataStream: KinesisDataStreamProperty.Builder.() -> Unit
        ): Unit = kinesisDataStream(KinesisDataStreamProperty(kinesisDataStream))

        /**
         * The Kinesis video stream that provides the source of the streaming video for an Amazon
         * Rekognition Video stream processor.
         *
         * For more information, see
         * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisvideostream)
         *
         * @param kinesisVideoStream The Kinesis video stream that provides the source of the
         *   streaming video for an Amazon Rekognition Video stream processor.
         */
        override fun kinesisVideoStream(kinesisVideoStream: IResolvable) {
            cdkBuilder.kinesisVideoStream(kinesisVideoStream.let(IResolvable::unwrap))
        }

        /**
         * The Kinesis video stream that provides the source of the streaming video for an Amazon
         * Rekognition Video stream processor.
         *
         * For more information, see
         * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisvideostream)
         *
         * @param kinesisVideoStream The Kinesis video stream that provides the source of the
         *   streaming video for an Amazon Rekognition Video stream processor.
         */
        override fun kinesisVideoStream(kinesisVideoStream: KinesisVideoStreamProperty) {
            cdkBuilder.kinesisVideoStream(
                kinesisVideoStream.let(KinesisVideoStreamProperty::unwrap)
            )
        }

        /**
         * The Kinesis video stream that provides the source of the streaming video for an Amazon
         * Rekognition Video stream processor.
         *
         * For more information, see
         * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisvideostream)
         *
         * @param kinesisVideoStream The Kinesis video stream that provides the source of the
         *   streaming video for an Amazon Rekognition Video stream processor.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e6cd4d5b1ef02e8a26a9ea52d0de652e36e2c355e6e5a868c4b37ff6bc0f6019")
        override fun kinesisVideoStream(
            kinesisVideoStream: KinesisVideoStreamProperty.Builder.() -> Unit
        ): Unit = kinesisVideoStream(KinesisVideoStreamProperty(kinesisVideoStream))

        /**
         * The identifier for your Amazon Key Management Service key (Amazon KMS key).
         *
         * Optional parameter for connected home stream processors used to encrypt results and data
         * published to your Amazon S3 bucket. For more information, see the KMSKeyId section of
         * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kmskeyid)
         *
         * @param kmsKeyId The identifier for your Amazon Key Management Service key (Amazon KMS
         *   key).
         */
        override fun kmsKeyId(kmsKeyId: String) {
            cdkBuilder.kmsKeyId(kmsKeyId)
        }

        /**
         * The Name attribute specifies the name of the stream processor and it must be within the
         * constraints described in the Name section of
         * [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
         * . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses that
         * ID for the stream processor name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-name)
         *
         * @param name The Name attribute specifies the name of the stream processor and it must be
         *   within the constraints described in the Name section of
         *   [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
         *   . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses
         *   that ID for the stream processor name.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the
         * object detection results and completion status of a video analysis operation.
         *
         * Amazon Rekognition publishes a notification the first time an object of interest or a
         * person is detected in the video stream. Amazon Rekognition also publishes an
         * end-of-session notification with a summary when the stream processing session is
         * complete. For more information, see
         * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-notificationchannel)
         *
         * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
         *   Rekognition publishes the object detection results and completion status of a video
         *   analysis operation.
         */
        override fun notificationChannel(notificationChannel: IResolvable) {
            cdkBuilder.notificationChannel(notificationChannel.let(IResolvable::unwrap))
        }

        /**
         * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the
         * object detection results and completion status of a video analysis operation.
         *
         * Amazon Rekognition publishes a notification the first time an object of interest or a
         * person is detected in the video stream. Amazon Rekognition also publishes an
         * end-of-session notification with a summary when the stream processing session is
         * complete. For more information, see
         * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-notificationchannel)
         *
         * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
         *   Rekognition publishes the object detection results and completion status of a video
         *   analysis operation.
         */
        override fun notificationChannel(notificationChannel: NotificationChannelProperty) {
            cdkBuilder.notificationChannel(
                notificationChannel.let(NotificationChannelProperty::unwrap)
            )
        }

        /**
         * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the
         * object detection results and completion status of a video analysis operation.
         *
         * Amazon Rekognition publishes a notification the first time an object of interest or a
         * person is detected in the video stream. Amazon Rekognition also publishes an
         * end-of-session notification with a summary when the stream processing session is
         * complete. For more information, see
         * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-notificationchannel)
         *
         * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
         *   Rekognition publishes the object detection results and completion status of a video
         *   analysis operation.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6de3e7e6dcf25778967cf555d6cd8f7e27b9d67c26332a4c8fd43bafdd64a998")
        override fun notificationChannel(
            notificationChannel: NotificationChannelProperty.Builder.() -> Unit
        ): Unit = notificationChannel(NotificationChannelProperty(notificationChannel))

        /**
         * A set of ordered lists of
         * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects.
         * Each entry of the set contains a polygon denoting a region of interest on the screen.
         * Each polygon is an ordered list of
         * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects.
         * For more information, see the Polygon field of
         * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-polygonregionsofinterest)
         *
         * @param polygonRegionsOfInterest A set of ordered lists of
         *   [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects.
         *   Each entry of the set contains a polygon denoting a region of interest on the screen.
         *   Each polygon is an ordered list of
         *   [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects.
         *   For more information, see the Polygon field of
         *   [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
         *   .
         */
        override fun polygonRegionsOfInterest(polygonRegionsOfInterest: Any) {
            cdkBuilder.polygonRegionsOfInterest(polygonRegionsOfInterest)
        }

        /**
         * The ARN of the IAM role that allows access to the stream processor.
         *
         * The IAM role provides Rekognition read permissions to the Kinesis stream. It also
         * provides write permissions to an Amazon S3 bucket and Amazon Simple Notification Service
         * topic for a connected home stream processor. This is required for both face search and
         * connected home stream processors. For information about constraints, see the RoleArn
         * section of
         * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-rolearn)
         *
         * @param roleArn The ARN of the IAM role that allows access to the stream processor.
         */
        override fun roleArn(roleArn: String) {
            cdkBuilder.roleArn(roleArn)
        }

        /**
         * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed
         * inference results of a video analysis operation.
         *
         * For more information, see the S3Destination section of
         * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-s3destination)
         *
         * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes
         *   the detailed inference results of a video analysis operation.
         */
        override fun s3Destination(s3Destination: IResolvable) {
            cdkBuilder.s3Destination(s3Destination.let(IResolvable::unwrap))
        }

        /**
         * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed
         * inference results of a video analysis operation.
         *
         * For more information, see the S3Destination section of
         * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-s3destination)
         *
         * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes
         *   the detailed inference results of a video analysis operation.
         */
        override fun s3Destination(s3Destination: S3DestinationProperty) {
            cdkBuilder.s3Destination(s3Destination.let(S3DestinationProperty::unwrap))
        }

        /**
         * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed
         * inference results of a video analysis operation.
         *
         * For more information, see the S3Destination section of
         * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-s3destination)
         *
         * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes
         *   the detailed inference results of a video analysis operation.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("157e6c6a57e4e2b0411189d582a8d38aed20235a06a942c6a3e506552af482f8")
        override fun s3Destination(s3Destination: S3DestinationProperty.Builder.() -> Unit): Unit =
            s3Destination(S3DestinationProperty(s3Destination))

        /**
         * A set of tags (key-value pairs) that you want to attach to the stream processor.
         *
         * For more information, see the Tags section of
         * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-tags)
         *
         * @param tags A set of tags (key-value pairs) that you want to attach to the stream
         *   processor.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * A set of tags (key-value pairs) that you want to attach to the stream processor.
         *
         * For more information, see the Tags section of
         * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-tags)
         *
         * @param tags A set of tags (key-value pairs) that you want to attach to the stream
         *   processor.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.rekognition.CfnStreamProcessor =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnStreamProcessor {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnStreamProcessor(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessor
        ): CfnStreamProcessor = CfnStreamProcessor(cdkObject)

        internal fun unwrap(
            wrapped: CfnStreamProcessor
        ): software.amazon.awscdk.services.rekognition.CfnStreamProcessor = wrapped.cdkObject
    }

    public interface DataSharingPreferenceProperty {
        /**
         * Describes the opt-in status applied to a stream processor's data sharing policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-datasharingpreference.html#cfn-rekognition-streamprocessor-datasharingpreference-optin)
         */
        public fun optIn(): Any

        /** A builder for [DataSharingPreferenceProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param optIn Describes the opt-in status applied to a stream processor's data sharing
             *   policy.
             */
            public fun optIn(optIn: Boolean)

            /**
             * @param optIn Describes the opt-in status applied to a stream processor's data sharing
             *   policy.
             */
            public fun optIn(optIn: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty.Builder =
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor
                    .DataSharingPreferenceProperty
                    .builder()

            /**
             * @param optIn Describes the opt-in status applied to a stream processor's data sharing
             *   policy.
             */
            override fun optIn(optIn: Boolean) {
                cdkBuilder.optIn(optIn)
            }

            /**
             * @param optIn Describes the opt-in status applied to a stream processor's data sharing
             *   policy.
             */
            override fun optIn(optIn: IResolvable) {
                cdkBuilder.optIn(optIn.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty,
        ) : DataSharingPreferenceProperty {
            /**
             * Describes the opt-in status applied to a stream processor's data sharing policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-datasharingpreference.html#cfn-rekognition-streamprocessor-datasharingpreference-optin)
             */
            override fun optIn(): Any = unwrap(this).getOptIn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): DataSharingPreferenceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty
            ): DataSharingPreferenceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DataSharingPreferenceProperty
            ): software.amazon.awscdk.services.rekognition.CfnStreamProcessor.DataSharingPreferenceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface NotificationChannelProperty {
        /**
         * The ARN of the SNS topic that receives notifications.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-notificationchannel.html#cfn-rekognition-streamprocessor-notificationchannel-arn)
         */
        public fun arn(): String

        /** A builder for [NotificationChannelProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn The ARN of the SNS topic that receives notifications. */
            public fun arn(arn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty.Builder =
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor
                    .NotificationChannelProperty
                    .builder()

            /** @param arn The ARN of the SNS topic that receives notifications. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            public fun build():
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty,
        ) : NotificationChannelProperty {
            /**
             * The ARN of the SNS topic that receives notifications.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-notificationchannel.html#cfn-rekognition-streamprocessor-notificationchannel-arn)
             */
            override fun arn(): String = unwrap(this).getArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): NotificationChannelProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty
            ): NotificationChannelProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: NotificationChannelProperty
            ): software.amazon.awscdk.services.rekognition.CfnStreamProcessor.NotificationChannelProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface BoundingBoxProperty {
        /**
         * Height of the bounding box as a ratio of the overall image height.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-boundingbox.html#cfn-rekognition-streamprocessor-boundingbox-height)
         */
        public fun height(): Number

        /**
         * Left coordinate of the bounding box as a ratio of overall image width.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-boundingbox.html#cfn-rekognition-streamprocessor-boundingbox-left)
         */
        public fun left(): Number

        /**
         * Top coordinate of the bounding box as a ratio of overall image height.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-boundingbox.html#cfn-rekognition-streamprocessor-boundingbox-top)
         */
        public fun top(): Number

        /**
         * Width of the bounding box as a ratio of the overall image width.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-boundingbox.html#cfn-rekognition-streamprocessor-boundingbox-width)
         */
        public fun width(): Number

        /** A builder for [BoundingBoxProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param height Height of the bounding box as a ratio of the overall image height. */
            public fun height(height: Number)

            /**
             * @param left Left coordinate of the bounding box as a ratio of overall image width.
             */
            public fun left(left: Number)

            /** @param top Top coordinate of the bounding box as a ratio of overall image height. */
            public fun top(top: Number)

            /** @param width Width of the bounding box as a ratio of the overall image width. */
            public fun width(width: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty.Builder =
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty
                    .builder()

            /** @param height Height of the bounding box as a ratio of the overall image height. */
            override fun height(height: Number) {
                cdkBuilder.height(height)
            }

            /**
             * @param left Left coordinate of the bounding box as a ratio of overall image width.
             */
            override fun left(left: Number) {
                cdkBuilder.left(left)
            }

            /** @param top Top coordinate of the bounding box as a ratio of overall image height. */
            override fun top(top: Number) {
                cdkBuilder.top(top)
            }

            /** @param width Width of the bounding box as a ratio of the overall image width. */
            override fun width(width: Number) {
                cdkBuilder.width(width)
            }

            public fun build():
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty,
        ) : BoundingBoxProperty {
            /**
             * Height of the bounding box as a ratio of the overall image height.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-boundingbox.html#cfn-rekognition-streamprocessor-boundingbox-height)
             */
            override fun height(): Number = unwrap(this).getHeight()

            /**
             * Left coordinate of the bounding box as a ratio of overall image width.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-boundingbox.html#cfn-rekognition-streamprocessor-boundingbox-left)
             */
            override fun left(): Number = unwrap(this).getLeft()

            /**
             * Top coordinate of the bounding box as a ratio of overall image height.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-boundingbox.html#cfn-rekognition-streamprocessor-boundingbox-top)
             */
            override fun top(): Number = unwrap(this).getTop()

            /**
             * Width of the bounding box as a ratio of the overall image width.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-boundingbox.html#cfn-rekognition-streamprocessor-boundingbox-width)
             */
            override fun width(): Number = unwrap(this).getWidth()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): BoundingBoxProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty
            ): BoundingBoxProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: BoundingBoxProperty
            ): software.amazon.awscdk.services.rekognition.CfnStreamProcessor.BoundingBoxProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ConnectedHomeSettingsProperty {
        /**
         * Specifies what you want to detect in the video, such as people, packages, or pets.
         *
         * The current valid labels you can include in this list are: "PERSON", "PET", "PACKAGE",
         * and "ALL".
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-connectedhomesettings.html#cfn-rekognition-streamprocessor-connectedhomesettings-labels)
         */
        public fun labels(): List<String>

        /**
         * The minimum confidence required to label an object in the video.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-connectedhomesettings.html#cfn-rekognition-streamprocessor-connectedhomesettings-minconfidence)
         */
        public fun minConfidence(): Number? = unwrap(this).getMinConfidence()

        /** A builder for [ConnectedHomeSettingsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param labels Specifies what you want to detect in the video, such as people,
             *   packages, or pets. The current valid labels you can include in this list are:
             *   "PERSON", "PET", "PACKAGE", and "ALL".
             */
            public fun labels(labels: List<String>)

            /**
             * @param labels Specifies what you want to detect in the video, such as people,
             *   packages, or pets. The current valid labels you can include in this list are:
             *   "PERSON", "PET", "PACKAGE", and "ALL".
             */
            public fun labels(vararg labels: String)

            /**
             * @param minConfidence The minimum confidence required to label an object in the video.
             */
            public fun minConfidence(minConfidence: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty.Builder =
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor
                    .ConnectedHomeSettingsProperty
                    .builder()

            /**
             * @param labels Specifies what you want to detect in the video, such as people,
             *   packages, or pets. The current valid labels you can include in this list are:
             *   "PERSON", "PET", "PACKAGE", and "ALL".
             */
            override fun labels(labels: List<String>) {
                cdkBuilder.labels(labels)
            }

            /**
             * @param labels Specifies what you want to detect in the video, such as people,
             *   packages, or pets. The current valid labels you can include in this list are:
             *   "PERSON", "PET", "PACKAGE", and "ALL".
             */
            override fun labels(vararg labels: String): Unit = labels(labels.toList())

            /**
             * @param minConfidence The minimum confidence required to label an object in the video.
             */
            override fun minConfidence(minConfidence: Number) {
                cdkBuilder.minConfidence(minConfidence)
            }

            public fun build():
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty,
        ) : ConnectedHomeSettingsProperty {
            /**
             * Specifies what you want to detect in the video, such as people, packages, or pets.
             *
             * The current valid labels you can include in this list are: "PERSON", "PET",
             * "PACKAGE", and "ALL".
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-connectedhomesettings.html#cfn-rekognition-streamprocessor-connectedhomesettings-labels)
             */
            override fun labels(): List<String> = unwrap(this).getLabels()

            /**
             * The minimum confidence required to label an object in the video.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-connectedhomesettings.html#cfn-rekognition-streamprocessor-connectedhomesettings-minconfidence)
             */
            override fun minConfidence(): Number? = unwrap(this).getMinConfidence()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ConnectedHomeSettingsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty
            ): ConnectedHomeSettingsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ConnectedHomeSettingsProperty
            ): software.amazon.awscdk.services.rekognition.CfnStreamProcessor.ConnectedHomeSettingsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface KinesisDataStreamProperty {
        /**
         * ARN of the output Amazon Kinesis Data Streams stream.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-kinesisdatastream.html#cfn-rekognition-streamprocessor-kinesisdatastream-arn)
         */
        public fun arn(): String

        /** A builder for [KinesisDataStreamProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn ARN of the output Amazon Kinesis Data Streams stream. */
            public fun arn(arn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty.Builder =
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor
                    .KinesisDataStreamProperty
                    .builder()

            /** @param arn ARN of the output Amazon Kinesis Data Streams stream. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            public fun build():
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty,
        ) : KinesisDataStreamProperty {
            /**
             * ARN of the output Amazon Kinesis Data Streams stream.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-kinesisdatastream.html#cfn-rekognition-streamprocessor-kinesisdatastream-arn)
             */
            override fun arn(): String = unwrap(this).getArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): KinesisDataStreamProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty
            ): KinesisDataStreamProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: KinesisDataStreamProperty
            ): software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisDataStreamProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface S3DestinationProperty {
        /**
         * Describes the destination Amazon Simple Storage Service (Amazon S3) bucket name of a
         * stream processor's exports.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-s3destination.html#cfn-rekognition-streamprocessor-s3destination-bucketname)
         */
        public fun bucketName(): String

        /**
         * Describes the destination Amazon Simple Storage Service (Amazon S3) object keys of a
         * stream processor's exports.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-s3destination.html#cfn-rekognition-streamprocessor-s3destination-objectkeyprefix)
         */
        public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

        /** A builder for [S3DestinationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param bucketName Describes the destination Amazon Simple Storage Service (Amazon S3)
             *   bucket name of a stream processor's exports.
             */
            public fun bucketName(bucketName: String)

            /**
             * @param objectKeyPrefix Describes the destination Amazon Simple Storage Service
             *   (Amazon S3) object keys of a stream processor's exports.
             */
            public fun objectKeyPrefix(objectKeyPrefix: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty.Builder =
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty
                    .builder()

            /**
             * @param bucketName Describes the destination Amazon Simple Storage Service (Amazon S3)
             *   bucket name of a stream processor's exports.
             */
            override fun bucketName(bucketName: String) {
                cdkBuilder.bucketName(bucketName)
            }

            /**
             * @param objectKeyPrefix Describes the destination Amazon Simple Storage Service
             *   (Amazon S3) object keys of a stream processor's exports.
             */
            override fun objectKeyPrefix(objectKeyPrefix: String) {
                cdkBuilder.objectKeyPrefix(objectKeyPrefix)
            }

            public fun build():
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty,
        ) : S3DestinationProperty {
            /**
             * Describes the destination Amazon Simple Storage Service (Amazon S3) bucket name of a
             * stream processor's exports.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-s3destination.html#cfn-rekognition-streamprocessor-s3destination-bucketname)
             */
            override fun bucketName(): String = unwrap(this).getBucketName()

            /**
             * Describes the destination Amazon Simple Storage Service (Amazon S3) object keys of a
             * stream processor's exports.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-s3destination.html#cfn-rekognition-streamprocessor-s3destination-objectkeyprefix)
             */
            override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): S3DestinationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty
            ): S3DestinationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: S3DestinationProperty
            ): software.amazon.awscdk.services.rekognition.CfnStreamProcessor.S3DestinationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface KinesisVideoStreamProperty {
        /**
         * ARN of the Kinesis video stream stream that streams the source video.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-kinesisvideostream.html#cfn-rekognition-streamprocessor-kinesisvideostream-arn)
         */
        public fun arn(): String

        /** A builder for [KinesisVideoStreamProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn ARN of the Kinesis video stream stream that streams the source video. */
            public fun arn(arn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty.Builder =
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor
                    .KinesisVideoStreamProperty
                    .builder()

            /** @param arn ARN of the Kinesis video stream stream that streams the source video. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            public fun build():
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty,
        ) : KinesisVideoStreamProperty {
            /**
             * ARN of the Kinesis video stream stream that streams the source video.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-kinesisvideostream.html#cfn-rekognition-streamprocessor-kinesisvideostream-arn)
             */
            override fun arn(): String = unwrap(this).getArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): KinesisVideoStreamProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty
            ): KinesisVideoStreamProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: KinesisVideoStreamProperty
            ): software.amazon.awscdk.services.rekognition.CfnStreamProcessor.KinesisVideoStreamProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface FaceSearchSettingsProperty {
        /**
         * The ID of a collection that contains faces that you want to search for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-facesearchsettings.html#cfn-rekognition-streamprocessor-facesearchsettings-collectionid)
         */
        public fun collectionId(): String

        /**
         * Minimum face match confidence score that must be met to return a result for a recognized
         * face.
         *
         * The default is 80. 0 is the lowest confidence. 100 is the highest confidence. Values
         * between 0 and 100 are accepted, and values lower than 80 are set to 80.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-facesearchsettings.html#cfn-rekognition-streamprocessor-facesearchsettings-facematchthreshold)
         */
        public fun faceMatchThreshold(): Number? = unwrap(this).getFaceMatchThreshold()

        /** A builder for [FaceSearchSettingsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param collectionId The ID of a collection that contains faces that you want to
             *   search for.
             */
            public fun collectionId(collectionId: String)

            /**
             * @param faceMatchThreshold Minimum face match confidence score that must be met to
             *   return a result for a recognized face. The default is 80. 0 is the lowest
             *   confidence. 100 is the highest confidence. Values between 0 and 100 are accepted,
             *   and values lower than 80 are set to 80.
             */
            public fun faceMatchThreshold(faceMatchThreshold: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty.Builder =
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor
                    .FaceSearchSettingsProperty
                    .builder()

            /**
             * @param collectionId The ID of a collection that contains faces that you want to
             *   search for.
             */
            override fun collectionId(collectionId: String) {
                cdkBuilder.collectionId(collectionId)
            }

            /**
             * @param faceMatchThreshold Minimum face match confidence score that must be met to
             *   return a result for a recognized face. The default is 80. 0 is the lowest
             *   confidence. 100 is the highest confidence. Values between 0 and 100 are accepted,
             *   and values lower than 80 are set to 80.
             */
            override fun faceMatchThreshold(faceMatchThreshold: Number) {
                cdkBuilder.faceMatchThreshold(faceMatchThreshold)
            }

            public fun build():
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty,
        ) : FaceSearchSettingsProperty {
            /**
             * The ID of a collection that contains faces that you want to search for.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-facesearchsettings.html#cfn-rekognition-streamprocessor-facesearchsettings-collectionid)
             */
            override fun collectionId(): String = unwrap(this).getCollectionId()

            /**
             * Minimum face match confidence score that must be met to return a result for a
             * recognized face.
             *
             * The default is 80. 0 is the lowest confidence. 100 is the highest confidence. Values
             * between 0 and 100 are accepted, and values lower than 80 are set to 80.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-facesearchsettings.html#cfn-rekognition-streamprocessor-facesearchsettings-facematchthreshold)
             */
            override fun faceMatchThreshold(): Number? = unwrap(this).getFaceMatchThreshold()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): FaceSearchSettingsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty
            ): FaceSearchSettingsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: FaceSearchSettingsProperty
            ): software.amazon.awscdk.services.rekognition.CfnStreamProcessor.FaceSearchSettingsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PointProperty {
        /**
         * The value of the X coordinate for a point on a `Polygon` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-point.html#cfn-rekognition-streamprocessor-point-x)
         */
        public fun x(): Number

        /**
         * The value of the Y coordinate for a point on a `Polygon` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-point.html#cfn-rekognition-streamprocessor-point-y)
         */
        public fun y(): Number

        /** A builder for [PointProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param x The value of the X coordinate for a point on a `Polygon` . */
            public fun x(x: Number)

            /** @param y The value of the Y coordinate for a point on a `Polygon` . */
            public fun y(y: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty.Builder =
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty
                    .builder()

            /** @param x The value of the X coordinate for a point on a `Polygon` . */
            override fun x(x: Number) {
                cdkBuilder.x(x)
            }

            /** @param y The value of the Y coordinate for a point on a `Polygon` . */
            override fun y(y: Number) {
                cdkBuilder.y(y)
            }

            public fun build():
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty,
        ) : PointProperty {
            /**
             * The value of the X coordinate for a point on a `Polygon` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-point.html#cfn-rekognition-streamprocessor-point-x)
             */
            override fun x(): Number = unwrap(this).getX()

            /**
             * The value of the Y coordinate for a point on a `Polygon` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-point.html#cfn-rekognition-streamprocessor-point-y)
             */
            override fun y(): Number = unwrap(this).getY()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): PointProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty
            ): PointProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PointProperty
            ): software.amazon.awscdk.services.rekognition.CfnStreamProcessor.PointProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
