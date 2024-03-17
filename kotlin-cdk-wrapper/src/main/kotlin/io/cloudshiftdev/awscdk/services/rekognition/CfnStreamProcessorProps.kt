@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rekognition

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStreamProcessor`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rekognition.*;
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
public interface CfnStreamProcessorProps {
  /**
   * List of BoundingBox objects, each of which denotes a region of interest on screen.
   *
   * For more information, see the BoundingBox field of
   * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-boundingboxregionsofinterest)
   */
  public fun boundingBoxRegionsOfInterest(): Any? = unwrap(this).getBoundingBoxRegionsOfInterest()

  /**
   * Connected home settings to use on a streaming video.
   *
   * You can use a stream processor for connected home features and select what you want the stream
   * processor to detect, such as people or pets. When the stream processor has started, one
   * notification is sent for each object class specified. For more information, see the ConnectedHome
   * section of
   * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-connectedhomesettings)
   */
  public fun connectedHomeSettings(): Any? = unwrap(this).getConnectedHomeSettings()

  /**
   * Allows you to opt in or opt out to share data with Rekognition to improve model performance.
   *
   * You can choose this option at the account level or on a per-stream basis. Note that if you opt
   * out at the account level this setting is ignored on individual streams. For more information, see
   * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-datasharingpreference)
   */
  public fun dataSharingPreference(): Any? = unwrap(this).getDataSharingPreference()

  /**
   * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
   * Rekognition stream processor.
   *
   * For more information regarding the contents of the parameters, see
   * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-facesearchsettings)
   */
  public fun faceSearchSettings(): Any? = unwrap(this).getFaceSearchSettings()

  /**
   * Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input.
   *
   * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
   * processor streams the analysis results. This must be created within the constraints specified at
   * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisdatastream)
   */
  public fun kinesisDataStream(): Any? = unwrap(this).getKinesisDataStream()

  /**
   * The Kinesis video stream that provides the source of the streaming video for an Amazon
   * Rekognition Video stream processor.
   *
   * For more information, see
   * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisvideostream)
   */
  public fun kinesisVideoStream(): Any

  /**
   * The identifier for your Amazon Key Management Service key (Amazon KMS key).
   *
   * Optional parameter for connected home stream processors used to encrypt results and data
   * published to your Amazon S3 bucket. For more information, see the KMSKeyId section of
   * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The Name attribute specifies the name of the stream processor and it must be within the
   * constraints described in the Name section of
   * [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
   * . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses that ID for
   * the stream processor name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the object
   * detection results and completion status of a video analysis operation.
   *
   * Amazon Rekognition publishes a notification the first time an object of interest or a person is
   * detected in the video stream. Amazon Rekognition also publishes an end-of-session notification
   * with a summary when the stream processing session is complete. For more information, see
   * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-notificationchannel)
   */
  public fun notificationChannel(): Any? = unwrap(this).getNotificationChannel()

  /**
   * A set of ordered lists of
   * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. Each entry
   * of the set contains a polygon denoting a region of interest on the screen. Each polygon is an
   * ordered list of [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point)
   * objects. For more information, see the Polygon field of
   * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-polygonregionsofinterest)
   */
  public fun polygonRegionsOfInterest(): Any? = unwrap(this).getPolygonRegionsOfInterest()

  /**
   * The ARN of the IAM role that allows access to the stream processor.
   *
   * The IAM role provides Rekognition read permissions to the Kinesis stream. It also provides
   * write permissions to an Amazon S3 bucket and Amazon Simple Notification Service topic for a
   * connected home stream processor. This is required for both face search and connected home stream
   * processors. For information about constraints, see the RoleArn section of
   * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-rolearn)
   */
  public fun roleArn(): String

  /**
   * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference
   * results of a video analysis operation.
   *
   * For more information, see the S3Destination section of
   * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-s3destination)
   */
  public fun s3Destination(): Any? = unwrap(this).getS3Destination()

  /**
   * A set of tags (key-value pairs) that you want to attach to the stream processor.
   *
   * For more information, see the Tags section of
   * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStreamProcessorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
     * region of interest on screen.
     * For more information, see the BoundingBox field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     */
    public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: IResolvable)

    /**
     * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
     * region of interest on screen.
     * For more information, see the BoundingBox field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     */
    public fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: List<Any>)

    /**
     * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
     * region of interest on screen.
     * For more information, see the BoundingBox field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     */
    public fun boundingBoxRegionsOfInterest(vararg boundingBoxRegionsOfInterest: Any)

    /**
     * @param connectedHomeSettings Connected home settings to use on a streaming video.
     * You can use a stream processor for connected home features and select what you want the
     * stream processor to detect, such as people or pets. When the stream processor has started, one
     * notification is sent for each object class specified. For more information, see the
     * ConnectedHome section of
     * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
     * .
     */
    public fun connectedHomeSettings(connectedHomeSettings: IResolvable)

    /**
     * @param connectedHomeSettings Connected home settings to use on a streaming video.
     * You can use a stream processor for connected home features and select what you want the
     * stream processor to detect, such as people or pets. When the stream processor has started, one
     * notification is sent for each object class specified. For more information, see the
     * ConnectedHome section of
     * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
     * .
     */
    public
        fun connectedHomeSettings(connectedHomeSettings: CfnStreamProcessor.ConnectedHomeSettingsProperty)

    /**
     * @param connectedHomeSettings Connected home settings to use on a streaming video.
     * You can use a stream processor for connected home features and select what you want the
     * stream processor to detect, such as people or pets. When the stream processor has started, one
     * notification is sent for each object class specified. For more information, see the
     * ConnectedHome section of
     * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0df4936f52fcb42eec2f2c2eb60e9ff33d357a4962bdcdc3ea0f8c7a80a400c3")
    public
        fun connectedHomeSettings(connectedHomeSettings: CfnStreamProcessor.ConnectedHomeSettingsProperty.Builder.() -> Unit)

    /**
     * @param dataSharingPreference Allows you to opt in or opt out to share data with Rekognition
     * to improve model performance.
     * You can choose this option at the account level or on a per-stream basis. Note that if you
     * opt out at the account level this setting is ignored on individual streams. For more
     * information, see
     * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
     * .
     */
    public fun dataSharingPreference(dataSharingPreference: IResolvable)

    /**
     * @param dataSharingPreference Allows you to opt in or opt out to share data with Rekognition
     * to improve model performance.
     * You can choose this option at the account level or on a per-stream basis. Note that if you
     * opt out at the account level this setting is ignored on individual streams. For more
     * information, see
     * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
     * .
     */
    public
        fun dataSharingPreference(dataSharingPreference: CfnStreamProcessor.DataSharingPreferenceProperty)

    /**
     * @param dataSharingPreference Allows you to opt in or opt out to share data with Rekognition
     * to improve model performance.
     * You can choose this option at the account level or on a per-stream basis. Note that if you
     * opt out at the account level this setting is ignored on individual streams. For more
     * information, see
     * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25c193032b109d022f26136f97c4a6ae2700a51643a9a3176244fd0a93dccdcd")
    public
        fun dataSharingPreference(dataSharingPreference: CfnStreamProcessor.DataSharingPreferenceProperty.Builder.() -> Unit)

    /**
     * @param faceSearchSettings The input parameters used to recognize faces in a streaming video
     * analyzed by an Amazon Rekognition stream processor.
     * For more information regarding the contents of the parameters, see
     * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
     * .
     */
    public fun faceSearchSettings(faceSearchSettings: IResolvable)

    /**
     * @param faceSearchSettings The input parameters used to recognize faces in a streaming video
     * analyzed by an Amazon Rekognition stream processor.
     * For more information regarding the contents of the parameters, see
     * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
     * .
     */
    public fun faceSearchSettings(faceSearchSettings: CfnStreamProcessor.FaceSearchSettingsProperty)

    /**
     * @param faceSearchSettings The input parameters used to recognize faces in a streaming video
     * analyzed by an Amazon Rekognition stream processor.
     * For more information regarding the contents of the parameters, see
     * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00d798a714393351c5fa39ec579b00d666182c1e2e3bd85eab59a564e7d98385")
    public
        fun faceSearchSettings(faceSearchSettings: CfnStreamProcessor.FaceSearchSettingsProperty.Builder.() -> Unit)

    /**
     * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis video
     * stream as input.
     * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
     * processor streams the analysis results. This must be created within the constraints specified at
     * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
     * .
     */
    public fun kinesisDataStream(kinesisDataStream: IResolvable)

    /**
     * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis video
     * stream as input.
     * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
     * processor streams the analysis results. This must be created within the constraints specified at
     * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
     * .
     */
    public fun kinesisDataStream(kinesisDataStream: CfnStreamProcessor.KinesisDataStreamProperty)

    /**
     * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis video
     * stream as input.
     * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
     * processor streams the analysis results. This must be created within the constraints specified at
     * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0484b1ef33aab25e0e9f97239703054b7b0ceacf94dc9afe6053e4583759053b")
    public
        fun kinesisDataStream(kinesisDataStream: CfnStreamProcessor.KinesisDataStreamProperty.Builder.() -> Unit)

    /**
     * @param kinesisVideoStream The Kinesis video stream that provides the source of the streaming
     * video for an Amazon Rekognition Video stream processor. 
     * For more information, see
     * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
     * .
     */
    public fun kinesisVideoStream(kinesisVideoStream: IResolvable)

    /**
     * @param kinesisVideoStream The Kinesis video stream that provides the source of the streaming
     * video for an Amazon Rekognition Video stream processor. 
     * For more information, see
     * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
     * .
     */
    public fun kinesisVideoStream(kinesisVideoStream: CfnStreamProcessor.KinesisVideoStreamProperty)

    /**
     * @param kinesisVideoStream The Kinesis video stream that provides the source of the streaming
     * video for an Amazon Rekognition Video stream processor. 
     * For more information, see
     * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1078dd3e9ea542ce9d1e149c50ef6f9d60335815ba38f5baee0ed416e6eee731")
    public
        fun kinesisVideoStream(kinesisVideoStream: CfnStreamProcessor.KinesisVideoStreamProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyId The identifier for your Amazon Key Management Service key (Amazon KMS key).
     * Optional parameter for connected home stream processors used to encrypt results and data
     * published to your Amazon S3 bucket. For more information, see the KMSKeyId section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param name The Name attribute specifies the name of the stream processor and it must be
     * within the constraints described in the Name section of
     * [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
     * . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses that ID for
     * the stream processor name.
     */
    public fun name(name: String)

    /**
     * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
     * Rekognition publishes the object detection results and completion status of a video analysis
     * operation.
     * Amazon Rekognition publishes a notification the first time an object of interest or a person
     * is detected in the video stream. Amazon Rekognition also publishes an end-of-session
     * notification with a summary when the stream processing session is complete. For more
     * information, see
     * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
     * .
     */
    public fun notificationChannel(notificationChannel: IResolvable)

    /**
     * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
     * Rekognition publishes the object detection results and completion status of a video analysis
     * operation.
     * Amazon Rekognition publishes a notification the first time an object of interest or a person
     * is detected in the video stream. Amazon Rekognition also publishes an end-of-session
     * notification with a summary when the stream processing session is complete. For more
     * information, see
     * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
     * .
     */
    public
        fun notificationChannel(notificationChannel: CfnStreamProcessor.NotificationChannelProperty)

    /**
     * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
     * Rekognition publishes the object detection results and completion status of a video analysis
     * operation.
     * Amazon Rekognition publishes a notification the first time an object of interest or a person
     * is detected in the video stream. Amazon Rekognition also publishes an end-of-session
     * notification with a summary when the stream processing session is complete. For more
     * information, see
     * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a296e054d644ab836f0f591f503dd9384d5c11db407db459ad4005ddaf24fc95")
    public
        fun notificationChannel(notificationChannel: CfnStreamProcessor.NotificationChannelProperty.Builder.() -> Unit)

    /**
     * @param polygonRegionsOfInterest A set of ordered lists of
     * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. Each
     * entry of the set contains a polygon denoting a region of interest on the screen. Each polygon is
     * an ordered list of
     * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. For more
     * information, see the Polygon field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     */
    public fun polygonRegionsOfInterest(polygonRegionsOfInterest: Any)

    /**
     * @param roleArn The ARN of the IAM role that allows access to the stream processor. 
     * The IAM role provides Rekognition read permissions to the Kinesis stream. It also provides
     * write permissions to an Amazon S3 bucket and Amazon Simple Notification Service topic for a
     * connected home stream processor. This is required for both face search and connected home stream
     * processors. For information about constraints, see the RoleArn section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     */
    public fun roleArn(roleArn: String)

    /**
     * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes the
     * detailed inference results of a video analysis operation.
     * For more information, see the S3Destination section of
     * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
     * .
     */
    public fun s3Destination(s3Destination: IResolvable)

    /**
     * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes the
     * detailed inference results of a video analysis operation.
     * For more information, see the S3Destination section of
     * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
     * .
     */
    public fun s3Destination(s3Destination: CfnStreamProcessor.S3DestinationProperty)

    /**
     * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes the
     * detailed inference results of a video analysis operation.
     * For more information, see the S3Destination section of
     * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4079668d7a0d539a143987041052690a2e6aad835bc55e3f7d326d985ed5f5a8")
    public
        fun s3Destination(s3Destination: CfnStreamProcessor.S3DestinationProperty.Builder.() -> Unit)

    /**
     * @param tags A set of tags (key-value pairs) that you want to attach to the stream processor.
     * For more information, see the Tags section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A set of tags (key-value pairs) that you want to attach to the stream processor.
     * For more information, see the Tags section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps.Builder =
        software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps.builder()

    /**
     * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
     * region of interest on screen.
     * For more information, see the BoundingBox field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     */
    override fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: IResolvable) {
      cdkBuilder.boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest.let(IResolvable::unwrap))
    }

    /**
     * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
     * region of interest on screen.
     * For more information, see the BoundingBox field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     */
    override fun boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest: List<Any>) {
      cdkBuilder.boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest)
    }

    /**
     * @param boundingBoxRegionsOfInterest List of BoundingBox objects, each of which denotes a
     * region of interest on screen.
     * For more information, see the BoundingBox field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     */
    override fun boundingBoxRegionsOfInterest(vararg boundingBoxRegionsOfInterest: Any): Unit =
        boundingBoxRegionsOfInterest(boundingBoxRegionsOfInterest.toList())

    /**
     * @param connectedHomeSettings Connected home settings to use on a streaming video.
     * You can use a stream processor for connected home features and select what you want the
     * stream processor to detect, such as people or pets. When the stream processor has started, one
     * notification is sent for each object class specified. For more information, see the
     * ConnectedHome section of
     * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
     * .
     */
    override fun connectedHomeSettings(connectedHomeSettings: IResolvable) {
      cdkBuilder.connectedHomeSettings(connectedHomeSettings.let(IResolvable::unwrap))
    }

    /**
     * @param connectedHomeSettings Connected home settings to use on a streaming video.
     * You can use a stream processor for connected home features and select what you want the
     * stream processor to detect, such as people or pets. When the stream processor has started, one
     * notification is sent for each object class specified. For more information, see the
     * ConnectedHome section of
     * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
     * .
     */
    override
        fun connectedHomeSettings(connectedHomeSettings: CfnStreamProcessor.ConnectedHomeSettingsProperty) {
      cdkBuilder.connectedHomeSettings(connectedHomeSettings.let(CfnStreamProcessor.ConnectedHomeSettingsProperty::unwrap))
    }

    /**
     * @param connectedHomeSettings Connected home settings to use on a streaming video.
     * You can use a stream processor for connected home features and select what you want the
     * stream processor to detect, such as people or pets. When the stream processor has started, one
     * notification is sent for each object class specified. For more information, see the
     * ConnectedHome section of
     * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0df4936f52fcb42eec2f2c2eb60e9ff33d357a4962bdcdc3ea0f8c7a80a400c3")
    override
        fun connectedHomeSettings(connectedHomeSettings: CfnStreamProcessor.ConnectedHomeSettingsProperty.Builder.() -> Unit):
        Unit =
        connectedHomeSettings(CfnStreamProcessor.ConnectedHomeSettingsProperty(connectedHomeSettings))

    /**
     * @param dataSharingPreference Allows you to opt in or opt out to share data with Rekognition
     * to improve model performance.
     * You can choose this option at the account level or on a per-stream basis. Note that if you
     * opt out at the account level this setting is ignored on individual streams. For more
     * information, see
     * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
     * .
     */
    override fun dataSharingPreference(dataSharingPreference: IResolvable) {
      cdkBuilder.dataSharingPreference(dataSharingPreference.let(IResolvable::unwrap))
    }

    /**
     * @param dataSharingPreference Allows you to opt in or opt out to share data with Rekognition
     * to improve model performance.
     * You can choose this option at the account level or on a per-stream basis. Note that if you
     * opt out at the account level this setting is ignored on individual streams. For more
     * information, see
     * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
     * .
     */
    override
        fun dataSharingPreference(dataSharingPreference: CfnStreamProcessor.DataSharingPreferenceProperty) {
      cdkBuilder.dataSharingPreference(dataSharingPreference.let(CfnStreamProcessor.DataSharingPreferenceProperty::unwrap))
    }

    /**
     * @param dataSharingPreference Allows you to opt in or opt out to share data with Rekognition
     * to improve model performance.
     * You can choose this option at the account level or on a per-stream basis. Note that if you
     * opt out at the account level this setting is ignored on individual streams. For more
     * information, see
     * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25c193032b109d022f26136f97c4a6ae2700a51643a9a3176244fd0a93dccdcd")
    override
        fun dataSharingPreference(dataSharingPreference: CfnStreamProcessor.DataSharingPreferenceProperty.Builder.() -> Unit):
        Unit =
        dataSharingPreference(CfnStreamProcessor.DataSharingPreferenceProperty(dataSharingPreference))

    /**
     * @param faceSearchSettings The input parameters used to recognize faces in a streaming video
     * analyzed by an Amazon Rekognition stream processor.
     * For more information regarding the contents of the parameters, see
     * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
     * .
     */
    override fun faceSearchSettings(faceSearchSettings: IResolvable) {
      cdkBuilder.faceSearchSettings(faceSearchSettings.let(IResolvable::unwrap))
    }

    /**
     * @param faceSearchSettings The input parameters used to recognize faces in a streaming video
     * analyzed by an Amazon Rekognition stream processor.
     * For more information regarding the contents of the parameters, see
     * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
     * .
     */
    override
        fun faceSearchSettings(faceSearchSettings: CfnStreamProcessor.FaceSearchSettingsProperty) {
      cdkBuilder.faceSearchSettings(faceSearchSettings.let(CfnStreamProcessor.FaceSearchSettingsProperty::unwrap))
    }

    /**
     * @param faceSearchSettings The input parameters used to recognize faces in a streaming video
     * analyzed by an Amazon Rekognition stream processor.
     * For more information regarding the contents of the parameters, see
     * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00d798a714393351c5fa39ec579b00d666182c1e2e3bd85eab59a564e7d98385")
    override
        fun faceSearchSettings(faceSearchSettings: CfnStreamProcessor.FaceSearchSettingsProperty.Builder.() -> Unit):
        Unit = faceSearchSettings(CfnStreamProcessor.FaceSearchSettingsProperty(faceSearchSettings))

    /**
     * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis video
     * stream as input.
     * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
     * processor streams the analysis results. This must be created within the constraints specified at
     * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
     * .
     */
    override fun kinesisDataStream(kinesisDataStream: IResolvable) {
      cdkBuilder.kinesisDataStream(kinesisDataStream.let(IResolvable::unwrap))
    }

    /**
     * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis video
     * stream as input.
     * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
     * processor streams the analysis results. This must be created within the constraints specified at
     * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
     * .
     */
    override
        fun kinesisDataStream(kinesisDataStream: CfnStreamProcessor.KinesisDataStreamProperty) {
      cdkBuilder.kinesisDataStream(kinesisDataStream.let(CfnStreamProcessor.KinesisDataStreamProperty::unwrap))
    }

    /**
     * @param kinesisDataStream Amazon Rekognition's Video Stream Processor takes a Kinesis video
     * stream as input.
     * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
     * processor streams the analysis results. This must be created within the constraints specified at
     * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0484b1ef33aab25e0e9f97239703054b7b0ceacf94dc9afe6053e4583759053b")
    override
        fun kinesisDataStream(kinesisDataStream: CfnStreamProcessor.KinesisDataStreamProperty.Builder.() -> Unit):
        Unit = kinesisDataStream(CfnStreamProcessor.KinesisDataStreamProperty(kinesisDataStream))

    /**
     * @param kinesisVideoStream The Kinesis video stream that provides the source of the streaming
     * video for an Amazon Rekognition Video stream processor. 
     * For more information, see
     * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
     * .
     */
    override fun kinesisVideoStream(kinesisVideoStream: IResolvable) {
      cdkBuilder.kinesisVideoStream(kinesisVideoStream.let(IResolvable::unwrap))
    }

    /**
     * @param kinesisVideoStream The Kinesis video stream that provides the source of the streaming
     * video for an Amazon Rekognition Video stream processor. 
     * For more information, see
     * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
     * .
     */
    override
        fun kinesisVideoStream(kinesisVideoStream: CfnStreamProcessor.KinesisVideoStreamProperty) {
      cdkBuilder.kinesisVideoStream(kinesisVideoStream.let(CfnStreamProcessor.KinesisVideoStreamProperty::unwrap))
    }

    /**
     * @param kinesisVideoStream The Kinesis video stream that provides the source of the streaming
     * video for an Amazon Rekognition Video stream processor. 
     * For more information, see
     * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1078dd3e9ea542ce9d1e149c50ef6f9d60335815ba38f5baee0ed416e6eee731")
    override
        fun kinesisVideoStream(kinesisVideoStream: CfnStreamProcessor.KinesisVideoStreamProperty.Builder.() -> Unit):
        Unit = kinesisVideoStream(CfnStreamProcessor.KinesisVideoStreamProperty(kinesisVideoStream))

    /**
     * @param kmsKeyId The identifier for your Amazon Key Management Service key (Amazon KMS key).
     * Optional parameter for connected home stream processors used to encrypt results and data
     * published to your Amazon S3 bucket. For more information, see the KMSKeyId section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param name The Name attribute specifies the name of the stream processor and it must be
     * within the constraints described in the Name section of
     * [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
     * . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses that ID for
     * the stream processor name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
     * Rekognition publishes the object detection results and completion status of a video analysis
     * operation.
     * Amazon Rekognition publishes a notification the first time an object of interest or a person
     * is detected in the video stream. Amazon Rekognition also publishes an end-of-session
     * notification with a summary when the stream processing session is complete. For more
     * information, see
     * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
     * .
     */
    override fun notificationChannel(notificationChannel: IResolvable) {
      cdkBuilder.notificationChannel(notificationChannel.let(IResolvable::unwrap))
    }

    /**
     * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
     * Rekognition publishes the object detection results and completion status of a video analysis
     * operation.
     * Amazon Rekognition publishes a notification the first time an object of interest or a person
     * is detected in the video stream. Amazon Rekognition also publishes an end-of-session
     * notification with a summary when the stream processing session is complete. For more
     * information, see
     * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
     * .
     */
    override
        fun notificationChannel(notificationChannel: CfnStreamProcessor.NotificationChannelProperty) {
      cdkBuilder.notificationChannel(notificationChannel.let(CfnStreamProcessor.NotificationChannelProperty::unwrap))
    }

    /**
     * @param notificationChannel The Amazon Simple Notification Service topic to which Amazon
     * Rekognition publishes the object detection results and completion status of a video analysis
     * operation.
     * Amazon Rekognition publishes a notification the first time an object of interest or a person
     * is detected in the video stream. Amazon Rekognition also publishes an end-of-session
     * notification with a summary when the stream processing session is complete. For more
     * information, see
     * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a296e054d644ab836f0f591f503dd9384d5c11db407db459ad4005ddaf24fc95")
    override
        fun notificationChannel(notificationChannel: CfnStreamProcessor.NotificationChannelProperty.Builder.() -> Unit):
        Unit =
        notificationChannel(CfnStreamProcessor.NotificationChannelProperty(notificationChannel))

    /**
     * @param polygonRegionsOfInterest A set of ordered lists of
     * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. Each
     * entry of the set contains a polygon denoting a region of interest on the screen. Each polygon is
     * an ordered list of
     * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. For more
     * information, see the Polygon field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     */
    override fun polygonRegionsOfInterest(polygonRegionsOfInterest: Any) {
      cdkBuilder.polygonRegionsOfInterest(polygonRegionsOfInterest)
    }

    /**
     * @param roleArn The ARN of the IAM role that allows access to the stream processor. 
     * The IAM role provides Rekognition read permissions to the Kinesis stream. It also provides
     * write permissions to an Amazon S3 bucket and Amazon Simple Notification Service topic for a
     * connected home stream processor. This is required for both face search and connected home stream
     * processors. For information about constraints, see the RoleArn section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes the
     * detailed inference results of a video analysis operation.
     * For more information, see the S3Destination section of
     * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
     * .
     */
    override fun s3Destination(s3Destination: IResolvable) {
      cdkBuilder.s3Destination(s3Destination.let(IResolvable::unwrap))
    }

    /**
     * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes the
     * detailed inference results of a video analysis operation.
     * For more information, see the S3Destination section of
     * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
     * .
     */
    override fun s3Destination(s3Destination: CfnStreamProcessor.S3DestinationProperty) {
      cdkBuilder.s3Destination(s3Destination.let(CfnStreamProcessor.S3DestinationProperty::unwrap))
    }

    /**
     * @param s3Destination The Amazon S3 bucket location to which Amazon Rekognition publishes the
     * detailed inference results of a video analysis operation.
     * For more information, see the S3Destination section of
     * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4079668d7a0d539a143987041052690a2e6aad835bc55e3f7d326d985ed5f5a8")
    override
        fun s3Destination(s3Destination: CfnStreamProcessor.S3DestinationProperty.Builder.() -> Unit):
        Unit = s3Destination(CfnStreamProcessor.S3DestinationProperty(s3Destination))

    /**
     * @param tags A set of tags (key-value pairs) that you want to attach to the stream processor.
     * For more information, see the Tags section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A set of tags (key-value pairs) that you want to attach to the stream processor.
     * For more information, see the Tags section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps,
  ) : CdkObject(cdkObject), CfnStreamProcessorProps {
    /**
     * List of BoundingBox objects, each of which denotes a region of interest on screen.
     *
     * For more information, see the BoundingBox field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-boundingboxregionsofinterest)
     */
    override fun boundingBoxRegionsOfInterest(): Any? =
        unwrap(this).getBoundingBoxRegionsOfInterest()

    /**
     * Connected home settings to use on a streaming video.
     *
     * You can use a stream processor for connected home features and select what you want the
     * stream processor to detect, such as people or pets. When the stream processor has started, one
     * notification is sent for each object class specified. For more information, see the
     * ConnectedHome section of
     * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-connectedhomesettings)
     */
    override fun connectedHomeSettings(): Any? = unwrap(this).getConnectedHomeSettings()

    /**
     * Allows you to opt in or opt out to share data with Rekognition to improve model performance.
     *
     * You can choose this option at the account level or on a per-stream basis. Note that if you
     * opt out at the account level this setting is ignored on individual streams. For more
     * information, see
     * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-datasharingpreference)
     */
    override fun dataSharingPreference(): Any? = unwrap(this).getDataSharingPreference()

    /**
     * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
     * Rekognition stream processor.
     *
     * For more information regarding the contents of the parameters, see
     * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-facesearchsettings)
     */
    override fun faceSearchSettings(): Any? = unwrap(this).getFaceSearchSettings()

    /**
     * Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input.
     *
     * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream
     * processor streams the analysis results. This must be created within the constraints specified at
     * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisdatastream)
     */
    override fun kinesisDataStream(): Any? = unwrap(this).getKinesisDataStream()

    /**
     * The Kinesis video stream that provides the source of the streaming video for an Amazon
     * Rekognition Video stream processor.
     *
     * For more information, see
     * [KinesisVideoStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisVideoStream)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kinesisvideostream)
     */
    override fun kinesisVideoStream(): Any = unwrap(this).getKinesisVideoStream()

    /**
     * The identifier for your Amazon Key Management Service key (Amazon KMS key).
     *
     * Optional parameter for connected home stream processors used to encrypt results and data
     * published to your Amazon S3 bucket. For more information, see the KMSKeyId section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The Name attribute specifies the name of the stream processor and it must be within the
     * constraints described in the Name section of
     * [StreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessor)
     * . If you don't specify a name, Amazon CloudFormation generates a unique ID and uses that ID for
     * the stream processor name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the object
     * detection results and completion status of a video analysis operation.
     *
     * Amazon Rekognition publishes a notification the first time an object of interest or a person
     * is detected in the video stream. Amazon Rekognition also publishes an end-of-session
     * notification with a summary when the stream processing session is complete. For more
     * information, see
     * [StreamProcessorNotificationChannel](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorNotificationChannel)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-notificationchannel)
     */
    override fun notificationChannel(): Any? = unwrap(this).getNotificationChannel()

    /**
     * A set of ordered lists of
     * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. Each
     * entry of the set contains a polygon denoting a region of interest on the screen. Each polygon is
     * an ordered list of
     * [Point](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Point) objects. For more
     * information, see the Polygon field of
     * [RegionOfInterest](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RegionOfInterest)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-polygonregionsofinterest)
     */
    override fun polygonRegionsOfInterest(): Any? = unwrap(this).getPolygonRegionsOfInterest()

    /**
     * The ARN of the IAM role that allows access to the stream processor.
     *
     * The IAM role provides Rekognition read permissions to the Kinesis stream. It also provides
     * write permissions to an Amazon S3 bucket and Amazon Simple Notification Service topic for a
     * connected home stream processor. This is required for both face search and connected home stream
     * processors. For information about constraints, see the RoleArn section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference
     * results of a video analysis operation.
     *
     * For more information, see the S3Destination section of
     * [StreamProcessorOutput](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorOutput)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-s3destination)
     */
    override fun s3Destination(): Any? = unwrap(this).getS3Destination()

    /**
     * A set of tags (key-value pairs) that you want to attach to the stream processor.
     *
     * For more information, see the Tags section of
     * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-streamprocessor.html#cfn-rekognition-streamprocessor-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamProcessorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps):
        CfnStreamProcessorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStreamProcessorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamProcessorProps):
        software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps
  }
}
