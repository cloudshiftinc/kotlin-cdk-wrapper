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

package io.cloudshiftdev.awscdkdsl.services.rekognition

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor
import software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps

/**
 * Properties for defining a `CfnStreamProcessor`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * Object polygonRegionsOfInterest;
 * CfnStreamProcessorProps cfnStreamProcessorProps = CfnStreamProcessorProps.builder()
 * .kinesisVideoStream(KinesisVideoStreamProperty.builder()
 * .arn("arn")
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .boundingBoxRegionsOfInterest(List.of(BoundingBoxProperty.builder()
 * .height(123)
 * .left(123)
 * .top(123)
 * .width(123)
 * .build()))
 * .connectedHomeSettings(ConnectedHomeSettingsProperty.builder()
 * .labels(List.of("labels"))
 * // the properties below are optional
 * .minConfidence(123)
 * .build())
 * .dataSharingPreference(DataSharingPreferenceProperty.builder()
 * .optIn(false)
 * .build())
 * .faceSearchSettings(FaceSearchSettingsProperty.builder()
 * .collectionId("collectionId")
 * // the properties below are optional
 * .faceMatchThreshold(123)
 * .build())
 * .kinesisDataStream(KinesisDataStreamProperty.builder()
 * .arn("arn")
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .name("name")
 * .notificationChannel(NotificationChannelProperty.builder()
 * .arn("arn")
 * .build())
 * .polygonRegionsOfInterest(polygonRegionsOfInterest)
 * .s3Destination(S3DestinationProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .objectKeyPrefix("objectKeyPrefix")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html)
 */
@CdkDslMarker
public class CfnStreamProcessorPropsDsl {
    private val cdkBuilder: CfnStreamProcessorProps.Builder = CfnStreamProcessorProps.builder()

    private val _boundingBoxRegionsOfInterest: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
     *   region of interest on screen. For more information, see the BoundingBox field of
     *   [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     *   .
     */
    public fun boundingBoxRegionsOfInterest(vararg boundingBoxRegionsOfInterest: Any) {
        _boundingBoxRegionsOfInterest.addAll(listOf(*boundingBoxRegionsOfInterest))
    }

    /**
     * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
     *   region of interest on screen. For more information, see the BoundingBox field of
     *   [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     *   .
     */
    public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: Collection<Any>) {
        _boundingBoxRegionsOfInterest.addAll(boundingBoxRegionsOfInterest)
    }

    /**
     * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
     *   region of interest on screen. For more information, see the BoundingBox field of
     *   [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     *   .
     */
    public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: IResolvable) {
        cdkBuilder.boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest)
    }

    /**
     * @param connectedHomeSettings Connected home settings to use on a streaming video. You can use
     *   a stream processor for connected home features and select what you want the stream
     *   processor to detect, such as people or pets. When the stream processor has started, one
     *   notification is sent for each object class specified. For more information, see the
     *   ConnectedHome section of
     *   [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
     *   .
     */
    public fun connectedHomeSettings(connectedHomeSettings: IResolvable) {
        cdkBuilder.connectedHomeSettings(connectedHomeSettings)
    }

    /**
     * @param connectedHomeSettings Connected home settings to use on a streaming video. You can use
     *   a stream processor for connected home features and select what you want the stream
     *   processor to detect, such as people or pets. When the stream processor has started, one
     *   notification is sent for each object class specified. For more information, see the
     *   ConnectedHome section of
     *   [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
     *   .
     */
    public fun connectedHomeSettings(
        connectedHomeSettings: CfnStreamProcessor.ConnectedHomeSettingsProperty
    ) {
        cdkBuilder.connectedHomeSettings(connectedHomeSettings)
    }

    /**
     * @param dataSharingPreference Allows you to opt in or opt out to share data with Rekognition
     *   to improve model performance. You can choose this option at the account level or on a
     *   per-stream basis. Note that if you opt out at the account level this setting is ignored on
     *   individual streams. For more information, see
     *   [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
     *   .
     */
    public fun dataSharingPreference(dataSharingPreference: IResolvable) {
        cdkBuilder.dataSharingPreference(dataSharingPreference)
    }

    /**
     * @param dataSharingPreference Allows you to opt in or opt out to share data with Rekognition
     *   to improve model performance. You can choose this option at the account level or on a
     *   per-stream basis. Note that if you opt out at the account level this setting is ignored on
     *   individual streams. For more information, see
     *   [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
     *   .
     */
    public fun dataSharingPreference(
        dataSharingPreference: CfnStreamProcessor.DataSharingPreferenceProperty
    ) {
        cdkBuilder.dataSharingPreference(dataSharingPreference)
    }

    /**
     * @param faceSearchSettings The input parameters used to recognize faces in a streaming video
     *   analyzed by an Amazon Rekognition stream processor. For more information regarding the
     *   contents of the parameters, see
     *   [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
     *   .
     */
    public fun faceSearchSettings(faceSearchSettings: IResolvable) {
        cdkBuilder.faceSearchSettings(faceSearchSettings)
    }

    /**
     * @param faceSearchSettings The input parameters used to recognize faces in a streaming video
     *   analyzed by an Amazon Rekognition stream processor. For more information regarding the
     *   contents of the parameters, see
     *   [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
     *   .
     */
    public fun faceSearchSettings(
        faceSearchSettings: CfnStreamProcessor.FaceSearchSettingsProperty
    ) {
        cdkBuilder.faceSearchSettings(faceSearchSettings)
    }

    /**
     * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis video
     *   stream as input. This is the Amazon Kinesis Data Streams instance to which the Amazon
     *   Rekognition stream processor streams the analysis results. This must be created within the
     *   constraints specified at
     *   [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
     *   .
     */
    public fun kinesisDataStream(kinesisDataStream: IResolvable) {
        cdkBuilder.kinesisDataStream(kinesisDataStream)
    }

    /**
     * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis video
     *   stream as input. This is the Amazon Kinesis Data Streams instance to which the Amazon
     *   Rekognition stream processor streams the analysis results. This must be created within the
     *   constraints specified at
     *   [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
     *   .
     */
    public fun kinesisDataStream(kinesisDataStream: CfnStreamProcessor.KinesisDataStreamProperty) {
        cdkBuilder.kinesisDataStream(kinesisDataStream)
    }

    /**
     * @param kinesisVideoStream The Kinesis video stream that provides the source of the streaming
     *   video for an Amazon Rekognition Video stream processor. For more information, see
     *   [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
     *   .
     */
    public fun kinesisVideoStream(kinesisVideoStream: IResolvable) {
        cdkBuilder.kinesisVideoStream(kinesisVideoStream)
    }

    /**
     * @param kinesisVideoStream The Kinesis video stream that provides the source of the streaming
     *   video for an Amazon Rekognition Video stream processor. For more information, see
     *   [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
     *   .
     */
    public fun kinesisVideoStream(
        kinesisVideoStream: CfnStreamProcessor.KinesisVideoStreamProperty
    ) {
        cdkBuilder.kinesisVideoStream(kinesisVideoStream)
    }

    /**
     * @param kmsKeyId The identifier for your Amazon Key Management Service key (Amazon KMS key).
     *   Optional parameter for connected home stream processors used to encrypt results and data
     *   published to your Amazon S3 bucket. For more information, see the KMSKeyId section of
     *   [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     *   .
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param name The Name attribute specifies the name of the stream processor and it must be
     *   within the constraints described in the Name section of
     *   [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
     *   . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses that ID
     *   for the stream processor name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
     *   Rekognition publishes the object detection results and completion status of a video
     *   analysis operation. Amazon Rekognition publishes a notification the first time an object of
     *   interest or a person is detected in the video stream. Amazon Rekognition also publishes an
     *   end-of-session notification with a summary when the stream processing session is complete.
     *   For more information, see
     *   [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
     *   .
     */
    public fun notificationChannel(notificationChannel: IResolvable) {
        cdkBuilder.notificationChannel(notificationChannel)
    }

    /**
     * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
     *   Rekognition publishes the object detection results and completion status of a video
     *   analysis operation. Amazon Rekognition publishes a notification the first time an object of
     *   interest or a person is detected in the video stream. Amazon Rekognition also publishes an
     *   end-of-session notification with a summary when the stream processing session is complete.
     *   For more information, see
     *   [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
     *   .
     */
    public fun notificationChannel(
        notificationChannel: CfnStreamProcessor.NotificationChannelProperty
    ) {
        cdkBuilder.notificationChannel(notificationChannel)
    }

    /**
     * @param polygonRegionsOfInterest A set of ordered lists of
     *   [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects.
     *   Each entry of the set contains a polygon denoting a region of interest on the screen. Each
     *   polygon is an ordered list of
     *   [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. For
     *   more information, see the Polygon field of
     *   [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     *   .
     */
    public fun polygonRegionsOfInterest(polygonRegionsOfInterest: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(polygonRegionsOfInterest)
        cdkBuilder.polygonRegionsOfInterest(builder.map)
    }

    /**
     * @param polygonRegionsOfInterest A set of ordered lists of
     *   [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects.
     *   Each entry of the set contains a polygon denoting a region of interest on the screen. Each
     *   polygon is an ordered list of
     *   [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. For
     *   more information, see the Polygon field of
     *   [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     *   .
     */
    public fun polygonRegionsOfInterest(polygonRegionsOfInterest: Any) {
        cdkBuilder.polygonRegionsOfInterest(polygonRegionsOfInterest)
    }

    /**
     * @param roleArn The ARN of the IAM role that allows access to the stream processor. The IAM
     *   role provides Rekognition read permissions to the Kinesis stream. It also provides write
     *   permissions to an Amazon S3 bucket and Amazon Simple Notification Service topic for a
     *   connected home stream processor. This is required for both face search and connected home
     *   stream processors. For information about constraints, see the RoleArn section of
     *   [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     *   .
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes the
     *   detailed inference results of a video analysis operation. For more information, see the
     *   S3Destination section of
     *   [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
     *   .
     */
    public fun s3Destination(s3Destination: IResolvable) {
        cdkBuilder.s3Destination(s3Destination)
    }

    /**
     * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes the
     *   detailed inference results of a video analysis operation. For more information, see the
     *   S3Destination section of
     *   [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
     *   .
     */
    public fun s3Destination(s3Destination: CfnStreamProcessor.S3DestinationProperty) {
        cdkBuilder.s3Destination(s3Destination)
    }

    /**
     * @param tags A set of tags (key-value pairs) that you want to attach to the stream processor.
     *   For more information, see the Tags section of
     *   [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A set of tags (key-value pairs) that you want to attach to the stream processor.
     *   For more information, see the Tags section of
     *   [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStreamProcessorProps {
        if (_boundingBoxRegionsOfInterest.isNotEmpty())
            cdkBuilder.boundingBoxRegionsOfInterest(_boundingBoxRegionsOfInterest)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
