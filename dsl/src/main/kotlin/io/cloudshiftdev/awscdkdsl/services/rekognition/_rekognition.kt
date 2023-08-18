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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnCollection
import software.amazon.awscdk.services.rekognition.CfnCollectionProps
import software.amazon.awscdk.services.rekognition.CfnProject
import software.amazon.awscdk.services.rekognition.CfnProjectProps
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor
import software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps
import software.constructs.Construct

public object rekognition {
    /**
     * The `AWS::Rekognition::Collection` type creates a server-side container called a collection.
     *
     * You can use a collection to store information about detected faces and search for known faces
     * in images, stored videos, and streaming videos.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * CfnCollection cfnCollection = CfnCollection.Builder.create(this, "MyCfnCollection")
     * .collectionId("collectionId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html)
     */
    public inline fun cfnCollection(
        scope: Construct,
        id: String,
        block: CfnCollectionDsl.() -> Unit = {},
    ): CfnCollection {
        val builder = CfnCollectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCollection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * CfnCollectionProps cfnCollectionProps = CfnCollectionProps.builder()
     * .collectionId("collectionId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html)
     */
    public inline fun cfnCollectionProps(
        block: CfnCollectionPropsDsl.() -> Unit = {}
    ): CfnCollectionProps {
        val builder = CfnCollectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Rekognition::Project` type creates an Amazon Rekognition Custom Labels project.
     *
     * A project is a group of resources needed to create and manage versions of an Amazon
     * Rekognition Custom Labels model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
     * .projectName("projectName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-project.html)
     */
    public inline fun cfnProject(
        scope: Construct,
        id: String,
        block: CfnProjectDsl.() -> Unit = {},
    ): CfnProject {
        val builder = CfnProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProject`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
     * .projectName("projectName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-project.html)
     */
    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Rekognition::StreamProcessor` type creates a stream processor used to detect and
     * recognize faces or to detect connected home labels in a streaming video.
     *
     * Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. There
     * are two different settings for stream processors in Amazon Rekognition, one for detecting
     * faces and one for connected home features.
     *
     * If you are creating a stream processor for detecting faces, you provide a Kinesis video
     * stream (input) and a Kinesis data stream (output). You also specify the face recognition
     * criteria in FaceSearchSettings. For example, the collection containing faces that you want to
     * recognize.
     *
     * If you are creating a stream processor for detection of connected home labels, you provide a
     * Kinesis video stream for input, and for output an Amazon S3 bucket and an Amazon SNS topic.
     * You can also provide a KMS key ID to encrypt the data sent to your Amazon S3 bucket. You
     * specify what you want to detect in ConnectedHomeSettings, such as people, packages, and pets.
     *
     * You can also specify where in the frame you want Amazon Rekognition to monitor with
     * BoundingBoxRegionsOfInterest and PolygonRegionsOfInterest. The Name is used to manage the
     * stream processor and it is the identifier for the stream processor. The
     * `AWS::Rekognition::StreamProcessor` resource creates a stream processor in the same Region
     * where you create the Amazon CloudFormation stack.
     *
     * For more information, see
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * Object polygonRegionsOfInterest;
     * CfnStreamProcessor cfnStreamProcessor = CfnStreamProcessor.Builder.create(this,
     * "MyCfnStreamProcessor")
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
    public inline fun cfnStreamProcessor(
        scope: Construct,
        id: String,
        block: CfnStreamProcessorDsl.() -> Unit = {},
    ): CfnStreamProcessor {
        val builder = CfnStreamProcessorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies the bounding box around the label, face, text, or personal protective equipment.
     *
     * The `left` (x-coordinate) and `top` (y-coordinate) are coordinates representing the top and
     * left sides of the bounding box. Note that the upper-left corner of the image is the origin
     * (0,0).
     *
     * The `top` and `left` values returned are ratios of the overall image size. For example, if
     * the input image is 700x200 pixels, and the top-left coordinate of the bounding box is 350x50
     * pixels, the API returns a `left` value of 0.5 (350/700) and a `top` value of 0.25 (50/200).
     *
     * The `width` and `height` values represent the dimensions of the bounding box as a ratio of
     * the overall image dimension. For example, if the input image is 700x200 pixels, and the
     * bounding box width is 70 pixels, the width returned is 0.1. For more information, see
     * [BoundingBox](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_BoundingBox) .
     *
     * The bounding box coordinates can have negative values. For example, if Amazon Rekognition is
     * able to detect a face that is at the image edge and is only partially visible, the service
     * can return coordinates that are outside the image bounds and, depending on the image edge,
     * you might get negative values or values greater than 1 for the `left` or `top` values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * BoundingBoxProperty boundingBoxProperty = BoundingBoxProperty.builder()
     * .height(123)
     * .left(123)
     * .top(123)
     * .width(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-boundingbox.html)
     */
    public inline fun cfnStreamProcessorBoundingBoxProperty(
        block: CfnStreamProcessorBoundingBoxPropertyDsl.() -> Unit = {}
    ): CfnStreamProcessor.BoundingBoxProperty {
        val builder = CfnStreamProcessorBoundingBoxPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Connected home settings to use on a streaming video.
     *
     * Defining the settings is required in the request parameter for `CreateStreamProcessor` .
     * Including this setting in the CreateStreamProcessor request lets you use the stream processor
     * for connected home features. You can then select what you want the stream processor to
     * detect, such as people or pets.
     *
     * When the stream processor has started, one notification is sent for each object class
     * specified. For example, if packages and pets are selected, one SNS notification is published
     * the first time a package is detected and one SNS notification is published the first time a
     * pet is detected. An end-of-session summary is also published. For more information, see the
     * ConnectedHome section of
     * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * ConnectedHomeSettingsProperty connectedHomeSettingsProperty =
     * ConnectedHomeSettingsProperty.builder()
     * .labels(List.of("labels"))
     * // the properties below are optional
     * .minConfidence(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-connectedhomesettings.html)
     */
    public inline fun cfnStreamProcessorConnectedHomeSettingsProperty(
        block: CfnStreamProcessorConnectedHomeSettingsPropertyDsl.() -> Unit = {}
    ): CfnStreamProcessor.ConnectedHomeSettingsProperty {
        val builder = CfnStreamProcessorConnectedHomeSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allows you to opt in or opt out to share data with Rekognition to improve model performance.
     *
     * You can choose this option at the account level or on a per-stream basis. Note that if you
     * opt out at the account level, this setting is ignored on individual streams. For more
     * information, see
     * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * DataSharingPreferenceProperty dataSharingPreferenceProperty =
     * DataSharingPreferenceProperty.builder()
     * .optIn(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-datasharingpreference.html)
     */
    public inline fun cfnStreamProcessorDataSharingPreferenceProperty(
        block: CfnStreamProcessorDataSharingPreferencePropertyDsl.() -> Unit = {}
    ): CfnStreamProcessor.DataSharingPreferenceProperty {
        val builder = CfnStreamProcessorDataSharingPreferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The input parameters used to recognize faces in a streaming video analyzed by a Amazon
     * Rekognition stream processor.
     *
     * `FaceSearchSettings` is a request parameter for
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * . For more information, see
     * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * FaceSearchSettingsProperty faceSearchSettingsProperty = FaceSearchSettingsProperty.builder()
     * .collectionId("collectionId")
     * // the properties below are optional
     * .faceMatchThreshold(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-facesearchsettings.html)
     */
    public inline fun cfnStreamProcessorFaceSearchSettingsProperty(
        block: CfnStreamProcessorFaceSearchSettingsPropertyDsl.() -> Unit = {}
    ): CfnStreamProcessor.FaceSearchSettingsProperty {
        val builder = CfnStreamProcessorFaceSearchSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon Rekognition Video Stream Processor take as input a Kinesis video stream (Input) and a
     * Kinesis data stream (Output).
     *
     * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
     * processor streams the analysis results. This must be created within the constraints specified
     * at
     * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * KinesisDataStreamProperty kinesisDataStreamProperty = KinesisDataStreamProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-kinesisdatastream.html)
     */
    public inline fun cfnStreamProcessorKinesisDataStreamProperty(
        block: CfnStreamProcessorKinesisDataStreamPropertyDsl.() -> Unit = {}
    ): CfnStreamProcessor.KinesisDataStreamProperty {
        val builder = CfnStreamProcessorKinesisDataStreamPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Kinesis video stream that provides the source of the streaming video for an Amazon
     * Rekognition Video stream processor.
     *
     * For more information, see
     * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * KinesisVideoStreamProperty kinesisVideoStreamProperty = KinesisVideoStreamProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-kinesisvideostream.html)
     */
    public inline fun cfnStreamProcessorKinesisVideoStreamProperty(
        block: CfnStreamProcessorKinesisVideoStreamPropertyDsl.() -> Unit = {}
    ): CfnStreamProcessor.KinesisVideoStreamProperty {
        val builder = CfnStreamProcessorKinesisVideoStreamPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the object
     * detection results and completion status of a video analysis operation.
     *
     * Amazon Rekognition publishes a notification the first time an object of interest or a person
     * is detected in the video stream. Amazon Rekognition also publishes an an end-of-session
     * notification with a summary when the stream processing session is complete. For more
     * information, see
     * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * NotificationChannelProperty notificationChannelProperty = NotificationChannelProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-notificationchannel.html)
     */
    public inline fun cfnStreamProcessorNotificationChannelProperty(
        block: CfnStreamProcessorNotificationChannelPropertyDsl.() -> Unit = {}
    ): CfnStreamProcessor.NotificationChannelProperty {
        val builder = CfnStreamProcessorNotificationChannelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An (X, Y) cartesian coordinate denoting a point on the frame.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * PointProperty pointProperty = PointProperty.builder()
     * .x(123)
     * .y(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-point.html)
     */
    public inline fun cfnStreamProcessorPointProperty(
        block: CfnStreamProcessorPointPropertyDsl.() -> Unit = {}
    ): CfnStreamProcessor.PointProperty {
        val builder = CfnStreamProcessorPointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnStreamProcessorProps(
        block: CfnStreamProcessorPropsDsl.() -> Unit = {}
    ): CfnStreamProcessorProps {
        val builder = CfnStreamProcessorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference
     * results of a video analysis operation.
     *
     * These results include the name of the stream processor resource, the session ID of the stream
     * processing session, and labeled timestamps and bounding boxes for detected labels. For more
     * information, see
     * [S3Destination](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_S3Destination)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rekognition.*;
     * S3DestinationProperty s3DestinationProperty = S3DestinationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .objectKeyPrefix("objectKeyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-s3destination.html)
     */
    public inline fun cfnStreamProcessorS3DestinationProperty(
        block: CfnStreamProcessorS3DestinationPropertyDsl.() -> Unit = {}
    ): CfnStreamProcessor.S3DestinationProperty {
        val builder = CfnStreamProcessorS3DestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
