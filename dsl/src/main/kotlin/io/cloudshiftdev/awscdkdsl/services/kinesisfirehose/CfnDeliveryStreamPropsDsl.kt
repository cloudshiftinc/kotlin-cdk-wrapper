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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps

/**
 * Properties for defining a `CfnDeliveryStream`.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamPropsDsl {
    private val cdkBuilder: CfnDeliveryStreamProps.Builder = CfnDeliveryStreamProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param amazonOpenSearchServerlessDestinationConfiguration the value to be set. */
    public fun amazonOpenSearchServerlessDestinationConfiguration(
        amazonOpenSearchServerlessDestinationConfiguration: IResolvable
    ) {
        cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(
            amazonOpenSearchServerlessDestinationConfiguration
        )
    }

    /** @param amazonOpenSearchServerlessDestinationConfiguration the value to be set. */
    public fun amazonOpenSearchServerlessDestinationConfiguration(
        amazonOpenSearchServerlessDestinationConfiguration:
            CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty
    ) {
        cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(
            amazonOpenSearchServerlessDestinationConfiguration
        )
    }

    /**
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     *   Service. You can specify only one destination.
     */
    public fun amazonopensearchserviceDestinationConfiguration(
        amazonopensearchserviceDestinationConfiguration: IResolvable
    ) {
        cdkBuilder.amazonopensearchserviceDestinationConfiguration(
            amazonopensearchserviceDestinationConfiguration
        )
    }

    /**
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     *   Service. You can specify only one destination.
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

    /** @param deliveryStreamName The name of the delivery stream. */
    public fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    /**
     * @param deliveryStreamType The delivery stream type. This can be one of the following values:.
     * * `DirectPut` : Provider applications access the delivery stream directly.
     * * `KinesisStreamAsSource` : The delivery stream uses a Kinesis data stream as a source.
     */
    public fun deliveryStreamType(deliveryStreamType: String) {
        cdkBuilder.deliveryStreamType(deliveryStreamType)
    }

    /**
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     *   stream. Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun elasticsearchDestinationConfiguration(
        elasticsearchDestinationConfiguration: IResolvable
    ) {
        cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration)
    }

    /**
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     *   stream. Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun elasticsearchDestinationConfiguration(
        elasticsearchDestinationConfiguration:
            CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty
    ) {
        cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration)
    }

    /**
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream.
     *   Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable) {
        cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration)
    }

    /**
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream.
     *   Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun extendedS3DestinationConfiguration(
        extendedS3DestinationConfiguration:
            CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty
    ) {
        cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration)
    }

    /**
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     *   data to any HTTP endpoint destination. You can specify only one destination.
     */
    public fun httpEndpointDestinationConfiguration(
        httpEndpointDestinationConfiguration: IResolvable
    ) {
        cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration)
    }

    /**
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     *   data to any HTTP endpoint destination. You can specify only one destination.
     */
    public fun httpEndpointDestinationConfiguration(
        httpEndpointDestinationConfiguration:
            CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty
    ) {
        cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration)
    }

    /**
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     *   delivery stream, a
     *   [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     *   containing the Kinesis stream ARN and the role ARN for the source stream.
     */
    public fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable) {
        cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration)
    }

    /**
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
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     *   stream. Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable) {
        cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration)
    }

    /**
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     *   stream. Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun redshiftDestinationConfiguration(
        redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty
    ) {
        cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration)
    }

    /**
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     *   Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     *   (Kinesis Data Firehose) delivers data. Conditional. You must specify only one destination
     *   configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
        cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration)
    }

    /**
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     *   Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     *   (Kinesis Data Firehose) delivers data. Conditional. You must specify only one destination
     *   configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires
     * [some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun s3DestinationConfiguration(
        s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration)
    }

    /**
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     *   delivery stream.
     */
    public fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable) {
        cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration)
    }

    /**
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     *   delivery stream.
     */
    public fun splunkDestinationConfiguration(
        splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty
    ) {
        cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration)
    }

    /**
     * @param tags A set of tags to assign to the delivery stream. A tag is a key-value pair that
     *   you can define and assign to AWS resources. Tags are metadata. For example, you can add
     *   friendly names and descriptions or other types of information that can help you distinguish
     *   the delivery stream. For more information about tags, see
     *   [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)
     *   in the AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a delivery stream.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A set of tags to assign to the delivery stream. A tag is a key-value pair that
     *   you can define and assign to AWS resources. Tags are metadata. For example, you can add
     *   friendly names and descriptions or other types of information that can help you distinguish
     *   the delivery stream. For more information about tags, see
     *   [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)
     *   in the AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a delivery stream.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeliveryStreamProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
