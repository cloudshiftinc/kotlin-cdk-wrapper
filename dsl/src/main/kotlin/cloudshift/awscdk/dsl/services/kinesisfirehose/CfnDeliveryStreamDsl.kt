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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.constructs.Construct

/**
 * The `AWS::KinesisFirehose::DeliveryStream` resource specifies an Amazon Kinesis Data Firehose
 * (Kinesis Data Firehose) delivery stream that delivers real-time streaming data to an Amazon
 * Simple Storage Service (Amazon S3), Amazon Redshift, or Amazon Elasticsearch Service (Amazon ES)
 * destination.
 *
 * For more information, see
 * [Creating an Amazon Kinesis Data Firehose Delivery Stream](https://docs.aws.amazon.com/firehose/latest/dev/basic-create.html)
 * in the *Amazon Kinesis Data Firehose Developer Guide* .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeliveryStream.Builder = CfnDeliveryStream.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration)
     *
     * @param amazonOpenSearchServerlessDestinationConfiguration
     */
    public fun amazonOpenSearchServerlessDestinationConfiguration(
        amazonOpenSearchServerlessDestinationConfiguration: IResolvable
    ) {
        cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(
            amazonOpenSearchServerlessDestinationConfiguration
        )
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration)
     *
     * @param amazonOpenSearchServerlessDestinationConfiguration
     */
    public fun amazonOpenSearchServerlessDestinationConfiguration(
        amazonOpenSearchServerlessDestinationConfiguration:
            CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty
    ) {
        cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(
            amazonOpenSearchServerlessDestinationConfiguration
        )
    }

    /**
     * The destination in Amazon OpenSearch Service.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration)
     *
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     *   Service.
     */
    public fun amazonopensearchserviceDestinationConfiguration(
        amazonopensearchserviceDestinationConfiguration: IResolvable
    ) {
        cdkBuilder.amazonopensearchserviceDestinationConfiguration(
            amazonopensearchserviceDestinationConfiguration
        )
    }

    /**
     * The destination in Amazon OpenSearch Service.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration)
     *
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     *   Service.
     */
    public fun amazonopensearchserviceDestinationConfiguration(
        amazonopensearchserviceDestinationConfiguration:
            CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty
    ) {
        cdkBuilder.amazonopensearchserviceDestinationConfiguration(
            amazonopensearchserviceDestinationConfiguration
        )
    }

    /**
     * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side
     * Encryption (SSE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput)
     *
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     *   (ARN) of the CMK to use for Server-Side Encryption (SSE).
     */
    public fun deliveryStreamEncryptionConfigurationInput(
        deliveryStreamEncryptionConfigurationInput: IResolvable
    ) {
        cdkBuilder.deliveryStreamEncryptionConfigurationInput(
            deliveryStreamEncryptionConfigurationInput
        )
    }

    /**
     * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side
     * Encryption (SSE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput)
     *
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     *   (ARN) of the CMK to use for Server-Side Encryption (SSE).
     */
    public fun deliveryStreamEncryptionConfigurationInput(
        deliveryStreamEncryptionConfigurationInput:
            CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty
    ) {
        cdkBuilder.deliveryStreamEncryptionConfigurationInput(
            deliveryStreamEncryptionConfigurationInput
        )
    }

    /**
     * The name of the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname)
     *
     * @param deliveryStreamName The name of the delivery stream.
     */
    public fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    /**
     * The delivery stream type. This can be one of the following values:.
     * * `DirectPut` : Provider applications access the delivery stream directly.
     * * `KinesisStreamAsSource` : The delivery stream uses a Kinesis data stream as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype)
     *
     * @param deliveryStreamType The delivery stream type. This can be one of the following values:.
     */
    public fun deliveryStreamType(deliveryStreamType: String) {
        cdkBuilder.deliveryStreamType(deliveryStreamType)
    }

    /**
     * An Amazon ES destination for the delivery stream.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration)
     *
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     *   stream.
     */
    public fun elasticsearchDestinationConfiguration(
        elasticsearchDestinationConfiguration: IResolvable
    ) {
        cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration)
    }

    /**
     * An Amazon ES destination for the delivery stream.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration)
     *
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     *   stream.
     */
    public fun elasticsearchDestinationConfiguration(
        elasticsearchDestinationConfiguration:
            CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty
    ) {
        cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration)
    }

    /**
     * An Amazon S3 destination for the delivery stream.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration)
     *
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream.
     */
    public fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable) {
        cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration)
    }

    /**
     * An Amazon S3 destination for the delivery stream.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration)
     *
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream.
     */
    public fun extendedS3DestinationConfiguration(
        extendedS3DestinationConfiguration:
            CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty
    ) {
        cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration)
    }

    /**
     * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration)
     *
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     *   data to any HTTP endpoint destination.
     */
    public fun httpEndpointDestinationConfiguration(
        httpEndpointDestinationConfiguration: IResolvable
    ) {
        cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration)
    }

    /**
     * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration)
     *
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     *   data to any HTTP endpoint destination.
     */
    public fun httpEndpointDestinationConfiguration(
        httpEndpointDestinationConfiguration:
            CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty
    ) {
        cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration)
    }

    /**
     * When a Kinesis stream is used as the source for the delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
     *
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     *   delivery stream, a
     *   [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     *   containing the Kinesis stream ARN and the role ARN for the source stream.
     */
    public fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable) {
        cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration)
    }

    /**
     * When a Kinesis stream is used as the source for the delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
     *
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     *   delivery stream, a
     *   [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     *   containing the Kinesis stream ARN and the role ARN for the source stream.
     */
    public fun kinesisStreamSourceConfiguration(
        kinesisStreamSourceConfiguration: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty
    ) {
        cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration)
    }

    /**
     * An Amazon Redshift destination for the delivery stream.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration)
     *
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     *   stream.
     */
    public fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable) {
        cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration)
    }

    /**
     * An Amazon Redshift destination for the delivery stream.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration)
     *
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     *   stream.
     */
    public fun redshiftDestinationConfiguration(
        redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty
    ) {
        cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration)
    }

    /**
     * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service
     * (Amazon S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose)
     * delivers data.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration)
     *
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     *   Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     *   (Kinesis Data Firehose) delivers data.
     */
    public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
        cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration)
    }

    /**
     * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service
     * (Amazon S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose)
     * delivers data.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration)
     *
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     *   Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     *   (Kinesis Data Firehose) delivers data.
     */
    public fun s3DestinationConfiguration(
        s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration)
    }

    /**
     * The configuration of a destination in Splunk for the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
     *
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     *   delivery stream.
     */
    public fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable) {
        cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration)
    }

    /**
     * The configuration of a destination in Splunk for the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
     *
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     *   delivery stream.
     */
    public fun splunkDestinationConfiguration(
        splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty
    ) {
        cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration)
    }

    /**
     * A set of tags to assign to the delivery stream.
     *
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that
     * can help you distinguish the delivery stream. For more information about tags, see
     * [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)
     * in the AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-tags)
     *
     * @param tags A set of tags to assign to the delivery stream.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A set of tags to assign to the delivery stream.
     *
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that
     * can help you distinguish the delivery stream. For more information about tags, see
     * [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)
     * in the AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-tags)
     *
     * @param tags A set of tags to assign to the delivery stream.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeliveryStream {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
