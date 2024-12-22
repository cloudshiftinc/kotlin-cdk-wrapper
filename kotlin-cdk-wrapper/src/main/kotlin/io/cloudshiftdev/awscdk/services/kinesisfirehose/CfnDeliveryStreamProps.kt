@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

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
 * Properties for defining a `CfnDeliveryStream`.
 *
 * Example:
 *
 * ```
 * Bucket destinationBucket = new Bucket(this, "Bucket");
 * Role deliveryStreamRole = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("firehose.amazonaws.com"))
 * .build();
 * CfnDeliveryStream stream = CfnDeliveryStream.Builder.create(this, "MyStream")
 * .deliveryStreamName("amazon-apigateway-delivery-stream")
 * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
 * .bucketArn(destinationBucket.getBucketArn())
 * .roleArn(deliveryStreamRole.getRoleArn())
 * .build())
 * .build();
 * RestApi api = RestApi.Builder.create(this, "books")
 * .deployOptions(StageOptions.builder()
 * .accessLogDestination(new FirehoseLogDestination(stream))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html)
 */
public interface CfnDeliveryStreamProps {
  /**
   * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
   * Service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration)
   */
  public fun amazonOpenSearchServerlessDestinationConfiguration(): Any? =
      unwrap(this).getAmazonOpenSearchServerlessDestinationConfiguration()

  /**
   * The destination in Amazon OpenSearch Service.
   *
   * You can specify only one destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration)
   */
  public fun amazonopensearchserviceDestinationConfiguration(): Any? =
      unwrap(this).getAmazonopensearchserviceDestinationConfiguration()

  /**
   * The top level object for configuring streams with database as a source.
   *
   * Amazon Data Firehose is in preview release and is subject to change.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-databasesourceconfiguration)
   */
  public fun databaseSourceConfiguration(): Any? = unwrap(this).getDatabaseSourceConfiguration()

  /**
   * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side Encryption
   * (SSE).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput)
   */
  public fun deliveryStreamEncryptionConfigurationInput(): Any? =
      unwrap(this).getDeliveryStreamEncryptionConfigurationInput()

  /**
   * The name of the Firehose stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname)
   */
  public fun deliveryStreamName(): String? = unwrap(this).getDeliveryStreamName()

  /**
   * The Firehose stream type. This can be one of the following values:.
   *
   * * `DirectPut` : Provider applications access the Firehose stream directly.
   * * `KinesisStreamAsSource` : The Firehose stream uses a Kinesis data stream as a source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype)
   */
  public fun deliveryStreamType(): String? = unwrap(this).getDeliveryStreamType()

  /**
   * An Amazon ES destination for the delivery stream.
   *
   * Conditional. You must specify only one destination configuration.
   *
   * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3 or
   * Amazon Redshift destination, update requires [some
   * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration)
   */
  public fun elasticsearchDestinationConfiguration(): Any? =
      unwrap(this).getElasticsearchDestinationConfiguration()

  /**
   * An Amazon S3 destination for the delivery stream.
   *
   * Conditional. You must specify only one destination configuration.
   *
   * If you change the delivery stream destination from an Amazon Extended S3 destination to an
   * Amazon ES destination, update requires [some
   * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration)
   */
  public fun extendedS3DestinationConfiguration(): Any? =
      unwrap(this).getExtendedS3DestinationConfiguration()

  /**
   * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
   *
   * You can specify only one destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration)
   */
  public fun httpEndpointDestinationConfiguration(): Any? =
      unwrap(this).getHttpEndpointDestinationConfiguration()

  /**
   * Specifies the destination configure settings for Apache Iceberg Table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-icebergdestinationconfiguration)
   */
  public fun icebergDestinationConfiguration(): Any? =
      unwrap(this).getIcebergDestinationConfiguration()

  /**
   * When a Kinesis stream is used as the source for the delivery stream, a
   * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
   * containing the Kinesis stream ARN and the role ARN for the source stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
   */
  public fun kinesisStreamSourceConfiguration(): Any? =
      unwrap(this).getKinesisStreamSourceConfiguration()

  /**
   * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration)
   */
  public fun mskSourceConfiguration(): Any? = unwrap(this).getMskSourceConfiguration()

  /**
   * An Amazon Redshift destination for the delivery stream.
   *
   * Conditional. You must specify only one destination configuration.
   *
   * If you change the delivery stream destination from an Amazon Redshift destination to an Amazon
   * ES destination, update requires [some
   * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration)
   */
  public fun redshiftDestinationConfiguration(): Any? =
      unwrap(this).getRedshiftDestinationConfiguration()

  /**
   * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service
   * (Amazon S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers
   * data.
   *
   * Conditional. You must specify only one destination configuration.
   *
   * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
   * destination, update requires [some
   * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration)
   */
  public fun s3DestinationConfiguration(): Any? = unwrap(this).getS3DestinationConfiguration()

  /**
   * Configure Snowflake destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration)
   */
  public fun snowflakeDestinationConfiguration(): Any? =
      unwrap(this).getSnowflakeDestinationConfiguration()

  /**
   * The configuration of a destination in Splunk for the delivery stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
   */
  public fun splunkDestinationConfiguration(): Any? =
      unwrap(this).getSplunkDestinationConfiguration()

  /**
   * A set of tags to assign to the Firehose stream.
   *
   * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
   * For example, you can add friendly names and descriptions or other types of information that can
   * help you distinguish the Firehose stream. For more information about tags, see [Using Cost
   * Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
   * AWS Billing and Cost Management User Guide.
   *
   * You can specify up to 50 tags when creating a Firehose stream.
   *
   * If you specify tags in the `CreateDeliveryStream` action, Amazon Data Firehose performs an
   * additional authorization on the `firehose:TagDeliveryStream` action to verify if users have
   * permissions to create tags. If you do not provide this permission, requests to create new Firehose
   * streams with IAM resource tags will fail with an `AccessDeniedException` such as following.
   *
   * *AccessDeniedException*
   *
   * User: arn:aws:sts::x:assumed-role/x/x is not authorized to perform: firehose:TagDeliveryStream
   * on resource: arn:aws:firehose:us-east-1:x:deliverystream/x with an explicit deny in an
   * identity-based policy.
   *
   * For an example IAM policy, see [Tag
   * example.](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CreateDeliveryStream.html#API_CreateDeliveryStream_Examples)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDeliveryStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service.
     */
    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: IResolvable)

    /**
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service.
     */
    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty)

    /**
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e234fa2403c410069e0f2074ad86e674a7b65068ee40b9fee6491065eb244b61")
    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service.
     * You can specify only one destination.
     */
    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: IResolvable)

    /**
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service.
     * You can specify only one destination.
     */
    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty)

    /**
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service.
     * You can specify only one destination.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("123cb966bb02cc9fb476d2e8afc8af1e8160aaab69c6f55d41d5149c4c2afb3a")
    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param databaseSourceConfiguration The top level object for configuring streams with database
     * as a source.
     * Amazon Data Firehose is in preview release and is subject to change.
     */
    public fun databaseSourceConfiguration(databaseSourceConfiguration: IResolvable)

    /**
     * @param databaseSourceConfiguration The top level object for configuring streams with database
     * as a source.
     * Amazon Data Firehose is in preview release and is subject to change.
     */
    public
        fun databaseSourceConfiguration(databaseSourceConfiguration: CfnDeliveryStream.DatabaseSourceConfigurationProperty)

    /**
     * @param databaseSourceConfiguration The top level object for configuring streams with database
     * as a source.
     * Amazon Data Firehose is in preview release and is subject to change.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44d69ff3bb748e4f473c981f57c0a4b9e9cf70dc73838c14f951c2112d90b025")
    public
        fun databaseSourceConfiguration(databaseSourceConfiguration: CfnDeliveryStream.DatabaseSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE).
     */
    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: IResolvable)

    /**
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE).
     */
    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty)

    /**
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35122e6d3a8e6e2269456f74306f7a9726331c03ad3872a42f3a2465838050e3")
    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit)

    /**
     * @param deliveryStreamName The name of the Firehose stream.
     */
    public fun deliveryStreamName(deliveryStreamName: String)

    /**
     * @param deliveryStreamType The Firehose stream type. This can be one of the following values:.
     * * `DirectPut` : Provider applications access the Firehose stream directly.
     * * `KinesisStreamAsSource` : The Firehose stream uses a Kinesis data stream as a source.
     */
    public fun deliveryStreamType(deliveryStreamType: String)

    /**
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: IResolvable)

    /**
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty)

    /**
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60560e5e3128bcfde20dd9cd2817dac6f992ab226a6cd5f971f22ddf132711ec")
    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable)

    /**
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty)

    /**
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f27ddfc549e6ae6a9ef238f24475274f447828b1e726bde5806c7e631496c7d5")
    public
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination.
     * You can specify only one destination.
     */
    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: IResolvable)

    /**
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination.
     * You can specify only one destination.
     */
    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty)

    /**
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination.
     * You can specify only one destination.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a5c22a455fb650d9f0de8899a1fc1e3714d9e35a5d04431c07358704b22c2fe")
    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param icebergDestinationConfiguration Specifies the destination configure settings for
     * Apache Iceberg Table.
     */
    public fun icebergDestinationConfiguration(icebergDestinationConfiguration: IResolvable)

    /**
     * @param icebergDestinationConfiguration Specifies the destination configure settings for
     * Apache Iceberg Table.
     */
    public
        fun icebergDestinationConfiguration(icebergDestinationConfiguration: CfnDeliveryStream.IcebergDestinationConfigurationProperty)

    /**
     * @param icebergDestinationConfiguration Specifies the destination configure settings for
     * Apache Iceberg Table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("484f7d6c612844105ad2074cd8d8320f4f5b531fd1100f259474d8b5f7d008a0")
    public
        fun icebergDestinationConfiguration(icebergDestinationConfiguration: CfnDeliveryStream.IcebergDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     */
    public fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable)

    /**
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     */
    public
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty)

    /**
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eec2b97969432ab2ff37cc3c88a835d4ae5731086ab8cffc00d37cf8579670c9")
    public
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream.
     */
    public fun mskSourceConfiguration(mskSourceConfiguration: IResolvable)

    /**
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream.
     */
    public
        fun mskSourceConfiguration(mskSourceConfiguration: CfnDeliveryStream.MSKSourceConfigurationProperty)

    /**
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9603bd47fbec070706a21200de103b0c80313548891c954ca59012452fc8cb2b")
    public
        fun mskSourceConfiguration(mskSourceConfiguration: CfnDeliveryStream.MSKSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable)

    /**
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty)

    /**
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("336a848ce3c95bb0e559116bd71dede6c3711c815150a1ca9018e53ed90a1e61")
    public
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable)

    /**
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    public
        fun s3DestinationConfiguration(s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty)

    /**
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22702d3f83ce6b4146cd848f3ba66c44b8f56f73bb0016651836971ba3605409")
    public
        fun s3DestinationConfiguration(s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param snowflakeDestinationConfiguration Configure Snowflake destination.
     */
    public fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: IResolvable)

    /**
     * @param snowflakeDestinationConfiguration Configure Snowflake destination.
     */
    public
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: CfnDeliveryStream.SnowflakeDestinationConfigurationProperty)

    /**
     * @param snowflakeDestinationConfiguration Configure Snowflake destination.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d5078c1c1701955e6a654341428466c9795c0b2eff2eda19daa8768873878f5")
    public
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream.
     */
    public fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable)

    /**
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream.
     */
    public
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty)

    /**
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe1f5c9a1768a811facb2824eb3c1780f5938c79f8a7d0489a9513a7da1103b")
    public
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags A set of tags to assign to the Firehose stream.
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that can
     * help you distinguish the Firehose stream. For more information about tags, see [Using Cost
     * Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a Firehose stream.
     *
     * If you specify tags in the `CreateDeliveryStream` action, Amazon Data Firehose performs an
     * additional authorization on the `firehose:TagDeliveryStream` action to verify if users have
     * permissions to create tags. If you do not provide this permission, requests to create new
     * Firehose streams with IAM resource tags will fail with an `AccessDeniedException` such as
     * following.
     *
     * *AccessDeniedException*
     *
     * User: arn:aws:sts::x:assumed-role/x/x is not authorized to perform:
     * firehose:TagDeliveryStream on resource: arn:aws:firehose:us-east-1:x:deliverystream/x with an
     * explicit deny in an identity-based policy.
     *
     * For an example IAM policy, see [Tag
     * example.](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CreateDeliveryStream.html#API_CreateDeliveryStream_Examples)
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A set of tags to assign to the Firehose stream.
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that can
     * help you distinguish the Firehose stream. For more information about tags, see [Using Cost
     * Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a Firehose stream.
     *
     * If you specify tags in the `CreateDeliveryStream` action, Amazon Data Firehose performs an
     * additional authorization on the `firehose:TagDeliveryStream` action to verify if users have
     * permissions to create tags. If you do not provide this permission, requests to create new
     * Firehose streams with IAM resource tags will fail with an `AccessDeniedException` such as
     * following.
     *
     * *AccessDeniedException*
     *
     * User: arn:aws:sts::x:assumed-role/x/x is not authorized to perform:
     * firehose:TagDeliveryStream on resource: arn:aws:firehose:us-east-1:x:deliverystream/x with an
     * explicit deny in an identity-based policy.
     *
     * For an example IAM policy, see [Tag
     * example.](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CreateDeliveryStream.html#API_CreateDeliveryStream_Examples)
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder =
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.builder()

    /**
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service.
     */
    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: IResolvable) {
      cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service.
     */
    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty) {
      cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration.let(CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param amazonOpenSearchServerlessDestinationConfiguration Describes the configuration of a
     * destination in the Serverless offering for Amazon OpenSearch Service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e234fa2403c410069e0f2074ad86e674a7b65068ee40b9fee6491065eb244b61")
    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        amazonOpenSearchServerlessDestinationConfiguration(CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty(amazonOpenSearchServerlessDestinationConfiguration))

    /**
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service.
     * You can specify only one destination.
     */
    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: IResolvable) {
      cdkBuilder.amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service.
     * You can specify only one destination.
     */
    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty) {
      cdkBuilder.amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration.let(CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param amazonopensearchserviceDestinationConfiguration The destination in Amazon OpenSearch
     * Service.
     * You can specify only one destination.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("123cb966bb02cc9fb476d2e8afc8af1e8160aaab69c6f55d41d5149c4c2afb3a")
    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        amazonopensearchserviceDestinationConfiguration(CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty(amazonopensearchserviceDestinationConfiguration))

    /**
     * @param databaseSourceConfiguration The top level object for configuring streams with database
     * as a source.
     * Amazon Data Firehose is in preview release and is subject to change.
     */
    override fun databaseSourceConfiguration(databaseSourceConfiguration: IResolvable) {
      cdkBuilder.databaseSourceConfiguration(databaseSourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param databaseSourceConfiguration The top level object for configuring streams with database
     * as a source.
     * Amazon Data Firehose is in preview release and is subject to change.
     */
    override
        fun databaseSourceConfiguration(databaseSourceConfiguration: CfnDeliveryStream.DatabaseSourceConfigurationProperty) {
      cdkBuilder.databaseSourceConfiguration(databaseSourceConfiguration.let(CfnDeliveryStream.DatabaseSourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param databaseSourceConfiguration The top level object for configuring streams with database
     * as a source.
     * Amazon Data Firehose is in preview release and is subject to change.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44d69ff3bb748e4f473c981f57c0a4b9e9cf70dc73838c14f951c2112d90b025")
    override
        fun databaseSourceConfiguration(databaseSourceConfiguration: CfnDeliveryStream.DatabaseSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        databaseSourceConfiguration(CfnDeliveryStream.DatabaseSourceConfigurationProperty(databaseSourceConfiguration))

    /**
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE).
     */
    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: IResolvable) {
      cdkBuilder.deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE).
     */
    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty) {
      cdkBuilder.deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput.let(CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Companion::unwrap))
    }

    /**
     * @param deliveryStreamEncryptionConfigurationInput Specifies the type and Amazon Resource Name
     * (ARN) of the CMK to use for Server-Side Encryption (SSE).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35122e6d3a8e6e2269456f74306f7a9726331c03ad3872a42f3a2465838050e3")
    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit):
        Unit =
        deliveryStreamEncryptionConfigurationInput(CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty(deliveryStreamEncryptionConfigurationInput))

    /**
     * @param deliveryStreamName The name of the Firehose stream.
     */
    override fun deliveryStreamName(deliveryStreamName: String) {
      cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    /**
     * @param deliveryStreamType The Firehose stream type. This can be one of the following values:.
     * * `DirectPut` : Provider applications access the Firehose stream directly.
     * * `KinesisStreamAsSource` : The Firehose stream uses a Kinesis data stream as a source.
     */
    override fun deliveryStreamType(deliveryStreamType: String) {
      cdkBuilder.deliveryStreamType(deliveryStreamType)
    }

    /**
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    override
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: IResolvable) {
      cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    override
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty) {
      cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration.let(CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param elasticsearchDestinationConfiguration An Amazon ES destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60560e5e3128bcfde20dd9cd2817dac6f992ab226a6cd5f971f22ddf132711ec")
    override
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        elasticsearchDestinationConfiguration(CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty(elasticsearchDestinationConfiguration))

    /**
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable) {
      cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty) {
      cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration.let(CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param extendedS3DestinationConfiguration An Amazon S3 destination for the delivery stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f27ddfc549e6ae6a9ef238f24475274f447828b1e726bde5806c7e631496c7d5")
    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        extendedS3DestinationConfiguration(CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty(extendedS3DestinationConfiguration))

    /**
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination.
     * You can specify only one destination.
     */
    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: IResolvable) {
      cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination.
     * You can specify only one destination.
     */
    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty) {
      cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration.let(CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param httpEndpointDestinationConfiguration Enables configuring Kinesis Firehose to deliver
     * data to any HTTP endpoint destination.
     * You can specify only one destination.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a5c22a455fb650d9f0de8899a1fc1e3714d9e35a5d04431c07358704b22c2fe")
    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        httpEndpointDestinationConfiguration(CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty(httpEndpointDestinationConfiguration))

    /**
     * @param icebergDestinationConfiguration Specifies the destination configure settings for
     * Apache Iceberg Table.
     */
    override fun icebergDestinationConfiguration(icebergDestinationConfiguration: IResolvable) {
      cdkBuilder.icebergDestinationConfiguration(icebergDestinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param icebergDestinationConfiguration Specifies the destination configure settings for
     * Apache Iceberg Table.
     */
    override
        fun icebergDestinationConfiguration(icebergDestinationConfiguration: CfnDeliveryStream.IcebergDestinationConfigurationProperty) {
      cdkBuilder.icebergDestinationConfiguration(icebergDestinationConfiguration.let(CfnDeliveryStream.IcebergDestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param icebergDestinationConfiguration Specifies the destination configure settings for
     * Apache Iceberg Table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("484f7d6c612844105ad2074cd8d8320f4f5b531fd1100f259474d8b5f7d008a0")
    override
        fun icebergDestinationConfiguration(icebergDestinationConfiguration: CfnDeliveryStream.IcebergDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        icebergDestinationConfiguration(CfnDeliveryStream.IcebergDestinationConfigurationProperty(icebergDestinationConfiguration))

    /**
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     */
    override fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable) {
      cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     */
    override
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty) {
      cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration.let(CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param kinesisStreamSourceConfiguration When a Kinesis stream is used as the source for the
     * delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eec2b97969432ab2ff37cc3c88a835d4ae5731086ab8cffc00d37cf8579670c9")
    override
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        kinesisStreamSourceConfiguration(CfnDeliveryStream.KinesisStreamSourceConfigurationProperty(kinesisStreamSourceConfiguration))

    /**
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream.
     */
    override fun mskSourceConfiguration(mskSourceConfiguration: IResolvable) {
      cdkBuilder.mskSourceConfiguration(mskSourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream.
     */
    override
        fun mskSourceConfiguration(mskSourceConfiguration: CfnDeliveryStream.MSKSourceConfigurationProperty) {
      cdkBuilder.mskSourceConfiguration(mskSourceConfiguration.let(CfnDeliveryStream.MSKSourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the
     * source for a delivery stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9603bd47fbec070706a21200de103b0c80313548891c954ca59012452fc8cb2b")
    override
        fun mskSourceConfiguration(mskSourceConfiguration: CfnDeliveryStream.MSKSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        mskSourceConfiguration(CfnDeliveryStream.MSKSourceConfigurationProperty(mskSourceConfiguration))

    /**
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    override fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable) {
      cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    override
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty) {
      cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration.let(CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param redshiftDestinationConfiguration An Amazon Redshift destination for the delivery
     * stream.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("336a848ce3c95bb0e559116bd71dede6c3711c815150a1ca9018e53ed90a1e61")
    override
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        redshiftDestinationConfiguration(CfnDeliveryStream.RedshiftDestinationConfigurationProperty(redshiftDestinationConfiguration))

    /**
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    override fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
      cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    override
        fun s3DestinationConfiguration(s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty) {
      cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(CfnDeliveryStream.S3DestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param s3DestinationConfiguration The `S3DestinationConfiguration` property type specifies an
     * Amazon Simple Storage Service (Amazon S3) destination to which Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivers data.
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22702d3f83ce6b4146cd848f3ba66c44b8f56f73bb0016651836971ba3605409")
    override
        fun s3DestinationConfiguration(s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        s3DestinationConfiguration(CfnDeliveryStream.S3DestinationConfigurationProperty(s3DestinationConfiguration))

    /**
     * @param snowflakeDestinationConfiguration Configure Snowflake destination.
     */
    override fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: IResolvable) {
      cdkBuilder.snowflakeDestinationConfiguration(snowflakeDestinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param snowflakeDestinationConfiguration Configure Snowflake destination.
     */
    override
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: CfnDeliveryStream.SnowflakeDestinationConfigurationProperty) {
      cdkBuilder.snowflakeDestinationConfiguration(snowflakeDestinationConfiguration.let(CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param snowflakeDestinationConfiguration Configure Snowflake destination.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d5078c1c1701955e6a654341428466c9795c0b2eff2eda19daa8768873878f5")
    override
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        snowflakeDestinationConfiguration(CfnDeliveryStream.SnowflakeDestinationConfigurationProperty(snowflakeDestinationConfiguration))

    /**
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream.
     */
    override fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable) {
      cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream.
     */
    override
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty) {
      cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration.let(CfnDeliveryStream.SplunkDestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param splunkDestinationConfiguration The configuration of a destination in Splunk for the
     * delivery stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe1f5c9a1768a811facb2824eb3c1780f5938c79f8a7d0489a9513a7da1103b")
    override
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        splunkDestinationConfiguration(CfnDeliveryStream.SplunkDestinationConfigurationProperty(splunkDestinationConfiguration))

    /**
     * @param tags A set of tags to assign to the Firehose stream.
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that can
     * help you distinguish the Firehose stream. For more information about tags, see [Using Cost
     * Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a Firehose stream.
     *
     * If you specify tags in the `CreateDeliveryStream` action, Amazon Data Firehose performs an
     * additional authorization on the `firehose:TagDeliveryStream` action to verify if users have
     * permissions to create tags. If you do not provide this permission, requests to create new
     * Firehose streams with IAM resource tags will fail with an `AccessDeniedException` such as
     * following.
     *
     * *AccessDeniedException*
     *
     * User: arn:aws:sts::x:assumed-role/x/x is not authorized to perform:
     * firehose:TagDeliveryStream on resource: arn:aws:firehose:us-east-1:x:deliverystream/x with an
     * explicit deny in an identity-based policy.
     *
     * For an example IAM policy, see [Tag
     * example.](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CreateDeliveryStream.html#API_CreateDeliveryStream_Examples)
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A set of tags to assign to the Firehose stream.
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that can
     * help you distinguish the Firehose stream. For more information about tags, see [Using Cost
     * Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a Firehose stream.
     *
     * If you specify tags in the `CreateDeliveryStream` action, Amazon Data Firehose performs an
     * additional authorization on the `firehose:TagDeliveryStream` action to verify if users have
     * permissions to create tags. If you do not provide this permission, requests to create new
     * Firehose streams with IAM resource tags will fail with an `AccessDeniedException` such as
     * following.
     *
     * *AccessDeniedException*
     *
     * User: arn:aws:sts::x:assumed-role/x/x is not authorized to perform:
     * firehose:TagDeliveryStream on resource: arn:aws:firehose:us-east-1:x:deliverystream/x with an
     * explicit deny in an identity-based policy.
     *
     * For an example IAM policy, see [Tag
     * example.](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CreateDeliveryStream.html#API_CreateDeliveryStream_Examples)
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps,
  ) : CdkObject(cdkObject),
      CfnDeliveryStreamProps {
    /**
     * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
     * Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration)
     */
    override fun amazonOpenSearchServerlessDestinationConfiguration(): Any? =
        unwrap(this).getAmazonOpenSearchServerlessDestinationConfiguration()

    /**
     * The destination in Amazon OpenSearch Service.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration)
     */
    override fun amazonopensearchserviceDestinationConfiguration(): Any? =
        unwrap(this).getAmazonopensearchserviceDestinationConfiguration()

    /**
     * The top level object for configuring streams with database as a source.
     *
     * Amazon Data Firehose is in preview release and is subject to change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-databasesourceconfiguration)
     */
    override fun databaseSourceConfiguration(): Any? = unwrap(this).getDatabaseSourceConfiguration()

    /**
     * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side
     * Encryption (SSE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput)
     */
    override fun deliveryStreamEncryptionConfigurationInput(): Any? =
        unwrap(this).getDeliveryStreamEncryptionConfigurationInput()

    /**
     * The name of the Firehose stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname)
     */
    override fun deliveryStreamName(): String? = unwrap(this).getDeliveryStreamName()

    /**
     * The Firehose stream type. This can be one of the following values:.
     *
     * * `DirectPut` : Provider applications access the Firehose stream directly.
     * * `KinesisStreamAsSource` : The Firehose stream uses a Kinesis data stream as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype)
     */
    override fun deliveryStreamType(): String? = unwrap(this).getDeliveryStreamType()

    /**
     * An Amazon ES destination for the delivery stream.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon ES destination to an Amazon S3
     * or Amazon Redshift destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration)
     */
    override fun elasticsearchDestinationConfiguration(): Any? =
        unwrap(this).getElasticsearchDestinationConfiguration()

    /**
     * An Amazon S3 destination for the delivery stream.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Extended S3 destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration)
     */
    override fun extendedS3DestinationConfiguration(): Any? =
        unwrap(this).getExtendedS3DestinationConfiguration()

    /**
     * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination.
     *
     * You can specify only one destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration)
     */
    override fun httpEndpointDestinationConfiguration(): Any? =
        unwrap(this).getHttpEndpointDestinationConfiguration()

    /**
     * Specifies the destination configure settings for Apache Iceberg Table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-icebergdestinationconfiguration)
     */
    override fun icebergDestinationConfiguration(): Any? =
        unwrap(this).getIcebergDestinationConfiguration()

    /**
     * When a Kinesis stream is used as the source for the delivery stream, a
     * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
     */
    override fun kinesisStreamSourceConfiguration(): Any? =
        unwrap(this).getKinesisStreamSourceConfiguration()

    /**
     * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-msksourceconfiguration)
     */
    override fun mskSourceConfiguration(): Any? = unwrap(this).getMskSourceConfiguration()

    /**
     * An Amazon Redshift destination for the delivery stream.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon Redshift destination to an
     * Amazon ES destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration)
     */
    override fun redshiftDestinationConfiguration(): Any? =
        unwrap(this).getRedshiftDestinationConfiguration()

    /**
     * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service
     * (Amazon S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers
     * data.
     *
     * Conditional. You must specify only one destination configuration.
     *
     * If you change the delivery stream destination from an Amazon S3 destination to an Amazon ES
     * destination, update requires [some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration)
     */
    override fun s3DestinationConfiguration(): Any? = unwrap(this).getS3DestinationConfiguration()

    /**
     * Configure Snowflake destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-snowflakedestinationconfiguration)
     */
    override fun snowflakeDestinationConfiguration(): Any? =
        unwrap(this).getSnowflakeDestinationConfiguration()

    /**
     * The configuration of a destination in Splunk for the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
     */
    override fun splunkDestinationConfiguration(): Any? =
        unwrap(this).getSplunkDestinationConfiguration()

    /**
     * A set of tags to assign to the Firehose stream.
     *
     * A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata.
     * For example, you can add friendly names and descriptions or other types of information that can
     * help you distinguish the Firehose stream. For more information about tags, see [Using Cost
     * Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * AWS Billing and Cost Management User Guide.
     *
     * You can specify up to 50 tags when creating a Firehose stream.
     *
     * If you specify tags in the `CreateDeliveryStream` action, Amazon Data Firehose performs an
     * additional authorization on the `firehose:TagDeliveryStream` action to verify if users have
     * permissions to create tags. If you do not provide this permission, requests to create new
     * Firehose streams with IAM resource tags will fail with an `AccessDeniedException` such as
     * following.
     *
     * *AccessDeniedException*
     *
     * User: arn:aws:sts::x:assumed-role/x/x is not authorized to perform:
     * firehose:TagDeliveryStream on resource: arn:aws:firehose:us-east-1:x:deliverystream/x with an
     * explicit deny in an identity-based policy.
     *
     * For an example IAM policy, see [Tag
     * example.](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CreateDeliveryStream.html#API_CreateDeliveryStream_Examples)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeliveryStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps):
        CfnDeliveryStreamProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeliveryStreamProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryStreamProps):
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps
  }
}
